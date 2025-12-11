# CSA GUI 화면 설계서 - 공통 컴포넌트

**문서**: 재사용 가능한 Vue 컴포넌트 설계
**작성일**: 2025-11-07

---

## 목차

1. [레이아웃 컴포넌트](#레이아웃-컴포넌트)
2. [폼 컴포넌트](#폼-컴포넌트)
3. [데이터 표시 컴포넌트](#데이터-표시-컴포넌트)
4. [피드백 컴포넌트](#피드백-컴포넌트)
5. [커스텀 컴포넌트](#커스텀-컴포넌트)

---

## 레이아웃 컴포넌트

### Header

```vue
<template>
  <header class="app-header">
    <div class="header-left">
      <Button type="text" icon="menu" @click="toggleSidebar" />
      <Breadcrumb :routes="breadcrumbs" />
    </div>

    <div class="header-center">
      <Title level="2">{{ pageTitle }}</Title>
    </div>

    <div class="header-right">
      <Button
        type="text"
        icon="notification"
        :badge="{ count: notificationCount }"
      />
      <Button
        type="text"
        icon="theme"
        @click="toggleTheme"
      />
      <Dropdown>
        <Avatar />
        <template #overlay>
          <Menu>
            <MenuItem @click="goToProfile">My Profile</MenuItem>
            <MenuItem @click="logout">Logout</MenuItem>
          </Menu>
        </template>
      </Dropdown>
    </div>
  </header>
</template>

<script setup>
import { ref } from 'vue'

const props = defineProps({
  title: String,
  breadcrumbs: Array,
  notificationCount: { type: Number, default: 0 }
})

const emit = defineEmits(['toggle-sidebar', 'toggle-theme'])
</script>

<style scoped>
.app-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 24px;
  background: white;
  border-bottom: 1px solid #f0f0f0;
  height: 64px;
}
</style>
```

### Sidebar

```vue
<template>
  <aside :class="['sidebar', { collapsed: isCollapsed }]">
    <div class="logo">
      <img src="@/assets/logo.svg" alt="CSA" />
      <span v-if="!isCollapsed">CSA</span>
    </div>

    <nav>
      <NavItem
        v-for="item in navItems"
        :key="item.path"
        :item="item"
        :active="currentPath === item.path"
        @click="navigate(item.path)"
      />
    </nav>

    <div class="sidebar-footer">
      <Button type="text" block @click="goToHelp">
        <span icon="question-circle">Help</span>
      </Button>
    </div>
  </aside>
</template>

<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'

const router = useRouter()
const isCollapsed = ref(false)

const navItems = [
  { path: '/', label: 'Home', icon: 'home' },
  { path: '/analyze', label: 'Analyze', icon: 'search' },
  { path: '/graph', label: 'Graph', icon: 'share-alt' },
  { path: '/results', label: 'Results', icon: 'bar-chart' },
  { path: '/impact', label: 'Impact', icon: 'heat-map' },
  { path: '/config', label: 'Config', icon: 'setting' }
]

const navigate = (path) => {
  router.push(path)
}
</script>

<style scoped>
.sidebar {
  width: 240px;
  background: #001529;
  color: white;
  display: flex;
  flex-direction: column;
  transition: width 0.3s;
}

.sidebar.collapsed {
  width: 60px;
}
</style>
```

---

## 폼 컴포넌트

### ConfigInput

설정 입력 필드 래퍼:

```vue
<template>
  <div class="config-input">
    <Label :required="required">{{ label }}</Label>
    <Input
      v-model="value"
      :placeholder="placeholder"
      :disabled="disabled"
      :status="status"
    />
    <small v-if="help" class="help-text">{{ help }}</small>
    <div v-if="status === 'error'" class="error-message">
      {{ error }}
    </div>
  </div>
</template>

<script setup>
import { computed } from 'vue'

const props = defineProps({
  modelValue: String,
  label: String,
  placeholder: String,
  help: String,
  error: String,
  disabled: Boolean,
  required: Boolean,
  type: { type: String, default: 'text' }
})

const emit = defineEmits(['update:modelValue'])

const value = computed({
  get: () => props.modelValue,
  set: (val) => emit('update:modelValue', val)
})

const status = computed(() => {
  return props.error ? 'error' : ''
})
</script>
```

### FileInput

파일 선택 컴포넌트:

```vue
<template>
  <div class="file-input">
    <Input
      v-model="displayPath"
      :placeholder="placeholder"
      readOnly
      suffix="📁"
    />
    <Button @click="openFileDialog">Browse</Button>

    <input
      ref="fileInput"
      type="file"
      :webkitdirectory="isDirectory"
      @change="handleFileSelect"
      hidden
    />
  </div>
</template>

<script setup>
import { ref } from 'vue'

const props = defineProps({
  modelValue: String,
  placeholder: String,
  isDirectory: Boolean
})

const emit = defineEmits(['update:modelValue'])

const fileInput = ref(null)
const displayPath = ref(props.modelValue)

const openFileDialog = () => {
  fileInput.value.click()
}

const handleFileSelect = (event) => {
  const files = event.target.files
  if (files.length > 0) {
    const path = files[0].webkitRelativePath || files[0].name
    displayPath.value = path
    emit('update:modelValue', path)
  }
}
</script>
```

---

## 데이터 표시 컴포넌트

### StatisticCard

통계 카드:

```vue
<template>
  <Card class="statistic-card">
    <div class="statistic-content">
      <div class="statistic-title">{{ title }}</div>
      <div class="statistic-value" :style="valueStyle">
        {{ value }}
      </div>
      <div v-if="change" class="statistic-change" :class="changeType">
        <Icon :type="changeType === 'up' ? 'arrow-up' : 'arrow-down'" />
        {{ Math.abs(change) }}
      </div>
    </div>

    <div v-if="$slots.footer" class="statistic-footer">
      <slot name="footer" />
    </div>
  </Card>
</template>

<script setup>
defineProps({
  title: String,
  value: [String, Number],
  valueStyle: Object,
  change: Number,
  changeType: { type: String, enum: ['up', 'down'] }
})
</script>

<style scoped>
.statistic-card {
  text-align: center;
}

.statistic-value {
  font-size: 32px;
  font-weight: bold;
  margin: 8px 0;
}

.statistic-change.up {
  color: #52c41a;
}

.statistic-change.down {
  color: #f5222d;
}
</style>
```

### ProjectCard

프로젝트 카드:

```vue
<template>
  <Card
    :hoverable="true"
    class="project-card"
    @click="$emit('open')"
  >
    <template #cover>
      <div class="card-cover">
        <div class="project-icon">📁</div>
        <Button
          type="text"
          icon="star"
          :class="{ filled: isFavorite }"
          @click.stop="$emit('toggle-favorite')"
        />
      </div>
    </template>

    <Card.Meta
      :title="project.name"
      :description="project.path"
    />

    <div class="project-stats">
      <StatItem icon="📦" label="Classes" :value="project.classes" />
      <StatItem icon="⚙️" label="Methods" :value="project.methods" />
      <StatItem icon="🔗" label="Beans" :value="project.beans" />
    </div>

    <div class="project-footer">
      <small>Last: {{ formatDate(project.lastAnalyzed) }}</small>
      <Dropdown>
        <Button type="text" icon="more" />
        <template #overlay>
          <Menu>
            <MenuItem @click.stop="$emit('open')">Open</MenuItem>
            <MenuItem @click.stop="$emit('reanalyze')">Re-Analyze</MenuItem>
            <MenuItem danger @click.stop="$emit('delete')">Delete</MenuItem>
          </Menu>
        </template>
      </Dropdown>
    </div>
  </Card>
</template>

<script setup>
import { ref } from 'vue'

const props = defineProps({
  project: {
    type: Object,
    required: true
  }
})

const emit = defineEmits(['open', 'toggle-favorite', 'reanalyze', 'delete'])

const isFavorite = ref(props.project.isFavorite)

const formatDate = (date) => {
  return new Date(date).toLocaleDateString('ko-KR')
}
</script>

<style scoped>
.project-card {
  width: 100%;
  max-width: 300px;
}

.card-cover {
  position: relative;
  height: 100px;
  background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
  display: flex;
  align-items: center;
  justify-content: center;
}

.project-icon {
  font-size: 48px;
}

.project-stats {
  display: flex;
  justify-content: space-between;
  margin: 12px 0;
  padding: 12px 0;
  border-top: 1px solid #f0f0f0;
}
</style>
```

---

## 피드백 컴포넌트

### ProgressIndicator

진행률 표시:

```vue
<template>
  <div class="progress-indicator">
    <div class="progress-header">
      <span class="progress-label">{{ label }}</span>
      <span class="progress-percent">{{ percent }}%</span>
    </div>

    <Progress
      :percent="percent"
      :strokeColor="getColor(percent)"
      :status="status"
    />

    <div v-if="details" class="progress-details">
      <StatItem
        v-for="(value, key) in details"
        :key="key"
        :label="key"
        :value="value"
      />
    </div>
  </div>
</template>

<script setup>
defineProps({
  label: String,
  percent: { type: Number, required: true },
  status: String,
  details: Object
})

const getColor = (percent) => {
  if (percent < 33) return '#f5222d'
  if (percent < 66) return '#faad14'
  return '#52c41a'
}
</script>
```

### NotificationBadge

알림 뱃지:

```vue
<template>
  <div v-if="count > 0" class="notification-badge">
    <span class="count">{{ count > 99 ? '99+' : count }}</span>
  </div>
</template>

<script setup>
defineProps({
  count: { type: Number, default: 0 }
})
</script>

<style scoped>
.notification-badge {
  position: absolute;
  top: -8px;
  right: -8px;
  background: #f5222d;
  color: white;
  border-radius: 50%;
  width: 20px;
  height: 20px;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 12px;
  font-weight: bold;
}
</style>
```

---

## 커스텀 컴포넌트

### DiagramViewer

다이어그램 뷰어 래퍼:

```vue
<template>
  <div class="diagram-viewer">
    <div class="toolbar">
      <Button icon="zoom-in" @click="zoom(1.2)" />
      <Button icon="zoom-out" @click="zoom(0.8)" />
      <Button icon="fit" @click="fitView" />
      <Divider type="vertical" />
      <Button icon="export" @click="exportDiagram" />
    </div>

    <div ref="container" class="diagram-container" />
  </div>
</template>

<script setup>
import { ref } from 'vue'

const props = defineProps({
  type: { type: String, enum: ['mermaid', 'plantuml'] },
  content: String
})

const container = ref(null)
const scale = ref(1)

const zoom = (factor) => {
  scale.value *= factor
  updateView()
}

const fitView = () => {
  scale.value = 1
  updateView()
}

const updateView = () => {
  if (container.value) {
    container.value.style.transform = `scale(${scale.value})`
  }
}

const exportDiagram = () => {
  // 다이어그램을 이미지로 내보내기
}
</script>

<style scoped>
.diagram-viewer {
  display: flex;
  flex-direction: column;
  height: 100%;
}

.toolbar {
  padding: 8px;
  border-bottom: 1px solid #f0f0f0;
}

.diagram-container {
  flex: 1;
  overflow: auto;
  background: #fafafa;
}
</style>
```

### ConnectionStatus

연결 상태 표시:

```vue
<template>
  <div :class="['connection-status', status.type]">
    <Icon :type="status.icon" />
    <span>{{ status.text }}</span>
    <Button
      v-if="onRetry"
      type="text"
      size="small"
      @click="onRetry"
    >
      Retry
    </Button>
  </div>
</template>

<script setup>
import { computed } from 'vue'

const props = defineProps({
  status: {
    type: String,
    enum: ['connected', 'connecting', 'disconnected', 'error'],
    required: true
  },
  onRetry: Function
})

const statusMap = {
  connected: { type: 'success', icon: 'check-circle', text: 'Connected' },
  connecting: { type: 'info', icon: 'loading', text: 'Connecting...' },
  disconnected: { type: 'warning', icon: 'warning', text: 'Disconnected' },
  error: { type: 'error', icon: 'close-circle', text: 'Error' }
}

const statusData = computed(() => statusMap[props.status])
</script>

<style scoped>
.connection-status {
  display: flex;
  align-items: center;
  gap: 8px;
  padding: 8px 12px;
  border-radius: 4px;
  font-size: 12px;
}

.connection-status.success {
  background: #f6ffed;
  color: #52c41a;
}

.connection-status.error {
  background: #fff1f0;
  color: #f5222d;
}
</style>
```

---

## 컴포넌트 사용 가이드

### 전역 등록

```javascript
// main.js
import { createApp } from 'vue'
import App from './App.vue'
import * as CommonComponents from '@/components/common'

const app = createApp(App)

Object.entries(CommonComponents).forEach(([name, component]) => {
  app.component(name, component)
})

app.mount('#app')
```

### 로컬 등록

```vue
<script setup>
import { StatisticCard, ProjectCard } from '@/components/common'
</script>

<template>
  <StatisticCard title="Total Projects" value="12" />
  <ProjectCard :project="project" />
</template>
```

---

## 컴포넌트 라이브러리

### Ant Design Vue

기본 컴포넌트 (Button, Input, Select, Table, Tree 등):

```bash
npm install ant-design-vue
```

### 커스텀 컴포넌트 구조

```
src/components/
├── common/
│   ├── index.js
│   ├── Header.vue
│   ├── Sidebar.vue
│   └── ...
├── forms/
│   ├── ConfigInput.vue
│   ├── FileInput.vue
│   └── ...
├── display/
│   ├── StatisticCard.vue
│   ├── ProjectCard.vue
│   └── ...
├── feedback/
│   ├── ProgressIndicator.vue
│   ├── ConnectionStatus.vue
│   └── ...
└── custom/
    ├── DiagramViewer.vue
    ├── GraphCanvas.vue
    └── ...
```

---

## 다음 단계

1. 각 컴포넌트에 대한 Story 작성 (Storybook)
2. 단위 테스트 작성 (Vue Test Utils)
3. 컴포넌트 문서화 (Storybook Docs)
