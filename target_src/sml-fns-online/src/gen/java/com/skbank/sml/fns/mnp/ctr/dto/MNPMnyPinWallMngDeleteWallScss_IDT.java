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
	"cancAcno", "dpacBal", "rcvAcno"
}, name="MNPMnyPinWallMngDeleteWallScss_IDT")
@XmlRootElement(name="MNPMnyPinWallMngDeleteWallScss_IDT")
@BxmCategory(logicalName="머니클립.금고.해지.컨트롤러.입력.IO", description="") 
public class MNPMnyPinWallMngDeleteWallScss_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -885139014L;
	
	
	
	/**
	 * 해지계좌번호
	 */
	@ApiModelProperty(
		name = "cancAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cancAcno")
	@BxmOmm_Field(length=20, decimal=0, description="해지계좌번호", align="left", fill="")
	private String cancAcno= "";
	
	
	/**
	 * 수신계좌잔액
	 */
	@ApiModelProperty(
		name = "dpacBal"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpacBal")
	@BxmOmm_Field(length=64, decimal=0, description="수신계좌잔액", align="left", fill="")
	private String dpacBal= "";
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=30, decimal=0, description="입금계좌번호", align="left", fill="")
	private String rcvAcno= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cancAcno= false;
	protected final boolean isSet_cancAcno(){
		return this.isSet_cancAcno;
	}
	private void setIsSet_cancAcno(boolean value){
		this.isSet_cancAcno= value;
	}
	/**
	 * 해지계좌번호
	 */
	@XmlTransient
	public String getCancAcno(){
		return this.cancAcno;
	}
	
	/**
	 * 해지계좌번호
	 * 
	 * @param cancAcno 해지계좌번호
	 */
	public void setCancAcno(String cancAcno){
		this.cancAcno= cancAcno;
		this.setIsSet_cancAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpacBal= false;
	protected final boolean isSet_dpacBal(){
		return this.isSet_dpacBal;
	}
	private void setIsSet_dpacBal(boolean value){
		this.isSet_dpacBal= value;
	}
	/**
	 * 수신계좌잔액
	 */
	@XmlTransient
	public String getDpacBal(){
		return this.dpacBal;
	}
	
	/**
	 * 수신계좌잔액
	 * 
	 * @param dpacBal 수신계좌잔액
	 */
	public void setDpacBal(String dpacBal){
		this.dpacBal= dpacBal;
		this.setIsSet_dpacBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvAcno= false;
	protected final boolean isSet_rcvAcno(){
		return this.isSet_rcvAcno;
	}
	private void setIsSet_rcvAcno(boolean value){
		this.isSet_rcvAcno= value;
	}
	/**
	 * 입금계좌번호
	 */
	@XmlTransient
	public String getRcvAcno(){
		return this.rcvAcno;
	}
	
	/**
	 * 입금계좌번호
	 * 
	 * @param rcvAcno 입금계좌번호
	 */
	public void setRcvAcno(String rcvAcno){
		this.rcvAcno= rcvAcno;
		this.setIsSet_rcvAcno(true);
	}
				
	@Override
	public MNPMnyPinWallMngDeleteWallScss_IDT clone(){
		try{
			MNPMnyPinWallMngDeleteWallScss_IDT object= (MNPMnyPinWallMngDeleteWallScss_IDT)super.clone();
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
		
		result= prime * result + ((this.cancAcno==null)?0:this.cancAcno.hashCode());
		result= prime * result + ((this.dpacBal==null)?0:this.dpacBal.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngDeleteWallScss_IDT other= (MNPMnyPinWallMngDeleteWallScss_IDT)obj;
		{
			Object _cancAcno= getCancAcno();
			Object __cancAcno= other.getCancAcno();
			if ( _cancAcno== null ) { if ( __cancAcno!= null ) return false; }
			else if ( !_cancAcno.equals(__cancAcno) ) return false;
		}
		{
			Object _dpacBal= getDpacBal();
			Object __dpacBal= other.getDpacBal();
			if ( _dpacBal== null ) { if ( __dpacBal!= null ) return false; }
			else if ( !_dpacBal.equals(__dpacBal) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngDeleteWallScss_IDT.class.getName()).append(":\n");
		sb.append("\tcancAcno: ");
		sb.append(cancAcno==null?"null":getCancAcno());
		sb.append("\n");
		sb.append("\tdpacBal: ");
		sb.append(dpacBal==null?"null":getDpacBal());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* cancAcno */
		messageLen+= 64; /* dpacBal */
		messageLen+= 30; /* rcvAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("cancAcno");
		list.add("dpacBal");
		list.add("rcvAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("cancAcno", get("cancAcno"));
		map.put("dpacBal", get("dpacBal"));
		map.put("rcvAcno", get("rcvAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -124254570:/* cancAcno */
			return getCancAcno();
		case 1855117183:/* dpacBal */
			return getDpacBal();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -124254570:/* cancAcno */
			setCancAcno((String)value);
			break;
		case 1855117183:/* dpacBal */
			setDpacBal((String)value);
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
