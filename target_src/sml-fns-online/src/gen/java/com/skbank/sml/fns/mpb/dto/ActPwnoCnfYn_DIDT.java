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
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"acno", "actCnPwno"
}, name="ActPwnoCnfYn_DIDT")
@XmlRootElement(name="ActPwnoCnfYn_DIDT")
@BxmCategory(logicalName="계좌.비밀번호.확인.여부.DBM.입력.IO", description="") 
public class ActPwnoCnfYn_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 897921424L;
	
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String acno= "";
	
	
	/**
	 * 계좌비밀번호
	 */
	@ApiModelProperty(
		name = "actCnPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actCnPwno")
	@BxmOmm_Field(length=10, decimal=0, description="계좌비밀번호", align="left", fill="")
	private String actCnPwno= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_acno= false;
	protected final boolean isSet_acno(){
		return this.isSet_acno;
	}
	private void setIsSet_acno(boolean value){
		this.isSet_acno= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAcno(){
		return this.acno;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param acno 계좌번호
	 */
	public void setAcno(String acno){
		this.acno= acno;
		this.setIsSet_acno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actCnPwno= false;
	protected final boolean isSet_actCnPwno(){
		return this.isSet_actCnPwno;
	}
	private void setIsSet_actCnPwno(boolean value){
		this.isSet_actCnPwno= value;
	}
	/**
	 * 계좌비밀번호
	 */
	@XmlTransient
	public String getActCnPwno(){
		return this.actCnPwno;
	}
	
	/**
	 * 계좌비밀번호
	 * 
	 * @param actCnPwno 계좌비밀번호
	 */
	public void setActCnPwno(String actCnPwno){
		this.actCnPwno= actCnPwno;
		this.setIsSet_actCnPwno(true);
	}
				
	@Override
	public ActPwnoCnfYn_DIDT clone(){
		try{
			ActPwnoCnfYn_DIDT object= (ActPwnoCnfYn_DIDT)super.clone();
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
		
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.actCnPwno==null)?0:this.actCnPwno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final ActPwnoCnfYn_DIDT other= (ActPwnoCnfYn_DIDT)obj;
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _actCnPwno= getActCnPwno();
			Object __actCnPwno= other.getActCnPwno();
			if ( _actCnPwno== null ) { if ( __actCnPwno!= null ) return false; }
			else if ( !_actCnPwno.equals(__actCnPwno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(ActPwnoCnfYn_DIDT.class.getName()).append(":\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tactCnPwno: ");
		sb.append(actCnPwno==null?"null":getActCnPwno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* acno */
		messageLen+= 10; /* actCnPwno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("acno");
		list.add("actCnPwno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("acno", get("acno"));
		map.put("actCnPwno", get("actCnPwno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2988387:/* acno */
			return getAcno();
		case -891406267:/* actCnPwno */
			return getActCnPwno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -891406267:/* actCnPwno */
			setActCnPwno((String)value);
			break;
		default:
			break;
		}
	}
	
}
