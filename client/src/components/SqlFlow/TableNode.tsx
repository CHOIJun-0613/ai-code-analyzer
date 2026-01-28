import { memo } from 'react';
import { Handle, Position, NodeProps } from 'reactflow';

interface Column {
    name: string;
    type?: string;
    constraints?: string[];
}

interface TableNodeData {
    label: string; // Table Name
    columns?: Column[];
}

const TableNode = ({ data, isConnectable, targetPosition = Position.Top, sourcePosition = Position.Bottom }: NodeProps<TableNodeData>) => {
    return (
        <div className="bg-white dark:bg-slate-800 rounded-lg shadow-md border border-slate-300 dark:border-slate-600 min-w-[200px] overflow-hidden">
            <Handle type="target" position={targetPosition} isConnectable={isConnectable} className="!bg-slate-400 w-3 h-3" />

            {/* Header: Table Name */}
            <div className="bg-slate-100 dark:bg-slate-700 px-3 py-2 border-b border-slate-200 dark:border-slate-600 flex justify-between items-center">
                <span className="font-bold text-sm text-slate-800 dark:text-slate-100 line-clamp-1" title={data.label}>
                    {data.label}
                </span>
            </div>

            {/* Body: Columns */}
            <div className="p-0">
                {data.columns && data.columns.length > 0 ? (
                    data.columns.map((col, index) => (
                        <div
                            key={`${col.name}-${index}`}
                            className="px-3 py-1.5 flex justify-between items-center text-xs border-b border-slate-100 dark:border-slate-700 last:border-0 hover:bg-slate-50 dark:hover:bg-slate-750"
                        >
                            <div className="flex items-center gap-2 overflow-hidden">
                                {/* PK/FK Indicators could go here if we had that info parsed specifically */}
                                <span className="font-medium text-slate-700 dark:text-slate-300 truncate" title={col.name}>
                                    {col.name}
                                </span>
                            </div>
                            <span className="text-slate-400 dark:text-slate-500 text-[10px] ml-2 shrink-0">
                                {col.type}
                            </span>
                        </div>
                    ))
                ) : (
                    // Fallback if no columns are provided
                    <div className="p-2 text-xs text-slate-400 italic text-center">
                        No Columns
                    </div>
                )}
            </div>

            <Handle type="source" position={sourcePosition} isConnectable={isConnectable} className="!bg-slate-400 w-3 h-3" />
        </div>
    );
};

export default memo(TableNode);
