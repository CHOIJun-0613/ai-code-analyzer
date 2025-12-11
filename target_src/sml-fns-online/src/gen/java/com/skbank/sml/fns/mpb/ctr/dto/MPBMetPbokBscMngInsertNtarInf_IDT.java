/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.mpb.ctr.dto;

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
	"metMngNo", "metNtarRgsDt", "metNtarTxt", "metNtarHdnYn", "metNtarDelYn", "metNtarRgsMbhSrno", "metNtarRgsTm", "metAcno", "rlfAcno"
}, name="MPBMetPbokBscMngInsertNtarInf_IDT")
@XmlRootElement(name="MPBMetPbokBscMngInsertNtarInf_IDT")
@BxmCategory(logicalName="공지사항.정보.등록.컨트롤러.입력.IO", description="") 
public class MPBMetPbokBscMngInsertNtarInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1311566735L;
	
	
	
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
	 * 모임공지사항등록일자
	 */
	@ApiModelProperty(
		name = "metNtarRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임공지사항등록일자", align="left", fill="")
	private String metNtarRgsDt= "";
	
	
	/**
	 * 모임공지사항내용
	 */
	@ApiModelProperty(
		name = "metNtarTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarTxt")
	@BxmOmm_Field(length=500, decimal=0, description="모임공지사항내용", align="left", fill="")
	private String metNtarTxt= "";
	
	
	/**
	 * 모임공지사항숨김여부
	 */
	@ApiModelProperty(
		name = "metNtarHdnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarHdnYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임공지사항숨김여부", align="left", fill="")
	private String metNtarHdnYn= "";
	
	
	/**
	 * 모임공지사항삭제여부
	 */
	@ApiModelProperty(
		name = "metNtarDelYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarDelYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임공지사항삭제여부", align="left", fill="")
	private String metNtarDelYn= "";
	
	
	/**
	 * 모임공지사항등록회원일련번호
	 */
	@ApiModelProperty(
		name = "metNtarRgsMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metNtarRgsMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="모임공지사항등록회원일련번호", align="right", fill="")
	private Integer metNtarRgsMbhSrno= 0;
	
	
	/**
	 * 모임공지사항등록시각
	 */
	@ApiModelProperty(
		name = "metNtarRgsTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarRgsTm")
	@BxmOmm_Field(length=6, decimal=0, description="모임공지사항등록시각", align="left", fill="")
	private String metNtarRgsTm= "";
	
	
	/**
	 * 모임계좌번호
	 */
	@ApiModelProperty(
		name = "metAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metAcno")
	@BxmOmm_Field(length=20, decimal=0, description="모임계좌번호", align="left", fill="")
	private String metAcno= "";
	
	
	/**
	 * 안심계좌번호
	 */
	@ApiModelProperty(
		name = "rlfAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rlfAcno")
	@BxmOmm_Field(length=20, decimal=0, description="안심계좌번호", align="left", fill="")
	private String rlfAcno= "";
	
	
	
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
	private boolean isSet_metNtarRgsDt= false;
	protected final boolean isSet_metNtarRgsDt(){
		return this.isSet_metNtarRgsDt;
	}
	private void setIsSet_metNtarRgsDt(boolean value){
		this.isSet_metNtarRgsDt= value;
	}
	/**
	 * 모임공지사항등록일자
	 */
	@XmlTransient
	public String getMetNtarRgsDt(){
		return this.metNtarRgsDt;
	}
	
	/**
	 * 모임공지사항등록일자
	 * 
	 * @param metNtarRgsDt 모임공지사항등록일자
	 */
	public void setMetNtarRgsDt(String metNtarRgsDt){
		this.metNtarRgsDt= metNtarRgsDt;
		this.setIsSet_metNtarRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarTxt= false;
	protected final boolean isSet_metNtarTxt(){
		return this.isSet_metNtarTxt;
	}
	private void setIsSet_metNtarTxt(boolean value){
		this.isSet_metNtarTxt= value;
	}
	/**
	 * 모임공지사항내용
	 */
	@XmlTransient
	public String getMetNtarTxt(){
		return this.metNtarTxt;
	}
	
	/**
	 * 모임공지사항내용
	 * 
	 * @param metNtarTxt 모임공지사항내용
	 */
	public void setMetNtarTxt(String metNtarTxt){
		this.metNtarTxt= metNtarTxt;
		this.setIsSet_metNtarTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarHdnYn= false;
	protected final boolean isSet_metNtarHdnYn(){
		return this.isSet_metNtarHdnYn;
	}
	private void setIsSet_metNtarHdnYn(boolean value){
		this.isSet_metNtarHdnYn= value;
	}
	/**
	 * 모임공지사항숨김여부
	 */
	@XmlTransient
	public String getMetNtarHdnYn(){
		return this.metNtarHdnYn;
	}
	
	/**
	 * 모임공지사항숨김여부
	 * 
	 * @param metNtarHdnYn 모임공지사항숨김여부
	 */
	public void setMetNtarHdnYn(String metNtarHdnYn){
		this.metNtarHdnYn= metNtarHdnYn;
		this.setIsSet_metNtarHdnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarDelYn= false;
	protected final boolean isSet_metNtarDelYn(){
		return this.isSet_metNtarDelYn;
	}
	private void setIsSet_metNtarDelYn(boolean value){
		this.isSet_metNtarDelYn= value;
	}
	/**
	 * 모임공지사항삭제여부
	 */
	@XmlTransient
	public String getMetNtarDelYn(){
		return this.metNtarDelYn;
	}
	
	/**
	 * 모임공지사항삭제여부
	 * 
	 * @param metNtarDelYn 모임공지사항삭제여부
	 */
	public void setMetNtarDelYn(String metNtarDelYn){
		this.metNtarDelYn= metNtarDelYn;
		this.setIsSet_metNtarDelYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarRgsMbhSrno= false;
	protected final boolean isSet_metNtarRgsMbhSrno(){
		return this.isSet_metNtarRgsMbhSrno;
	}
	private void setIsSet_metNtarRgsMbhSrno(boolean value){
		this.isSet_metNtarRgsMbhSrno= value;
	}
	/**
	 * 모임공지사항등록회원일련번호
	 */
	@XmlTransient
	public Integer getMetNtarRgsMbhSrno(){
		return this.metNtarRgsMbhSrno;
	}
	
	/**
	 * 모임공지사항등록회원일련번호
	 * 
	 * @param metNtarRgsMbhSrno 모임공지사항등록회원일련번호
	 */
	public void setMetNtarRgsMbhSrno(Integer metNtarRgsMbhSrno){
		this.metNtarRgsMbhSrno= metNtarRgsMbhSrno;
		this.setIsSet_metNtarRgsMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarRgsTm= false;
	protected final boolean isSet_metNtarRgsTm(){
		return this.isSet_metNtarRgsTm;
	}
	private void setIsSet_metNtarRgsTm(boolean value){
		this.isSet_metNtarRgsTm= value;
	}
	/**
	 * 모임공지사항등록시각
	 */
	@XmlTransient
	public String getMetNtarRgsTm(){
		return this.metNtarRgsTm;
	}
	
	/**
	 * 모임공지사항등록시각
	 * 
	 * @param metNtarRgsTm 모임공지사항등록시각
	 */
	public void setMetNtarRgsTm(String metNtarRgsTm){
		this.metNtarRgsTm= metNtarRgsTm;
		this.setIsSet_metNtarRgsTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metAcno= false;
	protected final boolean isSet_metAcno(){
		return this.isSet_metAcno;
	}
	private void setIsSet_metAcno(boolean value){
		this.isSet_metAcno= value;
	}
	/**
	 * 모임계좌번호
	 */
	@XmlTransient
	public String getMetAcno(){
		return this.metAcno;
	}
	
	/**
	 * 모임계좌번호
	 * 
	 * @param metAcno 모임계좌번호
	 */
	public void setMetAcno(String metAcno){
		this.metAcno= metAcno;
		this.setIsSet_metAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rlfAcno= false;
	protected final boolean isSet_rlfAcno(){
		return this.isSet_rlfAcno;
	}
	private void setIsSet_rlfAcno(boolean value){
		this.isSet_rlfAcno= value;
	}
	/**
	 * 안심계좌번호
	 */
	@XmlTransient
	public String getRlfAcno(){
		return this.rlfAcno;
	}
	
	/**
	 * 안심계좌번호
	 * 
	 * @param rlfAcno 안심계좌번호
	 */
	public void setRlfAcno(String rlfAcno){
		this.rlfAcno= rlfAcno;
		this.setIsSet_rlfAcno(true);
	}
				
	@Override
	public MPBMetPbokBscMngInsertNtarInf_IDT clone(){
		try{
			MPBMetPbokBscMngInsertNtarInf_IDT object= (MPBMetPbokBscMngInsertNtarInf_IDT)super.clone();
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
		result= prime * result + ((this.metNtarRgsDt==null)?0:this.metNtarRgsDt.hashCode());
		result= prime * result + ((this.metNtarTxt==null)?0:this.metNtarTxt.hashCode());
		result= prime * result + ((this.metNtarHdnYn==null)?0:this.metNtarHdnYn.hashCode());
		result= prime * result + ((this.metNtarDelYn==null)?0:this.metNtarDelYn.hashCode());
		result= prime * result + ((this.metNtarRgsMbhSrno==null)?0:this.metNtarRgsMbhSrno.hashCode());
		result= prime * result + ((this.metNtarRgsTm==null)?0:this.metNtarRgsTm.hashCode());
		result= prime * result + ((this.metAcno==null)?0:this.metAcno.hashCode());
		result= prime * result + ((this.rlfAcno==null)?0:this.rlfAcno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngInsertNtarInf_IDT other= (MPBMetPbokBscMngInsertNtarInf_IDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metNtarRgsDt= getMetNtarRgsDt();
			Object __metNtarRgsDt= other.getMetNtarRgsDt();
			if ( _metNtarRgsDt== null ) { if ( __metNtarRgsDt!= null ) return false; }
			else if ( !_metNtarRgsDt.equals(__metNtarRgsDt) ) return false;
		}
		{
			Object _metNtarTxt= getMetNtarTxt();
			Object __metNtarTxt= other.getMetNtarTxt();
			if ( _metNtarTxt== null ) { if ( __metNtarTxt!= null ) return false; }
			else if ( !_metNtarTxt.equals(__metNtarTxt) ) return false;
		}
		{
			Object _metNtarHdnYn= getMetNtarHdnYn();
			Object __metNtarHdnYn= other.getMetNtarHdnYn();
			if ( _metNtarHdnYn== null ) { if ( __metNtarHdnYn!= null ) return false; }
			else if ( !_metNtarHdnYn.equals(__metNtarHdnYn) ) return false;
		}
		{
			Object _metNtarDelYn= getMetNtarDelYn();
			Object __metNtarDelYn= other.getMetNtarDelYn();
			if ( _metNtarDelYn== null ) { if ( __metNtarDelYn!= null ) return false; }
			else if ( !_metNtarDelYn.equals(__metNtarDelYn) ) return false;
		}
		{
			Object _metNtarRgsMbhSrno= getMetNtarRgsMbhSrno();
			Object __metNtarRgsMbhSrno= other.getMetNtarRgsMbhSrno();
			if ( _metNtarRgsMbhSrno== null ) { if ( __metNtarRgsMbhSrno!= null ) return false; }
			else if ( !_metNtarRgsMbhSrno.equals(__metNtarRgsMbhSrno) ) return false;
		}
		{
			Object _metNtarRgsTm= getMetNtarRgsTm();
			Object __metNtarRgsTm= other.getMetNtarRgsTm();
			if ( _metNtarRgsTm== null ) { if ( __metNtarRgsTm!= null ) return false; }
			else if ( !_metNtarRgsTm.equals(__metNtarRgsTm) ) return false;
		}
		{
			Object _metAcno= getMetAcno();
			Object __metAcno= other.getMetAcno();
			if ( _metAcno== null ) { if ( __metAcno!= null ) return false; }
			else if ( !_metAcno.equals(__metAcno) ) return false;
		}
		{
			Object _rlfAcno= getRlfAcno();
			Object __rlfAcno= other.getRlfAcno();
			if ( _rlfAcno== null ) { if ( __rlfAcno!= null ) return false; }
			else if ( !_rlfAcno.equals(__rlfAcno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngInsertNtarInf_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetNtarRgsDt: ");
		sb.append(metNtarRgsDt==null?"null":getMetNtarRgsDt());
		sb.append("\n");
		sb.append("\tmetNtarTxt: ");
		sb.append(metNtarTxt==null?"null":getMetNtarTxt());
		sb.append("\n");
		sb.append("\tmetNtarHdnYn: ");
		sb.append(metNtarHdnYn==null?"null":getMetNtarHdnYn());
		sb.append("\n");
		sb.append("\tmetNtarDelYn: ");
		sb.append(metNtarDelYn==null?"null":getMetNtarDelYn());
		sb.append("\n");
		sb.append("\tmetNtarRgsMbhSrno: ");
		sb.append(metNtarRgsMbhSrno==null?"null":getMetNtarRgsMbhSrno());
		sb.append("\n");
		sb.append("\tmetNtarRgsTm: ");
		sb.append(metNtarRgsTm==null?"null":getMetNtarRgsTm());
		sb.append("\n");
		sb.append("\tmetAcno: ");
		sb.append(metAcno==null?"null":getMetAcno());
		sb.append("\n");
		sb.append("\trlfAcno: ");
		sb.append(rlfAcno==null?"null":getRlfAcno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 8; /* metNtarRgsDt */
		messageLen+= 500; /* metNtarTxt */
		messageLen+= 1; /* metNtarHdnYn */
		messageLen+= 1; /* metNtarDelYn */
		messageLen+= 7; /* metNtarRgsMbhSrno */
		messageLen+= 6; /* metNtarRgsTm */
		messageLen+= 20; /* metAcno */
		messageLen+= 20; /* rlfAcno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metNtarRgsDt");
		list.add("metNtarTxt");
		list.add("metNtarHdnYn");
		list.add("metNtarDelYn");
		list.add("metNtarRgsMbhSrno");
		list.add("metNtarRgsTm");
		list.add("metAcno");
		list.add("rlfAcno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metNtarRgsDt", get("metNtarRgsDt"));
		map.put("metNtarTxt", get("metNtarTxt"));
		map.put("metNtarHdnYn", get("metNtarHdnYn"));
		map.put("metNtarDelYn", get("metNtarDelYn"));
		map.put("metNtarRgsMbhSrno", get("metNtarRgsMbhSrno"));
		map.put("metNtarRgsTm", get("metNtarRgsTm"));
		map.put("metAcno", get("metAcno"));
		map.put("rlfAcno", get("rlfAcno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -947890853:/* metNtarRgsDt */
			return getMetNtarRgsDt();
		case 2112980221:/* metNtarTxt */
			return getMetNtarTxt();
		case -957219596:/* metNtarHdnYn */
			return getMetNtarHdnYn();
		case -960885811:/* metNtarDelYn */
			return getMetNtarDelYn();
		case 1391961736:/* metNtarRgsMbhSrno */
			return getMetNtarRgsMbhSrno();
		case -947890364:/* metNtarRgsTm */
			return getMetNtarRgsTm();
		case 954361183:/* metAcno */
			return getMetAcno();
		case 1284387055:/* rlfAcno */
			return getRlfAcno();
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
		case -947890853:/* metNtarRgsDt */
			setMetNtarRgsDt((String)value);
			break;
		case 2112980221:/* metNtarTxt */
			setMetNtarTxt((String)value);
			break;
		case -957219596:/* metNtarHdnYn */
			setMetNtarHdnYn((String)value);
			break;
		case -960885811:/* metNtarDelYn */
			setMetNtarDelYn((String)value);
			break;
		case 1391961736:/* metNtarRgsMbhSrno */
			setMetNtarRgsMbhSrno((Integer)value);
			break;
		case -947890364:/* metNtarRgsTm */
			setMetNtarRgsTm((String)value);
			break;
		case 954361183:/* metAcno */
			setMetAcno((String)value);
			break;
		case 1284387055:/* rlfAcno */
			setRlfAcno((String)value);
			break;
		default:
			break;
		}
	}
	
}
