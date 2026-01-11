from typing import Any, List, Dict

from fastapi import APIRouter, HTTPException, Body, Depends

from csa.services.analysis_rule_service import analysis_rule_service
from csa.models.entities.analysis_rule import AnalysisRule

router = APIRouter()

@router.get("/", response_model=List[AnalysisRule])
def read_rules(active_only: bool = False) -> Any:
    """
    모든 분석 규칙을 조회한다.
    active_only=True일 경우 사용 가능한(useYn=True) 규칙만 반환한다.
    """
    try:
        return analysis_rule_service.get_all_rules(active_only=active_only)
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.post("/", response_model=AnalysisRule)
def create_rule(
    name: str = Body(..., embed=True),
    description: str = Body("", embed=True),
    content: str = Body("", embed=True),
    useYn: bool = Body(True, embed=True),
    order: int = Body(0, embed=True),
    user_id: str = "admin" # TODO: Extract from token
) -> Any:
    """
    새로운 분석 규칙을 생성한다.
    """
    try:
        return analysis_rule_service.create_rule(name, description, content, useYn, order, user_id)
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.put("/reorder", response_model=Dict[str, str])
def reorder_rules(
    order_map: List[Dict[str, int]] = Body(...)
) -> Any:
    """
    여러 규칙의 실행 순서를 일괄 변경한다.
    Body 예시: [{"id": 123, "order": 1}, {"id": 124, "order": 2}]
    """
    try:
        if analysis_rule_service.update_rule_orders(order_map):
            return {"message": "Order updated successfully"}
        else:
             raise HTTPException(status_code=500, detail="Failed to update rule orders")
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.put("/{rule_id}", response_model=AnalysisRule)
def update_rule(
    rule_id: int,
    name: str = Body(None, embed=True),
    description: str = Body(None, embed=True),
    content: str = Body(None, embed=True),
    useYn: bool = Body(None, embed=True),
    order: int = Body(None, embed=True),
    user_id: str = "admin"
) -> Any:
    """
    기존 분석 규칙을 수정한다.
    """
    try:
        # 1. Get existing rule to merge fields if optional
        existing_rule = analysis_rule_service.get_rule_by_id(rule_id)
        if not existing_rule:
            raise HTTPException(status_code=404, detail="Rule not found")
        
        # Merge logic (use existing value if None provided)
        # However, Body defaults can be handled differently. 
        # Here we assume client sends all fields or specific fields.
        # Simple implementation: use provided or existing
        
        updated_rule = analysis_rule_service.update_rule(
            rule_id, 
            name if name is not None else existing_rule.name, 
            description if description is not None else existing_rule.description, 
            content if content is not None else existing_rule.content, 
            useYn if useYn is not None else existing_rule.useYn,
            order if order is not None else existing_rule.order,
            user_id
        )
        return updated_rule
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.delete("/{rule_id}")
def delete_rule(rule_id: int) -> Any:
    """
    분석 규칙을 삭제한다.
    """
    try:
        if analysis_rule_service.delete_rule(rule_id):
            return {"message": "Rule deleted successfully"}
        else:
            raise HTTPException(status_code=404, detail="Rule not found")
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@router.post("/import", response_model=Dict[str, int])
def import_rules(
    rules: List[Dict[str, Any]] = Body(...),
    user_id: str = "admin" # TODO: Extract from token
) -> Any:
    """
    분석 규칙을 일괄 등록(Import)한다.
    기존에 동일한 이름의 규칙이 있다면 비활성화(Soft Delete)하고 새 버전을 생성한다.
    """
    try:
        return analysis_rule_service.import_rules(rules, user_id)
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))
