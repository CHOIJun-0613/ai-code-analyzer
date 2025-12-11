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
	"trnRstCd", "trnRstTxt"
}, name="MNPMnyPinSafMngUpdateSafGoalInfScss_ODT")
@XmlRootElement(name="MNPMnyPinSafMngUpdateSafGoalInfScss_ODT")
@BxmCategory(logicalName="머니클립.금고.목표.정보.해지.수정.컨트롤러.출력.IO", description="") 
public class MNPMnyPinSafMngUpdateSafGoalInfScss_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 42311166L;
	
	
	
	/**
	 * 거래결과코드
	 */
	@ApiModelProperty(
		name = "trnRstCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnRstCd")
	@BxmOmm_Field(length=2, decimal=0, description="거래결과코드", align="left", fill="")
	private String trnRstCd= "";
	
	
	/**
	 * 거래결과내용
	 */
	@ApiModelProperty(
		name = "trnRstTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnRstTxt")
	@BxmOmm_Field(length=80, decimal=0, description="거래결과내용", align="left", fill="")
	private String trnRstTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnRstCd= false;
	protected final boolean isSet_trnRstCd(){
		return this.isSet_trnRstCd;
	}
	private void setIsSet_trnRstCd(boolean value){
		this.isSet_trnRstCd= value;
	}
	/**
	 * 거래결과코드
	 */
	@XmlTransient
	public String getTrnRstCd(){
		return this.trnRstCd;
	}
	
	/**
	 * 거래결과코드
	 * 
	 * @param trnRstCd 거래결과코드
	 */
	public void setTrnRstCd(String trnRstCd){
		this.trnRstCd= trnRstCd;
		this.setIsSet_trnRstCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnRstTxt= false;
	protected final boolean isSet_trnRstTxt(){
		return this.isSet_trnRstTxt;
	}
	private void setIsSet_trnRstTxt(boolean value){
		this.isSet_trnRstTxt= value;
	}
	/**
	 * 거래결과내용
	 */
	@XmlTransient
	public String getTrnRstTxt(){
		return this.trnRstTxt;
	}
	
	/**
	 * 거래결과내용
	 * 
	 * @param trnRstTxt 거래결과내용
	 */
	public void setTrnRstTxt(String trnRstTxt){
		this.trnRstTxt= trnRstTxt;
		this.setIsSet_trnRstTxt(true);
	}
				
	@Override
	public MNPMnyPinSafMngUpdateSafGoalInfScss_ODT clone(){
		try{
			MNPMnyPinSafMngUpdateSafGoalInfScss_ODT object= (MNPMnyPinSafMngUpdateSafGoalInfScss_ODT)super.clone();
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
		
		result= prime * result + ((this.trnRstCd==null)?0:this.trnRstCd.hashCode());
		result= prime * result + ((this.trnRstTxt==null)?0:this.trnRstTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinSafMngUpdateSafGoalInfScss_ODT other= (MNPMnyPinSafMngUpdateSafGoalInfScss_ODT)obj;
		{
			Object _trnRstCd= getTrnRstCd();
			Object __trnRstCd= other.getTrnRstCd();
			if ( _trnRstCd== null ) { if ( __trnRstCd!= null ) return false; }
			else if ( !_trnRstCd.equals(__trnRstCd) ) return false;
		}
		{
			Object _trnRstTxt= getTrnRstTxt();
			Object __trnRstTxt= other.getTrnRstTxt();
			if ( _trnRstTxt== null ) { if ( __trnRstTxt!= null ) return false; }
			else if ( !_trnRstTxt.equals(__trnRstTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinSafMngUpdateSafGoalInfScss_ODT.class.getName()).append(":\n");
		sb.append("\ttrnRstCd: ");
		sb.append(trnRstCd==null?"null":getTrnRstCd());
		sb.append("\n");
		sb.append("\ttrnRstTxt: ");
		sb.append(trnRstTxt==null?"null":getTrnRstTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* trnRstCd */
		messageLen+= 80; /* trnRstTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnRstCd");
		list.add("trnRstTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnRstCd", get("trnRstCd"));
		map.put("trnRstTxt", get("trnRstTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1627215428:/* trnRstCd */
			return getTrnRstCd();
		case -1095912211:/* trnRstTxt */
			return getTrnRstTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1627215428:/* trnRstCd */
			setTrnRstCd((String)value);
			break;
		case -1095912211:/* trnRstTxt */
			setTrnRstTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
