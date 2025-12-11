/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
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
	"dpsAcno", "prdNm", "dpacBal", "rgsTrnDt", "rvkTrnDt", "bkAppPushAgrYn", "rcvCnt", "rcvSumAm", "payCnt", "paySumAm", "grid1Cnt", "subSpceList", "grid2Cnt", "trnPrts", "grid3Cnt"
	, "atsList", "grid4Cnt", "atpmList", "atpmNxtTrnYn", "atpmMngNo"
}, name="PBPPbokSplitInqSelectPbokSplitItInf_DODT")
@XmlRootElement(name="PBPPbokSplitInqSelectPbokSplitItInf_DODT")
@BxmCategory(logicalName="통장.쪼개기.통합.정보.조회.DBM.출력.IO", description="") 
public class PBPPbokSplitInqSelectPbokSplitItInf_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1023648837L;
	
	
	
	/**
	 * 수신계좌번호
	 */
	@ApiModelProperty(
		name = "dpsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsAcno")
	@BxmOmm_Field(length=13, decimal=0, description="수신계좌번호", align="left", fill="")
	private String dpsAcno= "";
	
	
	/**
	 * 상품명
	 */
	@ApiModelProperty(
		name = "prdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdNm")
	@BxmOmm_Field(length=1000, decimal=0, description="상품명", align="left", fill="")
	private String prdNm= "";
	
	
	/**
	 * 수신계좌잔액
	 */
	@ApiModelProperty(
		name = "dpacBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dpacBal")
	@BxmOmm_Field(length=19, decimal=3, description="수신계좌잔액", align="right", fill="0")
	private BigDecimal dpacBal= new BigDecimal("0");
	
	
	/**
	 * 등록거래일자
	 */
	@ApiModelProperty(
		name = "rgsTrnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgsTrnDt")
	@BxmOmm_Field(length=8, decimal=0, description="등록거래일자", align="left", fill="")
	private String rgsTrnDt= "";
	
	
	/**
	 * 해제거래일자
	 */
	@ApiModelProperty(
		name = "rvkTrnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rvkTrnDt")
	@BxmOmm_Field(length=8, decimal=0, description="해제거래일자", align="left", fill="")
	private String rvkTrnDt= "";
	
	
	/**
	 * 은행앱PUSH동의여부
	 */
	@ApiModelProperty(
		name = "bkAppPushAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bkAppPushAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="은행앱PUSH동의여부", align="left", fill="")
	private String bkAppPushAgrYn= "";
	
	
	/**
	 * 입금건수
	 */
	@ApiModelProperty(
		name = "rcvCnt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvCnt")
	@BxmOmm_Field(length=5, decimal=0, description="입금건수", align="left", fill="")
	private String rcvCnt= "";
	
	
	/**
	 * 입금합계금액
	 */
	@ApiModelProperty(
		name = "rcvSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rcvSumAm")
	@BxmOmm_Field(length=19, decimal=3, description="입금합계금액", align="right", fill="0")
	private BigDecimal rcvSumAm= new BigDecimal("0");
	
	
	/**
	 * 지급건수
	 */
	@ApiModelProperty(
		name = "payCnt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("payCnt")
	@BxmOmm_Field(length=5, decimal=0, description="지급건수", align="left", fill="")
	private String payCnt= "";
	
	
	/**
	 * 지급합계금액
	 */
	@ApiModelProperty(
		name = "paySumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("paySumAm")
	@BxmOmm_Field(length=19, decimal=3, description="지급합계금액", align="right", fill="0")
	private BigDecimal paySumAm= new BigDecimal("0");
	
	
	/**
	 * 공간목록건수
	 */
	@ApiModelProperty(
		name = "grid1Cnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("grid1Cnt")
	@BxmOmm_Field(length=3, decimal=0, description="공간목록건수", align="right", fill="0")
	private Integer grid1Cnt= 0;
	
	
	/**
	 * 서브공간목록
	 */
	@ApiModelProperty(
		name = "subSpceList"
		, dataType = "[Lcom.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("subSpceList")
	@BxmOmm_Field(length=0, decimal=0, description="서브공간목록", align="left", fill="", arrayReference="1")
	private List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> subSpceList= new ArrayList<>();
	
	/**
	 * 거래내역건수
	 */
	@ApiModelProperty(
		name = "grid2Cnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("grid2Cnt")
	@BxmOmm_Field(length=3, decimal=0, description="거래내역건수", align="right", fill="0")
	private Integer grid2Cnt= 0;
	
	
	/**
	 * 거래내역
	 */
	@ApiModelProperty(
		name = "trnPrts"
		, dataType = "[Lcom.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("trnPrts")
	@BxmOmm_Field(length=0, decimal=0, description="거래내역", align="left", fill="", arrayReference="1")
	private List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> trnPrts= new ArrayList<>();
	
	/**
	 * 자동이체목록건수
	 */
	@ApiModelProperty(
		name = "grid3Cnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("grid3Cnt")
	@BxmOmm_Field(length=3, decimal=0, description="자동이체목록건수", align="right", fill="0")
	private Integer grid3Cnt= 0;
	
	
	/**
	 * 자동이체목록
	 */
	@ApiModelProperty(
		name = "atsList"
		, dataType = "[Lcom.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("atsList")
	@BxmOmm_Field(length=0, decimal=0, description="자동이체목록", align="left", fill="", arrayReference="1")
	private List<PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT> atsList= new ArrayList<>();
	
	/**
	 * 자동납부목록건수
	 */
	@ApiModelProperty(
		name = "grid4Cnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("grid4Cnt")
	@BxmOmm_Field(length=3, decimal=0, description="자동납부목록건수", align="right", fill="0")
	private Integer grid4Cnt= 0;
	
	
	/**
	 * 자동납부목록
	 */
	@ApiModelProperty(
		name = "atpmList"
		, dataType = "[Lcom.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("atpmList")
	@BxmOmm_Field(length=0, decimal=0, description="자동납부목록", align="left", fill="", arrayReference="1")
	private List<PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT> atpmList= new ArrayList<>();
	
	/**
	 * 자동납부다음거래여부
	 */
	@ApiModelProperty(
		name = "atpmNxtTrnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmNxtTrnYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동납부다음거래여부", align="left", fill="")
	private String atpmNxtTrnYn= "";
	
	
	/**
	 * 자동납부관리번호
	 */
	@ApiModelProperty(
		name = "atpmMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmMngNo")
	@BxmOmm_Field(length=15, decimal=0, description="자동납부관리번호", align="left", fill="")
	private String atpmMngNo= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsAcno= false;
	protected final boolean isSet_dpsAcno(){
		return this.isSet_dpsAcno;
	}
	private void setIsSet_dpsAcno(boolean value){
		this.isSet_dpsAcno= value;
	}
	/**
	 * 수신계좌번호
	 */
	@XmlTransient
	public String getDpsAcno(){
		return this.dpsAcno;
	}
	
	/**
	 * 수신계좌번호
	 * 
	 * @param dpsAcno 수신계좌번호
	 */
	public void setDpsAcno(String dpsAcno){
		this.dpsAcno= dpsAcno;
		this.setIsSet_dpsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdNm= false;
	protected final boolean isSet_prdNm(){
		return this.isSet_prdNm;
	}
	private void setIsSet_prdNm(boolean value){
		this.isSet_prdNm= value;
	}
	/**
	 * 상품명
	 */
	@XmlTransient
	public String getPrdNm(){
		return this.prdNm;
	}
	
	/**
	 * 상품명
	 * 
	 * @param prdNm 상품명
	 */
	public void setPrdNm(String prdNm){
		this.prdNm= prdNm;
		this.setIsSet_prdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpacBal= false;
	protected final boolean isSet_dpacBal(){
		return this.isSet_dpacBal;
	}
	private void setIsSet_dpacBal(boolean value){
		this.isSet_dpacBal= value;
	}
	/**
	 * 수신계좌잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param dpacBal 수신계좌잔액
	 */
	public void setDpacBal(double dpacBal) {
		setDpacBal(BigDecimal.valueOf(dpacBal));
	}
	/**
	 * 수신계좌잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param dpacBal 수신계좌잔액
	 */
	public void setDpacBal(long dpacBal) {
		setDpacBal(BigDecimal.valueOf(dpacBal));
	}
	/**
	 * 수신계좌잔액
	 * BigDecimal - String value setter
	 *
	 * @Param dpacBal 수신계좌잔액
	 */
	public void setDpacBal(String dpacBal) {
		setDpacBal(new BigDecimal(dpacBal));
	}
	/**
	 * 수신계좌잔액
	 */
	@XmlTransient
	public BigDecimal getDpacBal(){
		return this.dpacBal;
	}
	
	/**
	 * 수신계좌잔액
	 * 
	 * @param dpacBal 수신계좌잔액
	 */
	@JsonSetter("dpacBal")
	public void setDpacBal(BigDecimal dpacBal){
		this.dpacBal= dpacBal;
		this.setIsSet_dpacBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsTrnDt= false;
	protected final boolean isSet_rgsTrnDt(){
		return this.isSet_rgsTrnDt;
	}
	private void setIsSet_rgsTrnDt(boolean value){
		this.isSet_rgsTrnDt= value;
	}
	/**
	 * 등록거래일자
	 */
	@XmlTransient
	public String getRgsTrnDt(){
		return this.rgsTrnDt;
	}
	
	/**
	 * 등록거래일자
	 * 
	 * @param rgsTrnDt 등록거래일자
	 */
	public void setRgsTrnDt(String rgsTrnDt){
		this.rgsTrnDt= rgsTrnDt;
		this.setIsSet_rgsTrnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rvkTrnDt= false;
	protected final boolean isSet_rvkTrnDt(){
		return this.isSet_rvkTrnDt;
	}
	private void setIsSet_rvkTrnDt(boolean value){
		this.isSet_rvkTrnDt= value;
	}
	/**
	 * 해제거래일자
	 */
	@XmlTransient
	public String getRvkTrnDt(){
		return this.rvkTrnDt;
	}
	
	/**
	 * 해제거래일자
	 * 
	 * @param rvkTrnDt 해제거래일자
	 */
	public void setRvkTrnDt(String rvkTrnDt){
		this.rvkTrnDt= rvkTrnDt;
		this.setIsSet_rvkTrnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bkAppPushAgrYn= false;
	protected final boolean isSet_bkAppPushAgrYn(){
		return this.isSet_bkAppPushAgrYn;
	}
	private void setIsSet_bkAppPushAgrYn(boolean value){
		this.isSet_bkAppPushAgrYn= value;
	}
	/**
	 * 은행앱PUSH동의여부
	 */
	@XmlTransient
	public String getBkAppPushAgrYn(){
		return this.bkAppPushAgrYn;
	}
	
	/**
	 * 은행앱PUSH동의여부
	 * 
	 * @param bkAppPushAgrYn 은행앱PUSH동의여부
	 */
	public void setBkAppPushAgrYn(String bkAppPushAgrYn){
		this.bkAppPushAgrYn= bkAppPushAgrYn;
		this.setIsSet_bkAppPushAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvCnt= false;
	protected final boolean isSet_rcvCnt(){
		return this.isSet_rcvCnt;
	}
	private void setIsSet_rcvCnt(boolean value){
		this.isSet_rcvCnt= value;
	}
	/**
	 * 입금건수
	 */
	@XmlTransient
	public String getRcvCnt(){
		return this.rcvCnt;
	}
	
	/**
	 * 입금건수
	 * 
	 * @param rcvCnt 입금건수
	 */
	public void setRcvCnt(String rcvCnt){
		this.rcvCnt= rcvCnt;
		this.setIsSet_rcvCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvSumAm= false;
	protected final boolean isSet_rcvSumAm(){
		return this.isSet_rcvSumAm;
	}
	private void setIsSet_rcvSumAm(boolean value){
		this.isSet_rcvSumAm= value;
	}
	/**
	 * 입금합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(double rcvSumAm) {
		setRcvSumAm(BigDecimal.valueOf(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(long rcvSumAm) {
		setRcvSumAm(BigDecimal.valueOf(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(String rcvSumAm) {
		setRcvSumAm(new BigDecimal(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 */
	@XmlTransient
	public BigDecimal getRcvSumAm(){
		return this.rcvSumAm;
	}
	
	/**
	 * 입금합계금액
	 * 
	 * @param rcvSumAm 입금합계금액
	 */
	@JsonSetter("rcvSumAm")
	public void setRcvSumAm(BigDecimal rcvSumAm){
		this.rcvSumAm= rcvSumAm;
		this.setIsSet_rcvSumAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_payCnt= false;
	protected final boolean isSet_payCnt(){
		return this.isSet_payCnt;
	}
	private void setIsSet_payCnt(boolean value){
		this.isSet_payCnt= value;
	}
	/**
	 * 지급건수
	 */
	@XmlTransient
	public String getPayCnt(){
		return this.payCnt;
	}
	
	/**
	 * 지급건수
	 * 
	 * @param payCnt 지급건수
	 */
	public void setPayCnt(String payCnt){
		this.payCnt= payCnt;
		this.setIsSet_payCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_paySumAm= false;
	protected final boolean isSet_paySumAm(){
		return this.isSet_paySumAm;
	}
	private void setIsSet_paySumAm(boolean value){
		this.isSet_paySumAm= value;
	}
	/**
	 * 지급합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(double paySumAm) {
		setPaySumAm(BigDecimal.valueOf(paySumAm));
	}
	/**
	 * 지급합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(long paySumAm) {
		setPaySumAm(BigDecimal.valueOf(paySumAm));
	}
	/**
	 * 지급합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(String paySumAm) {
		setPaySumAm(new BigDecimal(paySumAm));
	}
	/**
	 * 지급합계금액
	 */
	@XmlTransient
	public BigDecimal getPaySumAm(){
		return this.paySumAm;
	}
	
	/**
	 * 지급합계금액
	 * 
	 * @param paySumAm 지급합계금액
	 */
	@JsonSetter("paySumAm")
	public void setPaySumAm(BigDecimal paySumAm){
		this.paySumAm= paySumAm;
		this.setIsSet_paySumAm(true);
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
	 * 공간목록건수
	 */
	@XmlTransient
	public Integer getGrid1Cnt(){
		return this.grid1Cnt;
	}
	
	/**
	 * 공간목록건수
	 * 
	 * @param grid1Cnt 공간목록건수
	 */
	public void setGrid1Cnt(Integer grid1Cnt){
		this.grid1Cnt= grid1Cnt;
		this.setIsSet_grid1Cnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_subSpceList= false;
	protected final boolean isSet_subSpceList(){
		return this.isSet_subSpceList;
	}
	private void setIsSet_subSpceList(boolean value){
		this.isSet_subSpceList= value;
	}
	/**
	 * 서브공간목록
	 */
	@XmlTransient
	public List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> getSubSpceList(){
		return subSpceList;
	}
	
	/**
	 * 서브공간목록
	 * 
	 * @param subSpceList 서브공간목록
	 */
	@JsonSetter("subSpceList")
	public void setSubSpceList(List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> subSpceList){
		this.subSpceList= subSpceList;
		this.setIsSet_subSpceList(true);
	}
	
	public void setSubSpceList(PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT... items){
		List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT item: items ){
				_items.add(item);
			}
		}
		this.setSubSpceList(_items);
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
	 * 거래내역건수
	 */
	@XmlTransient
	public Integer getGrid2Cnt(){
		return this.grid2Cnt;
	}
	
	/**
	 * 거래내역건수
	 * 
	 * @param grid2Cnt 거래내역건수
	 */
	public void setGrid2Cnt(Integer grid2Cnt){
		this.grid2Cnt= grid2Cnt;
		this.setIsSet_grid2Cnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnPrts= false;
	protected final boolean isSet_trnPrts(){
		return this.isSet_trnPrts;
	}
	private void setIsSet_trnPrts(boolean value){
		this.isSet_trnPrts= value;
	}
	/**
	 * 거래내역
	 */
	@XmlTransient
	public List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> getTrnPrts(){
		return trnPrts;
	}
	
	/**
	 * 거래내역
	 * 
	 * @param trnPrts 거래내역
	 */
	@JsonSetter("trnPrts")
	public void setTrnPrts(List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> trnPrts){
		this.trnPrts= trnPrts;
		this.setIsSet_trnPrts(true);
	}
	
	public void setTrnPrts(PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT... items){
		List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT item: items ){
				_items.add(item);
			}
		}
		this.setTrnPrts(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid3Cnt= false;
	protected final boolean isSet_grid3Cnt(){
		return this.isSet_grid3Cnt;
	}
	private void setIsSet_grid3Cnt(boolean value){
		this.isSet_grid3Cnt= value;
	}
	/**
	 * 자동이체목록건수
	 */
	@XmlTransient
	public Integer getGrid3Cnt(){
		return this.grid3Cnt;
	}
	
	/**
	 * 자동이체목록건수
	 * 
	 * @param grid3Cnt 자동이체목록건수
	 */
	public void setGrid3Cnt(Integer grid3Cnt){
		this.grid3Cnt= grid3Cnt;
		this.setIsSet_grid3Cnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsList= false;
	protected final boolean isSet_atsList(){
		return this.isSet_atsList;
	}
	private void setIsSet_atsList(boolean value){
		this.isSet_atsList= value;
	}
	/**
	 * 자동이체목록
	 */
	@XmlTransient
	public List<PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT> getAtsList(){
		return atsList;
	}
	
	/**
	 * 자동이체목록
	 * 
	 * @param atsList 자동이체목록
	 */
	@JsonSetter("atsList")
	public void setAtsList(List<PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT> atsList){
		this.atsList= atsList;
		this.setIsSet_atsList(true);
	}
	
	public void setAtsList(PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT... items){
		List<PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT item: items ){
				_items.add(item);
			}
		}
		this.setAtsList(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid4Cnt= false;
	protected final boolean isSet_grid4Cnt(){
		return this.isSet_grid4Cnt;
	}
	private void setIsSet_grid4Cnt(boolean value){
		this.isSet_grid4Cnt= value;
	}
	/**
	 * 자동납부목록건수
	 */
	@XmlTransient
	public Integer getGrid4Cnt(){
		return this.grid4Cnt;
	}
	
	/**
	 * 자동납부목록건수
	 * 
	 * @param grid4Cnt 자동납부목록건수
	 */
	public void setGrid4Cnt(Integer grid4Cnt){
		this.grid4Cnt= grid4Cnt;
		this.setIsSet_grid4Cnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmList= false;
	protected final boolean isSet_atpmList(){
		return this.isSet_atpmList;
	}
	private void setIsSet_atpmList(boolean value){
		this.isSet_atpmList= value;
	}
	/**
	 * 자동납부목록
	 */
	@XmlTransient
	public List<PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT> getAtpmList(){
		return atpmList;
	}
	
	/**
	 * 자동납부목록
	 * 
	 * @param atpmList 자동납부목록
	 */
	@JsonSetter("atpmList")
	public void setAtpmList(List<PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT> atpmList){
		this.atpmList= atpmList;
		this.setIsSet_atpmList(true);
	}
	
	public void setAtpmList(PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT... items){
		List<PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT item: items ){
				_items.add(item);
			}
		}
		this.setAtpmList(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmNxtTrnYn= false;
	protected final boolean isSet_atpmNxtTrnYn(){
		return this.isSet_atpmNxtTrnYn;
	}
	private void setIsSet_atpmNxtTrnYn(boolean value){
		this.isSet_atpmNxtTrnYn= value;
	}
	/**
	 * 자동납부다음거래여부
	 */
	@XmlTransient
	public String getAtpmNxtTrnYn(){
		return this.atpmNxtTrnYn;
	}
	
	/**
	 * 자동납부다음거래여부
	 * 
	 * @param atpmNxtTrnYn 자동납부다음거래여부
	 */
	public void setAtpmNxtTrnYn(String atpmNxtTrnYn){
		this.atpmNxtTrnYn= atpmNxtTrnYn;
		this.setIsSet_atpmNxtTrnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmMngNo= false;
	protected final boolean isSet_atpmMngNo(){
		return this.isSet_atpmMngNo;
	}
	private void setIsSet_atpmMngNo(boolean value){
		this.isSet_atpmMngNo= value;
	}
	/**
	 * 자동납부관리번호
	 */
	@XmlTransient
	public String getAtpmMngNo(){
		return this.atpmMngNo;
	}
	
	/**
	 * 자동납부관리번호
	 * 
	 * @param atpmMngNo 자동납부관리번호
	 */
	public void setAtpmMngNo(String atpmMngNo){
		this.atpmMngNo= atpmMngNo;
		this.setIsSet_atpmMngNo(true);
	}
				
	@Override
	public PBPPbokSplitInqSelectPbokSplitItInf_DODT clone(){
		try{
			PBPPbokSplitInqSelectPbokSplitItInf_DODT object= (PBPPbokSplitInqSelectPbokSplitItInf_DODT)super.clone();
			if ( this.subSpceList== null ) object.subSpceList= null;
			else{
				List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT> clonedList= new ArrayList<>(this.subSpceList.size());
				for( PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT item : subSpceList ){
					clonedList.add((PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT)item.clone());
				}
				object.subSpceList= clonedList;
			}
			if ( this.trnPrts== null ) object.trnPrts= null;
			else{
				List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT> clonedList= new ArrayList<>(this.trnPrts.size());
				for( PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT item : trnPrts ){
					clonedList.add((PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT)item.clone());
				}
				object.trnPrts= clonedList;
			}
			if ( this.atsList== null ) object.atsList= null;
			else{
				List<PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT> clonedList= new ArrayList<>(this.atsList.size());
				for( PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT item : atsList ){
					clonedList.add((PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT)item.clone());
				}
				object.atsList= clonedList;
			}
			if ( this.atpmList== null ) object.atpmList= null;
			else{
				List<PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT> clonedList= new ArrayList<>(this.atpmList.size());
				for( PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT item : atpmList ){
					clonedList.add((PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT)item.clone());
				}
				object.atpmList= clonedList;
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
		
		result= prime * result + ((this.dpsAcno==null)?0:this.dpsAcno.hashCode());
		result= prime * result + ((this.prdNm==null)?0:this.prdNm.hashCode());
		result= prime * result + ((this.dpacBal==null)?0:this.dpacBal.hashCode());
		result= prime * result + ((this.rgsTrnDt==null)?0:this.rgsTrnDt.hashCode());
		result= prime * result + ((this.rvkTrnDt==null)?0:this.rvkTrnDt.hashCode());
		result= prime * result + ((this.bkAppPushAgrYn==null)?0:this.bkAppPushAgrYn.hashCode());
		result= prime * result + ((this.rcvCnt==null)?0:this.rcvCnt.hashCode());
		result= prime * result + ((this.rcvSumAm==null)?0:this.rcvSumAm.hashCode());
		result= prime * result + ((this.payCnt==null)?0:this.payCnt.hashCode());
		result= prime * result + ((this.paySumAm==null)?0:this.paySumAm.hashCode());
		result= prime * result + ((this.grid1Cnt==null)?0:this.grid1Cnt.hashCode());
		result= prime * result + ((this.subSpceList==null)?0:this.subSpceList.hashCode());
		result= prime * result + ((this.grid2Cnt==null)?0:this.grid2Cnt.hashCode());
		result= prime * result + ((this.trnPrts==null)?0:this.trnPrts.hashCode());
		result= prime * result + ((this.grid3Cnt==null)?0:this.grid3Cnt.hashCode());
		result= prime * result + ((this.atsList==null)?0:this.atsList.hashCode());
		result= prime * result + ((this.grid4Cnt==null)?0:this.grid4Cnt.hashCode());
		result= prime * result + ((this.atpmList==null)?0:this.atpmList.hashCode());
		result= prime * result + ((this.atpmNxtTrnYn==null)?0:this.atpmNxtTrnYn.hashCode());
		result= prime * result + ((this.atpmMngNo==null)?0:this.atpmMngNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSplitInqSelectPbokSplitItInf_DODT other= (PBPPbokSplitInqSelectPbokSplitItInf_DODT)obj;
		{
			Object _dpsAcno= getDpsAcno();
			Object __dpsAcno= other.getDpsAcno();
			if ( _dpsAcno== null ) { if ( __dpsAcno!= null ) return false; }
			else if ( !_dpsAcno.equals(__dpsAcno) ) return false;
		}
		{
			Object _prdNm= getPrdNm();
			Object __prdNm= other.getPrdNm();
			if ( _prdNm== null ) { if ( __prdNm!= null ) return false; }
			else if ( !_prdNm.equals(__prdNm) ) return false;
		}
		{
			Object _dpacBal= getDpacBal();
			Object __dpacBal= other.getDpacBal();
			if ( _dpacBal== null ) { if ( __dpacBal!= null ) return false; }
			else if ( !_dpacBal.equals(__dpacBal) ) return false;
		}
		{
			Object _rgsTrnDt= getRgsTrnDt();
			Object __rgsTrnDt= other.getRgsTrnDt();
			if ( _rgsTrnDt== null ) { if ( __rgsTrnDt!= null ) return false; }
			else if ( !_rgsTrnDt.equals(__rgsTrnDt) ) return false;
		}
		{
			Object _rvkTrnDt= getRvkTrnDt();
			Object __rvkTrnDt= other.getRvkTrnDt();
			if ( _rvkTrnDt== null ) { if ( __rvkTrnDt!= null ) return false; }
			else if ( !_rvkTrnDt.equals(__rvkTrnDt) ) return false;
		}
		{
			Object _bkAppPushAgrYn= getBkAppPushAgrYn();
			Object __bkAppPushAgrYn= other.getBkAppPushAgrYn();
			if ( _bkAppPushAgrYn== null ) { if ( __bkAppPushAgrYn!= null ) return false; }
			else if ( !_bkAppPushAgrYn.equals(__bkAppPushAgrYn) ) return false;
		}
		{
			Object _rcvCnt= getRcvCnt();
			Object __rcvCnt= other.getRcvCnt();
			if ( _rcvCnt== null ) { if ( __rcvCnt!= null ) return false; }
			else if ( !_rcvCnt.equals(__rcvCnt) ) return false;
		}
		{
			Object _rcvSumAm= getRcvSumAm();
			Object __rcvSumAm= other.getRcvSumAm();
			if ( _rcvSumAm== null ) { if ( __rcvSumAm!= null ) return false; }
			else if ( !_rcvSumAm.equals(__rcvSumAm) ) return false;
		}
		{
			Object _payCnt= getPayCnt();
			Object __payCnt= other.getPayCnt();
			if ( _payCnt== null ) { if ( __payCnt!= null ) return false; }
			else if ( !_payCnt.equals(__payCnt) ) return false;
		}
		{
			Object _paySumAm= getPaySumAm();
			Object __paySumAm= other.getPaySumAm();
			if ( _paySumAm== null ) { if ( __paySumAm!= null ) return false; }
			else if ( !_paySumAm.equals(__paySumAm) ) return false;
		}
		{
			Object _grid1Cnt= getGrid1Cnt();
			Object __grid1Cnt= other.getGrid1Cnt();
			if ( _grid1Cnt== null ) { if ( __grid1Cnt!= null ) return false; }
			else if ( !_grid1Cnt.equals(__grid1Cnt) ) return false;
		}
		{
			Object _subSpceList= getSubSpceList();
			Object __subSpceList= other.getSubSpceList();
			if ( _subSpceList== null ) { if ( __subSpceList!= null ) return false; }
			else if ( !_subSpceList.equals(__subSpceList) ) return false;
		}
		{
			Object _grid2Cnt= getGrid2Cnt();
			Object __grid2Cnt= other.getGrid2Cnt();
			if ( _grid2Cnt== null ) { if ( __grid2Cnt!= null ) return false; }
			else if ( !_grid2Cnt.equals(__grid2Cnt) ) return false;
		}
		{
			Object _trnPrts= getTrnPrts();
			Object __trnPrts= other.getTrnPrts();
			if ( _trnPrts== null ) { if ( __trnPrts!= null ) return false; }
			else if ( !_trnPrts.equals(__trnPrts) ) return false;
		}
		{
			Object _grid3Cnt= getGrid3Cnt();
			Object __grid3Cnt= other.getGrid3Cnt();
			if ( _grid3Cnt== null ) { if ( __grid3Cnt!= null ) return false; }
			else if ( !_grid3Cnt.equals(__grid3Cnt) ) return false;
		}
		{
			Object _atsList= getAtsList();
			Object __atsList= other.getAtsList();
			if ( _atsList== null ) { if ( __atsList!= null ) return false; }
			else if ( !_atsList.equals(__atsList) ) return false;
		}
		{
			Object _grid4Cnt= getGrid4Cnt();
			Object __grid4Cnt= other.getGrid4Cnt();
			if ( _grid4Cnt== null ) { if ( __grid4Cnt!= null ) return false; }
			else if ( !_grid4Cnt.equals(__grid4Cnt) ) return false;
		}
		{
			Object _atpmList= getAtpmList();
			Object __atpmList= other.getAtpmList();
			if ( _atpmList== null ) { if ( __atpmList!= null ) return false; }
			else if ( !_atpmList.equals(__atpmList) ) return false;
		}
		{
			Object _atpmNxtTrnYn= getAtpmNxtTrnYn();
			Object __atpmNxtTrnYn= other.getAtpmNxtTrnYn();
			if ( _atpmNxtTrnYn== null ) { if ( __atpmNxtTrnYn!= null ) return false; }
			else if ( !_atpmNxtTrnYn.equals(__atpmNxtTrnYn) ) return false;
		}
		{
			Object _atpmMngNo= getAtpmMngNo();
			Object __atpmMngNo= other.getAtpmMngNo();
			if ( _atpmMngNo== null ) { if ( __atpmMngNo!= null ) return false; }
			else if ( !_atpmMngNo.equals(__atpmMngNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSplitInqSelectPbokSplitItInf_DODT.class.getName()).append(":\n");
		sb.append("\tdpsAcno: ");
		sb.append(dpsAcno==null?"null":getDpsAcno());
		sb.append("\n");
		sb.append("\tprdNm: ");
		sb.append(prdNm==null?"null":getPrdNm());
		sb.append("\n");
		sb.append("\tdpacBal: ");
		sb.append(dpacBal==null?"null":getDpacBal());
		sb.append("\n");
		sb.append("\trgsTrnDt: ");
		sb.append(rgsTrnDt==null?"null":getRgsTrnDt());
		sb.append("\n");
		sb.append("\trvkTrnDt: ");
		sb.append(rvkTrnDt==null?"null":getRvkTrnDt());
		sb.append("\n");
		sb.append("\tbkAppPushAgrYn: ");
		sb.append(bkAppPushAgrYn==null?"null":getBkAppPushAgrYn());
		sb.append("\n");
		sb.append("\trcvCnt: ");
		sb.append(rcvCnt==null?"null":getRcvCnt());
		sb.append("\n");
		sb.append("\trcvSumAm: ");
		sb.append(rcvSumAm==null?"null":getRcvSumAm());
		sb.append("\n");
		sb.append("\tpayCnt: ");
		sb.append(payCnt==null?"null":getPayCnt());
		sb.append("\n");
		sb.append("\tpaySumAm: ");
		sb.append(paySumAm==null?"null":getPaySumAm());
		sb.append("\n");
		sb.append("\tgrid1Cnt: ");
		sb.append(grid1Cnt==null?"null":getGrid1Cnt());
		sb.append("\n");
		sb.append("\tsubSpceList: ");
		if ( subSpceList== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(subSpceList.size());
			sb.append("(items)\n");
	
			int max= (10<subSpceList.size())?10:subSpceList.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tsubSpceList[");
				sb.append(i);
				sb.append("] : ");
				sb.append(subSpceList.get(i));
				sb.append("\n");
			}
	
			if ( max < subSpceList.size() ){
				sb.append("\tsubSpceList[.] : ").append("more ").append((subSpceList.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tgrid2Cnt: ");
		sb.append(grid2Cnt==null?"null":getGrid2Cnt());
		sb.append("\n");
		sb.append("\ttrnPrts: ");
		if ( trnPrts== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(trnPrts.size());
			sb.append("(items)\n");
	
			int max= (10<trnPrts.size())?10:trnPrts.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\ttrnPrts[");
				sb.append(i);
				sb.append("] : ");
				sb.append(trnPrts.get(i));
				sb.append("\n");
			}
	
			if ( max < trnPrts.size() ){
				sb.append("\ttrnPrts[.] : ").append("more ").append((trnPrts.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tgrid3Cnt: ");
		sb.append(grid3Cnt==null?"null":getGrid3Cnt());
		sb.append("\n");
		sb.append("\tatsList: ");
		if ( atsList== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(atsList.size());
			sb.append("(items)\n");
	
			int max= (10<atsList.size())?10:atsList.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tatsList[");
				sb.append(i);
				sb.append("] : ");
				sb.append(atsList.get(i));
				sb.append("\n");
			}
	
			if ( max < atsList.size() ){
				sb.append("\tatsList[.] : ").append("more ").append((atsList.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tgrid4Cnt: ");
		sb.append(grid4Cnt==null?"null":getGrid4Cnt());
		sb.append("\n");
		sb.append("\tatpmList: ");
		if ( atpmList== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(atpmList.size());
			sb.append("(items)\n");
	
			int max= (10<atpmList.size())?10:atpmList.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tatpmList[");
				sb.append(i);
				sb.append("] : ");
				sb.append(atpmList.get(i));
				sb.append("\n");
			}
	
			if ( max < atpmList.size() ){
				sb.append("\tatpmList[.] : ").append("more ").append((atpmList.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tatpmNxtTrnYn: ");
		sb.append(atpmNxtTrnYn==null?"null":getAtpmNxtTrnYn());
		sb.append("\n");
		sb.append("\tatpmMngNo: ");
		sb.append(atpmMngNo==null?"null":getAtpmMngNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* dpsAcno */
		messageLen+= 1000; /* prdNm */
		messageLen+= 19; /* dpacBal */
		messageLen+= 8; /* rgsTrnDt */
		messageLen+= 8; /* rvkTrnDt */
		messageLen+= 1; /* bkAppPushAgrYn */
		messageLen+= 5; /* rcvCnt */
		messageLen+= 19; /* rcvSumAm */
		messageLen+= 5; /* payCnt */
		messageLen+= 19; /* paySumAm */
		messageLen+= 3; /* grid1Cnt */
		{/*subSpceList*/
			int size=1;
			int count= subSpceList == null ? 0 : subSpceList.size();
			int min= size > count?count:size;
			PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT element= subSpceList.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 3; /* grid2Cnt */
		{/*trnPrts*/
			int size=1;
			int count= trnPrts == null ? 0 : trnPrts.size();
			int min= size > count?count:size;
			PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT element= trnPrts.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 3; /* grid3Cnt */
		{/*atsList*/
			int size=1;
			int count= atsList == null ? 0 : atsList.size();
			int min= size > count?count:size;
			PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT element= atsList.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 3; /* grid4Cnt */
		{/*atpmList*/
			int size=1;
			int count= atpmList == null ? 0 : atpmList.size();
			int min= size > count?count:size;
			PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT element= atpmList.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.dto.PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 1; /* atpmNxtTrnYn */
		messageLen+= 15; /* atpmMngNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsAcno");
		list.add("prdNm");
		list.add("dpacBal");
		list.add("rgsTrnDt");
		list.add("rvkTrnDt");
		list.add("bkAppPushAgrYn");
		list.add("rcvCnt");
		list.add("rcvSumAm");
		list.add("payCnt");
		list.add("paySumAm");
		list.add("grid1Cnt");
		list.add("subSpceList");
		list.add("grid2Cnt");
		list.add("trnPrts");
		list.add("grid3Cnt");
		list.add("atsList");
		list.add("grid4Cnt");
		list.add("atpmList");
		list.add("atpmNxtTrnYn");
		list.add("atpmMngNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsAcno", get("dpsAcno"));
		map.put("prdNm", get("prdNm"));
		map.put("dpacBal", get("dpacBal"));
		map.put("rgsTrnDt", get("rgsTrnDt"));
		map.put("rvkTrnDt", get("rvkTrnDt"));
		map.put("bkAppPushAgrYn", get("bkAppPushAgrYn"));
		map.put("rcvCnt", get("rcvCnt"));
		map.put("rcvSumAm", get("rcvSumAm"));
		map.put("payCnt", get("payCnt"));
		map.put("paySumAm", get("paySumAm"));
		map.put("grid1Cnt", get("grid1Cnt"));
		map.put("subSpceList", get("subSpceList"));
		map.put("grid2Cnt", get("grid2Cnt"));
		map.put("trnPrts", get("trnPrts"));
		map.put("grid3Cnt", get("grid3Cnt"));
		map.put("atsList", get("atsList"));
		map.put("grid4Cnt", get("grid4Cnt"));
		map.put("atpmList", get("atpmList"));
		map.put("atpmNxtTrnYn", get("atpmNxtTrnYn"));
		map.put("atpmMngNo", get("atpmMngNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1870759786:/* dpsAcno */
			return getDpsAcno();
		case 106929153:/* prdNm */
			return getPrdNm();
		case 1855117183:/* dpacBal */
			return getDpacBal();
		case 1408913442:/* rgsTrnDt */
			return getRgsTrnDt();
		case 1607533561:/* rvkTrnDt */
			return getRvkTrnDt();
		case 1743448079:/* bkAppPushAgrYn */
			return getBkAppPushAgrYn();
		case -936232252:/* rcvCnt */
			return getRcvCnt();
		case -2056049038:/* rcvSumAm */
			return getRcvSumAm();
		case -995248223:/* payCnt */
			return getPayCnt();
		case 1359144975:/* paySumAm */
			return getPaySumAm();
		case 316983230:/* grid1Cnt */
			return getGrid1Cnt();
		case -874633443:/* subSpceList */
			return getSubSpceList();
		case 317013021:/* grid2Cnt */
			return getGrid2Cnt();
		case -1055948335:/* trnPrts */
			return getTrnPrts();
		case 317042812:/* grid3Cnt */
			return getGrid3Cnt();
		case -676901026:/* atsList */
			return getAtsList();
		case 317072603:/* grid4Cnt */
			return getGrid4Cnt();
		case 434619950:/* atpmList */
			return getAtpmList();
		case -1601948501:/* atpmNxtTrnYn */
			return getAtpmNxtTrnYn();
		case 589376439:/* atpmMngNo */
			return getAtpmMngNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1870759786:/* dpsAcno */
			setDpsAcno((String)value);
			break;
		case 106929153:/* prdNm */
			setPrdNm((String)value);
			break;
		case 1855117183:/* dpacBal */
			if ( value instanceof String ){
				setDpacBal((String)value);
			}
			else if ( value instanceof Double ){
				setDpacBal((Double)value);
			}
			else if ( value instanceof Long ){
				setDpacBal((Long)value);
			}
			else{
				setDpacBal((BigDecimal)value);
			}
			break;
		case 1408913442:/* rgsTrnDt */
			setRgsTrnDt((String)value);
			break;
		case 1607533561:/* rvkTrnDt */
			setRvkTrnDt((String)value);
			break;
		case 1743448079:/* bkAppPushAgrYn */
			setBkAppPushAgrYn((String)value);
			break;
		case -936232252:/* rcvCnt */
			setRcvCnt((String)value);
			break;
		case -2056049038:/* rcvSumAm */
			if ( value instanceof String ){
				setRcvSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setRcvSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRcvSumAm((Long)value);
			}
			else{
				setRcvSumAm((BigDecimal)value);
			}
			break;
		case -995248223:/* payCnt */
			setPayCnt((String)value);
			break;
		case 1359144975:/* paySumAm */
			if ( value instanceof String ){
				setPaySumAm((String)value);
			}
			else if ( value instanceof Double ){
				setPaySumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPaySumAm((Long)value);
			}
			else{
				setPaySumAm((BigDecimal)value);
			}
			break;
		case 316983230:/* grid1Cnt */
			setGrid1Cnt((Integer)value);
			break;
		case -874633443:/* subSpceList */
			setSubSpceList((List<PBPPbokSplitInqSelectPbokSplitItInfSubSpceList_DODT>)value);
			break;
		case 317013021:/* grid2Cnt */
			setGrid2Cnt((Integer)value);
			break;
		case -1055948335:/* trnPrts */
			setTrnPrts((List<PBPPbokSplitInqSelectPbokSplitItInfTrnPrts_DODT>)value);
			break;
		case 317042812:/* grid3Cnt */
			setGrid3Cnt((Integer)value);
			break;
		case -676901026:/* atsList */
			setAtsList((List<PBPPbokSplitInqSelectPbokSplitItInfAtsList_DODT>)value);
			break;
		case 317072603:/* grid4Cnt */
			setGrid4Cnt((Integer)value);
			break;
		case 434619950:/* atpmList */
			setAtpmList((List<PBPPbokSplitInqSelectPbokSplitItInfAtpmList_DODT>)value);
			break;
		case -1601948501:/* atpmNxtTrnYn */
			setAtpmNxtTrnYn((String)value);
			break;
		case 589376439:/* atpmMngNo */
			setAtpmMngNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
