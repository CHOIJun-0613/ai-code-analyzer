/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.dto;

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
	"atsWdrBkwAcno", "cucd", "rcvAcno"
}, name="MnyPinFncTrnSelectMnpChgItm_DIDT")
@XmlRootElement(name="MnyPinFncTrnSelectMnpChgItm_DIDT")
@BxmCategory(logicalName="머니클립변경항목조회.컴포넌트.입력.IO", description="") 
public class MnyPinFncTrnSelectMnpChgItm_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -135355791L;
	
	
	
	/**
	 * 자동이체출금전행계좌번호
	 */
	@ApiModelProperty(
		name = "atsWdrBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsWdrBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="자동이체출금전행계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String atsWdrBkwAcno= "";
	
	
	/**
	 * 통화코드
	 */
	@ApiModelProperty(
		name = "cucd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cucd")
	@BxmOmm_Field(length=3, decimal=0, description="통화코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String cucd= "";
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="입금계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rcvAcno= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsWdrBkwAcno= false;
	protected final boolean isSet_atsWdrBkwAcno(){
		return this.isSet_atsWdrBkwAcno;
	}
	private void setIsSet_atsWdrBkwAcno(boolean value){
		this.isSet_atsWdrBkwAcno= value;
	}
	/**
	 * 자동이체출금전행계좌번호
	 */
	@XmlTransient
	public String getAtsWdrBkwAcno(){
		return this.atsWdrBkwAcno;
	}
	
	/**
	 * 자동이체출금전행계좌번호
	 * 
	 * @param atsWdrBkwAcno 자동이체출금전행계좌번호
	 */
	public void setAtsWdrBkwAcno(String atsWdrBkwAcno){
		this.atsWdrBkwAcno= atsWdrBkwAcno;
		this.setIsSet_atsWdrBkwAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cucd= false;
	protected final boolean isSet_cucd(){
		return this.isSet_cucd;
	}
	private void setIsSet_cucd(boolean value){
		this.isSet_cucd= value;
	}
	/**
	 * 통화코드
	 */
	@XmlTransient
	public String getCucd(){
		return this.cucd;
	}
	
	/**
	 * 통화코드
	 * 
	 * @param cucd 통화코드
	 */
	public void setCucd(String cucd){
		this.cucd= cucd;
		this.setIsSet_cucd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvAcno= false;
	protected final boolean isSet_rcvAcno(){
		return this.isSet_rcvAcno;
	}
	private void setIsSet_rcvAcno(boolean value){
		this.isSet_rcvAcno= value;
	}
	/**
	 * 입금계좌번호
	 */
	@XmlTransient
	public String getRcvAcno(){
		return this.rcvAcno;
	}
	
	/**
	 * 입금계좌번호
	 * 
	 * @param rcvAcno 입금계좌번호
	 */
	public void setRcvAcno(String rcvAcno){
		this.rcvAcno= rcvAcno;
		this.setIsSet_rcvAcno(true);
	}
				
	@Override
	public MnyPinFncTrnSelectMnpChgItm_DIDT clone(){
		try{
			MnyPinFncTrnSelectMnpChgItm_DIDT object= (MnyPinFncTrnSelectMnpChgItm_DIDT)super.clone();
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
		
		result= prime * result + ((this.atsWdrBkwAcno==null)?0:this.atsWdrBkwAcno.hashCode());
		result= prime * result + ((this.cucd==null)?0:this.cucd.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinFncTrnSelectMnpChgItm_DIDT other= (MnyPinFncTrnSelectMnpChgItm_DIDT)obj;
		{
			Object _atsWdrBkwAcno= getAtsWdrBkwAcno();
			Object __atsWdrBkwAcno= other.getAtsWdrBkwAcno();
			if ( _atsWdrBkwAcno== null ) { if ( __atsWdrBkwAcno!= null ) return false; }
			else if ( !_atsWdrBkwAcno.equals(__atsWdrBkwAcno) ) return false;
		}
		{
			Object _cucd= getCucd();
			Object __cucd= other.getCucd();
			if ( _cucd== null ) { if ( __cucd!= null ) return false; }
			else if ( !_cucd.equals(__cucd) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MnyPinFncTrnSelectMnpChgItm_DIDT.class.getName()).append(":\n");
		sb.append("\tatsWdrBkwAcno: ");
		sb.append(atsWdrBkwAcno==null?"null":getAtsWdrBkwAcno());
		sb.append("\n");
		sb.append("\tcucd: ");
		sb.append(cucd==null?"null":getCucd());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* atsWdrBkwAcno */
		messageLen+= 3; /* cucd */
		messageLen+= 15; /* rcvAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("atsWdrBkwAcno");
		list.add("cucd");
		list.add("rcvAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("atsWdrBkwAcno", get("atsWdrBkwAcno"));
		map.put("cucd", get("cucd"));
		map.put("rcvAcno", get("rcvAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1366640524:/* atsWdrBkwAcno */
			return getAtsWdrBkwAcno();
		case 3064915:/* cucd */
			return getCucd();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1366640524:/* atsWdrBkwAcno */
			setAtsWdrBkwAcno((String)value);
			break;
		case 3064915:/* cucd */
			setCucd((String)value);
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
