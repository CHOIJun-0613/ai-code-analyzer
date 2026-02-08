"""
서버 로그 다국어 지원 모듈

JSON 기반 메시지 카탈로그를 사용하여 로그 메시지를 번역합니다.
ContextVar 기반의 language 컨텍스트를 참조하여 스레드별 언어를 결정합니다.

사용법:
    from csa.utils.i18n import _t

    logger.info(_t("analysis.start", job_id=job_id))
"""
import json
import os
from typing import Dict, Optional

from csa.utils.context import get_language

# 메시지 카탈로그 캐시
_catalogs: Dict[str, Dict[str, str]] = {}
_loaded = False


def _load_catalogs() -> None:
    """locales 디렉토리에서 JSON 카탈로그를 로드합니다."""
    global _loaded
    if _loaded:
        return

    locales_dir = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "locales")

    for lang in ("ko", "en"):
        filepath = os.path.join(locales_dir, f"{lang}.json")
        try:
            with open(filepath, "r", encoding="utf-8") as f:
                _catalogs[lang] = json.load(f)
        except FileNotFoundError:
            _catalogs[lang] = {}
        except json.JSONDecodeError:
            _catalogs[lang] = {}

    _loaded = True


def _t(key: str, **kwargs) -> str:
    """
    현재 컨텍스트의 언어로 메시지를 번역합니다.

    Args:
        key: 메시지 키 (예: "analysis.start")
        **kwargs: 포맷 변수 (예: job_id="123")

    Returns:
        번역된 메시지 문자열. 키가 없으면 키 자체를 반환합니다.
    """
    _load_catalogs()

    lang = get_language()
    catalog = _catalogs.get(lang, {})

    # 현재 언어에서 찾기
    template = catalog.get(key)

    # fallback: 한국어 → 영어 → 키 반환
    if template is None:
        if lang != "ko":
            template = _catalogs.get("ko", {}).get(key)
        if template is None:
            template = _catalogs.get("en", {}).get(key)
        if template is None:
            # 키를 그대로 반환 (kwargs가 있으면 포맷 시도)
            template = key

    try:
        return template.format(**kwargs) if kwargs else template
    except (KeyError, IndexError):
        return template


def reload_catalogs() -> None:
    """카탈로그를 강제로 다시 로드합니다."""
    global _loaded
    _loaded = False
    _catalogs.clear()
    _load_catalogs()


__all__ = ["_t", "reload_catalogs"]
