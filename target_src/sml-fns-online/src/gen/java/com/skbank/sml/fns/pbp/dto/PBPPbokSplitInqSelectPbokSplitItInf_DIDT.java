/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.dto;

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
	"itcsno", "acno", "inqDscd", "spceNo", "inqStaDt", "inqEndDt", "sortDscd", "atpmMngNo"
}, name="PBPPbokSplitInqSelectPbokSplitItInf_DIDT")
@XmlRootElement(name="PBPPbokSplitInqSelectPbokSplitItInf_DIDT")
@BxmCategory(logicalName="통장.쪼객.통합.정보.조회.DBM.입력.IO", description="") 
public class PBPPbokSplitInqSelectPbokSplitItInf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1023643071L;
	
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=36, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=13, decimal=0, description="계좌번호", align="left", fill="")
	private String acno= "";
	
	
	/**
	 * 조회구분코드
	 */
	@ApiModelProperty(
		name = "inqDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqDscd")
	@BxmOmm_Field(length=2, decimal=0, description="조회구분코드", align="left", fill="")
	private String inqDscd= "";
	
	
	/**
	 * 공간번호
	 */
	@ApiModelProperty(
		name = "spceNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceNo")
	@BxmOmm_Field(length=6, decimal=0, description="공간번호", align="left", fill="")
	private String spceNo= "";
	
	
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
	 * 정렬구분코드
	 */
	@ApiModelProperty(
		name = "sortDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sortDscd")
	@BxmOmm_Field(length=2, decimal=0, description="정렬구분코드", align="left", fill="")
	private String sortDscd= "";
	
	
	/**
	 * 자동납부관리번호
	 */
	@ApiModelProperty(
		name = "atpmMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atpmMngNo")
	@BxmOmm_Field(length=12, decimal=0, description="자동납부관리번호", align="left", fill="")
	private String atpmMngNo= "";
	
	
	
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
	private boolean isSet_acno= false;
	protected final boolean isSet_acno(){
		return this.isSet_acno;
	}
	private void setIsSet_acno(boolean value){
		this.isSet_acno= value;
	}
	/**
	 * 계좌번호
	 */
	@XmlTransient
	public String getAcno(){
		return this.acno;
	}
	
	/**
	 * 계좌번호
	 * 
	 * @param acno 계좌번호
	 */
	public void setAcno(String acno){
		this.acno= acno;
		this.setIsSet_acno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqDscd= false;
	protected final boolean isSet_inqDscd(){
		return this.isSet_inqDscd;
	}
	private void setIsSet_inqDscd(boolean value){
		this.isSet_inqDscd= value;
	}
	/**
	 * 조회구분코드
	 */
	@XmlTransient
	public String getInqDscd(){
		return this.inqDscd;
	}
	
	/**
	 * 조회구분코드
	 * 
	 * @param inqDscd 조회구분코드
	 */
	public void setInqDscd(String inqDscd){
		this.inqDscd= inqDscd;
		this.setIsSet_inqDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceNo= false;
	protected final boolean isSet_spceNo(){
		return this.isSet_spceNo;
	}
	private void setIsSet_spceNo(boolean value){
		this.isSet_spceNo= value;
	}
	/**
	 * 공간번호
	 */
	@XmlTransient
	public String getSpceNo(){
		return this.spceNo;
	}
	
	/**
	 * 공간번호
	 * 
	 * @param spceNo 공간번호
	 */
	public void setSpceNo(String spceNo){
		this.spceNo= spceNo;
		this.setIsSet_spceNo(true);
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
	private boolean isSet_sortDscd= false;
	protected final boolean isSet_sortDscd(){
		return this.isSet_sortDscd;
	}
	private void setIsSet_sortDscd(boolean value){
		this.isSet_sortDscd= value;
	}
	/**
	 * 정렬구분코드
	 */
	@XmlTransient
	public String getSortDscd(){
		return this.sortDscd;
	}
	
	/**
	 * 정렬구분코드
	 * 
	 * @param sortDscd 정렬구분코드
	 */
	public void setSortDscd(String sortDscd){
		this.sortDscd= sortDscd;
		this.setIsSet_sortDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atpmMngNo= false;
	protected final boolean isSet_atpmMngNo(){
		return this.isSet_atpmMngNo;
	}
	private void setIsSet_atpmMngNo(boolean value){
		this.isSet_atpmMngNo= value;
	}
	/**
	 * 자동납부관리번호
	 */
	@XmlTransient
	public String getAtpmMngNo(){
		return this.atpmMngNo;
	}
	
	/**
	 * 자동납부관리번호
	 * 
	 * @param atpmMngNo 자동납부관리번호
	 */
	public void setAtpmMngNo(String atpmMngNo){
		this.atpmMngNo= atpmMngNo;
		this.setIsSet_atpmMngNo(true);
	}
				
	@Override
	public PBPPbokSplitInqSelectPbokSplitItInf_DIDT clone(){
		try{
			PBPPbokSplitInqSelectPbokSplitItInf_DIDT object= (PBPPbokSplitInqSelectPbokSplitItInf_DIDT)super.clone();
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
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.inqDscd==null)?0:this.inqDscd.hashCode());
		result= prime * result + ((this.spceNo==null)?0:this.spceNo.hashCode());
		result= prime * result + ((this.inqStaDt==null)?0:this.inqStaDt.hashCode());
		result= prime * result + ((this.inqEndDt==null)?0:this.inqEndDt.hashCode());
		result= prime * result + ((this.sortDscd==null)?0:this.sortDscd.hashCode());
		result= prime * result + ((this.atpmMngNo==null)?0:this.atpmMngNo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSplitInqSelectPbokSplitItInf_DIDT other= (PBPPbokSplitInqSelectPbokSplitItInf_DIDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _inqDscd= getInqDscd();
			Object __inqDscd= other.getInqDscd();
			if ( _inqDscd== null ) { if ( __inqDscd!= null ) return false; }
			else if ( !_inqDscd.equals(__inqDscd) ) return false;
		}
		{
			Object _spceNo= getSpceNo();
			Object __spceNo= other.getSpceNo();
			if ( _spceNo== null ) { if ( __spceNo!= null ) return false; }
			else if ( !_spceNo.equals(__spceNo) ) return false;
		}
		{
			Object _inqStaDt= getInqStaDt();
			Object __inqStaDt= other.getInqStaDt();
			if ( _inqStaDt== null ) { if ( __inqStaDt!= null ) return false; }
			else if ( !_inqStaDt.equals(__inqStaDt) ) return false;
		}
		{
			Object _inqEndDt= getInqEndDt();
			Object __inqEndDt= other.getInqEndDt();
			if ( _inqEndDt== null ) { if ( __inqEndDt!= null ) return false; }
			else if ( !_inqEndDt.equals(__inqEndDt) ) return false;
		}
		{
			Object _sortDscd= getSortDscd();
			Object __sortDscd= other.getSortDscd();
			if ( _sortDscd== null ) { if ( __sortDscd!= null ) return false; }
			else if ( !_sortDscd.equals(__sortDscd) ) return false;
		}
		{
			Object _atpmMngNo= getAtpmMngNo();
			Object __atpmMngNo= other.getAtpmMngNo();
			if ( _atpmMngNo== null ) { if ( __atpmMngNo!= null ) return false; }
			else if ( !_atpmMngNo.equals(__atpmMngNo) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSplitInqSelectPbokSplitItInf_DIDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tinqDscd: ");
		sb.append(inqDscd==null?"null":getInqDscd());
		sb.append("\n");
		sb.append("\tspceNo: ");
		sb.append(spceNo==null?"null":getSpceNo());
		sb.append("\n");
		sb.append("\tinqStaDt: ");
		sb.append(inqStaDt==null?"null":getInqStaDt());
		sb.append("\n");
		sb.append("\tinqEndDt: ");
		sb.append(inqEndDt==null?"null":getInqEndDt());
		sb.append("\n");
		sb.append("\tsortDscd: ");
		sb.append(sortDscd==null?"null":getSortDscd());
		sb.append("\n");
		sb.append("\tatpmMngNo: ");
		sb.append(atpmMngNo==null?"null":getAtpmMngNo());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 13; /* acno */
		messageLen+= 2; /* inqDscd */
		messageLen+= 6; /* spceNo */
		messageLen+= 8; /* inqStaDt */
		messageLen+= 8; /* inqEndDt */
		messageLen+= 2; /* sortDscd */
		messageLen+= 12; /* atpmMngNo */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("acno");
		list.add("inqDscd");
		list.add("spceNo");
		list.add("inqStaDt");
		list.add("inqEndDt");
		list.add("sortDscd");
		list.add("atpmMngNo");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("acno", get("acno"));
		map.put("inqDscd", get("inqDscd"));
		map.put("spceNo", get("spceNo"));
		map.put("inqStaDt", get("inqStaDt"));
		map.put("inqEndDt", get("inqEndDt"));
		map.put("sortDscd", get("sortDscd"));
		map.put("atpmMngNo", get("atpmMngNo"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 2988387:/* acno */
			return getAcno();
		case 1954309948:/* inqDscd */
			return getInqDscd();
		case -896131680:/* spceNo */
			return getSpceNo();
		case 467946052:/* inqStaDt */
			return getInqStaDt();
		case 454840895:/* inqEndDt */
			return getInqEndDt();
		case 1661377518:/* sortDscd */
			return getSortDscd();
		case 589376439:/* atpmMngNo */
			return getAtpmMngNo();
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
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case 1954309948:/* inqDscd */
			setInqDscd((String)value);
			break;
		case -896131680:/* spceNo */
			setSpceNo((String)value);
			break;
		case 467946052:/* inqStaDt */
			setInqStaDt((String)value);
			break;
		case 454840895:/* inqEndDt */
			setInqEndDt((String)value);
			break;
		case 1661377518:/* sortDscd */
			setSortDscd((String)value);
			break;
		case 589376439:/* atpmMngNo */
			setAtpmMngNo((String)value);
			break;
		default:
			break;
		}
	}
	
}
