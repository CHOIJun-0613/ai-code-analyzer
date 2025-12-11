/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.adapter.DateToStringAdapter;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 틴틴 오늘의 급식 알림 동의 여부 수정DIDT
 */
@XmlType(propOrder={
	"cusCiNo", "chgDh", "alarmYn", "itcsno"
}, name="UCM_PP_SCHUL_INFOupdateTeenTeenPvmNtfcAgrYn_DIDT")
@XmlRootElement(name="UCM_PP_SCHUL_INFOupdateTeenTeenPvmNtfcAgrYn_DIDT")
@BxmCategory(logicalName="틴틴오늘의급식알림동의여부수정DIDT", description="틴틴 오늘의 급식 알림 동의 여부 수정DIDT") 
public class UCM_PP_SCHUL_INFOupdateTeenTeenPvmNtfcAgrYn_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1964294323L;
	
	private static class DateToStringAdapter_chgDh 
	extends DateToStringAdapter{
		private DateToStringAdapter_chgDh(){
			super("yyyyMMdd hh:mm:ss");
		}
	}
	@JsonIgnore
	transient private DateToStringAdapter_chgDh chgDhAdapter= new DateToStringAdapter_chgDh();
	
	
	
	/**
	 * 고객CI번호
	 */
	@ApiModelProperty(
		name = "cusCiNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusCiNo")
	@BxmOmm_Field(length=88, decimal=0, description="고객CI번호", align="left", fill="")
	private String cusCiNo= "";
	
	
	/**
	 * 변경일시
	 */
	@ApiModelProperty(
		name = "chgDh"
		, dataType = "java.util.Date"
		)
	@XmlJavaTypeAdapter(value=DateToStringAdapter_chgDh.class)
	@JsonProperty("chgDh")
	@BxmOmm_Field(length=12, decimal=6, description="변경일시", align="left", fill="", formatType="date", format="yyyyMMdd hh:mm:ss")
	private Date chgDh= null;
	
	
	/**
	 * 알림여부
	 */
	@ApiModelProperty(
		name = "alarmYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("alarmYn")
	@BxmOmm_Field(length=1, decimal=0, description="알림여부", align="left", fill="")
	private String alarmYn= "";
	
	
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
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusCiNo= false;
	protected final boolean isSet_cusCiNo(){
		return this.isSet_cusCiNo;
	}
	private void setIsSet_cusCiNo(boolean value){
		this.isSet_cusCiNo= value;
	}
	/**
	 * 고객CI번호
	 */
	@XmlTransient
	public String getCusCiNo(){
		return this.cusCiNo;
	}
	
	/**
	 * 고객CI번호
	 * 
	 * @param cusCiNo 고객CI번호
	 */
	public void setCusCiNo(String cusCiNo){
		this.cusCiNo= cusCiNo;
		this.setIsSet_cusCiNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chgDh= false;
	protected final boolean isSet_chgDh(){
		return this.isSet_chgDh;
	}
	private void setIsSet_chgDh(boolean value){
		this.isSet_chgDh= value;
	}
	@JsonSetter("chgDh")
	private void setChgDhForJson(String value){
		try{
			this.chgDh= chgDhAdapter.unmarshal(value);
			this.setIsSet_chgDh(true);
		}
		catch(Exception e){
			throw new IllegalArgumentException("Invalid value : "+ value, e);
		}
	}
	
	@JsonGetter("chgDh")
	private String getChgDhForJson(){
		return this.chgDhAdapter.marshal(chgDh);
	}
	/**
	 * 변경일시
	 */
	@XmlTransient
	public Date getChgDh(){
		return this.chgDh;
	}
	
	/**
	 * 변경일시
	 * 
	 * @param chgDh 변경일시
	 */
	public void setChgDh(Date chgDh){
		this.chgDh= chgDh;
		this.setIsSet_chgDh(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_alarmYn= false;
	protected final boolean isSet_alarmYn(){
		return this.isSet_alarmYn;
	}
	private void setIsSet_alarmYn(boolean value){
		this.isSet_alarmYn= value;
	}
	/**
	 * 알림여부
	 */
	@XmlTransient
	public String getAlarmYn(){
		return this.alarmYn;
	}
	
	/**
	 * 알림여부
	 * 
	 * @param alarmYn 알림여부
	 */
	public void setAlarmYn(String alarmYn){
		this.alarmYn= alarmYn;
		this.setIsSet_alarmYn(true);
	}
	
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
				
	@Override
	public UCM_PP_SCHUL_INFOupdateTeenTeenPvmNtfcAgrYn_DIDT clone(){
		try{
			UCM_PP_SCHUL_INFOupdateTeenTeenPvmNtfcAgrYn_DIDT object= (UCM_PP_SCHUL_INFOupdateTeenTeenPvmNtfcAgrYn_DIDT)super.clone();
			if ( this.chgDh== null ) object.chgDh= null;
			else object.chgDh= (Date)this.chgDh.clone();
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
		
		result= prime * result + ((this.cusCiNo==null)?0:this.cusCiNo.hashCode());
		result= prime * result + ((this.chgDh==null)?0:this.chgDh.hashCode());
		result= prime * result + ((this.alarmYn==null)?0:this.alarmYn.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final UCM_PP_SCHUL_INFOupdateTeenTeenPvmNtfcAgrYn_DIDT other= (UCM_PP_SCHUL_INFOupdateTeenTeenPvmNtfcAgrYn_DIDT)obj;
		{
			Object _cusCiNo= getCusCiNo();
			Object __cusCiNo= other.getCusCiNo();
			if ( _cusCiNo== null ) { if ( __cusCiNo!= null ) return false; }
			else if ( !_cusCiNo.equals(__cusCiNo) ) return false;
		}
		{
			Object _chgDh= getChgDh();
			Object __chgDh= other.getChgDh();
			if ( _chgDh== null ) { if ( __chgDh!= null ) return false; }
			else if ( !_chgDh.equals(__chgDh) ) return false;
		}
		{
			Object _alarmYn= getAlarmYn();
			Object __alarmYn= other.getAlarmYn();
			if ( _alarmYn== null ) { if ( __alarmYn!= null ) return false; }
			else if ( !_alarmYn.equals(__alarmYn) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(UCM_PP_SCHUL_INFOupdateTeenTeenPvmNtfcAgrYn_DIDT.class.getName()).append(":\n");
		sb.append("\tcusCiNo: ");
		sb.append(cusCiNo==null?"null":getCusCiNo());
		sb.append("\n");
		sb.append("\tchgDh: ");
		sb.append(chgDh==null?"null":getChgDh());
		sb.append("\n");
		sb.append("\talarmYn: ");
		sb.append(alarmYn==null?"null":getAlarmYn());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 88; /* cusCiNo */
		messageLen+= 12; /* chgDh */
		messageLen+= 1; /* alarmYn */
		messageLen+= 36; /* itcsno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("cusCiNo");
		list.add("chgDh");
		list.add("alarmYn");
		list.add("itcsno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("cusCiNo", get("cusCiNo"));
		map.put("chgDh", get("chgDh"));
		map.put("alarmYn", get("alarmYn"));
		map.put("itcsno", get("itcsno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1126466216:/* cusCiNo */
			return getCusCiNo();
		case 94628038:/* chgDh */
			return getChgDh();
		case -921422522:/* alarmYn */
			return getAlarmYn();
		case -1178714660:/* itcsno */
			return getItcsno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1126466216:/* cusCiNo */
			setCusCiNo((String)value);
			break;
		case 94628038:/* chgDh */
			setChgDh((Date)value);
			break;
		case -921422522:/* alarmYn */
			setAlarmYn((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		default:
			break;
		}
	}
	
}
