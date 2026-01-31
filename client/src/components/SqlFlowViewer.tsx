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
import InputParamsNode from './SqlFlow/InputParamsNode';

const nodeTypes = {
    table: TableNode,
    inputParams: InputParamsNode
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
                type: (node.type === 'table' || (normalizedColumns && normalizedColumns.length > 0)) ? 'table' : (node.type === 'inputParams' ? 'inputParams' : (node.type === 'source' ? 'input' : node.type === 'target' ? 'output' : 'default')),
                data: {
                    label: node.label || node.id,
                    columns: normalizedColumns,
                    params: node.params, // Pass params through if present
                    originalType: node.type
                },
                position: { x: 0, y: 0 },
                style: (node.type !== 'table' && node.type !== 'inputParams' && (!normalizedColumns || normalizedColumns.length === 0)) ? {
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
        // PRE-PROCESSING: Rewire graph for UPDATE/DELETE with WHERE clause
        // Goal: Transform [Value -> Table] & [Filter -> Table] into [Value -> Filter -> Table]
        // ---------------------------------------------------------------------------
        let processedDataEdges = [...data.edges];
        const extraNodes: Node[] = [];

        // ---------------------------------------------------------------------------
        // 0. Extract Input Parameters and Create Input Node
        // ---------------------------------------------------------------------------
        const inputParams = new Set<string>();
        const inputEdges: any[] = [];

        // Check if explicit inputParams node exists in data
        const explicitInputNode = initialNodes.find(n => n.type === 'inputParams');

        if (explicitInputNode) {
            // Transform explicit node columns to params format if needed
            // The prompt asks for "columns": [{ "name": "#{var}" }]
            // TableNode uses data.columns, InputParmsNode uses data.params (string[])
            // We need to ensure data.params is populated
            if (!explicitInputNode.data.params && explicitInputNode.data.columns) {
                explicitInputNode.data.params = explicitInputNode.data.columns.map((c: any) => c.name);
            }

            // If explicit node exists, we assume edges are already correctly wired to it 
            // per the prompt instructions (source: input_params.#{var})
            // But we might need to map handle IDs if they are just "input_params"

            // No extra node needed, just use it.
        } else {
            // Fallback: Extract from edges if no explicit inputParams node
            processedDataEdges.forEach(edge => {
                if (edge.source.startsWith('#{')) {
                    // Extract param name
                    const paramName = edge.source;
                    inputParams.add(paramName);
                    inputEdges.push(edge);
                }
            });

            if (inputParams.size > 0) {
                const inputNodeId = 'input_params_node';
                extraNodes.push({
                    id: inputNodeId,
                    type: 'inputParams',
                    data: {
                        label: 'Input Parameters',
                        params: Array.from(inputParams)
                    },
                    position: { x: 0, y: 0 },
                    style: { width: 250 }
                });

                // Update edges to start from this node
                processedDataEdges = processedDataEdges.map(edge => {
                    if (inputParams.has(edge.source)) {
                        return {
                            ...edge,
                            source: inputNodeId,
                            data: {
                                ...edge.data,
                                sourceHandle: edge.source,
                                originalSource: edge.source
                            }
                        };
                    }
                    return edge;
                });
            }
        }

        // 1. Group edges by Target Table
        const edgesByTarget = new Map<string, { updates: any[], filters: any[] }>();

        processedDataEdges.forEach(edge => {
            const targetId = resolveNodeId(edge.target);
            if (!edgesByTarget.has(targetId)) {
                edgesByTarget.set(targetId, { updates: [], filters: [] });
            }
            const group = edgesByTarget.get(targetId)!;

            const type = edge.type ? edge.type.toLowerCase() : '';
            if (type === 'update' || type === 'insert' || type === 'delete') {
                group.updates.push(edge);
            } else if (type === 'filter') {
                group.filters.push(edge);
            }
        });

        // 2. Rewrite topology
        const tableFilterNodeMap = new Map<string, string>(); // TargetTableID -> FilterNodeID

        edgesByTarget.forEach((group, targetTableId) => {
            // Apply only if we have both Updates and Filters for the same table
            if (group.updates.length > 0 && group.filters.length > 0) {
                // Determine Filter Node ID
                const filterNodeId = `${targetTableId}_where_clause`;

                // Combine conditions if multiple filters (rare but possible)
                const conditionLabel = group.filters.map(f => f.condition).join('\nAND\n');

                // ADD Filter Node
                extraNodes.push({
                    id: filterNodeId,
                    type: 'default',
                    data: { label: `WHERE ${conditionLabel}` },
                    position: { x: 0, y: 0 },
                    style: {
                        background: '#fff7ed',
                        border: '1px solid #f97316',
                        borderRadius: '20px',
                        padding: '10px 16px',
                        fontSize: '12px',
                        fontWeight: 'bold',
                        color: '#c2410c',
                        width: 200,
                        textAlign: 'center',
                        boxShadow: '0 2px 4px rgba(249, 115, 22, 0.1)'
                    }
                });

                // REPOINT Update Edges to Filter Node
                // We modify the edge objects in the working copy `processedDataEdges`
                // BUT we must be careful not to mutate original data if it's reused. 
                // Since we did [...data.edges], the array is new, but objects are refs.
                // We should splice and replace.

                // Remove original update edges and add modified ones
                group.updates.forEach(updateEdge => {
                    const idx = processedDataEdges.indexOf(updateEdge);
                    if (idx > -1) {
                        processedDataEdges[idx] = {
                            ...updateEdge,
                            target: filterNodeId, // Retarget to Filter Node
                            data: { ...updateEdge.data, originalTarget: updateEdge.target } // Preserve original target
                        };
                    }
                });

                // Remove original Filter edges
                group.filters.forEach(filterEdge => {
                    const idx = processedDataEdges.indexOf(filterEdge);
                    if (idx > -1) {
                        processedDataEdges.splice(idx, 1);
                    }
                });

                // ADD Edge from Filter Node -> Table
                processedDataEdges.push({
                    source: filterNodeId,
                    target: targetTableId,
                    id: `e_${filterNodeId}_to_${targetTableId}`,
                    type: 'default',
                    label: 'filter', // Explicitly label the outgoing edge as 'filter'
                    style: { stroke: '#94a3b8', strokeWidth: 2 },
                    markerEnd: { type: MarkerType.ArrowClosed }
                });
            }
        });

        // ---------------------------------------------------------------------------
        // NEW: Standard Filter Node Aggregation (Input Param -> Filter -> Table/Result)
        // ---------------------------------------------------------------------------

        // Pass 1: Identify "Primary Filter" edges (usually Table -> Result with condition).
        // Pass 1: Identify "Primary Filter" edges to establish the canonical Filter Node for a Table.
        // We want Inputs to merge into the WHERE clause, not the ORDER BY or LIMIT nodes.
        // Helper to determine edge priority (lower is earlier in chain)
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

        // Pass 1: Identify "Primary Filter" edges to establish the canonical Filter Node for a Table.
        // We want Inputs to merge into the WHERE clause (Priority 2), not others.

        // Define enhanced priority logic for Pass 1 sorting
        const getEnhancedPriority = (e: any) => {
            let p = getPriority(e.type);
            const content = e.condition || e.label || '';
            if (p === 99 && content) {
                const c = content.toLowerCase();
                if (c.includes('order by')) return 5;
                if (c.includes('limit') || c.includes('rownum')) return 6;
                if (c.includes('group by')) return 3;
                return 2; // Assume WHERE
            }
            return p;
        };

        const sortedDataEdges = [...processedDataEdges].sort((a, b) => getEnhancedPriority(a) - getEnhancedPriority(b));

        sortedDataEdges.forEach(edge => {
            const type = edge.type ? edge.type.toLowerCase() : '';
            // Exclude modification edges
            const isMod = ['update', 'insert', 'set', 'values', 'delete'].some(t => type.includes(t)) && type !== 'select';

            // Check condition OR label (fallback)
            const hasContent = edge.condition || edge.label;
            const isFilterCandidate = hasContent || ['filter', 'select', 'where'].some(k => type.includes(k));

            if (isFilterCandidate && !isMod) {
                const s = resolveNodeId(edge.source);
                const t = resolveNodeId(edge.target);

                // We construct a specific Filter Node ID for this Source->Target pair
                const filterId = `${s}_${t}_filter_node`;

                // Map: Source Table -> Filter Node ID
                // Register the FIRST valid filter node (Priority 2 / WHERE)
                if (!tableFilterNodeMap.has(s)) {
                    tableFilterNodeMap.set(s, filterId);
                }
            }
        });



        // Merge extra nodes into initialNodes
        let workingNodes = [...initialNodes, ...extraNodes];

        // ---------------------------------------------------------------------------
        // Assignment Injection Logic (PRE-PROCESSING with rewired edges)
        // ---------------------------------------------------------------------------
        const modNodeAssignments = new Map<string, string[]>();
        processedDataEdges.forEach((edge: any) => {
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

        const nodesWithAssignments = workingNodes.map(node => {
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
        processedDataEdges.forEach((edge: any) => {
            const s = resolveNodeId(edge.source);
            const t = resolveNodeId(edge.target);
            outDegree.set(s, (outDegree.get(s) || 0) + 1);
            inDegree.set(t, (inDegree.get(t) || 0) + 1);
        });

        // Assign variants to nodes
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


        // =========================================================================
        // ENHANCED LOGIC: WHERE, ORDER BY, LIMIT 노드를 별도로 생성하고 순차적으로 연결
        // =========================================================================

        // Step 1: 엣지를 타입별로 그룹화
        const whereEdges: any[] = [];
        const orderByEdges: any[] = [];
        const limitEdges: any[] = [];
        const otherFlowEdges: any[] = [];
        const filterConditionEdges: any[] = []; // 입력 파라미터 -> 테이블 연결

        processedDataEdges.forEach((edge: any) => {
            const type = edge.type ? edge.type.toLowerCase() : '';

            // WHERE 조건 (select 타입이고 condition이 있는 경우)
            if ((type === 'select' || type === 'filter') && edge.condition) {
                whereEdges.push(edge);
            }
            // ORDER BY
            else if (type === 'order_by' || type.includes('order')) {
                orderByEdges.push(edge);
            }
            // LIMIT
            else if (type === 'limit' || type.includes('rownum') || type.includes('top')) {
                limitEdges.push(edge);
            }
            // 입력 파라미터 -> 테이블 필터 조건
            else if (type === 'filter_condition') {
                filterConditionEdges.push(edge);
            }
            // 기타 데이터 흐름 엣지
            else {
                otherFlowEdges.push(edge);
            }
        });

        // Step 2: 노드 체인 구성
        // 구조: Input Parameters -> Table -> WHERE -> ORDER BY -> Subquery Result -> LIMIT -> Final Result

        let chainNodes: string[] = [];
        const createdNodeIds = new Set<string>();

        // WHERE 노드 생성
        if (whereEdges.length > 0) {
            const whereEdge = whereEdges[0];
            const sourceId = resolveNodeId(whereEdge.source);
            const targetId = resolveNodeId(whereEdge.target);
            const whereNodeId = `${sourceId}_${targetId}_where`;

            if (!createdNodeIds.has(whereNodeId)) {
                processedNodes.push({
                    id: whereNodeId,
                    type: 'default',
                    data: {
                        label: `WHERE\n${whereEdge.condition || ''}`
                    },
                    position: { x: 0, y: 0 },
                    className: 'sql-flow-condition-node',
                    style: {
                        background: '#fff7ed',
                        border: '2px solid #f97316',
                        borderRadius: '12px',
                        padding: '12px 16px',
                        fontSize: '11px',
                        fontWeight: '600',
                        color: '#c2410c',
                        width: 280,
                        textAlign: 'center',
                        boxShadow: '0 2px 6px rgba(249, 115, 22, 0.15)',
                        whiteSpace: 'pre-wrap'
                    }
                });
                createdNodeIds.add(whereNodeId);
                chainNodes.push(whereNodeId);

                // Input Parameters -> WHERE 연결
                if (filterConditionEdges.length > 0) {
                    filterConditionEdges.forEach((paramEdge) => {
                        const paramSource = resolveNodeId(paramEdge.source);
                        // sourceHandle: input_params.#{metMngNo} -> #{metMngNo}
                        const sourceHandle = paramEdge.source.includes('.')
                            ? paramEdge.source.split('.').pop()
                            : paramEdge.source;

                        processedEdges.push({
                            id: `e_param_${sourceHandle}_to_where`,
                            source: paramSource,
                            sourceHandle: sourceHandle,
                            target: whereNodeId,
                            type: 'default',
                            animated: false,
                            style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                            markerEnd: { type: MarkerType.ArrowClosed }
                        });
                    });
                }

                // Table -> WHERE 연결
                processedEdges.push({
                    id: `e_${sourceId}_to_where`,
                    source: sourceId,
                    target: whereNodeId,
                    type: 'default',
                    animated: false,
                    style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                    markerEnd: { type: MarkerType.ArrowClosed }
                });

                // WHERE -> 다음 노드 연결은 나중에 처리
            }
        }

        // ORDER BY 노드 생성
        if (orderByEdges.length > 0) {
            const orderEdge = orderByEdges[0];
            const sourceId = resolveNodeId(orderEdge.source);
            const targetId = resolveNodeId(orderEdge.target);
            const orderNodeId = `${sourceId}_${targetId}_orderby`;

            if (!createdNodeIds.has(orderNodeId)) {
                processedNodes.push({
                    id: orderNodeId,
                    type: 'default',
                    data: {
                        label: `ORDER BY\n${orderEdge.condition || ''}`
                    },
                    position: { x: 0, y: 0 },
                    className: 'sql-flow-condition-node',
                    style: {
                        background: '#fff7ed',
                        border: '2px solid #f97316',
                        borderRadius: '12px',
                        padding: '12px 16px',
                        fontSize: '11px',
                        fontWeight: '600',
                        color: '#c2410c',
                        width: 200,
                        textAlign: 'center',
                        boxShadow: '0 2px 6px rgba(249, 115, 22, 0.15)',
                        whiteSpace: 'pre-wrap'
                    }
                });
                createdNodeIds.add(orderNodeId);
                chainNodes.push(orderNodeId);
            }
        }

        // LIMIT 노드 생성
        if (limitEdges.length > 0) {
            const limitEdge = limitEdges[0];
            const sourceId = resolveNodeId(limitEdge.source);
            const targetId = resolveNodeId(limitEdge.target);
            const limitNodeId = `${sourceId}_${targetId}_limit`;

            if (!createdNodeIds.has(limitNodeId)) {
                processedNodes.push({
                    id: limitNodeId,
                    type: 'default',
                    data: {
                        label: `LIMIT\n${limitEdge.condition || ''}`
                    },
                    position: { x: 0, y: 0 },
                    className: 'sql-flow-condition-node',
                    style: {
                        background: '#fff7ed',
                        border: '2px solid #f97316',
                        borderRadius: '12px',
                        padding: '12px 16px',
                        fontSize: '11px',
                        fontWeight: '600',
                        color: '#c2410c',
                        width: 200,
                        textAlign: 'center',
                        boxShadow: '0 2px 6px rgba(249, 115, 22, 0.15)',
                        whiteSpace: 'pre-wrap'
                    }
                });
                createdNodeIds.add(limitNodeId);
                chainNodes.push(limitNodeId);
            }
        }

        // Step 3: 체인 연결
        // 올바른 흐름: Table -> WHERE -> ORDER BY -> Subquery Result -> LIMIT -> Final Result

        let currentChainSource = '';

        // WHERE 노드가 있으면 체인 시작
        if (whereEdges.length > 0 && chainNodes.length > 0) {
            const whereNodeId = chainNodes[0];
            const whereEdge = whereEdges[0];
            const subqueryId = resolveNodeId(whereEdge.target);

            currentChainSource = whereNodeId;

            // ORDER BY가 있으면 WHERE -> ORDER BY
            if (orderByEdges.length > 0 && chainNodes.length > 1) {
                const orderNodeId = chainNodes[1];
                processedEdges.push({
                    id: `e_where_to_order`,
                    source: whereNodeId,
                    target: orderNodeId,
                    type: 'default',
                    animated: false,
                    style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                    markerEnd: { type: MarkerType.ArrowClosed }
                });

                // ORDER BY -> Subquery Result
                processedEdges.push({
                    id: `e_order_to_subquery`,
                    source: orderNodeId,
                    target: subqueryId,
                    type: 'default',
                    animated: false,
                    style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                    markerEnd: { type: MarkerType.ArrowClosed }
                });

                currentChainSource = subqueryId;
            } else {
                // WHERE -> Subquery Result (ORDER BY 없는 경우)
                processedEdges.push({
                    id: `e_where_to_subquery`,
                    source: whereNodeId,
                    target: subqueryId,
                    type: 'default',
                    animated: false,
                    style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                    markerEnd: { type: MarkerType.ArrowClosed }
                });

                currentChainSource = subqueryId;
            }
        }

        // LIMIT 노드가 있으면 Subquery Result -> LIMIT -> Final Result
        if (limitEdges.length > 0) {
            const limitEdge = limitEdges[0];
            const limitIndex = chainNodes.findIndex(id => id.includes('_limit'));
            const limitNodeId = limitIndex >= 0 ? chainNodes[limitIndex] : `limit_node`;
            const sourceId = resolveNodeId(limitEdge.source);
            const targetId = resolveNodeId(limitEdge.target);

            // currentChainSource가 설정되어 있으면 사용, 아니면 sourceId 사용
            const actualSource = currentChainSource || sourceId;

            processedEdges.push({
                id: `e_subquery_to_limit`,
                source: actualSource,
                target: limitNodeId,
                type: 'default',
                animated: false,
                style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                markerEnd: { type: MarkerType.ArrowClosed }
            });

            processedEdges.push({
                id: `e_limit_to_result`,
                source: limitNodeId,
                target: targetId,
                type: 'default',
                animated: false,
                style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                markerEnd: { type: MarkerType.ArrowClosed }
            });
        }

        // Step 4: 기타 데이터 흐름 엣지 처리 (기존 로직 유지)
        const edgeGroups = new Map<string, any[]>();
        otherFlowEdges.forEach((edge: any) => {
            const sourceId = resolveNodeId(edge.source);
            const targetId = resolveNodeId(edge.target);
            const key = `${sourceId}||${targetId}`;

            if (!edgeGroups.has(key)) {
                edgeGroups.set(key, []);
            }
            edgeGroups.get(key)?.push({
                ...edge,
                originalSource: edge.data?.originalSource || sourceId,
                originalTarget: edge.data?.originalTarget || targetId
            });
        });

        const getLabelKeyword = (type: string, condition?: string) => {
            const lowerType = type ? type.toLowerCase() : '';
            // Strong signals
            if (lowerType === 'select' || lowerType === 'filter') return 'WHERE';
            if (lowerType.includes('join')) return 'ON';
            if (lowerType.includes('order')) return 'ORDER BY';
            if (lowerType.includes('limit') || lowerType.includes('rownum')) return 'LIMIT';
            if (lowerType.includes('group')) return 'GROUP BY';

            // Weak signals (fallback to condition content if type is generic)
            if (condition) {
                const c = condition.toLowerCase();
                if (c.includes('order by')) return 'ORDER BY';
                if (c.includes('group by')) return 'GROUP BY';
                if (c.includes('limit') || c.includes('rownum') || c.includes('offset')) return 'LIMIT';
                // Default constraint assumption
                return 'WHERE';
            }
            return type.toUpperCase();
        };

        // Process each group
        let globalEdgeIndex = 0;

        // Helper to check if a node is a Result node (explicit output or implicit sink)
        const isResultNode = (id: string) => {
            const resolvedId = resolveNodeId(id);
            const node = processedNodes.find(n => n.id === resolvedId);
            return node?.type === 'output' || node?.data?.variant === 'target';
        };

        edgeGroups.forEach((edgesInGroup, key) => {
            const [sourceId, targetId] = key.split('||');

            // 1. Sort edges by priority (Using hoisted getPriority)
            // Enhanced getPriority to inspect content if type is missing/generic
            const getEnhancedPriority = (e: any) => {
                let p = getPriority(e.type);
                const content = e.condition || e.label || '';
                if (p === 99 && content) {
                    // Try to deduce type from content
                    const c = content.toLowerCase();
                    if (c.includes('order by')) return 5;
                    if (c.includes('limit') || c.includes('rownum')) return 6;
                    if (c.includes('group by')) return 3;
                    return 2; // Assume WHERE if it has a condition but no specific keywords
                }
                return p;
            };

            edgesInGroup.sort((a, b) => getEnhancedPriority(a) - getEnhancedPriority(b));

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
                    if (isExplicitModNode(e.source) || isExplicitModNode(e.target)) return false;
                    return true;
                }
                return false;
            };

            const modificationEdges = edgesInGroup.filter(e => isModificationEdge(e));
            const hasModifications = modificationEdges.length > 0;
            const otherEdges = edgesInGroup.filter(e => !isModificationEdge(e));

            let currentSource = sourceId;

            // Check if this edge group is an "Input -> Table" that should be redirected
            let forcedTargetId: string | undefined = undefined;
            if (tableFilterNodeMap.has(targetId)) {
                const filterId = tableFilterNodeMap.get(targetId);
                // Only redirect if this edge is NOT the one creating the filter itself (i.e. not the Table->Result edge)
                forcedTargetId = filterId;
            }

            // Handle Update Edges Grouping (Implicit)
            if (hasModifications) {
                // Create ONE merged UPDATE node
                const assignments = modificationEdges.map(edge => {
                    const valPart = edge.source.includes('.') ? edge.source.split('.').pop()! : edge.source;
                    const rawTarget = edge.data?.originalTarget || edge.target;
                    const colPart = rawTarget.includes('.') ? rawTarget.split('.').pop()! : rawTarget;
                    const displayVal = valPart.startsWith('#{') ? valPart : `#{${valPart}}`;
                    return `- ${colPart} = ${displayVal}`;
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
                        header = "UPDATE";
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
            // FIX: Chainable edges should include ALL operations.
            // Check condition OR label (fallback)
            const chainableEdges = otherEdges.filter(e => {
                const t = e.type ? e.type.toLowerCase() : '';
                const hasContent = e.condition || e.label;
                return hasContent || ['filter', 'select', 'order', 'limit', 'group', 'having'].some(k => t.includes(k));
            });

            chainableEdges.forEach((edge, idx) => {
                const isLast = idx === chainableEdges.length - 1;
                const sourceIsMod = isExplicitModNode(edge.source);
                const targetIsMod = isExplicitModNode(edge.target);
                const isExplicitFlow = sourceIsMod || targetIsMod;

                // Determine effective content (condition vs label)
                const edgeContent = edge.condition || edge.label;

                let shouldCreateFilterNode = false;
                if (edgeContent && !targetIsMod && edge.type !== 'select' && edge.type !== 'insert' && edge.type !== 'update' && edge.type !== 'set') {
                    shouldCreateFilterNode = true;
                }
                // Special Case: Table -> Result with select type + condition is also a filter
                if (edgeContent && edge.type === 'select') {
                    shouldCreateFilterNode = true;
                }

                // CRITICAL FIX: If we have identified a shared filter node to redirect to, 
                // do NOT create a new isolated filter node for this edge.
                // This allows Input Parameters (with conditions) to flow into the existing Filter Node.
                if (forcedTargetId) {
                    shouldCreateFilterNode = false;
                }

                // Explicitly ignore 'filter_ref' for filter node creation even if it has conditions (it shouldn't, but safety first)
                if (edge.type === 'filter_ref') {
                    shouldCreateFilterNode = false;
                }

                if (shouldCreateFilterNode) {
                    // Create Filter Node

                    // CRITICAL FIX FOR CHAINING:
                    // Only use the cached "Primary Filter ID" (from tableFilterNodeMap) if this is the FIRST operation in the chain (idx === 0).
                    // If idx > 0 (e.g. Order By, Limit), we MUST create a NEW unique node to form the chain.
                    const useCachedId = (idx === 0) && tableFilterNodeMap.has(sourceId);

                    // Use cached ID only for the first item, otherwise create a sequential ID
                    const filterNodeId = useCachedId ? tableFilterNodeMap.get(sourceId)! : `${sourceId}_${targetId}_${globalEdgeIndex}_filter`;

                    const exists = processedNodes.some(n => n.id === filterNodeId);

                    if (!exists) {
                        const labelKeyword = sourceIsMod ? 'WHERE' : getLabelKeyword(edge.type, edgeContent);

                        // Clean up label if it repeats the keyword
                        let displayContent = edgeContent;
                        if (displayContent && displayContent.toLowerCase().startsWith(labelKeyword.toLowerCase())) {
                            displayContent = displayContent.substring(labelKeyword.length).trim();
                        }

                        processedNodes.push({
                            id: filterNodeId,
                            type: 'default',
                            data: { label: `${labelKeyword}\n${displayContent}` },
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
                        if (!tableFilterNodeMap.has(sourceId)) tableFilterNodeMap.set(sourceId, filterNodeId);
                    }

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
                            label: isResultNode(targetId) ? 'result' : 'filter', // Explicit Label
                            style: { stroke: '#94a3b8', strokeWidth: 1.5 },
                            markerEnd: { type: MarkerType.ArrowClosed }
                        });
                    }

                } else {
                    // Direct Edge (Input -> Table falls here usually if no condition, OR if we redirected it)
                    let finalTargetId = targetId;
                    if (forcedTargetId) { // Check if matches original target
                        finalTargetId = forcedTargetId;
                    }

                    // No condition OR condition suppressed (explicit flow)
                    let edgeLabel = (isExplicitFlow && edge.condition && !targetIsMod)
                        ? edge.condition
                        : ((edge.type !== 'select' && edge.type !== 'default') ? edge.type : undefined);

                    // Respect explicit label if provided (e.g. for generated edges)
                    if (edge.label) edgeLabel = edge.label;

                    // FIX: If redirected to a filter node (Input -> Filter), suppress the label on the incoming edge
                    if (forcedTargetId) {
                        edgeLabel = undefined;
                    }

                    // Apply 'result' label if targeting a final node
                    if (isResultNode(finalTargetId)) {
                        edgeLabel = 'result';
                    }

                    // Remove label for filter_ref type (Input connections)
                    if (edge.type === 'filter_ref') {
                        edgeLabel = undefined;
                    }

                    processedEdges.push({
                        id: `e_direct_${globalEdgeIndex}`,
                        source: currentSource,
                        target: finalTargetId,
                        // REMOVED sourceHandle/targetHandle to force Center-to-Center
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
