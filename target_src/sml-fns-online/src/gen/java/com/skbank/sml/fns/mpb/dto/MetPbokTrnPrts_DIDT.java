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
 * IBSMR0005772
 */
@XmlType(propOrder={
	"inqDis", "metMngNo", "inqStaDt", "inqStaTrnSrno", "inqEndDt", "inqEndTrnSrno", "sctnStaAm", "sctnEndAm", "rapDscd", "metTrnMemoTxt"
}, name="MetPbokTrnPrts_DIDT")
@XmlRootElement(name="MetPbokTrnPrts_DIDT")
@BxmCategory(logicalName="모임.통장.거래내역.DBM.입력.IO", description="IBSMR0005772") 
public class MetPbokTrnPrts_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1761935551L;
	
	
	
	/**
	 * 조회구분
	 */
	@ApiModelProperty(
		name = "inqDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqDis")
	@BxmOmm_Field(length=2, decimal=0, description="조회구분", align="left", fill="")
	private String inqDis= "";
	
	
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
	 * 조회시작일자
	 */
	@ApiModelProperty(
		name = "inqStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="조회시작일자", align="left", fill="")
	private String inqStaDt= "";
	
	
	/**
	 * 조회시작거래일련번호
	 */
	@ApiModelProperty(
		name = "inqStaTrnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("inqStaTrnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="조회시작거래일련번호", align="right", fill="0")
	private Integer inqStaTrnSrno= 0;
	
	
	/**
	 * 조회종료일자
	 */
	@ApiModelProperty(
		name = "inqEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="조회종료일자", align="left", fill="")
	private String inqEndDt= "";
	
	
	/**
	 * 조회종료거래일련번호
	 */
	@ApiModelProperty(
		name = "inqEndTrnSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("inqEndTrnSrno")
	@BxmOmm_Field(length=8, decimal=0, description="조회종료거래일련번호", align="right", fill="0")
	private Integer inqEndTrnSrno= 0;
	
	
	/**
	 * 구간시작금액
	 */
	@ApiModelProperty(
		name = "sctnStaAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("sctnStaAm")
	@BxmOmm_Field(length=19, decimal=3, description="구간시작금액", align="right", fill="0")
	private BigDecimal sctnStaAm= new BigDecimal("0");
	
	
	/**
	 * 구간종료금액
	 */
	@ApiModelProperty(
		name = "sctnEndAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("sctnEndAm")
	@BxmOmm_Field(length=19, decimal=3, description="구간종료금액", align="right", fill="0")
	private BigDecimal sctnEndAm= new BigDecimal("0");
	
	
	/**
	 * 입지급구분코드
	 */
	@ApiModelProperty(
		name = "rapDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rapDscd")
	@BxmOmm_Field(length=1, decimal=0, description="입지급구분코드", align="left", fill="")
	private String rapDscd= "";
	
	
	/**
	 * 모임거래메모내용
	 */
	@ApiModelProperty(
		name = "metTrnMemoTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metTrnMemoTxt")
	@BxmOmm_Field(length=40, decimal=0, description="모임거래메모내용", align="left", fill="")
	private String metTrnMemoTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqDis= false;
	protected final boolean isSet_inqDis(){
		return this.isSet_inqDis;
	}
	private void setIsSet_inqDis(boolean value){
		this.isSet_inqDis= value;
	}
	/**
	 * 조회구분
	 */
	@XmlTransient
	public String getInqDis(){
		return this.inqDis;
	}
	
	/**
	 * 조회구분
	 * 
	 * @param inqDis 조회구분
	 */
	public void setInqDis(String inqDis){
		this.inqDis= inqDis;
		this.setIsSet_inqDis(true);
	}
	
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
	private boolean isSet_inqStaDt= false;
	protected final boolean isSet_inqStaDt(){
		return this.isSet_inqStaDt;
	}
	private void setIsSet_inqStaDt(boolean value){
		this.isSet_inqStaDt= value;
	}
	/**
	 * 조회시작일자
	 */
	@XmlTransient
	public String getInqStaDt(){
		return this.inqStaDt;
	}
	
	/**
	 * 조회시작일자
	 * 
	 * @param inqStaDt 조회시작일자
	 */
	public void setInqStaDt(String inqStaDt){
		this.inqStaDt= inqStaDt;
		this.setIsSet_inqStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqStaTrnSrno= false;
	protected final boolean isSet_inqStaTrnSrno(){
		return this.isSet_inqStaTrnSrno;
	}
	private void setIsSet_inqStaTrnSrno(boolean value){
		this.isSet_inqStaTrnSrno= value;
	}
	/**
	 * 조회시작거래일련번호
	 */
	@XmlTransient
	public Integer getInqStaTrnSrno(){
		return this.inqStaTrnSrno;
	}
	
	/**
	 * 조회시작거래일련번호
	 * 
	 * @param inqStaTrnSrno 조회시작거래일련번호
	 */
	public void setInqStaTrnSrno(Integer inqStaTrnSrno){
		this.inqStaTrnSrno= inqStaTrnSrno;
		this.setIsSet_inqStaTrnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqEndDt= false;
	protected final boolean isSet_inqEndDt(){
		return this.isSet_inqEndDt;
	}
	private void setIsSet_inqEndDt(boolean value){
		this.isSet_inqEndDt= value;
	}
	/**
	 * 조회종료일자
	 */
	@XmlTransient
	public String getInqEndDt(){
		return this.inqEndDt;
	}
	
	/**
	 * 조회종료일자
	 * 
	 * @param inqEndDt 조회종료일자
	 */
	public void setInqEndDt(String inqEndDt){
		this.inqEndDt= inqEndDt;
		this.setIsSet_inqEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqEndTrnSrno= false;
	protected final boolean isSet_inqEndTrnSrno(){
		return this.isSet_inqEndTrnSrno;
	}
	private void setIsSet_inqEndTrnSrno(boolean value){
		this.isSet_inqEndTrnSrno= value;
	}
	/**
	 * 조회종료거래일련번호
	 */
	@XmlTransient
	public Integer getInqEndTrnSrno(){
		return this.inqEndTrnSrno;
	}
	
	/**
	 * 조회종료거래일련번호
	 * 
	 * @param inqEndTrnSrno 조회종료거래일련번호
	 */
	public void setInqEndTrnSrno(Integer inqEndTrnSrno){
		this.inqEndTrnSrno= inqEndTrnSrno;
		this.setIsSet_inqEndTrnSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sctnStaAm= false;
	protected final boolean isSet_sctnStaAm(){
		return this.isSet_sctnStaAm;
	}
	private void setIsSet_sctnStaAm(boolean value){
		this.isSet_sctnStaAm= value;
	}
	/**
	 * 구간시작금액
	 * BigDecimal - Double value setter
	 *
	 * @Param sctnStaAm 구간시작금액
	 */
	public void setSctnStaAm(double sctnStaAm) {
		setSctnStaAm(BigDecimal.valueOf(sctnStaAm));
	}
	/**
	 * 구간시작금액
	 * BigDecimal - Long value setter
	 *
	 * @Param sctnStaAm 구간시작금액
	 */
	public void setSctnStaAm(long sctnStaAm) {
		setSctnStaAm(BigDecimal.valueOf(sctnStaAm));
	}
	/**
	 * 구간시작금액
	 * BigDecimal - String value setter
	 *
	 * @Param sctnStaAm 구간시작금액
	 */
	public void setSctnStaAm(String sctnStaAm) {
		setSctnStaAm(new BigDecimal(sctnStaAm));
	}
	/**
	 * 구간시작금액
	 */
	@XmlTransient
	public BigDecimal getSctnStaAm(){
		return this.sctnStaAm;
	}
	
	/**
	 * 구간시작금액
	 * 
	 * @param sctnStaAm 구간시작금액
	 */
	@JsonSetter("sctnStaAm")
	public void setSctnStaAm(BigDecimal sctnStaAm){
		this.sctnStaAm= sctnStaAm;
		this.setIsSet_sctnStaAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sctnEndAm= false;
	protected final boolean isSet_sctnEndAm(){
		return this.isSet_sctnEndAm;
	}
	private void setIsSet_sctnEndAm(boolean value){
		this.isSet_sctnEndAm= value;
	}
	/**
	 * 구간종료금액
	 * BigDecimal - Double value setter
	 *
	 * @Param sctnEndAm 구간종료금액
	 */
	public void setSctnEndAm(double sctnEndAm) {
		setSctnEndAm(BigDecimal.valueOf(sctnEndAm));
	}
	/**
	 * 구간종료금액
	 * BigDecimal - Long value setter
	 *
	 * @Param sctnEndAm 구간종료금액
	 */
	public void setSctnEndAm(long sctnEndAm) {
		setSctnEndAm(BigDecimal.valueOf(sctnEndAm));
	}
	/**
	 * 구간종료금액
	 * BigDecimal - String value setter
	 *
	 * @Param sctnEndAm 구간종료금액
	 */
	public void setSctnEndAm(String sctnEndAm) {
		setSctnEndAm(new BigDecimal(sctnEndAm));
	}
	/**
	 * 구간종료금액
	 */
	@XmlTransient
	public BigDecimal getSctnEndAm(){
		return this.sctnEndAm;
	}
	
	/**
	 * 구간종료금액
	 * 
	 * @param sctnEndAm 구간종료금액
	 */
	@JsonSetter("sctnEndAm")
	public void setSctnEndAm(BigDecimal sctnEndAm){
		this.sctnEndAm= sctnEndAm;
		this.setIsSet_sctnEndAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rapDscd= false;
	protected final boolean isSet_rapDscd(){
		return this.isSet_rapDscd;
	}
	private void setIsSet_rapDscd(boolean value){
		this.isSet_rapDscd= value;
	}
	/**
	 * 입지급구분코드
	 */
	@XmlTransient
	public String getRapDscd(){
		return this.rapDscd;
	}
	
	/**
	 * 입지급구분코드
	 * 
	 * @param rapDscd 입지급구분코드
	 */
	public void setRapDscd(String rapDscd){
		this.rapDscd= rapDscd;
		this.setIsSet_rapDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metTrnMemoTxt= false;
	protected final boolean isSet_metTrnMemoTxt(){
		return this.isSet_metTrnMemoTxt;
	}
	private void setIsSet_metTrnMemoTxt(boolean value){
		this.isSet_metTrnMemoTxt= value;
	}
	/**
	 * 모임거래메모내용
	 */
	@XmlTransient
	public String getMetTrnMemoTxt(){
		return this.metTrnMemoTxt;
	}
	
	/**
	 * 모임거래메모내용
	 * 
	 * @param metTrnMemoTxt 모임거래메모내용
	 */
	public void setMetTrnMemoTxt(String metTrnMemoTxt){
		this.metTrnMemoTxt= metTrnMemoTxt;
		this.setIsSet_metTrnMemoTxt(true);
	}
				
	@Override
	public MetPbokTrnPrts_DIDT clone(){
		try{
			MetPbokTrnPrts_DIDT object= (MetPbokTrnPrts_DIDT)super.clone();
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
		
		result= prime * result + ((this.inqDis==null)?0:this.inqDis.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.inqStaDt==null)?0:this.inqStaDt.hashCode());
		result= prime * result + ((this.inqStaTrnSrno==null)?0:this.inqStaTrnSrno.hashCode());
		result= prime * result + ((this.inqEndDt==null)?0:this.inqEndDt.hashCode());
		result= prime * result + ((this.inqEndTrnSrno==null)?0:this.inqEndTrnSrno.hashCode());
		result= prime * result + ((this.sctnStaAm==null)?0:this.sctnStaAm.hashCode());
		result= prime * result + ((this.sctnEndAm==null)?0:this.sctnEndAm.hashCode());
		result= prime * result + ((this.rapDscd==null)?0:this.rapDscd.hashCode());
		result= prime * result + ((this.metTrnMemoTxt==null)?0:this.metTrnMemoTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokTrnPrts_DIDT other= (MetPbokTrnPrts_DIDT)obj;
		{
			Object _inqDis= getInqDis();
			Object __inqDis= other.getInqDis();
			if ( _inqDis== null ) { if ( __inqDis!= null ) return false; }
			else if ( !_inqDis.equals(__inqDis) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _inqStaDt= getInqStaDt();
			Object __inqStaDt= other.getInqStaDt();
			if ( _inqStaDt== null ) { if ( __inqStaDt!= null ) return false; }
			else if ( !_inqStaDt.equals(__inqStaDt) ) return false;
		}
		{
			Object _inqStaTrnSrno= getInqStaTrnSrno();
			Object __inqStaTrnSrno= other.getInqStaTrnSrno();
			if ( _inqStaTrnSrno== null ) { if ( __inqStaTrnSrno!= null ) return false; }
			else if ( !_inqStaTrnSrno.equals(__inqStaTrnSrno) ) return false;
		}
		{
			Object _inqEndDt= getInqEndDt();
			Object __inqEndDt= other.getInqEndDt();
			if ( _inqEndDt== null ) { if ( __inqEndDt!= null ) return false; }
			else if ( !_inqEndDt.equals(__inqEndDt) ) return false;
		}
		{
			Object _inqEndTrnSrno= getInqEndTrnSrno();
			Object __inqEndTrnSrno= other.getInqEndTrnSrno();
			if ( _inqEndTrnSrno== null ) { if ( __inqEndTrnSrno!= null ) return false; }
			else if ( !_inqEndTrnSrno.equals(__inqEndTrnSrno) ) return false;
		}
		{
			Object _sctnStaAm= getSctnStaAm();
			Object __sctnStaAm= other.getSctnStaAm();
			if ( _sctnStaAm== null ) { if ( __sctnStaAm!= null ) return false; }
			else if ( !_sctnStaAm.equals(__sctnStaAm) ) return false;
		}
		{
			Object _sctnEndAm= getSctnEndAm();
			Object __sctnEndAm= other.getSctnEndAm();
			if ( _sctnEndAm== null ) { if ( __sctnEndAm!= null ) return false; }
			else if ( !_sctnEndAm.equals(__sctnEndAm) ) return false;
		}
		{
			Object _rapDscd= getRapDscd();
			Object __rapDscd= other.getRapDscd();
			if ( _rapDscd== null ) { if ( __rapDscd!= null ) return false; }
			else if ( !_rapDscd.equals(__rapDscd) ) return false;
		}
		{
			Object _metTrnMemoTxt= getMetTrnMemoTxt();
			Object __metTrnMemoTxt= other.getMetTrnMemoTxt();
			if ( _metTrnMemoTxt== null ) { if ( __metTrnMemoTxt!= null ) return false; }
			else if ( !_metTrnMemoTxt.equals(__metTrnMemoTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokTrnPrts_DIDT.class.getName()).append(":\n");
		sb.append("\tinqDis: ");
		sb.append(inqDis==null?"null":getInqDis());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tinqStaDt: ");
		sb.append(inqStaDt==null?"null":getInqStaDt());
		sb.append("\n");
		sb.append("\tinqStaTrnSrno: ");
		sb.append(inqStaTrnSrno==null?"null":getInqStaTrnSrno());
		sb.append("\n");
		sb.append("\tinqEndDt: ");
		sb.append(inqEndDt==null?"null":getInqEndDt());
		sb.append("\n");
		sb.append("\tinqEndTrnSrno: ");
		sb.append(inqEndTrnSrno==null?"null":getInqEndTrnSrno());
		sb.append("\n");
		sb.append("\tsctnStaAm: ");
		sb.append(sctnStaAm==null?"null":getSctnStaAm());
		sb.append("\n");
		sb.append("\tsctnEndAm: ");
		sb.append(sctnEndAm==null?"null":getSctnEndAm());
		sb.append("\n");
		sb.append("\trapDscd: ");
		sb.append(rapDscd==null?"null":getRapDscd());
		sb.append("\n");
		sb.append("\tmetTrnMemoTxt: ");
		sb.append(metTrnMemoTxt==null?"null":getMetTrnMemoTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* inqDis */
		messageLen+= 9; /* metMngNo */
		messageLen+= 8; /* inqStaDt */
		messageLen+= 8; /* inqStaTrnSrno */
		messageLen+= 8; /* inqEndDt */
		messageLen+= 8; /* inqEndTrnSrno */
		messageLen+= 19; /* sctnStaAm */
		messageLen+= 19; /* sctnEndAm */
		messageLen+= 1; /* rapDscd */
		messageLen+= 40; /* metTrnMemoTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("inqDis");
		list.add("metMngNo");
		list.add("inqStaDt");
		list.add("inqStaTrnSrno");
		list.add("inqEndDt");
		list.add("inqEndTrnSrno");
		list.add("sctnStaAm");
		list.add("sctnEndAm");
		list.add("rapDscd");
		list.add("metTrnMemoTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("inqDis", get("inqDis"));
		map.put("metMngNo", get("metMngNo"));
		map.put("inqStaDt", get("inqStaDt"));
		map.put("inqStaTrnSrno", get("inqStaTrnSrno"));
		map.put("inqEndDt", get("inqEndDt"));
		map.put("inqEndTrnSrno", get("inqEndTrnSrno"));
		map.put("sctnStaAm", get("sctnStaAm"));
		map.put("sctnEndAm", get("sctnEndAm"));
		map.put("rapDscd", get("rapDscd"));
		map.put("metTrnMemoTxt", get("metTrnMemoTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1183884030:/* inqDis */
			return getInqDis();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 467946052:/* inqStaDt */
			return getInqStaDt();
		case -1099755268:/* inqStaTrnSrno */
			return getInqStaTrnSrno();
		case 454840895:/* inqEndDt */
			return getInqEndDt();
		case 544722401:/* inqEndTrnSrno */
			return getInqEndTrnSrno();
		case 2141320130:/* sctnStaAm */
			return getSctnStaAm();
		case 2128214973:/* sctnEndAm */
			return getSctnEndAm();
		case 978806001:/* rapDscd */
			return getRapDscd();
		case 2074206722:/* metTrnMemoTxt */
			return getMetTrnMemoTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1183884030:/* inqDis */
			setInqDis((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 467946052:/* inqStaDt */
			setInqStaDt((String)value);
			break;
		case -1099755268:/* inqStaTrnSrno */
			setInqStaTrnSrno((Integer)value);
			break;
		case 454840895:/* inqEndDt */
			setInqEndDt((String)value);
			break;
		case 544722401:/* inqEndTrnSrno */
			setInqEndTrnSrno((Integer)value);
			break;
		case 2141320130:/* sctnStaAm */
			if ( value instanceof String ){
				setSctnStaAm((String)value);
			}
			else if ( value instanceof Double ){
				setSctnStaAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSctnStaAm((Long)value);
			}
			else{
				setSctnStaAm((BigDecimal)value);
			}
			break;
		case 2128214973:/* sctnEndAm */
			if ( value instanceof String ){
				setSctnEndAm((String)value);
			}
			else if ( value instanceof Double ){
				setSctnEndAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSctnEndAm((Long)value);
			}
			else{
				setSctnEndAm((BigDecimal)value);
			}
			break;
		case 978806001:/* rapDscd */
			setRapDscd((String)value);
			break;
		case 2074206722:/* metTrnMemoTxt */
			setMetTrnMemoTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
