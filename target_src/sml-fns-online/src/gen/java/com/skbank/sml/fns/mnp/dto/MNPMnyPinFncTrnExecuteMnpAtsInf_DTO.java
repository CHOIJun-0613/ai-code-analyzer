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
	"dpsRgsChgDtcd", "dpsRgsChgDtcdTxt"
}, name="MNPMnyPinFncTrnExecuteMnpAtsInf_DTO")
@XmlRootElement(name="MNPMnyPinFncTrnExecuteMnpAtsInf_DTO")
@BxmCategory(logicalName="머니클립자동이체정보.컴포넌트.공통.출력.IO", description="") 
public class MNPMnyPinFncTrnExecuteMnpAtsInf_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 905069118L;
	
	
	
	/**
	 * 수신등록변경상세코드
	 */
	@ApiModelProperty(
		name = "dpsRgsChgDtcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRgsChgDtcd")
	@BxmOmm_Field(length=3, decimal=0, description="수신등록변경상세코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String dpsRgsChgDtcd= "";
	
	
	/**
	 * 수신등록변경상세코드내용
	 */
	@ApiModelProperty(
		name = "dpsRgsChgDtcdTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRgsChgDtcdTxt")
	@BxmOmm_Field(length=80, decimal=0, description="수신등록변경상세코드내용", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String dpsRgsChgDtcdTxt= "";
	
	
	
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
				
	@Override
	public MNPMnyPinFncTrnExecuteMnpAtsInf_DTO clone(){
		try{
			MNPMnyPinFncTrnExecuteMnpAtsInf_DTO object= (MNPMnyPinFncTrnExecuteMnpAtsInf_DTO)super.clone();
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
		
		result= prime * result + ((this.dpsRgsChgDtcd==null)?0:this.dpsRgsChgDtcd.hashCode());
		result= prime * result + ((this.dpsRgsChgDtcdTxt==null)?0:this.dpsRgsChgDtcdTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinFncTrnExecuteMnpAtsInf_DTO other= (MNPMnyPinFncTrnExecuteMnpAtsInf_DTO)obj;
		{
			Object _dpsRgsChgDtcd= getDpsRgsChgDtcd();
			Object __dpsRgsChgDtcd= other.getDpsRgsChgDtcd();
			if ( _dpsRgsChgDtcd== null ) { if ( __dpsRgsChgDtcd!= null ) return false; }
			else if ( !_dpsRgsChgDtcd.equals(__dpsRgsChgDtcd) ) return false;
		}
		{
			Object _dpsRgsChgDtcdTxt= getDpsRgsChgDtcdTxt();
			Object __dpsRgsChgDtcdTxt= other.getDpsRgsChgDtcdTxt();
			if ( _dpsRgsChgDtcdTxt== null ) { if ( __dpsRgsChgDtcdTxt!= null ) return false; }
			else if ( !_dpsRgsChgDtcdTxt.equals(__dpsRgsChgDtcdTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinFncTrnExecuteMnpAtsInf_DTO.class.getName()).append(":\n");
		sb.append("\tdpsRgsChgDtcd: ");
		sb.append(dpsRgsChgDtcd==null?"null":getDpsRgsChgDtcd());
		sb.append("\n");
		sb.append("\tdpsRgsChgDtcdTxt: ");
		sb.append(dpsRgsChgDtcdTxt==null?"null":getDpsRgsChgDtcdTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 3; /* dpsRgsChgDtcd */
		messageLen+= 80; /* dpsRgsChgDtcdTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsRgsChgDtcd");
		list.add("dpsRgsChgDtcdTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsRgsChgDtcd", get("dpsRgsChgDtcd"));
		map.put("dpsRgsChgDtcdTxt", get("dpsRgsChgDtcdTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1939939652:/* dpsRgsChgDtcd */
			return getDpsRgsChgDtcd();
		case 337846804:/* dpsRgsChgDtcdTxt */
			return getDpsRgsChgDtcdTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1939939652:/* dpsRgsChgDtcd */
			setDpsRgsChgDtcd((String)value);
			break;
		case 337846804:/* dpsRgsChgDtcdTxt */
			setDpsRgsChgDtcdTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
