/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.shr.dto;

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
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(dataMasking=true)
@XmlType(propOrder={
	"itcsno", "mnyClpChidAcno", "mnyClpMoAcno", "mnyClpChidActDscd", "mnyClpChidActNm", "mnyClpChidActExpsSeq", "mnyClpChidActIconNm", "rgpeId", "rgpeDeptId", "rgsDtm", "amdpeId", "amdpeDeptId", "amdDtm"
}, name="MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT")
@XmlRootElement(name="MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT")
@BxmCategory(logicalName="머니클립노출순서기본등록.DBM.입력.IO", description="") 
public class MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1589742954L;
	
	
	
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
	 * 머니클립자계좌번호
	 */
	@ApiModelProperty(
		name = "mnyClpChidAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidAcno")
	@BxmOmm_Field(length=13, decimal=0, description="머니클립자계좌번호", align="left", fill="", formatType="masking", format="M141")
	private String mnyClpChidAcno= "";
	
	
	/**
	 * 머니클립모계좌번호
	 */
	@ApiModelProperty(
		name = "mnyClpMoAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpMoAcno")
	@BxmOmm_Field(length=13, decimal=0, description="머니클립모계좌번호", align="left", fill="", formatType="masking", format="M141")
	private String mnyClpMoAcno= "";
	
	
	/**
	 * 머니클립자계좌구분코드
	 */
	@ApiModelProperty(
		name = "mnyClpChidActDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActDscd")
	@BxmOmm_Field(length=1, decimal=0, description="머니클립자계좌구분코드", align="left", fill="")
	private String mnyClpChidActDscd= "";
	
	
	/**
	 * 머니클립자계좌명
	 */
	@ApiModelProperty(
		name = "mnyClpChidActNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActNm")
	@BxmOmm_Field(length=100, decimal=0, description="머니클립자계좌명", align="left", fill="")
	private String mnyClpChidActNm= "";
	
	
	/**
	 * 머니클립자계좌노출순서
	 */
	@ApiModelProperty(
		name = "mnyClpChidActExpsSeq"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActExpsSeq")
	@BxmOmm_Field(length=3, decimal=0, description="머니클립자계좌노출순서", align="left", fill="")
	private String mnyClpChidActExpsSeq= "";
	
	
	/**
	 * 머니클립자계좌아이콘명
	 */
	@ApiModelProperty(
		name = "mnyClpChidActIconNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActIconNm")
	@BxmOmm_Field(length=200, decimal=0, description="머니클립자계좌아이콘명", align="left", fill="")
	private String mnyClpChidActIconNm= "";
	
	
	/**
	 * 등록자ID
	 */
	@ApiModelProperty(
		name = "rgpeId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgpeId")
	@BxmOmm_Field(length=20, decimal=0, description="등록자ID", align="left", fill="")
	private String rgpeId= "";
	
	
	/**
	 * 등록자부서ID
	 */
	@ApiModelProperty(
		name = "rgpeDeptId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgpeDeptId")
	@BxmOmm_Field(length=6, decimal=0, description="등록자부서ID", align="left", fill="")
	private String rgpeDeptId= "";
	
	
	/**
	 * 등록일시
	 */
	@ApiModelProperty(
		name = "rgsDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgsDtm")
	@BxmOmm_Field(length=14, decimal=0, description="등록일시", align="left", fill="")
	private String rgsDtm= "";
	
	
	/**
	 * 수정자ID
	 */
	@ApiModelProperty(
		name = "amdpeId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("amdpeId")
	@BxmOmm_Field(length=20, decimal=0, description="수정자ID", align="left", fill="")
	private String amdpeId= "";
	
	
	/**
	 * 수정자부서ID
	 */
	@ApiModelProperty(
		name = "amdpeDeptId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("amdpeDeptId")
	@BxmOmm_Field(length=6, decimal=0, description="수정자부서ID", align="left", fill="")
	private String amdpeDeptId= "";
	
	
	/**
	 * 수정일시
	 */
	@ApiModelProperty(
		name = "amdDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("amdDtm")
	@BxmOmm_Field(length=20, decimal=0, description="수정일시", align="left", fill="")
	private String amdDtm= "";
	
	
	
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
	private boolean isSet_mnyClpChidAcno= false;
	protected final boolean isSet_mnyClpChidAcno(){
		return this.isSet_mnyClpChidAcno;
	}
	private void setIsSet_mnyClpChidAcno(boolean value){
		this.isSet_mnyClpChidAcno= value;
	}
	/**
	 * 머니클립자계좌번호
	 */
	@XmlTransient
	public String getMnyClpChidAcno(){
		return this.mnyClpChidAcno;
	}
	
	/**
	 * 머니클립자계좌번호
	 * 
	 * @param mnyClpChidAcno 머니클립자계좌번호
	 */
	public void setMnyClpChidAcno(String mnyClpChidAcno){
		this.mnyClpChidAcno= mnyClpChidAcno;
		this.setIsSet_mnyClpChidAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpMoAcno= false;
	protected final boolean isSet_mnyClpMoAcno(){
		return this.isSet_mnyClpMoAcno;
	}
	private void setIsSet_mnyClpMoAcno(boolean value){
		this.isSet_mnyClpMoAcno= value;
	}
	/**
	 * 머니클립모계좌번호
	 */
	@XmlTransient
	public String getMnyClpMoAcno(){
		return this.mnyClpMoAcno;
	}
	
	/**
	 * 머니클립모계좌번호
	 * 
	 * @param mnyClpMoAcno 머니클립모계좌번호
	 */
	public void setMnyClpMoAcno(String mnyClpMoAcno){
		this.mnyClpMoAcno= mnyClpMoAcno;
		this.setIsSet_mnyClpMoAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActDscd= false;
	protected final boolean isSet_mnyClpChidActDscd(){
		return this.isSet_mnyClpChidActDscd;
	}
	private void setIsSet_mnyClpChidActDscd(boolean value){
		this.isSet_mnyClpChidActDscd= value;
	}
	/**
	 * 머니클립자계좌구분코드
	 */
	@XmlTransient
	public String getMnyClpChidActDscd(){
		return this.mnyClpChidActDscd;
	}
	
	/**
	 * 머니클립자계좌구분코드
	 * 
	 * @param mnyClpChidActDscd 머니클립자계좌구분코드
	 */
	public void setMnyClpChidActDscd(String mnyClpChidActDscd){
		this.mnyClpChidActDscd= mnyClpChidActDscd;
		this.setIsSet_mnyClpChidActDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActNm= false;
	protected final boolean isSet_mnyClpChidActNm(){
		return this.isSet_mnyClpChidActNm;
	}
	private void setIsSet_mnyClpChidActNm(boolean value){
		this.isSet_mnyClpChidActNm= value;
	}
	/**
	 * 머니클립자계좌명
	 */
	@XmlTransient
	public String getMnyClpChidActNm(){
		return this.mnyClpChidActNm;
	}
	
	/**
	 * 머니클립자계좌명
	 * 
	 * @param mnyClpChidActNm 머니클립자계좌명
	 */
	public void setMnyClpChidActNm(String mnyClpChidActNm){
		this.mnyClpChidActNm= mnyClpChidActNm;
		this.setIsSet_mnyClpChidActNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActExpsSeq= false;
	protected final boolean isSet_mnyClpChidActExpsSeq(){
		return this.isSet_mnyClpChidActExpsSeq;
	}
	private void setIsSet_mnyClpChidActExpsSeq(boolean value){
		this.isSet_mnyClpChidActExpsSeq= value;
	}
	/**
	 * 머니클립자계좌노출순서
	 */
	@XmlTransient
	public String getMnyClpChidActExpsSeq(){
		return this.mnyClpChidActExpsSeq;
	}
	
	/**
	 * 머니클립자계좌노출순서
	 * 
	 * @param mnyClpChidActExpsSeq 머니클립자계좌노출순서
	 */
	public void setMnyClpChidActExpsSeq(String mnyClpChidActExpsSeq){
		this.mnyClpChidActExpsSeq= mnyClpChidActExpsSeq;
		this.setIsSet_mnyClpChidActExpsSeq(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActIconNm= false;
	protected final boolean isSet_mnyClpChidActIconNm(){
		return this.isSet_mnyClpChidActIconNm;
	}
	private void setIsSet_mnyClpChidActIconNm(boolean value){
		this.isSet_mnyClpChidActIconNm= value;
	}
	/**
	 * 머니클립자계좌아이콘명
	 */
	@XmlTransient
	public String getMnyClpChidActIconNm(){
		return this.mnyClpChidActIconNm;
	}
	
	/**
	 * 머니클립자계좌아이콘명
	 * 
	 * @param mnyClpChidActIconNm 머니클립자계좌아이콘명
	 */
	public void setMnyClpChidActIconNm(String mnyClpChidActIconNm){
		this.mnyClpChidActIconNm= mnyClpChidActIconNm;
		this.setIsSet_mnyClpChidActIconNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgpeId= false;
	protected final boolean isSet_rgpeId(){
		return this.isSet_rgpeId;
	}
	private void setIsSet_rgpeId(boolean value){
		this.isSet_rgpeId= value;
	}
	/**
	 * 등록자ID
	 */
	@XmlTransient
	public String getRgpeId(){
		return this.rgpeId;
	}
	
	/**
	 * 등록자ID
	 * 
	 * @param rgpeId 등록자ID
	 */
	public void setRgpeId(String rgpeId){
		this.rgpeId= rgpeId;
		this.setIsSet_rgpeId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgpeDeptId= false;
	protected final boolean isSet_rgpeDeptId(){
		return this.isSet_rgpeDeptId;
	}
	private void setIsSet_rgpeDeptId(boolean value){
		this.isSet_rgpeDeptId= value;
	}
	/**
	 * 등록자부서ID
	 */
	@XmlTransient
	public String getRgpeDeptId(){
		return this.rgpeDeptId;
	}
	
	/**
	 * 등록자부서ID
	 * 
	 * @param rgpeDeptId 등록자부서ID
	 */
	public void setRgpeDeptId(String rgpeDeptId){
		this.rgpeDeptId= rgpeDeptId;
		this.setIsSet_rgpeDeptId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsDtm= false;
	protected final boolean isSet_rgsDtm(){
		return this.isSet_rgsDtm;
	}
	private void setIsSet_rgsDtm(boolean value){
		this.isSet_rgsDtm= value;
	}
	/**
	 * 등록일시
	 */
	@XmlTransient
	public String getRgsDtm(){
		return this.rgsDtm;
	}
	
	/**
	 * 등록일시
	 * 
	 * @param rgsDtm 등록일시
	 */
	public void setRgsDtm(String rgsDtm){
		this.rgsDtm= rgsDtm;
		this.setIsSet_rgsDtm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_amdpeId= false;
	protected final boolean isSet_amdpeId(){
		return this.isSet_amdpeId;
	}
	private void setIsSet_amdpeId(boolean value){
		this.isSet_amdpeId= value;
	}
	/**
	 * 수정자ID
	 */
	@XmlTransient
	public String getAmdpeId(){
		return this.amdpeId;
	}
	
	/**
	 * 수정자ID
	 * 
	 * @param amdpeId 수정자ID
	 */
	public void setAmdpeId(String amdpeId){
		this.amdpeId= amdpeId;
		this.setIsSet_amdpeId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_amdpeDeptId= false;
	protected final boolean isSet_amdpeDeptId(){
		return this.isSet_amdpeDeptId;
	}
	private void setIsSet_amdpeDeptId(boolean value){
		this.isSet_amdpeDeptId= value;
	}
	/**
	 * 수정자부서ID
	 */
	@XmlTransient
	public String getAmdpeDeptId(){
		return this.amdpeDeptId;
	}
	
	/**
	 * 수정자부서ID
	 * 
	 * @param amdpeDeptId 수정자부서ID
	 */
	public void setAmdpeDeptId(String amdpeDeptId){
		this.amdpeDeptId= amdpeDeptId;
		this.setIsSet_amdpeDeptId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_amdDtm= false;
	protected final boolean isSet_amdDtm(){
		return this.isSet_amdDtm;
	}
	private void setIsSet_amdDtm(boolean value){
		this.isSet_amdDtm= value;
	}
	/**
	 * 수정일시
	 */
	@XmlTransient
	public String getAmdDtm(){
		return this.amdDtm;
	}
	
	/**
	 * 수정일시
	 * 
	 * @param amdDtm 수정일시
	 */
	public void setAmdDtm(String amdDtm){
		this.amdDtm= amdDtm;
		this.setIsSet_amdDtm(true);
	}
				
	@Override
	public MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT clone(){
		try{
			MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT object= (MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT)super.clone();
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
		result= prime * result + ((this.mnyClpChidAcno==null)?0:this.mnyClpChidAcno.hashCode());
		result= prime * result + ((this.mnyClpMoAcno==null)?0:this.mnyClpMoAcno.hashCode());
		result= prime * result + ((this.mnyClpChidActDscd==null)?0:this.mnyClpChidActDscd.hashCode());
		result= prime * result + ((this.mnyClpChidActNm==null)?0:this.mnyClpChidActNm.hashCode());
		result= prime * result + ((this.mnyClpChidActExpsSeq==null)?0:this.mnyClpChidActExpsSeq.hashCode());
		result= prime * result + ((this.mnyClpChidActIconNm==null)?0:this.mnyClpChidActIconNm.hashCode());
		result= prime * result + ((this.rgpeId==null)?0:this.rgpeId.hashCode());
		result= prime * result + ((this.rgpeDeptId==null)?0:this.rgpeDeptId.hashCode());
		result= prime * result + ((this.rgsDtm==null)?0:this.rgsDtm.hashCode());
		result= prime * result + ((this.amdpeId==null)?0:this.amdpeId.hashCode());
		result= prime * result + ((this.amdpeDeptId==null)?0:this.amdpeDeptId.hashCode());
		result= prime * result + ((this.amdDtm==null)?0:this.amdDtm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT other= (MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _mnyClpChidAcno= getMnyClpChidAcno();
			Object __mnyClpChidAcno= other.getMnyClpChidAcno();
			if ( _mnyClpChidAcno== null ) { if ( __mnyClpChidAcno!= null ) return false; }
			else if ( !_mnyClpChidAcno.equals(__mnyClpChidAcno) ) return false;
		}
		{
			Object _mnyClpMoAcno= getMnyClpMoAcno();
			Object __mnyClpMoAcno= other.getMnyClpMoAcno();
			if ( _mnyClpMoAcno== null ) { if ( __mnyClpMoAcno!= null ) return false; }
			else if ( !_mnyClpMoAcno.equals(__mnyClpMoAcno) ) return false;
		}
		{
			Object _mnyClpChidActDscd= getMnyClpChidActDscd();
			Object __mnyClpChidActDscd= other.getMnyClpChidActDscd();
			if ( _mnyClpChidActDscd== null ) { if ( __mnyClpChidActDscd!= null ) return false; }
			else if ( !_mnyClpChidActDscd.equals(__mnyClpChidActDscd) ) return false;
		}
		{
			Object _mnyClpChidActNm= getMnyClpChidActNm();
			Object __mnyClpChidActNm= other.getMnyClpChidActNm();
			if ( _mnyClpChidActNm== null ) { if ( __mnyClpChidActNm!= null ) return false; }
			else if ( !_mnyClpChidActNm.equals(__mnyClpChidActNm) ) return false;
		}
		{
			Object _mnyClpChidActExpsSeq= getMnyClpChidActExpsSeq();
			Object __mnyClpChidActExpsSeq= other.getMnyClpChidActExpsSeq();
			if ( _mnyClpChidActExpsSeq== null ) { if ( __mnyClpChidActExpsSeq!= null ) return false; }
			else if ( !_mnyClpChidActExpsSeq.equals(__mnyClpChidActExpsSeq) ) return false;
		}
		{
			Object _mnyClpChidActIconNm= getMnyClpChidActIconNm();
			Object __mnyClpChidActIconNm= other.getMnyClpChidActIconNm();
			if ( _mnyClpChidActIconNm== null ) { if ( __mnyClpChidActIconNm!= null ) return false; }
			else if ( !_mnyClpChidActIconNm.equals(__mnyClpChidActIconNm) ) return false;
		}
		{
			Object _rgpeId= getRgpeId();
			Object __rgpeId= other.getRgpeId();
			if ( _rgpeId== null ) { if ( __rgpeId!= null ) return false; }
			else if ( !_rgpeId.equals(__rgpeId) ) return false;
		}
		{
			Object _rgpeDeptId= getRgpeDeptId();
			Object __rgpeDeptId= other.getRgpeDeptId();
			if ( _rgpeDeptId== null ) { if ( __rgpeDeptId!= null ) return false; }
			else if ( !_rgpeDeptId.equals(__rgpeDeptId) ) return false;
		}
		{
			Object _rgsDtm= getRgsDtm();
			Object __rgsDtm= other.getRgsDtm();
			if ( _rgsDtm== null ) { if ( __rgsDtm!= null ) return false; }
			else if ( !_rgsDtm.equals(__rgsDtm) ) return false;
		}
		{
			Object _amdpeId= getAmdpeId();
			Object __amdpeId= other.getAmdpeId();
			if ( _amdpeId== null ) { if ( __amdpeId!= null ) return false; }
			else if ( !_amdpeId.equals(__amdpeId) ) return false;
		}
		{
			Object _amdpeDeptId= getAmdpeDeptId();
			Object __amdpeDeptId= other.getAmdpeDeptId();
			if ( _amdpeDeptId== null ) { if ( __amdpeDeptId!= null ) return false; }
			else if ( !_amdpeDeptId.equals(__amdpeDeptId) ) return false;
		}
		{
			Object _amdDtm= getAmdDtm();
			Object __amdDtm= other.getAmdDtm();
			if ( _amdDtm== null ) { if ( __amdDtm!= null ) return false; }
			else if ( !_amdDtm.equals(__amdDtm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tmnyClpChidAcno: ");
		sb.append(mnyClpChidAcno==null?"null":getMnyClpChidAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tmnyClpMoAcno: ");
		sb.append(mnyClpMoAcno==null?"null":getMnyClpMoAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tmnyClpChidActDscd: ");
		sb.append(mnyClpChidActDscd==null?"null":getMnyClpChidActDscd());
		sb.append("\n");
		sb.append("\tmnyClpChidActNm: ");
		sb.append(mnyClpChidActNm==null?"null":getMnyClpChidActNm());
		sb.append("\n");
		sb.append("\tmnyClpChidActExpsSeq: ");
		sb.append(mnyClpChidActExpsSeq==null?"null":getMnyClpChidActExpsSeq());
		sb.append("\n");
		sb.append("\tmnyClpChidActIconNm: ");
		sb.append(mnyClpChidActIconNm==null?"null":getMnyClpChidActIconNm());
		sb.append("\n");
		sb.append("\trgpeId: ");
		sb.append(rgpeId==null?"null":getRgpeId());
		sb.append("\n");
		sb.append("\trgpeDeptId: ");
		sb.append(rgpeDeptId==null?"null":getRgpeDeptId());
		sb.append("\n");
		sb.append("\trgsDtm: ");
		sb.append(rgsDtm==null?"null":getRgsDtm());
		sb.append("\n");
		sb.append("\tamdpeId: ");
		sb.append(amdpeId==null?"null":getAmdpeId());
		sb.append("\n");
		sb.append("\tamdpeDeptId: ");
		sb.append(amdpeDeptId==null?"null":getAmdpeDeptId());
		sb.append("\n");
		sb.append("\tamdDtm: ");
		sb.append(amdDtm==null?"null":getAmdDtm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 13; /* mnyClpChidAcno */
		messageLen+= 13; /* mnyClpMoAcno */
		messageLen+= 1; /* mnyClpChidActDscd */
		messageLen+= 100; /* mnyClpChidActNm */
		messageLen+= 3; /* mnyClpChidActExpsSeq */
		messageLen+= 200; /* mnyClpChidActIconNm */
		messageLen+= 20; /* rgpeId */
		messageLen+= 6; /* rgpeDeptId */
		messageLen+= 14; /* rgsDtm */
		messageLen+= 20; /* amdpeId */
		messageLen+= 6; /* amdpeDeptId */
		messageLen+= 20; /* amdDtm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("mnyClpChidAcno");
		list.add("mnyClpMoAcno");
		list.add("mnyClpChidActDscd");
		list.add("mnyClpChidActNm");
		list.add("mnyClpChidActExpsSeq");
		list.add("mnyClpChidActIconNm");
		list.add("rgpeId");
		list.add("rgpeDeptId");
		list.add("rgsDtm");
		list.add("amdpeId");
		list.add("amdpeDeptId");
		list.add("amdDtm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("mnyClpChidAcno", get("mnyClpChidAcno"));
		map.put("mnyClpMoAcno", get("mnyClpMoAcno"));
		map.put("mnyClpChidActDscd", get("mnyClpChidActDscd"));
		map.put("mnyClpChidActNm", get("mnyClpChidActNm"));
		map.put("mnyClpChidActExpsSeq", get("mnyClpChidActExpsSeq"));
		map.put("mnyClpChidActIconNm", get("mnyClpChidActIconNm"));
		map.put("rgpeId", get("rgpeId"));
		map.put("rgpeDeptId", get("rgpeDeptId"));
		map.put("rgsDtm", get("rgsDtm"));
		map.put("amdpeId", get("amdpeId"));
		map.put("amdpeDeptId", get("amdpeDeptId"));
		map.put("amdDtm", get("amdDtm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case -1782725134:/* mnyClpChidAcno */
			return getMnyClpChidAcno();
		case 115408404:/* mnyClpMoAcno */
			return getMnyClpMoAcno();
		case -1889478157:/* mnyClpChidActDscd */
			return getMnyClpChidActDscd();
		case 570100546:/* mnyClpChidActNm */
			return getMnyClpChidActNm();
		case 1440791270:/* mnyClpChidActExpsSeq */
			return getMnyClpChidActExpsSeq();
		case 1111396379:/* mnyClpChidActIconNm */
			return getMnyClpChidActIconNm();
		case -932685403:/* rgpeId */
			return getRgpeId();
		case 996377034:/* rgpeDeptId */
			return getRgpeDeptId();
		case -932626401:/* rgsDtm */
			return getRgsDtm();
		case -890090584:/* amdpeId */
			return getAmdpeId();
		case 600750669:/* amdpeDeptId */
			return getAmdpeDeptId();
		case -1414227707:/* amdDtm */
			return getAmdDtm();
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
		case -1782725134:/* mnyClpChidAcno */
			setMnyClpChidAcno((String)value);
			break;
		case 115408404:/* mnyClpMoAcno */
			setMnyClpMoAcno((String)value);
			break;
		case -1889478157:/* mnyClpChidActDscd */
			setMnyClpChidActDscd((String)value);
			break;
		case 570100546:/* mnyClpChidActNm */
			setMnyClpChidActNm((String)value);
			break;
		case 1440791270:/* mnyClpChidActExpsSeq */
			setMnyClpChidActExpsSeq((String)value);
			break;
		case 1111396379:/* mnyClpChidActIconNm */
			setMnyClpChidActIconNm((String)value);
			break;
		case -932685403:/* rgpeId */
			setRgpeId((String)value);
			break;
		case 996377034:/* rgpeDeptId */
			setRgpeDeptId((String)value);
			break;
		case -932626401:/* rgsDtm */
			setRgsDtm((String)value);
			break;
		case -890090584:/* amdpeId */
			setAmdpeId((String)value);
			break;
		case 600750669:/* amdpeDeptId */
			setAmdpeDeptId((String)value);
			break;
		case -1414227707:/* amdDtm */
			setAmdDtm((String)value);
			break;
		default:
			break;
		}
	}
	
}
