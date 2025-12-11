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
	"trnScsYn", "errCd", "errTitle", "errType", "errMsg", "errBtnNm", "moveScrnId", "errMsgExpsTycd"
}, name="MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT")
@BxmCategory(logicalName="모임통장.간편비밀번호.인증.컨트롤러.출력.IO", description="") 
public class MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2089947728L;
	
	
	
	/**
	 * 거래성공여부
	 */
	@ApiModelProperty(
		name = "trnScsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnScsYn")
	@BxmOmm_Field(length=1, decimal=0, description="거래성공여부", align="left", fill="")
	private String trnScsYn= "";
	
	
	/**
	 * 에러코드
	 */
	@ApiModelProperty(
		name = "errCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("errCd")
	@BxmOmm_Field(length=20, decimal=0, description="에러코드", align="left", fill="")
	private String errCd= "";
	
	
	/**
	 * 에러메시지제목(커스텀)
	 */
	@ApiModelProperty(
		name = "errTitle"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("errTitle")
	@BxmOmm_Field(length=100, decimal=0, description="에러메시지제목(커스텀)", align="left", fill="")
	private String errTitle= "";
	
	
	/**
	 * 에러타입(메시지유형, E:오류, I:정보, W:경고)
	 */
	@ApiModelProperty(
		name = "errType"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("errType")
	@BxmOmm_Field(length=1, decimal=0, description="에러타입(메시지유형, E:오류, I:정보, W:경고)", align="left", fill="")
	private String errType= "";
	
	
	/**
	 * 오류메시지
	 */
	@ApiModelProperty(
		name = "errMsg"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("errMsg")
	@BxmOmm_Field(length=100, decimal=0, description="오류메시지", align="left", fill="")
	private String errMsg= "";
	
	
	/**
	 * 에러버튼명(커스텀)
	 */
	@ApiModelProperty(
		name = "errBtnNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("errBtnNm")
	@BxmOmm_Field(length=100, decimal=0, description="에러버튼명(커스텀)", align="left", fill="")
	private String errBtnNm= "";
	
	
	/**
	 * [옵션]이동화면ID(URL)
	 */
	@ApiModelProperty(
		name = "moveScrnId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("moveScrnId")
	@BxmOmm_Field(length=100, decimal=0, description="[옵션]이동화면ID(URL)", align="left", fill="")
	private String moveScrnId= "";
	
	
	/**
	 * 에러메시지호출유형(N: Native)
	 */
	@ApiModelProperty(
		name = "errMsgExpsTycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("errMsgExpsTycd")
	@BxmOmm_Field(length=1, decimal=0, description="에러메시지호출유형(N: Native)", align="left", fill="")
	private String errMsgExpsTycd= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnScsYn= false;
	protected final boolean isSet_trnScsYn(){
		return this.isSet_trnScsYn;
	}
	private void setIsSet_trnScsYn(boolean value){
		this.isSet_trnScsYn= value;
	}
	/**
	 * 거래성공여부
	 */
	@XmlTransient
	public String getTrnScsYn(){
		return this.trnScsYn;
	}
	
	/**
	 * 거래성공여부
	 * 
	 * @param trnScsYn 거래성공여부
	 */
	public void setTrnScsYn(String trnScsYn){
		this.trnScsYn= trnScsYn;
		this.setIsSet_trnScsYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_errCd= false;
	protected final boolean isSet_errCd(){
		return this.isSet_errCd;
	}
	private void setIsSet_errCd(boolean value){
		this.isSet_errCd= value;
	}
	/**
	 * 에러코드
	 */
	@XmlTransient
	public String getErrCd(){
		return this.errCd;
	}
	
	/**
	 * 에러코드
	 * 
	 * @param errCd 에러코드
	 */
	public void setErrCd(String errCd){
		this.errCd= errCd;
		this.setIsSet_errCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_errTitle= false;
	protected final boolean isSet_errTitle(){
		return this.isSet_errTitle;
	}
	private void setIsSet_errTitle(boolean value){
		this.isSet_errTitle= value;
	}
	/**
	 * 에러메시지제목(커스텀)
	 */
	@XmlTransient
	public String getErrTitle(){
		return this.errTitle;
	}
	
	/**
	 * 에러메시지제목(커스텀)
	 * 
	 * @param errTitle 에러메시지제목(커스텀)
	 */
	public void setErrTitle(String errTitle){
		this.errTitle= errTitle;
		this.setIsSet_errTitle(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_errType= false;
	protected final boolean isSet_errType(){
		return this.isSet_errType;
	}
	private void setIsSet_errType(boolean value){
		this.isSet_errType= value;
	}
	/**
	 * 에러타입(메시지유형, E:오류, I:정보, W:경고)
	 */
	@XmlTransient
	public String getErrType(){
		return this.errType;
	}
	
	/**
	 * 에러타입(메시지유형, E:오류, I:정보, W:경고)
	 * 
	 * @param errType 에러타입(메시지유형, E:오류, I:정보, W:경고)
	 */
	public void setErrType(String errType){
		this.errType= errType;
		this.setIsSet_errType(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_errMsg= false;
	protected final boolean isSet_errMsg(){
		return this.isSet_errMsg;
	}
	private void setIsSet_errMsg(boolean value){
		this.isSet_errMsg= value;
	}
	/**
	 * 오류메시지
	 */
	@XmlTransient
	public String getErrMsg(){
		return this.errMsg;
	}
	
	/**
	 * 오류메시지
	 * 
	 * @param errMsg 오류메시지
	 */
	public void setErrMsg(String errMsg){
		this.errMsg= errMsg;
		this.setIsSet_errMsg(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_errBtnNm= false;
	protected final boolean isSet_errBtnNm(){
		return this.isSet_errBtnNm;
	}
	private void setIsSet_errBtnNm(boolean value){
		this.isSet_errBtnNm= value;
	}
	/**
	 * 에러버튼명(커스텀)
	 */
	@XmlTransient
	public String getErrBtnNm(){
		return this.errBtnNm;
	}
	
	/**
	 * 에러버튼명(커스텀)
	 * 
	 * @param errBtnNm 에러버튼명(커스텀)
	 */
	public void setErrBtnNm(String errBtnNm){
		this.errBtnNm= errBtnNm;
		this.setIsSet_errBtnNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_moveScrnId= false;
	protected final boolean isSet_moveScrnId(){
		return this.isSet_moveScrnId;
	}
	private void setIsSet_moveScrnId(boolean value){
		this.isSet_moveScrnId= value;
	}
	/**
	 * [옵션]이동화면ID(URL)
	 */
	@XmlTransient
	public String getMoveScrnId(){
		return this.moveScrnId;
	}
	
	/**
	 * [옵션]이동화면ID(URL)
	 * 
	 * @param moveScrnId [옵션]이동화면ID(URL)
	 */
	public void setMoveScrnId(String moveScrnId){
		this.moveScrnId= moveScrnId;
		this.setIsSet_moveScrnId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_errMsgExpsTycd= false;
	protected final boolean isSet_errMsgExpsTycd(){
		return this.isSet_errMsgExpsTycd;
	}
	private void setIsSet_errMsgExpsTycd(boolean value){
		this.isSet_errMsgExpsTycd= value;
	}
	/**
	 * 에러메시지호출유형(N: Native)
	 */
	@XmlTransient
	public String getErrMsgExpsTycd(){
		return this.errMsgExpsTycd;
	}
	
	/**
	 * 에러메시지호출유형(N: Native)
	 * 
	 * @param errMsgExpsTycd 에러메시지호출유형(N: Native)
	 */
	public void setErrMsgExpsTycd(String errMsgExpsTycd){
		this.errMsgExpsTycd= errMsgExpsTycd;
		this.setIsSet_errMsgExpsTycd(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT object= (MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT)super.clone();
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
		
		result= prime * result + ((this.trnScsYn==null)?0:this.trnScsYn.hashCode());
		result= prime * result + ((this.errCd==null)?0:this.errCd.hashCode());
		result= prime * result + ((this.errTitle==null)?0:this.errTitle.hashCode());
		result= prime * result + ((this.errType==null)?0:this.errType.hashCode());
		result= prime * result + ((this.errMsg==null)?0:this.errMsg.hashCode());
		result= prime * result + ((this.errBtnNm==null)?0:this.errBtnNm.hashCode());
		result= prime * result + ((this.moveScrnId==null)?0:this.moveScrnId.hashCode());
		result= prime * result + ((this.errMsgExpsTycd==null)?0:this.errMsgExpsTycd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT other= (MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT)obj;
		{
			Object _trnScsYn= getTrnScsYn();
			Object __trnScsYn= other.getTrnScsYn();
			if ( _trnScsYn== null ) { if ( __trnScsYn!= null ) return false; }
			else if ( !_trnScsYn.equals(__trnScsYn) ) return false;
		}
		{
			Object _errCd= getErrCd();
			Object __errCd= other.getErrCd();
			if ( _errCd== null ) { if ( __errCd!= null ) return false; }
			else if ( !_errCd.equals(__errCd) ) return false;
		}
		{
			Object _errTitle= getErrTitle();
			Object __errTitle= other.getErrTitle();
			if ( _errTitle== null ) { if ( __errTitle!= null ) return false; }
			else if ( !_errTitle.equals(__errTitle) ) return false;
		}
		{
			Object _errType= getErrType();
			Object __errType= other.getErrType();
			if ( _errType== null ) { if ( __errType!= null ) return false; }
			else if ( !_errType.equals(__errType) ) return false;
		}
		{
			Object _errMsg= getErrMsg();
			Object __errMsg= other.getErrMsg();
			if ( _errMsg== null ) { if ( __errMsg!= null ) return false; }
			else if ( !_errMsg.equals(__errMsg) ) return false;
		}
		{
			Object _errBtnNm= getErrBtnNm();
			Object __errBtnNm= other.getErrBtnNm();
			if ( _errBtnNm== null ) { if ( __errBtnNm!= null ) return false; }
			else if ( !_errBtnNm.equals(__errBtnNm) ) return false;
		}
		{
			Object _moveScrnId= getMoveScrnId();
			Object __moveScrnId= other.getMoveScrnId();
			if ( _moveScrnId== null ) { if ( __moveScrnId!= null ) return false; }
			else if ( !_moveScrnId.equals(__moveScrnId) ) return false;
		}
		{
			Object _errMsgExpsTycd= getErrMsgExpsTycd();
			Object __errMsgExpsTycd= other.getErrMsgExpsTycd();
			if ( _errMsgExpsTycd== null ) { if ( __errMsgExpsTycd!= null ) return false; }
			else if ( !_errMsgExpsTycd.equals(__errMsgExpsTycd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokEsnsPwnoCrtf_ODT.class.getName()).append(":\n");
		sb.append("\ttrnScsYn: ");
		sb.append(trnScsYn==null?"null":getTrnScsYn());
		sb.append("\n");
		sb.append("\terrCd: ");
		sb.append(errCd==null?"null":getErrCd());
		sb.append("\n");
		sb.append("\terrTitle: ");
		sb.append(errTitle==null?"null":getErrTitle());
		sb.append("\n");
		sb.append("\terrType: ");
		sb.append(errType==null?"null":getErrType());
		sb.append("\n");
		sb.append("\terrMsg: ");
		sb.append(errMsg==null?"null":getErrMsg());
		sb.append("\n");
		sb.append("\terrBtnNm: ");
		sb.append(errBtnNm==null?"null":getErrBtnNm());
		sb.append("\n");
		sb.append("\tmoveScrnId: ");
		sb.append(moveScrnId==null?"null":getMoveScrnId());
		sb.append("\n");
		sb.append("\terrMsgExpsTycd: ");
		sb.append(errMsgExpsTycd==null?"null":getErrMsgExpsTycd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* trnScsYn */
		messageLen+= 20; /* errCd */
		messageLen+= 100; /* errTitle */
		messageLen+= 1; /* errType */
		messageLen+= 100; /* errMsg */
		messageLen+= 100; /* errBtnNm */
		messageLen+= 100; /* moveScrnId */
		messageLen+= 1; /* errMsgExpsTycd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnScsYn");
		list.add("errCd");
		list.add("errTitle");
		list.add("errType");
		list.add("errMsg");
		list.add("errBtnNm");
		list.add("moveScrnId");
		list.add("errMsgExpsTycd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnScsYn", get("trnScsYn"));
		map.put("errCd", get("errCd"));
		map.put("errTitle", get("errTitle"));
		map.put("errType", get("errType"));
		map.put("errMsg", get("errMsg"));
		map.put("errBtnNm", get("errBtnNm"));
		map.put("moveScrnId", get("moveScrnId"));
		map.put("errMsgExpsTycd", get("errMsgExpsTycd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1627662024:/* trnScsYn */
			return getTrnScsYn();
		case 96783526:/* errCd */
			return getErrCd();
		case 1370931187:/* errTitle */
			return getErrTitle();
		case -1479781825:/* errType */
			return getErrType();
		case -1294667812:/* errMsg */
			return getErrMsg();
		case 1354628822:/* errBtnNm */
			return getErrBtnNm();
		case -1596185096:/* moveScrnId */
			return getMoveScrnId();
		case 2122156216:/* errMsgExpsTycd */
			return getErrMsgExpsTycd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1627662024:/* trnScsYn */
			setTrnScsYn((String)value);
			break;
		case 96783526:/* errCd */
			setErrCd((String)value);
			break;
		case 1370931187:/* errTitle */
			setErrTitle((String)value);
			break;
		case -1479781825:/* errType */
			setErrType((String)value);
			break;
		case -1294667812:/* errMsg */
			setErrMsg((String)value);
			break;
		case 1354628822:/* errBtnNm */
			setErrBtnNm((String)value);
			break;
		case -1596185096:/* moveScrnId */
			setMoveScrnId((String)value);
			break;
		case 2122156216:/* errMsgExpsTycd */
			setErrMsgExpsTycd((String)value);
			break;
		default:
			break;
		}
	}
	
}
