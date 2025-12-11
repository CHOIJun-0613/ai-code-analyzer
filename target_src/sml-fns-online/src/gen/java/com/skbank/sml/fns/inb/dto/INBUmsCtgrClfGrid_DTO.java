/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.dto;

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
 * UMS카테고리분류코드GRID_DTO
 */
@XmlType(propOrder={
	"codeName", "cL1Cd", "cL2Cd", "cAlCd", "codeName2", "seq"
}, name="INBUmsCtgrClfGrid_DTO")
@XmlRootElement(name="INBUmsCtgrClfGrid_DTO")
@BxmCategory(logicalName="UMS카테고리분류코드GRID_DTO", description="UMS카테고리분류코드GRID_DTO") 
public class INBUmsCtgrClfGrid_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1521422521L;
	
	
	
	/**
	 * 분류코드명
	 */
	@ApiModelProperty(
		name = "codeName"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("codeName")
	@BxmOmm_Field(length=100, decimal=0, description="분류코드명", align="left", fill="")
	private String codeName= "";
	
	
	/**
	 * 분류코드1
	 */
	@ApiModelProperty(
		name = "cL1Cd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cL1Cd")
	@BxmOmm_Field(length=2, decimal=0, description="분류코드1", align="left", fill="")
	private String cL1Cd= "";
	
	
	/**
	 * 분류코드
	 */
	@ApiModelProperty(
		name = "cL2Cd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cL2Cd")
	@BxmOmm_Field(length=2, decimal=0, description="분류코드", align="left", fill="")
	private String cL2Cd= "";
	
	
	/**
	 * 분류코드합
	 */
	@ApiModelProperty(
		name = "cAlCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cAlCd")
	@BxmOmm_Field(length=4, decimal=0, description="분류코드합", align="left", fill="")
	private String cAlCd= "";
	
	
	/**
	 * 분류코드명2
	 */
	@ApiModelProperty(
		name = "codeName2"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("codeName2")
	@BxmOmm_Field(length=100, decimal=0, description="분류코드명2", align="left", fill="")
	private String codeName2= "";
	
	
	/**
	 * 순서
	 */
	@ApiModelProperty(
		name = "seq"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("seq")
	@BxmOmm_Field(length=100, decimal=0, description="순서", align="left", fill="")
	private String seq= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_codeName= false;
	protected final boolean isSet_codeName(){
		return this.isSet_codeName;
	}
	private void setIsSet_codeName(boolean value){
		this.isSet_codeName= value;
	}
	/**
	 * 분류코드명
	 */
	@XmlTransient
	public String getCodeName(){
		return this.codeName;
	}
	
	/**
	 * 분류코드명
	 * 
	 * @param codeName 분류코드명
	 */
	public void setCodeName(String codeName){
		this.codeName= codeName;
		this.setIsSet_codeName(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cL1Cd= false;
	protected final boolean isSet_cL1Cd(){
		return this.isSet_cL1Cd;
	}
	private void setIsSet_cL1Cd(boolean value){
		this.isSet_cL1Cd= value;
	}
	/**
	 * 분류코드1
	 */
	@XmlTransient
	public String getcL1Cd(){
		return this.cL1Cd;
	}
	
	/**
	 * 분류코드1
	 * 
	 * @param cL1Cd 분류코드1
	 */
	public void setcL1Cd(String cL1Cd){
		this.cL1Cd= cL1Cd;
		this.setIsSet_cL1Cd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cL2Cd= false;
	protected final boolean isSet_cL2Cd(){
		return this.isSet_cL2Cd;
	}
	private void setIsSet_cL2Cd(boolean value){
		this.isSet_cL2Cd= value;
	}
	/**
	 * 분류코드
	 */
	@XmlTransient
	public String getcL2Cd(){
		return this.cL2Cd;
	}
	
	/**
	 * 분류코드
	 * 
	 * @param cL2Cd 분류코드
	 */
	public void setcL2Cd(String cL2Cd){
		this.cL2Cd= cL2Cd;
		this.setIsSet_cL2Cd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cAlCd= false;
	protected final boolean isSet_cAlCd(){
		return this.isSet_cAlCd;
	}
	private void setIsSet_cAlCd(boolean value){
		this.isSet_cAlCd= value;
	}
	/**
	 * 분류코드합
	 */
	@XmlTransient
	public String getcAlCd(){
		return this.cAlCd;
	}
	
	/**
	 * 분류코드합
	 * 
	 * @param cAlCd 분류코드합
	 */
	public void setcAlCd(String cAlCd){
		this.cAlCd= cAlCd;
		this.setIsSet_cAlCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_codeName2= false;
	protected final boolean isSet_codeName2(){
		return this.isSet_codeName2;
	}
	private void setIsSet_codeName2(boolean value){
		this.isSet_codeName2= value;
	}
	/**
	 * 분류코드명2
	 */
	@XmlTransient
	public String getCodeName2(){
		return this.codeName2;
	}
	
	/**
	 * 분류코드명2
	 * 
	 * @param codeName2 분류코드명2
	 */
	public void setCodeName2(String codeName2){
		this.codeName2= codeName2;
		this.setIsSet_codeName2(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_seq= false;
	protected final boolean isSet_seq(){
		return this.isSet_seq;
	}
	private void setIsSet_seq(boolean value){
		this.isSet_seq= value;
	}
	/**
	 * 순서
	 */
	@XmlTransient
	public String getSeq(){
		return this.seq;
	}
	
	/**
	 * 순서
	 * 
	 * @param seq 순서
	 */
	public void setSeq(String seq){
		this.seq= seq;
		this.setIsSet_seq(true);
	}
				
	@Override
	public INBUmsCtgrClfGrid_DTO clone(){
		try{
			INBUmsCtgrClfGrid_DTO object= (INBUmsCtgrClfGrid_DTO)super.clone();
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
		
		result= prime * result + ((this.codeName==null)?0:this.codeName.hashCode());
		result= prime * result + ((this.cL1Cd==null)?0:this.cL1Cd.hashCode());
		result= prime * result + ((this.cL2Cd==null)?0:this.cL2Cd.hashCode());
		result= prime * result + ((this.cAlCd==null)?0:this.cAlCd.hashCode());
		result= prime * result + ((this.codeName2==null)?0:this.codeName2.hashCode());
		result= prime * result + ((this.seq==null)?0:this.seq.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBUmsCtgrClfGrid_DTO other= (INBUmsCtgrClfGrid_DTO)obj;
		{
			Object _codeName= getCodeName();
			Object __codeName= other.getCodeName();
			if ( _codeName== null ) { if ( __codeName!= null ) return false; }
			else if ( !_codeName.equals(__codeName) ) return false;
		}
		{
			Object _cL1Cd= getcL1Cd();
			Object __cL1Cd= other.getcL1Cd();
			if ( _cL1Cd== null ) { if ( __cL1Cd!= null ) return false; }
			else if ( !_cL1Cd.equals(__cL1Cd) ) return false;
		}
		{
			Object _cL2Cd= getcL2Cd();
			Object __cL2Cd= other.getcL2Cd();
			if ( _cL2Cd== null ) { if ( __cL2Cd!= null ) return false; }
			else if ( !_cL2Cd.equals(__cL2Cd) ) return false;
		}
		{
			Object _cAlCd= getcAlCd();
			Object __cAlCd= other.getcAlCd();
			if ( _cAlCd== null ) { if ( __cAlCd!= null ) return false; }
			else if ( !_cAlCd.equals(__cAlCd) ) return false;
		}
		{
			Object _codeName2= getCodeName2();
			Object __codeName2= other.getCodeName2();
			if ( _codeName2== null ) { if ( __codeName2!= null ) return false; }
			else if ( !_codeName2.equals(__codeName2) ) return false;
		}
		{
			Object _seq= getSeq();
			Object __seq= other.getSeq();
			if ( _seq== null ) { if ( __seq!= null ) return false; }
			else if ( !_seq.equals(__seq) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBUmsCtgrClfGrid_DTO.class.getName()).append(":\n");
		sb.append("\tcodeName: ");
		sb.append(codeName==null?"null":getCodeName());
		sb.append("\n");
		sb.append("\tcL1Cd: ");
		sb.append(cL1Cd==null?"null":getcL1Cd());
		sb.append("\n");
		sb.append("\tcL2Cd: ");
		sb.append(cL2Cd==null?"null":getcL2Cd());
		sb.append("\n");
		sb.append("\tcAlCd: ");
		sb.append(cAlCd==null?"null":getcAlCd());
		sb.append("\n");
		sb.append("\tcodeName2: ");
		sb.append(codeName2==null?"null":getCodeName2());
		sb.append("\n");
		sb.append("\tseq: ");
		sb.append(seq==null?"null":getSeq());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 100; /* codeName */
		messageLen+= 2; /* cL1Cd */
		messageLen+= 2; /* cL2Cd */
		messageLen+= 4; /* cAlCd */
		messageLen+= 100; /* codeName2 */
		messageLen+= 100; /* seq */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("codeName");
		list.add("cL1Cd");
		list.add("cL2Cd");
		list.add("cAlCd");
		list.add("codeName2");
		list.add("seq");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("codeName", get("codeName"));
		map.put("cL1Cd", get("cL1Cd"));
		map.put("cL2Cd", get("cL2Cd"));
		map.put("cAlCd", get("cAlCd"));
		map.put("codeName2", get("codeName2"));
		map.put("seq", get("seq"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -868164072:/* codeName */
			return getCodeName();
		case 93741961:/* cL1Cd */
			return getcL1Cd();
		case 93742922:/* cL2Cd */
			return getcL2Cd();
		case 93470959:/* cAlCd */
			return getcAlCd();
		case -1143282406:/* codeName2 */
			return getCodeName2();
		case 113759:/* seq */
			return getSeq();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -868164072:/* codeName */
			setCodeName((String)value);
			break;
		case 93741961:/* cL1Cd */
			setcL1Cd((String)value);
			break;
		case 93742922:/* cL2Cd */
			setcL2Cd((String)value);
			break;
		case 93470959:/* cAlCd */
			setcAlCd((String)value);
			break;
		case -1143282406:/* codeName2 */
			setCodeName2((String)value);
			break;
		case 113759:/* seq */
			setSeq((String)value);
			break;
		default:
			break;
		}
	}
	
}
