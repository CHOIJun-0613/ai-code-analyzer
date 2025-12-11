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
 * 머니클립지갑노출순서등록.입력.IO DIDT
 */
@XmlType(propOrder={
	"dpsInpAcno", "wallAcno", "iconNo", "wallNm"
}, name="SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT")
@XmlRootElement(name="SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT")
@BxmCategory(logicalName="SHR 머니클립지갑노출순서등록.입력.IO", description="머니클립지갑노출순서등록.입력.IO DIDT") 
public class SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1126775204L;
	
	
	
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
	 * 지갑계좌번호
	 */
	@ApiModelProperty(
		name = "wallAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wallAcno")
	@BxmOmm_Field(length=15, decimal=0, description="지갑계좌번호", align="left", fill="")
	private String wallAcno= "";
	
	
	/**
	 * 아이콘코드
	 */
	@ApiModelProperty(
		name = "iconNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("iconNo")
	@BxmOmm_Field(length=2, decimal=0, description="아이콘코드", align="left", fill="")
	private String iconNo= "";
	
	
	/**
	 * 지갑명
	 */
	@ApiModelProperty(
		name = "wallNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wallNm")
	@BxmOmm_Field(length=50, decimal=0, description="지갑명", align="left", fill="")
	private String wallNm= "";
	
	
	
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
	private boolean isSet_wallAcno= false;
	protected final boolean isSet_wallAcno(){
		return this.isSet_wallAcno;
	}
	private void setIsSet_wallAcno(boolean value){
		this.isSet_wallAcno= value;
	}
	/**
	 * 지갑계좌번호
	 */
	@XmlTransient
	public String getWallAcno(){
		return this.wallAcno;
	}
	
	/**
	 * 지갑계좌번호
	 * 
	 * @param wallAcno 지갑계좌번호
	 */
	public void setWallAcno(String wallAcno){
		this.wallAcno= wallAcno;
		this.setIsSet_wallAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iconNo= false;
	protected final boolean isSet_iconNo(){
		return this.isSet_iconNo;
	}
	private void setIsSet_iconNo(boolean value){
		this.isSet_iconNo= value;
	}
	/**
	 * 아이콘코드
	 */
	@XmlTransient
	public String getIconNo(){
		return this.iconNo;
	}
	
	/**
	 * 아이콘코드
	 * 
	 * @param iconNo 아이콘코드
	 */
	public void setIconNo(String iconNo){
		this.iconNo= iconNo;
		this.setIsSet_iconNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wallNm= false;
	protected final boolean isSet_wallNm(){
		return this.isSet_wallNm;
	}
	private void setIsSet_wallNm(boolean value){
		this.isSet_wallNm= value;
	}
	/**
	 * 지갑명
	 */
	@XmlTransient
	public String getWallNm(){
		return this.wallNm;
	}
	
	/**
	 * 지갑명
	 * 
	 * @param wallNm 지갑명
	 */
	public void setWallNm(String wallNm){
		this.wallNm= wallNm;
		this.setIsSet_wallNm(true);
	}
				
	@Override
	public SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT clone(){
		try{
			SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT object= (SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT)super.clone();
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
		result= prime * result + ((this.wallAcno==null)?0:this.wallAcno.hashCode());
		result= prime * result + ((this.iconNo==null)?0:this.iconNo.hashCode());
		result= prime * result + ((this.wallNm==null)?0:this.wallNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT other= (SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _wallAcno= getWallAcno();
			Object __wallAcno= other.getWallAcno();
			if ( _wallAcno== null ) { if ( __wallAcno!= null ) return false; }
			else if ( !_wallAcno.equals(__wallAcno) ) return false;
		}
		{
			Object _iconNo= getIconNo();
			Object __iconNo= other.getIconNo();
			if ( _iconNo== null ) { if ( __iconNo!= null ) return false; }
			else if ( !_iconNo.equals(__iconNo) ) return false;
		}
		{
			Object _wallNm= getWallNm();
			Object __wallNm= other.getWallNm();
			if ( _wallNm== null ) { if ( __wallNm!= null ) return false; }
			else if ( !_wallNm.equals(__wallNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRMNPWallBizInsertMnyClpWallExpsSeq_DIDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\twallAcno: ");
		sb.append(wallAcno==null?"null":getWallAcno());
		sb.append("\n");
		sb.append("\ticonNo: ");
		sb.append(iconNo==null?"null":getIconNo());
		sb.append("\n");
		sb.append("\twallNm: ");
		sb.append(wallNm==null?"null":getWallNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 15; /* wallAcno */
		messageLen+= 2; /* iconNo */
		messageLen+= 50; /* wallNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsInpAcno");
		list.add("wallAcno");
		list.add("iconNo");
		list.add("wallNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("wallAcno", get("wallAcno"));
		map.put("iconNo", get("iconNo"));
		map.put("wallNm", get("wallNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case 323267149:/* wallAcno */
			return getWallAcno();
		case -1194062822:/* iconNo */
			return getIconNo();
		case -795193047:/* wallNm */
			return getWallNm();
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
		case 323267149:/* wallAcno */
			setWallAcno((String)value);
			break;
		case -1194062822:/* iconNo */
			setIconNo((String)value);
			break;
		case -795193047:/* wallNm */
			setWallNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
