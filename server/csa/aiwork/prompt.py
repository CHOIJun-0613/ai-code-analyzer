from csa.services.ai_prompt_service import ai_prompt_service
from csa.aiwork.default_prompts import DEFAULT_PROMPTS as PROMPTS

__all__ = ["PROMPTS", "get_prompt", "initialize_prompts"]

# Central registry for prompt templates shared across modules.
# NOTE: This PROMPTS dictionary is now imported from default_prompts.py
# It is primarily used for DEFAULT values and fallback.
# The actual prompts are managed by AiPromptService via Neo4j.

def initialize_prompts():
    """Initialize cached prompts from DB."""
    ai_prompt_service.initialize_prompts()


def get_prompt(name: str) -> str:
    """Return the prompt text registered under the given name."""
    try:
        # DB-backed service with caching
        return ai_prompt_service.get_prompt(name)
    except KeyError as exc:
        raise KeyError(f"Unregistered prompt requested: {name}") from exc
