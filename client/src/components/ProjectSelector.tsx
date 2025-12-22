import React, { useState } from 'react';
import { Search, Folder } from 'lucide-react';
import { useTranslation } from 'react-i18next';

interface ProjectSelectorProps {
    projects: any[];
    selected: string[];
    onChange: (selected: string[]) => void;
}

const ProjectSelector: React.FC<ProjectSelectorProps> = ({ projects, selected, onChange }) => {
    const { t } = useTranslation();
    const [searchTerm, setSearchTerm] = useState('');

    const filteredProjects = projects.filter(p =>
        p.name.toLowerCase().includes(searchTerm.toLowerCase())
    );

    const handleToggle = (projectName: string, checked: boolean) => {
        if (checked) {
            onChange([...selected, projectName]);
        } else {
            onChange(selected.filter(p => p !== projectName));
        }
    };

    const handleSelectAll = () => {
        const allFilteredNames = filteredProjects.map(p => p.name);
        // Add unique names from filtered list to existing selection
        const newSelected = Array.from(new Set([...selected, ...allFilteredNames]));
        onChange(newSelected);
    };

    const handleDeselectAll = () => {
        const allFilteredNames = filteredProjects.map(p => p.name);
        // Remove names that are in the filtered list
        onChange(selected.filter(p => !allFilteredNames.includes(p)));
    };

    return (
        <div>
            <label className="block text-sm font-semibold text-slate-700 mb-2">
                {t('groupManagement.assignProjects')}
            </label>

            <div className="flex flex-col gap-2 mb-2">
                <div className="relative">
                    <Search className="absolute left-3 top-1/2 -translate-y-1/2 w-4 h-4 text-slate-400" />
                    <input
                        type="text"
                        placeholder={t('common.search', 'Search...')}
                        className="w-full pl-9 pr-4 py-2 rounded-xl border border-slate-200 text-sm focus:border-indigo-500 focus:ring-2 focus:ring-indigo-500/10 outline-none transition-all"
                        value={searchTerm}
                        onChange={e => setSearchTerm(e.target.value)}
                    />
                </div>
                {filteredProjects.length > 0 && (
                    <div className="flex gap-2 text-xs text-slate-500 px-1">
                        <button
                            type="button"
                            onClick={handleSelectAll}
                            className="hover:text-indigo-600 transition-colors"
                        >
                            {t('common.selectAll')}
                        </button>
                        <span>•</span>
                        <button
                            type="button"
                            onClick={handleDeselectAll}
                            className="hover:text-indigo-600 transition-colors"
                        >
                            {t('common.deselectAll')}
                        </button>
                        <span className="ml-auto">
                            {filteredProjects.length} found
                        </span>
                    </div>
                )}
            </div>

            <div className="space-y-1 max-h-60 overflow-y-auto pr-2 custom-scrollbar border border-slate-100 rounded-xl p-2 bg-slate-50/50">
                {filteredProjects.map(proj => (
                    <label
                        key={proj.name}
                        className={`flex items-center p-2 rounded-lg border cursor-pointer transition-all duration-200 ${selected.includes(proj.name)
                            ? 'border-indigo-200 bg-indigo-50 text-indigo-900 shadow-sm'
                            : 'border-transparent hover:bg-white hover:border-slate-200'
                            }`}
                    >
                        <input
                            type="checkbox"
                            className="w-4 h-4 rounded border-slate-300 text-indigo-600 focus:ring-indigo-500"
                            checked={selected.includes(proj.name)}
                            onChange={e => handleToggle(proj.name, e.target.checked)}
                        />
                        <span className="ml-3 text-sm font-medium flex items-center gap-2 truncate">
                            <Folder className={`w-4 h-4 ${selected.includes(proj.name) ? 'text-indigo-500' : 'text-slate-400'}`} />
                            {proj.name}
                        </span>
                    </label>
                ))}
                {filteredProjects.length === 0 && (
                    <p className="text-sm text-slate-400 italic text-center py-4">
                        {searchTerm ? t('common.noResults') : t('common.noData')}
                    </p>
                )}
            </div>
        </div>
    );
};

export default ProjectSelector;
