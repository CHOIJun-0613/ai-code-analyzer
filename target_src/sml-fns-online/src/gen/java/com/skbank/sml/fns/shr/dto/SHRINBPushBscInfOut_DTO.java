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
 * 알림비즈
 */
@XmlType(propOrder={
	"rsltCd", "rsltCdTxt", "updateCnt"
}, name="SHRINBPushBscInfOut_DTO")
@XmlRootElement(name="SHRINBPushBscInfOut_DTO")
@BxmCategory(logicalName="알림비즈", description="알림비즈") 
public class SHRINBPushBscInfOut_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 169538933L;
	
	
	
	/**
	 * 결과코드
	 */
	@ApiModelProperty(
		name = "rsltCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rsltCd")
	@BxmOmm_Field(length=10, decimal=0, description="결과코드", align="left", fill="")
	private String rsltCd= "";
	
	
	/**
	 * 결과코드내용
	 */
	@ApiModelProperty(
		name = "rsltCdTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rsltCdTxt")
	@BxmOmm_Field(length=1000, decimal=0, description="결과코드내용", align="left", fill="")
	private String rsltCdTxt= "";
	
	
	/**
	 * 업데이트건수
	 */
	@ApiModelProperty(
		name = "updateCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("updateCnt")
	@BxmOmm_Field(length=3, decimal=0, description="업데이트건수", align="right", fill="")
	private Integer updateCnt= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rsltCd= false;
	protected final boolean isSet_rsltCd(){
		return this.isSet_rsltCd;
	}
	private void setIsSet_rsltCd(boolean value){
		this.isSet_rsltCd= value;
	}
	/**
	 * 결과코드
	 */
	@XmlTransient
	public String getRsltCd(){
		return this.rsltCd;
	}
	
	/**
	 * 결과코드
	 * 
	 * @param rsltCd 결과코드
	 */
	public void setRsltCd(String rsltCd){
		this.rsltCd= rsltCd;
		this.setIsSet_rsltCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rsltCdTxt= false;
	protected final boolean isSet_rsltCdTxt(){
		return this.isSet_rsltCdTxt;
	}
	private void setIsSet_rsltCdTxt(boolean value){
		this.isSet_rsltCdTxt= value;
	}
	/**
	 * 결과코드내용
	 */
	@XmlTransient
	public String getRsltCdTxt(){
		return this.rsltCdTxt;
	}
	
	/**
	 * 결과코드내용
	 * 
	 * @param rsltCdTxt 결과코드내용
	 */
	public void setRsltCdTxt(String rsltCdTxt){
		this.rsltCdTxt= rsltCdTxt;
		this.setIsSet_rsltCdTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_updateCnt= false;
	protected final boolean isSet_updateCnt(){
		return this.isSet_updateCnt;
	}
	private void setIsSet_updateCnt(boolean value){
		this.isSet_updateCnt= value;
	}
	/**
	 * 업데이트건수
	 */
	@XmlTransient
	public Integer getUpdateCnt(){
		return this.updateCnt;
	}
	
	/**
	 * 업데이트건수
	 * 
	 * @param updateCnt 업데이트건수
	 */
	public void setUpdateCnt(Integer updateCnt){
		this.updateCnt= updateCnt;
		this.setIsSet_updateCnt(true);
	}
				
	@Override
	public SHRINBPushBscInfOut_DTO clone(){
		try{
			SHRINBPushBscInfOut_DTO object= (SHRINBPushBscInfOut_DTO)super.clone();
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
		
		result= prime * result + ((this.rsltCd==null)?0:this.rsltCd.hashCode());
		result= prime * result + ((this.rsltCdTxt==null)?0:this.rsltCdTxt.hashCode());
		result= prime * result + ((this.updateCnt==null)?0:this.updateCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRINBPushBscInfOut_DTO other= (SHRINBPushBscInfOut_DTO)obj;
		{
			Object _rsltCd= getRsltCd();
			Object __rsltCd= other.getRsltCd();
			if ( _rsltCd== null ) { if ( __rsltCd!= null ) return false; }
			else if ( !_rsltCd.equals(__rsltCd) ) return false;
		}
		{
			Object _rsltCdTxt= getRsltCdTxt();
			Object __rsltCdTxt= other.getRsltCdTxt();
			if ( _rsltCdTxt== null ) { if ( __rsltCdTxt!= null ) return false; }
			else if ( !_rsltCdTxt.equals(__rsltCdTxt) ) return false;
		}
		{
			Object _updateCnt= getUpdateCnt();
			Object __updateCnt= other.getUpdateCnt();
			if ( _updateCnt== null ) { if ( __updateCnt!= null ) return false; }
			else if ( !_updateCnt.equals(__updateCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRINBPushBscInfOut_DTO.class.getName()).append(":\n");
		sb.append("\trsltCd: ");
		sb.append(rsltCd==null?"null":getRsltCd());
		sb.append("\n");
		sb.append("\trsltCdTxt: ");
		sb.append(rsltCdTxt==null?"null":getRsltCdTxt());
		sb.append("\n");
		sb.append("\tupdateCnt: ");
		sb.append(updateCnt==null?"null":getUpdateCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* rsltCd */
		messageLen+= 1000; /* rsltCdTxt */
		messageLen+= 3; /* updateCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rsltCd");
		list.add("rsltCdTxt");
		list.add("updateCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rsltCd", get("rsltCd"));
		map.put("rsltCdTxt", get("rsltCdTxt"));
		map.put("updateCnt", get("updateCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -921708086:/* rsltCd */
			return getRsltCd();
		case -879582138:/* rsltCdTxt */
			return getRsltCdTxt();
		case -1949224992:/* updateCnt */
			return getUpdateCnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -921708086:/* rsltCd */
			setRsltCd((String)value);
			break;
		case -879582138:/* rsltCdTxt */
			setRsltCdTxt((String)value);
			break;
		case -1949224992:/* updateCnt */
			setUpdateCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
