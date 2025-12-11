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
 * 자금이체 SMS 인증 대상확인.DBM.출력.IO
 */
@XmlType(propOrder={
	"tgtYn", "mdngSmsTgtYn", "addCrtfXtYn", "crtfXtSmsNtcYn", "addCrtfTsAplYn", "addCerdAplYn", "brChidSecrdHldgYn", "frgStayTgtYn", "hndpeYn", "spr"
}, name="IBSMR0002202_DODT")
@XmlRootElement(name="IBSMR0002202_DODT")
@BxmCategory(logicalName="자금이체SMS인증대상확인.DBM.출력.IO", description="자금이체 SMS 인증 대상확인.DBM.출력.IO") 
public class IBSMR0002202_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1901758281L;
	
	
	
	/**
	 * 대상여부
	 */
	@ApiModelProperty(
		name = "tgtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tgtYn")
	@BxmOmm_Field(length=1, decimal=0, description="대상여부", align="left", fill="")
	private String tgtYn= "";
	
	
	/**
	 * 심야SMS대상여부
	 */
	@ApiModelProperty(
		name = "mdngSmsTgtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mdngSmsTgtYn")
	@BxmOmm_Field(length=1, decimal=0, description="심야SMS대상여부", align="left", fill="")
	private String mdngSmsTgtYn= "";
	
	
	/**
	 * 추가인증제외여부
	 */
	@ApiModelProperty(
		name = "addCrtfXtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("addCrtfXtYn")
	@BxmOmm_Field(length=1, decimal=0, description="추가인증제외여부", align="left", fill="")
	private String addCrtfXtYn= "";
	
	
	/**
	 * 인증제외SMS통지여부
	 */
	@ApiModelProperty(
		name = "crtfXtSmsNtcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("crtfXtSmsNtcYn")
	@BxmOmm_Field(length=1, decimal=0, description="인증제외SMS통지여부", align="left", fill="")
	private String crtfXtSmsNtcYn= "";
	
	
	/**
	 * 추가인증이체적용여부
	 */
	@ApiModelProperty(
		name = "addCrtfTsAplYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("addCrtfTsAplYn")
	@BxmOmm_Field(length=1, decimal=0, description="추가인증이체적용여부", align="left", fill="")
	private String addCrtfTsAplYn= "";
	
	
	/**
	 * 추가인증서적용여부
	 */
	@ApiModelProperty(
		name = "addCerdAplYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("addCerdAplYn")
	@BxmOmm_Field(length=1, decimal=0, description="추가인증서적용여부", align="left", fill="")
	private String addCerdAplYn= "";
	
	
	/**
	 * 점자보안카드보유여부
	 */
	@ApiModelProperty(
		name = "brChidSecrdHldgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("brChidSecrdHldgYn")
	@BxmOmm_Field(length=1, decimal=0, description="점자보안카드보유여부", align="left", fill="")
	private String brChidSecrdHldgYn= "";
	
	
	/**
	 * 해외체류대상여부
	 */
	@ApiModelProperty(
		name = "frgStayTgtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("frgStayTgtYn")
	@BxmOmm_Field(length=1, decimal=0, description="해외체류대상여부", align="left", fill="")
	private String frgStayTgtYn= "";
	
	
	/**
	 * 장애인여부
	 */
	@ApiModelProperty(
		name = "hndpeYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hndpeYn")
	@BxmOmm_Field(length=1, decimal=0, description="장애인여부", align="left", fill="")
	private String hndpeYn= "";
	
	
	/**
	 * 예비
	 */
	@ApiModelProperty(
		name = "spr"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spr")
	@BxmOmm_Field(length=91, decimal=0, description="예비", align="left", fill="")
	private String spr= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tgtYn= false;
	protected final boolean isSet_tgtYn(){
		return this.isSet_tgtYn;
	}
	private void setIsSet_tgtYn(boolean value){
		this.isSet_tgtYn= value;
	}
	/**
	 * 대상여부
	 */
	@XmlTransient
	public String getTgtYn(){
		return this.tgtYn;
	}
	
	/**
	 * 대상여부
	 * 
	 * @param tgtYn 대상여부
	 */
	public void setTgtYn(String tgtYn){
		this.tgtYn= tgtYn;
		this.setIsSet_tgtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mdngSmsTgtYn= false;
	protected final boolean isSet_mdngSmsTgtYn(){
		return this.isSet_mdngSmsTgtYn;
	}
	private void setIsSet_mdngSmsTgtYn(boolean value){
		this.isSet_mdngSmsTgtYn= value;
	}
	/**
	 * 심야SMS대상여부
	 */
	@XmlTransient
	public String getMdngSmsTgtYn(){
		return this.mdngSmsTgtYn;
	}
	
	/**
	 * 심야SMS대상여부
	 * 
	 * @param mdngSmsTgtYn 심야SMS대상여부
	 */
	public void setMdngSmsTgtYn(String mdngSmsTgtYn){
		this.mdngSmsTgtYn= mdngSmsTgtYn;
		this.setIsSet_mdngSmsTgtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_addCrtfXtYn= false;
	protected final boolean isSet_addCrtfXtYn(){
		return this.isSet_addCrtfXtYn;
	}
	private void setIsSet_addCrtfXtYn(boolean value){
		this.isSet_addCrtfXtYn= value;
	}
	/**
	 * 추가인증제외여부
	 */
	@XmlTransient
	public String getAddCrtfXtYn(){
		return this.addCrtfXtYn;
	}
	
	/**
	 * 추가인증제외여부
	 * 
	 * @param addCrtfXtYn 추가인증제외여부
	 */
	public void setAddCrtfXtYn(String addCrtfXtYn){
		this.addCrtfXtYn= addCrtfXtYn;
		this.setIsSet_addCrtfXtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_crtfXtSmsNtcYn= false;
	protected final boolean isSet_crtfXtSmsNtcYn(){
		return this.isSet_crtfXtSmsNtcYn;
	}
	private void setIsSet_crtfXtSmsNtcYn(boolean value){
		this.isSet_crtfXtSmsNtcYn= value;
	}
	/**
	 * 인증제외SMS통지여부
	 */
	@XmlTransient
	public String getCrtfXtSmsNtcYn(){
		return this.crtfXtSmsNtcYn;
	}
	
	/**
	 * 인증제외SMS통지여부
	 * 
	 * @param crtfXtSmsNtcYn 인증제외SMS통지여부
	 */
	public void setCrtfXtSmsNtcYn(String crtfXtSmsNtcYn){
		this.crtfXtSmsNtcYn= crtfXtSmsNtcYn;
		this.setIsSet_crtfXtSmsNtcYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_addCrtfTsAplYn= false;
	protected final boolean isSet_addCrtfTsAplYn(){
		return this.isSet_addCrtfTsAplYn;
	}
	private void setIsSet_addCrtfTsAplYn(boolean value){
		this.isSet_addCrtfTsAplYn= value;
	}
	/**
	 * 추가인증이체적용여부
	 */
	@XmlTransient
	public String getAddCrtfTsAplYn(){
		return this.addCrtfTsAplYn;
	}
	
	/**
	 * 추가인증이체적용여부
	 * 
	 * @param addCrtfTsAplYn 추가인증이체적용여부
	 */
	public void setAddCrtfTsAplYn(String addCrtfTsAplYn){
		this.addCrtfTsAplYn= addCrtfTsAplYn;
		this.setIsSet_addCrtfTsAplYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_addCerdAplYn= false;
	protected final boolean isSet_addCerdAplYn(){
		return this.isSet_addCerdAplYn;
	}
	private void setIsSet_addCerdAplYn(boolean value){
		this.isSet_addCerdAplYn= value;
	}
	/**
	 * 추가인증서적용여부
	 */
	@XmlTransient
	public String getAddCerdAplYn(){
		return this.addCerdAplYn;
	}
	
	/**
	 * 추가인증서적용여부
	 * 
	 * @param addCerdAplYn 추가인증서적용여부
	 */
	public void setAddCerdAplYn(String addCerdAplYn){
		this.addCerdAplYn= addCerdAplYn;
		this.setIsSet_addCerdAplYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_brChidSecrdHldgYn= false;
	protected final boolean isSet_brChidSecrdHldgYn(){
		return this.isSet_brChidSecrdHldgYn;
	}
	private void setIsSet_brChidSecrdHldgYn(boolean value){
		this.isSet_brChidSecrdHldgYn= value;
	}
	/**
	 * 점자보안카드보유여부
	 */
	@XmlTransient
	public String getBrChidSecrdHldgYn(){
		return this.brChidSecrdHldgYn;
	}
	
	/**
	 * 점자보안카드보유여부
	 * 
	 * @param brChidSecrdHldgYn 점자보안카드보유여부
	 */
	public void setBrChidSecrdHldgYn(String brChidSecrdHldgYn){
		this.brChidSecrdHldgYn= brChidSecrdHldgYn;
		this.setIsSet_brChidSecrdHldgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_frgStayTgtYn= false;
	protected final boolean isSet_frgStayTgtYn(){
		return this.isSet_frgStayTgtYn;
	}
	private void setIsSet_frgStayTgtYn(boolean value){
		this.isSet_frgStayTgtYn= value;
	}
	/**
	 * 해외체류대상여부
	 */
	@XmlTransient
	public String getFrgStayTgtYn(){
		return this.frgStayTgtYn;
	}
	
	/**
	 * 해외체류대상여부
	 * 
	 * @param frgStayTgtYn 해외체류대상여부
	 */
	public void setFrgStayTgtYn(String frgStayTgtYn){
		this.frgStayTgtYn= frgStayTgtYn;
		this.setIsSet_frgStayTgtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hndpeYn= false;
	protected final boolean isSet_hndpeYn(){
		return this.isSet_hndpeYn;
	}
	private void setIsSet_hndpeYn(boolean value){
		this.isSet_hndpeYn= value;
	}
	/**
	 * 장애인여부
	 */
	@XmlTransient
	public String getHndpeYn(){
		return this.hndpeYn;
	}
	
	/**
	 * 장애인여부
	 * 
	 * @param hndpeYn 장애인여부
	 */
	public void setHndpeYn(String hndpeYn){
		this.hndpeYn= hndpeYn;
		this.setIsSet_hndpeYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spr= false;
	protected final boolean isSet_spr(){
		return this.isSet_spr;
	}
	private void setIsSet_spr(boolean value){
		this.isSet_spr= value;
	}
	/**
	 * 예비
	 */
	@XmlTransient
	public String getSpr(){
		return this.spr;
	}
	
	/**
	 * 예비
	 * 
	 * @param spr 예비
	 */
	public void setSpr(String spr){
		this.spr= spr;
		this.setIsSet_spr(true);
	}
				
	@Override
	public IBSMR0002202_DODT clone(){
		try{
			IBSMR0002202_DODT object= (IBSMR0002202_DODT)super.clone();
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
		
		result= prime * result + ((this.tgtYn==null)?0:this.tgtYn.hashCode());
		result= prime * result + ((this.mdngSmsTgtYn==null)?0:this.mdngSmsTgtYn.hashCode());
		result= prime * result + ((this.addCrtfXtYn==null)?0:this.addCrtfXtYn.hashCode());
		result= prime * result + ((this.crtfXtSmsNtcYn==null)?0:this.crtfXtSmsNtcYn.hashCode());
		result= prime * result + ((this.addCrtfTsAplYn==null)?0:this.addCrtfTsAplYn.hashCode());
		result= prime * result + ((this.addCerdAplYn==null)?0:this.addCerdAplYn.hashCode());
		result= prime * result + ((this.brChidSecrdHldgYn==null)?0:this.brChidSecrdHldgYn.hashCode());
		result= prime * result + ((this.frgStayTgtYn==null)?0:this.frgStayTgtYn.hashCode());
		result= prime * result + ((this.hndpeYn==null)?0:this.hndpeYn.hashCode());
		result= prime * result + ((this.spr==null)?0:this.spr.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final IBSMR0002202_DODT other= (IBSMR0002202_DODT)obj;
		{
			Object _tgtYn= getTgtYn();
			Object __tgtYn= other.getTgtYn();
			if ( _tgtYn== null ) { if ( __tgtYn!= null ) return false; }
			else if ( !_tgtYn.equals(__tgtYn) ) return false;
		}
		{
			Object _mdngSmsTgtYn= getMdngSmsTgtYn();
			Object __mdngSmsTgtYn= other.getMdngSmsTgtYn();
			if ( _mdngSmsTgtYn== null ) { if ( __mdngSmsTgtYn!= null ) return false; }
			else if ( !_mdngSmsTgtYn.equals(__mdngSmsTgtYn) ) return false;
		}
		{
			Object _addCrtfXtYn= getAddCrtfXtYn();
			Object __addCrtfXtYn= other.getAddCrtfXtYn();
			if ( _addCrtfXtYn== null ) { if ( __addCrtfXtYn!= null ) return false; }
			else if ( !_addCrtfXtYn.equals(__addCrtfXtYn) ) return false;
		}
		{
			Object _crtfXtSmsNtcYn= getCrtfXtSmsNtcYn();
			Object __crtfXtSmsNtcYn= other.getCrtfXtSmsNtcYn();
			if ( _crtfXtSmsNtcYn== null ) { if ( __crtfXtSmsNtcYn!= null ) return false; }
			else if ( !_crtfXtSmsNtcYn.equals(__crtfXtSmsNtcYn) ) return false;
		}
		{
			Object _addCrtfTsAplYn= getAddCrtfTsAplYn();
			Object __addCrtfTsAplYn= other.getAddCrtfTsAplYn();
			if ( _addCrtfTsAplYn== null ) { if ( __addCrtfTsAplYn!= null ) return false; }
			else if ( !_addCrtfTsAplYn.equals(__addCrtfTsAplYn) ) return false;
		}
		{
			Object _addCerdAplYn= getAddCerdAplYn();
			Object __addCerdAplYn= other.getAddCerdAplYn();
			if ( _addCerdAplYn== null ) { if ( __addCerdAplYn!= null ) return false; }
			else if ( !_addCerdAplYn.equals(__addCerdAplYn) ) return false;
		}
		{
			Object _brChidSecrdHldgYn= getBrChidSecrdHldgYn();
			Object __brChidSecrdHldgYn= other.getBrChidSecrdHldgYn();
			if ( _brChidSecrdHldgYn== null ) { if ( __brChidSecrdHldgYn!= null ) return false; }
			else if ( !_brChidSecrdHldgYn.equals(__brChidSecrdHldgYn) ) return false;
		}
		{
			Object _frgStayTgtYn= getFrgStayTgtYn();
			Object __frgStayTgtYn= other.getFrgStayTgtYn();
			if ( _frgStayTgtYn== null ) { if ( __frgStayTgtYn!= null ) return false; }
			else if ( !_frgStayTgtYn.equals(__frgStayTgtYn) ) return false;
		}
		{
			Object _hndpeYn= getHndpeYn();
			Object __hndpeYn= other.getHndpeYn();
			if ( _hndpeYn== null ) { if ( __hndpeYn!= null ) return false; }
			else if ( !_hndpeYn.equals(__hndpeYn) ) return false;
		}
		{
			Object _spr= getSpr();
			Object __spr= other.getSpr();
			if ( _spr== null ) { if ( __spr!= null ) return false; }
			else if ( !_spr.equals(__spr) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(IBSMR0002202_DODT.class.getName()).append(":\n");
		sb.append("\ttgtYn: ");
		sb.append(tgtYn==null?"null":getTgtYn());
		sb.append("\n");
		sb.append("\tmdngSmsTgtYn: ");
		sb.append(mdngSmsTgtYn==null?"null":getMdngSmsTgtYn());
		sb.append("\n");
		sb.append("\taddCrtfXtYn: ");
		sb.append(addCrtfXtYn==null?"null":getAddCrtfXtYn());
		sb.append("\n");
		sb.append("\tcrtfXtSmsNtcYn: ");
		sb.append(crtfXtSmsNtcYn==null?"null":getCrtfXtSmsNtcYn());
		sb.append("\n");
		sb.append("\taddCrtfTsAplYn: ");
		sb.append(addCrtfTsAplYn==null?"null":getAddCrtfTsAplYn());
		sb.append("\n");
		sb.append("\taddCerdAplYn: ");
		sb.append(addCerdAplYn==null?"null":getAddCerdAplYn());
		sb.append("\n");
		sb.append("\tbrChidSecrdHldgYn: ");
		sb.append(brChidSecrdHldgYn==null?"null":getBrChidSecrdHldgYn());
		sb.append("\n");
		sb.append("\tfrgStayTgtYn: ");
		sb.append(frgStayTgtYn==null?"null":getFrgStayTgtYn());
		sb.append("\n");
		sb.append("\thndpeYn: ");
		sb.append(hndpeYn==null?"null":getHndpeYn());
		sb.append("\n");
		sb.append("\tspr: ");
		sb.append(spr==null?"null":getSpr());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* tgtYn */
		messageLen+= 1; /* mdngSmsTgtYn */
		messageLen+= 1; /* addCrtfXtYn */
		messageLen+= 1; /* crtfXtSmsNtcYn */
		messageLen+= 1; /* addCrtfTsAplYn */
		messageLen+= 1; /* addCerdAplYn */
		messageLen+= 1; /* brChidSecrdHldgYn */
		messageLen+= 1; /* frgStayTgtYn */
		messageLen+= 1; /* hndpeYn */
		messageLen+= 91; /* spr */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("tgtYn");
		list.add("mdngSmsTgtYn");
		list.add("addCrtfXtYn");
		list.add("crtfXtSmsNtcYn");
		list.add("addCrtfTsAplYn");
		list.add("addCerdAplYn");
		list.add("brChidSecrdHldgYn");
		list.add("frgStayTgtYn");
		list.add("hndpeYn");
		list.add("spr");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("tgtYn", get("tgtYn"));
		map.put("mdngSmsTgtYn", get("mdngSmsTgtYn"));
		map.put("addCrtfXtYn", get("addCrtfXtYn"));
		map.put("crtfXtSmsNtcYn", get("crtfXtSmsNtcYn"));
		map.put("addCrtfTsAplYn", get("addCrtfTsAplYn"));
		map.put("addCerdAplYn", get("addCerdAplYn"));
		map.put("brChidSecrdHldgYn", get("brChidSecrdHldgYn"));
		map.put("frgStayTgtYn", get("frgStayTgtYn"));
		map.put("hndpeYn", get("hndpeYn"));
		map.put("spr", get("spr"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 110311254:/* tgtYn */
			return getTgtYn();
		case 203874093:/* mdngSmsTgtYn */
			return getMdngSmsTgtYn();
		case 1279372723:/* addCrtfXtYn */
			return getAddCrtfXtYn();
		case -2084262250:/* crtfXtSmsNtcYn */
			return getCrtfXtSmsNtcYn();
		case 947331345:/* addCrtfTsAplYn */
			return getAddCrtfTsAplYn();
		case -2029457219:/* addCerdAplYn */
			return getAddCerdAplYn();
		case -630308017:/* brChidSecrdHldgYn */
			return getBrChidSecrdHldgYn();
		case -1427410526:/* frgStayTgtYn */
			return getFrgStayTgtYn();
		case 1056097544:/* hndpeYn */
			return getHndpeYn();
		case 114101:/* spr */
			return getSpr();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 110311254:/* tgtYn */
			setTgtYn((String)value);
			break;
		case 203874093:/* mdngSmsTgtYn */
			setMdngSmsTgtYn((String)value);
			break;
		case 1279372723:/* addCrtfXtYn */
			setAddCrtfXtYn((String)value);
			break;
		case -2084262250:/* crtfXtSmsNtcYn */
			setCrtfXtSmsNtcYn((String)value);
			break;
		case 947331345:/* addCrtfTsAplYn */
			setAddCrtfTsAplYn((String)value);
			break;
		case -2029457219:/* addCerdAplYn */
			setAddCerdAplYn((String)value);
			break;
		case -630308017:/* brChidSecrdHldgYn */
			setBrChidSecrdHldgYn((String)value);
			break;
		case -1427410526:/* frgStayTgtYn */
			setFrgStayTgtYn((String)value);
			break;
		case 1056097544:/* hndpeYn */
			setHndpeYn((String)value);
			break;
		case 114101:/* spr */
			setSpr((String)value);
			break;
		default:
			break;
		}
	}
	
}
