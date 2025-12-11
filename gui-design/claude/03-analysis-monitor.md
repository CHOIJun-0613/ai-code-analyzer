# CSA GUI 화면 설계서 - 분석 모니터링

**페이지**: Analysis (Analyze)
**경로**: /analyze
**사용자**: 개발자 (주로)

---

## 페이지 개요

분석 실행 및 진행 상황을 모니터링하는 페이지입니다. 3단계로 구성됩니다:
1. 프로젝트 선택/생성
2. 분석 옵션 설정
3. 실시간 모니터링 및 결과 확인

---

## 레이아웃

```
┌──────────────────────────────────────────────────────┐
│ Analyze                                  🔄  ⏸️  ❌ │
├──────────────────────────────────────────────────────┤
│                                                      │
│ Step 1: Select Project                             │
│ [car-center-dev] ▼  [+ New Project]                │
│                                                      │
│ Step 2: Configure Analysis                         │
│ ☑️ Analyze Java Sources                             │
│ ☑️ Analyze Database Schema                          │
│ ☑️ Clean Previous Data                              │
│ ☐ Use AI Enrichment                                 │
│ ☐ Save Streaming Mode                              │
│                                                      │
│ Advanced Options ▼                                  │
│ ┌────────────────────────────────────────────────┐ │
│ │ Parallel Workers: [8]                          │ │
│ │ Batch Size: [50]                               │ │
│ │ File Timeout: [60] sec                         │ │
│ └────────────────────────────────────────────────┘ │
│                                                      │
│ [← Back]  [Start Analysis]                         │
│                                                      │
├──────────────────────────────────────────────────────┤
│                                                      │
│ ANALYSIS IN PROGRESS (34:05)                       │
│                                                      │
│ Overall Progress:                                   │
│ ████████████░░░░░░░░ 60%  (4000/6686 files)        │
│                                                      │
│ Current File: UserController.java (156 KB)         │
│ File Progress: ██████░░░░ 60%                      │
│                                                      │
│ Statistics:                                         │
│ • Parse Speed: 2.0 files/sec                       │
│ • ETA: 22 minutes                                  │
│ • Memory: 1321 MB                                  │
│ • Errors: 0                                        │
│                                                      │
│ ┌──────────────────────────────────────────────┐  │
│ │ 📋 Log Output                          [×]   │  │
│ ├──────────────────────────────────────────────┤  │
│ │                                              │  │
│ │ [12:31] ✓ Package 배치 생성 완료 (0.5초)     │  │
│ │ [12:34] 🔄 파싱 시작...                      │  │
│ │ [12:35] ✓ 배치 저장 완료 (50개 클래스)       │  │
│ │ [12:36] 🔄 파싱 진행중 [100/6686] (1%)      │  │
│ │ [12:41] 🔄 배치 저장 중 (50개 클래스)        │  │
│ │ [12:42] ✓ 배치 저장 완료 (1.2초)            │  │
│ │ ...                                         │  │
│ │ [13:25] 🔄 파싱 진행중 [4000/6686] (60%)    │  │
│ │                                              │  │
│ │ [Auto-scroll] [Copy All] [Clear] [Export]   │  │
│ │                                              │  │
│ └──────────────────────────────────────────────┘  │
│                                                      │
│ [Cancel Analysis]  [Open Results]                  │
│                                                      │
└──────────────────────────────────────────────────────┘
```

---

## 섹션 상세 설계

### Step 1: 프로젝트 선택

```html
<ProjectSelector>
  <Label>프로젝트 선택</Label>

  <Select
    v-model="selectedProject"
    placeholder="프로젝트를 선택하세요"
    allowClear
  >
    <Option value="car-center-dev">car-center-devlab</Option>
    <Option value="payment-svc">payment-service</Option>
    <Option value="user-svc">user-service</Option>
  </Select>

  <Button type="dashed" icon="plus" @click="showCreateModal">
    New Project
  </Button>

  <ProjectInfo v-if="selectedProject">
    <p>Path: {{ projectPath }}</p>
    <p>Last Analyzed: {{ lastAnalyzedDate }}</p>
  </ProjectInfo>
</ProjectSelector>
```

### Step 2: 분석 옵션

```html
<AnalysisOptions>
  <Checkbox v-model="options.analyzeJava">
    Analyze Java Sources
  </Checkbox>

  <Checkbox v-model="options.analyzeDb">
    Analyze Database Schema
  </Checkbox>

  <Checkbox v-model="options.cleanPrevious" default>
    Clean Previous Data (권장)
  </Checkbox>

  <Checkbox v-model="options.useAi">
    Use AI Enrichment (느림, ~2배 시간)
  </Checkbox>

  <Checkbox v-model="options.useStreaming">
    Use Streaming Mode (대규모 프로젝트)
  </Checkbox>

  <Collapse title="Advanced Options">
    <Row :gutter="16">
      <Col :span="12">
        <InputNumber
          v-model="options.workers"
          label="Parallel Workers"
          min="1"
          max="16"
        />
      </Col>
      <Col :span="12">
        <InputNumber
          v-model="options.batchSize"
          label="Batch Size"
          min="20"
          max="200"
        />
      </Col>
    </Row>

    <Row :gutter="16">
      <Col :span="12">
        <InputNumber
          v-model="options.timeout"
          label="File Timeout (sec)"
          min="30"
          max="600"
        />
      </Col>
      <Col :span="12">
        <InputNumber
          v-model="options.complexity"
          label="Complexity Threshold"
          min="10000"
        />
      </Col>
    </Row>
  </Collapse>
</AnalysisOptions>
```

### Step 3: 실시간 모니터링

#### 진행률 표시

```html
<ProgressSection>
  <!-- 전체 진행률 -->
  <div class="progress-container">
    <h3>Overall Progress</h3>
    <Progress
      type="circle"
      :percent="overallPercent"
      :width="120"
      :strokeColor="getProgressColor(overallPercent)"
    />
    <p class="progress-text">{{ currentFiles }}/{{ totalFiles }} files</p>
    <p class="progress-subtext">{{ elapsedTime }} elapsed</p>
  </div>

  <!-- 현재 파일 진행률 -->
  <div class="current-file">
    <p class="file-name">📄 {{ currentFileName }}</p>
    <p class="file-size">{{ currentFileSize }} KB</p>
    <Progress :percent="filePercent" />
  </div>

  <!-- 통계 -->
  <Row :gutter="16" class="statistics">
    <Statistic
      title="Parse Speed"
      :value="`${filesPerSec} files/sec`"
    />
    <Statistic
      title="ETA"
      :value="`${etaMinutes} min`"
    />
    <Statistic
      title="Memory"
      :value="`${memoryMb} MB`"
      :valueStyle="getMemoryColor(memoryMb)"
    />
    <Statistic
      title="Errors"
      :value="errorCount"
      :valueStyle="errorCount > 0 ? { color: '#f5222d' } : {}"
    />
  </Row>
</ProgressSection>
```

#### 로그 출력

```html
<LogViewer
  v-model:logs="logs"
  :height="300"
  :autoScroll="autoScroll"
>
  <template #header>
    <Checkbox v-model="autoScroll">Auto-scroll</Checkbox>
    <Button size="small" @click="copyLogs">Copy All</Button>
    <Button size="small" @click="clearLogs">Clear</Button>
    <Button size="small" @click="exportLogs">Export</Button>
  </template>

  <template #log="{ log }">
    <div :class="`log-${log.level}`">
      <span class="log-time">{{ log.timestamp }}</span>
      <span class="log-level">{{ log.level }}</span>
      <span class="log-message">{{ log.message }}</span>
    </div>
  </template>
</LogViewer>
```

---

## WebSocket 메시지 처리

### 메시지 타입

```typescript
interface ProgressMessage {
  type: 'progress'
  data: {
    percentage: number
    current: number
    total: number
    currentFile: string
    fileSize: number
    filesPerSec: number
    etaMinutes: number
    memoryMb: number
  }
}

interface LogMessage {
  type: 'log'
  level: 'INFO' | 'WARNING' | 'ERROR' | 'DEBUG'
  timestamp: string
  message: string
}

interface ErrorMessage {
  type: 'error'
  errorCount: number
  timeoutCount: number
  lastError: string
}

interface CompleteMessage {
  type: 'complete'
  data: {
    duration: number
    statistics: {
      classes: number
      methods: number
      beans: number
      endpoints: number
      tables: number
    }
    status: 'success' | 'partial' | 'failed'
  }
}
```

### WebSocket 연결

```javascript
// Vue 컴포넌트
const ws = ref(null)

const startAnalysis = () => {
  ws.value = new WebSocket(
    `ws://localhost:8000/ws/analysis/${selectedProject.value}`
  )

  ws.value.onmessage = (event) => {
    const message = JSON.parse(event.data)
    handleMessage(message)
  }

  ws.value.onerror = (error) => {
    console.error('WebSocket error:', error)
    // 오류 처리
  }

  ws.value.onclose = () => {
    console.log('WebSocket closed')
  }
}

const handleMessage = (message) => {
  switch (message.type) {
    case 'progress':
      updateProgress(message.data)
      break
    case 'log':
      addLog(message)
      break
    case 'error':
      updateErrors(message)
      break
    case 'complete':
      analysisComplete(message.data)
      break
  }
}
```

---

## 컨트롤 버튼

### 분석 중

```html
<Button type="primary" danger @click="cancelAnalysis">
  Cancel Analysis
</Button>

<Button @click="pauseAnalysis" disabled>
  Pause (추후 지원)
</Button>

<Tooltip title="분석 완료 후 결과 페이지로 이동">
  <Button disabled>
    Open Results (완료 시 활성화)
  </Button>
</Tooltip>
```

### 분석 완료 후

```html
<Button type="primary" @click="openResults">
  View Results
</Button>

<Button @click="openGraph">
  View Graph
</Button>

<Button @click="downloadReport">
  Download Report
</Button>

<Button @click="startNewAnalysis">
  Analyze Another Project
</Button>
```

---

## 데이터 구조

```typescript
interface AnalysisOptions {
  analyzeJava: boolean
  analyzeDb: boolean
  cleanPrevious: boolean
  useAi: boolean
  useStreaming: boolean

  // Advanced
  workers: number
  batchSize: number
  timeout: number
  complexity: number
}

interface AnalysisState {
  status: 'idle' | 'running' | 'paused' | 'completed' | 'failed'
  overallPercent: number
  currentFiles: number
  totalFiles: number
  currentFile: string
  currentFileSize: number

  filesPerSec: number
  etaMinutes: number
  memoryMb: number
  errorCount: number

  startTime: Date
  elapsedTime: string

  logs: LogEntry[]
}

interface LogEntry {
  timestamp: string
  level: 'INFO' | 'WARNING' | 'ERROR' | 'DEBUG'
  message: string
  icon?: string
}
```

---

## Vue 컴포넌트 예시

```vue
<template>
  <div class="analysis-page">
    <div v-if="!isRunning" class="setup-section">
      <!-- Step 1, 2, 3 -->
    </div>

    <div v-else class="monitoring-section">
      <ProgressSection
        :statistics="statistics"
        :logs="logs"
      />
      <div class="controls">
        <Button type="primary" danger @click="cancelAnalysis">
          Cancel Analysis
        </Button>
        <Button
          v-if="isCompleted"
          type="primary"
          @click="openResults"
        >
          View Results
        </Button>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, onBeforeUnmount, computed } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()
const selectedProject = ref('')
const options = ref({
  analyzeJava: true,
  analyzeDb: true,
  cleanPrevious: true,
  useAi: false,
  useStreaming: false,
  workers: 8,
  batchSize: 50,
  timeout: 60,
  complexity: 50000,
})

const isRunning = ref(false)
const isCompleted = ref(false)
const logs = ref([])
const statistics = ref(null)
const ws = ref(null)

const startAnalysis = () => {
  isRunning.value = true

  // WebSocket 연결
  ws.value = new WebSocket(
    `ws://localhost:8000/ws/analysis/${selectedProject.value}`
  )

  ws.value.onmessage = (event) => {
    const message = JSON.parse(event.data)
    handleMessage(message)
  }
}

const handleMessage = (message) => {
  switch (message.type) {
    case 'progress':
      statistics.value = message.data
      break
    case 'log':
      logs.value.push(message)
      break
    case 'complete':
      isCompleted.value = true
      isRunning.value = false
      break
  }
}

const cancelAnalysis = () => {
  if (ws.value) {
    ws.value.close()
  }
  isRunning.value = false
  // POST /api/analysis/{id}/cancel
}

const openResults = () => {
  router.push({
    name: 'Results',
    params: { projectId: selectedProject.value }
  })
}

onBeforeUnmount(() => {
  if (ws.value) {
    ws.value.close()
  }
})
</script>

<style scoped>
.progress-text {
  text-align: center;
  font-size: 14px;
  margin-top: 8px;
}

.log-entry {
  padding: 4px 0;
  font-family: monospace;
  font-size: 12px;
  line-height: 1.5;
}

.log-INFO { color: #1890ff; }
.log-WARNING { color: #faad14; }
.log-ERROR { color: #f5222d; }
.log-DEBUG { color: #722ed1; }
</style>
```

---

## 다음 문서

- `04-graph-viewer.md`: 그래프 시각화 화면 설계
