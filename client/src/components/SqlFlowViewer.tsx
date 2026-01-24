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

interface SqlFlowProps {
    data: {
        nodes: any[];
        edges: any[];
    };
}

const nodeWidth = 180;
const nodeHeight = 50;

const getLayoutedElements = (nodes: Node[], edges: Edge[], direction = 'TB') => {
    const dagreGraph = new dagre.graphlib.Graph();
    dagreGraph.setDefaultEdgeLabel(() => ({}));

    dagreGraph.setGraph({ rankdir: direction });

    nodes.forEach((node) => {
        dagreGraph.setNode(node.id, { width: nodeWidth, height: nodeHeight });
    });

    edges.forEach((edge) => {
        dagreGraph.setEdge(edge.source, edge.target);
    });

    dagre.layout(dagreGraph);

    const layoutedNodes = nodes.map((node) => {
        const nodeWithPosition = dagreGraph.node(node.id);

        // Offset to align center
        node.targetPosition = direction === 'TB' ? Position.Top : Position.Left;
        node.sourcePosition = direction === 'TB' ? Position.Bottom : Position.Right;

        // We are shifting the dagre node position (anchor=center center) to the top left
        // so it matches the React Flow node anchor point (top left).
        return {
            ...node,
            position: {
                x: nodeWithPosition.x - nodeWidth / 2,
                y: nodeWithPosition.y - nodeHeight / 2,
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

        const initialNodes: Node[] = data.nodes.map((node: any) => ({
            id: node.id,
            type: node.type === 'source' ? 'input' : node.type === 'target' ? 'output' : 'default',
            data: { label: node.label || node.id },
            position: { x: 0, y: 0 }, // will be set by layout
            style: {
                background: node.type === 'table' ? '#fff' : node.type === 'source' ? '#eff6ff' : '#f0fdf4',
                border: '1px solid #94a3b8',
                borderRadius: '8px',
                padding: '10px',
                fontSize: '12px',
                fontWeight: 'bold',
                color: '#334155',
                width: nodeWidth
            },
        }));

        const initialEdges: Edge[] = data.edges.map((edge: any, index: number) => ({
            id: `e${index}-${edge.source}-${edge.target}`,
            source: edge.source.split('.')[0], // Assuming source is "table.col" but we link nodes by table ID
            target: edge.target ? edge.target.split('.')[0] : edge.source, // Handle cases? No, strict schema says source/target IDs.
            // Wait, schema says "table_A.id" as source.
            // If the node ID is "table_A", then edge source should be "table_A".
            // So we need to handle "table.column" -> "table" mapping if the node ID is just the table name.
            // Let's assume the node ID matches the prefix of the edge source/target or exact match.
            // For robustness: if source contains dot, split it.

            label: edge.type,
            type: 'smoothstep',
            animated: true,
            markerEnd: {
                type: MarkerType.ArrowClosed,
            },
            style: { stroke: '#64748b' },
            labelStyle: { fill: '#64748b', fontWeight: 700 }
        }));

        // Quick fix for source/target matching node IDs
        // If the node IDs are simple (table_A) and edge source is (table_A.id), specific to our schema example.
        // We need to ensure we link to the NODE ID.
        // Let's map edge sources to node IDs via basic string matching.

        const validNodeIds = new Set(initialNodes.map(n => n.id));

        const processedEdges = initialEdges.map(edge => {
            let source = edge.source;
            let target = edge.target;

            // Try to find if the source string starts with a valid node ID
            // This is ambiguous if node IDs are prefixes of each other, but for now assuming simple table names.
            // Better strategy: split by dot.

            if (!validNodeIds.has(source) && source.includes('.')) {
                const parts = source.split('.');
                if (validNodeIds.has(parts[0])) source = parts[0];
            }

            if (!validNodeIds.has(target) && target.includes('.')) {
                const parts = target.split('.');
                if (validNodeIds.has(parts[0])) target = parts[0];
            }

            return { ...edge, source, target };
        });


        const { nodes: layoutedNodes, edges: layoutedEdges } = getLayoutedElements(
            initialNodes,
            processedEdges
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
