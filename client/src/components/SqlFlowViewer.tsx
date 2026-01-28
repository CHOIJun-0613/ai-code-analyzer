import React, { useEffect } from 'react';
import ReactFlow, {
    MiniMap,
    Controls,
    Background,
    useNodesState,
    useEdgesState,
    Node,
    Edge,
    Position,
    MarkerType
} from 'reactflow';
import 'reactflow/dist/style.css';
import dagre from 'dagre';
import { Maximize2, Minimize2 } from 'lucide-react';
import TableNode from './SqlFlow/TableNode';

const nodeTypes = {
    table: TableNode,
};

interface SqlFlowProps {
    data: {
        nodes: any[];
        edges: any[];
    };
}

const nodeWidth = 220; // Increased width for better visibility
// nodeHeight is now dynamic based on content

const getLayoutedElements = (nodes: Node[], edges: Edge[], direction = 'TB') => {
    const dagreGraph = new dagre.graphlib.Graph();
    dagreGraph.setDefaultEdgeLabel(() => ({}));

    // Adjusted separation for compact layout
    dagreGraph.setGraph({
        rankdir: direction,
        nodesep: 50,
        ranksep: 100 // Reduced from 300 to 100 to decrease gap between nodes
    });

    nodes.forEach((node) => {
        // Calculate dynamic height based on columns
        // Header (40) + Bottom Padding (10) + Columns * RowHeight (28)
        // If undefined/empty columns, assume small height
        const columnCount = node.data?.columns?.length || 0;
        const dynamicHeight = 50 + (columnCount * 28);

        dagreGraph.setNode(node.id, { width: nodeWidth, height: dynamicHeight });
    });

    edges.forEach((edge) => {
        dagreGraph.setEdge(edge.source, edge.target);
    });

    dagre.layout(dagreGraph);

    const layoutedNodes = nodes.map((node) => {
        const nodeWithPosition = dagreGraph.node(node.id);

        // Safety check if nodeWithPosition is undefined (though it shouldn't be)
        if (!nodeWithPosition) return node;

        // Offset to align center
        node.targetPosition = direction === 'TB' ? Position.Top : Position.Left;
        node.sourcePosition = direction === 'TB' ? Position.Bottom : Position.Right;

        return {
            ...node,
            position: {
                x: nodeWithPosition.x - nodeWidth / 2,
                y: nodeWithPosition.y - nodeWithPosition.height / 2,
            },
        };
    });

    return { nodes: layoutedNodes, edges };
};

const SqlFlowViewer: React.FC<SqlFlowProps> = ({ data }) => {
    // const { t } = useTranslation(); // unused for now
    const [nodes, setNodes, onNodesChange] = useNodesState([]);
    const [edges, setEdges, onEdgesChange] = useEdgesState([]);
    const [isFullscreen, setIsFullscreen] = React.useState(false);

    useEffect(() => {
        if (!data || !data.nodes || !data.edges) return;

        // 1. Process Nodes
        const initialNodes: Node[] = data.nodes.map((node: any) => {
            const normalizedColumns = node.columns?.map((col: any) => {
                if (typeof col === 'string') {
                    return { name: col };
                }
                return col;
            });

            return {
                id: node.id,
                type: (node.type === 'table' || (normalizedColumns && normalizedColumns.length > 0)) ? 'table' : (node.type === 'source' ? 'input' : node.type === 'target' ? 'output' : 'default'),
                data: {
                    label: node.label || node.id,
                    columns: normalizedColumns
                },
                position: { x: 0, y: 0 },
                style: (node.type !== 'table' && (!normalizedColumns || normalizedColumns.length === 0)) ? {
                    background: node.type === 'source' ? '#eff6ff' : '#f0fdf4',
                    border: '1px solid #94a3b8',
                    borderRadius: '8px',
                    padding: '10px',
                    fontSize: '12px',
                    fontWeight: 'bold',
                    color: '#334155',
                    width: nodeWidth
                } : undefined,
            };
        });

        // 2. Process Edges & Create Intermediate Filter Nodes (SEQUENTIAL CHAINING)
        const processedNodes: Node[] = [...initialNodes];
        const processedEdges: Edge[] = [];

        // Helper to solve table.column -> table ID mapping
        const validNodeIds = new Set(initialNodes.map(n => n.id));
        const resolveNodeId = (id: string) => {
            if (validNodeIds.has(id)) return id;
            if (id.includes('.')) {
                const parts = id.split('.');
                if (validNodeIds.has(parts[0])) return parts[0];
            }
            return id;
        };

        // Group edges by Source-Target pair
        const edgeGroups = new Map<string, any[]>();
        data.edges.forEach((edge: any) => {
            const sourceId = resolveNodeId(edge.source);
            const targetId = resolveNodeId(edge.target);
            const key = `${sourceId}||${targetId}`;

            if (!edgeGroups.has(key)) {
                edgeGroups.set(key, []);
            }
            edgeGroups.get(key)?.push({ ...edge, originalSource: sourceId, originalTarget: targetId });
        });

        // Priority for sorting edges to create a logical SQL flow
        // JOIN/ON -> WHERE -> GROUP BY -> HAVING -> ORDER BY -> LIMIT
        const getPriority = (type: string) => {
            const t = type ? type.toLowerCase() : '';
            if (t.includes('join') || t.includes('on')) return 1;
            if (t.includes('where') || t === 'select' || t === 'filter') return 2;
            if (t.includes('group')) return 3;
            if (t.includes('having')) return 4;
            if (t.includes('order')) return 5;
            if (t.includes('limit') || t.includes('rownum') || t.includes('top')) return 6;
            return 99;
        };

        const getLabelKeyword = (type: string) => {
            const lowerType = type ? type.toLowerCase() : '';
            if (lowerType === 'select' || lowerType === 'filter') return 'WHERE';
            if (lowerType.includes('join')) return 'ON';
            if (lowerType.includes('order')) return 'ORDER BY';
            if (lowerType.includes('limit') || lowerType.includes('rownum')) return 'LIMIT';
            if (lowerType.includes('group')) return 'GROUP BY';
            return type.toUpperCase();
        };

        // Process each group
        let globalEdgeIndex = 0;
        edgeGroups.forEach((edgesInGroup, key) => {
            const [sourceId, targetId] = key.split('||');

            // 1. Sort edges by priority
            edgesInGroup.sort((a, b) => getPriority(a.type) - getPriority(b.type));

            // 2. Filter out edges that are just "connectors" without conditions IF we have other conditional edges
            // BUT, sometimes 'select' without condition is just the base flow.
            // Strategy: We will chain ALL edges that have conditions.
            // Relaxed check to catch 'update', 'update set', 'UPDATE', 'insert', 'insert values', etc.
            const isModificationEdge = (e: any) => {
                const t = e.type ? e.type.toLowerCase() : '';
                return t.includes('update') || t === 'set' || t.includes('insert') || t.includes('values');
            };

            const modificationEdges = edgesInGroup.filter(e => isModificationEdge(e));
            const hasModifications = modificationEdges.length > 0;
            const otherEdges = edgesInGroup.filter(e => !isModificationEdge(e));

            let currentSource = sourceId;

            // Handle Update Edges Grouping
            if (hasModifications) {
                // Create ONE merged UPDATE node
                const assignments = modificationEdges.map(edge => {
                    // source: "input_params.metLifecEstYn" -> value part
                    // target: "TABLE.COLUMN" -> column part
                    const srcParts = edge.originalSource ? edge.originalSource.split('.') : edge.source.split('.');
                    const tgtParts = edge.originalTarget ? edge.originalTarget.split('.') : edge.target.split('.');

                    // Fallback if originalSource/Target not present or simple strings
                    // If source is just "input_params" and label is "metLifecEstYn", 
                    // we might need to rely on the edge source node label or just use the last part of the ID.

                    // The edge.source comes from data.edges.
                    // In the user's JSON: "source": "input_params.metLifecEstYn".
                    const valPart = edge.source.includes('.') ? edge.source.split('.').pop() : edge.source;
                    const colPart = edge.target.includes('.') ? edge.target.split('.').pop() : edge.target;

                    // Format: COLUMN = #{VALUE} (Assuming value comes from input param)
                    // If source is from input_params, it is likely a variable.
                    return `- ${colPart} = #{${valPart}}`;
                }).join('\n');

                const updateNodeId = `${sourceId}_${targetId}_${globalEdgeIndex}_update_group`;

                // Get condition from the first edge (usually WHERE clause is same for all in a batch)
                // BUT user wants just the assignments in this box presumably, as WHERE is separate?
                // Actually, let's include "UPDATE target_rows :" header as per user request (or similar).
                // Use the condition from the first edge if it helps identify "target_rows"?
                // The condition in JSON is "target_rows (MET_MNG_NO = ...)"
                const firstCondition = modificationEdges[0].condition || '';
                // Clean up condition to just show target alias if needed, or just "UPDATE"
                // User image shows: "UPDATE target_rows : \n - ... \n - ..."
                // Let's try to extract "target_rows" or just use generic "UPDATE".

                // Determine Operation Type from the first edge
                const firstEdgeType = modificationEdges[0].type ? modificationEdges[0].type.toLowerCase() : '';
                const isInsert = firstEdgeType.includes('insert') || firstEdgeType.includes('values');

                let header = isInsert ? "INSERT INTO" : "UPDATE";

                if (firstCondition) {
                    if (isInsert) {
                        header = "INSERT VALUES :";
                    } else if (firstCondition.includes('target_rows')) {
                        header = "UPDATE target_rows :";
                    } else {
                        header = `UPDATE ${firstCondition}`;
                    }
                } else {
                    if (isInsert) header = "INSERT VALUES :";
                }

                processedNodes.push({
                    id: updateNodeId,
                    type: 'default',
                    data: { label: `${header}\n\n${assignments}` },
                    position: { x: 0, y: 0 },
                    style: {
                        background: '#fff7ed',
                        border: '1px solid #f97316',
                        borderRadius: '12px',
                        padding: '12px',
                        fontSize: '11px',
                        color: '#c2410c',
                        width: 250, // Wider for assignments
                        textAlign: 'left',
                        boxShadow: '0 2px 4px rgba(0,0,0,0.1)',
                        whiteSpace: 'pre-wrap'
                    }
                });

                // Link Source -> Update Node
                // Which source? Usually all update edges come from Input Params.
                // We can link from the main sourceId (e.g. input_params)
                processedEdges.push({
                    id: `e_update_group_${globalEdgeIndex}_in`,
                    source: sourceId,
                    target: updateNodeId,
                    type: 'default',
                    animated: false,
                    style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                    markerEnd: { type: MarkerType.ArrowClosed }
                });

                // Link Update Node -> Target Table
                processedEdges.push({
                    id: `e_update_group_${globalEdgeIndex}_out`,
                    source: updateNodeId,
                    target: targetId, // The main table ID
                    type: 'default',
                    animated: false, // Update flow
                    style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                    markerEnd: { type: MarkerType.ArrowClosed }
                });

                globalEdgeIndex++;

                // Set current source for subsequent edges in this group (if any) to happen AFTER update?
                // But usually Update IS the operation.
                // If there are other edges (like filter), they might be WHERE clauses.
                // In our model, Filter edges (type=filter) usually go Table -> Result or Source -> Table?
                // Existing logic handles them.
                // If "otherEdges" exist, we continue chaining from 'currentSource'.
                // If we inserted Update Node, does the flow go through it?
                // Update Node is Side Effect? Or Transformation?
                // Input -> [Update] -> Table.
                // If there are other edges (e.g. a SELECT happening in parallel?), we might need careful handling.
                // For now, assume UPDATE edges are the main action here.

                // If otherEdges exist, they might need to be processed.
                // But if they are distinct, standard logic applies.
                // Let's assume standard logic follows for 'otherEdges'.

                // IMPORTANT: 'currentSource' is not updated to 'updateNodeId' because
                // other edges might be parallel or unrelated.
                // UNLESS they are meant to follow.
            }

            // Handle Non-Update Edges (Standard Logic)
            const conditionalEdges = otherEdges.filter(e => e.condition);
            const chainableEdges = conditionalEdges.length > 0 ? conditionalEdges : otherEdges;

            // ... standard logic ...
            // If we processed updates, 'currentSource' is still 'sourceId'.
            // If we want to chain filters AFTER update? 
            // Usually filters are on the Table -> Target flow (Group 2). 
            // So this Group 1 (Input->Table) is done.

            chainableEdges.forEach((edge, idx) => {
                const isLast = idx === chainableEdges.length - 1;
                const nextTarget = isLast ? targetId : `${sourceId}_${targetId}_${globalEdgeIndex}_inter`;

                if (edge.condition) {
                    // Create Filter Node
                    const filterNodeId = `${sourceId}_${targetId}_${globalEdgeIndex}_filter`;
                    const labelKeyword = getLabelKeyword(edge.type);

                    processedNodes.push({
                        id: filterNodeId,
                        type: 'default',
                        data: { label: `${labelKeyword}\n${edge.condition}` },
                        position: { x: 0, y: 0 },
                        style: {
                            background: '#fff7ed',
                            border: '1px solid #f97316',
                            borderRadius: '20px',
                            padding: '8px 12px',
                            fontSize: '11px',
                            color: '#c2410c',
                            width: 180,
                            textAlign: 'center',
                            boxShadow: '0 1px 2px rgba(0,0,0,0.05)'
                        }
                    });

                    // Edge: Current -> Filter
                    processedEdges.push({
                        id: `e_chain_${globalEdgeIndex}_1`,
                        source: currentSource,
                        target: filterNodeId,
                        type: 'default',
                        animated: false,
                        style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                        markerEnd: { type: MarkerType.ArrowClosed }
                    });

                    // Update current source to be the filter node
                    currentSource = filterNodeId;

                    // If it is the last one, we need to connect Filter -> Final Target
                    if (isLast) {
                        processedEdges.push({
                            id: `e_chain_${globalEdgeIndex}_2`, // Fixed ID (was _2 in loop)
                            source: filterNodeId,
                            target: targetId,
                            type: 'default',
                            animated: false,
                            style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                            markerEnd: { type: MarkerType.ArrowClosed }
                            // label: edge.type // Label often redundant with Node Label
                        });
                    }

                } else {
                    // No condition (Direct Edge or simple select)
                    processedEdges.push({
                        id: `e_direct_${globalEdgeIndex}`,
                        source: currentSource,
                        target: targetId,
                        label: edge.type !== 'select' ? edge.type : undefined, // Hide 'select' label for cleaner look
                        type: 'default',
                        animated: false,
                        style: { stroke: '#64748b', strokeWidth: 1.5 },
                        markerEnd: { type: MarkerType.ArrowClosed }
                    });
                }
                globalEdgeIndex++;
            });
        });

        // 3. Run Layout
        const { nodes: layoutedNodes, edges: layoutedEdges } = getLayoutedElements(
            processedNodes,
            processedEdges,
            'LR'
        );

        setNodes(layoutedNodes);
        setEdges(layoutedEdges);
    }, [data, setNodes, setEdges]);

    const toggleFullscreen = () => {
        const element = document.getElementById('sql-flow-container');
        if (!element) return;

        if (!document.fullscreenElement) {
            element.requestFullscreen().catch(err => {
                console.error(`Error attempting to enable full-screen mode: ${err.message} (${err.name})`);
            });
            setIsFullscreen(true);
        } else {
            document.exitFullscreen();
            setIsFullscreen(false);
        }
    };

    // Listen for fullscreen change events to update internal state if user exits via Esc
    useEffect(() => {
        const handleFullscreenChange = () => {
            setIsFullscreen(!!document.fullscreenElement);
        };
        document.addEventListener('fullscreenchange', handleFullscreenChange);
        return () => document.removeEventListener('fullscreenchange', handleFullscreenChange);
    }, []);


    return (
        <div id="sql-flow-container" className={`relative w-full h-[500px] bg-slate-50 dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 shadow-inner ${isFullscreen ? 'h-screen' : ''}`}>
            <div className="absolute top-4 right-4 z-10 flex gap-2">
                <button
                    onClick={toggleFullscreen}
                    className="p-2 bg-white dark:bg-slate-800 text-slate-600 dark:text-slate-300 rounded-lg shadow border border-slate-200 dark:border-slate-700 hover:bg-slate-50 dark:hover:bg-slate-700 transition-colors"
                >
                    {isFullscreen ? <Minimize2 className="w-5 h-5" /> : <Maximize2 className="w-5 h-5" />}
                </button>
            </div>

            <ReactFlow
                nodes={nodes}
                edges={edges}
                nodeTypes={nodeTypes}
                onNodesChange={onNodesChange}
                onEdgesChange={onEdgesChange}
                fitView
                attributionPosition="bottom-right"
            >
                <Controls />
                <MiniMap style={{ height: 100 }} zoomable pannable />
                <Background color="#94a3b8" gap={16} />
            </ReactFlow>
        </div>
    );
};

export default SqlFlowViewer;
