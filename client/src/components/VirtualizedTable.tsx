import React, { useCallback, useState, useEffect, useRef } from 'react';
import { List } from 'react-window';

const ListAny = List as any;

// Type definition (extracted locally since we can't rely on named export)
type RowComponentProps<T = any> = {
  index: number;
  style: React.CSSProperties;
  [key: string]: any;
};

export interface Column<T> {
  /** 컬럼 키 (고유 식별자) */
  key: string;
  /** 컬럼 헤더 제목 */
  header: string | React.ReactNode;
  /** 셀 렌더링 함수 */
  render: (item: T, index: number) => React.ReactNode;
  /** 컬럼 너비 (픽셀 또는 백분율, 예: '200px', '20%') */
  width?: string;
  /** 정렬 가능 여부 */
  sortable?: boolean;
  /** 텍스트 정렬 */
  align?: 'left' | 'center' | 'right';
  /** 고정 컬럼 (좌측) */
  fixed?: boolean;
}

interface RowProps<T> {
  items: T[];
  columns: Column<T>[];
  onRowClick?: (item: T, index: number) => void;
  hoverable: boolean;
  striped: boolean;
  rowClassName?: (item: T, index: number) => string;
  cellClassName: string;
  columnWidths: Record<string, number>;
}

export interface VirtualizedTableProps<T> {
  /** 데이터 배열 */
  data: T[];
  /** 컬럼 정의 */
  columns: Column<T>[];
  /** 행 높이 (픽셀) */
  rowHeight?: number;
  /** 테이블 높이 (픽셀) */
  height?: number;
  /** 헤더 높이 (픽셀) */
  headerHeight?: number;
  /** 행 클릭 핸들러 */
  onRowClick?: (item: T, index: number) => void;
  /** 행 hover 효과 */
  hoverable?: boolean;
  /** 스트라이프 스타일 (교차 배경색) */
  striped?: boolean;
  /** 빈 데이터 메시지 */
  emptyMessage?: string;
  /** 로딩 상태 */
  loading?: boolean;
  /** 커스텀 행 클래스명 */
  rowClassName?: (item: T, index: number) => string;
  /** 커스텀 셀 클래스명 */
  cellClassName?: string;
  /** 스크롤이 끝에 도달했을 때 콜백 */
  onEndReached?: () => void;
  /** 데이터 로딩 임계값 (남은 행 수) */
  onEndReachedThreshold?: number;
}

/**
 * VirtualizedTable 컴포넌트
 *
 * react-window를 사용하여 대규모 데이터 테이블을 가상 스크롤링으로 렌더링합니다.
 * 1000+ 행의 데이터도 빠르게 렌더링하고 스크롤할 수 있습니다.
 *
 * @example
 * ```tsx
 * const columns: Column<User>[] = [
 *   { key: 'id', header: 'ID', render: (user) => user.id, width: '100px' },
 *   { key: 'name', header: 'Name', render: (user) => user.name },
 * ];
 *
 * <VirtualizedTable
 *   data={users}
 *   columns={columns}
 *   height={600}
 *   onRowClick={(user) => console.log(user)}
 * />
 * ```
 */
function VirtualizedTable<T>({
  data,
  columns,
  rowHeight = 50,
  height = 600,
  headerHeight = 50,
  onRowClick,
  hoverable = true,
  striped = false,
  emptyMessage = 'No data available',
  loading = false,
  rowClassName,
  cellClassName = '',
  onEndReached,
  onEndReachedThreshold = 5,
}: VirtualizedTableProps<T>) {
  const [columnWidths, setColumnWidths] = useState<Record<string, number>>({});
  const [isResizing, setIsResizing] = useState(false);
  const resizeData = useRef<{ startX: number; startWidth: number; columnKey: string } | null>(null);

  const handleResizeStart = (e: React.MouseEvent, columnKey: string) => {
    e.preventDefault();
    e.stopPropagation();
    const headerCell = e.currentTarget.parentElement;
    if (headerCell) {
      const startWidth = headerCell.getBoundingClientRect().width;
      resizeData.current = {
        startX: e.pageX,
        startWidth,
        columnKey
      };
      setIsResizing(true);
    }
  };

  // React Window 2.x API uses onRowsRendered instead of onItemsRendered
  // and provides stopIndex instead of visibleStopIndex
  const handleRowsRendered = ({ stopIndex }: { stopIndex: number }) => {
    // console.log('handleRowsRendered', stopIndex, data.length, onEndReachedThreshold);
    if (onEndReached && data.length > 0 && stopIndex >= data.length - onEndReachedThreshold) {
      onEndReached();
    }
  };

  useEffect(() => {
    const handleMouseMove = (e: MouseEvent) => {
      if (!isResizing || !resizeData.current) return;
      const { startX, startWidth, columnKey } = resizeData.current;
      const diff = e.pageX - startX;
      const newWidth = Math.max(50, startWidth + diff);

      setColumnWidths(prev => ({
        ...prev,
        [columnKey]: newWidth
      }));
    };

    const handleMouseUp = () => {
      setIsResizing(false);
      resizeData.current = null;
    };

    if (isResizing) {
      document.addEventListener('mousemove', handleMouseMove);
      document.addEventListener('mouseup', handleMouseUp);
    }

    return () => {
      document.removeEventListener('mousemove', handleMouseMove);
      document.removeEventListener('mouseup', handleMouseUp);
    };
  }, [isResizing]);

  // 행 렌더링 컴포넌트
  const RowComponent = useCallback(
    (props: RowComponentProps<RowProps<T>>) => {
      // rowProps applied to List are spread here, along with index and style
      const { index, style, items, columns, onRowClick, hoverable, striped, rowClassName, cellClassName, columnWidths } = props;

      if (!items) {
        // console.error('RowComponent: items is undefined', props);
        return null;
      }

      const item = items[index];
      const isClickable = !!onRowClick;
      const customRowClass = rowClassName ? rowClassName(item, index) : '';

      return (
        <div
          style={style}
          className={`
            flex border-b border-slate-100 dark:border-slate-800
            ${striped && index % 2 === 1 ? 'bg-slate-50 dark:bg-slate-800/50' : 'bg-white dark:bg-slate-900'}
            ${hoverable ? 'hover:bg-indigo-50/30 dark:hover:bg-indigo-500/10 transition-colors' : ''}
            ${isClickable ? 'cursor-pointer' : ''}
            ${customRowClass}
          `}
          onClick={() => onRowClick && onRowClick(item, index)}
        >
          {columns.map((column) => {
            const cellAlign = column.align || 'left';
            const alignClass =
              cellAlign === 'center'
                ? 'justify-center text-center'
                : cellAlign === 'right'
                  ? 'justify-end text-right'
                  : 'justify-start text-left';

            return (
              <div
                key={column.key}
                className={`
                  flex items-center px-4 py-2
                  ${column.width ? '' : 'flex-1'}
                  ${alignClass}
                  ${cellClassName}
                `}
                style={{
                  width: columnWidths[column.key] ? `${columnWidths[column.key]}px` : column.width,
                  flexShrink: 0,
                  flexGrow: columnWidths[column.key] || column.width ? 0 : 1
                }}
              >
                {column.render(item, index)}
              </div>
            );
          })}
        </div>
      );
    },
    []
  );

  // 로딩 상태 (데이터가 없을 때만 표시)
  if (loading && data.length === 0) {
    return (
      <div className="flex items-center justify-center bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800" style={{ height }}>
        <div className="text-center">
          <div className="animate-spin rounded-full h-12 w-12 border-b-2 border-indigo-600 mx-auto mb-4"></div>
          <p className="text-slate-500 dark:text-slate-400">Loading...</p>
        </div>
      </div>
    );
  }

  // 빈 데이터
  if (data.length === 0) {
    return (
      <div className="flex flex-col bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 overflow-hidden">
        {/* 헤더 */}
        <div className="flex bg-slate-50 dark:bg-slate-800/50 border-b border-slate-200 dark:border-slate-700" style={{ height: headerHeight }}>
          {columns.map((column) => {
            const alignClass =
              column.align === 'center'
                ? 'justify-center text-center'
                : column.align === 'right'
                  ? 'justify-end text-right'
                  : 'justify-start text-left';

            return (
              <div
                key={column.key}
                className={`
                  flex items-center px-4 font-semibold text-slate-700 dark:text-slate-300 text-sm
                  ${column.width ? '' : 'flex-1'}
                  ${alignClass}
                `}
                style={column.width ? { width: column.width, flexShrink: 0 } : undefined}
              >
                {column.header}
              </div>
            );
          })}
        </div>

        {/* 빈 메시지 */}
        <div className="flex items-center justify-center py-12" style={{ height: height - headerHeight }}>
          <p className="text-slate-400 dark:text-slate-500 text-sm">{emptyMessage}</p>
        </div>
      </div>
    );
  }

  return (
    <div className="flex flex-col bg-white dark:bg-slate-900 rounded-xl border border-slate-200 dark:border-slate-800 overflow-hidden shadow-sm">
      {/* 헤더 */}
      <div className="flex bg-slate-50 dark:bg-slate-800/50 border-b border-slate-200 dark:border-slate-700" style={{ height: headerHeight }}>
        {columns.map((column) => {
          const alignClass =
            column.align === 'center'
              ? 'justify-center text-center'
              : column.align === 'right'
                ? 'justify-end text-right'
                : 'justify-start text-left';

          return (
            <div
              key={column.key}
              className={`
                flex items-center px-4 font-semibold text-slate-700 dark:text-slate-300 text-sm relative
                ${(columnWidths[column.key] || column.width) ? '' : 'flex-1'}
                ${alignClass}
              `}
              style={{
                width: columnWidths[column.key] ? `${columnWidths[column.key]}px` : column.width,
                flexShrink: 0,
                flexGrow: columnWidths[column.key] || column.width ? 0 : 1
              }}
            >
              {column.header}
              <div
                className="absolute right-0 top-0 bottom-0 w-1 cursor-col-resize hover:bg-indigo-300 z-10"
                onMouseDown={(e) => handleResizeStart(e, column.key)}
                onClick={(e) => e.stopPropagation()}
              />
            </div>
          );
        })}
      </div>

      {/* 가상 스크롤 리스트 (react-window 2.x API) */}
      <ListAny
        height={height - headerHeight}
        width="100%"
        rowCount={data.length}
        rowHeight={rowHeight}
        overscanCount={5}
        onRowsRendered={handleRowsRendered}
        rowComponent={RowComponent}
        rowProps={{
          items: data,
          columns,
          onRowClick,
          hoverable,
          striped,
          rowClassName,
          cellClassName,
          columnWidths,
        }}
        style={{ width: '100%', height: height - headerHeight }}
      />
    </div>
  );
}

export default VirtualizedTable;
