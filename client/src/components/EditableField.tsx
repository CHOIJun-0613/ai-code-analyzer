import React, { useState } from 'react';
import { Pencil, Check, X } from 'lucide-react';

interface EditableFieldProps {
    value: string;
    onSave: (newValue: string) => Promise<void>;
    label?: string;
    placeholder?: string;
    className?: string;
}

const EditableField: React.FC<EditableFieldProps> = ({ value, onSave, label, placeholder, className = '' }) => {
    const [isEditing, setIsEditing] = useState(false);
    const [editValue, setEditValue] = useState(value);
    const [isSaving, setIsSaving] = useState(false);

    const handleSave = async () => {
        if (editValue === value) {
            setIsEditing(false);
            return;
        }

        setIsSaving(true);
        try {
            await onSave(editValue);
            setIsEditing(false);
        } catch (error) {
            console.error("Failed to save:", error);
            // Optionally handle error state
        } finally {
            setIsSaving(false);
        }
    };

    const handleCancel = () => {
        setEditValue(value);
        setIsEditing(false);
    };

    if (isEditing) {
        return (
            <div className={`flex items-center gap-2 ${className}`}>
                <input
                    type="text"
                    value={editValue}
                    onChange={(e) => setEditValue(e.target.value)}
                    className="flex-1 px-2 py-1 text-sm border border-indigo-300 rounded focus:outline-none focus:ring-1 focus:ring-indigo-500"
                    placeholder={placeholder}
                    autoFocus
                    onKeyDown={(e) => {
                        if (e.key === 'Enter') handleSave();
                        if (e.key === 'Escape') handleCancel();
                    }}
                />
                <button
                    onClick={handleSave}
                    disabled={isSaving}
                    className="p-1 text-emerald-600 hover:bg-emerald-50 rounded transition-colors"
                >
                    <Check className="w-4 h-4" />
                </button>
                <button
                    onClick={handleCancel}
                    disabled={isSaving}
                    className="p-1 text-slate-400 hover:bg-slate-50 rounded transition-colors"
                >
                    <X className="w-4 h-4" />
                </button>
            </div>
        );
    }

    return (
        <div className={`group flex items-center gap-2 ${className}`}>
            <span className="text-slate-900 truncate">{value || <span className="text-slate-400 italic">Empty</span>}</span>
            <button
                onClick={() => {
                    setEditValue(value);
                    setIsEditing(true);
                }}
                className="opacity-0 group-hover:opacity-100 p-1 text-slate-400 hover:text-indigo-600 transition-all"
                title={`Edit ${label || 'field'}`}
            >
                <Pencil className="w-3 h-3" />
            </button>
        </div>
    );
};

export default EditableField;
