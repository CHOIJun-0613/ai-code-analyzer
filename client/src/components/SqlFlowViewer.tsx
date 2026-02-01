import React, { useEffect } from 'react';
import { useTranslation } from 'react-i18next';
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
import { Maximize2, Minimize2, Eye, EyeOff } from 'lucide-react';
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

const nodeWidth = 220;

/**
 * Dagre 레이아웃 계산
 */
const getLayoutedElements = (nodes: Node[], edges: Edge[], direction = 'LR') => {
    const dagreGraph = new dagre.graphlib.Graph();
    dagreGraph.setDefaultEdgeLabel(() => ({}));

    dagreGraph.setGraph({
        rankdir: direction,
        nodesep: 50,
        ranksep: 200  // 노드 간 수평 간격 (엣지 라벨 UPDATE, INSERT, result 등 표시 공간 확보)
    });

    nodes.forEach((node) => {
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
        if (!nodeWithPosition) return node;

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

/**
 * 정규화된 SQL Flow JSON을 ReactFlow 노드/엣지로 변환
 */
const SqlFlowViewer: React.FC<SqlFlowProps> = ({ data }) => {
    const { t } = useTranslation();
    const [nodes, setNodes, onNodesChange] = useNodesState([]);
    const [edges, setEdges, onEdgesChange] = useEdgesState([]);
    const [isFullscreen, setIsFullscreen] = React.useState(false);
    const [showEdges, setShowEdges] = React.useState(true);

    useEffect(() => {
        if (!data || !data.nodes || !data.edges) return;

        const processedNodes: Node[] = [];
        const processedEdges: Edge[] = [];
        const nodeIdSet = new Set<string>();

        // 1. 노드 처리
        data.nodes.forEach((node: any) => {
            const nodeId = node.id;
            if (!nodeId || nodeIdSet.has(nodeId)) return;
            nodeIdSet.add(nodeId);

            const nodeType = node.type?.toLowerCase() || 'table';
            const columns = normalizeColumns(node.columns);

            // 노드 타입별 스타일 및 ReactFlow 타입 결정
            let reactFlowType: string = 'default';
            let variant: 'source' | 'target' | 'default' = 'default';
            let style: any = undefined;

            switch (nodeType) {
                case 'inputparams':
                    reactFlowType = 'inputParams';
                    break;

                case 'table':
                case 'subquery':
                    reactFlowType = 'table';
                    variant = 'default';
                    break;

                case 'result':
                    reactFlowType = 'table';
                    variant = 'target'; // 초록색
                    break;

                case 'operation':
                    // WHERE, ORDER BY, LIMIT 등 연산 노드 - 오렌지색 스타일
                    reactFlowType = 'default';
                    style = {
                        background: '#fff7ed',
                        border: '2px solid #f97316',
                        borderRadius: '12px',
                        padding: '12px 16px',
                        fontSize: '11px',
                        fontWeight: '600',
                        color: '#c2410c',
                        width: node.operationType === 'WHERE' ? 280 : 200,
                        textAlign: 'center',
                        boxShadow: '0 2px 6px rgba(249, 115, 22, 0.15)',
                        whiteSpace: 'pre-wrap'
                    };
                    break;

                default:
                    reactFlowType = columns.length > 0 ? 'table' : 'default';
            }

            // 노드 데이터 구성
            const nodeData: any = {
                label: node.label || nodeId,
                columns: columns.length > 0 ? columns : undefined,
                variant: variant,
                params: nodeType === 'inputparams' ? columns.map((c: any) => c.name) : undefined
            };

            // operation 노드의 경우 라벨에 조건 포함
            if (nodeType === 'operation' && node.condition) {
                nodeData.label = `${node.label || node.operationType}\n${node.condition}`;
            }

            processedNodes.push({
                id: nodeId,
                type: reactFlowType,
                data: nodeData,
                position: { x: 0, y: 0 },
                style: style
            });
        });

        // 2. 엣지 처리
        const edgeIdSet = new Set<string>();

        data.edges.forEach((edge: any, index: number) => {
            const source = resolveNodeId(edge.source);
            const target = resolveNodeId(edge.target);

            // 유효한 노드인지 확인
            if (!nodeIdSet.has(source) || !nodeIdSet.has(target)) {
                return;
            }

            // 중복 엣지 방지
            const edgeKey = `${source}->${target}`;
            if (edgeIdSet.has(edgeKey)) return;
            edgeIdSet.add(edgeKey);

            const edgeType = edge.type?.toLowerCase() || 'data_flow';

            processedEdges.push({
                id: `e_${index}_${source}_${target}`,
                source: source,
                target: target,
                label: edge.label,
                type: 'default',
                animated: false,
                style: {
                    stroke: edgeType === 'input_ref' ? '#3b82f6' : '#94a3b8',
                    strokeWidth: 1.5,
                    strokeDasharray: edgeType === 'input_ref' ? '5,5' : undefined
                },
                markerEnd: { type: MarkerType.ArrowClosed },
                hidden: !showEdges
            });
        });

        // 3. 레이아웃 적용
        const { nodes: layoutedNodes, edges: layoutedEdges } = getLayoutedElements(
            processedNodes,
            processedEdges,
            'LR'
        );

        setNodes(layoutedNodes);
        setEdges(layoutedEdges);
    }, [data, showEdges, setNodes, setEdges]);

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
                {/* 흐름도 토글 버튼 */}
                <button
                    onClick={() => setShowEdges(prev => !prev)}
                    className="p-2 bg-white dark:bg-slate-800 text-slate-600 dark:text-slate-300 rounded-lg shadow border border-slate-200 dark:border-slate-700 hover:bg-slate-50 dark:hover:bg-slate-700 transition-colors"
                    title={showEdges ? t('sqlDetails.hideFlowEdges') : t('sqlDetails.showFlowEdges')}
                >
                    {showEdges ? <EyeOff className="w-5 h-5" /> : <Eye className="w-5 h-5" />}
                </button>

                {/* 전체화면 버튼 */}
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

/**
 * 컬럼 배열 정규화
 */
function normalizeColumns(columns: any[]): { name: string; comment?: string }[] {
    if (!columns || !Array.isArray(columns)) return [];

    return columns.map((col: any) => {
        if (typeof col === 'string') {
            return { name: col };
        }
        return {
            name: col.name || '',
            comment: col.comment
        };
    });
}

/**
 * 노드 참조에서 기본 ID 추출 (table.column -> table)
 */
function resolveNodeId(nodeRef: string): string {
    if (!nodeRef) return '';
    if (nodeRef.includes('.')) {
        return nodeRef.split('.')[0];
    }
    return nodeRef;
}

export default SqlFlowViewer;
