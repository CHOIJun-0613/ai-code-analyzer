# 클래스노드의 hashcode 속성 확인 및 추가

## 1. 개요

본 작업은 Class 노드에 `source_hashcode` 속성을 추가하여, 소스 코드 변경 여부를 감지하고 불필요한 재분석을 방지하는 것을 목표로 합니다.

## 2. 작업 범위

- **Backend (Server)**
  - `Class` 노드에 `source_hashcode` 속성 추가 (Graph DB).
  - Java 소스 코드 파싱 시 HashCode 계산 및 저장 로직 구현.
  - 재분석 시 기존 HashCode와 비교하여 변경사항이 없으면 분석을 Skip하는 로직 구현.
  - API 응답에 `source_hashcode` 포함 확인.
- **Frontend (Client)**
  - 클래스 상세 화면에 HashCode 표시 (이미 구현됨, 확인 및 테스트).

## 3. 상세 설계

### 3.1 Backend 변경 (Python)

- **파일**: `server/csa/services/java_analysis/project.py` (또는 실제 파싱 로직 위치)
- **로직**:
    1. Java 파일 내용을 읽은 직후 `SHA-256` 해시를 계산합니다.
    2. DB에서 해당 클래스의 기존 `source_hashcode`를 조회합니다.
    3. **비교**:
        - 기존 Hash == 현재 Hash: "소스코드가 변경되지 않아서 Skip합니다." 로그를 남기고 파싱 및 분석 과정을 중단(Early Return).
        - 기존 Hash != 현재 Hash: AST 파싱 및 분석 진행.
    4. 분석 완료 후 `Class` 노드 저장 시 `source_hashcode` 속성을 포함하여 `MERGE`.

### 3.2 Frontend 변경 (React)

- **파일**: `client/src/pages/ClassDetails.tsx`
- **확인 사항**:
  - `ClassData` 인터페이스에 `source_hashcode` 필드 존재 여부.
  - 화면 렌더링 로직 (`activeTab === 'source'` 영역)에 HashCode 표시 여부.
  - 다국어 처리 (`classDetails.sourceHash`) 확인.

## 4. 검증 계획

1. **초기 분석**: 프로젝트 분석 실행 후 Neo4j 브라우저에서 `Class` 노드에 `source_hashcode` 속성이 생성되었는지 확인.
2. **재분석 (변경 없음)**: 동일 프로젝트 재분석 시, 로그에 "Skip" 메시지가 나타나는지 확인.
3. **재분석 (변경 있음)**: 소스 코드 수정 후 재분석 시, HashCode가 업데이트되고 분석이 수행되는지 확인.
4. **UI 확인**: 클래스 상세 화면 소스 탭 상단에 HashCode가 정상적으로 표시되는지 확인.
