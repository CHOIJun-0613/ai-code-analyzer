// Community는 기본 DB 이름을 compose에서 refinerdb 지정하여 사용
// 사용자 관리 명령은 system DB에서 실행
DROP USER csaadmin IF EXISTS;

CREATE USER csaadmin
  SET PASSWORD '#csapass123'
  CHANGE NOT REQUIRED;

// Community Edition에서는 GRANT ROLE 명령 불가 (기본 권한 사용)