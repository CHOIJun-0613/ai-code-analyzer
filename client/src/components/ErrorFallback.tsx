import React, { ErrorInfo } from 'react';
import { useTranslation } from 'react-i18next';
import { AlertTriangle, Home, RefreshCw, ChevronDown, ChevronUp } from 'lucide-react';

interface ErrorFallbackProps {
  error: Error;
  errorInfo?: ErrorInfo;
  resetError?: () => void;
}

/**
 * ErrorFallback 컴포넌트
 *
 * ErrorBoundary에서 사용할 수 있는 커스텀 에러 UI 컴포넌트
 * 다국어 지원 및 사용자 친화적인 디자인 제공
 */
const ErrorFallback: React.FC<ErrorFallbackProps> = ({ error, errorInfo, resetError }) => {
  const { t } = useTranslation();
  const [showDetails, setShowDetails] = React.useState(false);

  const handleReload = () => {
    if (resetError) {
      resetError();
    } else {
      window.location.reload();
    }
  };

  const handleGoHome = () => {
    window.location.href = '/';
  };

  return (
    <div className="min-h-screen flex items-center justify-center bg-gradient-to-br from-gray-50 to-gray-100 dark:from-gray-900 dark:to-gray-800 px-4 py-8">
      <div className="max-w-2xl w-full">
        {/* 메인 에러 카드 */}
        <div className="bg-white dark:bg-gray-800 rounded-xl shadow-2xl overflow-hidden">
          {/* 헤더 */}
          <div className="bg-red-500 dark:bg-red-600 px-6 py-4">
            <div className="flex items-center">
              <AlertTriangle className="h-8 w-8 text-white" />
              <h1 className="ml-3 text-2xl font-bold text-white">
                {t('error.title', '오류가 발생했습니다')}
              </h1>
            </div>
          </div>

          {/* 본문 */}
          <div className="px-6 py-8">
            <p className="text-lg text-gray-700 dark:text-gray-300 mb-6">
              {t('error.message', '예상치 못한 오류가 발생했습니다. 불편을 드려 죄송합니다.')}
            </p>

            {/* 에러 메시지 */}
            <div className="mb-6 p-4 bg-red-50 dark:bg-red-900/20 border border-red-200 dark:border-red-800 rounded-lg">
              <p className="text-sm font-semibold text-red-800 dark:text-red-300 mb-1">
                {t('error.errorMessage', '에러 메시지')}:
              </p>
              <p className="text-sm font-mono text-red-700 dark:text-red-400">
                {error.message || t('error.unknownError', '알 수 없는 오류')}
              </p>
            </div>

            {/* 상세 정보 토글 */}
            <div className="mb-6">
              <button
                onClick={() => setShowDetails(!showDetails)}
                className="flex items-center justify-between w-full px-4 py-3 bg-gray-100 dark:bg-gray-700 hover:bg-gray-200 dark:hover:bg-gray-600 rounded-lg transition-colors"
              >
                <span className="text-sm font-medium text-gray-700 dark:text-gray-300">
                  {t('error.showDetails', '상세 정보 보기')}
                </span>
                {showDetails ? (
                  <ChevronUp className="h-5 w-5 text-gray-500" />
                ) : (
                  <ChevronDown className="h-5 w-5 text-gray-500" />
                )}
              </button>

              {showDetails && (
                <div className="mt-2 p-4 bg-gray-50 dark:bg-gray-900 border border-gray-200 dark:border-gray-700 rounded-lg max-h-96 overflow-auto">
                  {/* 스택 트레이스 */}
                  {error.stack && (
                    <div className="mb-4">
                      <p className="text-xs font-semibold text-gray-600 dark:text-gray-400 mb-2">
                        {t('error.stackTrace', '스택 트레이스')}:
                      </p>
                      <pre className="text-xs text-gray-700 dark:text-gray-300 whitespace-pre-wrap font-mono bg-white dark:bg-gray-800 p-3 rounded border border-gray-200 dark:border-gray-700">
                        {error.stack}
                      </pre>
                    </div>
                  )}

                  {/* 컴포넌트 스택 */}
                  {errorInfo?.componentStack && (
                    <div>
                      <p className="text-xs font-semibold text-gray-600 dark:text-gray-400 mb-2">
                        {t('error.componentStack', '컴포넌트 스택')}:
                      </p>
                      <pre className="text-xs text-gray-700 dark:text-gray-300 whitespace-pre-wrap font-mono bg-white dark:bg-gray-800 p-3 rounded border border-gray-200 dark:border-gray-700">
                        {errorInfo.componentStack}
                      </pre>
                    </div>
                  )}
                </div>
              )}
            </div>

            {/* 액션 버튼 */}
            <div className="flex flex-col sm:flex-row gap-3">
              <button
                onClick={handleReload}
                className="flex-1 flex items-center justify-center gap-2 px-6 py-3 bg-blue-600 hover:bg-blue-700 text-white font-medium rounded-lg transition-colors shadow-md hover:shadow-lg"
              >
                <RefreshCw className="h-5 w-5" />
                {t('error.retry', '다시 시도')}
              </button>
              <button
                onClick={handleGoHome}
                className="flex-1 flex items-center justify-center gap-2 px-6 py-3 bg-gray-600 hover:bg-gray-700 text-white font-medium rounded-lg transition-colors shadow-md hover:shadow-lg"
              >
                <Home className="h-5 w-5" />
                {t('error.goHome', '홈으로 이동')}
              </button>
            </div>
          </div>

          {/* 푸터 */}
          <div className="px-6 py-4 bg-gray-50 dark:bg-gray-900 border-t border-gray-200 dark:border-gray-700">
            <p className="text-sm text-center text-gray-500 dark:text-gray-400">
              {t('error.contactSupport', '문제가 지속되면 관리자에게 문의하세요.')}
            </p>
          </div>
        </div>

        {/* 추가 정보 */}
        <div className="mt-6 text-center">
          <p className="text-sm text-gray-500 dark:text-gray-400">
            {t('error.timestamp', '오류 발생 시간')}: {new Date().toLocaleString('ko-KR')}
          </p>
        </div>
      </div>
    </div>
  );
};

export default ErrorFallback;
