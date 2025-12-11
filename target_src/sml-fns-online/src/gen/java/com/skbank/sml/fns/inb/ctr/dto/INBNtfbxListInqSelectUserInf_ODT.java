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

/**
 * 사용자정보조회
 */
@XmlType(propOrder={
	"itcsno", "cusKorlNm", "esnsMbhYn", "lginYn", "hpComCd", "hpTlenNo", "hpSrno"
}, name="INBNtfbxListInqSelectUserInf_ODT")
@XmlRootElement(name="INBNtfbxListInqSelectUserInf_ODT")
@BxmCategory(logicalName="사용자정보조회", description="사용자정보조회") 
public class INBNtfbxListInqSelectUserInf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -719792990L;
	
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=11, decimal=0, description="통합고객번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
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
	@BxmOmm_Field(length=100, decimal=0, description="고객한글명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String cusKorlNm= "";
	
	
	/**
	 * 간편회원여부
	 */
	@ApiModelProperty(
		name = "esnsMbhYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsMbhYn")
	@BxmOmm_Field(length=1, decimal=0, description="간편회원여부", align="left", fill="")
	private String esnsMbhYn= "";
	
	
	/**
	 * 로그인여부
	 */
	@ApiModelProperty(
		name = "lginYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lginYn")
	@BxmOmm_Field(length=1, decimal=0, description="로그인여부", align="left", fill="")
	private String lginYn= "";
	
	
	/**
	 * 핸드폰회사코드
	 */
	@ApiModelProperty(
		name = "hpComCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("hpComCd")
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰회사코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
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
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰국번번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
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
	@BxmOmm_Field(length=4, decimal=0, description="핸드폰일련번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String hpSrno= "";
	
	
	
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
	private boolean isSet_esnsMbhYn= false;
	protected final boolean isSet_esnsMbhYn(){
		return this.isSet_esnsMbhYn;
	}
	private void setIsSet_esnsMbhYn(boolean value){
		this.isSet_esnsMbhYn= value;
	}
	/**
	 * 간편회원여부
	 */
	@XmlTransient
	public String getEsnsMbhYn(){
		return this.esnsMbhYn;
	}
	
	/**
	 * 간편회원여부
	 * 
	 * @param esnsMbhYn 간편회원여부
	 */
	public void setEsnsMbhYn(String esnsMbhYn){
		this.esnsMbhYn= esnsMbhYn;
		this.setIsSet_esnsMbhYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lginYn= false;
	protected final boolean isSet_lginYn(){
		return this.isSet_lginYn;
	}
	private void setIsSet_lginYn(boolean value){
		this.isSet_lginYn= value;
	}
	/**
	 * 로그인여부
	 */
	@XmlTransient
	public String getLginYn(){
		return this.lginYn;
	}
	
	/**
	 * 로그인여부
	 * 
	 * @param lginYn 로그인여부
	 */
	public void setLginYn(String lginYn){
		this.lginYn= lginYn;
		this.setIsSet_lginYn(true);
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
				
	@Override
	public INBNtfbxListInqSelectUserInf_ODT clone(){
		try{
			INBNtfbxListInqSelectUserInf_ODT object= (INBNtfbxListInqSelectUserInf_ODT)super.clone();
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
		result= prime * result + ((this.cusKorlNm==null)?0:this.cusKorlNm.hashCode());
		result= prime * result + ((this.esnsMbhYn==null)?0:this.esnsMbhYn.hashCode());
		result= prime * result + ((this.lginYn==null)?0:this.lginYn.hashCode());
		result= prime * result + ((this.hpComCd==null)?0:this.hpComCd.hashCode());
		result= prime * result + ((this.hpTlenNo==null)?0:this.hpTlenNo.hashCode());
		result= prime * result + ((this.hpSrno==null)?0:this.hpSrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBNtfbxListInqSelectUserInf_ODT other= (INBNtfbxListInqSelectUserInf_ODT)obj;
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
			Object _esnsMbhYn= getEsnsMbhYn();
			Object __esnsMbhYn= other.getEsnsMbhYn();
			if ( _esnsMbhYn== null ) { if ( __esnsMbhYn!= null ) return false; }
			else if ( !_esnsMbhYn.equals(__esnsMbhYn) ) return false;
		}
		{
			Object _lginYn= getLginYn();
			Object __lginYn= other.getLginYn();
			if ( _lginYn== null ) { if ( __lginYn!= null ) return false; }
			else if ( !_lginYn.equals(__lginYn) ) return false;
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
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBNtfbxListInqSelectUserInf_ODT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tcusKorlNm: ");
		sb.append(cusKorlNm==null?"null":getCusKorlNm());
		sb.append("\n");
		sb.append("\tesnsMbhYn: ");
		sb.append(esnsMbhYn==null?"null":getEsnsMbhYn());
		sb.append("\n");
		sb.append("\tlginYn: ");
		sb.append(lginYn==null?"null":getLginYn());
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
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 11; /* itcsno */
		messageLen+= 100; /* cusKorlNm */
		messageLen+= 1; /* esnsMbhYn */
		messageLen+= 1; /* lginYn */
		messageLen+= 4; /* hpComCd */
		messageLen+= 4; /* hpTlenNo */
		messageLen+= 4; /* hpSrno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("cusKorlNm");
		list.add("esnsMbhYn");
		list.add("lginYn");
		list.add("hpComCd");
		list.add("hpTlenNo");
		list.add("hpSrno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("cusKorlNm", get("cusKorlNm"));
		map.put("esnsMbhYn", get("esnsMbhYn"));
		map.put("lginYn", get("lginYn"));
		map.put("hpComCd", get("hpComCd"));
		map.put("hpTlenNo", get("hpTlenNo"));
		map.put("hpSrno", get("hpSrno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 437921438:/* cusKorlNm */
			return getCusKorlNm();
		case -1396905803:/* esnsMbhYn */
			return getEsnsMbhYn();
		case -1104659691:/* lginYn */
			return getLginYn();
		case 1082856858:/* hpComCd */
			return getHpComCd();
		case -307448342:/* hpTlenNo */
			return getHpTlenNo();
		case -1211515512:/* hpSrno */
			return getHpSrno();
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
		case 437921438:/* cusKorlNm */
			setCusKorlNm((String)value);
			break;
		case -1396905803:/* esnsMbhYn */
			setEsnsMbhYn((String)value);
			break;
		case -1104659691:/* lginYn */
			setLginYn((String)value);
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
		default:
			break;
		}
	}
	
}
