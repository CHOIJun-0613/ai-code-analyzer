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

/**
 * 
 */
@XmlType(propOrder={
	"itcsno", "rprsAcno", "spceSrno", "spceMvbAm", "amWdrYn"
}, name="PBPPbokSpceDtlMngUpdateSpcedtlam_IDT")
@XmlRootElement(name="PBPPbokSpceDtlMngUpdateSpcedtlam_IDT")
@BxmCategory(logicalName="공간상세금액수정정보.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceDtlMngUpdateSpcedtlam_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1232956289L;
	
	
	
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
	 * 공간이동금액
	 */
	@ApiModelProperty(
		name = "spceMvbAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("spceMvbAm")
	@BxmOmm_Field(length=18, decimal=3, description="공간이동금액", align="right", fill="")
	private BigDecimal spceMvbAm= new BigDecimal("0");
	
	
	/**
	 * 금액출금여부
	 */
	@ApiModelProperty(
		name = "amWdrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("amWdrYn")
	@BxmOmm_Field(length=1, decimal=0, description="금액출금여부", align="left", fill="")
	private String amWdrYn= "";
	
	
	
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
	private boolean isSet_spceMvbAm= false;
	protected final boolean isSet_spceMvbAm(){
		return this.isSet_spceMvbAm;
	}
	private void setIsSet_spceMvbAm(boolean value){
		this.isSet_spceMvbAm= value;
	}
	/**
	 * 공간이동금액
	 * BigDecimal - Double value setter
	 *
	 * @Param spceMvbAm 공간이동금액
	 */
	public void setSpceMvbAm(double spceMvbAm) {
		setSpceMvbAm(BigDecimal.valueOf(spceMvbAm));
	}
	/**
	 * 공간이동금액
	 * BigDecimal - Long value setter
	 *
	 * @Param spceMvbAm 공간이동금액
	 */
	public void setSpceMvbAm(long spceMvbAm) {
		setSpceMvbAm(BigDecimal.valueOf(spceMvbAm));
	}
	/**
	 * 공간이동금액
	 * BigDecimal - String value setter
	 *
	 * @Param spceMvbAm 공간이동금액
	 */
	public void setSpceMvbAm(String spceMvbAm) {
		setSpceMvbAm(new BigDecimal(spceMvbAm));
	}
	/**
	 * 공간이동금액
	 */
	@XmlTransient
	public BigDecimal getSpceMvbAm(){
		return this.spceMvbAm;
	}
	
	/**
	 * 공간이동금액
	 * 
	 * @param spceMvbAm 공간이동금액
	 */
	@JsonSetter("spceMvbAm")
	public void setSpceMvbAm(BigDecimal spceMvbAm){
		this.spceMvbAm= spceMvbAm;
		this.setIsSet_spceMvbAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_amWdrYn= false;
	protected final boolean isSet_amWdrYn(){
		return this.isSet_amWdrYn;
	}
	private void setIsSet_amWdrYn(boolean value){
		this.isSet_amWdrYn= value;
	}
	/**
	 * 금액출금여부
	 */
	@XmlTransient
	public String getAmWdrYn(){
		return this.amWdrYn;
	}
	
	/**
	 * 금액출금여부
	 * 
	 * @param amWdrYn 금액출금여부
	 */
	public void setAmWdrYn(String amWdrYn){
		this.amWdrYn= amWdrYn;
		this.setIsSet_amWdrYn(true);
	}
				
	@Override
	public PBPPbokSpceDtlMngUpdateSpcedtlam_IDT clone(){
		try{
			PBPPbokSpceDtlMngUpdateSpcedtlam_IDT object= (PBPPbokSpceDtlMngUpdateSpcedtlam_IDT)super.clone();
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
		result= prime * result + ((this.spceMvbAm==null)?0:this.spceMvbAm.hashCode());
		result= prime * result + ((this.amWdrYn==null)?0:this.amWdrYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlMngUpdateSpcedtlam_IDT other= (PBPPbokSpceDtlMngUpdateSpcedtlam_IDT)obj;
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
			Object _spceMvbAm= getSpceMvbAm();
			Object __spceMvbAm= other.getSpceMvbAm();
			if ( _spceMvbAm== null ) { if ( __spceMvbAm!= null ) return false; }
			else if ( !_spceMvbAm.equals(__spceMvbAm) ) return false;
		}
		{
			Object _amWdrYn= getAmWdrYn();
			Object __amWdrYn= other.getAmWdrYn();
			if ( _amWdrYn== null ) { if ( __amWdrYn!= null ) return false; }
			else if ( !_amWdrYn.equals(__amWdrYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlMngUpdateSpcedtlam_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("\tspceSrno: ");
		sb.append(spceSrno==null?"null":getSpceSrno());
		sb.append("\n");
		sb.append("\tspceMvbAm: ");
		sb.append(spceMvbAm==null?"null":getSpceMvbAm());
		sb.append("\n");
		sb.append("\tamWdrYn: ");
		sb.append(amWdrYn==null?"null":getAmWdrYn());
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
		messageLen+= 18; /* spceMvbAm */
		messageLen+= 1; /* amWdrYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("rprsAcno");
		list.add("spceSrno");
		list.add("spceMvbAm");
		list.add("amWdrYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("rprsAcno", get("rprsAcno"));
		map.put("spceSrno", get("spceSrno"));
		map.put("spceMvbAm", get("spceMvbAm"));
		map.put("amWdrYn", get("amWdrYn"));
	
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
		case 857214374:/* spceMvbAm */
			return getSpceMvbAm();
		case -902440850:/* amWdrYn */
			return getAmWdrYn();
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
		case 857214374:/* spceMvbAm */
			if ( value instanceof String ){
				setSpceMvbAm((String)value);
			}
			else if ( value instanceof Double ){
				setSpceMvbAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSpceMvbAm((Long)value);
			}
			else{
				setSpceMvbAm((BigDecimal)value);
			}
			break;
		case -902440850:/* amWdrYn */
			setAmWdrYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
