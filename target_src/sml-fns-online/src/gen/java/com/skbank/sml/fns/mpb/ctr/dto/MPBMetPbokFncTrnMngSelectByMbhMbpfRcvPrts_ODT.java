/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.ctr.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.skbank.sml.fns.mpb.dto.MPBMbpfRcvstsList2Inq_DTO;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlType(propOrder={
	"metMngNo", "ebnkUtzpeNo", "metCtrStcd", "metCtrStcdNm", "metPbokDscd", "metPbokDscdNm", "metNm", "rcvBkwAcno", "cusUsgBkwAcno", "itcsno", "cusKorlNm", "cusBkpnNm", "ctBal", "payAvlBal", "pdcd"
	, "pdcdKorlNm", "prdKorlAbrNm", "rlfAcno", "mbpfPymDt", "mbpfPymCycd", "mbpfPymCycdNm", "mbpfPmtgtAm", "agmdCollDt", "advpeEno", "asmnlApvCd", "asmnlApvCdNm", "rppeChgRgsYn", "rppeChgRgsDt", "rppeChgVldDt", "metDscd"
	, "metDscdNm", "metRgsDt", "rgsTm", "metBscImgUrlNm", "metMbhRgsCnt", "metMbhScssCnt", "metRprsAlsNm", "metRprsMbhNm", "metRprsImgUrlNm", "totMbpfRcvAm", "totMbpfXmpAm", "mbpfPymMbhCn", "mbpfNpymMbhCn", "inqBasYm", "nxtMetMbhAlsNm"
	, "grid1Cnt", "dis1Grid", "metMbhSrno", "metMbhNm", "metMbhAlsNm", "metMbhDscd", "metMbhDscdNm", "metMbhImgUrlNm", "nxtInqTrnDt", "nxtTrnSrno", "grid2Cnt", "dis2Grid"
}, name="MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT")
@XmlRootElement(name="MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT")
@BxmCategory(logicalName="회원.회비.입금내역.조회.컨트롤러.출력.IO", description="") 
public class MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1158461574L;
	
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 전자뱅킹이용자번호
	 */
	@ApiModelProperty(
		name = "ebnkUtzpeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkUtzpeNo")
	@BxmOmm_Field(length=13, decimal=0, description="전자뱅킹이용자번호", align="left", fill="")
	private String ebnkUtzpeNo= "";
	
	
	/**
	 * 모임계약상태코드
	 */
	@ApiModelProperty(
		name = "metCtrStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metCtrStcd")
	@BxmOmm_Field(length=2, decimal=0, description="모임계약상태코드", align="left", fill="")
	private String metCtrStcd= "";
	
	
	/**
	 * 모임계약상태코드명
	 */
	@ApiModelProperty(
		name = "metCtrStcdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metCtrStcdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임계약상태코드명", align="left", fill="")
	private String metCtrStcdNm= "";
	
	
	/**
	 * 모임통장구분코드
	 */
	@ApiModelProperty(
		name = "metPbokDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임통장구분코드", align="left", fill="")
	private String metPbokDscd= "";
	
	
	/**
	 * 모임통장구분코드명
	 */
	@ApiModelProperty(
		name = "metPbokDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임통장구분코드명", align="left", fill="")
	private String metPbokDscdNm= "";
	
	
	/**
	 * 모임명
	 */
	@ApiModelProperty(
		name = "metNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임명", align="left", fill="")
	private String metNm= "";
	
	
	/**
	 * 입금전행계좌번호
	 */
	@ApiModelProperty(
		name = "rcvBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="입금전행계좌번호", align="left", fill="")
	private String rcvBkwAcno= "";
	
	
	/**
	 * 고객사용전행계좌번호
	 */
	@ApiModelProperty(
		name = "cusUsgBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusUsgBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="고객사용전행계좌번호", align="left", fill="")
	private String cusUsgBkwAcno= "";
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=11, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 고객한글명
	 */
	@ApiModelProperty(
		name = "cusKorlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusKorlNm")
	@BxmOmm_Field(length=100, decimal=0, description="고객한글명", align="left", fill="")
	private String cusKorlNm= "";
	
	
	/**
	 * 고객부기명
	 */
	@ApiModelProperty(
		name = "cusBkpnNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusBkpnNm")
	@BxmOmm_Field(length=40, decimal=0, description="고객부기명", align="left", fill="")
	private String cusBkpnNm= "";
	
	
	/**
	 * 현재잔액
	 */
	@ApiModelProperty(
		name = "ctBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("ctBal")
	@BxmOmm_Field(length=19, decimal=3, description="현재잔액", align="right", fill="0")
	private BigDecimal ctBal= new BigDecimal("0");
	
	
	/**
	 * 지급가능잔액
	 */
	@ApiModelProperty(
		name = "payAvlBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("payAvlBal")
	@BxmOmm_Field(length=19, decimal=3, description="지급가능잔액", align="right", fill="0")
	private BigDecimal payAvlBal= new BigDecimal("0");
	
	
	/**
	 * 상품코드
	 */
	@ApiModelProperty(
		name = "pdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pdcd")
	@BxmOmm_Field(length=9, decimal=0, description="상품코드", align="left", fill="")
	private String pdcd= "";
	
	
	/**
	 * 상품코드한글명
	 */
	@ApiModelProperty(
		name = "pdcdKorlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pdcdKorlNm")
	@BxmOmm_Field(length=100, decimal=0, description="상품코드한글명", align="left", fill="")
	private String pdcdKorlNm= "";
	
	
	/**
	 * 상품한글단축명
	 */
	@ApiModelProperty(
		name = "prdKorlAbrNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdKorlAbrNm")
	@BxmOmm_Field(length=50, decimal=0, description="상품한글단축명", align="left", fill="")
	private String prdKorlAbrNm= "";
	
	
	/**
	 * 안심계좌번호
	 */
	@ApiModelProperty(
		name = "rlfAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rlfAcno")
	@BxmOmm_Field(length=11, decimal=0, description="안심계좌번호", align="left", fill="")
	private String rlfAcno= "";
	
	
	/**
	 * 회비납부일자
	 */
	@ApiModelProperty(
		name = "mbpfPymDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbpfPymDt")
	@BxmOmm_Field(length=8, decimal=0, description="회비납부일자", align="left", fill="")
	private String mbpfPymDt= "";
	
	
	/**
	 * 회비납부주기코드
	 */
	@ApiModelProperty(
		name = "mbpfPymCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbpfPymCycd")
	@BxmOmm_Field(length=2, decimal=0, description="회비납부주기코드", align="left", fill="")
	private String mbpfPymCycd= "";
	
	
	/**
	 * 회비납부주기코드명
	 */
	@ApiModelProperty(
		name = "mbpfPymCycdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbpfPymCycdNm")
	@BxmOmm_Field(length=50, decimal=0, description="회비납부주기코드명", align="left", fill="")
	private String mbpfPymCycdNm= "";
	
	
	/**
	 * 회비납부대상금액
	 */
	@ApiModelProperty(
		name = "mbpfPmtgtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mbpfPmtgtAm")
	@BxmOmm_Field(length=19, decimal=3, description="회비납부대상금액", align="right", fill="0")
	private BigDecimal mbpfPmtgtAm= new BigDecimal("0");
	
	
	/**
	 * 동의서징구일자
	 */
	@ApiModelProperty(
		name = "agmdCollDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agmdCollDt")
	@BxmOmm_Field(length=8, decimal=0, description="동의서징구일자", align="left", fill="")
	private String agmdCollDt= "";
	
	
	/**
	 * 권유자직원번호
	 */
	@ApiModelProperty(
		name = "advpeEno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("advpeEno")
	@BxmOmm_Field(length=8, decimal=0, description="권유자직원번호", align="left", fill="")
	private String advpeEno= "";
	
	
	/**
	 * 공동명의승인코드
	 */
	@ApiModelProperty(
		name = "asmnlApvCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("asmnlApvCd")
	@BxmOmm_Field(length=1, decimal=0, description="공동명의승인코드", align="left", fill="")
	private String asmnlApvCd= "";
	
	
	/**
	 * 공동명의승인코드명
	 */
	@ApiModelProperty(
		name = "asmnlApvCdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("asmnlApvCdNm")
	@BxmOmm_Field(length=50, decimal=0, description="공동명의승인코드명", align="left", fill="")
	private String asmnlApvCdNm= "";
	
	
	/**
	 * 대표자변경등록여부
	 */
	@ApiModelProperty(
		name = "rppeChgRgsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeChgRgsYn")
	@BxmOmm_Field(length=1, decimal=0, description="대표자변경등록여부", align="left", fill="")
	private String rppeChgRgsYn= "";
	
	
	/**
	 * 대표자변경등록일자
	 */
	@ApiModelProperty(
		name = "rppeChgRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeChgRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="대표자변경등록일자", align="left", fill="")
	private String rppeChgRgsDt= "";
	
	
	/**
	 * 대표자변경유효일자
	 */
	@ApiModelProperty(
		name = "rppeChgVldDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeChgVldDt")
	@BxmOmm_Field(length=8, decimal=0, description="대표자변경유효일자", align="left", fill="")
	private String rppeChgVldDt= "";
	
	
	/**
	 * 모임구분코드
	 */
	@ApiModelProperty(
		name = "metDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metDscd")
	@BxmOmm_Field(length=2, decimal=0, description="모임구분코드", align="left", fill="")
	private String metDscd= "";
	
	
	/**
	 * 모임구분코드명
	 */
	@ApiModelProperty(
		name = "metDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임구분코드명", align="left", fill="")
	private String metDscdNm= "";
	
	
	/**
	 * 모임등록일자
	 */
	@ApiModelProperty(
		name = "metRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임등록일자", align="left", fill="")
	private String metRgsDt= "";
	
	
	/**
	 * 등록시각
	 */
	@ApiModelProperty(
		name = "rgsTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgsTm")
	@BxmOmm_Field(length=6, decimal=0, description="등록시각", align="left", fill="")
	private String rgsTm= "";
	
	
	/**
	 * 모임기본이미지URL명
	 */
	@ApiModelProperty(
		name = "metBscImgUrlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metBscImgUrlNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임기본이미지URL명", align="left", fill="")
	private String metBscImgUrlNm= "";
	
	
	/**
	 * 모임회원등록건수
	 */
	@ApiModelProperty(
		name = "metMbhRgsCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMbhRgsCnt")
	@BxmOmm_Field(length=6, decimal=0, description="모임회원등록건수", align="right", fill="0")
	private Integer metMbhRgsCnt= 0;
	
	
	/**
	 * 모임회원탈퇴건수
	 */
	@ApiModelProperty(
		name = "metMbhScssCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMbhScssCnt")
	@BxmOmm_Field(length=6, decimal=0, description="모임회원탈퇴건수", align="right", fill="0")
	private Integer metMbhScssCnt= 0;
	
	
	/**
	 * 모임대표별칭명
	 */
	@ApiModelProperty(
		name = "metRprsAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metRprsAlsNm")
	@BxmOmm_Field(length=60, decimal=0, description="모임대표별칭명", align="left", fill="")
	private String metRprsAlsNm= "";
	
	
	/**
	 * 모임대표회원명
	 */
	@ApiModelProperty(
		name = "metRprsMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metRprsMbhNm")
	@BxmOmm_Field(length=60, decimal=0, description="모임대표회원명", align="left", fill="")
	private String metRprsMbhNm= "";
	
	
	/**
	 * 모임대표이미지URL명
	 */
	@ApiModelProperty(
		name = "metRprsImgUrlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metRprsImgUrlNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임대표이미지URL명", align="left", fill="")
	private String metRprsImgUrlNm= "";
	
	
	/**
	 * 총회비입금금액
	 */
	@ApiModelProperty(
		name = "totMbpfRcvAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("totMbpfRcvAm")
	@BxmOmm_Field(length=19, decimal=3, description="총회비입금금액", align="right", fill="0")
	private BigDecimal totMbpfRcvAm= new BigDecimal("0");
	
	
	/**
	 * 총회비면제금액
	 */
	@ApiModelProperty(
		name = "totMbpfXmpAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("totMbpfXmpAm")
	@BxmOmm_Field(length=19, decimal=3, description="총회비면제금액", align="right", fill="0")
	private BigDecimal totMbpfXmpAm= new BigDecimal("0");
	
	
	/**
	 * 회비납부회원수
	 */
	@ApiModelProperty(
		name = "mbpfPymMbhCn"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("mbpfPymMbhCn")
	@BxmOmm_Field(length=5, decimal=0, description="회비납부회원수", align="right", fill="0")
	private Integer mbpfPymMbhCn= 0;
	
	
	/**
	 * 회비미납부회원수
	 */
	@ApiModelProperty(
		name = "mbpfNpymMbhCn"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("mbpfNpymMbhCn")
	@BxmOmm_Field(length=5, decimal=0, description="회비미납부회원수", align="right", fill="0")
	private Integer mbpfNpymMbhCn= 0;
	
	
	/**
	 * 조회기준년월
	 */
	@ApiModelProperty(
		name = "inqBasYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqBasYm")
	@BxmOmm_Field(length=6, decimal=0, description="조회기준년월", align="left", fill="")
	private String inqBasYm= "";
	
	
	/**
	 * 다음모임회원별칭명
	 */
	@ApiModelProperty(
		name = "nxtMetMbhAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtMetMbhAlsNm")
	@BxmOmm_Field(length=60, decimal=0, description="다음모임회원별칭명", align="left", fill="")
	private String nxtMetMbhAlsNm= "";
	
	
	/**
	 * 그리드1건수
	 */
	@ApiModelProperty(
		name = "grid1Cnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("grid1Cnt")
	@BxmOmm_Field(length=3, decimal=0, description="그리드1건수", align="right", fill="0")
	private Integer grid1Cnt= 0;
	
	
	/**
	 * 회비.입금현황.목록.조회.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "dis1Grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.ctr.dto.MPBMbpfRcvstsListInq_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("dis1Grid")
	@BxmOmm_Field(length=0, decimal=0, description="회비.입금현황.목록.조회.컨트롤러.출력.IO", align="left", fill="", arrayReference="grid1Cnt")
	private List<MPBMbpfRcvstsListInq_ODT> dis1Grid= new ArrayList<>();
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="모임회원일련번호", align="right", fill="0")
	private Integer metMbhSrno= 0;
	
	
	/**
	 * 모임회원명
	 */
	@ApiModelProperty(
		name = "metMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhNm")
	@BxmOmm_Field(length=60, decimal=0, description="모임회원명", align="left", fill="")
	private String metMbhNm= "";
	
	
	/**
	 * 모임회원별칭명
	 */
	@ApiModelProperty(
		name = "metMbhAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhAlsNm")
	@BxmOmm_Field(length=60, decimal=0, description="모임회원별칭명", align="left", fill="")
	private String metMbhAlsNm= "";
	
	
	/**
	 * 모임회원구분코드
	 */
	@ApiModelProperty(
		name = "metMbhDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임회원구분코드", align="left", fill="")
	private String metMbhDscd= "";
	
	
	/**
	 * 모임회원구분코드명
	 */
	@ApiModelProperty(
		name = "metMbhDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임회원구분코드명", align="left", fill="")
	private String metMbhDscdNm= "";
	
	
	/**
	 * 모임회원이미지URL명
	 */
	@ApiModelProperty(
		name = "metMbhImgUrlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhImgUrlNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임회원이미지URL명", align="left", fill="")
	private String metMbhImgUrlNm= "";
	
	
	/**
	 * 다음조회거래일자
	 */
	@ApiModelProperty(
		name = "nxtInqTrnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtInqTrnDt")
	@BxmOmm_Field(length=8, decimal=0, description="다음조회거래일자", align="left", fill="")
	private String nxtInqTrnDt= "";
	
	
	/**
	 * 다음거래일련번호
	 */
	@ApiModelProperty(
		name = "nxtTrnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("nxtTrnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="다음거래일련번호", align="right", fill="0")
	private Integer nxtTrnSrno= 0;
	
	
	/**
	 * 그리드2건수
	 */
	@ApiModelProperty(
		name = "grid2Cnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("grid2Cnt")
	@BxmOmm_Field(length=3, decimal=0, description="그리드2건수", align="right", fill="0")
	private Integer grid2Cnt= 0;
	
	
	/**
	 * 회비.입금현황.목록2.조회.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "dis2Grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.dto.MPBMbpfRcvstsList2Inq_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("dis2Grid")
	@BxmOmm_Field(length=0, decimal=0, description="회비.입금현황.목록2.조회.컨트롤러.출력.IO", align="left", fill="", arrayReference="grid2Cnt")
	private List<MPBMbpfRcvstsList2Inq_DTO> dis2Grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMngNo= false;
	protected final boolean isSet_metMngNo(){
		return this.isSet_metMngNo;
	}
	private void setIsSet_metMngNo(boolean value){
		this.isSet_metMngNo= value;
	}
	/**
	 * 모임관리번호
	 */
	@XmlTransient
	public String getMetMngNo(){
		return this.metMngNo;
	}
	
	/**
	 * 모임관리번호
	 * 
	 * @param metMngNo 모임관리번호
	 */
	public void setMetMngNo(String metMngNo){
		this.metMngNo= metMngNo;
		this.setIsSet_metMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ebnkUtzpeNo= false;
	protected final boolean isSet_ebnkUtzpeNo(){
		return this.isSet_ebnkUtzpeNo;
	}
	private void setIsSet_ebnkUtzpeNo(boolean value){
		this.isSet_ebnkUtzpeNo= value;
	}
	/**
	 * 전자뱅킹이용자번호
	 */
	@XmlTransient
	public String getEbnkUtzpeNo(){
		return this.ebnkUtzpeNo;
	}
	
	/**
	 * 전자뱅킹이용자번호
	 * 
	 * @param ebnkUtzpeNo 전자뱅킹이용자번호
	 */
	public void setEbnkUtzpeNo(String ebnkUtzpeNo){
		this.ebnkUtzpeNo= ebnkUtzpeNo;
		this.setIsSet_ebnkUtzpeNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metCtrStcd= false;
	protected final boolean isSet_metCtrStcd(){
		return this.isSet_metCtrStcd;
	}
	private void setIsSet_metCtrStcd(boolean value){
		this.isSet_metCtrStcd= value;
	}
	/**
	 * 모임계약상태코드
	 */
	@XmlTransient
	public String getMetCtrStcd(){
		return this.metCtrStcd;
	}
	
	/**
	 * 모임계약상태코드
	 * 
	 * @param metCtrStcd 모임계약상태코드
	 */
	public void setMetCtrStcd(String metCtrStcd){
		this.metCtrStcd= metCtrStcd;
		this.setIsSet_metCtrStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metCtrStcdNm= false;
	protected final boolean isSet_metCtrStcdNm(){
		return this.isSet_metCtrStcdNm;
	}
	private void setIsSet_metCtrStcdNm(boolean value){
		this.isSet_metCtrStcdNm= value;
	}
	/**
	 * 모임계약상태코드명
	 */
	@XmlTransient
	public String getMetCtrStcdNm(){
		return this.metCtrStcdNm;
	}
	
	/**
	 * 모임계약상태코드명
	 * 
	 * @param metCtrStcdNm 모임계약상태코드명
	 */
	public void setMetCtrStcdNm(String metCtrStcdNm){
		this.metCtrStcdNm= metCtrStcdNm;
		this.setIsSet_metCtrStcdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokDscd= false;
	protected final boolean isSet_metPbokDscd(){
		return this.isSet_metPbokDscd;
	}
	private void setIsSet_metPbokDscd(boolean value){
		this.isSet_metPbokDscd= value;
	}
	/**
	 * 모임통장구분코드
	 */
	@XmlTransient
	public String getMetPbokDscd(){
		return this.metPbokDscd;
	}
	
	/**
	 * 모임통장구분코드
	 * 
	 * @param metPbokDscd 모임통장구분코드
	 */
	public void setMetPbokDscd(String metPbokDscd){
		this.metPbokDscd= metPbokDscd;
		this.setIsSet_metPbokDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokDscdNm= false;
	protected final boolean isSet_metPbokDscdNm(){
		return this.isSet_metPbokDscdNm;
	}
	private void setIsSet_metPbokDscdNm(boolean value){
		this.isSet_metPbokDscdNm= value;
	}
	/**
	 * 모임통장구분코드명
	 */
	@XmlTransient
	public String getMetPbokDscdNm(){
		return this.metPbokDscdNm;
	}
	
	/**
	 * 모임통장구분코드명
	 * 
	 * @param metPbokDscdNm 모임통장구분코드명
	 */
	public void setMetPbokDscdNm(String metPbokDscdNm){
		this.metPbokDscdNm= metPbokDscdNm;
		this.setIsSet_metPbokDscdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNm= false;
	protected final boolean isSet_metNm(){
		return this.isSet_metNm;
	}
	private void setIsSet_metNm(boolean value){
		this.isSet_metNm= value;
	}
	/**
	 * 모임명
	 */
	@XmlTransient
	public String getMetNm(){
		return this.metNm;
	}
	
	/**
	 * 모임명
	 * 
	 * @param metNm 모임명
	 */
	public void setMetNm(String metNm){
		this.metNm= metNm;
		this.setIsSet_metNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvBkwAcno= false;
	protected final boolean isSet_rcvBkwAcno(){
		return this.isSet_rcvBkwAcno;
	}
	private void setIsSet_rcvBkwAcno(boolean value){
		this.isSet_rcvBkwAcno= value;
	}
	/**
	 * 입금전행계좌번호
	 */
	@XmlTransient
	public String getRcvBkwAcno(){
		return this.rcvBkwAcno;
	}
	
	/**
	 * 입금전행계좌번호
	 * 
	 * @param rcvBkwAcno 입금전행계좌번호
	 */
	public void setRcvBkwAcno(String rcvBkwAcno){
		this.rcvBkwAcno= rcvBkwAcno;
		this.setIsSet_rcvBkwAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusUsgBkwAcno= false;
	protected final boolean isSet_cusUsgBkwAcno(){
		return this.isSet_cusUsgBkwAcno;
	}
	private void setIsSet_cusUsgBkwAcno(boolean value){
		this.isSet_cusUsgBkwAcno= value;
	}
	/**
	 * 고객사용전행계좌번호
	 */
	@XmlTransient
	public String getCusUsgBkwAcno(){
		return this.cusUsgBkwAcno;
	}
	
	/**
	 * 고객사용전행계좌번호
	 * 
	 * @param cusUsgBkwAcno 고객사용전행계좌번호
	 */
	public void setCusUsgBkwAcno(String cusUsgBkwAcno){
		this.cusUsgBkwAcno= cusUsgBkwAcno;
		this.setIsSet_cusUsgBkwAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itcsno= false;
	protected final boolean isSet_itcsno(){
		return this.isSet_itcsno;
	}
	private void setIsSet_itcsno(boolean value){
		this.isSet_itcsno= value;
	}
	/**
	 * 통합고객번호
	 */
	@XmlTransient
	public String getItcsno(){
		return this.itcsno;
	}
	
	/**
	 * 통합고객번호
	 * 
	 * @param itcsno 통합고객번호
	 */
	public void setItcsno(String itcsno){
		this.itcsno= itcsno;
		this.setIsSet_itcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusKorlNm= false;
	protected final boolean isSet_cusKorlNm(){
		return this.isSet_cusKorlNm;
	}
	private void setIsSet_cusKorlNm(boolean value){
		this.isSet_cusKorlNm= value;
	}
	/**
	 * 고객한글명
	 */
	@XmlTransient
	public String getCusKorlNm(){
		return this.cusKorlNm;
	}
	
	/**
	 * 고객한글명
	 * 
	 * @param cusKorlNm 고객한글명
	 */
	public void setCusKorlNm(String cusKorlNm){
		this.cusKorlNm= cusKorlNm;
		this.setIsSet_cusKorlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusBkpnNm= false;
	protected final boolean isSet_cusBkpnNm(){
		return this.isSet_cusBkpnNm;
	}
	private void setIsSet_cusBkpnNm(boolean value){
		this.isSet_cusBkpnNm= value;
	}
	/**
	 * 고객부기명
	 */
	@XmlTransient
	public String getCusBkpnNm(){
		return this.cusBkpnNm;
	}
	
	/**
	 * 고객부기명
	 * 
	 * @param cusBkpnNm 고객부기명
	 */
	public void setCusBkpnNm(String cusBkpnNm){
		this.cusBkpnNm= cusBkpnNm;
		this.setIsSet_cusBkpnNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ctBal= false;
	protected final boolean isSet_ctBal(){
		return this.isSet_ctBal;
	}
	private void setIsSet_ctBal(boolean value){
		this.isSet_ctBal= value;
	}
	/**
	 * 현재잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(double ctBal) {
		setCtBal(BigDecimal.valueOf(ctBal));
	}
	/**
	 * 현재잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(long ctBal) {
		setCtBal(BigDecimal.valueOf(ctBal));
	}
	/**
	 * 현재잔액
	 * BigDecimal - String value setter
	 *
	 * @Param ctBal 현재잔액
	 */
	public void setCtBal(String ctBal) {
		setCtBal(new BigDecimal(ctBal));
	}
	/**
	 * 현재잔액
	 */
	@XmlTransient
	public BigDecimal getCtBal(){
		return this.ctBal;
	}
	
	/**
	 * 현재잔액
	 * 
	 * @param ctBal 현재잔액
	 */
	@JsonSetter("ctBal")
	public void setCtBal(BigDecimal ctBal){
		this.ctBal= ctBal;
		this.setIsSet_ctBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payAvlBal= false;
	protected final boolean isSet_payAvlBal(){
		return this.isSet_payAvlBal;
	}
	private void setIsSet_payAvlBal(boolean value){
		this.isSet_payAvlBal= value;
	}
	/**
	 * 지급가능잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param payAvlBal 지급가능잔액
	 */
	public void setPayAvlBal(double payAvlBal) {
		setPayAvlBal(BigDecimal.valueOf(payAvlBal));
	}
	/**
	 * 지급가능잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param payAvlBal 지급가능잔액
	 */
	public void setPayAvlBal(long payAvlBal) {
		setPayAvlBal(BigDecimal.valueOf(payAvlBal));
	}
	/**
	 * 지급가능잔액
	 * BigDecimal - String value setter
	 *
	 * @Param payAvlBal 지급가능잔액
	 */
	public void setPayAvlBal(String payAvlBal) {
		setPayAvlBal(new BigDecimal(payAvlBal));
	}
	/**
	 * 지급가능잔액
	 */
	@XmlTransient
	public BigDecimal getPayAvlBal(){
		return this.payAvlBal;
	}
	
	/**
	 * 지급가능잔액
	 * 
	 * @param payAvlBal 지급가능잔액
	 */
	@JsonSetter("payAvlBal")
	public void setPayAvlBal(BigDecimal payAvlBal){
		this.payAvlBal= payAvlBal;
		this.setIsSet_payAvlBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pdcd= false;
	protected final boolean isSet_pdcd(){
		return this.isSet_pdcd;
	}
	private void setIsSet_pdcd(boolean value){
		this.isSet_pdcd= value;
	}
	/**
	 * 상품코드
	 */
	@XmlTransient
	public String getPdcd(){
		return this.pdcd;
	}
	
	/**
	 * 상품코드
	 * 
	 * @param pdcd 상품코드
	 */
	public void setPdcd(String pdcd){
		this.pdcd= pdcd;
		this.setIsSet_pdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pdcdKorlNm= false;
	protected final boolean isSet_pdcdKorlNm(){
		return this.isSet_pdcdKorlNm;
	}
	private void setIsSet_pdcdKorlNm(boolean value){
		this.isSet_pdcdKorlNm= value;
	}
	/**
	 * 상품코드한글명
	 */
	@XmlTransient
	public String getPdcdKorlNm(){
		return this.pdcdKorlNm;
	}
	
	/**
	 * 상품코드한글명
	 * 
	 * @param pdcdKorlNm 상품코드한글명
	 */
	public void setPdcdKorlNm(String pdcdKorlNm){
		this.pdcdKorlNm= pdcdKorlNm;
		this.setIsSet_pdcdKorlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdKorlAbrNm= false;
	protected final boolean isSet_prdKorlAbrNm(){
		return this.isSet_prdKorlAbrNm;
	}
	private void setIsSet_prdKorlAbrNm(boolean value){
		this.isSet_prdKorlAbrNm= value;
	}
	/**
	 * 상품한글단축명
	 */
	@XmlTransient
	public String getPrdKorlAbrNm(){
		return this.prdKorlAbrNm;
	}
	
	/**
	 * 상품한글단축명
	 * 
	 * @param prdKorlAbrNm 상품한글단축명
	 */
	public void setPrdKorlAbrNm(String prdKorlAbrNm){
		this.prdKorlAbrNm= prdKorlAbrNm;
		this.setIsSet_prdKorlAbrNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rlfAcno= false;
	protected final boolean isSet_rlfAcno(){
		return this.isSet_rlfAcno;
	}
	private void setIsSet_rlfAcno(boolean value){
		this.isSet_rlfAcno= value;
	}
	/**
	 * 안심계좌번호
	 */
	@XmlTransient
	public String getRlfAcno(){
		return this.rlfAcno;
	}
	
	/**
	 * 안심계좌번호
	 * 
	 * @param rlfAcno 안심계좌번호
	 */
	public void setRlfAcno(String rlfAcno){
		this.rlfAcno= rlfAcno;
		this.setIsSet_rlfAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymDt= false;
	protected final boolean isSet_mbpfPymDt(){
		return this.isSet_mbpfPymDt;
	}
	private void setIsSet_mbpfPymDt(boolean value){
		this.isSet_mbpfPymDt= value;
	}
	/**
	 * 회비납부일자
	 */
	@XmlTransient
	public String getMbpfPymDt(){
		return this.mbpfPymDt;
	}
	
	/**
	 * 회비납부일자
	 * 
	 * @param mbpfPymDt 회비납부일자
	 */
	public void setMbpfPymDt(String mbpfPymDt){
		this.mbpfPymDt= mbpfPymDt;
		this.setIsSet_mbpfPymDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymCycd= false;
	protected final boolean isSet_mbpfPymCycd(){
		return this.isSet_mbpfPymCycd;
	}
	private void setIsSet_mbpfPymCycd(boolean value){
		this.isSet_mbpfPymCycd= value;
	}
	/**
	 * 회비납부주기코드
	 */
	@XmlTransient
	public String getMbpfPymCycd(){
		return this.mbpfPymCycd;
	}
	
	/**
	 * 회비납부주기코드
	 * 
	 * @param mbpfPymCycd 회비납부주기코드
	 */
	public void setMbpfPymCycd(String mbpfPymCycd){
		this.mbpfPymCycd= mbpfPymCycd;
		this.setIsSet_mbpfPymCycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymCycdNm= false;
	protected final boolean isSet_mbpfPymCycdNm(){
		return this.isSet_mbpfPymCycdNm;
	}
	private void setIsSet_mbpfPymCycdNm(boolean value){
		this.isSet_mbpfPymCycdNm= value;
	}
	/**
	 * 회비납부주기코드명
	 */
	@XmlTransient
	public String getMbpfPymCycdNm(){
		return this.mbpfPymCycdNm;
	}
	
	/**
	 * 회비납부주기코드명
	 * 
	 * @param mbpfPymCycdNm 회비납부주기코드명
	 */
	public void setMbpfPymCycdNm(String mbpfPymCycdNm){
		this.mbpfPymCycdNm= mbpfPymCycdNm;
		this.setIsSet_mbpfPymCycdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPmtgtAm= false;
	protected final boolean isSet_mbpfPmtgtAm(){
		return this.isSet_mbpfPmtgtAm;
	}
	private void setIsSet_mbpfPmtgtAm(boolean value){
		this.isSet_mbpfPmtgtAm= value;
	}
	/**
	 * 회비납부대상금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mbpfPmtgtAm 회비납부대상금액
	 */
	public void setMbpfPmtgtAm(double mbpfPmtgtAm) {
		setMbpfPmtgtAm(BigDecimal.valueOf(mbpfPmtgtAm));
	}
	/**
	 * 회비납부대상금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mbpfPmtgtAm 회비납부대상금액
	 */
	public void setMbpfPmtgtAm(long mbpfPmtgtAm) {
		setMbpfPmtgtAm(BigDecimal.valueOf(mbpfPmtgtAm));
	}
	/**
	 * 회비납부대상금액
	 * BigDecimal - String value setter
	 *
	 * @Param mbpfPmtgtAm 회비납부대상금액
	 */
	public void setMbpfPmtgtAm(String mbpfPmtgtAm) {
		setMbpfPmtgtAm(new BigDecimal(mbpfPmtgtAm));
	}
	/**
	 * 회비납부대상금액
	 */
	@XmlTransient
	public BigDecimal getMbpfPmtgtAm(){
		return this.mbpfPmtgtAm;
	}
	
	/**
	 * 회비납부대상금액
	 * 
	 * @param mbpfPmtgtAm 회비납부대상금액
	 */
	@JsonSetter("mbpfPmtgtAm")
	public void setMbpfPmtgtAm(BigDecimal mbpfPmtgtAm){
		this.mbpfPmtgtAm= mbpfPmtgtAm;
		this.setIsSet_mbpfPmtgtAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agmdCollDt= false;
	protected final boolean isSet_agmdCollDt(){
		return this.isSet_agmdCollDt;
	}
	private void setIsSet_agmdCollDt(boolean value){
		this.isSet_agmdCollDt= value;
	}
	/**
	 * 동의서징구일자
	 */
	@XmlTransient
	public String getAgmdCollDt(){
		return this.agmdCollDt;
	}
	
	/**
	 * 동의서징구일자
	 * 
	 * @param agmdCollDt 동의서징구일자
	 */
	public void setAgmdCollDt(String agmdCollDt){
		this.agmdCollDt= agmdCollDt;
		this.setIsSet_agmdCollDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_advpeEno= false;
	protected final boolean isSet_advpeEno(){
		return this.isSet_advpeEno;
	}
	private void setIsSet_advpeEno(boolean value){
		this.isSet_advpeEno= value;
	}
	/**
	 * 권유자직원번호
	 */
	@XmlTransient
	public String getAdvpeEno(){
		return this.advpeEno;
	}
	
	/**
	 * 권유자직원번호
	 * 
	 * @param advpeEno 권유자직원번호
	 */
	public void setAdvpeEno(String advpeEno){
		this.advpeEno= advpeEno;
		this.setIsSet_advpeEno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_asmnlApvCd= false;
	protected final boolean isSet_asmnlApvCd(){
		return this.isSet_asmnlApvCd;
	}
	private void setIsSet_asmnlApvCd(boolean value){
		this.isSet_asmnlApvCd= value;
	}
	/**
	 * 공동명의승인코드
	 */
	@XmlTransient
	public String getAsmnlApvCd(){
		return this.asmnlApvCd;
	}
	
	/**
	 * 공동명의승인코드
	 * 
	 * @param asmnlApvCd 공동명의승인코드
	 */
	public void setAsmnlApvCd(String asmnlApvCd){
		this.asmnlApvCd= asmnlApvCd;
		this.setIsSet_asmnlApvCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_asmnlApvCdNm= false;
	protected final boolean isSet_asmnlApvCdNm(){
		return this.isSet_asmnlApvCdNm;
	}
	private void setIsSet_asmnlApvCdNm(boolean value){
		this.isSet_asmnlApvCdNm= value;
	}
	/**
	 * 공동명의승인코드명
	 */
	@XmlTransient
	public String getAsmnlApvCdNm(){
		return this.asmnlApvCdNm;
	}
	
	/**
	 * 공동명의승인코드명
	 * 
	 * @param asmnlApvCdNm 공동명의승인코드명
	 */
	public void setAsmnlApvCdNm(String asmnlApvCdNm){
		this.asmnlApvCdNm= asmnlApvCdNm;
		this.setIsSet_asmnlApvCdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeChgRgsYn= false;
	protected final boolean isSet_rppeChgRgsYn(){
		return this.isSet_rppeChgRgsYn;
	}
	private void setIsSet_rppeChgRgsYn(boolean value){
		this.isSet_rppeChgRgsYn= value;
	}
	/**
	 * 대표자변경등록여부
	 */
	@XmlTransient
	public String getRppeChgRgsYn(){
		return this.rppeChgRgsYn;
	}
	
	/**
	 * 대표자변경등록여부
	 * 
	 * @param rppeChgRgsYn 대표자변경등록여부
	 */
	public void setRppeChgRgsYn(String rppeChgRgsYn){
		this.rppeChgRgsYn= rppeChgRgsYn;
		this.setIsSet_rppeChgRgsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeChgRgsDt= false;
	protected final boolean isSet_rppeChgRgsDt(){
		return this.isSet_rppeChgRgsDt;
	}
	private void setIsSet_rppeChgRgsDt(boolean value){
		this.isSet_rppeChgRgsDt= value;
	}
	/**
	 * 대표자변경등록일자
	 */
	@XmlTransient
	public String getRppeChgRgsDt(){
		return this.rppeChgRgsDt;
	}
	
	/**
	 * 대표자변경등록일자
	 * 
	 * @param rppeChgRgsDt 대표자변경등록일자
	 */
	public void setRppeChgRgsDt(String rppeChgRgsDt){
		this.rppeChgRgsDt= rppeChgRgsDt;
		this.setIsSet_rppeChgRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeChgVldDt= false;
	protected final boolean isSet_rppeChgVldDt(){
		return this.isSet_rppeChgVldDt;
	}
	private void setIsSet_rppeChgVldDt(boolean value){
		this.isSet_rppeChgVldDt= value;
	}
	/**
	 * 대표자변경유효일자
	 */
	@XmlTransient
	public String getRppeChgVldDt(){
		return this.rppeChgVldDt;
	}
	
	/**
	 * 대표자변경유효일자
	 * 
	 * @param rppeChgVldDt 대표자변경유효일자
	 */
	public void setRppeChgVldDt(String rppeChgVldDt){
		this.rppeChgVldDt= rppeChgVldDt;
		this.setIsSet_rppeChgVldDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metDscd= false;
	protected final boolean isSet_metDscd(){
		return this.isSet_metDscd;
	}
	private void setIsSet_metDscd(boolean value){
		this.isSet_metDscd= value;
	}
	/**
	 * 모임구분코드
	 */
	@XmlTransient
	public String getMetDscd(){
		return this.metDscd;
	}
	
	/**
	 * 모임구분코드
	 * 
	 * @param metDscd 모임구분코드
	 */
	public void setMetDscd(String metDscd){
		this.metDscd= metDscd;
		this.setIsSet_metDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metDscdNm= false;
	protected final boolean isSet_metDscdNm(){
		return this.isSet_metDscdNm;
	}
	private void setIsSet_metDscdNm(boolean value){
		this.isSet_metDscdNm= value;
	}
	/**
	 * 모임구분코드명
	 */
	@XmlTransient
	public String getMetDscdNm(){
		return this.metDscdNm;
	}
	
	/**
	 * 모임구분코드명
	 * 
	 * @param metDscdNm 모임구분코드명
	 */
	public void setMetDscdNm(String metDscdNm){
		this.metDscdNm= metDscdNm;
		this.setIsSet_metDscdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metRgsDt= false;
	protected final boolean isSet_metRgsDt(){
		return this.isSet_metRgsDt;
	}
	private void setIsSet_metRgsDt(boolean value){
		this.isSet_metRgsDt= value;
	}
	/**
	 * 모임등록일자
	 */
	@XmlTransient
	public String getMetRgsDt(){
		return this.metRgsDt;
	}
	
	/**
	 * 모임등록일자
	 * 
	 * @param metRgsDt 모임등록일자
	 */
	public void setMetRgsDt(String metRgsDt){
		this.metRgsDt= metRgsDt;
		this.setIsSet_metRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsTm= false;
	protected final boolean isSet_rgsTm(){
		return this.isSet_rgsTm;
	}
	private void setIsSet_rgsTm(boolean value){
		this.isSet_rgsTm= value;
	}
	/**
	 * 등록시각
	 */
	@XmlTransient
	public String getRgsTm(){
		return this.rgsTm;
	}
	
	/**
	 * 등록시각
	 * 
	 * @param rgsTm 등록시각
	 */
	public void setRgsTm(String rgsTm){
		this.rgsTm= rgsTm;
		this.setIsSet_rgsTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metBscImgUrlNm= false;
	protected final boolean isSet_metBscImgUrlNm(){
		return this.isSet_metBscImgUrlNm;
	}
	private void setIsSet_metBscImgUrlNm(boolean value){
		this.isSet_metBscImgUrlNm= value;
	}
	/**
	 * 모임기본이미지URL명
	 */
	@XmlTransient
	public String getMetBscImgUrlNm(){
		return this.metBscImgUrlNm;
	}
	
	/**
	 * 모임기본이미지URL명
	 * 
	 * @param metBscImgUrlNm 모임기본이미지URL명
	 */
	public void setMetBscImgUrlNm(String metBscImgUrlNm){
		this.metBscImgUrlNm= metBscImgUrlNm;
		this.setIsSet_metBscImgUrlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhRgsCnt= false;
	protected final boolean isSet_metMbhRgsCnt(){
		return this.isSet_metMbhRgsCnt;
	}
	private void setIsSet_metMbhRgsCnt(boolean value){
		this.isSet_metMbhRgsCnt= value;
	}
	/**
	 * 모임회원등록건수
	 */
	@XmlTransient
	public Integer getMetMbhRgsCnt(){
		return this.metMbhRgsCnt;
	}
	
	/**
	 * 모임회원등록건수
	 * 
	 * @param metMbhRgsCnt 모임회원등록건수
	 */
	public void setMetMbhRgsCnt(Integer metMbhRgsCnt){
		this.metMbhRgsCnt= metMbhRgsCnt;
		this.setIsSet_metMbhRgsCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhScssCnt= false;
	protected final boolean isSet_metMbhScssCnt(){
		return this.isSet_metMbhScssCnt;
	}
	private void setIsSet_metMbhScssCnt(boolean value){
		this.isSet_metMbhScssCnt= value;
	}
	/**
	 * 모임회원탈퇴건수
	 */
	@XmlTransient
	public Integer getMetMbhScssCnt(){
		return this.metMbhScssCnt;
	}
	
	/**
	 * 모임회원탈퇴건수
	 * 
	 * @param metMbhScssCnt 모임회원탈퇴건수
	 */
	public void setMetMbhScssCnt(Integer metMbhScssCnt){
		this.metMbhScssCnt= metMbhScssCnt;
		this.setIsSet_metMbhScssCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metRprsAlsNm= false;
	protected final boolean isSet_metRprsAlsNm(){
		return this.isSet_metRprsAlsNm;
	}
	private void setIsSet_metRprsAlsNm(boolean value){
		this.isSet_metRprsAlsNm= value;
	}
	/**
	 * 모임대표별칭명
	 */
	@XmlTransient
	public String getMetRprsAlsNm(){
		return this.metRprsAlsNm;
	}
	
	/**
	 * 모임대표별칭명
	 * 
	 * @param metRprsAlsNm 모임대표별칭명
	 */
	public void setMetRprsAlsNm(String metRprsAlsNm){
		this.metRprsAlsNm= metRprsAlsNm;
		this.setIsSet_metRprsAlsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metRprsMbhNm= false;
	protected final boolean isSet_metRprsMbhNm(){
		return this.isSet_metRprsMbhNm;
	}
	private void setIsSet_metRprsMbhNm(boolean value){
		this.isSet_metRprsMbhNm= value;
	}
	/**
	 * 모임대표회원명
	 */
	@XmlTransient
	public String getMetRprsMbhNm(){
		return this.metRprsMbhNm;
	}
	
	/**
	 * 모임대표회원명
	 * 
	 * @param metRprsMbhNm 모임대표회원명
	 */
	public void setMetRprsMbhNm(String metRprsMbhNm){
		this.metRprsMbhNm= metRprsMbhNm;
		this.setIsSet_metRprsMbhNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metRprsImgUrlNm= false;
	protected final boolean isSet_metRprsImgUrlNm(){
		return this.isSet_metRprsImgUrlNm;
	}
	private void setIsSet_metRprsImgUrlNm(boolean value){
		this.isSet_metRprsImgUrlNm= value;
	}
	/**
	 * 모임대표이미지URL명
	 */
	@XmlTransient
	public String getMetRprsImgUrlNm(){
		return this.metRprsImgUrlNm;
	}
	
	/**
	 * 모임대표이미지URL명
	 * 
	 * @param metRprsImgUrlNm 모임대표이미지URL명
	 */
	public void setMetRprsImgUrlNm(String metRprsImgUrlNm){
		this.metRprsImgUrlNm= metRprsImgUrlNm;
		this.setIsSet_metRprsImgUrlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totMbpfRcvAm= false;
	protected final boolean isSet_totMbpfRcvAm(){
		return this.isSet_totMbpfRcvAm;
	}
	private void setIsSet_totMbpfRcvAm(boolean value){
		this.isSet_totMbpfRcvAm= value;
	}
	/**
	 * 총회비입금금액
	 * BigDecimal - Double value setter
	 *
	 * @Param totMbpfRcvAm 총회비입금금액
	 */
	public void setTotMbpfRcvAm(double totMbpfRcvAm) {
		setTotMbpfRcvAm(BigDecimal.valueOf(totMbpfRcvAm));
	}
	/**
	 * 총회비입금금액
	 * BigDecimal - Long value setter
	 *
	 * @Param totMbpfRcvAm 총회비입금금액
	 */
	public void setTotMbpfRcvAm(long totMbpfRcvAm) {
		setTotMbpfRcvAm(BigDecimal.valueOf(totMbpfRcvAm));
	}
	/**
	 * 총회비입금금액
	 * BigDecimal - String value setter
	 *
	 * @Param totMbpfRcvAm 총회비입금금액
	 */
	public void setTotMbpfRcvAm(String totMbpfRcvAm) {
		setTotMbpfRcvAm(new BigDecimal(totMbpfRcvAm));
	}
	/**
	 * 총회비입금금액
	 */
	@XmlTransient
	public BigDecimal getTotMbpfRcvAm(){
		return this.totMbpfRcvAm;
	}
	
	/**
	 * 총회비입금금액
	 * 
	 * @param totMbpfRcvAm 총회비입금금액
	 */
	@JsonSetter("totMbpfRcvAm")
	public void setTotMbpfRcvAm(BigDecimal totMbpfRcvAm){
		this.totMbpfRcvAm= totMbpfRcvAm;
		this.setIsSet_totMbpfRcvAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totMbpfXmpAm= false;
	protected final boolean isSet_totMbpfXmpAm(){
		return this.isSet_totMbpfXmpAm;
	}
	private void setIsSet_totMbpfXmpAm(boolean value){
		this.isSet_totMbpfXmpAm= value;
	}
	/**
	 * 총회비면제금액
	 * BigDecimal - Double value setter
	 *
	 * @Param totMbpfXmpAm 총회비면제금액
	 */
	public void setTotMbpfXmpAm(double totMbpfXmpAm) {
		setTotMbpfXmpAm(BigDecimal.valueOf(totMbpfXmpAm));
	}
	/**
	 * 총회비면제금액
	 * BigDecimal - Long value setter
	 *
	 * @Param totMbpfXmpAm 총회비면제금액
	 */
	public void setTotMbpfXmpAm(long totMbpfXmpAm) {
		setTotMbpfXmpAm(BigDecimal.valueOf(totMbpfXmpAm));
	}
	/**
	 * 총회비면제금액
	 * BigDecimal - String value setter
	 *
	 * @Param totMbpfXmpAm 총회비면제금액
	 */
	public void setTotMbpfXmpAm(String totMbpfXmpAm) {
		setTotMbpfXmpAm(new BigDecimal(totMbpfXmpAm));
	}
	/**
	 * 총회비면제금액
	 */
	@XmlTransient
	public BigDecimal getTotMbpfXmpAm(){
		return this.totMbpfXmpAm;
	}
	
	/**
	 * 총회비면제금액
	 * 
	 * @param totMbpfXmpAm 총회비면제금액
	 */
	@JsonSetter("totMbpfXmpAm")
	public void setTotMbpfXmpAm(BigDecimal totMbpfXmpAm){
		this.totMbpfXmpAm= totMbpfXmpAm;
		this.setIsSet_totMbpfXmpAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymMbhCn= false;
	protected final boolean isSet_mbpfPymMbhCn(){
		return this.isSet_mbpfPymMbhCn;
	}
	private void setIsSet_mbpfPymMbhCn(boolean value){
		this.isSet_mbpfPymMbhCn= value;
	}
	/**
	 * 회비납부회원수
	 */
	@XmlTransient
	public Integer getMbpfPymMbhCn(){
		return this.mbpfPymMbhCn;
	}
	
	/**
	 * 회비납부회원수
	 * 
	 * @param mbpfPymMbhCn 회비납부회원수
	 */
	public void setMbpfPymMbhCn(Integer mbpfPymMbhCn){
		this.mbpfPymMbhCn= mbpfPymMbhCn;
		this.setIsSet_mbpfPymMbhCn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfNpymMbhCn= false;
	protected final boolean isSet_mbpfNpymMbhCn(){
		return this.isSet_mbpfNpymMbhCn;
	}
	private void setIsSet_mbpfNpymMbhCn(boolean value){
		this.isSet_mbpfNpymMbhCn= value;
	}
	/**
	 * 회비미납부회원수
	 */
	@XmlTransient
	public Integer getMbpfNpymMbhCn(){
		return this.mbpfNpymMbhCn;
	}
	
	/**
	 * 회비미납부회원수
	 * 
	 * @param mbpfNpymMbhCn 회비미납부회원수
	 */
	public void setMbpfNpymMbhCn(Integer mbpfNpymMbhCn){
		this.mbpfNpymMbhCn= mbpfNpymMbhCn;
		this.setIsSet_mbpfNpymMbhCn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqBasYm= false;
	protected final boolean isSet_inqBasYm(){
		return this.isSet_inqBasYm;
	}
	private void setIsSet_inqBasYm(boolean value){
		this.isSet_inqBasYm= value;
	}
	/**
	 * 조회기준년월
	 */
	@XmlTransient
	public String getInqBasYm(){
		return this.inqBasYm;
	}
	
	/**
	 * 조회기준년월
	 * 
	 * @param inqBasYm 조회기준년월
	 */
	public void setInqBasYm(String inqBasYm){
		this.inqBasYm= inqBasYm;
		this.setIsSet_inqBasYm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtMetMbhAlsNm= false;
	protected final boolean isSet_nxtMetMbhAlsNm(){
		return this.isSet_nxtMetMbhAlsNm;
	}
	private void setIsSet_nxtMetMbhAlsNm(boolean value){
		this.isSet_nxtMetMbhAlsNm= value;
	}
	/**
	 * 다음모임회원별칭명
	 */
	@XmlTransient
	public String getNxtMetMbhAlsNm(){
		return this.nxtMetMbhAlsNm;
	}
	
	/**
	 * 다음모임회원별칭명
	 * 
	 * @param nxtMetMbhAlsNm 다음모임회원별칭명
	 */
	public void setNxtMetMbhAlsNm(String nxtMetMbhAlsNm){
		this.nxtMetMbhAlsNm= nxtMetMbhAlsNm;
		this.setIsSet_nxtMetMbhAlsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid1Cnt= false;
	protected final boolean isSet_grid1Cnt(){
		return this.isSet_grid1Cnt;
	}
	private void setIsSet_grid1Cnt(boolean value){
		this.isSet_grid1Cnt= value;
	}
	/**
	 * 그리드1건수
	 */
	@XmlElement
	public Integer getGrid1Cnt(){
		if ( isSet_grid1Cnt )	return grid1Cnt;
		else{
			if ( dis1Grid == null || dis1Grid.size() == 0 ) return 0;
			else return dis1Grid.size();
		}
	}
	
	/**
	 * 그리드1건수
	 * 
	 * @param grid1Cnt 그리드1건수
	 */
	public void setGrid1Cnt(Integer grid1Cnt){
		this.grid1Cnt= grid1Cnt;
		this.setIsSet_grid1Cnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dis1Grid= false;
	protected final boolean isSet_dis1Grid(){
		return this.isSet_dis1Grid;
	}
	private void setIsSet_dis1Grid(boolean value){
		this.isSet_dis1Grid= value;
	}
	/**
	 * 회비.입금현황.목록.조회.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<MPBMbpfRcvstsListInq_ODT> getDis1Grid(){
		return dis1Grid;
	}
	
	/**
	 * 회비.입금현황.목록.조회.컨트롤러.출력.IO
	 * 
	 * @param dis1Grid 회비.입금현황.목록.조회.컨트롤러.출력.IO
	 */
	@JsonSetter("dis1Grid")
	public void setDis1Grid(List<MPBMbpfRcvstsListInq_ODT> dis1Grid){
		this.dis1Grid= dis1Grid;
		this.setIsSet_dis1Grid(true);
	}
	
	public void setDis1Grid(MPBMbpfRcvstsListInq_ODT... items){
		List<MPBMbpfRcvstsListInq_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBMbpfRcvstsListInq_ODT item: items ){
				_items.add(item);
			}
		}
		this.setDis1Grid(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhSrno= false;
	protected final boolean isSet_metMbhSrno(){
		return this.isSet_metMbhSrno;
	}
	private void setIsSet_metMbhSrno(boolean value){
		this.isSet_metMbhSrno= value;
	}
	/**
	 * 모임회원일련번호
	 */
	@XmlTransient
	public Integer getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(Integer metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhNm= false;
	protected final boolean isSet_metMbhNm(){
		return this.isSet_metMbhNm;
	}
	private void setIsSet_metMbhNm(boolean value){
		this.isSet_metMbhNm= value;
	}
	/**
	 * 모임회원명
	 */
	@XmlTransient
	public String getMetMbhNm(){
		return this.metMbhNm;
	}
	
	/**
	 * 모임회원명
	 * 
	 * @param metMbhNm 모임회원명
	 */
	public void setMetMbhNm(String metMbhNm){
		this.metMbhNm= metMbhNm;
		this.setIsSet_metMbhNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhAlsNm= false;
	protected final boolean isSet_metMbhAlsNm(){
		return this.isSet_metMbhAlsNm;
	}
	private void setIsSet_metMbhAlsNm(boolean value){
		this.isSet_metMbhAlsNm= value;
	}
	/**
	 * 모임회원별칭명
	 */
	@XmlTransient
	public String getMetMbhAlsNm(){
		return this.metMbhAlsNm;
	}
	
	/**
	 * 모임회원별칭명
	 * 
	 * @param metMbhAlsNm 모임회원별칭명
	 */
	public void setMetMbhAlsNm(String metMbhAlsNm){
		this.metMbhAlsNm= metMbhAlsNm;
		this.setIsSet_metMbhAlsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhDscd= false;
	protected final boolean isSet_metMbhDscd(){
		return this.isSet_metMbhDscd;
	}
	private void setIsSet_metMbhDscd(boolean value){
		this.isSet_metMbhDscd= value;
	}
	/**
	 * 모임회원구분코드
	 */
	@XmlTransient
	public String getMetMbhDscd(){
		return this.metMbhDscd;
	}
	
	/**
	 * 모임회원구분코드
	 * 
	 * @param metMbhDscd 모임회원구분코드
	 */
	public void setMetMbhDscd(String metMbhDscd){
		this.metMbhDscd= metMbhDscd;
		this.setIsSet_metMbhDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhDscdNm= false;
	protected final boolean isSet_metMbhDscdNm(){
		return this.isSet_metMbhDscdNm;
	}
	private void setIsSet_metMbhDscdNm(boolean value){
		this.isSet_metMbhDscdNm= value;
	}
	/**
	 * 모임회원구분코드명
	 */
	@XmlTransient
	public String getMetMbhDscdNm(){
		return this.metMbhDscdNm;
	}
	
	/**
	 * 모임회원구분코드명
	 * 
	 * @param metMbhDscdNm 모임회원구분코드명
	 */
	public void setMetMbhDscdNm(String metMbhDscdNm){
		this.metMbhDscdNm= metMbhDscdNm;
		this.setIsSet_metMbhDscdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhImgUrlNm= false;
	protected final boolean isSet_metMbhImgUrlNm(){
		return this.isSet_metMbhImgUrlNm;
	}
	private void setIsSet_metMbhImgUrlNm(boolean value){
		this.isSet_metMbhImgUrlNm= value;
	}
	/**
	 * 모임회원이미지URL명
	 */
	@XmlTransient
	public String getMetMbhImgUrlNm(){
		return this.metMbhImgUrlNm;
	}
	
	/**
	 * 모임회원이미지URL명
	 * 
	 * @param metMbhImgUrlNm 모임회원이미지URL명
	 */
	public void setMetMbhImgUrlNm(String metMbhImgUrlNm){
		this.metMbhImgUrlNm= metMbhImgUrlNm;
		this.setIsSet_metMbhImgUrlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtInqTrnDt= false;
	protected final boolean isSet_nxtInqTrnDt(){
		return this.isSet_nxtInqTrnDt;
	}
	private void setIsSet_nxtInqTrnDt(boolean value){
		this.isSet_nxtInqTrnDt= value;
	}
	/**
	 * 다음조회거래일자
	 */
	@XmlTransient
	public String getNxtInqTrnDt(){
		return this.nxtInqTrnDt;
	}
	
	/**
	 * 다음조회거래일자
	 * 
	 * @param nxtInqTrnDt 다음조회거래일자
	 */
	public void setNxtInqTrnDt(String nxtInqTrnDt){
		this.nxtInqTrnDt= nxtInqTrnDt;
		this.setIsSet_nxtInqTrnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtTrnSrno= false;
	protected final boolean isSet_nxtTrnSrno(){
		return this.isSet_nxtTrnSrno;
	}
	private void setIsSet_nxtTrnSrno(boolean value){
		this.isSet_nxtTrnSrno= value;
	}
	/**
	 * 다음거래일련번호
	 */
	@XmlTransient
	public Integer getNxtTrnSrno(){
		return this.nxtTrnSrno;
	}
	
	/**
	 * 다음거래일련번호
	 * 
	 * @param nxtTrnSrno 다음거래일련번호
	 */
	public void setNxtTrnSrno(Integer nxtTrnSrno){
		this.nxtTrnSrno= nxtTrnSrno;
		this.setIsSet_nxtTrnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid2Cnt= false;
	protected final boolean isSet_grid2Cnt(){
		return this.isSet_grid2Cnt;
	}
	private void setIsSet_grid2Cnt(boolean value){
		this.isSet_grid2Cnt= value;
	}
	/**
	 * 그리드2건수
	 */
	@XmlElement
	public Integer getGrid2Cnt(){
		if ( isSet_grid2Cnt )	return grid2Cnt;
		else{
			if ( dis2Grid == null || dis2Grid.size() == 0 ) return 0;
			else return dis2Grid.size();
		}
	}
	
	/**
	 * 그리드2건수
	 * 
	 * @param grid2Cnt 그리드2건수
	 */
	public void setGrid2Cnt(Integer grid2Cnt){
		this.grid2Cnt= grid2Cnt;
		this.setIsSet_grid2Cnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dis2Grid= false;
	protected final boolean isSet_dis2Grid(){
		return this.isSet_dis2Grid;
	}
	private void setIsSet_dis2Grid(boolean value){
		this.isSet_dis2Grid= value;
	}
	/**
	 * 회비.입금현황.목록2.조회.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<MPBMbpfRcvstsList2Inq_DTO> getDis2Grid(){
		return dis2Grid;
	}
	
	/**
	 * 회비.입금현황.목록2.조회.컨트롤러.출력.IO
	 * 
	 * @param dis2Grid 회비.입금현황.목록2.조회.컨트롤러.출력.IO
	 */
	@JsonSetter("dis2Grid")
	public void setDis2Grid(List<MPBMbpfRcvstsList2Inq_DTO> dis2Grid){
		this.dis2Grid= dis2Grid;
		this.setIsSet_dis2Grid(true);
	}
	
	public void setDis2Grid(MPBMbpfRcvstsList2Inq_DTO... items){
		List<MPBMbpfRcvstsList2Inq_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBMbpfRcvstsList2Inq_DTO item: items ){
				_items.add(item);
			}
		}
		this.setDis2Grid(_items);
	}
				
	@Override
	public MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT clone(){
		try{
			MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT object= (MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT)super.clone();
			if ( this.dis1Grid== null ) object.dis1Grid= null;
			else{
				List<MPBMbpfRcvstsListInq_ODT> clonedList= new ArrayList<>(this.dis1Grid.size());
				for( MPBMbpfRcvstsListInq_ODT item : dis1Grid ){
					clonedList.add((MPBMbpfRcvstsListInq_ODT)item.clone());
				}
				object.dis1Grid= clonedList;
			}
			if ( this.dis2Grid== null ) object.dis2Grid= null;
			else{
				List<MPBMbpfRcvstsList2Inq_DTO> clonedList= new ArrayList<>(this.dis2Grid.size());
				for( MPBMbpfRcvstsList2Inq_DTO item : dis2Grid ){
					clonedList.add((MPBMbpfRcvstsList2Inq_DTO)item.clone());
				}
				object.dis2Grid= clonedList;
			}
			return object;
		}
		catch(CloneNotSupportedException e){
			throw new CloneFailedException(e);
		}
	}
	
	@Override
	public int hashCode(){
		final int prime=31;
		int result= 1;
		
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.ebnkUtzpeNo==null)?0:this.ebnkUtzpeNo.hashCode());
		result= prime * result + ((this.metCtrStcd==null)?0:this.metCtrStcd.hashCode());
		result= prime * result + ((this.metCtrStcdNm==null)?0:this.metCtrStcdNm.hashCode());
		result= prime * result + ((this.metPbokDscd==null)?0:this.metPbokDscd.hashCode());
		result= prime * result + ((this.metPbokDscdNm==null)?0:this.metPbokDscdNm.hashCode());
		result= prime * result + ((this.metNm==null)?0:this.metNm.hashCode());
		result= prime * result + ((this.rcvBkwAcno==null)?0:this.rcvBkwAcno.hashCode());
		result= prime * result + ((this.cusUsgBkwAcno==null)?0:this.cusUsgBkwAcno.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.cusKorlNm==null)?0:this.cusKorlNm.hashCode());
		result= prime * result + ((this.cusBkpnNm==null)?0:this.cusBkpnNm.hashCode());
		result= prime * result + ((this.ctBal==null)?0:this.ctBal.hashCode());
		result= prime * result + ((this.payAvlBal==null)?0:this.payAvlBal.hashCode());
		result= prime * result + ((this.pdcd==null)?0:this.pdcd.hashCode());
		result= prime * result + ((this.pdcdKorlNm==null)?0:this.pdcdKorlNm.hashCode());
		result= prime * result + ((this.prdKorlAbrNm==null)?0:this.prdKorlAbrNm.hashCode());
		result= prime * result + ((this.rlfAcno==null)?0:this.rlfAcno.hashCode());
		result= prime * result + ((this.mbpfPymDt==null)?0:this.mbpfPymDt.hashCode());
		result= prime * result + ((this.mbpfPymCycd==null)?0:this.mbpfPymCycd.hashCode());
		result= prime * result + ((this.mbpfPymCycdNm==null)?0:this.mbpfPymCycdNm.hashCode());
		result= prime * result + ((this.mbpfPmtgtAm==null)?0:this.mbpfPmtgtAm.hashCode());
		result= prime * result + ((this.agmdCollDt==null)?0:this.agmdCollDt.hashCode());
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		result= prime * result + ((this.asmnlApvCd==null)?0:this.asmnlApvCd.hashCode());
		result= prime * result + ((this.asmnlApvCdNm==null)?0:this.asmnlApvCdNm.hashCode());
		result= prime * result + ((this.rppeChgRgsYn==null)?0:this.rppeChgRgsYn.hashCode());
		result= prime * result + ((this.rppeChgRgsDt==null)?0:this.rppeChgRgsDt.hashCode());
		result= prime * result + ((this.rppeChgVldDt==null)?0:this.rppeChgVldDt.hashCode());
		result= prime * result + ((this.metDscd==null)?0:this.metDscd.hashCode());
		result= prime * result + ((this.metDscdNm==null)?0:this.metDscdNm.hashCode());
		result= prime * result + ((this.metRgsDt==null)?0:this.metRgsDt.hashCode());
		result= prime * result + ((this.rgsTm==null)?0:this.rgsTm.hashCode());
		result= prime * result + ((this.metBscImgUrlNm==null)?0:this.metBscImgUrlNm.hashCode());
		result= prime * result + ((this.metMbhRgsCnt==null)?0:this.metMbhRgsCnt.hashCode());
		result= prime * result + ((this.metMbhScssCnt==null)?0:this.metMbhScssCnt.hashCode());
		result= prime * result + ((this.metRprsAlsNm==null)?0:this.metRprsAlsNm.hashCode());
		result= prime * result + ((this.metRprsMbhNm==null)?0:this.metRprsMbhNm.hashCode());
		result= prime * result + ((this.metRprsImgUrlNm==null)?0:this.metRprsImgUrlNm.hashCode());
		result= prime * result + ((this.totMbpfRcvAm==null)?0:this.totMbpfRcvAm.hashCode());
		result= prime * result + ((this.totMbpfXmpAm==null)?0:this.totMbpfXmpAm.hashCode());
		result= prime * result + ((this.mbpfPymMbhCn==null)?0:this.mbpfPymMbhCn.hashCode());
		result= prime * result + ((this.mbpfNpymMbhCn==null)?0:this.mbpfNpymMbhCn.hashCode());
		result= prime * result + ((this.inqBasYm==null)?0:this.inqBasYm.hashCode());
		result= prime * result + ((this.nxtMetMbhAlsNm==null)?0:this.nxtMetMbhAlsNm.hashCode());
		result= prime * result + ((this.grid1Cnt==null)?0:this.grid1Cnt.hashCode());
		result= prime * result + ((this.dis1Grid==null)?0:this.dis1Grid.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.metMbhNm==null)?0:this.metMbhNm.hashCode());
		result= prime * result + ((this.metMbhAlsNm==null)?0:this.metMbhAlsNm.hashCode());
		result= prime * result + ((this.metMbhDscd==null)?0:this.metMbhDscd.hashCode());
		result= prime * result + ((this.metMbhDscdNm==null)?0:this.metMbhDscdNm.hashCode());
		result= prime * result + ((this.metMbhImgUrlNm==null)?0:this.metMbhImgUrlNm.hashCode());
		result= prime * result + ((this.nxtInqTrnDt==null)?0:this.nxtInqTrnDt.hashCode());
		result= prime * result + ((this.nxtTrnSrno==null)?0:this.nxtTrnSrno.hashCode());
		result= prime * result + ((this.grid2Cnt==null)?0:this.grid2Cnt.hashCode());
		result= prime * result + ((this.dis2Grid==null)?0:this.dis2Grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT other= (MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _ebnkUtzpeNo= getEbnkUtzpeNo();
			Object __ebnkUtzpeNo= other.getEbnkUtzpeNo();
			if ( _ebnkUtzpeNo== null ) { if ( __ebnkUtzpeNo!= null ) return false; }
			else if ( !_ebnkUtzpeNo.equals(__ebnkUtzpeNo) ) return false;
		}
		{
			Object _metCtrStcd= getMetCtrStcd();
			Object __metCtrStcd= other.getMetCtrStcd();
			if ( _metCtrStcd== null ) { if ( __metCtrStcd!= null ) return false; }
			else if ( !_metCtrStcd.equals(__metCtrStcd) ) return false;
		}
		{
			Object _metCtrStcdNm= getMetCtrStcdNm();
			Object __metCtrStcdNm= other.getMetCtrStcdNm();
			if ( _metCtrStcdNm== null ) { if ( __metCtrStcdNm!= null ) return false; }
			else if ( !_metCtrStcdNm.equals(__metCtrStcdNm) ) return false;
		}
		{
			Object _metPbokDscd= getMetPbokDscd();
			Object __metPbokDscd= other.getMetPbokDscd();
			if ( _metPbokDscd== null ) { if ( __metPbokDscd!= null ) return false; }
			else if ( !_metPbokDscd.equals(__metPbokDscd) ) return false;
		}
		{
			Object _metPbokDscdNm= getMetPbokDscdNm();
			Object __metPbokDscdNm= other.getMetPbokDscdNm();
			if ( _metPbokDscdNm== null ) { if ( __metPbokDscdNm!= null ) return false; }
			else if ( !_metPbokDscdNm.equals(__metPbokDscdNm) ) return false;
		}
		{
			Object _metNm= getMetNm();
			Object __metNm= other.getMetNm();
			if ( _metNm== null ) { if ( __metNm!= null ) return false; }
			else if ( !_metNm.equals(__metNm) ) return false;
		}
		{
			Object _rcvBkwAcno= getRcvBkwAcno();
			Object __rcvBkwAcno= other.getRcvBkwAcno();
			if ( _rcvBkwAcno== null ) { if ( __rcvBkwAcno!= null ) return false; }
			else if ( !_rcvBkwAcno.equals(__rcvBkwAcno) ) return false;
		}
		{
			Object _cusUsgBkwAcno= getCusUsgBkwAcno();
			Object __cusUsgBkwAcno= other.getCusUsgBkwAcno();
			if ( _cusUsgBkwAcno== null ) { if ( __cusUsgBkwAcno!= null ) return false; }
			else if ( !_cusUsgBkwAcno.equals(__cusUsgBkwAcno) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _cusKorlNm= getCusKorlNm();
			Object __cusKorlNm= other.getCusKorlNm();
			if ( _cusKorlNm== null ) { if ( __cusKorlNm!= null ) return false; }
			else if ( !_cusKorlNm.equals(__cusKorlNm) ) return false;
		}
		{
			Object _cusBkpnNm= getCusBkpnNm();
			Object __cusBkpnNm= other.getCusBkpnNm();
			if ( _cusBkpnNm== null ) { if ( __cusBkpnNm!= null ) return false; }
			else if ( !_cusBkpnNm.equals(__cusBkpnNm) ) return false;
		}
		{
			Object _ctBal= getCtBal();
			Object __ctBal= other.getCtBal();
			if ( _ctBal== null ) { if ( __ctBal!= null ) return false; }
			else if ( !_ctBal.equals(__ctBal) ) return false;
		}
		{
			Object _payAvlBal= getPayAvlBal();
			Object __payAvlBal= other.getPayAvlBal();
			if ( _payAvlBal== null ) { if ( __payAvlBal!= null ) return false; }
			else if ( !_payAvlBal.equals(__payAvlBal) ) return false;
		}
		{
			Object _pdcd= getPdcd();
			Object __pdcd= other.getPdcd();
			if ( _pdcd== null ) { if ( __pdcd!= null ) return false; }
			else if ( !_pdcd.equals(__pdcd) ) return false;
		}
		{
			Object _pdcdKorlNm= getPdcdKorlNm();
			Object __pdcdKorlNm= other.getPdcdKorlNm();
			if ( _pdcdKorlNm== null ) { if ( __pdcdKorlNm!= null ) return false; }
			else if ( !_pdcdKorlNm.equals(__pdcdKorlNm) ) return false;
		}
		{
			Object _prdKorlAbrNm= getPrdKorlAbrNm();
			Object __prdKorlAbrNm= other.getPrdKorlAbrNm();
			if ( _prdKorlAbrNm== null ) { if ( __prdKorlAbrNm!= null ) return false; }
			else if ( !_prdKorlAbrNm.equals(__prdKorlAbrNm) ) return false;
		}
		{
			Object _rlfAcno= getRlfAcno();
			Object __rlfAcno= other.getRlfAcno();
			if ( _rlfAcno== null ) { if ( __rlfAcno!= null ) return false; }
			else if ( !_rlfAcno.equals(__rlfAcno) ) return false;
		}
		{
			Object _mbpfPymDt= getMbpfPymDt();
			Object __mbpfPymDt= other.getMbpfPymDt();
			if ( _mbpfPymDt== null ) { if ( __mbpfPymDt!= null ) return false; }
			else if ( !_mbpfPymDt.equals(__mbpfPymDt) ) return false;
		}
		{
			Object _mbpfPymCycd= getMbpfPymCycd();
			Object __mbpfPymCycd= other.getMbpfPymCycd();
			if ( _mbpfPymCycd== null ) { if ( __mbpfPymCycd!= null ) return false; }
			else if ( !_mbpfPymCycd.equals(__mbpfPymCycd) ) return false;
		}
		{
			Object _mbpfPymCycdNm= getMbpfPymCycdNm();
			Object __mbpfPymCycdNm= other.getMbpfPymCycdNm();
			if ( _mbpfPymCycdNm== null ) { if ( __mbpfPymCycdNm!= null ) return false; }
			else if ( !_mbpfPymCycdNm.equals(__mbpfPymCycdNm) ) return false;
		}
		{
			Object _mbpfPmtgtAm= getMbpfPmtgtAm();
			Object __mbpfPmtgtAm= other.getMbpfPmtgtAm();
			if ( _mbpfPmtgtAm== null ) { if ( __mbpfPmtgtAm!= null ) return false; }
			else if ( !_mbpfPmtgtAm.equals(__mbpfPmtgtAm) ) return false;
		}
		{
			Object _agmdCollDt= getAgmdCollDt();
			Object __agmdCollDt= other.getAgmdCollDt();
			if ( _agmdCollDt== null ) { if ( __agmdCollDt!= null ) return false; }
			else if ( !_agmdCollDt.equals(__agmdCollDt) ) return false;
		}
		{
			Object _advpeEno= getAdvpeEno();
			Object __advpeEno= other.getAdvpeEno();
			if ( _advpeEno== null ) { if ( __advpeEno!= null ) return false; }
			else if ( !_advpeEno.equals(__advpeEno) ) return false;
		}
		{
			Object _asmnlApvCd= getAsmnlApvCd();
			Object __asmnlApvCd= other.getAsmnlApvCd();
			if ( _asmnlApvCd== null ) { if ( __asmnlApvCd!= null ) return false; }
			else if ( !_asmnlApvCd.equals(__asmnlApvCd) ) return false;
		}
		{
			Object _asmnlApvCdNm= getAsmnlApvCdNm();
			Object __asmnlApvCdNm= other.getAsmnlApvCdNm();
			if ( _asmnlApvCdNm== null ) { if ( __asmnlApvCdNm!= null ) return false; }
			else if ( !_asmnlApvCdNm.equals(__asmnlApvCdNm) ) return false;
		}
		{
			Object _rppeChgRgsYn= getRppeChgRgsYn();
			Object __rppeChgRgsYn= other.getRppeChgRgsYn();
			if ( _rppeChgRgsYn== null ) { if ( __rppeChgRgsYn!= null ) return false; }
			else if ( !_rppeChgRgsYn.equals(__rppeChgRgsYn) ) return false;
		}
		{
			Object _rppeChgRgsDt= getRppeChgRgsDt();
			Object __rppeChgRgsDt= other.getRppeChgRgsDt();
			if ( _rppeChgRgsDt== null ) { if ( __rppeChgRgsDt!= null ) return false; }
			else if ( !_rppeChgRgsDt.equals(__rppeChgRgsDt) ) return false;
		}
		{
			Object _rppeChgVldDt= getRppeChgVldDt();
			Object __rppeChgVldDt= other.getRppeChgVldDt();
			if ( _rppeChgVldDt== null ) { if ( __rppeChgVldDt!= null ) return false; }
			else if ( !_rppeChgVldDt.equals(__rppeChgVldDt) ) return false;
		}
		{
			Object _metDscd= getMetDscd();
			Object __metDscd= other.getMetDscd();
			if ( _metDscd== null ) { if ( __metDscd!= null ) return false; }
			else if ( !_metDscd.equals(__metDscd) ) return false;
		}
		{
			Object _metDscdNm= getMetDscdNm();
			Object __metDscdNm= other.getMetDscdNm();
			if ( _metDscdNm== null ) { if ( __metDscdNm!= null ) return false; }
			else if ( !_metDscdNm.equals(__metDscdNm) ) return false;
		}
		{
			Object _metRgsDt= getMetRgsDt();
			Object __metRgsDt= other.getMetRgsDt();
			if ( _metRgsDt== null ) { if ( __metRgsDt!= null ) return false; }
			else if ( !_metRgsDt.equals(__metRgsDt) ) return false;
		}
		{
			Object _rgsTm= getRgsTm();
			Object __rgsTm= other.getRgsTm();
			if ( _rgsTm== null ) { if ( __rgsTm!= null ) return false; }
			else if ( !_rgsTm.equals(__rgsTm) ) return false;
		}
		{
			Object _metBscImgUrlNm= getMetBscImgUrlNm();
			Object __metBscImgUrlNm= other.getMetBscImgUrlNm();
			if ( _metBscImgUrlNm== null ) { if ( __metBscImgUrlNm!= null ) return false; }
			else if ( !_metBscImgUrlNm.equals(__metBscImgUrlNm) ) return false;
		}
		{
			Object _metMbhRgsCnt= getMetMbhRgsCnt();
			Object __metMbhRgsCnt= other.getMetMbhRgsCnt();
			if ( _metMbhRgsCnt== null ) { if ( __metMbhRgsCnt!= null ) return false; }
			else if ( !_metMbhRgsCnt.equals(__metMbhRgsCnt) ) return false;
		}
		{
			Object _metMbhScssCnt= getMetMbhScssCnt();
			Object __metMbhScssCnt= other.getMetMbhScssCnt();
			if ( _metMbhScssCnt== null ) { if ( __metMbhScssCnt!= null ) return false; }
			else if ( !_metMbhScssCnt.equals(__metMbhScssCnt) ) return false;
		}
		{
			Object _metRprsAlsNm= getMetRprsAlsNm();
			Object __metRprsAlsNm= other.getMetRprsAlsNm();
			if ( _metRprsAlsNm== null ) { if ( __metRprsAlsNm!= null ) return false; }
			else if ( !_metRprsAlsNm.equals(__metRprsAlsNm) ) return false;
		}
		{
			Object _metRprsMbhNm= getMetRprsMbhNm();
			Object __metRprsMbhNm= other.getMetRprsMbhNm();
			if ( _metRprsMbhNm== null ) { if ( __metRprsMbhNm!= null ) return false; }
			else if ( !_metRprsMbhNm.equals(__metRprsMbhNm) ) return false;
		}
		{
			Object _metRprsImgUrlNm= getMetRprsImgUrlNm();
			Object __metRprsImgUrlNm= other.getMetRprsImgUrlNm();
			if ( _metRprsImgUrlNm== null ) { if ( __metRprsImgUrlNm!= null ) return false; }
			else if ( !_metRprsImgUrlNm.equals(__metRprsImgUrlNm) ) return false;
		}
		{
			Object _totMbpfRcvAm= getTotMbpfRcvAm();
			Object __totMbpfRcvAm= other.getTotMbpfRcvAm();
			if ( _totMbpfRcvAm== null ) { if ( __totMbpfRcvAm!= null ) return false; }
			else if ( !_totMbpfRcvAm.equals(__totMbpfRcvAm) ) return false;
		}
		{
			Object _totMbpfXmpAm= getTotMbpfXmpAm();
			Object __totMbpfXmpAm= other.getTotMbpfXmpAm();
			if ( _totMbpfXmpAm== null ) { if ( __totMbpfXmpAm!= null ) return false; }
			else if ( !_totMbpfXmpAm.equals(__totMbpfXmpAm) ) return false;
		}
		{
			Object _mbpfPymMbhCn= getMbpfPymMbhCn();
			Object __mbpfPymMbhCn= other.getMbpfPymMbhCn();
			if ( _mbpfPymMbhCn== null ) { if ( __mbpfPymMbhCn!= null ) return false; }
			else if ( !_mbpfPymMbhCn.equals(__mbpfPymMbhCn) ) return false;
		}
		{
			Object _mbpfNpymMbhCn= getMbpfNpymMbhCn();
			Object __mbpfNpymMbhCn= other.getMbpfNpymMbhCn();
			if ( _mbpfNpymMbhCn== null ) { if ( __mbpfNpymMbhCn!= null ) return false; }
			else if ( !_mbpfNpymMbhCn.equals(__mbpfNpymMbhCn) ) return false;
		}
		{
			Object _inqBasYm= getInqBasYm();
			Object __inqBasYm= other.getInqBasYm();
			if ( _inqBasYm== null ) { if ( __inqBasYm!= null ) return false; }
			else if ( !_inqBasYm.equals(__inqBasYm) ) return false;
		}
		{
			Object _nxtMetMbhAlsNm= getNxtMetMbhAlsNm();
			Object __nxtMetMbhAlsNm= other.getNxtMetMbhAlsNm();
			if ( _nxtMetMbhAlsNm== null ) { if ( __nxtMetMbhAlsNm!= null ) return false; }
			else if ( !_nxtMetMbhAlsNm.equals(__nxtMetMbhAlsNm) ) return false;
		}
		{
			Object _grid1Cnt= getGrid1Cnt();
			Object __grid1Cnt= other.getGrid1Cnt();
			if ( _grid1Cnt== null ) { if ( __grid1Cnt!= null ) return false; }
			else if ( !_grid1Cnt.equals(__grid1Cnt) ) return false;
		}
		{
			Object _dis1Grid= getDis1Grid();
			Object __dis1Grid= other.getDis1Grid();
			if ( _dis1Grid== null ) { if ( __dis1Grid!= null ) return false; }
			else if ( !_dis1Grid.equals(__dis1Grid) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _metMbhNm= getMetMbhNm();
			Object __metMbhNm= other.getMetMbhNm();
			if ( _metMbhNm== null ) { if ( __metMbhNm!= null ) return false; }
			else if ( !_metMbhNm.equals(__metMbhNm) ) return false;
		}
		{
			Object _metMbhAlsNm= getMetMbhAlsNm();
			Object __metMbhAlsNm= other.getMetMbhAlsNm();
			if ( _metMbhAlsNm== null ) { if ( __metMbhAlsNm!= null ) return false; }
			else if ( !_metMbhAlsNm.equals(__metMbhAlsNm) ) return false;
		}
		{
			Object _metMbhDscd= getMetMbhDscd();
			Object __metMbhDscd= other.getMetMbhDscd();
			if ( _metMbhDscd== null ) { if ( __metMbhDscd!= null ) return false; }
			else if ( !_metMbhDscd.equals(__metMbhDscd) ) return false;
		}
		{
			Object _metMbhDscdNm= getMetMbhDscdNm();
			Object __metMbhDscdNm= other.getMetMbhDscdNm();
			if ( _metMbhDscdNm== null ) { if ( __metMbhDscdNm!= null ) return false; }
			else if ( !_metMbhDscdNm.equals(__metMbhDscdNm) ) return false;
		}
		{
			Object _metMbhImgUrlNm= getMetMbhImgUrlNm();
			Object __metMbhImgUrlNm= other.getMetMbhImgUrlNm();
			if ( _metMbhImgUrlNm== null ) { if ( __metMbhImgUrlNm!= null ) return false; }
			else if ( !_metMbhImgUrlNm.equals(__metMbhImgUrlNm) ) return false;
		}
		{
			Object _nxtInqTrnDt= getNxtInqTrnDt();
			Object __nxtInqTrnDt= other.getNxtInqTrnDt();
			if ( _nxtInqTrnDt== null ) { if ( __nxtInqTrnDt!= null ) return false; }
			else if ( !_nxtInqTrnDt.equals(__nxtInqTrnDt) ) return false;
		}
		{
			Object _nxtTrnSrno= getNxtTrnSrno();
			Object __nxtTrnSrno= other.getNxtTrnSrno();
			if ( _nxtTrnSrno== null ) { if ( __nxtTrnSrno!= null ) return false; }
			else if ( !_nxtTrnSrno.equals(__nxtTrnSrno) ) return false;
		}
		{
			Object _grid2Cnt= getGrid2Cnt();
			Object __grid2Cnt= other.getGrid2Cnt();
			if ( _grid2Cnt== null ) { if ( __grid2Cnt!= null ) return false; }
			else if ( !_grid2Cnt.equals(__grid2Cnt) ) return false;
		}
		{
			Object _dis2Grid= getDis2Grid();
			Object __dis2Grid= other.getDis2Grid();
			if ( _dis2Grid== null ) { if ( __dis2Grid!= null ) return false; }
			else if ( !_dis2Grid.equals(__dis2Grid) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngSelectByMbhMbpfRcvPrts_ODT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tebnkUtzpeNo: ");
		sb.append(ebnkUtzpeNo==null?"null":getEbnkUtzpeNo());
		sb.append("\n");
		sb.append("\tmetCtrStcd: ");
		sb.append(metCtrStcd==null?"null":getMetCtrStcd());
		sb.append("\n");
		sb.append("\tmetCtrStcdNm: ");
		sb.append(metCtrStcdNm==null?"null":getMetCtrStcdNm());
		sb.append("\n");
		sb.append("\tmetPbokDscd: ");
		sb.append(metPbokDscd==null?"null":getMetPbokDscd());
		sb.append("\n");
		sb.append("\tmetPbokDscdNm: ");
		sb.append(metPbokDscdNm==null?"null":getMetPbokDscdNm());
		sb.append("\n");
		sb.append("\tmetNm: ");
		sb.append(metNm==null?"null":getMetNm());
		sb.append("\n");
		sb.append("\trcvBkwAcno: ");
		sb.append(rcvBkwAcno==null?"null":getRcvBkwAcno());
		sb.append("\n");
		sb.append("\tcusUsgBkwAcno: ");
		sb.append(cusUsgBkwAcno==null?"null":getCusUsgBkwAcno());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tcusKorlNm: ");
		sb.append(cusKorlNm==null?"null":getCusKorlNm());
		sb.append("\n");
		sb.append("\tcusBkpnNm: ");
		sb.append(cusBkpnNm==null?"null":getCusBkpnNm());
		sb.append("\n");
		sb.append("\tctBal: ");
		sb.append(ctBal==null?"null":getCtBal());
		sb.append("\n");
		sb.append("\tpayAvlBal: ");
		sb.append(payAvlBal==null?"null":getPayAvlBal());
		sb.append("\n");
		sb.append("\tpdcd: ");
		sb.append(pdcd==null?"null":getPdcd());
		sb.append("\n");
		sb.append("\tpdcdKorlNm: ");
		sb.append(pdcdKorlNm==null?"null":getPdcdKorlNm());
		sb.append("\n");
		sb.append("\tprdKorlAbrNm: ");
		sb.append(prdKorlAbrNm==null?"null":getPrdKorlAbrNm());
		sb.append("\n");
		sb.append("\trlfAcno: ");
		sb.append(rlfAcno==null?"null":getRlfAcno());
		sb.append("\n");
		sb.append("\tmbpfPymDt: ");
		sb.append(mbpfPymDt==null?"null":getMbpfPymDt());
		sb.append("\n");
		sb.append("\tmbpfPymCycd: ");
		sb.append(mbpfPymCycd==null?"null":getMbpfPymCycd());
		sb.append("\n");
		sb.append("\tmbpfPymCycdNm: ");
		sb.append(mbpfPymCycdNm==null?"null":getMbpfPymCycdNm());
		sb.append("\n");
		sb.append("\tmbpfPmtgtAm: ");
		sb.append(mbpfPmtgtAm==null?"null":getMbpfPmtgtAm());
		sb.append("\n");
		sb.append("\tagmdCollDt: ");
		sb.append(agmdCollDt==null?"null":getAgmdCollDt());
		sb.append("\n");
		sb.append("\tadvpeEno: ");
		sb.append(advpeEno==null?"null":getAdvpeEno());
		sb.append("\n");
		sb.append("\tasmnlApvCd: ");
		sb.append(asmnlApvCd==null?"null":getAsmnlApvCd());
		sb.append("\n");
		sb.append("\tasmnlApvCdNm: ");
		sb.append(asmnlApvCdNm==null?"null":getAsmnlApvCdNm());
		sb.append("\n");
		sb.append("\trppeChgRgsYn: ");
		sb.append(rppeChgRgsYn==null?"null":getRppeChgRgsYn());
		sb.append("\n");
		sb.append("\trppeChgRgsDt: ");
		sb.append(rppeChgRgsDt==null?"null":getRppeChgRgsDt());
		sb.append("\n");
		sb.append("\trppeChgVldDt: ");
		sb.append(rppeChgVldDt==null?"null":getRppeChgVldDt());
		sb.append("\n");
		sb.append("\tmetDscd: ");
		sb.append(metDscd==null?"null":getMetDscd());
		sb.append("\n");
		sb.append("\tmetDscdNm: ");
		sb.append(metDscdNm==null?"null":getMetDscdNm());
		sb.append("\n");
		sb.append("\tmetRgsDt: ");
		sb.append(metRgsDt==null?"null":getMetRgsDt());
		sb.append("\n");
		sb.append("\trgsTm: ");
		sb.append(rgsTm==null?"null":getRgsTm());
		sb.append("\n");
		sb.append("\tmetBscImgUrlNm: ");
		sb.append(metBscImgUrlNm==null?"null":getMetBscImgUrlNm());
		sb.append("\n");
		sb.append("\tmetMbhRgsCnt: ");
		sb.append(metMbhRgsCnt==null?"null":getMetMbhRgsCnt());
		sb.append("\n");
		sb.append("\tmetMbhScssCnt: ");
		sb.append(metMbhScssCnt==null?"null":getMetMbhScssCnt());
		sb.append("\n");
		sb.append("\tmetRprsAlsNm: ");
		sb.append(metRprsAlsNm==null?"null":getMetRprsAlsNm());
		sb.append("\n");
		sb.append("\tmetRprsMbhNm: ");
		sb.append(metRprsMbhNm==null?"null":getMetRprsMbhNm());
		sb.append("\n");
		sb.append("\tmetRprsImgUrlNm: ");
		sb.append(metRprsImgUrlNm==null?"null":getMetRprsImgUrlNm());
		sb.append("\n");
		sb.append("\ttotMbpfRcvAm: ");
		sb.append(totMbpfRcvAm==null?"null":getTotMbpfRcvAm());
		sb.append("\n");
		sb.append("\ttotMbpfXmpAm: ");
		sb.append(totMbpfXmpAm==null?"null":getTotMbpfXmpAm());
		sb.append("\n");
		sb.append("\tmbpfPymMbhCn: ");
		sb.append(mbpfPymMbhCn==null?"null":getMbpfPymMbhCn());
		sb.append("\n");
		sb.append("\tmbpfNpymMbhCn: ");
		sb.append(mbpfNpymMbhCn==null?"null":getMbpfNpymMbhCn());
		sb.append("\n");
		sb.append("\tinqBasYm: ");
		sb.append(inqBasYm==null?"null":getInqBasYm());
		sb.append("\n");
		sb.append("\tnxtMetMbhAlsNm: ");
		sb.append(nxtMetMbhAlsNm==null?"null":getNxtMetMbhAlsNm());
		sb.append("\n");
		sb.append("\tgrid1Cnt: ");
		sb.append(grid1Cnt==null?"null":getGrid1Cnt());
		sb.append("\n");
		sb.append("\tdis1Grid: ");
		if ( dis1Grid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(dis1Grid.size());
			sb.append("(items)\n");
	
			int max= (10<dis1Grid.size())?10:dis1Grid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tdis1Grid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(dis1Grid.get(i));
				sb.append("\n");
			}
	
			if ( max < dis1Grid.size() ){
				sb.append("\tdis1Grid[.] : ").append("more ").append((dis1Grid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tmetMbhNm: ");
		sb.append(metMbhNm==null?"null":getMetMbhNm());
		sb.append("\n");
		sb.append("\tmetMbhAlsNm: ");
		sb.append(metMbhAlsNm==null?"null":getMetMbhAlsNm());
		sb.append("\n");
		sb.append("\tmetMbhDscd: ");
		sb.append(metMbhDscd==null?"null":getMetMbhDscd());
		sb.append("\n");
		sb.append("\tmetMbhDscdNm: ");
		sb.append(metMbhDscdNm==null?"null":getMetMbhDscdNm());
		sb.append("\n");
		sb.append("\tmetMbhImgUrlNm: ");
		sb.append(metMbhImgUrlNm==null?"null":getMetMbhImgUrlNm());
		sb.append("\n");
		sb.append("\tnxtInqTrnDt: ");
		sb.append(nxtInqTrnDt==null?"null":getNxtInqTrnDt());
		sb.append("\n");
		sb.append("\tnxtTrnSrno: ");
		sb.append(nxtTrnSrno==null?"null":getNxtTrnSrno());
		sb.append("\n");
		sb.append("\tgrid2Cnt: ");
		sb.append(grid2Cnt==null?"null":getGrid2Cnt());
		sb.append("\n");
		sb.append("\tdis2Grid: ");
		if ( dis2Grid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(dis2Grid.size());
			sb.append("(items)\n");
	
			int max= (10<dis2Grid.size())?10:dis2Grid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tdis2Grid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(dis2Grid.get(i));
				sb.append("\n");
			}
	
			if ( max < dis2Grid.size() ){
				sb.append("\tdis2Grid[.] : ").append("more ").append((dis2Grid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 13; /* ebnkUtzpeNo */
		messageLen+= 2; /* metCtrStcd */
		messageLen+= 50; /* metCtrStcdNm */
		messageLen+= 1; /* metPbokDscd */
		messageLen+= 50; /* metPbokDscdNm */
		messageLen+= 100; /* metNm */
		messageLen+= 20; /* rcvBkwAcno */
		messageLen+= 20; /* cusUsgBkwAcno */
		messageLen+= 11; /* itcsno */
		messageLen+= 100; /* cusKorlNm */
		messageLen+= 40; /* cusBkpnNm */
		messageLen+= 19; /* ctBal */
		messageLen+= 19; /* payAvlBal */
		messageLen+= 9; /* pdcd */
		messageLen+= 100; /* pdcdKorlNm */
		messageLen+= 50; /* prdKorlAbrNm */
		messageLen+= 11; /* rlfAcno */
		messageLen+= 8; /* mbpfPymDt */
		messageLen+= 2; /* mbpfPymCycd */
		messageLen+= 50; /* mbpfPymCycdNm */
		messageLen+= 19; /* mbpfPmtgtAm */
		messageLen+= 8; /* agmdCollDt */
		messageLen+= 8; /* advpeEno */
		messageLen+= 1; /* asmnlApvCd */
		messageLen+= 50; /* asmnlApvCdNm */
		messageLen+= 1; /* rppeChgRgsYn */
		messageLen+= 8; /* rppeChgRgsDt */
		messageLen+= 8; /* rppeChgVldDt */
		messageLen+= 2; /* metDscd */
		messageLen+= 50; /* metDscdNm */
		messageLen+= 8; /* metRgsDt */
		messageLen+= 6; /* rgsTm */
		messageLen+= 100; /* metBscImgUrlNm */
		messageLen+= 6; /* metMbhRgsCnt */
		messageLen+= 6; /* metMbhScssCnt */
		messageLen+= 60; /* metRprsAlsNm */
		messageLen+= 60; /* metRprsMbhNm */
		messageLen+= 100; /* metRprsImgUrlNm */
		messageLen+= 19; /* totMbpfRcvAm */
		messageLen+= 19; /* totMbpfXmpAm */
		messageLen+= 5; /* mbpfPymMbhCn */
		messageLen+= 5; /* mbpfNpymMbhCn */
		messageLen+= 6; /* inqBasYm */
		messageLen+= 60; /* nxtMetMbhAlsNm */
		messageLen+= 3; /* grid1Cnt */
		{/*dis1Grid*/
			int size=getGrid1Cnt();
			int count= dis1Grid == null ? 0 : dis1Grid.size();
			int min= size > count?count:size;
			MPBMbpfRcvstsListInq_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBMbpfRcvstsListInq_ODT element= dis1Grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.ctr.dto.MPBMbpfRcvstsListInq_ODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 7; /* metMbhSrno */
		messageLen+= 60; /* metMbhNm */
		messageLen+= 60; /* metMbhAlsNm */
		messageLen+= 1; /* metMbhDscd */
		messageLen+= 50; /* metMbhDscdNm */
		messageLen+= 100; /* metMbhImgUrlNm */
		messageLen+= 8; /* nxtInqTrnDt */
		messageLen+= 8; /* nxtTrnSrno */
		messageLen+= 3; /* grid2Cnt */
		{/*dis2Grid*/
			int size=getGrid2Cnt();
			int count= dis2Grid == null ? 0 : dis2Grid.size();
			int min= size > count?count:size;
			MPBMbpfRcvstsList2Inq_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBMbpfRcvstsList2Inq_DTO element= dis2Grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.dto.MPBMbpfRcvstsList2Inq_DTO();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("ebnkUtzpeNo");
		list.add("metCtrStcd");
		list.add("metCtrStcdNm");
		list.add("metPbokDscd");
		list.add("metPbokDscdNm");
		list.add("metNm");
		list.add("rcvBkwAcno");
		list.add("cusUsgBkwAcno");
		list.add("itcsno");
		list.add("cusKorlNm");
		list.add("cusBkpnNm");
		list.add("ctBal");
		list.add("payAvlBal");
		list.add("pdcd");
		list.add("pdcdKorlNm");
		list.add("prdKorlAbrNm");
		list.add("rlfAcno");
		list.add("mbpfPymDt");
		list.add("mbpfPymCycd");
		list.add("mbpfPymCycdNm");
		list.add("mbpfPmtgtAm");
		list.add("agmdCollDt");
		list.add("advpeEno");
		list.add("asmnlApvCd");
		list.add("asmnlApvCdNm");
		list.add("rppeChgRgsYn");
		list.add("rppeChgRgsDt");
		list.add("rppeChgVldDt");
		list.add("metDscd");
		list.add("metDscdNm");
		list.add("metRgsDt");
		list.add("rgsTm");
		list.add("metBscImgUrlNm");
		list.add("metMbhRgsCnt");
		list.add("metMbhScssCnt");
		list.add("metRprsAlsNm");
		list.add("metRprsMbhNm");
		list.add("metRprsImgUrlNm");
		list.add("totMbpfRcvAm");
		list.add("totMbpfXmpAm");
		list.add("mbpfPymMbhCn");
		list.add("mbpfNpymMbhCn");
		list.add("inqBasYm");
		list.add("nxtMetMbhAlsNm");
		list.add("grid1Cnt");
		list.add("dis1Grid");
		list.add("metMbhSrno");
		list.add("metMbhNm");
		list.add("metMbhAlsNm");
		list.add("metMbhDscd");
		list.add("metMbhDscdNm");
		list.add("metMbhImgUrlNm");
		list.add("nxtInqTrnDt");
		list.add("nxtTrnSrno");
		list.add("grid2Cnt");
		list.add("dis2Grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("ebnkUtzpeNo", get("ebnkUtzpeNo"));
		map.put("metCtrStcd", get("metCtrStcd"));
		map.put("metCtrStcdNm", get("metCtrStcdNm"));
		map.put("metPbokDscd", get("metPbokDscd"));
		map.put("metPbokDscdNm", get("metPbokDscdNm"));
		map.put("metNm", get("metNm"));
		map.put("rcvBkwAcno", get("rcvBkwAcno"));
		map.put("cusUsgBkwAcno", get("cusUsgBkwAcno"));
		map.put("itcsno", get("itcsno"));
		map.put("cusKorlNm", get("cusKorlNm"));
		map.put("cusBkpnNm", get("cusBkpnNm"));
		map.put("ctBal", get("ctBal"));
		map.put("payAvlBal", get("payAvlBal"));
		map.put("pdcd", get("pdcd"));
		map.put("pdcdKorlNm", get("pdcdKorlNm"));
		map.put("prdKorlAbrNm", get("prdKorlAbrNm"));
		map.put("rlfAcno", get("rlfAcno"));
		map.put("mbpfPymDt", get("mbpfPymDt"));
		map.put("mbpfPymCycd", get("mbpfPymCycd"));
		map.put("mbpfPymCycdNm", get("mbpfPymCycdNm"));
		map.put("mbpfPmtgtAm", get("mbpfPmtgtAm"));
		map.put("agmdCollDt", get("agmdCollDt"));
		map.put("advpeEno", get("advpeEno"));
		map.put("asmnlApvCd", get("asmnlApvCd"));
		map.put("asmnlApvCdNm", get("asmnlApvCdNm"));
		map.put("rppeChgRgsYn", get("rppeChgRgsYn"));
		map.put("rppeChgRgsDt", get("rppeChgRgsDt"));
		map.put("rppeChgVldDt", get("rppeChgVldDt"));
		map.put("metDscd", get("metDscd"));
		map.put("metDscdNm", get("metDscdNm"));
		map.put("metRgsDt", get("metRgsDt"));
		map.put("rgsTm", get("rgsTm"));
		map.put("metBscImgUrlNm", get("metBscImgUrlNm"));
		map.put("metMbhRgsCnt", get("metMbhRgsCnt"));
		map.put("metMbhScssCnt", get("metMbhScssCnt"));
		map.put("metRprsAlsNm", get("metRprsAlsNm"));
		map.put("metRprsMbhNm", get("metRprsMbhNm"));
		map.put("metRprsImgUrlNm", get("metRprsImgUrlNm"));
		map.put("totMbpfRcvAm", get("totMbpfRcvAm"));
		map.put("totMbpfXmpAm", get("totMbpfXmpAm"));
		map.put("mbpfPymMbhCn", get("mbpfPymMbhCn"));
		map.put("mbpfNpymMbhCn", get("mbpfNpymMbhCn"));
		map.put("inqBasYm", get("inqBasYm"));
		map.put("nxtMetMbhAlsNm", get("nxtMetMbhAlsNm"));
		map.put("grid1Cnt", get("grid1Cnt"));
		map.put("dis1Grid", get("dis1Grid"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("metMbhNm", get("metMbhNm"));
		map.put("metMbhAlsNm", get("metMbhAlsNm"));
		map.put("metMbhDscd", get("metMbhDscd"));
		map.put("metMbhDscdNm", get("metMbhDscdNm"));
		map.put("metMbhImgUrlNm", get("metMbhImgUrlNm"));
		map.put("nxtInqTrnDt", get("nxtInqTrnDt"));
		map.put("nxtTrnSrno", get("nxtTrnSrno"));
		map.put("grid2Cnt", get("grid2Cnt"));
		map.put("dis2Grid", get("dis2Grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -1070809513:/* ebnkUtzpeNo */
			return getEbnkUtzpeNo();
		case 955180743:/* metCtrStcd */
			return getMetCtrStcd();
		case -1194304794:/* metCtrStcdNm */
			return getMetCtrStcdNm();
		case 1867195290:/* metPbokDscd */
			return getMetPbokDscd();
		case -921653511:/* metPbokDscdNm */
			return getMetPbokDscdNm();
		case 103786683:/* metNm */
			return getMetNm();
		case 1637074860:/* rcvBkwAcno */
			return getRcvBkwAcno();
		case -2031113431:/* cusUsgBkwAcno */
			return getCusUsgBkwAcno();
		case -1178714660:/* itcsno */
			return getItcsno();
		case 437921438:/* cusKorlNm */
			return getCusKorlNm();
		case 176507335:/* cusBkpnNm */
			return getCusBkpnNm();
		case 94950876:/* ctBal */
			return getCtBal();
		case -1330609026:/* payAvlBal */
			return getPayAvlBal();
		case 3435861:/* pdcd */
			return getPdcd();
		case 657289906:/* pdcdKorlNm */
			return getPdcdKorlNm();
		case -578609776:/* prdKorlAbrNm */
			return getPrdKorlAbrNm();
		case 1284387055:/* rlfAcno */
			return getRlfAcno();
		case -1128355927:/* mbpfPymDt */
			return getMbpfPymDt();
		case -2018309072:/* mbpfPymCycd */
			return getMbpfPymCycd();
		case 1730202127:/* mbpfPymCycdNm */
			return getMbpfPymCycdNm();
		case 1940639685:/* mbpfPmtgtAm */
			return getMbpfPmtgtAm();
		case -1798348999:/* agmdCollDt */
			return getAgmdCollDt();
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		case -596421905:/* asmnlApvCd */
			return getAsmnlApvCd();
		case -1930797810:/* asmnlApvCdNm */
			return getAsmnlApvCdNm();
		case 1379479268:/* rppeChgRgsYn */
			return getRppeChgRgsYn();
		case 1379478623:/* rppeChgRgsDt */
			return getRppeChgRgsDt();
		case 1383307247:/* rppeChgVldDt */
			return getRppeChgVldDt();
		case 954465580:/* metDscd */
			return getMetDscd();
		case -1881576437:/* metDscdNm */
			return getMetDscdNm();
		case -463751790:/* metRgsDt */
			return getMetRgsDt();
		case 108463095:/* rgsTm */
			return getRgsTm();
		case 300784225:/* metBscImgUrlNm */
			return getMetBscImgUrlNm();
		case 574880898:/* metMbhRgsCnt */
			return getMetMbhRgsCnt();
		case 1415814306:/* metMbhScssCnt */
			return getMetMbhScssCnt();
		case -48308916:/* metRprsAlsNm */
			return getMetRprsAlsNm();
		case -37535145:/* metRprsMbhNm */
			return getMetRprsMbhNm();
		case 1251382182:/* metRprsImgUrlNm */
			return getMetRprsImgUrlNm();
		case -248329587:/* totMbpfRcvAm */
			return getTotMbpfRcvAm();
		case -242496317:/* totMbpfXmpAm */
			return getTotMbpfXmpAm();
		case 1865482117:/* mbpfPymMbhCn */
			return getMbpfPymMbhCn();
		case 1471625341:/* mbpfNpymMbhCn */
			return getMbpfNpymMbhCn();
		case 451698108:/* inqBasYm */
			return getInqBasYm();
		case -468170874:/* nxtMetMbhAlsNm */
			return getNxtMetMbhAlsNm();
		case 316983230:/* grid1Cnt */
			return getGrid1Cnt();
		case 225813321:/* dis1Grid */
			return getDis1Grid();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case -468528618:/* metMbhNm */
			return getMetMbhNm();
		case 695730640:/* metMbhAlsNm */
			return getMetMbhAlsNm();
		case 715275207:/* metMbhDscd */
			return getMetMbhDscd();
		case 184709094:/* metMbhDscdNm */
			return getMetMbhDscdNm();
		case 607580322:/* metMbhImgUrlNm */
			return getMetMbhImgUrlNm();
		case -880791586:/* nxtInqTrnDt */
			return getNxtInqTrnDt();
		case -1376489754:/* nxtTrnSrno */
			return getNxtTrnSrno();
		case 317013021:/* grid2Cnt */
			return getGrid2Cnt();
		case 226736842:/* dis2Grid */
			return getDis2Grid();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case -1070809513:/* ebnkUtzpeNo */
			setEbnkUtzpeNo((String)value);
			break;
		case 955180743:/* metCtrStcd */
			setMetCtrStcd((String)value);
			break;
		case -1194304794:/* metCtrStcdNm */
			setMetCtrStcdNm((String)value);
			break;
		case 1867195290:/* metPbokDscd */
			setMetPbokDscd((String)value);
			break;
		case -921653511:/* metPbokDscdNm */
			setMetPbokDscdNm((String)value);
			break;
		case 103786683:/* metNm */
			setMetNm((String)value);
			break;
		case 1637074860:/* rcvBkwAcno */
			setRcvBkwAcno((String)value);
			break;
		case -2031113431:/* cusUsgBkwAcno */
			setCusUsgBkwAcno((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 437921438:/* cusKorlNm */
			setCusKorlNm((String)value);
			break;
		case 176507335:/* cusBkpnNm */
			setCusBkpnNm((String)value);
			break;
		case 94950876:/* ctBal */
			if ( value instanceof String ){
				setCtBal((String)value);
			}
			else if ( value instanceof Double ){
				setCtBal((Double)value);
			}
			else if ( value instanceof Long ){
				setCtBal((Long)value);
			}
			else{
				setCtBal((BigDecimal)value);
			}
			break;
		case -1330609026:/* payAvlBal */
			if ( value instanceof String ){
				setPayAvlBal((String)value);
			}
			else if ( value instanceof Double ){
				setPayAvlBal((Double)value);
			}
			else if ( value instanceof Long ){
				setPayAvlBal((Long)value);
			}
			else{
				setPayAvlBal((BigDecimal)value);
			}
			break;
		case 3435861:/* pdcd */
			setPdcd((String)value);
			break;
		case 657289906:/* pdcdKorlNm */
			setPdcdKorlNm((String)value);
			break;
		case -578609776:/* prdKorlAbrNm */
			setPrdKorlAbrNm((String)value);
			break;
		case 1284387055:/* rlfAcno */
			setRlfAcno((String)value);
			break;
		case -1128355927:/* mbpfPymDt */
			setMbpfPymDt((String)value);
			break;
		case -2018309072:/* mbpfPymCycd */
			setMbpfPymCycd((String)value);
			break;
		case 1730202127:/* mbpfPymCycdNm */
			setMbpfPymCycdNm((String)value);
			break;
		case 1940639685:/* mbpfPmtgtAm */
			if ( value instanceof String ){
				setMbpfPmtgtAm((String)value);
			}
			else if ( value instanceof Double ){
				setMbpfPmtgtAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMbpfPmtgtAm((Long)value);
			}
			else{
				setMbpfPmtgtAm((BigDecimal)value);
			}
			break;
		case -1798348999:/* agmdCollDt */
			setAgmdCollDt((String)value);
			break;
		case -705281570:/* advpeEno */
			setAdvpeEno((String)value);
			break;
		case -596421905:/* asmnlApvCd */
			setAsmnlApvCd((String)value);
			break;
		case -1930797810:/* asmnlApvCdNm */
			setAsmnlApvCdNm((String)value);
			break;
		case 1379479268:/* rppeChgRgsYn */
			setRppeChgRgsYn((String)value);
			break;
		case 1379478623:/* rppeChgRgsDt */
			setRppeChgRgsDt((String)value);
			break;
		case 1383307247:/* rppeChgVldDt */
			setRppeChgVldDt((String)value);
			break;
		case 954465580:/* metDscd */
			setMetDscd((String)value);
			break;
		case -1881576437:/* metDscdNm */
			setMetDscdNm((String)value);
			break;
		case -463751790:/* metRgsDt */
			setMetRgsDt((String)value);
			break;
		case 108463095:/* rgsTm */
			setRgsTm((String)value);
			break;
		case 300784225:/* metBscImgUrlNm */
			setMetBscImgUrlNm((String)value);
			break;
		case 574880898:/* metMbhRgsCnt */
			setMetMbhRgsCnt((Integer)value);
			break;
		case 1415814306:/* metMbhScssCnt */
			setMetMbhScssCnt((Integer)value);
			break;
		case -48308916:/* metRprsAlsNm */
			setMetRprsAlsNm((String)value);
			break;
		case -37535145:/* metRprsMbhNm */
			setMetRprsMbhNm((String)value);
			break;
		case 1251382182:/* metRprsImgUrlNm */
			setMetRprsImgUrlNm((String)value);
			break;
		case -248329587:/* totMbpfRcvAm */
			if ( value instanceof String ){
				setTotMbpfRcvAm((String)value);
			}
			else if ( value instanceof Double ){
				setTotMbpfRcvAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTotMbpfRcvAm((Long)value);
			}
			else{
				setTotMbpfRcvAm((BigDecimal)value);
			}
			break;
		case -242496317:/* totMbpfXmpAm */
			if ( value instanceof String ){
				setTotMbpfXmpAm((String)value);
			}
			else if ( value instanceof Double ){
				setTotMbpfXmpAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTotMbpfXmpAm((Long)value);
			}
			else{
				setTotMbpfXmpAm((BigDecimal)value);
			}
			break;
		case 1865482117:/* mbpfPymMbhCn */
			setMbpfPymMbhCn((Integer)value);
			break;
		case 1471625341:/* mbpfNpymMbhCn */
			setMbpfNpymMbhCn((Integer)value);
			break;
		case 451698108:/* inqBasYm */
			setInqBasYm((String)value);
			break;
		case -468170874:/* nxtMetMbhAlsNm */
			setNxtMetMbhAlsNm((String)value);
			break;
		case 316983230:/* grid1Cnt */
			setGrid1Cnt((Integer)value);
			break;
		case 225813321:/* dis1Grid */
			setDis1Grid((List<MPBMbpfRcvstsListInq_ODT>)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
			break;
		case -468528618:/* metMbhNm */
			setMetMbhNm((String)value);
			break;
		case 695730640:/* metMbhAlsNm */
			setMetMbhAlsNm((String)value);
			break;
		case 715275207:/* metMbhDscd */
			setMetMbhDscd((String)value);
			break;
		case 184709094:/* metMbhDscdNm */
			setMetMbhDscdNm((String)value);
			break;
		case 607580322:/* metMbhImgUrlNm */
			setMetMbhImgUrlNm((String)value);
			break;
		case -880791586:/* nxtInqTrnDt */
			setNxtInqTrnDt((String)value);
			break;
		case -1376489754:/* nxtTrnSrno */
			setNxtTrnSrno((Integer)value);
			break;
		case 317013021:/* grid2Cnt */
			setGrid2Cnt((Integer)value);
			break;
		case 226736842:/* dis2Grid */
			setDis2Grid((List<MPBMbpfRcvstsList2Inq_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
