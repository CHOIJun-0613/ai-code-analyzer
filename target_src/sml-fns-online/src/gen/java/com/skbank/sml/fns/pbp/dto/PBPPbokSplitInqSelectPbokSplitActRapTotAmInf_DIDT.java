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
	"acno", "inqStaDt", "inqEndDt"
}, name="PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT")
@XmlRootElement(name="PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT")
@BxmCategory(logicalName="통장.쪼객.통합.정보.조회.DBM.입력.IO", description="") 
public class PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 354771240L;
	
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=13, decimal=0, description="계좌번호", align="left", fill="")
	private String acno= "";
	
	
	/**
	 * 조회시작일자
	 */
	@ApiModelProperty(
		name = "inqStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="조회시작일자", align="left", fill="")
	private String inqStaDt= "";
	
	
	/**
	 * 조회종료일자
	 */
	@ApiModelProperty(
		name = "inqEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="조회종료일자", align="left", fill="")
	private String inqEndDt= "";
	
	
	
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
	private boolean isSet_inqStaDt= false;
	protected final boolean isSet_inqStaDt(){
		return this.isSet_inqStaDt;
	}
	private void setIsSet_inqStaDt(boolean value){
		this.isSet_inqStaDt= value;
	}
	/**
	 * 조회시작일자
	 */
	@XmlTransient
	public String getInqStaDt(){
		return this.inqStaDt;
	}
	
	/**
	 * 조회시작일자
	 * 
	 * @param inqStaDt 조회시작일자
	 */
	public void setInqStaDt(String inqStaDt){
		this.inqStaDt= inqStaDt;
		this.setIsSet_inqStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqEndDt= false;
	protected final boolean isSet_inqEndDt(){
		return this.isSet_inqEndDt;
	}
	private void setIsSet_inqEndDt(boolean value){
		this.isSet_inqEndDt= value;
	}
	/**
	 * 조회종료일자
	 */
	@XmlTransient
	public String getInqEndDt(){
		return this.inqEndDt;
	}
	
	/**
	 * 조회종료일자
	 * 
	 * @param inqEndDt 조회종료일자
	 */
	public void setInqEndDt(String inqEndDt){
		this.inqEndDt= inqEndDt;
		this.setIsSet_inqEndDt(true);
	}
				
	@Override
	public PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT clone(){
		try{
			PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT object= (PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT)super.clone();
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
		
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.inqStaDt==null)?0:this.inqStaDt.hashCode());
		result= prime * result + ((this.inqEndDt==null)?0:this.inqEndDt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT other= (PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT)obj;
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _inqStaDt= getInqStaDt();
			Object __inqStaDt= other.getInqStaDt();
			if ( _inqStaDt== null ) { if ( __inqStaDt!= null ) return false; }
			else if ( !_inqStaDt.equals(__inqStaDt) ) return false;
		}
		{
			Object _inqEndDt= getInqEndDt();
			Object __inqEndDt= other.getInqEndDt();
			if ( _inqEndDt== null ) { if ( __inqEndDt!= null ) return false; }
			else if ( !_inqEndDt.equals(__inqEndDt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSplitInqSelectPbokSplitActRapTotAmInf_DIDT.class.getName()).append(":\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tinqStaDt: ");
		sb.append(inqStaDt==null?"null":getInqStaDt());
		sb.append("\n");
		sb.append("\tinqEndDt: ");
		sb.append(inqEndDt==null?"null":getInqEndDt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* acno */
		messageLen+= 8; /* inqStaDt */
		messageLen+= 8; /* inqEndDt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("acno");
		list.add("inqStaDt");
		list.add("inqEndDt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("acno", get("acno"));
		map.put("inqStaDt", get("inqStaDt"));
		map.put("inqEndDt", get("inqEndDt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2988387:/* acno */
			return getAcno();
		case 467946052:/* inqStaDt */
			return getInqStaDt();
		case 454840895:/* inqEndDt */
			return getInqEndDt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case 467946052:/* inqStaDt */
			setInqStaDt((String)value);
			break;
		case 454840895:/* inqEndDt */
			setInqEndDt((String)value);
			break;
		default:
			break;
		}
	}
	
}
