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
	"rprsAcno", "trnDscd", "appPushAgrYn"
}, name="PBPPbokSplitBscMngCrudSrvcBscMng_DIDT")
@XmlRootElement(name="PBPPbokSplitBscMngCrudSrvcBscMng_DIDT")
@BxmCategory(logicalName="공간.기본정보.DBM.입력.IO", description="") 
public class PBPPbokSplitBscMngCrudSrvcBscMng_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1397949083L;
	
	
	
	/**
	 * 대표계좌번호
	 */
	@ApiModelProperty(
		name = "rprsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprsAcno")
	@BxmOmm_Field(length=13, decimal=0, description="대표계좌번호", align="left", fill="")
	private String rprsAcno= "";
	
	
	/**
	 * 거래구분코드
	 */
	@ApiModelProperty(
		name = "trnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="거래구분코드", align="left", fill="")
	private String trnDscd= "";
	
	
	/**
	 * 앱푸쉬동의여부
	 */
	@ApiModelProperty(
		name = "appPushAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appPushAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="앱푸쉬동의여부", align="left", fill="")
	private String appPushAgrYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rprsAcno= false;
	protected final boolean isSet_rprsAcno(){
		return this.isSet_rprsAcno;
	}
	private void setIsSet_rprsAcno(boolean value){
		this.isSet_rprsAcno= value;
	}
	/**
	 * 대표계좌번호
	 */
	@XmlTransient
	public String getRprsAcno(){
		return this.rprsAcno;
	}
	
	/**
	 * 대표계좌번호
	 * 
	 * @param rprsAcno 대표계좌번호
	 */
	public void setRprsAcno(String rprsAcno){
		this.rprsAcno= rprsAcno;
		this.setIsSet_rprsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDscd= false;
	protected final boolean isSet_trnDscd(){
		return this.isSet_trnDscd;
	}
	private void setIsSet_trnDscd(boolean value){
		this.isSet_trnDscd= value;
	}
	/**
	 * 거래구분코드
	 */
	@XmlTransient
	public String getTrnDscd(){
		return this.trnDscd;
	}
	
	/**
	 * 거래구분코드
	 * 
	 * @param trnDscd 거래구분코드
	 */
	public void setTrnDscd(String trnDscd){
		this.trnDscd= trnDscd;
		this.setIsSet_trnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appPushAgrYn= false;
	protected final boolean isSet_appPushAgrYn(){
		return this.isSet_appPushAgrYn;
	}
	private void setIsSet_appPushAgrYn(boolean value){
		this.isSet_appPushAgrYn= value;
	}
	/**
	 * 앱푸쉬동의여부
	 */
	@XmlTransient
	public String getAppPushAgrYn(){
		return this.appPushAgrYn;
	}
	
	/**
	 * 앱푸쉬동의여부
	 * 
	 * @param appPushAgrYn 앱푸쉬동의여부
	 */
	public void setAppPushAgrYn(String appPushAgrYn){
		this.appPushAgrYn= appPushAgrYn;
		this.setIsSet_appPushAgrYn(true);
	}
				
	@Override
	public PBPPbokSplitBscMngCrudSrvcBscMng_DIDT clone(){
		try{
			PBPPbokSplitBscMngCrudSrvcBscMng_DIDT object= (PBPPbokSplitBscMngCrudSrvcBscMng_DIDT)super.clone();
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
		
		result= prime * result + ((this.rprsAcno==null)?0:this.rprsAcno.hashCode());
		result= prime * result + ((this.trnDscd==null)?0:this.trnDscd.hashCode());
		result= prime * result + ((this.appPushAgrYn==null)?0:this.appPushAgrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSplitBscMngCrudSrvcBscMng_DIDT other= (PBPPbokSplitBscMngCrudSrvcBscMng_DIDT)obj;
		{
			Object _rprsAcno= getRprsAcno();
			Object __rprsAcno= other.getRprsAcno();
			if ( _rprsAcno== null ) { if ( __rprsAcno!= null ) return false; }
			else if ( !_rprsAcno.equals(__rprsAcno) ) return false;
		}
		{
			Object _trnDscd= getTrnDscd();
			Object __trnDscd= other.getTrnDscd();
			if ( _trnDscd== null ) { if ( __trnDscd!= null ) return false; }
			else if ( !_trnDscd.equals(__trnDscd) ) return false;
		}
		{
			Object _appPushAgrYn= getAppPushAgrYn();
			Object __appPushAgrYn= other.getAppPushAgrYn();
			if ( _appPushAgrYn== null ) { if ( __appPushAgrYn!= null ) return false; }
			else if ( !_appPushAgrYn.equals(__appPushAgrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSplitBscMngCrudSrvcBscMng_DIDT.class.getName()).append(":\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("\ttrnDscd: ");
		sb.append(trnDscd==null?"null":getTrnDscd());
		sb.append("\n");
		sb.append("\tappPushAgrYn: ");
		sb.append(appPushAgrYn==null?"null":getAppPushAgrYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* rprsAcno */
		messageLen+= 1; /* trnDscd */
		messageLen+= 1; /* appPushAgrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rprsAcno");
		list.add("trnDscd");
		list.add("appPushAgrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rprsAcno", get("rprsAcno"));
		map.put("trnDscd", get("trnDscd"));
		map.put("appPushAgrYn", get("appPushAgrYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 805042946:/* rprsAcno */
			return getRprsAcno();
		case -1056305408:/* trnDscd */
			return getTrnDscd();
		case 913616166:/* appPushAgrYn */
			return getAppPushAgrYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 805042946:/* rprsAcno */
			setRprsAcno((String)value);
			break;
		case -1056305408:/* trnDscd */
			setTrnDscd((String)value);
			break;
		case 913616166:/* appPushAgrYn */
			setAppPushAgrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
