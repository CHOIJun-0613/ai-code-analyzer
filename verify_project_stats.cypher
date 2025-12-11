// Project 노드 통계 확인
MATCH (p:Project {name: 'sml-fns-online'})
RETURN p.name AS project_name,
       p.total_file_count,
       p.total_java_file_count,
       p.total_xml_file_count,
       p.total_etc_file_count,
       p.total_PLOC,
       p.total_LLOC,
       p.total_CLOC,
       p.number_of_files AS legacy_file_count

// 예상 결과:
// total_file_count: 1406
// total_java_file_count: 739
// total_xml_file_count: 0
// total_etc_file_count: 667
// total_PLOC: 467787
// total_LLOC: 336457
// total_CLOC: 83491
