/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.ctr.dto;

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
	"itcsno", "acno", "agrtDscd", "agrtAgrYn"
}, name="PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT")
@XmlRootElement(name="PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT")
@BxmCategory(logicalName="통장.분리.회원가입.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 2138633223L;
	
	
	
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
	 * 약관구분코드
	 */
	@ApiModelProperty(
		name = "agrtDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agrtDscd")
	@BxmOmm_Field(length=2, decimal=0, description="약관구분코드", align="left", fill="")
	private String agrtDscd= "";
	
	
	/**
	 * 약관동의여부
	 */
	@ApiModelProperty(
		name = "agrtAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agrtAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="약관동의여부", align="left", fill="")
	private String agrtAgrYn= "";
	
	
	
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
	private boolean isSet_agrtDscd= false;
	protected final boolean isSet_agrtDscd(){
		return this.isSet_agrtDscd;
	}
	private void setIsSet_agrtDscd(boolean value){
		this.isSet_agrtDscd= value;
	}
	/**
	 * 약관구분코드
	 */
	@XmlTransient
	public String getAgrtDscd(){
		return this.agrtDscd;
	}
	
	/**
	 * 약관구분코드
	 * 
	 * @param agrtDscd 약관구분코드
	 */
	public void setAgrtDscd(String agrtDscd){
		this.agrtDscd= agrtDscd;
		this.setIsSet_agrtDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agrtAgrYn= false;
	protected final boolean isSet_agrtAgrYn(){
		return this.isSet_agrtAgrYn;
	}
	private void setIsSet_agrtAgrYn(boolean value){
		this.isSet_agrtAgrYn= value;
	}
	/**
	 * 약관동의여부
	 */
	@XmlTransient
	public String getAgrtAgrYn(){
		return this.agrtAgrYn;
	}
	
	/**
	 * 약관동의여부
	 * 
	 * @param agrtAgrYn 약관동의여부
	 */
	public void setAgrtAgrYn(String agrtAgrYn){
		this.agrtAgrYn= agrtAgrYn;
		this.setIsSet_agrtAgrYn(true);
	}
				
	@Override
	public PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT clone(){
		try{
			PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT object= (PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT)super.clone();
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
		
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.agrtDscd==null)?0:this.agrtDscd.hashCode());
		result= prime * result + ((this.agrtAgrYn==null)?0:this.agrtAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT other= (PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _agrtDscd= getAgrtDscd();
			Object __agrtDscd= other.getAgrtDscd();
			if ( _agrtDscd== null ) { if ( __agrtDscd!= null ) return false; }
			else if ( !_agrtDscd.equals(__agrtDscd) ) return false;
		}
		{
			Object _agrtAgrYn= getAgrtAgrYn();
			Object __agrtAgrYn= other.getAgrtAgrYn();
			if ( _agrtAgrYn== null ) { if ( __agrtAgrYn!= null ) return false; }
			else if ( !_agrtAgrYn.equals(__agrtAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngInsertPboksprnmbhJnng_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tagrtDscd: ");
		sb.append(agrtDscd==null?"null":getAgrtDscd());
		sb.append("\n");
		sb.append("\tagrtAgrYn: ");
		sb.append(agrtAgrYn==null?"null":getAgrtAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 20; /* acno */
		messageLen+= 2; /* agrtDscd */
		messageLen+= 1; /* agrtAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("acno");
		list.add("agrtDscd");
		list.add("agrtAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("acno", get("acno"));
		map.put("agrtDscd", get("agrtDscd"));
		map.put("agrtAgrYn", get("agrtAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 2988387:/* acno */
			return getAcno();
		case 1845467704:/* agrtDscd */
			return getAgrtDscd();
		case 1371810105:/* agrtAgrYn */
			return getAgrtAgrYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case 1845467704:/* agrtDscd */
			setAgrtDscd((String)value);
			break;
		case 1371810105:/* agrtAgrYn */
			setAgrtAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
