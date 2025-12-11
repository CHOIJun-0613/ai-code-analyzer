/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import option.WooriOmmOption;

/**
 * 계좌목록 DTO
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"actNm", "actNo", "byactNm", "pbokBal"
}, name="INBActList_DTO")
@XmlRootElement(name="INBActList_DTO")
@BxmCategory(logicalName="계좌목록 DTO", description="계좌목록 DTO") 
public class INBActList_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -87598685L;
	
	
	
	/**
	 * 계좌명
	 */
	@ApiModelProperty(
		name = "actNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actNm")
	@BxmOmm_Field(length=50, decimal=0, description="계좌명", align="left", fill="")
	private String actNm= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "actNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actNo")
	@BxmOmm_Field(length=34, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String actNo= "";
	
	
	/**
	 * 계좌별명
	 */
	@ApiModelProperty(
		name = "byactNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("byactNm")
	@BxmOmm_Field(length=50, decimal=0, description="계좌별명", align="left", fill="")
	private String byactNm= "";
	
	
	/**
	 * 통장잔액
	 */
	@ApiModelProperty(
		name = "pbokBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("pbokBal")
	@BxmOmm_Field(length=19, decimal=3, description="통장잔액", align="right", fill="")
	private BigDecimal pbokBal= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actNm= false;
	protected final boolean isSet_actNm(){
		return this.isSet_actNm;
	}
	private void setIsSet_actNm(boolean value){
		this.isSet_actNm= value;
	}
	/**
	 * 계좌명
	 */
	@XmlTransient
	public String getActNm(){
		return this.actNm;
	}
	
	/**
	 * 계좌명
	 * 
	 * @param actNm 계좌명
	 */
	public void setActNm(String actNm){
		this.actNm= actNm;
		this.setIsSet_actNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actNo= false;
	protected final boolean isSet_actNo(){
		return this.isSet_actNo;
	}
	private void setIsSet_actNo(boolean value){
		this.isSet_actNo= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getActNo(){
		return this.actNo;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param actNo 계좌번호
	 */
	public void setActNo(String actNo){
		this.actNo= actNo;
		this.setIsSet_actNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_byactNm= false;
	protected final boolean isSet_byactNm(){
		return this.isSet_byactNm;
	}
	private void setIsSet_byactNm(boolean value){
		this.isSet_byactNm= value;
	}
	/**
	 * 계좌별명
	 */
	@XmlTransient
	public String getByactNm(){
		return this.byactNm;
	}
	
	/**
	 * 계좌별명
	 * 
	 * @param byactNm 계좌별명
	 */
	public void setByactNm(String byactNm){
		this.byactNm= byactNm;
		this.setIsSet_byactNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pbokBal= false;
	protected final boolean isSet_pbokBal(){
		return this.isSet_pbokBal;
	}
	private void setIsSet_pbokBal(boolean value){
		this.isSet_pbokBal= value;
	}
	/**
	 * 통장잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param pbokBal 통장잔액
	 */
	public void setPbokBal(double pbokBal) {
		setPbokBal(BigDecimal.valueOf(pbokBal));
	}
	/**
	 * 통장잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param pbokBal 통장잔액
	 */
	public void setPbokBal(long pbokBal) {
		setPbokBal(BigDecimal.valueOf(pbokBal));
	}
	/**
	 * 통장잔액
	 * BigDecimal - String value setter
	 *
	 * @Param pbokBal 통장잔액
	 */
	public void setPbokBal(String pbokBal) {
		setPbokBal(new BigDecimal(pbokBal));
	}
	/**
	 * 통장잔액
	 */
	@XmlTransient
	public BigDecimal getPbokBal(){
		return this.pbokBal;
	}
	
	/**
	 * 통장잔액
	 * 
	 * @param pbokBal 통장잔액
	 */
	@JsonSetter("pbokBal")
	public void setPbokBal(BigDecimal pbokBal){
		this.pbokBal= pbokBal;
		this.setIsSet_pbokBal(true);
	}
				
	@Override
	public INBActList_DTO clone(){
		try{
			INBActList_DTO object= (INBActList_DTO)super.clone();
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
		
		result= prime * result + ((this.actNm==null)?0:this.actNm.hashCode());
		result= prime * result + ((this.actNo==null)?0:this.actNo.hashCode());
		result= prime * result + ((this.byactNm==null)?0:this.byactNm.hashCode());
		result= prime * result + ((this.pbokBal==null)?0:this.pbokBal.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBActList_DTO other= (INBActList_DTO)obj;
		{
			Object _actNm= getActNm();
			Object __actNm= other.getActNm();
			if ( _actNm== null ) { if ( __actNm!= null ) return false; }
			else if ( !_actNm.equals(__actNm) ) return false;
		}
		{
			Object _actNo= getActNo();
			Object __actNo= other.getActNo();
			if ( _actNo== null ) { if ( __actNo!= null ) return false; }
			else if ( !_actNo.equals(__actNo) ) return false;
		}
		{
			Object _byactNm= getByactNm();
			Object __byactNm= other.getByactNm();
			if ( _byactNm== null ) { if ( __byactNm!= null ) return false; }
			else if ( !_byactNm.equals(__byactNm) ) return false;
		}
		{
			Object _pbokBal= getPbokBal();
			Object __pbokBal= other.getPbokBal();
			if ( _pbokBal== null ) { if ( __pbokBal!= null ) return false; }
			else if ( !_pbokBal.equals(__pbokBal) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBActList_DTO.class.getName()).append(":\n");
		sb.append("\tactNm: ");
		sb.append(actNm==null?"null":getActNm());
		sb.append("\n");
		sb.append("\tactNo: ");
		sb.append(actNo==null?"null":getActNo());
		sb.append("\n");
		sb.append("\tbyactNm: ");
		sb.append(byactNm==null?"null":getByactNm());
		sb.append("\n");
		sb.append("\tpbokBal: ");
		sb.append(pbokBal==null?"null":getPbokBal());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 50; /* actNm */
		messageLen+= 34; /* actNo */
		messageLen+= 50; /* byactNm */
		messageLen+= 19; /* pbokBal */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("actNm");
		list.add("actNo");
		list.add("byactNm");
		list.add("pbokBal");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("actNm", get("actNm"));
		map.put("actNo", get("actNo"));
		map.put("byactNm", get("byactNm"));
		map.put("pbokBal", get("pbokBal"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 92644849:/* actNm */
			return getActNm();
		case 92644851:/* actNo */
			return getActNo();
		case 337819642:/* byactNm */
			return getByactNm();
		case -767381025:/* pbokBal */
			return getPbokBal();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 92644849:/* actNm */
			setActNm((String)value);
			break;
		case 92644851:/* actNo */
			setActNo((String)value);
			break;
		case 337819642:/* byactNm */
			setByactNm((String)value);
			break;
		case -767381025:/* pbokBal */
			if ( value instanceof String ){
				setPbokBal((String)value);
			}
			else if ( value instanceof Double ){
				setPbokBal((Double)value);
			}
			else if ( value instanceof Long ){
				setPbokBal((Long)value);
			}
			else{
				setPbokBal((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
