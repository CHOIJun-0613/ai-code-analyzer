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
 * PUSH카테고리목록조회DODT
 */
@XmlType(propOrder={
	"ntfcCtgrId", "ntfcCtgrCdId", "ntfcCtgrCdNm", "ntfcCtgrCdEngNm", "ntfcCtgrCdUsgYn", "ntfcCtgrCdStaDt", "ntfcCtgrCdEndDt", "ntfcCtgrCdTxt", "ntfcCtgrCdInqSrno", "ntfcDscd"
}, name="NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT")
@XmlRootElement(name="NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT")
@BxmCategory(logicalName="PUSH카테고리목록조회DODT", description="PUSH카테고리목록조회DODT") 
public class NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -69537190L;
	
	
	
	/**
	 * 알림카테고리ID
	 */
	@ApiModelProperty(
		name = "ntfcCtgrId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcCtgrId")
	@BxmOmm_Field(length=40, decimal=0, description="알림카테고리ID", align="left", fill="")
	private String ntfcCtgrId= "";
	
	
	/**
	 * 알림카테고리코드ID
	 */
	@ApiModelProperty(
		name = "ntfcCtgrCdId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcCtgrCdId")
	@BxmOmm_Field(length=16, decimal=0, description="알림카테고리코드ID", align="left", fill="")
	private String ntfcCtgrCdId= "";
	
	
	/**
	 * 알림카테고리코드명
	 */
	@ApiModelProperty(
		name = "ntfcCtgrCdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcCtgrCdNm")
	@BxmOmm_Field(length=120, decimal=0, description="알림카테고리코드명", align="left", fill="")
	private String ntfcCtgrCdNm= "";
	
	
	/**
	 * 알림카테고리코드영문명
	 */
	@ApiModelProperty(
		name = "ntfcCtgrCdEngNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcCtgrCdEngNm")
	@BxmOmm_Field(length=60, decimal=0, description="알림카테고리코드영문명", align="left", fill="")
	private String ntfcCtgrCdEngNm= "";
	
	
	/**
	 * 알림카테고리코드사용여부
	 */
	@ApiModelProperty(
		name = "ntfcCtgrCdUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcCtgrCdUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="알림카테고리코드사용여부", align="left", fill="")
	private String ntfcCtgrCdUsgYn= "";
	
	
	/**
	 * 알림카테고리코드시작일자
	 */
	@ApiModelProperty(
		name = "ntfcCtgrCdStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcCtgrCdStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="알림카테고리코드시작일자", align="left", fill="")
	private String ntfcCtgrCdStaDt= "";
	
	
	/**
	 * 알림카테고리코드종료일자
	 */
	@ApiModelProperty(
		name = "ntfcCtgrCdEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcCtgrCdEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="알림카테고리코드종료일자", align="left", fill="")
	private String ntfcCtgrCdEndDt= "";
	
	
	/**
	 * 알림카테고리코드내용
	 */
	@ApiModelProperty(
		name = "ntfcCtgrCdTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcCtgrCdTxt")
	@BxmOmm_Field(length=500, decimal=0, description="알림카테고리코드내용", align="left", fill="")
	private String ntfcCtgrCdTxt= "";
	
	
	/**
	 * 알림카테고리코드조회일련번호
	 */
	@ApiModelProperty(
		name = "ntfcCtgrCdInqSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("ntfcCtgrCdInqSrno")
	@BxmOmm_Field(length=5, decimal=0, description="알림카테고리코드조회일련번호", align="right", fill="")
	private Integer ntfcCtgrCdInqSrno= 0;
	
	
	/**
	 * 알림구분코드
	 */
	@ApiModelProperty(
		name = "ntfcDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcDscd")
	@BxmOmm_Field(length=1, decimal=0, description="알림구분코드", align="left", fill="")
	private String ntfcDscd= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcCtgrId= false;
	protected final boolean isSet_ntfcCtgrId(){
		return this.isSet_ntfcCtgrId;
	}
	private void setIsSet_ntfcCtgrId(boolean value){
		this.isSet_ntfcCtgrId= value;
	}
	/**
	 * 알림카테고리ID
	 */
	@XmlTransient
	public String getNtfcCtgrId(){
		return this.ntfcCtgrId;
	}
	
	/**
	 * 알림카테고리ID
	 * 
	 * @param ntfcCtgrId 알림카테고리ID
	 */
	public void setNtfcCtgrId(String ntfcCtgrId){
		this.ntfcCtgrId= ntfcCtgrId;
		this.setIsSet_ntfcCtgrId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcCtgrCdId= false;
	protected final boolean isSet_ntfcCtgrCdId(){
		return this.isSet_ntfcCtgrCdId;
	}
	private void setIsSet_ntfcCtgrCdId(boolean value){
		this.isSet_ntfcCtgrCdId= value;
	}
	/**
	 * 알림카테고리코드ID
	 */
	@XmlTransient
	public String getNtfcCtgrCdId(){
		return this.ntfcCtgrCdId;
	}
	
	/**
	 * 알림카테고리코드ID
	 * 
	 * @param ntfcCtgrCdId 알림카테고리코드ID
	 */
	public void setNtfcCtgrCdId(String ntfcCtgrCdId){
		this.ntfcCtgrCdId= ntfcCtgrCdId;
		this.setIsSet_ntfcCtgrCdId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcCtgrCdNm= false;
	protected final boolean isSet_ntfcCtgrCdNm(){
		return this.isSet_ntfcCtgrCdNm;
	}
	private void setIsSet_ntfcCtgrCdNm(boolean value){
		this.isSet_ntfcCtgrCdNm= value;
	}
	/**
	 * 알림카테고리코드명
	 */
	@XmlTransient
	public String getNtfcCtgrCdNm(){
		return this.ntfcCtgrCdNm;
	}
	
	/**
	 * 알림카테고리코드명
	 * 
	 * @param ntfcCtgrCdNm 알림카테고리코드명
	 */
	public void setNtfcCtgrCdNm(String ntfcCtgrCdNm){
		this.ntfcCtgrCdNm= ntfcCtgrCdNm;
		this.setIsSet_ntfcCtgrCdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcCtgrCdEngNm= false;
	protected final boolean isSet_ntfcCtgrCdEngNm(){
		return this.isSet_ntfcCtgrCdEngNm;
	}
	private void setIsSet_ntfcCtgrCdEngNm(boolean value){
		this.isSet_ntfcCtgrCdEngNm= value;
	}
	/**
	 * 알림카테고리코드영문명
	 */
	@XmlTransient
	public String getNtfcCtgrCdEngNm(){
		return this.ntfcCtgrCdEngNm;
	}
	
	/**
	 * 알림카테고리코드영문명
	 * 
	 * @param ntfcCtgrCdEngNm 알림카테고리코드영문명
	 */
	public void setNtfcCtgrCdEngNm(String ntfcCtgrCdEngNm){
		this.ntfcCtgrCdEngNm= ntfcCtgrCdEngNm;
		this.setIsSet_ntfcCtgrCdEngNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcCtgrCdUsgYn= false;
	protected final boolean isSet_ntfcCtgrCdUsgYn(){
		return this.isSet_ntfcCtgrCdUsgYn;
	}
	private void setIsSet_ntfcCtgrCdUsgYn(boolean value){
		this.isSet_ntfcCtgrCdUsgYn= value;
	}
	/**
	 * 알림카테고리코드사용여부
	 */
	@XmlTransient
	public String getNtfcCtgrCdUsgYn(){
		return this.ntfcCtgrCdUsgYn;
	}
	
	/**
	 * 알림카테고리코드사용여부
	 * 
	 * @param ntfcCtgrCdUsgYn 알림카테고리코드사용여부
	 */
	public void setNtfcCtgrCdUsgYn(String ntfcCtgrCdUsgYn){
		this.ntfcCtgrCdUsgYn= ntfcCtgrCdUsgYn;
		this.setIsSet_ntfcCtgrCdUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcCtgrCdStaDt= false;
	protected final boolean isSet_ntfcCtgrCdStaDt(){
		return this.isSet_ntfcCtgrCdStaDt;
	}
	private void setIsSet_ntfcCtgrCdStaDt(boolean value){
		this.isSet_ntfcCtgrCdStaDt= value;
	}
	/**
	 * 알림카테고리코드시작일자
	 */
	@XmlTransient
	public String getNtfcCtgrCdStaDt(){
		return this.ntfcCtgrCdStaDt;
	}
	
	/**
	 * 알림카테고리코드시작일자
	 * 
	 * @param ntfcCtgrCdStaDt 알림카테고리코드시작일자
	 */
	public void setNtfcCtgrCdStaDt(String ntfcCtgrCdStaDt){
		this.ntfcCtgrCdStaDt= ntfcCtgrCdStaDt;
		this.setIsSet_ntfcCtgrCdStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcCtgrCdEndDt= false;
	protected final boolean isSet_ntfcCtgrCdEndDt(){
		return this.isSet_ntfcCtgrCdEndDt;
	}
	private void setIsSet_ntfcCtgrCdEndDt(boolean value){
		this.isSet_ntfcCtgrCdEndDt= value;
	}
	/**
	 * 알림카테고리코드종료일자
	 */
	@XmlTransient
	public String getNtfcCtgrCdEndDt(){
		return this.ntfcCtgrCdEndDt;
	}
	
	/**
	 * 알림카테고리코드종료일자
	 * 
	 * @param ntfcCtgrCdEndDt 알림카테고리코드종료일자
	 */
	public void setNtfcCtgrCdEndDt(String ntfcCtgrCdEndDt){
		this.ntfcCtgrCdEndDt= ntfcCtgrCdEndDt;
		this.setIsSet_ntfcCtgrCdEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcCtgrCdTxt= false;
	protected final boolean isSet_ntfcCtgrCdTxt(){
		return this.isSet_ntfcCtgrCdTxt;
	}
	private void setIsSet_ntfcCtgrCdTxt(boolean value){
		this.isSet_ntfcCtgrCdTxt= value;
	}
	/**
	 * 알림카테고리코드내용
	 */
	@XmlTransient
	public String getNtfcCtgrCdTxt(){
		return this.ntfcCtgrCdTxt;
	}
	
	/**
	 * 알림카테고리코드내용
	 * 
	 * @param ntfcCtgrCdTxt 알림카테고리코드내용
	 */
	public void setNtfcCtgrCdTxt(String ntfcCtgrCdTxt){
		this.ntfcCtgrCdTxt= ntfcCtgrCdTxt;
		this.setIsSet_ntfcCtgrCdTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcCtgrCdInqSrno= false;
	protected final boolean isSet_ntfcCtgrCdInqSrno(){
		return this.isSet_ntfcCtgrCdInqSrno;
	}
	private void setIsSet_ntfcCtgrCdInqSrno(boolean value){
		this.isSet_ntfcCtgrCdInqSrno= value;
	}
	/**
	 * 알림카테고리코드조회일련번호
	 */
	@XmlTransient
	public Integer getNtfcCtgrCdInqSrno(){
		return this.ntfcCtgrCdInqSrno;
	}
	
	/**
	 * 알림카테고리코드조회일련번호
	 * 
	 * @param ntfcCtgrCdInqSrno 알림카테고리코드조회일련번호
	 */
	public void setNtfcCtgrCdInqSrno(Integer ntfcCtgrCdInqSrno){
		this.ntfcCtgrCdInqSrno= ntfcCtgrCdInqSrno;
		this.setIsSet_ntfcCtgrCdInqSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcDscd= false;
	protected final boolean isSet_ntfcDscd(){
		return this.isSet_ntfcDscd;
	}
	private void setIsSet_ntfcDscd(boolean value){
		this.isSet_ntfcDscd= value;
	}
	/**
	 * 알림구분코드
	 */
	@XmlTransient
	public String getNtfcDscd(){
		return this.ntfcDscd;
	}
	
	/**
	 * 알림구분코드
	 * 
	 * @param ntfcDscd 알림구분코드
	 */
	public void setNtfcDscd(String ntfcDscd){
		this.ntfcDscd= ntfcDscd;
		this.setIsSet_ntfcDscd(true);
	}
				
	@Override
	public NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT clone(){
		try{
			NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT object= (NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT)super.clone();
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
		
		result= prime * result + ((this.ntfcCtgrId==null)?0:this.ntfcCtgrId.hashCode());
		result= prime * result + ((this.ntfcCtgrCdId==null)?0:this.ntfcCtgrCdId.hashCode());
		result= prime * result + ((this.ntfcCtgrCdNm==null)?0:this.ntfcCtgrCdNm.hashCode());
		result= prime * result + ((this.ntfcCtgrCdEngNm==null)?0:this.ntfcCtgrCdEngNm.hashCode());
		result= prime * result + ((this.ntfcCtgrCdUsgYn==null)?0:this.ntfcCtgrCdUsgYn.hashCode());
		result= prime * result + ((this.ntfcCtgrCdStaDt==null)?0:this.ntfcCtgrCdStaDt.hashCode());
		result= prime * result + ((this.ntfcCtgrCdEndDt==null)?0:this.ntfcCtgrCdEndDt.hashCode());
		result= prime * result + ((this.ntfcCtgrCdTxt==null)?0:this.ntfcCtgrCdTxt.hashCode());
		result= prime * result + ((this.ntfcCtgrCdInqSrno==null)?0:this.ntfcCtgrCdInqSrno.hashCode());
		result= prime * result + ((this.ntfcDscd==null)?0:this.ntfcDscd.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT other= (NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT)obj;
		{
			Object _ntfcCtgrId= getNtfcCtgrId();
			Object __ntfcCtgrId= other.getNtfcCtgrId();
			if ( _ntfcCtgrId== null ) { if ( __ntfcCtgrId!= null ) return false; }
			else if ( !_ntfcCtgrId.equals(__ntfcCtgrId) ) return false;
		}
		{
			Object _ntfcCtgrCdId= getNtfcCtgrCdId();
			Object __ntfcCtgrCdId= other.getNtfcCtgrCdId();
			if ( _ntfcCtgrCdId== null ) { if ( __ntfcCtgrCdId!= null ) return false; }
			else if ( !_ntfcCtgrCdId.equals(__ntfcCtgrCdId) ) return false;
		}
		{
			Object _ntfcCtgrCdNm= getNtfcCtgrCdNm();
			Object __ntfcCtgrCdNm= other.getNtfcCtgrCdNm();
			if ( _ntfcCtgrCdNm== null ) { if ( __ntfcCtgrCdNm!= null ) return false; }
			else if ( !_ntfcCtgrCdNm.equals(__ntfcCtgrCdNm) ) return false;
		}
		{
			Object _ntfcCtgrCdEngNm= getNtfcCtgrCdEngNm();
			Object __ntfcCtgrCdEngNm= other.getNtfcCtgrCdEngNm();
			if ( _ntfcCtgrCdEngNm== null ) { if ( __ntfcCtgrCdEngNm!= null ) return false; }
			else if ( !_ntfcCtgrCdEngNm.equals(__ntfcCtgrCdEngNm) ) return false;
		}
		{
			Object _ntfcCtgrCdUsgYn= getNtfcCtgrCdUsgYn();
			Object __ntfcCtgrCdUsgYn= other.getNtfcCtgrCdUsgYn();
			if ( _ntfcCtgrCdUsgYn== null ) { if ( __ntfcCtgrCdUsgYn!= null ) return false; }
			else if ( !_ntfcCtgrCdUsgYn.equals(__ntfcCtgrCdUsgYn) ) return false;
		}
		{
			Object _ntfcCtgrCdStaDt= getNtfcCtgrCdStaDt();
			Object __ntfcCtgrCdStaDt= other.getNtfcCtgrCdStaDt();
			if ( _ntfcCtgrCdStaDt== null ) { if ( __ntfcCtgrCdStaDt!= null ) return false; }
			else if ( !_ntfcCtgrCdStaDt.equals(__ntfcCtgrCdStaDt) ) return false;
		}
		{
			Object _ntfcCtgrCdEndDt= getNtfcCtgrCdEndDt();
			Object __ntfcCtgrCdEndDt= other.getNtfcCtgrCdEndDt();
			if ( _ntfcCtgrCdEndDt== null ) { if ( __ntfcCtgrCdEndDt!= null ) return false; }
			else if ( !_ntfcCtgrCdEndDt.equals(__ntfcCtgrCdEndDt) ) return false;
		}
		{
			Object _ntfcCtgrCdTxt= getNtfcCtgrCdTxt();
			Object __ntfcCtgrCdTxt= other.getNtfcCtgrCdTxt();
			if ( _ntfcCtgrCdTxt== null ) { if ( __ntfcCtgrCdTxt!= null ) return false; }
			else if ( !_ntfcCtgrCdTxt.equals(__ntfcCtgrCdTxt) ) return false;
		}
		{
			Object _ntfcCtgrCdInqSrno= getNtfcCtgrCdInqSrno();
			Object __ntfcCtgrCdInqSrno= other.getNtfcCtgrCdInqSrno();
			if ( _ntfcCtgrCdInqSrno== null ) { if ( __ntfcCtgrCdInqSrno!= null ) return false; }
			else if ( !_ntfcCtgrCdInqSrno.equals(__ntfcCtgrCdInqSrno) ) return false;
		}
		{
			Object _ntfcDscd= getNtfcDscd();
			Object __ntfcDscd= other.getNtfcDscd();
			if ( _ntfcDscd== null ) { if ( __ntfcDscd!= null ) return false; }
			else if ( !_ntfcDscd.equals(__ntfcDscd) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT.class.getName()).append(":\n");
		sb.append("\tntfcCtgrId: ");
		sb.append(ntfcCtgrId==null?"null":getNtfcCtgrId());
		sb.append("\n");
		sb.append("\tntfcCtgrCdId: ");
		sb.append(ntfcCtgrCdId==null?"null":getNtfcCtgrCdId());
		sb.append("\n");
		sb.append("\tntfcCtgrCdNm: ");
		sb.append(ntfcCtgrCdNm==null?"null":getNtfcCtgrCdNm());
		sb.append("\n");
		sb.append("\tntfcCtgrCdEngNm: ");
		sb.append(ntfcCtgrCdEngNm==null?"null":getNtfcCtgrCdEngNm());
		sb.append("\n");
		sb.append("\tntfcCtgrCdUsgYn: ");
		sb.append(ntfcCtgrCdUsgYn==null?"null":getNtfcCtgrCdUsgYn());
		sb.append("\n");
		sb.append("\tntfcCtgrCdStaDt: ");
		sb.append(ntfcCtgrCdStaDt==null?"null":getNtfcCtgrCdStaDt());
		sb.append("\n");
		sb.append("\tntfcCtgrCdEndDt: ");
		sb.append(ntfcCtgrCdEndDt==null?"null":getNtfcCtgrCdEndDt());
		sb.append("\n");
		sb.append("\tntfcCtgrCdTxt: ");
		sb.append(ntfcCtgrCdTxt==null?"null":getNtfcCtgrCdTxt());
		sb.append("\n");
		sb.append("\tntfcCtgrCdInqSrno: ");
		sb.append(ntfcCtgrCdInqSrno==null?"null":getNtfcCtgrCdInqSrno());
		sb.append("\n");
		sb.append("\tntfcDscd: ");
		sb.append(ntfcDscd==null?"null":getNtfcDscd());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 40; /* ntfcCtgrId */
		messageLen+= 16; /* ntfcCtgrCdId */
		messageLen+= 120; /* ntfcCtgrCdNm */
		messageLen+= 60; /* ntfcCtgrCdEngNm */
		messageLen+= 1; /* ntfcCtgrCdUsgYn */
		messageLen+= 8; /* ntfcCtgrCdStaDt */
		messageLen+= 8; /* ntfcCtgrCdEndDt */
		messageLen+= 500; /* ntfcCtgrCdTxt */
		messageLen+= 5; /* ntfcCtgrCdInqSrno */
		messageLen+= 1; /* ntfcDscd */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("ntfcCtgrId");
		list.add("ntfcCtgrCdId");
		list.add("ntfcCtgrCdNm");
		list.add("ntfcCtgrCdEngNm");
		list.add("ntfcCtgrCdUsgYn");
		list.add("ntfcCtgrCdStaDt");
		list.add("ntfcCtgrCdEndDt");
		list.add("ntfcCtgrCdTxt");
		list.add("ntfcCtgrCdInqSrno");
		list.add("ntfcDscd");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("ntfcCtgrId", get("ntfcCtgrId"));
		map.put("ntfcCtgrCdId", get("ntfcCtgrCdId"));
		map.put("ntfcCtgrCdNm", get("ntfcCtgrCdNm"));
		map.put("ntfcCtgrCdEngNm", get("ntfcCtgrCdEngNm"));
		map.put("ntfcCtgrCdUsgYn", get("ntfcCtgrCdUsgYn"));
		map.put("ntfcCtgrCdStaDt", get("ntfcCtgrCdStaDt"));
		map.put("ntfcCtgrCdEndDt", get("ntfcCtgrCdEndDt"));
		map.put("ntfcCtgrCdTxt", get("ntfcCtgrCdTxt"));
		map.put("ntfcCtgrCdInqSrno", get("ntfcCtgrCdInqSrno"));
		map.put("ntfcDscd", get("ntfcDscd"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2017038906:/* ntfcCtgrId */
			return getNtfcCtgrId();
		case 1343961787:/* ntfcCtgrCdId */
			return getNtfcCtgrCdId();
		case 1343961951:/* ntfcCtgrCdNm */
			return getNtfcCtgrCdNm();
		case 277168541:/* ntfcCtgrCdEngNm */
			return getNtfcCtgrCdEngNm();
		case 292094174:/* ntfcCtgrCdUsgYn */
			return getNtfcCtgrCdUsgYn();
		case 290270512:/* ntfcCtgrCdStaDt */
			return getNtfcCtgrCdStaDt();
		case 277165355:/* ntfcCtgrCdEndDt */
			return getNtfcCtgrCdEndDt();
		case -1286846256:/* ntfcCtgrCdTxt */
			return getNtfcCtgrCdTxt();
		case -664564532:/* ntfcCtgrCdInqSrno */
			return getNtfcCtgrCdInqSrno();
		case 1320561875:/* ntfcDscd */
			return getNtfcDscd();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 2017038906:/* ntfcCtgrId */
			setNtfcCtgrId((String)value);
			break;
		case 1343961787:/* ntfcCtgrCdId */
			setNtfcCtgrCdId((String)value);
			break;
		case 1343961951:/* ntfcCtgrCdNm */
			setNtfcCtgrCdNm((String)value);
			break;
		case 277168541:/* ntfcCtgrCdEngNm */
			setNtfcCtgrCdEngNm((String)value);
			break;
		case 292094174:/* ntfcCtgrCdUsgYn */
			setNtfcCtgrCdUsgYn((String)value);
			break;
		case 290270512:/* ntfcCtgrCdStaDt */
			setNtfcCtgrCdStaDt((String)value);
			break;
		case 277165355:/* ntfcCtgrCdEndDt */
			setNtfcCtgrCdEndDt((String)value);
			break;
		case -1286846256:/* ntfcCtgrCdTxt */
			setNtfcCtgrCdTxt((String)value);
			break;
		case -664564532:/* ntfcCtgrCdInqSrno */
			setNtfcCtgrCdInqSrno((Integer)value);
			break;
		case 1320561875:/* ntfcDscd */
			setNtfcDscd((String)value);
			break;
		default:
			break;
		}
	}
	
}
