/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.ctr.dto;

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
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"itcsno", "acno", "actNm", "actTotAm"
}, name="PBPPbokSpceBscMngInsertSubspceinf_IDT")
@XmlRootElement(name="PBPPbokSpceBscMngInsertSubspceinf_IDT")
@BxmCategory(logicalName="메인.공간.정보.등록.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceBscMngInsertSubspceinf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2052075528L;
	
	
	
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
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String acno= "";
	
	
	/**
	 * 계좌명
	 */
	@ApiModelProperty(
		name = "actNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actNm")
	@BxmOmm_Field(length=20, decimal=0, description="계좌명", align="left", fill="")
	private String actNm= "";
	
	
	/**
	 * 계좌총금액
	 */
	@ApiModelProperty(
		name = "actTotAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("actTotAm")
	@BxmOmm_Field(length=18, decimal=3, description="계좌총금액", align="right", fill="")
	private BigDecimal actTotAm= new BigDecimal("0");
	
	
	
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
	private boolean isSet_acno= false;
	protected final boolean isSet_acno(){
		return this.isSet_acno;
	}
	private void setIsSet_acno(boolean value){
		this.isSet_acno= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAcno(){
		return this.acno;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param acno 계좌번호
	 */
	public void setAcno(String acno){
		this.acno= acno;
		this.setIsSet_acno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actNm= false;
	protected final boolean isSet_actNm(){
		return this.isSet_actNm;
	}
	private void setIsSet_actNm(boolean value){
		this.isSet_actNm= value;
	}
	/**
	 * 계좌명
	 */
	@XmlTransient
	public String getActNm(){
		return this.actNm;
	}
	
	/**
	 * 계좌명
	 * 
	 * @param actNm 계좌명
	 */
	public void setActNm(String actNm){
		this.actNm= actNm;
		this.setIsSet_actNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actTotAm= false;
	protected final boolean isSet_actTotAm(){
		return this.isSet_actTotAm;
	}
	private void setIsSet_actTotAm(boolean value){
		this.isSet_actTotAm= value;
	}
	/**
	 * 계좌총금액
	 * BigDecimal - Double value setter
	 *
	 * @Param actTotAm 계좌총금액
	 */
	public void setActTotAm(double actTotAm) {
		setActTotAm(BigDecimal.valueOf(actTotAm));
	}
	/**
	 * 계좌총금액
	 * BigDecimal - Long value setter
	 *
	 * @Param actTotAm 계좌총금액
	 */
	public void setActTotAm(long actTotAm) {
		setActTotAm(BigDecimal.valueOf(actTotAm));
	}
	/**
	 * 계좌총금액
	 * BigDecimal - String value setter
	 *
	 * @Param actTotAm 계좌총금액
	 */
	public void setActTotAm(String actTotAm) {
		setActTotAm(new BigDecimal(actTotAm));
	}
	/**
	 * 계좌총금액
	 */
	@XmlTransient
	public BigDecimal getActTotAm(){
		return this.actTotAm;
	}
	
	/**
	 * 계좌총금액
	 * 
	 * @param actTotAm 계좌총금액
	 */
	@JsonSetter("actTotAm")
	public void setActTotAm(BigDecimal actTotAm){
		this.actTotAm= actTotAm;
		this.setIsSet_actTotAm(true);
	}
				
	@Override
	public PBPPbokSpceBscMngInsertSubspceinf_IDT clone(){
		try{
			PBPPbokSpceBscMngInsertSubspceinf_IDT object= (PBPPbokSpceBscMngInsertSubspceinf_IDT)super.clone();
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
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.actNm==null)?0:this.actNm.hashCode());
		result= prime * result + ((this.actTotAm==null)?0:this.actTotAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngInsertSubspceinf_IDT other= (PBPPbokSpceBscMngInsertSubspceinf_IDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _actNm= getActNm();
			Object __actNm= other.getActNm();
			if ( _actNm== null ) { if ( __actNm!= null ) return false; }
			else if ( !_actNm.equals(__actNm) ) return false;
		}
		{
			Object _actTotAm= getActTotAm();
			Object __actTotAm= other.getActTotAm();
			if ( _actTotAm== null ) { if ( __actTotAm!= null ) return false; }
			else if ( !_actTotAm.equals(__actTotAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngInsertSubspceinf_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tactNm: ");
		sb.append(actNm==null?"null":getActNm());
		sb.append("\n");
		sb.append("\tactTotAm: ");
		sb.append(actTotAm==null?"null":getActTotAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 20; /* acno */
		messageLen+= 20; /* actNm */
		messageLen+= 18; /* actTotAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("acno");
		list.add("actNm");
		list.add("actTotAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("acno", get("acno"));
		map.put("actNm", get("actNm"));
		map.put("actTotAm", get("actTotAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 2988387:/* acno */
			return getAcno();
		case 92644849:/* actNm */
			return getActNm();
		case -1675560461:/* actTotAm */
			return getActTotAm();
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
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case 92644849:/* actNm */
			setActNm((String)value);
			break;
		case -1675560461:/* actTotAm */
			if ( value instanceof String ){
				setActTotAm((String)value);
			}
			else if ( value instanceof Double ){
				setActTotAm((Double)value);
			}
			else if ( value instanceof Long ){
				setActTotAm((Long)value);
			}
			else{
				setActTotAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
