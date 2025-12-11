# CSA GUI 화면 설계서 - 대시보드

**페이지**: Dashboard (Home)
**경로**: /
**사용자**: 모두

---

## 페이지 개요

대시보드는 CSA GUI의 진입점으로, 최근 분석 결과, 프로젝트 통계, 빠른 접근 기능을 제공합니다.

```
┌─────────────────────────────────────────────────────────────┐
│ Home                                    🌙  ⚙️  👤  ❌     │
├─────────────────────────────────────────────────────────────┤
│                                                             │
│  Welcome, User!                                            │
│  마지막 분석: car-center-devlab (2시간 전)                  │
│                                                             │
│  ┌─────────────────────────────────────────────────────┐  │
│  │ 📊 Recent Projects                                  │  │
│  ├─────────────────────────────────────────────────────┤  │
│  │                                                     │  │
│  │  ┌─────────────────┐  ┌─────────────────┐         │  │
│  │  │car-center-dev   │  │payment-service  │         │  │
│  │  │Lab (프로젝트)   │  │(프로젝트)        │         │  │
│  │  │                 │  │                 │         │  │
│  │  │Classes: 5432    │  │Classes: 2341    │         │  │
│  │  │Methods: 23456   │  │Methods: 10234   │         │  │
│  │  │Last: 2h ago     │  │Last: 5d ago     │         │  │
│  │  │                 │  │                 │         │  │
│  │  │[Open] [Re-Analyze] [Delete]         │         │  │
│  │  └─────────────────┘  └─────────────────┘         │  │
│  │                                                     │  │
│  │  [+ New Project]                                   │  │
│  │                                                     │  │
│  └─────────────────────────────────────────────────────┘  │
│                                                             │
│  ┌─────────────────────┐  ┌─────────────────────────┐     │
│  │ 📈 Global Stats     │  │ ⏱️ Recent Analysis      │     │
│  ├─────────────────────┤  ├─────────────────────────┤     │
│  │                     │  │                         │     │
│  │ Total Projects: 12  │  │ Project: car-center-dev │     │
│  │ Total Classes: 45k  │  │ Duration: 34 min 4 sec │     │
│  │ Total Methods: 230k │  │ Classes: 5432           │     │
│  │                     │  │ Beans: 234              │     │
│  │ Last Updated:       │  │ Endpoints: 89           │     │
│  │ 2025-11-07 10:56   │  │                         │     │
│  │                     │  │ [View Details] [Explore]       │
│  │                     │  │                         │     │
│  └─────────────────────┘  └─────────────────────────┘     │
│                                                             │
│  ┌─────────────────────────────────────────────────────┐  │
│  │ 🚀 Quick Start                                      │  │
│  ├─────────────────────────────────────────────────────┤  │
│  │                                                     │  │
│  │  [New Analysis]  [View Graph]  [Check Impact]      │  │
│  │  [Settings]      [Documentation]                   │  │
│  │                                                     │  │
│  └─────────────────────────────────────────────────────┘  │
│                                                             │
└─────────────────────────────────────────────────────────────┘
```

---

## 섹션 상세 설계

### 1. Header (상단 네비게이션)

**위치**: 페이지 상단

**컴포넌트**:

```html
<Header>
  <Breadcrumb>
    <BreadcrumbItem>Home</BreadcrumbItem>
  </Breadcrumb>

  <Title>Home</Title>

  <RightSection>
    <Search placeholder="검색..." />
    <Button icon="bell" badge={3} />  <!-- 알림 -->
    <Button icon="moon" onClick={toggleTheme} />  <!-- 테마 -->
    <Button icon="cog" onClick={goToSettings} />  <!-- 설정 -->
    <Dropdown>  <!-- 사용자 메뉴 -->
      <Avatar name="User" />
      <Menu>
        <MenuItem>My Profile</MenuItem>
        <MenuItem>Preferences</MenuItem>
        <Divider />
        <MenuItem danger>Logout</MenuItem>
      </Menu>
    </Dropdown>
  </RightSection>
</Header>
```

### 2. Welcome Card

**목적**: 사용자 인사말 및 최근 활동

**레이아웃**:

```
┌────────────────────────────────────┐
│ Welcome, [User Name]! 👋          │
│                                    │
│ 마지막 분석:                      │
│ car-center-devlab (2시간 전)      │
│ 5432 클래스, 34분 소요             │
│                                    │
│ [View Results] [Re-Analyze]        │
└────────────────────────────────────┘
```

**기능**:
- 로그인한 사용자명 표시
- 마지막 분석 프로젝트 표시
- 빠른 접근 버튼

### 3. Recent Projects

**목적**: 최근에 작업한 프로젝트 목록

**레이아웃**: 카드 그리드 (반응형)

```
┌──────────────────────────────────────────────┐
│ 📊 Recent Projects (Sort: Last Used)         │
│ [⭐ Favorites]  [All]  [Archived]            │
├──────────────────────────────────────────────┤
│                                              │
│  ┌──────────┐  ┌──────────┐  ┌──────────┐  │
│  │ Project  │  │ Project  │  │ Project  │  │
│  │ Name     │  │ Name     │  │ Name     │  │
│  ├──────────┤  ├──────────┤  ├──────────┤  │
│  │ 📁 Path  │  │ 📁 Path  │  │ 📁 Path  │  │
│  │          │  │          │  │          │  │
│  │ Classes: │  │ Classes: │  │ Classes: │  │
│  │ 5432     │  │ 2341     │  │ 892      │  │
│  │          │  │          │  │          │  │
│  │ Last:    │  │ Last:    │  │ Last:    │  │
│  │ 2h ago   │  │ 5d ago   │  │ 3w ago   │  │
│  │          │  │          │  │          │  │
│  │ ⭐ 🔍 📊 │  │ ⭐ 🔍 📊 │  │ ⭐ 🔍 📊 │  │
│  └──────────┘  └──────────┘  └──────────┘  │
│                                              │
│  [+ New Project]                            │
│                                              │
└──────────────────────────────────────────────┘
```

**각 프로젝트 카드**:

```html
<ProjectCard>
  <Header>
    <Title>car-center-devlab</Title>
    <StarButton /> <!-- 즐겨찾기 -->
    <MoreMenu>
      <MenuItem>Open</MenuItem>
      <MenuItem>Re-Analyze</MenuItem>
      <MenuItem>Duplicate</MenuItem>
      <MenuItem danger>Delete</MenuItem>
      <MenuItem>Export</MenuItem>
    </MoreMenu>
  </Header>

  <Path>📁 /path/to/project/src</Path>

  <Stats>
    <StatItem icon="📦" label="Classes" value="5432" />
    <StatItem icon="⚙️" label="Methods" value="23456" />
    <StatItem icon="🔗" label="Beans" value="234" />
  </Stats>

  <Footer>
    <LastAnalysis>Last: 2025-11-07 10:56 (2시간 전)</LastAnalysis>
    <Actions>
      <Button type="primary" onClick={openProject}>Open</Button>
      <Button onClick={reanalyze}>Re-Analyze</Button>
    </Actions>
  </Footer>
</ProjectCard>
```

**기능**:
- 프로젝트 카드 클릭 → Results 페이지 이동
- 즐겨찾기 기능
- 정렬: 최근 사용, 이름, 크기
- 필터: 모두, 즐겨찾기, 아카이브
- 우클릭 메뉴

### 4. Global Statistics

**목적**: 전체 통계 요약

**레이아웃**:

```
┌──────────────────────────────────────┐
│ 📈 Global Statistics                 │
├──────────────────────────────────────┤
│                                      │
│  ┌─────────┐  ┌─────────┐           │
│  │ 📦      │  │ ⚙️      │           │
│  │ Total   │  │ Total   │           │
│  │ Projects│  │ Classes │           │
│  │    12   │  │  45,234 │           │
│  │  ↑ 2    │  │  ↑ 10k  │           │
│  └─────────┘  └─────────┘           │
│                                      │
│  ┌─────────┐  ┌─────────┐           │
│  │ 🔧      │  │ 🔗      │           │
│  │ Total   │  │ Total   │           │
│  │ Methods │  │  Beans  │           │
│  │ 230,456 │  │  1,234  │           │
│  │  ↑ 45k  │  │   ↑ 89  │           │
│  └─────────┘  └─────────┘           │
│                                      │
│ Last Updated: 2025-11-07 10:56      │
│                                      │
└──────────────────────────────────────┘
```

**구현**:

```html
<StatisticsCard>
  <Grid columns={4}>
    <Statistic
      title="Total Projects"
      value={12}
      change={+2}
      changeType="up"
      icon="📦"
    />
    <Statistic
      title="Total Classes"
      value={45234}
      change={+10000}
      changeType="up"
      icon="📦"
    />
    <!-- ... -->
  </Grid>
  <Footer>
    <small>Last Updated: {lastUpdateTime}</small>
  </Footer>
</StatisticsCard>
```

### 5. Recent Analysis

**목적**: 최근 분석 결과 요약

**레이아웃**:

```
┌─────────────────────────────────────┐
│ ⏱️ Recent Analysis                  │
├─────────────────────────────────────┤
│                                     │
│ Project: car-center-devlab          │
│ 📅 2025-11-07 10:56 (2시간 전)      │
│ ⏱️ Duration: 34 min 4 sec           │
│                                     │
│ Results:                            │
│  • Classes: 5,432                   │
│  • Methods: 23,456                  │
│  • Beans: 234                       │
│  • Endpoints: 89                    │
│  • DB Tables: 56                    │
│                                     │
│ Status: ✅ Success                  │
│                                     │
│ [View Details] [View Graph]         │
│ [Download Report]                   │
│                                     │
└─────────────────────────────────────┘
```

**기능**:
- 최근 분석 프로젝트 표시
- 분석 결과 요약
- 빠른 접근 버튼 (Results, Graph)
- 보고서 다운로드

### 6. Quick Start Section

**목적**: 자주 사용하는 기능 빠른 접근

**레이아웃**:

```
┌────────────────────────────────────────┐
│ 🚀 Quick Start                         │
├────────────────────────────────────────┤
│                                        │
│  [New Analysis]     [View Graph]       │
│  프로젝트 분석 시작   지난 결과 확인    │
│                                        │
│  [Check Impact]     [Settings]         │
│  영향도 분석         시스템 설정        │
│                                        │
│  [Documentation]    [Report]           │
│  도움말              최근 보고서        │
│                                        │
└────────────────────────────────────────┘
```

**구현**:

```html
<QuickStartSection>
  <Grid columns={3}>
    <QuickLink
      icon="🔍"
      title="New Analysis"
      subtitle="프로젝트 분석 시작"
      onClick={() => navigate('/analyze')}
    />
    <QuickLink
      icon="🔗"
      title="View Graph"
      subtitle="지난 결과 확인"
      onClick={() => navigate('/graph')}
    />
    <!-- ... -->
  </Grid>
</QuickStartSection>
```

---

## 인터랙션 설계

### 프로젝트 카드 호버 효과

```css
/* 마우스 오버 시 */
.project-card:hover {
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
  transform: translateY(-2px);
  transition: all 0.3s ease;
}

/* 액션 버튼 표시 */
.project-card:hover .actions {
  opacity: 1;
  visibility: visible;
}
```

### 모달: 새 프로젝트 생성

```
┌──────────────────────────────────────┐
│ Create New Project                ❌ │
├──────────────────────────────────────┤
│                                      │
│ Project Name: [________________]    │
│                                      │
│ Java Source Folder:                 │
│ [________________] [📁 Browse]       │
│                                      │
│ Database Scripts Folder (선택):      │
│ [________________] [📁 Browse]       │
│                                      │
│ Options:                             │
│ ☑️ Create Neo4j Database             │
│ ☑️ Analyze on Create                 │
│                                      │
│ [Cancel]  [Create]                  │
│                                      │
└──────────────────────────────────────┘
```

---

## 반응형 설계

### Desktop (1400px+)
- 최근 프로젝트: 3열 그리드
- 통계: 4개 항목 한 줄

### Tablet (1024px)
- 최근 프로젝트: 2열 그리드
- 통계: 2개 항목 × 2줄

### Mobile (800px)
- 최근 프로젝트: 1열 그리드
- 통계: 1개 항목 × 4줄

---

## 데이터 구조

```typescript
interface Project {
  id: string
  name: string
  path: string
  description?: string
  createdAt: Date
  lastAnalyzedAt: Date
  statistics: {
    classes: number
    methods: number
    beans: number
    endpoints: number
    tables: number
  }
  isFavorite: boolean
}

interface GlobalStats {
  totalProjects: number
  totalClasses: number
  totalMethods: number
  totalBeans: number
  lastUpdated: Date
  previousStats: GlobalStats
}

interface RecentAnalysis {
  projectId: string
  projectName: string
  timestamp: Date
  duration: number
  status: 'success' | 'failure' | 'partial'
  results: {
    classes: number
    methods: number
    beans: number
    endpoints: number
    tables: number
  }
}
```

---

## Vue 컴포넌트 예시

```vue
<template>
  <div class="dashboard">
    <!-- Header -->
    <DashboardHeader />

    <!-- Welcome Section -->
    <WelcomeCard :lastAnalysis="lastAnalysis" />

    <!-- Main Content -->
    <div class="main-content">
      <!-- Recent Projects -->
      <ProjectsSection
        :projects="projects"
        :loading="loading"
        @new-project="showCreateModal"
        @open-project="openProject"
        @reanalyze="reanalyzeProject"
      />

      <!-- Statistics Row -->
      <Row :gutter="16" class="statistics-row">
        <Col :xs="24" :sm="12" :lg="12">
          <GlobalStatistics :stats="stats" />
        </Col>
        <Col :xs="24" :sm="12" :lg="12">
          <RecentAnalysisCard :analysis="recentAnalysis" />
        </Col>
      </Row>

      <!-- Quick Start -->
      <QuickStartSection />
    </div>

    <!-- Modals -->
    <CreateProjectModal
      v-model:visible="createModalVisible"
      @create="createProject"
    />
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import { useRouter } from 'vue-router'
import { useProjectStore } from '@/stores/projectStore'

const router = useRouter()
const projectStore = useProjectStore()

const projects = ref([])
const stats = ref(null)
const recentAnalysis = ref(null)
const loading = ref(false)
const createModalVisible = ref(false)

onMounted(async () => {
  loading.value = true
  await projectStore.fetchProjects()
  projects.value = projectStore.projects
  stats.value = projectStore.globalStats
  recentAnalysis.value = projectStore.recentAnalysis
  loading.value = false
})

const openProject = (projectId) => {
  router.push({ name: 'Results', params: { projectId } })
}

const reanalyzeProject = (projectId) => {
  router.push({
    name: 'Analysis',
    query: { projectId, reanalyze: true }
  })
}

const showCreateModal = () => {
  createModalVisible.value = true
}

const createProject = async (projectData) => {
  await projectStore.createProject(projectData)
  createModalVisible.value = false
  projects.value = projectStore.projects
}
</script>

<style scoped>
.dashboard {
  padding: 24px;
  max-width: 1600px;
  margin: 0 auto;
}

.main-content {
  margin-top: 24px;
}

.statistics-row {
  margin: 24px 0;
}
</style>
```

---

## 다음 문서

- `03-analysis-monitor.md`: 분석 모니터링 화면 설계
