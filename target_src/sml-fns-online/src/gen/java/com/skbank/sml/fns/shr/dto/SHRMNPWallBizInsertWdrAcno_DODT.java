/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.shr.dto;

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
	"prcRtcd", "prcRstTxt"
}, name="SHRMNPWallBizInsertWdrAcno_DODT")
@XmlRootElement(name="SHRMNPWallBizInsertWdrAcno_DODT")
@BxmCategory(logicalName="SHR 머니클립자계좌등록.컴포넌트.공통.출력.IO", description="") 
public class SHRMNPWallBizInsertWdrAcno_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -234527822L;
	
	
	
	/**
	 * 처리결과코드
	 */
	@ApiModelProperty(
		name = "prcRtcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prcRtcd")
	@BxmOmm_Field(length=7, decimal=0, description="처리결과코드", align="left", fill="")
	private String prcRtcd= "";
	
	
	/**
	 * 처리결과내용
	 */
	@ApiModelProperty(
		name = "prcRstTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prcRstTxt")
	@BxmOmm_Field(length=38, decimal=0, description="처리결과내용", align="left", fill="")
	private String prcRstTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prcRtcd= false;
	protected final boolean isSet_prcRtcd(){
		return this.isSet_prcRtcd;
	}
	private void setIsSet_prcRtcd(boolean value){
		this.isSet_prcRtcd= value;
	}
	/**
	 * 처리결과코드
	 */
	@XmlTransient
	public String getPrcRtcd(){
		return this.prcRtcd;
	}
	
	/**
	 * 처리결과코드
	 * 
	 * @param prcRtcd 처리결과코드
	 */
	public void setPrcRtcd(String prcRtcd){
		this.prcRtcd= prcRtcd;
		this.setIsSet_prcRtcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prcRstTxt= false;
	protected final boolean isSet_prcRstTxt(){
		return this.isSet_prcRstTxt;
	}
	private void setIsSet_prcRstTxt(boolean value){
		this.isSet_prcRstTxt= value;
	}
	/**
	 * 처리결과내용
	 */
	@XmlTransient
	public String getPrcRstTxt(){
		return this.prcRstTxt;
	}
	
	/**
	 * 처리결과내용
	 * 
	 * @param prcRstTxt 처리결과내용
	 */
	public void setPrcRstTxt(String prcRstTxt){
		this.prcRstTxt= prcRstTxt;
		this.setIsSet_prcRstTxt(true);
	}
				
	@Override
	public SHRMNPWallBizInsertWdrAcno_DODT clone(){
		try{
			SHRMNPWallBizInsertWdrAcno_DODT object= (SHRMNPWallBizInsertWdrAcno_DODT)super.clone();
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
		
		result= prime * result + ((this.prcRtcd==null)?0:this.prcRtcd.hashCode());
		result= prime * result + ((this.prcRstTxt==null)?0:this.prcRstTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRMNPWallBizInsertWdrAcno_DODT other= (SHRMNPWallBizInsertWdrAcno_DODT)obj;
		{
			Object _prcRtcd= getPrcRtcd();
			Object __prcRtcd= other.getPrcRtcd();
			if ( _prcRtcd== null ) { if ( __prcRtcd!= null ) return false; }
			else if ( !_prcRtcd.equals(__prcRtcd) ) return false;
		}
		{
			Object _prcRstTxt= getPrcRstTxt();
			Object __prcRstTxt= other.getPrcRstTxt();
			if ( _prcRstTxt== null ) { if ( __prcRstTxt!= null ) return false; }
			else if ( !_prcRstTxt.equals(__prcRstTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRMNPWallBizInsertWdrAcno_DODT.class.getName()).append(":\n");
		sb.append("\tprcRtcd: ");
		sb.append(prcRtcd==null?"null":getPrcRtcd());
		sb.append("\n");
		sb.append("\tprcRstTxt: ");
		sb.append(prcRstTxt==null?"null":getPrcRstTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 7; /* prcRtcd */
		messageLen+= 38; /* prcRstTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("prcRtcd");
		list.add("prcRstTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("prcRtcd", get("prcRtcd"));
		map.put("prcRstTxt", get("prcRstTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -321093532:/* prcRtcd */
			return getPrcRtcd();
		case 666332446:/* prcRstTxt */
			return getPrcRstTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -321093532:/* prcRtcd */
			setPrcRtcd((String)value);
			break;
		case 666332446:/* prcRstTxt */
			setPrcRstTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
