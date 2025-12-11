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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * IBSMR0005784
 * 
 */
@XmlType(propOrder={
	"metChgDscd", "metChgDscdNm", "metMngNo", "metNm", "mbpfPymDt", "mbpfPmtgtAm", "metDscd", "metDscdNm", "agmdCollDt", "lifecAm", "metBscImgUrlNm", "cnt", "grid"
}, name="MetPbokBscMbhInf_DODT")
@XmlRootElement(name="MetPbokBscMbhInf_DODT")
@BxmCategory(logicalName="모임통장.기본.회원.정보.수정.DBM.출력.IO", description="IBSMR0005784\r\n") 
public class MetPbokBscMbhInf_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1197279542L;
	
	
	
	/**
	 * 모임변경구분코드
	 */
	@ApiModelProperty(
		name = "metChgDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metChgDscd")
	@BxmOmm_Field(length=2, decimal=0, description="모임변경구분코드", align="left", fill="")
	private String metChgDscd= "";
	
	
	/**
	 * 모임변경구분코드명
	 */
	@ApiModelProperty(
		name = "metChgDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metChgDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임변경구분코드명", align="left", fill="")
	private String metChgDscdNm= "";
	
	
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
	 * 모임명
	 */
	@ApiModelProperty(
		name = "metNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임명", align="left", fill="")
	private String metNm= "";
	
	
	/**
	 * 회비납부일자
	 */
	@ApiModelProperty(
		name = "mbpfPymDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("mbpfPymDt")
	@BxmOmm_Field(length=8, decimal=0, description="회비납부일자", align="left", fill="")
	private String mbpfPymDt= "";
	
	
	/**
	 * 회비납부대상금액
	 */
	@ApiModelProperty(
		name = "mbpfPmtgtAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("mbpfPmtgtAm")
	@BxmOmm_Field(length=19, decimal=3, description="회비납부대상금액", align="right", fill="0")
	private BigDecimal mbpfPmtgtAm= new BigDecimal("0");
	
	
	/**
	 * 모임구분코드
	 */
	@ApiModelProperty(
		name = "metDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metDscd")
	@BxmOmm_Field(length=2, decimal=0, description="모임구분코드", align="left", fill="")
	private String metDscd= "";
	
	
	/**
	 * 모임구분코드명
	 */
	@ApiModelProperty(
		name = "metDscdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metDscdNm")
	@BxmOmm_Field(length=50, decimal=0, description="모임구분코드명", align="left", fill="")
	private String metDscdNm= "";
	
	
	/**
	 * 동의서징구일자
	 */
	@ApiModelProperty(
		name = "agmdCollDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("agmdCollDt")
	@BxmOmm_Field(length=8, decimal=0, description="동의서징구일자", align="left", fill="")
	private String agmdCollDt= "";
	
	
	/**
	 * 생활비금액
	 */
	@ApiModelProperty(
		name = "lifecAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("lifecAm")
	@BxmOmm_Field(length=19, decimal=3, description="생활비금액", align="right", fill="0")
	private BigDecimal lifecAm= new BigDecimal("0");
	
	
	/**
	 * 모임기본이미지URL명
	 */
	@ApiModelProperty(
		name = "metBscImgUrlNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metBscImgUrlNm")
	@BxmOmm_Field(length=100, decimal=0, description="모임기본이미지URL명", align="left", fill="")
	private String metBscImgUrlNm= "";
	
	
	/**
	 * 건수
	 */
	@ApiModelProperty(
		name = "cnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("cnt")
	@BxmOmm_Field(length=3, decimal=0, description="건수", align="right", fill="0")
	private Integer cnt= 0;
	
	
	/**
	 * 모임통장.기본.회원.정보.수정.GRID.DBM.출력.IO
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.dto.MetPbokBscMbhInfGrid_DODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="모임통장.기본.회원.정보.수정.GRID.DBM.출력.IO", align="left", fill="", arrayReference="cnt")
	private List<MetPbokBscMbhInfGrid_DODT> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metChgDscd= false;
	protected final boolean isSet_metChgDscd(){
		return this.isSet_metChgDscd;
	}
	private void setIsSet_metChgDscd(boolean value){
		this.isSet_metChgDscd= value;
	}
	/**
	 * 모임변경구분코드
	 */
	@XmlTransient
	public String getMetChgDscd(){
		return this.metChgDscd;
	}
	
	/**
	 * 모임변경구분코드
	 * 
	 * @param metChgDscd 모임변경구분코드
	 */
	public void setMetChgDscd(String metChgDscd){
		this.metChgDscd= metChgDscd;
		this.setIsSet_metChgDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metChgDscdNm= false;
	protected final boolean isSet_metChgDscdNm(){
		return this.isSet_metChgDscdNm;
	}
	private void setIsSet_metChgDscdNm(boolean value){
		this.isSet_metChgDscdNm= value;
	}
	/**
	 * 모임변경구분코드명
	 */
	@XmlTransient
	public String getMetChgDscdNm(){
		return this.metChgDscdNm;
	}
	
	/**
	 * 모임변경구분코드명
	 * 
	 * @param metChgDscdNm 모임변경구분코드명
	 */
	public void setMetChgDscdNm(String metChgDscdNm){
		this.metChgDscdNm= metChgDscdNm;
		this.setIsSet_metChgDscdNm(true);
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
	private boolean isSet_metNm= false;
	protected final boolean isSet_metNm(){
		return this.isSet_metNm;
	}
	private void setIsSet_metNm(boolean value){
		this.isSet_metNm= value;
	}
	/**
	 * 모임명
	 */
	@XmlTransient
	public String getMetNm(){
		return this.metNm;
	}
	
	/**
	 * 모임명
	 * 
	 * @param metNm 모임명
	 */
	public void setMetNm(String metNm){
		this.metNm= metNm;
		this.setIsSet_metNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPymDt= false;
	protected final boolean isSet_mbpfPymDt(){
		return this.isSet_mbpfPymDt;
	}
	private void setIsSet_mbpfPymDt(boolean value){
		this.isSet_mbpfPymDt= value;
	}
	/**
	 * 회비납부일자
	 */
	@XmlTransient
	public String getMbpfPymDt(){
		return this.mbpfPymDt;
	}
	
	/**
	 * 회비납부일자
	 * 
	 * @param mbpfPymDt 회비납부일자
	 */
	public void setMbpfPymDt(String mbpfPymDt){
		this.mbpfPymDt= mbpfPymDt;
		this.setIsSet_mbpfPymDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mbpfPmtgtAm= false;
	protected final boolean isSet_mbpfPmtgtAm(){
		return this.isSet_mbpfPmtgtAm;
	}
	private void setIsSet_mbpfPmtgtAm(boolean value){
		this.isSet_mbpfPmtgtAm= value;
	}
	/**
	 * 회비납부대상금액
	 * BigDecimal - Double value setter
	 *
	 * @Param mbpfPmtgtAm 회비납부대상금액
	 */
	public void setMbpfPmtgtAm(double mbpfPmtgtAm) {
		setMbpfPmtgtAm(BigDecimal.valueOf(mbpfPmtgtAm));
	}
	/**
	 * 회비납부대상금액
	 * BigDecimal - Long value setter
	 *
	 * @Param mbpfPmtgtAm 회비납부대상금액
	 */
	public void setMbpfPmtgtAm(long mbpfPmtgtAm) {
		setMbpfPmtgtAm(BigDecimal.valueOf(mbpfPmtgtAm));
	}
	/**
	 * 회비납부대상금액
	 * BigDecimal - String value setter
	 *
	 * @Param mbpfPmtgtAm 회비납부대상금액
	 */
	public void setMbpfPmtgtAm(String mbpfPmtgtAm) {
		setMbpfPmtgtAm(new BigDecimal(mbpfPmtgtAm));
	}
	/**
	 * 회비납부대상금액
	 */
	@XmlTransient
	public BigDecimal getMbpfPmtgtAm(){
		return this.mbpfPmtgtAm;
	}
	
	/**
	 * 회비납부대상금액
	 * 
	 * @param mbpfPmtgtAm 회비납부대상금액
	 */
	@JsonSetter("mbpfPmtgtAm")
	public void setMbpfPmtgtAm(BigDecimal mbpfPmtgtAm){
		this.mbpfPmtgtAm= mbpfPmtgtAm;
		this.setIsSet_mbpfPmtgtAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metDscd= false;
	protected final boolean isSet_metDscd(){
		return this.isSet_metDscd;
	}
	private void setIsSet_metDscd(boolean value){
		this.isSet_metDscd= value;
	}
	/**
	 * 모임구분코드
	 */
	@XmlTransient
	public String getMetDscd(){
		return this.metDscd;
	}
	
	/**
	 * 모임구분코드
	 * 
	 * @param metDscd 모임구분코드
	 */
	public void setMetDscd(String metDscd){
		this.metDscd= metDscd;
		this.setIsSet_metDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metDscdNm= false;
	protected final boolean isSet_metDscdNm(){
		return this.isSet_metDscdNm;
	}
	private void setIsSet_metDscdNm(boolean value){
		this.isSet_metDscdNm= value;
	}
	/**
	 * 모임구분코드명
	 */
	@XmlTransient
	public String getMetDscdNm(){
		return this.metDscdNm;
	}
	
	/**
	 * 모임구분코드명
	 * 
	 * @param metDscdNm 모임구분코드명
	 */
	public void setMetDscdNm(String metDscdNm){
		this.metDscdNm= metDscdNm;
		this.setIsSet_metDscdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_agmdCollDt= false;
	protected final boolean isSet_agmdCollDt(){
		return this.isSet_agmdCollDt;
	}
	private void setIsSet_agmdCollDt(boolean value){
		this.isSet_agmdCollDt= value;
	}
	/**
	 * 동의서징구일자
	 */
	@XmlTransient
	public String getAgmdCollDt(){
		return this.agmdCollDt;
	}
	
	/**
	 * 동의서징구일자
	 * 
	 * @param agmdCollDt 동의서징구일자
	 */
	public void setAgmdCollDt(String agmdCollDt){
		this.agmdCollDt= agmdCollDt;
		this.setIsSet_agmdCollDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lifecAm= false;
	protected final boolean isSet_lifecAm(){
		return this.isSet_lifecAm;
	}
	private void setIsSet_lifecAm(boolean value){
		this.isSet_lifecAm= value;
	}
	/**
	 * 생활비금액
	 * BigDecimal - Double value setter
	 *
	 * @Param lifecAm 생활비금액
	 */
	public void setLifecAm(double lifecAm) {
		setLifecAm(BigDecimal.valueOf(lifecAm));
	}
	/**
	 * 생활비금액
	 * BigDecimal - Long value setter
	 *
	 * @Param lifecAm 생활비금액
	 */
	public void setLifecAm(long lifecAm) {
		setLifecAm(BigDecimal.valueOf(lifecAm));
	}
	/**
	 * 생활비금액
	 * BigDecimal - String value setter
	 *
	 * @Param lifecAm 생활비금액
	 */
	public void setLifecAm(String lifecAm) {
		setLifecAm(new BigDecimal(lifecAm));
	}
	/**
	 * 생활비금액
	 */
	@XmlTransient
	public BigDecimal getLifecAm(){
		return this.lifecAm;
	}
	
	/**
	 * 생활비금액
	 * 
	 * @param lifecAm 생활비금액
	 */
	@JsonSetter("lifecAm")
	public void setLifecAm(BigDecimal lifecAm){
		this.lifecAm= lifecAm;
		this.setIsSet_lifecAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metBscImgUrlNm= false;
	protected final boolean isSet_metBscImgUrlNm(){
		return this.isSet_metBscImgUrlNm;
	}
	private void setIsSet_metBscImgUrlNm(boolean value){
		this.isSet_metBscImgUrlNm= value;
	}
	/**
	 * 모임기본이미지URL명
	 */
	@XmlTransient
	public String getMetBscImgUrlNm(){
		return this.metBscImgUrlNm;
	}
	
	/**
	 * 모임기본이미지URL명
	 * 
	 * @param metBscImgUrlNm 모임기본이미지URL명
	 */
	public void setMetBscImgUrlNm(String metBscImgUrlNm){
		this.metBscImgUrlNm= metBscImgUrlNm;
		this.setIsSet_metBscImgUrlNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cnt= false;
	protected final boolean isSet_cnt(){
		return this.isSet_cnt;
	}
	private void setIsSet_cnt(boolean value){
		this.isSet_cnt= value;
	}
	/**
	 * 건수
	 */
	@XmlElement
	public Integer getCnt(){
		if ( isSet_cnt )	return cnt;
		else{
			if ( grid == null || grid.size() == 0 ) return 0;
			else return grid.size();
		}
	}
	
	/**
	 * 건수
	 * 
	 * @param cnt 건수
	 */
	public void setCnt(Integer cnt){
		this.cnt= cnt;
		this.setIsSet_cnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_grid= false;
	protected final boolean isSet_grid(){
		return this.isSet_grid;
	}
	private void setIsSet_grid(boolean value){
		this.isSet_grid= value;
	}
	/**
	 * 모임통장.기본.회원.정보.수정.GRID.DBM.출력.IO
	 */
	@XmlTransient
	public List<MetPbokBscMbhInfGrid_DODT> getGrid(){
		return grid;
	}
	
	/**
	 * 모임통장.기본.회원.정보.수정.GRID.DBM.출력.IO
	 * 
	 * @param grid 모임통장.기본.회원.정보.수정.GRID.DBM.출력.IO
	 */
	@JsonSetter("grid")
	public void setGrid(List<MetPbokBscMbhInfGrid_DODT> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MetPbokBscMbhInfGrid_DODT... items){
		List<MetPbokBscMbhInfGrid_DODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MetPbokBscMbhInfGrid_DODT item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MetPbokBscMbhInf_DODT clone(){
		try{
			MetPbokBscMbhInf_DODT object= (MetPbokBscMbhInf_DODT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MetPbokBscMbhInfGrid_DODT> clonedList= new ArrayList<>(this.grid.size());
				for( MetPbokBscMbhInfGrid_DODT item : grid ){
					clonedList.add((MetPbokBscMbhInfGrid_DODT)item.clone());
				}
				object.grid= clonedList;
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
		
		result= prime * result + ((this.metChgDscd==null)?0:this.metChgDscd.hashCode());
		result= prime * result + ((this.metChgDscdNm==null)?0:this.metChgDscdNm.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.metNm==null)?0:this.metNm.hashCode());
		result= prime * result + ((this.mbpfPymDt==null)?0:this.mbpfPymDt.hashCode());
		result= prime * result + ((this.mbpfPmtgtAm==null)?0:this.mbpfPmtgtAm.hashCode());
		result= prime * result + ((this.metDscd==null)?0:this.metDscd.hashCode());
		result= prime * result + ((this.metDscdNm==null)?0:this.metDscdNm.hashCode());
		result= prime * result + ((this.agmdCollDt==null)?0:this.agmdCollDt.hashCode());
		result= prime * result + ((this.lifecAm==null)?0:this.lifecAm.hashCode());
		result= prime * result + ((this.metBscImgUrlNm==null)?0:this.metBscImgUrlNm.hashCode());
		result= prime * result + ((this.cnt==null)?0:this.cnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokBscMbhInf_DODT other= (MetPbokBscMbhInf_DODT)obj;
		{
			Object _metChgDscd= getMetChgDscd();
			Object __metChgDscd= other.getMetChgDscd();
			if ( _metChgDscd== null ) { if ( __metChgDscd!= null ) return false; }
			else if ( !_metChgDscd.equals(__metChgDscd) ) return false;
		}
		{
			Object _metChgDscdNm= getMetChgDscdNm();
			Object __metChgDscdNm= other.getMetChgDscdNm();
			if ( _metChgDscdNm== null ) { if ( __metChgDscdNm!= null ) return false; }
			else if ( !_metChgDscdNm.equals(__metChgDscdNm) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metNm= getMetNm();
			Object __metNm= other.getMetNm();
			if ( _metNm== null ) { if ( __metNm!= null ) return false; }
			else if ( !_metNm.equals(__metNm) ) return false;
		}
		{
			Object _mbpfPymDt= getMbpfPymDt();
			Object __mbpfPymDt= other.getMbpfPymDt();
			if ( _mbpfPymDt== null ) { if ( __mbpfPymDt!= null ) return false; }
			else if ( !_mbpfPymDt.equals(__mbpfPymDt) ) return false;
		}
		{
			Object _mbpfPmtgtAm= getMbpfPmtgtAm();
			Object __mbpfPmtgtAm= other.getMbpfPmtgtAm();
			if ( _mbpfPmtgtAm== null ) { if ( __mbpfPmtgtAm!= null ) return false; }
			else if ( !_mbpfPmtgtAm.equals(__mbpfPmtgtAm) ) return false;
		}
		{
			Object _metDscd= getMetDscd();
			Object __metDscd= other.getMetDscd();
			if ( _metDscd== null ) { if ( __metDscd!= null ) return false; }
			else if ( !_metDscd.equals(__metDscd) ) return false;
		}
		{
			Object _metDscdNm= getMetDscdNm();
			Object __metDscdNm= other.getMetDscdNm();
			if ( _metDscdNm== null ) { if ( __metDscdNm!= null ) return false; }
			else if ( !_metDscdNm.equals(__metDscdNm) ) return false;
		}
		{
			Object _agmdCollDt= getAgmdCollDt();
			Object __agmdCollDt= other.getAgmdCollDt();
			if ( _agmdCollDt== null ) { if ( __agmdCollDt!= null ) return false; }
			else if ( !_agmdCollDt.equals(__agmdCollDt) ) return false;
		}
		{
			Object _lifecAm= getLifecAm();
			Object __lifecAm= other.getLifecAm();
			if ( _lifecAm== null ) { if ( __lifecAm!= null ) return false; }
			else if ( !_lifecAm.equals(__lifecAm) ) return false;
		}
		{
			Object _metBscImgUrlNm= getMetBscImgUrlNm();
			Object __metBscImgUrlNm= other.getMetBscImgUrlNm();
			if ( _metBscImgUrlNm== null ) { if ( __metBscImgUrlNm!= null ) return false; }
			else if ( !_metBscImgUrlNm.equals(__metBscImgUrlNm) ) return false;
		}
		{
			Object _cnt= getCnt();
			Object __cnt= other.getCnt();
			if ( _cnt== null ) { if ( __cnt!= null ) return false; }
			else if ( !_cnt.equals(__cnt) ) return false;
		}
		{
			Object _grid= getGrid();
			Object __grid= other.getGrid();
			if ( _grid== null ) { if ( __grid!= null ) return false; }
			else if ( !_grid.equals(__grid) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokBscMbhInf_DODT.class.getName()).append(":\n");
		sb.append("\tmetChgDscd: ");
		sb.append(metChgDscd==null?"null":getMetChgDscd());
		sb.append("\n");
		sb.append("\tmetChgDscdNm: ");
		sb.append(metChgDscdNm==null?"null":getMetChgDscdNm());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetNm: ");
		sb.append(metNm==null?"null":getMetNm());
		sb.append("\n");
		sb.append("\tmbpfPymDt: ");
		sb.append(mbpfPymDt==null?"null":getMbpfPymDt());
		sb.append("\n");
		sb.append("\tmbpfPmtgtAm: ");
		sb.append(mbpfPmtgtAm==null?"null":getMbpfPmtgtAm());
		sb.append("\n");
		sb.append("\tmetDscd: ");
		sb.append(metDscd==null?"null":getMetDscd());
		sb.append("\n");
		sb.append("\tmetDscdNm: ");
		sb.append(metDscdNm==null?"null":getMetDscdNm());
		sb.append("\n");
		sb.append("\tagmdCollDt: ");
		sb.append(agmdCollDt==null?"null":getAgmdCollDt());
		sb.append("\n");
		sb.append("\tlifecAm: ");
		sb.append(lifecAm==null?"null":getLifecAm());
		sb.append("\n");
		sb.append("\tmetBscImgUrlNm: ");
		sb.append(metBscImgUrlNm==null?"null":getMetBscImgUrlNm());
		sb.append("\n");
		sb.append("\tcnt: ");
		sb.append(cnt==null?"null":getCnt());
		sb.append("\n");
		sb.append("\tgrid: ");
		if ( grid== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(grid.size());
			sb.append("(items)\n");
	
			int max= (10<grid.size())?10:grid.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tgrid[");
				sb.append(i);
				sb.append("] : ");
				sb.append(grid.get(i));
				sb.append("\n");
			}
	
			if ( max < grid.size() ){
				sb.append("\tgrid[.] : ").append("more ").append((grid.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 2; /* metChgDscd */
		messageLen+= 50; /* metChgDscdNm */
		messageLen+= 9; /* metMngNo */
		messageLen+= 100; /* metNm */
		messageLen+= 8; /* mbpfPymDt */
		messageLen+= 19; /* mbpfPmtgtAm */
		messageLen+= 2; /* metDscd */
		messageLen+= 50; /* metDscdNm */
		messageLen+= 8; /* agmdCollDt */
		messageLen+= 19; /* lifecAm */
		messageLen+= 100; /* metBscImgUrlNm */
		messageLen+= 3; /* cnt */
		{/*grid*/
			int size=getCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MetPbokBscMbhInfGrid_DODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MetPbokBscMbhInfGrid_DODT element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.dto.MetPbokBscMbhInfGrid_DODT();
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
	
		list.add("metChgDscd");
		list.add("metChgDscdNm");
		list.add("metMngNo");
		list.add("metNm");
		list.add("mbpfPymDt");
		list.add("mbpfPmtgtAm");
		list.add("metDscd");
		list.add("metDscdNm");
		list.add("agmdCollDt");
		list.add("lifecAm");
		list.add("metBscImgUrlNm");
		list.add("cnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metChgDscd", get("metChgDscd"));
		map.put("metChgDscdNm", get("metChgDscdNm"));
		map.put("metMngNo", get("metMngNo"));
		map.put("metNm", get("metNm"));
		map.put("mbpfPymDt", get("mbpfPymDt"));
		map.put("mbpfPmtgtAm", get("mbpfPmtgtAm"));
		map.put("metDscd", get("metDscd"));
		map.put("metDscdNm", get("metDscdNm"));
		map.put("agmdCollDt", get("agmdCollDt"));
		map.put("lifecAm", get("lifecAm"));
		map.put("metBscImgUrlNm", get("metBscImgUrlNm"));
		map.put("cnt", get("cnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 601024374:/* metChgDscd */
			return getMetChgDscd();
		case 2058808277:/* metChgDscdNm */
			return getMetChgDscdNm();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 103786683:/* metNm */
			return getMetNm();
		case -1128355927:/* mbpfPymDt */
			return getMbpfPymDt();
		case 1940639685:/* mbpfPmtgtAm */
			return getMbpfPmtgtAm();
		case 954465580:/* metDscd */
			return getMetDscd();
		case -1881576437:/* metDscdNm */
			return getMetDscdNm();
		case -1798348999:/* agmdCollDt */
			return getAgmdCollDt();
		case 169515891:/* lifecAm */
			return getLifecAm();
		case 300784225:/* metBscImgUrlNm */
			return getMetBscImgUrlNm();
		case 98665:/* cnt */
			return getCnt();
		case 3181382:/* grid */
			return getGrid();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 601024374:/* metChgDscd */
			setMetChgDscd((String)value);
			break;
		case 2058808277:/* metChgDscdNm */
			setMetChgDscdNm((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 103786683:/* metNm */
			setMetNm((String)value);
			break;
		case -1128355927:/* mbpfPymDt */
			setMbpfPymDt((String)value);
			break;
		case 1940639685:/* mbpfPmtgtAm */
			if ( value instanceof String ){
				setMbpfPmtgtAm((String)value);
			}
			else if ( value instanceof Double ){
				setMbpfPmtgtAm((Double)value);
			}
			else if ( value instanceof Long ){
				setMbpfPmtgtAm((Long)value);
			}
			else{
				setMbpfPmtgtAm((BigDecimal)value);
			}
			break;
		case 954465580:/* metDscd */
			setMetDscd((String)value);
			break;
		case -1881576437:/* metDscdNm */
			setMetDscdNm((String)value);
			break;
		case -1798348999:/* agmdCollDt */
			setAgmdCollDt((String)value);
			break;
		case 169515891:/* lifecAm */
			if ( value instanceof String ){
				setLifecAm((String)value);
			}
			else if ( value instanceof Double ){
				setLifecAm((Double)value);
			}
			else if ( value instanceof Long ){
				setLifecAm((Long)value);
			}
			else{
				setLifecAm((BigDecimal)value);
			}
			break;
		case 300784225:/* metBscImgUrlNm */
			setMetBscImgUrlNm((String)value);
			break;
		case 98665:/* cnt */
			setCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MetPbokBscMbhInfGrid_DODT>)value);
			break;
		default:
			break;
		}
	}
	
}
