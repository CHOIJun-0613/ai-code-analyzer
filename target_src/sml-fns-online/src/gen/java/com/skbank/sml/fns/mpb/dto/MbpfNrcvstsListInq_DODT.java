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
	"trnDt", "metTrnSrno", "nrcvAm", "nrcvMbhNm"
}, name="MbpfNrcvstsListInq_DODT")
@XmlRootElement(name="MbpfNrcvstsListInq_DODT")
@BxmCategory(logicalName="회비.미입금현황.목록.조회.DBM.출력.IO", description="") 
public class MbpfNrcvstsListInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 302449742L;
	
	
	
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
	 * 모임거래일련번호
	 */
	@ApiModelProperty(
		name = "metTrnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metTrnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="모임거래일련번호", align="right", fill="")
	private Integer metTrnSrno= 0;
	
	
	/**
	 * 미입금금액
	 */
	@ApiModelProperty(
		name = "nrcvAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("nrcvAm")
	@BxmOmm_Field(length=18, decimal=0, description="미입금금액", align="right", fill="")
	private BigDecimal nrcvAm= new BigDecimal("0");
	
	
	/**
	 * 미입금회원명
	 */
	@ApiModelProperty(
		name = "nrcvMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nrcvMbhNm")
	@BxmOmm_Field(length=60, decimal=0, description="미입금회원명", align="left", fill="")
	private String nrcvMbhNm= "";
	
	
	
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
	private boolean isSet_metTrnSrno= false;
	protected final boolean isSet_metTrnSrno(){
		return this.isSet_metTrnSrno;
	}
	private void setIsSet_metTrnSrno(boolean value){
		this.isSet_metTrnSrno= value;
	}
	/**
	 * 모임거래일련번호
	 */
	@XmlTransient
	public Integer getMetTrnSrno(){
		return this.metTrnSrno;
	}
	
	/**
	 * 모임거래일련번호
	 * 
	 * @param metTrnSrno 모임거래일련번호
	 */
	public void setMetTrnSrno(Integer metTrnSrno){
		this.metTrnSrno= metTrnSrno;
		this.setIsSet_metTrnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nrcvAm= false;
	protected final boolean isSet_nrcvAm(){
		return this.isSet_nrcvAm;
	}
	private void setIsSet_nrcvAm(boolean value){
		this.isSet_nrcvAm= value;
	}
	/**
	 * 미입금금액
	 * BigDecimal - Double value setter
	 *
	 * @Param nrcvAm 미입금금액
	 */
	public void setNrcvAm(double nrcvAm) {
		setNrcvAm(BigDecimal.valueOf(nrcvAm));
	}
	/**
	 * 미입금금액
	 * BigDecimal - Long value setter
	 *
	 * @Param nrcvAm 미입금금액
	 */
	public void setNrcvAm(long nrcvAm) {
		setNrcvAm(BigDecimal.valueOf(nrcvAm));
	}
	/**
	 * 미입금금액
	 * BigDecimal - String value setter
	 *
	 * @Param nrcvAm 미입금금액
	 */
	public void setNrcvAm(String nrcvAm) {
		setNrcvAm(new BigDecimal(nrcvAm));
	}
	/**
	 * 미입금금액
	 */
	@XmlTransient
	public BigDecimal getNrcvAm(){
		return this.nrcvAm;
	}
	
	/**
	 * 미입금금액
	 * 
	 * @param nrcvAm 미입금금액
	 */
	@JsonSetter("nrcvAm")
	public void setNrcvAm(BigDecimal nrcvAm){
		this.nrcvAm= nrcvAm;
		this.setIsSet_nrcvAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nrcvMbhNm= false;
	protected final boolean isSet_nrcvMbhNm(){
		return this.isSet_nrcvMbhNm;
	}
	private void setIsSet_nrcvMbhNm(boolean value){
		this.isSet_nrcvMbhNm= value;
	}
	/**
	 * 미입금회원명
	 */
	@XmlTransient
	public String getNrcvMbhNm(){
		return this.nrcvMbhNm;
	}
	
	/**
	 * 미입금회원명
	 * 
	 * @param nrcvMbhNm 미입금회원명
	 */
	public void setNrcvMbhNm(String nrcvMbhNm){
		this.nrcvMbhNm= nrcvMbhNm;
		this.setIsSet_nrcvMbhNm(true);
	}
				
	@Override
	public MbpfNrcvstsListInq_DODT clone(){
		try{
			MbpfNrcvstsListInq_DODT object= (MbpfNrcvstsListInq_DODT)super.clone();
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
		result= prime * result + ((this.metTrnSrno==null)?0:this.metTrnSrno.hashCode());
		result= prime * result + ((this.nrcvAm==null)?0:this.nrcvAm.hashCode());
		result= prime * result + ((this.nrcvMbhNm==null)?0:this.nrcvMbhNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MbpfNrcvstsListInq_DODT other= (MbpfNrcvstsListInq_DODT)obj;
		{
			Object _trnDt= getTrnDt();
			Object __trnDt= other.getTrnDt();
			if ( _trnDt== null ) { if ( __trnDt!= null ) return false; }
			else if ( !_trnDt.equals(__trnDt) ) return false;
		}
		{
			Object _metTrnSrno= getMetTrnSrno();
			Object __metTrnSrno= other.getMetTrnSrno();
			if ( _metTrnSrno== null ) { if ( __metTrnSrno!= null ) return false; }
			else if ( !_metTrnSrno.equals(__metTrnSrno) ) return false;
		}
		{
			Object _nrcvAm= getNrcvAm();
			Object __nrcvAm= other.getNrcvAm();
			if ( _nrcvAm== null ) { if ( __nrcvAm!= null ) return false; }
			else if ( !_nrcvAm.equals(__nrcvAm) ) return false;
		}
		{
			Object _nrcvMbhNm= getNrcvMbhNm();
			Object __nrcvMbhNm= other.getNrcvMbhNm();
			if ( _nrcvMbhNm== null ) { if ( __nrcvMbhNm!= null ) return false; }
			else if ( !_nrcvMbhNm.equals(__nrcvMbhNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MbpfNrcvstsListInq_DODT.class.getName()).append(":\n");
		sb.append("\ttrnDt: ");
		sb.append(trnDt==null?"null":getTrnDt());
		sb.append("\n");
		sb.append("\tmetTrnSrno: ");
		sb.append(metTrnSrno==null?"null":getMetTrnSrno());
		sb.append("\n");
		sb.append("\tnrcvAm: ");
		sb.append(nrcvAm==null?"null":getNrcvAm());
		sb.append("\n");
		sb.append("\tnrcvMbhNm: ");
		sb.append(nrcvMbhNm==null?"null":getNrcvMbhNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* trnDt */
		messageLen+= 8; /* metTrnSrno */
		messageLen+= 18; /* nrcvAm */
		messageLen+= 60; /* nrcvMbhNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnDt");
		list.add("metTrnSrno");
		list.add("nrcvAm");
		list.add("nrcvMbhNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDt", get("trnDt"));
		map.put("metTrnSrno", get("metTrnSrno"));
		map.put("nrcvAm", get("nrcvAm"));
		map.put("nrcvMbhNm", get("nrcvMbhNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 110632544:/* trnDt */
			return getTrnDt();
		case -1198079820:/* metTrnSrno */
			return getMetTrnSrno();
		case -1037414461:/* nrcvAm */
			return getNrcvAm();
		case 981311387:/* nrcvMbhNm */
			return getNrcvMbhNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 110632544:/* trnDt */
			setTrnDt((Integer)value);
			break;
		case -1198079820:/* metTrnSrno */
			setMetTrnSrno((Integer)value);
			break;
		case -1037414461:/* nrcvAm */
			if ( value instanceof String ){
				setNrcvAm((String)value);
			}
			else if ( value instanceof Double ){
				setNrcvAm((Double)value);
			}
			else if ( value instanceof Long ){
				setNrcvAm((Long)value);
			}
			else{
				setNrcvAm((BigDecimal)value);
			}
			break;
		case 981311387:/* nrcvMbhNm */
			setNrcvMbhNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
