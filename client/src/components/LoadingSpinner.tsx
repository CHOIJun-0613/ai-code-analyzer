/**
 * LoadingSpinner 컴포넌트
 * Lazy Loading 시 fallback으로 사용되는 로딩 인디케이터
 */
const LoadingSpinner = () => {
    return (
        <div className="flex items-center justify-center min-h-screen">
            <div className="flex flex-col items-center gap-4">
                {/* 회전하는 스피너 */}
                <div className="w-12 h-12 border-4 border-blue-200 border-t-blue-600 rounded-full animate-spin"></div>

                {/* 로딩 텍스트 */}
                <div className="text-gray-600 dark:text-gray-400">
                    로딩 중...
                </div>
            </div>
        </div>
    );
};

export default LoadingSpinner;
