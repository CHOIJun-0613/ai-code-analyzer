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
 * 
 */
@WooriOmmOption(dataMasking=true)
@XmlType(propOrder={
	"itcsno", "mnyClpChidAcno", "mnyClpMoAcno"
}, name="MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT")
@XmlRootElement(name="MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT")
@BxmCategory(logicalName="머니클립노출순서기본조회.DBM.입력.IO", description="") 
public class MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1794231545L;
	
	
	
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
				
	@Override
	public MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT clone(){
		try{
			MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT object= (MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT)super.clone();
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
		result= prime * result + ((this.mnyClpChidAcno==null)?0:this.mnyClpChidAcno.hashCode());
		result= prime * result + ((this.mnyClpMoAcno==null)?0:this.mnyClpMoAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT other= (MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tmnyClpChidAcno: ");
		sb.append(mnyClpChidAcno==null?"null":getMnyClpChidAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tmnyClpMoAcno: ");
		sb.append(mnyClpMoAcno==null?"null":getMnyClpMoAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 13; /* mnyClpChidAcno */
		messageLen+= 13; /* mnyClpMoAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("mnyClpChidAcno");
		list.add("mnyClpMoAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("mnyClpChidAcno", get("mnyClpChidAcno"));
		map.put("mnyClpMoAcno", get("mnyClpMoAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case -1782725134:/* mnyClpChidAcno */
			return getMnyClpChidAcno();
		case 115408404:/* mnyClpMoAcno */
			return getMnyClpMoAcno();
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
		case -1782725134:/* mnyClpChidAcno */
			setMnyClpChidAcno((String)value);
			break;
		case 115408404:/* mnyClpMoAcno */
			setMnyClpMoAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
