import React from 'react'
import ReactDOM from 'react-dom/client'
import { QueryClient, QueryClientProvider } from '@tanstack/react-query'
import { ReactQueryDevtools } from '@tanstack/react-query-devtools'
import App from './App.tsx'
import './index.css'
import './i18n';

// QueryClient 생성 (전역 설정)
const queryClient = new QueryClient({
  defaultOptions: {
    queries: {
      // 전역 기본값
      staleTime: 5 * 60 * 1000, // 5분 캐싱
      gcTime: 10 * 60 * 1000,   // 10분 후 가비지 컬렉션 (구 cacheTime)
      retry: 3,                  // 실패 시 3번 재시도
      refetchOnWindowFocus: false, // 윈도우 포커스 시 재요청 비활성화
    },
    mutations: {
      retry: 1, // 뮤테이션은 1번만 재시도
    },
  },
});

ReactDOM.createRoot(document.getElementById('root')!).render(
    <React.StrictMode>
        <QueryClientProvider client={queryClient}>
            <App />
            <ReactQueryDevtools initialIsOpen={false} />
        </QueryClientProvider>
    </React.StrictMode>,
)
