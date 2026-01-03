# AI 프롬프트 데이터 Export/Import 스크립트 작성 결과

## 1. 개요

AI 코드 분석기의 프롬프트 데이터(`:AiPrompt`)를 Neo4j 데이터베이스에서 파일로 백업(Export)하거나, 파일에서 데이터베이스로 복원(Import)하기 위한 유틸리티 스크립트를 작성하였습니다. 이 스크립트들은 초기 구축 시 데이터 마이그레이션이나 백업 용도로 사용할 수 있습니다.

## 2. 스크립트 상세

### 2.1 데이터 저장 경로

- 스크립트 실행 시 데이터 파일은 `server/scripts/data/` 디렉토리에 저장되거나 해당 위치에서 읽어옵니다.
- 파일명 형식: `ai_prompt_export_data-YYYYMMDD.json`

### 2.2 Export 스크립트

- **파일 경로**: `server/scripts/ai_prompt_export.py`
- **기능**:
  - Neo4j DB에 접속하여 모든 `AiPrompt` 노드를 조회합니다.
  - 조회된 데이터를 JSON 형식으로 변환하여 `server/scripts/data/ai_prompt_export_data-{오늘날짜}.json` 파일로 저장합니다.
- **주요 로직**:
  - `sys.path` 조정을 통해 서버 모듈(`app.config`, `csa.services`)을 직접 import하여 환경 설정을 재사용합니다.
  - `.env` 파일의 DB 접속 정보를 자동으로 로드합니다.

### 2.3 Import 스크립트

- **파일 경로**: `server/scripts/ai_prompt_import.py`
- **기능**:
  - JSON 파일에서 프롬프트 데이터를 읽어 Neo4j DB에 적재합니다.
  - `MERGE` 구문을 사용하여 동일한 이름(`name`)의 프롬프트가 있으면 내용을 업데이트하고, 없으면 새로 생성합니다.
  - `:AiPrompt` 및 `:System` 레이블을 부여합니다.
- **사용법**:
  - 인자 없이 실행 시: `server/scripts/data/` 폴더 내의 오늘 날짜 파일(`ai_prompt_export_data-{오늘날짜}.json`)을 자동으로 찾아서 Import 합니다.
  - 인자 지정 시: 지정된 경로의 JSON 파일을 Import 합니다.

## 3. 사용 방법 (Walkthrough)

### 3.1 사전 준비

- 터미널을 열고 프로젝트 루트 디렉토리(`d:\workspaces\davis\ai-code-analyzer`)로 이동합니다.
- (필요 시) Python 가상환경을 활성화합니다.

### 3.2 Export 실행 (DB -> 파일)

```bash
python server/scripts/ai_prompt_export.py
```

- 실행 후 `server/scripts/data/` 폴더에 JSON 파일이 생성되었는지 확인합니다.

### 3.3 Import 실행 (파일 -> DB)

**기본 실행 (오늘 날짜의 Export 파일 자동 로드)**:

```bash
python server/scripts/ai_prompt_import.py
```

**특정 파일 지정 실행**:

```bash
python server/scripts/ai_prompt_import.py server/scripts/data/ai_prompt_export_data-20260101.json
```

## 4. 참고 사항

- 스크립트는 `server` 디렉토리를 Python Path에 추가하여 실행되므로, 프로젝트 루트에서 실행하는 것을 권장합니다.
- DB 연결 실패 시 `.env` 파일의 설정(`NEO4J_URI`, `NEO4J_USER`, `NEO4J_PASSWORD`)을 확인하십시오.
