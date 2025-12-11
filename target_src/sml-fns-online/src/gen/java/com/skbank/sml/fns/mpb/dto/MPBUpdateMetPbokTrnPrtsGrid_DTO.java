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
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
	"trnDt", "trnSrno", "rcvMbhNm", "metTrnMemoTxt", "metMbpfXmpAm"
}, name="MPBUpdateMetPbokTrnPrtsGrid_DTO")
@XmlRootElement(name="MPBUpdateMetPbokTrnPrtsGrid_DTO")
@BxmCategory(logicalName="모임통장.거래내역.수정.공통.Grid", description="") 
public class MPBUpdateMetPbokTrnPrtsGrid_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -469217209L;
	
	
	
	/**
	 * 거래일자
	 */
	@ApiModelProperty(
		name = "trnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDt")
	@BxmOmm_Field(length=8, decimal=0, description="거래일자", align="left", fill="")
	private String trnDt= "";
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="거래일련번호", align="right", fill="0")
	private Integer trnSrno= 0;
	
	
	/**
	 * 입금회원명
	 */
	@ApiModelProperty(
		name = "rcvMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvMbhNm")
	@BxmOmm_Field(length=60, decimal=0, description="입금회원명", align="left", fill="")
	private String rcvMbhNm= "";
	
	
	/**
	 * 모임거래메모내용
	 */
	@ApiModelProperty(
		name = "metTrnMemoTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metTrnMemoTxt")
	@BxmOmm_Field(length=40, decimal=0, description="모임거래메모내용", align="left", fill="")
	private String metTrnMemoTxt= "";
	
	
	/**
	 * 모임회비면제금액
	 */
	@ApiModelProperty(
		name = "metMbpfXmpAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("metMbpfXmpAm")
	@BxmOmm_Field(length=19, decimal=3, description="모임회비면제금액", align="right", fill="0")
	private BigDecimal metMbpfXmpAm= new BigDecimal("0");
	
	
	
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
	public String getTrnDt(){
		return this.trnDt;
	}
	
	/**
	 * 거래일자
	 * 
	 * @param trnDt 거래일자
	 */
	public void setTrnDt(String trnDt){
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
	public Integer getTrnSrno(){
		return this.trnSrno;
	}
	
	/**
	 * 거래일련번호
	 * 
	 * @param trnSrno 거래일련번호
	 */
	public void setTrnSrno(Integer trnSrno){
		this.trnSrno= trnSrno;
		this.setIsSet_trnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvMbhNm= false;
	protected final boolean isSet_rcvMbhNm(){
		return this.isSet_rcvMbhNm;
	}
	private void setIsSet_rcvMbhNm(boolean value){
		this.isSet_rcvMbhNm= value;
	}
	/**
	 * 입금회원명
	 */
	@XmlTransient
	public String getRcvMbhNm(){
		return this.rcvMbhNm;
	}
	
	/**
	 * 입금회원명
	 * 
	 * @param rcvMbhNm 입금회원명
	 */
	public void setRcvMbhNm(String rcvMbhNm){
		this.rcvMbhNm= rcvMbhNm;
		this.setIsSet_rcvMbhNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metTrnMemoTxt= false;
	protected final boolean isSet_metTrnMemoTxt(){
		return this.isSet_metTrnMemoTxt;
	}
	private void setIsSet_metTrnMemoTxt(boolean value){
		this.isSet_metTrnMemoTxt= value;
	}
	/**
	 * 모임거래메모내용
	 */
	@XmlTransient
	public String getMetTrnMemoTxt(){
		return this.metTrnMemoTxt;
	}
	
	/**
	 * 모임거래메모내용
	 * 
	 * @param metTrnMemoTxt 모임거래메모내용
	 */
	public void setMetTrnMemoTxt(String metTrnMemoTxt){
		this.metTrnMemoTxt= metTrnMemoTxt;
		this.setIsSet_metTrnMemoTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbpfXmpAm= false;
	protected final boolean isSet_metMbpfXmpAm(){
		return this.isSet_metMbpfXmpAm;
	}
	private void setIsSet_metMbpfXmpAm(boolean value){
		this.isSet_metMbpfXmpAm= value;
	}
	/**
	 * 모임회비면제금액
	 * BigDecimal - Double value setter
	 *
	 * @Param metMbpfXmpAm 모임회비면제금액
	 */
	public void setMetMbpfXmpAm(double metMbpfXmpAm) {
		setMetMbpfXmpAm(BigDecimal.valueOf(metMbpfXmpAm));
	}
	/**
	 * 모임회비면제금액
	 * BigDecimal - Long value setter
	 *
	 * @Param metMbpfXmpAm 모임회비면제금액
	 */
	public void setMetMbpfXmpAm(long metMbpfXmpAm) {
		setMetMbpfXmpAm(BigDecimal.valueOf(metMbpfXmpAm));
	}
	/**
	 * 모임회비면제금액
	 * BigDecimal - String value setter
	 *
	 * @Param metMbpfXmpAm 모임회비면제금액
	 */
	public void setMetMbpfXmpAm(String metMbpfXmpAm) {
		setMetMbpfXmpAm(new BigDecimal(metMbpfXmpAm));
	}
	/**
	 * 모임회비면제금액
	 */
	@XmlTransient
	public BigDecimal getMetMbpfXmpAm(){
		return this.metMbpfXmpAm;
	}
	
	/**
	 * 모임회비면제금액
	 * 
	 * @param metMbpfXmpAm 모임회비면제금액
	 */
	@JsonSetter("metMbpfXmpAm")
	public void setMetMbpfXmpAm(BigDecimal metMbpfXmpAm){
		this.metMbpfXmpAm= metMbpfXmpAm;
		this.setIsSet_metMbpfXmpAm(true);
	}
				
	@Override
	public MPBUpdateMetPbokTrnPrtsGrid_DTO clone(){
		try{
			MPBUpdateMetPbokTrnPrtsGrid_DTO object= (MPBUpdateMetPbokTrnPrtsGrid_DTO)super.clone();
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
		
		result= prime * result + ((this.trnDt==null)?0:this.trnDt.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.rcvMbhNm==null)?0:this.rcvMbhNm.hashCode());
		result= prime * result + ((this.metTrnMemoTxt==null)?0:this.metTrnMemoTxt.hashCode());
		result= prime * result + ((this.metMbpfXmpAm==null)?0:this.metMbpfXmpAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBUpdateMetPbokTrnPrtsGrid_DTO other= (MPBUpdateMetPbokTrnPrtsGrid_DTO)obj;
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
			Object _rcvMbhNm= getRcvMbhNm();
			Object __rcvMbhNm= other.getRcvMbhNm();
			if ( _rcvMbhNm== null ) { if ( __rcvMbhNm!= null ) return false; }
			else if ( !_rcvMbhNm.equals(__rcvMbhNm) ) return false;
		}
		{
			Object _metTrnMemoTxt= getMetTrnMemoTxt();
			Object __metTrnMemoTxt= other.getMetTrnMemoTxt();
			if ( _metTrnMemoTxt== null ) { if ( __metTrnMemoTxt!= null ) return false; }
			else if ( !_metTrnMemoTxt.equals(__metTrnMemoTxt) ) return false;
		}
		{
			Object _metMbpfXmpAm= getMetMbpfXmpAm();
			Object __metMbpfXmpAm= other.getMetMbpfXmpAm();
			if ( _metMbpfXmpAm== null ) { if ( __metMbpfXmpAm!= null ) return false; }
			else if ( !_metMbpfXmpAm.equals(__metMbpfXmpAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBUpdateMetPbokTrnPrtsGrid_DTO.class.getName()).append(":\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\trcvMbhNm: ");
		sb.append(rcvMbhNm==null?"null":getRcvMbhNm());
		sb.append("\n");
		sb.append("\tmetTrnMemoTxt: ");
		sb.append(metTrnMemoTxt==null?"null":getMetTrnMemoTxt());
		sb.append("\n");
		sb.append("\tmetMbpfXmpAm: ");
		sb.append(metMbpfXmpAm==null?"null":getMetMbpfXmpAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* trnDt */
		messageLen+= 8; /* trnSrno */
		messageLen+= 60; /* rcvMbhNm */
		messageLen+= 40; /* metTrnMemoTxt */
		messageLen+= 19; /* metMbpfXmpAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnDt");
		list.add("trnSrno");
		list.add("rcvMbhNm");
		list.add("metTrnMemoTxt");
		list.add("metMbpfXmpAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDt", get("trnDt"));
		map.put("trnSrno", get("trnSrno"));
		map.put("rcvMbhNm", get("rcvMbhNm"));
		map.put("metTrnMemoTxt", get("metTrnMemoTxt"));
		map.put("metMbpfXmpAm", get("metMbpfXmpAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 110632544:/* trnDt */
			return getTrnDt();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case -2062160595:/* rcvMbhNm */
			return getRcvMbhNm();
		case 2074206722:/* metTrnMemoTxt */
			return getMetTrnMemoTxt();
		case -356430944:/* metMbpfXmpAm */
			return getMetMbpfXmpAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 110632544:/* trnDt */
			setTrnDt((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((Integer)value);
			break;
		case -2062160595:/* rcvMbhNm */
			setRcvMbhNm((String)value);
			break;
		case 2074206722:/* metTrnMemoTxt */
			setMetTrnMemoTxt((String)value);
			break;
		case -356430944:/* metMbpfXmpAm */
			if ( value instanceof String ){
				setMetMbpfXmpAm((String)value);
			}
			else if ( value instanceof Double ){
				setMetMbpfXmpAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMetMbpfXmpAm((Long)value);
			}
			else{
				setMetMbpfXmpAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
