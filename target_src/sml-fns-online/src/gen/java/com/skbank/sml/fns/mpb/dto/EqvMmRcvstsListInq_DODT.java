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
	"trnSrno", "dpsRapDscd", "trnStcd", "trnAm", "rcvMbhNm"
}, name="EqvMmRcvstsListInq_DODT")
@XmlRootElement(name="EqvMmRcvstsListInq_DODT")
@BxmCategory(logicalName="해당.월.입금현황.목록.조회.DBM.출력.IO", description="") 
public class EqvMmRcvstsListInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1535275563L;
	
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=4, decimal=0, description="거래일련번호", align="left", fill="")
	private String trnSrno= "";
	
	
	/**
	 * 수신입지급구분코드
	 */
	@ApiModelProperty(
		name = "dpsRapDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("dpsRapDscd")
	@BxmOmm_Field(length=1, decimal=0, description="수신입지급구분코드", align="left", fill="")
	private String dpsRapDscd= "";
	
	
	/**
	 * 거래상태코드
	 */
	@ApiModelProperty(
		name = "trnStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnStcd")
	@BxmOmm_Field(length=2, decimal=0, description="거래상태코드", align="left", fill="")
	private String trnStcd= "";
	
	
	/**
	 * 거래금액
	 */
	@ApiModelProperty(
		name = "trnAm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnAm")
	@BxmOmm_Field(length=20, decimal=0, description="거래금액", align="left", fill="")
	private String trnAm= "";
	
	
	/**
	 * 입금회원명
	 */
	@ApiModelProperty(
		name = "rcvMbhNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvMbhNm")
	@BxmOmm_Field(length=60, decimal=0, description="입금회원명", align="left", fill="")
	private String rcvMbhNm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnSrno= false;
	protected final boolean isSet_trnSrno(){
		return this.isSet_trnSrno;
	}
	private void setIsSet_trnSrno(boolean value){
		this.isSet_trnSrno= value;
	}
	/**
	 * 거래일련번호
	 */
	@XmlTransient
	public String getTrnSrno(){
		return this.trnSrno;
	}
	
	/**
	 * 거래일련번호
	 * 
	 * @param trnSrno 거래일련번호
	 */
	public void setTrnSrno(String trnSrno){
		this.trnSrno= trnSrno;
		this.setIsSet_trnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_dpsRapDscd= false;
	protected final boolean isSet_dpsRapDscd(){
		return this.isSet_dpsRapDscd;
	}
	private void setIsSet_dpsRapDscd(boolean value){
		this.isSet_dpsRapDscd= value;
	}
	/**
	 * 수신입지급구분코드
	 */
	@XmlTransient
	public String getDpsRapDscd(){
		return this.dpsRapDscd;
	}
	
	/**
	 * 수신입지급구분코드
	 * 
	 * @param dpsRapDscd 수신입지급구분코드
	 */
	public void setDpsRapDscd(String dpsRapDscd){
		this.dpsRapDscd= dpsRapDscd;
		this.setIsSet_dpsRapDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnStcd= false;
	protected final boolean isSet_trnStcd(){
		return this.isSet_trnStcd;
	}
	private void setIsSet_trnStcd(boolean value){
		this.isSet_trnStcd= value;
	}
	/**
	 * 거래상태코드
	 */
	@XmlTransient
	public String getTrnStcd(){
		return this.trnStcd;
	}
	
	/**
	 * 거래상태코드
	 * 
	 * @param trnStcd 거래상태코드
	 */
	public void setTrnStcd(String trnStcd){
		this.trnStcd= trnStcd;
		this.setIsSet_trnStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnAm= false;
	protected final boolean isSet_trnAm(){
		return this.isSet_trnAm;
	}
	private void setIsSet_trnAm(boolean value){
		this.isSet_trnAm= value;
	}
	/**
	 * 거래금액
	 */
	@XmlTransient
	public String getTrnAm(){
		return this.trnAm;
	}
	
	/**
	 * 거래금액
	 * 
	 * @param trnAm 거래금액
	 */
	public void setTrnAm(String trnAm){
		this.trnAm= trnAm;
		this.setIsSet_trnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvMbhNm= false;
	protected final boolean isSet_rcvMbhNm(){
		return this.isSet_rcvMbhNm;
	}
	private void setIsSet_rcvMbhNm(boolean value){
		this.isSet_rcvMbhNm= value;
	}
	/**
	 * 입금회원명
	 */
	@XmlTransient
	public String getRcvMbhNm(){
		return this.rcvMbhNm;
	}
	
	/**
	 * 입금회원명
	 * 
	 * @param rcvMbhNm 입금회원명
	 */
	public void setRcvMbhNm(String rcvMbhNm){
		this.rcvMbhNm= rcvMbhNm;
		this.setIsSet_rcvMbhNm(true);
	}
				
	@Override
	public EqvMmRcvstsListInq_DODT clone(){
		try{
			EqvMmRcvstsListInq_DODT object= (EqvMmRcvstsListInq_DODT)super.clone();
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
		
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		result= prime * result + ((this.dpsRapDscd==null)?0:this.dpsRapDscd.hashCode());
		result= prime * result + ((this.trnStcd==null)?0:this.trnStcd.hashCode());
		result= prime * result + ((this.trnAm==null)?0:this.trnAm.hashCode());
		result= prime * result + ((this.rcvMbhNm==null)?0:this.rcvMbhNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final EqvMmRcvstsListInq_DODT other= (EqvMmRcvstsListInq_DODT)obj;
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		{
			Object _dpsRapDscd= getDpsRapDscd();
			Object __dpsRapDscd= other.getDpsRapDscd();
			if ( _dpsRapDscd== null ) { if ( __dpsRapDscd!= null ) return false; }
			else if ( !_dpsRapDscd.equals(__dpsRapDscd) ) return false;
		}
		{
			Object _trnStcd= getTrnStcd();
			Object __trnStcd= other.getTrnStcd();
			if ( _trnStcd== null ) { if ( __trnStcd!= null ) return false; }
			else if ( !_trnStcd.equals(__trnStcd) ) return false;
		}
		{
			Object _trnAm= getTrnAm();
			Object __trnAm= other.getTrnAm();
			if ( _trnAm== null ) { if ( __trnAm!= null ) return false; }
			else if ( !_trnAm.equals(__trnAm) ) return false;
		}
		{
			Object _rcvMbhNm= getRcvMbhNm();
			Object __rcvMbhNm= other.getRcvMbhNm();
			if ( _rcvMbhNm== null ) { if ( __rcvMbhNm!= null ) return false; }
			else if ( !_rcvMbhNm.equals(__rcvMbhNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(EqvMmRcvstsListInq_DODT.class.getName()).append(":\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("\tdpsRapDscd: ");
		sb.append(dpsRapDscd==null?"null":getDpsRapDscd());
		sb.append("\n");
		sb.append("\ttrnStcd: ");
		sb.append(trnStcd==null?"null":getTrnStcd());
		sb.append("\n");
		sb.append("\ttrnAm: ");
		sb.append(trnAm==null?"null":getTrnAm());
		sb.append("\n");
		sb.append("\trcvMbhNm: ");
		sb.append(rcvMbhNm==null?"null":getRcvMbhNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 4; /* trnSrno */
		messageLen+= 1; /* dpsRapDscd */
		messageLen+= 2; /* trnStcd */
		messageLen+= 20; /* trnAm */
		messageLen+= 60; /* rcvMbhNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("trnSrno");
		list.add("dpsRapDscd");
		list.add("trnStcd");
		list.add("trnAm");
		list.add("rcvMbhNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("trnSrno", get("trnSrno"));
		map.put("dpsRapDscd", get("dpsRapDscd"));
		map.put("trnStcd", get("trnStcd"));
		map.put("trnAm", get("trnAm"));
		map.put("rcvMbhNm", get("rcvMbhNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1055859152:/* trnSrno */
			return getTrnSrno();
		case -1839733366:/* dpsRapDscd */
			return getDpsRapDscd();
		case -1055857582:/* trnStcd */
			return getTrnStcd();
		case 110632444:/* trnAm */
			return getTrnAm();
		case -2062160595:/* rcvMbhNm */
			return getRcvMbhNm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1055859152:/* trnSrno */
			setTrnSrno((String)value);
			break;
		case -1839733366:/* dpsRapDscd */
			setDpsRapDscd((String)value);
			break;
		case -1055857582:/* trnStcd */
			setTrnStcd((String)value);
			break;
		case 110632444:/* trnAm */
			setTrnAm((String)value);
			break;
		case -2062160595:/* rcvMbhNm */
			setRcvMbhNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
