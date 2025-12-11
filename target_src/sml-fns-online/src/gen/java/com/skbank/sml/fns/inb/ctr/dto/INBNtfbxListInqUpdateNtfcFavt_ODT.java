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
	"rtcd", "rtcdTxt", "msgId", "favtYn", "umsTrno"
}, name="INBNtfbxListInqUpdateNtfcFavt_ODT")
@XmlRootElement(name="INBNtfbxListInqUpdateNtfcFavt_ODT")
@BxmCategory(logicalName="알림.즐겨찾기.컨트롤러.출력.IO", description="") 
public class INBNtfbxListInqUpdateNtfcFavt_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 955969885L;
	
	
	
	/**
	 * 결과코드
	 */
	@ApiModelProperty(
		name = "rtcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtcd")
	@BxmOmm_Field(length=7, decimal=0, description="결과코드", align="left", fill="")
	private String rtcd= "";
	
	
	/**
	 * 결과코드내용
	 */
	@ApiModelProperty(
		name = "rtcdTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rtcdTxt")
	@BxmOmm_Field(length=100, decimal=0, description="결과코드내용", align="left", fill="")
	private String rtcdTxt= "";
	
	
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
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtcd= false;
	protected final boolean isSet_rtcd(){
		return this.isSet_rtcd;
	}
	private void setIsSet_rtcd(boolean value){
		this.isSet_rtcd= value;
	}
	/**
	 * 결과코드
	 */
	@XmlTransient
	public String getRtcd(){
		return this.rtcd;
	}
	
	/**
	 * 결과코드
	 * 
	 * @param rtcd 결과코드
	 */
	public void setRtcd(String rtcd){
		this.rtcd= rtcd;
		this.setIsSet_rtcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rtcdTxt= false;
	protected final boolean isSet_rtcdTxt(){
		return this.isSet_rtcdTxt;
	}
	private void setIsSet_rtcdTxt(boolean value){
		this.isSet_rtcdTxt= value;
	}
	/**
	 * 결과코드내용
	 */
	@XmlTransient
	public String getRtcdTxt(){
		return this.rtcdTxt;
	}
	
	/**
	 * 결과코드내용
	 * 
	 * @param rtcdTxt 결과코드내용
	 */
	public void setRtcdTxt(String rtcdTxt){
		this.rtcdTxt= rtcdTxt;
		this.setIsSet_rtcdTxt(true);
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
				
	@Override
	public INBNtfbxListInqUpdateNtfcFavt_ODT clone(){
		try{
			INBNtfbxListInqUpdateNtfcFavt_ODT object= (INBNtfbxListInqUpdateNtfcFavt_ODT)super.clone();
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
		
		result= prime * result + ((this.rtcd==null)?0:this.rtcd.hashCode());
		result= prime * result + ((this.rtcdTxt==null)?0:this.rtcdTxt.hashCode());
		result= prime * result + ((this.msgId==null)?0:this.msgId.hashCode());
		result= prime * result + ((this.favtYn==null)?0:this.favtYn.hashCode());
		result= prime * result + ((this.umsTrno==null)?0:this.umsTrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxListInqUpdateNtfcFavt_ODT other= (INBNtfbxListInqUpdateNtfcFavt_ODT)obj;
		{
			Object _rtcd= getRtcd();
			Object __rtcd= other.getRtcd();
			if ( _rtcd== null ) { if ( __rtcd!= null ) return false; }
			else if ( !_rtcd.equals(__rtcd) ) return false;
		}
		{
			Object _rtcdTxt= getRtcdTxt();
			Object __rtcdTxt= other.getRtcdTxt();
			if ( _rtcdTxt== null ) { if ( __rtcdTxt!= null ) return false; }
			else if ( !_rtcdTxt.equals(__rtcdTxt) ) return false;
		}
		{
			Object _msgId= getMsgId();
			Object __msgId= other.getMsgId();
			if ( _msgId== null ) { if ( __msgId!= null ) return false; }
			else if ( !_msgId.equals(__msgId) ) return false;
		}
		{
			Object _favtYn= getFavtYn();
			Object __favtYn= other.getFavtYn();
			if ( _favtYn== null ) { if ( __favtYn!= null ) return false; }
			else if ( !_favtYn.equals(__favtYn) ) return false;
		}
		{
			Object _umsTrno= getUmsTrno();
			Object __umsTrno= other.getUmsTrno();
			if ( _umsTrno== null ) { if ( __umsTrno!= null ) return false; }
			else if ( !_umsTrno.equals(__umsTrno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxListInqUpdateNtfcFavt_ODT.class.getName()).append(":\n");
		sb.append("\trtcd: ");
		sb.append(rtcd==null?"null":getRtcd());
		sb.append("\n");
		sb.append("\trtcdTxt: ");
		sb.append(rtcdTxt==null?"null":getRtcdTxt());
		sb.append("\n");
		sb.append("\tmsgId: ");
		sb.append(msgId==null?"null":getMsgId());
		sb.append("\n");
		sb.append("\tfavtYn: ");
		sb.append(favtYn==null?"null":getFavtYn());
		sb.append("\n");
		sb.append("\tumsTrno: ");
		sb.append(umsTrno==null?"null":getUmsTrno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 7; /* rtcd */
		messageLen+= 100; /* rtcdTxt */
		messageLen+= 20; /* msgId */
		messageLen+= 1; /* favtYn */
		messageLen+= 19; /* umsTrno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rtcd");
		list.add("rtcdTxt");
		list.add("msgId");
		list.add("favtYn");
		list.add("umsTrno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rtcd", get("rtcd"));
		map.put("rtcdTxt", get("rtcdTxt"));
		map.put("msgId", get("msgId"));
		map.put("favtYn", get("favtYn"));
		map.put("umsTrno", get("umsTrno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3510819:/* rtcd */
			return getRtcd();
		case 1511678285:/* rtcdTxt */
			return getRtcdTxt();
		case 104191100:/* msgId */
			return getMsgId();
		case -1281582674:/* favtYn */
			return getFavtYn();
		case -306853830:/* umsTrno */
			return getUmsTrno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3510819:/* rtcd */
			setRtcd((String)value);
			break;
		case 1511678285:/* rtcdTxt */
			setRtcdTxt((String)value);
			break;
		case 104191100:/* msgId */
			setMsgId((String)value);
			break;
		case -1281582674:/* favtYn */
			setFavtYn((String)value);
			break;
		case -306853830:/* umsTrno */
			setUmsTrno((String)value);
			break;
		default:
			break;
		}
	}
	
}
