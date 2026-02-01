import { memo } from 'react';
import { Handle, Position, NodeProps } from 'reactflow';

interface InputParamsNodeData {
    label: string;
    params: string[];
}

const InputParamsNode = ({ data, isConnectable }: NodeProps<InputParamsNodeData>) => {
    return (
        <div className="relative rounded-lg shadow-md border min-w-[220px] overflow-hidden bg-blue-50 dark:bg-slate-800 border-blue-200 dark:border-blue-700">
            {/* Header */}
            <div className="px-3 py-2 border-b border-blue-200 dark:border-blue-700 bg-blue-100 dark:bg-blue-900 flex justify-center items-center text-center">
                <span className="font-bold text-sm text-blue-800 dark:text-blue-100">
                    Input Parameters
                </span>
            </div>

            {/* Body: Parameters List */}
            <div className="p-0">
                {data.params && data.params.length > 0 ? (
                    data.params.map((param, index) => (
                        <div
                            key={`${param}-${index}`}
                            className="px-3 py-2 flex items-center text-xs border-b border-blue-100 dark:border-blue-800 last:border-0 hover:bg-blue-100 dark:hover:bg-blue-800 transition-colors"
                        >
                            <span className="font-mono font-medium text-blue-700 dark:text-blue-300 truncate" title={param}>
                                {param}
                            </span>
                        </div>
                    ))
                ) : (
                    <div className="p-2 text-xs text-blue-400 italic text-center">
                        No Parameters
                    </div>
                )}
            </div>

            {/* Single Source Handle at vertical center of the node */}
            <Handle
                type="source"
                position={Position.Right}
                id="output"
                isConnectable={isConnectable}
                className="!bg-blue-400 w-2.5 h-2.5"
                style={{ top: '50%', transform: 'translateY(-50%)' }}
            />
        </div>
    );
};

export default memo(InputParamsNode);
