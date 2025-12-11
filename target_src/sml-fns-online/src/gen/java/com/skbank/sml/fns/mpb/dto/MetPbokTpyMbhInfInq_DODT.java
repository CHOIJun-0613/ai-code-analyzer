/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.dto;

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
	"hpNo", "metMbhNm", "metPtcpStcd", "metMbhDis", "metSecLrgDt", "metSecLrgTm", "metSecLrgVldEndDt", "metSecLrgVldEndTm"
}, name="MetPbokTpyMbhInfInq_DODT")
@XmlRootElement(name="MetPbokTpyMbhInfInq_DODT")
@BxmCategory(logicalName="모임통장.임시.회원.정보.조회.DBM.출력.IO", description="") 
public class MetPbokTpyMbhInfInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1605439357L;
	
	
	
	/**
	 * 핸드폰번호
	 */
	@ApiModelProperty(
		name = "hpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpNo")
	@BxmOmm_Field(length=14, decimal=0, description="핸드폰번호", align="left", fill="")
	private String hpNo= "";
	
	
	/**
	 * 모임회원명
	 */
	@ApiModelProperty(
		name = "metMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임회원명", align="left", fill="")
	private String metMbhNm= "";
	
	
	/**
	 * 모임참여상태코드
	 */
	@ApiModelProperty(
		name = "metPtcpStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPtcpStcd")
	@BxmOmm_Field(length=2, decimal=0, description="모임참여상태코드", align="left", fill="")
	private String metPtcpStcd= "";
	
	
	/**
	 * 모임회원구분코드
	 */
	@ApiModelProperty(
		name = "metMbhDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhDis")
	@BxmOmm_Field(length=1, decimal=0, description="모임회원구분코드", align="left", fill="")
	private String metMbhDis= "";
	
	
	/**
	 * 모임초대일자
	 */
	@ApiModelProperty(
		name = "metSecLrgDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metSecLrgDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임초대일자", align="left", fill="")
	private String metSecLrgDt= "";
	
	
	/**
	 * 모임초대시각
	 */
	@ApiModelProperty(
		name = "metSecLrgTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metSecLrgTm")
	@BxmOmm_Field(length=6, decimal=0, description="모임초대시각", align="left", fill="")
	private String metSecLrgTm= "";
	
	
	/**
	 * 모임초대유효종료일자
	 */
	@ApiModelProperty(
		name = "metSecLrgVldEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metSecLrgVldEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임초대유효종료일자", align="left", fill="")
	private String metSecLrgVldEndDt= "";
	
	
	/**
	 * 모임초대유효종료시각
	 */
	@ApiModelProperty(
		name = "metSecLrgVldEndTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metSecLrgVldEndTm")
	@BxmOmm_Field(length=6, decimal=0, description="모임초대유효종료시각", align="left", fill="")
	private String metSecLrgVldEndTm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpNo= false;
	protected final boolean isSet_hpNo(){
		return this.isSet_hpNo;
	}
	private void setIsSet_hpNo(boolean value){
		this.isSet_hpNo= value;
	}
	/**
	 * 핸드폰번호
	 */
	@XmlTransient
	public String getHpNo(){
		return this.hpNo;
	}
	
	/**
	 * 핸드폰번호
	 * 
	 * @param hpNo 핸드폰번호
	 */
	public void setHpNo(String hpNo){
		this.hpNo= hpNo;
		this.setIsSet_hpNo(true);
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
	private boolean isSet_metPtcpStcd= false;
	protected final boolean isSet_metPtcpStcd(){
		return this.isSet_metPtcpStcd;
	}
	private void setIsSet_metPtcpStcd(boolean value){
		this.isSet_metPtcpStcd= value;
	}
	/**
	 * 모임참여상태코드
	 */
	@XmlTransient
	public String getMetPtcpStcd(){
		return this.metPtcpStcd;
	}
	
	/**
	 * 모임참여상태코드
	 * 
	 * @param metPtcpStcd 모임참여상태코드
	 */
	public void setMetPtcpStcd(String metPtcpStcd){
		this.metPtcpStcd= metPtcpStcd;
		this.setIsSet_metPtcpStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhDis= false;
	protected final boolean isSet_metMbhDis(){
		return this.isSet_metMbhDis;
	}
	private void setIsSet_metMbhDis(boolean value){
		this.isSet_metMbhDis= value;
	}
	/**
	 * 모임회원구분코드
	 */
	@XmlTransient
	public String getMetMbhDis(){
		return this.metMbhDis;
	}
	
	/**
	 * 모임회원구분코드
	 * 
	 * @param metMbhDis 모임회원구분코드
	 */
	public void setMetMbhDis(String metMbhDis){
		this.metMbhDis= metMbhDis;
		this.setIsSet_metMbhDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metSecLrgDt= false;
	protected final boolean isSet_metSecLrgDt(){
		return this.isSet_metSecLrgDt;
	}
	private void setIsSet_metSecLrgDt(boolean value){
		this.isSet_metSecLrgDt= value;
	}
	/**
	 * 모임초대일자
	 */
	@XmlTransient
	public String getMetSecLrgDt(){
		return this.metSecLrgDt;
	}
	
	/**
	 * 모임초대일자
	 * 
	 * @param metSecLrgDt 모임초대일자
	 */
	public void setMetSecLrgDt(String metSecLrgDt){
		this.metSecLrgDt= metSecLrgDt;
		this.setIsSet_metSecLrgDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metSecLrgTm= false;
	protected final boolean isSet_metSecLrgTm(){
		return this.isSet_metSecLrgTm;
	}
	private void setIsSet_metSecLrgTm(boolean value){
		this.isSet_metSecLrgTm= value;
	}
	/**
	 * 모임초대시각
	 */
	@XmlTransient
	public String getMetSecLrgTm(){
		return this.metSecLrgTm;
	}
	
	/**
	 * 모임초대시각
	 * 
	 * @param metSecLrgTm 모임초대시각
	 */
	public void setMetSecLrgTm(String metSecLrgTm){
		this.metSecLrgTm= metSecLrgTm;
		this.setIsSet_metSecLrgTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metSecLrgVldEndDt= false;
	protected final boolean isSet_metSecLrgVldEndDt(){
		return this.isSet_metSecLrgVldEndDt;
	}
	private void setIsSet_metSecLrgVldEndDt(boolean value){
		this.isSet_metSecLrgVldEndDt= value;
	}
	/**
	 * 모임초대유효종료일자
	 */
	@XmlTransient
	public String getMetSecLrgVldEndDt(){
		return this.metSecLrgVldEndDt;
	}
	
	/**
	 * 모임초대유효종료일자
	 * 
	 * @param metSecLrgVldEndDt 모임초대유효종료일자
	 */
	public void setMetSecLrgVldEndDt(String metSecLrgVldEndDt){
		this.metSecLrgVldEndDt= metSecLrgVldEndDt;
		this.setIsSet_metSecLrgVldEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metSecLrgVldEndTm= false;
	protected final boolean isSet_metSecLrgVldEndTm(){
		return this.isSet_metSecLrgVldEndTm;
	}
	private void setIsSet_metSecLrgVldEndTm(boolean value){
		this.isSet_metSecLrgVldEndTm= value;
	}
	/**
	 * 모임초대유효종료시각
	 */
	@XmlTransient
	public String getMetSecLrgVldEndTm(){
		return this.metSecLrgVldEndTm;
	}
	
	/**
	 * 모임초대유효종료시각
	 * 
	 * @param metSecLrgVldEndTm 모임초대유효종료시각
	 */
	public void setMetSecLrgVldEndTm(String metSecLrgVldEndTm){
		this.metSecLrgVldEndTm= metSecLrgVldEndTm;
		this.setIsSet_metSecLrgVldEndTm(true);
	}
				
	@Override
	public MetPbokTpyMbhInfInq_DODT clone(){
		try{
			MetPbokTpyMbhInfInq_DODT object= (MetPbokTpyMbhInfInq_DODT)super.clone();
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
		
		result= prime * result + ((this.hpNo==null)?0:this.hpNo.hashCode());
		result= prime * result + ((this.metMbhNm==null)?0:this.metMbhNm.hashCode());
		result= prime * result + ((this.metPtcpStcd==null)?0:this.metPtcpStcd.hashCode());
		result= prime * result + ((this.metMbhDis==null)?0:this.metMbhDis.hashCode());
		result= prime * result + ((this.metSecLrgDt==null)?0:this.metSecLrgDt.hashCode());
		result= prime * result + ((this.metSecLrgTm==null)?0:this.metSecLrgTm.hashCode());
		result= prime * result + ((this.metSecLrgVldEndDt==null)?0:this.metSecLrgVldEndDt.hashCode());
		result= prime * result + ((this.metSecLrgVldEndTm==null)?0:this.metSecLrgVldEndTm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokTpyMbhInfInq_DODT other= (MetPbokTpyMbhInfInq_DODT)obj;
		{
			Object _hpNo= getHpNo();
			Object __hpNo= other.getHpNo();
			if ( _hpNo== null ) { if ( __hpNo!= null ) return false; }
			else if ( !_hpNo.equals(__hpNo) ) return false;
		}
		{
			Object _metMbhNm= getMetMbhNm();
			Object __metMbhNm= other.getMetMbhNm();
			if ( _metMbhNm== null ) { if ( __metMbhNm!= null ) return false; }
			else if ( !_metMbhNm.equals(__metMbhNm) ) return false;
		}
		{
			Object _metPtcpStcd= getMetPtcpStcd();
			Object __metPtcpStcd= other.getMetPtcpStcd();
			if ( _metPtcpStcd== null ) { if ( __metPtcpStcd!= null ) return false; }
			else if ( !_metPtcpStcd.equals(__metPtcpStcd) ) return false;
		}
		{
			Object _metMbhDis= getMetMbhDis();
			Object __metMbhDis= other.getMetMbhDis();
			if ( _metMbhDis== null ) { if ( __metMbhDis!= null ) return false; }
			else if ( !_metMbhDis.equals(__metMbhDis) ) return false;
		}
		{
			Object _metSecLrgDt= getMetSecLrgDt();
			Object __metSecLrgDt= other.getMetSecLrgDt();
			if ( _metSecLrgDt== null ) { if ( __metSecLrgDt!= null ) return false; }
			else if ( !_metSecLrgDt.equals(__metSecLrgDt) ) return false;
		}
		{
			Object _metSecLrgTm= getMetSecLrgTm();
			Object __metSecLrgTm= other.getMetSecLrgTm();
			if ( _metSecLrgTm== null ) { if ( __metSecLrgTm!= null ) return false; }
			else if ( !_metSecLrgTm.equals(__metSecLrgTm) ) return false;
		}
		{
			Object _metSecLrgVldEndDt= getMetSecLrgVldEndDt();
			Object __metSecLrgVldEndDt= other.getMetSecLrgVldEndDt();
			if ( _metSecLrgVldEndDt== null ) { if ( __metSecLrgVldEndDt!= null ) return false; }
			else if ( !_metSecLrgVldEndDt.equals(__metSecLrgVldEndDt) ) return false;
		}
		{
			Object _metSecLrgVldEndTm= getMetSecLrgVldEndTm();
			Object __metSecLrgVldEndTm= other.getMetSecLrgVldEndTm();
			if ( _metSecLrgVldEndTm== null ) { if ( __metSecLrgVldEndTm!= null ) return false; }
			else if ( !_metSecLrgVldEndTm.equals(__metSecLrgVldEndTm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokTpyMbhInfInq_DODT.class.getName()).append(":\n");
		sb.append("\thpNo: ");
		sb.append(hpNo==null?"null":getHpNo());
		sb.append("\n");
		sb.append("\tmetMbhNm: ");
		sb.append(metMbhNm==null?"null":getMetMbhNm());
		sb.append("\n");
		sb.append("\tmetPtcpStcd: ");
		sb.append(metPtcpStcd==null?"null":getMetPtcpStcd());
		sb.append("\n");
		sb.append("\tmetMbhDis: ");
		sb.append(metMbhDis==null?"null":getMetMbhDis());
		sb.append("\n");
		sb.append("\tmetSecLrgDt: ");
		sb.append(metSecLrgDt==null?"null":getMetSecLrgDt());
		sb.append("\n");
		sb.append("\tmetSecLrgTm: ");
		sb.append(metSecLrgTm==null?"null":getMetSecLrgTm());
		sb.append("\n");
		sb.append("\tmetSecLrgVldEndDt: ");
		sb.append(metSecLrgVldEndDt==null?"null":getMetSecLrgVldEndDt());
		sb.append("\n");
		sb.append("\tmetSecLrgVldEndTm: ");
		sb.append(metSecLrgVldEndTm==null?"null":getMetSecLrgVldEndTm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 14; /* hpNo */
		messageLen+= 50; /* metMbhNm */
		messageLen+= 2; /* metPtcpStcd */
		messageLen+= 1; /* metMbhDis */
		messageLen+= 8; /* metSecLrgDt */
		messageLen+= 6; /* metSecLrgTm */
		messageLen+= 8; /* metSecLrgVldEndDt */
		messageLen+= 6; /* metSecLrgVldEndTm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("hpNo");
		list.add("metMbhNm");
		list.add("metPtcpStcd");
		list.add("metMbhDis");
		list.add("metSecLrgDt");
		list.add("metSecLrgTm");
		list.add("metSecLrgVldEndDt");
		list.add("metSecLrgVldEndTm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("hpNo", get("hpNo"));
		map.put("metMbhNm", get("metMbhNm"));
		map.put("metPtcpStcd", get("metPtcpStcd"));
		map.put("metMbhDis", get("metMbhDis"));
		map.put("metSecLrgDt", get("metSecLrgDt"));
		map.put("metSecLrgTm", get("metSecLrgTm"));
		map.put("metSecLrgVldEndDt", get("metSecLrgVldEndDt"));
		map.put("metSecLrgVldEndTm", get("metSecLrgVldEndTm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3208425:/* hpNo */
			return getHpNo();
		case -468528618:/* metMbhNm */
			return getMetMbhNm();
		case 323907983:/* metPtcpStcd */
			return getMetPtcpStcd();
		case -1639494889:/* metMbhDis */
			return getMetMbhDis();
		case 797381692:/* metSecLrgDt */
			return getMetSecLrgDt();
		case 797382181:/* metSecLrgTm */
			return getMetSecLrgTm();
		case -433735255:/* metSecLrgVldEndDt */
			return getMetSecLrgVldEndDt();
		case -433734766:/* metSecLrgVldEndTm */
			return getMetSecLrgVldEndTm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3208425:/* hpNo */
			setHpNo((String)value);
			break;
		case -468528618:/* metMbhNm */
			setMetMbhNm((String)value);
			break;
		case 323907983:/* metPtcpStcd */
			setMetPtcpStcd((String)value);
			break;
		case -1639494889:/* metMbhDis */
			setMetMbhDis((String)value);
			break;
		case 797381692:/* metSecLrgDt */
			setMetSecLrgDt((String)value);
			break;
		case 797382181:/* metSecLrgTm */
			setMetSecLrgTm((String)value);
			break;
		case -433735255:/* metSecLrgVldEndDt */
			setMetSecLrgVldEndDt((String)value);
			break;
		case -433734766:/* metSecLrgVldEndTm */
			setMetSecLrgVldEndTm((String)value);
			break;
		default:
			break;
		}
	}
	
}
