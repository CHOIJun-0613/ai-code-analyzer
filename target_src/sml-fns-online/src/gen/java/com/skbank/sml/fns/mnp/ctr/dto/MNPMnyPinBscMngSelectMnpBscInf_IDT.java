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
	"dpsInpAcno", "pageId"
}, name="MNPMnyPinBscMngSelectMnpBscInf_IDT")
@XmlRootElement(name="MNPMnyPinBscMngSelectMnpBscInf_IDT")
@BxmCategory(logicalName="머니클립.기본.정보.조회.컨트롤러.입력.IO", description="") 
public class MNPMnyPinBscMngSelectMnpBscInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -930766969L;
	
	
	
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
	 * 화면ID
	 */
	@ApiModelProperty(
		name = "pageId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pageId")
	@BxmOmm_Field(length=10, decimal=0, description="화면ID", align="left", fill="")
	private String pageId= "";
	
	
	
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
	private boolean isSet_pageId= false;
	protected final boolean isSet_pageId(){
		return this.isSet_pageId;
	}
	private void setIsSet_pageId(boolean value){
		this.isSet_pageId= value;
	}
	/**
	 * 화면ID
	 */
	@XmlTransient
	public String getPageId(){
		return this.pageId;
	}
	
	/**
	 * 화면ID
	 * 
	 * @param pageId 화면ID
	 */
	public void setPageId(String pageId){
		this.pageId= pageId;
		this.setIsSet_pageId(true);
	}
				
	@Override
	public MNPMnyPinBscMngSelectMnpBscInf_IDT clone(){
		try{
			MNPMnyPinBscMngSelectMnpBscInf_IDT object= (MNPMnyPinBscMngSelectMnpBscInf_IDT)super.clone();
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
		result= prime * result + ((this.pageId==null)?0:this.pageId.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinBscMngSelectMnpBscInf_IDT other= (MNPMnyPinBscMngSelectMnpBscInf_IDT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _pageId= getPageId();
			Object __pageId= other.getPageId();
			if ( _pageId== null ) { if ( __pageId!= null ) return false; }
			else if ( !_pageId.equals(__pageId) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinBscMngSelectMnpBscInf_IDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\tpageId: ");
		sb.append(pageId==null?"null":getPageId());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 10; /* pageId */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsInpAcno");
		list.add("pageId");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("pageId", get("pageId"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case -995752950:/* pageId */
			return getPageId();
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
		case -995752950:/* pageId */
			setPageId((String)value);
			break;
		default:
			break;
		}
	}
	
}
