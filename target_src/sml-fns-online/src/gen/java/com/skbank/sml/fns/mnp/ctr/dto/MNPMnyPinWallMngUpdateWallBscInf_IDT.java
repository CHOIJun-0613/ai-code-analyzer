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
	"dpsInpAcno", "wallAcno", "iconCd", "wallAlsNm"
}, name="MNPMnyPinWallMngUpdateWallBscInf_IDT")
@XmlRootElement(name="MNPMnyPinWallMngUpdateWallBscInf_IDT")
@BxmCategory(logicalName="머니클립지갑기본정보수정.입력.IO", description="") 
public class MNPMnyPinWallMngUpdateWallBscInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1093361545L;
	
	
	
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
		name = "iconCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("iconCd")
	@BxmOmm_Field(length=3, decimal=0, description="아이콘코드", align="left", fill="")
	private String iconCd= "";
	
	
	/**
	 * 지갑별칭명
	 */
	@ApiModelProperty(
		name = "wallAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wallAlsNm")
	@BxmOmm_Field(length=50, decimal=0, description="지갑별칭명", align="left", fill="")
	private String wallAlsNm= "";
	
	
	
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
	private boolean isSet_iconCd= false;
	protected final boolean isSet_iconCd(){
		return this.isSet_iconCd;
	}
	private void setIsSet_iconCd(boolean value){
		this.isSet_iconCd= value;
	}
	/**
	 * 아이콘코드
	 */
	@XmlTransient
	public String getIconCd(){
		return this.iconCd;
	}
	
	/**
	 * 아이콘코드
	 * 
	 * @param iconCd 아이콘코드
	 */
	public void setIconCd(String iconCd){
		this.iconCd= iconCd;
		this.setIsSet_iconCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wallAlsNm= false;
	protected final boolean isSet_wallAlsNm(){
		return this.isSet_wallAlsNm;
	}
	private void setIsSet_wallAlsNm(boolean value){
		this.isSet_wallAlsNm= value;
	}
	/**
	 * 지갑별칭명
	 */
	@XmlTransient
	public String getWallAlsNm(){
		return this.wallAlsNm;
	}
	
	/**
	 * 지갑별칭명
	 * 
	 * @param wallAlsNm 지갑별칭명
	 */
	public void setWallAlsNm(String wallAlsNm){
		this.wallAlsNm= wallAlsNm;
		this.setIsSet_wallAlsNm(true);
	}
				
	@Override
	public MNPMnyPinWallMngUpdateWallBscInf_IDT clone(){
		try{
			MNPMnyPinWallMngUpdateWallBscInf_IDT object= (MNPMnyPinWallMngUpdateWallBscInf_IDT)super.clone();
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
		result= prime * result + ((this.iconCd==null)?0:this.iconCd.hashCode());
		result= prime * result + ((this.wallAlsNm==null)?0:this.wallAlsNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngUpdateWallBscInf_IDT other= (MNPMnyPinWallMngUpdateWallBscInf_IDT)obj;
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
			Object _iconCd= getIconCd();
			Object __iconCd= other.getIconCd();
			if ( _iconCd== null ) { if ( __iconCd!= null ) return false; }
			else if ( !_iconCd.equals(__iconCd) ) return false;
		}
		{
			Object _wallAlsNm= getWallAlsNm();
			Object __wallAlsNm= other.getWallAlsNm();
			if ( _wallAlsNm== null ) { if ( __wallAlsNm!= null ) return false; }
			else if ( !_wallAlsNm.equals(__wallAlsNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngUpdateWallBscInf_IDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\twallAcno: ");
		sb.append(wallAcno==null?"null":getWallAcno());
		sb.append("\n");
		sb.append("\ticonCd: ");
		sb.append(iconCd==null?"null":getIconCd());
		sb.append("\n");
		sb.append("\twallAlsNm: ");
		sb.append(wallAlsNm==null?"null":getWallAlsNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 15; /* wallAcno */
		messageLen+= 3; /* iconCd */
		messageLen+= 50; /* wallAlsNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsInpAcno");
		list.add("wallAcno");
		list.add("iconCd");
		list.add("wallAlsNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("wallAcno", get("wallAcno"));
		map.put("iconCd", get("iconCd"));
		map.put("wallAlsNm", get("wallAlsNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case 323267149:/* wallAcno */
			return getWallAcno();
		case -1194063174:/* iconCd */
			return getIconCd();
		case 1431619037:/* wallAlsNm */
			return getWallAlsNm();
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
		case -1194063174:/* iconCd */
			setIconCd((String)value);
			break;
		case 1431619037:/* wallAlsNm */
			setWallAlsNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
