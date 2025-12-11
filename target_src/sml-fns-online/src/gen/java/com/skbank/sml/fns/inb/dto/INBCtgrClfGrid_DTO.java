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
 * 카테고리분류.공통.IO
 */
@XmlType(propOrder={
	"ntfbxLrclCd", "ntfbxMclfCd", "ntfbxLrclCdNm", "ntfbxMclfCdNm", "lrclMclfCd", "sortSeqNo"
}, name="INBCtgrClfGrid_DTO")
@XmlRootElement(name="INBCtgrClfGrid_DTO")
@BxmCategory(logicalName="카테고리분류.GRID.공통.IO", description="카테고리분류.공통.IO") 
public class INBCtgrClfGrid_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -280106598L;
	
	
	
	/**
	 * 알림함대분류코드
	 */
	@ApiModelProperty(
		name = "ntfbxLrclCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxLrclCd")
	@BxmOmm_Field(length=10, decimal=0, description="알림함대분류코드", align="left", fill="")
	private String ntfbxLrclCd= "";
	
	
	/**
	 * 알림함중분류코드
	 */
	@ApiModelProperty(
		name = "ntfbxMclfCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxMclfCd")
	@BxmOmm_Field(length=10, decimal=0, description="알림함중분류코드", align="left", fill="")
	private String ntfbxMclfCd= "";
	
	
	/**
	 * 알림함대분류코드명
	 */
	@ApiModelProperty(
		name = "ntfbxLrclCdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxLrclCdNm")
	@BxmOmm_Field(length=50, decimal=0, description="알림함대분류코드명", align="left", fill="")
	private String ntfbxLrclCdNm= "";
	
	
	/**
	 * 알림함중분류코드명
	 */
	@ApiModelProperty(
		name = "ntfbxMclfCdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntfbxMclfCdNm")
	@BxmOmm_Field(length=50, decimal=0, description="알림함중분류코드명", align="left", fill="")
	private String ntfbxMclfCdNm= "";
	
	
	/**
	 * 대분류중분류코드
	 */
	@ApiModelProperty(
		name = "lrclMclfCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lrclMclfCd")
	@BxmOmm_Field(length=10, decimal=0, description="대분류중분류코드", align="left", fill="")
	private String lrclMclfCd= "";
	
	
	/**
	 * 정렬순서번호
	 */
	@ApiModelProperty(
		name = "sortSeqNo"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("sortSeqNo")
	@BxmOmm_Field(length=5, decimal=0, description="정렬순서번호", align="right", fill="")
	private Integer sortSeqNo= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxLrclCd= false;
	protected final boolean isSet_ntfbxLrclCd(){
		return this.isSet_ntfbxLrclCd;
	}
	private void setIsSet_ntfbxLrclCd(boolean value){
		this.isSet_ntfbxLrclCd= value;
	}
	/**
	 * 알림함대분류코드
	 */
	@XmlTransient
	public String getNtfbxLrclCd(){
		return this.ntfbxLrclCd;
	}
	
	/**
	 * 알림함대분류코드
	 * 
	 * @param ntfbxLrclCd 알림함대분류코드
	 */
	public void setNtfbxLrclCd(String ntfbxLrclCd){
		this.ntfbxLrclCd= ntfbxLrclCd;
		this.setIsSet_ntfbxLrclCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxMclfCd= false;
	protected final boolean isSet_ntfbxMclfCd(){
		return this.isSet_ntfbxMclfCd;
	}
	private void setIsSet_ntfbxMclfCd(boolean value){
		this.isSet_ntfbxMclfCd= value;
	}
	/**
	 * 알림함중분류코드
	 */
	@XmlTransient
	public String getNtfbxMclfCd(){
		return this.ntfbxMclfCd;
	}
	
	/**
	 * 알림함중분류코드
	 * 
	 * @param ntfbxMclfCd 알림함중분류코드
	 */
	public void setNtfbxMclfCd(String ntfbxMclfCd){
		this.ntfbxMclfCd= ntfbxMclfCd;
		this.setIsSet_ntfbxMclfCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxLrclCdNm= false;
	protected final boolean isSet_ntfbxLrclCdNm(){
		return this.isSet_ntfbxLrclCdNm;
	}
	private void setIsSet_ntfbxLrclCdNm(boolean value){
		this.isSet_ntfbxLrclCdNm= value;
	}
	/**
	 * 알림함대분류코드명
	 */
	@XmlTransient
	public String getNtfbxLrclCdNm(){
		return this.ntfbxLrclCdNm;
	}
	
	/**
	 * 알림함대분류코드명
	 * 
	 * @param ntfbxLrclCdNm 알림함대분류코드명
	 */
	public void setNtfbxLrclCdNm(String ntfbxLrclCdNm){
		this.ntfbxLrclCdNm= ntfbxLrclCdNm;
		this.setIsSet_ntfbxLrclCdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntfbxMclfCdNm= false;
	protected final boolean isSet_ntfbxMclfCdNm(){
		return this.isSet_ntfbxMclfCdNm;
	}
	private void setIsSet_ntfbxMclfCdNm(boolean value){
		this.isSet_ntfbxMclfCdNm= value;
	}
	/**
	 * 알림함중분류코드명
	 */
	@XmlTransient
	public String getNtfbxMclfCdNm(){
		return this.ntfbxMclfCdNm;
	}
	
	/**
	 * 알림함중분류코드명
	 * 
	 * @param ntfbxMclfCdNm 알림함중분류코드명
	 */
	public void setNtfbxMclfCdNm(String ntfbxMclfCdNm){
		this.ntfbxMclfCdNm= ntfbxMclfCdNm;
		this.setIsSet_ntfbxMclfCdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lrclMclfCd= false;
	protected final boolean isSet_lrclMclfCd(){
		return this.isSet_lrclMclfCd;
	}
	private void setIsSet_lrclMclfCd(boolean value){
		this.isSet_lrclMclfCd= value;
	}
	/**
	 * 대분류중분류코드
	 */
	@XmlTransient
	public String getLrclMclfCd(){
		return this.lrclMclfCd;
	}
	
	/**
	 * 대분류중분류코드
	 * 
	 * @param lrclMclfCd 대분류중분류코드
	 */
	public void setLrclMclfCd(String lrclMclfCd){
		this.lrclMclfCd= lrclMclfCd;
		this.setIsSet_lrclMclfCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sortSeqNo= false;
	protected final boolean isSet_sortSeqNo(){
		return this.isSet_sortSeqNo;
	}
	private void setIsSet_sortSeqNo(boolean value){
		this.isSet_sortSeqNo= value;
	}
	/**
	 * 정렬순서번호
	 */
	@XmlTransient
	public Integer getSortSeqNo(){
		return this.sortSeqNo;
	}
	
	/**
	 * 정렬순서번호
	 * 
	 * @param sortSeqNo 정렬순서번호
	 */
	public void setSortSeqNo(Integer sortSeqNo){
		this.sortSeqNo= sortSeqNo;
		this.setIsSet_sortSeqNo(true);
	}
				
	@Override
	public INBCtgrClfGrid_DTO clone(){
		try{
			INBCtgrClfGrid_DTO object= (INBCtgrClfGrid_DTO)super.clone();
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
		
		result= prime * result + ((this.ntfbxLrclCd==null)?0:this.ntfbxLrclCd.hashCode());
		result= prime * result + ((this.ntfbxMclfCd==null)?0:this.ntfbxMclfCd.hashCode());
		result= prime * result + ((this.ntfbxLrclCdNm==null)?0:this.ntfbxLrclCdNm.hashCode());
		result= prime * result + ((this.ntfbxMclfCdNm==null)?0:this.ntfbxMclfCdNm.hashCode());
		result= prime * result + ((this.lrclMclfCd==null)?0:this.lrclMclfCd.hashCode());
		result= prime * result + ((this.sortSeqNo==null)?0:this.sortSeqNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBCtgrClfGrid_DTO other= (INBCtgrClfGrid_DTO)obj;
		{
			Object _ntfbxLrclCd= getNtfbxLrclCd();
			Object __ntfbxLrclCd= other.getNtfbxLrclCd();
			if ( _ntfbxLrclCd== null ) { if ( __ntfbxLrclCd!= null ) return false; }
			else if ( !_ntfbxLrclCd.equals(__ntfbxLrclCd) ) return false;
		}
		{
			Object _ntfbxMclfCd= getNtfbxMclfCd();
			Object __ntfbxMclfCd= other.getNtfbxMclfCd();
			if ( _ntfbxMclfCd== null ) { if ( __ntfbxMclfCd!= null ) return false; }
			else if ( !_ntfbxMclfCd.equals(__ntfbxMclfCd) ) return false;
		}
		{
			Object _ntfbxLrclCdNm= getNtfbxLrclCdNm();
			Object __ntfbxLrclCdNm= other.getNtfbxLrclCdNm();
			if ( _ntfbxLrclCdNm== null ) { if ( __ntfbxLrclCdNm!= null ) return false; }
			else if ( !_ntfbxLrclCdNm.equals(__ntfbxLrclCdNm) ) return false;
		}
		{
			Object _ntfbxMclfCdNm= getNtfbxMclfCdNm();
			Object __ntfbxMclfCdNm= other.getNtfbxMclfCdNm();
			if ( _ntfbxMclfCdNm== null ) { if ( __ntfbxMclfCdNm!= null ) return false; }
			else if ( !_ntfbxMclfCdNm.equals(__ntfbxMclfCdNm) ) return false;
		}
		{
			Object _lrclMclfCd= getLrclMclfCd();
			Object __lrclMclfCd= other.getLrclMclfCd();
			if ( _lrclMclfCd== null ) { if ( __lrclMclfCd!= null ) return false; }
			else if ( !_lrclMclfCd.equals(__lrclMclfCd) ) return false;
		}
		{
			Object _sortSeqNo= getSortSeqNo();
			Object __sortSeqNo= other.getSortSeqNo();
			if ( _sortSeqNo== null ) { if ( __sortSeqNo!= null ) return false; }
			else if ( !_sortSeqNo.equals(__sortSeqNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBCtgrClfGrid_DTO.class.getName()).append(":\n");
		sb.append("\tntfbxLrclCd: ");
		sb.append(ntfbxLrclCd==null?"null":getNtfbxLrclCd());
		sb.append("\n");
		sb.append("\tntfbxMclfCd: ");
		sb.append(ntfbxMclfCd==null?"null":getNtfbxMclfCd());
		sb.append("\n");
		sb.append("\tntfbxLrclCdNm: ");
		sb.append(ntfbxLrclCdNm==null?"null":getNtfbxLrclCdNm());
		sb.append("\n");
		sb.append("\tntfbxMclfCdNm: ");
		sb.append(ntfbxMclfCdNm==null?"null":getNtfbxMclfCdNm());
		sb.append("\n");
		sb.append("\tlrclMclfCd: ");
		sb.append(lrclMclfCd==null?"null":getLrclMclfCd());
		sb.append("\n");
		sb.append("\tsortSeqNo: ");
		sb.append(sortSeqNo==null?"null":getSortSeqNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 10; /* ntfbxLrclCd */
		messageLen+= 10; /* ntfbxMclfCd */
		messageLen+= 50; /* ntfbxLrclCdNm */
		messageLen+= 50; /* ntfbxMclfCdNm */
		messageLen+= 10; /* lrclMclfCd */
		messageLen+= 5; /* sortSeqNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("ntfbxLrclCd");
		list.add("ntfbxMclfCd");
		list.add("ntfbxLrclCdNm");
		list.add("ntfbxMclfCdNm");
		list.add("lrclMclfCd");
		list.add("sortSeqNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("ntfbxLrclCd", get("ntfbxLrclCd"));
		map.put("ntfbxMclfCd", get("ntfbxMclfCd"));
		map.put("ntfbxLrclCdNm", get("ntfbxLrclCdNm"));
		map.put("ntfbxMclfCdNm", get("ntfbxMclfCdNm"));
		map.put("lrclMclfCd", get("lrclMclfCd"));
		map.put("sortSeqNo", get("sortSeqNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -686513018:/* ntfbxLrclCd */
			return getNtfbxLrclCd();
		case -671474329:/* ntfbxMclfCd */
			return getNtfbxMclfCd();
		case 1685955813:/* ntfbxLrclCdNm */
			return getNtfbxLrclCdNm();
		case -1041733242:/* ntfbxMclfCdNm */
			return getNtfbxMclfCdNm();
		case 464871264:/* lrclMclfCd */
			return getLrclMclfCd();
		case -23455870:/* sortSeqNo */
			return getSortSeqNo();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -686513018:/* ntfbxLrclCd */
			setNtfbxLrclCd((String)value);
			break;
		case -671474329:/* ntfbxMclfCd */
			setNtfbxMclfCd((String)value);
			break;
		case 1685955813:/* ntfbxLrclCdNm */
			setNtfbxLrclCdNm((String)value);
			break;
		case -1041733242:/* ntfbxMclfCdNm */
			setNtfbxMclfCdNm((String)value);
			break;
		case 464871264:/* lrclMclfCd */
			setLrclMclfCd((String)value);
			break;
		case -23455870:/* sortSeqNo */
			setSortSeqNo((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
