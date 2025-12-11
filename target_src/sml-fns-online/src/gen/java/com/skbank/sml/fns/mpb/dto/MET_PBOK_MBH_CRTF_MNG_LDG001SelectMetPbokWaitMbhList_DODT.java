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
	"metMngNo", "metCrtfMbhSrno", "utzpeNoCfcd", "itcsno", "esnsMbhNo", "metMbhNm", "metMbhHpNo", "metMbhStcd", "metMbhDscd", "metMbhSrno"
}, name="MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT")
@XmlRootElement(name="MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT")
@BxmCategory(logicalName="모임통장대기회원목록조회 출력", description="") 
public class MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1718977921L;
	
	
	
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
	 * 모임인증회원일련번호
	 */
	@ApiModelProperty(
		name = "metCrtfMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metCrtfMbhSrno")
	@BxmOmm_Field(length=5, decimal=0, description="모임인증회원일련번호", align="right", fill="")
	private Integer metCrtfMbhSrno= 0;
	
	
	/**
	 * 이용자번호분류코드
	 */
	@ApiModelProperty(
		name = "utzpeNoCfcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("utzpeNoCfcd")
	@BxmOmm_Field(length=2, decimal=0, description="이용자번호분류코드", align="left", fill="")
	private String utzpeNoCfcd= "";
	
	
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
	 * 간편회원번호
	 */
	@ApiModelProperty(
		name = "esnsMbhNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("esnsMbhNo")
	@BxmOmm_Field(length=11, decimal=0, description="간편회원번호", align="left", fill="")
	private String esnsMbhNo= "";
	
	
	/**
	 * 모임회원명
	 */
	@ApiModelProperty(
		name = "metMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhNm")
	@BxmOmm_Field(length=60, decimal=0, description="모임회원명", align="left", fill="")
	private String metMbhNm= "";
	
	
	/**
	 * 모임회원핸드폰번호
	 */
	@ApiModelProperty(
		name = "metMbhHpNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhHpNo")
	@BxmOmm_Field(length=11, decimal=0, description="모임회원핸드폰번호", align="left", fill="")
	private String metMbhHpNo= "";
	
	
	/**
	 * 모임회원상태코드
	 */
	@ApiModelProperty(
		name = "metMbhStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhStcd")
	@BxmOmm_Field(length=2, decimal=0, description="모임회원상태코드", align="left", fill="")
	private String metMbhStcd= "";
	
	
	/**
	 * 모임회원구분코드
	 */
	@ApiModelProperty(
		name = "metMbhDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임회원구분코드", align="left", fill="")
	private String metMbhDscd= "";
	
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="모임회원일련번호", align="right", fill="0")
	private Integer metMbhSrno= 0;
	
	
	
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
	private boolean isSet_metCrtfMbhSrno= false;
	protected final boolean isSet_metCrtfMbhSrno(){
		return this.isSet_metCrtfMbhSrno;
	}
	private void setIsSet_metCrtfMbhSrno(boolean value){
		this.isSet_metCrtfMbhSrno= value;
	}
	/**
	 * 모임인증회원일련번호
	 */
	@XmlTransient
	public Integer getMetCrtfMbhSrno(){
		return this.metCrtfMbhSrno;
	}
	
	/**
	 * 모임인증회원일련번호
	 * 
	 * @param metCrtfMbhSrno 모임인증회원일련번호
	 */
	public void setMetCrtfMbhSrno(Integer metCrtfMbhSrno){
		this.metCrtfMbhSrno= metCrtfMbhSrno;
		this.setIsSet_metCrtfMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_utzpeNoCfcd= false;
	protected final boolean isSet_utzpeNoCfcd(){
		return this.isSet_utzpeNoCfcd;
	}
	private void setIsSet_utzpeNoCfcd(boolean value){
		this.isSet_utzpeNoCfcd= value;
	}
	/**
	 * 이용자번호분류코드
	 */
	@XmlTransient
	public String getUtzpeNoCfcd(){
		return this.utzpeNoCfcd;
	}
	
	/**
	 * 이용자번호분류코드
	 * 
	 * @param utzpeNoCfcd 이용자번호분류코드
	 */
	public void setUtzpeNoCfcd(String utzpeNoCfcd){
		this.utzpeNoCfcd= utzpeNoCfcd;
		this.setIsSet_utzpeNoCfcd(true);
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
	private boolean isSet_esnsMbhNo= false;
	protected final boolean isSet_esnsMbhNo(){
		return this.isSet_esnsMbhNo;
	}
	private void setIsSet_esnsMbhNo(boolean value){
		this.isSet_esnsMbhNo= value;
	}
	/**
	 * 간편회원번호
	 */
	@XmlTransient
	public String getEsnsMbhNo(){
		return this.esnsMbhNo;
	}
	
	/**
	 * 간편회원번호
	 * 
	 * @param esnsMbhNo 간편회원번호
	 */
	public void setEsnsMbhNo(String esnsMbhNo){
		this.esnsMbhNo= esnsMbhNo;
		this.setIsSet_esnsMbhNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhNm= false;
	protected final boolean isSet_metMbhNm(){
		return this.isSet_metMbhNm;
	}
	private void setIsSet_metMbhNm(boolean value){
		this.isSet_metMbhNm= value;
	}
	/**
	 * 모임회원명
	 */
	@XmlTransient
	public String getMetMbhNm(){
		return this.metMbhNm;
	}
	
	/**
	 * 모임회원명
	 * 
	 * @param metMbhNm 모임회원명
	 */
	public void setMetMbhNm(String metMbhNm){
		this.metMbhNm= metMbhNm;
		this.setIsSet_metMbhNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhHpNo= false;
	protected final boolean isSet_metMbhHpNo(){
		return this.isSet_metMbhHpNo;
	}
	private void setIsSet_metMbhHpNo(boolean value){
		this.isSet_metMbhHpNo= value;
	}
	/**
	 * 모임회원핸드폰번호
	 */
	@XmlTransient
	public String getMetMbhHpNo(){
		return this.metMbhHpNo;
	}
	
	/**
	 * 모임회원핸드폰번호
	 * 
	 * @param metMbhHpNo 모임회원핸드폰번호
	 */
	public void setMetMbhHpNo(String metMbhHpNo){
		this.metMbhHpNo= metMbhHpNo;
		this.setIsSet_metMbhHpNo(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhStcd= false;
	protected final boolean isSet_metMbhStcd(){
		return this.isSet_metMbhStcd;
	}
	private void setIsSet_metMbhStcd(boolean value){
		this.isSet_metMbhStcd= value;
	}
	/**
	 * 모임회원상태코드
	 */
	@XmlTransient
	public String getMetMbhStcd(){
		return this.metMbhStcd;
	}
	
	/**
	 * 모임회원상태코드
	 * 
	 * @param metMbhStcd 모임회원상태코드
	 */
	public void setMetMbhStcd(String metMbhStcd){
		this.metMbhStcd= metMbhStcd;
		this.setIsSet_metMbhStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhDscd= false;
	protected final boolean isSet_metMbhDscd(){
		return this.isSet_metMbhDscd;
	}
	private void setIsSet_metMbhDscd(boolean value){
		this.isSet_metMbhDscd= value;
	}
	/**
	 * 모임회원구분코드
	 */
	@XmlTransient
	public String getMetMbhDscd(){
		return this.metMbhDscd;
	}
	
	/**
	 * 모임회원구분코드
	 * 
	 * @param metMbhDscd 모임회원구분코드
	 */
	public void setMetMbhDscd(String metMbhDscd){
		this.metMbhDscd= metMbhDscd;
		this.setIsSet_metMbhDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metMbhSrno= false;
	protected final boolean isSet_metMbhSrno(){
		return this.isSet_metMbhSrno;
	}
	private void setIsSet_metMbhSrno(boolean value){
		this.isSet_metMbhSrno= value;
	}
	/**
	 * 모임회원일련번호
	 */
	@XmlTransient
	public Integer getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(Integer metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
				
	@Override
	public MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT clone(){
		try{
			MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT object= (MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT)super.clone();
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
		result= prime * result + ((this.metCrtfMbhSrno==null)?0:this.metCrtfMbhSrno.hashCode());
		result= prime * result + ((this.utzpeNoCfcd==null)?0:this.utzpeNoCfcd.hashCode());
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.esnsMbhNo==null)?0:this.esnsMbhNo.hashCode());
		result= prime * result + ((this.metMbhNm==null)?0:this.metMbhNm.hashCode());
		result= prime * result + ((this.metMbhHpNo==null)?0:this.metMbhHpNo.hashCode());
		result= prime * result + ((this.metMbhStcd==null)?0:this.metMbhStcd.hashCode());
		result= prime * result + ((this.metMbhDscd==null)?0:this.metMbhDscd.hashCode());
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT other= (MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metCrtfMbhSrno= getMetCrtfMbhSrno();
			Object __metCrtfMbhSrno= other.getMetCrtfMbhSrno();
			if ( _metCrtfMbhSrno== null ) { if ( __metCrtfMbhSrno!= null ) return false; }
			else if ( !_metCrtfMbhSrno.equals(__metCrtfMbhSrno) ) return false;
		}
		{
			Object _utzpeNoCfcd= getUtzpeNoCfcd();
			Object __utzpeNoCfcd= other.getUtzpeNoCfcd();
			if ( _utzpeNoCfcd== null ) { if ( __utzpeNoCfcd!= null ) return false; }
			else if ( !_utzpeNoCfcd.equals(__utzpeNoCfcd) ) return false;
		}
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _esnsMbhNo= getEsnsMbhNo();
			Object __esnsMbhNo= other.getEsnsMbhNo();
			if ( _esnsMbhNo== null ) { if ( __esnsMbhNo!= null ) return false; }
			else if ( !_esnsMbhNo.equals(__esnsMbhNo) ) return false;
		}
		{
			Object _metMbhNm= getMetMbhNm();
			Object __metMbhNm= other.getMetMbhNm();
			if ( _metMbhNm== null ) { if ( __metMbhNm!= null ) return false; }
			else if ( !_metMbhNm.equals(__metMbhNm) ) return false;
		}
		{
			Object _metMbhHpNo= getMetMbhHpNo();
			Object __metMbhHpNo= other.getMetMbhHpNo();
			if ( _metMbhHpNo== null ) { if ( __metMbhHpNo!= null ) return false; }
			else if ( !_metMbhHpNo.equals(__metMbhHpNo) ) return false;
		}
		{
			Object _metMbhStcd= getMetMbhStcd();
			Object __metMbhStcd= other.getMetMbhStcd();
			if ( _metMbhStcd== null ) { if ( __metMbhStcd!= null ) return false; }
			else if ( !_metMbhStcd.equals(__metMbhStcd) ) return false;
		}
		{
			Object _metMbhDscd= getMetMbhDscd();
			Object __metMbhDscd= other.getMetMbhDscd();
			if ( _metMbhDscd== null ) { if ( __metMbhDscd!= null ) return false; }
			else if ( !_metMbhDscd.equals(__metMbhDscd) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetCrtfMbhSrno: ");
		sb.append(metCrtfMbhSrno==null?"null":getMetCrtfMbhSrno());
		sb.append("\n");
		sb.append("\tutzpeNoCfcd: ");
		sb.append(utzpeNoCfcd==null?"null":getUtzpeNoCfcd());
		sb.append("\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tesnsMbhNo: ");
		sb.append(esnsMbhNo==null?"null":getEsnsMbhNo());
		sb.append("\n");
		sb.append("\tmetMbhNm: ");
		sb.append(metMbhNm==null?"null":getMetMbhNm());
		sb.append("\n");
		sb.append("\tmetMbhHpNo: ");
		sb.append(metMbhHpNo==null?"null":getMetMbhHpNo());
		sb.append("\n");
		sb.append("\tmetMbhStcd: ");
		sb.append(metMbhStcd==null?"null":getMetMbhStcd());
		sb.append("\n");
		sb.append("\tmetMbhDscd: ");
		sb.append(metMbhDscd==null?"null":getMetMbhDscd());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 5; /* metCrtfMbhSrno */
		messageLen+= 2; /* utzpeNoCfcd */
		messageLen+= 11; /* itcsno */
		messageLen+= 11; /* esnsMbhNo */
		messageLen+= 60; /* metMbhNm */
		messageLen+= 11; /* metMbhHpNo */
		messageLen+= 2; /* metMbhStcd */
		messageLen+= 1; /* metMbhDscd */
		messageLen+= 7; /* metMbhSrno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metCrtfMbhSrno");
		list.add("utzpeNoCfcd");
		list.add("itcsno");
		list.add("esnsMbhNo");
		list.add("metMbhNm");
		list.add("metMbhHpNo");
		list.add("metMbhStcd");
		list.add("metMbhDscd");
		list.add("metMbhSrno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metCrtfMbhSrno", get("metCrtfMbhSrno"));
		map.put("utzpeNoCfcd", get("utzpeNoCfcd"));
		map.put("itcsno", get("itcsno"));
		map.put("esnsMbhNo", get("esnsMbhNo"));
		map.put("metMbhNm", get("metMbhNm"));
		map.put("metMbhHpNo", get("metMbhHpNo"));
		map.put("metMbhStcd", get("metMbhStcd"));
		map.put("metMbhDscd", get("metMbhDscd"));
		map.put("metMbhSrno", get("metMbhSrno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -1421578602:/* metCrtfMbhSrno */
			return getMetCrtfMbhSrno();
		case 1125715573:/* utzpeNoCfcd */
			return getUtzpeNoCfcd();
		case -1178714660:/* itcsno */
			return getItcsno();
		case -1396906143:/* esnsMbhNo */
			return getEsnsMbhNo();
		case -468528618:/* metMbhNm */
			return getMetMbhNm();
		case 715390848:/* metMbhHpNo */
			return getMetMbhHpNo();
		case 715723033:/* metMbhStcd */
			return getMetMbhStcd();
		case 715275207:/* metMbhDscd */
			return getMetMbhDscd();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
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
		case -1421578602:/* metCrtfMbhSrno */
			setMetCrtfMbhSrno((Integer)value);
			break;
		case 1125715573:/* utzpeNoCfcd */
			setUtzpeNoCfcd((String)value);
			break;
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case -1396906143:/* esnsMbhNo */
			setEsnsMbhNo((String)value);
			break;
		case -468528618:/* metMbhNm */
			setMetMbhNm((String)value);
			break;
		case 715390848:/* metMbhHpNo */
			setMetMbhHpNo((String)value);
			break;
		case 715723033:/* metMbhStcd */
			setMetMbhStcd((String)value);
			break;
		case 715275207:/* metMbhDscd */
			setMetMbhDscd((String)value);
			break;
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
