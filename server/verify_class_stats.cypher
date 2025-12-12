// Class 노드 LOC 값 확인 (상위 10개)
MATCH (c:Class {project_name: 'sml-fns-online'})
WHERE c.PLOC IS NOT NULL
RETURN c.name AS class_name,
       c.PLOC,
       c.LLOC,
       c.CLOC,
       c.cognitive_complexity
ORDER BY c.PLOC DESC
LIMIT 10;

// Class 노드 LOC 통계 집계
MATCH (c:Class {project_name: 'sml-fns-online'})
WHERE c.PLOC IS NOT NULL
RETURN COUNT(c) AS total_classes,
       SUM(c.PLOC) AS sum_ploc,
       SUM(c.LLOC) AS sum_lloc,
       SUM(c.CLOC) AS sum_cloc,
       AVG(c.PLOC) AS avg_ploc,
       AVG(c.cognitive_complexity) AS avg_complexity;

// Project 통계와 Class 합계 비교 (검증)
MATCH (p:Project {name: 'sml-fns-online'})
MATCH (c:Class {project_name: 'sml-fns-online'})
WITH p,
     SUM(c.PLOC) AS class_ploc_sum,
     SUM(c.LLOC) AS class_lloc_sum,
     SUM(c.CLOC) AS class_cloc_sum
RETURN p.name AS project_name,
       p.total_PLOC AS project_ploc,
       class_ploc_sum,
       p.total_LLOC AS project_lloc,
       class_lloc_sum,
       p.total_CLOC AS project_cloc,
       class_cloc_sum,
       CASE
         WHEN p.total_PLOC = class_ploc_sum
         THEN '✅ MATCH'
         ELSE '❌ MISMATCH'
       END AS validation;
