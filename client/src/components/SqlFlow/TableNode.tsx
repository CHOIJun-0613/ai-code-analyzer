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
    variant?: 'source' | 'target' | 'default';
}

const getVariantStyles = (variant?: 'source' | 'target' | 'default') => {
    switch (variant) {
        case 'source':
            return {
                container: 'bg-blue-50 dark:bg-slate-800 border-blue-200 dark:border-blue-700',
                header: 'bg-blue-100 dark:bg-blue-900 border-blue-200 dark:border-blue-700 text-blue-800 dark:text-blue-100',
                row: 'border-blue-100 dark:border-blue-800 hover:bg-blue-100 dark:hover:bg-blue-800',
                text: 'text-blue-700 dark:text-blue-300'
            };
        case 'target':
            return {
                container: 'bg-emerald-50 dark:bg-slate-800 border-emerald-200 dark:border-emerald-700',
                header: 'bg-emerald-100 dark:bg-emerald-900 border-emerald-200 dark:border-emerald-700 text-emerald-800 dark:text-emerald-100',
                row: 'border-emerald-100 dark:border-emerald-800 hover:bg-emerald-100 dark:hover:bg-emerald-800',
                text: 'text-emerald-700 dark:text-emerald-300'
            };
        default:
            return {
                container: 'bg-white dark:bg-slate-800 border-slate-300 dark:border-slate-600',
                header: 'bg-slate-100 dark:bg-slate-700 border-slate-200 dark:border-slate-600 text-slate-800 dark:text-slate-100',
                row: 'border-slate-100 dark:border-slate-700 hover:bg-slate-50 dark:hover:bg-slate-750',
                text: 'text-slate-700 dark:text-slate-300'
            };
    }
};

const TableNode = ({ data, isConnectable, targetPosition = Position.Top, sourcePosition = Position.Bottom }: NodeProps<TableNodeData>) => {
    const styles = getVariantStyles(data.variant);

    return (
        <div className={`rounded-lg shadow-md border min-w-[200px] overflow-hidden ${styles.container}`}>
            <Handle type="target" position={targetPosition} isConnectable={isConnectable} className="!bg-slate-400 w-3 h-3" />

            {/* Header: Table Name */}
            <div className={`px-3 py-2 border-b flex justify-between items-center ${styles.header}`}>
                <span className="font-bold text-sm line-clamp-1" title={data.label}>
                    {data.label}
                </span>
            </div>

            {/* Body: Columns */}
            <div className="p-0">
                {data.columns && data.columns.length > 0 ? (
                    data.columns.map((col, index) => (
                        <div
                            key={`${col.name}-${index}`}
                            className={`px-3 py-1.5 flex justify-between items-center text-xs border-b last:border-0 transition-colors ${styles.row}`}
                        >
                            <div className="flex items-center gap-2 overflow-hidden">
                                {/* PK/FK Indicators could go here if we had that info parsed specifically */}
                                <span className={`font-medium truncate ${styles.text}`} title={col.name}>
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
