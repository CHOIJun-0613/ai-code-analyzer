/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.shr.dto;

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
import option.WooriOmmOption;

/**
 * SHR 머니클립 기본정보 DTO
 */
@WooriOmmOption(dataMasking=true)
@XmlType(propOrder={
	"mnyClpChidAcno", "mnyClpMoAcno", "mnyClpChidActDscd", "mnyClpChidActNm", "mnyClpChidActExpsSeq", "mnyClpChidActIconNm"
}, name="SHRMNPWallBizMNPBscInf_DTO")
@XmlRootElement(name="SHRMNPWallBizMNPBscInf_DTO")
@BxmCategory(logicalName="SHR 머니클립 기본정보 DTO", description="SHR 머니클립 기본정보 DTO") 
public class SHRMNPWallBizMNPBscInf_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -27178665L;
	
	
	
	/**
	 * 머니클립자계좌번호
	 */
	@ApiModelProperty(
		name = "mnyClpChidAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidAcno")
	@BxmOmm_Field(length=13, decimal=0, description="머니클립자계좌번호", align="left", fill="", formatType="masking", format="M141")
	private String mnyClpChidAcno= "";
	
	
	/**
	 * 머니클립모계좌번호
	 */
	@ApiModelProperty(
		name = "mnyClpMoAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpMoAcno")
	@BxmOmm_Field(length=13, decimal=0, description="머니클립모계좌번호", align="left", fill="", formatType="masking", format="M141")
	private String mnyClpMoAcno= "";
	
	
	/**
	 * 머니클립자계좌구분코드
	 */
	@ApiModelProperty(
		name = "mnyClpChidActDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActDscd")
	@BxmOmm_Field(length=1, decimal=0, description="머니클립자계좌구분코드", align="left", fill="")
	private String mnyClpChidActDscd= "";
	
	
	/**
	 * 머니클립자계좌명
	 */
	@ApiModelProperty(
		name = "mnyClpChidActNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActNm")
	@BxmOmm_Field(length=100, decimal=0, description="머니클립자계좌명", align="left", fill="")
	private String mnyClpChidActNm= "";
	
	
	/**
	 * 머니클립자계좌노출순서
	 */
	@ApiModelProperty(
		name = "mnyClpChidActExpsSeq"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActExpsSeq")
	@BxmOmm_Field(length=3, decimal=0, description="머니클립자계좌노출순서", align="left", fill="")
	private String mnyClpChidActExpsSeq= "";
	
	
	/**
	 * 머니클립자계좌아이콘명
	 */
	@ApiModelProperty(
		name = "mnyClpChidActIconNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mnyClpChidActIconNm")
	@BxmOmm_Field(length=200, decimal=0, description="머니클립자계좌아이콘명", align="left", fill="")
	private String mnyClpChidActIconNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidAcno= false;
	protected final boolean isSet_mnyClpChidAcno(){
		return this.isSet_mnyClpChidAcno;
	}
	private void setIsSet_mnyClpChidAcno(boolean value){
		this.isSet_mnyClpChidAcno= value;
	}
	/**
	 * 머니클립자계좌번호
	 */
	@XmlTransient
	public String getMnyClpChidAcno(){
		return this.mnyClpChidAcno;
	}
	
	/**
	 * 머니클립자계좌번호
	 * 
	 * @param mnyClpChidAcno 머니클립자계좌번호
	 */
	public void setMnyClpChidAcno(String mnyClpChidAcno){
		this.mnyClpChidAcno= mnyClpChidAcno;
		this.setIsSet_mnyClpChidAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpMoAcno= false;
	protected final boolean isSet_mnyClpMoAcno(){
		return this.isSet_mnyClpMoAcno;
	}
	private void setIsSet_mnyClpMoAcno(boolean value){
		this.isSet_mnyClpMoAcno= value;
	}
	/**
	 * 머니클립모계좌번호
	 */
	@XmlTransient
	public String getMnyClpMoAcno(){
		return this.mnyClpMoAcno;
	}
	
	/**
	 * 머니클립모계좌번호
	 * 
	 * @param mnyClpMoAcno 머니클립모계좌번호
	 */
	public void setMnyClpMoAcno(String mnyClpMoAcno){
		this.mnyClpMoAcno= mnyClpMoAcno;
		this.setIsSet_mnyClpMoAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActDscd= false;
	protected final boolean isSet_mnyClpChidActDscd(){
		return this.isSet_mnyClpChidActDscd;
	}
	private void setIsSet_mnyClpChidActDscd(boolean value){
		this.isSet_mnyClpChidActDscd= value;
	}
	/**
	 * 머니클립자계좌구분코드
	 */
	@XmlTransient
	public String getMnyClpChidActDscd(){
		return this.mnyClpChidActDscd;
	}
	
	/**
	 * 머니클립자계좌구분코드
	 * 
	 * @param mnyClpChidActDscd 머니클립자계좌구분코드
	 */
	public void setMnyClpChidActDscd(String mnyClpChidActDscd){
		this.mnyClpChidActDscd= mnyClpChidActDscd;
		this.setIsSet_mnyClpChidActDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActNm= false;
	protected final boolean isSet_mnyClpChidActNm(){
		return this.isSet_mnyClpChidActNm;
	}
	private void setIsSet_mnyClpChidActNm(boolean value){
		this.isSet_mnyClpChidActNm= value;
	}
	/**
	 * 머니클립자계좌명
	 */
	@XmlTransient
	public String getMnyClpChidActNm(){
		return this.mnyClpChidActNm;
	}
	
	/**
	 * 머니클립자계좌명
	 * 
	 * @param mnyClpChidActNm 머니클립자계좌명
	 */
	public void setMnyClpChidActNm(String mnyClpChidActNm){
		this.mnyClpChidActNm= mnyClpChidActNm;
		this.setIsSet_mnyClpChidActNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActExpsSeq= false;
	protected final boolean isSet_mnyClpChidActExpsSeq(){
		return this.isSet_mnyClpChidActExpsSeq;
	}
	private void setIsSet_mnyClpChidActExpsSeq(boolean value){
		this.isSet_mnyClpChidActExpsSeq= value;
	}
	/**
	 * 머니클립자계좌노출순서
	 */
	@XmlTransient
	public String getMnyClpChidActExpsSeq(){
		return this.mnyClpChidActExpsSeq;
	}
	
	/**
	 * 머니클립자계좌노출순서
	 * 
	 * @param mnyClpChidActExpsSeq 머니클립자계좌노출순서
	 */
	public void setMnyClpChidActExpsSeq(String mnyClpChidActExpsSeq){
		this.mnyClpChidActExpsSeq= mnyClpChidActExpsSeq;
		this.setIsSet_mnyClpChidActExpsSeq(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mnyClpChidActIconNm= false;
	protected final boolean isSet_mnyClpChidActIconNm(){
		return this.isSet_mnyClpChidActIconNm;
	}
	private void setIsSet_mnyClpChidActIconNm(boolean value){
		this.isSet_mnyClpChidActIconNm= value;
	}
	/**
	 * 머니클립자계좌아이콘명
	 */
	@XmlTransient
	public String getMnyClpChidActIconNm(){
		return this.mnyClpChidActIconNm;
	}
	
	/**
	 * 머니클립자계좌아이콘명
	 * 
	 * @param mnyClpChidActIconNm 머니클립자계좌아이콘명
	 */
	public void setMnyClpChidActIconNm(String mnyClpChidActIconNm){
		this.mnyClpChidActIconNm= mnyClpChidActIconNm;
		this.setIsSet_mnyClpChidActIconNm(true);
	}
				
	@Override
	public SHRMNPWallBizMNPBscInf_DTO clone(){
		try{
			SHRMNPWallBizMNPBscInf_DTO object= (SHRMNPWallBizMNPBscInf_DTO)super.clone();
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
		
		result= prime * result + ((this.mnyClpChidAcno==null)?0:this.mnyClpChidAcno.hashCode());
		result= prime * result + ((this.mnyClpMoAcno==null)?0:this.mnyClpMoAcno.hashCode());
		result= prime * result + ((this.mnyClpChidActDscd==null)?0:this.mnyClpChidActDscd.hashCode());
		result= prime * result + ((this.mnyClpChidActNm==null)?0:this.mnyClpChidActNm.hashCode());
		result= prime * result + ((this.mnyClpChidActExpsSeq==null)?0:this.mnyClpChidActExpsSeq.hashCode());
		result= prime * result + ((this.mnyClpChidActIconNm==null)?0:this.mnyClpChidActIconNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRMNPWallBizMNPBscInf_DTO other= (SHRMNPWallBizMNPBscInf_DTO)obj;
		{
			Object _mnyClpChidAcno= getMnyClpChidAcno();
			Object __mnyClpChidAcno= other.getMnyClpChidAcno();
			if ( _mnyClpChidAcno== null ) { if ( __mnyClpChidAcno!= null ) return false; }
			else if ( !_mnyClpChidAcno.equals(__mnyClpChidAcno) ) return false;
		}
		{
			Object _mnyClpMoAcno= getMnyClpMoAcno();
			Object __mnyClpMoAcno= other.getMnyClpMoAcno();
			if ( _mnyClpMoAcno== null ) { if ( __mnyClpMoAcno!= null ) return false; }
			else if ( !_mnyClpMoAcno.equals(__mnyClpMoAcno) ) return false;
		}
		{
			Object _mnyClpChidActDscd= getMnyClpChidActDscd();
			Object __mnyClpChidActDscd= other.getMnyClpChidActDscd();
			if ( _mnyClpChidActDscd== null ) { if ( __mnyClpChidActDscd!= null ) return false; }
			else if ( !_mnyClpChidActDscd.equals(__mnyClpChidActDscd) ) return false;
		}
		{
			Object _mnyClpChidActNm= getMnyClpChidActNm();
			Object __mnyClpChidActNm= other.getMnyClpChidActNm();
			if ( _mnyClpChidActNm== null ) { if ( __mnyClpChidActNm!= null ) return false; }
			else if ( !_mnyClpChidActNm.equals(__mnyClpChidActNm) ) return false;
		}
		{
			Object _mnyClpChidActExpsSeq= getMnyClpChidActExpsSeq();
			Object __mnyClpChidActExpsSeq= other.getMnyClpChidActExpsSeq();
			if ( _mnyClpChidActExpsSeq== null ) { if ( __mnyClpChidActExpsSeq!= null ) return false; }
			else if ( !_mnyClpChidActExpsSeq.equals(__mnyClpChidActExpsSeq) ) return false;
		}
		{
			Object _mnyClpChidActIconNm= getMnyClpChidActIconNm();
			Object __mnyClpChidActIconNm= other.getMnyClpChidActIconNm();
			if ( _mnyClpChidActIconNm== null ) { if ( __mnyClpChidActIconNm!= null ) return false; }
			else if ( !_mnyClpChidActIconNm.equals(__mnyClpChidActIconNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRMNPWallBizMNPBscInf_DTO.class.getName()).append(":\n");
		sb.append("\tmnyClpChidAcno: ");
		sb.append(mnyClpChidAcno==null?"null":getMnyClpChidAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tmnyClpMoAcno: ");
		sb.append(mnyClpMoAcno==null?"null":getMnyClpMoAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tmnyClpChidActDscd: ");
		sb.append(mnyClpChidActDscd==null?"null":getMnyClpChidActDscd());
		sb.append("\n");
		sb.append("\tmnyClpChidActNm: ");
		sb.append(mnyClpChidActNm==null?"null":getMnyClpChidActNm());
		sb.append("\n");
		sb.append("\tmnyClpChidActExpsSeq: ");
		sb.append(mnyClpChidActExpsSeq==null?"null":getMnyClpChidActExpsSeq());
		sb.append("\n");
		sb.append("\tmnyClpChidActIconNm: ");
		sb.append(mnyClpChidActIconNm==null?"null":getMnyClpChidActIconNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* mnyClpChidAcno */
		messageLen+= 13; /* mnyClpMoAcno */
		messageLen+= 1; /* mnyClpChidActDscd */
		messageLen+= 100; /* mnyClpChidActNm */
		messageLen+= 3; /* mnyClpChidActExpsSeq */
		messageLen+= 200; /* mnyClpChidActIconNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("mnyClpChidAcno");
		list.add("mnyClpMoAcno");
		list.add("mnyClpChidActDscd");
		list.add("mnyClpChidActNm");
		list.add("mnyClpChidActExpsSeq");
		list.add("mnyClpChidActIconNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("mnyClpChidAcno", get("mnyClpChidAcno"));
		map.put("mnyClpMoAcno", get("mnyClpMoAcno"));
		map.put("mnyClpChidActDscd", get("mnyClpChidActDscd"));
		map.put("mnyClpChidActNm", get("mnyClpChidActNm"));
		map.put("mnyClpChidActExpsSeq", get("mnyClpChidActExpsSeq"));
		map.put("mnyClpChidActIconNm", get("mnyClpChidActIconNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1782725134:/* mnyClpChidAcno */
			return getMnyClpChidAcno();
		case 115408404:/* mnyClpMoAcno */
			return getMnyClpMoAcno();
		case -1889478157:/* mnyClpChidActDscd */
			return getMnyClpChidActDscd();
		case 570100546:/* mnyClpChidActNm */
			return getMnyClpChidActNm();
		case 1440791270:/* mnyClpChidActExpsSeq */
			return getMnyClpChidActExpsSeq();
		case 1111396379:/* mnyClpChidActIconNm */
			return getMnyClpChidActIconNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1782725134:/* mnyClpChidAcno */
			setMnyClpChidAcno((String)value);
			break;
		case 115408404:/* mnyClpMoAcno */
			setMnyClpMoAcno((String)value);
			break;
		case -1889478157:/* mnyClpChidActDscd */
			setMnyClpChidActDscd((String)value);
			break;
		case 570100546:/* mnyClpChidActNm */
			setMnyClpChidActNm((String)value);
			break;
		case 1440791270:/* mnyClpChidActExpsSeq */
			setMnyClpChidActExpsSeq((String)value);
			break;
		case 1111396379:/* mnyClpChidActIconNm */
			setMnyClpChidActIconNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
