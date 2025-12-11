/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mnp.ctr.dto;

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
	"actMngBrcd", "lstTrhsSrno", "csno", "cusKorlNm", "prcRtcd", "prcRstTxt"
}, name="MNPMnyPinWallMngInsertWallIntAmTs_ODT")
@XmlRootElement(name="MNPMnyPinWallMngInsertWallIntAmTs_ODT")
@BxmCategory(logicalName="머니클립지갑이자계산정보조회.출력IO", description="") 
public class MNPMnyPinWallMngInsertWallIntAmTs_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -22678596L;
	
	
	
	/**
	 * 계좌관리점코드
	 */
	@ApiModelProperty(
		name = "actMngBrcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actMngBrcd")
	@BxmOmm_Field(length=6, decimal=0, description="계좌관리점코드", align="left", fill="")
	private String actMngBrcd= "";
	
	
	/**
	 * 최종거래명세일련번호
	 */
	@ApiModelProperty(
		name = "lstTrhsSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("lstTrhsSrno")
	@BxmOmm_Field(length=7, decimal=0, description="최종거래명세일련번호", align="right", fill="")
	private Integer lstTrhsSrno= 0;
	
	
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
	 * 처리결과코드
	 */
	@ApiModelProperty(
		name = "prcRtcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prcRtcd")
	@BxmOmm_Field(length=7, decimal=0, description="처리결과코드", align="left", fill="")
	private String prcRtcd= "";
	
	
	/**
	 * 처리결과내용
	 */
	@ApiModelProperty(
		name = "prcRstTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prcRstTxt")
	@BxmOmm_Field(length=38, decimal=0, description="처리결과내용", align="left", fill="")
	private String prcRstTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actMngBrcd= false;
	protected final boolean isSet_actMngBrcd(){
		return this.isSet_actMngBrcd;
	}
	private void setIsSet_actMngBrcd(boolean value){
		this.isSet_actMngBrcd= value;
	}
	/**
	 * 계좌관리점코드
	 */
	@XmlTransient
	public String getActMngBrcd(){
		return this.actMngBrcd;
	}
	
	/**
	 * 계좌관리점코드
	 * 
	 * @param actMngBrcd 계좌관리점코드
	 */
	public void setActMngBrcd(String actMngBrcd){
		this.actMngBrcd= actMngBrcd;
		this.setIsSet_actMngBrcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstTrhsSrno= false;
	protected final boolean isSet_lstTrhsSrno(){
		return this.isSet_lstTrhsSrno;
	}
	private void setIsSet_lstTrhsSrno(boolean value){
		this.isSet_lstTrhsSrno= value;
	}
	/**
	 * 최종거래명세일련번호
	 */
	@XmlTransient
	public Integer getLstTrhsSrno(){
		return this.lstTrhsSrno;
	}
	
	/**
	 * 최종거래명세일련번호
	 * 
	 * @param lstTrhsSrno 최종거래명세일련번호
	 */
	public void setLstTrhsSrno(Integer lstTrhsSrno){
		this.lstTrhsSrno= lstTrhsSrno;
		this.setIsSet_lstTrhsSrno(true);
	}
	
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
	private boolean isSet_prcRtcd= false;
	protected final boolean isSet_prcRtcd(){
		return this.isSet_prcRtcd;
	}
	private void setIsSet_prcRtcd(boolean value){
		this.isSet_prcRtcd= value;
	}
	/**
	 * 처리결과코드
	 */
	@XmlTransient
	public String getPrcRtcd(){
		return this.prcRtcd;
	}
	
	/**
	 * 처리결과코드
	 * 
	 * @param prcRtcd 처리결과코드
	 */
	public void setPrcRtcd(String prcRtcd){
		this.prcRtcd= prcRtcd;
		this.setIsSet_prcRtcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prcRstTxt= false;
	protected final boolean isSet_prcRstTxt(){
		return this.isSet_prcRstTxt;
	}
	private void setIsSet_prcRstTxt(boolean value){
		this.isSet_prcRstTxt= value;
	}
	/**
	 * 처리결과내용
	 */
	@XmlTransient
	public String getPrcRstTxt(){
		return this.prcRstTxt;
	}
	
	/**
	 * 처리결과내용
	 * 
	 * @param prcRstTxt 처리결과내용
	 */
	public void setPrcRstTxt(String prcRstTxt){
		this.prcRstTxt= prcRstTxt;
		this.setIsSet_prcRstTxt(true);
	}
				
	@Override
	public MNPMnyPinWallMngInsertWallIntAmTs_ODT clone(){
		try{
			MNPMnyPinWallMngInsertWallIntAmTs_ODT object= (MNPMnyPinWallMngInsertWallIntAmTs_ODT)super.clone();
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
		
		result= prime * result + ((this.actMngBrcd==null)?0:this.actMngBrcd.hashCode());
		result= prime * result + ((this.lstTrhsSrno==null)?0:this.lstTrhsSrno.hashCode());
		result= prime * result + ((this.csno==null)?0:this.csno.hashCode());
		result= prime * result + ((this.cusKorlNm==null)?0:this.cusKorlNm.hashCode());
		result= prime * result + ((this.prcRtcd==null)?0:this.prcRtcd.hashCode());
		result= prime * result + ((this.prcRstTxt==null)?0:this.prcRstTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngInsertWallIntAmTs_ODT other= (MNPMnyPinWallMngInsertWallIntAmTs_ODT)obj;
		{
			Object _actMngBrcd= getActMngBrcd();
			Object __actMngBrcd= other.getActMngBrcd();
			if ( _actMngBrcd== null ) { if ( __actMngBrcd!= null ) return false; }
			else if ( !_actMngBrcd.equals(__actMngBrcd) ) return false;
		}
		{
			Object _lstTrhsSrno= getLstTrhsSrno();
			Object __lstTrhsSrno= other.getLstTrhsSrno();
			if ( _lstTrhsSrno== null ) { if ( __lstTrhsSrno!= null ) return false; }
			else if ( !_lstTrhsSrno.equals(__lstTrhsSrno) ) return false;
		}
		{
			Object _csno= getCsno();
			Object __csno= other.getCsno();
			if ( _csno== null ) { if ( __csno!= null ) return false; }
			else if ( !_csno.equals(__csno) ) return false;
		}
		{
			Object _cusKorlNm= getCusKorlNm();
			Object __cusKorlNm= other.getCusKorlNm();
			if ( _cusKorlNm== null ) { if ( __cusKorlNm!= null ) return false; }
			else if ( !_cusKorlNm.equals(__cusKorlNm) ) return false;
		}
		{
			Object _prcRtcd= getPrcRtcd();
			Object __prcRtcd= other.getPrcRtcd();
			if ( _prcRtcd== null ) { if ( __prcRtcd!= null ) return false; }
			else if ( !_prcRtcd.equals(__prcRtcd) ) return false;
		}
		{
			Object _prcRstTxt= getPrcRstTxt();
			Object __prcRstTxt= other.getPrcRstTxt();
			if ( _prcRstTxt== null ) { if ( __prcRstTxt!= null ) return false; }
			else if ( !_prcRstTxt.equals(__prcRstTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngInsertWallIntAmTs_ODT.class.getName()).append(":\n");
		sb.append("\tactMngBrcd: ");
		sb.append(actMngBrcd==null?"null":getActMngBrcd());
		sb.append("\n");
		sb.append("\tlstTrhsSrno: ");
		sb.append(lstTrhsSrno==null?"null":getLstTrhsSrno());
		sb.append("\n");
		sb.append("\tcsno: ");
		sb.append(csno==null?"null":getCsno());
		sb.append("\n");
		sb.append("\tcusKorlNm: ");
		sb.append(cusKorlNm==null?"null":getCusKorlNm());
		sb.append("\n");
		sb.append("\tprcRtcd: ");
		sb.append(prcRtcd==null?"null":getPrcRtcd());
		sb.append("\n");
		sb.append("\tprcRstTxt: ");
		sb.append(prcRstTxt==null?"null":getPrcRstTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 6; /* actMngBrcd */
		messageLen+= 7; /* lstTrhsSrno */
		messageLen+= 9; /* csno */
		messageLen+= 100; /* cusKorlNm */
		messageLen+= 7; /* prcRtcd */
		messageLen+= 38; /* prcRstTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("actMngBrcd");
		list.add("lstTrhsSrno");
		list.add("csno");
		list.add("cusKorlNm");
		list.add("prcRtcd");
		list.add("prcRstTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("actMngBrcd", get("actMngBrcd"));
		map.put("lstTrhsSrno", get("lstTrhsSrno"));
		map.put("csno", get("csno"));
		map.put("cusKorlNm", get("cusKorlNm"));
		map.put("prcRtcd", get("prcRtcd"));
		map.put("prcRstTxt", get("prcRstTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1559022651:/* actMngBrcd */
			return getActMngBrcd();
		case 416851702:/* lstTrhsSrno */
			return getLstTrhsSrno();
		case 3063345:/* csno */
			return getCsno();
		case 437921438:/* cusKorlNm */
			return getCusKorlNm();
		case -321093532:/* prcRtcd */
			return getPrcRtcd();
		case 666332446:/* prcRstTxt */
			return getPrcRstTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1559022651:/* actMngBrcd */
			setActMngBrcd((String)value);
			break;
		case 416851702:/* lstTrhsSrno */
			setLstTrhsSrno((Integer)value);
			break;
		case 3063345:/* csno */
			setCsno((String)value);
			break;
		case 437921438:/* cusKorlNm */
			setCusKorlNm((String)value);
			break;
		case -321093532:/* prcRtcd */
			setPrcRtcd((String)value);
			break;
		case 666332446:/* prcRstTxt */
			setPrcRstTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
