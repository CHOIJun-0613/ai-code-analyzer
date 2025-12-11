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
	"metMngNo", "tsReqBkcd", "tsReqAcno", "tsReqAm", "actPwnoUsgYn", "actPwno"
}, name="MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT")
@XmlRootElement(name="MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT")
@BxmCategory(logicalName="이체.요청.수취인.정보.조회.컨트롤러.입력.IO", description="") 
public class MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 209837266L;
	
	
	
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
	 * 이체요청은행코드
	 */
	@ApiModelProperty(
		name = "tsReqBkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqBkcd")
	@BxmOmm_Field(length=3, decimal=0, description="이체요청은행코드", align="left", fill="")
	private String tsReqBkcd= "";
	
	
	/**
	 * 이체요청계좌번호
	 */
	@ApiModelProperty(
		name = "tsReqAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tsReqAcno")
	@BxmOmm_Field(length=13, decimal=0, description="이체요청계좌번호", align="left", fill="")
	private String tsReqAcno= "";
	
	
	/**
	 * 이체요청금액
	 */
	@ApiModelProperty(
		name = "tsReqAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("tsReqAm")
	@BxmOmm_Field(length=18, decimal=3, description="이체요청금액", align="right", fill="")
	private BigDecimal tsReqAm= new BigDecimal("0");
	
	
	/**
	 * 계좌비밀번호사용여부
	 */
	@ApiModelProperty(
		name = "actPwnoUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actPwnoUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="계좌비밀번호사용여부", align="left", fill="")
	private String actPwnoUsgYn= "";
	
	
	/**
	 * 계좌비밀번호
	 */
	@ApiModelProperty(
		name = "actPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actPwno")
	@BxmOmm_Field(length=50, decimal=0, description="계좌비밀번호", align="left", fill="")
	private String actPwno= "";
	
	
	
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
	private boolean isSet_tsReqBkcd= false;
	protected final boolean isSet_tsReqBkcd(){
		return this.isSet_tsReqBkcd;
	}
	private void setIsSet_tsReqBkcd(boolean value){
		this.isSet_tsReqBkcd= value;
	}
	/**
	 * 이체요청은행코드
	 */
	@XmlTransient
	public String getTsReqBkcd(){
		return this.tsReqBkcd;
	}
	
	/**
	 * 이체요청은행코드
	 * 
	 * @param tsReqBkcd 이체요청은행코드
	 */
	public void setTsReqBkcd(String tsReqBkcd){
		this.tsReqBkcd= tsReqBkcd;
		this.setIsSet_tsReqBkcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqAcno= false;
	protected final boolean isSet_tsReqAcno(){
		return this.isSet_tsReqAcno;
	}
	private void setIsSet_tsReqAcno(boolean value){
		this.isSet_tsReqAcno= value;
	}
	/**
	 * 이체요청계좌번호
	 */
	@XmlTransient
	public String getTsReqAcno(){
		return this.tsReqAcno;
	}
	
	/**
	 * 이체요청계좌번호
	 * 
	 * @param tsReqAcno 이체요청계좌번호
	 */
	public void setTsReqAcno(String tsReqAcno){
		this.tsReqAcno= tsReqAcno;
		this.setIsSet_tsReqAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tsReqAm= false;
	protected final boolean isSet_tsReqAm(){
		return this.isSet_tsReqAm;
	}
	private void setIsSet_tsReqAm(boolean value){
		this.isSet_tsReqAm= value;
	}
	/**
	 * 이체요청금액
	 * BigDecimal - Double value setter
	 *
	 * @Param tsReqAm 이체요청금액
	 */
	public void setTsReqAm(double tsReqAm) {
		setTsReqAm(BigDecimal.valueOf(tsReqAm));
	}
	/**
	 * 이체요청금액
	 * BigDecimal - Long value setter
	 *
	 * @Param tsReqAm 이체요청금액
	 */
	public void setTsReqAm(long tsReqAm) {
		setTsReqAm(BigDecimal.valueOf(tsReqAm));
	}
	/**
	 * 이체요청금액
	 * BigDecimal - String value setter
	 *
	 * @Param tsReqAm 이체요청금액
	 */
	public void setTsReqAm(String tsReqAm) {
		setTsReqAm(new BigDecimal(tsReqAm));
	}
	/**
	 * 이체요청금액
	 */
	@XmlTransient
	public BigDecimal getTsReqAm(){
		return this.tsReqAm;
	}
	
	/**
	 * 이체요청금액
	 * 
	 * @param tsReqAm 이체요청금액
	 */
	@JsonSetter("tsReqAm")
	public void setTsReqAm(BigDecimal tsReqAm){
		this.tsReqAm= tsReqAm;
		this.setIsSet_tsReqAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actPwnoUsgYn= false;
	protected final boolean isSet_actPwnoUsgYn(){
		return this.isSet_actPwnoUsgYn;
	}
	private void setIsSet_actPwnoUsgYn(boolean value){
		this.isSet_actPwnoUsgYn= value;
	}
	/**
	 * 계좌비밀번호사용여부
	 */
	@XmlTransient
	public String getActPwnoUsgYn(){
		return this.actPwnoUsgYn;
	}
	
	/**
	 * 계좌비밀번호사용여부
	 * 
	 * @param actPwnoUsgYn 계좌비밀번호사용여부
	 */
	public void setActPwnoUsgYn(String actPwnoUsgYn){
		this.actPwnoUsgYn= actPwnoUsgYn;
		this.setIsSet_actPwnoUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_actPwno= false;
	protected final boolean isSet_actPwno(){
		return this.isSet_actPwno;
	}
	private void setIsSet_actPwno(boolean value){
		this.isSet_actPwno= value;
	}
	/**
	 * 계좌비밀번호
	 */
	@XmlTransient
	public String getActPwno(){
		return this.actPwno;
	}
	
	/**
	 * 계좌비밀번호
	 * 
	 * @param actPwno 계좌비밀번호
	 */
	public void setActPwno(String actPwno){
		this.actPwno= actPwno;
		this.setIsSet_actPwno(true);
	}
				
	@Override
	public MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT clone(){
		try{
			MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT object= (MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT)super.clone();
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
		result= prime * result + ((this.tsReqBkcd==null)?0:this.tsReqBkcd.hashCode());
		result= prime * result + ((this.tsReqAcno==null)?0:this.tsReqAcno.hashCode());
		result= prime * result + ((this.tsReqAm==null)?0:this.tsReqAm.hashCode());
		result= prime * result + ((this.actPwnoUsgYn==null)?0:this.actPwnoUsgYn.hashCode());
		result= prime * result + ((this.actPwno==null)?0:this.actPwno.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT other= (MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _tsReqBkcd= getTsReqBkcd();
			Object __tsReqBkcd= other.getTsReqBkcd();
			if ( _tsReqBkcd== null ) { if ( __tsReqBkcd!= null ) return false; }
			else if ( !_tsReqBkcd.equals(__tsReqBkcd) ) return false;
		}
		{
			Object _tsReqAcno= getTsReqAcno();
			Object __tsReqAcno= other.getTsReqAcno();
			if ( _tsReqAcno== null ) { if ( __tsReqAcno!= null ) return false; }
			else if ( !_tsReqAcno.equals(__tsReqAcno) ) return false;
		}
		{
			Object _tsReqAm= getTsReqAm();
			Object __tsReqAm= other.getTsReqAm();
			if ( _tsReqAm== null ) { if ( __tsReqAm!= null ) return false; }
			else if ( !_tsReqAm.equals(__tsReqAm) ) return false;
		}
		{
			Object _actPwnoUsgYn= getActPwnoUsgYn();
			Object __actPwnoUsgYn= other.getActPwnoUsgYn();
			if ( _actPwnoUsgYn== null ) { if ( __actPwnoUsgYn!= null ) return false; }
			else if ( !_actPwnoUsgYn.equals(__actPwnoUsgYn) ) return false;
		}
		{
			Object _actPwno= getActPwno();
			Object __actPwno= other.getActPwno();
			if ( _actPwno== null ) { if ( __actPwno!= null ) return false; }
			else if ( !_actPwno.equals(__actPwno) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngSelectTsReqRnpeInf_IDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\ttsReqBkcd: ");
		sb.append(tsReqBkcd==null?"null":getTsReqBkcd());
		sb.append("\n");
		sb.append("\ttsReqAcno: ");
		sb.append(tsReqAcno==null?"null":getTsReqAcno());
		sb.append("\n");
		sb.append("\ttsReqAm: ");
		sb.append(tsReqAm==null?"null":getTsReqAm());
		sb.append("\n");
		sb.append("\tactPwnoUsgYn: ");
		sb.append(actPwnoUsgYn==null?"null":getActPwnoUsgYn());
		sb.append("\n");
		sb.append("\tactPwno: ");
		sb.append(actPwno==null?"null":getActPwno());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 3; /* tsReqBkcd */
		messageLen+= 13; /* tsReqAcno */
		messageLen+= 18; /* tsReqAm */
		messageLen+= 1; /* actPwnoUsgYn */
		messageLen+= 50; /* actPwno */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("tsReqBkcd");
		list.add("tsReqAcno");
		list.add("tsReqAm");
		list.add("actPwnoUsgYn");
		list.add("actPwno");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("tsReqBkcd", get("tsReqBkcd"));
		map.put("tsReqAcno", get("tsReqAcno"));
		map.put("tsReqAm", get("tsReqAm"));
		map.put("actPwnoUsgYn", get("actPwnoUsgYn"));
		map.put("actPwno", get("actPwno"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 2107237545:/* tsReqBkcd */
			return getTsReqBkcd();
		case 2107200418:/* tsReqAcno */
			return getTsReqAcno();
		case -1052554709:/* tsReqAm */
			return getTsReqAm();
		case 1280416996:/* actPwnoUsgYn */
			return getActPwnoUsgYn();
		case -1162540614:/* actPwno */
			return getActPwno();
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
		case 2107237545:/* tsReqBkcd */
			setTsReqBkcd((String)value);
			break;
		case 2107200418:/* tsReqAcno */
			setTsReqAcno((String)value);
			break;
		case -1052554709:/* tsReqAm */
			if ( value instanceof String ){
				setTsReqAm((String)value);
			}
			else if ( value instanceof Double ){
				setTsReqAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTsReqAm((Long)value);
			}
			else{
				setTsReqAm((BigDecimal)value);
			}
			break;
		case 1280416996:/* actPwnoUsgYn */
			setActPwnoUsgYn((String)value);
			break;
		case -1162540614:/* actPwno */
			setActPwno((String)value);
			break;
		default:
			break;
		}
	}
	
}
