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
 * Push 목록 요청 DTO
 */
@XmlType(propOrder={
	"itcsno", "umsReqStaDt", "umsReqEndDt", "ntfbxLrclCD", "ntfbxMclfCD", "favtYn", "pageNo", "pageSize", "ntfcRfwr", "umsTrno", "umsReqDt"
}, name="INBPushListReq_DTO")
@XmlRootElement(name="INBPushListReq_DTO")
@BxmCategory(logicalName="Push 목록 요청 DTO", description="Push 목록 요청 DTO") 
public class INBPushListReq_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -925052039L;
	
	
	
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
	 * UMS요청시작일자
	 */
	@ApiModelProperty(
		name = "umsReqStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsReqStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="UMS요청시작일자", align="left", fill="")
	private String umsReqStaDt= "";
	
	
	/**
	 * UMS요청종료일자
	 */
	@ApiModelProperty(
		name = "umsReqEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsReqEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="UMS요청종료일자", align="left", fill="")
	private String umsReqEndDt= "";
	
	
	/**
	 * 알림함대분류코드
	 */
	@ApiModelProperty(
		name = "ntfbxLrclCD"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxLrclCD")
	@BxmOmm_Field(length=10, decimal=0, description="알림함대분류코드", align="left", fill="")
	private String ntfbxLrclCD= "";
	
	
	/**
	 * 알림함중분류코드
	 */
	@ApiModelProperty(
		name = "ntfbxMclfCD"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxMclfCD")
	@BxmOmm_Field(length=10, decimal=0, description="알림함중분류코드", align="left", fill="")
	private String ntfbxMclfCD= "";
	
	
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
	 * 페이지사이즈
	 */
	@ApiModelProperty(
		name = "pageSize"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pageSize")
	@BxmOmm_Field(length=10, decimal=0, description="페이지사이즈", align="left", fill="")
	private String pageSize= "";
	
	
	/**
	 * 알림검색어
	 */
	@ApiModelProperty(
		name = "ntfcRfwr"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfcRfwr")
	@BxmOmm_Field(length=10, decimal=0, description="알림검색어", align="left", fill="")
	private String ntfcRfwr= "";
	
	
	/**
	 * UMS거래번호
	 */
	@ApiModelProperty(
		name = "umsTrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsTrno")
	@BxmOmm_Field(length=20, decimal=0, description="UMS거래번호", align="left", fill="")
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
	private boolean isSet_umsReqStaDt= false;
	protected final boolean isSet_umsReqStaDt(){
		return this.isSet_umsReqStaDt;
	}
	private void setIsSet_umsReqStaDt(boolean value){
		this.isSet_umsReqStaDt= value;
	}
	/**
	 * UMS요청시작일자
	 */
	@XmlTransient
	public String getUmsReqStaDt(){
		return this.umsReqStaDt;
	}
	
	/**
	 * UMS요청시작일자
	 * 
	 * @param umsReqStaDt UMS요청시작일자
	 */
	public void setUmsReqStaDt(String umsReqStaDt){
		this.umsReqStaDt= umsReqStaDt;
		this.setIsSet_umsReqStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_umsReqEndDt= false;
	protected final boolean isSet_umsReqEndDt(){
		return this.isSet_umsReqEndDt;
	}
	private void setIsSet_umsReqEndDt(boolean value){
		this.isSet_umsReqEndDt= value;
	}
	/**
	 * UMS요청종료일자
	 */
	@XmlTransient
	public String getUmsReqEndDt(){
		return this.umsReqEndDt;
	}
	
	/**
	 * UMS요청종료일자
	 * 
	 * @param umsReqEndDt UMS요청종료일자
	 */
	public void setUmsReqEndDt(String umsReqEndDt){
		this.umsReqEndDt= umsReqEndDt;
		this.setIsSet_umsReqEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxLrclCD= false;
	protected final boolean isSet_ntfbxLrclCD(){
		return this.isSet_ntfbxLrclCD;
	}
	private void setIsSet_ntfbxLrclCD(boolean value){
		this.isSet_ntfbxLrclCD= value;
	}
	/**
	 * 알림함대분류코드
	 */
	@XmlTransient
	public String getNtfbxLrclCD(){
		return this.ntfbxLrclCD;
	}
	
	/**
	 * 알림함대분류코드
	 * 
	 * @param ntfbxLrclCD 알림함대분류코드
	 */
	public void setNtfbxLrclCD(String ntfbxLrclCD){
		this.ntfbxLrclCD= ntfbxLrclCD;
		this.setIsSet_ntfbxLrclCD(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxMclfCD= false;
	protected final boolean isSet_ntfbxMclfCD(){
		return this.isSet_ntfbxMclfCD;
	}
	private void setIsSet_ntfbxMclfCD(boolean value){
		this.isSet_ntfbxMclfCD= value;
	}
	/**
	 * 알림함중분류코드
	 */
	@XmlTransient
	public String getNtfbxMclfCD(){
		return this.ntfbxMclfCD;
	}
	
	/**
	 * 알림함중분류코드
	 * 
	 * @param ntfbxMclfCD 알림함중분류코드
	 */
	public void setNtfbxMclfCD(String ntfbxMclfCD){
		this.ntfbxMclfCD= ntfbxMclfCD;
		this.setIsSet_ntfbxMclfCD(true);
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
	private boolean isSet_pageSize= false;
	protected final boolean isSet_pageSize(){
		return this.isSet_pageSize;
	}
	private void setIsSet_pageSize(boolean value){
		this.isSet_pageSize= value;
	}
	/**
	 * 페이지사이즈
	 */
	@XmlTransient
	public String getPageSize(){
		return this.pageSize;
	}
	
	/**
	 * 페이지사이즈
	 * 
	 * @param pageSize 페이지사이즈
	 */
	public void setPageSize(String pageSize){
		this.pageSize= pageSize;
		this.setIsSet_pageSize(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfcRfwr= false;
	protected final boolean isSet_ntfcRfwr(){
		return this.isSet_ntfcRfwr;
	}
	private void setIsSet_ntfcRfwr(boolean value){
		this.isSet_ntfcRfwr= value;
	}
	/**
	 * 알림검색어
	 */
	@XmlTransient
	public String getNtfcRfwr(){
		return this.ntfcRfwr;
	}
	
	/**
	 * 알림검색어
	 * 
	 * @param ntfcRfwr 알림검색어
	 */
	public void setNtfcRfwr(String ntfcRfwr){
		this.ntfcRfwr= ntfcRfwr;
		this.setIsSet_ntfcRfwr(true);
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
	 * UMS거래번호
	 */
	@XmlTransient
	public String getUmsTrno(){
		return this.umsTrno;
	}
	
	/**
	 * UMS거래번호
	 * 
	 * @param umsTrno UMS거래번호
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
				
	@Override
	public INBPushListReq_DTO clone(){
		try{
			INBPushListReq_DTO object= (INBPushListReq_DTO)super.clone();
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
		result= prime * result + ((this.umsReqStaDt==null)?0:this.umsReqStaDt.hashCode());
		result= prime * result + ((this.umsReqEndDt==null)?0:this.umsReqEndDt.hashCode());
		result= prime * result + ((this.ntfbxLrclCD==null)?0:this.ntfbxLrclCD.hashCode());
		result= prime * result + ((this.ntfbxMclfCD==null)?0:this.ntfbxMclfCD.hashCode());
		result= prime * result + ((this.favtYn==null)?0:this.favtYn.hashCode());
		result= prime * result + ((this.pageNo==null)?0:this.pageNo.hashCode());
		result= prime * result + ((this.pageSize==null)?0:this.pageSize.hashCode());
		result= prime * result + ((this.ntfcRfwr==null)?0:this.ntfcRfwr.hashCode());
		result= prime * result + ((this.umsTrno==null)?0:this.umsTrno.hashCode());
		result= prime * result + ((this.umsReqDt==null)?0:this.umsReqDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBPushListReq_DTO other= (INBPushListReq_DTO)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _umsReqStaDt= getUmsReqStaDt();
			Object __umsReqStaDt= other.getUmsReqStaDt();
			if ( _umsReqStaDt== null ) { if ( __umsReqStaDt!= null ) return false; }
			else if ( !_umsReqStaDt.equals(__umsReqStaDt) ) return false;
		}
		{
			Object _umsReqEndDt= getUmsReqEndDt();
			Object __umsReqEndDt= other.getUmsReqEndDt();
			if ( _umsReqEndDt== null ) { if ( __umsReqEndDt!= null ) return false; }
			else if ( !_umsReqEndDt.equals(__umsReqEndDt) ) return false;
		}
		{
			Object _ntfbxLrclCD= getNtfbxLrclCD();
			Object __ntfbxLrclCD= other.getNtfbxLrclCD();
			if ( _ntfbxLrclCD== null ) { if ( __ntfbxLrclCD!= null ) return false; }
			else if ( !_ntfbxLrclCD.equals(__ntfbxLrclCD) ) return false;
		}
		{
			Object _ntfbxMclfCD= getNtfbxMclfCD();
			Object __ntfbxMclfCD= other.getNtfbxMclfCD();
			if ( _ntfbxMclfCD== null ) { if ( __ntfbxMclfCD!= null ) return false; }
			else if ( !_ntfbxMclfCD.equals(__ntfbxMclfCD) ) return false;
		}
		{
			Object _favtYn= getFavtYn();
			Object __favtYn= other.getFavtYn();
			if ( _favtYn== null ) { if ( __favtYn!= null ) return false; }
			else if ( !_favtYn.equals(__favtYn) ) return false;
		}
		{
			Object _pageNo= getPageNo();
			Object __pageNo= other.getPageNo();
			if ( _pageNo== null ) { if ( __pageNo!= null ) return false; }
			else if ( !_pageNo.equals(__pageNo) ) return false;
		}
		{
			Object _pageSize= getPageSize();
			Object __pageSize= other.getPageSize();
			if ( _pageSize== null ) { if ( __pageSize!= null ) return false; }
			else if ( !_pageSize.equals(__pageSize) ) return false;
		}
		{
			Object _ntfcRfwr= getNtfcRfwr();
			Object __ntfcRfwr= other.getNtfcRfwr();
			if ( _ntfcRfwr== null ) { if ( __ntfcRfwr!= null ) return false; }
			else if ( !_ntfcRfwr.equals(__ntfcRfwr) ) return false;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBPushListReq_DTO.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tumsReqStaDt: ");
		sb.append(umsReqStaDt==null?"null":getUmsReqStaDt());
		sb.append("\n");
		sb.append("\tumsReqEndDt: ");
		sb.append(umsReqEndDt==null?"null":getUmsReqEndDt());
		sb.append("\n");
		sb.append("\tntfbxLrclCD: ");
		sb.append(ntfbxLrclCD==null?"null":getNtfbxLrclCD());
		sb.append("\n");
		sb.append("\tntfbxMclfCD: ");
		sb.append(ntfbxMclfCD==null?"null":getNtfbxMclfCD());
		sb.append("\n");
		sb.append("\tfavtYn: ");
		sb.append(favtYn==null?"null":getFavtYn());
		sb.append("\n");
		sb.append("\tpageNo: ");
		sb.append(pageNo==null?"null":getPageNo());
		sb.append("\n");
		sb.append("\tpageSize: ");
		sb.append(pageSize==null?"null":getPageSize());
		sb.append("\n");
		sb.append("\tntfcRfwr: ");
		sb.append(ntfcRfwr==null?"null":getNtfcRfwr());
		sb.append("\n");
		sb.append("\tumsTrno: ");
		sb.append(umsTrno==null?"null":getUmsTrno());
		sb.append("\n");
		sb.append("\tumsReqDt: ");
		sb.append(umsReqDt==null?"null":getUmsReqDt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 8; /* umsReqStaDt */
		messageLen+= 8; /* umsReqEndDt */
		messageLen+= 10; /* ntfbxLrclCD */
		messageLen+= 10; /* ntfbxMclfCD */
		messageLen+= 1; /* favtYn */
		messageLen+= 6; /* pageNo */
		messageLen+= 10; /* pageSize */
		messageLen+= 10; /* ntfcRfwr */
		messageLen+= 20; /* umsTrno */
		messageLen+= 8; /* umsReqDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("umsReqStaDt");
		list.add("umsReqEndDt");
		list.add("ntfbxLrclCD");
		list.add("ntfbxMclfCD");
		list.add("favtYn");
		list.add("pageNo");
		list.add("pageSize");
		list.add("ntfcRfwr");
		list.add("umsTrno");
		list.add("umsReqDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("umsReqStaDt", get("umsReqStaDt"));
		map.put("umsReqEndDt", get("umsReqEndDt"));
		map.put("ntfbxLrclCD", get("ntfbxLrclCD"));
		map.put("ntfbxMclfCD", get("ntfbxMclfCD"));
		map.put("favtYn", get("favtYn"));
		map.put("pageNo", get("pageNo"));
		map.put("pageSize", get("pageSize"));
		map.put("ntfcRfwr", get("ntfcRfwr"));
		map.put("umsTrno", get("umsTrno"));
		map.put("umsReqDt", get("umsReqDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case -1793464627:/* umsReqStaDt */
			return getUmsReqStaDt();
		case -1806569784:/* umsReqEndDt */
			return getUmsReqEndDt();
		case -686513050:/* ntfbxLrclCD */
			return getNtfbxLrclCD();
		case -671474361:/* ntfbxMclfCD */
			return getNtfbxMclfCD();
		case -1281582674:/* favtYn */
			return getFavtYn();
		case -995752784:/* pageNo */
			return getPageNo();
		case 859428656:/* pageSize */
			return getPageSize();
		case 1320967090:/* ntfcRfwr */
			return getNtfcRfwr();
		case -306853830:/* umsTrno */
			return getUmsTrno();
		case -924766797:/* umsReqDt */
			return getUmsReqDt();
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
		case -1793464627:/* umsReqStaDt */
			setUmsReqStaDt((String)value);
			break;
		case -1806569784:/* umsReqEndDt */
			setUmsReqEndDt((String)value);
			break;
		case -686513050:/* ntfbxLrclCD */
			setNtfbxLrclCD((String)value);
			break;
		case -671474361:/* ntfbxMclfCD */
			setNtfbxMclfCD((String)value);
			break;
		case -1281582674:/* favtYn */
			setFavtYn((String)value);
			break;
		case -995752784:/* pageNo */
			setPageNo((Integer)value);
			break;
		case 859428656:/* pageSize */
			setPageSize((String)value);
			break;
		case 1320967090:/* ntfcRfwr */
			setNtfcRfwr((String)value);
			break;
		case -306853830:/* umsTrno */
			setUmsTrno((String)value);
			break;
		case -924766797:/* umsReqDt */
			setUmsReqDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
