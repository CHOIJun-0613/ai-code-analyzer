/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.dto;

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
	"dpsRgsChgItcd", "dpsRgsChgDtcdNm", "dpsRgsChgDtcd", "dpsItmAtrbDscd", "dpsItmAtrbDscdNm", "dpsItmChgLen", "bfchDpsRgsChgDtcdTxt", "dpsRgsChgDtcdTxt", "dpsItmMndYn", "dpsItmBscTxt", "dpsItmHdnYn", "dpsItmMarkSeq", "dpsItmDmnNm", "dpsItmGrcd", "dpsRefcLdgNm"
	, "dpsRefcLdgItmNm", "dpsRgsChgHelpTxt", "etcRmrkTxt"
}, name="MNPMnyPinBscMngUpdateMnpChidAcno_DTO")
@XmlRootElement(name="MNPMnyPinBscMngUpdateMnpChidAcno_DTO")
@BxmCategory(logicalName="머니클립.자.계좌.수정.컴포넌트.공통.출력IO", description="") 
public class MNPMnyPinBscMngUpdateMnpChidAcno_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -596127353L;
	
	
	
	/**
	 * 수신등록변경항목코드
	 */
	@ApiModelProperty(
		name = "dpsRgsChgItcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRgsChgItcd")
	@BxmOmm_Field(length=6, decimal=0, description="수신등록변경항목코드", align="left", fill="")
	private String dpsRgsChgItcd= "";
	
	
	/**
	 * 수신등록변경상세코드명
	 */
	@ApiModelProperty(
		name = "dpsRgsChgDtcdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRgsChgDtcdNm")
	@BxmOmm_Field(length=60, decimal=0, description="수신등록변경상세코드명", align="left", fill="")
	private String dpsRgsChgDtcdNm= "";
	
	
	/**
	 * 수신등록변경상세코드
	 */
	@ApiModelProperty(
		name = "dpsRgsChgDtcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRgsChgDtcd")
	@BxmOmm_Field(length=3, decimal=0, description="수신등록변경상세코드", align="left", fill="")
	private String dpsRgsChgDtcd= "";
	
	
	/**
	 * 수신항목속성구분코드
	 */
	@ApiModelProperty(
		name = "dpsItmAtrbDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsItmAtrbDscd")
	@BxmOmm_Field(length=2, decimal=0, description="수신항목속성구분코드", align="left", fill="")
	private String dpsItmAtrbDscd= "";
	
	
	/**
	 * 수신항목속성구분코드명
	 */
	@ApiModelProperty(
		name = "dpsItmAtrbDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsItmAtrbDscdNm")
	@BxmOmm_Field(length=60, decimal=0, description="수신항목속성구분코드명", align="left", fill="")
	private String dpsItmAtrbDscdNm= "";
	
	
	/**
	 * 수신항목변경길이
	 */
	@ApiModelProperty(
		name = "dpsItmChgLen"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("dpsItmChgLen")
	@BxmOmm_Field(length=3, decimal=0, description="수신항목변경길이", align="right", fill="0")
	private Integer dpsItmChgLen= 0;
	
	
	/**
	 * 변경전수신등록변경상세코드내용
	 */
	@ApiModelProperty(
		name = "bfchDpsRgsChgDtcdTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bfchDpsRgsChgDtcdTxt")
	@BxmOmm_Field(length=80, decimal=0, description="변경전수신등록변경상세코드내용", align="left", fill="")
	private String bfchDpsRgsChgDtcdTxt= "";
	
	
	/**
	 * 수신등록변경상세코드내용
	 */
	@ApiModelProperty(
		name = "dpsRgsChgDtcdTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRgsChgDtcdTxt")
	@BxmOmm_Field(length=80, decimal=0, description="수신등록변경상세코드내용", align="left", fill="")
	private String dpsRgsChgDtcdTxt= "";
	
	
	/**
	 * 수신항목필수여부
	 */
	@ApiModelProperty(
		name = "dpsItmMndYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsItmMndYn")
	@BxmOmm_Field(length=1, decimal=0, description="수신항목필수여부", align="left", fill="")
	private String dpsItmMndYn= "";
	
	
	/**
	 * 수신항목기본내용
	 */
	@ApiModelProperty(
		name = "dpsItmBscTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsItmBscTxt")
	@BxmOmm_Field(length=80, decimal=0, description="수신항목기본내용", align="left", fill="")
	private String dpsItmBscTxt= "";
	
	
	/**
	 * 수신항목숨김여부
	 */
	@ApiModelProperty(
		name = "dpsItmHdnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsItmHdnYn")
	@BxmOmm_Field(length=1, decimal=0, description="수신항목숨김여부", align="left", fill="")
	private String dpsItmHdnYn= "";
	
	
	/**
	 * 수신항목표시순서
	 */
	@ApiModelProperty(
		name = "dpsItmMarkSeq"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("dpsItmMarkSeq")
	@BxmOmm_Field(length=3, decimal=0, description="수신항목표시순서", align="right", fill="0")
	private Integer dpsItmMarkSeq= 0;
	
	
	/**
	 * 수신항목도메인명
	 */
	@ApiModelProperty(
		name = "dpsItmDmnNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsItmDmnNm")
	@BxmOmm_Field(length=70, decimal=0, description="수신항목도메인명", align="left", fill="")
	private String dpsItmDmnNm= "";
	
	
	/**
	 * 수신항목그룹코드
	 */
	@ApiModelProperty(
		name = "dpsItmGrcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsItmGrcd")
	@BxmOmm_Field(length=2, decimal=0, description="수신항목그룹코드", align="left", fill="")
	private String dpsItmGrcd= "";
	
	
	/**
	 * 수신참조원장명
	 */
	@ApiModelProperty(
		name = "dpsRefcLdgNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRefcLdgNm")
	@BxmOmm_Field(length=20, decimal=0, description="수신참조원장명", align="left", fill="")
	private String dpsRefcLdgNm= "";
	
	
	/**
	 * 수신참조원장항목명
	 */
	@ApiModelProperty(
		name = "dpsRefcLdgItmNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRefcLdgItmNm")
	@BxmOmm_Field(length=50, decimal=0, description="수신참조원장항목명", align="left", fill="")
	private String dpsRefcLdgItmNm= "";
	
	
	/**
	 * 수신등록변경도움말내용
	 */
	@ApiModelProperty(
		name = "dpsRgsChgHelpTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRgsChgHelpTxt")
	@BxmOmm_Field(length=500, decimal=0, description="수신등록변경도움말내용", align="left", fill="")
	private String dpsRgsChgHelpTxt= "";
	
	
	/**
	 * 기타비고내용
	 */
	@ApiModelProperty(
		name = "etcRmrkTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("etcRmrkTxt")
	@BxmOmm_Field(length=500, decimal=0, description="기타비고내용", align="left", fill="")
	private String etcRmrkTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRgsChgItcd= false;
	protected final boolean isSet_dpsRgsChgItcd(){
		return this.isSet_dpsRgsChgItcd;
	}
	private void setIsSet_dpsRgsChgItcd(boolean value){
		this.isSet_dpsRgsChgItcd= value;
	}
	/**
	 * 수신등록변경항목코드
	 */
	@XmlTransient
	public String getDpsRgsChgItcd(){
		return this.dpsRgsChgItcd;
	}
	
	/**
	 * 수신등록변경항목코드
	 * 
	 * @param dpsRgsChgItcd 수신등록변경항목코드
	 */
	public void setDpsRgsChgItcd(String dpsRgsChgItcd){
		this.dpsRgsChgItcd= dpsRgsChgItcd;
		this.setIsSet_dpsRgsChgItcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRgsChgDtcdNm= false;
	protected final boolean isSet_dpsRgsChgDtcdNm(){
		return this.isSet_dpsRgsChgDtcdNm;
	}
	private void setIsSet_dpsRgsChgDtcdNm(boolean value){
		this.isSet_dpsRgsChgDtcdNm= value;
	}
	/**
	 * 수신등록변경상세코드명
	 */
	@XmlTransient
	public String getDpsRgsChgDtcdNm(){
		return this.dpsRgsChgDtcdNm;
	}
	
	/**
	 * 수신등록변경상세코드명
	 * 
	 * @param dpsRgsChgDtcdNm 수신등록변경상세코드명
	 */
	public void setDpsRgsChgDtcdNm(String dpsRgsChgDtcdNm){
		this.dpsRgsChgDtcdNm= dpsRgsChgDtcdNm;
		this.setIsSet_dpsRgsChgDtcdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRgsChgDtcd= false;
	protected final boolean isSet_dpsRgsChgDtcd(){
		return this.isSet_dpsRgsChgDtcd;
	}
	private void setIsSet_dpsRgsChgDtcd(boolean value){
		this.isSet_dpsRgsChgDtcd= value;
	}
	/**
	 * 수신등록변경상세코드
	 */
	@XmlTransient
	public String getDpsRgsChgDtcd(){
		return this.dpsRgsChgDtcd;
	}
	
	/**
	 * 수신등록변경상세코드
	 * 
	 * @param dpsRgsChgDtcd 수신등록변경상세코드
	 */
	public void setDpsRgsChgDtcd(String dpsRgsChgDtcd){
		this.dpsRgsChgDtcd= dpsRgsChgDtcd;
		this.setIsSet_dpsRgsChgDtcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsItmAtrbDscd= false;
	protected final boolean isSet_dpsItmAtrbDscd(){
		return this.isSet_dpsItmAtrbDscd;
	}
	private void setIsSet_dpsItmAtrbDscd(boolean value){
		this.isSet_dpsItmAtrbDscd= value;
	}
	/**
	 * 수신항목속성구분코드
	 */
	@XmlTransient
	public String getDpsItmAtrbDscd(){
		return this.dpsItmAtrbDscd;
	}
	
	/**
	 * 수신항목속성구분코드
	 * 
	 * @param dpsItmAtrbDscd 수신항목속성구분코드
	 */
	public void setDpsItmAtrbDscd(String dpsItmAtrbDscd){
		this.dpsItmAtrbDscd= dpsItmAtrbDscd;
		this.setIsSet_dpsItmAtrbDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsItmAtrbDscdNm= false;
	protected final boolean isSet_dpsItmAtrbDscdNm(){
		return this.isSet_dpsItmAtrbDscdNm;
	}
	private void setIsSet_dpsItmAtrbDscdNm(boolean value){
		this.isSet_dpsItmAtrbDscdNm= value;
	}
	/**
	 * 수신항목속성구분코드명
	 */
	@XmlTransient
	public String getDpsItmAtrbDscdNm(){
		return this.dpsItmAtrbDscdNm;
	}
	
	/**
	 * 수신항목속성구분코드명
	 * 
	 * @param dpsItmAtrbDscdNm 수신항목속성구분코드명
	 */
	public void setDpsItmAtrbDscdNm(String dpsItmAtrbDscdNm){
		this.dpsItmAtrbDscdNm= dpsItmAtrbDscdNm;
		this.setIsSet_dpsItmAtrbDscdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsItmChgLen= false;
	protected final boolean isSet_dpsItmChgLen(){
		return this.isSet_dpsItmChgLen;
	}
	private void setIsSet_dpsItmChgLen(boolean value){
		this.isSet_dpsItmChgLen= value;
	}
	/**
	 * 수신항목변경길이
	 */
	@XmlTransient
	public Integer getDpsItmChgLen(){
		return this.dpsItmChgLen;
	}
	
	/**
	 * 수신항목변경길이
	 * 
	 * @param dpsItmChgLen 수신항목변경길이
	 */
	public void setDpsItmChgLen(Integer dpsItmChgLen){
		this.dpsItmChgLen= dpsItmChgLen;
		this.setIsSet_dpsItmChgLen(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bfchDpsRgsChgDtcdTxt= false;
	protected final boolean isSet_bfchDpsRgsChgDtcdTxt(){
		return this.isSet_bfchDpsRgsChgDtcdTxt;
	}
	private void setIsSet_bfchDpsRgsChgDtcdTxt(boolean value){
		this.isSet_bfchDpsRgsChgDtcdTxt= value;
	}
	/**
	 * 변경전수신등록변경상세코드내용
	 */
	@XmlTransient
	public String getBfchDpsRgsChgDtcdTxt(){
		return this.bfchDpsRgsChgDtcdTxt;
	}
	
	/**
	 * 변경전수신등록변경상세코드내용
	 * 
	 * @param bfchDpsRgsChgDtcdTxt 변경전수신등록변경상세코드내용
	 */
	public void setBfchDpsRgsChgDtcdTxt(String bfchDpsRgsChgDtcdTxt){
		this.bfchDpsRgsChgDtcdTxt= bfchDpsRgsChgDtcdTxt;
		this.setIsSet_bfchDpsRgsChgDtcdTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRgsChgDtcdTxt= false;
	protected final boolean isSet_dpsRgsChgDtcdTxt(){
		return this.isSet_dpsRgsChgDtcdTxt;
	}
	private void setIsSet_dpsRgsChgDtcdTxt(boolean value){
		this.isSet_dpsRgsChgDtcdTxt= value;
	}
	/**
	 * 수신등록변경상세코드내용
	 */
	@XmlTransient
	public String getDpsRgsChgDtcdTxt(){
		return this.dpsRgsChgDtcdTxt;
	}
	
	/**
	 * 수신등록변경상세코드내용
	 * 
	 * @param dpsRgsChgDtcdTxt 수신등록변경상세코드내용
	 */
	public void setDpsRgsChgDtcdTxt(String dpsRgsChgDtcdTxt){
		this.dpsRgsChgDtcdTxt= dpsRgsChgDtcdTxt;
		this.setIsSet_dpsRgsChgDtcdTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsItmMndYn= false;
	protected final boolean isSet_dpsItmMndYn(){
		return this.isSet_dpsItmMndYn;
	}
	private void setIsSet_dpsItmMndYn(boolean value){
		this.isSet_dpsItmMndYn= value;
	}
	/**
	 * 수신항목필수여부
	 */
	@XmlTransient
	public String getDpsItmMndYn(){
		return this.dpsItmMndYn;
	}
	
	/**
	 * 수신항목필수여부
	 * 
	 * @param dpsItmMndYn 수신항목필수여부
	 */
	public void setDpsItmMndYn(String dpsItmMndYn){
		this.dpsItmMndYn= dpsItmMndYn;
		this.setIsSet_dpsItmMndYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsItmBscTxt= false;
	protected final boolean isSet_dpsItmBscTxt(){
		return this.isSet_dpsItmBscTxt;
	}
	private void setIsSet_dpsItmBscTxt(boolean value){
		this.isSet_dpsItmBscTxt= value;
	}
	/**
	 * 수신항목기본내용
	 */
	@XmlTransient
	public String getDpsItmBscTxt(){
		return this.dpsItmBscTxt;
	}
	
	/**
	 * 수신항목기본내용
	 * 
	 * @param dpsItmBscTxt 수신항목기본내용
	 */
	public void setDpsItmBscTxt(String dpsItmBscTxt){
		this.dpsItmBscTxt= dpsItmBscTxt;
		this.setIsSet_dpsItmBscTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsItmHdnYn= false;
	protected final boolean isSet_dpsItmHdnYn(){
		return this.isSet_dpsItmHdnYn;
	}
	private void setIsSet_dpsItmHdnYn(boolean value){
		this.isSet_dpsItmHdnYn= value;
	}
	/**
	 * 수신항목숨김여부
	 */
	@XmlTransient
	public String getDpsItmHdnYn(){
		return this.dpsItmHdnYn;
	}
	
	/**
	 * 수신항목숨김여부
	 * 
	 * @param dpsItmHdnYn 수신항목숨김여부
	 */
	public void setDpsItmHdnYn(String dpsItmHdnYn){
		this.dpsItmHdnYn= dpsItmHdnYn;
		this.setIsSet_dpsItmHdnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsItmMarkSeq= false;
	protected final boolean isSet_dpsItmMarkSeq(){
		return this.isSet_dpsItmMarkSeq;
	}
	private void setIsSet_dpsItmMarkSeq(boolean value){
		this.isSet_dpsItmMarkSeq= value;
	}
	/**
	 * 수신항목표시순서
	 */
	@XmlTransient
	public Integer getDpsItmMarkSeq(){
		return this.dpsItmMarkSeq;
	}
	
	/**
	 * 수신항목표시순서
	 * 
	 * @param dpsItmMarkSeq 수신항목표시순서
	 */
	public void setDpsItmMarkSeq(Integer dpsItmMarkSeq){
		this.dpsItmMarkSeq= dpsItmMarkSeq;
		this.setIsSet_dpsItmMarkSeq(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsItmDmnNm= false;
	protected final boolean isSet_dpsItmDmnNm(){
		return this.isSet_dpsItmDmnNm;
	}
	private void setIsSet_dpsItmDmnNm(boolean value){
		this.isSet_dpsItmDmnNm= value;
	}
	/**
	 * 수신항목도메인명
	 */
	@XmlTransient
	public String getDpsItmDmnNm(){
		return this.dpsItmDmnNm;
	}
	
	/**
	 * 수신항목도메인명
	 * 
	 * @param dpsItmDmnNm 수신항목도메인명
	 */
	public void setDpsItmDmnNm(String dpsItmDmnNm){
		this.dpsItmDmnNm= dpsItmDmnNm;
		this.setIsSet_dpsItmDmnNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsItmGrcd= false;
	protected final boolean isSet_dpsItmGrcd(){
		return this.isSet_dpsItmGrcd;
	}
	private void setIsSet_dpsItmGrcd(boolean value){
		this.isSet_dpsItmGrcd= value;
	}
	/**
	 * 수신항목그룹코드
	 */
	@XmlTransient
	public String getDpsItmGrcd(){
		return this.dpsItmGrcd;
	}
	
	/**
	 * 수신항목그룹코드
	 * 
	 * @param dpsItmGrcd 수신항목그룹코드
	 */
	public void setDpsItmGrcd(String dpsItmGrcd){
		this.dpsItmGrcd= dpsItmGrcd;
		this.setIsSet_dpsItmGrcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRefcLdgNm= false;
	protected final boolean isSet_dpsRefcLdgNm(){
		return this.isSet_dpsRefcLdgNm;
	}
	private void setIsSet_dpsRefcLdgNm(boolean value){
		this.isSet_dpsRefcLdgNm= value;
	}
	/**
	 * 수신참조원장명
	 */
	@XmlTransient
	public String getDpsRefcLdgNm(){
		return this.dpsRefcLdgNm;
	}
	
	/**
	 * 수신참조원장명
	 * 
	 * @param dpsRefcLdgNm 수신참조원장명
	 */
	public void setDpsRefcLdgNm(String dpsRefcLdgNm){
		this.dpsRefcLdgNm= dpsRefcLdgNm;
		this.setIsSet_dpsRefcLdgNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRefcLdgItmNm= false;
	protected final boolean isSet_dpsRefcLdgItmNm(){
		return this.isSet_dpsRefcLdgItmNm;
	}
	private void setIsSet_dpsRefcLdgItmNm(boolean value){
		this.isSet_dpsRefcLdgItmNm= value;
	}
	/**
	 * 수신참조원장항목명
	 */
	@XmlTransient
	public String getDpsRefcLdgItmNm(){
		return this.dpsRefcLdgItmNm;
	}
	
	/**
	 * 수신참조원장항목명
	 * 
	 * @param dpsRefcLdgItmNm 수신참조원장항목명
	 */
	public void setDpsRefcLdgItmNm(String dpsRefcLdgItmNm){
		this.dpsRefcLdgItmNm= dpsRefcLdgItmNm;
		this.setIsSet_dpsRefcLdgItmNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRgsChgHelpTxt= false;
	protected final boolean isSet_dpsRgsChgHelpTxt(){
		return this.isSet_dpsRgsChgHelpTxt;
	}
	private void setIsSet_dpsRgsChgHelpTxt(boolean value){
		this.isSet_dpsRgsChgHelpTxt= value;
	}
	/**
	 * 수신등록변경도움말내용
	 */
	@XmlTransient
	public String getDpsRgsChgHelpTxt(){
		return this.dpsRgsChgHelpTxt;
	}
	
	/**
	 * 수신등록변경도움말내용
	 * 
	 * @param dpsRgsChgHelpTxt 수신등록변경도움말내용
	 */
	public void setDpsRgsChgHelpTxt(String dpsRgsChgHelpTxt){
		this.dpsRgsChgHelpTxt= dpsRgsChgHelpTxt;
		this.setIsSet_dpsRgsChgHelpTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_etcRmrkTxt= false;
	protected final boolean isSet_etcRmrkTxt(){
		return this.isSet_etcRmrkTxt;
	}
	private void setIsSet_etcRmrkTxt(boolean value){
		this.isSet_etcRmrkTxt= value;
	}
	/**
	 * 기타비고내용
	 */
	@XmlTransient
	public String getEtcRmrkTxt(){
		return this.etcRmrkTxt;
	}
	
	/**
	 * 기타비고내용
	 * 
	 * @param etcRmrkTxt 기타비고내용
	 */
	public void setEtcRmrkTxt(String etcRmrkTxt){
		this.etcRmrkTxt= etcRmrkTxt;
		this.setIsSet_etcRmrkTxt(true);
	}
				
	@Override
	public MNPMnyPinBscMngUpdateMnpChidAcno_DTO clone(){
		try{
			MNPMnyPinBscMngUpdateMnpChidAcno_DTO object= (MNPMnyPinBscMngUpdateMnpChidAcno_DTO)super.clone();
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
		
		result= prime * result + ((this.dpsRgsChgItcd==null)?0:this.dpsRgsChgItcd.hashCode());
		result= prime * result + ((this.dpsRgsChgDtcdNm==null)?0:this.dpsRgsChgDtcdNm.hashCode());
		result= prime * result + ((this.dpsRgsChgDtcd==null)?0:this.dpsRgsChgDtcd.hashCode());
		result= prime * result + ((this.dpsItmAtrbDscd==null)?0:this.dpsItmAtrbDscd.hashCode());
		result= prime * result + ((this.dpsItmAtrbDscdNm==null)?0:this.dpsItmAtrbDscdNm.hashCode());
		result= prime * result + ((this.dpsItmChgLen==null)?0:this.dpsItmChgLen.hashCode());
		result= prime * result + ((this.bfchDpsRgsChgDtcdTxt==null)?0:this.bfchDpsRgsChgDtcdTxt.hashCode());
		result= prime * result + ((this.dpsRgsChgDtcdTxt==null)?0:this.dpsRgsChgDtcdTxt.hashCode());
		result= prime * result + ((this.dpsItmMndYn==null)?0:this.dpsItmMndYn.hashCode());
		result= prime * result + ((this.dpsItmBscTxt==null)?0:this.dpsItmBscTxt.hashCode());
		result= prime * result + ((this.dpsItmHdnYn==null)?0:this.dpsItmHdnYn.hashCode());
		result= prime * result + ((this.dpsItmMarkSeq==null)?0:this.dpsItmMarkSeq.hashCode());
		result= prime * result + ((this.dpsItmDmnNm==null)?0:this.dpsItmDmnNm.hashCode());
		result= prime * result + ((this.dpsItmGrcd==null)?0:this.dpsItmGrcd.hashCode());
		result= prime * result + ((this.dpsRefcLdgNm==null)?0:this.dpsRefcLdgNm.hashCode());
		result= prime * result + ((this.dpsRefcLdgItmNm==null)?0:this.dpsRefcLdgItmNm.hashCode());
		result= prime * result + ((this.dpsRgsChgHelpTxt==null)?0:this.dpsRgsChgHelpTxt.hashCode());
		result= prime * result + ((this.etcRmrkTxt==null)?0:this.etcRmrkTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinBscMngUpdateMnpChidAcno_DTO other= (MNPMnyPinBscMngUpdateMnpChidAcno_DTO)obj;
		{
			Object _dpsRgsChgItcd= getDpsRgsChgItcd();
			Object __dpsRgsChgItcd= other.getDpsRgsChgItcd();
			if ( _dpsRgsChgItcd== null ) { if ( __dpsRgsChgItcd!= null ) return false; }
			else if ( !_dpsRgsChgItcd.equals(__dpsRgsChgItcd) ) return false;
		}
		{
			Object _dpsRgsChgDtcdNm= getDpsRgsChgDtcdNm();
			Object __dpsRgsChgDtcdNm= other.getDpsRgsChgDtcdNm();
			if ( _dpsRgsChgDtcdNm== null ) { if ( __dpsRgsChgDtcdNm!= null ) return false; }
			else if ( !_dpsRgsChgDtcdNm.equals(__dpsRgsChgDtcdNm) ) return false;
		}
		{
			Object _dpsRgsChgDtcd= getDpsRgsChgDtcd();
			Object __dpsRgsChgDtcd= other.getDpsRgsChgDtcd();
			if ( _dpsRgsChgDtcd== null ) { if ( __dpsRgsChgDtcd!= null ) return false; }
			else if ( !_dpsRgsChgDtcd.equals(__dpsRgsChgDtcd) ) return false;
		}
		{
			Object _dpsItmAtrbDscd= getDpsItmAtrbDscd();
			Object __dpsItmAtrbDscd= other.getDpsItmAtrbDscd();
			if ( _dpsItmAtrbDscd== null ) { if ( __dpsItmAtrbDscd!= null ) return false; }
			else if ( !_dpsItmAtrbDscd.equals(__dpsItmAtrbDscd) ) return false;
		}
		{
			Object _dpsItmAtrbDscdNm= getDpsItmAtrbDscdNm();
			Object __dpsItmAtrbDscdNm= other.getDpsItmAtrbDscdNm();
			if ( _dpsItmAtrbDscdNm== null ) { if ( __dpsItmAtrbDscdNm!= null ) return false; }
			else if ( !_dpsItmAtrbDscdNm.equals(__dpsItmAtrbDscdNm) ) return false;
		}
		{
			Object _dpsItmChgLen= getDpsItmChgLen();
			Object __dpsItmChgLen= other.getDpsItmChgLen();
			if ( _dpsItmChgLen== null ) { if ( __dpsItmChgLen!= null ) return false; }
			else if ( !_dpsItmChgLen.equals(__dpsItmChgLen) ) return false;
		}
		{
			Object _bfchDpsRgsChgDtcdTxt= getBfchDpsRgsChgDtcdTxt();
			Object __bfchDpsRgsChgDtcdTxt= other.getBfchDpsRgsChgDtcdTxt();
			if ( _bfchDpsRgsChgDtcdTxt== null ) { if ( __bfchDpsRgsChgDtcdTxt!= null ) return false; }
			else if ( !_bfchDpsRgsChgDtcdTxt.equals(__bfchDpsRgsChgDtcdTxt) ) return false;
		}
		{
			Object _dpsRgsChgDtcdTxt= getDpsRgsChgDtcdTxt();
			Object __dpsRgsChgDtcdTxt= other.getDpsRgsChgDtcdTxt();
			if ( _dpsRgsChgDtcdTxt== null ) { if ( __dpsRgsChgDtcdTxt!= null ) return false; }
			else if ( !_dpsRgsChgDtcdTxt.equals(__dpsRgsChgDtcdTxt) ) return false;
		}
		{
			Object _dpsItmMndYn= getDpsItmMndYn();
			Object __dpsItmMndYn= other.getDpsItmMndYn();
			if ( _dpsItmMndYn== null ) { if ( __dpsItmMndYn!= null ) return false; }
			else if ( !_dpsItmMndYn.equals(__dpsItmMndYn) ) return false;
		}
		{
			Object _dpsItmBscTxt= getDpsItmBscTxt();
			Object __dpsItmBscTxt= other.getDpsItmBscTxt();
			if ( _dpsItmBscTxt== null ) { if ( __dpsItmBscTxt!= null ) return false; }
			else if ( !_dpsItmBscTxt.equals(__dpsItmBscTxt) ) return false;
		}
		{
			Object _dpsItmHdnYn= getDpsItmHdnYn();
			Object __dpsItmHdnYn= other.getDpsItmHdnYn();
			if ( _dpsItmHdnYn== null ) { if ( __dpsItmHdnYn!= null ) return false; }
			else if ( !_dpsItmHdnYn.equals(__dpsItmHdnYn) ) return false;
		}
		{
			Object _dpsItmMarkSeq= getDpsItmMarkSeq();
			Object __dpsItmMarkSeq= other.getDpsItmMarkSeq();
			if ( _dpsItmMarkSeq== null ) { if ( __dpsItmMarkSeq!= null ) return false; }
			else if ( !_dpsItmMarkSeq.equals(__dpsItmMarkSeq) ) return false;
		}
		{
			Object _dpsItmDmnNm= getDpsItmDmnNm();
			Object __dpsItmDmnNm= other.getDpsItmDmnNm();
			if ( _dpsItmDmnNm== null ) { if ( __dpsItmDmnNm!= null ) return false; }
			else if ( !_dpsItmDmnNm.equals(__dpsItmDmnNm) ) return false;
		}
		{
			Object _dpsItmGrcd= getDpsItmGrcd();
			Object __dpsItmGrcd= other.getDpsItmGrcd();
			if ( _dpsItmGrcd== null ) { if ( __dpsItmGrcd!= null ) return false; }
			else if ( !_dpsItmGrcd.equals(__dpsItmGrcd) ) return false;
		}
		{
			Object _dpsRefcLdgNm= getDpsRefcLdgNm();
			Object __dpsRefcLdgNm= other.getDpsRefcLdgNm();
			if ( _dpsRefcLdgNm== null ) { if ( __dpsRefcLdgNm!= null ) return false; }
			else if ( !_dpsRefcLdgNm.equals(__dpsRefcLdgNm) ) return false;
		}
		{
			Object _dpsRefcLdgItmNm= getDpsRefcLdgItmNm();
			Object __dpsRefcLdgItmNm= other.getDpsRefcLdgItmNm();
			if ( _dpsRefcLdgItmNm== null ) { if ( __dpsRefcLdgItmNm!= null ) return false; }
			else if ( !_dpsRefcLdgItmNm.equals(__dpsRefcLdgItmNm) ) return false;
		}
		{
			Object _dpsRgsChgHelpTxt= getDpsRgsChgHelpTxt();
			Object __dpsRgsChgHelpTxt= other.getDpsRgsChgHelpTxt();
			if ( _dpsRgsChgHelpTxt== null ) { if ( __dpsRgsChgHelpTxt!= null ) return false; }
			else if ( !_dpsRgsChgHelpTxt.equals(__dpsRgsChgHelpTxt) ) return false;
		}
		{
			Object _etcRmrkTxt= getEtcRmrkTxt();
			Object __etcRmrkTxt= other.getEtcRmrkTxt();
			if ( _etcRmrkTxt== null ) { if ( __etcRmrkTxt!= null ) return false; }
			else if ( !_etcRmrkTxt.equals(__etcRmrkTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinBscMngUpdateMnpChidAcno_DTO.class.getName()).append(":\n");
		sb.append("\tdpsRgsChgItcd: ");
		sb.append(dpsRgsChgItcd==null?"null":getDpsRgsChgItcd());
		sb.append("\n");
		sb.append("\tdpsRgsChgDtcdNm: ");
		sb.append(dpsRgsChgDtcdNm==null?"null":getDpsRgsChgDtcdNm());
		sb.append("\n");
		sb.append("\tdpsRgsChgDtcd: ");
		sb.append(dpsRgsChgDtcd==null?"null":getDpsRgsChgDtcd());
		sb.append("\n");
		sb.append("\tdpsItmAtrbDscd: ");
		sb.append(dpsItmAtrbDscd==null?"null":getDpsItmAtrbDscd());
		sb.append("\n");
		sb.append("\tdpsItmAtrbDscdNm: ");
		sb.append(dpsItmAtrbDscdNm==null?"null":getDpsItmAtrbDscdNm());
		sb.append("\n");
		sb.append("\tdpsItmChgLen: ");
		sb.append(dpsItmChgLen==null?"null":getDpsItmChgLen());
		sb.append("\n");
		sb.append("\tbfchDpsRgsChgDtcdTxt: ");
		sb.append(bfchDpsRgsChgDtcdTxt==null?"null":getBfchDpsRgsChgDtcdTxt());
		sb.append("\n");
		sb.append("\tdpsRgsChgDtcdTxt: ");
		sb.append(dpsRgsChgDtcdTxt==null?"null":getDpsRgsChgDtcdTxt());
		sb.append("\n");
		sb.append("\tdpsItmMndYn: ");
		sb.append(dpsItmMndYn==null?"null":getDpsItmMndYn());
		sb.append("\n");
		sb.append("\tdpsItmBscTxt: ");
		sb.append(dpsItmBscTxt==null?"null":getDpsItmBscTxt());
		sb.append("\n");
		sb.append("\tdpsItmHdnYn: ");
		sb.append(dpsItmHdnYn==null?"null":getDpsItmHdnYn());
		sb.append("\n");
		sb.append("\tdpsItmMarkSeq: ");
		sb.append(dpsItmMarkSeq==null?"null":getDpsItmMarkSeq());
		sb.append("\n");
		sb.append("\tdpsItmDmnNm: ");
		sb.append(dpsItmDmnNm==null?"null":getDpsItmDmnNm());
		sb.append("\n");
		sb.append("\tdpsItmGrcd: ");
		sb.append(dpsItmGrcd==null?"null":getDpsItmGrcd());
		sb.append("\n");
		sb.append("\tdpsRefcLdgNm: ");
		sb.append(dpsRefcLdgNm==null?"null":getDpsRefcLdgNm());
		sb.append("\n");
		sb.append("\tdpsRefcLdgItmNm: ");
		sb.append(dpsRefcLdgItmNm==null?"null":getDpsRefcLdgItmNm());
		sb.append("\n");
		sb.append("\tdpsRgsChgHelpTxt: ");
		sb.append(dpsRgsChgHelpTxt==null?"null":getDpsRgsChgHelpTxt());
		sb.append("\n");
		sb.append("\tetcRmrkTxt: ");
		sb.append(etcRmrkTxt==null?"null":getEtcRmrkTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 6; /* dpsRgsChgItcd */
		messageLen+= 60; /* dpsRgsChgDtcdNm */
		messageLen+= 3; /* dpsRgsChgDtcd */
		messageLen+= 2; /* dpsItmAtrbDscd */
		messageLen+= 60; /* dpsItmAtrbDscdNm */
		messageLen+= 3; /* dpsItmChgLen */
		messageLen+= 80; /* bfchDpsRgsChgDtcdTxt */
		messageLen+= 80; /* dpsRgsChgDtcdTxt */
		messageLen+= 1; /* dpsItmMndYn */
		messageLen+= 80; /* dpsItmBscTxt */
		messageLen+= 1; /* dpsItmHdnYn */
		messageLen+= 3; /* dpsItmMarkSeq */
		messageLen+= 70; /* dpsItmDmnNm */
		messageLen+= 2; /* dpsItmGrcd */
		messageLen+= 20; /* dpsRefcLdgNm */
		messageLen+= 50; /* dpsRefcLdgItmNm */
		messageLen+= 500; /* dpsRgsChgHelpTxt */
		messageLen+= 500; /* etcRmrkTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsRgsChgItcd");
		list.add("dpsRgsChgDtcdNm");
		list.add("dpsRgsChgDtcd");
		list.add("dpsItmAtrbDscd");
		list.add("dpsItmAtrbDscdNm");
		list.add("dpsItmChgLen");
		list.add("bfchDpsRgsChgDtcdTxt");
		list.add("dpsRgsChgDtcdTxt");
		list.add("dpsItmMndYn");
		list.add("dpsItmBscTxt");
		list.add("dpsItmHdnYn");
		list.add("dpsItmMarkSeq");
		list.add("dpsItmDmnNm");
		list.add("dpsItmGrcd");
		list.add("dpsRefcLdgNm");
		list.add("dpsRefcLdgItmNm");
		list.add("dpsRgsChgHelpTxt");
		list.add("etcRmrkTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsRgsChgItcd", get("dpsRgsChgItcd"));
		map.put("dpsRgsChgDtcdNm", get("dpsRgsChgDtcdNm"));
		map.put("dpsRgsChgDtcd", get("dpsRgsChgDtcd"));
		map.put("dpsItmAtrbDscd", get("dpsItmAtrbDscd"));
		map.put("dpsItmAtrbDscdNm", get("dpsItmAtrbDscdNm"));
		map.put("dpsItmChgLen", get("dpsItmChgLen"));
		map.put("bfchDpsRgsChgDtcdTxt", get("bfchDpsRgsChgDtcdTxt"));
		map.put("dpsRgsChgDtcdTxt", get("dpsRgsChgDtcdTxt"));
		map.put("dpsItmMndYn", get("dpsItmMndYn"));
		map.put("dpsItmBscTxt", get("dpsItmBscTxt"));
		map.put("dpsItmHdnYn", get("dpsItmHdnYn"));
		map.put("dpsItmMarkSeq", get("dpsItmMarkSeq"));
		map.put("dpsItmDmnNm", get("dpsItmDmnNm"));
		map.put("dpsItmGrcd", get("dpsItmGrcd"));
		map.put("dpsRefcLdgNm", get("dpsRefcLdgNm"));
		map.put("dpsRefcLdgItmNm", get("dpsRefcLdgItmNm"));
		map.put("dpsRgsChgHelpTxt", get("dpsRgsChgHelpTxt"));
		map.put("etcRmrkTxt", get("etcRmrkTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1939790697:/* dpsRgsChgItcd */
			return getDpsRgsChgItcd();
		case -266196581:/* dpsRgsChgDtcdNm */
			return getDpsRgsChgDtcdNm();
		case -1939939652:/* dpsRgsChgDtcd */
			return getDpsRgsChgDtcd();
		case 1894890574:/* dpsItmAtrbDscd */
			return getDpsItmAtrbDscd();
		case -76289363:/* dpsItmAtrbDscdNm */
			return getDpsItmAtrbDscdNm();
		case 977407918:/* dpsItmChgLen */
			return getDpsItmChgLen();
		case 1227557853:/* bfchDpsRgsChgDtcdTxt */
			return getBfchDpsRgsChgDtcdTxt();
		case 337846804:/* dpsRgsChgDtcdTxt */
			return getDpsRgsChgDtcdTxt();
		case -97606563:/* dpsItmMndYn */
			return getDpsItmMndYn();
		case 958826617:/* dpsItmBscTxt */
			return getDpsItmBscTxt();
		case -102512468:/* dpsItmHdnYn */
			return getDpsItmHdnYn();
		case 330637335:/* dpsItmMarkSeq */
			return getDpsItmMarkSeq();
		case -105938775:/* dpsItmDmnNm */
			return getDpsItmDmnNm();
		case -696060185:/* dpsItmGrcd */
			return getDpsItmGrcd();
		case 490487319:/* dpsRefcLdgNm */
			return getDpsRefcLdgNm();
		case 624677545:/* dpsRefcLdgItmNm */
			return getDpsRefcLdgItmNm();
		case -827873852:/* dpsRgsChgHelpTxt */
			return getDpsRgsChgHelpTxt();
		case 1850205160:/* etcRmrkTxt */
			return getEtcRmrkTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1939790697:/* dpsRgsChgItcd */
			setDpsRgsChgItcd((String)value);
			break;
		case -266196581:/* dpsRgsChgDtcdNm */
			setDpsRgsChgDtcdNm((String)value);
			break;
		case -1939939652:/* dpsRgsChgDtcd */
			setDpsRgsChgDtcd((String)value);
			break;
		case 1894890574:/* dpsItmAtrbDscd */
			setDpsItmAtrbDscd((String)value);
			break;
		case -76289363:/* dpsItmAtrbDscdNm */
			setDpsItmAtrbDscdNm((String)value);
			break;
		case 977407918:/* dpsItmChgLen */
			setDpsItmChgLen((Integer)value);
			break;
		case 1227557853:/* bfchDpsRgsChgDtcdTxt */
			setBfchDpsRgsChgDtcdTxt((String)value);
			break;
		case 337846804:/* dpsRgsChgDtcdTxt */
			setDpsRgsChgDtcdTxt((String)value);
			break;
		case -97606563:/* dpsItmMndYn */
			setDpsItmMndYn((String)value);
			break;
		case 958826617:/* dpsItmBscTxt */
			setDpsItmBscTxt((String)value);
			break;
		case -102512468:/* dpsItmHdnYn */
			setDpsItmHdnYn((String)value);
			break;
		case 330637335:/* dpsItmMarkSeq */
			setDpsItmMarkSeq((Integer)value);
			break;
		case -105938775:/* dpsItmDmnNm */
			setDpsItmDmnNm((String)value);
			break;
		case -696060185:/* dpsItmGrcd */
			setDpsItmGrcd((String)value);
			break;
		case 490487319:/* dpsRefcLdgNm */
			setDpsRefcLdgNm((String)value);
			break;
		case 624677545:/* dpsRefcLdgItmNm */
			setDpsRefcLdgItmNm((String)value);
			break;
		case -827873852:/* dpsRgsChgHelpTxt */
			setDpsRgsChgHelpTxt((String)value);
			break;
		case 1850205160:/* etcRmrkTxt */
			setEtcRmrkTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
