# AI Code Analyzer

AI Code Analyzer는 Java/DB 정적 분석 결과를 Neo4j에 적재하고, 호출 관계/CRUD/영향도 분석 및 다이어그램 생성을 지원하는 웹 애플리케이션입니다.

## 문서 안내
- 백엔드 문서: [`server/README.md`](server/README.md)
- 프론트엔드 문서: [`client/README.md`](client/README.md)

루트 문서는 전체 실행 흐름과 진입점만 다루고, 상세 설정/명령은 각 하위 문서를 기준으로 관리합니다.

## 저장소 구조
```text
ai-code-analyzer/
├─ server/         # FastAPI + CSA CLI 분석 엔진
├─ client/         # React + Vite + TypeScript 프론트엔드
├─ tests/          # 루트 테스트(단위/통합/계약)
├─ commands/       # Windows 배치 실행 스크립트
├─ neo4j/          # 로컬 Neo4j 운영 보조 파일
└─ docs/           # 프로젝트 문서
```

## 사전 요구사항
- Python 3.10+
- Node.js 18+
- Neo4j 5.x

## 빠른 시작
1. 백엔드 실행
```bash
cd server
python -m venv .venv
.venv\Scripts\activate
pip install -r requirements.txt
copy env.example .env
python run_server.py
```

2. 프론트엔드 실행 (새 터미널)
```bash
cd client
npm install
npm run dev
```

3. 접속
- 클라이언트: `http://localhost:5173`
- API 문서: `http://localhost:8000/docs`

## Windows 배치 실행
- 서버: `start_server.bat`
- 클라이언트: `start_client.bat`

## 테스트
- 서버 테스트:
```bash
cd server
pytest
```

- 루트 테스트:
```bash
pytest tests/unit
pytest tests/integration
pytest tests/contract
```

## 운영 주의사항
- 대용량 분석 대상(`target_src/`)은 시간/메모리 비용이 큽니다.
- 재분석 시 필요하면 `analyze --clean` 옵션을 검토하세요.
- `.env`, API 키, 토큰 등 민감정보는 커밋하지 마세요.

## 라이선스
MIT
