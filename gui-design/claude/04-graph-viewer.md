# CSA GUI 화면 설계서 - 그래프 시각화

**페이지**: Graph Viewer (Graph)
**경로**: /graph/:projectId
**사용자**: 개발자 (주로)

---

## 페이지 개요

Neo4j 그래프 데이터를 인터랙티브 그래프로 시각화합니다.

---

## 레이아웃

```
┌──────────────────────────────────────────────────────┐
│ Graph Viewer  [Project: car-center-dev]         [●]  │
├────────────────────────────────────────────────────────┤
│ ┌──────────────┬──────────────────────────────────┐  │
│ │ 🔧 Toolbar   │                                  │  │
│ │              │         Neo4j Graph Viewer       │  │
│ │ ┌──────────┐ │       (Cytoscape.js)            │  │
│ │ │🔍 Search │ │                                  │  │
│ │ ├──────────┤ │       ●─────●                   │  │
│ │ │ Classes  │ │      ╱       ╲                  │  │
│ │ │ Methods  │ │    ●───────────●                │  │
│ │ │ Beans    │ │     │         │                 │  │
│ │ │ Endpoints│ │    ●───────────●                │  │
│ │ │ Tables   │ │      ╲       ╱                  │  │
│ │ │          │ │       ●─────●                   │  │
│ │ ├──────────┤ │                                  │  │
│ │ │ 🎯 Filters│ │                                  │  │
│ │ │ ☑ Class   │ │                                  │  │
│ │ │ ☑ Method  │ │                                  │  │
│ │ │ ☑ Bean    │ │                                  │  │
│ │ │ ☑ SQL     │ │                                  │  │
│ │ │ ☑ Table   │ │                                  │  │
│ │ ├──────────┤ │                                  │  │
│ │ │ 📊 Legend │ │                                  │  │
│ │ │ ● Class  │ │                                  │  │
│ │ │ ● Bean   │ │                                  │  │
│ │ │ ● Endpoint│ │                                  │  │
│ │ │ ● SQL    │ │                                  │  │
│ │ │ ● Table  │ │                                  │  │
│ │ │          │ │                                  │  │
│ │ └──────────┘ │                                  │  │
│ │              │                                  │  │
│ │ [Export]     │                                  │  │
│ │ [Layout ▼]   │                                  │  │
│ │              │                                  │  │
│ └──────────────┴──────────────────────────────────┘  │
│                                                        │
│ ┌──────────────────────────────────────────────────┐  │
│ │ Node Details                            [▼]      │  │
│ ├──────────────────────────────────────────────────┤  │
│ │ Name: UserController                            │  │
│ │ Type: Class                                      │  │
│ │ Package: com.example.user.controller            │  │
│ │ Complexity: High (89)                           │  │
│ │                                                  │  │
│ │ Methods: 12                                     │  │
│ │ Incoming: 5 calls                               │  │
│ │ Outgoing: 23 calls                              │  │
│ │                                                  │  │
│ │ [View Details] [Go to Class Spec]               │  │
│ │                                                  │  │
│ └──────────────────────────────────────────────────┘  │
└──────────────────────────────────────────────────────┘
```

---

## 주요 컴포넌트

### Toolbar (좌측)

```html
<Toolbar>
  <!-- 검색 -->
  <SearchBox
    placeholder="Search nodes..."
    @search="handleSearch"
    clearable
  />

  <!-- 필터 -->
  <FilterSection title="Node Types">
    <Checkbox v-model="filters.class">Classes</Checkbox>
    <Checkbox v-model="filters.method">Methods</Checkbox>
    <Checkbox v-model="filters.bean">Beans</Checkbox>
    <Checkbox v-model="filters.sql">SQL Statements</Checkbox>
    <Checkbox v-model="filters.table">Tables</Checkbox>
  </FilterSection>

  <!-- 범례 -->
  <Legend>
    <LegendItem color="#1890ff" label="Class" />
    <LegendItem color="#52c41a" label="Bean" />
    <LegendItem color="#fa8c16" label="Endpoint" />
    <LegendItem color="#722ed1" label="SQL" />
    <LegendItem color="#eb2f96" label="Table" />
  </Legend>

  <!-- 동작 -->
  <ActionGroup>
    <Button @click="layoutFit">Fit View</Button>
    <Dropdown title="Layout">
      <MenuItem @click="setLayout('cose')">Cose</MenuItem>
      <MenuItem @click="setLayout('concentric')">Concentric</MenuItem>
      <MenuItem @click="setLayout('grid')">Grid</MenuItem>
    </Dropdown>
    <Button @click="exportGraph">Export</Button>
  </ActionGroup>
</Toolbar>
```

### Graph Canvas

Cytoscape.js 기반 인터랙티브 그래프:

```javascript
import cytoscape from 'cytoscape'

const cy = cytoscape({
  container: graphContainer.value,
  style: [
    {
      selector: 'node',
      style: {
        'background-color': '#1890ff',
        'label': 'data(label)',
        'width': '30px',
        'height': '30px',
        'font-size': '12px',
        'text-valign': 'center',
      }
    },
    {
      selector: 'node.class',
      style: { 'background-color': '#1890ff' }
    },
    {
      selector: 'node.bean',
      style: { 'background-color': '#52c41a' }
    },
    {
      selector: 'edge',
      style: {
        'line-color': '#999',
        'width': '1px',
        'target-arrow-color': '#999',
        'target-arrow-shape': 'triangle',
      }
    }
  ],
  layout: {
    name: 'cose',
    directed: true,
    roots: '#a',
    padding: 10,
  }
})

// 이벤트
cy.on('tap', 'node', (event) => {
  const node = event.target
  showNodeDetails(node)
})

cy.on('mouseover', 'node', (event) => {
  const node = event.target
  node.addClass('hover')
})
```

### Node Details 패널

```html
<NodeDetailsPanel
  v-model:visible="detailsVisible"
  :node="selectedNode"
>
  <Tabs>
    <!-- 기본 정보 -->
    <TabPane label="Details">
      <DescriptionList>
        <DescriptionItem label="Name">
          {{ selectedNode.name }}
        </DescriptionItem>
        <DescriptionItem label="Type">
          {{ selectedNode.type }}
        </DescriptionItem>
        <DescriptionItem label="Package">
          {{ selectedNode.package }}
        </DescriptionItem>
        <DescriptionItem label="Complexity">
          <Tag :color="getComplexityColor(selectedNode.complexity)">
            {{ selectedNode.complexity }}
          </Tag>
        </DescriptionItem>
      </DescriptionList>
    </TabPane>

    <!-- 관계 -->
    <TabPane label="Relations">
      <h4>Incoming ({{ incomingCount }})</h4>
      <List :dataSource="incoming">
        <template #renderItem="{ item }">
          <ListItem @click="navigateTo(item.id)">
            {{ item.name }}
          </ListItem>
        </template>
      </List>

      <h4>Outgoing ({{ outgoingCount }})</h4>
      <List :dataSource="outgoing">
        <template #renderItem="{ item }">
          <ListItem @click="navigateTo(item.id)">
            {{ item.name }}
          </ListItem>
        </template>
      </List>
    </TabPane>

    <!-- 메타데이터 -->
    <TabPane label="Metadata">
      <JSON :data="selectedNode.metadata" />
    </TabPane>
  </Tabs>

  <div class="actions">
    <Button type="primary" @click="viewDetails">
      View Full Details
    </Button>
  </div>
</NodeDetailsPanel>
```

---

## 인터랙션

### 마우스 인터랙션

| 동작 | 효과 |
|------|------|
| **마우스 오버** | 노드 강조, 관련 엣지 하이라이트 |
| **클릭** | 노드 상세 정보 표시 |
| **더블클릭** | 해당 노드 중심으로 확대 |
| **드래그** | 그래프 팬 또는 노드 이동 |
| **마우스휠** | 확대/축소 |
| **우클릭** | 컨텍스트 메뉴 |

### 검색 및 필터

```javascript
const handleSearch = (query) => {
  const results = cy.elements().filter(el => {
    return el.data('label').includes(query)
  })

  cy.elements().removeClass('highlight')
  results.addClass('highlight')
  cy.fit(results, 50)
}

const applyFilters = () => {
  const toHide = cy.elements().filter(el => {
    const type = el.data('type')
    return !filters.value[type]
  })
  toHide.hide()
}
```

---

## 데이터 구조

```typescript
interface Node {
  id: string
  label: string
  type: 'class' | 'method' | 'bean' | 'endpoint' | 'sql' | 'table'
  metadata: {
    package?: string
    complexity?: number
    incoming?: number
    outgoing?: number
    file?: string
    [key: string]: any
  }
}

interface Edge {
  id: string
  source: string
  target: string
  type: 'calls' | 'uses_table' | 'maps_to' | 'injects'
  weight?: number
}

interface GraphData {
  nodes: Node[]
  edges: Edge[]
}
```

---

## Vue 컴포넌트

```vue
<template>
  <div class="graph-viewer">
    <div class="toolbar">
      <SearchBox @search="handleSearch" />
      <FilterPanel v-model="filters" />
    </div>

    <div class="main">
      <div ref="graphContainer" class="graph-canvas"></div>
      <NodeDetailsPanel
        v-model:visible="detailsVisible"
        :node="selectedNode"
      />
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import { useRoute } from 'vue-router'
import cytoscape from 'cytoscape'

const route = useRoute()
const projectId = route.params.projectId

const graphContainer = ref(null)
const cy = ref(null)
const filters = ref({
  class: true,
  method: true,
  bean: true,
  sql: true,
  table: true,
})

const detailsVisible = ref(false)
const selectedNode = ref(null)

onMounted(async () => {
  // Neo4j에서 그래프 데이터 조회
  const response = await fetch(
    `/api/results/${projectId}/graph`
  )
  const graphData = await response.json()

  // Cytoscape 초기화
  cy.value = cytoscape({
    container: graphContainer.value,
    elements: [
      ...graphData.nodes.map(n => ({ data: n })),
      ...graphData.edges.map(e => ({ data: e }))
    ],
    style: getGraphStyle(),
    layout: { name: 'cose' }
  })

  // 이벤트 바인딩
  cy.value.on('tap', 'node', (event) => {
    selectedNode.value = event.target.data()
    detailsVisible.value = true
  })
})

const handleSearch = (query) => {
  const results = cy.value.elements().filter(el =>
    el.data('label')?.includes(query)
  )
  cy.value.fit(results, 50)
}

const getGraphStyle = () => {
  return [/* CSS style array */]
}
</script>

<style scoped>
.graph-viewer {
  display: flex;
  height: 100%;
}

.toolbar {
  width: 250px;
  padding: 16px;
  overflow-y: auto;
  border-right: 1px solid #f0f0f0;
}

.graph-canvas {
  flex: 1;
}
</style>
```

---

## 다음 문서

- `05-diagram-viewer.md`: 다이어그램 뷰어 화면 설계
