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
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"sortDis", "inqTgtDis", "acno", "inqStaDt", "inqEndDt", "minAm", "maxAm"
}, name="MNPMnyPinWallMngSelectWallTrnPrts_IDT")
@XmlRootElement(name="MNPMnyPinWallMngSelectWallTrnPrts_IDT")
@BxmCategory(logicalName="머니클립금고거래내역조회.컨트롤러.입력.IO", description="") 
public class MNPMnyPinWallMngSelectWallTrnPrts_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 285012618L;
	
	
	
	/**
	 * 정렬구분
	 */
	@ApiModelProperty(
		name = "sortDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("sortDis")
	@BxmOmm_Field(length=1, decimal=0, description="정렬구분", align="left", fill="")
	private String sortDis= "";
	
	
	/**
	 * 조회대상구분
	 */
	@ApiModelProperty(
		name = "inqTgtDis"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("inqTgtDis")
	@BxmOmm_Field(length=1, decimal=0, description="조회대상구분", align="left", fill="")
	private String inqTgtDis= "";
	
	
	/**
	 * 계좌번호
	 */
	@ApiModelProperty(
		name = "acno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("acno")
	@BxmOmm_Field(length=20, decimal=0, description="계좌번호", align="left", fill="", etcProperties={"PROP_OPTION_DSCD=L999"})
	private String acno= "";
	
	
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
	 * 최소금액
	 */
	@ApiModelProperty(
		name = "minAm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("minAm")
	@BxmOmm_Field(length=18, decimal=3, description="최소금액", align="left", fill="")
	private String minAm= "";
	
	
	/**
	 * 최대금액
	 */
	@ApiModelProperty(
		name = "maxAm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("maxAm")
	@BxmOmm_Field(length=18, decimal=3, description="최대금액", align="left", fill="")
	private String maxAm= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_sortDis= false;
	protected final boolean isSet_sortDis(){
		return this.isSet_sortDis;
	}
	private void setIsSet_sortDis(boolean value){
		this.isSet_sortDis= value;
	}
	/**
	 * 정렬구분
	 */
	@XmlTransient
	public String getSortDis(){
		return this.sortDis;
	}
	
	/**
	 * 정렬구분
	 * 
	 * @param sortDis 정렬구분
	 */
	public void setSortDis(String sortDis){
		this.sortDis= sortDis;
		this.setIsSet_sortDis(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_inqTgtDis= false;
	protected final boolean isSet_inqTgtDis(){
		return this.isSet_inqTgtDis;
	}
	private void setIsSet_inqTgtDis(boolean value){
		this.isSet_inqTgtDis= value;
	}
	/**
	 * 조회대상구분
	 */
	@XmlTransient
	public String getInqTgtDis(){
		return this.inqTgtDis;
	}
	
	/**
	 * 조회대상구분
	 * 
	 * @param inqTgtDis 조회대상구분
	 */
	public void setInqTgtDis(String inqTgtDis){
		this.inqTgtDis= inqTgtDis;
		this.setIsSet_inqTgtDis(true);
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
	private boolean isSet_minAm= false;
	protected final boolean isSet_minAm(){
		return this.isSet_minAm;
	}
	private void setIsSet_minAm(boolean value){
		this.isSet_minAm= value;
	}
	/**
	 * 최소금액
	 */
	@XmlTransient
	public String getMinAm(){
		return this.minAm;
	}
	
	/**
	 * 최소금액
	 * 
	 * @param minAm 최소금액
	 */
	public void setMinAm(String minAm){
		this.minAm= minAm;
		this.setIsSet_minAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_maxAm= false;
	protected final boolean isSet_maxAm(){
		return this.isSet_maxAm;
	}
	private void setIsSet_maxAm(boolean value){
		this.isSet_maxAm= value;
	}
	/**
	 * 최대금액
	 */
	@XmlTransient
	public String getMaxAm(){
		return this.maxAm;
	}
	
	/**
	 * 최대금액
	 * 
	 * @param maxAm 최대금액
	 */
	public void setMaxAm(String maxAm){
		this.maxAm= maxAm;
		this.setIsSet_maxAm(true);
	}
				
	@Override
	public MNPMnyPinWallMngSelectWallTrnPrts_IDT clone(){
		try{
			MNPMnyPinWallMngSelectWallTrnPrts_IDT object= (MNPMnyPinWallMngSelectWallTrnPrts_IDT)super.clone();
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
		
		result= prime * result + ((this.sortDis==null)?0:this.sortDis.hashCode());
		result= prime * result + ((this.inqTgtDis==null)?0:this.inqTgtDis.hashCode());
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.inqStaDt==null)?0:this.inqStaDt.hashCode());
		result= prime * result + ((this.inqEndDt==null)?0:this.inqEndDt.hashCode());
		result= prime * result + ((this.minAm==null)?0:this.minAm.hashCode());
		result= prime * result + ((this.maxAm==null)?0:this.maxAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MNPMnyPinWallMngSelectWallTrnPrts_IDT other= (MNPMnyPinWallMngSelectWallTrnPrts_IDT)obj;
		{
			Object _sortDis= getSortDis();
			Object __sortDis= other.getSortDis();
			if ( _sortDis== null ) { if ( __sortDis!= null ) return false; }
			else if ( !_sortDis.equals(__sortDis) ) return false;
		}
		{
			Object _inqTgtDis= getInqTgtDis();
			Object __inqTgtDis= other.getInqTgtDis();
			if ( _inqTgtDis== null ) { if ( __inqTgtDis!= null ) return false; }
			else if ( !_inqTgtDis.equals(__inqTgtDis) ) return false;
		}
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
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
			Object _minAm= getMinAm();
			Object __minAm= other.getMinAm();
			if ( _minAm== null ) { if ( __minAm!= null ) return false; }
			else if ( !_minAm.equals(__minAm) ) return false;
		}
		{
			Object _maxAm= getMaxAm();
			Object __maxAm= other.getMaxAm();
			if ( _maxAm== null ) { if ( __maxAm!= null ) return false; }
			else if ( !_maxAm.equals(__maxAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MNPMnyPinWallMngSelectWallTrnPrts_IDT.class.getName()).append(":\n");
		sb.append("\tsortDis: ");
		sb.append(sortDis==null?"null":getSortDis());
		sb.append("\n");
		sb.append("\tinqTgtDis: ");
		sb.append(inqTgtDis==null?"null":getInqTgtDis());
		sb.append("\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tinqStaDt: ");
		sb.append(inqStaDt==null?"null":getInqStaDt());
		sb.append("\n");
		sb.append("\tinqEndDt: ");
		sb.append(inqEndDt==null?"null":getInqEndDt());
		sb.append("\n");
		sb.append("\tminAm: ");
		sb.append(minAm==null?"null":getMinAm());
		sb.append("\n");
		sb.append("\tmaxAm: ");
		sb.append(maxAm==null?"null":getMaxAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* sortDis */
		messageLen+= 1; /* inqTgtDis */
		messageLen+= 20; /* acno */
		messageLen+= 8; /* inqStaDt */
		messageLen+= 8; /* inqEndDt */
		messageLen+= 18; /* minAm */
		messageLen+= 18; /* maxAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("sortDis");
		list.add("inqTgtDis");
		list.add("acno");
		list.add("inqStaDt");
		list.add("inqEndDt");
		list.add("minAm");
		list.add("maxAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("sortDis", get("sortDis"));
		map.put("inqTgtDis", get("inqTgtDis"));
		map.put("acno", get("acno"));
		map.put("inqStaDt", get("inqStaDt"));
		map.put("inqEndDt", get("inqEndDt"));
		map.put("minAm", get("minAm"));
		map.put("maxAm", get("maxAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -2024617456:/* sortDis */
			return getSortDis();
		case 1638614905:/* inqTgtDis */
			return getInqTgtDis();
		case 2988387:/* acno */
			return getAcno();
		case 467946052:/* inqStaDt */
			return getInqStaDt();
		case 454840895:/* inqEndDt */
			return getInqEndDt();
		case 103899678:/* minAm */
			return getMinAm();
		case 103670960:/* maxAm */
			return getMaxAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -2024617456:/* sortDis */
			setSortDis((String)value);
			break;
		case 1638614905:/* inqTgtDis */
			setInqTgtDis((String)value);
			break;
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case 467946052:/* inqStaDt */
			setInqStaDt((String)value);
			break;
		case 454840895:/* inqEndDt */
			setInqEndDt((String)value);
			break;
		case 103899678:/* minAm */
			setMinAm((String)value);
			break;
		case 103670960:/* maxAm */
			setMaxAm((String)value);
			break;
		default:
			break;
		}
	}
	
}
