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
 * 나만의알림상세조회IDT
 */
@XmlType(propOrder={
	"seqno", "itcsno"
}, name="INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT")
@XmlRootElement(name="INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT")
@BxmCategory(logicalName="나만의알림상세조회IDT", description="나만의알림상세조회IDT") 
public class INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 176369353L;
	
	
	
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
	public INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT clone(){
		try{
			INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT object= (INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT)super.clone();
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
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT other= (INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT)obj;
		{
			Object _seqno= getSeqno();
			Object __seqno= other.getSeqno();
			if ( _seqno== null ) { if ( __seqno!= null ) return false; }
			else if ( !_seqno.equals(__seqno) ) return false;
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
	
		sb.append("\n[").append(INBNtfbxPushEtcEstSelectMyNtfcDtl_IDT.class.getName()).append(":\n");
		sb.append("\tseqno: ");
		sb.append(seqno==null?"null":getSeqno());
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
		
		messageLen+= 20; /* seqno */
		messageLen+= 36; /* itcsno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("seqno");
		list.add("itcsno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("seqno", get("seqno"));
		map.put("itcsno", get("itcsno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 109325920:/* seqno */
			return getSeqno();
		case -1178714660:/* itcsno */
			return getItcsno();
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
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		default:
			break;
		}
	}
	
}
