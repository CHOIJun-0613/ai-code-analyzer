/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.dto;

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
	"itcsno", "rprsAcno", "spceSrno", "savGoalStaDt", "savGoalEndDt", "savGoalAm", "cnsmAmBscd", "cnsmGoalAm"
}, name="SpceDtlGoalEstAmd_DIDT")
@XmlRootElement(name="SpceDtlGoalEstAmd_DIDT")
@BxmCategory(logicalName="공간.상세.목표.설정.수정.DBM.입력.IO", description="") 
public class PBPPbokSpceDtlEstUpdateSpcedtlgoalest_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 936909793L;
	
	
	
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
	 * 대표계좌번호
	 */
	@ApiModelProperty(
		name = "rprsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprsAcno")
	@BxmOmm_Field(length=13, decimal=0, description="대표계좌번호", align="left", fill="")
	private String rprsAcno= "";
	
	
	/**
	 * 공간일련번호
	 */
	@ApiModelProperty(
		name = "spceSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceSrno")
	@BxmOmm_Field(length=10, decimal=0, description="공간일련번호", align="left", fill="")
	private String spceSrno= "";
	
	
	/**
	 * 저축목표시작일자
	 */
	@ApiModelProperty(
		name = "savGoalStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="저축목표시작일자", align="left", fill="")
	private String savGoalStaDt= "";
	
	
	/**
	 * 저축목표종료일자
	 */
	@ApiModelProperty(
		name = "savGoalEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="저축목표종료일자", align="left", fill="")
	private String savGoalEndDt= "";
	
	
	/**
	 * 저축목표금액
	 */
	@ApiModelProperty(
		name = "savGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("savGoalAm")
	@BxmOmm_Field(length=18, decimal=3, description="저축목표금액", align="right", fill="")
	private BigDecimal savGoalAm= new BigDecimal("0");
	
	
	/**
	 * 소비금액기준코드
	 */
	@ApiModelProperty(
		name = "cnsmAmBscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmAmBscd")
	@BxmOmm_Field(length=1, decimal=0, description="소비금액기준코드", align="left", fill="")
	private String cnsmAmBscd= "";
	
	
	/**
	 * 소비목표금액
	 */
	@ApiModelProperty(
		name = "cnsmGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cnsmGoalAm")
	@BxmOmm_Field(length=18, decimal=3, description="소비목표금액", align="right", fill="")
	private BigDecimal cnsmGoalAm= new BigDecimal("0");
	
	
	
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
	private boolean isSet_rprsAcno= false;
	protected final boolean isSet_rprsAcno(){
		return this.isSet_rprsAcno;
	}
	private void setIsSet_rprsAcno(boolean value){
		this.isSet_rprsAcno= value;
	}
	/**
	 * 대표계좌번호
	 */
	@XmlTransient
	public String getRprsAcno(){
		return this.rprsAcno;
	}
	
	/**
	 * 대표계좌번호
	 * 
	 * @param rprsAcno 대표계좌번호
	 */
	public void setRprsAcno(String rprsAcno){
		this.rprsAcno= rprsAcno;
		this.setIsSet_rprsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceSrno= false;
	protected final boolean isSet_spceSrno(){
		return this.isSet_spceSrno;
	}
	private void setIsSet_spceSrno(boolean value){
		this.isSet_spceSrno= value;
	}
	/**
	 * 공간일련번호
	 */
	@XmlTransient
	public String getSpceSrno(){
		return this.spceSrno;
	}
	
	/**
	 * 공간일련번호
	 * 
	 * @param spceSrno 공간일련번호
	 */
	public void setSpceSrno(String spceSrno){
		this.spceSrno= spceSrno;
		this.setIsSet_spceSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalStaDt= false;
	protected final boolean isSet_savGoalStaDt(){
		return this.isSet_savGoalStaDt;
	}
	private void setIsSet_savGoalStaDt(boolean value){
		this.isSet_savGoalStaDt= value;
	}
	/**
	 * 저축목표시작일자
	 */
	@XmlTransient
	public String getSavGoalStaDt(){
		return this.savGoalStaDt;
	}
	
	/**
	 * 저축목표시작일자
	 * 
	 * @param savGoalStaDt 저축목표시작일자
	 */
	public void setSavGoalStaDt(String savGoalStaDt){
		this.savGoalStaDt= savGoalStaDt;
		this.setIsSet_savGoalStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalEndDt= false;
	protected final boolean isSet_savGoalEndDt(){
		return this.isSet_savGoalEndDt;
	}
	private void setIsSet_savGoalEndDt(boolean value){
		this.isSet_savGoalEndDt= value;
	}
	/**
	 * 저축목표종료일자
	 */
	@XmlTransient
	public String getSavGoalEndDt(){
		return this.savGoalEndDt;
	}
	
	/**
	 * 저축목표종료일자
	 * 
	 * @param savGoalEndDt 저축목표종료일자
	 */
	public void setSavGoalEndDt(String savGoalEndDt){
		this.savGoalEndDt= savGoalEndDt;
		this.setIsSet_savGoalEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalAm= false;
	protected final boolean isSet_savGoalAm(){
		return this.isSet_savGoalAm;
	}
	private void setIsSet_savGoalAm(boolean value){
		this.isSet_savGoalAm= value;
	}
	/**
	 * 저축목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(double savGoalAm) {
		setSavGoalAm(BigDecimal.valueOf(savGoalAm));
	}
	/**
	 * 저축목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(long savGoalAm) {
		setSavGoalAm(BigDecimal.valueOf(savGoalAm));
	}
	/**
	 * 저축목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(String savGoalAm) {
		setSavGoalAm(new BigDecimal(savGoalAm));
	}
	/**
	 * 저축목표금액
	 */
	@XmlTransient
	public BigDecimal getSavGoalAm(){
		return this.savGoalAm;
	}
	
	/**
	 * 저축목표금액
	 * 
	 * @param savGoalAm 저축목표금액
	 */
	@JsonSetter("savGoalAm")
	public void setSavGoalAm(BigDecimal savGoalAm){
		this.savGoalAm= savGoalAm;
		this.setIsSet_savGoalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmAmBscd= false;
	protected final boolean isSet_cnsmAmBscd(){
		return this.isSet_cnsmAmBscd;
	}
	private void setIsSet_cnsmAmBscd(boolean value){
		this.isSet_cnsmAmBscd= value;
	}
	/**
	 * 소비금액기준코드
	 */
	@XmlTransient
	public String getCnsmAmBscd(){
		return this.cnsmAmBscd;
	}
	
	/**
	 * 소비금액기준코드
	 * 
	 * @param cnsmAmBscd 소비금액기준코드
	 */
	public void setCnsmAmBscd(String cnsmAmBscd){
		this.cnsmAmBscd= cnsmAmBscd;
		this.setIsSet_cnsmAmBscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmGoalAm= false;
	protected final boolean isSet_cnsmGoalAm(){
		return this.isSet_cnsmGoalAm;
	}
	private void setIsSet_cnsmGoalAm(boolean value){
		this.isSet_cnsmGoalAm= value;
	}
	/**
	 * 소비목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(double cnsmGoalAm) {
		setCnsmGoalAm(BigDecimal.valueOf(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(long cnsmGoalAm) {
		setCnsmGoalAm(BigDecimal.valueOf(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(String cnsmGoalAm) {
		setCnsmGoalAm(new BigDecimal(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 */
	@XmlTransient
	public BigDecimal getCnsmGoalAm(){
		return this.cnsmGoalAm;
	}
	
	/**
	 * 소비목표금액
	 * 
	 * @param cnsmGoalAm 소비목표금액
	 */
	@JsonSetter("cnsmGoalAm")
	public void setCnsmGoalAm(BigDecimal cnsmGoalAm){
		this.cnsmGoalAm= cnsmGoalAm;
		this.setIsSet_cnsmGoalAm(true);
	}
				
	@Override
	public PBPPbokSpceDtlEstUpdateSpcedtlgoalest_DIDT clone(){
		try{
			PBPPbokSpceDtlEstUpdateSpcedtlgoalest_DIDT object= (PBPPbokSpceDtlEstUpdateSpcedtlgoalest_DIDT)super.clone();
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
		result= prime * result + ((this.rprsAcno==null)?0:this.rprsAcno.hashCode());
		result= prime * result + ((this.spceSrno==null)?0:this.spceSrno.hashCode());
		result= prime * result + ((this.savGoalStaDt==null)?0:this.savGoalStaDt.hashCode());
		result= prime * result + ((this.savGoalEndDt==null)?0:this.savGoalEndDt.hashCode());
		result= prime * result + ((this.savGoalAm==null)?0:this.savGoalAm.hashCode());
		result= prime * result + ((this.cnsmAmBscd==null)?0:this.cnsmAmBscd.hashCode());
		result= prime * result + ((this.cnsmGoalAm==null)?0:this.cnsmGoalAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstUpdateSpcedtlgoalest_DIDT other= (PBPPbokSpceDtlEstUpdateSpcedtlgoalest_DIDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _rprsAcno= getRprsAcno();
			Object __rprsAcno= other.getRprsAcno();
			if ( _rprsAcno== null ) { if ( __rprsAcno!= null ) return false; }
			else if ( !_rprsAcno.equals(__rprsAcno) ) return false;
		}
		{
			Object _spceSrno= getSpceSrno();
			Object __spceSrno= other.getSpceSrno();
			if ( _spceSrno== null ) { if ( __spceSrno!= null ) return false; }
			else if ( !_spceSrno.equals(__spceSrno) ) return false;
		}
		{
			Object _savGoalStaDt= getSavGoalStaDt();
			Object __savGoalStaDt= other.getSavGoalStaDt();
			if ( _savGoalStaDt== null ) { if ( __savGoalStaDt!= null ) return false; }
			else if ( !_savGoalStaDt.equals(__savGoalStaDt) ) return false;
		}
		{
			Object _savGoalEndDt= getSavGoalEndDt();
			Object __savGoalEndDt= other.getSavGoalEndDt();
			if ( _savGoalEndDt== null ) { if ( __savGoalEndDt!= null ) return false; }
			else if ( !_savGoalEndDt.equals(__savGoalEndDt) ) return false;
		}
		{
			Object _savGoalAm= getSavGoalAm();
			Object __savGoalAm= other.getSavGoalAm();
			if ( _savGoalAm== null ) { if ( __savGoalAm!= null ) return false; }
			else if ( !_savGoalAm.equals(__savGoalAm) ) return false;
		}
		{
			Object _cnsmAmBscd= getCnsmAmBscd();
			Object __cnsmAmBscd= other.getCnsmAmBscd();
			if ( _cnsmAmBscd== null ) { if ( __cnsmAmBscd!= null ) return false; }
			else if ( !_cnsmAmBscd.equals(__cnsmAmBscd) ) return false;
		}
		{
			Object _cnsmGoalAm= getCnsmGoalAm();
			Object __cnsmGoalAm= other.getCnsmGoalAm();
			if ( _cnsmGoalAm== null ) { if ( __cnsmGoalAm!= null ) return false; }
			else if ( !_cnsmGoalAm.equals(__cnsmGoalAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstUpdateSpcedtlgoalest_DIDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("\tspceSrno: ");
		sb.append(spceSrno==null?"null":getSpceSrno());
		sb.append("\n");
		sb.append("\tsavGoalStaDt: ");
		sb.append(savGoalStaDt==null?"null":getSavGoalStaDt());
		sb.append("\n");
		sb.append("\tsavGoalEndDt: ");
		sb.append(savGoalEndDt==null?"null":getSavGoalEndDt());
		sb.append("\n");
		sb.append("\tsavGoalAm: ");
		sb.append(savGoalAm==null?"null":getSavGoalAm());
		sb.append("\n");
		sb.append("\tcnsmAmBscd: ");
		sb.append(cnsmAmBscd==null?"null":getCnsmAmBscd());
		sb.append("\n");
		sb.append("\tcnsmGoalAm: ");
		sb.append(cnsmGoalAm==null?"null":getCnsmGoalAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 13; /* rprsAcno */
		messageLen+= 10; /* spceSrno */
		messageLen+= 8; /* savGoalStaDt */
		messageLen+= 8; /* savGoalEndDt */
		messageLen+= 18; /* savGoalAm */
		messageLen+= 1; /* cnsmAmBscd */
		messageLen+= 18; /* cnsmGoalAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("rprsAcno");
		list.add("spceSrno");
		list.add("savGoalStaDt");
		list.add("savGoalEndDt");
		list.add("savGoalAm");
		list.add("cnsmAmBscd");
		list.add("cnsmGoalAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("rprsAcno", get("rprsAcno"));
		map.put("spceSrno", get("spceSrno"));
		map.put("savGoalStaDt", get("savGoalStaDt"));
		map.put("savGoalEndDt", get("savGoalEndDt"));
		map.put("savGoalAm", get("savGoalAm"));
		map.put("cnsmAmBscd", get("cnsmAmBscd"));
		map.put("cnsmGoalAm", get("cnsmGoalAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 805042946:/* rprsAcno */
			return getRprsAcno();
		case 2106037375:/* spceSrno */
			return getSpceSrno();
		case 1799097461:/* savGoalStaDt */
			return getSavGoalStaDt();
		case 1785992304:/* savGoalEndDt */
			return getSavGoalEndDt();
		case -660526937:/* savGoalAm */
			return getSavGoalAm();
		case -754478301:/* cnsmAmBscd */
			return getCnsmAmBscd();
		case -579940604:/* cnsmGoalAm */
			return getCnsmGoalAm();
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
		case 805042946:/* rprsAcno */
			setRprsAcno((String)value);
			break;
		case 2106037375:/* spceSrno */
			setSpceSrno((String)value);
			break;
		case 1799097461:/* savGoalStaDt */
			setSavGoalStaDt((String)value);
			break;
		case 1785992304:/* savGoalEndDt */
			setSavGoalEndDt((String)value);
			break;
		case -660526937:/* savGoalAm */
			if ( value instanceof String ){
				setSavGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setSavGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSavGoalAm((Long)value);
			}
			else{
				setSavGoalAm((BigDecimal)value);
			}
			break;
		case -754478301:/* cnsmAmBscd */
			setCnsmAmBscd((String)value);
			break;
		case -579940604:/* cnsmGoalAm */
			if ( value instanceof String ){
				setCnsmGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setCnsmGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCnsmGoalAm((Long)value);
			}
			else{
				setCnsmGoalAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
