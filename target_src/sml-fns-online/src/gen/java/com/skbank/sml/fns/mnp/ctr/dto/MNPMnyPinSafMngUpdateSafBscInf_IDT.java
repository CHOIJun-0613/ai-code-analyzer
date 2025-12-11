/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.ctr.dto;

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
	"dpsInpAcno", "alsNm", "iconDscd"
}, name="MNPMnyPinSafMngUpdateSafBscInf_IDT")
@XmlRootElement(name="MNPMnyPinSafMngUpdateSafBscInf_IDT")
@BxmCategory(logicalName="머니클립금고기본정보수정.입력.IO", description="") 
public class MNPMnyPinSafMngUpdateSafBscInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -706243671L;
	
	
	
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
	 * 별칭명
	 */
	@ApiModelProperty(
		name = "alsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("alsNm")
	@BxmOmm_Field(length=50, decimal=0, description="별칭명", align="left", fill="")
	private String alsNm= "";
	
	
	/**
	 * 아이콘구분코드
	 */
	@ApiModelProperty(
		name = "iconDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("iconDscd")
	@BxmOmm_Field(length=3, decimal=0, description="아이콘구분코드", align="left", fill="")
	private String iconDscd= "";
	
	
	
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
	private boolean isSet_alsNm= false;
	protected final boolean isSet_alsNm(){
		return this.isSet_alsNm;
	}
	private void setIsSet_alsNm(boolean value){
		this.isSet_alsNm= value;
	}
	/**
	 * 별칭명
	 */
	@XmlTransient
	public String getAlsNm(){
		return this.alsNm;
	}
	
	/**
	 * 별칭명
	 * 
	 * @param alsNm 별칭명
	 */
	public void setAlsNm(String alsNm){
		this.alsNm= alsNm;
		this.setIsSet_alsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iconDscd= false;
	protected final boolean isSet_iconDscd(){
		return this.isSet_iconDscd;
	}
	private void setIsSet_iconDscd(boolean value){
		this.isSet_iconDscd= value;
	}
	/**
	 * 아이콘구분코드
	 */
	@XmlTransient
	public String getIconDscd(){
		return this.iconDscd;
	}
	
	/**
	 * 아이콘구분코드
	 * 
	 * @param iconDscd 아이콘구분코드
	 */
	public void setIconDscd(String iconDscd){
		this.iconDscd= iconDscd;
		this.setIsSet_iconDscd(true);
	}
				
	@Override
	public MNPMnyPinSafMngUpdateSafBscInf_IDT clone(){
		try{
			MNPMnyPinSafMngUpdateSafBscInf_IDT object= (MNPMnyPinSafMngUpdateSafBscInf_IDT)super.clone();
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
		
		result= prime * result + ((this.dpsInpAcno==null)?0:this.dpsInpAcno.hashCode());
		result= prime * result + ((this.alsNm==null)?0:this.alsNm.hashCode());
		result= prime * result + ((this.iconDscd==null)?0:this.iconDscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinSafMngUpdateSafBscInf_IDT other= (MNPMnyPinSafMngUpdateSafBscInf_IDT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _alsNm= getAlsNm();
			Object __alsNm= other.getAlsNm();
			if ( _alsNm== null ) { if ( __alsNm!= null ) return false; }
			else if ( !_alsNm.equals(__alsNm) ) return false;
		}
		{
			Object _iconDscd= getIconDscd();
			Object __iconDscd= other.getIconDscd();
			if ( _iconDscd== null ) { if ( __iconDscd!= null ) return false; }
			else if ( !_iconDscd.equals(__iconDscd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinSafMngUpdateSafBscInf_IDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\talsNm: ");
		sb.append(alsNm==null?"null":getAlsNm());
		sb.append("\n");
		sb.append("\ticonDscd: ");
		sb.append(iconDscd==null?"null":getIconDscd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 50; /* alsNm */
		messageLen+= 3; /* iconDscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsInpAcno");
		list.add("alsNm");
		list.add("iconDscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("alsNm", get("alsNm"));
		map.put("iconDscd", get("iconDscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case 92912007:/* alsNm */
			return getAlsNm();
		case -738394807:/* iconDscd */
			return getIconDscd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			setDpsInpAcno((String)value);
			break;
		case 92912007:/* alsNm */
			setAlsNm((String)value);
			break;
		case -738394807:/* iconDscd */
			setIconDscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
