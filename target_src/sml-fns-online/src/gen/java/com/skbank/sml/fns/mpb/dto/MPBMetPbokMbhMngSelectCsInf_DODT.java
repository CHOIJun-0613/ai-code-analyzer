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

/**
 * 
 */
@XmlType(propOrder={
	"csno", "itcsno", "cusKorlNm", "hpComCd", "hpTlenNo", "hpSrno", "email", "cusMemoTxt", "cusCiNo", "mydtCusYn"
}, name="MPBMetPbokMbhMngSelectCsInf_DODT")
@XmlRootElement(name="MPBMetPbokMbhMngSelectCsInf_DODT")
@BxmCategory(logicalName="고객.정보.조회 DODT", description="") 
public class MPBMetPbokMbhMngSelectCsInf_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -32679759L;
	
	
	
	/**
	 * 고객번호
	 */
	@ApiModelProperty(
		name = "csno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("csno")
	@BxmOmm_Field(length=9, decimal=0, description="고객번호", align="left", fill="")
	private String csno= "";
	
	
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
	 * 고객한글명
	 */
	@ApiModelProperty(
		name = "cusKorlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusKorlNm")
	@BxmOmm_Field(length=100, decimal=0, description="고객한글명", align="left", fill="")
	private String cusKorlNm= "";
	
	
	/**
	 * 핸드폰회사코드
	 */
	@ApiModelProperty(
		name = "hpComCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpComCd")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰회사코드", align="left", fill="")
	private String hpComCd= "";
	
	
	/**
	 * 핸드폰국번번호
	 */
	@ApiModelProperty(
		name = "hpTlenNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpTlenNo")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰국번번호", align="left", fill="")
	private String hpTlenNo= "";
	
	
	/**
	 * 핸드폰일련번호
	 */
	@ApiModelProperty(
		name = "hpSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpSrno")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰일련번호", align="left", fill="")
	private String hpSrno= "";
	
	
	/**
	 * 이메일주소
	 */
	@ApiModelProperty(
		name = "email"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("email")
	@BxmOmm_Field(length=50, decimal=0, description="이메일주소", align="left", fill="")
	private String email= "";
	
	
	/**
	 * 고객메모내용
	 */
	@ApiModelProperty(
		name = "cusMemoTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusMemoTxt")
	@BxmOmm_Field(length=100, decimal=0, description="고객메모내용", align="left", fill="")
	private String cusMemoTxt= "";
	
	
	/**
	 * 고객CI번호
	 */
	@ApiModelProperty(
		name = "cusCiNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusCiNo")
	@BxmOmm_Field(length=88, decimal=0, description="고객CI번호", align="left", fill="")
	private String cusCiNo= "";
	
	
	/**
	 * 마이데이터고객여부
	 */
	@ApiModelProperty(
		name = "mydtCusYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mydtCusYn")
	@BxmOmm_Field(length=1, decimal=0, description="마이데이터고객여부", align="left", fill="")
	private String mydtCusYn= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_csno= false;
	protected final boolean isSet_csno(){
		return this.isSet_csno;
	}
	private void setIsSet_csno(boolean value){
		this.isSet_csno= value;
	}
	/**
	 * 고객번호
	 */
	@XmlTransient
	public String getCsno(){
		return this.csno;
	}
	
	/**
	 * 고객번호
	 * 
	 * @param csno 고객번호
	 */
	public void setCsno(String csno){
		this.csno= csno;
		this.setIsSet_csno(true);
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
	private boolean isSet_cusKorlNm= false;
	protected final boolean isSet_cusKorlNm(){
		return this.isSet_cusKorlNm;
	}
	private void setIsSet_cusKorlNm(boolean value){
		this.isSet_cusKorlNm= value;
	}
	/**
	 * 고객한글명
	 */
	@XmlTransient
	public String getCusKorlNm(){
		return this.cusKorlNm;
	}
	
	/**
	 * 고객한글명
	 * 
	 * @param cusKorlNm 고객한글명
	 */
	public void setCusKorlNm(String cusKorlNm){
		this.cusKorlNm= cusKorlNm;
		this.setIsSet_cusKorlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpComCd= false;
	protected final boolean isSet_hpComCd(){
		return this.isSet_hpComCd;
	}
	private void setIsSet_hpComCd(boolean value){
		this.isSet_hpComCd= value;
	}
	/**
	 * 핸드폰회사코드
	 */
	@XmlTransient
	public String getHpComCd(){
		return this.hpComCd;
	}
	
	/**
	 * 핸드폰회사코드
	 * 
	 * @param hpComCd 핸드폰회사코드
	 */
	public void setHpComCd(String hpComCd){
		this.hpComCd= hpComCd;
		this.setIsSet_hpComCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpTlenNo= false;
	protected final boolean isSet_hpTlenNo(){
		return this.isSet_hpTlenNo;
	}
	private void setIsSet_hpTlenNo(boolean value){
		this.isSet_hpTlenNo= value;
	}
	/**
	 * 핸드폰국번번호
	 */
	@XmlTransient
	public String getHpTlenNo(){
		return this.hpTlenNo;
	}
	
	/**
	 * 핸드폰국번번호
	 * 
	 * @param hpTlenNo 핸드폰국번번호
	 */
	public void setHpTlenNo(String hpTlenNo){
		this.hpTlenNo= hpTlenNo;
		this.setIsSet_hpTlenNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_hpSrno= false;
	protected final boolean isSet_hpSrno(){
		return this.isSet_hpSrno;
	}
	private void setIsSet_hpSrno(boolean value){
		this.isSet_hpSrno= value;
	}
	/**
	 * 핸드폰일련번호
	 */
	@XmlTransient
	public String getHpSrno(){
		return this.hpSrno;
	}
	
	/**
	 * 핸드폰일련번호
	 * 
	 * @param hpSrno 핸드폰일련번호
	 */
	public void setHpSrno(String hpSrno){
		this.hpSrno= hpSrno;
		this.setIsSet_hpSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_email= false;
	protected final boolean isSet_email(){
		return this.isSet_email;
	}
	private void setIsSet_email(boolean value){
		this.isSet_email= value;
	}
	/**
	 * 이메일주소
	 */
	@XmlTransient
	public String getEmail(){
		return this.email;
	}
	
	/**
	 * 이메일주소
	 * 
	 * @param email 이메일주소
	 */
	public void setEmail(String email){
		this.email= email;
		this.setIsSet_email(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusMemoTxt= false;
	protected final boolean isSet_cusMemoTxt(){
		return this.isSet_cusMemoTxt;
	}
	private void setIsSet_cusMemoTxt(boolean value){
		this.isSet_cusMemoTxt= value;
	}
	/**
	 * 고객메모내용
	 */
	@XmlTransient
	public String getCusMemoTxt(){
		return this.cusMemoTxt;
	}
	
	/**
	 * 고객메모내용
	 * 
	 * @param cusMemoTxt 고객메모내용
	 */
	public void setCusMemoTxt(String cusMemoTxt){
		this.cusMemoTxt= cusMemoTxt;
		this.setIsSet_cusMemoTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusCiNo= false;
	protected final boolean isSet_cusCiNo(){
		return this.isSet_cusCiNo;
	}
	private void setIsSet_cusCiNo(boolean value){
		this.isSet_cusCiNo= value;
	}
	/**
	 * 고객CI번호
	 */
	@XmlTransient
	public String getCusCiNo(){
		return this.cusCiNo;
	}
	
	/**
	 * 고객CI번호
	 * 
	 * @param cusCiNo 고객CI번호
	 */
	public void setCusCiNo(String cusCiNo){
		this.cusCiNo= cusCiNo;
		this.setIsSet_cusCiNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mydtCusYn= false;
	protected final boolean isSet_mydtCusYn(){
		return this.isSet_mydtCusYn;
	}
	private void setIsSet_mydtCusYn(boolean value){
		this.isSet_mydtCusYn= value;
	}
	/**
	 * 마이데이터고객여부
	 */
	@XmlTransient
	public String getMydtCusYn(){
		return this.mydtCusYn;
	}
	
	/**
	 * 마이데이터고객여부
	 * 
	 * @param mydtCusYn 마이데이터고객여부
	 */
	public void setMydtCusYn(String mydtCusYn){
		this.mydtCusYn= mydtCusYn;
		this.setIsSet_mydtCusYn(true);
	}
				
	@Override
	public MPBMetPbokMbhMngSelectCsInf_DODT clone(){
		try{
			MPBMetPbokMbhMngSelectCsInf_DODT object= (MPBMetPbokMbhMngSelectCsInf_DODT)super.clone();
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
		
		result= prime * result + ((this.csno==null)?0:this.csno.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.cusKorlNm==null)?0:this.cusKorlNm.hashCode());
		result= prime * result + ((this.hpComCd==null)?0:this.hpComCd.hashCode());
		result= prime * result + ((this.hpTlenNo==null)?0:this.hpTlenNo.hashCode());
		result= prime * result + ((this.hpSrno==null)?0:this.hpSrno.hashCode());
		result= prime * result + ((this.email==null)?0:this.email.hashCode());
		result= prime * result + ((this.cusMemoTxt==null)?0:this.cusMemoTxt.hashCode());
		result= prime * result + ((this.cusCiNo==null)?0:this.cusCiNo.hashCode());
		result= prime * result + ((this.mydtCusYn==null)?0:this.mydtCusYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokMbhMngSelectCsInf_DODT other= (MPBMetPbokMbhMngSelectCsInf_DODT)obj;
		{
			Object _csno= getCsno();
			Object __csno= other.getCsno();
			if ( _csno== null ) { if ( __csno!= null ) return false; }
			else if ( !_csno.equals(__csno) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _cusKorlNm= getCusKorlNm();
			Object __cusKorlNm= other.getCusKorlNm();
			if ( _cusKorlNm== null ) { if ( __cusKorlNm!= null ) return false; }
			else if ( !_cusKorlNm.equals(__cusKorlNm) ) return false;
		}
		{
			Object _hpComCd= getHpComCd();
			Object __hpComCd= other.getHpComCd();
			if ( _hpComCd== null ) { if ( __hpComCd!= null ) return false; }
			else if ( !_hpComCd.equals(__hpComCd) ) return false;
		}
		{
			Object _hpTlenNo= getHpTlenNo();
			Object __hpTlenNo= other.getHpTlenNo();
			if ( _hpTlenNo== null ) { if ( __hpTlenNo!= null ) return false; }
			else if ( !_hpTlenNo.equals(__hpTlenNo) ) return false;
		}
		{
			Object _hpSrno= getHpSrno();
			Object __hpSrno= other.getHpSrno();
			if ( _hpSrno== null ) { if ( __hpSrno!= null ) return false; }
			else if ( !_hpSrno.equals(__hpSrno) ) return false;
		}
		{
			Object _email= getEmail();
			Object __email= other.getEmail();
			if ( _email== null ) { if ( __email!= null ) return false; }
			else if ( !_email.equals(__email) ) return false;
		}
		{
			Object _cusMemoTxt= getCusMemoTxt();
			Object __cusMemoTxt= other.getCusMemoTxt();
			if ( _cusMemoTxt== null ) { if ( __cusMemoTxt!= null ) return false; }
			else if ( !_cusMemoTxt.equals(__cusMemoTxt) ) return false;
		}
		{
			Object _cusCiNo= getCusCiNo();
			Object __cusCiNo= other.getCusCiNo();
			if ( _cusCiNo== null ) { if ( __cusCiNo!= null ) return false; }
			else if ( !_cusCiNo.equals(__cusCiNo) ) return false;
		}
		{
			Object _mydtCusYn= getMydtCusYn();
			Object __mydtCusYn= other.getMydtCusYn();
			if ( _mydtCusYn== null ) { if ( __mydtCusYn!= null ) return false; }
			else if ( !_mydtCusYn.equals(__mydtCusYn) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokMbhMngSelectCsInf_DODT.class.getName()).append(":\n");
		sb.append("\tcsno: ");
		sb.append(csno==null?"null":getCsno());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tcusKorlNm: ");
		sb.append(cusKorlNm==null?"null":getCusKorlNm());
		sb.append("\n");
		sb.append("\thpComCd: ");
		sb.append(hpComCd==null?"null":getHpComCd());
		sb.append("\n");
		sb.append("\thpTlenNo: ");
		sb.append(hpTlenNo==null?"null":getHpTlenNo());
		sb.append("\n");
		sb.append("\thpSrno: ");
		sb.append(hpSrno==null?"null":getHpSrno());
		sb.append("\n");
		sb.append("\temail: ");
		sb.append(email==null?"null":getEmail());
		sb.append("\n");
		sb.append("\tcusMemoTxt: ");
		sb.append(cusMemoTxt==null?"null":getCusMemoTxt());
		sb.append("\n");
		sb.append("\tcusCiNo: ");
		sb.append(cusCiNo==null?"null":getCusCiNo());
		sb.append("\n");
		sb.append("\tmydtCusYn: ");
		sb.append(mydtCusYn==null?"null":getMydtCusYn());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* csno */
		messageLen+= 11; /* itcsno */
		messageLen+= 100; /* cusKorlNm */
		messageLen+= 4; /* hpComCd */
		messageLen+= 4; /* hpTlenNo */
		messageLen+= 4; /* hpSrno */
		messageLen+= 50; /* email */
		messageLen+= 100; /* cusMemoTxt */
		messageLen+= 88; /* cusCiNo */
		messageLen+= 1; /* mydtCusYn */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("csno");
		list.add("itcsno");
		list.add("cusKorlNm");
		list.add("hpComCd");
		list.add("hpTlenNo");
		list.add("hpSrno");
		list.add("email");
		list.add("cusMemoTxt");
		list.add("cusCiNo");
		list.add("mydtCusYn");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("csno", get("csno"));
		map.put("itcsno", get("itcsno"));
		map.put("cusKorlNm", get("cusKorlNm"));
		map.put("hpComCd", get("hpComCd"));
		map.put("hpTlenNo", get("hpTlenNo"));
		map.put("hpSrno", get("hpSrno"));
		map.put("email", get("email"));
		map.put("cusMemoTxt", get("cusMemoTxt"));
		map.put("cusCiNo", get("cusCiNo"));
		map.put("mydtCusYn", get("mydtCusYn"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3063345:/* csno */
			return getCsno();
		case -1178714660:/* itcsno */
			return getItcsno();
		case 437921438:/* cusKorlNm */
			return getCusKorlNm();
		case 1082856858:/* hpComCd */
			return getHpComCd();
		case -307448342:/* hpTlenNo */
			return getHpTlenNo();
		case -1211515512:/* hpSrno */
			return getHpSrno();
		case 96619420:/* email */
			return getEmail();
		case -2120110763:/* cusMemoTxt */
			return getCusMemoTxt();
		case 1126466216:/* cusCiNo */
			return getCusCiNo();
		case -1369843878:/* mydtCusYn */
			return getMydtCusYn();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3063345:/* csno */
			setCsno((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 437921438:/* cusKorlNm */
			setCusKorlNm((String)value);
			break;
		case 1082856858:/* hpComCd */
			setHpComCd((String)value);
			break;
		case -307448342:/* hpTlenNo */
			setHpTlenNo((String)value);
			break;
		case -1211515512:/* hpSrno */
			setHpSrno((String)value);
			break;
		case 96619420:/* email */
			setEmail((String)value);
			break;
		case -2120110763:/* cusMemoTxt */
			setCusMemoTxt((String)value);
			break;
		case 1126466216:/* cusCiNo */
			setCusCiNo((String)value);
			break;
		case -1369843878:/* mydtCusYn */
			setMydtCusYn((String)value);
			break;
		default:
			break;
		}
	}
	
}
