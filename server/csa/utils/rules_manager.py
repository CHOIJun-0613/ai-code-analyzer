"""
규칙 파일 중앙 관리자
애플리케이션 시작 시 모든 규칙 파일을 한 번만 로드하고 전역적으로 재사용
"""

import os
from typing import Dict, Any, Optional, List
from threading import Lock
from csa.utils.logger import get_logger


class RulesManager:
    """규칙 파일 중앙 관리자 - 싱글톤 패턴"""
    
    _instance: Optional['RulesManager'] = None
    _initialized = False
    
    def __new__(cls):
        if cls._instance is None:
            cls._instance = super().__new__(cls)
        return cls._instance
    
    def __init__(self):
        if self._initialized:
            return

        self._logger = None  # 지연 초기화: 첫 사용 시 생성
        self.rules_directory = "rules"
        # Project-specific keys removed. Global rule storage.
        self._logical_name_rules: Dict[str, Any] = {}
        self._description_rules: Dict[str, List[Any]] = {"class": [], "method": []}
        self._class_subtype_rules: List[Dict[str, Any]] = []
        self._rules_loaded = False
        self._lock = Lock()
        self._initialized = True

    @property
    def logger(self):
        """지연 초기화된 로거 프로퍼티"""
        if self._logger is None:
            self._logger = get_logger(__name__, command="rules_manager")
        return self._logger

    def load_rules(self):
        """모든 규칙 파일을 로드 (외부 호출용, Thread-safe)"""
        if not self._rules_loaded:
            with self._lock:
                if not self._rules_loaded:
                    self._load_all_rules_internal()
                    self._rules_loaded = True

    def _load_all_rules_internal(self):
        """실제 규칙 로딩 로직 (내부용)"""
        self.logger.info("분석 규칙 로드 시작...")
        
        # Reset rules
        self._logical_name_rules = {}
        self._description_rules = {"class": [], "method": []}
        self._class_subtype_rules = []

        if not os.path.exists(self.rules_directory):
            self.logger.warning(f"규칙 디렉토리가 존재하지 않습니다: {self.rules_directory}")
            return

        for filename in os.listdir(self.rules_directory):
            if not filename.endswith(".md"):
                continue
            
            file_path = os.path.join(self.rules_directory, filename)
            self._process_rule_file(file_path)

        self.logger.info(f"규칙 로드 완료 - 논리명: {len(self._logical_name_rules)}개 패턴, Description: {len(self._description_rules['class']) + len(self._description_rules['method'])}개 규칙, Class Subtype: {len(self._class_subtype_rules)}개 규칙")

    def _process_rule_file(self, file_path: str):
        """단일 규칙 파일을 읽어 타입을 판별하고 병합"""
        try:
            with open(file_path, 'r', encoding='utf-8') as f:
                content = f.read()
            
            # Content-based detection
            if "sub-type 판단" in content and "sub-type 값 저장" in content:
                # Class Subtype Rule
                rules = self._parse_class_subtype_rules(file_path) # Reuse parser, but change return type if needed
                self._class_subtype_rules.extend(rules)
                self.logger.debug(f"Class Subtype 규칙 로드: {file_path}")
                
            elif "**@Annotation**" in content or "description 파라미터" in content:
                # Description Rule
                # _parse_description_rules returns {"class": [], "method": []}
                rules = self._parse_description_rules(file_path)
                self._description_rules["class"].extend(rules.get("class", []))
                self._description_rules["method"].extend(rules.get("method", []))
                self.logger.debug(f"Description 규칙 로드: {file_path}")
                
            elif "/**" in content or "<!--" in content or "logical_name" in content:
                # Logical Name Rule
                rules = self._parse_logical_name_rules(file_path)
                # Merge into global dict
                for key, val in rules.items():
                    # If key exists, overwrite/update? Logical name rules are per-type templates.
                    # Usually keys are 'java_class', 'java_method' etc.
                    # If multiple files define same key, last one wins or we merge attributes?
                    # Simple merge:
                    self._logical_name_rules[key] = val
                self.logger.debug(f"Logical Name 규칙 로드: {file_path}")
            
            else:
                self.logger.debug(f"알 수 없는 규칙 파일 형식, 건너뜀: {file_path}")

        except Exception as e:
            self.logger.error(f"규칙 파일 처리 실패: {file_path}, {e}")
    
    # Removed old _load_... methods as they are replaced by unified scanning

    
    def _parse_logical_name_rules(self, rule_file: str) -> Dict[str, Any]:
        """논리명 규칙 파일 파싱 - 순환 import 방지를 위해 내부 구현"""
        try:
            with open(rule_file, 'r', encoding='utf-8') as f:
                content = f.read()
            
            # 기본 템플릿 정의
            DEFAULT_RULE_TEMPLATES = {
                "java_class": "/**\\n * {logical_name}\\n */",
                "java_method": "/**\\n * {logical_name}\\n */",
                "java_field": "/**\\n * {logical_name}\\n */",
                "mybatis_mapper": "<!-- {logical_name} -->",
                "xml_sql": "<!-- {logical_name} -->",
            }
            
            # 규칙 파싱 로직
            rules = {}
            for key, template in DEFAULT_RULE_TEMPLATES.items():
                rules[key] = {
                    "template": template,
                    "pattern": self._convert_template_to_pattern(template),
                    "description": "",
                }

            current_section = None
            for raw_line in content.split('\n'):
                line = raw_line.strip()
                if not line:
                    continue

                if line.startswith('##'):
                    if 'Class' in line:
                        current_section = 'java_class'
                    elif 'Method' in line:
                        current_section = 'java_method'
                    elif 'MyBatis' in line:
                        current_section = 'mybatis_mapper'
                    elif 'SQL' in line:
                        current_section = 'xml_sql'
                    elif 'Field' in line:
                        current_section = 'java_field'
                    else:
                        current_section = None
                    continue

                if not current_section:
                    continue

                if line.startswith('-') and ':' in line:
                    description = line.split(':', 1)[1].strip()
                    rules[current_section]['description'] = description
                    continue

                template = self._extract_template_from_line(line)
                if template:
                    pattern = self._convert_template_to_pattern(template)
                    if pattern:
                        rules[current_section]['template'] = template
                        rules[current_section]['pattern'] = pattern

            self.logger.debug(f"논리명 규칙 로드: {rule_file}")
            return rules
            
        except Exception as e:
            self.logger.error(f"논리명 규칙 파일 로드 실패: {rule_file}, {e}")
            return {}
    
    def _parse_description_rules(self, rule_file: str) -> Dict[str, Any]:
        """Description 규칙 파일 파싱 (Markdown)"""
        import re
        rules = {"class": [], "method": []}

        try:
            with open(rule_file, 'r', encoding='utf-8') as f:
                content = f.read()

            current_target = None
            
            # Split by headers (e.g., ## 1. Class...)
            lines = content.split('\n')
            for line in lines:
                line = line.strip()
                if not line:
                    continue

                # Header detection
                if line.startswith('##'):
                    if 'Class' in line:
                        current_target = 'class'
                    elif 'Method' in line:
                        current_target = 'method'
                    else:
                        current_target = None
                    continue

                if not current_target:
                    continue

                # Pattern detection: **@Annotation** ... **parameter**
                # Example: ... **@BxmCategory** annotation의 **description** ...
                
                # Extract annotation name
                # Look for **@Name**
                annotation_match = re.search(r'\*\*@(\w+)\*\*', line)
                if annotation_match:
                    annotation = annotation_match.group(1)
                    
                    # Extract parameter (default to 'description' if found, or try to find extraction target)
                    # The rule file says "**description**"
                    param = "description" # Default
                    param_match = re.search(r'\*\*(\w+)\*\*.*값', line) # Look for bold word before 'value' equivalent
                    if param_match and param_match.group(1) != annotation:
                         # This is heuristic. For now, the rule file explicitly says 'description'.
                         pass
                    
                    rule_entry = {
                        "annotation": annotation,
                        "parameter": "description", # Hardcoded for now based on rule002 pattern
                        "description": line
                    }
                    rules[current_target].append(rule_entry)

            self.logger.debug(f"Description 규칙 로드 완료: {rules}")
            return rules

        except Exception as e:
            self.logger.error(f"Description 규칙 파일 로드 실패: {rule_file}, {e}")
            return {"class": [], "method": []}

    def _load_class_subtype_rules(self):
        """Class sub-type 추출 규칙들 로드"""
        rule_file = f"{self.rules_directory}/rule003_extraction_class_subtype.md"
        if os.path.exists(rule_file):
            self._class_subtype_rules["default"] = self._parse_class_subtype_rules(rule_file)

    def _parse_class_subtype_rules(self, rule_file: str) -> List[Dict[str, Any]]:
        """Class sub-type 규칙 파일 파싱 (Markdown)"""
        import re
        rules = []
        
        try:
            with open(rule_file, 'r', encoding='utf-8') as f:
                content = f.read()

            # Sections split by "## "
            sections = re.split(r'(\n|^)## ', content)
            
            for section in sections:
                if not section.strip():
                    continue
                    
                lines = section.strip().split('\n')
                header = lines[0].strip()
                body = '\n'.join(lines[1:])
                
                # Skip non-rule sections (e.g. 5-3, 6, 1)
                # But we need to parse them.
                # Regex for Rule Header: "1. Controller...", "5. dto..."
                
                # Check for "sub-type 값 저장"
                subtype_match = re.search(r"\*\*'?sub-type'?\*\*.*\*\*`?(\w+)`?\*\*", body)
                if not subtype_match:
                     # Check for explicit code block "sub-type: **`dto`**" patterns in examples?
                     # No, rely on the description list.
                     continue
                
                subtype_value = subtype_match.group(1)
                
                # Annotations extraction
                # "**@RestController** 또는 **@Controller**"
                # Find all **@Name**
                annotations = re.findall(r'\*\*@(\w+)\*\*', body)
                
                # DTO Suffixes extraction (Specific to DTO section)
                suffixes = []
                if "접미사" in body or "DTO," in body:
                     # Heuristic for suffixes: "**DTO, DODT, ...**" or just list in text
                     # Look for the bold list of suffixes
                     # In file: "**DTO, DODT, DIDT, ODT, IDT, VO, Entity, Grid**"
                     suffix_match = re.search(r'\*\*([A-Za-z0-9, ]+)\*\*', body)
                     if suffix_match and "DTO" in suffix_match.group(1):
                         suffixes = [s.strip() for s in suffix_match.group(1).split(',')]
                
                # Determine condition (all vs any)
                # If "all" or "모두" present -> all. But rule003 says "또는" (or).
                # "5-1... @XmlType과 @XmlRootElement가..." (AND)
                condition = "any"
                if " 과 " in body or "과 " in body or " and " in body.lower():
                     condition = "all"
                if "또는" in body or " or " in body.lower():
                     condition = "any"
                
                # Special handling for DTO priority rule
                # We treat each "##" block as a rule. Priority is list order.
                
                rule = {
                    "subtype": subtype_value,
                    "annotations": annotations,
                    "suffixes": suffixes,
                    "condition": condition,
                    "header": header
                }
                rules.append(rule)

            self.logger.debug(f"Class sub-type 규칙 로드 완료: {len(rules)}개 규칙")
            return rules

        except Exception as e:
            self.logger.error(f"Class sub-type 규칙 파일 로드 실패: {rule_file}, {e}")
            return []
    
    def _extract_template_from_line(self, line: str) -> str:
        """라인에서 {logical_name} 플레이스홀더가 포함된 템플릿을 추출"""
        import re
        
        template_match = re.search(r"'([^']*{logical_name}[^']*)'", line)
        if template_match:
            return template_match.group(1).replace('{local_name}', '{logical_name}')
        
        template_match = re.search(r'`([^`]*{logical_name}[^`]*)`', line)
        if template_match:
            return template_match.group(1).replace('{local_name}', '{logical_name}')
        
        if '{logical_name}' in line and line.strip().startswith('<!--'):
            return line.strip()
        
        if '{local_name}' in line and line.strip().startswith('<!--'):
            return line.strip().replace('{local_name}', '{logical_name}')
        
        return None
    
    def _convert_template_to_pattern(self, template: str) -> str:
        """템플릿 문자열을 정규식 패턴으로 변환"""
        import re
        
        placeholder = '{logical_name}'
        if placeholder not in template:
            return None

        normalized = template.strip().replace('\\n', '\n')
        segments = normalized.split(placeholder)
        escaped_segments = [re.escape(segment) for segment in segments]
        pattern = '(?P<logical_name>.+?)'.join(escaped_segments)

        pattern = pattern.replace('\n', r'\s*')
        pattern = re.sub(r'(\\ )+', r'\\s*', pattern)
        pattern = pattern.replace(r'\t', r'\s*')
        return pattern
    
    def get_logical_name_rules(self, project_name: str = None) -> Dict[str, Any]:
        """논리명 규칙 반환 (Project Agnostic)"""
        # Worker processes need auto-load
        if not self._rules_loaded:
            self.load_rules()
        return self._logical_name_rules

    def get_description_rules(self, project_name: str = None) -> Dict[str, Any]:
        """Description 규칙 반환 (Project Agnostic)"""
        if not self._rules_loaded:
            self.load_rules()
        return self._description_rules

    def get_class_subtype_rules(self, project_name: str = None) -> List[Dict[str, Any]]:
        """Class sub-type 규칙 반환 (Project Agnostic)"""
        if not self._rules_loaded:
            self.load_rules()
        return self._class_subtype_rules

    def reload_rules(self):
        """규칙 파일들 재로드"""
        self.logger.info("규칙 파일들 재로드 중...")
        self._rules_loaded = False
        self.load_rules()


# 전역 인스턴스
rules_manager = RulesManager()
