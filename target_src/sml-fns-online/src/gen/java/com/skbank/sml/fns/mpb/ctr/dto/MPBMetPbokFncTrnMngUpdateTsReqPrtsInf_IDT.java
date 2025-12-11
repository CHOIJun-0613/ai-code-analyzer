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
import com.fasterxml.jackson.annotation.JsonSetter;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
	"metMngNo", "tsReqDt", "tsReqMbhSrno", "tsReqSrno", "tsCmplAm", "metTsReqStcd", "apvReqStcd", "tsReqDelYn", "trnSrno"
}, name="MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT")
@XmlRootElement(name="MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT")
@BxmCategory(logicalName="이체요청.정보.수정.컨트롤러.입력.IO", description="") 
public class MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 719467983L;
	
	
	
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
	 * 이체요청일자
	 */
	@ApiModelProperty(
		name = "tsReqDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqDt")
	@BxmOmm_Field(length=8, decimal=0, description="이체요청일자", align="left", fill="")
	private String tsReqDt= "";
	
	
	/**
	 * 이체요청회원일련번호
	 */
	@ApiModelProperty(
		name = "tsReqMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("tsReqMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="이체요청회원일련번호", align="right", fill="")
	private Integer tsReqMbhSrno= 0;
	
	
	/**
	 * 이체요청일련번호
	 */
	@ApiModelProperty(
		name = "tsReqSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("tsReqSrno")
	@BxmOmm_Field(length=5, decimal=0, description="이체요청일련번호", align="right", fill="")
	private Integer tsReqSrno= 0;
	
	
	/**
	 * 이체완료금액
	 */
	@ApiModelProperty(
		name = "tsCmplAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tsCmplAm")
	@BxmOmm_Field(length=18, decimal=3, description="이체완료금액", align="right", fill="")
	private BigDecimal tsCmplAm= new BigDecimal("0");
	
	
	/**
	 * 모임이체요청상태코드
	 */
	@ApiModelProperty(
		name = "metTsReqStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metTsReqStcd")
	@BxmOmm_Field(length=1, decimal=0, description="모임이체요청상태코드", align="left", fill="")
	private String metTsReqStcd= "";
	
	
	/**
	 * 승인요청상태코드
	 */
	@ApiModelProperty(
		name = "apvReqStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("apvReqStcd")
	@BxmOmm_Field(length=1, decimal=0, description="승인요청상태코드", align="left", fill="")
	private String apvReqStcd= "";
	
	
	/**
	 * 이체요청삭제여부
	 */
	@ApiModelProperty(
		name = "tsReqDelYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqDelYn")
	@BxmOmm_Field(length=1, decimal=0, description="이체요청삭제여부", align="left", fill="")
	private String tsReqDelYn= "";
	
	
	/**
	 * 거래일련번호
	 */
	@ApiModelProperty(
		name = "trnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("trnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="거래일련번호", align="right", fill="")
	private Integer trnSrno= 0;
	
	
	
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
	private boolean isSet_tsReqDt= false;
	protected final boolean isSet_tsReqDt(){
		return this.isSet_tsReqDt;
	}
	private void setIsSet_tsReqDt(boolean value){
		this.isSet_tsReqDt= value;
	}
	/**
	 * 이체요청일자
	 */
	@XmlTransient
	public String getTsReqDt(){
		return this.tsReqDt;
	}
	
	/**
	 * 이체요청일자
	 * 
	 * @param tsReqDt 이체요청일자
	 */
	public void setTsReqDt(String tsReqDt){
		this.tsReqDt= tsReqDt;
		this.setIsSet_tsReqDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqMbhSrno= false;
	protected final boolean isSet_tsReqMbhSrno(){
		return this.isSet_tsReqMbhSrno;
	}
	private void setIsSet_tsReqMbhSrno(boolean value){
		this.isSet_tsReqMbhSrno= value;
	}
	/**
	 * 이체요청회원일련번호
	 */
	@XmlTransient
	public Integer getTsReqMbhSrno(){
		return this.tsReqMbhSrno;
	}
	
	/**
	 * 이체요청회원일련번호
	 * 
	 * @param tsReqMbhSrno 이체요청회원일련번호
	 */
	public void setTsReqMbhSrno(Integer tsReqMbhSrno){
		this.tsReqMbhSrno= tsReqMbhSrno;
		this.setIsSet_tsReqMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqSrno= false;
	protected final boolean isSet_tsReqSrno(){
		return this.isSet_tsReqSrno;
	}
	private void setIsSet_tsReqSrno(boolean value){
		this.isSet_tsReqSrno= value;
	}
	/**
	 * 이체요청일련번호
	 */
	@XmlTransient
	public Integer getTsReqSrno(){
		return this.tsReqSrno;
	}
	
	/**
	 * 이체요청일련번호
	 * 
	 * @param tsReqSrno 이체요청일련번호
	 */
	public void setTsReqSrno(Integer tsReqSrno){
		this.tsReqSrno= tsReqSrno;
		this.setIsSet_tsReqSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsCmplAm= false;
	protected final boolean isSet_tsCmplAm(){
		return this.isSet_tsCmplAm;
	}
	private void setIsSet_tsCmplAm(boolean value){
		this.isSet_tsCmplAm= value;
	}
	/**
	 * 이체완료금액
	 * BigDecimal - Double value setter
	 *
	 * @Param tsCmplAm 이체완료금액
	 */
	public void setTsCmplAm(double tsCmplAm) {
		setTsCmplAm(BigDecimal.valueOf(tsCmplAm));
	}
	/**
	 * 이체완료금액
	 * BigDecimal - Long value setter
	 *
	 * @Param tsCmplAm 이체완료금액
	 */
	public void setTsCmplAm(long tsCmplAm) {
		setTsCmplAm(BigDecimal.valueOf(tsCmplAm));
	}
	/**
	 * 이체완료금액
	 * BigDecimal - String value setter
	 *
	 * @Param tsCmplAm 이체완료금액
	 */
	public void setTsCmplAm(String tsCmplAm) {
		setTsCmplAm(new BigDecimal(tsCmplAm));
	}
	/**
	 * 이체완료금액
	 */
	@XmlTransient
	public BigDecimal getTsCmplAm(){
		return this.tsCmplAm;
	}
	
	/**
	 * 이체완료금액
	 * 
	 * @param tsCmplAm 이체완료금액
	 */
	@JsonSetter("tsCmplAm")
	public void setTsCmplAm(BigDecimal tsCmplAm){
		this.tsCmplAm= tsCmplAm;
		this.setIsSet_tsCmplAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metTsReqStcd= false;
	protected final boolean isSet_metTsReqStcd(){
		return this.isSet_metTsReqStcd;
	}
	private void setIsSet_metTsReqStcd(boolean value){
		this.isSet_metTsReqStcd= value;
	}
	/**
	 * 모임이체요청상태코드
	 */
	@XmlTransient
	public String getMetTsReqStcd(){
		return this.metTsReqStcd;
	}
	
	/**
	 * 모임이체요청상태코드
	 * 
	 * @param metTsReqStcd 모임이체요청상태코드
	 */
	public void setMetTsReqStcd(String metTsReqStcd){
		this.metTsReqStcd= metTsReqStcd;
		this.setIsSet_metTsReqStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_apvReqStcd= false;
	protected final boolean isSet_apvReqStcd(){
		return this.isSet_apvReqStcd;
	}
	private void setIsSet_apvReqStcd(boolean value){
		this.isSet_apvReqStcd= value;
	}
	/**
	 * 승인요청상태코드
	 */
	@XmlTransient
	public String getApvReqStcd(){
		return this.apvReqStcd;
	}
	
	/**
	 * 승인요청상태코드
	 * 
	 * @param apvReqStcd 승인요청상태코드
	 */
	public void setApvReqStcd(String apvReqStcd){
		this.apvReqStcd= apvReqStcd;
		this.setIsSet_apvReqStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqDelYn= false;
	protected final boolean isSet_tsReqDelYn(){
		return this.isSet_tsReqDelYn;
	}
	private void setIsSet_tsReqDelYn(boolean value){
		this.isSet_tsReqDelYn= value;
	}
	/**
	 * 이체요청삭제여부
	 */
	@XmlTransient
	public String getTsReqDelYn(){
		return this.tsReqDelYn;
	}
	
	/**
	 * 이체요청삭제여부
	 * 
	 * @param tsReqDelYn 이체요청삭제여부
	 */
	public void setTsReqDelYn(String tsReqDelYn){
		this.tsReqDelYn= tsReqDelYn;
		this.setIsSet_tsReqDelYn(true);
	}
	
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
	public Integer getTrnSrno(){
		return this.trnSrno;
	}
	
	/**
	 * 거래일련번호
	 * 
	 * @param trnSrno 거래일련번호
	 */
	public void setTrnSrno(Integer trnSrno){
		this.trnSrno= trnSrno;
		this.setIsSet_trnSrno(true);
	}
				
	@Override
	public MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT clone(){
		try{
			MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT object= (MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT)super.clone();
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
		result= prime * result + ((this.tsReqDt==null)?0:this.tsReqDt.hashCode());
		result= prime * result + ((this.tsReqMbhSrno==null)?0:this.tsReqMbhSrno.hashCode());
		result= prime * result + ((this.tsReqSrno==null)?0:this.tsReqSrno.hashCode());
		result= prime * result + ((this.tsCmplAm==null)?0:this.tsCmplAm.hashCode());
		result= prime * result + ((this.metTsReqStcd==null)?0:this.metTsReqStcd.hashCode());
		result= prime * result + ((this.apvReqStcd==null)?0:this.apvReqStcd.hashCode());
		result= prime * result + ((this.tsReqDelYn==null)?0:this.tsReqDelYn.hashCode());
		result= prime * result + ((this.trnSrno==null)?0:this.trnSrno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT other= (MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _tsReqDt= getTsReqDt();
			Object __tsReqDt= other.getTsReqDt();
			if ( _tsReqDt== null ) { if ( __tsReqDt!= null ) return false; }
			else if ( !_tsReqDt.equals(__tsReqDt) ) return false;
		}
		{
			Object _tsReqMbhSrno= getTsReqMbhSrno();
			Object __tsReqMbhSrno= other.getTsReqMbhSrno();
			if ( _tsReqMbhSrno== null ) { if ( __tsReqMbhSrno!= null ) return false; }
			else if ( !_tsReqMbhSrno.equals(__tsReqMbhSrno) ) return false;
		}
		{
			Object _tsReqSrno= getTsReqSrno();
			Object __tsReqSrno= other.getTsReqSrno();
			if ( _tsReqSrno== null ) { if ( __tsReqSrno!= null ) return false; }
			else if ( !_tsReqSrno.equals(__tsReqSrno) ) return false;
		}
		{
			Object _tsCmplAm= getTsCmplAm();
			Object __tsCmplAm= other.getTsCmplAm();
			if ( _tsCmplAm== null ) { if ( __tsCmplAm!= null ) return false; }
			else if ( !_tsCmplAm.equals(__tsCmplAm) ) return false;
		}
		{
			Object _metTsReqStcd= getMetTsReqStcd();
			Object __metTsReqStcd= other.getMetTsReqStcd();
			if ( _metTsReqStcd== null ) { if ( __metTsReqStcd!= null ) return false; }
			else if ( !_metTsReqStcd.equals(__metTsReqStcd) ) return false;
		}
		{
			Object _apvReqStcd= getApvReqStcd();
			Object __apvReqStcd= other.getApvReqStcd();
			if ( _apvReqStcd== null ) { if ( __apvReqStcd!= null ) return false; }
			else if ( !_apvReqStcd.equals(__apvReqStcd) ) return false;
		}
		{
			Object _tsReqDelYn= getTsReqDelYn();
			Object __tsReqDelYn= other.getTsReqDelYn();
			if ( _tsReqDelYn== null ) { if ( __tsReqDelYn!= null ) return false; }
			else if ( !_tsReqDelYn.equals(__tsReqDelYn) ) return false;
		}
		{
			Object _trnSrno= getTrnSrno();
			Object __trnSrno= other.getTrnSrno();
			if ( _trnSrno== null ) { if ( __trnSrno!= null ) return false; }
			else if ( !_trnSrno.equals(__trnSrno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngUpdateTsReqPrtsInf_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\ttsReqDt: ");
		sb.append(tsReqDt==null?"null":getTsReqDt());
		sb.append("\n");
		sb.append("\ttsReqMbhSrno: ");
		sb.append(tsReqMbhSrno==null?"null":getTsReqMbhSrno());
		sb.append("\n");
		sb.append("\ttsReqSrno: ");
		sb.append(tsReqSrno==null?"null":getTsReqSrno());
		sb.append("\n");
		sb.append("\ttsCmplAm: ");
		sb.append(tsCmplAm==null?"null":getTsCmplAm());
		sb.append("\n");
		sb.append("\tmetTsReqStcd: ");
		sb.append(metTsReqStcd==null?"null":getMetTsReqStcd());
		sb.append("\n");
		sb.append("\tapvReqStcd: ");
		sb.append(apvReqStcd==null?"null":getApvReqStcd());
		sb.append("\n");
		sb.append("\ttsReqDelYn: ");
		sb.append(tsReqDelYn==null?"null":getTsReqDelYn());
		sb.append("\n");
		sb.append("\ttrnSrno: ");
		sb.append(trnSrno==null?"null":getTrnSrno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 8; /* tsReqDt */
		messageLen+= 7; /* tsReqMbhSrno */
		messageLen+= 5; /* tsReqSrno */
		messageLen+= 18; /* tsCmplAm */
		messageLen+= 1; /* metTsReqStcd */
		messageLen+= 1; /* apvReqStcd */
		messageLen+= 1; /* tsReqDelYn */
		messageLen+= 8; /* trnSrno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("tsReqDt");
		list.add("tsReqMbhSrno");
		list.add("tsReqSrno");
		list.add("tsCmplAm");
		list.add("metTsReqStcd");
		list.add("apvReqStcd");
		list.add("tsReqDelYn");
		list.add("trnSrno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("tsReqDt", get("tsReqDt"));
		map.put("tsReqMbhSrno", get("tsReqMbhSrno"));
		map.put("tsReqSrno", get("tsReqSrno"));
		map.put("tsCmplAm", get("tsCmplAm"));
		map.put("metTsReqStcd", get("metTsReqStcd"));
		map.put("apvReqStcd", get("apvReqStcd"));
		map.put("tsReqDelYn", get("tsReqDelYn"));
		map.put("trnSrno", get("trnSrno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -1052554609:/* tsReqDt */
			return getTsReqDt();
		case -1904094764:/* tsReqMbhSrno */
			return getTsReqMbhSrno();
		case 2107751071:/* tsReqSrno */
			return getTsReqSrno();
		case 1308503569:/* tsCmplAm */
			return getTsCmplAm();
		case -1422323131:/* metTsReqStcd */
			return getMetTsReqStcd();
		case -200841191:/* apvReqStcd */
			return getApvReqStcd();
		case 901531169:/* tsReqDelYn */
			return getTsReqDelYn();
		case -1055859152:/* trnSrno */
			return getTrnSrno();
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
		case -1052554609:/* tsReqDt */
			setTsReqDt((String)value);
			break;
		case -1904094764:/* tsReqMbhSrno */
			setTsReqMbhSrno((Integer)value);
			break;
		case 2107751071:/* tsReqSrno */
			setTsReqSrno((Integer)value);
			break;
		case 1308503569:/* tsCmplAm */
			if ( value instanceof String ){
				setTsCmplAm((String)value);
			}
			else if ( value instanceof Double ){
				setTsCmplAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTsCmplAm((Long)value);
			}
			else{
				setTsCmplAm((BigDecimal)value);
			}
			break;
		case -1422323131:/* metTsReqStcd */
			setMetTsReqStcd((String)value);
			break;
		case -200841191:/* apvReqStcd */
			setApvReqStcd((String)value);
			break;
		case 901531169:/* tsReqDelYn */
			setTsReqDelYn((String)value);
			break;
		case -1055859152:/* trnSrno */
			setTrnSrno((Integer)value);
			break;
		default:
			break;
		}
	}
	
}
