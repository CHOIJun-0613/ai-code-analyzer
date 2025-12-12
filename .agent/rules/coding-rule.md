---
trigger: always_on
---

## 코딩 스타일 및 네이밍
- PEP 8(4칸 들여쓰기, snake_case 함수·모듈, PascalCase 클래스)을 지키고, 기존과 어울리는 간결한 독스트링을 유지할 것 
- 명시적 타입 힌트와 pydantic 모델을 적극 활용하고, 전역 대신 헬퍼를 통해 의존성을 주입할 것
- 환경 변수는 `.env`와 헬퍼를 통해 주입하며, 서비스나 CLI 계층에 경로나 자격 증명을 하드코딩하지 않는다

## Server module을 실행할경우
- 가상환경을 먼저 activation하고 나서 실행한