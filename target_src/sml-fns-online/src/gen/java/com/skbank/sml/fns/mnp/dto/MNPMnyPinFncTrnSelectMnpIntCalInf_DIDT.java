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
	"dpsInpAcno", "trnDscd", "inqDscd", "inqAimDscd", "inqBasDt", "inqEndDt", "trnSrno", "trnAm", "trnAtcnt"
}, name="MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT")
@XmlRootElement(name="MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT")
@BxmCategory(logicalName="머니클립이자계산정보조회.컴포넌트.출력.IO", description="") 
public class MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1374600574L;
	
	
	
	/**
	 * 수신입력계좌번호
	 */
	@ApiModelProperty(
		name = "dpsInpAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsInpAcno")
	@BxmOmm_Field(length=15, decimal=0, description="수신입력계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String dpsInpAcno= "";
	
	
	/**
	 * 거래구분코드
	 */
	@ApiModelProperty(
		name = "trnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDscd")
	@BxmOmm_Field(length=1, decimal=0, description="거래구분코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String trnDscd= "";
	
	
	/**
	 * 조회구분코드
	 */
	@ApiModelProperty(
		name = "inqDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqDscd")
	@BxmOmm_Field(length=2, decimal=0, description="조회구분코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String inqDscd= "";
	
	
	/**
	 * 조회목적구분코드
	 */
	@ApiModelProperty(
		name = "inqAimDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqAimDscd")
	@BxmOmm_Field(length=2, decimal=0, description="조회목적구분코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String inqAimDscd= "";
	
	
	/**
	 * 조회기준일자
	 */
	@ApiModelProperty(
		name = "inqBasDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqBasDt")
	@BxmOmm_Field(length=8, decimal=0, description="조회기준일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String inqBasDt= "";
	
	
	/**
	 * 조회종료일자
	 */
	@ApiModelProperty(
		name = "inqEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="조회종료일자", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String inqEndDt= "";
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="거래일련번호", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private Integer trnSrno= 0;
	
	
	/**
	 * 거래금액
	 */
	@ApiModelProperty(
		name = "trnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("trnAm")
	@BxmOmm_Field(length=19, decimal=3, description="거래금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal trnAm= new BigDecimal("0");
	
	
	/**
	 * 거래좌수
	 */
	@ApiModelProperty(
		name = "trnAtcnt"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("trnAtcnt")
	@BxmOmm_Field(length=19, decimal=3, description="거래좌수", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal trnAtcnt= new BigDecimal("0");
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsInpAcno= false;
	protected final boolean isSet_dpsInpAcno(){
		return this.isSet_dpsInpAcno;
	}
	private void setIsSet_dpsInpAcno(boolean value){
		this.isSet_dpsInpAcno= value;
	}
	/**
	 * 수신입력계좌번호
	 */
	@XmlTransient
	public String getDpsInpAcno(){
		return this.dpsInpAcno;
	}
	
	/**
	 * 수신입력계좌번호
	 * 
	 * @param dpsInpAcno 수신입력계좌번호
	 */
	public void setDpsInpAcno(String dpsInpAcno){
		this.dpsInpAcno= dpsInpAcno;
		this.setIsSet_dpsInpAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDscd= false;
	protected final boolean isSet_trnDscd(){
		return this.isSet_trnDscd;
	}
	private void setIsSet_trnDscd(boolean value){
		this.isSet_trnDscd= value;
	}
	/**
	 * 거래구분코드
	 */
	@XmlTransient
	public String getTrnDscd(){
		return this.trnDscd;
	}
	
	/**
	 * 거래구분코드
	 * 
	 * @param trnDscd 거래구분코드
	 */
	public void setTrnDscd(String trnDscd){
		this.trnDscd= trnDscd;
		this.setIsSet_trnDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqDscd= false;
	protected final boolean isSet_inqDscd(){
		return this.isSet_inqDscd;
	}
	private void setIsSet_inqDscd(boolean value){
		this.isSet_inqDscd= value;
	}
	/**
	 * 조회구분코드
	 */
	@XmlTransient
	public String getInqDscd(){
		return this.inqDscd;
	}
	
	/**
	 * 조회구분코드
	 * 
	 * @param inqDscd 조회구분코드
	 */
	public void setInqDscd(String inqDscd){
		this.inqDscd= inqDscd;
		this.setIsSet_inqDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqAimDscd= false;
	protected final boolean isSet_inqAimDscd(){
		return this.isSet_inqAimDscd;
	}
	private void setIsSet_inqAimDscd(boolean value){
		this.isSet_inqAimDscd= value;
	}
	/**
	 * 조회목적구분코드
	 */
	@XmlTransient
	public String getInqAimDscd(){
		return this.inqAimDscd;
	}
	
	/**
	 * 조회목적구분코드
	 * 
	 * @param inqAimDscd 조회목적구분코드
	 */
	public void setInqAimDscd(String inqAimDscd){
		this.inqAimDscd= inqAimDscd;
		this.setIsSet_inqAimDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqBasDt= false;
	protected final boolean isSet_inqBasDt(){
		return this.isSet_inqBasDt;
	}
	private void setIsSet_inqBasDt(boolean value){
		this.isSet_inqBasDt= value;
	}
	/**
	 * 조회기준일자
	 */
	@XmlTransient
	public String getInqBasDt(){
		return this.inqBasDt;
	}
	
	/**
	 * 조회기준일자
	 * 
	 * @param inqBasDt 조회기준일자
	 */
	public void setInqBasDt(String inqBasDt){
		this.inqBasDt= inqBasDt;
		this.setIsSet_inqBasDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqEndDt= false;
	protected final boolean isSet_inqEndDt(){
		return this.isSet_inqEndDt;
	}
	private void setIsSet_inqEndDt(boolean value){
		this.isSet_inqEndDt= value;
	}
	/**
	 * 조회종료일자
	 */
	@XmlTransient
	public String getInqEndDt(){
		return this.inqEndDt;
	}
	
	/**
	 * 조회종료일자
	 * 
	 * @param inqEndDt 조회종료일자
	 */
	public void setInqEndDt(String inqEndDt){
		this.inqEndDt= inqEndDt;
		this.setIsSet_inqEndDt(true);
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
	private boolean isSet_trnAm= false;
	protected final boolean isSet_trnAm(){
		return this.isSet_trnAm;
	}
	private void setIsSet_trnAm(boolean value){
		this.isSet_trnAm= value;
	}
	/**
	 * 거래금액
	 * BigDecimal - Double value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(double trnAm) {
		setTrnAm(BigDecimal.valueOf(trnAm));
	}
	/**
	 * 거래금액
	 * BigDecimal - Long value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(long trnAm) {
		setTrnAm(BigDecimal.valueOf(trnAm));
	}
	/**
	 * 거래금액
	 * BigDecimal - String value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(String trnAm) {
		setTrnAm(new BigDecimal(trnAm));
	}
	/**
	 * 거래금액
	 */
	@XmlTransient
	public BigDecimal getTrnAm(){
		return this.trnAm;
	}
	
	/**
	 * 거래금액
	 * 
	 * @param trnAm 거래금액
	 */
	@JsonSetter("trnAm")
	public void setTrnAm(BigDecimal trnAm){
		this.trnAm= trnAm;
		this.setIsSet_trnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnAtcnt= false;
	protected final boolean isSet_trnAtcnt(){
		return this.isSet_trnAtcnt;
	}
	private void setIsSet_trnAtcnt(boolean value){
		this.isSet_trnAtcnt= value;
	}
	/**
	 * 거래좌수
	 * BigDecimal - Double value setter
	 *
	 * @Param trnAtcnt 거래좌수
	 */
	public void setTrnAtcnt(double trnAtcnt) {
		setTrnAtcnt(BigDecimal.valueOf(trnAtcnt));
	}
	/**
	 * 거래좌수
	 * BigDecimal - Long value setter
	 *
	 * @Param trnAtcnt 거래좌수
	 */
	public void setTrnAtcnt(long trnAtcnt) {
		setTrnAtcnt(BigDecimal.valueOf(trnAtcnt));
	}
	/**
	 * 거래좌수
	 * BigDecimal - String value setter
	 *
	 * @Param trnAtcnt 거래좌수
	 */
	public void setTrnAtcnt(String trnAtcnt) {
		setTrnAtcnt(new BigDecimal(trnAtcnt));
	}
	/**
	 * 거래좌수
	 */
	@XmlTransient
	public BigDecimal getTrnAtcnt(){
		return this.trnAtcnt;
	}
	
	/**
	 * 거래좌수
	 * 
	 * @param trnAtcnt 거래좌수
	 */
	@JsonSetter("trnAtcnt")
	public void setTrnAtcnt(BigDecimal trnAtcnt){
		this.trnAtcnt= trnAtcnt;
		this.setIsSet_trnAtcnt(true);
	}
				
	@Override
	public MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT clone(){
		try{
			MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT object= (MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT)super.clone();
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
		
		result= prime * result + ((this.dpsInpAcno==null)?0:this.dpsInpAcno.hashCode());
		result= prime * result + ((this.trnDscd==null)?0:this.trnDscd.hashCode());
		result= prime * result + ((this.inqDscd==null)?0:this.inqDscd.hashCode());
		result= prime * result + ((this.inqAimDscd==null)?0:this.inqAimDscd.hashCode());
		result= prime * result + ((this.inqBasDt==null)?0:this.inqBasDt.hashCode());
		result= prime * result + ((this.inqEndDt==null)?0:this.inqEndDt.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.trnAm==null)?0:this.trnAm.hashCode());
		result= prime * result + ((this.trnAtcnt==null)?0:this.trnAtcnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT other= (MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _trnDscd= getTrnDscd();
			Object __trnDscd= other.getTrnDscd();
			if ( _trnDscd== null ) { if ( __trnDscd!= null ) return false; }
			else if ( !_trnDscd.equals(__trnDscd) ) return false;
		}
		{
			Object _inqDscd= getInqDscd();
			Object __inqDscd= other.getInqDscd();
			if ( _inqDscd== null ) { if ( __inqDscd!= null ) return false; }
			else if ( !_inqDscd.equals(__inqDscd) ) return false;
		}
		{
			Object _inqAimDscd= getInqAimDscd();
			Object __inqAimDscd= other.getInqAimDscd();
			if ( _inqAimDscd== null ) { if ( __inqAimDscd!= null ) return false; }
			else if ( !_inqAimDscd.equals(__inqAimDscd) ) return false;
		}
		{
			Object _inqBasDt= getInqBasDt();
			Object __inqBasDt= other.getInqBasDt();
			if ( _inqBasDt== null ) { if ( __inqBasDt!= null ) return false; }
			else if ( !_inqBasDt.equals(__inqBasDt) ) return false;
		}
		{
			Object _inqEndDt= getInqEndDt();
			Object __inqEndDt= other.getInqEndDt();
			if ( _inqEndDt== null ) { if ( __inqEndDt!= null ) return false; }
			else if ( !_inqEndDt.equals(__inqEndDt) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _trnAm= getTrnAm();
			Object __trnAm= other.getTrnAm();
			if ( _trnAm== null ) { if ( __trnAm!= null ) return false; }
			else if ( !_trnAm.equals(__trnAm) ) return false;
		}
		{
			Object _trnAtcnt= getTrnAtcnt();
			Object __trnAtcnt= other.getTrnAtcnt();
			if ( _trnAtcnt== null ) { if ( __trnAtcnt!= null ) return false; }
			else if ( !_trnAtcnt.equals(__trnAtcnt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinFncTrnSelectMnpIntCalInf_DIDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\ttrnDscd: ");
		sb.append(trnDscd==null?"null":getTrnDscd());
		sb.append("\n");
		sb.append("\tinqDscd: ");
		sb.append(inqDscd==null?"null":getInqDscd());
		sb.append("\n");
		sb.append("\tinqAimDscd: ");
		sb.append(inqAimDscd==null?"null":getInqAimDscd());
		sb.append("\n");
		sb.append("\tinqBasDt: ");
		sb.append(inqBasDt==null?"null":getInqBasDt());
		sb.append("\n");
		sb.append("\tinqEndDt: ");
		sb.append(inqEndDt==null?"null":getInqEndDt());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\ttrnAm: ");
		sb.append(trnAm==null?"null":getTrnAm());
		sb.append("\n");
		sb.append("\ttrnAtcnt: ");
		sb.append(trnAtcnt==null?"null":getTrnAtcnt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 1; /* trnDscd */
		messageLen+= 2; /* inqDscd */
		messageLen+= 2; /* inqAimDscd */
		messageLen+= 8; /* inqBasDt */
		messageLen+= 8; /* inqEndDt */
		messageLen+= 8; /* trnSrno */
		messageLen+= 19; /* trnAm */
		messageLen+= 19; /* trnAtcnt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsInpAcno");
		list.add("trnDscd");
		list.add("inqDscd");
		list.add("inqAimDscd");
		list.add("inqBasDt");
		list.add("inqEndDt");
		list.add("trnSrno");
		list.add("trnAm");
		list.add("trnAtcnt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("trnDscd", get("trnDscd"));
		map.put("inqDscd", get("inqDscd"));
		map.put("inqAimDscd", get("inqAimDscd"));
		map.put("inqBasDt", get("inqBasDt"));
		map.put("inqEndDt", get("inqEndDt"));
		map.put("trnSrno", get("trnSrno"));
		map.put("trnAm", get("trnAm"));
		map.put("trnAtcnt", get("trnAtcnt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case -1056305408:/* trnDscd */
			return getTrnDscd();
		case 1954309948:/* inqDscd */
			return getInqDscd();
		case -374443383:/* inqAimDscd */
			return getInqAimDscd();
		case 451697464:/* inqBasDt */
			return getInqBasDt();
		case 454840895:/* inqEndDt */
			return getInqEndDt();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case 110632444:/* trnAm */
			return getTrnAm();
		case 1611530374:/* trnAtcnt */
			return getTrnAtcnt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			setDpsInpAcno((String)value);
			break;
		case -1056305408:/* trnDscd */
			setTrnDscd((String)value);
			break;
		case 1954309948:/* inqDscd */
			setInqDscd((String)value);
			break;
		case -374443383:/* inqAimDscd */
			setInqAimDscd((String)value);
			break;
		case 451697464:/* inqBasDt */
			setInqBasDt((String)value);
			break;
		case 454840895:/* inqEndDt */
			setInqEndDt((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((Integer)value);
			break;
		case 110632444:/* trnAm */
			if ( value instanceof String ){
				setTrnAm((String)value);
			}
			else if ( value instanceof Double ){
				setTrnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTrnAm((Long)value);
			}
			else{
				setTrnAm((BigDecimal)value);
			}
			break;
		case 1611530374:/* trnAtcnt */
			if ( value instanceof String ){
				setTrnAtcnt((String)value);
			}
			else if ( value instanceof Double ){
				setTrnAtcnt((Double)value);
			}
			else if ( value instanceof Long ){
				setTrnAtcnt((Long)value);
			}
			else{
				setTrnAtcnt((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
