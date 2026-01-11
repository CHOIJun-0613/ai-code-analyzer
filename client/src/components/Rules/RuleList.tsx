import React from 'react';
import {
    DndContext,
    closestCenter,
    KeyboardSensor,
    PointerSensor,
    useSensor,
    useSensors,
    DragEndEvent
} from '@dnd-kit/core';
import {
    arrayMove,
    SortableContext,
    sortableKeyboardCoordinates,
    verticalListSortingStrategy,
    useSortable
} from '@dnd-kit/sortable';
import { CSS } from '@dnd-kit/utilities';
import { AnalysisRule } from '../../api/analysisRules';
import { Edit2, Trash2, GripVertical, Check, X } from 'lucide-react';
import { useTranslation } from 'react-i18next';

interface RuleListProps {
    rules: AnalysisRule[];
    onReorder: (newOrder: AnalysisRule[]) => void;
    onEdit: (rule: AnalysisRule) => void;
    onDelete: (id: number) => void;
    onToggleUse: (rule: AnalysisRule) => void;
}

interface SortableItemProps {
    rule: AnalysisRule;
    onEdit: (rule: AnalysisRule) => void;
    onDelete: (id: number) => void;
    onToggleUse: (rule: AnalysisRule) => void;
}

const SortableItem = ({ rule, onEdit, onDelete, onToggleUse }: SortableItemProps) => {
    const {
        attributes,
        listeners,
        setNodeRef,
        transform,
        transition,
    } = useSortable({ id: rule.id });

    const style = {
        transform: CSS.Transform.toString(transform),
        transition,
    };

    const { t } = useTranslation();

    return (
        <div
            ref={setNodeRef}
            style={style}
            className="flex items-center gap-4 p-4 bg-white dark:bg-gray-800 border border-gray-200 dark:border-gray-700 rounded-lg shadow-sm mb-2"
        >
            <div {...attributes} {...listeners} className="cursor-grab text-gray-400 hover:text-gray-600 dark:hover:text-gray-300">
                <GripVertical size={20} />
            </div>

            <div className="flex items-center justify-center w-8 h-8 rounded-full bg-gray-100 dark:bg-gray-700 text-gray-500 dark:text-gray-400 font-bold text-sm mr-2 shrink-0">
                {rule.order + 1}
            </div>

            <div className="flex-1 min-w-0">
                <div className="flex items-center gap-2 mb-1">
                    <h3
                        onClick={() => onEdit(rule)}
                        className="text-lg font-bold text-gray-900 dark:text-gray-100 truncate cursor-pointer hover:text-blue-600 dark:hover:text-blue-400 transition-colors"
                    >
                        {rule.name}
                    </h3>
                    {rule.isSystem && (
                        <span className="px-2 py-0.5 text-xs font-medium bg-blue-100 text-blue-800 dark:bg-blue-900 dark:text-blue-200 rounded-full">
                            System
                        </span>
                    )}
                </div>
                <p className="text-sm text-gray-500 dark:text-gray-400 truncate">
                    {rule.description}
                </p>
            </div>

            <div className="flex items-center gap-2">
                <button
                    onClick={() => onToggleUse(rule)}
                    className={`flex items-center gap-1 px-2 py-1 text-xs font-medium rounded-md transition-colors ${rule.useYn
                        ? 'bg-green-100 text-green-700 hover:bg-green-200 dark:bg-green-900/30 dark:text-green-400'
                        : 'bg-gray-100 text-gray-600 hover:bg-gray-200 dark:bg-gray-800 dark:text-gray-400'
                        }`}
                >
                    {rule.useYn ? <Check size={14} /> : <X size={14} />}
                    {rule.useYn ? t('common.active', 'Active') : t('common.inactive', 'Inactive')}
                </button>

                <button
                    onClick={() => onEdit(rule)}
                    className="p-1.5 text-gray-500 hover:bg-gray-100 dark:hover:bg-gray-700 rounded-md transition-colors"
                    title={t('common.edit', 'Edit')}
                >
                    <Edit2 size={16} />
                </button>

                {!rule.isSystem && (
                    <button
                        onClick={() => onDelete(rule.id)}
                        className="p-1.5 text-red-500 hover:bg-red-50 dark:hover:bg-red-900/20 rounded-md transition-colors"
                        title={t('common.delete', 'Delete')}
                    >
                        <Trash2 size={16} />
                    </button>
                )}
            </div>
        </div>
    );
};

export const RuleList: React.FC<RuleListProps> = ({ rules, onReorder, onEdit, onDelete, onToggleUse }) => {
    const sensors = useSensors(
        useSensor(PointerSensor),
        useSensor(KeyboardSensor, {
            coordinateGetter: sortableKeyboardCoordinates,
        })
    );

    const handleDragEnd = (event: DragEndEvent) => {
        const { active, over } = event;

        if (over && active.id !== over.id) {
            const oldIndex = rules.findIndex((r) => r.id === active.id);
            const newIndex = rules.findIndex((r) => r.id === over.id);
            const newRules = arrayMove(rules, oldIndex, newIndex);
            // Update order property
            const reordered = newRules.map((r: AnalysisRule, index: number) => ({ ...r, order: index }));
            onReorder(reordered);
        }
    };

    return (
        <DndContext
            sensors={sensors}
            collisionDetection={closestCenter}
            onDragEnd={handleDragEnd}
        >
            <SortableContext
                items={rules.map(r => r.id)}
                strategy={verticalListSortingStrategy}
            >
                <div className="space-y-2">
                    {rules.map((rule) => (
                        <SortableItem
                            key={rule.id}
                            rule={rule}
                            onEdit={onEdit}
                            onDelete={onDelete}
                            onToggleUse={onToggleUse}
                        />
                    ))}
                </div>
            </SortableContext>
        </DndContext>
    );
};
