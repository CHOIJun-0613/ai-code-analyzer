import { memo } from 'react';
import { Handle, Position, NodeProps } from 'reactflow';

interface InputParamsNodeData {
    label: string;
    params: string[];
}

const InputParamsNode = ({ data, isConnectable }: NodeProps<InputParamsNodeData>) => {
    return (
        <div className="rounded-lg shadow-md border min-w-[220px] overflow-hidden bg-blue-50 dark:bg-slate-800 border-blue-200 dark:border-blue-700">
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
                            className="relative px-3 py-2 flex items-center justify-between text-xs border-b border-blue-100 dark:border-blue-800 last:border-0 hover:bg-blue-100 dark:hover:bg-blue-800 transition-colors"
                        >
                            <span className="font-mono font-medium text-blue-700 dark:text-blue-300 truncate" title={param}>
                                {param}
                                {/* Original text format: #{param} is handled by the caller or just distinct styling? 
                                    Let's assume the param string passed here is the full display name or just var name.
                                    Based on user request, it might include the bracket wrapping. */}
                            </span>

                            {/* Source Handle for this specific parameter */}
                            <Handle
                                type="source"
                                position={Position.Right}
                                id={param} // unique id for handle connection
                                isConnectable={isConnectable}
                                className="!bg-blue-400 w-2.5 h-2.5 !-right-[5px]"
                            />
                        </div>
                    ))
                ) : (
                    <div className="p-2 text-xs text-blue-400 italic text-center">
                        No Parameters
                    </div>
                )}
            </div>
        </div>
    );
};

export default memo(InputParamsNode);
