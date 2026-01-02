import React from 'react';
import { Rocket, AlertTriangle } from 'lucide-react';
import { useTranslation } from 'react-i18next';

interface ConfirmModalProps {
    isOpen: boolean;
    onClose: () => void;
    onConfirm: () => void;
    title: string;
    message: string;
    confirmText?: string;
    cancelText?: string;
    variant?: 'default' | 'danger';
}

const ConfirmModal: React.FC<ConfirmModalProps> = ({
    isOpen,
    onClose,
    onConfirm,
    title,
    message,
    confirmText,
    cancelText,
    variant = 'default'
}) => {
    const { t } = useTranslation();

    if (!isOpen) return null;

    const isDanger = variant === 'danger';

    return (
        <div className="fixed inset-0 z-[100] flex items-center justify-center p-4 bg-slate-900/60 backdrop-blur-sm animate-in fade-in duration-200">
            <div className="bg-white rounded-2xl shadow-2xl w-full max-w-md overflow-hidden animate-in zoom-in-95 duration-200 border border-slate-100">
                <div className="p-8">
                    <div className="flex flex-col items-center text-center">
                        <div className={`w-16 h-16 rounded-full flex items-center justify-center mb-6 ring-8 ${isDanger ? 'bg-red-50 ring-red-50/50' : 'bg-indigo-50 ring-indigo-50/50'}`}>
                            {isDanger ? (
                                <AlertTriangle className={`w-8 h-8 ${isDanger ? 'text-red-600' : 'text-indigo-600'}`} />
                            ) : (
                                <Rocket className="w-8 h-8 text-indigo-600" />
                            )}
                        </div>

                        <h3 className="text-xl font-bold text-slate-900 mb-3">
                            {title}
                        </h3>

                        <p className="text-slate-500 whitespace-pre-wrap leading-relaxed mb-8">
                            {message}
                        </p>

                        <div className="flex gap-3 w-full">
                            <button
                                type="button"
                                className="flex-1 py-3 px-4 bg-white border border-slate-200 text-slate-700 font-semibold rounded-xl hover:bg-slate-50 hover:border-slate-300 transition-all active:scale-[0.98]"
                                onClick={onClose}
                            >
                                {cancelText || t('common.cancel') || "Cancel"}
                            </button>
                            <button
                                type="button"
                                className={`flex-1 py-3 px-4 text-white font-semibold rounded-xl shadow-lg transition-all active:scale-[0.98] ${isDanger
                                    ? 'bg-red-600 shadow-red-200 hover:bg-red-700 hover:shadow-red-300'
                                    : 'bg-indigo-600 shadow-indigo-200 hover:bg-indigo-700 hover:shadow-indigo-300'
                                    }`}
                                onClick={onConfirm}
                            >
                                {confirmText || t('common.confirm') || "Confirm"}
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default ConfirmModal;
