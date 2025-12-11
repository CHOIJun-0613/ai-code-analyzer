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
	"prcDis", "atpmMngNo", "atpmCctnSpceSrno", "rprsAcno"
}, name="PBPPbokSpceDtlEstMngRawActatpminf_DIDT")
@XmlRootElement(name="PBPPbokSpceDtlEstMngRawActatpminf_DIDT")
@BxmCategory(logicalName="입출금계좌.자동납부.등록.DBM.입력.IO", description="") 
public class PBPPbokSpceDtlEstMngRawActatpminf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -784015379L;
	
	
	
	/**
	 * 처리구분
	 */
	@ApiModelProperty(
		name = "prcDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prcDis")
	@BxmOmm_Field(length=2, decimal=0, description="처리구분", align="left", fill="")
	private String prcDis= "";
	
	
	/**
	 * 자동납부관리번호
	 */
	@ApiModelProperty(
		name = "atpmMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmMngNo")
	@BxmOmm_Field(length=20, decimal=0, description="자동납부관리번호", align="left", fill="")
	private String atpmMngNo= "";
	
	
	/**
	 * 자동납부연결공간일련번호
	 */
	@ApiModelProperty(
		name = "atpmCctnSpceSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmCctnSpceSrno")
	@BxmOmm_Field(length=10, decimal=0, description="자동납부연결공간일련번호", align="left", fill="")
	private String atpmCctnSpceSrno= "";
	
	
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
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prcDis= false;
	protected final boolean isSet_prcDis(){
		return this.isSet_prcDis;
	}
	private void setIsSet_prcDis(boolean value){
		this.isSet_prcDis= value;
	}
	/**
	 * 처리구분
	 */
	@XmlTransient
	public String getPrcDis(){
		return this.prcDis;
	}
	
	/**
	 * 처리구분
	 * 
	 * @param prcDis 처리구분
	 */
	public void setPrcDis(String prcDis){
		this.prcDis= prcDis;
		this.setIsSet_prcDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmMngNo= false;
	protected final boolean isSet_atpmMngNo(){
		return this.isSet_atpmMngNo;
	}
	private void setIsSet_atpmMngNo(boolean value){
		this.isSet_atpmMngNo= value;
	}
	/**
	 * 자동납부관리번호
	 */
	@XmlTransient
	public String getAtpmMngNo(){
		return this.atpmMngNo;
	}
	
	/**
	 * 자동납부관리번호
	 * 
	 * @param atpmMngNo 자동납부관리번호
	 */
	public void setAtpmMngNo(String atpmMngNo){
		this.atpmMngNo= atpmMngNo;
		this.setIsSet_atpmMngNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmCctnSpceSrno= false;
	protected final boolean isSet_atpmCctnSpceSrno(){
		return this.isSet_atpmCctnSpceSrno;
	}
	private void setIsSet_atpmCctnSpceSrno(boolean value){
		this.isSet_atpmCctnSpceSrno= value;
	}
	/**
	 * 자동납부연결공간일련번호
	 */
	@XmlTransient
	public String getAtpmCctnSpceSrno(){
		return this.atpmCctnSpceSrno;
	}
	
	/**
	 * 자동납부연결공간일련번호
	 * 
	 * @param atpmCctnSpceSrno 자동납부연결공간일련번호
	 */
	public void setAtpmCctnSpceSrno(String atpmCctnSpceSrno){
		this.atpmCctnSpceSrno= atpmCctnSpceSrno;
		this.setIsSet_atpmCctnSpceSrno(true);
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
				
	@Override
	public PBPPbokSpceDtlEstMngRawActatpminf_DIDT clone(){
		try{
			PBPPbokSpceDtlEstMngRawActatpminf_DIDT object= (PBPPbokSpceDtlEstMngRawActatpminf_DIDT)super.clone();
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
		
		result= prime * result + ((this.prcDis==null)?0:this.prcDis.hashCode());
		result= prime * result + ((this.atpmMngNo==null)?0:this.atpmMngNo.hashCode());
		result= prime * result + ((this.atpmCctnSpceSrno==null)?0:this.atpmCctnSpceSrno.hashCode());
		result= prime * result + ((this.rprsAcno==null)?0:this.rprsAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstMngRawActatpminf_DIDT other= (PBPPbokSpceDtlEstMngRawActatpminf_DIDT)obj;
		{
			Object _prcDis= getPrcDis();
			Object __prcDis= other.getPrcDis();
			if ( _prcDis== null ) { if ( __prcDis!= null ) return false; }
			else if ( !_prcDis.equals(__prcDis) ) return false;
		}
		{
			Object _atpmMngNo= getAtpmMngNo();
			Object __atpmMngNo= other.getAtpmMngNo();
			if ( _atpmMngNo== null ) { if ( __atpmMngNo!= null ) return false; }
			else if ( !_atpmMngNo.equals(__atpmMngNo) ) return false;
		}
		{
			Object _atpmCctnSpceSrno= getAtpmCctnSpceSrno();
			Object __atpmCctnSpceSrno= other.getAtpmCctnSpceSrno();
			if ( _atpmCctnSpceSrno== null ) { if ( __atpmCctnSpceSrno!= null ) return false; }
			else if ( !_atpmCctnSpceSrno.equals(__atpmCctnSpceSrno) ) return false;
		}
		{
			Object _rprsAcno= getRprsAcno();
			Object __rprsAcno= other.getRprsAcno();
			if ( _rprsAcno== null ) { if ( __rprsAcno!= null ) return false; }
			else if ( !_rprsAcno.equals(__rprsAcno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstMngRawActatpminf_DIDT.class.getName()).append(":\n");
		sb.append("\tprcDis: ");
		sb.append(prcDis==null?"null":getPrcDis());
		sb.append("\n");
		sb.append("\tatpmMngNo: ");
		sb.append(atpmMngNo==null?"null":getAtpmMngNo());
		sb.append("\n");
		sb.append("\tatpmCctnSpceSrno: ");
		sb.append(atpmCctnSpceSrno==null?"null":getAtpmCctnSpceSrno());
		sb.append("\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* prcDis */
		messageLen+= 20; /* atpmMngNo */
		messageLen+= 10; /* atpmCctnSpceSrno */
		messageLen+= 13; /* rprsAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("prcDis");
		list.add("atpmMngNo");
		list.add("atpmCctnSpceSrno");
		list.add("rprsAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("prcDis", get("prcDis"));
		map.put("atpmMngNo", get("atpmMngNo"));
		map.put("atpmCctnSpceSrno", get("atpmCctnSpceSrno"));
		map.put("rprsAcno", get("rprsAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -980202963:/* prcDis */
			return getPrcDis();
		case 589376439:/* atpmMngNo */
			return getAtpmMngNo();
		case 243500809:/* atpmCctnSpceSrno */
			return getAtpmCctnSpceSrno();
		case 805042946:/* rprsAcno */
			return getRprsAcno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -980202963:/* prcDis */
			setPrcDis((String)value);
			break;
		case 589376439:/* atpmMngNo */
			setAtpmMngNo((String)value);
			break;
		case 243500809:/* atpmCctnSpceSrno */
			setAtpmCctnSpceSrno((String)value);
			break;
		case 805042946:/* rprsAcno */
			setRprsAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
