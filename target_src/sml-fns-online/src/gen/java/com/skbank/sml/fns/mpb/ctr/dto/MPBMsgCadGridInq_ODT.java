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
	"metMsgCadId", "metMsgCadNm", "metMsgCadTxt", "metMsgCadSortSeq", "appMarkImgPathTxt", "snsMarkImgPathTxt", "metMsgCadRgsDtm", "metMsgCadChgDtm", "metMsgCadUsgYn", "metMsgCadDisTxt", "metMsgCadDelYn", "metMsgCadDscd", "metMsgCadRgpeId", "metMsgCadAmdpeId", "lstDbChgId"
	, "lstDbChgDtm"
}, name="MPBMsgCadGridInq_ODT")
@XmlRootElement(name="MPBMsgCadGridInq_ODT")
@BxmCategory(logicalName="메시지.카드.조회.그리드.컨트롤러.출력.IO", description="") 
public class MPBMsgCadGridInq_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1350386659L;
	
	
	
	/**
	 * 모임메시지카드ID
	 */
	@ApiModelProperty(
		name = "metMsgCadId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadId")
	@BxmOmm_Field(length=20, decimal=0, description="모임메시지카드ID", align="left", fill="")
	private String metMsgCadId= "";
	
	
	/**
	 * 모임메시지카드명
	 */
	@ApiModelProperty(
		name = "metMsgCadNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임메시지카드명", align="left", fill="")
	private String metMsgCadNm= "";
	
	
	/**
	 * 모임메시지카드내용
	 */
	@ApiModelProperty(
		name = "metMsgCadTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadTxt")
	@BxmOmm_Field(length=500, decimal=0, description="모임메시지카드내용", align="left", fill="")
	private String metMsgCadTxt= "";
	
	
	/**
	 * 모임메시지카드정렬순서
	 */
	@ApiModelProperty(
		name = "metMsgCadSortSeq"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMsgCadSortSeq")
	@BxmOmm_Field(length=6, decimal=0, description="모임메시지카드정렬순서", align="right", fill="")
	private Integer metMsgCadSortSeq= 0;
	
	
	/**
	 * 앱표시이미지경로내용
	 */
	@ApiModelProperty(
		name = "appMarkImgPathTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appMarkImgPathTxt")
	@BxmOmm_Field(length=500, decimal=0, description="앱표시이미지경로내용", align="left", fill="")
	private String appMarkImgPathTxt= "";
	
	
	/**
	 * SNS표시이미지경로내용
	 */
	@ApiModelProperty(
		name = "snsMarkImgPathTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("snsMarkImgPathTxt")
	@BxmOmm_Field(length=500, decimal=0, description="SNS표시이미지경로내용", align="left", fill="")
	private String snsMarkImgPathTxt= "";
	
	
	/**
	 * 모임메시지카드등록일시
	 */
	@ApiModelProperty(
		name = "metMsgCadRgsDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadRgsDtm")
	@BxmOmm_Field(length=20, decimal=0, description="모임메시지카드등록일시", align="left", fill="")
	private String metMsgCadRgsDtm= "";
	
	
	/**
	 * 모임메시지카드변경일시
	 */
	@ApiModelProperty(
		name = "metMsgCadChgDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadChgDtm")
	@BxmOmm_Field(length=20, decimal=0, description="모임메시지카드변경일시", align="left", fill="")
	private String metMsgCadChgDtm= "";
	
	
	/**
	 * 모임메시지카드사용여부
	 */
	@ApiModelProperty(
		name = "metMsgCadUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임메시지카드사용여부", align="left", fill="")
	private String metMsgCadUsgYn= "";
	
	
	/**
	 * 모임메시지카드구분내용
	 */
	@ApiModelProperty(
		name = "metMsgCadDisTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadDisTxt")
	@BxmOmm_Field(length=20, decimal=0, description="모임메시지카드구분내용", align="left", fill="")
	private String metMsgCadDisTxt= "";
	
	
	/**
	 * 모임메시지카드삭제여부
	 */
	@ApiModelProperty(
		name = "metMsgCadDelYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadDelYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임메시지카드삭제여부", align="left", fill="")
	private String metMsgCadDelYn= "";
	
	
	/**
	 * 모임메시지카드구분코드
	 */
	@ApiModelProperty(
		name = "metMsgCadDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadDscd")
	@BxmOmm_Field(length=2, decimal=0, description="모임메시지카드구분코드", align="left", fill="")
	private String metMsgCadDscd= "";
	
	
	/**
	 * 모임메시지카드등록자ID
	 */
	@ApiModelProperty(
		name = "metMsgCadRgpeId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadRgpeId")
	@BxmOmm_Field(length=20, decimal=0, description="모임메시지카드등록자ID", align="left", fill="")
	private String metMsgCadRgpeId= "";
	
	
	/**
	 * 모임메시지카드수정자ID
	 */
	@ApiModelProperty(
		name = "metMsgCadAmdpeId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMsgCadAmdpeId")
	@BxmOmm_Field(length=20, decimal=0, description="모임메시지카드수정자ID", align="left", fill="")
	private String metMsgCadAmdpeId= "";
	
	
	/**
	 * 최종DB변경ID
	 */
	@ApiModelProperty(
		name = "lstDbChgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstDbChgId")
	@BxmOmm_Field(length=8, decimal=0, description="최종DB변경ID", align="left", fill="")
	private String lstDbChgId= "";
	
	
	/**
	 * 최종DB변경일시
	 */
	@ApiModelProperty(
		name = "lstDbChgDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstDbChgDtm")
	@BxmOmm_Field(length=20, decimal=0, description="최종DB변경일시", align="left", fill="")
	private String lstDbChgDtm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadId= false;
	protected final boolean isSet_metMsgCadId(){
		return this.isSet_metMsgCadId;
	}
	private void setIsSet_metMsgCadId(boolean value){
		this.isSet_metMsgCadId= value;
	}
	/**
	 * 모임메시지카드ID
	 */
	@XmlTransient
	public String getMetMsgCadId(){
		return this.metMsgCadId;
	}
	
	/**
	 * 모임메시지카드ID
	 * 
	 * @param metMsgCadId 모임메시지카드ID
	 */
	public void setMetMsgCadId(String metMsgCadId){
		this.metMsgCadId= metMsgCadId;
		this.setIsSet_metMsgCadId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadNm= false;
	protected final boolean isSet_metMsgCadNm(){
		return this.isSet_metMsgCadNm;
	}
	private void setIsSet_metMsgCadNm(boolean value){
		this.isSet_metMsgCadNm= value;
	}
	/**
	 * 모임메시지카드명
	 */
	@XmlTransient
	public String getMetMsgCadNm(){
		return this.metMsgCadNm;
	}
	
	/**
	 * 모임메시지카드명
	 * 
	 * @param metMsgCadNm 모임메시지카드명
	 */
	public void setMetMsgCadNm(String metMsgCadNm){
		this.metMsgCadNm= metMsgCadNm;
		this.setIsSet_metMsgCadNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadTxt= false;
	protected final boolean isSet_metMsgCadTxt(){
		return this.isSet_metMsgCadTxt;
	}
	private void setIsSet_metMsgCadTxt(boolean value){
		this.isSet_metMsgCadTxt= value;
	}
	/**
	 * 모임메시지카드내용
	 */
	@XmlTransient
	public String getMetMsgCadTxt(){
		return this.metMsgCadTxt;
	}
	
	/**
	 * 모임메시지카드내용
	 * 
	 * @param metMsgCadTxt 모임메시지카드내용
	 */
	public void setMetMsgCadTxt(String metMsgCadTxt){
		this.metMsgCadTxt= metMsgCadTxt;
		this.setIsSet_metMsgCadTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadSortSeq= false;
	protected final boolean isSet_metMsgCadSortSeq(){
		return this.isSet_metMsgCadSortSeq;
	}
	private void setIsSet_metMsgCadSortSeq(boolean value){
		this.isSet_metMsgCadSortSeq= value;
	}
	/**
	 * 모임메시지카드정렬순서
	 */
	@XmlTransient
	public Integer getMetMsgCadSortSeq(){
		return this.metMsgCadSortSeq;
	}
	
	/**
	 * 모임메시지카드정렬순서
	 * 
	 * @param metMsgCadSortSeq 모임메시지카드정렬순서
	 */
	public void setMetMsgCadSortSeq(Integer metMsgCadSortSeq){
		this.metMsgCadSortSeq= metMsgCadSortSeq;
		this.setIsSet_metMsgCadSortSeq(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appMarkImgPathTxt= false;
	protected final boolean isSet_appMarkImgPathTxt(){
		return this.isSet_appMarkImgPathTxt;
	}
	private void setIsSet_appMarkImgPathTxt(boolean value){
		this.isSet_appMarkImgPathTxt= value;
	}
	/**
	 * 앱표시이미지경로내용
	 */
	@XmlTransient
	public String getAppMarkImgPathTxt(){
		return this.appMarkImgPathTxt;
	}
	
	/**
	 * 앱표시이미지경로내용
	 * 
	 * @param appMarkImgPathTxt 앱표시이미지경로내용
	 */
	public void setAppMarkImgPathTxt(String appMarkImgPathTxt){
		this.appMarkImgPathTxt= appMarkImgPathTxt;
		this.setIsSet_appMarkImgPathTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_snsMarkImgPathTxt= false;
	protected final boolean isSet_snsMarkImgPathTxt(){
		return this.isSet_snsMarkImgPathTxt;
	}
	private void setIsSet_snsMarkImgPathTxt(boolean value){
		this.isSet_snsMarkImgPathTxt= value;
	}
	/**
	 * SNS표시이미지경로내용
	 */
	@XmlTransient
	public String getSnsMarkImgPathTxt(){
		return this.snsMarkImgPathTxt;
	}
	
	/**
	 * SNS표시이미지경로내용
	 * 
	 * @param snsMarkImgPathTxt SNS표시이미지경로내용
	 */
	public void setSnsMarkImgPathTxt(String snsMarkImgPathTxt){
		this.snsMarkImgPathTxt= snsMarkImgPathTxt;
		this.setIsSet_snsMarkImgPathTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadRgsDtm= false;
	protected final boolean isSet_metMsgCadRgsDtm(){
		return this.isSet_metMsgCadRgsDtm;
	}
	private void setIsSet_metMsgCadRgsDtm(boolean value){
		this.isSet_metMsgCadRgsDtm= value;
	}
	/**
	 * 모임메시지카드등록일시
	 */
	@XmlTransient
	public String getMetMsgCadRgsDtm(){
		return this.metMsgCadRgsDtm;
	}
	
	/**
	 * 모임메시지카드등록일시
	 * 
	 * @param metMsgCadRgsDtm 모임메시지카드등록일시
	 */
	public void setMetMsgCadRgsDtm(String metMsgCadRgsDtm){
		this.metMsgCadRgsDtm= metMsgCadRgsDtm;
		this.setIsSet_metMsgCadRgsDtm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadChgDtm= false;
	protected final boolean isSet_metMsgCadChgDtm(){
		return this.isSet_metMsgCadChgDtm;
	}
	private void setIsSet_metMsgCadChgDtm(boolean value){
		this.isSet_metMsgCadChgDtm= value;
	}
	/**
	 * 모임메시지카드변경일시
	 */
	@XmlTransient
	public String getMetMsgCadChgDtm(){
		return this.metMsgCadChgDtm;
	}
	
	/**
	 * 모임메시지카드변경일시
	 * 
	 * @param metMsgCadChgDtm 모임메시지카드변경일시
	 */
	public void setMetMsgCadChgDtm(String metMsgCadChgDtm){
		this.metMsgCadChgDtm= metMsgCadChgDtm;
		this.setIsSet_metMsgCadChgDtm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadUsgYn= false;
	protected final boolean isSet_metMsgCadUsgYn(){
		return this.isSet_metMsgCadUsgYn;
	}
	private void setIsSet_metMsgCadUsgYn(boolean value){
		this.isSet_metMsgCadUsgYn= value;
	}
	/**
	 * 모임메시지카드사용여부
	 */
	@XmlTransient
	public String getMetMsgCadUsgYn(){
		return this.metMsgCadUsgYn;
	}
	
	/**
	 * 모임메시지카드사용여부
	 * 
	 * @param metMsgCadUsgYn 모임메시지카드사용여부
	 */
	public void setMetMsgCadUsgYn(String metMsgCadUsgYn){
		this.metMsgCadUsgYn= metMsgCadUsgYn;
		this.setIsSet_metMsgCadUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadDisTxt= false;
	protected final boolean isSet_metMsgCadDisTxt(){
		return this.isSet_metMsgCadDisTxt;
	}
	private void setIsSet_metMsgCadDisTxt(boolean value){
		this.isSet_metMsgCadDisTxt= value;
	}
	/**
	 * 모임메시지카드구분내용
	 */
	@XmlTransient
	public String getMetMsgCadDisTxt(){
		return this.metMsgCadDisTxt;
	}
	
	/**
	 * 모임메시지카드구분내용
	 * 
	 * @param metMsgCadDisTxt 모임메시지카드구분내용
	 */
	public void setMetMsgCadDisTxt(String metMsgCadDisTxt){
		this.metMsgCadDisTxt= metMsgCadDisTxt;
		this.setIsSet_metMsgCadDisTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadDelYn= false;
	protected final boolean isSet_metMsgCadDelYn(){
		return this.isSet_metMsgCadDelYn;
	}
	private void setIsSet_metMsgCadDelYn(boolean value){
		this.isSet_metMsgCadDelYn= value;
	}
	/**
	 * 모임메시지카드삭제여부
	 */
	@XmlTransient
	public String getMetMsgCadDelYn(){
		return this.metMsgCadDelYn;
	}
	
	/**
	 * 모임메시지카드삭제여부
	 * 
	 * @param metMsgCadDelYn 모임메시지카드삭제여부
	 */
	public void setMetMsgCadDelYn(String metMsgCadDelYn){
		this.metMsgCadDelYn= metMsgCadDelYn;
		this.setIsSet_metMsgCadDelYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadDscd= false;
	protected final boolean isSet_metMsgCadDscd(){
		return this.isSet_metMsgCadDscd;
	}
	private void setIsSet_metMsgCadDscd(boolean value){
		this.isSet_metMsgCadDscd= value;
	}
	/**
	 * 모임메시지카드구분코드
	 */
	@XmlTransient
	public String getMetMsgCadDscd(){
		return this.metMsgCadDscd;
	}
	
	/**
	 * 모임메시지카드구분코드
	 * 
	 * @param metMsgCadDscd 모임메시지카드구분코드
	 */
	public void setMetMsgCadDscd(String metMsgCadDscd){
		this.metMsgCadDscd= metMsgCadDscd;
		this.setIsSet_metMsgCadDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadRgpeId= false;
	protected final boolean isSet_metMsgCadRgpeId(){
		return this.isSet_metMsgCadRgpeId;
	}
	private void setIsSet_metMsgCadRgpeId(boolean value){
		this.isSet_metMsgCadRgpeId= value;
	}
	/**
	 * 모임메시지카드등록자ID
	 */
	@XmlTransient
	public String getMetMsgCadRgpeId(){
		return this.metMsgCadRgpeId;
	}
	
	/**
	 * 모임메시지카드등록자ID
	 * 
	 * @param metMsgCadRgpeId 모임메시지카드등록자ID
	 */
	public void setMetMsgCadRgpeId(String metMsgCadRgpeId){
		this.metMsgCadRgpeId= metMsgCadRgpeId;
		this.setIsSet_metMsgCadRgpeId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMsgCadAmdpeId= false;
	protected final boolean isSet_metMsgCadAmdpeId(){
		return this.isSet_metMsgCadAmdpeId;
	}
	private void setIsSet_metMsgCadAmdpeId(boolean value){
		this.isSet_metMsgCadAmdpeId= value;
	}
	/**
	 * 모임메시지카드수정자ID
	 */
	@XmlTransient
	public String getMetMsgCadAmdpeId(){
		return this.metMsgCadAmdpeId;
	}
	
	/**
	 * 모임메시지카드수정자ID
	 * 
	 * @param metMsgCadAmdpeId 모임메시지카드수정자ID
	 */
	public void setMetMsgCadAmdpeId(String metMsgCadAmdpeId){
		this.metMsgCadAmdpeId= metMsgCadAmdpeId;
		this.setIsSet_metMsgCadAmdpeId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstDbChgId= false;
	protected final boolean isSet_lstDbChgId(){
		return this.isSet_lstDbChgId;
	}
	private void setIsSet_lstDbChgId(boolean value){
		this.isSet_lstDbChgId= value;
	}
	/**
	 * 최종DB변경ID
	 */
	@XmlTransient
	public String getLstDbChgId(){
		return this.lstDbChgId;
	}
	
	/**
	 * 최종DB변경ID
	 * 
	 * @param lstDbChgId 최종DB변경ID
	 */
	public void setLstDbChgId(String lstDbChgId){
		this.lstDbChgId= lstDbChgId;
		this.setIsSet_lstDbChgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstDbChgDtm= false;
	protected final boolean isSet_lstDbChgDtm(){
		return this.isSet_lstDbChgDtm;
	}
	private void setIsSet_lstDbChgDtm(boolean value){
		this.isSet_lstDbChgDtm= value;
	}
	/**
	 * 최종DB변경일시
	 */
	@XmlTransient
	public String getLstDbChgDtm(){
		return this.lstDbChgDtm;
	}
	
	/**
	 * 최종DB변경일시
	 * 
	 * @param lstDbChgDtm 최종DB변경일시
	 */
	public void setLstDbChgDtm(String lstDbChgDtm){
		this.lstDbChgDtm= lstDbChgDtm;
		this.setIsSet_lstDbChgDtm(true);
	}
				
	@Override
	public MPBMsgCadGridInq_ODT clone(){
		try{
			MPBMsgCadGridInq_ODT object= (MPBMsgCadGridInq_ODT)super.clone();
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
		
		result= prime * result + ((this.metMsgCadId==null)?0:this.metMsgCadId.hashCode());
		result= prime * result + ((this.metMsgCadNm==null)?0:this.metMsgCadNm.hashCode());
		result= prime * result + ((this.metMsgCadTxt==null)?0:this.metMsgCadTxt.hashCode());
		result= prime * result + ((this.metMsgCadSortSeq==null)?0:this.metMsgCadSortSeq.hashCode());
		result= prime * result + ((this.appMarkImgPathTxt==null)?0:this.appMarkImgPathTxt.hashCode());
		result= prime * result + ((this.snsMarkImgPathTxt==null)?0:this.snsMarkImgPathTxt.hashCode());
		result= prime * result + ((this.metMsgCadRgsDtm==null)?0:this.metMsgCadRgsDtm.hashCode());
		result= prime * result + ((this.metMsgCadChgDtm==null)?0:this.metMsgCadChgDtm.hashCode());
		result= prime * result + ((this.metMsgCadUsgYn==null)?0:this.metMsgCadUsgYn.hashCode());
		result= prime * result + ((this.metMsgCadDisTxt==null)?0:this.metMsgCadDisTxt.hashCode());
		result= prime * result + ((this.metMsgCadDelYn==null)?0:this.metMsgCadDelYn.hashCode());
		result= prime * result + ((this.metMsgCadDscd==null)?0:this.metMsgCadDscd.hashCode());
		result= prime * result + ((this.metMsgCadRgpeId==null)?0:this.metMsgCadRgpeId.hashCode());
		result= prime * result + ((this.metMsgCadAmdpeId==null)?0:this.metMsgCadAmdpeId.hashCode());
		result= prime * result + ((this.lstDbChgId==null)?0:this.lstDbChgId.hashCode());
		result= prime * result + ((this.lstDbChgDtm==null)?0:this.lstDbChgDtm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMsgCadGridInq_ODT other= (MPBMsgCadGridInq_ODT)obj;
		{
			Object _metMsgCadId= getMetMsgCadId();
			Object __metMsgCadId= other.getMetMsgCadId();
			if ( _metMsgCadId== null ) { if ( __metMsgCadId!= null ) return false; }
			else if ( !_metMsgCadId.equals(__metMsgCadId) ) return false;
		}
		{
			Object _metMsgCadNm= getMetMsgCadNm();
			Object __metMsgCadNm= other.getMetMsgCadNm();
			if ( _metMsgCadNm== null ) { if ( __metMsgCadNm!= null ) return false; }
			else if ( !_metMsgCadNm.equals(__metMsgCadNm) ) return false;
		}
		{
			Object _metMsgCadTxt= getMetMsgCadTxt();
			Object __metMsgCadTxt= other.getMetMsgCadTxt();
			if ( _metMsgCadTxt== null ) { if ( __metMsgCadTxt!= null ) return false; }
			else if ( !_metMsgCadTxt.equals(__metMsgCadTxt) ) return false;
		}
		{
			Object _metMsgCadSortSeq= getMetMsgCadSortSeq();
			Object __metMsgCadSortSeq= other.getMetMsgCadSortSeq();
			if ( _metMsgCadSortSeq== null ) { if ( __metMsgCadSortSeq!= null ) return false; }
			else if ( !_metMsgCadSortSeq.equals(__metMsgCadSortSeq) ) return false;
		}
		{
			Object _appMarkImgPathTxt= getAppMarkImgPathTxt();
			Object __appMarkImgPathTxt= other.getAppMarkImgPathTxt();
			if ( _appMarkImgPathTxt== null ) { if ( __appMarkImgPathTxt!= null ) return false; }
			else if ( !_appMarkImgPathTxt.equals(__appMarkImgPathTxt) ) return false;
		}
		{
			Object _snsMarkImgPathTxt= getSnsMarkImgPathTxt();
			Object __snsMarkImgPathTxt= other.getSnsMarkImgPathTxt();
			if ( _snsMarkImgPathTxt== null ) { if ( __snsMarkImgPathTxt!= null ) return false; }
			else if ( !_snsMarkImgPathTxt.equals(__snsMarkImgPathTxt) ) return false;
		}
		{
			Object _metMsgCadRgsDtm= getMetMsgCadRgsDtm();
			Object __metMsgCadRgsDtm= other.getMetMsgCadRgsDtm();
			if ( _metMsgCadRgsDtm== null ) { if ( __metMsgCadRgsDtm!= null ) return false; }
			else if ( !_metMsgCadRgsDtm.equals(__metMsgCadRgsDtm) ) return false;
		}
		{
			Object _metMsgCadChgDtm= getMetMsgCadChgDtm();
			Object __metMsgCadChgDtm= other.getMetMsgCadChgDtm();
			if ( _metMsgCadChgDtm== null ) { if ( __metMsgCadChgDtm!= null ) return false; }
			else if ( !_metMsgCadChgDtm.equals(__metMsgCadChgDtm) ) return false;
		}
		{
			Object _metMsgCadUsgYn= getMetMsgCadUsgYn();
			Object __metMsgCadUsgYn= other.getMetMsgCadUsgYn();
			if ( _metMsgCadUsgYn== null ) { if ( __metMsgCadUsgYn!= null ) return false; }
			else if ( !_metMsgCadUsgYn.equals(__metMsgCadUsgYn) ) return false;
		}
		{
			Object _metMsgCadDisTxt= getMetMsgCadDisTxt();
			Object __metMsgCadDisTxt= other.getMetMsgCadDisTxt();
			if ( _metMsgCadDisTxt== null ) { if ( __metMsgCadDisTxt!= null ) return false; }
			else if ( !_metMsgCadDisTxt.equals(__metMsgCadDisTxt) ) return false;
		}
		{
			Object _metMsgCadDelYn= getMetMsgCadDelYn();
			Object __metMsgCadDelYn= other.getMetMsgCadDelYn();
			if ( _metMsgCadDelYn== null ) { if ( __metMsgCadDelYn!= null ) return false; }
			else if ( !_metMsgCadDelYn.equals(__metMsgCadDelYn) ) return false;
		}
		{
			Object _metMsgCadDscd= getMetMsgCadDscd();
			Object __metMsgCadDscd= other.getMetMsgCadDscd();
			if ( _metMsgCadDscd== null ) { if ( __metMsgCadDscd!= null ) return false; }
			else if ( !_metMsgCadDscd.equals(__metMsgCadDscd) ) return false;
		}
		{
			Object _metMsgCadRgpeId= getMetMsgCadRgpeId();
			Object __metMsgCadRgpeId= other.getMetMsgCadRgpeId();
			if ( _metMsgCadRgpeId== null ) { if ( __metMsgCadRgpeId!= null ) return false; }
			else if ( !_metMsgCadRgpeId.equals(__metMsgCadRgpeId) ) return false;
		}
		{
			Object _metMsgCadAmdpeId= getMetMsgCadAmdpeId();
			Object __metMsgCadAmdpeId= other.getMetMsgCadAmdpeId();
			if ( _metMsgCadAmdpeId== null ) { if ( __metMsgCadAmdpeId!= null ) return false; }
			else if ( !_metMsgCadAmdpeId.equals(__metMsgCadAmdpeId) ) return false;
		}
		{
			Object _lstDbChgId= getLstDbChgId();
			Object __lstDbChgId= other.getLstDbChgId();
			if ( _lstDbChgId== null ) { if ( __lstDbChgId!= null ) return false; }
			else if ( !_lstDbChgId.equals(__lstDbChgId) ) return false;
		}
		{
			Object _lstDbChgDtm= getLstDbChgDtm();
			Object __lstDbChgDtm= other.getLstDbChgDtm();
			if ( _lstDbChgDtm== null ) { if ( __lstDbChgDtm!= null ) return false; }
			else if ( !_lstDbChgDtm.equals(__lstDbChgDtm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMsgCadGridInq_ODT.class.getName()).append(":\n");
		sb.append("\tmetMsgCadId: ");
		sb.append(metMsgCadId==null?"null":getMetMsgCadId());
		sb.append("\n");
		sb.append("\tmetMsgCadNm: ");
		sb.append(metMsgCadNm==null?"null":getMetMsgCadNm());
		sb.append("\n");
		sb.append("\tmetMsgCadTxt: ");
		sb.append(metMsgCadTxt==null?"null":getMetMsgCadTxt());
		sb.append("\n");
		sb.append("\tmetMsgCadSortSeq: ");
		sb.append(metMsgCadSortSeq==null?"null":getMetMsgCadSortSeq());
		sb.append("\n");
		sb.append("\tappMarkImgPathTxt: ");
		sb.append(appMarkImgPathTxt==null?"null":getAppMarkImgPathTxt());
		sb.append("\n");
		sb.append("\tsnsMarkImgPathTxt: ");
		sb.append(snsMarkImgPathTxt==null?"null":getSnsMarkImgPathTxt());
		sb.append("\n");
		sb.append("\tmetMsgCadRgsDtm: ");
		sb.append(metMsgCadRgsDtm==null?"null":getMetMsgCadRgsDtm());
		sb.append("\n");
		sb.append("\tmetMsgCadChgDtm: ");
		sb.append(metMsgCadChgDtm==null?"null":getMetMsgCadChgDtm());
		sb.append("\n");
		sb.append("\tmetMsgCadUsgYn: ");
		sb.append(metMsgCadUsgYn==null?"null":getMetMsgCadUsgYn());
		sb.append("\n");
		sb.append("\tmetMsgCadDisTxt: ");
		sb.append(metMsgCadDisTxt==null?"null":getMetMsgCadDisTxt());
		sb.append("\n");
		sb.append("\tmetMsgCadDelYn: ");
		sb.append(metMsgCadDelYn==null?"null":getMetMsgCadDelYn());
		sb.append("\n");
		sb.append("\tmetMsgCadDscd: ");
		sb.append(metMsgCadDscd==null?"null":getMetMsgCadDscd());
		sb.append("\n");
		sb.append("\tmetMsgCadRgpeId: ");
		sb.append(metMsgCadRgpeId==null?"null":getMetMsgCadRgpeId());
		sb.append("\n");
		sb.append("\tmetMsgCadAmdpeId: ");
		sb.append(metMsgCadAmdpeId==null?"null":getMetMsgCadAmdpeId());
		sb.append("\n");
		sb.append("\tlstDbChgId: ");
		sb.append(lstDbChgId==null?"null":getLstDbChgId());
		sb.append("\n");
		sb.append("\tlstDbChgDtm: ");
		sb.append(lstDbChgDtm==null?"null":getLstDbChgDtm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* metMsgCadId */
		messageLen+= 50; /* metMsgCadNm */
		messageLen+= 500; /* metMsgCadTxt */
		messageLen+= 6; /* metMsgCadSortSeq */
		messageLen+= 500; /* appMarkImgPathTxt */
		messageLen+= 500; /* snsMarkImgPathTxt */
		messageLen+= 20; /* metMsgCadRgsDtm */
		messageLen+= 20; /* metMsgCadChgDtm */
		messageLen+= 1; /* metMsgCadUsgYn */
		messageLen+= 20; /* metMsgCadDisTxt */
		messageLen+= 1; /* metMsgCadDelYn */
		messageLen+= 2; /* metMsgCadDscd */
		messageLen+= 20; /* metMsgCadRgpeId */
		messageLen+= 20; /* metMsgCadAmdpeId */
		messageLen+= 8; /* lstDbChgId */
		messageLen+= 20; /* lstDbChgDtm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMsgCadId");
		list.add("metMsgCadNm");
		list.add("metMsgCadTxt");
		list.add("metMsgCadSortSeq");
		list.add("appMarkImgPathTxt");
		list.add("snsMarkImgPathTxt");
		list.add("metMsgCadRgsDtm");
		list.add("metMsgCadChgDtm");
		list.add("metMsgCadUsgYn");
		list.add("metMsgCadDisTxt");
		list.add("metMsgCadDelYn");
		list.add("metMsgCadDscd");
		list.add("metMsgCadRgpeId");
		list.add("metMsgCadAmdpeId");
		list.add("lstDbChgId");
		list.add("lstDbChgDtm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMsgCadId", get("metMsgCadId"));
		map.put("metMsgCadNm", get("metMsgCadNm"));
		map.put("metMsgCadTxt", get("metMsgCadTxt"));
		map.put("metMsgCadSortSeq", get("metMsgCadSortSeq"));
		map.put("appMarkImgPathTxt", get("appMarkImgPathTxt"));
		map.put("snsMarkImgPathTxt", get("snsMarkImgPathTxt"));
		map.put("metMsgCadRgsDtm", get("metMsgCadRgsDtm"));
		map.put("metMsgCadChgDtm", get("metMsgCadChgDtm"));
		map.put("metMsgCadUsgYn", get("metMsgCadUsgYn"));
		map.put("metMsgCadDisTxt", get("metMsgCadDisTxt"));
		map.put("metMsgCadDelYn", get("metMsgCadDelYn"));
		map.put("metMsgCadDscd", get("metMsgCadDscd"));
		map.put("metMsgCadRgpeId", get("metMsgCadRgpeId"));
		map.put("metMsgCadAmdpeId", get("metMsgCadAmdpeId"));
		map.put("lstDbChgId", get("lstDbChgId"));
		map.put("lstDbChgDtm", get("lstDbChgDtm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1423700356:/* metMsgCadId */
			return getMetMsgCadId();
		case -1423700192:/* metMsgCadNm */
			return getMetMsgCadNm();
		case -1185026769:/* metMsgCadTxt */
			return getMetMsgCadTxt();
		case -1928481504:/* metMsgCadSortSeq */
			return getMetMsgCadSortSeq();
		case 1374914038:/* appMarkImgPathTxt */
			return getAppMarkImgPathTxt();
		case 1213441293:/* snsMarkImgPathTxt */
			return getSnsMarkImgPathTxt();
		case 1425778944:/* metMsgCadRgsDtm */
			return getMetMsgCadRgsDtm();
		case 996907708:/* metMsgCadChgDtm */
			return getMetMsgCadChgDtm();
		case -643626627:/* metMsgCadUsgYn */
			return getMetMsgCadUsgYn();
		case 1026833379:/* metMsgCadDisTxt */
			return getMetMsgCadDisTxt();
		case -659738753:/* metMsgCadDelYn */
			return getMetMsgCadDelYn();
		case 1918393937:/* metMsgCadDscd */
			return getMetMsgCadDscd();
		case 1425719942:/* metMsgCadRgpeId */
			return getMetMsgCadRgpeId();
		case -793968921:/* metMsgCadAmdpeId */
			return getMetMsgCadAmdpeId();
		case 1946521330:/* lstDbChgId */
			return getLstDbChgId();
		case 212614886:/* lstDbChgDtm */
			return getLstDbChgDtm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1423700356:/* metMsgCadId */
			setMetMsgCadId((String)value);
			break;
		case -1423700192:/* metMsgCadNm */
			setMetMsgCadNm((String)value);
			break;
		case -1185026769:/* metMsgCadTxt */
			setMetMsgCadTxt((String)value);
			break;
		case -1928481504:/* metMsgCadSortSeq */
			setMetMsgCadSortSeq((Integer)value);
			break;
		case 1374914038:/* appMarkImgPathTxt */
			setAppMarkImgPathTxt((String)value);
			break;
		case 1213441293:/* snsMarkImgPathTxt */
			setSnsMarkImgPathTxt((String)value);
			break;
		case 1425778944:/* metMsgCadRgsDtm */
			setMetMsgCadRgsDtm((String)value);
			break;
		case 996907708:/* metMsgCadChgDtm */
			setMetMsgCadChgDtm((String)value);
			break;
		case -643626627:/* metMsgCadUsgYn */
			setMetMsgCadUsgYn((String)value);
			break;
		case 1026833379:/* metMsgCadDisTxt */
			setMetMsgCadDisTxt((String)value);
			break;
		case -659738753:/* metMsgCadDelYn */
			setMetMsgCadDelYn((String)value);
			break;
		case 1918393937:/* metMsgCadDscd */
			setMetMsgCadDscd((String)value);
			break;
		case 1425719942:/* metMsgCadRgpeId */
			setMetMsgCadRgpeId((String)value);
			break;
		case -793968921:/* metMsgCadAmdpeId */
			setMetMsgCadAmdpeId((String)value);
			break;
		case 1946521330:/* lstDbChgId */
			setLstDbChgId((String)value);
			break;
		case 212614886:/* lstDbChgDtm */
			setLstDbChgDtm((String)value);
			break;
		default:
			break;
		}
	}
	
}
