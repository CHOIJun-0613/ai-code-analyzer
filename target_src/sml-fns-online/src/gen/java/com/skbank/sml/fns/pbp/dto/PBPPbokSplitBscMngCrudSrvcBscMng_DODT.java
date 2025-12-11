/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.dto;

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
	"dpsInpAcno", "trnStcd", "rgsTrnDt", "rvkTrnDt", "bkAppPushAgrYn"
}, name="PBPPbokSplitBscMngCrudSrvcBscMng_DODT")
@XmlRootElement(name="PBPPbokSplitBscMngCrudSrvcBscMng_DODT")
@BxmCategory(logicalName="공간.기본정보.DBM.출력.IO", description="") 
public class PBPPbokSplitBscMngCrudSrvcBscMng_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1397943317L;
	
	
	
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
	 * 거래상태코드
	 */
	@ApiModelProperty(
		name = "trnStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnStcd")
	@BxmOmm_Field(length=1, decimal=0, description="거래상태코드", align="left", fill="")
	private String trnStcd= "";
	
	
	/**
	 * 등록거래일자
	 */
	@ApiModelProperty(
		name = "rgsTrnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgsTrnDt")
	@BxmOmm_Field(length=8, decimal=0, description="등록거래일자", align="left", fill="")
	private String rgsTrnDt= "";
	
	
	/**
	 * 해제거래일자
	 */
	@ApiModelProperty(
		name = "rvkTrnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rvkTrnDt")
	@BxmOmm_Field(length=8, decimal=0, description="해제거래일자", align="left", fill="")
	private String rvkTrnDt= "";
	
	
	/**
	 * 은행앱PUSH동의여부
	 */
	@ApiModelProperty(
		name = "bkAppPushAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bkAppPushAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="은행앱PUSH동의여부", align="left", fill="")
	private String bkAppPushAgrYn= "";
	
	
	
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
	private boolean isSet_trnStcd= false;
	protected final boolean isSet_trnStcd(){
		return this.isSet_trnStcd;
	}
	private void setIsSet_trnStcd(boolean value){
		this.isSet_trnStcd= value;
	}
	/**
	 * 거래상태코드
	 */
	@XmlTransient
	public String getTrnStcd(){
		return this.trnStcd;
	}
	
	/**
	 * 거래상태코드
	 * 
	 * @param trnStcd 거래상태코드
	 */
	public void setTrnStcd(String trnStcd){
		this.trnStcd= trnStcd;
		this.setIsSet_trnStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsTrnDt= false;
	protected final boolean isSet_rgsTrnDt(){
		return this.isSet_rgsTrnDt;
	}
	private void setIsSet_rgsTrnDt(boolean value){
		this.isSet_rgsTrnDt= value;
	}
	/**
	 * 등록거래일자
	 */
	@XmlTransient
	public String getRgsTrnDt(){
		return this.rgsTrnDt;
	}
	
	/**
	 * 등록거래일자
	 * 
	 * @param rgsTrnDt 등록거래일자
	 */
	public void setRgsTrnDt(String rgsTrnDt){
		this.rgsTrnDt= rgsTrnDt;
		this.setIsSet_rgsTrnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rvkTrnDt= false;
	protected final boolean isSet_rvkTrnDt(){
		return this.isSet_rvkTrnDt;
	}
	private void setIsSet_rvkTrnDt(boolean value){
		this.isSet_rvkTrnDt= value;
	}
	/**
	 * 해제거래일자
	 */
	@XmlTransient
	public String getRvkTrnDt(){
		return this.rvkTrnDt;
	}
	
	/**
	 * 해제거래일자
	 * 
	 * @param rvkTrnDt 해제거래일자
	 */
	public void setRvkTrnDt(String rvkTrnDt){
		this.rvkTrnDt= rvkTrnDt;
		this.setIsSet_rvkTrnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bkAppPushAgrYn= false;
	protected final boolean isSet_bkAppPushAgrYn(){
		return this.isSet_bkAppPushAgrYn;
	}
	private void setIsSet_bkAppPushAgrYn(boolean value){
		this.isSet_bkAppPushAgrYn= value;
	}
	/**
	 * 은행앱PUSH동의여부
	 */
	@XmlTransient
	public String getBkAppPushAgrYn(){
		return this.bkAppPushAgrYn;
	}
	
	/**
	 * 은행앱PUSH동의여부
	 * 
	 * @param bkAppPushAgrYn 은행앱PUSH동의여부
	 */
	public void setBkAppPushAgrYn(String bkAppPushAgrYn){
		this.bkAppPushAgrYn= bkAppPushAgrYn;
		this.setIsSet_bkAppPushAgrYn(true);
	}
				
	@Override
	public PBPPbokSplitBscMngCrudSrvcBscMng_DODT clone(){
		try{
			PBPPbokSplitBscMngCrudSrvcBscMng_DODT object= (PBPPbokSplitBscMngCrudSrvcBscMng_DODT)super.clone();
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
		result= prime * result + ((this.trnStcd==null)?0:this.trnStcd.hashCode());
		result= prime * result + ((this.rgsTrnDt==null)?0:this.rgsTrnDt.hashCode());
		result= prime * result + ((this.rvkTrnDt==null)?0:this.rvkTrnDt.hashCode());
		result= prime * result + ((this.bkAppPushAgrYn==null)?0:this.bkAppPushAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSplitBscMngCrudSrvcBscMng_DODT other= (PBPPbokSplitBscMngCrudSrvcBscMng_DODT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _trnStcd= getTrnStcd();
			Object __trnStcd= other.getTrnStcd();
			if ( _trnStcd== null ) { if ( __trnStcd!= null ) return false; }
			else if ( !_trnStcd.equals(__trnStcd) ) return false;
		}
		{
			Object _rgsTrnDt= getRgsTrnDt();
			Object __rgsTrnDt= other.getRgsTrnDt();
			if ( _rgsTrnDt== null ) { if ( __rgsTrnDt!= null ) return false; }
			else if ( !_rgsTrnDt.equals(__rgsTrnDt) ) return false;
		}
		{
			Object _rvkTrnDt= getRvkTrnDt();
			Object __rvkTrnDt= other.getRvkTrnDt();
			if ( _rvkTrnDt== null ) { if ( __rvkTrnDt!= null ) return false; }
			else if ( !_rvkTrnDt.equals(__rvkTrnDt) ) return false;
		}
		{
			Object _bkAppPushAgrYn= getBkAppPushAgrYn();
			Object __bkAppPushAgrYn= other.getBkAppPushAgrYn();
			if ( _bkAppPushAgrYn== null ) { if ( __bkAppPushAgrYn!= null ) return false; }
			else if ( !_bkAppPushAgrYn.equals(__bkAppPushAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSplitBscMngCrudSrvcBscMng_DODT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\ttrnStcd: ");
		sb.append(trnStcd==null?"null":getTrnStcd());
		sb.append("\n");
		sb.append("\trgsTrnDt: ");
		sb.append(rgsTrnDt==null?"null":getRgsTrnDt());
		sb.append("\n");
		sb.append("\trvkTrnDt: ");
		sb.append(rvkTrnDt==null?"null":getRvkTrnDt());
		sb.append("\n");
		sb.append("\tbkAppPushAgrYn: ");
		sb.append(bkAppPushAgrYn==null?"null":getBkAppPushAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 1; /* trnStcd */
		messageLen+= 8; /* rgsTrnDt */
		messageLen+= 8; /* rvkTrnDt */
		messageLen+= 1; /* bkAppPushAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsInpAcno");
		list.add("trnStcd");
		list.add("rgsTrnDt");
		list.add("rvkTrnDt");
		list.add("bkAppPushAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("trnStcd", get("trnStcd"));
		map.put("rgsTrnDt", get("rgsTrnDt"));
		map.put("rvkTrnDt", get("rvkTrnDt"));
		map.put("bkAppPushAgrYn", get("bkAppPushAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case -1055857582:/* trnStcd */
			return getTrnStcd();
		case 1408913442:/* rgsTrnDt */
			return getRgsTrnDt();
		case 1607533561:/* rvkTrnDt */
			return getRvkTrnDt();
		case 1743448079:/* bkAppPushAgrYn */
			return getBkAppPushAgrYn();
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
		case -1055857582:/* trnStcd */
			setTrnStcd((String)value);
			break;
		case 1408913442:/* rgsTrnDt */
			setRgsTrnDt((String)value);
			break;
		case 1607533561:/* rvkTrnDt */
			setRvkTrnDt((String)value);
			break;
		case 1743448079:/* bkAppPushAgrYn */
			setBkAppPushAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
