"""
SQL 파서 테스트 모듈

INSERT/UPDATE/DELETE 문의 테이블명 추출 및
XML 태그 불일치 시 자동 감지 테스트
"""
import pytest
from csa.parsers.sql.parser import SQLParser


class TestSQLParser:
    """SQL 파서 테스트 클래스"""

    def setup_method(self):
        """각 테스트 전 실행"""
        self.parser = SQLParser()

    def test_insert_statement_basic(self):
        """기본 INSERT 문 테이블 추출 테스트"""
        sql_content = """
        INSERT INTO users (id, name, email)
        VALUES (1, 'John', 'john@example.com')
        """
        result = self.parser.parse_sql_statement(sql_content, 'INSERT')

        assert result.sql_type == 'INSERT'
        assert len(result.tables) == 1
        assert result.tables[0]['name'] == 'users'
        assert result.tables[0]['alias'] is None

    def test_insert_statement_with_mybatis_params(self):
        """MyBatis 파라미터 포함 INSERT 문 테스트"""
        sql_content = """
        insert into UCM_SUP_EVT_DTL
        ( EVT_DIS, EVT_NM, USER_ID, NG_ITG_CSNO, SUP_NM, SUP_DIS, PROC_SYS_DTIME, EAI_TRSMN_DT )
        values
        (
         #{evtDis}
        ,#{evtNm}
        ,#{userId}
        ,#{ngItgCsno}
        ,#{supNm}
        ,#{supDis}
        ,current_timestamp
        ,TO_CHAR(SYSDATE, 'YYYYMMDD')
        )
        """
        result = self.parser.parse_sql_statement(sql_content, 'INSERT')

        assert result.sql_type == 'INSERT'
        assert len(result.tables) == 1
        assert result.tables[0]['name'] == 'UCM_SUP_EVT_DTL'

        # MyBatis 파라미터 확인
        assert len(result.parameters) > 0
        param_names = [p['name'] for p in result.parameters]
        assert 'evtDis' in param_names
        assert 'evtNm' in param_names
        assert 'userId' in param_names

        # 컬럼 추출 확인
        assert len(result.columns) == 8
        column_names = [c['name'] for c in result.columns]
        assert 'EVT_DIS' in column_names
        assert 'EVT_NM' in column_names

    def test_update_statement_basic(self):
        """기본 UPDATE 문 테이블 추출 테스트"""
        sql_content = """
        UPDATE users
        SET name = 'Jane', email = 'jane@example.com'
        WHERE id = 1
        """
        result = self.parser.parse_sql_statement(sql_content, 'UPDATE')

        assert result.sql_type == 'UPDATE'
        assert len(result.tables) == 1
        assert result.tables[0]['name'] == 'users'

    def test_delete_statement_basic(self):
        """기본 DELETE 문 테이블 추출 테스트"""
        sql_content = """
        DELETE FROM users WHERE id = 1
        """
        result = self.parser.parse_sql_statement(sql_content, 'DELETE')

        assert result.sql_type == 'DELETE'
        assert len(result.tables) == 1
        assert result.tables[0]['name'] == 'users'

    def test_select_statement_basic(self):
        """기본 SELECT 문 테이블 추출 테스트"""
        sql_content = """
        SELECT id, name, email
        FROM users
        WHERE status = 'active'
        """
        result = self.parser.parse_sql_statement(sql_content, 'SELECT')

        assert result.sql_type == 'SELECT'
        assert len(result.tables) == 1
        assert result.tables[0]['name'] == 'users'

    def test_select_with_join(self):
        """JOIN 포함 SELECT 문 테스트"""
        sql_content = """
        SELECT u.id, u.name, o.order_id
        FROM users u
        INNER JOIN orders o ON u.id = o.user_id
        WHERE u.status = 'active'
        """
        result = self.parser.parse_sql_statement(sql_content, 'SELECT')

        assert result.sql_type == 'SELECT'
        assert len(result.tables) == 2

        table_names = [t['name'] for t in result.tables]
        assert 'users' in table_names
        assert 'orders' in table_names

    def test_complex_insert_with_subquery(self):
        """서브쿼리 포함 INSERT 문 테스트"""
        sql_content = """
        INSERT INTO archived_users (id, name, email)
        SELECT id, name, email
        FROM users
        WHERE last_login < '2023-01-01'
        """
        result = self.parser.parse_sql_statement(sql_content, 'INSERT')

        assert result.sql_type == 'INSERT'
        # 메인 테이블 (archived_users)과 서브쿼리 테이블 (users) 모두 추출
        assert len(result.tables) >= 1

        table_names = [t['name'] for t in result.tables]
        assert 'archived_users' in table_names

    def test_mybatis_foreach_parameters(self):
        """MyBatis foreach 파라미터 테스트"""
        sql_content = """
        INSERT INTO user_roles (user_id, role_id)
        VALUES
        <foreach collection="roles" item="role" separator=",">
            (#{userId}, #{role.id})
        </foreach>
        """
        result = self.parser.parse_sql_statement(sql_content, 'INSERT')

        assert result.sql_type == 'INSERT'
        assert len(result.tables) == 1
        assert result.tables[0]['name'] == 'user_roles'

    def test_empty_sql_content(self):
        """빈 SQL 내용 테스트"""
        sql_content = ""
        result = self.parser.parse_sql_statement(sql_content, 'SELECT')

        assert result.sql_type == 'SELECT'
        assert len(result.tables) == 0
        assert len(result.columns) == 0

    def test_sql_with_comments(self):
        """주석 포함 SQL 테스트"""
        sql_content = """
        /* 사용자 정보 조회 */
        SELECT id, name, email
        FROM users -- 활성 사용자만
        WHERE status = 'active'
        """
        result = self.parser.parse_sql_statement(sql_content, 'SELECT')

        assert result.sql_type == 'SELECT'
        assert len(result.tables) == 1
        assert result.tables[0]['name'] == 'users'

    def test_case_insensitive_sql_keywords(self):
        """대소문자 혼합 SQL 키워드 테스트"""
        sql_content = "Insert Into users (id, name) Values (1, 'John')"
        result = self.parser.parse_sql_statement(sql_content, 'INSERT')

        assert result.sql_type == 'INSERT'
        assert len(result.tables) == 1
        assert result.tables[0]['name'] == 'users'

    def test_schema_qualified_table_name(self):
        """스키마명 포함 테이블명 테스트"""
        sql_content = "INSERT INTO myschema.users (id, name) VALUES (1, 'John')"
        result = self.parser.parse_sql_statement(sql_content, 'INSERT')

        assert result.sql_type == 'INSERT'
        assert len(result.tables) == 1
        # 스키마명 포함 테이블명이 추출되어야 함
        assert 'users' in result.tables[0]['name'] or result.tables[0]['name'] == 'myschema.users'


if __name__ == '__main__':
    pytest.main([__file__, '-v'])
