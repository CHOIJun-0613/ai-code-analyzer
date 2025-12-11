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

/**
 * 
 */
@XmlType(propOrder={
	"bzBrcd", "bzbrNm", "cmplDt"
}, name="LifecCcadFixExpdCmplList_DODT")
@XmlRootElement(name="LifecCcadFixExpdCmplList_DODT")
@BxmCategory(logicalName="생활비.신용카드.고정지출.완료.목록.DBM.출력.IO", description="") 
public class LifecCcadFixExpdCmplList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -653508778L;
	
	
	
	/**
	 * 영업점코드
	 */
	@ApiModelProperty(
		name = "bzBrcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bzBrcd")
	@BxmOmm_Field(length=6, decimal=0, description="영업점코드", align="left", fill="")
	private String bzBrcd= "";
	
	
	/**
	 * 영업점명
	 */
	@ApiModelProperty(
		name = "bzbrNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bzbrNm")
	@BxmOmm_Field(length=50, decimal=0, description="영업점명", align="left", fill="")
	private String bzbrNm= "";
	
	
	/**
	 * 완료일자
	 */
	@ApiModelProperty(
		name = "cmplDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cmplDt")
	@BxmOmm_Field(length=8, decimal=0, description="완료일자", align="left", fill="")
	private String cmplDt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bzBrcd= false;
	protected final boolean isSet_bzBrcd(){
		return this.isSet_bzBrcd;
	}
	private void setIsSet_bzBrcd(boolean value){
		this.isSet_bzBrcd= value;
	}
	/**
	 * 영업점코드
	 */
	@XmlTransient
	public String getBzBrcd(){
		return this.bzBrcd;
	}
	
	/**
	 * 영업점코드
	 * 
	 * @param bzBrcd 영업점코드
	 */
	public void setBzBrcd(String bzBrcd){
		this.bzBrcd= bzBrcd;
		this.setIsSet_bzBrcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bzbrNm= false;
	protected final boolean isSet_bzbrNm(){
		return this.isSet_bzbrNm;
	}
	private void setIsSet_bzbrNm(boolean value){
		this.isSet_bzbrNm= value;
	}
	/**
	 * 영업점명
	 */
	@XmlTransient
	public String getBzbrNm(){
		return this.bzbrNm;
	}
	
	/**
	 * 영업점명
	 * 
	 * @param bzbrNm 영업점명
	 */
	public void setBzbrNm(String bzbrNm){
		this.bzbrNm= bzbrNm;
		this.setIsSet_bzbrNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cmplDt= false;
	protected final boolean isSet_cmplDt(){
		return this.isSet_cmplDt;
	}
	private void setIsSet_cmplDt(boolean value){
		this.isSet_cmplDt= value;
	}
	/**
	 * 완료일자
	 */
	@XmlTransient
	public String getCmplDt(){
		return this.cmplDt;
	}
	
	/**
	 * 완료일자
	 * 
	 * @param cmplDt 완료일자
	 */
	public void setCmplDt(String cmplDt){
		this.cmplDt= cmplDt;
		this.setIsSet_cmplDt(true);
	}
				
	@Override
	public LifecCcadFixExpdCmplList_DODT clone(){
		try{
			LifecCcadFixExpdCmplList_DODT object= (LifecCcadFixExpdCmplList_DODT)super.clone();
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
		
		result= prime * result + ((this.bzBrcd==null)?0:this.bzBrcd.hashCode());
		result= prime * result + ((this.bzbrNm==null)?0:this.bzbrNm.hashCode());
		result= prime * result + ((this.cmplDt==null)?0:this.cmplDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final LifecCcadFixExpdCmplList_DODT other= (LifecCcadFixExpdCmplList_DODT)obj;
		{
			Object _bzBrcd= getBzBrcd();
			Object __bzBrcd= other.getBzBrcd();
			if ( _bzBrcd== null ) { if ( __bzBrcd!= null ) return false; }
			else if ( !_bzBrcd.equals(__bzBrcd) ) return false;
		}
		{
			Object _bzbrNm= getBzbrNm();
			Object __bzbrNm= other.getBzbrNm();
			if ( _bzbrNm== null ) { if ( __bzbrNm!= null ) return false; }
			else if ( !_bzbrNm.equals(__bzbrNm) ) return false;
		}
		{
			Object _cmplDt= getCmplDt();
			Object __cmplDt= other.getCmplDt();
			if ( _cmplDt== null ) { if ( __cmplDt!= null ) return false; }
			else if ( !_cmplDt.equals(__cmplDt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(LifecCcadFixExpdCmplList_DODT.class.getName()).append(":\n");
		sb.append("\tbzBrcd: ");
		sb.append(bzBrcd==null?"null":getBzBrcd());
		sb.append("\n");
		sb.append("\tbzbrNm: ");
		sb.append(bzbrNm==null?"null":getBzbrNm());
		sb.append("\n");
		sb.append("\tcmplDt: ");
		sb.append(cmplDt==null?"null":getCmplDt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 6; /* bzBrcd */
		messageLen+= 50; /* bzbrNm */
		messageLen+= 8; /* cmplDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("bzBrcd");
		list.add("bzbrNm");
		list.add("cmplDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("bzBrcd", get("bzBrcd"));
		map.put("bzbrNm", get("bzbrNm"));
		map.put("cmplDt", get("cmplDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1374562007:/* bzBrcd */
			return getBzBrcd();
		case -1373609337:/* bzbrNm */
			return getBzbrNm();
		case -1356574954:/* cmplDt */
			return getCmplDt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1374562007:/* bzBrcd */
			setBzBrcd((String)value);
			break;
		case -1373609337:/* bzbrNm */
			setBzbrNm((String)value);
			break;
		case -1356574954:/* cmplDt */
			setCmplDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
