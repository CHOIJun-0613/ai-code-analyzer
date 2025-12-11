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
	"metMngNo", "metNm", "dpsInpAcno", "rlfAcno", "metPbokDscd", "metPbokDscdNm", "metMbhAlsNm", "metMbhNm", "metMbhSrno", "ancSndDscd", "ancSndDscdNm", "agmdCollDt", "metDscd", "metDscdNm", "metRgsDt"
	, "rgsTm", "dpacNo", "metBscImgUrlNm"
}, name="MPBMetPbokBscMngInsertMetPbokBscInf_ODT")
@XmlRootElement(name="MPBMetPbokBscMngInsertMetPbokBscInf_ODT")
@BxmCategory(logicalName="모임.서비스.대표자.정보.등록.컨트롤러.출력.IO", description="") 
public class MPBMetPbokBscMngInsertMetPbokBscInf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 858675718L;
	
	
	
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
	 * 수신입력계좌번호
	 */
	@ApiModelProperty(
		name = "dpsInpAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsInpAcno")
	@BxmOmm_Field(length=15, decimal=0, description="수신입력계좌번호", align="left", fill="")
	private String dpsInpAcno= "";
	
	
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
	 * 공지발송구분코드
	 */
	@ApiModelProperty(
		name = "ancSndDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ancSndDscd")
	@BxmOmm_Field(length=1, decimal=0, description="공지발송구분코드", align="left", fill="")
	private String ancSndDscd= "";
	
	
	/**
	 * 공지발송구분코드명
	 */
	@ApiModelProperty(
		name = "ancSndDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ancSndDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="공지발송구분코드명", align="left", fill="")
	private String ancSndDscdNm= "";
	
	
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
	 * 수신계좌번호
	 */
	@ApiModelProperty(
		name = "dpacNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpacNo")
	@BxmOmm_Field(length=13, decimal=0, description="수신계좌번호", align="left", fill="")
	private String dpacNo= "";
	
	
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
	private boolean isSet_dpsInpAcno= false;
	protected final boolean isSet_dpsInpAcno(){
		return this.isSet_dpsInpAcno;
	}
	private void setIsSet_dpsInpAcno(boolean value){
		this.isSet_dpsInpAcno= value;
	}
	/**
	 * 수신입력계좌번호
	 */
	@XmlTransient
	public String getDpsInpAcno(){
		return this.dpsInpAcno;
	}
	
	/**
	 * 수신입력계좌번호
	 * 
	 * @param dpsInpAcno 수신입력계좌번호
	 */
	public void setDpsInpAcno(String dpsInpAcno){
		this.dpsInpAcno= dpsInpAcno;
		this.setIsSet_dpsInpAcno(true);
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
	private boolean isSet_ancSndDscd= false;
	protected final boolean isSet_ancSndDscd(){
		return this.isSet_ancSndDscd;
	}
	private void setIsSet_ancSndDscd(boolean value){
		this.isSet_ancSndDscd= value;
	}
	/**
	 * 공지발송구분코드
	 */
	@XmlTransient
	public String getAncSndDscd(){
		return this.ancSndDscd;
	}
	
	/**
	 * 공지발송구분코드
	 * 
	 * @param ancSndDscd 공지발송구분코드
	 */
	public void setAncSndDscd(String ancSndDscd){
		this.ancSndDscd= ancSndDscd;
		this.setIsSet_ancSndDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ancSndDscdNm= false;
	protected final boolean isSet_ancSndDscdNm(){
		return this.isSet_ancSndDscdNm;
	}
	private void setIsSet_ancSndDscdNm(boolean value){
		this.isSet_ancSndDscdNm= value;
	}
	/**
	 * 공지발송구분코드명
	 */
	@XmlTransient
	public String getAncSndDscdNm(){
		return this.ancSndDscdNm;
	}
	
	/**
	 * 공지발송구분코드명
	 * 
	 * @param ancSndDscdNm 공지발송구분코드명
	 */
	public void setAncSndDscdNm(String ancSndDscdNm){
		this.ancSndDscdNm= ancSndDscdNm;
		this.setIsSet_ancSndDscdNm(true);
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
	private boolean isSet_dpacNo= false;
	protected final boolean isSet_dpacNo(){
		return this.isSet_dpacNo;
	}
	private void setIsSet_dpacNo(boolean value){
		this.isSet_dpacNo= value;
	}
	/**
	 * 수신계좌번호
	 */
	@XmlTransient
	public String getDpacNo(){
		return this.dpacNo;
	}
	
	/**
	 * 수신계좌번호
	 * 
	 * @param dpacNo 수신계좌번호
	 */
	public void setDpacNo(String dpacNo){
		this.dpacNo= dpacNo;
		this.setIsSet_dpacNo(true);
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
				
	@Override
	public MPBMetPbokBscMngInsertMetPbokBscInf_ODT clone(){
		try{
			MPBMetPbokBscMngInsertMetPbokBscInf_ODT object= (MPBMetPbokBscMngInsertMetPbokBscInf_ODT)super.clone();
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
		result= prime * result + ((this.metNm==null)?0:this.metNm.hashCode());
		result= prime * result + ((this.dpsInpAcno==null)?0:this.dpsInpAcno.hashCode());
		result= prime * result + ((this.rlfAcno==null)?0:this.rlfAcno.hashCode());
		result= prime * result + ((this.metPbokDscd==null)?0:this.metPbokDscd.hashCode());
		result= prime * result + ((this.metPbokDscdNm==null)?0:this.metPbokDscdNm.hashCode());
		result= prime * result + ((this.metMbhAlsNm==null)?0:this.metMbhAlsNm.hashCode());
		result= prime * result + ((this.metMbhNm==null)?0:this.metMbhNm.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.ancSndDscd==null)?0:this.ancSndDscd.hashCode());
		result= prime * result + ((this.ancSndDscdNm==null)?0:this.ancSndDscdNm.hashCode());
		result= prime * result + ((this.agmdCollDt==null)?0:this.agmdCollDt.hashCode());
		result= prime * result + ((this.metDscd==null)?0:this.metDscd.hashCode());
		result= prime * result + ((this.metDscdNm==null)?0:this.metDscdNm.hashCode());
		result= prime * result + ((this.metRgsDt==null)?0:this.metRgsDt.hashCode());
		result= prime * result + ((this.rgsTm==null)?0:this.rgsTm.hashCode());
		result= prime * result + ((this.dpacNo==null)?0:this.dpacNo.hashCode());
		result= prime * result + ((this.metBscImgUrlNm==null)?0:this.metBscImgUrlNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngInsertMetPbokBscInf_ODT other= (MPBMetPbokBscMngInsertMetPbokBscInf_ODT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metNm= getMetNm();
			Object __metNm= other.getMetNm();
			if ( _metNm== null ) { if ( __metNm!= null ) return false; }
			else if ( !_metNm.equals(__metNm) ) return false;
		}
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _rlfAcno= getRlfAcno();
			Object __rlfAcno= other.getRlfAcno();
			if ( _rlfAcno== null ) { if ( __rlfAcno!= null ) return false; }
			else if ( !_rlfAcno.equals(__rlfAcno) ) return false;
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
			Object _metMbhAlsNm= getMetMbhAlsNm();
			Object __metMbhAlsNm= other.getMetMbhAlsNm();
			if ( _metMbhAlsNm== null ) { if ( __metMbhAlsNm!= null ) return false; }
			else if ( !_metMbhAlsNm.equals(__metMbhAlsNm) ) return false;
		}
		{
			Object _metMbhNm= getMetMbhNm();
			Object __metMbhNm= other.getMetMbhNm();
			if ( _metMbhNm== null ) { if ( __metMbhNm!= null ) return false; }
			else if ( !_metMbhNm.equals(__metMbhNm) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _ancSndDscd= getAncSndDscd();
			Object __ancSndDscd= other.getAncSndDscd();
			if ( _ancSndDscd== null ) { if ( __ancSndDscd!= null ) return false; }
			else if ( !_ancSndDscd.equals(__ancSndDscd) ) return false;
		}
		{
			Object _ancSndDscdNm= getAncSndDscdNm();
			Object __ancSndDscdNm= other.getAncSndDscdNm();
			if ( _ancSndDscdNm== null ) { if ( __ancSndDscdNm!= null ) return false; }
			else if ( !_ancSndDscdNm.equals(__ancSndDscdNm) ) return false;
		}
		{
			Object _agmdCollDt= getAgmdCollDt();
			Object __agmdCollDt= other.getAgmdCollDt();
			if ( _agmdCollDt== null ) { if ( __agmdCollDt!= null ) return false; }
			else if ( !_agmdCollDt.equals(__agmdCollDt) ) return false;
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
			Object _dpacNo= getDpacNo();
			Object __dpacNo= other.getDpacNo();
			if ( _dpacNo== null ) { if ( __dpacNo!= null ) return false; }
			else if ( !_dpacNo.equals(__dpacNo) ) return false;
		}
		{
			Object _metBscImgUrlNm= getMetBscImgUrlNm();
			Object __metBscImgUrlNm= other.getMetBscImgUrlNm();
			if ( _metBscImgUrlNm== null ) { if ( __metBscImgUrlNm!= null ) return false; }
			else if ( !_metBscImgUrlNm.equals(__metBscImgUrlNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngInsertMetPbokBscInf_ODT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetNm: ");
		sb.append(metNm==null?"null":getMetNm());
		sb.append("\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\trlfAcno: ");
		sb.append(rlfAcno==null?"null":getRlfAcno());
		sb.append("\n");
		sb.append("\tmetPbokDscd: ");
		sb.append(metPbokDscd==null?"null":getMetPbokDscd());
		sb.append("\n");
		sb.append("\tmetPbokDscdNm: ");
		sb.append(metPbokDscdNm==null?"null":getMetPbokDscdNm());
		sb.append("\n");
		sb.append("\tmetMbhAlsNm: ");
		sb.append(metMbhAlsNm==null?"null":getMetMbhAlsNm());
		sb.append("\n");
		sb.append("\tmetMbhNm: ");
		sb.append(metMbhNm==null?"null":getMetMbhNm());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tancSndDscd: ");
		sb.append(ancSndDscd==null?"null":getAncSndDscd());
		sb.append("\n");
		sb.append("\tancSndDscdNm: ");
		sb.append(ancSndDscdNm==null?"null":getAncSndDscdNm());
		sb.append("\n");
		sb.append("\tagmdCollDt: ");
		sb.append(agmdCollDt==null?"null":getAgmdCollDt());
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
		sb.append("\tdpacNo: ");
		sb.append(dpacNo==null?"null":getDpacNo());
		sb.append("\n");
		sb.append("\tmetBscImgUrlNm: ");
		sb.append(metBscImgUrlNm==null?"null":getMetBscImgUrlNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 100; /* metNm */
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 11; /* rlfAcno */
		messageLen+= 1; /* metPbokDscd */
		messageLen+= 50; /* metPbokDscdNm */
		messageLen+= 60; /* metMbhAlsNm */
		messageLen+= 60; /* metMbhNm */
		messageLen+= 7; /* metMbhSrno */
		messageLen+= 1; /* ancSndDscd */
		messageLen+= 50; /* ancSndDscdNm */
		messageLen+= 8; /* agmdCollDt */
		messageLen+= 2; /* metDscd */
		messageLen+= 50; /* metDscdNm */
		messageLen+= 8; /* metRgsDt */
		messageLen+= 6; /* rgsTm */
		messageLen+= 13; /* dpacNo */
		messageLen+= 100; /* metBscImgUrlNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metNm");
		list.add("dpsInpAcno");
		list.add("rlfAcno");
		list.add("metPbokDscd");
		list.add("metPbokDscdNm");
		list.add("metMbhAlsNm");
		list.add("metMbhNm");
		list.add("metMbhSrno");
		list.add("ancSndDscd");
		list.add("ancSndDscdNm");
		list.add("agmdCollDt");
		list.add("metDscd");
		list.add("metDscdNm");
		list.add("metRgsDt");
		list.add("rgsTm");
		list.add("dpacNo");
		list.add("metBscImgUrlNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metNm", get("metNm"));
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("rlfAcno", get("rlfAcno"));
		map.put("metPbokDscd", get("metPbokDscd"));
		map.put("metPbokDscdNm", get("metPbokDscdNm"));
		map.put("metMbhAlsNm", get("metMbhAlsNm"));
		map.put("metMbhNm", get("metMbhNm"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("ancSndDscd", get("ancSndDscd"));
		map.put("ancSndDscdNm", get("ancSndDscdNm"));
		map.put("agmdCollDt", get("agmdCollDt"));
		map.put("metDscd", get("metDscd"));
		map.put("metDscdNm", get("metDscdNm"));
		map.put("metRgsDt", get("metRgsDt"));
		map.put("rgsTm", get("rgsTm"));
		map.put("dpacNo", get("dpacNo"));
		map.put("metBscImgUrlNm", get("metBscImgUrlNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 103786683:/* metNm */
			return getMetNm();
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case 1284387055:/* rlfAcno */
			return getRlfAcno();
		case 1867195290:/* metPbokDscd */
			return getMetPbokDscd();
		case -921653511:/* metPbokDscdNm */
			return getMetPbokDscdNm();
		case 695730640:/* metMbhAlsNm */
			return getMetMbhAlsNm();
		case -468528618:/* metMbhNm */
			return getMetMbhNm();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case 1498154883:/* ancSndDscd */
			return getAncSndDscd();
		case 912800930:/* ancSndDscdNm */
			return getAncSndDscdNm();
		case -1798348999:/* agmdCollDt */
			return getAgmdCollDt();
		case 954465580:/* metDscd */
			return getMetDscd();
		case -1881576437:/* metDscdNm */
			return getMetDscdNm();
		case -463751790:/* metRgsDt */
			return getMetRgsDt();
		case 108463095:/* rgsTm */
			return getRgsTm();
		case -1325630449:/* dpacNo */
			return getDpacNo();
		case 300784225:/* metBscImgUrlNm */
			return getMetBscImgUrlNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 103786683:/* metNm */
			setMetNm((String)value);
			break;
		case -865257337:/* dpsInpAcno */
			setDpsInpAcno((String)value);
			break;
		case 1284387055:/* rlfAcno */
			setRlfAcno((String)value);
			break;
		case 1867195290:/* metPbokDscd */
			setMetPbokDscd((String)value);
			break;
		case -921653511:/* metPbokDscdNm */
			setMetPbokDscdNm((String)value);
			break;
		case 695730640:/* metMbhAlsNm */
			setMetMbhAlsNm((String)value);
			break;
		case -468528618:/* metMbhNm */
			setMetMbhNm((String)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
			break;
		case 1498154883:/* ancSndDscd */
			setAncSndDscd((String)value);
			break;
		case 912800930:/* ancSndDscdNm */
			setAncSndDscdNm((String)value);
			break;
		case -1798348999:/* agmdCollDt */
			setAgmdCollDt((String)value);
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
		case -1325630449:/* dpacNo */
			setDpacNo((String)value);
			break;
		case 300784225:/* metBscImgUrlNm */
			setMetBscImgUrlNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
