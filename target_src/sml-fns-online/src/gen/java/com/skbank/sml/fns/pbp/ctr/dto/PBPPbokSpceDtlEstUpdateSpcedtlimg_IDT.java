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
import io.swagger.annotations.ApiModelProperty;
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
	"itcsno", "rprsAcno", "spceSrno", "spceNm", "spceIconNo"
}, name="PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT")
@XmlRootElement(name="PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT")
@BxmCategory(logicalName="공간.상세.이미지.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -2135884126L;
	
	
	
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
	 * 공간명
	 */
	@ApiModelProperty(
		name = "spceNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceNm")
	@BxmOmm_Field(length=50, decimal=0, description="공간명", align="left", fill="")
	private String spceNm= "";
	
	
	/**
	 * 공간아이콘번호
	 */
	@ApiModelProperty(
		name = "spceIconNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceIconNo")
	@BxmOmm_Field(length=2, decimal=0, description="공간아이콘번호", align="left", fill="")
	private String spceIconNo= "";
	
	
	
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
	private boolean isSet_spceNm= false;
	protected final boolean isSet_spceNm(){
		return this.isSet_spceNm;
	}
	private void setIsSet_spceNm(boolean value){
		this.isSet_spceNm= value;
	}
	/**
	 * 공간명
	 */
	@XmlTransient
	public String getSpceNm(){
		return this.spceNm;
	}
	
	/**
	 * 공간명
	 * 
	 * @param spceNm 공간명
	 */
	public void setSpceNm(String spceNm){
		this.spceNm= spceNm;
		this.setIsSet_spceNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceIconNo= false;
	protected final boolean isSet_spceIconNo(){
		return this.isSet_spceIconNo;
	}
	private void setIsSet_spceIconNo(boolean value){
		this.isSet_spceIconNo= value;
	}
	/**
	 * 공간아이콘번호
	 */
	@XmlTransient
	public String getSpceIconNo(){
		return this.spceIconNo;
	}
	
	/**
	 * 공간아이콘번호
	 * 
	 * @param spceIconNo 공간아이콘번호
	 */
	public void setSpceIconNo(String spceIconNo){
		this.spceIconNo= spceIconNo;
		this.setIsSet_spceIconNo(true);
	}
				
	@Override
	public PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT clone(){
		try{
			PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT object= (PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT)super.clone();
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
		result= prime * result + ((this.spceNm==null)?0:this.spceNm.hashCode());
		result= prime * result + ((this.spceIconNo==null)?0:this.spceIconNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT other= (PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT)obj;
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
			Object _spceNm= getSpceNm();
			Object __spceNm= other.getSpceNm();
			if ( _spceNm== null ) { if ( __spceNm!= null ) return false; }
			else if ( !_spceNm.equals(__spceNm) ) return false;
		}
		{
			Object _spceIconNo= getSpceIconNo();
			Object __spceIconNo= other.getSpceIconNo();
			if ( _spceIconNo== null ) { if ( __spceIconNo!= null ) return false; }
			else if ( !_spceIconNo.equals(__spceIconNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstUpdateSpcedtlimg_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("\tspceSrno: ");
		sb.append(spceSrno==null?"null":getSpceSrno());
		sb.append("\n");
		sb.append("\tspceNm: ");
		sb.append(spceNm==null?"null":getSpceNm());
		sb.append("\n");
		sb.append("\tspceIconNo: ");
		sb.append(spceIconNo==null?"null":getSpceIconNo());
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
		messageLen+= 50; /* spceNm */
		messageLen+= 2; /* spceIconNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("rprsAcno");
		list.add("spceSrno");
		list.add("spceNm");
		list.add("spceIconNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("rprsAcno", get("rprsAcno"));
		map.put("spceSrno", get("spceSrno"));
		map.put("spceNm", get("spceNm"));
		map.put("spceIconNo", get("spceIconNo"));
	
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
		case -896131682:/* spceNm */
			return getSpceNm();
		case 672207993:/* spceIconNo */
			return getSpceIconNo();
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
		case -896131682:/* spceNm */
			setSpceNm((String)value);
			break;
		case 672207993:/* spceIconNo */
			setSpceIconNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
