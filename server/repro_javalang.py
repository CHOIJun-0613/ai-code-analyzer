
from csa.vendor import javalang

code = """
public class Test {
	/**
	 * 통장쪼개기 서비스에 가입 가능한 계좌 목록 조회 컨트롤러
	 * 
	 * @param input 계좌.정보.컨트롤러.입력.IO
	 * @return 계좌.정보.컨트롤러.출력.IO
	 */
	@ApiOperation(value = "계좌.목록.조회", notes = "")
	@PostMapping(value = "/selectActlist")
	@BxmCategory(logicalName = "계좌.목록.조회", description = "통장쪼개기 서비스에 가입 가능한 계좌 목록 조회 컨트롤러", author = "90191355")
	public PBPPbokSpceBscMngSelectActlist_ODT selectActlist(@ApiParam(value = "input", example = "") @RequestBody PBPPbokSpceBscMngSelectActlist_IDT input) {
		pBPPbokSpceBscMng_SVC = WFApplicationContext.getBean(pBPPbokSpceBscMng_SVC, PBPPbokSpceBscMng_SVC.class);
		PBPPbokSpceBscMngSelectActlist_ODT result = pBPPbokSpceBscMng_SVC.selectAllact(input);
		return result;
	}
}
"""

tree = javalang.parse.parse(code)

for path, node in tree.filter(javalang.tree.MethodDeclaration):
    print(f"Method: {node.name}")
    print(f"Method Position: {node.position}")
    if node.annotations:
        for ann in node.annotations:
            print(f"Annotation: {ann.name}, Position: {ann.position}")
