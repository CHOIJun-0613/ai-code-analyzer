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
                    columns: normalizedColumns,
                    originalType: node.type
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

        // ---------------------------------------------------------------------------
        // Assignment Injection Logic (PRE-PROCESSING)
        // ---------------------------------------------------------------------------
        const modNodeAssignments = new Map<string, string[]>();
        data.edges.forEach((edge: any) => {
            const targetId = resolveNodeId(edge.target);
            const targetNode = initialNodes.find(n => n.id === targetId);

            // Check if target is explicit modification node
            if (targetNode && targetNode.data.originalType === 'modification') {
                // If edge carries assignment info (update_set or condition)
                if (edge.type === 'update_set' || edge.condition) {
                    if (!modNodeAssignments.has(targetId)) {
                        modNodeAssignments.set(targetId, []);
                    }
                    if (edge.condition) {
                        modNodeAssignments.get(targetId)?.push(edge.condition);
                    }
                }
            }
        });

        const nodesWithAssignments = initialNodes.map(node => {
            if (node.data.originalType === 'modification' && modNodeAssignments.has(node.id)) {
                const assignments = modNodeAssignments.get(node.id) || [];
                const newColumns = assignments.map(a => ({ name: a, type: '' }));
                return {
                    ...node,
                    data: {
                        ...node.data,
                        columns: newColumns
                    },
                    style: {
                        ...node.style,
                        width: 300 // Wider for assignments
                    }
                };
            }
            return node;
        });

        // Use nodesWithAssignments as the base for processedNodes
        const processedNodes: Node[] = [...nodesWithAssignments];
        const processedEdges: Edge[] = [];

        // ---------------------------------------------------------------------------
        // Topology Analysis for Coloring (Start/Intermediate/Final)
        // ---------------------------------------------------------------------------
        const inDegree = new Map<string, number>();
        const outDegree = new Map<string, number>();

        // Initialize counts
        processedNodes.forEach(n => {
            inDegree.set(n.id, 0);
            outDegree.set(n.id, 0);
        });

        // Count degrees from ORIGINAL data edges (to capture logical flow)
        data.edges.forEach((edge: any) => {
            const s = resolveNodeId(edge.source);
            const t = resolveNodeId(edge.target);
            outDegree.set(s, (outDegree.get(s) || 0) + 1);
            inDegree.set(t, (inDegree.get(t) || 0) + 1);
        });

        // Assign variants to nodes
        // Update processedNodes in place to avoid creating a new const variable that confuses later logic
        processedNodes.forEach(node => {
            const isTableNode = node.type === 'table';
            if (isTableNode) {
                const i = inDegree.get(node.id) || 0;
                const o = outDegree.get(node.id) || 0;
                let variant = 'default';

                if (i === 0) variant = 'source';      // Start Node
                else if (o === 0) variant = 'target'; // Final Node
                // else Intermediate

                // Update the visible node data
                node.data = {
                    ...node.data,
                    variant
                };
            }
        });


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

        // Priority for sorting edges
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

            // Helpers for logic
            const isExplicitModNode = (id: string) => {
                const resolvedId = resolveNodeId(id);
                // Check against nodesWithAssignments or initialNodes (Ids are same)
                const n = nodesWithAssignments.find(node => node.id === resolvedId);
                return n?.data?.originalType === 'modification';
            };

            const isModificationEdge = (e: any) => {
                const t = e.type ? e.type.toLowerCase() : '';
                const isModType = t.includes('update') || t === 'set' || t.includes('insert') || t.includes('values');

                if (isModType) {
                    // If connected to explicit mod node, do not treat as implicit "auto-group" candidate
                    if (isExplicitModNode(e.source) || isExplicitModNode(e.target)) return false;
                    return true;
                }
                return false;
            };

            const modificationEdges = edgesInGroup.filter(e => isModificationEdge(e));
            const hasModifications = modificationEdges.length > 0;
            const otherEdges = edgesInGroup.filter(e => !isModificationEdge(e));

            let currentSource = sourceId;

            // Handle Update Edges Grouping (Implicit)
            if (hasModifications) {
                // ... (Keep existing implicit logic for backward compatibility/other flows)
                // Create ONE merged UPDATE node
                const assignments = modificationEdges.map(edge => {
                    const valPart = edge.source.includes('.') ? edge.source.split('.').pop() : edge.source;
                    const colPart = edge.target.includes('.') ? edge.target.split('.').pop() : edge.target;
                    return `- ${colPart} = #{${valPart}}`;
                }).join('\n');

                const updateNodeId = `${sourceId}_${targetId}_${globalEdgeIndex}_update_group`;
                const firstCondition = modificationEdges[0].condition || '';
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
                        width: 250,
                        textAlign: 'left',
                        boxShadow: '0 2px 4px rgba(0,0,0,0.1)',
                        whiteSpace: 'pre-wrap'
                    }
                });

                processedEdges.push({
                    id: `e_update_group_${globalEdgeIndex}_in`,
                    source: sourceId,
                    target: updateNodeId,
                    type: 'default',
                    animated: false,
                    style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                    markerEnd: { type: MarkerType.ArrowClosed }
                });

                processedEdges.push({
                    id: `e_update_group_${globalEdgeIndex}_out`,
                    source: updateNodeId,
                    target: targetId,
                    type: 'default',
                    animated: false,
                    style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                    markerEnd: { type: MarkerType.ArrowClosed }
                });

                globalEdgeIndex++;
            }

            // Handle Standard Edges
            const conditionalEdges = otherEdges.filter(e => e.condition);
            const chainableEdges = conditionalEdges.length > 0 ? conditionalEdges : otherEdges;

            chainableEdges.forEach((edge, idx) => {
                const isLast = idx === chainableEdges.length - 1;
                const sourceIsMod = isExplicitModNode(edge.source);
                const targetIsMod = isExplicitModNode(edge.target);
                const isExplicitFlow = sourceIsMod || targetIsMod;

                // Logic:
                // 1. Input -> ModNode (assignments): NO Filter Node.
                // 2. ModNode -> Table (where): YES Filter Node.
                // 3. Normal -> Normal (where): YES Filter Node.

                let shouldCreateFilterNode = false;
                if (edge.condition) {
                    if (targetIsMod) {
                        shouldCreateFilterNode = false; // Assignments are handled inside node
                    } else {
                        shouldCreateFilterNode = true; // Default behavior
                    }
                }

                if (shouldCreateFilterNode) {
                    // Create Filter Node
                    const filterNodeId = `${sourceId}_${targetId}_${globalEdgeIndex}_filter`;
                    const labelKeyword = sourceIsMod ? 'WHERE' : getLabelKeyword(edge.type);

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

                    if (isLast) {
                        processedEdges.push({
                            id: `e_chain_${globalEdgeIndex}_2`,
                            source: filterNodeId,
                            target: targetId,
                            type: 'default',
                            animated: false,
                            style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                            markerEnd: { type: MarkerType.ArrowClosed }
                        });
                    }

                } else {
                    // No condition OR condition suppressed (explicit flow)
                    const edgeLabel = (isExplicitFlow && edge.condition && !targetIsMod)
                        ? edge.condition
                        : (edge.type !== 'select' ? edge.type : undefined);

                    processedEdges.push({
                        id: `e_direct_${globalEdgeIndex}`,
                        source: currentSource,
                        target: targetId,
                        label: edgeLabel,
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
