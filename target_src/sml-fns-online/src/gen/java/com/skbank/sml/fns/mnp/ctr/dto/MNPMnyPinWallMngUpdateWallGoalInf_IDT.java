/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.ctr.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpChgItm_DTO;
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
	"trnDscd", "atsMngNo", "atsWdrBkwAcno", "rcvAcno", "atsBasDd", "atsCycd", "atsAm", "mnpChgItmDto"
}, name="MNPMnyPinWallMngUpdateWallGoalInf_IDT")
@XmlRootElement(name="MNPMnyPinWallMngUpdateWallGoalInf_IDT")
@BxmCategory(logicalName="머니클립.지갑.목표.정보.수정.컨트롤러.입력.IO", description="") 
public class MNPMnyPinWallMngUpdateWallGoalInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1491183974L;
	
	
	
	/**
	 * 거래구분코드
	 */
	@ApiModelProperty(
		name = "trnDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDscd")
	@BxmOmm_Field(length=2, decimal=0, description="거래구분코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String trnDscd= "";
	
	
	/**
	 * 자동이체관리번호
	 */
	@ApiModelProperty(
		name = "atsMngNo"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsMngNo")
	@BxmOmm_Field(length=13, decimal=0, description="자동이체관리번호", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal atsMngNo= new BigDecimal("0");
	
	
	/**
	 * 자동이체출금전행계좌번호
	 */
	@ApiModelProperty(
		name = "atsWdrBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsWdrBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="자동이체출금전행계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsWdrBkwAcno= "";
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="입금계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rcvAcno= "";
	
	
	/**
	 * 자동이체기준일
	 */
	@ApiModelProperty(
		name = "atsBasDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsBasDd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체기준일", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsBasDd= "";
	
	
	/**
	 * 자동이체주기코드
	 */
	@ApiModelProperty(
		name = "atsCycd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsCycd")
	@BxmOmm_Field(length=2, decimal=0, description="자동이체주기코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsCycd= "";
	
	
	/**
	 * 자동이체금액
	 */
	@ApiModelProperty(
		name = "atsAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsAm")
	@BxmOmm_Field(length=18, decimal=0, description="자동이체금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal atsAm= new BigDecimal("0");
	
	
	/**
	 * 머니클립모으기변경정보.공통.IO
	 */
	@ApiModelProperty(
		name = "mnpChgItmDto"
		, dataType = "com.skbank.sml.fns.mnp.dto.MNPMnyPinFncTrnSelectMnpChgItm_DTO"
		)
	@XmlElement
	@JsonProperty("mnpChgItmDto")
	@BxmOmm_Field(length=0, decimal=0, description="머니클립모으기변경정보.공통.IO", align="left", fill="")
	private MNPMnyPinFncTrnSelectMnpChgItm_DTO mnpChgItmDto= null;
	
	
	
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
	private boolean isSet_atsMngNo= false;
	protected final boolean isSet_atsMngNo(){
		return this.isSet_atsMngNo;
	}
	private void setIsSet_atsMngNo(boolean value){
		this.isSet_atsMngNo= value;
	}
	/**
	 * 자동이체관리번호
	 * BigDecimal - Double value setter
	 *
	 * @Param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(double atsMngNo) {
		setAtsMngNo(BigDecimal.valueOf(atsMngNo));
	}
	/**
	 * 자동이체관리번호
	 * BigDecimal - Long value setter
	 *
	 * @Param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(long atsMngNo) {
		setAtsMngNo(BigDecimal.valueOf(atsMngNo));
	}
	/**
	 * 자동이체관리번호
	 * BigDecimal - String value setter
	 *
	 * @Param atsMngNo 자동이체관리번호
	 */
	public void setAtsMngNo(String atsMngNo) {
		setAtsMngNo(new BigDecimal(atsMngNo));
	}
	/**
	 * 자동이체관리번호
	 */
	@XmlTransient
	public BigDecimal getAtsMngNo(){
		return this.atsMngNo;
	}
	
	/**
	 * 자동이체관리번호
	 * 
	 * @param atsMngNo 자동이체관리번호
	 */
	@JsonSetter("atsMngNo")
	public void setAtsMngNo(BigDecimal atsMngNo){
		this.atsMngNo= atsMngNo;
		this.setIsSet_atsMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsWdrBkwAcno= false;
	protected final boolean isSet_atsWdrBkwAcno(){
		return this.isSet_atsWdrBkwAcno;
	}
	private void setIsSet_atsWdrBkwAcno(boolean value){
		this.isSet_atsWdrBkwAcno= value;
	}
	/**
	 * 자동이체출금전행계좌번호
	 */
	@XmlTransient
	public String getAtsWdrBkwAcno(){
		return this.atsWdrBkwAcno;
	}
	
	/**
	 * 자동이체출금전행계좌번호
	 * 
	 * @param atsWdrBkwAcno 자동이체출금전행계좌번호
	 */
	public void setAtsWdrBkwAcno(String atsWdrBkwAcno){
		this.atsWdrBkwAcno= atsWdrBkwAcno;
		this.setIsSet_atsWdrBkwAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvAcno= false;
	protected final boolean isSet_rcvAcno(){
		return this.isSet_rcvAcno;
	}
	private void setIsSet_rcvAcno(boolean value){
		this.isSet_rcvAcno= value;
	}
	/**
	 * 입금계좌번호
	 */
	@XmlTransient
	public String getRcvAcno(){
		return this.rcvAcno;
	}
	
	/**
	 * 입금계좌번호
	 * 
	 * @param rcvAcno 입금계좌번호
	 */
	public void setRcvAcno(String rcvAcno){
		this.rcvAcno= rcvAcno;
		this.setIsSet_rcvAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsBasDd= false;
	protected final boolean isSet_atsBasDd(){
		return this.isSet_atsBasDd;
	}
	private void setIsSet_atsBasDd(boolean value){
		this.isSet_atsBasDd= value;
	}
	/**
	 * 자동이체기준일
	 */
	@XmlTransient
	public String getAtsBasDd(){
		return this.atsBasDd;
	}
	
	/**
	 * 자동이체기준일
	 * 
	 * @param atsBasDd 자동이체기준일
	 */
	public void setAtsBasDd(String atsBasDd){
		this.atsBasDd= atsBasDd;
		this.setIsSet_atsBasDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsCycd= false;
	protected final boolean isSet_atsCycd(){
		return this.isSet_atsCycd;
	}
	private void setIsSet_atsCycd(boolean value){
		this.isSet_atsCycd= value;
	}
	/**
	 * 자동이체주기코드
	 */
	@XmlTransient
	public String getAtsCycd(){
		return this.atsCycd;
	}
	
	/**
	 * 자동이체주기코드
	 * 
	 * @param atsCycd 자동이체주기코드
	 */
	public void setAtsCycd(String atsCycd){
		this.atsCycd= atsCycd;
		this.setIsSet_atsCycd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsAm= false;
	protected final boolean isSet_atsAm(){
		return this.isSet_atsAm;
	}
	private void setIsSet_atsAm(boolean value){
		this.isSet_atsAm= value;
	}
	/**
	 * 자동이체금액
	 * BigDecimal - Double value setter
	 *
	 * @Param atsAm 자동이체금액
	 */
	public void setAtsAm(double atsAm) {
		setAtsAm(BigDecimal.valueOf(atsAm));
	}
	/**
	 * 자동이체금액
	 * BigDecimal - Long value setter
	 *
	 * @Param atsAm 자동이체금액
	 */
	public void setAtsAm(long atsAm) {
		setAtsAm(BigDecimal.valueOf(atsAm));
	}
	/**
	 * 자동이체금액
	 * BigDecimal - String value setter
	 *
	 * @Param atsAm 자동이체금액
	 */
	public void setAtsAm(String atsAm) {
		setAtsAm(new BigDecimal(atsAm));
	}
	/**
	 * 자동이체금액
	 */
	@XmlTransient
	public BigDecimal getAtsAm(){
		return this.atsAm;
	}
	
	/**
	 * 자동이체금액
	 * 
	 * @param atsAm 자동이체금액
	 */
	@JsonSetter("atsAm")
	public void setAtsAm(BigDecimal atsAm){
		this.atsAm= atsAm;
		this.setIsSet_atsAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnpChgItmDto= false;
	protected final boolean isSet_mnpChgItmDto(){
		return this.isSet_mnpChgItmDto;
	}
	private void setIsSet_mnpChgItmDto(boolean value){
		this.isSet_mnpChgItmDto= value;
	}
	/**
	 * 머니클립모으기변경정보.공통.IO
	 */
	@XmlTransient
	public MNPMnyPinFncTrnSelectMnpChgItm_DTO getMnpChgItmDto(){
		return this.mnpChgItmDto;
	}
	
	/**
	 * 머니클립모으기변경정보.공통.IO
	 * 
	 * @param mnpChgItmDto 머니클립모으기변경정보.공통.IO
	 */
	public void setMnpChgItmDto(MNPMnyPinFncTrnSelectMnpChgItm_DTO mnpChgItmDto){
		this.mnpChgItmDto= mnpChgItmDto;
		this.setIsSet_mnpChgItmDto(true);
	}
				
	@Override
	public MNPMnyPinWallMngUpdateWallGoalInf_IDT clone(){
		try{
			MNPMnyPinWallMngUpdateWallGoalInf_IDT object= (MNPMnyPinWallMngUpdateWallGoalInf_IDT)super.clone();
			if ( this.mnpChgItmDto== null ) object.mnpChgItmDto= null;
			else object.mnpChgItmDto= (MNPMnyPinFncTrnSelectMnpChgItm_DTO)this.mnpChgItmDto.clone();
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
		
		result= prime * result + ((this.trnDscd==null)?0:this.trnDscd.hashCode());
		result= prime * result + ((this.atsMngNo==null)?0:this.atsMngNo.hashCode());
		result= prime * result + ((this.atsWdrBkwAcno==null)?0:this.atsWdrBkwAcno.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		result= prime * result + ((this.atsBasDd==null)?0:this.atsBasDd.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.mnpChgItmDto==null)?0:this.mnpChgItmDto.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngUpdateWallGoalInf_IDT other= (MNPMnyPinWallMngUpdateWallGoalInf_IDT)obj;
		{
			Object _trnDscd= getTrnDscd();
			Object __trnDscd= other.getTrnDscd();
			if ( _trnDscd== null ) { if ( __trnDscd!= null ) return false; }
			else if ( !_trnDscd.equals(__trnDscd) ) return false;
		}
		{
			Object _atsMngNo= getAtsMngNo();
			Object __atsMngNo= other.getAtsMngNo();
			if ( _atsMngNo== null ) { if ( __atsMngNo!= null ) return false; }
			else if ( !_atsMngNo.equals(__atsMngNo) ) return false;
		}
		{
			Object _atsWdrBkwAcno= getAtsWdrBkwAcno();
			Object __atsWdrBkwAcno= other.getAtsWdrBkwAcno();
			if ( _atsWdrBkwAcno== null ) { if ( __atsWdrBkwAcno!= null ) return false; }
			else if ( !_atsWdrBkwAcno.equals(__atsWdrBkwAcno) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		{
			Object _atsBasDd= getAtsBasDd();
			Object __atsBasDd= other.getAtsBasDd();
			if ( _atsBasDd== null ) { if ( __atsBasDd!= null ) return false; }
			else if ( !_atsBasDd.equals(__atsBasDd) ) return false;
		}
		{
			Object _atsCycd= getAtsCycd();
			Object __atsCycd= other.getAtsCycd();
			if ( _atsCycd== null ) { if ( __atsCycd!= null ) return false; }
			else if ( !_atsCycd.equals(__atsCycd) ) return false;
		}
		{
			Object _atsAm= getAtsAm();
			Object __atsAm= other.getAtsAm();
			if ( _atsAm== null ) { if ( __atsAm!= null ) return false; }
			else if ( !_atsAm.equals(__atsAm) ) return false;
		}
		{
			Object _mnpChgItmDto= getMnpChgItmDto();
			Object __mnpChgItmDto= other.getMnpChgItmDto();
			if ( _mnpChgItmDto== null ) { if ( __mnpChgItmDto!= null ) return false; }
			else if ( !_mnpChgItmDto.equals(__mnpChgItmDto) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngUpdateWallGoalInf_IDT.class.getName()).append(":\n");
		sb.append("\ttrnDscd: ");
		sb.append(trnDscd==null?"null":getTrnDscd());
		sb.append("\n");
		sb.append("\tatsMngNo: ");
		sb.append(atsMngNo==null?"null":getAtsMngNo());
		sb.append("\n");
		sb.append("\tatsWdrBkwAcno: ");
		sb.append(atsWdrBkwAcno==null?"null":getAtsWdrBkwAcno());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("\tatsBasDd: ");
		sb.append(atsBasDd==null?"null":getAtsBasDd());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\tmnpChgItmDto: ");
		sb.append(mnpChgItmDto==null?"null":getMnpChgItmDto());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* trnDscd */
		messageLen+= 13; /* atsMngNo */
		messageLen+= 20; /* atsWdrBkwAcno */
		messageLen+= 15; /* rcvAcno */
		messageLen+= 2; /* atsBasDd */
		messageLen+= 2; /* atsCycd */
		messageLen+= 18; /* atsAm */
		if ( mnpChgItmDto != null && !(mnpChgItmDto instanceof Predictable) )
			throw new IllegalStateException( "Message length can not be predicted.");
		{
			MNPMnyPinFncTrnSelectMnpChgItm_DTO temp= mnpChgItmDto;
			if ( temp== null ) temp= new MNPMnyPinFncTrnSelectMnpChgItm_DTO();
			messageLen+= ( (Predictable)temp).predictMessageLength(); /* mnpChgItmDto */
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnDscd");
		list.add("atsMngNo");
		list.add("atsWdrBkwAcno");
		list.add("rcvAcno");
		list.add("atsBasDd");
		list.add("atsCycd");
		list.add("atsAm");
		list.add("mnpChgItmDto");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDscd", get("trnDscd"));
		map.put("atsMngNo", get("atsMngNo"));
		map.put("atsWdrBkwAcno", get("atsWdrBkwAcno"));
		map.put("rcvAcno", get("rcvAcno"));
		map.put("atsBasDd", get("atsBasDd"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsAm", get("atsAm"));
		map.put("mnpChgItmDto", get("mnpChgItmDto"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1056305408:/* trnDscd */
			return getTrnDscd();
		case 491964551:/* atsMngNo */
			return getAtsMngNo();
		case 1366640524:/* atsWdrBkwAcno */
			return getAtsWdrBkwAcno();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		case 481429748:/* atsBasDd */
			return getAtsBasDd();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 93149932:/* atsAm */
			return getAtsAm();
		case -298460432:/* mnpChgItmDto */
			return getMnpChgItmDto();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1056305408:/* trnDscd */
			setTrnDscd((String)value);
			break;
		case 491964551:/* atsMngNo */
			if ( value instanceof String ){
				setAtsMngNo((String)value);
			}
			else if ( value instanceof Double ){
				setAtsMngNo((Double)value);
			}
			else if ( value instanceof Long ){
				setAtsMngNo((Long)value);
			}
			else{
				setAtsMngNo((BigDecimal)value);
			}
			break;
		case 1366640524:/* atsWdrBkwAcno */
			setAtsWdrBkwAcno((String)value);
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
			break;
		case 481429748:/* atsBasDd */
			setAtsBasDd((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 93149932:/* atsAm */
			if ( value instanceof String ){
				setAtsAm((String)value);
			}
			else if ( value instanceof Double ){
				setAtsAm((Double)value);
			}
			else if ( value instanceof Long ){
				setAtsAm((Long)value);
			}
			else{
				setAtsAm((BigDecimal)value);
			}
			break;
		case -298460432:/* mnpChgItmDto */
			setMnpChgItmDto((MNPMnyPinFncTrnSelectMnpChgItm_DTO)value);
			break;
		default:
			break;
		}
	}
	
}
