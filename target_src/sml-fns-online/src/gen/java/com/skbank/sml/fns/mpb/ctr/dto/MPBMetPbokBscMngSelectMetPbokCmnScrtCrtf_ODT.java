/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.ctr.dto;

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
	"userId", "itcsno", "spCusYn", "esnsMbhNo", "ciNo"
}, name="MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT")
@BxmCategory(logicalName="모임통장.공통.보안인증.셋팅.출력.IO", description="") 
public class MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 2095680675L;
	
	
	
	/**
	 * 이용자아이디
	 */
	@ApiModelProperty(
		name = "userId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("userId")
	@BxmOmm_Field(length=13, decimal=0, description="이용자아이디", align="left", fill="")
	private String userId= "";
	
	
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
	 * 간편회원여부
	 */
	@ApiModelProperty(
		name = "spCusYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spCusYn")
	@BxmOmm_Field(length=1, decimal=0, description="간편회원여부", align="left", fill="")
	private String spCusYn= "";
	
	
	/**
	 * 고객간편회원일련번호
	 */
	@ApiModelProperty(
		name = "esnsMbhNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsMbhNo")
	@BxmOmm_Field(length=11, decimal=0, description="고객간편회원일련번호", align="left", fill="")
	private String esnsMbhNo= "";
	
	
	/**
	 * CI번호
	 */
	@ApiModelProperty(
		name = "ciNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ciNo")
	@BxmOmm_Field(length=88, decimal=0, description="CI번호", align="left", fill="")
	private String ciNo= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_userId= false;
	protected final boolean isSet_userId(){
		return this.isSet_userId;
	}
	private void setIsSet_userId(boolean value){
		this.isSet_userId= value;
	}
	/**
	 * 이용자아이디
	 */
	@XmlTransient
	public String getUserId(){
		return this.userId;
	}
	
	/**
	 * 이용자아이디
	 * 
	 * @param userId 이용자아이디
	 */
	public void setUserId(String userId){
		this.userId= userId;
		this.setIsSet_userId(true);
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spCusYn= false;
	protected final boolean isSet_spCusYn(){
		return this.isSet_spCusYn;
	}
	private void setIsSet_spCusYn(boolean value){
		this.isSet_spCusYn= value;
	}
	/**
	 * 간편회원여부
	 */
	@XmlTransient
	public String getSpCusYn(){
		return this.spCusYn;
	}
	
	/**
	 * 간편회원여부
	 * 
	 * @param spCusYn 간편회원여부
	 */
	public void setSpCusYn(String spCusYn){
		this.spCusYn= spCusYn;
		this.setIsSet_spCusYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_esnsMbhNo= false;
	protected final boolean isSet_esnsMbhNo(){
		return this.isSet_esnsMbhNo;
	}
	private void setIsSet_esnsMbhNo(boolean value){
		this.isSet_esnsMbhNo= value;
	}
	/**
	 * 고객간편회원일련번호
	 */
	@XmlTransient
	public String getEsnsMbhNo(){
		return this.esnsMbhNo;
	}
	
	/**
	 * 고객간편회원일련번호
	 * 
	 * @param esnsMbhNo 고객간편회원일련번호
	 */
	public void setEsnsMbhNo(String esnsMbhNo){
		this.esnsMbhNo= esnsMbhNo;
		this.setIsSet_esnsMbhNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ciNo= false;
	protected final boolean isSet_ciNo(){
		return this.isSet_ciNo;
	}
	private void setIsSet_ciNo(boolean value){
		this.isSet_ciNo= value;
	}
	/**
	 * CI번호
	 */
	@XmlTransient
	public String getCiNo(){
		return this.ciNo;
	}
	
	/**
	 * CI번호
	 * 
	 * @param ciNo CI번호
	 */
	public void setCiNo(String ciNo){
		this.ciNo= ciNo;
		this.setIsSet_ciNo(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT object= (MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT)super.clone();
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
		
		result= prime * result + ((this.userId==null)?0:this.userId.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.spCusYn==null)?0:this.spCusYn.hashCode());
		result= prime * result + ((this.esnsMbhNo==null)?0:this.esnsMbhNo.hashCode());
		result= prime * result + ((this.ciNo==null)?0:this.ciNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT other= (MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT)obj;
		{
			Object _userId= getUserId();
			Object __userId= other.getUserId();
			if ( _userId== null ) { if ( __userId!= null ) return false; }
			else if ( !_userId.equals(__userId) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _spCusYn= getSpCusYn();
			Object __spCusYn= other.getSpCusYn();
			if ( _spCusYn== null ) { if ( __spCusYn!= null ) return false; }
			else if ( !_spCusYn.equals(__spCusYn) ) return false;
		}
		{
			Object _esnsMbhNo= getEsnsMbhNo();
			Object __esnsMbhNo= other.getEsnsMbhNo();
			if ( _esnsMbhNo== null ) { if ( __esnsMbhNo!= null ) return false; }
			else if ( !_esnsMbhNo.equals(__esnsMbhNo) ) return false;
		}
		{
			Object _ciNo= getCiNo();
			Object __ciNo= other.getCiNo();
			if ( _ciNo== null ) { if ( __ciNo!= null ) return false; }
			else if ( !_ciNo.equals(__ciNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokCmnScrtCrtf_ODT.class.getName()).append(":\n");
		sb.append("\tuserId: ");
		sb.append(userId==null?"null":getUserId());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tspCusYn: ");
		sb.append(spCusYn==null?"null":getSpCusYn());
		sb.append("\n");
		sb.append("\tesnsMbhNo: ");
		sb.append(esnsMbhNo==null?"null":getEsnsMbhNo());
		sb.append("\n");
		sb.append("\tciNo: ");
		sb.append(ciNo==null?"null":getCiNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* userId */
		messageLen+= 36; /* itcsno */
		messageLen+= 1; /* spCusYn */
		messageLen+= 11; /* esnsMbhNo */
		messageLen+= 88; /* ciNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("userId");
		list.add("itcsno");
		list.add("spCusYn");
		list.add("esnsMbhNo");
		list.add("ciNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("userId", get("userId"));
		map.put("itcsno", get("itcsno"));
		map.put("spCusYn", get("spCusYn"));
		map.put("esnsMbhNo", get("esnsMbhNo"));
		map.put("ciNo", get("ciNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -836030906:/* userId */
			return getUserId();
		case -1178714660:/* itcsno */
			return getItcsno();
		case -2039319335:/* spCusYn */
			return getSpCusYn();
		case -1396906143:/* esnsMbhNo */
			return getEsnsMbhNo();
		case 3052743:/* ciNo */
			return getCiNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -836030906:/* userId */
			setUserId((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case -2039319335:/* spCusYn */
			setSpCusYn((String)value);
			break;
		case -1396906143:/* esnsMbhNo */
			setEsnsMbhNo((String)value);
			break;
		case 3052743:/* ciNo */
			setCiNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
