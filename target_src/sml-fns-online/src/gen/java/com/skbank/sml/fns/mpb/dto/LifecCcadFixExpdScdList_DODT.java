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
	"bzBrcd", "bzbrNm", "scdDt"
}, name="LifecCcadFixExpdScdList_DODT")
@XmlRootElement(name="LifecCcadFixExpdScdList_DODT")
@BxmCategory(logicalName="생활비.신용카드.고정지출.예정.목록.DBM.출력.IO", description="") 
public class LifecCcadFixExpdScdList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -990103448L;
	
	
	
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
	 * 예정일자
	 */
	@ApiModelProperty(
		name = "scdDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("scdDt")
	@BxmOmm_Field(length=8, decimal=0, description="예정일자", align="left", fill="")
	private String scdDt= "";
	
	
	
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
	private boolean isSet_scdDt= false;
	protected final boolean isSet_scdDt(){
		return this.isSet_scdDt;
	}
	private void setIsSet_scdDt(boolean value){
		this.isSet_scdDt= value;
	}
	/**
	 * 예정일자
	 */
	@XmlTransient
	public String getScdDt(){
		return this.scdDt;
	}
	
	/**
	 * 예정일자
	 * 
	 * @param scdDt 예정일자
	 */
	public void setScdDt(String scdDt){
		this.scdDt= scdDt;
		this.setIsSet_scdDt(true);
	}
				
	@Override
	public LifecCcadFixExpdScdList_DODT clone(){
		try{
			LifecCcadFixExpdScdList_DODT object= (LifecCcadFixExpdScdList_DODT)super.clone();
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
		result= prime * result + ((this.scdDt==null)?0:this.scdDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final LifecCcadFixExpdScdList_DODT other= (LifecCcadFixExpdScdList_DODT)obj;
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
			Object _scdDt= getScdDt();
			Object __scdDt= other.getScdDt();
			if ( _scdDt== null ) { if ( __scdDt!= null ) return false; }
			else if ( !_scdDt.equals(__scdDt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(LifecCcadFixExpdScdList_DODT.class.getName()).append(":\n");
		sb.append("\tbzBrcd: ");
		sb.append(bzBrcd==null?"null":getBzBrcd());
		sb.append("\n");
		sb.append("\tbzbrNm: ");
		sb.append(bzbrNm==null?"null":getBzbrNm());
		sb.append("\n");
		sb.append("\tscdDt: ");
		sb.append(scdDt==null?"null":getScdDt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 6; /* bzBrcd */
		messageLen+= 50; /* bzbrNm */
		messageLen+= 8; /* scdDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("bzBrcd");
		list.add("bzbrNm");
		list.add("scdDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("bzBrcd", get("bzBrcd"));
		map.put("bzbrNm", get("bzbrNm"));
		map.put("scdDt", get("scdDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1374562007:/* bzBrcd */
			return getBzBrcd();
		case -1373609337:/* bzbrNm */
			return getBzbrNm();
		case 109252548:/* scdDt */
			return getScdDt();
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
		case 109252548:/* scdDt */
			setScdDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
