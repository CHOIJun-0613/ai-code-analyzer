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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 */
@XmlType(propOrder={
	"avgCnsmAm", "avgCnsmCnt", "totCnsmAm", "bmmTotCnsmAm", "bf2mnTotCnsmAm", "mPBLifecCtgrCnsmPrtsList_ODT"
}, name="MPBLifecCnsmDgnsPts_ODT")
@XmlRootElement(name="MPBLifecCnsmDgnsPts_ODT")
@BxmCategory(logicalName="생활비.소비.진단.현황.컨트롤러.출력.IO", description="") 
public class MPBLifecCnsmDgnsPts_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 7134399L;
	
	
	
	/**
	 * 평균소비금액
	 */
	@ApiModelProperty(
		name = "avgCnsmAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("avgCnsmAm")
	@BxmOmm_Field(length=18, decimal=3, description="평균소비금액", align="right", fill="")
	private BigDecimal avgCnsmAm= new BigDecimal("0");
	
	
	/**
	 * 평균소비건수
	 */
	@ApiModelProperty(
		name = "avgCnsmCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("avgCnsmCnt")
	@BxmOmm_Field(length=9, decimal=0, description="평균소비건수", align="right", fill="")
	private Integer avgCnsmCnt= 0;
	
	
	/**
	 * 총소비금액
	 */
	@ApiModelProperty(
		name = "totCnsmAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("totCnsmAm")
	@BxmOmm_Field(length=18, decimal=0, description="총소비금액", align="right", fill="")
	private BigDecimal totCnsmAm= new BigDecimal("0");
	
	
	/**
	 * 전월총소비금액
	 */
	@ApiModelProperty(
		name = "bmmTotCnsmAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bmmTotCnsmAm")
	@BxmOmm_Field(length=18, decimal=0, description="전월총소비금액", align="right", fill="")
	private BigDecimal bmmTotCnsmAm= new BigDecimal("0");
	
	
	/**
	 * 전전월총소비금액
	 */
	@ApiModelProperty(
		name = "bf2mnTotCnsmAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("bf2mnTotCnsmAm")
	@BxmOmm_Field(length=18, decimal=0, description="전전월총소비금액", align="right", fill="")
	private BigDecimal bf2mnTotCnsmAm= new BigDecimal("0");
	
	
	/**
	 * 생활비.카테고리.소비.내역.목록.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "mPBLifecCtgrCnsmPrtsList_ODT"
		, dataType = "[Lcom.skbank.sml.fns.mpb.ctr.dto.MPBLifecCtgrCnsmPrtsList_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("mPBLifecCtgrCnsmPrtsList_ODT")
	@BxmOmm_Field(length=0, decimal=0, description="생활비.카테고리.소비.내역.목록.컨트롤러.출력.IO", align="left", fill="", arrayReference="1")
	private List<MPBLifecCtgrCnsmPrtsList_ODT> mPBLifecCtgrCnsmPrtsList_ODT= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_avgCnsmAm= false;
	protected final boolean isSet_avgCnsmAm(){
		return this.isSet_avgCnsmAm;
	}
	private void setIsSet_avgCnsmAm(boolean value){
		this.isSet_avgCnsmAm= value;
	}
	/**
	 * 평균소비금액
	 * BigDecimal - Double value setter
	 *
	 * @Param avgCnsmAm 평균소비금액
	 */
	public void setAvgCnsmAm(double avgCnsmAm) {
		setAvgCnsmAm(BigDecimal.valueOf(avgCnsmAm));
	}
	/**
	 * 평균소비금액
	 * BigDecimal - Long value setter
	 *
	 * @Param avgCnsmAm 평균소비금액
	 */
	public void setAvgCnsmAm(long avgCnsmAm) {
		setAvgCnsmAm(BigDecimal.valueOf(avgCnsmAm));
	}
	/**
	 * 평균소비금액
	 * BigDecimal - String value setter
	 *
	 * @Param avgCnsmAm 평균소비금액
	 */
	public void setAvgCnsmAm(String avgCnsmAm) {
		setAvgCnsmAm(new BigDecimal(avgCnsmAm));
	}
	/**
	 * 평균소비금액
	 */
	@XmlTransient
	public BigDecimal getAvgCnsmAm(){
		return this.avgCnsmAm;
	}
	
	/**
	 * 평균소비금액
	 * 
	 * @param avgCnsmAm 평균소비금액
	 */
	@JsonSetter("avgCnsmAm")
	public void setAvgCnsmAm(BigDecimal avgCnsmAm){
		this.avgCnsmAm= avgCnsmAm;
		this.setIsSet_avgCnsmAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_avgCnsmCnt= false;
	protected final boolean isSet_avgCnsmCnt(){
		return this.isSet_avgCnsmCnt;
	}
	private void setIsSet_avgCnsmCnt(boolean value){
		this.isSet_avgCnsmCnt= value;
	}
	/**
	 * 평균소비건수
	 */
	@XmlTransient
	public Integer getAvgCnsmCnt(){
		return this.avgCnsmCnt;
	}
	
	/**
	 * 평균소비건수
	 * 
	 * @param avgCnsmCnt 평균소비건수
	 */
	public void setAvgCnsmCnt(Integer avgCnsmCnt){
		this.avgCnsmCnt= avgCnsmCnt;
		this.setIsSet_avgCnsmCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_totCnsmAm= false;
	protected final boolean isSet_totCnsmAm(){
		return this.isSet_totCnsmAm;
	}
	private void setIsSet_totCnsmAm(boolean value){
		this.isSet_totCnsmAm= value;
	}
	/**
	 * 총소비금액
	 * BigDecimal - Double value setter
	 *
	 * @Param totCnsmAm 총소비금액
	 */
	public void setTotCnsmAm(double totCnsmAm) {
		setTotCnsmAm(BigDecimal.valueOf(totCnsmAm));
	}
	/**
	 * 총소비금액
	 * BigDecimal - Long value setter
	 *
	 * @Param totCnsmAm 총소비금액
	 */
	public void setTotCnsmAm(long totCnsmAm) {
		setTotCnsmAm(BigDecimal.valueOf(totCnsmAm));
	}
	/**
	 * 총소비금액
	 * BigDecimal - String value setter
	 *
	 * @Param totCnsmAm 총소비금액
	 */
	public void setTotCnsmAm(String totCnsmAm) {
		setTotCnsmAm(new BigDecimal(totCnsmAm));
	}
	/**
	 * 총소비금액
	 */
	@XmlTransient
	public BigDecimal getTotCnsmAm(){
		return this.totCnsmAm;
	}
	
	/**
	 * 총소비금액
	 * 
	 * @param totCnsmAm 총소비금액
	 */
	@JsonSetter("totCnsmAm")
	public void setTotCnsmAm(BigDecimal totCnsmAm){
		this.totCnsmAm= totCnsmAm;
		this.setIsSet_totCnsmAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bmmTotCnsmAm= false;
	protected final boolean isSet_bmmTotCnsmAm(){
		return this.isSet_bmmTotCnsmAm;
	}
	private void setIsSet_bmmTotCnsmAm(boolean value){
		this.isSet_bmmTotCnsmAm= value;
	}
	/**
	 * 전월총소비금액
	 * BigDecimal - Double value setter
	 *
	 * @Param bmmTotCnsmAm 전월총소비금액
	 */
	public void setBmmTotCnsmAm(double bmmTotCnsmAm) {
		setBmmTotCnsmAm(BigDecimal.valueOf(bmmTotCnsmAm));
	}
	/**
	 * 전월총소비금액
	 * BigDecimal - Long value setter
	 *
	 * @Param bmmTotCnsmAm 전월총소비금액
	 */
	public void setBmmTotCnsmAm(long bmmTotCnsmAm) {
		setBmmTotCnsmAm(BigDecimal.valueOf(bmmTotCnsmAm));
	}
	/**
	 * 전월총소비금액
	 * BigDecimal - String value setter
	 *
	 * @Param bmmTotCnsmAm 전월총소비금액
	 */
	public void setBmmTotCnsmAm(String bmmTotCnsmAm) {
		setBmmTotCnsmAm(new BigDecimal(bmmTotCnsmAm));
	}
	/**
	 * 전월총소비금액
	 */
	@XmlTransient
	public BigDecimal getBmmTotCnsmAm(){
		return this.bmmTotCnsmAm;
	}
	
	/**
	 * 전월총소비금액
	 * 
	 * @param bmmTotCnsmAm 전월총소비금액
	 */
	@JsonSetter("bmmTotCnsmAm")
	public void setBmmTotCnsmAm(BigDecimal bmmTotCnsmAm){
		this.bmmTotCnsmAm= bmmTotCnsmAm;
		this.setIsSet_bmmTotCnsmAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bf2mnTotCnsmAm= false;
	protected final boolean isSet_bf2mnTotCnsmAm(){
		return this.isSet_bf2mnTotCnsmAm;
	}
	private void setIsSet_bf2mnTotCnsmAm(boolean value){
		this.isSet_bf2mnTotCnsmAm= value;
	}
	/**
	 * 전전월총소비금액
	 * BigDecimal - Double value setter
	 *
	 * @Param bf2mnTotCnsmAm 전전월총소비금액
	 */
	public void setBf2mnTotCnsmAm(double bf2mnTotCnsmAm) {
		setBf2mnTotCnsmAm(BigDecimal.valueOf(bf2mnTotCnsmAm));
	}
	/**
	 * 전전월총소비금액
	 * BigDecimal - Long value setter
	 *
	 * @Param bf2mnTotCnsmAm 전전월총소비금액
	 */
	public void setBf2mnTotCnsmAm(long bf2mnTotCnsmAm) {
		setBf2mnTotCnsmAm(BigDecimal.valueOf(bf2mnTotCnsmAm));
	}
	/**
	 * 전전월총소비금액
	 * BigDecimal - String value setter
	 *
	 * @Param bf2mnTotCnsmAm 전전월총소비금액
	 */
	public void setBf2mnTotCnsmAm(String bf2mnTotCnsmAm) {
		setBf2mnTotCnsmAm(new BigDecimal(bf2mnTotCnsmAm));
	}
	/**
	 * 전전월총소비금액
	 */
	@XmlTransient
	public BigDecimal getBf2mnTotCnsmAm(){
		return this.bf2mnTotCnsmAm;
	}
	
	/**
	 * 전전월총소비금액
	 * 
	 * @param bf2mnTotCnsmAm 전전월총소비금액
	 */
	@JsonSetter("bf2mnTotCnsmAm")
	public void setBf2mnTotCnsmAm(BigDecimal bf2mnTotCnsmAm){
		this.bf2mnTotCnsmAm= bf2mnTotCnsmAm;
		this.setIsSet_bf2mnTotCnsmAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mPBLifecCtgrCnsmPrtsList_ODT= false;
	protected final boolean isSet_mPBLifecCtgrCnsmPrtsList_ODT(){
		return this.isSet_mPBLifecCtgrCnsmPrtsList_ODT;
	}
	private void setIsSet_mPBLifecCtgrCnsmPrtsList_ODT(boolean value){
		this.isSet_mPBLifecCtgrCnsmPrtsList_ODT= value;
	}
	/**
	 * 생활비.카테고리.소비.내역.목록.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<MPBLifecCtgrCnsmPrtsList_ODT> getmPBLifecCtgrCnsmPrtsList_ODT(){
		return mPBLifecCtgrCnsmPrtsList_ODT;
	}
	
	/**
	 * 생활비.카테고리.소비.내역.목록.컨트롤러.출력.IO
	 * 
	 * @param mPBLifecCtgrCnsmPrtsList_ODT 생활비.카테고리.소비.내역.목록.컨트롤러.출력.IO
	 */
	@JsonSetter("mPBLifecCtgrCnsmPrtsList_ODT")
	public void setmPBLifecCtgrCnsmPrtsList_ODT(List<MPBLifecCtgrCnsmPrtsList_ODT> mPBLifecCtgrCnsmPrtsList_ODT){
		this.mPBLifecCtgrCnsmPrtsList_ODT= mPBLifecCtgrCnsmPrtsList_ODT;
		this.setIsSet_mPBLifecCtgrCnsmPrtsList_ODT(true);
	}
	
	public void setmPBLifecCtgrCnsmPrtsList_ODT(MPBLifecCtgrCnsmPrtsList_ODT... items){
		List<MPBLifecCtgrCnsmPrtsList_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBLifecCtgrCnsmPrtsList_ODT item: items ){
				_items.add(item);
			}
		}
		this.setmPBLifecCtgrCnsmPrtsList_ODT(_items);
	}
				
	@Override
	public MPBLifecCnsmDgnsPts_ODT clone(){
		try{
			MPBLifecCnsmDgnsPts_ODT object= (MPBLifecCnsmDgnsPts_ODT)super.clone();
			if ( this.mPBLifecCtgrCnsmPrtsList_ODT== null ) object.mPBLifecCtgrCnsmPrtsList_ODT= null;
			else{
				List<MPBLifecCtgrCnsmPrtsList_ODT> clonedList= new ArrayList<>(this.mPBLifecCtgrCnsmPrtsList_ODT.size());
				for( MPBLifecCtgrCnsmPrtsList_ODT item : mPBLifecCtgrCnsmPrtsList_ODT ){
					clonedList.add((MPBLifecCtgrCnsmPrtsList_ODT)item.clone());
				}
				object.mPBLifecCtgrCnsmPrtsList_ODT= clonedList;
			}
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
		
		result= prime * result + ((this.avgCnsmAm==null)?0:this.avgCnsmAm.hashCode());
		result= prime * result + ((this.avgCnsmCnt==null)?0:this.avgCnsmCnt.hashCode());
		result= prime * result + ((this.totCnsmAm==null)?0:this.totCnsmAm.hashCode());
		result= prime * result + ((this.bmmTotCnsmAm==null)?0:this.bmmTotCnsmAm.hashCode());
		result= prime * result + ((this.bf2mnTotCnsmAm==null)?0:this.bf2mnTotCnsmAm.hashCode());
		result= prime * result + ((this.mPBLifecCtgrCnsmPrtsList_ODT==null)?0:this.mPBLifecCtgrCnsmPrtsList_ODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBLifecCnsmDgnsPts_ODT other= (MPBLifecCnsmDgnsPts_ODT)obj;
		{
			Object _avgCnsmAm= getAvgCnsmAm();
			Object __avgCnsmAm= other.getAvgCnsmAm();
			if ( _avgCnsmAm== null ) { if ( __avgCnsmAm!= null ) return false; }
			else if ( !_avgCnsmAm.equals(__avgCnsmAm) ) return false;
		}
		{
			Object _avgCnsmCnt= getAvgCnsmCnt();
			Object __avgCnsmCnt= other.getAvgCnsmCnt();
			if ( _avgCnsmCnt== null ) { if ( __avgCnsmCnt!= null ) return false; }
			else if ( !_avgCnsmCnt.equals(__avgCnsmCnt) ) return false;
		}
		{
			Object _totCnsmAm= getTotCnsmAm();
			Object __totCnsmAm= other.getTotCnsmAm();
			if ( _totCnsmAm== null ) { if ( __totCnsmAm!= null ) return false; }
			else if ( !_totCnsmAm.equals(__totCnsmAm) ) return false;
		}
		{
			Object _bmmTotCnsmAm= getBmmTotCnsmAm();
			Object __bmmTotCnsmAm= other.getBmmTotCnsmAm();
			if ( _bmmTotCnsmAm== null ) { if ( __bmmTotCnsmAm!= null ) return false; }
			else if ( !_bmmTotCnsmAm.equals(__bmmTotCnsmAm) ) return false;
		}
		{
			Object _bf2mnTotCnsmAm= getBf2mnTotCnsmAm();
			Object __bf2mnTotCnsmAm= other.getBf2mnTotCnsmAm();
			if ( _bf2mnTotCnsmAm== null ) { if ( __bf2mnTotCnsmAm!= null ) return false; }
			else if ( !_bf2mnTotCnsmAm.equals(__bf2mnTotCnsmAm) ) return false;
		}
		{
			Object _mPBLifecCtgrCnsmPrtsList_ODT= getmPBLifecCtgrCnsmPrtsList_ODT();
			Object __mPBLifecCtgrCnsmPrtsList_ODT= other.getmPBLifecCtgrCnsmPrtsList_ODT();
			if ( _mPBLifecCtgrCnsmPrtsList_ODT== null ) { if ( __mPBLifecCtgrCnsmPrtsList_ODT!= null ) return false; }
			else if ( !_mPBLifecCtgrCnsmPrtsList_ODT.equals(__mPBLifecCtgrCnsmPrtsList_ODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBLifecCnsmDgnsPts_ODT.class.getName()).append(":\n");
		sb.append("\tavgCnsmAm: ");
		sb.append(avgCnsmAm==null?"null":getAvgCnsmAm());
		sb.append("\n");
		sb.append("\tavgCnsmCnt: ");
		sb.append(avgCnsmCnt==null?"null":getAvgCnsmCnt());
		sb.append("\n");
		sb.append("\ttotCnsmAm: ");
		sb.append(totCnsmAm==null?"null":getTotCnsmAm());
		sb.append("\n");
		sb.append("\tbmmTotCnsmAm: ");
		sb.append(bmmTotCnsmAm==null?"null":getBmmTotCnsmAm());
		sb.append("\n");
		sb.append("\tbf2mnTotCnsmAm: ");
		sb.append(bf2mnTotCnsmAm==null?"null":getBf2mnTotCnsmAm());
		sb.append("\n");
		sb.append("\tmPBLifecCtgrCnsmPrtsList_ODT: ");
		if ( mPBLifecCtgrCnsmPrtsList_ODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(mPBLifecCtgrCnsmPrtsList_ODT.size());
			sb.append("(items)\n");
	
			int max= (10<mPBLifecCtgrCnsmPrtsList_ODT.size())?10:mPBLifecCtgrCnsmPrtsList_ODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tmPBLifecCtgrCnsmPrtsList_ODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(mPBLifecCtgrCnsmPrtsList_ODT.get(i));
				sb.append("\n");
			}
	
			if ( max < mPBLifecCtgrCnsmPrtsList_ODT.size() ){
				sb.append("\tmPBLifecCtgrCnsmPrtsList_ODT[.] : ").append("more ").append((mPBLifecCtgrCnsmPrtsList_ODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 18; /* avgCnsmAm */
		messageLen+= 9; /* avgCnsmCnt */
		messageLen+= 18; /* totCnsmAm */
		messageLen+= 18; /* bmmTotCnsmAm */
		messageLen+= 18; /* bf2mnTotCnsmAm */
		{/*mPBLifecCtgrCnsmPrtsList_ODT*/
			int size=1;
			int count= mPBLifecCtgrCnsmPrtsList_ODT == null ? 0 : mPBLifecCtgrCnsmPrtsList_ODT.size();
			int min= size > count?count:size;
			MPBLifecCtgrCnsmPrtsList_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBLifecCtgrCnsmPrtsList_ODT element= mPBLifecCtgrCnsmPrtsList_ODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.ctr.dto.MPBLifecCtgrCnsmPrtsList_ODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("avgCnsmAm");
		list.add("avgCnsmCnt");
		list.add("totCnsmAm");
		list.add("bmmTotCnsmAm");
		list.add("bf2mnTotCnsmAm");
		list.add("mPBLifecCtgrCnsmPrtsList_ODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("avgCnsmAm", get("avgCnsmAm"));
		map.put("avgCnsmCnt", get("avgCnsmCnt"));
		map.put("totCnsmAm", get("totCnsmAm"));
		map.put("bmmTotCnsmAm", get("bmmTotCnsmAm"));
		map.put("bf2mnTotCnsmAm", get("bf2mnTotCnsmAm"));
		map.put("mPBLifecCtgrCnsmPrtsList_ODT", get("mPBLifecCtgrCnsmPrtsList_ODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -789362557:/* avgCnsmAm */
			return getAvgCnsmAm();
		case 1299566578:/* avgCnsmCnt */
			return getAvgCnsmCnt();
		case -1433383478:/* totCnsmAm */
			return getTotCnsmAm();
		case 2091450984:/* bmmTotCnsmAm */
			return getBmmTotCnsmAm();
		case 2126460923:/* bf2mnTotCnsmAm */
			return getBf2mnTotCnsmAm();
		case -616656856:/* mPBLifecCtgrCnsmPrtsList_ODT */
			return getmPBLifecCtgrCnsmPrtsList_ODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -789362557:/* avgCnsmAm */
			if ( value instanceof String ){
				setAvgCnsmAm((String)value);
			}
			else if ( value instanceof Double ){
				setAvgCnsmAm((Double)value);
			}
			else if ( value instanceof Long ){
				setAvgCnsmAm((Long)value);
			}
			else{
				setAvgCnsmAm((BigDecimal)value);
			}
			break;
		case 1299566578:/* avgCnsmCnt */
			setAvgCnsmCnt((Integer)value);
			break;
		case -1433383478:/* totCnsmAm */
			if ( value instanceof String ){
				setTotCnsmAm((String)value);
			}
			else if ( value instanceof Double ){
				setTotCnsmAm((Double)value);
			}
			else if ( value instanceof Long ){
				setTotCnsmAm((Long)value);
			}
			else{
				setTotCnsmAm((BigDecimal)value);
			}
			break;
		case 2091450984:/* bmmTotCnsmAm */
			if ( value instanceof String ){
				setBmmTotCnsmAm((String)value);
			}
			else if ( value instanceof Double ){
				setBmmTotCnsmAm((Double)value);
			}
			else if ( value instanceof Long ){
				setBmmTotCnsmAm((Long)value);
			}
			else{
				setBmmTotCnsmAm((BigDecimal)value);
			}
			break;
		case 2126460923:/* bf2mnTotCnsmAm */
			if ( value instanceof String ){
				setBf2mnTotCnsmAm((String)value);
			}
			else if ( value instanceof Double ){
				setBf2mnTotCnsmAm((Double)value);
			}
			else if ( value instanceof Long ){
				setBf2mnTotCnsmAm((Long)value);
			}
			else{
				setBf2mnTotCnsmAm((BigDecimal)value);
			}
			break;
		case -616656856:/* mPBLifecCtgrCnsmPrtsList_ODT */
			setmPBLifecCtgrCnsmPrtsList_ODT((List<MPBLifecCtgrCnsmPrtsList_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
