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
	"esnsMbhNo", "itcsno", "metCrtfMbhSrno", "metMbhSrno", "metMbhDscd", "metMbhHpNo", "utzpeNoCfcd"
}, name="MPBMetPbokMbhWaitInfGridAmd_IDT")
@XmlRootElement(name="MPBMetPbokMbhWaitInfGridAmd_IDT")
@BxmCategory(logicalName="모임통장.회원.대기정보.GRID.수정.컨트롤러.입력.IO", description="") 
public class MPBMetPbokMbhWaitInfGridAmd_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 315679245L;
	
	
	
	/**
	 * 간편회원번호
	 */
	@ApiModelProperty(
		name = "esnsMbhNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsMbhNo")
	@BxmOmm_Field(length=11, decimal=0, description="간편회원번호", align="left", fill="")
	private String esnsMbhNo= "";
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=11, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 모임인증회원일련번호
	 */
	@ApiModelProperty(
		name = "metCrtfMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metCrtfMbhSrno")
	@BxmOmm_Field(length=5, decimal=0, description="모임인증회원일련번호", align="right", fill="")
	private Integer metCrtfMbhSrno= 0;
	
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="모임회원일련번호", align="right", fill="")
	private Integer metMbhSrno= 0;
	
	
	/**
	 * 모임회원구분코드
	 */
	@ApiModelProperty(
		name = "metMbhDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임회원구분코드", align="left", fill="")
	private String metMbhDscd= "";
	
	
	/**
	 * 모임회원핸드폰번호
	 */
	@ApiModelProperty(
		name = "metMbhHpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhHpNo")
	@BxmOmm_Field(length=11, decimal=0, description="모임회원핸드폰번호", align="left", fill="")
	private String metMbhHpNo= "";
	
	
	/**
	 * 이용자번호분류코드
	 */
	@ApiModelProperty(
		name = "utzpeNoCfcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("utzpeNoCfcd")
	@BxmOmm_Field(length=1, decimal=0, description="이용자번호분류코드", align="left", fill="")
	private String utzpeNoCfcd= "";
	
	
	
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
	 * 간편회원번호
	 */
	@XmlTransient
	public String getEsnsMbhNo(){
		return this.esnsMbhNo;
	}
	
	/**
	 * 간편회원번호
	 * 
	 * @param esnsMbhNo 간편회원번호
	 */
	public void setEsnsMbhNo(String esnsMbhNo){
		this.esnsMbhNo= esnsMbhNo;
		this.setIsSet_esnsMbhNo(true);
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
	private boolean isSet_metCrtfMbhSrno= false;
	protected final boolean isSet_metCrtfMbhSrno(){
		return this.isSet_metCrtfMbhSrno;
	}
	private void setIsSet_metCrtfMbhSrno(boolean value){
		this.isSet_metCrtfMbhSrno= value;
	}
	/**
	 * 모임인증회원일련번호
	 */
	@XmlTransient
	public Integer getMetCrtfMbhSrno(){
		return this.metCrtfMbhSrno;
	}
	
	/**
	 * 모임인증회원일련번호
	 * 
	 * @param metCrtfMbhSrno 모임인증회원일련번호
	 */
	public void setMetCrtfMbhSrno(Integer metCrtfMbhSrno){
		this.metCrtfMbhSrno= metCrtfMbhSrno;
		this.setIsSet_metCrtfMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhSrno= false;
	protected final boolean isSet_metMbhSrno(){
		return this.isSet_metMbhSrno;
	}
	private void setIsSet_metMbhSrno(boolean value){
		this.isSet_metMbhSrno= value;
	}
	/**
	 * 모임회원일련번호
	 */
	@XmlTransient
	public Integer getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(Integer metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhDscd= false;
	protected final boolean isSet_metMbhDscd(){
		return this.isSet_metMbhDscd;
	}
	private void setIsSet_metMbhDscd(boolean value){
		this.isSet_metMbhDscd= value;
	}
	/**
	 * 모임회원구분코드
	 */
	@XmlTransient
	public String getMetMbhDscd(){
		return this.metMbhDscd;
	}
	
	/**
	 * 모임회원구분코드
	 * 
	 * @param metMbhDscd 모임회원구분코드
	 */
	public void setMetMbhDscd(String metMbhDscd){
		this.metMbhDscd= metMbhDscd;
		this.setIsSet_metMbhDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhHpNo= false;
	protected final boolean isSet_metMbhHpNo(){
		return this.isSet_metMbhHpNo;
	}
	private void setIsSet_metMbhHpNo(boolean value){
		this.isSet_metMbhHpNo= value;
	}
	/**
	 * 모임회원핸드폰번호
	 */
	@XmlTransient
	public String getMetMbhHpNo(){
		return this.metMbhHpNo;
	}
	
	/**
	 * 모임회원핸드폰번호
	 * 
	 * @param metMbhHpNo 모임회원핸드폰번호
	 */
	public void setMetMbhHpNo(String metMbhHpNo){
		this.metMbhHpNo= metMbhHpNo;
		this.setIsSet_metMbhHpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_utzpeNoCfcd= false;
	protected final boolean isSet_utzpeNoCfcd(){
		return this.isSet_utzpeNoCfcd;
	}
	private void setIsSet_utzpeNoCfcd(boolean value){
		this.isSet_utzpeNoCfcd= value;
	}
	/**
	 * 이용자번호분류코드
	 */
	@XmlTransient
	public String getUtzpeNoCfcd(){
		return this.utzpeNoCfcd;
	}
	
	/**
	 * 이용자번호분류코드
	 * 
	 * @param utzpeNoCfcd 이용자번호분류코드
	 */
	public void setUtzpeNoCfcd(String utzpeNoCfcd){
		this.utzpeNoCfcd= utzpeNoCfcd;
		this.setIsSet_utzpeNoCfcd(true);
	}
				
	@Override
	public MPBMetPbokMbhWaitInfGridAmd_IDT clone(){
		try{
			MPBMetPbokMbhWaitInfGridAmd_IDT object= (MPBMetPbokMbhWaitInfGridAmd_IDT)super.clone();
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
		
		result= prime * result + ((this.esnsMbhNo==null)?0:this.esnsMbhNo.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.metCrtfMbhSrno==null)?0:this.metCrtfMbhSrno.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.metMbhDscd==null)?0:this.metMbhDscd.hashCode());
		result= prime * result + ((this.metMbhHpNo==null)?0:this.metMbhHpNo.hashCode());
		result= prime * result + ((this.utzpeNoCfcd==null)?0:this.utzpeNoCfcd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokMbhWaitInfGridAmd_IDT other= (MPBMetPbokMbhWaitInfGridAmd_IDT)obj;
		{
			Object _esnsMbhNo= getEsnsMbhNo();
			Object __esnsMbhNo= other.getEsnsMbhNo();
			if ( _esnsMbhNo== null ) { if ( __esnsMbhNo!= null ) return false; }
			else if ( !_esnsMbhNo.equals(__esnsMbhNo) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _metCrtfMbhSrno= getMetCrtfMbhSrno();
			Object __metCrtfMbhSrno= other.getMetCrtfMbhSrno();
			if ( _metCrtfMbhSrno== null ) { if ( __metCrtfMbhSrno!= null ) return false; }
			else if ( !_metCrtfMbhSrno.equals(__metCrtfMbhSrno) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _metMbhDscd= getMetMbhDscd();
			Object __metMbhDscd= other.getMetMbhDscd();
			if ( _metMbhDscd== null ) { if ( __metMbhDscd!= null ) return false; }
			else if ( !_metMbhDscd.equals(__metMbhDscd) ) return false;
		}
		{
			Object _metMbhHpNo= getMetMbhHpNo();
			Object __metMbhHpNo= other.getMetMbhHpNo();
			if ( _metMbhHpNo== null ) { if ( __metMbhHpNo!= null ) return false; }
			else if ( !_metMbhHpNo.equals(__metMbhHpNo) ) return false;
		}
		{
			Object _utzpeNoCfcd= getUtzpeNoCfcd();
			Object __utzpeNoCfcd= other.getUtzpeNoCfcd();
			if ( _utzpeNoCfcd== null ) { if ( __utzpeNoCfcd!= null ) return false; }
			else if ( !_utzpeNoCfcd.equals(__utzpeNoCfcd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokMbhWaitInfGridAmd_IDT.class.getName()).append(":\n");
		sb.append("\tesnsMbhNo: ");
		sb.append(esnsMbhNo==null?"null":getEsnsMbhNo());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tmetCrtfMbhSrno: ");
		sb.append(metCrtfMbhSrno==null?"null":getMetCrtfMbhSrno());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tmetMbhDscd: ");
		sb.append(metMbhDscd==null?"null":getMetMbhDscd());
		sb.append("\n");
		sb.append("\tmetMbhHpNo: ");
		sb.append(metMbhHpNo==null?"null":getMetMbhHpNo());
		sb.append("\n");
		sb.append("\tutzpeNoCfcd: ");
		sb.append(utzpeNoCfcd==null?"null":getUtzpeNoCfcd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 11; /* esnsMbhNo */
		messageLen+= 11; /* itcsno */
		messageLen+= 5; /* metCrtfMbhSrno */
		messageLen+= 7; /* metMbhSrno */
		messageLen+= 1; /* metMbhDscd */
		messageLen+= 11; /* metMbhHpNo */
		messageLen+= 1; /* utzpeNoCfcd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("esnsMbhNo");
		list.add("itcsno");
		list.add("metCrtfMbhSrno");
		list.add("metMbhSrno");
		list.add("metMbhDscd");
		list.add("metMbhHpNo");
		list.add("utzpeNoCfcd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("esnsMbhNo", get("esnsMbhNo"));
		map.put("itcsno", get("itcsno"));
		map.put("metCrtfMbhSrno", get("metCrtfMbhSrno"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("metMbhDscd", get("metMbhDscd"));
		map.put("metMbhHpNo", get("metMbhHpNo"));
		map.put("utzpeNoCfcd", get("utzpeNoCfcd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1396906143:/* esnsMbhNo */
			return getEsnsMbhNo();
		case -1178714660:/* itcsno */
			return getItcsno();
		case -1421578602:/* metCrtfMbhSrno */
			return getMetCrtfMbhSrno();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case 715275207:/* metMbhDscd */
			return getMetMbhDscd();
		case 715390848:/* metMbhHpNo */
			return getMetMbhHpNo();
		case 1125715573:/* utzpeNoCfcd */
			return getUtzpeNoCfcd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1396906143:/* esnsMbhNo */
			setEsnsMbhNo((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case -1421578602:/* metCrtfMbhSrno */
			setMetCrtfMbhSrno((Integer)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
			break;
		case 715275207:/* metMbhDscd */
			setMetMbhDscd((String)value);
			break;
		case 715390848:/* metMbhHpNo */
			setMetMbhHpNo((String)value);
			break;
		case 1125715573:/* utzpeNoCfcd */
			setUtzpeNoCfcd((String)value);
			break;
		default:
			break;
		}
	}
	
}
