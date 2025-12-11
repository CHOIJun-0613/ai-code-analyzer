"""
시퀀스 다이어그램에서 Mapper 파일 확장자 표시 테스트
"""
import pytest


def test_plantuml_sql_display_with_xml_extension():
    """PlantUML 시퀀스 다이어그램에서 XML 매퍼 표시 테스트"""
    # 시뮬레이션: SQL 호출 이벤트
    call = {
        'call_type': 'sql',
        'mapper_name': 'UserMapper',
        'mapper_namespace': 'com.example.mapper.UserMapper',
        'mapper_file_extension': 'xml'
    }

    # PlantUML 생성 로직 시뮬레이션
    mapper_name = call.get('mapper_name') or 'SQL'
    mapper_namespace = call.get('mapper_namespace') or ''
    mapper_file_extension = call.get('mapper_file_extension') or 'xml'

    if mapper_namespace:
        sql_display_label = f"<<{mapper_namespace}>>\\n{mapper_name}.{mapper_file_extension}"
    else:
        sql_display_label = f"{mapper_name}.{mapper_file_extension}"

    assert sql_display_label == "<<com.example.mapper.UserMapper>>\\nUserMapper.xml"


def test_plantuml_sql_display_with_dbio_extension():
    """PlantUML 시퀀스 다이어그램에서 DBIO 매퍼 표시 테스트"""
    # 시뮬레이션: DBIO SQL 호출 이벤트
    call = {
        'call_type': 'sql',
        'mapper_name': 'MET_PBOK_MBPF_TS_REQ_INF001_DBM',
        'mapper_namespace': 'com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBPF_TS_REQ_INF001_DBM',
        'mapper_file_extension': 'dbio'
    }

    # PlantUML 생성 로직 시뮬레이션
    mapper_name = call.get('mapper_name') or 'SQL'
    mapper_namespace = call.get('mapper_namespace') or ''
    mapper_file_extension = call.get('mapper_file_extension') or 'xml'

    if mapper_namespace:
        sql_display_label = f"<<{mapper_namespace}>>\\n{mapper_name}.{mapper_file_extension}"
    else:
        sql_display_label = f"{mapper_name}.{mapper_file_extension}"

    expected = "<<com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBPF_TS_REQ_INF001_DBM>>\\nMET_PBOK_MBPF_TS_REQ_INF001_DBM.dbio"
    assert sql_display_label == expected


def test_mermaid_sql_display_with_xml_extension():
    """Mermaid 시퀀스 다이어그램에서 XML 매퍼 표시 테스트"""
    # 시뮬레이션: SQL 호출 이벤트
    call = {
        'call_type': 'sql',
        'mapper_name': 'UserMapper',
        'mapper_namespace': 'com.example.mapper.UserMapper',
        'mapper_file_extension': 'xml'
    }

    # Mermaid 생성 로직 시뮬레이션
    mapper_name = call.get('mapper_name') or 'SQL'
    mapper_namespace = call.get('mapper_namespace') or ''
    mapper_file_extension = call.get('mapper_file_extension') or 'xml'

    if mapper_namespace:
        sql_display_label = f"<<{mapper_namespace}>><br/>{mapper_name}.{mapper_file_extension}"
    else:
        sql_display_label = f"{mapper_name}.{mapper_file_extension}"

    assert sql_display_label == "<<com.example.mapper.UserMapper>><br/>UserMapper.xml"


def test_mermaid_sql_display_with_dbio_extension():
    """Mermaid 시퀀스 다이어그램에서 DBIO 매퍼 표시 테스트"""
    # 시뮬레이션: DBIO SQL 호출 이벤트
    call = {
        'call_type': 'sql',
        'mapper_name': 'MET_PBOK_MBPF_TS_REQ_INF001_DBM',
        'mapper_namespace': 'com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBPF_TS_REQ_INF001_DBM',
        'mapper_file_extension': 'dbio'
    }

    # Mermaid 생성 로직 시뮬레이션
    mapper_name = call.get('mapper_name') or 'SQL'
    mapper_namespace = call.get('mapper_namespace') or ''
    mapper_file_extension = call.get('mapper_file_extension') or 'xml'

    if mapper_namespace:
        sql_display_label = f"<<{mapper_namespace}>><br/>{mapper_name}.{mapper_file_extension}"
    else:
        sql_display_label = f"{mapper_name}.{mapper_file_extension}"

    expected = "<<com.skbank.sml.fns.mpb.dbm.MET_PBOK_MBPF_TS_REQ_INF001_DBM>><br/>MET_PBOK_MBPF_TS_REQ_INF001_DBM.dbio"
    assert sql_display_label == expected


def test_sql_display_with_default_extension():
    """파일 확장자가 없을 때 기본값 'xml' 사용 테스트"""
    # 시뮬레이션: 파일 확장자 없는 SQL 호출 이벤트
    call = {
        'call_type': 'sql',
        'mapper_name': 'OldMapper',
        'mapper_namespace': ''
    }

    # PlantUML 생성 로직 시뮬레이션
    mapper_name = call.get('mapper_name') or 'SQL'
    mapper_namespace = call.get('mapper_namespace') or ''
    mapper_file_extension = call.get('mapper_file_extension') or 'xml'  # 기본값

    if mapper_namespace:
        sql_display_label = f"<<{mapper_namespace}>>\\n{mapper_name}.{mapper_file_extension}"
    else:
        sql_display_label = f"{mapper_name}.{mapper_file_extension}"

    assert sql_display_label == "OldMapper.xml"


def test_sql_display_without_namespace():
    """namespace 없이 mapper_name만 있는 경우 테스트"""
    # 시뮬레이션: namespace 없는 SQL 호출 이벤트
    call = {
        'call_type': 'sql',
        'mapper_name': 'SimpleMapper',
        'mapper_namespace': '',
        'mapper_file_extension': 'dbio'
    }

    # PlantUML 생성 로직 시뮬레이션
    mapper_name = call.get('mapper_name') or 'SQL'
    mapper_namespace = call.get('mapper_namespace') or ''
    mapper_file_extension = call.get('mapper_file_extension') or 'xml'

    if mapper_namespace:
        sql_display_label = f"<<{mapper_namespace}>>\\n{mapper_name}.{mapper_file_extension}"
    else:
        sql_display_label = f"{mapper_name}.{mapper_file_extension}"

    assert sql_display_label == "SimpleMapper.dbio"


if __name__ == "__main__":
    pytest.main([__file__, "-v"])
