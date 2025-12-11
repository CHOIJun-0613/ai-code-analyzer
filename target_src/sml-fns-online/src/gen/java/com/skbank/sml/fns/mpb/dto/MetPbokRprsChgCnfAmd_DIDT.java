/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.dto;

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
	"metMngNo", "trnDt", "trnSrno", "metChgDscd", "chgAgrYn", "rppeNm", "metMbhSrno", "chgDt"
}, name="MetPbokRprsChgCnfAmd_DIDT")
@XmlRootElement(name="MetPbokRprsChgCnfAmd_DIDT")
@BxmCategory(logicalName="모임통장.대표.변경.확인.수정.DBM.입력.IO", description="") 
public class MetPbokRprsChgCnfAmd_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 625726352L;
	
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=1, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 거래일자
	 */
	@ApiModelProperty(
		name = "trnDt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래일자", align="right", fill="")
	private Integer trnDt= 0;
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=4, decimal=0, description="거래일련번호", align="left", fill="")
	private String trnSrno= "";
	
	
	/**
	 * 모임변경구분코드
	 */
	@ApiModelProperty(
		name = "metChgDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metChgDscd")
	@BxmOmm_Field(length=2, decimal=0, description="모임변경구분코드", align="left", fill="")
	private String metChgDscd= "";
	
	
	/**
	 * 변경동의여부
	 */
	@ApiModelProperty(
		name = "chgAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chgAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="변경동의여부", align="left", fill="")
	private String chgAgrYn= "";
	
	
	/**
	 * 대표자명
	 */
	@ApiModelProperty(
		name = "rppeNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rppeNm")
	@BxmOmm_Field(length=30, decimal=0, description="대표자명", align="left", fill="")
	private String rppeNm= "";
	
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=30, decimal=0, description="모임회원일련번호", align="left", fill="")
	private String metMbhSrno= "";
	
	
	/**
	 * 변경일자
	 */
	@ApiModelProperty(
		name = "chgDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("chgDt")
	@BxmOmm_Field(length=8, decimal=0, description="변경일자", align="left", fill="")
	private String chgDt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMngNo= false;
	protected final boolean isSet_metMngNo(){
		return this.isSet_metMngNo;
	}
	private void setIsSet_metMngNo(boolean value){
		this.isSet_metMngNo= value;
	}
	/**
	 * 모임관리번호
	 */
	@XmlTransient
	public String getMetMngNo(){
		return this.metMngNo;
	}
	
	/**
	 * 모임관리번호
	 * 
	 * @param metMngNo 모임관리번호
	 */
	public void setMetMngNo(String metMngNo){
		this.metMngNo= metMngNo;
		this.setIsSet_metMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDt= false;
	protected final boolean isSet_trnDt(){
		return this.isSet_trnDt;
	}
	private void setIsSet_trnDt(boolean value){
		this.isSet_trnDt= value;
	}
	/**
	 * 거래일자
	 */
	@XmlTransient
	public Integer getTrnDt(){
		return this.trnDt;
	}
	
	/**
	 * 거래일자
	 * 
	 * @param trnDt 거래일자
	 */
	public void setTrnDt(Integer trnDt){
		this.trnDt= trnDt;
		this.setIsSet_trnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnSrno= false;
	protected final boolean isSet_trnSrno(){
		return this.isSet_trnSrno;
	}
	private void setIsSet_trnSrno(boolean value){
		this.isSet_trnSrno= value;
	}
	/**
	 * 거래일련번호
	 */
	@XmlTransient
	public String getTrnSrno(){
		return this.trnSrno;
	}
	
	/**
	 * 거래일련번호
	 * 
	 * @param trnSrno 거래일련번호
	 */
	public void setTrnSrno(String trnSrno){
		this.trnSrno= trnSrno;
		this.setIsSet_trnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metChgDscd= false;
	protected final boolean isSet_metChgDscd(){
		return this.isSet_metChgDscd;
	}
	private void setIsSet_metChgDscd(boolean value){
		this.isSet_metChgDscd= value;
	}
	/**
	 * 모임변경구분코드
	 */
	@XmlTransient
	public String getMetChgDscd(){
		return this.metChgDscd;
	}
	
	/**
	 * 모임변경구분코드
	 * 
	 * @param metChgDscd 모임변경구분코드
	 */
	public void setMetChgDscd(String metChgDscd){
		this.metChgDscd= metChgDscd;
		this.setIsSet_metChgDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chgAgrYn= false;
	protected final boolean isSet_chgAgrYn(){
		return this.isSet_chgAgrYn;
	}
	private void setIsSet_chgAgrYn(boolean value){
		this.isSet_chgAgrYn= value;
	}
	/**
	 * 변경동의여부
	 */
	@XmlTransient
	public String getChgAgrYn(){
		return this.chgAgrYn;
	}
	
	/**
	 * 변경동의여부
	 * 
	 * @param chgAgrYn 변경동의여부
	 */
	public void setChgAgrYn(String chgAgrYn){
		this.chgAgrYn= chgAgrYn;
		this.setIsSet_chgAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rppeNm= false;
	protected final boolean isSet_rppeNm(){
		return this.isSet_rppeNm;
	}
	private void setIsSet_rppeNm(boolean value){
		this.isSet_rppeNm= value;
	}
	/**
	 * 대표자명
	 */
	@XmlTransient
	public String getRppeNm(){
		return this.rppeNm;
	}
	
	/**
	 * 대표자명
	 * 
	 * @param rppeNm 대표자명
	 */
	public void setRppeNm(String rppeNm){
		this.rppeNm= rppeNm;
		this.setIsSet_rppeNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhSrno= false;
	protected final boolean isSet_metMbhSrno(){
		return this.isSet_metMbhSrno;
	}
	private void setIsSet_metMbhSrno(boolean value){
		this.isSet_metMbhSrno= value;
	}
	/**
	 * 모임회원일련번호
	 */
	@XmlTransient
	public String getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(String metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_chgDt= false;
	protected final boolean isSet_chgDt(){
		return this.isSet_chgDt;
	}
	private void setIsSet_chgDt(boolean value){
		this.isSet_chgDt= value;
	}
	/**
	 * 변경일자
	 */
	@XmlTransient
	public String getChgDt(){
		return this.chgDt;
	}
	
	/**
	 * 변경일자
	 * 
	 * @param chgDt 변경일자
	 */
	public void setChgDt(String chgDt){
		this.chgDt= chgDt;
		this.setIsSet_chgDt(true);
	}
				
	@Override
	public MetPbokRprsChgCnfAmd_DIDT clone(){
		try{
			MetPbokRprsChgCnfAmd_DIDT object= (MetPbokRprsChgCnfAmd_DIDT)super.clone();
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
		
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.metChgDscd==null)?0:this.metChgDscd.hashCode());
		result= prime * result + ((this.chgAgrYn==null)?0:this.chgAgrYn.hashCode());
		result= prime * result + ((this.rppeNm==null)?0:this.rppeNm.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.chgDt==null)?0:this.chgDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokRprsChgCnfAmd_DIDT other= (MetPbokRprsChgCnfAmd_DIDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _trnDt= getTrnDt();
			Object __trnDt= other.getTrnDt();
			if ( _trnDt== null ) { if ( __trnDt!= null ) return false; }
			else if ( !_trnDt.equals(__trnDt) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _metChgDscd= getMetChgDscd();
			Object __metChgDscd= other.getMetChgDscd();
			if ( _metChgDscd== null ) { if ( __metChgDscd!= null ) return false; }
			else if ( !_metChgDscd.equals(__metChgDscd) ) return false;
		}
		{
			Object _chgAgrYn= getChgAgrYn();
			Object __chgAgrYn= other.getChgAgrYn();
			if ( _chgAgrYn== null ) { if ( __chgAgrYn!= null ) return false; }
			else if ( !_chgAgrYn.equals(__chgAgrYn) ) return false;
		}
		{
			Object _rppeNm= getRppeNm();
			Object __rppeNm= other.getRppeNm();
			if ( _rppeNm== null ) { if ( __rppeNm!= null ) return false; }
			else if ( !_rppeNm.equals(__rppeNm) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _chgDt= getChgDt();
			Object __chgDt= other.getChgDt();
			if ( _chgDt== null ) { if ( __chgDt!= null ) return false; }
			else if ( !_chgDt.equals(__chgDt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokRprsChgCnfAmd_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tmetChgDscd: ");
		sb.append(metChgDscd==null?"null":getMetChgDscd());
		sb.append("\n");
		sb.append("\tchgAgrYn: ");
		sb.append(chgAgrYn==null?"null":getChgAgrYn());
		sb.append("\n");
		sb.append("\trppeNm: ");
		sb.append(rppeNm==null?"null":getRppeNm());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\tchgDt: ");
		sb.append(chgDt==null?"null":getChgDt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		messageLen+= 8; /* trnDt */
		messageLen+= 4; /* trnSrno */
		messageLen+= 2; /* metChgDscd */
		messageLen+= 1; /* chgAgrYn */
		messageLen+= 30; /* rppeNm */
		messageLen+= 30; /* metMbhSrno */
		messageLen+= 8; /* chgDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("trnDt");
		list.add("trnSrno");
		list.add("metChgDscd");
		list.add("chgAgrYn");
		list.add("rppeNm");
		list.add("metMbhSrno");
		list.add("chgDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("trnDt", get("trnDt"));
		map.put("trnSrno", get("trnSrno"));
		map.put("metChgDscd", get("metChgDscd"));
		map.put("chgAgrYn", get("chgAgrYn"));
		map.put("rppeNm", get("rppeNm"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("chgDt", get("chgDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 110632544:/* trnDt */
			return getTrnDt();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case 601024374:/* metChgDscd */
			return getMetChgDscd();
		case 1562645951:/* chgAgrYn */
			return getChgAgrYn();
		case -924373550:/* rppeNm */
			return getRppeNm();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case 94628050:/* chgDt */
			return getChgDt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 110632544:/* trnDt */
			setTrnDt((Integer)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((String)value);
			break;
		case 601024374:/* metChgDscd */
			setMetChgDscd((String)value);
			break;
		case 1562645951:/* chgAgrYn */
			setChgAgrYn((String)value);
			break;
		case -924373550:/* rppeNm */
			setRppeNm((String)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((String)value);
			break;
		case 94628050:/* chgDt */
			setChgDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
