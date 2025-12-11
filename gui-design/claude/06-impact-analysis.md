# CSA GUI 화면 설계서 - 영향도 분석

**페이지**: Impact Analysis (Impact)
**경로**: /impact/:projectId
**사용자**: PM, 아키텍트

---

## 페이지 개요

테이블/메서드 변경 시 영향을 받는 코드를 역추적으로 분석합니다.

---

## 레이아웃

```
┌────────────────────────────────────────────────┐
│ Impact Analysis        [Project: car-center-dev] │
├────────────────────────────────────────────────┤
│                                                │
│ Analysis Type:                                 │
│ ◉ Table Impact  ◯ Method Impact               │
│                                                │
│ Select Target: [USER ▼]                       │
│ Max Depth: [10]                               │
│ [Analyze]                                      │
│                                                │
├────────────────────────────────────────────────┤
│                                                │
│ Impact Summary                                 │
│ ┌──────────────────────────────────────────┐  │
│ │ Affected Methods: 23                     │  │
│ │ Affected Classes: 12                     │  │
│ │ Risk Level: HIGH                         │  │
│ │ Call Chain Depth: 5                      │  │
│ └──────────────────────────────────────────┘  │
│                                                │
├────────────────────────────────────────────────┤
│ 🔗 Call Chain (USER table)                    │
│                                                │
│ USER                                           │
│  └─ SELECT * FROM USER                        │
│      └─ UserRepository.findById()              │
│          └─ UserService.getUser()              │
│              ├─ UserController.showUser()      │
│              └─ ReportService.generateReport() │
│                 └─ ReportController.export()   │
│                                                │
│ [Expand All] [Collapse All]                   │
│                                                │
├────────────────────────────────────────────────┤
│ 📊 Risk Assessment                             │
│                                                │
│ HIGH RISK                                      │
│ • UserController (Critical Endpoint)          │
│ • ReportService (Complex Logic)               │
│ • PaymentService (External Integration)       │
│                                                │
│ MEDIUM RISK                                    │
│ • ValidationService                           │
│ • CacheService                                │
│                                                │
│ [Generate Report] [Export as PDF]             │
│                                                │
└────────────────────────────────────────────────┘
```

---

## 주요 섹션

### 1. 분석 설정

```html
<AnalysisSetup>
  <RadioGroup v-model="analysisType" name="type">
    <Radio value="table">Table Impact</Radio>
    <Radio value="method">Method Impact</Radio>
  </RadioGroup>

  <div v-if="analysisType === 'table'">
    <Select
      v-model="selectedTable"
      placeholder="테이블 선택"
      filterable
      allowClear
    >
      <Option v-for="table in tables" :key="table" :value="table">
        {{ table }}
      </Option>
    </Select>
  </div>

  <div v-else>
    <Select
      v-model="selectedClass"
      placeholder="클래스 선택"
      filterable
    />
    <Select
      v-model="selectedMethod"
      placeholder="메서드 선택"
      filterable
    />
  </div>

  <InputNumber
    v-model="maxDepth"
    label="Max Call Depth"
    :min="1"
    :max="20"
  />

  <Button type="primary" size="large" @click="analyze">
    Analyze Impact
  </Button>
</AnalysisSetup>
```

### 2. 영향도 요약 (Summary Card)

```html
<ImpactSummary :data="impactResult">
  <Row :gutter="16">
    <Statistic
      title="Affected Methods"
      :value="impactResult.methodCount"
      :valueStyle="{ color: '#1890ff' }"
    />
    <Statistic
      title="Affected Classes"
      :value="impactResult.classCount"
      :valueStyle="{ color: '#52c41a' }"
    />
    <Statistic
      title="Risk Level"
      :value="impactResult.riskLevel"
      :valueStyle="getRiskColor(impactResult.riskLevel)"
    />
    <Statistic
      title="Call Chain Depth"
      :value="impactResult.maxDepth"
    />
  </Row>
</ImpactSummary>
```

### 3. 호출 체인 (Call Chain Tree)

```html
<CallChainTree
  :data="callChainTree"
  :onNodeClick="selectNode"
>
  <template #title="{ node }">
    <div class="chain-node" :class="getRiskClass(node.risk)">
      <Icon :type="getNodeIcon(node.type)" />
      <span class="node-label">{{ node.label }}</span>
      <Tag v-if="node.risk" :color="getRiskColor(node.risk)">
        {{ node.risk }}
      </Tag>
    </div>
  </template>
</CallChainTree>
```

**예시 트리 구조**:

```json
{
  "label": "USER (Table)",
  "type": "table",
  "children": [
    {
      "label": "SELECT * FROM USER",
      "type": "sql",
      "risk": "MEDIUM",
      "children": [
        {
          "label": "UserRepository.findById()",
          "type": "method",
          "risk": "HIGH",
          "children": [
            {
              "label": "UserService.getUser()",
              "type": "method",
              "risk": "HIGH",
              "children": [
                {
                  "label": "UserController.showUser()",
                  "type": "method",
                  "risk": "HIGH",
                  "endpoint": true
                }
              ]
            }
          ]
        }
      ]
    }
  ]
}
```

### 4. 리스크 평가 (Risk Assessment)

```html
<RiskAssessment :risks="riskAnalysis">
  <Row :gutter="16">
    <Col :xs="24" :sm="12" :lg="8">
      <RiskGroup title="HIGH RISK" color="red">
        <RiskItem
          v-for="item in highRisks"
          :key="item.id"
          :item="item"
          @click="selectNode(item)"
        />
      </RiskGroup>
    </Col>

    <Col :xs="24" :sm="12" :lg="8">
      <RiskGroup title="MEDIUM RISK" color="orange">
        <!-- ... -->
      </RiskGroup>
    </Col>

    <Col :xs="24" :sm="12" :lg="8">
      <RiskGroup title="LOW RISK" color="green">
        <!-- ... -->
      </RiskGroup>
    </Col>
  </Row>
</RiskAssessment>
```

**리스크 판정 기준**:

| 요소 | HIGH | MEDIUM | LOW |
|------|------|--------|-----|
| **복잡도** | > 50 | 20-50 | < 20 |
| **호출 수** | > 10 | 5-10 | < 5 |
| **Endpoint** | ✓ | - | - |
| **External Integration** | ✓ | - | - |

---

## 선택된 노드 상세 정보

```html
<NodeDetails v-if="selectedNode">
  <Tabs>
    <TabPane label="Overview">
      <DescriptionList>
        <DescriptionItem label="Name">
          {{ selectedNode.name }}
        </DescriptionItem>
        <DescriptionItem label="Type">
          {{ selectedNode.type }}
        </DescriptionItem>
        <DescriptionItem label="Risk Level">
          <Tag :color="getRiskColor(selectedNode.risk)">
            {{ selectedNode.risk }}
          </Tag>
        </DescriptionItem>
        <DescriptionItem label="Complexity">
          {{ selectedNode.complexity }}
        </DescriptionItem>
      </DescriptionList>
    </TabPane>

    <TabPane label="Source Code">
      <CodeBlock :code="selectedNode.source" language="java" />
    </TabPane>

    <TabPane label="Metrics">
      <Statistic
        v-for="metric in selectedNode.metrics"
        :key="metric.label"
        :title="metric.label"
        :value="metric.value"
      />
    </TabPane>
  </Tabs>
</NodeDetails>
```

---

## 리포트 생성

```html
<ReportGenerator :impact="impactResult">
  <Checkbox v-model="reportOptions.includeJson">
    Include JSON Report
  </Checkbox>
  <Checkbox v-model="reportOptions.generateDiagram">
    Generate Diagram
  </Checkbox>

  <Button type="primary" @click="generateReport">
    Generate Report
  </Button>

  <div v-if="reportGenerated" class="report-download">
    <Alert
      message="Report generated successfully"
      type="success"
      closable
    />
    <div class="download-links">
      <Button href="/download/impact.md">
        Download Markdown
      </Button>
      <Button href="/download/impact.xlsx">
        Download Excel
      </Button>
      <Button v-if="reportOptions.includeJson" href="/download/impact.json">
        Download JSON
      </Button>
    </div>
  </div>
</ReportGenerator>
```

---

## 데이터 구조

```typescript
interface ImpactAnalysisResult {
  type: 'table' | 'method'
  target: string
  methodCount: number
  classCount: number
  riskLevel: 'HIGH' | 'MEDIUM' | 'LOW'
  maxDepth: number
  callChain: CallChainNode[]
  riskAssessment: RiskItem[]
}

interface RiskItem {
  id: string
  name: string
  type: 'class' | 'method' | 'endpoint'
  risk: 'HIGH' | 'MEDIUM' | 'LOW'
  complexity: number
  complexity: number
  reason: string[] // 리스크 이유
}

interface CallChainNode {
  id: string
  label: string
  type: 'table' | 'sql' | 'method' | 'class'
  risk: 'HIGH' | 'MEDIUM' | 'LOW'
  complexity?: number
  source?: string
  children: CallChainNode[]
}
```

---

## 반응형 설계

- **Desktop**: 좌측 트리 + 우측 상세 정보
- **Tablet**: 탭 기반 내비게이션
- **Mobile**: 풀스크린 트리

---

## 다음 문서

- `07-configuration.md`: 설정 관리 화면 설계
