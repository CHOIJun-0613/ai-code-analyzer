import { setup, assign } from 'xstate';

/**
 * AI Analysis State Machine Context
 * AI 분석 작업의 상태와 데이터를 관리하는 컨텍스트
 */
export interface AiAnalysisMachineContext {
  jobId: string;
  status: string;
  logs: string[];
  error?: string;
  result?: any;
}

/**
 * AI Analysis State Machine Events
 * AI 분석 작업에서 발생할 수 있는 이벤트들
 */
export type AiAnalysisMachineEvents =
  | { type: 'START'; jobId: string }
  | { type: 'LOG'; log: string }
  | { type: 'STATUS_UPDATE'; status: string }
  | { type: 'COMPLETE'; result?: any }
  | { type: 'FAIL'; error: string }
  | { type: 'CANCEL' }
  | { type: 'RESET' }
  | { type: 'RETRY' };

/**
 * AI Analysis State Machine
 *
 * 상태 다이어그램:
 *
 *   [idle] ──START──> [pending] ──STATUS_UPDATE──> [running]
 *                                                      │
 *                                    ┌─────────────────┼─────────────────┐
 *                                    │                 │                 │
 *                                COMPLETE            FAIL             CANCEL
 *                                    │                 │                 │
 *                                    ▼                 ▼                 ▼
 *                              [completed]        [failed]        [cancelling] ──> [cancelled]
 *                                    │                 │                              │
 *                                    └─────────RESET───┴──────────────────────────────┘
 *                                                      │
 *                                                      ▼
 *                                                   [idle]
 *
 * 주요 특징:
 * - AI enrichment 작업의 상태 전환을 명확하게 정의
 * - 불가능한 상태 전환 방지 (예: completed에서 running으로 직접 전환 불가)
 * - Context를 통한 데이터 관리
 * - 타입 안전성 보장
 */
export const aiAnalysisMachine = setup({
  types: {
    context: {} as AiAnalysisMachineContext,
    events: {} as AiAnalysisMachineEvents,
  },
  actions: {
    // jobId 설정
    setJobId: assign({
      jobId: ({ event }) => {
        if (event.type === 'START') {
          return event.jobId;
        }
        return '';
      },
    }),
    // 로그 추가
    appendLog: assign({
      logs: ({ context, event }) => {
        if (event.type === 'LOG') {
          return [...context.logs, event.log];
        }
        return context.logs;
      },
    }),
    // 상태 업데이트
    updateStatus: assign({
      status: ({ event }) => {
        if (event.type === 'STATUS_UPDATE') {
          return event.status;
        }
        return '';
      },
    }),
    // 완료 결과 저장
    saveResult: assign({
      result: ({ event }) => {
        if (event.type === 'COMPLETE') {
          return event.result;
        }
        return undefined;
      },
    }),
    // 에러 저장
    saveError: assign({
      error: ({ event }) => {
        if (event.type === 'FAIL') {
          return event.error;
        }
        return undefined;
      },
    }),
    // 컨텍스트 초기화
    resetContext: assign({
      jobId: '',
      status: '',
      logs: [],
      error: undefined,
      result: undefined,
    }),
  },
}).createMachine({
  id: 'aiAnalysis',
  initial: 'idle',
  context: {
    jobId: '',
    status: '',
    logs: [],
    error: undefined,
    result: undefined,
  },
  states: {
    // 초기 상태 (AI 분석 없음)
    idle: {
      on: {
        START: {
          target: 'pending',
          actions: ['setJobId'],
        },
      },
    },
    // AI 분석 시작 준비 중
    pending: {
      on: {
        LOG: {
          actions: ['appendLog'],
        },
        STATUS_UPDATE: [
          {
            guard: ({ event }) => event.status === 'running',
            target: 'running',
            actions: ['updateStatus'],
          },
          {
            actions: ['updateStatus'],
          },
        ],
        FAIL: {
          target: 'failed',
          actions: ['saveError'],
        },
        CANCEL: {
          target: 'cancelling',
        },
      },
    },
    // AI 분석 실행 중
    running: {
      on: {
        LOG: {
          actions: ['appendLog'],
        },
        STATUS_UPDATE: {
          actions: ['updateStatus'],
        },
        COMPLETE: {
          target: 'completed',
          actions: ['saveResult'],
        },
        FAIL: {
          target: 'failed',
          actions: ['saveError'],
        },
        CANCEL: {
          target: 'cancelling',
        },
      },
    },
    // AI 분석 취소 중
    cancelling: {
      on: {
        LOG: {
          actions: ['appendLog'],
        },
        STATUS_UPDATE: [
          {
            guard: ({ event }) => event.status === 'cancelled' || event.status === 'canceled',
            target: 'cancelled',
            actions: ['updateStatus'],
          },
          {
            actions: ['updateStatus'],
          },
        ],
        COMPLETE: {
          target: 'cancelled',
        },
        FAIL: {
          target: 'cancelled',
        },
      },
    },
    // AI 분석 완료
    completed: {
      on: {
        RESET: {
          target: 'idle',
          actions: ['resetContext'],
        },
      },
    },
    // AI 분석 실패
    failed: {
      on: {
        RETRY: {
          target: 'pending',
        },
        RESET: {
          target: 'idle',
          actions: ['resetContext'],
        },
      },
    },
    // AI 분석 취소됨
    cancelled: {
      on: {
        RESET: {
          target: 'idle',
          actions: ['resetContext'],
        },
      },
    },
  },
});
