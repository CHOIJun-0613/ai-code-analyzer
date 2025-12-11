# CSA GUI 화면 설계서 - 설정 관리

**페이지**: Configuration (Config)
**경로**: /config
**사용자**: 관리자, 고급 사용자

---

## 페이지 개요

.env 파일 및 시스템 설정을 GUI로 관리합니다.

---

## 레이아웃

```
┌────────────────────────────────────────────────┐
│ Configuration                               [●] │
├────────────────────────────────────────────────┤
│                                                │
│ [Database]  [Analysis]  [Analysis Options]    │
│ [AI]  [Output]  [Advanced]                    │
│                                                │
├────────────────────────────────────────────────┤
│                                                │
│ DATABASE SETTINGS                              │
│                                                │
│ Neo4j Connection                               │
│ ├─ URI: [neo4j://127.0.0.1:7687] 🔄          │
│ ├─ User: [csauser]                            │
│ ├─ Password: [••••••••] 👁️                     │
│ ├─ Database: [csadb01]                        │
│ ├─ Pool Size: [10]                            │
│ └─ [Test Connection] [Status: ✓ Connected]    │
│                                                │
│ ANALYSIS SETTINGS                              │
│                                                │
│ Java Source Folder:                           │
│ [/path/to/source] [📁]  [Reset]              │
│                                                │
│ DB Script Folder:                             │
│ [/path/to/db/schema] [📁]  [Reset]           │
│                                                │
│ Output Directories:                           │
│ ├─ Sequence Diagrams: [output/sequence] [📁]  │
│ ├─ CRUD Matrix: [output/crud-matrix] [📁]     │
│ ├─ Class Spec: [output/class-spec] [📁]       │
│ └─ Impact Analysis: [output/impact] [📁]      │
│                                                │
│ AI SETTINGS                                    │
│                                                │
│ AI Provider: [lmstudio ▼]                    │
│ Concurrent Requests: [15]                     │
│ Status: ⚠️ Not Connected                       │
│ [Test Connection]                             │
│                                                │
│ ┌──────────────────────────────────────────┐  │
│ │ [Reset to Defaults]  [Save]  [Cancel]     │  │
│ └──────────────────────────────────────────┘  │
│                                                │
└────────────────────────────────────────────────┘
```

---

## 탭별 상세 설계

### 1. Database Tab

```html
<DatabaseTab>
  <Section title="Neo4j Connection">
    <FormItem label="URI" required>
      <Input
        v-model="config.neo4j.uri"
        placeholder="neo4j://127.0.0.1:7687"
        suffix="🔄"
        @click:suffix="testConnection"
      />
      <ConnectionStatus :status="neo4jStatus" />
    </FormItem>

    <FormItem label="User" required>
      <Input v-model="config.neo4j.user" />
    </FormItem>

    <FormItem label="Password" required>
      <InputPassword v-model="config.neo4j.password" />
    </FormItem>

    <FormItem label="Database" required>
      <Input v-model="config.neo4j.database" />
    </FormItem>

    <FormItem label="Pool Size">
      <InputNumber
        v-model="config.neo4j.poolSize"
        :min="1"
        :max="50"
      />
      <small>동시 연결 수</small>
    </FormItem>

    <FormItem>
      <Button type="primary" @click="testConnection">
        Test Connection
      </Button>
    </FormItem>
  </Section>
</DatabaseTab>
```

### 2. Analysis Settings Tab

```html
<AnalysisSettingsTab>
  <Section title="Folders">
    <FormItem label="Java Source Folder" required>
      <Input
        v-model="config.analysis.javaSourceFolder"
        placeholder="/path/to/java/src"
        readOnly
      />
      <Button icon="folder" @click="selectFolder('java')">
        Browse
      </Button>
      <Button type="dashed" @click="resetFolder('java')">
        Reset
      </Button>
    </FormItem>

    <FormItem label="DB Script Folder" required>
      <Input
        v-model="config.analysis.dbScriptFolder"
        placeholder="/path/to/db/scripts"
        readOnly
      />
      <Button icon="folder" @click="selectFolder('db')">
        Browse
      </Button>
      <Button type="dashed" @click="resetFolder('db')">
        Reset
      </Button>
    </FormItem>
  </Section>

  <Section title="Output Directories">
    <FormItem label="Sequence Diagrams">
      <Input v-model="config.output.sequenceDiagram" />
    </FormItem>

    <FormItem label="CRUD Matrix">
      <Input v-model="config.output.crudMatrix" />
    </FormItem>

    <FormItem label="Class Spec">
      <Input v-model="config.output.classSpec" />
    </FormItem>

    <FormItem label="Impact Analysis">
      <Input v-model="config.output.impactAnalysis" />
    </FormItem>
  </Section>
</AnalysisSettingsTab>
```

### 3. Analysis Options Tab

```html
<AnalysisOptionsTab>
  <Section title="Performance">
    <FormItem label="Parallel Workers">
      <InputNumber
        v-model="config.performance.workers"
        :min="1"
        :max="16"
      />
      <small>CPU 활용, CPU 코어: {{ cpuCores }}</small>
    </FormItem>

    <FormItem label="Batch Size">
      <InputNumber
        v-model="config.performance.batchSize"
        :min="20"
        :max="200"
      />
    </FormItem>

    <FormItem label="File Parse Timeout (sec)">
      <InputNumber
        v-model="config.performance.timeout"
        :min="30"
        :max="600"
      />
    </FormItem>

    <FormItem label="Complexity Threshold">
      <InputNumber v-model="config.performance.complexity" />
      <small>초과 파일 분석 제외</small>
    </FormItem>
  </Section>

  <Section title="Optimization">
    <Checkbox v-model="config.optimization.skipDtoSource">
      Skip DTO Source (메모리 절감)
    </Checkbox>

    <Checkbox v-model="config.optimization.skipDtoMethods">
      Skip DTO Methods Analysis
    </Checkbox>

    <Checkbox v-model="config.optimization.useStreaming">
      Use Streaming Mode (대규모 프로젝트)
    </Checkbox>
  </Section>
</AnalysisOptionsTab>
```

### 4. AI Settings Tab

```html
<AISettingsTab>
  <Section title="AI Provider">
    <FormItem label="Provider" required>
      <Select
        v-model="config.ai.provider"
        placeholder="AI 제공자 선택"
      >
        <Option value="lmstudio">LM Studio (Local)</Option>
        <Option value="openai">OpenAI (Cloud)</Option>
        <Option value="google">Google Gemini (Cloud)</Option>
        <Option value="groq">Groq (Cloud)</Option>
      </Select>
    </FormItem>

    <FormItem
      v-if="config.ai.provider === 'openai'"
      label="OpenAI API Key"
      required
    >
      <InputPassword v-model="config.ai.openaiKey" />
    </FormItem>

    <FormItem
      v-if="config.ai.provider === 'google'"
      label="Google API Key"
      required
    >
      <InputPassword v-model="config.ai.googleKey" />
    </FormItem>

    <FormItem
      v-if="config.ai.provider === 'lmstudio'"
      label="LM Studio URL"
    >
      <Input
        v-model="config.ai.lmstudioUrl"
        placeholder="http://localhost:1234"
      />
    </FormItem>

    <FormItem>
      <Button @click="testAiConnection">
        Test Connection
      </Button>
      <AIConnectionStatus :status="aiStatus" />
    </FormItem>
  </Section>

  <Section title="AI Analysis">
    <FormItem label="Concurrent Requests">
      <InputNumber
        v-model="config.ai.concurrent"
        :min="1"
        :max="50"
      />
      <small>로컬: 10-20, 클라우드: 5-10</small>
    </FormItem>

    <Checkbox v-model="config.ai.useAiByDefault">
      Use AI Analysis by Default
    </Checkbox>
  </Section>
</AISettingsTab>
```

### 5. Output Tab

```html
<OutputTab>
  <Section title="Logging">
    <FormItem label="Log Level">
      <Select v-model="config.logging.level">
        <Option value="DEBUG">Debug</Option>
        <Option value="INFO">Info</Option>
        <Option value="WARNING">Warning</Option>
        <Option value="ERROR">Error</Option>
      </Select>
    </FormItem>

    <FormItem label="Log Directory">
      <Input v-model="config.logging.directory" />
    </FormItem>

    <Checkbox v-model="config.logging.saveToFile">
      Save Logs to File
    </Checkbox>
  </Section>

  <Section title="Export Options">
    <Checkbox v-model="config.export.includeJson">
      Export as JSON
    </Checkbox>

    <Checkbox v-model="config.export.includeExcel">
      Export as Excel
    </Checkbox>

    <Checkbox v-model="config.export.includeMermaid">
      Generate Mermaid Diagrams
    </Checkbox>

    <Checkbox v-model="config.export.includePlantUml">
      Generate PlantUML Diagrams
    </Checkbox>
  </Section>
</OutputTab>
```

### 6. Advanced Tab

```html
<AdvancedTab>
  <Alert
    message="Advanced settings을 변경할 때 주의하세요!"
    type="warning"
    showIcon
  />

  <Section title="Network">
    <FormItem label="HTTP Timeout (sec)">
      <InputNumber v-model="config.advanced.httpTimeout" />
    </FormItem>

    <FormItem label="Retry Attempts">
      <InputNumber v-model="config.advanced.retries" />
    </FormItem>
  </Section>

  <Section title="Memory Management">
    <Checkbox v-model="config.advanced.enableGcCollection">
      Enable GC Collection after Batch Save
    </Checkbox>

    <FormItem label="Max Memory (MB)">
      <InputNumber v-model="config.advanced.maxMemory" />
    </FormItem>
  </Section>

  <Section title="Debugging">
    <Checkbox v-model="config.advanced.dryRun">
      Dry Run (파싱만, Neo4j 저장 안 함)
    </Checkbox>

    <Checkbox v-model="config.advanced.verbose">
      Verbose Logging
    </Checkbox>
  </Section>

  <Button
    danger
    @click="resetToDefaults"
  >
    Reset All to Defaults
  </Button>
</AdvancedTab>
```

---

## 컨트롤 버튼

```html
<div class="form-footer">
  <Button @click="discardChanges">Cancel</Button>
  <Button type="primary" @click="saveConfig">
    Save Configuration
  </Button>
  <Button type="dashed" @click="exportConfig">
    Export as .env
  </Button>
  <Button type="dashed" @click="importConfig">
    Import from .env
  </Button>
</div>
```

---

## 데이터 구조

```typescript
interface Configuration {
  neo4j: {
    uri: string
    user: string
    password: string
    database: string
    poolSize: number
  }

  analysis: {
    javaSourceFolder: string
    dbScriptFolder: string
  }

  output: {
    sequenceDiagram: string
    crudMatrix: string
    classSpec: string
    impactAnalysis: string
  }

  performance: {
    workers: number
    batchSize: number
    timeout: number
    complexity: number
  }

  optimization: {
    skipDtoSource: boolean
    skipDtoMethods: boolean
    useStreaming: boolean
  }

  ai: {
    provider: 'lmstudio' | 'openai' | 'google' | 'groq'
    concurrent: number
    useAiByDefault: boolean
    openaiKey?: string
    googleKey?: string
    lmstudioUrl?: string
  }

  logging: {
    level: 'DEBUG' | 'INFO' | 'WARNING' | 'ERROR'
    directory: string
    saveToFile: boolean
  }

  export: {
    includeJson: boolean
    includeExcel: boolean
    includeMermaid: boolean
    includePlantUml: boolean
  }

  advanced: {
    httpTimeout: number
    retries: number
    enableGcCollection: boolean
    maxMemory: number
    dryRun: boolean
    verbose: boolean
  }
}
```

---

## Vue 컴포넌트

```vue
<template>
  <div class="configuration-page">
    <Tabs v-model:activeKey="activeTab">
      <TabPane key="database" tab="Database">
        <DatabaseTab
          :config="config"
          @update:config="config = $event"
        />
      </TabPane>
      <!-- 다른 탭들 -->
    </Tabs>

    <div class="form-footer">
      <Button @click="resetChanges">Cancel</Button>
      <Button type="primary" @click="saveConfig">Save</Button>
      <Button @click="exportConfig">Export</Button>
      <Button @click="importConfig">Import</Button>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import { message } from 'ant-design-vue'

const activeTab = ref('database')
const config = ref({
  // 기본 설정
})

const saveConfig = async () => {
  try {
    await fetch('/api/config', {
      method: 'PUT',
      body: JSON.stringify(config.value)
    })
    message.success('Configuration saved successfully')
  } catch (error) {
    message.error('Failed to save configuration')
  }
}

const exportConfig = () => {
  // .env 파일로 다운로드
}

const importConfig = () => {
  // .env 파일 업로드
}
</script>
```

---

## 다음 문서

- `08-components.md`: 공통 컴포넌트 설계
