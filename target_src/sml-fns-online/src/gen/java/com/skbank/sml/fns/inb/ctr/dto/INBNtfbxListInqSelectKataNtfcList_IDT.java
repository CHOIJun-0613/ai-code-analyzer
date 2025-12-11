/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 통합 알림 목록 조회 IO
 */
@XmlType(propOrder={
	"itcsno", "umsAppGrpId", "umsReqStaDt", "umsReqEndDt", "ntfbxLrclCD", "ntfbxMclfCD", "favtCdYn", "ntfcRfwr", "ntfcRfwrYn", "sortDis", "pageNo", "pageSize", "mchrTkn", "smtphOsTpNm", "mblMchrSftrVerTxt"
	, "mblMchrAppVerTxt", "mblMchrMdlNm"
}, name="INBNtfbxListInqSelectKataNtfcList_IDT")
@XmlRootElement(name="INBNtfbxListInqSelectKataNtfcList_IDT")
@BxmCategory(logicalName="통합.알림.목록.조회.컨트롤러.입력.IO", description="통합 알림 목록 조회 IO") 
public class INBNtfbxListInqSelectKataNtfcList_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1407605714L;
	
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=36, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * UMS앱그룹ID
	 */
	@ApiModelProperty(
		name = "umsAppGrpId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsAppGrpId")
	@BxmOmm_Field(length=10, decimal=0, description="UMS앱그룹ID", align="left", fill="")
	private String umsAppGrpId= "";
	
	
	/**
	 * UMS요청시작일자
	 */
	@ApiModelProperty(
		name = "umsReqStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsReqStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="UMS요청시작일자", align="left", fill="")
	private String umsReqStaDt= "";
	
	
	/**
	 * UMS요청종료일자
	 */
	@ApiModelProperty(
		name = "umsReqEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsReqEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="UMS요청종료일자", align="left", fill="")
	private String umsReqEndDt= "";
	
	
	/**
	 * 알림함대분류코드
	 */
	@ApiModelProperty(
		name = "ntfbxLrclCD"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxLrclCD")
	@BxmOmm_Field(length=10, decimal=0, description="알림함대분류코드", align="left", fill="")
	private String ntfbxLrclCD= "";
	
	
	/**
	 * 알림함중분류코드
	 */
	@ApiModelProperty(
		name = "ntfbxMclfCD"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxMclfCD")
	@BxmOmm_Field(length=10, decimal=0, description="알림함중분류코드", align="left", fill="")
	private String ntfbxMclfCD= "";
	
	
	/**
	 * 즐겨찾기여부
	 */
	@ApiModelProperty(
		name = "favtCdYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("favtCdYn")
	@BxmOmm_Field(length=1, decimal=0, description="즐겨찾기여부", align="left", fill="")
	private String favtCdYn= "";
	
	
	/**
	 * 알림검색어
	 */
	@ApiModelProperty(
		name = "ntfcRfwr"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcRfwr")
	@BxmOmm_Field(length=30, decimal=0, description="알림검색어", align="left", fill="")
	private String ntfcRfwr= "";
	
	
	/**
	 * 알림검색어여부
	 */
	@ApiModelProperty(
		name = "ntfcRfwrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcRfwrYn")
	@BxmOmm_Field(length=1, decimal=0, description="알림검색어여부", align="left", fill="")
	private String ntfcRfwrYn= "";
	
	
	/**
	 * 정렬구분
	 */
	@ApiModelProperty(
		name = "sortDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sortDis")
	@BxmOmm_Field(length=1, decimal=0, description="정렬구분", align="left", fill="")
	private String sortDis= "";
	
	
	/**
	 * 페이지번호
	 */
	@ApiModelProperty(
		name = "pageNo"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("pageNo")
	@BxmOmm_Field(length=6, decimal=0, description="페이지번호", align="right", fill="")
	private Integer pageNo= 0;
	
	
	/**
	 * 페이지사이즈
	 */
	@ApiModelProperty(
		name = "pageSize"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("pageSize")
	@BxmOmm_Field(length=10, decimal=0, description="페이지사이즈", align="right", fill="")
	private Integer pageSize= 0;
	
	
	/**
	 * 기기토큰
	 */
	@ApiModelProperty(
		name = "mchrTkn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mchrTkn")
	@BxmOmm_Field(length=57, decimal=0, description="기기토큰", align="left", fill="")
	private String mchrTkn= "";
	
	
	/**
	 * 스마트폰OS타입명
	 */
	@ApiModelProperty(
		name = "smtphOsTpNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("smtphOsTpNm")
	@BxmOmm_Field(length=2, decimal=0, description="스마트폰OS타입명", align="left", fill="")
	private String smtphOsTpNm= "";
	
	
	/**
	 * 모바일기기소프트웨어버전내용
	 */
	@ApiModelProperty(
		name = "mblMchrSftrVerTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mblMchrSftrVerTxt")
	@BxmOmm_Field(length=20, decimal=0, description="모바일기기소프트웨어버전내용", align="left", fill="")
	private String mblMchrSftrVerTxt= "";
	
	
	/**
	 * 모바일기기앱버전내용
	 */
	@ApiModelProperty(
		name = "mblMchrAppVerTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mblMchrAppVerTxt")
	@BxmOmm_Field(length=20, decimal=0, description="모바일기기앱버전내용", align="left", fill="")
	private String mblMchrAppVerTxt= "";
	
	
	/**
	 * 모바일기기모델명
	 */
	@ApiModelProperty(
		name = "mblMchrMdlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mblMchrMdlNm")
	@BxmOmm_Field(length=50, decimal=0, description="모바일기기모델명", align="left", fill="")
	private String mblMchrMdlNm= "";
	
	
	
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
	private boolean isSet_umsAppGrpId= false;
	protected final boolean isSet_umsAppGrpId(){
		return this.isSet_umsAppGrpId;
	}
	private void setIsSet_umsAppGrpId(boolean value){
		this.isSet_umsAppGrpId= value;
	}
	/**
	 * UMS앱그룹ID
	 */
	@XmlTransient
	public String getUmsAppGrpId(){
		return this.umsAppGrpId;
	}
	
	/**
	 * UMS앱그룹ID
	 * 
	 * @param umsAppGrpId UMS앱그룹ID
	 */
	public void setUmsAppGrpId(String umsAppGrpId){
		this.umsAppGrpId= umsAppGrpId;
		this.setIsSet_umsAppGrpId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_umsReqStaDt= false;
	protected final boolean isSet_umsReqStaDt(){
		return this.isSet_umsReqStaDt;
	}
	private void setIsSet_umsReqStaDt(boolean value){
		this.isSet_umsReqStaDt= value;
	}
	/**
	 * UMS요청시작일자
	 */
	@XmlTransient
	public String getUmsReqStaDt(){
		return this.umsReqStaDt;
	}
	
	/**
	 * UMS요청시작일자
	 * 
	 * @param umsReqStaDt UMS요청시작일자
	 */
	public void setUmsReqStaDt(String umsReqStaDt){
		this.umsReqStaDt= umsReqStaDt;
		this.setIsSet_umsReqStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_umsReqEndDt= false;
	protected final boolean isSet_umsReqEndDt(){
		return this.isSet_umsReqEndDt;
	}
	private void setIsSet_umsReqEndDt(boolean value){
		this.isSet_umsReqEndDt= value;
	}
	/**
	 * UMS요청종료일자
	 */
	@XmlTransient
	public String getUmsReqEndDt(){
		return this.umsReqEndDt;
	}
	
	/**
	 * UMS요청종료일자
	 * 
	 * @param umsReqEndDt UMS요청종료일자
	 */
	public void setUmsReqEndDt(String umsReqEndDt){
		this.umsReqEndDt= umsReqEndDt;
		this.setIsSet_umsReqEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxLrclCD= false;
	protected final boolean isSet_ntfbxLrclCD(){
		return this.isSet_ntfbxLrclCD;
	}
	private void setIsSet_ntfbxLrclCD(boolean value){
		this.isSet_ntfbxLrclCD= value;
	}
	/**
	 * 알림함대분류코드
	 */
	@XmlTransient
	public String getNtfbxLrclCD(){
		return this.ntfbxLrclCD;
	}
	
	/**
	 * 알림함대분류코드
	 * 
	 * @param ntfbxLrclCD 알림함대분류코드
	 */
	public void setNtfbxLrclCD(String ntfbxLrclCD){
		this.ntfbxLrclCD= ntfbxLrclCD;
		this.setIsSet_ntfbxLrclCD(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxMclfCD= false;
	protected final boolean isSet_ntfbxMclfCD(){
		return this.isSet_ntfbxMclfCD;
	}
	private void setIsSet_ntfbxMclfCD(boolean value){
		this.isSet_ntfbxMclfCD= value;
	}
	/**
	 * 알림함중분류코드
	 */
	@XmlTransient
	public String getNtfbxMclfCD(){
		return this.ntfbxMclfCD;
	}
	
	/**
	 * 알림함중분류코드
	 * 
	 * @param ntfbxMclfCD 알림함중분류코드
	 */
	public void setNtfbxMclfCD(String ntfbxMclfCD){
		this.ntfbxMclfCD= ntfbxMclfCD;
		this.setIsSet_ntfbxMclfCD(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_favtCdYn= false;
	protected final boolean isSet_favtCdYn(){
		return this.isSet_favtCdYn;
	}
	private void setIsSet_favtCdYn(boolean value){
		this.isSet_favtCdYn= value;
	}
	/**
	 * 즐겨찾기여부
	 */
	@XmlTransient
	public String getFavtCdYn(){
		return this.favtCdYn;
	}
	
	/**
	 * 즐겨찾기여부
	 * 
	 * @param favtCdYn 즐겨찾기여부
	 */
	public void setFavtCdYn(String favtCdYn){
		this.favtCdYn= favtCdYn;
		this.setIsSet_favtCdYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcRfwr= false;
	protected final boolean isSet_ntfcRfwr(){
		return this.isSet_ntfcRfwr;
	}
	private void setIsSet_ntfcRfwr(boolean value){
		this.isSet_ntfcRfwr= value;
	}
	/**
	 * 알림검색어
	 */
	@XmlTransient
	public String getNtfcRfwr(){
		return this.ntfcRfwr;
	}
	
	/**
	 * 알림검색어
	 * 
	 * @param ntfcRfwr 알림검색어
	 */
	public void setNtfcRfwr(String ntfcRfwr){
		this.ntfcRfwr= ntfcRfwr;
		this.setIsSet_ntfcRfwr(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcRfwrYn= false;
	protected final boolean isSet_ntfcRfwrYn(){
		return this.isSet_ntfcRfwrYn;
	}
	private void setIsSet_ntfcRfwrYn(boolean value){
		this.isSet_ntfcRfwrYn= value;
	}
	/**
	 * 알림검색어여부
	 */
	@XmlTransient
	public String getNtfcRfwrYn(){
		return this.ntfcRfwrYn;
	}
	
	/**
	 * 알림검색어여부
	 * 
	 * @param ntfcRfwrYn 알림검색어여부
	 */
	public void setNtfcRfwrYn(String ntfcRfwrYn){
		this.ntfcRfwrYn= ntfcRfwrYn;
		this.setIsSet_ntfcRfwrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sortDis= false;
	protected final boolean isSet_sortDis(){
		return this.isSet_sortDis;
	}
	private void setIsSet_sortDis(boolean value){
		this.isSet_sortDis= value;
	}
	/**
	 * 정렬구분
	 */
	@XmlTransient
	public String getSortDis(){
		return this.sortDis;
	}
	
	/**
	 * 정렬구분
	 * 
	 * @param sortDis 정렬구분
	 */
	public void setSortDis(String sortDis){
		this.sortDis= sortDis;
		this.setIsSet_sortDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pageNo= false;
	protected final boolean isSet_pageNo(){
		return this.isSet_pageNo;
	}
	private void setIsSet_pageNo(boolean value){
		this.isSet_pageNo= value;
	}
	/**
	 * 페이지번호
	 */
	@XmlTransient
	public Integer getPageNo(){
		return this.pageNo;
	}
	
	/**
	 * 페이지번호
	 * 
	 * @param pageNo 페이지번호
	 */
	public void setPageNo(Integer pageNo){
		this.pageNo= pageNo;
		this.setIsSet_pageNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pageSize= false;
	protected final boolean isSet_pageSize(){
		return this.isSet_pageSize;
	}
	private void setIsSet_pageSize(boolean value){
		this.isSet_pageSize= value;
	}
	/**
	 * 페이지사이즈
	 */
	@XmlTransient
	public Integer getPageSize(){
		return this.pageSize;
	}
	
	/**
	 * 페이지사이즈
	 * 
	 * @param pageSize 페이지사이즈
	 */
	public void setPageSize(Integer pageSize){
		this.pageSize= pageSize;
		this.setIsSet_pageSize(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mchrTkn= false;
	protected final boolean isSet_mchrTkn(){
		return this.isSet_mchrTkn;
	}
	private void setIsSet_mchrTkn(boolean value){
		this.isSet_mchrTkn= value;
	}
	/**
	 * 기기토큰
	 */
	@XmlTransient
	public String getMchrTkn(){
		return this.mchrTkn;
	}
	
	/**
	 * 기기토큰
	 * 
	 * @param mchrTkn 기기토큰
	 */
	public void setMchrTkn(String mchrTkn){
		this.mchrTkn= mchrTkn;
		this.setIsSet_mchrTkn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smtphOsTpNm= false;
	protected final boolean isSet_smtphOsTpNm(){
		return this.isSet_smtphOsTpNm;
	}
	private void setIsSet_smtphOsTpNm(boolean value){
		this.isSet_smtphOsTpNm= value;
	}
	/**
	 * 스마트폰OS타입명
	 */
	@XmlTransient
	public String getSmtphOsTpNm(){
		return this.smtphOsTpNm;
	}
	
	/**
	 * 스마트폰OS타입명
	 * 
	 * @param smtphOsTpNm 스마트폰OS타입명
	 */
	public void setSmtphOsTpNm(String smtphOsTpNm){
		this.smtphOsTpNm= smtphOsTpNm;
		this.setIsSet_smtphOsTpNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mblMchrSftrVerTxt= false;
	protected final boolean isSet_mblMchrSftrVerTxt(){
		return this.isSet_mblMchrSftrVerTxt;
	}
	private void setIsSet_mblMchrSftrVerTxt(boolean value){
		this.isSet_mblMchrSftrVerTxt= value;
	}
	/**
	 * 모바일기기소프트웨어버전내용
	 */
	@XmlTransient
	public String getMblMchrSftrVerTxt(){
		return this.mblMchrSftrVerTxt;
	}
	
	/**
	 * 모바일기기소프트웨어버전내용
	 * 
	 * @param mblMchrSftrVerTxt 모바일기기소프트웨어버전내용
	 */
	public void setMblMchrSftrVerTxt(String mblMchrSftrVerTxt){
		this.mblMchrSftrVerTxt= mblMchrSftrVerTxt;
		this.setIsSet_mblMchrSftrVerTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mblMchrAppVerTxt= false;
	protected final boolean isSet_mblMchrAppVerTxt(){
		return this.isSet_mblMchrAppVerTxt;
	}
	private void setIsSet_mblMchrAppVerTxt(boolean value){
		this.isSet_mblMchrAppVerTxt= value;
	}
	/**
	 * 모바일기기앱버전내용
	 */
	@XmlTransient
	public String getMblMchrAppVerTxt(){
		return this.mblMchrAppVerTxt;
	}
	
	/**
	 * 모바일기기앱버전내용
	 * 
	 * @param mblMchrAppVerTxt 모바일기기앱버전내용
	 */
	public void setMblMchrAppVerTxt(String mblMchrAppVerTxt){
		this.mblMchrAppVerTxt= mblMchrAppVerTxt;
		this.setIsSet_mblMchrAppVerTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mblMchrMdlNm= false;
	protected final boolean isSet_mblMchrMdlNm(){
		return this.isSet_mblMchrMdlNm;
	}
	private void setIsSet_mblMchrMdlNm(boolean value){
		this.isSet_mblMchrMdlNm= value;
	}
	/**
	 * 모바일기기모델명
	 */
	@XmlTransient
	public String getMblMchrMdlNm(){
		return this.mblMchrMdlNm;
	}
	
	/**
	 * 모바일기기모델명
	 * 
	 * @param mblMchrMdlNm 모바일기기모델명
	 */
	public void setMblMchrMdlNm(String mblMchrMdlNm){
		this.mblMchrMdlNm= mblMchrMdlNm;
		this.setIsSet_mblMchrMdlNm(true);
	}
				
	@Override
	public INBNtfbxListInqSelectKataNtfcList_IDT clone(){
		try{
			INBNtfbxListInqSelectKataNtfcList_IDT object= (INBNtfbxListInqSelectKataNtfcList_IDT)super.clone();
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
		
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.umsAppGrpId==null)?0:this.umsAppGrpId.hashCode());
		result= prime * result + ((this.umsReqStaDt==null)?0:this.umsReqStaDt.hashCode());
		result= prime * result + ((this.umsReqEndDt==null)?0:this.umsReqEndDt.hashCode());
		result= prime * result + ((this.ntfbxLrclCD==null)?0:this.ntfbxLrclCD.hashCode());
		result= prime * result + ((this.ntfbxMclfCD==null)?0:this.ntfbxMclfCD.hashCode());
		result= prime * result + ((this.favtCdYn==null)?0:this.favtCdYn.hashCode());
		result= prime * result + ((this.ntfcRfwr==null)?0:this.ntfcRfwr.hashCode());
		result= prime * result + ((this.ntfcRfwrYn==null)?0:this.ntfcRfwrYn.hashCode());
		result= prime * result + ((this.sortDis==null)?0:this.sortDis.hashCode());
		result= prime * result + ((this.pageNo==null)?0:this.pageNo.hashCode());
		result= prime * result + ((this.pageSize==null)?0:this.pageSize.hashCode());
		result= prime * result + ((this.mchrTkn==null)?0:this.mchrTkn.hashCode());
		result= prime * result + ((this.smtphOsTpNm==null)?0:this.smtphOsTpNm.hashCode());
		result= prime * result + ((this.mblMchrSftrVerTxt==null)?0:this.mblMchrSftrVerTxt.hashCode());
		result= prime * result + ((this.mblMchrAppVerTxt==null)?0:this.mblMchrAppVerTxt.hashCode());
		result= prime * result + ((this.mblMchrMdlNm==null)?0:this.mblMchrMdlNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxListInqSelectKataNtfcList_IDT other= (INBNtfbxListInqSelectKataNtfcList_IDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _umsAppGrpId= getUmsAppGrpId();
			Object __umsAppGrpId= other.getUmsAppGrpId();
			if ( _umsAppGrpId== null ) { if ( __umsAppGrpId!= null ) return false; }
			else if ( !_umsAppGrpId.equals(__umsAppGrpId) ) return false;
		}
		{
			Object _umsReqStaDt= getUmsReqStaDt();
			Object __umsReqStaDt= other.getUmsReqStaDt();
			if ( _umsReqStaDt== null ) { if ( __umsReqStaDt!= null ) return false; }
			else if ( !_umsReqStaDt.equals(__umsReqStaDt) ) return false;
		}
		{
			Object _umsReqEndDt= getUmsReqEndDt();
			Object __umsReqEndDt= other.getUmsReqEndDt();
			if ( _umsReqEndDt== null ) { if ( __umsReqEndDt!= null ) return false; }
			else if ( !_umsReqEndDt.equals(__umsReqEndDt) ) return false;
		}
		{
			Object _ntfbxLrclCD= getNtfbxLrclCD();
			Object __ntfbxLrclCD= other.getNtfbxLrclCD();
			if ( _ntfbxLrclCD== null ) { if ( __ntfbxLrclCD!= null ) return false; }
			else if ( !_ntfbxLrclCD.equals(__ntfbxLrclCD) ) return false;
		}
		{
			Object _ntfbxMclfCD= getNtfbxMclfCD();
			Object __ntfbxMclfCD= other.getNtfbxMclfCD();
			if ( _ntfbxMclfCD== null ) { if ( __ntfbxMclfCD!= null ) return false; }
			else if ( !_ntfbxMclfCD.equals(__ntfbxMclfCD) ) return false;
		}
		{
			Object _favtCdYn= getFavtCdYn();
			Object __favtCdYn= other.getFavtCdYn();
			if ( _favtCdYn== null ) { if ( __favtCdYn!= null ) return false; }
			else if ( !_favtCdYn.equals(__favtCdYn) ) return false;
		}
		{
			Object _ntfcRfwr= getNtfcRfwr();
			Object __ntfcRfwr= other.getNtfcRfwr();
			if ( _ntfcRfwr== null ) { if ( __ntfcRfwr!= null ) return false; }
			else if ( !_ntfcRfwr.equals(__ntfcRfwr) ) return false;
		}
		{
			Object _ntfcRfwrYn= getNtfcRfwrYn();
			Object __ntfcRfwrYn= other.getNtfcRfwrYn();
			if ( _ntfcRfwrYn== null ) { if ( __ntfcRfwrYn!= null ) return false; }
			else if ( !_ntfcRfwrYn.equals(__ntfcRfwrYn) ) return false;
		}
		{
			Object _sortDis= getSortDis();
			Object __sortDis= other.getSortDis();
			if ( _sortDis== null ) { if ( __sortDis!= null ) return false; }
			else if ( !_sortDis.equals(__sortDis) ) return false;
		}
		{
			Object _pageNo= getPageNo();
			Object __pageNo= other.getPageNo();
			if ( _pageNo== null ) { if ( __pageNo!= null ) return false; }
			else if ( !_pageNo.equals(__pageNo) ) return false;
		}
		{
			Object _pageSize= getPageSize();
			Object __pageSize= other.getPageSize();
			if ( _pageSize== null ) { if ( __pageSize!= null ) return false; }
			else if ( !_pageSize.equals(__pageSize) ) return false;
		}
		{
			Object _mchrTkn= getMchrTkn();
			Object __mchrTkn= other.getMchrTkn();
			if ( _mchrTkn== null ) { if ( __mchrTkn!= null ) return false; }
			else if ( !_mchrTkn.equals(__mchrTkn) ) return false;
		}
		{
			Object _smtphOsTpNm= getSmtphOsTpNm();
			Object __smtphOsTpNm= other.getSmtphOsTpNm();
			if ( _smtphOsTpNm== null ) { if ( __smtphOsTpNm!= null ) return false; }
			else if ( !_smtphOsTpNm.equals(__smtphOsTpNm) ) return false;
		}
		{
			Object _mblMchrSftrVerTxt= getMblMchrSftrVerTxt();
			Object __mblMchrSftrVerTxt= other.getMblMchrSftrVerTxt();
			if ( _mblMchrSftrVerTxt== null ) { if ( __mblMchrSftrVerTxt!= null ) return false; }
			else if ( !_mblMchrSftrVerTxt.equals(__mblMchrSftrVerTxt) ) return false;
		}
		{
			Object _mblMchrAppVerTxt= getMblMchrAppVerTxt();
			Object __mblMchrAppVerTxt= other.getMblMchrAppVerTxt();
			if ( _mblMchrAppVerTxt== null ) { if ( __mblMchrAppVerTxt!= null ) return false; }
			else if ( !_mblMchrAppVerTxt.equals(__mblMchrAppVerTxt) ) return false;
		}
		{
			Object _mblMchrMdlNm= getMblMchrMdlNm();
			Object __mblMchrMdlNm= other.getMblMchrMdlNm();
			if ( _mblMchrMdlNm== null ) { if ( __mblMchrMdlNm!= null ) return false; }
			else if ( !_mblMchrMdlNm.equals(__mblMchrMdlNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxListInqSelectKataNtfcList_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tumsAppGrpId: ");
		sb.append(umsAppGrpId==null?"null":getUmsAppGrpId());
		sb.append("\n");
		sb.append("\tumsReqStaDt: ");
		sb.append(umsReqStaDt==null?"null":getUmsReqStaDt());
		sb.append("\n");
		sb.append("\tumsReqEndDt: ");
		sb.append(umsReqEndDt==null?"null":getUmsReqEndDt());
		sb.append("\n");
		sb.append("\tntfbxLrclCD: ");
		sb.append(ntfbxLrclCD==null?"null":getNtfbxLrclCD());
		sb.append("\n");
		sb.append("\tntfbxMclfCD: ");
		sb.append(ntfbxMclfCD==null?"null":getNtfbxMclfCD());
		sb.append("\n");
		sb.append("\tfavtCdYn: ");
		sb.append(favtCdYn==null?"null":getFavtCdYn());
		sb.append("\n");
		sb.append("\tntfcRfwr: ");
		sb.append(ntfcRfwr==null?"null":getNtfcRfwr());
		sb.append("\n");
		sb.append("\tntfcRfwrYn: ");
		sb.append(ntfcRfwrYn==null?"null":getNtfcRfwrYn());
		sb.append("\n");
		sb.append("\tsortDis: ");
		sb.append(sortDis==null?"null":getSortDis());
		sb.append("\n");
		sb.append("\tpageNo: ");
		sb.append(pageNo==null?"null":getPageNo());
		sb.append("\n");
		sb.append("\tpageSize: ");
		sb.append(pageSize==null?"null":getPageSize());
		sb.append("\n");
		sb.append("\tmchrTkn: ");
		sb.append(mchrTkn==null?"null":getMchrTkn());
		sb.append("\n");
		sb.append("\tsmtphOsTpNm: ");
		sb.append(smtphOsTpNm==null?"null":getSmtphOsTpNm());
		sb.append("\n");
		sb.append("\tmblMchrSftrVerTxt: ");
		sb.append(mblMchrSftrVerTxt==null?"null":getMblMchrSftrVerTxt());
		sb.append("\n");
		sb.append("\tmblMchrAppVerTxt: ");
		sb.append(mblMchrAppVerTxt==null?"null":getMblMchrAppVerTxt());
		sb.append("\n");
		sb.append("\tmblMchrMdlNm: ");
		sb.append(mblMchrMdlNm==null?"null":getMblMchrMdlNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 10; /* umsAppGrpId */
		messageLen+= 8; /* umsReqStaDt */
		messageLen+= 8; /* umsReqEndDt */
		messageLen+= 10; /* ntfbxLrclCD */
		messageLen+= 10; /* ntfbxMclfCD */
		messageLen+= 1; /* favtCdYn */
		messageLen+= 30; /* ntfcRfwr */
		messageLen+= 1; /* ntfcRfwrYn */
		messageLen+= 1; /* sortDis */
		messageLen+= 6; /* pageNo */
		messageLen+= 10; /* pageSize */
		messageLen+= 57; /* mchrTkn */
		messageLen+= 2; /* smtphOsTpNm */
		messageLen+= 20; /* mblMchrSftrVerTxt */
		messageLen+= 20; /* mblMchrAppVerTxt */
		messageLen+= 50; /* mblMchrMdlNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("umsAppGrpId");
		list.add("umsReqStaDt");
		list.add("umsReqEndDt");
		list.add("ntfbxLrclCD");
		list.add("ntfbxMclfCD");
		list.add("favtCdYn");
		list.add("ntfcRfwr");
		list.add("ntfcRfwrYn");
		list.add("sortDis");
		list.add("pageNo");
		list.add("pageSize");
		list.add("mchrTkn");
		list.add("smtphOsTpNm");
		list.add("mblMchrSftrVerTxt");
		list.add("mblMchrAppVerTxt");
		list.add("mblMchrMdlNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("umsAppGrpId", get("umsAppGrpId"));
		map.put("umsReqStaDt", get("umsReqStaDt"));
		map.put("umsReqEndDt", get("umsReqEndDt"));
		map.put("ntfbxLrclCD", get("ntfbxLrclCD"));
		map.put("ntfbxMclfCD", get("ntfbxMclfCD"));
		map.put("favtCdYn", get("favtCdYn"));
		map.put("ntfcRfwr", get("ntfcRfwr"));
		map.put("ntfcRfwrYn", get("ntfcRfwrYn"));
		map.put("sortDis", get("sortDis"));
		map.put("pageNo", get("pageNo"));
		map.put("pageSize", get("pageSize"));
		map.put("mchrTkn", get("mchrTkn"));
		map.put("smtphOsTpNm", get("smtphOsTpNm"));
		map.put("mblMchrSftrVerTxt", get("mblMchrSftrVerTxt"));
		map.put("mblMchrAppVerTxt", get("mblMchrAppVerTxt"));
		map.put("mblMchrMdlNm", get("mblMchrMdlNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case -223619782:/* umsAppGrpId */
			return getUmsAppGrpId();
		case -1793464627:/* umsReqStaDt */
			return getUmsReqStaDt();
		case -1806569784:/* umsReqEndDt */
			return getUmsReqEndDt();
		case -686513050:/* ntfbxLrclCD */
			return getNtfbxLrclCD();
		case -671474361:/* ntfbxMclfCD */
			return getNtfbxMclfCD();
		case 1054002095:/* favtCdYn */
			return getFavtCdYn();
		case 1320967090:/* ntfcRfwr */
			return getNtfcRfwr();
		case -1860943257:/* ntfcRfwrYn */
			return getNtfcRfwrYn();
		case -2024617456:/* sortDis */
			return getSortDis();
		case -995752784:/* pageNo */
			return getPageNo();
		case 859428656:/* pageSize */
			return getPageSize();
		case 887465879:/* mchrTkn */
			return getMchrTkn();
		case -1839547183:/* smtphOsTpNm */
			return getSmtphOsTpNm();
		case -1253637675:/* mblMchrSftrVerTxt */
			return getMblMchrSftrVerTxt();
		case -1937309737:/* mblMchrAppVerTxt */
			return getMblMchrAppVerTxt();
		case 1582431581:/* mblMchrMdlNm */
			return getMblMchrMdlNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case -223619782:/* umsAppGrpId */
			setUmsAppGrpId((String)value);
			break;
		case -1793464627:/* umsReqStaDt */
			setUmsReqStaDt((String)value);
			break;
		case -1806569784:/* umsReqEndDt */
			setUmsReqEndDt((String)value);
			break;
		case -686513050:/* ntfbxLrclCD */
			setNtfbxLrclCD((String)value);
			break;
		case -671474361:/* ntfbxMclfCD */
			setNtfbxMclfCD((String)value);
			break;
		case 1054002095:/* favtCdYn */
			setFavtCdYn((String)value);
			break;
		case 1320967090:/* ntfcRfwr */
			setNtfcRfwr((String)value);
			break;
		case -1860943257:/* ntfcRfwrYn */
			setNtfcRfwrYn((String)value);
			break;
		case -2024617456:/* sortDis */
			setSortDis((String)value);
			break;
		case -995752784:/* pageNo */
			setPageNo((Integer)value);
			break;
		case 859428656:/* pageSize */
			setPageSize((Integer)value);
			break;
		case 887465879:/* mchrTkn */
			setMchrTkn((String)value);
			break;
		case -1839547183:/* smtphOsTpNm */
			setSmtphOsTpNm((String)value);
			break;
		case -1253637675:/* mblMchrSftrVerTxt */
			setMblMchrSftrVerTxt((String)value);
			break;
		case -1937309737:/* mblMchrAppVerTxt */
			setMblMchrAppVerTxt((String)value);
			break;
		case 1582431581:/* mblMchrMdlNm */
			setMblMchrMdlNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
