/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

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
 * 나만의알림등록IDT
 */
@XmlType(propOrder={
	"seqno", "trNotiYn"
}, name="INBNtfbxPushEtcEstUpdateMyNtfc_IDT")
@XmlRootElement(name="INBNtfbxPushEtcEstUpdateMyNtfc_IDT")
@BxmCategory(logicalName="나만의알림등록IDT", description="나만의알림등록IDT") 
public class INBNtfbxPushEtcEstUpdateMyNtfc_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1089069332L;
	
	
	
	/**
	 * 순서번호
	 */
	@ApiModelProperty(
		name = "seqno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("seqno")
	@BxmOmm_Field(length=20, decimal=0, description="순서번호", align="left", fill="")
	private String seqno= "";
	
	
	/**
	 * 알림수신여부
	 */
	@ApiModelProperty(
		name = "trNotiYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trNotiYn")
	@BxmOmm_Field(length=1, decimal=0, description="알림수신여부", align="left", fill="")
	private String trNotiYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_seqno= false;
	protected final boolean isSet_seqno(){
		return this.isSet_seqno;
	}
	private void setIsSet_seqno(boolean value){
		this.isSet_seqno= value;
	}
	/**
	 * 순서번호
	 */
	@XmlTransient
	public String getSeqno(){
		return this.seqno;
	}
	
	/**
	 * 순서번호
	 * 
	 * @param seqno 순서번호
	 */
	public void setSeqno(String seqno){
		this.seqno= seqno;
		this.setIsSet_seqno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trNotiYn= false;
	protected final boolean isSet_trNotiYn(){
		return this.isSet_trNotiYn;
	}
	private void setIsSet_trNotiYn(boolean value){
		this.isSet_trNotiYn= value;
	}
	/**
	 * 알림수신여부
	 */
	@XmlTransient
	public String getTrNotiYn(){
		return this.trNotiYn;
	}
	
	/**
	 * 알림수신여부
	 * 
	 * @param trNotiYn 알림수신여부
	 */
	public void setTrNotiYn(String trNotiYn){
		this.trNotiYn= trNotiYn;
		this.setIsSet_trNotiYn(true);
	}
				
	@Override
	public INBNtfbxPushEtcEstUpdateMyNtfc_IDT clone(){
		try{
			INBNtfbxPushEtcEstUpdateMyNtfc_IDT object= (INBNtfbxPushEtcEstUpdateMyNtfc_IDT)super.clone();
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
		
		result= prime * result + ((this.seqno==null)?0:this.seqno.hashCode());
		result= prime * result + ((this.trNotiYn==null)?0:this.trNotiYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstUpdateMyNtfc_IDT other= (INBNtfbxPushEtcEstUpdateMyNtfc_IDT)obj;
		{
			Object _seqno= getSeqno();
			Object __seqno= other.getSeqno();
			if ( _seqno== null ) { if ( __seqno!= null ) return false; }
			else if ( !_seqno.equals(__seqno) ) return false;
		}
		{
			Object _trNotiYn= getTrNotiYn();
			Object __trNotiYn= other.getTrNotiYn();
			if ( _trNotiYn== null ) { if ( __trNotiYn!= null ) return false; }
			else if ( !_trNotiYn.equals(__trNotiYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstUpdateMyNtfc_IDT.class.getName()).append(":\n");
		sb.append("\tseqno: ");
		sb.append(seqno==null?"null":getSeqno());
		sb.append("\n");
		sb.append("\ttrNotiYn: ");
		sb.append(trNotiYn==null?"null":getTrNotiYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* seqno */
		messageLen+= 1; /* trNotiYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("seqno");
		list.add("trNotiYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("seqno", get("seqno"));
		map.put("trNotiYn", get("trNotiYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 109325920:/* seqno */
			return getSeqno();
		case 737884617:/* trNotiYn */
			return getTrNotiYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 109325920:/* seqno */
			setSeqno((String)value);
			break;
		case 737884617:/* trNotiYn */
			setTrNotiYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
