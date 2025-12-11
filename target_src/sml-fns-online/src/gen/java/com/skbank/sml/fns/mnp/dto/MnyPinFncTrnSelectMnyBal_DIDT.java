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
	"inqAcno", "inqStaYm", "inqEndYm"
}, name="MnyPinFncTrnSelectMnyBal_DIDT")
@XmlRootElement(name="MnyPinFncTrnSelectMnyBal_DIDT")
@BxmCategory(logicalName="머니클립 월말 잔액조회.컴포넌트.입력IO", description="") 
public class MnyPinFncTrnSelectMnyBal_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1100069229L;
	
	
	
	/**
	 * 조회계좌번호
	 */
	@ApiModelProperty(
		name = "inqAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqAcno")
	@BxmOmm_Field(length=16, decimal=0, description="조회계좌번호", align="left", fill="")
	private String inqAcno= "";
	
	
	/**
	 * 조회시작년월
	 */
	@ApiModelProperty(
		name = "inqStaYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqStaYm")
	@BxmOmm_Field(length=6, decimal=0, description="조회시작년월", align="left", fill="")
	private String inqStaYm= "";
	
	
	/**
	 * 조회종료년월
	 */
	@ApiModelProperty(
		name = "inqEndYm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqEndYm")
	@BxmOmm_Field(length=6, decimal=0, description="조회종료년월", align="left", fill="")
	private String inqEndYm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqAcno= false;
	protected final boolean isSet_inqAcno(){
		return this.isSet_inqAcno;
	}
	private void setIsSet_inqAcno(boolean value){
		this.isSet_inqAcno= value;
	}
	/**
	 * 조회계좌번호
	 */
	@XmlTransient
	public String getInqAcno(){
		return this.inqAcno;
	}
	
	/**
	 * 조회계좌번호
	 * 
	 * @param inqAcno 조회계좌번호
	 */
	public void setInqAcno(String inqAcno){
		this.inqAcno= inqAcno;
		this.setIsSet_inqAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqStaYm= false;
	protected final boolean isSet_inqStaYm(){
		return this.isSet_inqStaYm;
	}
	private void setIsSet_inqStaYm(boolean value){
		this.isSet_inqStaYm= value;
	}
	/**
	 * 조회시작년월
	 */
	@XmlTransient
	public String getInqStaYm(){
		return this.inqStaYm;
	}
	
	/**
	 * 조회시작년월
	 * 
	 * @param inqStaYm 조회시작년월
	 */
	public void setInqStaYm(String inqStaYm){
		this.inqStaYm= inqStaYm;
		this.setIsSet_inqStaYm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqEndYm= false;
	protected final boolean isSet_inqEndYm(){
		return this.isSet_inqEndYm;
	}
	private void setIsSet_inqEndYm(boolean value){
		this.isSet_inqEndYm= value;
	}
	/**
	 * 조회종료년월
	 */
	@XmlTransient
	public String getInqEndYm(){
		return this.inqEndYm;
	}
	
	/**
	 * 조회종료년월
	 * 
	 * @param inqEndYm 조회종료년월
	 */
	public void setInqEndYm(String inqEndYm){
		this.inqEndYm= inqEndYm;
		this.setIsSet_inqEndYm(true);
	}
				
	@Override
	public MnyPinFncTrnSelectMnyBal_DIDT clone(){
		try{
			MnyPinFncTrnSelectMnyBal_DIDT object= (MnyPinFncTrnSelectMnyBal_DIDT)super.clone();
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
		
		result= prime * result + ((this.inqAcno==null)?0:this.inqAcno.hashCode());
		result= prime * result + ((this.inqStaYm==null)?0:this.inqStaYm.hashCode());
		result= prime * result + ((this.inqEndYm==null)?0:this.inqEndYm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MnyPinFncTrnSelectMnyBal_DIDT other= (MnyPinFncTrnSelectMnyBal_DIDT)obj;
		{
			Object _inqAcno= getInqAcno();
			Object __inqAcno= other.getInqAcno();
			if ( _inqAcno== null ) { if ( __inqAcno!= null ) return false; }
			else if ( !_inqAcno.equals(__inqAcno) ) return false;
		}
		{
			Object _inqStaYm= getInqStaYm();
			Object __inqStaYm= other.getInqStaYm();
			if ( _inqStaYm== null ) { if ( __inqStaYm!= null ) return false; }
			else if ( !_inqStaYm.equals(__inqStaYm) ) return false;
		}
		{
			Object _inqEndYm= getInqEndYm();
			Object __inqEndYm= other.getInqEndYm();
			if ( _inqEndYm== null ) { if ( __inqEndYm!= null ) return false; }
			else if ( !_inqEndYm.equals(__inqEndYm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MnyPinFncTrnSelectMnyBal_DIDT.class.getName()).append(":\n");
		sb.append("\tinqAcno: ");
		sb.append(inqAcno==null?"null":getInqAcno());
		sb.append("\n");
		sb.append("\tinqStaYm: ");
		sb.append(inqStaYm==null?"null":getInqStaYm());
		sb.append("\n");
		sb.append("\tinqEndYm: ");
		sb.append(inqEndYm==null?"null":getInqEndYm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 16; /* inqAcno */
		messageLen+= 6; /* inqStaYm */
		messageLen+= 6; /* inqEndYm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("inqAcno");
		list.add("inqStaYm");
		list.add("inqEndYm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("inqAcno", get("inqAcno"));
		map.put("inqStaYm", get("inqStaYm"));
		map.put("inqEndYm", get("inqEndYm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1954205551:/* inqAcno */
			return getInqAcno();
		case 467946696:/* inqStaYm */
			return getInqStaYm();
		case 454841539:/* inqEndYm */
			return getInqEndYm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1954205551:/* inqAcno */
			setInqAcno((String)value);
			break;
		case 467946696:/* inqStaYm */
			setInqStaYm((String)value);
			break;
		case 454841539:/* inqEndYm */
			setInqEndYm((String)value);
			break;
		default:
			break;
		}
	}
	
}
