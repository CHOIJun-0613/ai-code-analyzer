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
	"dpsInpAcno", "iconCd", "wallAlsNm", "atsYn", "atsCycd", "atsDd", "atsAm", "aimFdNm", "dinsvGoalAm"
}, name="MNPMnyPinWallMngInsertWallBscInf_IDT")
@XmlRootElement(name="MNPMnyPinWallMngInsertWallBscInf_IDT")
@BxmCategory(logicalName="머니클립.지갑.기본.정보.등록.입력IO", description="") 
public class MNPMnyPinWallMngInsertWallBscInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1881864601L;
	
	
	
	/**
	 * 수신입력계좌번호
	 */
	@ApiModelProperty(
		name = "dpsInpAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsInpAcno")
	@BxmOmm_Field(length=15, decimal=0, description="수신입력계좌번호", align="left", fill="")
	private String dpsInpAcno= "";
	
	
	/**
	 * 아이콘코드
	 */
	@ApiModelProperty(
		name = "iconCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("iconCd")
	@BxmOmm_Field(length=3, decimal=0, description="아이콘코드", align="left", fill="")
	private String iconCd= "";
	
	
	/**
	 * 지갑별칭명
	 */
	@ApiModelProperty(
		name = "wallAlsNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wallAlsNm")
	@BxmOmm_Field(length=50, decimal=0, description="지갑별칭명", align="left", fill="")
	private String wallAlsNm= "";
	
	
	/**
	 * 자동이체여부
	 */
	@ApiModelProperty(
		name = "atsYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체여부", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsYn= "";
	
	
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
	 * 자동이체일
	 */
	@ApiModelProperty(
		name = "atsDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsDd")
	@BxmOmm_Field(length=8, decimal=0, description="자동이체일", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsDd= "";
	
	
	/**
	 * 자동이체금액
	 */
	@ApiModelProperty(
		name = "atsAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("atsAm")
	@BxmOmm_Field(length=19, decimal=3, description="자동이체금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal atsAm= new BigDecimal("0");
	
	
	/**
	 * 목적자금명
	 */
	@ApiModelProperty(
		name = "aimFdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("aimFdNm")
	@BxmOmm_Field(length=40, decimal=0, description="목적자금명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String aimFdNm= "";
	
	
	/**
	 * 꿈적금목표금액
	 */
	@ApiModelProperty(
		name = "dinsvGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("dinsvGoalAm")
	@BxmOmm_Field(length=19, decimal=3, description="꿈적금목표금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=D"})
	private BigDecimal dinsvGoalAm= new BigDecimal("0");
	
	
	
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
	private boolean isSet_iconCd= false;
	protected final boolean isSet_iconCd(){
		return this.isSet_iconCd;
	}
	private void setIsSet_iconCd(boolean value){
		this.isSet_iconCd= value;
	}
	/**
	 * 아이콘코드
	 */
	@XmlTransient
	public String getIconCd(){
		return this.iconCd;
	}
	
	/**
	 * 아이콘코드
	 * 
	 * @param iconCd 아이콘코드
	 */
	public void setIconCd(String iconCd){
		this.iconCd= iconCd;
		this.setIsSet_iconCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wallAlsNm= false;
	protected final boolean isSet_wallAlsNm(){
		return this.isSet_wallAlsNm;
	}
	private void setIsSet_wallAlsNm(boolean value){
		this.isSet_wallAlsNm= value;
	}
	/**
	 * 지갑별칭명
	 */
	@XmlTransient
	public String getWallAlsNm(){
		return this.wallAlsNm;
	}
	
	/**
	 * 지갑별칭명
	 * 
	 * @param wallAlsNm 지갑별칭명
	 */
	public void setWallAlsNm(String wallAlsNm){
		this.wallAlsNm= wallAlsNm;
		this.setIsSet_wallAlsNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsYn= false;
	protected final boolean isSet_atsYn(){
		return this.isSet_atsYn;
	}
	private void setIsSet_atsYn(boolean value){
		this.isSet_atsYn= value;
	}
	/**
	 * 자동이체여부
	 */
	@XmlTransient
	public String getAtsYn(){
		return this.atsYn;
	}
	
	/**
	 * 자동이체여부
	 * 
	 * @param atsYn 자동이체여부
	 */
	public void setAtsYn(String atsYn){
		this.atsYn= atsYn;
		this.setIsSet_atsYn(true);
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
	private boolean isSet_atsDd= false;
	protected final boolean isSet_atsDd(){
		return this.isSet_atsDd;
	}
	private void setIsSet_atsDd(boolean value){
		this.isSet_atsDd= value;
	}
	/**
	 * 자동이체일
	 */
	@XmlTransient
	public String getAtsDd(){
		return this.atsDd;
	}
	
	/**
	 * 자동이체일
	 * 
	 * @param atsDd 자동이체일
	 */
	public void setAtsDd(String atsDd){
		this.atsDd= atsDd;
		this.setIsSet_atsDd(true);
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
	private boolean isSet_aimFdNm= false;
	protected final boolean isSet_aimFdNm(){
		return this.isSet_aimFdNm;
	}
	private void setIsSet_aimFdNm(boolean value){
		this.isSet_aimFdNm= value;
	}
	/**
	 * 목적자금명
	 */
	@XmlTransient
	public String getAimFdNm(){
		return this.aimFdNm;
	}
	
	/**
	 * 목적자금명
	 * 
	 * @param aimFdNm 목적자금명
	 */
	public void setAimFdNm(String aimFdNm){
		this.aimFdNm= aimFdNm;
		this.setIsSet_aimFdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dinsvGoalAm= false;
	protected final boolean isSet_dinsvGoalAm(){
		return this.isSet_dinsvGoalAm;
	}
	private void setIsSet_dinsvGoalAm(boolean value){
		this.isSet_dinsvGoalAm= value;
	}
	/**
	 * 꿈적금목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param dinsvGoalAm 꿈적금목표금액
	 */
	public void setDinsvGoalAm(double dinsvGoalAm) {
		setDinsvGoalAm(BigDecimal.valueOf(dinsvGoalAm));
	}
	/**
	 * 꿈적금목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param dinsvGoalAm 꿈적금목표금액
	 */
	public void setDinsvGoalAm(long dinsvGoalAm) {
		setDinsvGoalAm(BigDecimal.valueOf(dinsvGoalAm));
	}
	/**
	 * 꿈적금목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param dinsvGoalAm 꿈적금목표금액
	 */
	public void setDinsvGoalAm(String dinsvGoalAm) {
		setDinsvGoalAm(new BigDecimal(dinsvGoalAm));
	}
	/**
	 * 꿈적금목표금액
	 */
	@XmlTransient
	public BigDecimal getDinsvGoalAm(){
		return this.dinsvGoalAm;
	}
	
	/**
	 * 꿈적금목표금액
	 * 
	 * @param dinsvGoalAm 꿈적금목표금액
	 */
	@JsonSetter("dinsvGoalAm")
	public void setDinsvGoalAm(BigDecimal dinsvGoalAm){
		this.dinsvGoalAm= dinsvGoalAm;
		this.setIsSet_dinsvGoalAm(true);
	}
				
	@Override
	public MNPMnyPinWallMngInsertWallBscInf_IDT clone(){
		try{
			MNPMnyPinWallMngInsertWallBscInf_IDT object= (MNPMnyPinWallMngInsertWallBscInf_IDT)super.clone();
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
		result= prime * result + ((this.iconCd==null)?0:this.iconCd.hashCode());
		result= prime * result + ((this.wallAlsNm==null)?0:this.wallAlsNm.hashCode());
		result= prime * result + ((this.atsYn==null)?0:this.atsYn.hashCode());
		result= prime * result + ((this.atsCycd==null)?0:this.atsCycd.hashCode());
		result= prime * result + ((this.atsDd==null)?0:this.atsDd.hashCode());
		result= prime * result + ((this.atsAm==null)?0:this.atsAm.hashCode());
		result= prime * result + ((this.aimFdNm==null)?0:this.aimFdNm.hashCode());
		result= prime * result + ((this.dinsvGoalAm==null)?0:this.dinsvGoalAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngInsertWallBscInf_IDT other= (MNPMnyPinWallMngInsertWallBscInf_IDT)obj;
		{
			Object _dpsInpAcno= getDpsInpAcno();
			Object __dpsInpAcno= other.getDpsInpAcno();
			if ( _dpsInpAcno== null ) { if ( __dpsInpAcno!= null ) return false; }
			else if ( !_dpsInpAcno.equals(__dpsInpAcno) ) return false;
		}
		{
			Object _iconCd= getIconCd();
			Object __iconCd= other.getIconCd();
			if ( _iconCd== null ) { if ( __iconCd!= null ) return false; }
			else if ( !_iconCd.equals(__iconCd) ) return false;
		}
		{
			Object _wallAlsNm= getWallAlsNm();
			Object __wallAlsNm= other.getWallAlsNm();
			if ( _wallAlsNm== null ) { if ( __wallAlsNm!= null ) return false; }
			else if ( !_wallAlsNm.equals(__wallAlsNm) ) return false;
		}
		{
			Object _atsYn= getAtsYn();
			Object __atsYn= other.getAtsYn();
			if ( _atsYn== null ) { if ( __atsYn!= null ) return false; }
			else if ( !_atsYn.equals(__atsYn) ) return false;
		}
		{
			Object _atsCycd= getAtsCycd();
			Object __atsCycd= other.getAtsCycd();
			if ( _atsCycd== null ) { if ( __atsCycd!= null ) return false; }
			else if ( !_atsCycd.equals(__atsCycd) ) return false;
		}
		{
			Object _atsDd= getAtsDd();
			Object __atsDd= other.getAtsDd();
			if ( _atsDd== null ) { if ( __atsDd!= null ) return false; }
			else if ( !_atsDd.equals(__atsDd) ) return false;
		}
		{
			Object _atsAm= getAtsAm();
			Object __atsAm= other.getAtsAm();
			if ( _atsAm== null ) { if ( __atsAm!= null ) return false; }
			else if ( !_atsAm.equals(__atsAm) ) return false;
		}
		{
			Object _aimFdNm= getAimFdNm();
			Object __aimFdNm= other.getAimFdNm();
			if ( _aimFdNm== null ) { if ( __aimFdNm!= null ) return false; }
			else if ( !_aimFdNm.equals(__aimFdNm) ) return false;
		}
		{
			Object _dinsvGoalAm= getDinsvGoalAm();
			Object __dinsvGoalAm= other.getDinsvGoalAm();
			if ( _dinsvGoalAm== null ) { if ( __dinsvGoalAm!= null ) return false; }
			else if ( !_dinsvGoalAm.equals(__dinsvGoalAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngInsertWallBscInf_IDT.class.getName()).append(":\n");
		sb.append("\tdpsInpAcno: ");
		sb.append(dpsInpAcno==null?"null":getDpsInpAcno());
		sb.append("\n");
		sb.append("\ticonCd: ");
		sb.append(iconCd==null?"null":getIconCd());
		sb.append("\n");
		sb.append("\twallAlsNm: ");
		sb.append(wallAlsNm==null?"null":getWallAlsNm());
		sb.append("\n");
		sb.append("\tatsYn: ");
		sb.append(atsYn==null?"null":getAtsYn());
		sb.append("\n");
		sb.append("\tatsCycd: ");
		sb.append(atsCycd==null?"null":getAtsCycd());
		sb.append("\n");
		sb.append("\tatsDd: ");
		sb.append(atsDd==null?"null":getAtsDd());
		sb.append("\n");
		sb.append("\tatsAm: ");
		sb.append(atsAm==null?"null":getAtsAm());
		sb.append("\n");
		sb.append("\taimFdNm: ");
		sb.append(aimFdNm==null?"null":getAimFdNm());
		sb.append("\n");
		sb.append("\tdinsvGoalAm: ");
		sb.append(dinsvGoalAm==null?"null":getDinsvGoalAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* dpsInpAcno */
		messageLen+= 3; /* iconCd */
		messageLen+= 50; /* wallAlsNm */
		messageLen+= 1; /* atsYn */
		messageLen+= 2; /* atsCycd */
		messageLen+= 8; /* atsDd */
		messageLen+= 19; /* atsAm */
		messageLen+= 40; /* aimFdNm */
		messageLen+= 19; /* dinsvGoalAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("dpsInpAcno");
		list.add("iconCd");
		list.add("wallAlsNm");
		list.add("atsYn");
		list.add("atsCycd");
		list.add("atsDd");
		list.add("atsAm");
		list.add("aimFdNm");
		list.add("dinsvGoalAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("dpsInpAcno", get("dpsInpAcno"));
		map.put("iconCd", get("iconCd"));
		map.put("wallAlsNm", get("wallAlsNm"));
		map.put("atsYn", get("atsYn"));
		map.put("atsCycd", get("atsCycd"));
		map.put("atsDd", get("atsDd"));
		map.put("atsAm", get("atsAm"));
		map.put("aimFdNm", get("aimFdNm"));
		map.put("dinsvGoalAm", get("dinsvGoalAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865257337:/* dpsInpAcno */
			return getDpsInpAcno();
		case -1194063174:/* iconCd */
			return getIconCd();
		case 1431619037:/* wallAlsNm */
			return getWallAlsNm();
		case 93150677:/* atsYn */
			return getAtsYn();
		case -677154281:/* atsCycd */
			return getAtsCycd();
		case 93150016:/* atsDd */
			return getAtsDd();
		case 93149932:/* atsAm */
			return getAtsAm();
		case -997547518:/* aimFdNm */
			return getAimFdNm();
		case -1667932565:/* dinsvGoalAm */
			return getDinsvGoalAm();
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
		case -1194063174:/* iconCd */
			setIconCd((String)value);
			break;
		case 1431619037:/* wallAlsNm */
			setWallAlsNm((String)value);
			break;
		case 93150677:/* atsYn */
			setAtsYn((String)value);
			break;
		case -677154281:/* atsCycd */
			setAtsCycd((String)value);
			break;
		case 93150016:/* atsDd */
			setAtsDd((String)value);
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
		case -997547518:/* aimFdNm */
			setAimFdNm((String)value);
			break;
		case -1667932565:/* dinsvGoalAm */
			if ( value instanceof String ){
				setDinsvGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setDinsvGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setDinsvGoalAm((Long)value);
			}
			else{
				setDinsvGoalAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
