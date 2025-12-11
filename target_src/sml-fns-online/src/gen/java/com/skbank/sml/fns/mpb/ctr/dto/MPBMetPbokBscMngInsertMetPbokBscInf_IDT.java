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
	"metPbokDscd", "metNm", "dpsInpAcno", "advpeEno", "metDscd", "ancSndDscd", "agmdCollDt", "metBscImgUrlNm", "metMbhImgUrlNm"
}, name="MPBMetPbokBscMngInsertMetPbokBscInf_IDT")
@XmlRootElement(name="MPBMetPbokBscMngInsertMetPbokBscInf_IDT")
@BxmCategory(logicalName="모임.서비스.대표자.정보.등록.컨트롤러.입력.IO", description="") 
public class MPBMetPbokBscMngInsertMetPbokBscInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 858669952L;
	
	
	
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
				
	@Override
	public MPBMetPbokBscMngInsertMetPbokBscInf_IDT clone(){
		try{
			MPBMetPbokBscMngInsertMetPbokBscInf_IDT object= (MPBMetPbokBscMngInsertMetPbokBscInf_IDT)super.clone();
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
		
		result= prime * result + ((this.metPbokDscd==null)?0:this.metPbokDscd.hashCode());
		result= prime * result + ((this.metNm==null)?0:this.metNm.hashCode());
		result= prime * result + ((this.dpsInpAcno==null)?0:this.dpsInpAcno.hashCode());
		result= prime * result + ((this.advpeEno==null)?0:this.advpeEno.hashCode());
		result= prime * result + ((this.metDscd==null)?0:this.metDscd.hashCode());
		result= prime * result + ((this.ancSndDscd==null)?0:this.ancSndDscd.hashCode());
		result= prime * result + ((this.agmdCollDt==null)?0:this.agmdCollDt.hashCode());
		result= prime * result + ((this.metBscImgUrlNm==null)?0:this.metBscImgUrlNm.hashCode());
		result= prime * result + ((this.metMbhImgUrlNm==null)?0:this.metMbhImgUrlNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngInsertMetPbokBscInf_IDT other= (MPBMetPbokBscMngInsertMetPbokBscInf_IDT)obj;
		{
			Object _metPbokDscd= getMetPbokDscd();
			Object __metPbokDscd= other.getMetPbokDscd();
			if ( _metPbokDscd== null ) { if ( __metPbokDscd!= null ) return false; }
			else if ( !_metPbokDscd.equals(__metPbokDscd) ) return false;
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
			Object _advpeEno= getAdvpeEno();
			Object __advpeEno= other.getAdvpeEno();
			if ( _advpeEno== null ) { if ( __advpeEno!= null ) return false; }
			else if ( !_advpeEno.equals(__advpeEno) ) return false;
		}
		{
			Object _metDscd= getMetDscd();
			Object __metDscd= other.getMetDscd();
			if ( _metDscd== null ) { if ( __metDscd!= null ) return false; }
			else if ( !_metDscd.equals(__metDscd) ) return false;
		}
		{
			Object _ancSndDscd= getAncSndDscd();
			Object __ancSndDscd= other.getAncSndDscd();
			if ( _ancSndDscd== null ) { if ( __ancSndDscd!= null ) return false; }
			else if ( !_ancSndDscd.equals(__ancSndDscd) ) return false;
		}
		{
			Object _agmdCollDt= getAgmdCollDt();
			Object __agmdCollDt= other.getAgmdCollDt();
			if ( _agmdCollDt== null ) { if ( __agmdCollDt!= null ) return false; }
			else if ( !_agmdCollDt.equals(__agmdCollDt) ) return false;
		}
		{
			Object _metBscImgUrlNm= getMetBscImgUrlNm();
			Object __metBscImgUrlNm= other.getMetBscImgUrlNm();
			if ( _metBscImgUrlNm== null ) { if ( __metBscImgUrlNm!= null ) return false; }
			else if ( !_metBscImgUrlNm.equals(__metBscImgUrlNm) ) return false;
		}
		{
			Object _metMbhImgUrlNm= getMetMbhImgUrlNm();
			Object __metMbhImgUrlNm= other.getMetMbhImgUrlNm();
			if ( _metMbhImgUrlNm== null ) { if ( __metMbhImgUrlNm!= null ) return false; }
			else if ( !_metMbhImgUrlNm.equals(__metMbhImgUrlNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngInsertMetPbokBscInf_IDT.class.getName()).append(":\n");
		sb.append("\tmetPbokDscd: ");
		sb.append(metPbokDscd==null?"null":getMetPbokDscd());
		sb.append("\n");
		sb.append("\tmetNm: ");
		sb.append(metNm==null?"null":getMetNm());
		sb.append("\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\tadvpeEno: ");
		sb.append(advpeEno==null?"null":getAdvpeEno());
		sb.append("\n");
		sb.append("\tmetDscd: ");
		sb.append(metDscd==null?"null":getMetDscd());
		sb.append("\n");
		sb.append("\tancSndDscd: ");
		sb.append(ancSndDscd==null?"null":getAncSndDscd());
		sb.append("\n");
		sb.append("\tagmdCollDt: ");
		sb.append(agmdCollDt==null?"null":getAgmdCollDt());
		sb.append("\n");
		sb.append("\tmetBscImgUrlNm: ");
		sb.append(metBscImgUrlNm==null?"null":getMetBscImgUrlNm());
		sb.append("\n");
		sb.append("\tmetMbhImgUrlNm: ");
		sb.append(metMbhImgUrlNm==null?"null":getMetMbhImgUrlNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metPbokDscd */
		messageLen+= 100; /* metNm */
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 8; /* advpeEno */
		messageLen+= 2; /* metDscd */
		messageLen+= 1; /* ancSndDscd */
		messageLen+= 8; /* agmdCollDt */
		messageLen+= 100; /* metBscImgUrlNm */
		messageLen+= 100; /* metMbhImgUrlNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metPbokDscd");
		list.add("metNm");
		list.add("dpsInpAcno");
		list.add("advpeEno");
		list.add("metDscd");
		list.add("ancSndDscd");
		list.add("agmdCollDt");
		list.add("metBscImgUrlNm");
		list.add("metMbhImgUrlNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metPbokDscd", get("metPbokDscd"));
		map.put("metNm", get("metNm"));
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("advpeEno", get("advpeEno"));
		map.put("metDscd", get("metDscd"));
		map.put("ancSndDscd", get("ancSndDscd"));
		map.put("agmdCollDt", get("agmdCollDt"));
		map.put("metBscImgUrlNm", get("metBscImgUrlNm"));
		map.put("metMbhImgUrlNm", get("metMbhImgUrlNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1867195290:/* metPbokDscd */
			return getMetPbokDscd();
		case 103786683:/* metNm */
			return getMetNm();
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case -705281570:/* advpeEno */
			return getAdvpeEno();
		case 954465580:/* metDscd */
			return getMetDscd();
		case 1498154883:/* ancSndDscd */
			return getAncSndDscd();
		case -1798348999:/* agmdCollDt */
			return getAgmdCollDt();
		case 300784225:/* metBscImgUrlNm */
			return getMetBscImgUrlNm();
		case 607580322:/* metMbhImgUrlNm */
			return getMetMbhImgUrlNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1867195290:/* metPbokDscd */
			setMetPbokDscd((String)value);
			break;
		case 103786683:/* metNm */
			setMetNm((String)value);
			break;
		case -865257337:/* dpsInpAcno */
			setDpsInpAcno((String)value);
			break;
		case -705281570:/* advpeEno */
			setAdvpeEno((String)value);
			break;
		case 954465580:/* metDscd */
			setMetDscd((String)value);
			break;
		case 1498154883:/* ancSndDscd */
			setAncSndDscd((String)value);
			break;
		case -1798348999:/* agmdCollDt */
			setAgmdCollDt((String)value);
			break;
		case 300784225:/* metBscImgUrlNm */
			setMetBscImgUrlNm((String)value);
			break;
		case 607580322:/* metMbhImgUrlNm */
			setMetMbhImgUrlNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
