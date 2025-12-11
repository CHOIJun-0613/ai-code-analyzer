/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.dto;

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
	"rcvDt", "intCalStaDt", "intCalEndDt", "intAamAm", "aplIrt", "intAm", "irngYn", "rvsnIntYn"
}, name="MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT")
@XmlRootElement(name="MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT")
@BxmCategory(logicalName="머니클립이자계산정보목록.컴포넌트.출력.IO", description="") 
public class MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -374807542L;
	
	
	
	/**
	 * 입금일자
	 */
	@ApiModelProperty(
		name = "rcvDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvDt")
	@BxmOmm_Field(length=8, decimal=0, description="입금일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String rcvDt= "";
	
	
	/**
	 * 이자계산시작일자
	 */
	@ApiModelProperty(
		name = "intCalStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("intCalStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="이자계산시작일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String intCalStaDt= "";
	
	
	/**
	 * 이자계산종료일자
	 */
	@ApiModelProperty(
		name = "intCalEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("intCalEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="이자계산종료일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String intCalEndDt= "";
	
	
	/**
	 * 이자적수금액
	 */
	@ApiModelProperty(
		name = "intAamAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("intAamAm")
	@BxmOmm_Field(length=19, decimal=3, description="이자적수금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal intAamAm= new BigDecimal("0");
	
	
	/**
	 * 적용이율
	 */
	@ApiModelProperty(
		name = "aplIrt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("aplIrt")
	@BxmOmm_Field(length=14, decimal=6, description="적용이율", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal aplIrt= new BigDecimal("0");
	
	
	/**
	 * 이자금액
	 */
	@ApiModelProperty(
		name = "intAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("intAm")
	@BxmOmm_Field(length=19, decimal=3, description="이자금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=D"})
	private BigDecimal intAm= new BigDecimal("0");
	
	
	/**
	 * 금리네고여부
	 */
	@ApiModelProperty(
		name = "irngYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("irngYn")
	@BxmOmm_Field(length=1, decimal=0, description="금리네고여부", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String irngYn= "";
	
	
	/**
	 * 보정이자여부
	 */
	@ApiModelProperty(
		name = "rvsnIntYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rvsnIntYn")
	@BxmOmm_Field(length=1, decimal=0, description="보정이자여부", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=C","EIMS_DATA_TYPE=S"})
	private String rvsnIntYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvDt= false;
	protected final boolean isSet_rcvDt(){
		return this.isSet_rcvDt;
	}
	private void setIsSet_rcvDt(boolean value){
		this.isSet_rcvDt= value;
	}
	/**
	 * 입금일자
	 */
	@XmlTransient
	public String getRcvDt(){
		return this.rcvDt;
	}
	
	/**
	 * 입금일자
	 * 
	 * @param rcvDt 입금일자
	 */
	public void setRcvDt(String rcvDt){
		this.rcvDt= rcvDt;
		this.setIsSet_rcvDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intCalStaDt= false;
	protected final boolean isSet_intCalStaDt(){
		return this.isSet_intCalStaDt;
	}
	private void setIsSet_intCalStaDt(boolean value){
		this.isSet_intCalStaDt= value;
	}
	/**
	 * 이자계산시작일자
	 */
	@XmlTransient
	public String getIntCalStaDt(){
		return this.intCalStaDt;
	}
	
	/**
	 * 이자계산시작일자
	 * 
	 * @param intCalStaDt 이자계산시작일자
	 */
	public void setIntCalStaDt(String intCalStaDt){
		this.intCalStaDt= intCalStaDt;
		this.setIsSet_intCalStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intCalEndDt= false;
	protected final boolean isSet_intCalEndDt(){
		return this.isSet_intCalEndDt;
	}
	private void setIsSet_intCalEndDt(boolean value){
		this.isSet_intCalEndDt= value;
	}
	/**
	 * 이자계산종료일자
	 */
	@XmlTransient
	public String getIntCalEndDt(){
		return this.intCalEndDt;
	}
	
	/**
	 * 이자계산종료일자
	 * 
	 * @param intCalEndDt 이자계산종료일자
	 */
	public void setIntCalEndDt(String intCalEndDt){
		this.intCalEndDt= intCalEndDt;
		this.setIsSet_intCalEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intAamAm= false;
	protected final boolean isSet_intAamAm(){
		return this.isSet_intAamAm;
	}
	private void setIsSet_intAamAm(boolean value){
		this.isSet_intAamAm= value;
	}
	/**
	 * 이자적수금액
	 * BigDecimal - Double value setter
	 *
	 * @Param intAamAm 이자적수금액
	 */
	public void setIntAamAm(double intAamAm) {
		setIntAamAm(BigDecimal.valueOf(intAamAm));
	}
	/**
	 * 이자적수금액
	 * BigDecimal - Long value setter
	 *
	 * @Param intAamAm 이자적수금액
	 */
	public void setIntAamAm(long intAamAm) {
		setIntAamAm(BigDecimal.valueOf(intAamAm));
	}
	/**
	 * 이자적수금액
	 * BigDecimal - String value setter
	 *
	 * @Param intAamAm 이자적수금액
	 */
	public void setIntAamAm(String intAamAm) {
		setIntAamAm(new BigDecimal(intAamAm));
	}
	/**
	 * 이자적수금액
	 */
	@XmlTransient
	public BigDecimal getIntAamAm(){
		return this.intAamAm;
	}
	
	/**
	 * 이자적수금액
	 * 
	 * @param intAamAm 이자적수금액
	 */
	@JsonSetter("intAamAm")
	public void setIntAamAm(BigDecimal intAamAm){
		this.intAamAm= intAamAm;
		this.setIsSet_intAamAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_aplIrt= false;
	protected final boolean isSet_aplIrt(){
		return this.isSet_aplIrt;
	}
	private void setIsSet_aplIrt(boolean value){
		this.isSet_aplIrt= value;
	}
	/**
	 * 적용이율
	 * BigDecimal - Double value setter
	 *
	 * @Param aplIrt 적용이율
	 */
	public void setAplIrt(double aplIrt) {
		setAplIrt(BigDecimal.valueOf(aplIrt));
	}
	/**
	 * 적용이율
	 * BigDecimal - Long value setter
	 *
	 * @Param aplIrt 적용이율
	 */
	public void setAplIrt(long aplIrt) {
		setAplIrt(BigDecimal.valueOf(aplIrt));
	}
	/**
	 * 적용이율
	 * BigDecimal - String value setter
	 *
	 * @Param aplIrt 적용이율
	 */
	public void setAplIrt(String aplIrt) {
		setAplIrt(new BigDecimal(aplIrt));
	}
	/**
	 * 적용이율
	 */
	@XmlTransient
	public BigDecimal getAplIrt(){
		return this.aplIrt;
	}
	
	/**
	 * 적용이율
	 * 
	 * @param aplIrt 적용이율
	 */
	@JsonSetter("aplIrt")
	public void setAplIrt(BigDecimal aplIrt){
		this.aplIrt= aplIrt;
		this.setIsSet_aplIrt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_intAm= false;
	protected final boolean isSet_intAm(){
		return this.isSet_intAm;
	}
	private void setIsSet_intAm(boolean value){
		this.isSet_intAm= value;
	}
	/**
	 * 이자금액
	 * BigDecimal - Double value setter
	 *
	 * @Param intAm 이자금액
	 */
	public void setIntAm(double intAm) {
		setIntAm(BigDecimal.valueOf(intAm));
	}
	/**
	 * 이자금액
	 * BigDecimal - Long value setter
	 *
	 * @Param intAm 이자금액
	 */
	public void setIntAm(long intAm) {
		setIntAm(BigDecimal.valueOf(intAm));
	}
	/**
	 * 이자금액
	 * BigDecimal - String value setter
	 *
	 * @Param intAm 이자금액
	 */
	public void setIntAm(String intAm) {
		setIntAm(new BigDecimal(intAm));
	}
	/**
	 * 이자금액
	 */
	@XmlTransient
	public BigDecimal getIntAm(){
		return this.intAm;
	}
	
	/**
	 * 이자금액
	 * 
	 * @param intAm 이자금액
	 */
	@JsonSetter("intAm")
	public void setIntAm(BigDecimal intAm){
		this.intAm= intAm;
		this.setIsSet_intAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_irngYn= false;
	protected final boolean isSet_irngYn(){
		return this.isSet_irngYn;
	}
	private void setIsSet_irngYn(boolean value){
		this.isSet_irngYn= value;
	}
	/**
	 * 금리네고여부
	 */
	@XmlTransient
	public String getIrngYn(){
		return this.irngYn;
	}
	
	/**
	 * 금리네고여부
	 * 
	 * @param irngYn 금리네고여부
	 */
	public void setIrngYn(String irngYn){
		this.irngYn= irngYn;
		this.setIsSet_irngYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rvsnIntYn= false;
	protected final boolean isSet_rvsnIntYn(){
		return this.isSet_rvsnIntYn;
	}
	private void setIsSet_rvsnIntYn(boolean value){
		this.isSet_rvsnIntYn= value;
	}
	/**
	 * 보정이자여부
	 */
	@XmlTransient
	public String getRvsnIntYn(){
		return this.rvsnIntYn;
	}
	
	/**
	 * 보정이자여부
	 * 
	 * @param rvsnIntYn 보정이자여부
	 */
	public void setRvsnIntYn(String rvsnIntYn){
		this.rvsnIntYn= rvsnIntYn;
		this.setIsSet_rvsnIntYn(true);
	}
				
	@Override
	public MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT clone(){
		try{
			MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT object= (MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT)super.clone();
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
		
		result= prime * result + ((this.rcvDt==null)?0:this.rcvDt.hashCode());
		result= prime * result + ((this.intCalStaDt==null)?0:this.intCalStaDt.hashCode());
		result= prime * result + ((this.intCalEndDt==null)?0:this.intCalEndDt.hashCode());
		result= prime * result + ((this.intAamAm==null)?0:this.intAamAm.hashCode());
		result= prime * result + ((this.aplIrt==null)?0:this.aplIrt.hashCode());
		result= prime * result + ((this.intAm==null)?0:this.intAm.hashCode());
		result= prime * result + ((this.irngYn==null)?0:this.irngYn.hashCode());
		result= prime * result + ((this.rvsnIntYn==null)?0:this.rvsnIntYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT other= (MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT)obj;
		{
			Object _rcvDt= getRcvDt();
			Object __rcvDt= other.getRcvDt();
			if ( _rcvDt== null ) { if ( __rcvDt!= null ) return false; }
			else if ( !_rcvDt.equals(__rcvDt) ) return false;
		}
		{
			Object _intCalStaDt= getIntCalStaDt();
			Object __intCalStaDt= other.getIntCalStaDt();
			if ( _intCalStaDt== null ) { if ( __intCalStaDt!= null ) return false; }
			else if ( !_intCalStaDt.equals(__intCalStaDt) ) return false;
		}
		{
			Object _intCalEndDt= getIntCalEndDt();
			Object __intCalEndDt= other.getIntCalEndDt();
			if ( _intCalEndDt== null ) { if ( __intCalEndDt!= null ) return false; }
			else if ( !_intCalEndDt.equals(__intCalEndDt) ) return false;
		}
		{
			Object _intAamAm= getIntAamAm();
			Object __intAamAm= other.getIntAamAm();
			if ( _intAamAm== null ) { if ( __intAamAm!= null ) return false; }
			else if ( !_intAamAm.equals(__intAamAm) ) return false;
		}
		{
			Object _aplIrt= getAplIrt();
			Object __aplIrt= other.getAplIrt();
			if ( _aplIrt== null ) { if ( __aplIrt!= null ) return false; }
			else if ( !_aplIrt.equals(__aplIrt) ) return false;
		}
		{
			Object _intAm= getIntAm();
			Object __intAm= other.getIntAm();
			if ( _intAm== null ) { if ( __intAm!= null ) return false; }
			else if ( !_intAm.equals(__intAm) ) return false;
		}
		{
			Object _irngYn= getIrngYn();
			Object __irngYn= other.getIrngYn();
			if ( _irngYn== null ) { if ( __irngYn!= null ) return false; }
			else if ( !_irngYn.equals(__irngYn) ) return false;
		}
		{
			Object _rvsnIntYn= getRvsnIntYn();
			Object __rvsnIntYn= other.getRvsnIntYn();
			if ( _rvsnIntYn== null ) { if ( __rvsnIntYn!= null ) return false; }
			else if ( !_rvsnIntYn.equals(__rvsnIntYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinFncTrnSelectMnpIntCalInfList_DODT.class.getName()).append(":\n");
		sb.append("\trcvDt: ");
		sb.append(rcvDt==null?"null":getRcvDt());
		sb.append("\n");
		sb.append("\tintCalStaDt: ");
		sb.append(intCalStaDt==null?"null":getIntCalStaDt());
		sb.append("\n");
		sb.append("\tintCalEndDt: ");
		sb.append(intCalEndDt==null?"null":getIntCalEndDt());
		sb.append("\n");
		sb.append("\tintAamAm: ");
		sb.append(intAamAm==null?"null":getIntAamAm());
		sb.append("\n");
		sb.append("\taplIrt: ");
		sb.append(aplIrt==null?"null":getAplIrt());
		sb.append("\n");
		sb.append("\tintAm: ");
		sb.append(intAm==null?"null":getIntAm());
		sb.append("\n");
		sb.append("\tirngYn: ");
		sb.append(irngYn==null?"null":getIrngYn());
		sb.append("\n");
		sb.append("\trvsnIntYn: ");
		sb.append(rvsnIntYn==null?"null":getRvsnIntYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 8; /* rcvDt */
		messageLen+= 8; /* intCalStaDt */
		messageLen+= 8; /* intCalEndDt */
		messageLen+= 19; /* intAamAm */
		messageLen+= 14; /* aplIrt */
		messageLen+= 19; /* intAm */
		messageLen+= 1; /* irngYn */
		messageLen+= 1; /* rvsnIntYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("rcvDt");
		list.add("intCalStaDt");
		list.add("intCalEndDt");
		list.add("intAamAm");
		list.add("aplIrt");
		list.add("intAm");
		list.add("irngYn");
		list.add("rvsnIntYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rcvDt", get("rcvDt"));
		map.put("intCalStaDt", get("intCalStaDt"));
		map.put("intCalEndDt", get("intCalEndDt"));
		map.put("intAamAm", get("intAamAm"));
		map.put("aplIrt", get("aplIrt"));
		map.put("intAm", get("intAm"));
		map.put("irngYn", get("irngYn"));
		map.put("rvsnIntYn", get("rvsnIntYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 108346325:/* rcvDt */
			return getRcvDt();
		case 815570097:/* intCalStaDt */
			return getIntCalStaDt();
		case 802464940:/* intCalEndDt */
			return getIntCalEndDt();
		case 536655530:/* intAamAm */
			return getIntAamAm();
		case -1411214066:/* aplIrt */
			return getAplIrt();
		case 100360315:/* intAm */
			return getIntAm();
		case -1180246185:/* irngYn */
			return getIrngYn();
		case 1805533957:/* rvsnIntYn */
			return getRvsnIntYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 108346325:/* rcvDt */
			setRcvDt((String)value);
			break;
		case 815570097:/* intCalStaDt */
			setIntCalStaDt((String)value);
			break;
		case 802464940:/* intCalEndDt */
			setIntCalEndDt((String)value);
			break;
		case 536655530:/* intAamAm */
			if ( value instanceof String ){
				setIntAamAm((String)value);
			}
			else if ( value instanceof Double ){
				setIntAamAm((Double)value);
			}
			else if ( value instanceof Long ){
				setIntAamAm((Long)value);
			}
			else{
				setIntAamAm((BigDecimal)value);
			}
			break;
		case -1411214066:/* aplIrt */
			if ( value instanceof String ){
				setAplIrt((String)value);
			}
			else if ( value instanceof Double ){
				setAplIrt((Double)value);
			}
			else if ( value instanceof Long ){
				setAplIrt((Long)value);
			}
			else{
				setAplIrt((BigDecimal)value);
			}
			break;
		case 100360315:/* intAm */
			if ( value instanceof String ){
				setIntAm((String)value);
			}
			else if ( value instanceof Double ){
				setIntAm((Double)value);
			}
			else if ( value instanceof Long ){
				setIntAm((Long)value);
			}
			else{
				setIntAm((BigDecimal)value);
			}
			break;
		case -1180246185:/* irngYn */
			setIrngYn((String)value);
			break;
		case 1805533957:/* rvsnIntYn */
			setRvsnIntYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
