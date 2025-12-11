/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.ctr.dto;

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
 * 
 */
@XmlType(propOrder={
	"atpmMngNo", "atsSrvcPdcd", "atsWdrBkwAcno", "atsRgsStcd", "atsRgsStcdNm", "atsRgsDt", "atsCsno", "atsItcsno", "atsCtrIscd", "atsPypeNo", "atsTlmOccIstSrno", "atsCtrIstNm", "spceNo", "spceNm"
}, name="PBPPbokSpceDtlEstSelectRawactatpminflist_ODT")
@XmlRootElement(name="PBPPbokSpceDtlEstSelectRawactatpminflist_ODT")
@BxmCategory(logicalName="입출금계좌.자동납부.정보.목록.조회.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceDtlEstSelectRawactatpminflist_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -343996144L;
	
	
	
	/**
	 * 자동납부관리번호
	 */
	@ApiModelProperty(
		name = "atpmMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmMngNo")
	@BxmOmm_Field(length=13, decimal=0, description="자동납부관리번호", align="left", fill="")
	private String atpmMngNo= "";
	
	
	/**
	 * 자동이체서비스상품코드
	 */
	@ApiModelProperty(
		name = "atsSrvcPdcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsSrvcPdcd")
	@BxmOmm_Field(length=13, decimal=0, description="자동이체서비스상품코드", align="left", fill="")
	private String atsSrvcPdcd= "";
	
	
	/**
	 * 자동이체출금전행계좌번호
	 */
	@ApiModelProperty(
		name = "atsWdrBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsWdrBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="자동이체출금전행계좌번호", align="left", fill="")
	private String atsWdrBkwAcno= "";
	
	
	/**
	 * 자동이체등록상태코드
	 */
	@ApiModelProperty(
		name = "atsRgsStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsRgsStcd")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체등록상태코드", align="left", fill="")
	private String atsRgsStcd= "";
	
	
	/**
	 * 자동이체등록상태코드명
	 */
	@ApiModelProperty(
		name = "atsRgsStcdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsRgsStcdNm")
	@BxmOmm_Field(length=40, decimal=0, description="자동이체등록상태코드명", align="left", fill="")
	private String atsRgsStcdNm= "";
	
	
	/**
	 * 자동이체등록일자
	 */
	@ApiModelProperty(
		name = "atsRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체등록일자", align="left", fill="")
	private String atsRgsDt= "";
	
	
	/**
	 * 자동이체고객번호
	 */
	@ApiModelProperty(
		name = "atsCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCsno")
	@BxmOmm_Field(length=9, decimal=0, description="자동이체고객번호", align="left", fill="")
	private String atsCsno= "";
	
	
	/**
	 * 자동이체통합고객번호
	 */
	@ApiModelProperty(
		name = "atsItcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsItcsno")
	@BxmOmm_Field(length=11, decimal=0, description="자동이체통합고객번호", align="left", fill="")
	private String atsItcsno= "";
	
	
	/**
	 * 자동이체계약기관코드
	 */
	@ApiModelProperty(
		name = "atsCtrIscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCtrIscd")
	@BxmOmm_Field(length=10, decimal=0, description="자동이체계약기관코드", align="left", fill="")
	private String atsCtrIscd= "";
	
	
	/**
	 * 자동이체납부자번호
	 */
	@ApiModelProperty(
		name = "atsPypeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsPypeNo")
	@BxmOmm_Field(length=20, decimal=0, description="자동이체납부자번호", align="left", fill="")
	private String atsPypeNo= "";
	
	
	/**
	 * 자동이체전문발생기관일련번호
	 */
	@ApiModelProperty(
		name = "atsTlmOccIstSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsTlmOccIstSrno")
	@BxmOmm_Field(length=30, decimal=0, description="자동이체전문발생기관일련번호", align="left", fill="")
	private String atsTlmOccIstSrno= "";
	
	
	/**
	 * 자동이체계약기관명
	 */
	@ApiModelProperty(
		name = "atsCtrIstNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCtrIstNm")
	@BxmOmm_Field(length=40, decimal=0, description="자동이체계약기관명", align="left", fill="")
	private String atsCtrIstNm= "";
	
	
	/**
	 * 공간번호
	 */
	@ApiModelProperty(
		name = "spceNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceNo")
	@BxmOmm_Field(length=6, decimal=0, description="공간번호", align="left", fill="")
	private String spceNo= "";
	
	
	/**
	 * 공간명
	 */
	@ApiModelProperty(
		name = "spceNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceNm")
	@BxmOmm_Field(length=50, decimal=0, description="공간명", align="left", fill="")
	private String spceNm= "";
	
	
	
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsSrvcPdcd= false;
	protected final boolean isSet_atsSrvcPdcd(){
		return this.isSet_atsSrvcPdcd;
	}
	private void setIsSet_atsSrvcPdcd(boolean value){
		this.isSet_atsSrvcPdcd= value;
	}
	/**
	 * 자동이체서비스상품코드
	 */
	@XmlTransient
	public String getAtsSrvcPdcd(){
		return this.atsSrvcPdcd;
	}
	
	/**
	 * 자동이체서비스상품코드
	 * 
	 * @param atsSrvcPdcd 자동이체서비스상품코드
	 */
	public void setAtsSrvcPdcd(String atsSrvcPdcd){
		this.atsSrvcPdcd= atsSrvcPdcd;
		this.setIsSet_atsSrvcPdcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsWdrBkwAcno= false;
	protected final boolean isSet_atsWdrBkwAcno(){
		return this.isSet_atsWdrBkwAcno;
	}
	private void setIsSet_atsWdrBkwAcno(boolean value){
		this.isSet_atsWdrBkwAcno= value;
	}
	/**
	 * 자동이체출금전행계좌번호
	 */
	@XmlTransient
	public String getAtsWdrBkwAcno(){
		return this.atsWdrBkwAcno;
	}
	
	/**
	 * 자동이체출금전행계좌번호
	 * 
	 * @param atsWdrBkwAcno 자동이체출금전행계좌번호
	 */
	public void setAtsWdrBkwAcno(String atsWdrBkwAcno){
		this.atsWdrBkwAcno= atsWdrBkwAcno;
		this.setIsSet_atsWdrBkwAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsRgsStcd= false;
	protected final boolean isSet_atsRgsStcd(){
		return this.isSet_atsRgsStcd;
	}
	private void setIsSet_atsRgsStcd(boolean value){
		this.isSet_atsRgsStcd= value;
	}
	/**
	 * 자동이체등록상태코드
	 */
	@XmlTransient
	public String getAtsRgsStcd(){
		return this.atsRgsStcd;
	}
	
	/**
	 * 자동이체등록상태코드
	 * 
	 * @param atsRgsStcd 자동이체등록상태코드
	 */
	public void setAtsRgsStcd(String atsRgsStcd){
		this.atsRgsStcd= atsRgsStcd;
		this.setIsSet_atsRgsStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsRgsStcdNm= false;
	protected final boolean isSet_atsRgsStcdNm(){
		return this.isSet_atsRgsStcdNm;
	}
	private void setIsSet_atsRgsStcdNm(boolean value){
		this.isSet_atsRgsStcdNm= value;
	}
	/**
	 * 자동이체등록상태코드명
	 */
	@XmlTransient
	public String getAtsRgsStcdNm(){
		return this.atsRgsStcdNm;
	}
	
	/**
	 * 자동이체등록상태코드명
	 * 
	 * @param atsRgsStcdNm 자동이체등록상태코드명
	 */
	public void setAtsRgsStcdNm(String atsRgsStcdNm){
		this.atsRgsStcdNm= atsRgsStcdNm;
		this.setIsSet_atsRgsStcdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsRgsDt= false;
	protected final boolean isSet_atsRgsDt(){
		return this.isSet_atsRgsDt;
	}
	private void setIsSet_atsRgsDt(boolean value){
		this.isSet_atsRgsDt= value;
	}
	/**
	 * 자동이체등록일자
	 */
	@XmlTransient
	public String getAtsRgsDt(){
		return this.atsRgsDt;
	}
	
	/**
	 * 자동이체등록일자
	 * 
	 * @param atsRgsDt 자동이체등록일자
	 */
	public void setAtsRgsDt(String atsRgsDt){
		this.atsRgsDt= atsRgsDt;
		this.setIsSet_atsRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsCsno= false;
	protected final boolean isSet_atsCsno(){
		return this.isSet_atsCsno;
	}
	private void setIsSet_atsCsno(boolean value){
		this.isSet_atsCsno= value;
	}
	/**
	 * 자동이체고객번호
	 */
	@XmlTransient
	public String getAtsCsno(){
		return this.atsCsno;
	}
	
	/**
	 * 자동이체고객번호
	 * 
	 * @param atsCsno 자동이체고객번호
	 */
	public void setAtsCsno(String atsCsno){
		this.atsCsno= atsCsno;
		this.setIsSet_atsCsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsItcsno= false;
	protected final boolean isSet_atsItcsno(){
		return this.isSet_atsItcsno;
	}
	private void setIsSet_atsItcsno(boolean value){
		this.isSet_atsItcsno= value;
	}
	/**
	 * 자동이체통합고객번호
	 */
	@XmlTransient
	public String getAtsItcsno(){
		return this.atsItcsno;
	}
	
	/**
	 * 자동이체통합고객번호
	 * 
	 * @param atsItcsno 자동이체통합고객번호
	 */
	public void setAtsItcsno(String atsItcsno){
		this.atsItcsno= atsItcsno;
		this.setIsSet_atsItcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsCtrIscd= false;
	protected final boolean isSet_atsCtrIscd(){
		return this.isSet_atsCtrIscd;
	}
	private void setIsSet_atsCtrIscd(boolean value){
		this.isSet_atsCtrIscd= value;
	}
	/**
	 * 자동이체계약기관코드
	 */
	@XmlTransient
	public String getAtsCtrIscd(){
		return this.atsCtrIscd;
	}
	
	/**
	 * 자동이체계약기관코드
	 * 
	 * @param atsCtrIscd 자동이체계약기관코드
	 */
	public void setAtsCtrIscd(String atsCtrIscd){
		this.atsCtrIscd= atsCtrIscd;
		this.setIsSet_atsCtrIscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsPypeNo= false;
	protected final boolean isSet_atsPypeNo(){
		return this.isSet_atsPypeNo;
	}
	private void setIsSet_atsPypeNo(boolean value){
		this.isSet_atsPypeNo= value;
	}
	/**
	 * 자동이체납부자번호
	 */
	@XmlTransient
	public String getAtsPypeNo(){
		return this.atsPypeNo;
	}
	
	/**
	 * 자동이체납부자번호
	 * 
	 * @param atsPypeNo 자동이체납부자번호
	 */
	public void setAtsPypeNo(String atsPypeNo){
		this.atsPypeNo= atsPypeNo;
		this.setIsSet_atsPypeNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsTlmOccIstSrno= false;
	protected final boolean isSet_atsTlmOccIstSrno(){
		return this.isSet_atsTlmOccIstSrno;
	}
	private void setIsSet_atsTlmOccIstSrno(boolean value){
		this.isSet_atsTlmOccIstSrno= value;
	}
	/**
	 * 자동이체전문발생기관일련번호
	 */
	@XmlTransient
	public String getAtsTlmOccIstSrno(){
		return this.atsTlmOccIstSrno;
	}
	
	/**
	 * 자동이체전문발생기관일련번호
	 * 
	 * @param atsTlmOccIstSrno 자동이체전문발생기관일련번호
	 */
	public void setAtsTlmOccIstSrno(String atsTlmOccIstSrno){
		this.atsTlmOccIstSrno= atsTlmOccIstSrno;
		this.setIsSet_atsTlmOccIstSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsCtrIstNm= false;
	protected final boolean isSet_atsCtrIstNm(){
		return this.isSet_atsCtrIstNm;
	}
	private void setIsSet_atsCtrIstNm(boolean value){
		this.isSet_atsCtrIstNm= value;
	}
	/**
	 * 자동이체계약기관명
	 */
	@XmlTransient
	public String getAtsCtrIstNm(){
		return this.atsCtrIstNm;
	}
	
	/**
	 * 자동이체계약기관명
	 * 
	 * @param atsCtrIstNm 자동이체계약기관명
	 */
	public void setAtsCtrIstNm(String atsCtrIstNm){
		this.atsCtrIstNm= atsCtrIstNm;
		this.setIsSet_atsCtrIstNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceNo= false;
	protected final boolean isSet_spceNo(){
		return this.isSet_spceNo;
	}
	private void setIsSet_spceNo(boolean value){
		this.isSet_spceNo= value;
	}
	/**
	 * 공간번호
	 */
	@XmlTransient
	public String getSpceNo(){
		return this.spceNo;
	}
	
	/**
	 * 공간번호
	 * 
	 * @param spceNo 공간번호
	 */
	public void setSpceNo(String spceNo){
		this.spceNo= spceNo;
		this.setIsSet_spceNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceNm= false;
	protected final boolean isSet_spceNm(){
		return this.isSet_spceNm;
	}
	private void setIsSet_spceNm(boolean value){
		this.isSet_spceNm= value;
	}
	/**
	 * 공간명
	 */
	@XmlTransient
	public String getSpceNm(){
		return this.spceNm;
	}
	
	/**
	 * 공간명
	 * 
	 * @param spceNm 공간명
	 */
	public void setSpceNm(String spceNm){
		this.spceNm= spceNm;
		this.setIsSet_spceNm(true);
	}
				
	@Override
	public PBPPbokSpceDtlEstSelectRawactatpminflist_ODT clone(){
		try{
			PBPPbokSpceDtlEstSelectRawactatpminflist_ODT object= (PBPPbokSpceDtlEstSelectRawactatpminflist_ODT)super.clone();
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
		
		result= prime * result + ((this.atpmMngNo==null)?0:this.atpmMngNo.hashCode());
		result= prime * result + ((this.atsSrvcPdcd==null)?0:this.atsSrvcPdcd.hashCode());
		result= prime * result + ((this.atsWdrBkwAcno==null)?0:this.atsWdrBkwAcno.hashCode());
		result= prime * result + ((this.atsRgsStcd==null)?0:this.atsRgsStcd.hashCode());
		result= prime * result + ((this.atsRgsStcdNm==null)?0:this.atsRgsStcdNm.hashCode());
		result= prime * result + ((this.atsRgsDt==null)?0:this.atsRgsDt.hashCode());
		result= prime * result + ((this.atsCsno==null)?0:this.atsCsno.hashCode());
		result= prime * result + ((this.atsItcsno==null)?0:this.atsItcsno.hashCode());
		result= prime * result + ((this.atsCtrIscd==null)?0:this.atsCtrIscd.hashCode());
		result= prime * result + ((this.atsPypeNo==null)?0:this.atsPypeNo.hashCode());
		result= prime * result + ((this.atsTlmOccIstSrno==null)?0:this.atsTlmOccIstSrno.hashCode());
		result= prime * result + ((this.atsCtrIstNm==null)?0:this.atsCtrIstNm.hashCode());
		result= prime * result + ((this.spceNo==null)?0:this.spceNo.hashCode());
		result= prime * result + ((this.spceNm==null)?0:this.spceNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstSelectRawactatpminflist_ODT other= (PBPPbokSpceDtlEstSelectRawactatpminflist_ODT)obj;
		{
			Object _atpmMngNo= getAtpmMngNo();
			Object __atpmMngNo= other.getAtpmMngNo();
			if ( _atpmMngNo== null ) { if ( __atpmMngNo!= null ) return false; }
			else if ( !_atpmMngNo.equals(__atpmMngNo) ) return false;
		}
		{
			Object _atsSrvcPdcd= getAtsSrvcPdcd();
			Object __atsSrvcPdcd= other.getAtsSrvcPdcd();
			if ( _atsSrvcPdcd== null ) { if ( __atsSrvcPdcd!= null ) return false; }
			else if ( !_atsSrvcPdcd.equals(__atsSrvcPdcd) ) return false;
		}
		{
			Object _atsWdrBkwAcno= getAtsWdrBkwAcno();
			Object __atsWdrBkwAcno= other.getAtsWdrBkwAcno();
			if ( _atsWdrBkwAcno== null ) { if ( __atsWdrBkwAcno!= null ) return false; }
			else if ( !_atsWdrBkwAcno.equals(__atsWdrBkwAcno) ) return false;
		}
		{
			Object _atsRgsStcd= getAtsRgsStcd();
			Object __atsRgsStcd= other.getAtsRgsStcd();
			if ( _atsRgsStcd== null ) { if ( __atsRgsStcd!= null ) return false; }
			else if ( !_atsRgsStcd.equals(__atsRgsStcd) ) return false;
		}
		{
			Object _atsRgsStcdNm= getAtsRgsStcdNm();
			Object __atsRgsStcdNm= other.getAtsRgsStcdNm();
			if ( _atsRgsStcdNm== null ) { if ( __atsRgsStcdNm!= null ) return false; }
			else if ( !_atsRgsStcdNm.equals(__atsRgsStcdNm) ) return false;
		}
		{
			Object _atsRgsDt= getAtsRgsDt();
			Object __atsRgsDt= other.getAtsRgsDt();
			if ( _atsRgsDt== null ) { if ( __atsRgsDt!= null ) return false; }
			else if ( !_atsRgsDt.equals(__atsRgsDt) ) return false;
		}
		{
			Object _atsCsno= getAtsCsno();
			Object __atsCsno= other.getAtsCsno();
			if ( _atsCsno== null ) { if ( __atsCsno!= null ) return false; }
			else if ( !_atsCsno.equals(__atsCsno) ) return false;
		}
		{
			Object _atsItcsno= getAtsItcsno();
			Object __atsItcsno= other.getAtsItcsno();
			if ( _atsItcsno== null ) { if ( __atsItcsno!= null ) return false; }
			else if ( !_atsItcsno.equals(__atsItcsno) ) return false;
		}
		{
			Object _atsCtrIscd= getAtsCtrIscd();
			Object __atsCtrIscd= other.getAtsCtrIscd();
			if ( _atsCtrIscd== null ) { if ( __atsCtrIscd!= null ) return false; }
			else if ( !_atsCtrIscd.equals(__atsCtrIscd) ) return false;
		}
		{
			Object _atsPypeNo= getAtsPypeNo();
			Object __atsPypeNo= other.getAtsPypeNo();
			if ( _atsPypeNo== null ) { if ( __atsPypeNo!= null ) return false; }
			else if ( !_atsPypeNo.equals(__atsPypeNo) ) return false;
		}
		{
			Object _atsTlmOccIstSrno= getAtsTlmOccIstSrno();
			Object __atsTlmOccIstSrno= other.getAtsTlmOccIstSrno();
			if ( _atsTlmOccIstSrno== null ) { if ( __atsTlmOccIstSrno!= null ) return false; }
			else if ( !_atsTlmOccIstSrno.equals(__atsTlmOccIstSrno) ) return false;
		}
		{
			Object _atsCtrIstNm= getAtsCtrIstNm();
			Object __atsCtrIstNm= other.getAtsCtrIstNm();
			if ( _atsCtrIstNm== null ) { if ( __atsCtrIstNm!= null ) return false; }
			else if ( !_atsCtrIstNm.equals(__atsCtrIstNm) ) return false;
		}
		{
			Object _spceNo= getSpceNo();
			Object __spceNo= other.getSpceNo();
			if ( _spceNo== null ) { if ( __spceNo!= null ) return false; }
			else if ( !_spceNo.equals(__spceNo) ) return false;
		}
		{
			Object _spceNm= getSpceNm();
			Object __spceNm= other.getSpceNm();
			if ( _spceNm== null ) { if ( __spceNm!= null ) return false; }
			else if ( !_spceNm.equals(__spceNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstSelectRawactatpminflist_ODT.class.getName()).append(":\n");
		sb.append("\tatpmMngNo: ");
		sb.append(atpmMngNo==null?"null":getAtpmMngNo());
		sb.append("\n");
		sb.append("\tatsSrvcPdcd: ");
		sb.append(atsSrvcPdcd==null?"null":getAtsSrvcPdcd());
		sb.append("\n");
		sb.append("\tatsWdrBkwAcno: ");
		sb.append(atsWdrBkwAcno==null?"null":getAtsWdrBkwAcno());
		sb.append("\n");
		sb.append("\tatsRgsStcd: ");
		sb.append(atsRgsStcd==null?"null":getAtsRgsStcd());
		sb.append("\n");
		sb.append("\tatsRgsStcdNm: ");
		sb.append(atsRgsStcdNm==null?"null":getAtsRgsStcdNm());
		sb.append("\n");
		sb.append("\tatsRgsDt: ");
		sb.append(atsRgsDt==null?"null":getAtsRgsDt());
		sb.append("\n");
		sb.append("\tatsCsno: ");
		sb.append(atsCsno==null?"null":getAtsCsno());
		sb.append("\n");
		sb.append("\tatsItcsno: ");
		sb.append(atsItcsno==null?"null":getAtsItcsno());
		sb.append("\n");
		sb.append("\tatsCtrIscd: ");
		sb.append(atsCtrIscd==null?"null":getAtsCtrIscd());
		sb.append("\n");
		sb.append("\tatsPypeNo: ");
		sb.append(atsPypeNo==null?"null":getAtsPypeNo());
		sb.append("\n");
		sb.append("\tatsTlmOccIstSrno: ");
		sb.append(atsTlmOccIstSrno==null?"null":getAtsTlmOccIstSrno());
		sb.append("\n");
		sb.append("\tatsCtrIstNm: ");
		sb.append(atsCtrIstNm==null?"null":getAtsCtrIstNm());
		sb.append("\n");
		sb.append("\tspceNo: ");
		sb.append(spceNo==null?"null":getSpceNo());
		sb.append("\n");
		sb.append("\tspceNm: ");
		sb.append(spceNm==null?"null":getSpceNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* atpmMngNo */
		messageLen+= 13; /* atsSrvcPdcd */
		messageLen+= 20; /* atsWdrBkwAcno */
		messageLen+= 1; /* atsRgsStcd */
		messageLen+= 40; /* atsRgsStcdNm */
		messageLen+= 8; /* atsRgsDt */
		messageLen+= 9; /* atsCsno */
		messageLen+= 11; /* atsItcsno */
		messageLen+= 10; /* atsCtrIscd */
		messageLen+= 20; /* atsPypeNo */
		messageLen+= 30; /* atsTlmOccIstSrno */
		messageLen+= 40; /* atsCtrIstNm */
		messageLen+= 6; /* spceNo */
		messageLen+= 50; /* spceNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("atpmMngNo");
		list.add("atsSrvcPdcd");
		list.add("atsWdrBkwAcno");
		list.add("atsRgsStcd");
		list.add("atsRgsStcdNm");
		list.add("atsRgsDt");
		list.add("atsCsno");
		list.add("atsItcsno");
		list.add("atsCtrIscd");
		list.add("atsPypeNo");
		list.add("atsTlmOccIstSrno");
		list.add("atsCtrIstNm");
		list.add("spceNo");
		list.add("spceNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("atpmMngNo", get("atpmMngNo"));
		map.put("atsSrvcPdcd", get("atsSrvcPdcd"));
		map.put("atsWdrBkwAcno", get("atsWdrBkwAcno"));
		map.put("atsRgsStcd", get("atsRgsStcd"));
		map.put("atsRgsStcdNm", get("atsRgsStcdNm"));
		map.put("atsRgsDt", get("atsRgsDt"));
		map.put("atsCsno", get("atsCsno"));
		map.put("atsItcsno", get("atsItcsno"));
		map.put("atsCtrIscd", get("atsCtrIscd"));
		map.put("atsPypeNo", get("atsPypeNo"));
		map.put("atsTlmOccIstSrno", get("atsTlmOccIstSrno"));
		map.put("atsCtrIstNm", get("atsCtrIstNm"));
		map.put("spceNo", get("spceNo"));
		map.put("spceNm", get("spceNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 589376439:/* atpmMngNo */
			return getAtpmMngNo();
		case -1037460607:/* atsSrvcPdcd */
			return getAtsSrvcPdcd();
		case 1366640524:/* atsWdrBkwAcno */
			return getAtsWdrBkwAcno();
		case 284917184:/* atsRgsStcd */
			return getAtsRgsStcd();
		case -1072490593:/* atsRgsStcdNm */
			return getAtsRgsStcdNm();
		case 496384846:/* atsRgsDt */
			return getAtsRgsDt();
		case -677159695:/* atsCsno */
			return getAtsCsno();
		case -2038027108:/* atsItcsno */
			return getAtsItcsno();
		case 228220428:/* atsCtrIscd */
			return getAtsCtrIscd();
		case -1832632609:/* atsPypeNo */
			return getAtsPypeNo();
		case 1397115920:/* atsTlmOccIstSrno */
			return getAtsTlmOccIstSrno();
		case -1515085560:/* atsCtrIstNm */
			return getAtsCtrIstNm();
		case -896131680:/* spceNo */
			return getSpceNo();
		case -896131682:/* spceNm */
			return getSpceNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 589376439:/* atpmMngNo */
			setAtpmMngNo((String)value);
			break;
		case -1037460607:/* atsSrvcPdcd */
			setAtsSrvcPdcd((String)value);
			break;
		case 1366640524:/* atsWdrBkwAcno */
			setAtsWdrBkwAcno((String)value);
			break;
		case 284917184:/* atsRgsStcd */
			setAtsRgsStcd((String)value);
			break;
		case -1072490593:/* atsRgsStcdNm */
			setAtsRgsStcdNm((String)value);
			break;
		case 496384846:/* atsRgsDt */
			setAtsRgsDt((String)value);
			break;
		case -677159695:/* atsCsno */
			setAtsCsno((String)value);
			break;
		case -2038027108:/* atsItcsno */
			setAtsItcsno((String)value);
			break;
		case 228220428:/* atsCtrIscd */
			setAtsCtrIscd((String)value);
			break;
		case -1832632609:/* atsPypeNo */
			setAtsPypeNo((String)value);
			break;
		case 1397115920:/* atsTlmOccIstSrno */
			setAtsTlmOccIstSrno((String)value);
			break;
		case -1515085560:/* atsCtrIstNm */
			setAtsCtrIstNm((String)value);
			break;
		case -896131680:/* spceNo */
			setSpceNo((String)value);
			break;
		case -896131682:/* spceNm */
			setSpceNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
