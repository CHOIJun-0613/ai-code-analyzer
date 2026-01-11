# AI 프롬프트(AI Prompt) Export/Import 매뉴얼

이 문서는 AI 코드 분석기의 AI 프롬프트(AI Prompt) 데이터를 백업(Export)하고 복원(Import)하는 방법에 대해 설명합니다.

## 1. 개요

AI 프롬프트 데이터는 Neo4j 데이터베이스에 저장됩니다. 이를 JSON 파일로 내보내거나, JSON 파일로부터 다시 DB로 불러올 수 있습니다.
AI 프롬프트 Import 시에는 **기존 프롬프트를 덮어쓰기(Overwrite/Merge)** 방식을 사용합니다.

## 2. 화면 기능 (UI)

관리자 메뉴의 **AI 프롬프트 관리 (Admin > AI Prompt Management)** 화면에서 버튼 클릭만으로 간편하게 수행할 수 있습니다.

### Export (내보내기)

- 화면 우측 상단의 **[내보내기 (Export)]** 버튼을 클릭합니다.
- 저장할 위치와 파일명을 지정하면 현재 시스템의 모든 프롬프트가 JSON 파일로 다운로드됩니다.
- 파일명 기본값: `ai_prompt_export_data-YYYYMMDD-HHmmss.json`

### Import (가져오기)

- 화면 우측 상단의 **[가져오기 (Import)]** 버튼을 클릭합니다.
- 준비된 JSON 파일을 선택합니다.
- 시스템이 파일을 분석하여 Import를 수행하고 결과를 알려줍니다.

---

## 3. 서버 스크립트 실행 (CLI)

서버에서 직접 스크립트를 통해 대량의 데이터를 초기화하거나 백업할 때 사용합니다.

### 사전 준비

- 서버 가상환경이 활성화되어 있어야 합니다.
- Neo4j 데이터베이스가 실행 중이어야 합니다.

### Export (내보내기)

`server` 디렉토리에서 아래 명령어를 실행합니다.

```sh
# Export 스크립트 실행 (별도 구현 필요 시)
python scripts/ai_prompt_export.py
```

*(참고: 현재 시스템에는 UI 기반 Export가 주력이며, 스크립트 기반 Export는 별도 `scripts/ai_prompt_export.py`가 존재한다면 사용 가능합니다.)*

### Import (가져오기)

JSON 파일에 저장된 프롬프트를 DB에 반영합니다.

```sh
# 서버 디렉토리로 이동
cd server

# 최신 데이터 파일 자동 Import (또는 파일 지정)
python scripts/ai_prompt_import.py [파일경로]
```

### Import 로직 (중요)

스크립트 및 UI Import 기능은 다음과 같이 동작합니다:

1. **Merge (덮어쓰기/생성)**
   - Import 하려는 프롬프트와 **동일한 이름(Name)**을 가진 프롬프트가 DB에 있다면 내용을 **갱신(Update)**합니다.
   - DB에 없는 이름이라면 **새로 생성(Create)**합니다.

2. **속성 갱신**
   - Content, Description 등이 JSON 파일의 내용으로 변경됩니다.
   - UpdatedAt은 Import 시점으로 갱신됩니다.

> **주의**: Rule Import와 달리, Prompt Import는 **이전 버전을 보존하지 않고 덮어씁니다(Overwrite)**. 중요한 프롬프트는 Export를 통해 미리 백업해두시기 바랍니다.
