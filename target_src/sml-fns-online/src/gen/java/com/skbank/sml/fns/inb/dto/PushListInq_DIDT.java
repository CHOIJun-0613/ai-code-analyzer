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
 * PUSH 조회 입력 DTO
 */
@XmlType(propOrder={
	"itcsno", "mchrTkn", "pushNtfcDisv", "ntsvcRawDscd", "pageNo", "pageInqCnt"
}, name="PushListInq_DIDT")
@XmlRootElement(name="PushListInq_DIDT")
@BxmCategory(logicalName="푸시.목록.조회.DBM.입력.IO", description="PUSH 조회 입력 DTO") 
public class PushListInq_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 710437808L;
	
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=36, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 기기토큰
	 */
	@ApiModelProperty(
		name = "mchrTkn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mchrTkn")
	@BxmOmm_Field(length=57, decimal=0, description="기기토큰", align="left", fill="")
	private String mchrTkn= "";
	
	
	/**
	 * PUSH알림구분값
	 */
	@ApiModelProperty(
		name = "pushNtfcDisv"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pushNtfcDisv")
	@BxmOmm_Field(length=3, decimal=0, description="PUSH알림구분값", align="left", fill="")
	private String pushNtfcDisv= "";
	
	
	/**
	 * 알림서비스입출금구분코드
	 */
	@ApiModelProperty(
		name = "ntsvcRawDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntsvcRawDscd")
	@BxmOmm_Field(length=1, decimal=0, description="알림서비스입출금구분코드", align="left", fill="")
	private String ntsvcRawDscd= "";
	
	
	/**
	 * 페이지번호
	 */
	@ApiModelProperty(
		name = "pageNo"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("pageNo")
	@BxmOmm_Field(length=6, decimal=0, description="페이지번호", align="right", fill="")
	private Integer pageNo= 0;
	
	
	/**
	 * 페이지조회건수
	 */
	@ApiModelProperty(
		name = "pageInqCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("pageInqCnt")
	@BxmOmm_Field(length=5, decimal=0, description="페이지조회건수", align="right", fill="")
	private Integer pageInqCnt= 0;
	
	
	
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
	private boolean isSet_mchrTkn= false;
	protected final boolean isSet_mchrTkn(){
		return this.isSet_mchrTkn;
	}
	private void setIsSet_mchrTkn(boolean value){
		this.isSet_mchrTkn= value;
	}
	/**
	 * 기기토큰
	 */
	@XmlTransient
	public String getMchrTkn(){
		return this.mchrTkn;
	}
	
	/**
	 * 기기토큰
	 * 
	 * @param mchrTkn 기기토큰
	 */
	public void setMchrTkn(String mchrTkn){
		this.mchrTkn= mchrTkn;
		this.setIsSet_mchrTkn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pushNtfcDisv= false;
	protected final boolean isSet_pushNtfcDisv(){
		return this.isSet_pushNtfcDisv;
	}
	private void setIsSet_pushNtfcDisv(boolean value){
		this.isSet_pushNtfcDisv= value;
	}
	/**
	 * PUSH알림구분값
	 */
	@XmlTransient
	public String getPushNtfcDisv(){
		return this.pushNtfcDisv;
	}
	
	/**
	 * PUSH알림구분값
	 * 
	 * @param pushNtfcDisv PUSH알림구분값
	 */
	public void setPushNtfcDisv(String pushNtfcDisv){
		this.pushNtfcDisv= pushNtfcDisv;
		this.setIsSet_pushNtfcDisv(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntsvcRawDscd= false;
	protected final boolean isSet_ntsvcRawDscd(){
		return this.isSet_ntsvcRawDscd;
	}
	private void setIsSet_ntsvcRawDscd(boolean value){
		this.isSet_ntsvcRawDscd= value;
	}
	/**
	 * 알림서비스입출금구분코드
	 */
	@XmlTransient
	public String getNtsvcRawDscd(){
		return this.ntsvcRawDscd;
	}
	
	/**
	 * 알림서비스입출금구분코드
	 * 
	 * @param ntsvcRawDscd 알림서비스입출금구분코드
	 */
	public void setNtsvcRawDscd(String ntsvcRawDscd){
		this.ntsvcRawDscd= ntsvcRawDscd;
		this.setIsSet_ntsvcRawDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pageNo= false;
	protected final boolean isSet_pageNo(){
		return this.isSet_pageNo;
	}
	private void setIsSet_pageNo(boolean value){
		this.isSet_pageNo= value;
	}
	/**
	 * 페이지번호
	 */
	@XmlTransient
	public Integer getPageNo(){
		return this.pageNo;
	}
	
	/**
	 * 페이지번호
	 * 
	 * @param pageNo 페이지번호
	 */
	public void setPageNo(Integer pageNo){
		this.pageNo= pageNo;
		this.setIsSet_pageNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pageInqCnt= false;
	protected final boolean isSet_pageInqCnt(){
		return this.isSet_pageInqCnt;
	}
	private void setIsSet_pageInqCnt(boolean value){
		this.isSet_pageInqCnt= value;
	}
	/**
	 * 페이지조회건수
	 */
	@XmlTransient
	public Integer getPageInqCnt(){
		return this.pageInqCnt;
	}
	
	/**
	 * 페이지조회건수
	 * 
	 * @param pageInqCnt 페이지조회건수
	 */
	public void setPageInqCnt(Integer pageInqCnt){
		this.pageInqCnt= pageInqCnt;
		this.setIsSet_pageInqCnt(true);
	}
				
	@Override
	public PushListInq_DIDT clone(){
		try{
			PushListInq_DIDT object= (PushListInq_DIDT)super.clone();
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
		result= prime * result + ((this.mchrTkn==null)?0:this.mchrTkn.hashCode());
		result= prime * result + ((this.pushNtfcDisv==null)?0:this.pushNtfcDisv.hashCode());
		result= prime * result + ((this.ntsvcRawDscd==null)?0:this.ntsvcRawDscd.hashCode());
		result= prime * result + ((this.pageNo==null)?0:this.pageNo.hashCode());
		result= prime * result + ((this.pageInqCnt==null)?0:this.pageInqCnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PushListInq_DIDT other= (PushListInq_DIDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _mchrTkn= getMchrTkn();
			Object __mchrTkn= other.getMchrTkn();
			if ( _mchrTkn== null ) { if ( __mchrTkn!= null ) return false; }
			else if ( !_mchrTkn.equals(__mchrTkn) ) return false;
		}
		{
			Object _pushNtfcDisv= getPushNtfcDisv();
			Object __pushNtfcDisv= other.getPushNtfcDisv();
			if ( _pushNtfcDisv== null ) { if ( __pushNtfcDisv!= null ) return false; }
			else if ( !_pushNtfcDisv.equals(__pushNtfcDisv) ) return false;
		}
		{
			Object _ntsvcRawDscd= getNtsvcRawDscd();
			Object __ntsvcRawDscd= other.getNtsvcRawDscd();
			if ( _ntsvcRawDscd== null ) { if ( __ntsvcRawDscd!= null ) return false; }
			else if ( !_ntsvcRawDscd.equals(__ntsvcRawDscd) ) return false;
		}
		{
			Object _pageNo= getPageNo();
			Object __pageNo= other.getPageNo();
			if ( _pageNo== null ) { if ( __pageNo!= null ) return false; }
			else if ( !_pageNo.equals(__pageNo) ) return false;
		}
		{
			Object _pageInqCnt= getPageInqCnt();
			Object __pageInqCnt= other.getPageInqCnt();
			if ( _pageInqCnt== null ) { if ( __pageInqCnt!= null ) return false; }
			else if ( !_pageInqCnt.equals(__pageInqCnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PushListInq_DIDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tmchrTkn: ");
		sb.append(mchrTkn==null?"null":getMchrTkn());
		sb.append("\n");
		sb.append("\tpushNtfcDisv: ");
		sb.append(pushNtfcDisv==null?"null":getPushNtfcDisv());
		sb.append("\n");
		sb.append("\tntsvcRawDscd: ");
		sb.append(ntsvcRawDscd==null?"null":getNtsvcRawDscd());
		sb.append("\n");
		sb.append("\tpageNo: ");
		sb.append(pageNo==null?"null":getPageNo());
		sb.append("\n");
		sb.append("\tpageInqCnt: ");
		sb.append(pageInqCnt==null?"null":getPageInqCnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 57; /* mchrTkn */
		messageLen+= 3; /* pushNtfcDisv */
		messageLen+= 1; /* ntsvcRawDscd */
		messageLen+= 6; /* pageNo */
		messageLen+= 5; /* pageInqCnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("mchrTkn");
		list.add("pushNtfcDisv");
		list.add("ntsvcRawDscd");
		list.add("pageNo");
		list.add("pageInqCnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("mchrTkn", get("mchrTkn"));
		map.put("pushNtfcDisv", get("pushNtfcDisv"));
		map.put("ntsvcRawDscd", get("ntsvcRawDscd"));
		map.put("pageNo", get("pageNo"));
		map.put("pageInqCnt", get("pageInqCnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 887465879:/* mchrTkn */
			return getMchrTkn();
		case -1248238971:/* pushNtfcDisv */
			return getPushNtfcDisv();
		case -1534720706:/* ntsvcRawDscd */
			return getNtsvcRawDscd();
		case -995752784:/* pageNo */
			return getPageNo();
		case 995246412:/* pageInqCnt */
			return getPageInqCnt();
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
		case 887465879:/* mchrTkn */
			setMchrTkn((String)value);
			break;
		case -1248238971:/* pushNtfcDisv */
			setPushNtfcDisv((String)value);
			break;
		case -1534720706:/* ntsvcRawDscd */
			setNtsvcRawDscd((String)value);
			break;
		case -995752784:/* pageNo */
			setPageNo((Integer)value);
			break;
		case 995246412:/* pageInqCnt */
			setPageInqCnt((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
