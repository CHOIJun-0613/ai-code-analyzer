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
 * SMS입출금.서비스.기본정보.컨트롤러.입력.IO
 */
@WooriOmmOption(dataMasking=true)
@XmlType(propOrder={
	"userId", "itcsno", "encyRbno", "ebnkUtzpeNo", "trnDis", "tgtAcno"
}, name="INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT")
@XmlRootElement(name="INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT")
@BxmCategory(logicalName="SMS입출금.서비스.기본정보.컨트롤러.입력.IO", description="SMS입출금.서비스.기본정보.컨트롤러.입력.IO") 
public class INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 433806882L;
	
	
	
	/**
	 * 사용자ID
	 */
	@ApiModelProperty(
		name = "userId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("userId")
	@BxmOmm_Field(length=20, decimal=0, description="사용자ID", align="left", fill="")
	private String userId= "";
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=11, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 암호화주민사업자등록번호
	 */
	@ApiModelProperty(
		name = "encyRbno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyRbno")
	@BxmOmm_Field(length=64, decimal=0, description="암호화주민사업자등록번호", align="left", fill="")
	private String encyRbno= "";
	
	
	/**
	 * 전자뱅킹이용자번호
	 */
	@ApiModelProperty(
		name = "ebnkUtzpeNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ebnkUtzpeNo")
	@BxmOmm_Field(length=13, decimal=0, description="전자뱅킹이용자번호", align="left", fill="")
	private String ebnkUtzpeNo= "";
	
	
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
	@BxmOmm_Field(length=20, decimal=0, description="수신계좌번호", align="left", fill="", formatType="masking", format="M141")
	private String tgtAcno= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_userId= false;
	protected final boolean isSet_userId(){
		return this.isSet_userId;
	}
	private void setIsSet_userId(boolean value){
		this.isSet_userId= value;
	}
	/**
	 * 사용자ID
	 */
	@XmlTransient
	public String getUserId(){
		return this.userId;
	}
	
	/**
	 * 사용자ID
	 * 
	 * @param userId 사용자ID
	 */
	public void setUserId(String userId){
		this.userId= userId;
		this.setIsSet_userId(true);
	}
	
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
	private boolean isSet_encyRbno= false;
	protected final boolean isSet_encyRbno(){
		return this.isSet_encyRbno;
	}
	private void setIsSet_encyRbno(boolean value){
		this.isSet_encyRbno= value;
	}
	/**
	 * 암호화주민사업자등록번호
	 */
	@XmlTransient
	public String getEncyRbno(){
		return this.encyRbno;
	}
	
	/**
	 * 암호화주민사업자등록번호
	 * 
	 * @param encyRbno 암호화주민사업자등록번호
	 */
	public void setEncyRbno(String encyRbno){
		this.encyRbno= encyRbno;
		this.setIsSet_encyRbno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ebnkUtzpeNo= false;
	protected final boolean isSet_ebnkUtzpeNo(){
		return this.isSet_ebnkUtzpeNo;
	}
	private void setIsSet_ebnkUtzpeNo(boolean value){
		this.isSet_ebnkUtzpeNo= value;
	}
	/**
	 * 전자뱅킹이용자번호
	 */
	@XmlTransient
	public String getEbnkUtzpeNo(){
		return this.ebnkUtzpeNo;
	}
	
	/**
	 * 전자뱅킹이용자번호
	 * 
	 * @param ebnkUtzpeNo 전자뱅킹이용자번호
	 */
	public void setEbnkUtzpeNo(String ebnkUtzpeNo){
		this.ebnkUtzpeNo= ebnkUtzpeNo;
		this.setIsSet_ebnkUtzpeNo(true);
	}
	
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
				
	@Override
	public INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT clone(){
		try{
			INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT object= (INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT)super.clone();
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
		
		result= prime * result + ((this.userId==null)?0:this.userId.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.encyRbno==null)?0:this.encyRbno.hashCode());
		result= prime * result + ((this.ebnkUtzpeNo==null)?0:this.ebnkUtzpeNo.hashCode());
		result= prime * result + ((this.trnDis==null)?0:this.trnDis.hashCode());
		result= prime * result + ((this.tgtAcno==null)?0:this.tgtAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT other= (INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT)obj;
		{
			Object _userId= getUserId();
			Object __userId= other.getUserId();
			if ( _userId== null ) { if ( __userId!= null ) return false; }
			else if ( !_userId.equals(__userId) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _encyRbno= getEncyRbno();
			Object __encyRbno= other.getEncyRbno();
			if ( _encyRbno== null ) { if ( __encyRbno!= null ) return false; }
			else if ( !_encyRbno.equals(__encyRbno) ) return false;
		}
		{
			Object _ebnkUtzpeNo= getEbnkUtzpeNo();
			Object __ebnkUtzpeNo= other.getEbnkUtzpeNo();
			if ( _ebnkUtzpeNo== null ) { if ( __ebnkUtzpeNo!= null ) return false; }
			else if ( !_ebnkUtzpeNo.equals(__ebnkUtzpeNo) ) return false;
		}
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawNtcSrvcSelectSmsRawSrvcBsci_IDT.class.getName()).append(":\n");
		sb.append("\tuserId: ");
		sb.append(userId==null?"null":getUserId());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tencyRbno: ");
		sb.append(encyRbno==null?"null":getEncyRbno());
		sb.append("\n");
		sb.append("\tebnkUtzpeNo: ");
		sb.append(ebnkUtzpeNo==null?"null":getEbnkUtzpeNo());
		sb.append("\n");
		sb.append("\ttrnDis: ");
		sb.append(trnDis==null?"null":getTrnDis());
		sb.append("\n");
		sb.append("\ttgtAcno: ");
		sb.append(tgtAcno==null?"null":getTgtAcno().toString().replaceAll(".", "."));
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* userId */
		messageLen+= 11; /* itcsno */
		messageLen+= 64; /* encyRbno */
		messageLen+= 13; /* ebnkUtzpeNo */
		messageLen+= 1; /* trnDis */
		messageLen+= 20; /* tgtAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("userId");
		list.add("itcsno");
		list.add("encyRbno");
		list.add("ebnkUtzpeNo");
		list.add("trnDis");
		list.add("tgtAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("userId", get("userId"));
		map.put("itcsno", get("itcsno"));
		map.put("encyRbno", get("encyRbno"));
		map.put("ebnkUtzpeNo", get("ebnkUtzpeNo"));
		map.put("trnDis", get("trnDis"));
		map.put("tgtAcno", get("tgtAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -836030906:/* userId */
			return getUserId();
		case -1178714660:/* itcsno */
			return getItcsno();
		case 1719914352:/* encyRbno */
			return getEncyRbno();
		case -1070809513:/* ebnkUtzpeNo */
			return getEbnkUtzpeNo();
		case -865358658:/* trnDis */
			return getTrnDis();
		case -1365789340:/* tgtAcno */
			return getTgtAcno();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -836030906:/* userId */
			setUserId((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 1719914352:/* encyRbno */
			setEncyRbno((String)value);
			break;
		case -1070809513:/* ebnkUtzpeNo */
			setEbnkUtzpeNo((String)value);
			break;
		case -865358658:/* trnDis */
			setTrnDis((String)value);
			break;
		case -1365789340:/* tgtAcno */
			setTgtAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
