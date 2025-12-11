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
 * SMS입출금.거래내용.통지.GRID2.DBM.출력.IO
 * 
 */
@XmlType(propOrder={
	"hpComCd", "hpTlen", "hpSerNo", "ntcTgtTrnDscd", "prcSrno", "rgsSrno"
}, name="INBSmsRawTrnTxtNtcGrid2_DTO")
@XmlRootElement(name="INBSmsRawTrnTxtNtcGrid2_DTO")
@BxmCategory(logicalName="SMS입출금.거래내용.통지.GRID2.공통.IO", description="SMS입출금.거래내용.통지.GRID2.DBM.출력.IO\r\n") 
public class INBSmsRawTrnTxtNtcGrid2_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -29751925L;
	
	
	
	/**
	 * 핸드폰회사코드
	 */
	@ApiModelProperty(
		name = "hpComCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpComCd")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰회사코드", align="left", fill="")
	private String hpComCd= "";
	
	
	/**
	 * 핸드폰국번
	 */
	@ApiModelProperty(
		name = "hpTlen"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpTlen")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰국번", align="left", fill="")
	private String hpTlen= "";
	
	
	/**
	 * 핸드폰일련번호
	 */
	@ApiModelProperty(
		name = "hpSerNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpSerNo")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰일련번호", align="left", fill="")
	private String hpSerNo= "";
	
	
	/**
	 * 통지대상거래구분코드
	 */
	@ApiModelProperty(
		name = "ntcTgtTrnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ntcTgtTrnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="통지대상거래구분코드", align="left", fill="")
	private String ntcTgtTrnDscd= "";
	
	
	/**
	 * 처리일련번호
	 */
	@ApiModelProperty(
		name = "prcSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("prcSrno")
	@BxmOmm_Field(length=9, decimal=0, description="처리일련번호", align="right", fill="")
	private Integer prcSrno= 0;
	
	
	/**
	 * 등록일련번호
	 */
	@ApiModelProperty(
		name = "rgsSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("rgsSrno")
	@BxmOmm_Field(length=5, decimal=0, description="등록일련번호", align="right", fill="")
	private Integer rgsSrno= 0;
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpComCd= false;
	protected final boolean isSet_hpComCd(){
		return this.isSet_hpComCd;
	}
	private void setIsSet_hpComCd(boolean value){
		this.isSet_hpComCd= value;
	}
	/**
	 * 핸드폰회사코드
	 */
	@XmlTransient
	public String getHpComCd(){
		return this.hpComCd;
	}
	
	/**
	 * 핸드폰회사코드
	 * 
	 * @param hpComCd 핸드폰회사코드
	 */
	public void setHpComCd(String hpComCd){
		this.hpComCd= hpComCd;
		this.setIsSet_hpComCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpTlen= false;
	protected final boolean isSet_hpTlen(){
		return this.isSet_hpTlen;
	}
	private void setIsSet_hpTlen(boolean value){
		this.isSet_hpTlen= value;
	}
	/**
	 * 핸드폰국번
	 */
	@XmlTransient
	public String getHpTlen(){
		return this.hpTlen;
	}
	
	/**
	 * 핸드폰국번
	 * 
	 * @param hpTlen 핸드폰국번
	 */
	public void setHpTlen(String hpTlen){
		this.hpTlen= hpTlen;
		this.setIsSet_hpTlen(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpSerNo= false;
	protected final boolean isSet_hpSerNo(){
		return this.isSet_hpSerNo;
	}
	private void setIsSet_hpSerNo(boolean value){
		this.isSet_hpSerNo= value;
	}
	/**
	 * 핸드폰일련번호
	 */
	@XmlTransient
	public String getHpSerNo(){
		return this.hpSerNo;
	}
	
	/**
	 * 핸드폰일련번호
	 * 
	 * @param hpSerNo 핸드폰일련번호
	 */
	public void setHpSerNo(String hpSerNo){
		this.hpSerNo= hpSerNo;
		this.setIsSet_hpSerNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ntcTgtTrnDscd= false;
	protected final boolean isSet_ntcTgtTrnDscd(){
		return this.isSet_ntcTgtTrnDscd;
	}
	private void setIsSet_ntcTgtTrnDscd(boolean value){
		this.isSet_ntcTgtTrnDscd= value;
	}
	/**
	 * 통지대상거래구분코드
	 */
	@XmlTransient
	public String getNtcTgtTrnDscd(){
		return this.ntcTgtTrnDscd;
	}
	
	/**
	 * 통지대상거래구분코드
	 * 
	 * @param ntcTgtTrnDscd 통지대상거래구분코드
	 */
	public void setNtcTgtTrnDscd(String ntcTgtTrnDscd){
		this.ntcTgtTrnDscd= ntcTgtTrnDscd;
		this.setIsSet_ntcTgtTrnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prcSrno= false;
	protected final boolean isSet_prcSrno(){
		return this.isSet_prcSrno;
	}
	private void setIsSet_prcSrno(boolean value){
		this.isSet_prcSrno= value;
	}
	/**
	 * 처리일련번호
	 */
	@XmlTransient
	public Integer getPrcSrno(){
		return this.prcSrno;
	}
	
	/**
	 * 처리일련번호
	 * 
	 * @param prcSrno 처리일련번호
	 */
	public void setPrcSrno(Integer prcSrno){
		this.prcSrno= prcSrno;
		this.setIsSet_prcSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsSrno= false;
	protected final boolean isSet_rgsSrno(){
		return this.isSet_rgsSrno;
	}
	private void setIsSet_rgsSrno(boolean value){
		this.isSet_rgsSrno= value;
	}
	/**
	 * 등록일련번호
	 */
	@XmlTransient
	public Integer getRgsSrno(){
		return this.rgsSrno;
	}
	
	/**
	 * 등록일련번호
	 * 
	 * @param rgsSrno 등록일련번호
	 */
	public void setRgsSrno(Integer rgsSrno){
		this.rgsSrno= rgsSrno;
		this.setIsSet_rgsSrno(true);
	}
				
	@Override
	public INBSmsRawTrnTxtNtcGrid2_DTO clone(){
		try{
			INBSmsRawTrnTxtNtcGrid2_DTO object= (INBSmsRawTrnTxtNtcGrid2_DTO)super.clone();
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
		
		result= prime * result + ((this.hpComCd==null)?0:this.hpComCd.hashCode());
		result= prime * result + ((this.hpTlen==null)?0:this.hpTlen.hashCode());
		result= prime * result + ((this.hpSerNo==null)?0:this.hpSerNo.hashCode());
		result= prime * result + ((this.ntcTgtTrnDscd==null)?0:this.ntcTgtTrnDscd.hashCode());
		result= prime * result + ((this.prcSrno==null)?0:this.prcSrno.hashCode());
		result= prime * result + ((this.rgsSrno==null)?0:this.rgsSrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawTrnTxtNtcGrid2_DTO other= (INBSmsRawTrnTxtNtcGrid2_DTO)obj;
		{
			Object _hpComCd= getHpComCd();
			Object __hpComCd= other.getHpComCd();
			if ( _hpComCd== null ) { if ( __hpComCd!= null ) return false; }
			else if ( !_hpComCd.equals(__hpComCd) ) return false;
		}
		{
			Object _hpTlen= getHpTlen();
			Object __hpTlen= other.getHpTlen();
			if ( _hpTlen== null ) { if ( __hpTlen!= null ) return false; }
			else if ( !_hpTlen.equals(__hpTlen) ) return false;
		}
		{
			Object _hpSerNo= getHpSerNo();
			Object __hpSerNo= other.getHpSerNo();
			if ( _hpSerNo== null ) { if ( __hpSerNo!= null ) return false; }
			else if ( !_hpSerNo.equals(__hpSerNo) ) return false;
		}
		{
			Object _ntcTgtTrnDscd= getNtcTgtTrnDscd();
			Object __ntcTgtTrnDscd= other.getNtcTgtTrnDscd();
			if ( _ntcTgtTrnDscd== null ) { if ( __ntcTgtTrnDscd!= null ) return false; }
			else if ( !_ntcTgtTrnDscd.equals(__ntcTgtTrnDscd) ) return false;
		}
		{
			Object _prcSrno= getPrcSrno();
			Object __prcSrno= other.getPrcSrno();
			if ( _prcSrno== null ) { if ( __prcSrno!= null ) return false; }
			else if ( !_prcSrno.equals(__prcSrno) ) return false;
		}
		{
			Object _rgsSrno= getRgsSrno();
			Object __rgsSrno= other.getRgsSrno();
			if ( _rgsSrno== null ) { if ( __rgsSrno!= null ) return false; }
			else if ( !_rgsSrno.equals(__rgsSrno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawTrnTxtNtcGrid2_DTO.class.getName()).append(":\n");
		sb.append("\thpComCd: ");
		sb.append(hpComCd==null?"null":getHpComCd());
		sb.append("\n");
		sb.append("\thpTlen: ");
		sb.append(hpTlen==null?"null":getHpTlen());
		sb.append("\n");
		sb.append("\thpSerNo: ");
		sb.append(hpSerNo==null?"null":getHpSerNo());
		sb.append("\n");
		sb.append("\tntcTgtTrnDscd: ");
		sb.append(ntcTgtTrnDscd==null?"null":getNtcTgtTrnDscd());
		sb.append("\n");
		sb.append("\tprcSrno: ");
		sb.append(prcSrno==null?"null":getPrcSrno());
		sb.append("\n");
		sb.append("\trgsSrno: ");
		sb.append(rgsSrno==null?"null":getRgsSrno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 4; /* hpComCd */
		messageLen+= 4; /* hpTlen */
		messageLen+= 4; /* hpSerNo */
		messageLen+= 1; /* ntcTgtTrnDscd */
		messageLen+= 9; /* prcSrno */
		messageLen+= 5; /* rgsSrno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("hpComCd");
		list.add("hpTlen");
		list.add("hpSerNo");
		list.add("ntcTgtTrnDscd");
		list.add("prcSrno");
		list.add("rgsSrno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("hpComCd", get("hpComCd"));
		map.put("hpTlen", get("hpTlen"));
		map.put("hpSerNo", get("hpSerNo"));
		map.put("ntcTgtTrnDscd", get("ntcTgtTrnDscd"));
		map.put("prcSrno", get("prcSrno"));
		map.put("rgsSrno", get("rgsSrno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1082856858:/* hpComCd */
			return getHpComCd();
		case -1211491767:/* hpTlen */
			return getHpTlen();
		case 1097340441:/* hpSerNo */
			return getHpSerNo();
		case -1825988964:/* ntcTgtTrnDscd */
			return getNtcTgtTrnDscd();
		case -321065311:/* prcSrno */
			return getPrcSrno();
		case 1153797726:/* rgsSrno */
			return getRgsSrno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1082856858:/* hpComCd */
			setHpComCd((String)value);
			break;
		case -1211491767:/* hpTlen */
			setHpTlen((String)value);
			break;
		case 1097340441:/* hpSerNo */
			setHpSerNo((String)value);
			break;
		case -1825988964:/* ntcTgtTrnDscd */
			setNtcTgtTrnDscd((String)value);
			break;
		case -321065311:/* prcSrno */
			setPrcSrno((Integer)value);
			break;
		case 1153797726:/* rgsSrno */
			setRgsSrno((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
