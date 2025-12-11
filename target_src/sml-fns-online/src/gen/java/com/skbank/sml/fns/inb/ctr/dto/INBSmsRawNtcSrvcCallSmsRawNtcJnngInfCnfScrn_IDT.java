/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

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
 * SMS입출금통지.가입정보.확인.화면IDT
 */
@WooriOmmOption(dataMasking=true)
@XmlType(propOrder={
	"trnDis", "tgtAcno", "certScrtMensTgtYn"
}, name="INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT")
@XmlRootElement(name="INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT")
@BxmCategory(logicalName="SMS입출금통지.가입정보.확인.화면IDT", description="SMS입출금통지.가입정보.확인.화면IDT") 
public class INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1084314509L;
	
	
	
	/**
	 * 거래구분
	 */
	@ApiModelProperty(
		name = "trnDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnDis")
	@BxmOmm_Field(length=1, decimal=0, description="거래구분", align="left", fill="")
	private String trnDis= "";
	
	
	/**
	 * 수신계좌번호 
	 */
	@ApiModelProperty(
		name = "tgtAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tgtAcno")
	@BxmOmm_Field(length=20, decimal=0, description="수신계좌번호 ", align="left", fill="", formatType="masking", format="M141")
	private String tgtAcno= "";
	
	
	/**
	 * 인증보안매체대상여부
	 */
	@ApiModelProperty(
		name = "certScrtMensTgtYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("certScrtMensTgtYn")
	@BxmOmm_Field(length=1, decimal=0, description="인증보안매체대상여부", align="left", fill="")
	private String certScrtMensTgtYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnDis= false;
	protected final boolean isSet_trnDis(){
		return this.isSet_trnDis;
	}
	private void setIsSet_trnDis(boolean value){
		this.isSet_trnDis= value;
	}
	/**
	 * 거래구분
	 */
	@XmlTransient
	public String getTrnDis(){
		return this.trnDis;
	}
	
	/**
	 * 거래구분
	 * 
	 * @param trnDis 거래구분
	 */
	public void setTrnDis(String trnDis){
		this.trnDis= trnDis;
		this.setIsSet_trnDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tgtAcno= false;
	protected final boolean isSet_tgtAcno(){
		return this.isSet_tgtAcno;
	}
	private void setIsSet_tgtAcno(boolean value){
		this.isSet_tgtAcno= value;
	}
	/**
	 * 수신계좌번호 
	 */
	@XmlTransient
	public String getTgtAcno(){
		return this.tgtAcno;
	}
	
	/**
	 * 수신계좌번호 
	 * 
	 * @param tgtAcno 수신계좌번호 
	 */
	public void setTgtAcno(String tgtAcno){
		this.tgtAcno= tgtAcno;
		this.setIsSet_tgtAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_certScrtMensTgtYn= false;
	protected final boolean isSet_certScrtMensTgtYn(){
		return this.isSet_certScrtMensTgtYn;
	}
	private void setIsSet_certScrtMensTgtYn(boolean value){
		this.isSet_certScrtMensTgtYn= value;
	}
	/**
	 * 인증보안매체대상여부
	 */
	@XmlTransient
	public String getCertScrtMensTgtYn(){
		return this.certScrtMensTgtYn;
	}
	
	/**
	 * 인증보안매체대상여부
	 * 
	 * @param certScrtMensTgtYn 인증보안매체대상여부
	 */
	public void setCertScrtMensTgtYn(String certScrtMensTgtYn){
		this.certScrtMensTgtYn= certScrtMensTgtYn;
		this.setIsSet_certScrtMensTgtYn(true);
	}
				
	@Override
	public INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT clone(){
		try{
			INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT object= (INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT)super.clone();
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
		
		result= prime * result + ((this.trnDis==null)?0:this.trnDis.hashCode());
		result= prime * result + ((this.tgtAcno==null)?0:this.tgtAcno.hashCode());
		result= prime * result + ((this.certScrtMensTgtYn==null)?0:this.certScrtMensTgtYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT other= (INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT)obj;
		{
			Object _trnDis= getTrnDis();
			Object __trnDis= other.getTrnDis();
			if ( _trnDis== null ) { if ( __trnDis!= null ) return false; }
			else if ( !_trnDis.equals(__trnDis) ) return false;
		}
		{
			Object _tgtAcno= getTgtAcno();
			Object __tgtAcno= other.getTgtAcno();
			if ( _tgtAcno== null ) { if ( __tgtAcno!= null ) return false; }
			else if ( !_tgtAcno.equals(__tgtAcno) ) return false;
		}
		{
			Object _certScrtMensTgtYn= getCertScrtMensTgtYn();
			Object __certScrtMensTgtYn= other.getCertScrtMensTgtYn();
			if ( _certScrtMensTgtYn== null ) { if ( __certScrtMensTgtYn!= null ) return false; }
			else if ( !_certScrtMensTgtYn.equals(__certScrtMensTgtYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawNtcSrvcCallSmsRawNtcJnngInfCnfScrn_IDT.class.getName()).append(":\n");
		sb.append("\ttrnDis: ");
		sb.append(trnDis==null?"null":getTrnDis());
		sb.append("\n");
		sb.append("\ttgtAcno: ");
		sb.append(tgtAcno==null?"null":getTgtAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("\tcertScrtMensTgtYn: ");
		sb.append(certScrtMensTgtYn==null?"null":getCertScrtMensTgtYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* trnDis */
		messageLen+= 20; /* tgtAcno */
		messageLen+= 1; /* certScrtMensTgtYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnDis");
		list.add("tgtAcno");
		list.add("certScrtMensTgtYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnDis", get("trnDis"));
		map.put("tgtAcno", get("tgtAcno"));
		map.put("certScrtMensTgtYn", get("certScrtMensTgtYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -865358658:/* trnDis */
			return getTrnDis();
		case -1365789340:/* tgtAcno */
			return getTgtAcno();
		case -232382525:/* certScrtMensTgtYn */
			return getCertScrtMensTgtYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -865358658:/* trnDis */
			setTrnDis((String)value);
			break;
		case -1365789340:/* tgtAcno */
			setTgtAcno((String)value);
			break;
		case -232382525:/* certScrtMensTgtYn */
			setCertScrtMensTgtYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
