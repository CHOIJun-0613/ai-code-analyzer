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
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
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
	"inqBasYm", "metMbhSrno", "metMbhAlsNm", "metMbhDscd", "metMbhDscdNm", "metMbhImgUrlNm", "mbpfPmtgtAm", "mbpfPymAm", "metMbpfXmpAm", "metMbhImgFileData"
}, name="MPBMbpfRcvstsListInq_ODT")
@XmlRootElement(name="MPBMbpfRcvstsListInq_ODT")
@BxmCategory(logicalName="회비.입금현황.목록.조회.컨트롤러.출력.IO", description="") 
public class MPBMbpfRcvstsListInq_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1585677970L;
	
	
	
	/**
	 * 조회기준년월
	 */
	@ApiModelProperty(
		name = "inqBasYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqBasYm")
	@BxmOmm_Field(length=6, decimal=0, description="조회기준년월", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String inqBasYm= "";
	
	
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
	@BxmOmm_Field(length=100, decimal=0, description="모임회원이미지URL명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String metMbhImgUrlNm= "";
	
	
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
	 * 회비납부금액
	 */
	@ApiModelProperty(
		name = "mbpfPymAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mbpfPymAm")
	@BxmOmm_Field(length=19, decimal=3, description="회비납부금액", align="right", fill="0")
	private BigDecimal mbpfPymAm= new BigDecimal("0");
	
	
	/**
	 * 모임회비면제금액
	 */
	@ApiModelProperty(
		name = "metMbpfXmpAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("metMbpfXmpAm")
	@BxmOmm_Field(length=19, decimal=3, description="모임회비면제금액", align="right", fill="0")
	private BigDecimal metMbpfXmpAm= new BigDecimal("0");
	
	
	/**
	 * 모임회원이미지파일데이터
	 */
	@ApiModelProperty(
		name = "metMbhImgFileData"
		, dataType = "BLOB"
		)
	@XmlElement
	@JsonProperty("metMbhImgFileData")
	@BxmOmm_Field(length=100000, decimal=0, description="모임회원이미지파일데이터", align="left", fill="")
	private byte[] metMbhImgFileData= null;
	
	
	
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
	private boolean isSet_mbpfPymAm= false;
	protected final boolean isSet_mbpfPymAm(){
		return this.isSet_mbpfPymAm;
	}
	private void setIsSet_mbpfPymAm(boolean value){
		this.isSet_mbpfPymAm= value;
	}
	/**
	 * 회비납부금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mbpfPymAm 회비납부금액
	 */
	public void setMbpfPymAm(double mbpfPymAm) {
		setMbpfPymAm(BigDecimal.valueOf(mbpfPymAm));
	}
	/**
	 * 회비납부금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mbpfPymAm 회비납부금액
	 */
	public void setMbpfPymAm(long mbpfPymAm) {
		setMbpfPymAm(BigDecimal.valueOf(mbpfPymAm));
	}
	/**
	 * 회비납부금액
	 * BigDecimal - String value setter
	 *
	 * @Param mbpfPymAm 회비납부금액
	 */
	public void setMbpfPymAm(String mbpfPymAm) {
		setMbpfPymAm(new BigDecimal(mbpfPymAm));
	}
	/**
	 * 회비납부금액
	 */
	@XmlTransient
	public BigDecimal getMbpfPymAm(){
		return this.mbpfPymAm;
	}
	
	/**
	 * 회비납부금액
	 * 
	 * @param mbpfPymAm 회비납부금액
	 */
	@JsonSetter("mbpfPymAm")
	public void setMbpfPymAm(BigDecimal mbpfPymAm){
		this.mbpfPymAm= mbpfPymAm;
		this.setIsSet_mbpfPymAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbpfXmpAm= false;
	protected final boolean isSet_metMbpfXmpAm(){
		return this.isSet_metMbpfXmpAm;
	}
	private void setIsSet_metMbpfXmpAm(boolean value){
		this.isSet_metMbpfXmpAm= value;
	}
	/**
	 * 모임회비면제금액
	 * BigDecimal - Double value setter
	 *
	 * @Param metMbpfXmpAm 모임회비면제금액
	 */
	public void setMetMbpfXmpAm(double metMbpfXmpAm) {
		setMetMbpfXmpAm(BigDecimal.valueOf(metMbpfXmpAm));
	}
	/**
	 * 모임회비면제금액
	 * BigDecimal - Long value setter
	 *
	 * @Param metMbpfXmpAm 모임회비면제금액
	 */
	public void setMetMbpfXmpAm(long metMbpfXmpAm) {
		setMetMbpfXmpAm(BigDecimal.valueOf(metMbpfXmpAm));
	}
	/**
	 * 모임회비면제금액
	 * BigDecimal - String value setter
	 *
	 * @Param metMbpfXmpAm 모임회비면제금액
	 */
	public void setMetMbpfXmpAm(String metMbpfXmpAm) {
		setMetMbpfXmpAm(new BigDecimal(metMbpfXmpAm));
	}
	/**
	 * 모임회비면제금액
	 */
	@XmlTransient
	public BigDecimal getMetMbpfXmpAm(){
		return this.metMbpfXmpAm;
	}
	
	/**
	 * 모임회비면제금액
	 * 
	 * @param metMbpfXmpAm 모임회비면제금액
	 */
	@JsonSetter("metMbpfXmpAm")
	public void setMetMbpfXmpAm(BigDecimal metMbpfXmpAm){
		this.metMbpfXmpAm= metMbpfXmpAm;
		this.setIsSet_metMbpfXmpAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhImgFileData= false;
	protected final boolean isSet_metMbhImgFileData(){
		return this.isSet_metMbhImgFileData;
	}
	private void setIsSet_metMbhImgFileData(boolean value){
		this.isSet_metMbhImgFileData= value;
	}
	/**
	 * 모임회원이미지파일데이터
	 */
	@XmlTransient
	public byte[] getMetMbhImgFileData(){
		return this.metMbhImgFileData;
	}
	
	/**
	 * 모임회원이미지파일데이터
	 * 
	 * @param metMbhImgFileData 모임회원이미지파일데이터
	 */
	public void setMetMbhImgFileData(byte[] metMbhImgFileData){
		this.metMbhImgFileData= metMbhImgFileData;
		this.setIsSet_metMbhImgFileData(true);
	}
				
	@Override
	public MPBMbpfRcvstsListInq_ODT clone(){
		try{
			MPBMbpfRcvstsListInq_ODT object= (MPBMbpfRcvstsListInq_ODT)super.clone();
			if ( this.metMbhImgFileData== null ) object.metMbhImgFileData= null;
			else object.metMbhImgFileData= Arrays.copyOf(this.metMbhImgFileData, this.metMbhImgFileData.length);
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
		
		result= prime * result + ((this.inqBasYm==null)?0:this.inqBasYm.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.metMbhAlsNm==null)?0:this.metMbhAlsNm.hashCode());
		result= prime * result + ((this.metMbhDscd==null)?0:this.metMbhDscd.hashCode());
		result= prime * result + ((this.metMbhDscdNm==null)?0:this.metMbhDscdNm.hashCode());
		result= prime * result + ((this.metMbhImgUrlNm==null)?0:this.metMbhImgUrlNm.hashCode());
		result= prime * result + ((this.mbpfPmtgtAm==null)?0:this.mbpfPmtgtAm.hashCode());
		result= prime * result + ((this.mbpfPymAm==null)?0:this.mbpfPymAm.hashCode());
		result= prime * result + ((this.metMbpfXmpAm==null)?0:this.metMbpfXmpAm.hashCode());
		result= prime * result + ((this.metMbhImgFileData==null)?0:this.metMbhImgFileData.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMbpfRcvstsListInq_ODT other= (MPBMbpfRcvstsListInq_ODT)obj;
		{
			Object _inqBasYm= getInqBasYm();
			Object __inqBasYm= other.getInqBasYm();
			if ( _inqBasYm== null ) { if ( __inqBasYm!= null ) return false; }
			else if ( !_inqBasYm.equals(__inqBasYm) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
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
			Object _mbpfPmtgtAm= getMbpfPmtgtAm();
			Object __mbpfPmtgtAm= other.getMbpfPmtgtAm();
			if ( _mbpfPmtgtAm== null ) { if ( __mbpfPmtgtAm!= null ) return false; }
			else if ( !_mbpfPmtgtAm.equals(__mbpfPmtgtAm) ) return false;
		}
		{
			Object _mbpfPymAm= getMbpfPymAm();
			Object __mbpfPymAm= other.getMbpfPymAm();
			if ( _mbpfPymAm== null ) { if ( __mbpfPymAm!= null ) return false; }
			else if ( !_mbpfPymAm.equals(__mbpfPymAm) ) return false;
		}
		{
			Object _metMbpfXmpAm= getMetMbpfXmpAm();
			Object __metMbpfXmpAm= other.getMetMbpfXmpAm();
			if ( _metMbpfXmpAm== null ) { if ( __metMbpfXmpAm!= null ) return false; }
			else if ( !_metMbpfXmpAm.equals(__metMbpfXmpAm) ) return false;
		}
		{
			Object _metMbhImgFileData= getMetMbhImgFileData();
			Object __metMbhImgFileData= other.getMetMbhImgFileData();
			if ( _metMbhImgFileData== null ) { if ( __metMbhImgFileData!= null ) return false; }
			else if ( !_metMbhImgFileData.equals(__metMbhImgFileData) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMbpfRcvstsListInq_ODT.class.getName()).append(":\n");
		sb.append("\tinqBasYm: ");
		sb.append(inqBasYm==null?"null":getInqBasYm());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
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
		sb.append("\tmbpfPmtgtAm: ");
		sb.append(mbpfPmtgtAm==null?"null":getMbpfPmtgtAm());
		sb.append("\n");
		sb.append("\tmbpfPymAm: ");
		sb.append(mbpfPymAm==null?"null":getMbpfPymAm());
		sb.append("\n");
		sb.append("\tmetMbpfXmpAm: ");
		sb.append(metMbpfXmpAm==null?"null":getMetMbpfXmpAm());
		sb.append("\n");
		sb.append("\tmetMbhImgFileData: ");
		sb.append(metMbhImgFileData==null?"null":getMetMbhImgFileData());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 6; /* inqBasYm */
		messageLen+= 7; /* metMbhSrno */
		messageLen+= 60; /* metMbhAlsNm */
		messageLen+= 1; /* metMbhDscd */
		messageLen+= 50; /* metMbhDscdNm */
		messageLen+= 100; /* metMbhImgUrlNm */
		messageLen+= 19; /* mbpfPmtgtAm */
		messageLen+= 19; /* mbpfPymAm */
		messageLen+= 19; /* metMbpfXmpAm */
		messageLen+= 100000; /* metMbhImgFileData */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("inqBasYm");
		list.add("metMbhSrno");
		list.add("metMbhAlsNm");
		list.add("metMbhDscd");
		list.add("metMbhDscdNm");
		list.add("metMbhImgUrlNm");
		list.add("mbpfPmtgtAm");
		list.add("mbpfPymAm");
		list.add("metMbpfXmpAm");
		list.add("metMbhImgFileData");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("inqBasYm", get("inqBasYm"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("metMbhAlsNm", get("metMbhAlsNm"));
		map.put("metMbhDscd", get("metMbhDscd"));
		map.put("metMbhDscdNm", get("metMbhDscdNm"));
		map.put("metMbhImgUrlNm", get("metMbhImgUrlNm"));
		map.put("mbpfPmtgtAm", get("mbpfPmtgtAm"));
		map.put("mbpfPymAm", get("mbpfPymAm"));
		map.put("metMbpfXmpAm", get("metMbpfXmpAm"));
		map.put("metMbhImgFileData", get("metMbhImgFileData"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 451698108:/* inqBasYm */
			return getInqBasYm();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case 695730640:/* metMbhAlsNm */
			return getMetMbhAlsNm();
		case 715275207:/* metMbhDscd */
			return getMetMbhDscd();
		case 184709094:/* metMbhDscdNm */
			return getMetMbhDscdNm();
		case 607580322:/* metMbhImgUrlNm */
			return getMetMbhImgUrlNm();
		case 1940639685:/* mbpfPmtgtAm */
			return getMbpfPmtgtAm();
		case -1128356027:/* mbpfPymAm */
			return getMbpfPymAm();
		case -356430944:/* metMbpfXmpAm */
			return getMetMbpfXmpAm();
		case 1683354034:/* metMbhImgFileData */
			return getMetMbhImgFileData();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 451698108:/* inqBasYm */
			setInqBasYm((String)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
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
		case -1128356027:/* mbpfPymAm */
			if ( value instanceof String ){
				setMbpfPymAm((String)value);
			}
			else if ( value instanceof Double ){
				setMbpfPymAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMbpfPymAm((Long)value);
			}
			else{
				setMbpfPymAm((BigDecimal)value);
			}
			break;
		case -356430944:/* metMbpfXmpAm */
			if ( value instanceof String ){
				setMetMbpfXmpAm((String)value);
			}
			else if ( value instanceof Double ){
				setMetMbpfXmpAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMetMbpfXmpAm((Long)value);
			}
			else{
				setMetMbpfXmpAm((BigDecimal)value);
			}
			break;
		case 1683354034:/* metMbhImgFileData */
			setMetMbhImgFileData((byte[])value);
			break;
		default:
			break;
		}
	}
	
}
