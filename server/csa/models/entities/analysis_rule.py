from pydantic import BaseModel
from typing import Optional

class AnalysisRule(BaseModel):
    """
    분석 규칙(Analysis Rule) 모델
    Neo4j의 :AnalysisRule 노드와 매핑된다.
    """
    
    id: int  # Neo4j ID
    name: str # 규칙명
    description: str # 규칙 설명
    content: str # 규칙 내용 (Markdown or Text)
    useYn: bool = True # 적용 여부
    order: int = 0 # 실행 순서
    
    updatedAt: str = "" # 수정 일시
    updatedBy: str = "" # 최종 수정자
    isSystem: bool = False # 시스템 기본 규칙 여부 (Label :System)
