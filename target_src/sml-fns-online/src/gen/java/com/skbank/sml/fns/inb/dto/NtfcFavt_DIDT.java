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
 * 
 */
@XmlType(propOrder={
	"itcsno", "umsTrno", "umsReqDt", "favtYn", "msgId", "ntfcCd"
}, name="NtfcFavt_DIDT")
@XmlRootElement(name="NtfcFavt_DIDT")
@BxmCategory(logicalName="알림.즐겨찾기.DBM.입력.IO", description="") 
public class NtfcFavt_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 297412456L;
	
	
	
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
	 * UMS트렌젝션번호
	 */
	@ApiModelProperty(
		name = "umsTrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsTrno")
	@BxmOmm_Field(length=19, decimal=0, description="UMS트렌젝션번호", align="left", fill="")
	private String umsTrno= "";
	
	
	/**
	 * UMS요청일자
	 */
	@ApiModelProperty(
		name = "umsReqDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsReqDt")
	@BxmOmm_Field(length=8, decimal=0, description="UMS요청일자", align="left", fill="")
	private String umsReqDt= "";
	
	
	/**
	 * 즐겨찾기여부
	 */
	@ApiModelProperty(
		name = "favtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("favtYn")
	@BxmOmm_Field(length=1, decimal=0, description="즐겨찾기여부", align="left", fill="")
	private String favtYn= "";
	
	
	/**
	 * 메시지ID
	 */
	@ApiModelProperty(
		name = "msgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgId")
	@BxmOmm_Field(length=20, decimal=0, description="메시지ID", align="left", fill="")
	private String msgId= "";
	
	
	/**
	 * 알림코드
	 */
	@ApiModelProperty(
		name = "ntfcCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcCd")
	@BxmOmm_Field(length=4, decimal=0, description="알림코드", align="left", fill="")
	private String ntfcCd= "";
	
	
	
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
	private boolean isSet_umsTrno= false;
	protected final boolean isSet_umsTrno(){
		return this.isSet_umsTrno;
	}
	private void setIsSet_umsTrno(boolean value){
		this.isSet_umsTrno= value;
	}
	/**
	 * UMS트렌젝션번호
	 */
	@XmlTransient
	public String getUmsTrno(){
		return this.umsTrno;
	}
	
	/**
	 * UMS트렌젝션번호
	 * 
	 * @param umsTrno UMS트렌젝션번호
	 */
	public void setUmsTrno(String umsTrno){
		this.umsTrno= umsTrno;
		this.setIsSet_umsTrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_umsReqDt= false;
	protected final boolean isSet_umsReqDt(){
		return this.isSet_umsReqDt;
	}
	private void setIsSet_umsReqDt(boolean value){
		this.isSet_umsReqDt= value;
	}
	/**
	 * UMS요청일자
	 */
	@XmlTransient
	public String getUmsReqDt(){
		return this.umsReqDt;
	}
	
	/**
	 * UMS요청일자
	 * 
	 * @param umsReqDt UMS요청일자
	 */
	public void setUmsReqDt(String umsReqDt){
		this.umsReqDt= umsReqDt;
		this.setIsSet_umsReqDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_favtYn= false;
	protected final boolean isSet_favtYn(){
		return this.isSet_favtYn;
	}
	private void setIsSet_favtYn(boolean value){
		this.isSet_favtYn= value;
	}
	/**
	 * 즐겨찾기여부
	 */
	@XmlTransient
	public String getFavtYn(){
		return this.favtYn;
	}
	
	/**
	 * 즐겨찾기여부
	 * 
	 * @param favtYn 즐겨찾기여부
	 */
	public void setFavtYn(String favtYn){
		this.favtYn= favtYn;
		this.setIsSet_favtYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_msgId= false;
	protected final boolean isSet_msgId(){
		return this.isSet_msgId;
	}
	private void setIsSet_msgId(boolean value){
		this.isSet_msgId= value;
	}
	/**
	 * 메시지ID
	 */
	@XmlTransient
	public String getMsgId(){
		return this.msgId;
	}
	
	/**
	 * 메시지ID
	 * 
	 * @param msgId 메시지ID
	 */
	public void setMsgId(String msgId){
		this.msgId= msgId;
		this.setIsSet_msgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcCd= false;
	protected final boolean isSet_ntfcCd(){
		return this.isSet_ntfcCd;
	}
	private void setIsSet_ntfcCd(boolean value){
		this.isSet_ntfcCd= value;
	}
	/**
	 * 알림코드
	 */
	@XmlTransient
	public String getNtfcCd(){
		return this.ntfcCd;
	}
	
	/**
	 * 알림코드
	 * 
	 * @param ntfcCd 알림코드
	 */
	public void setNtfcCd(String ntfcCd){
		this.ntfcCd= ntfcCd;
		this.setIsSet_ntfcCd(true);
	}
				
	@Override
	public NtfcFavt_DIDT clone(){
		try{
			NtfcFavt_DIDT object= (NtfcFavt_DIDT)super.clone();
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
		
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.umsTrno==null)?0:this.umsTrno.hashCode());
		result= prime * result + ((this.umsReqDt==null)?0:this.umsReqDt.hashCode());
		result= prime * result + ((this.favtYn==null)?0:this.favtYn.hashCode());
		result= prime * result + ((this.msgId==null)?0:this.msgId.hashCode());
		result= prime * result + ((this.ntfcCd==null)?0:this.ntfcCd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final NtfcFavt_DIDT other= (NtfcFavt_DIDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _umsTrno= getUmsTrno();
			Object __umsTrno= other.getUmsTrno();
			if ( _umsTrno== null ) { if ( __umsTrno!= null ) return false; }
			else if ( !_umsTrno.equals(__umsTrno) ) return false;
		}
		{
			Object _umsReqDt= getUmsReqDt();
			Object __umsReqDt= other.getUmsReqDt();
			if ( _umsReqDt== null ) { if ( __umsReqDt!= null ) return false; }
			else if ( !_umsReqDt.equals(__umsReqDt) ) return false;
		}
		{
			Object _favtYn= getFavtYn();
			Object __favtYn= other.getFavtYn();
			if ( _favtYn== null ) { if ( __favtYn!= null ) return false; }
			else if ( !_favtYn.equals(__favtYn) ) return false;
		}
		{
			Object _msgId= getMsgId();
			Object __msgId= other.getMsgId();
			if ( _msgId== null ) { if ( __msgId!= null ) return false; }
			else if ( !_msgId.equals(__msgId) ) return false;
		}
		{
			Object _ntfcCd= getNtfcCd();
			Object __ntfcCd= other.getNtfcCd();
			if ( _ntfcCd== null ) { if ( __ntfcCd!= null ) return false; }
			else if ( !_ntfcCd.equals(__ntfcCd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(NtfcFavt_DIDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tumsTrno: ");
		sb.append(umsTrno==null?"null":getUmsTrno());
		sb.append("\n");
		sb.append("\tumsReqDt: ");
		sb.append(umsReqDt==null?"null":getUmsReqDt());
		sb.append("\n");
		sb.append("\tfavtYn: ");
		sb.append(favtYn==null?"null":getFavtYn());
		sb.append("\n");
		sb.append("\tmsgId: ");
		sb.append(msgId==null?"null":getMsgId());
		sb.append("\n");
		sb.append("\tntfcCd: ");
		sb.append(ntfcCd==null?"null":getNtfcCd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 11; /* itcsno */
		messageLen+= 19; /* umsTrno */
		messageLen+= 8; /* umsReqDt */
		messageLen+= 1; /* favtYn */
		messageLen+= 20; /* msgId */
		messageLen+= 4; /* ntfcCd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("umsTrno");
		list.add("umsReqDt");
		list.add("favtYn");
		list.add("msgId");
		list.add("ntfcCd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("umsTrno", get("umsTrno"));
		map.put("umsReqDt", get("umsReqDt"));
		map.put("favtYn", get("favtYn"));
		map.put("msgId", get("msgId"));
		map.put("ntfcCd", get("ntfcCd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case -306853830:/* umsTrno */
			return getUmsTrno();
		case -924766797:/* umsReqDt */
			return getUmsReqDt();
		case -1281582674:/* favtYn */
			return getFavtYn();
		case 104191100:/* msgId */
			return getMsgId();
		case -1035496252:/* ntfcCd */
			return getNtfcCd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case -306853830:/* umsTrno */
			setUmsTrno((String)value);
			break;
		case -924766797:/* umsReqDt */
			setUmsReqDt((String)value);
			break;
		case -1281582674:/* favtYn */
			setFavtYn((String)value);
			break;
		case 104191100:/* msgId */
			setMsgId((String)value);
			break;
		case -1035496252:/* ntfcCd */
			setNtfcCd((String)value);
			break;
		default:
			break;
		}
	}
	
}
