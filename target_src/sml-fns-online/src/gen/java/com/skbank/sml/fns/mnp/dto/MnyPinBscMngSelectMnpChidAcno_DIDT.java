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
	"inqDscd", "dpsInpAcno"
}, name="MnyPinBscMngSelectMnpChidAcno_DIDT")
@XmlRootElement(name="MnyPinBscMngSelectMnpChidAcno_DIDT")
@BxmCategory(logicalName="머니클립.자.계좌.조회.컴포넌트.입력.IO", description="") 
public class MnyPinBscMngSelectMnpChidAcno_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 916172525L;
	
	
	
	/**
	 * 조회구분코드
	 */
	@ApiModelProperty(
		name = "inqDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqDscd")
	@BxmOmm_Field(length=3, decimal=0, description="조회구분코드", align="left", fill="")
	private String inqDscd= "";
	
	
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
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqDscd= false;
	protected final boolean isSet_inqDscd(){
		return this.isSet_inqDscd;
	}
	private void setIsSet_inqDscd(boolean value){
		this.isSet_inqDscd= value;
	}
	/**
	 * 조회구분코드
	 */
	@XmlTransient
	public String getInqDscd(){
		return this.inqDscd;
	}
	
	/**
	 * 조회구분코드
	 * 
	 * @param inqDscd 조회구분코드
	 */
	public void setInqDscd(String inqDscd){
		this.inqDscd= inqDscd;
		this.setIsSet_inqDscd(true);
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
				
	@Override
	public MnyPinBscMngSelectMnpChidAcno_DIDT clone(){
		try{
			MnyPinBscMngSelectMnpChidAcno_DIDT object= (MnyPinBscMngSelectMnpChidAcno_DIDT)super.clone();
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
		
		result= prime * result + ((this.inqDscd==null)?0:this.inqDscd.hashCode());
		result= prime * result + ((this.dpsInpAcno==null)?0:this.dpsInpAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinBscMngSelectMnpChidAcno_DIDT other= (MnyPinBscMngSelectMnpChidAcno_DIDT)obj;
		{
			Object _inqDscd= getInqDscd();
			Object __inqDscd= other.getInqDscd();
			if ( _inqDscd== null ) { if ( __inqDscd!= null ) return false; }
			else if ( !_inqDscd.equals(__inqDscd) ) return false;
		}
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MnyPinBscMngSelectMnpChidAcno_DIDT.class.getName()).append(":\n");
		sb.append("\tinqDscd: ");
		sb.append(inqDscd==null?"null":getInqDscd());
		sb.append("\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 3; /* inqDscd */
		messageLen+= 15; /* dpsInpAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("inqDscd");
		list.add("dpsInpAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("inqDscd", get("inqDscd"));
		map.put("dpsInpAcno", get("dpsInpAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1954309948:/* inqDscd */
			return getInqDscd();
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1954309948:/* inqDscd */
			setInqDscd((String)value);
			break;
		case -865257337:/* dpsInpAcno */
			setDpsInpAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
