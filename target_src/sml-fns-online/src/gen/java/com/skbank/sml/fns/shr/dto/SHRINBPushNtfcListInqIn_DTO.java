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

/**
 * PUSH알림목록조회DTO
 */
@XmlType(propOrder={
	"itcsno", "umsReqStaDt", "umsReqEndDt", "mchrTkn"
}, name="SHRINBPushNtfcListInqIn_DTO")
@XmlRootElement(name="SHRINBPushNtfcListInqIn_DTO")
@BxmCategory(logicalName="PUSH알림목록조회DTO", description="PUSH알림목록조회DTO") 
public class SHRINBPushNtfcListInqIn_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1736384486L;
	
	
	
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
	 * UMS요청시작일자
	 */
	@ApiModelProperty(
		name = "umsReqStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsReqStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="UMS요청시작일자", align="left", fill="")
	private String umsReqStaDt= "";
	
	
	/**
	 * UMS요청종료일자
	 */
	@ApiModelProperty(
		name = "umsReqEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsReqEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="UMS요청종료일자", align="left", fill="")
	private String umsReqEndDt= "";
	
	
	/**
	 * 기기토큰
	 */
	@ApiModelProperty(
		name = "mchrTkn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mchrTkn")
	@BxmOmm_Field(length=57, decimal=0, description="기기토큰", align="left", fill="")
	private String mchrTkn= "";
	
	
	
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
	private boolean isSet_umsReqStaDt= false;
	protected final boolean isSet_umsReqStaDt(){
		return this.isSet_umsReqStaDt;
	}
	private void setIsSet_umsReqStaDt(boolean value){
		this.isSet_umsReqStaDt= value;
	}
	/**
	 * UMS요청시작일자
	 */
	@XmlTransient
	public String getUmsReqStaDt(){
		return this.umsReqStaDt;
	}
	
	/**
	 * UMS요청시작일자
	 * 
	 * @param umsReqStaDt UMS요청시작일자
	 */
	public void setUmsReqStaDt(String umsReqStaDt){
		this.umsReqStaDt= umsReqStaDt;
		this.setIsSet_umsReqStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_umsReqEndDt= false;
	protected final boolean isSet_umsReqEndDt(){
		return this.isSet_umsReqEndDt;
	}
	private void setIsSet_umsReqEndDt(boolean value){
		this.isSet_umsReqEndDt= value;
	}
	/**
	 * UMS요청종료일자
	 */
	@XmlTransient
	public String getUmsReqEndDt(){
		return this.umsReqEndDt;
	}
	
	/**
	 * UMS요청종료일자
	 * 
	 * @param umsReqEndDt UMS요청종료일자
	 */
	public void setUmsReqEndDt(String umsReqEndDt){
		this.umsReqEndDt= umsReqEndDt;
		this.setIsSet_umsReqEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mchrTkn= false;
	protected final boolean isSet_mchrTkn(){
		return this.isSet_mchrTkn;
	}
	private void setIsSet_mchrTkn(boolean value){
		this.isSet_mchrTkn= value;
	}
	/**
	 * 기기토큰
	 */
	@XmlTransient
	public String getMchrTkn(){
		return this.mchrTkn;
	}
	
	/**
	 * 기기토큰
	 * 
	 * @param mchrTkn 기기토큰
	 */
	public void setMchrTkn(String mchrTkn){
		this.mchrTkn= mchrTkn;
		this.setIsSet_mchrTkn(true);
	}
				
	@Override
	public SHRINBPushNtfcListInqIn_DTO clone(){
		try{
			SHRINBPushNtfcListInqIn_DTO object= (SHRINBPushNtfcListInqIn_DTO)super.clone();
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
		result= prime * result + ((this.umsReqStaDt==null)?0:this.umsReqStaDt.hashCode());
		result= prime * result + ((this.umsReqEndDt==null)?0:this.umsReqEndDt.hashCode());
		result= prime * result + ((this.mchrTkn==null)?0:this.mchrTkn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final SHRINBPushNtfcListInqIn_DTO other= (SHRINBPushNtfcListInqIn_DTO)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _umsReqStaDt= getUmsReqStaDt();
			Object __umsReqStaDt= other.getUmsReqStaDt();
			if ( _umsReqStaDt== null ) { if ( __umsReqStaDt!= null ) return false; }
			else if ( !_umsReqStaDt.equals(__umsReqStaDt) ) return false;
		}
		{
			Object _umsReqEndDt= getUmsReqEndDt();
			Object __umsReqEndDt= other.getUmsReqEndDt();
			if ( _umsReqEndDt== null ) { if ( __umsReqEndDt!= null ) return false; }
			else if ( !_umsReqEndDt.equals(__umsReqEndDt) ) return false;
		}
		{
			Object _mchrTkn= getMchrTkn();
			Object __mchrTkn= other.getMchrTkn();
			if ( _mchrTkn== null ) { if ( __mchrTkn!= null ) return false; }
			else if ( !_mchrTkn.equals(__mchrTkn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(SHRINBPushNtfcListInqIn_DTO.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tumsReqStaDt: ");
		sb.append(umsReqStaDt==null?"null":getUmsReqStaDt());
		sb.append("\n");
		sb.append("\tumsReqEndDt: ");
		sb.append(umsReqEndDt==null?"null":getUmsReqEndDt());
		sb.append("\n");
		sb.append("\tmchrTkn: ");
		sb.append(mchrTkn==null?"null":getMchrTkn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 8; /* umsReqStaDt */
		messageLen+= 8; /* umsReqEndDt */
		messageLen+= 57; /* mchrTkn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("umsReqStaDt");
		list.add("umsReqEndDt");
		list.add("mchrTkn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("umsReqStaDt", get("umsReqStaDt"));
		map.put("umsReqEndDt", get("umsReqEndDt"));
		map.put("mchrTkn", get("mchrTkn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case -1793464627:/* umsReqStaDt */
			return getUmsReqStaDt();
		case -1806569784:/* umsReqEndDt */
			return getUmsReqEndDt();
		case 887465879:/* mchrTkn */
			return getMchrTkn();
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
		case -1793464627:/* umsReqStaDt */
			setUmsReqStaDt((String)value);
			break;
		case -1806569784:/* umsReqEndDt */
			setUmsReqEndDt((String)value);
			break;
		case 887465879:/* mchrTkn */
			setMchrTkn((String)value);
			break;
		default:
			break;
		}
	}
	
}
