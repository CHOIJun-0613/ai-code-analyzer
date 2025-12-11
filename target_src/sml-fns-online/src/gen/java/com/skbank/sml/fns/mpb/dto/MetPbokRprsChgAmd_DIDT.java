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
 * 
 */
@WooriOmmOption(dataMasking=true)
@XmlType(propOrder={
	"metMngNo", "rcvBkwAcno"
}, name="MetPbokRprsChgAmd_DIDT")
@XmlRootElement(name="MetPbokRprsChgAmd_DIDT")
@BxmCategory(logicalName="모임통장.대표.변경.수정.DBM.입력.IO", description="") 
public class MetPbokRprsChgAmd_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1282879875L;
	
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=9, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 입금전행계좌번호
	 */
	@ApiModelProperty(
		name = "rcvBkwAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvBkwAcno")
	@BxmOmm_Field(length=20, decimal=0, description="입금전행계좌번호", align="left", fill="", formatType="masking", format="M141")
	private String rcvBkwAcno= "";
	
	
	
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
	private boolean isSet_rcvBkwAcno= false;
	protected final boolean isSet_rcvBkwAcno(){
		return this.isSet_rcvBkwAcno;
	}
	private void setIsSet_rcvBkwAcno(boolean value){
		this.isSet_rcvBkwAcno= value;
	}
	/**
	 * 입금전행계좌번호
	 */
	@XmlTransient
	public String getRcvBkwAcno(){
		return this.rcvBkwAcno;
	}
	
	/**
	 * 입금전행계좌번호
	 * 
	 * @param rcvBkwAcno 입금전행계좌번호
	 */
	public void setRcvBkwAcno(String rcvBkwAcno){
		this.rcvBkwAcno= rcvBkwAcno;
		this.setIsSet_rcvBkwAcno(true);
	}
				
	@Override
	public MetPbokRprsChgAmd_DIDT clone(){
		try{
			MetPbokRprsChgAmd_DIDT object= (MetPbokRprsChgAmd_DIDT)super.clone();
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
		result= prime * result + ((this.rcvBkwAcno==null)?0:this.rcvBkwAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokRprsChgAmd_DIDT other= (MetPbokRprsChgAmd_DIDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _rcvBkwAcno= getRcvBkwAcno();
			Object __rcvBkwAcno= other.getRcvBkwAcno();
			if ( _rcvBkwAcno== null ) { if ( __rcvBkwAcno!= null ) return false; }
			else if ( !_rcvBkwAcno.equals(__rcvBkwAcno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokRprsChgAmd_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\trcvBkwAcno: ");
		sb.append(rcvBkwAcno==null?"null":getRcvBkwAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 20; /* rcvBkwAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("rcvBkwAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("rcvBkwAcno", get("rcvBkwAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 1637074860:/* rcvBkwAcno */
			return getRcvBkwAcno();
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
		case 1637074860:/* rcvBkwAcno */
			setRcvBkwAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
