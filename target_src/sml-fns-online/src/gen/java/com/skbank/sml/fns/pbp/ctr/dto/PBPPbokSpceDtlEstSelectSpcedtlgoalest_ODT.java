/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.pbp.ctr.dto;

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
	"savGoalEstYn", "cnsmGoalEstYn", "savGoalStaDt", "savGoalEndDt", "savGoalAm", "savAm", "cnsmAmBscd", "cnsmGoalAm", "pBPSpceDtlGoalAmList_ODT"
}, name="PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT")
@XmlRootElement(name="PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT")
@BxmCategory(logicalName="공간.상세.목표.설정.조회.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1032195563L;
	
	
	
	/**
	 * 저축목표설정여부
	 */
	@ApiModelProperty(
		name = "savGoalEstYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalEstYn")
	@BxmOmm_Field(length=1, decimal=0, description="저축목표설정여부", align="left", fill="")
	private String savGoalEstYn= "";
	
	
	/**
	 * 소비목표설정여부
	 */
	@ApiModelProperty(
		name = "cnsmGoalEstYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmGoalEstYn")
	@BxmOmm_Field(length=1, decimal=0, description="소비목표설정여부", align="left", fill="")
	private String cnsmGoalEstYn= "";
	
	
	/**
	 * 저축목표시작일자
	 */
	@ApiModelProperty(
		name = "savGoalStaDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalStaDt")
	@BxmOmm_Field(length=8, decimal=0, description="저축목표시작일자", align="left", fill="")
	private String savGoalStaDt= "";
	
	
	/**
	 * 저축목표종료일자
	 */
	@ApiModelProperty(
		name = "savGoalEndDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("savGoalEndDt")
	@BxmOmm_Field(length=8, decimal=0, description="저축목표종료일자", align="left", fill="")
	private String savGoalEndDt= "";
	
	
	/**
	 * 저축목표금액
	 */
	@ApiModelProperty(
		name = "savGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("savGoalAm")
	@BxmOmm_Field(length=18, decimal=3, description="저축목표금액", align="right", fill="")
	private BigDecimal savGoalAm= new BigDecimal("0");
	
	
	/**
	 * 저축금액
	 */
	@ApiModelProperty(
		name = "savAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("savAm")
	@BxmOmm_Field(length=18, decimal=3, description="저축금액", align="right", fill="")
	private BigDecimal savAm= new BigDecimal("0");
	
	
	/**
	 * 소비금액주기코드
	 */
	@ApiModelProperty(
		name = "cnsmAmBscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cnsmAmBscd")
	@BxmOmm_Field(length=1, decimal=0, description="소비금액주기코드", align="left", fill="")
	private String cnsmAmBscd= "";
	
	
	/**
	 * 소비목표금액
	 */
	@ApiModelProperty(
		name = "cnsmGoalAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("cnsmGoalAm")
	@BxmOmm_Field(length=18, decimal=3, description="소비목표금액", align="right", fill="")
	private BigDecimal cnsmGoalAm= new BigDecimal("0");
	
	
	/**
	 * 공간.상세.목표.금액.목록.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "pBPSpceDtlGoalAmList_ODT"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPSpceDtlGoalAmList_ODT")
	@BxmOmm_Field(length=0, decimal=0, description="공간.상세.목표.금액.목록.컨트롤러.출력.IO", align="left", fill="", arrayReference="1")
	private List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> pBPSpceDtlGoalAmList_ODT= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalEstYn= false;
	protected final boolean isSet_savGoalEstYn(){
		return this.isSet_savGoalEstYn;
	}
	private void setIsSet_savGoalEstYn(boolean value){
		this.isSet_savGoalEstYn= value;
	}
	/**
	 * 저축목표설정여부
	 */
	@XmlTransient
	public String getSavGoalEstYn(){
		return this.savGoalEstYn;
	}
	
	/**
	 * 저축목표설정여부
	 * 
	 * @param savGoalEstYn 저축목표설정여부
	 */
	public void setSavGoalEstYn(String savGoalEstYn){
		this.savGoalEstYn= savGoalEstYn;
		this.setIsSet_savGoalEstYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmGoalEstYn= false;
	protected final boolean isSet_cnsmGoalEstYn(){
		return this.isSet_cnsmGoalEstYn;
	}
	private void setIsSet_cnsmGoalEstYn(boolean value){
		this.isSet_cnsmGoalEstYn= value;
	}
	/**
	 * 소비목표설정여부
	 */
	@XmlTransient
	public String getCnsmGoalEstYn(){
		return this.cnsmGoalEstYn;
	}
	
	/**
	 * 소비목표설정여부
	 * 
	 * @param cnsmGoalEstYn 소비목표설정여부
	 */
	public void setCnsmGoalEstYn(String cnsmGoalEstYn){
		this.cnsmGoalEstYn= cnsmGoalEstYn;
		this.setIsSet_cnsmGoalEstYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalStaDt= false;
	protected final boolean isSet_savGoalStaDt(){
		return this.isSet_savGoalStaDt;
	}
	private void setIsSet_savGoalStaDt(boolean value){
		this.isSet_savGoalStaDt= value;
	}
	/**
	 * 저축목표시작일자
	 */
	@XmlTransient
	public String getSavGoalStaDt(){
		return this.savGoalStaDt;
	}
	
	/**
	 * 저축목표시작일자
	 * 
	 * @param savGoalStaDt 저축목표시작일자
	 */
	public void setSavGoalStaDt(String savGoalStaDt){
		this.savGoalStaDt= savGoalStaDt;
		this.setIsSet_savGoalStaDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalEndDt= false;
	protected final boolean isSet_savGoalEndDt(){
		return this.isSet_savGoalEndDt;
	}
	private void setIsSet_savGoalEndDt(boolean value){
		this.isSet_savGoalEndDt= value;
	}
	/**
	 * 저축목표종료일자
	 */
	@XmlTransient
	public String getSavGoalEndDt(){
		return this.savGoalEndDt;
	}
	
	/**
	 * 저축목표종료일자
	 * 
	 * @param savGoalEndDt 저축목표종료일자
	 */
	public void setSavGoalEndDt(String savGoalEndDt){
		this.savGoalEndDt= savGoalEndDt;
		this.setIsSet_savGoalEndDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savGoalAm= false;
	protected final boolean isSet_savGoalAm(){
		return this.isSet_savGoalAm;
	}
	private void setIsSet_savGoalAm(boolean value){
		this.isSet_savGoalAm= value;
	}
	/**
	 * 저축목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(double savGoalAm) {
		setSavGoalAm(BigDecimal.valueOf(savGoalAm));
	}
	/**
	 * 저축목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(long savGoalAm) {
		setSavGoalAm(BigDecimal.valueOf(savGoalAm));
	}
	/**
	 * 저축목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param savGoalAm 저축목표금액
	 */
	public void setSavGoalAm(String savGoalAm) {
		setSavGoalAm(new BigDecimal(savGoalAm));
	}
	/**
	 * 저축목표금액
	 */
	@XmlTransient
	public BigDecimal getSavGoalAm(){
		return this.savGoalAm;
	}
	
	/**
	 * 저축목표금액
	 * 
	 * @param savGoalAm 저축목표금액
	 */
	@JsonSetter("savGoalAm")
	public void setSavGoalAm(BigDecimal savGoalAm){
		this.savGoalAm= savGoalAm;
		this.setIsSet_savGoalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_savAm= false;
	protected final boolean isSet_savAm(){
		return this.isSet_savAm;
	}
	private void setIsSet_savAm(boolean value){
		this.isSet_savAm= value;
	}
	/**
	 * 저축금액
	 * BigDecimal - Double value setter
	 *
	 * @Param savAm 저축금액
	 */
	public void setSavAm(double savAm) {
		setSavAm(BigDecimal.valueOf(savAm));
	}
	/**
	 * 저축금액
	 * BigDecimal - Long value setter
	 *
	 * @Param savAm 저축금액
	 */
	public void setSavAm(long savAm) {
		setSavAm(BigDecimal.valueOf(savAm));
	}
	/**
	 * 저축금액
	 * BigDecimal - String value setter
	 *
	 * @Param savAm 저축금액
	 */
	public void setSavAm(String savAm) {
		setSavAm(new BigDecimal(savAm));
	}
	/**
	 * 저축금액
	 */
	@XmlTransient
	public BigDecimal getSavAm(){
		return this.savAm;
	}
	
	/**
	 * 저축금액
	 * 
	 * @param savAm 저축금액
	 */
	@JsonSetter("savAm")
	public void setSavAm(BigDecimal savAm){
		this.savAm= savAm;
		this.setIsSet_savAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmAmBscd= false;
	protected final boolean isSet_cnsmAmBscd(){
		return this.isSet_cnsmAmBscd;
	}
	private void setIsSet_cnsmAmBscd(boolean value){
		this.isSet_cnsmAmBscd= value;
	}
	/**
	 * 소비금액주기코드
	 */
	@XmlTransient
	public String getCnsmAmBscd(){
		return this.cnsmAmBscd;
	}
	
	/**
	 * 소비금액주기코드
	 * 
	 * @param cnsmAmBscd 소비금액주기코드
	 */
	public void setCnsmAmBscd(String cnsmAmBscd){
		this.cnsmAmBscd= cnsmAmBscd;
		this.setIsSet_cnsmAmBscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnsmGoalAm= false;
	protected final boolean isSet_cnsmGoalAm(){
		return this.isSet_cnsmGoalAm;
	}
	private void setIsSet_cnsmGoalAm(boolean value){
		this.isSet_cnsmGoalAm= value;
	}
	/**
	 * 소비목표금액
	 * BigDecimal - Double value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(double cnsmGoalAm) {
		setCnsmGoalAm(BigDecimal.valueOf(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 * BigDecimal - Long value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(long cnsmGoalAm) {
		setCnsmGoalAm(BigDecimal.valueOf(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 * BigDecimal - String value setter
	 *
	 * @Param cnsmGoalAm 소비목표금액
	 */
	public void setCnsmGoalAm(String cnsmGoalAm) {
		setCnsmGoalAm(new BigDecimal(cnsmGoalAm));
	}
	/**
	 * 소비목표금액
	 */
	@XmlTransient
	public BigDecimal getCnsmGoalAm(){
		return this.cnsmGoalAm;
	}
	
	/**
	 * 소비목표금액
	 * 
	 * @param cnsmGoalAm 소비목표금액
	 */
	@JsonSetter("cnsmGoalAm")
	public void setCnsmGoalAm(BigDecimal cnsmGoalAm){
		this.cnsmGoalAm= cnsmGoalAm;
		this.setIsSet_cnsmGoalAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pBPSpceDtlGoalAmList_ODT= false;
	protected final boolean isSet_pBPSpceDtlGoalAmList_ODT(){
		return this.isSet_pBPSpceDtlGoalAmList_ODT;
	}
	private void setIsSet_pBPSpceDtlGoalAmList_ODT(boolean value){
		this.isSet_pBPSpceDtlGoalAmList_ODT= value;
	}
	/**
	 * 공간.상세.목표.금액.목록.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> getpBPSpceDtlGoalAmList_ODT(){
		return pBPSpceDtlGoalAmList_ODT;
	}
	
	/**
	 * 공간.상세.목표.금액.목록.컨트롤러.출력.IO
	 * 
	 * @param pBPSpceDtlGoalAmList_ODT 공간.상세.목표.금액.목록.컨트롤러.출력.IO
	 */
	@JsonSetter("pBPSpceDtlGoalAmList_ODT")
	public void setpBPSpceDtlGoalAmList_ODT(List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> pBPSpceDtlGoalAmList_ODT){
		this.pBPSpceDtlGoalAmList_ODT= pBPSpceDtlGoalAmList_ODT;
		this.setIsSet_pBPSpceDtlGoalAmList_ODT(true);
	}
	
	public void setpBPSpceDtlGoalAmList_ODT(PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT... items){
		List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT item: items ){
				_items.add(item);
			}
		}
		this.setpBPSpceDtlGoalAmList_ODT(_items);
	}
				
	@Override
	public PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT clone(){
		try{
			PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT object= (PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT)super.clone();
			if ( this.pBPSpceDtlGoalAmList_ODT== null ) object.pBPSpceDtlGoalAmList_ODT= null;
			else{
				List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> clonedList= new ArrayList<>(this.pBPSpceDtlGoalAmList_ODT.size());
				for( PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT item : pBPSpceDtlGoalAmList_ODT ){
					clonedList.add((PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT)item.clone());
				}
				object.pBPSpceDtlGoalAmList_ODT= clonedList;
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
		
		result= prime * result + ((this.savGoalEstYn==null)?0:this.savGoalEstYn.hashCode());
		result= prime * result + ((this.cnsmGoalEstYn==null)?0:this.cnsmGoalEstYn.hashCode());
		result= prime * result + ((this.savGoalStaDt==null)?0:this.savGoalStaDt.hashCode());
		result= prime * result + ((this.savGoalEndDt==null)?0:this.savGoalEndDt.hashCode());
		result= prime * result + ((this.savGoalAm==null)?0:this.savGoalAm.hashCode());
		result= prime * result + ((this.savAm==null)?0:this.savAm.hashCode());
		result= prime * result + ((this.cnsmAmBscd==null)?0:this.cnsmAmBscd.hashCode());
		result= prime * result + ((this.cnsmGoalAm==null)?0:this.cnsmGoalAm.hashCode());
		result= prime * result + ((this.pBPSpceDtlGoalAmList_ODT==null)?0:this.pBPSpceDtlGoalAmList_ODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT other= (PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT)obj;
		{
			Object _savGoalEstYn= getSavGoalEstYn();
			Object __savGoalEstYn= other.getSavGoalEstYn();
			if ( _savGoalEstYn== null ) { if ( __savGoalEstYn!= null ) return false; }
			else if ( !_savGoalEstYn.equals(__savGoalEstYn) ) return false;
		}
		{
			Object _cnsmGoalEstYn= getCnsmGoalEstYn();
			Object __cnsmGoalEstYn= other.getCnsmGoalEstYn();
			if ( _cnsmGoalEstYn== null ) { if ( __cnsmGoalEstYn!= null ) return false; }
			else if ( !_cnsmGoalEstYn.equals(__cnsmGoalEstYn) ) return false;
		}
		{
			Object _savGoalStaDt= getSavGoalStaDt();
			Object __savGoalStaDt= other.getSavGoalStaDt();
			if ( _savGoalStaDt== null ) { if ( __savGoalStaDt!= null ) return false; }
			else if ( !_savGoalStaDt.equals(__savGoalStaDt) ) return false;
		}
		{
			Object _savGoalEndDt= getSavGoalEndDt();
			Object __savGoalEndDt= other.getSavGoalEndDt();
			if ( _savGoalEndDt== null ) { if ( __savGoalEndDt!= null ) return false; }
			else if ( !_savGoalEndDt.equals(__savGoalEndDt) ) return false;
		}
		{
			Object _savGoalAm= getSavGoalAm();
			Object __savGoalAm= other.getSavGoalAm();
			if ( _savGoalAm== null ) { if ( __savGoalAm!= null ) return false; }
			else if ( !_savGoalAm.equals(__savGoalAm) ) return false;
		}
		{
			Object _savAm= getSavAm();
			Object __savAm= other.getSavAm();
			if ( _savAm== null ) { if ( __savAm!= null ) return false; }
			else if ( !_savAm.equals(__savAm) ) return false;
		}
		{
			Object _cnsmAmBscd= getCnsmAmBscd();
			Object __cnsmAmBscd= other.getCnsmAmBscd();
			if ( _cnsmAmBscd== null ) { if ( __cnsmAmBscd!= null ) return false; }
			else if ( !_cnsmAmBscd.equals(__cnsmAmBscd) ) return false;
		}
		{
			Object _cnsmGoalAm= getCnsmGoalAm();
			Object __cnsmGoalAm= other.getCnsmGoalAm();
			if ( _cnsmGoalAm== null ) { if ( __cnsmGoalAm!= null ) return false; }
			else if ( !_cnsmGoalAm.equals(__cnsmGoalAm) ) return false;
		}
		{
			Object _pBPSpceDtlGoalAmList_ODT= getpBPSpceDtlGoalAmList_ODT();
			Object __pBPSpceDtlGoalAmList_ODT= other.getpBPSpceDtlGoalAmList_ODT();
			if ( _pBPSpceDtlGoalAmList_ODT== null ) { if ( __pBPSpceDtlGoalAmList_ODT!= null ) return false; }
			else if ( !_pBPSpceDtlGoalAmList_ODT.equals(__pBPSpceDtlGoalAmList_ODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstSelectSpcedtlgoalest_ODT.class.getName()).append(":\n");
		sb.append("\tsavGoalEstYn: ");
		sb.append(savGoalEstYn==null?"null":getSavGoalEstYn());
		sb.append("\n");
		sb.append("\tcnsmGoalEstYn: ");
		sb.append(cnsmGoalEstYn==null?"null":getCnsmGoalEstYn());
		sb.append("\n");
		sb.append("\tsavGoalStaDt: ");
		sb.append(savGoalStaDt==null?"null":getSavGoalStaDt());
		sb.append("\n");
		sb.append("\tsavGoalEndDt: ");
		sb.append(savGoalEndDt==null?"null":getSavGoalEndDt());
		sb.append("\n");
		sb.append("\tsavGoalAm: ");
		sb.append(savGoalAm==null?"null":getSavGoalAm());
		sb.append("\n");
		sb.append("\tsavAm: ");
		sb.append(savAm==null?"null":getSavAm());
		sb.append("\n");
		sb.append("\tcnsmAmBscd: ");
		sb.append(cnsmAmBscd==null?"null":getCnsmAmBscd());
		sb.append("\n");
		sb.append("\tcnsmGoalAm: ");
		sb.append(cnsmGoalAm==null?"null":getCnsmGoalAm());
		sb.append("\n");
		sb.append("\tpBPSpceDtlGoalAmList_ODT: ");
		if ( pBPSpceDtlGoalAmList_ODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPSpceDtlGoalAmList_ODT.size());
			sb.append("(items)\n");
	
			int max= (10<pBPSpceDtlGoalAmList_ODT.size())?10:pBPSpceDtlGoalAmList_ODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPSpceDtlGoalAmList_ODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPSpceDtlGoalAmList_ODT.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPSpceDtlGoalAmList_ODT.size() ){
				sb.append("\tpBPSpceDtlGoalAmList_ODT[.] : ").append("more ").append((pBPSpceDtlGoalAmList_ODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* savGoalEstYn */
		messageLen+= 1; /* cnsmGoalEstYn */
		messageLen+= 8; /* savGoalStaDt */
		messageLen+= 8; /* savGoalEndDt */
		messageLen+= 18; /* savGoalAm */
		messageLen+= 18; /* savAm */
		messageLen+= 1; /* cnsmAmBscd */
		messageLen+= 18; /* cnsmGoalAm */
		{/*pBPSpceDtlGoalAmList_ODT*/
			int size=1;
			int count= pBPSpceDtlGoalAmList_ODT == null ? 0 : pBPSpceDtlGoalAmList_ODT.size();
			int min= size > count?count:size;
			PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT element= pBPSpceDtlGoalAmList_ODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT();
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
	
		list.add("savGoalEstYn");
		list.add("cnsmGoalEstYn");
		list.add("savGoalStaDt");
		list.add("savGoalEndDt");
		list.add("savGoalAm");
		list.add("savAm");
		list.add("cnsmAmBscd");
		list.add("cnsmGoalAm");
		list.add("pBPSpceDtlGoalAmList_ODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("savGoalEstYn", get("savGoalEstYn"));
		map.put("cnsmGoalEstYn", get("cnsmGoalEstYn"));
		map.put("savGoalStaDt", get("savGoalStaDt"));
		map.put("savGoalEndDt", get("savGoalEndDt"));
		map.put("savGoalAm", get("savGoalAm"));
		map.put("savAm", get("savAm"));
		map.put("cnsmAmBscd", get("cnsmAmBscd"));
		map.put("cnsmGoalAm", get("cnsmGoalAm"));
		map.put("pBPSpceDtlGoalAmList_ODT", get("pBPSpceDtlGoalAmList_ODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1786157280:/* savGoalEstYn */
			return getSavGoalEstYn();
		case 1646885219:/* cnsmGoalEstYn */
			return getCnsmGoalEstYn();
		case 1799097461:/* savGoalStaDt */
			return getSavGoalStaDt();
		case 1785992304:/* savGoalEndDt */
			return getSavGoalEndDt();
		case -660526937:/* savGoalAm */
			return getSavGoalAm();
		case 109210164:/* savAm */
			return getSavAm();
		case -754478301:/* cnsmAmBscd */
			return getCnsmAmBscd();
		case -579940604:/* cnsmGoalAm */
			return getCnsmGoalAm();
		case -1076047140:/* pBPSpceDtlGoalAmList_ODT */
			return getpBPSpceDtlGoalAmList_ODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 1786157280:/* savGoalEstYn */
			setSavGoalEstYn((String)value);
			break;
		case 1646885219:/* cnsmGoalEstYn */
			setCnsmGoalEstYn((String)value);
			break;
		case 1799097461:/* savGoalStaDt */
			setSavGoalStaDt((String)value);
			break;
		case 1785992304:/* savGoalEndDt */
			setSavGoalEndDt((String)value);
			break;
		case -660526937:/* savGoalAm */
			if ( value instanceof String ){
				setSavGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setSavGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSavGoalAm((Long)value);
			}
			else{
				setSavGoalAm((BigDecimal)value);
			}
			break;
		case 109210164:/* savAm */
			if ( value instanceof String ){
				setSavAm((String)value);
			}
			else if ( value instanceof Double ){
				setSavAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSavAm((Long)value);
			}
			else{
				setSavAm((BigDecimal)value);
			}
			break;
		case -754478301:/* cnsmAmBscd */
			setCnsmAmBscd((String)value);
			break;
		case -579940604:/* cnsmGoalAm */
			if ( value instanceof String ){
				setCnsmGoalAm((String)value);
			}
			else if ( value instanceof Double ){
				setCnsmGoalAm((Double)value);
			}
			else if ( value instanceof Long ){
				setCnsmGoalAm((Long)value);
			}
			else{
				setCnsmGoalAm((BigDecimal)value);
			}
			break;
		case -1076047140:/* pBPSpceDtlGoalAmList_ODT */
			setpBPSpceDtlGoalAmList_ODT((List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
