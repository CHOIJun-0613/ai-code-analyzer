"""
기존 MyBatisMapper 노드에 대한 Package/Project CONTAINS 관계 생성 스크립트

Usage:
    python -m scripts.migrate_mapper_relationships
"""

import sys
from pathlib import Path

# Add project root to path
project_root = Path(__file__).parent.parent
sys.path.insert(0, str(project_root))

from app.core.database import get_db
from csa.utils.logger import get_logger

logger = get_logger(__name__)


def migrate_mapper_relationships():
    """기존 MyBatisMapper 노드들에 Package/Project CONTAINS 관계를 추가합니다."""

    pool = get_db()

    with pool.session() as session:
        # 1. 기존 Mapper 노드 개수 확인
        count_result = session.run("MATCH (m:MyBatisMapper) RETURN count(m) as total")
        total_mappers = count_result.single()["total"]
        logger.info(f"총 {total_mappers}개의 Mapper 노드를 발견했습니다.")

        if total_mappers == 0:
            logger.info("마이그레이션할 Mapper 노드가 없습니다.")
            return

        # 2. Package-[:CONTAINS]->Mapper 관계 생성
        logger.info("Package-[:CONTAINS]->Mapper 관계 생성 중...")
        package_result = session.run("""
            MATCH (m:MyBatisMapper)
            WHERE m.package_name IS NOT NULL AND m.package_name <> ''
            MATCH (pkg:Package {name: m.package_name})
            MERGE (pkg)-[:CONTAINS]->(m)
            RETURN count(*) as created
        """)
        package_relations = package_result.single()["created"]
        logger.info(f"Package-[:CONTAINS]->Mapper 관계 {package_relations}개 생성 완료")

        # 3. Project-[:CONTAINS]->Mapper 관계 생성
        logger.info("Project-[:CONTAINS]->Mapper 관계 생성 중...")
        project_result = session.run("""
            MATCH (m:MyBatisMapper)
            WHERE m.project_name IS NOT NULL AND m.project_name <> ''
            MATCH (proj:Project {name: m.project_name})
            MERGE (proj)-[:CONTAINS]->(m)
            RETURN count(*) as created
        """)
        project_relations = project_result.single()["created"]
        logger.info(f"Project-[:CONTAINS]->Mapper 관계 {project_relations}개 생성 완료")

        # 4. 검증: 관계가 없는 Mapper 노드 확인
        orphan_result = session.run("""
            MATCH (m:MyBatisMapper)
            WHERE NOT ((:Package)-[:CONTAINS]->(m))
            RETURN m.name as mapper_name, m.package_name as package_name, m.project_name as project_name
            LIMIT 10
        """)
        orphans = list(orphan_result)

        if orphans:
            logger.warning(f"Package 관계가 없는 Mapper 노드 {len(orphans)}개 발견:")
            for orphan in orphans:
                logger.warning(f"  - {orphan['mapper_name']} (package: {orphan['package_name']}, project: {orphan['project_name']})")
        else:
            logger.info("모든 Mapper 노드가 Package와 연결되었습니다.")

        logger.info("마이그레이션 완료!")
        logger.info(f"요약: {total_mappers}개 Mapper, {package_relations}개 Package 관계, {project_relations}개 Project 관계")


if __name__ == "__main__":
    try:
        migrate_mapper_relationships()
    except Exception as e:
        logger.error(f"마이그레이션 실패: {e}", exc_info=True)
        sys.exit(1)
