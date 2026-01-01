/**
 * useAnalysisWebSocket Hook
 *
 * 분석 작업의 실시간 모니터링을 위한 WebSocket 연결을 관리합니다.
 * 자동 재연결, 에러 처리, 메시지 파싱 등의 기능을 제공합니다.
 */

import { useEffect, useRef, useState } from 'react';

/**
 * WebSocket 메시지 타입 정의
 */
interface WebSocketMessage {
  type: 'connected' | 'log' | 'status' | 'progress' | 'complete' | 'error';
  job_id?: string;
  data?: any;
  message?: string;
}

/**
 * 진행률 정보
 */
export interface ProgressInfo {
  current: number;
  total: number;
  percent: number;
  raw: string;
}

/**
 * 작업 완료 데이터
 */
export interface CompleteData {
  status: string;
  result?: any;
}

/**
 * Hook 속성
 */
interface UseAnalysisWebSocketProps {
  /** 작업 ID (null이면 연결하지 않음) */
  jobId: string | null;
  /** 작업 타입 ('analysis' | 'ai') */
  jobType?: 'analysis' | 'ai';
  /** 새 로그 수신 시 콜백 */
  onLog?: (log: string) => void;
  /** 상태 업데이트 시 콜백 */
  onStatus?: (status: string) => void;
  /** 진행률 업데이트 시 콜백 */
  onProgress?: (progress: ProgressInfo) => void;
  /** 작업 완료 시 콜백 */
  onComplete?: (data: CompleteData) => void;
  /** 에러 발생 시 콜백 */
  onError?: (error: string) => void;
}

/**
 * 연결 상태
 */
export type ConnectionState = 'connecting' | 'connected' | 'disconnected' | 'error';

/**
 * Hook 반환 값
 */
interface UseAnalysisWebSocketReturn {
  /** 현재 연결 상태 */
  connectionState: ConnectionState;
  /** 재연결 시도 횟수 */
  reconnectAttempts: number;
}

/**
 * useAnalysisWebSocket
 *
 * @param props - Hook 속성
 * @returns 연결 상태 및 재연결 정보
 *
 * @example
 * ```typescript
 * const { connectionState } = useAnalysisWebSocket({
 *   jobId: '20260101-143025-123-admin-7A3B9',
 *   jobType: 'analysis',
 *   onLog: (log) => setLogs(prev => [...prev, log]),
 *   onStatus: (status) => setStatus(status),
 *   onComplete: (data) => console.log('Complete:', data)
 * });
 * ```
 */
export const useAnalysisWebSocket = ({
  jobId,
  jobType = 'analysis',
  onLog,
  onStatus,
  onProgress,
  onComplete,
  onError
}: UseAnalysisWebSocketProps): UseAnalysisWebSocketReturn => {
  const [connectionState, setConnectionState] = useState<ConnectionState>('disconnected');
  const wsRef = useRef<WebSocket | null>(null);
  const reconnectAttemptsRef = useRef(0);
  const reconnectTimeoutRef = useRef<NodeJS.Timeout | null>(null);
  const maxReconnectAttempts = 3;
  const reconnectDelay = 2000; // 2초

  // 콜백 함수들을 ref로 저장하여 재연결 방지
  const callbacksRef = useRef({ onLog, onStatus, onProgress, onComplete, onError });
  useEffect(() => {
    callbacksRef.current = { onLog, onStatus, onProgress, onComplete, onError };
  }, [onLog, onStatus, onProgress, onComplete, onError]);

  useEffect(() => {
    // jobId가 없으면 연결하지 않음
    if (!jobId) {
      setConnectionState('disconnected');
      // 기존 연결이 있으면 닫기
      if (wsRef.current) {
        console.log('[WebSocket] Closing existing connection (no jobId)');
        wsRef.current.close(1000, 'No job ID');
        wsRef.current = null;
      }
      return;
    }

    /**
     * WebSocket 연결 함수
     */
    const connect = () => {
      // 기존 연결이 있으면 닫기
      if (wsRef.current) {
        wsRef.current.close();
        wsRef.current = null;
      }

      // WebSocket URL 결정
      // 개발 환경: ws://localhost:8000
      // 프로덕션: wss://your-domain.com
      const protocol = window.location.protocol === 'https:' ? 'wss:' : 'ws:';
      const host = window.location.hostname === 'localhost' ? 'localhost:8000' : window.location.host;
      const wsUrl = `${protocol}//${host}/api/v1/ws/${jobType}/${jobId}`;

      console.log(`[WebSocket] Connecting to: ${wsUrl}`);
      setConnectionState('connecting');

      const ws = new WebSocket(wsUrl);
      wsRef.current = ws;

      /**
       * 연결 성공
       */
      ws.onopen = () => {
        console.log(`[WebSocket] Connected for job: ${jobId}`);
        setConnectionState('connected');
        reconnectAttemptsRef.current = 0;
      };

      /**
       * 메시지 수신
       */
      ws.onmessage = (event) => {
        try {
          const message: WebSocketMessage = JSON.parse(event.data);

          switch (message.type) {
            case 'connected':
              console.log('[WebSocket] Connection confirmed:', message.job_id);
              break;

            case 'log':
              if (callbacksRef.current.onLog && message.data) {
                callbacksRef.current.onLog(message.data);
              }
              break;

            case 'status':
              if (callbacksRef.current.onStatus && message.data) {
                callbacksRef.current.onStatus(message.data);
              }
              break;

            case 'progress':
              if (callbacksRef.current.onProgress && message.data) {
                callbacksRef.current.onProgress(message.data);
              }
              break;

            case 'complete':
              if (callbacksRef.current.onComplete && message.data) {
                callbacksRef.current.onComplete(message.data);
              }
              // 작업 완료 시 정상 종료 (code: 1000)
              ws.close(1000, 'Job completed');
              break;

            case 'error':
              console.error('[WebSocket] Error:', message.message);
              if (callbacksRef.current.onError) {
                callbacksRef.current.onError(message.message || 'Unknown error');
              }
              break;

            default:
              console.warn('[WebSocket] Unknown message type:', message.type);
          }
        } catch (error) {
          console.error('[WebSocket] Failed to parse message:', error);
        }
      };

      /**
       * 에러 발생
       */
      ws.onerror = (error) => {
        console.error('[WebSocket] Error:', error);
        setConnectionState('error');
      };

      /**
       * 연결 종료
       */
      ws.onclose = (event) => {
        console.log(`[WebSocket] Closed (code: ${event.code}, reason: ${event.reason})`);
        setConnectionState('disconnected');
        wsRef.current = null;

        // 재연결 시도 (정상 종료가 아니고, 재시도 횟수가 남은 경우)
        if (event.code !== 1000 && reconnectAttemptsRef.current < maxReconnectAttempts) {
          reconnectAttemptsRef.current++;
          console.log(
            `[WebSocket] Reconnecting... (${reconnectAttemptsRef.current}/${maxReconnectAttempts})`
          );

          reconnectTimeoutRef.current = setTimeout(() => {
            connect();
          }, reconnectDelay);
        } else if (reconnectAttemptsRef.current >= maxReconnectAttempts) {
          console.error('[WebSocket] Max reconnect attempts reached');
          setConnectionState('error');
        }
      };
    };

    // 연결 시작
    connect();

    // Cleanup
    return () => {
      console.log('[WebSocket] Cleanup triggered for job:', jobId);

      // 재연결 타이머 제거
      if (reconnectTimeoutRef.current) {
        clearTimeout(reconnectTimeoutRef.current);
        reconnectTimeoutRef.current = null;
      }

      // WebSocket 연결 종료
      if (wsRef.current && wsRef.current.readyState !== WebSocket.CLOSED) {
        console.log('[WebSocket] Closing connection in cleanup');
        wsRef.current.close(1000, 'Component unmounted');
        wsRef.current = null;
      }
    };
  }, [jobId, jobType]); // 콜백 함수 제거하여 불필요한 재연결 방지

  return {
    connectionState,
    reconnectAttempts: reconnectAttemptsRef.current
  };
};
