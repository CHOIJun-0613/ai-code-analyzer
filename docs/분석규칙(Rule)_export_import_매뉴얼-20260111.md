# 분석 규칙(Analysis Rule) Export/Import 매뉴얼

이 문서는 AI 코드 분석기의 분석 규칙(AnalysisRule) 데이터를 백업(Export)하고 복원(Import)하는 방법에 대해 설명합니다.

## 1. 개요

분석 규칙 데이터는 Neo4j 데이터베이스에 저장됩니다. 이를 JSON 파일로 내보내거나, JSON 파일로부터 다시 DB로 불러올 수 있습니다.
Import 시에는 데이터 무결성과 이력 관리를 위해 **기존 규칙을 덮어쓰지 않고**, **새로운 버전의 노드를 생성**하는 방식을 사용합니다.

## 2. 사전 준비

- 서버 가상환경이 활성화되어 있어야 합니다. (없다면 `server/runvenv.bat` 실행)
- Neo4j 데이터베이스가 실행 중이어야 합니다.

## 3. Export (내보내기)

DB에 있는 모든 분석 규칙을 JSON 파일로 저장합니다.

### 실행 방법

`server` 디렉토리에서 아래 명령어를 실행합니다.

```sh
# 서버 디렉토리로 이동
cd server

# 가상환경 활성화 (필요시)
# Windows: .venv\Scripts\activate
# Linux/Mac: source .venv/bin/activate

# Export 스크립트 실행
python scripts/analysis_rules_export.py
```

### 실행 결과

- 성공 시 `server/scripts/data/` 디렉토리에 파일이 생성됩니다.
- 파일명 형식: `analysis_rules_data-YYYYMMDD.json` (예: `analysis_rules_data-20260111.json`)

---

## 4. Import (가져오기)

JSON 파일에 저장된 규칙을 DB에 반영합니다.

### 실행 방법

#### (1) 최신 파일 자동 Import

별도 파일명을 지정하지 않으면 `server/scripts/data/` 폴더 내의 **가장 최신(날짜 기준)** 파일을 자동으로 찾아 Import 합니다.

```sh
python scripts/analysis_rules_import.py
```

#### (2) 특정 파일 지정 Import

특정 파일을 지정하고 싶다면 파일 경로를 인자로 전달합니다.

```sh
python scripts/analysis_rules_import.py scripts/data/analysis_rules_data-20251225.json
```

### Import 로직 (중요)

스크립트는 데이터의 **버전 관리**를 위해 다음과 같이 동작합니다.

1. **기존 규칙 비활성화 (Soft Delete)**
   - Import 하려는 규칙과 **동일한 이름(Name)**을 가진, 현재 사용 중(`useYn=True`)인 DB 내의 모든 규칙을 찾습니다.
   - 해당 규칙들의 `useYn` 값을 `false`로 변경하여 비활성화합니다.

2. **새 규칙 생성 (Create New Version)**
   - JSON 파일의 내용으로 **새로운 Rule 노드**를 생성합니다.
   - 새 노드는 `useYn=True`로 설정되어 활성 상태가 됩니다.
   - `updatedAt`은 Import 시점으로 갱신됩니다.

> **참고**: 이 방식은 실수로 데이터를 덮어써서 기존 내용을 잃어버리는 것을 방지하고, 이전 버전의 규칙 데이터를 DB에 남겨두기 위함입니다.
