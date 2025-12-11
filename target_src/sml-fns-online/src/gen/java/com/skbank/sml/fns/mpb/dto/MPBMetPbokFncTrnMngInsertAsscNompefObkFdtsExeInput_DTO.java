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
	"wdrAcno", "actPwnoUsgYn", "encyActPwno", "trnAm", "rcvBkcd", "rcvAcno", "rnpeFnm", "wdrPbokPrngTxt", "ptnPbokPrngTxt"
}, name="MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO")
@XmlRootElement(name="MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO")
@BxmCategory(logicalName="공동명의인.타행.자금이체.실행.등록.Input.DTO", description="") 
public class MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1693388181L;
	
	
	
	/**
	 * 출금계좌번호
	 */
	@ApiModelProperty(
		name = "wdrAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrAcno")
	@BxmOmm_Field(length=15, decimal=0, description="출금계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String wdrAcno= "";
	
	
	/**
	 * 계좌비밀번호사용여부
	 */
	@ApiModelProperty(
		name = "actPwnoUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("actPwnoUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="계좌비밀번호사용여부", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String actPwnoUsgYn= "";
	
	
	/**
	 * 암호화계좌비밀번호
	 */
	@ApiModelProperty(
		name = "encyActPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyActPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화계좌비밀번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String encyActPwno= "";
	
	
	/**
	 * 거래금액
	 */
	@ApiModelProperty(
		name = "trnAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("trnAm")
	@BxmOmm_Field(length=13, decimal=0, description="거래금액", align="right", fill="0", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=N"})
	private BigDecimal trnAm= new BigDecimal("0");
	
	
	/**
	 * 입금은행코드
	 */
	@ApiModelProperty(
		name = "rcvBkcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvBkcd")
	@BxmOmm_Field(length=3, decimal=0, description="입금은행코드", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rcvBkcd= "";
	
	
	/**
	 * 입금계좌번호
	 */
	@ApiModelProperty(
		name = "rcvAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rcvAcno")
	@BxmOmm_Field(length=15, decimal=0, description="입금계좌번호", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rcvAcno= "";
	
	
	/**
	 * 수취인성명
	 */
	@ApiModelProperty(
		name = "rnpeFnm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rnpeFnm")
	@BxmOmm_Field(length=22, decimal=0, description="수취인성명", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String rnpeFnm= "";
	
	
	/**
	 * 출금통장인자내용
	 */
	@ApiModelProperty(
		name = "wdrPbokPrngTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("wdrPbokPrngTxt")
	@BxmOmm_Field(length=22, decimal=0, description="출금통장인자내용", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String wdrPbokPrngTxt= "";
	
	
	/**
	 * 상대통장인자내용
	 */
	@ApiModelProperty(
		name = "ptnPbokPrngTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("ptnPbokPrngTxt")
	@BxmOmm_Field(length=22, decimal=0, description="상대통장인자내용", align="left", fill="", etcProperties={"EIMS_FLD_TYPE=F","EIMS_DATA_TYPE=S"})
	private String ptnPbokPrngTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrAcno= false;
	protected final boolean isSet_wdrAcno(){
		return this.isSet_wdrAcno;
	}
	private void setIsSet_wdrAcno(boolean value){
		this.isSet_wdrAcno= value;
	}
	/**
	 * 출금계좌번호
	 */
	@XmlTransient
	public String getWdrAcno(){
		return this.wdrAcno;
	}
	
	/**
	 * 출금계좌번호
	 * 
	 * @param wdrAcno 출금계좌번호
	 */
	public void setWdrAcno(String wdrAcno){
		this.wdrAcno= wdrAcno;
		this.setIsSet_wdrAcno(true);
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
	private boolean isSet_encyActPwno= false;
	protected final boolean isSet_encyActPwno(){
		return this.isSet_encyActPwno;
	}
	private void setIsSet_encyActPwno(boolean value){
		this.isSet_encyActPwno= value;
	}
	/**
	 * 암호화계좌비밀번호
	 */
	@XmlTransient
	public String getEncyActPwno(){
		return this.encyActPwno;
	}
	
	/**
	 * 암호화계좌비밀번호
	 * 
	 * @param encyActPwno 암호화계좌비밀번호
	 */
	public void setEncyActPwno(String encyActPwno){
		this.encyActPwno= encyActPwno;
		this.setIsSet_encyActPwno(true);
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
	 * BigDecimal - Double value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(double trnAm) {
		setTrnAm(BigDecimal.valueOf(trnAm));
	}
	/**
	 * 거래금액
	 * BigDecimal - Long value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(long trnAm) {
		setTrnAm(BigDecimal.valueOf(trnAm));
	}
	/**
	 * 거래금액
	 * BigDecimal - String value setter
	 *
	 * @Param trnAm 거래금액
	 */
	public void setTrnAm(String trnAm) {
		setTrnAm(new BigDecimal(trnAm));
	}
	/**
	 * 거래금액
	 */
	@XmlTransient
	public BigDecimal getTrnAm(){
		return this.trnAm;
	}
	
	/**
	 * 거래금액
	 * 
	 * @param trnAm 거래금액
	 */
	@JsonSetter("trnAm")
	public void setTrnAm(BigDecimal trnAm){
		this.trnAm= trnAm;
		this.setIsSet_trnAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvBkcd= false;
	protected final boolean isSet_rcvBkcd(){
		return this.isSet_rcvBkcd;
	}
	private void setIsSet_rcvBkcd(boolean value){
		this.isSet_rcvBkcd= value;
	}
	/**
	 * 입금은행코드
	 */
	@XmlTransient
	public String getRcvBkcd(){
		return this.rcvBkcd;
	}
	
	/**
	 * 입금은행코드
	 * 
	 * @param rcvBkcd 입금은행코드
	 */
	public void setRcvBkcd(String rcvBkcd){
		this.rcvBkcd= rcvBkcd;
		this.setIsSet_rcvBkcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvAcno= false;
	protected final boolean isSet_rcvAcno(){
		return this.isSet_rcvAcno;
	}
	private void setIsSet_rcvAcno(boolean value){
		this.isSet_rcvAcno= value;
	}
	/**
	 * 입금계좌번호
	 */
	@XmlTransient
	public String getRcvAcno(){
		return this.rcvAcno;
	}
	
	/**
	 * 입금계좌번호
	 * 
	 * @param rcvAcno 입금계좌번호
	 */
	public void setRcvAcno(String rcvAcno){
		this.rcvAcno= rcvAcno;
		this.setIsSet_rcvAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rnpeFnm= false;
	protected final boolean isSet_rnpeFnm(){
		return this.isSet_rnpeFnm;
	}
	private void setIsSet_rnpeFnm(boolean value){
		this.isSet_rnpeFnm= value;
	}
	/**
	 * 수취인성명
	 */
	@XmlTransient
	public String getRnpeFnm(){
		return this.rnpeFnm;
	}
	
	/**
	 * 수취인성명
	 * 
	 * @param rnpeFnm 수취인성명
	 */
	public void setRnpeFnm(String rnpeFnm){
		this.rnpeFnm= rnpeFnm;
		this.setIsSet_rnpeFnm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_wdrPbokPrngTxt= false;
	protected final boolean isSet_wdrPbokPrngTxt(){
		return this.isSet_wdrPbokPrngTxt;
	}
	private void setIsSet_wdrPbokPrngTxt(boolean value){
		this.isSet_wdrPbokPrngTxt= value;
	}
	/**
	 * 출금통장인자내용
	 */
	@XmlTransient
	public String getWdrPbokPrngTxt(){
		return this.wdrPbokPrngTxt;
	}
	
	/**
	 * 출금통장인자내용
	 * 
	 * @param wdrPbokPrngTxt 출금통장인자내용
	 */
	public void setWdrPbokPrngTxt(String wdrPbokPrngTxt){
		this.wdrPbokPrngTxt= wdrPbokPrngTxt;
		this.setIsSet_wdrPbokPrngTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_ptnPbokPrngTxt= false;
	protected final boolean isSet_ptnPbokPrngTxt(){
		return this.isSet_ptnPbokPrngTxt;
	}
	private void setIsSet_ptnPbokPrngTxt(boolean value){
		this.isSet_ptnPbokPrngTxt= value;
	}
	/**
	 * 상대통장인자내용
	 */
	@XmlTransient
	public String getPtnPbokPrngTxt(){
		return this.ptnPbokPrngTxt;
	}
	
	/**
	 * 상대통장인자내용
	 * 
	 * @param ptnPbokPrngTxt 상대통장인자내용
	 */
	public void setPtnPbokPrngTxt(String ptnPbokPrngTxt){
		this.ptnPbokPrngTxt= ptnPbokPrngTxt;
		this.setIsSet_ptnPbokPrngTxt(true);
	}
				
	@Override
	public MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO clone(){
		try{
			MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO object= (MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO)super.clone();
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
		
		result= prime * result + ((this.wdrAcno==null)?0:this.wdrAcno.hashCode());
		result= prime * result + ((this.actPwnoUsgYn==null)?0:this.actPwnoUsgYn.hashCode());
		result= prime * result + ((this.encyActPwno==null)?0:this.encyActPwno.hashCode());
		result= prime * result + ((this.trnAm==null)?0:this.trnAm.hashCode());
		result= prime * result + ((this.rcvBkcd==null)?0:this.rcvBkcd.hashCode());
		result= prime * result + ((this.rcvAcno==null)?0:this.rcvAcno.hashCode());
		result= prime * result + ((this.rnpeFnm==null)?0:this.rnpeFnm.hashCode());
		result= prime * result + ((this.wdrPbokPrngTxt==null)?0:this.wdrPbokPrngTxt.hashCode());
		result= prime * result + ((this.ptnPbokPrngTxt==null)?0:this.ptnPbokPrngTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO other= (MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO)obj;
		{
			Object _wdrAcno= getWdrAcno();
			Object __wdrAcno= other.getWdrAcno();
			if ( _wdrAcno== null ) { if ( __wdrAcno!= null ) return false; }
			else if ( !_wdrAcno.equals(__wdrAcno) ) return false;
		}
		{
			Object _actPwnoUsgYn= getActPwnoUsgYn();
			Object __actPwnoUsgYn= other.getActPwnoUsgYn();
			if ( _actPwnoUsgYn== null ) { if ( __actPwnoUsgYn!= null ) return false; }
			else if ( !_actPwnoUsgYn.equals(__actPwnoUsgYn) ) return false;
		}
		{
			Object _encyActPwno= getEncyActPwno();
			Object __encyActPwno= other.getEncyActPwno();
			if ( _encyActPwno== null ) { if ( __encyActPwno!= null ) return false; }
			else if ( !_encyActPwno.equals(__encyActPwno) ) return false;
		}
		{
			Object _trnAm= getTrnAm();
			Object __trnAm= other.getTrnAm();
			if ( _trnAm== null ) { if ( __trnAm!= null ) return false; }
			else if ( !_trnAm.equals(__trnAm) ) return false;
		}
		{
			Object _rcvBkcd= getRcvBkcd();
			Object __rcvBkcd= other.getRcvBkcd();
			if ( _rcvBkcd== null ) { if ( __rcvBkcd!= null ) return false; }
			else if ( !_rcvBkcd.equals(__rcvBkcd) ) return false;
		}
		{
			Object _rcvAcno= getRcvAcno();
			Object __rcvAcno= other.getRcvAcno();
			if ( _rcvAcno== null ) { if ( __rcvAcno!= null ) return false; }
			else if ( !_rcvAcno.equals(__rcvAcno) ) return false;
		}
		{
			Object _rnpeFnm= getRnpeFnm();
			Object __rnpeFnm= other.getRnpeFnm();
			if ( _rnpeFnm== null ) { if ( __rnpeFnm!= null ) return false; }
			else if ( !_rnpeFnm.equals(__rnpeFnm) ) return false;
		}
		{
			Object _wdrPbokPrngTxt= getWdrPbokPrngTxt();
			Object __wdrPbokPrngTxt= other.getWdrPbokPrngTxt();
			if ( _wdrPbokPrngTxt== null ) { if ( __wdrPbokPrngTxt!= null ) return false; }
			else if ( !_wdrPbokPrngTxt.equals(__wdrPbokPrngTxt) ) return false;
		}
		{
			Object _ptnPbokPrngTxt= getPtnPbokPrngTxt();
			Object __ptnPbokPrngTxt= other.getPtnPbokPrngTxt();
			if ( _ptnPbokPrngTxt== null ) { if ( __ptnPbokPrngTxt!= null ) return false; }
			else if ( !_ptnPbokPrngTxt.equals(__ptnPbokPrngTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokFncTrnMngInsertAsscNompefObkFdtsExeInput_DTO.class.getName()).append(":\n");
		sb.append("\twdrAcno: ");
		sb.append(wdrAcno==null?"null":getWdrAcno());
		sb.append("\n");
		sb.append("\tactPwnoUsgYn: ");
		sb.append(actPwnoUsgYn==null?"null":getActPwnoUsgYn());
		sb.append("\n");
		sb.append("\tencyActPwno: ");
		sb.append(encyActPwno==null?"null":getEncyActPwno());
		sb.append("\n");
		sb.append("\ttrnAm: ");
		sb.append(trnAm==null?"null":getTrnAm());
		sb.append("\n");
		sb.append("\trcvBkcd: ");
		sb.append(rcvBkcd==null?"null":getRcvBkcd());
		sb.append("\n");
		sb.append("\trcvAcno: ");
		sb.append(rcvAcno==null?"null":getRcvAcno());
		sb.append("\n");
		sb.append("\trnpeFnm: ");
		sb.append(rnpeFnm==null?"null":getRnpeFnm());
		sb.append("\n");
		sb.append("\twdrPbokPrngTxt: ");
		sb.append(wdrPbokPrngTxt==null?"null":getWdrPbokPrngTxt());
		sb.append("\n");
		sb.append("\tptnPbokPrngTxt: ");
		sb.append(ptnPbokPrngTxt==null?"null":getPtnPbokPrngTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* wdrAcno */
		messageLen+= 1; /* actPwnoUsgYn */
		messageLen+= 32; /* encyActPwno */
		messageLen+= 13; /* trnAm */
		messageLen+= 3; /* rcvBkcd */
		messageLen+= 15; /* rcvAcno */
		messageLen+= 22; /* rnpeFnm */
		messageLen+= 22; /* wdrPbokPrngTxt */
		messageLen+= 22; /* ptnPbokPrngTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("wdrAcno");
		list.add("actPwnoUsgYn");
		list.add("encyActPwno");
		list.add("trnAm");
		list.add("rcvBkcd");
		list.add("rcvAcno");
		list.add("rnpeFnm");
		list.add("wdrPbokPrngTxt");
		list.add("ptnPbokPrngTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("wdrAcno", get("wdrAcno"));
		map.put("actPwnoUsgYn", get("actPwnoUsgYn"));
		map.put("encyActPwno", get("encyActPwno"));
		map.put("trnAm", get("trnAm"));
		map.put("rcvBkcd", get("rcvBkcd"));
		map.put("rcvAcno", get("rcvAcno"));
		map.put("rnpeFnm", get("rnpeFnm"));
		map.put("wdrPbokPrngTxt", get("wdrPbokPrngTxt"));
		map.put("ptnPbokPrngTxt", get("ptnPbokPrngTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1208987208:/* wdrAcno */
			return getWdrAcno();
		case 1280416996:/* actPwnoUsgYn */
			return getActPwnoUsgYn();
		case 1134290395:/* encyActPwno */
			return getEncyActPwno();
		case 110632444:/* trnAm */
			return getTrnAm();
		case 1041538159:/* rcvBkcd */
			return getRcvBkcd();
		case 1041501032:/* rcvAcno */
			return getRcvAcno();
		case 1351925172:/* rnpeFnm */
			return getRnpeFnm();
		case -1485101694:/* wdrPbokPrngTxt */
			return getWdrPbokPrngTxt();
		case 1137996989:/* ptnPbokPrngTxt */
			return getPtnPbokPrngTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1208987208:/* wdrAcno */
			setWdrAcno((String)value);
			break;
		case 1280416996:/* actPwnoUsgYn */
			setActPwnoUsgYn((String)value);
			break;
		case 1134290395:/* encyActPwno */
			setEncyActPwno((String)value);
			break;
		case 110632444:/* trnAm */
			if ( value instanceof String ){
				setTrnAm((String)value);
			}
			else if ( value instanceof Double ){
				setTrnAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTrnAm((Long)value);
			}
			else{
				setTrnAm((BigDecimal)value);
			}
			break;
		case 1041538159:/* rcvBkcd */
			setRcvBkcd((String)value);
			break;
		case 1041501032:/* rcvAcno */
			setRcvAcno((String)value);
			break;
		case 1351925172:/* rnpeFnm */
			setRnpeFnm((String)value);
			break;
		case -1485101694:/* wdrPbokPrngTxt */
			setWdrPbokPrngTxt((String)value);
			break;
		case 1137996989:/* ptnPbokPrngTxt */
			setPtnPbokPrngTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
