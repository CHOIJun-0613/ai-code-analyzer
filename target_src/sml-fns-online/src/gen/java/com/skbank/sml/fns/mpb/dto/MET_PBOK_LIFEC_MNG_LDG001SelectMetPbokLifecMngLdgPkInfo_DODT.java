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
	"metMngNo", "metLifecEstYn", "metLifecAm", "metLifecEstDt", "metLifecBasDd", "lstDbChgId", "lstDbChgDtm"
}, name="MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT")
@XmlRootElement(name="MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT")
@BxmCategory(logicalName="모임통장생활비관리원장 출력", description="") 
public class MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1127139260L;
	
	
	
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
	 * 모임생활비설정여부
	 */
	@ApiModelProperty(
		name = "metLifecEstYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metLifecEstYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임생활비설정여부", align="left", fill="")
	private String metLifecEstYn= "";
	
	
	/**
	 * 모임생활비금액
	 */
	@ApiModelProperty(
		name = "metLifecAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("metLifecAm")
	@BxmOmm_Field(length=19, decimal=3, description="모임생활비금액", align="right", fill="")
	private BigDecimal metLifecAm= new BigDecimal("0");
	
	
	/**
	 * 모임생활비설정일자
	 */
	@ApiModelProperty(
		name = "metLifecEstDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metLifecEstDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임생활비설정일자", align="left", fill="")
	private String metLifecEstDt= "";
	
	
	/**
	 * 모임생활비기준일
	 */
	@ApiModelProperty(
		name = "metLifecBasDd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metLifecBasDd")
	@BxmOmm_Field(length=2, decimal=0, description="모임생활비기준일", align="left", fill="")
	private String metLifecBasDd= "";
	
	
	/**
	 * 최종DB변경ID
	 */
	@ApiModelProperty(
		name = "lstDbChgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstDbChgId")
	@BxmOmm_Field(length=8, decimal=0, description="최종DB변경ID", align="left", fill="")
	private String lstDbChgId= "";
	
	
	/**
	 * 최종DB변경일시
	 */
	@ApiModelProperty(
		name = "lstDbChgDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstDbChgDtm")
	@BxmOmm_Field(length=20, decimal=0, description="최종DB변경일시", align="left", fill="")
	private String lstDbChgDtm= "";
	
	
	
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
	private boolean isSet_metLifecEstYn= false;
	protected final boolean isSet_metLifecEstYn(){
		return this.isSet_metLifecEstYn;
	}
	private void setIsSet_metLifecEstYn(boolean value){
		this.isSet_metLifecEstYn= value;
	}
	/**
	 * 모임생활비설정여부
	 */
	@XmlTransient
	public String getMetLifecEstYn(){
		return this.metLifecEstYn;
	}
	
	/**
	 * 모임생활비설정여부
	 * 
	 * @param metLifecEstYn 모임생활비설정여부
	 */
	public void setMetLifecEstYn(String metLifecEstYn){
		this.metLifecEstYn= metLifecEstYn;
		this.setIsSet_metLifecEstYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metLifecAm= false;
	protected final boolean isSet_metLifecAm(){
		return this.isSet_metLifecAm;
	}
	private void setIsSet_metLifecAm(boolean value){
		this.isSet_metLifecAm= value;
	}
	/**
	 * 모임생활비금액
	 * BigDecimal - Double value setter
	 *
	 * @Param metLifecAm 모임생활비금액
	 */
	public void setMetLifecAm(double metLifecAm) {
		setMetLifecAm(BigDecimal.valueOf(metLifecAm));
	}
	/**
	 * 모임생활비금액
	 * BigDecimal - Long value setter
	 *
	 * @Param metLifecAm 모임생활비금액
	 */
	public void setMetLifecAm(long metLifecAm) {
		setMetLifecAm(BigDecimal.valueOf(metLifecAm));
	}
	/**
	 * 모임생활비금액
	 * BigDecimal - String value setter
	 *
	 * @Param metLifecAm 모임생활비금액
	 */
	public void setMetLifecAm(String metLifecAm) {
		setMetLifecAm(new BigDecimal(metLifecAm));
	}
	/**
	 * 모임생활비금액
	 */
	@XmlTransient
	public BigDecimal getMetLifecAm(){
		return this.metLifecAm;
	}
	
	/**
	 * 모임생활비금액
	 * 
	 * @param metLifecAm 모임생활비금액
	 */
	@JsonSetter("metLifecAm")
	public void setMetLifecAm(BigDecimal metLifecAm){
		this.metLifecAm= metLifecAm;
		this.setIsSet_metLifecAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metLifecEstDt= false;
	protected final boolean isSet_metLifecEstDt(){
		return this.isSet_metLifecEstDt;
	}
	private void setIsSet_metLifecEstDt(boolean value){
		this.isSet_metLifecEstDt= value;
	}
	/**
	 * 모임생활비설정일자
	 */
	@XmlTransient
	public String getMetLifecEstDt(){
		return this.metLifecEstDt;
	}
	
	/**
	 * 모임생활비설정일자
	 * 
	 * @param metLifecEstDt 모임생활비설정일자
	 */
	public void setMetLifecEstDt(String metLifecEstDt){
		this.metLifecEstDt= metLifecEstDt;
		this.setIsSet_metLifecEstDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metLifecBasDd= false;
	protected final boolean isSet_metLifecBasDd(){
		return this.isSet_metLifecBasDd;
	}
	private void setIsSet_metLifecBasDd(boolean value){
		this.isSet_metLifecBasDd= value;
	}
	/**
	 * 모임생활비기준일
	 */
	@XmlTransient
	public String getMetLifecBasDd(){
		return this.metLifecBasDd;
	}
	
	/**
	 * 모임생활비기준일
	 * 
	 * @param metLifecBasDd 모임생활비기준일
	 */
	public void setMetLifecBasDd(String metLifecBasDd){
		this.metLifecBasDd= metLifecBasDd;
		this.setIsSet_metLifecBasDd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstDbChgId= false;
	protected final boolean isSet_lstDbChgId(){
		return this.isSet_lstDbChgId;
	}
	private void setIsSet_lstDbChgId(boolean value){
		this.isSet_lstDbChgId= value;
	}
	/**
	 * 최종DB변경ID
	 */
	@XmlTransient
	public String getLstDbChgId(){
		return this.lstDbChgId;
	}
	
	/**
	 * 최종DB변경ID
	 * 
	 * @param lstDbChgId 최종DB변경ID
	 */
	public void setLstDbChgId(String lstDbChgId){
		this.lstDbChgId= lstDbChgId;
		this.setIsSet_lstDbChgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstDbChgDtm= false;
	protected final boolean isSet_lstDbChgDtm(){
		return this.isSet_lstDbChgDtm;
	}
	private void setIsSet_lstDbChgDtm(boolean value){
		this.isSet_lstDbChgDtm= value;
	}
	/**
	 * 최종DB변경일시
	 */
	@XmlTransient
	public String getLstDbChgDtm(){
		return this.lstDbChgDtm;
	}
	
	/**
	 * 최종DB변경일시
	 * 
	 * @param lstDbChgDtm 최종DB변경일시
	 */
	public void setLstDbChgDtm(String lstDbChgDtm){
		this.lstDbChgDtm= lstDbChgDtm;
		this.setIsSet_lstDbChgDtm(true);
	}
				
	@Override
	public MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT clone(){
		try{
			MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT object= (MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT)super.clone();
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
		result= prime * result + ((this.metLifecEstYn==null)?0:this.metLifecEstYn.hashCode());
		result= prime * result + ((this.metLifecAm==null)?0:this.metLifecAm.hashCode());
		result= prime * result + ((this.metLifecEstDt==null)?0:this.metLifecEstDt.hashCode());
		result= prime * result + ((this.metLifecBasDd==null)?0:this.metLifecBasDd.hashCode());
		result= prime * result + ((this.lstDbChgId==null)?0:this.lstDbChgId.hashCode());
		result= prime * result + ((this.lstDbChgDtm==null)?0:this.lstDbChgDtm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT other= (MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metLifecEstYn= getMetLifecEstYn();
			Object __metLifecEstYn= other.getMetLifecEstYn();
			if ( _metLifecEstYn== null ) { if ( __metLifecEstYn!= null ) return false; }
			else if ( !_metLifecEstYn.equals(__metLifecEstYn) ) return false;
		}
		{
			Object _metLifecAm= getMetLifecAm();
			Object __metLifecAm= other.getMetLifecAm();
			if ( _metLifecAm== null ) { if ( __metLifecAm!= null ) return false; }
			else if ( !_metLifecAm.equals(__metLifecAm) ) return false;
		}
		{
			Object _metLifecEstDt= getMetLifecEstDt();
			Object __metLifecEstDt= other.getMetLifecEstDt();
			if ( _metLifecEstDt== null ) { if ( __metLifecEstDt!= null ) return false; }
			else if ( !_metLifecEstDt.equals(__metLifecEstDt) ) return false;
		}
		{
			Object _metLifecBasDd= getMetLifecBasDd();
			Object __metLifecBasDd= other.getMetLifecBasDd();
			if ( _metLifecBasDd== null ) { if ( __metLifecBasDd!= null ) return false; }
			else if ( !_metLifecBasDd.equals(__metLifecBasDd) ) return false;
		}
		{
			Object _lstDbChgId= getLstDbChgId();
			Object __lstDbChgId= other.getLstDbChgId();
			if ( _lstDbChgId== null ) { if ( __lstDbChgId!= null ) return false; }
			else if ( !_lstDbChgId.equals(__lstDbChgId) ) return false;
		}
		{
			Object _lstDbChgDtm= getLstDbChgDtm();
			Object __lstDbChgDtm= other.getLstDbChgDtm();
			if ( _lstDbChgDtm== null ) { if ( __lstDbChgDtm!= null ) return false; }
			else if ( !_lstDbChgDtm.equals(__lstDbChgDtm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetLifecEstYn: ");
		sb.append(metLifecEstYn==null?"null":getMetLifecEstYn());
		sb.append("\n");
		sb.append("\tmetLifecAm: ");
		sb.append(metLifecAm==null?"null":getMetLifecAm());
		sb.append("\n");
		sb.append("\tmetLifecEstDt: ");
		sb.append(metLifecEstDt==null?"null":getMetLifecEstDt());
		sb.append("\n");
		sb.append("\tmetLifecBasDd: ");
		sb.append(metLifecBasDd==null?"null":getMetLifecBasDd());
		sb.append("\n");
		sb.append("\tlstDbChgId: ");
		sb.append(lstDbChgId==null?"null":getLstDbChgId());
		sb.append("\n");
		sb.append("\tlstDbChgDtm: ");
		sb.append(lstDbChgDtm==null?"null":getLstDbChgDtm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		messageLen+= 1; /* metLifecEstYn */
		messageLen+= 19; /* metLifecAm */
		messageLen+= 8; /* metLifecEstDt */
		messageLen+= 2; /* metLifecBasDd */
		messageLen+= 8; /* lstDbChgId */
		messageLen+= 20; /* lstDbChgDtm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metLifecEstYn");
		list.add("metLifecAm");
		list.add("metLifecEstDt");
		list.add("metLifecBasDd");
		list.add("lstDbChgId");
		list.add("lstDbChgDtm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metLifecEstYn", get("metLifecEstYn"));
		map.put("metLifecAm", get("metLifecAm"));
		map.put("metLifecEstDt", get("metLifecEstDt"));
		map.put("metLifecBasDd", get("metLifecBasDd"));
		map.put("lstDbChgId", get("lstDbChgId"));
		map.put("lstDbChgDtm", get("lstDbChgDtm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 1407156624:/* metLifecEstYn */
			return getMetLifecEstYn();
		case 27295223:/* metLifecAm */
			return getMetLifecAm();
		case 1407155979:/* metLifecEstDt */
			return getMetLifecEstDt();
		case 1403848201:/* metLifecBasDd */
			return getMetLifecBasDd();
		case 1946521330:/* lstDbChgId */
			return getLstDbChgId();
		case 212614886:/* lstDbChgDtm */
			return getLstDbChgDtm();
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
		case 1407156624:/* metLifecEstYn */
			setMetLifecEstYn((String)value);
			break;
		case 27295223:/* metLifecAm */
			if ( value instanceof String ){
				setMetLifecAm((String)value);
			}
			else if ( value instanceof Double ){
				setMetLifecAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMetLifecAm((Long)value);
			}
			else{
				setMetLifecAm((BigDecimal)value);
			}
			break;
		case 1407155979:/* metLifecEstDt */
			setMetLifecEstDt((String)value);
			break;
		case 1403848201:/* metLifecBasDd */
			setMetLifecBasDd((String)value);
			break;
		case 1946521330:/* lstDbChgId */
			setLstDbChgId((String)value);
			break;
		case 212614886:/* lstDbChgDtm */
			setLstDbChgDtm((String)value);
			break;
		default:
			break;
		}
	}
	
}
