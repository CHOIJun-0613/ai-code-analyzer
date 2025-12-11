/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

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
	"wonPlayNtfcAgrYn", "trnPrtsNtfcAgrYn", "tdPvmNtfcAgrYn", "srvcDisv", "mchrUnqInfId", "natScrrNtfcAgrYn"
}, name="INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT")
@XmlRootElement(name="INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT")
@BxmCategory(logicalName="서비스알림.동의여부.컨트롤러.입력.IO", description="") 
public class INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1907509599L;
	
	
	
	/**
	 * 원플레이알림동의여부
	 */
	@ApiModelProperty(
		name = "wonPlayNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wonPlayNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="원플레이알림동의여부", align="left", fill="")
	private String wonPlayNtfcAgrYn= "";
	
	
	/**
	 * 거래내역알림동의여부
	 */
	@ApiModelProperty(
		name = "trnPrtsNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnPrtsNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="거래내역알림동의여부", align="left", fill="")
	private String trnPrtsNtfcAgrYn= "";
	
	
	/**
	 * 오늘의급식알림동의여부
	 */
	@ApiModelProperty(
		name = "tdPvmNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tdPvmNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="오늘의급식알림동의여부", align="left", fill="")
	private String tdPvmNtfcAgrYn= "";
	
	
	/**
	 * 서비스구분값
	 */
	@ApiModelProperty(
		name = "srvcDisv"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("srvcDisv")
	@BxmOmm_Field(length=20, decimal=0, description="서비스구분값", align="left", fill="")
	private String srvcDisv= "";
	
	
	/**
	 * 기기고유정보ID
	 */
	@ApiModelProperty(
		name = "mchrUnqInfId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mchrUnqInfId")
	@BxmOmm_Field(length=300, decimal=0, description="기기고유정보ID", align="left", fill="")
	private String mchrUnqInfId= "";
	
	
	/**
	 * 국민비서알림동의여부
	 */
	@ApiModelProperty(
		name = "natScrrNtfcAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("natScrrNtfcAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="국민비서알림동의여부", align="left", fill="")
	private String natScrrNtfcAgrYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wonPlayNtfcAgrYn= false;
	protected final boolean isSet_wonPlayNtfcAgrYn(){
		return this.isSet_wonPlayNtfcAgrYn;
	}
	private void setIsSet_wonPlayNtfcAgrYn(boolean value){
		this.isSet_wonPlayNtfcAgrYn= value;
	}
	/**
	 * 원플레이알림동의여부
	 */
	@XmlTransient
	public String getWonPlayNtfcAgrYn(){
		return this.wonPlayNtfcAgrYn;
	}
	
	/**
	 * 원플레이알림동의여부
	 * 
	 * @param wonPlayNtfcAgrYn 원플레이알림동의여부
	 */
	public void setWonPlayNtfcAgrYn(String wonPlayNtfcAgrYn){
		this.wonPlayNtfcAgrYn= wonPlayNtfcAgrYn;
		this.setIsSet_wonPlayNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnPrtsNtfcAgrYn= false;
	protected final boolean isSet_trnPrtsNtfcAgrYn(){
		return this.isSet_trnPrtsNtfcAgrYn;
	}
	private void setIsSet_trnPrtsNtfcAgrYn(boolean value){
		this.isSet_trnPrtsNtfcAgrYn= value;
	}
	/**
	 * 거래내역알림동의여부
	 */
	@XmlTransient
	public String getTrnPrtsNtfcAgrYn(){
		return this.trnPrtsNtfcAgrYn;
	}
	
	/**
	 * 거래내역알림동의여부
	 * 
	 * @param trnPrtsNtfcAgrYn 거래내역알림동의여부
	 */
	public void setTrnPrtsNtfcAgrYn(String trnPrtsNtfcAgrYn){
		this.trnPrtsNtfcAgrYn= trnPrtsNtfcAgrYn;
		this.setIsSet_trnPrtsNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tdPvmNtfcAgrYn= false;
	protected final boolean isSet_tdPvmNtfcAgrYn(){
		return this.isSet_tdPvmNtfcAgrYn;
	}
	private void setIsSet_tdPvmNtfcAgrYn(boolean value){
		this.isSet_tdPvmNtfcAgrYn= value;
	}
	/**
	 * 오늘의급식알림동의여부
	 */
	@XmlTransient
	public String getTdPvmNtfcAgrYn(){
		return this.tdPvmNtfcAgrYn;
	}
	
	/**
	 * 오늘의급식알림동의여부
	 * 
	 * @param tdPvmNtfcAgrYn 오늘의급식알림동의여부
	 */
	public void setTdPvmNtfcAgrYn(String tdPvmNtfcAgrYn){
		this.tdPvmNtfcAgrYn= tdPvmNtfcAgrYn;
		this.setIsSet_tdPvmNtfcAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_srvcDisv= false;
	protected final boolean isSet_srvcDisv(){
		return this.isSet_srvcDisv;
	}
	private void setIsSet_srvcDisv(boolean value){
		this.isSet_srvcDisv= value;
	}
	/**
	 * 서비스구분값
	 */
	@XmlTransient
	public String getSrvcDisv(){
		return this.srvcDisv;
	}
	
	/**
	 * 서비스구분값
	 * 
	 * @param srvcDisv 서비스구분값
	 */
	public void setSrvcDisv(String srvcDisv){
		this.srvcDisv= srvcDisv;
		this.setIsSet_srvcDisv(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mchrUnqInfId= false;
	protected final boolean isSet_mchrUnqInfId(){
		return this.isSet_mchrUnqInfId;
	}
	private void setIsSet_mchrUnqInfId(boolean value){
		this.isSet_mchrUnqInfId= value;
	}
	/**
	 * 기기고유정보ID
	 */
	@XmlTransient
	public String getMchrUnqInfId(){
		return this.mchrUnqInfId;
	}
	
	/**
	 * 기기고유정보ID
	 * 
	 * @param mchrUnqInfId 기기고유정보ID
	 */
	public void setMchrUnqInfId(String mchrUnqInfId){
		this.mchrUnqInfId= mchrUnqInfId;
		this.setIsSet_mchrUnqInfId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_natScrrNtfcAgrYn= false;
	protected final boolean isSet_natScrrNtfcAgrYn(){
		return this.isSet_natScrrNtfcAgrYn;
	}
	private void setIsSet_natScrrNtfcAgrYn(boolean value){
		this.isSet_natScrrNtfcAgrYn= value;
	}
	/**
	 * 국민비서알림동의여부
	 */
	@XmlTransient
	public String getNatScrrNtfcAgrYn(){
		return this.natScrrNtfcAgrYn;
	}
	
	/**
	 * 국민비서알림동의여부
	 * 
	 * @param natScrrNtfcAgrYn 국민비서알림동의여부
	 */
	public void setNatScrrNtfcAgrYn(String natScrrNtfcAgrYn){
		this.natScrrNtfcAgrYn= natScrrNtfcAgrYn;
		this.setIsSet_natScrrNtfcAgrYn(true);
	}
				
	@Override
	public INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT clone(){
		try{
			INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT object= (INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT)super.clone();
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
		
		result= prime * result + ((this.wonPlayNtfcAgrYn==null)?0:this.wonPlayNtfcAgrYn.hashCode());
		result= prime * result + ((this.trnPrtsNtfcAgrYn==null)?0:this.trnPrtsNtfcAgrYn.hashCode());
		result= prime * result + ((this.tdPvmNtfcAgrYn==null)?0:this.tdPvmNtfcAgrYn.hashCode());
		result= prime * result + ((this.srvcDisv==null)?0:this.srvcDisv.hashCode());
		result= prime * result + ((this.mchrUnqInfId==null)?0:this.mchrUnqInfId.hashCode());
		result= prime * result + ((this.natScrrNtfcAgrYn==null)?0:this.natScrrNtfcAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT other= (INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT)obj;
		{
			Object _wonPlayNtfcAgrYn= getWonPlayNtfcAgrYn();
			Object __wonPlayNtfcAgrYn= other.getWonPlayNtfcAgrYn();
			if ( _wonPlayNtfcAgrYn== null ) { if ( __wonPlayNtfcAgrYn!= null ) return false; }
			else if ( !_wonPlayNtfcAgrYn.equals(__wonPlayNtfcAgrYn) ) return false;
		}
		{
			Object _trnPrtsNtfcAgrYn= getTrnPrtsNtfcAgrYn();
			Object __trnPrtsNtfcAgrYn= other.getTrnPrtsNtfcAgrYn();
			if ( _trnPrtsNtfcAgrYn== null ) { if ( __trnPrtsNtfcAgrYn!= null ) return false; }
			else if ( !_trnPrtsNtfcAgrYn.equals(__trnPrtsNtfcAgrYn) ) return false;
		}
		{
			Object _tdPvmNtfcAgrYn= getTdPvmNtfcAgrYn();
			Object __tdPvmNtfcAgrYn= other.getTdPvmNtfcAgrYn();
			if ( _tdPvmNtfcAgrYn== null ) { if ( __tdPvmNtfcAgrYn!= null ) return false; }
			else if ( !_tdPvmNtfcAgrYn.equals(__tdPvmNtfcAgrYn) ) return false;
		}
		{
			Object _srvcDisv= getSrvcDisv();
			Object __srvcDisv= other.getSrvcDisv();
			if ( _srvcDisv== null ) { if ( __srvcDisv!= null ) return false; }
			else if ( !_srvcDisv.equals(__srvcDisv) ) return false;
		}
		{
			Object _mchrUnqInfId= getMchrUnqInfId();
			Object __mchrUnqInfId= other.getMchrUnqInfId();
			if ( _mchrUnqInfId== null ) { if ( __mchrUnqInfId!= null ) return false; }
			else if ( !_mchrUnqInfId.equals(__mchrUnqInfId) ) return false;
		}
		{
			Object _natScrrNtfcAgrYn= getNatScrrNtfcAgrYn();
			Object __natScrrNtfcAgrYn= other.getNatScrrNtfcAgrYn();
			if ( _natScrrNtfcAgrYn== null ) { if ( __natScrrNtfcAgrYn!= null ) return false; }
			else if ( !_natScrrNtfcAgrYn.equals(__natScrrNtfcAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxPushEtcEstUpdateSrvcNtfcAgrYn_IDT.class.getName()).append(":\n");
		sb.append("\twonPlayNtfcAgrYn: ");
		sb.append(wonPlayNtfcAgrYn==null?"null":getWonPlayNtfcAgrYn());
		sb.append("\n");
		sb.append("\ttrnPrtsNtfcAgrYn: ");
		sb.append(trnPrtsNtfcAgrYn==null?"null":getTrnPrtsNtfcAgrYn());
		sb.append("\n");
		sb.append("\ttdPvmNtfcAgrYn: ");
		sb.append(tdPvmNtfcAgrYn==null?"null":getTdPvmNtfcAgrYn());
		sb.append("\n");
		sb.append("\tsrvcDisv: ");
		sb.append(srvcDisv==null?"null":getSrvcDisv());
		sb.append("\n");
		sb.append("\tmchrUnqInfId: ");
		sb.append(mchrUnqInfId==null?"null":getMchrUnqInfId());
		sb.append("\n");
		sb.append("\tnatScrrNtfcAgrYn: ");
		sb.append(natScrrNtfcAgrYn==null?"null":getNatScrrNtfcAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* wonPlayNtfcAgrYn */
		messageLen+= 1; /* trnPrtsNtfcAgrYn */
		messageLen+= 1; /* tdPvmNtfcAgrYn */
		messageLen+= 20; /* srvcDisv */
		messageLen+= 300; /* mchrUnqInfId */
		messageLen+= 1; /* natScrrNtfcAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("wonPlayNtfcAgrYn");
		list.add("trnPrtsNtfcAgrYn");
		list.add("tdPvmNtfcAgrYn");
		list.add("srvcDisv");
		list.add("mchrUnqInfId");
		list.add("natScrrNtfcAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("wonPlayNtfcAgrYn", get("wonPlayNtfcAgrYn"));
		map.put("trnPrtsNtfcAgrYn", get("trnPrtsNtfcAgrYn"));
		map.put("tdPvmNtfcAgrYn", get("tdPvmNtfcAgrYn"));
		map.put("srvcDisv", get("srvcDisv"));
		map.put("mchrUnqInfId", get("mchrUnqInfId"));
		map.put("natScrrNtfcAgrYn", get("natScrrNtfcAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -2033065932:/* wonPlayNtfcAgrYn */
			return getWonPlayNtfcAgrYn();
		case 1897464621:/* trnPrtsNtfcAgrYn */
			return getTrnPrtsNtfcAgrYn();
		case -1892471513:/* tdPvmNtfcAgrYn */
			return getTdPvmNtfcAgrYn();
		case 127728916:/* srvcDisv */
			return getSrvcDisv();
		case 488711172:/* mchrUnqInfId */
			return getMchrUnqInfId();
		case -1252259923:/* natScrrNtfcAgrYn */
			return getNatScrrNtfcAgrYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -2033065932:/* wonPlayNtfcAgrYn */
			setWonPlayNtfcAgrYn((String)value);
			break;
		case 1897464621:/* trnPrtsNtfcAgrYn */
			setTrnPrtsNtfcAgrYn((String)value);
			break;
		case -1892471513:/* tdPvmNtfcAgrYn */
			setTdPvmNtfcAgrYn((String)value);
			break;
		case 127728916:/* srvcDisv */
			setSrvcDisv((String)value);
			break;
		case 488711172:/* mchrUnqInfId */
			setMchrUnqInfId((String)value);
			break;
		case -1252259923:/* natScrrNtfcAgrYn */
			setNatScrrNtfcAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
