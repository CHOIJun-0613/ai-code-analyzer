/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

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
 * 투자전략 동의 여부 IO
 */
@XmlType(propOrder={
	"evtDis", "evtNm", "userId", "ngItgCsno", "supNm", "supDis"
}, name="UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT")
@XmlRootElement(name="UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT")
@BxmCategory(logicalName="투자전략.동의여부.DBM.입력.IO", description="투자전략 동의 여부 IO") 
public class UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1046988099L;
	
	
	
	/**
	 * 이벤트구분번호
	 */
	@ApiModelProperty(
		name = "evtDis"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("evtDis")
	@BxmOmm_Field(length=11, decimal=0, description="이벤트구분번호", align="right", fill="")
	private Integer evtDis= 0;
	
	
	/**
	 * 행사명
	 */
	@ApiModelProperty(
		name = "evtNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("evtNm")
	@BxmOmm_Field(length=120, decimal=0, description="행사명", align="left", fill="")
	private String evtNm= "";
	
	
	/**
	 * 사용자ID
	 */
	@ApiModelProperty(
		name = "userId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("userId")
	@BxmOmm_Field(length=320, decimal=0, description="사용자ID", align="left", fill="")
	private String userId= "";
	
	
	/**
	 * 차세대통합고객번호
	 */
	@ApiModelProperty(
		name = "ngItgCsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ngItgCsno")
	@BxmOmm_Field(length=13, decimal=0, description="차세대통합고객번호", align="left", fill="")
	private String ngItgCsno= "";
	
	
	/**
	 * 지원명
	 */
	@ApiModelProperty(
		name = "supNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("supNm")
	@BxmOmm_Field(length=40, decimal=0, description="지원명", align="left", fill="")
	private String supNm= "";
	
	
	/**
	 * 지원구분번호 
	 */
	@ApiModelProperty(
		name = "supDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("supDis")
	@BxmOmm_Field(length=20, decimal=0, description="지원구분번호 ", align="left", fill="")
	private String supDis= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_evtDis= false;
	protected final boolean isSet_evtDis(){
		return this.isSet_evtDis;
	}
	private void setIsSet_evtDis(boolean value){
		this.isSet_evtDis= value;
	}
	/**
	 * 이벤트구분번호
	 */
	@XmlTransient
	public Integer getEvtDis(){
		return this.evtDis;
	}
	
	/**
	 * 이벤트구분번호
	 * 
	 * @param evtDis 이벤트구분번호
	 */
	public void setEvtDis(Integer evtDis){
		this.evtDis= evtDis;
		this.setIsSet_evtDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_evtNm= false;
	protected final boolean isSet_evtNm(){
		return this.isSet_evtNm;
	}
	private void setIsSet_evtNm(boolean value){
		this.isSet_evtNm= value;
	}
	/**
	 * 행사명
	 */
	@XmlTransient
	public String getEvtNm(){
		return this.evtNm;
	}
	
	/**
	 * 행사명
	 * 
	 * @param evtNm 행사명
	 */
	public void setEvtNm(String evtNm){
		this.evtNm= evtNm;
		this.setIsSet_evtNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_userId= false;
	protected final boolean isSet_userId(){
		return this.isSet_userId;
	}
	private void setIsSet_userId(boolean value){
		this.isSet_userId= value;
	}
	/**
	 * 사용자ID
	 */
	@XmlTransient
	public String getUserId(){
		return this.userId;
	}
	
	/**
	 * 사용자ID
	 * 
	 * @param userId 사용자ID
	 */
	public void setUserId(String userId){
		this.userId= userId;
		this.setIsSet_userId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ngItgCsno= false;
	protected final boolean isSet_ngItgCsno(){
		return this.isSet_ngItgCsno;
	}
	private void setIsSet_ngItgCsno(boolean value){
		this.isSet_ngItgCsno= value;
	}
	/**
	 * 차세대통합고객번호
	 */
	@XmlTransient
	public String getNgItgCsno(){
		return this.ngItgCsno;
	}
	
	/**
	 * 차세대통합고객번호
	 * 
	 * @param ngItgCsno 차세대통합고객번호
	 */
	public void setNgItgCsno(String ngItgCsno){
		this.ngItgCsno= ngItgCsno;
		this.setIsSet_ngItgCsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_supNm= false;
	protected final boolean isSet_supNm(){
		return this.isSet_supNm;
	}
	private void setIsSet_supNm(boolean value){
		this.isSet_supNm= value;
	}
	/**
	 * 지원명
	 */
	@XmlTransient
	public String getSupNm(){
		return this.supNm;
	}
	
	/**
	 * 지원명
	 * 
	 * @param supNm 지원명
	 */
	public void setSupNm(String supNm){
		this.supNm= supNm;
		this.setIsSet_supNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_supDis= false;
	protected final boolean isSet_supDis(){
		return this.isSet_supDis;
	}
	private void setIsSet_supDis(boolean value){
		this.isSet_supDis= value;
	}
	/**
	 * 지원구분번호 
	 */
	@XmlTransient
	public String getSupDis(){
		return this.supDis;
	}
	
	/**
	 * 지원구분번호 
	 * 
	 * @param supDis 지원구분번호 
	 */
	public void setSupDis(String supDis){
		this.supDis= supDis;
		this.setIsSet_supDis(true);
	}
				
	@Override
	public UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT clone(){
		try{
			UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT object= (UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT)super.clone();
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
		
		result= prime * result + ((this.evtDis==null)?0:this.evtDis.hashCode());
		result= prime * result + ((this.evtNm==null)?0:this.evtNm.hashCode());
		result= prime * result + ((this.userId==null)?0:this.userId.hashCode());
		result= prime * result + ((this.ngItgCsno==null)?0:this.ngItgCsno.hashCode());
		result= prime * result + ((this.supNm==null)?0:this.supNm.hashCode());
		result= prime * result + ((this.supDis==null)?0:this.supDis.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT other= (UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT)obj;
		{
			Object _evtDis= getEvtDis();
			Object __evtDis= other.getEvtDis();
			if ( _evtDis== null ) { if ( __evtDis!= null ) return false; }
			else if ( !_evtDis.equals(__evtDis) ) return false;
		}
		{
			Object _evtNm= getEvtNm();
			Object __evtNm= other.getEvtNm();
			if ( _evtNm== null ) { if ( __evtNm!= null ) return false; }
			else if ( !_evtNm.equals(__evtNm) ) return false;
		}
		{
			Object _userId= getUserId();
			Object __userId= other.getUserId();
			if ( _userId== null ) { if ( __userId!= null ) return false; }
			else if ( !_userId.equals(__userId) ) return false;
		}
		{
			Object _ngItgCsno= getNgItgCsno();
			Object __ngItgCsno= other.getNgItgCsno();
			if ( _ngItgCsno== null ) { if ( __ngItgCsno!= null ) return false; }
			else if ( !_ngItgCsno.equals(__ngItgCsno) ) return false;
		}
		{
			Object _supNm= getSupNm();
			Object __supNm= other.getSupNm();
			if ( _supNm== null ) { if ( __supNm!= null ) return false; }
			else if ( !_supNm.equals(__supNm) ) return false;
		}
		{
			Object _supDis= getSupDis();
			Object __supDis= other.getSupDis();
			if ( _supDis== null ) { if ( __supDis!= null ) return false; }
			else if ( !_supDis.equals(__supDis) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT.class.getName()).append(":\n");
		sb.append("\tevtDis: ");
		sb.append(evtDis==null?"null":getEvtDis());
		sb.append("\n");
		sb.append("\tevtNm: ");
		sb.append(evtNm==null?"null":getEvtNm());
		sb.append("\n");
		sb.append("\tuserId: ");
		sb.append(userId==null?"null":getUserId());
		sb.append("\n");
		sb.append("\tngItgCsno: ");
		sb.append(ngItgCsno==null?"null":getNgItgCsno());
		sb.append("\n");
		sb.append("\tsupNm: ");
		sb.append(supNm==null?"null":getSupNm());
		sb.append("\n");
		sb.append("\tsupDis: ");
		sb.append(supDis==null?"null":getSupDis());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 11; /* evtDis */
		messageLen+= 120; /* evtNm */
		messageLen+= 320; /* userId */
		messageLen+= 13; /* ngItgCsno */
		messageLen+= 40; /* supNm */
		messageLen+= 20; /* supDis */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("evtDis");
		list.add("evtNm");
		list.add("userId");
		list.add("ngItgCsno");
		list.add("supNm");
		list.add("supDis");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("evtDis", get("evtDis"));
		map.put("evtNm", get("evtNm"));
		map.put("userId", get("userId"));
		map.put("ngItgCsno", get("ngItgCsno"));
		map.put("supNm", get("supNm"));
		map.put("supDis", get("supDis"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1290923093:/* evtDis */
			return getEvtDis();
		case 96904962:/* evtNm */
			return getEvtNm();
		case -836030906:/* userId */
			return getUserId();
		case 1650816244:/* ngItgCsno */
			return getNgItgCsno();
		case 109800621:/* supNm */
			return getSupNm();
		case -891157664:/* supDis */
			return getSupDis();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1290923093:/* evtDis */
			setEvtDis((Integer)value);
			break;
		case 96904962:/* evtNm */
			setEvtNm((String)value);
			break;
		case -836030906:/* userId */
			setUserId((String)value);
			break;
		case 1650816244:/* ngItgCsno */
			setNgItgCsno((String)value);
			break;
		case 109800621:/* supNm */
			setSupNm((String)value);
			break;
		case -891157664:/* supDis */
			setSupDis((String)value);
			break;
		default:
			break;
		}
	}
	
}
