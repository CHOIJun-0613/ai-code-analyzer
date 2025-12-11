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
	"lginYn", "metPbokJnngYn", "metRgsDt", "itcsno", "ebnkUtzpeNo"
}, name="MPBMetPbokBscMngSelectMetPbokJnngInf_ODT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokJnngInf_ODT")
@BxmCategory(logicalName="모임통장.가입.정보.조회.컨트롤러.출력IO", description="") 
public class MPBMetPbokBscMngSelectMetPbokJnngInf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 77536400L;
	
	
	
	/**
	 * 로그인여부
	 */
	@ApiModelProperty(
		name = "lginYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lginYn")
	@BxmOmm_Field(length=1, decimal=0, description="로그인여부", align="left", fill="")
	private String lginYn= "";
	
	
	/**
	 * 모임통장가입여부
	 */
	@ApiModelProperty(
		name = "metPbokJnngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokJnngYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임통장가입여부", align="left", fill="")
	private String metPbokJnngYn= "";
	
	
	/**
	 * 모임등록일자
	 */
	@ApiModelProperty(
		name = "metRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임등록일자", align="left", fill="")
	private String metRgsDt= "";
	
	
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
	 * 전자뱅킹이용자번호
	 */
	@ApiModelProperty(
		name = "ebnkUtzpeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkUtzpeNo")
	@BxmOmm_Field(length=13, decimal=0, description="전자뱅킹이용자번호", align="left", fill="")
	private String ebnkUtzpeNo= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lginYn= false;
	protected final boolean isSet_lginYn(){
		return this.isSet_lginYn;
	}
	private void setIsSet_lginYn(boolean value){
		this.isSet_lginYn= value;
	}
	/**
	 * 로그인여부
	 */
	@XmlTransient
	public String getLginYn(){
		return this.lginYn;
	}
	
	/**
	 * 로그인여부
	 * 
	 * @param lginYn 로그인여부
	 */
	public void setLginYn(String lginYn){
		this.lginYn= lginYn;
		this.setIsSet_lginYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metPbokJnngYn= false;
	protected final boolean isSet_metPbokJnngYn(){
		return this.isSet_metPbokJnngYn;
	}
	private void setIsSet_metPbokJnngYn(boolean value){
		this.isSet_metPbokJnngYn= value;
	}
	/**
	 * 모임통장가입여부
	 */
	@XmlTransient
	public String getMetPbokJnngYn(){
		return this.metPbokJnngYn;
	}
	
	/**
	 * 모임통장가입여부
	 * 
	 * @param metPbokJnngYn 모임통장가입여부
	 */
	public void setMetPbokJnngYn(String metPbokJnngYn){
		this.metPbokJnngYn= metPbokJnngYn;
		this.setIsSet_metPbokJnngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metRgsDt= false;
	protected final boolean isSet_metRgsDt(){
		return this.isSet_metRgsDt;
	}
	private void setIsSet_metRgsDt(boolean value){
		this.isSet_metRgsDt= value;
	}
	/**
	 * 모임등록일자
	 */
	@XmlTransient
	public String getMetRgsDt(){
		return this.metRgsDt;
	}
	
	/**
	 * 모임등록일자
	 * 
	 * @param metRgsDt 모임등록일자
	 */
	public void setMetRgsDt(String metRgsDt){
		this.metRgsDt= metRgsDt;
		this.setIsSet_metRgsDt(true);
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
	private boolean isSet_ebnkUtzpeNo= false;
	protected final boolean isSet_ebnkUtzpeNo(){
		return this.isSet_ebnkUtzpeNo;
	}
	private void setIsSet_ebnkUtzpeNo(boolean value){
		this.isSet_ebnkUtzpeNo= value;
	}
	/**
	 * 전자뱅킹이용자번호
	 */
	@XmlTransient
	public String getEbnkUtzpeNo(){
		return this.ebnkUtzpeNo;
	}
	
	/**
	 * 전자뱅킹이용자번호
	 * 
	 * @param ebnkUtzpeNo 전자뱅킹이용자번호
	 */
	public void setEbnkUtzpeNo(String ebnkUtzpeNo){
		this.ebnkUtzpeNo= ebnkUtzpeNo;
		this.setIsSet_ebnkUtzpeNo(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokJnngInf_ODT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokJnngInf_ODT object= (MPBMetPbokBscMngSelectMetPbokJnngInf_ODT)super.clone();
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
		
		result= prime * result + ((this.lginYn==null)?0:this.lginYn.hashCode());
		result= prime * result + ((this.metPbokJnngYn==null)?0:this.metPbokJnngYn.hashCode());
		result= prime * result + ((this.metRgsDt==null)?0:this.metRgsDt.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.ebnkUtzpeNo==null)?0:this.ebnkUtzpeNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokJnngInf_ODT other= (MPBMetPbokBscMngSelectMetPbokJnngInf_ODT)obj;
		{
			Object _lginYn= getLginYn();
			Object __lginYn= other.getLginYn();
			if ( _lginYn== null ) { if ( __lginYn!= null ) return false; }
			else if ( !_lginYn.equals(__lginYn) ) return false;
		}
		{
			Object _metPbokJnngYn= getMetPbokJnngYn();
			Object __metPbokJnngYn= other.getMetPbokJnngYn();
			if ( _metPbokJnngYn== null ) { if ( __metPbokJnngYn!= null ) return false; }
			else if ( !_metPbokJnngYn.equals(__metPbokJnngYn) ) return false;
		}
		{
			Object _metRgsDt= getMetRgsDt();
			Object __metRgsDt= other.getMetRgsDt();
			if ( _metRgsDt== null ) { if ( __metRgsDt!= null ) return false; }
			else if ( !_metRgsDt.equals(__metRgsDt) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _ebnkUtzpeNo= getEbnkUtzpeNo();
			Object __ebnkUtzpeNo= other.getEbnkUtzpeNo();
			if ( _ebnkUtzpeNo== null ) { if ( __ebnkUtzpeNo!= null ) return false; }
			else if ( !_ebnkUtzpeNo.equals(__ebnkUtzpeNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokJnngInf_ODT.class.getName()).append(":\n");
		sb.append("\tlginYn: ");
		sb.append(lginYn==null?"null":getLginYn());
		sb.append("\n");
		sb.append("\tmetPbokJnngYn: ");
		sb.append(metPbokJnngYn==null?"null":getMetPbokJnngYn());
		sb.append("\n");
		sb.append("\tmetRgsDt: ");
		sb.append(metRgsDt==null?"null":getMetRgsDt());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tebnkUtzpeNo: ");
		sb.append(ebnkUtzpeNo==null?"null":getEbnkUtzpeNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* lginYn */
		messageLen+= 1; /* metPbokJnngYn */
		messageLen+= 8; /* metRgsDt */
		messageLen+= 36; /* itcsno */
		messageLen+= 13; /* ebnkUtzpeNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("lginYn");
		list.add("metPbokJnngYn");
		list.add("metRgsDt");
		list.add("itcsno");
		list.add("ebnkUtzpeNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("lginYn", get("lginYn"));
		map.put("metPbokJnngYn", get("metPbokJnngYn"));
		map.put("metRgsDt", get("metRgsDt"));
		map.put("itcsno", get("itcsno"));
		map.put("ebnkUtzpeNo", get("ebnkUtzpeNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1104659691:/* lginYn */
			return getLginYn();
		case -754165284:/* metPbokJnngYn */
			return getMetPbokJnngYn();
		case -463751790:/* metRgsDt */
			return getMetRgsDt();
		case -1178714660:/* itcsno */
			return getItcsno();
		case -1070809513:/* ebnkUtzpeNo */
			return getEbnkUtzpeNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1104659691:/* lginYn */
			setLginYn((String)value);
			break;
		case -754165284:/* metPbokJnngYn */
			setMetPbokJnngYn((String)value);
			break;
		case -463751790:/* metRgsDt */
			setMetRgsDt((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case -1070809513:/* ebnkUtzpeNo */
			setEbnkUtzpeNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
