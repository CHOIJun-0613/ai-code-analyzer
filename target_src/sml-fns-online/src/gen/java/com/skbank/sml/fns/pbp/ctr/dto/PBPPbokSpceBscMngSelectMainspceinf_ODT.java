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
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"acno", "acnoBal", "splitAvlAm", "prdNm", "trnStcd", "rgsTrnDt", "rvkTrnDt", "rvkRsnTxt", "bkAppPushAgrYn", "pBPPbokSpceBscMngSelectAllUsgspceinflist", "paySumAm", "rcvSumAm"
}, name="PBPPbokSpceBscMngSelectMainspceinf_ODT")
@XmlRootElement(name="PBPPbokSpceBscMngSelectMainspceinf_ODT")
@BxmCategory(logicalName="메인.공간.정보.조회.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceBscMngSelectMainspceinf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 847966602L;
	
	
	
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
	 * 계좌잔액
	 */
	@ApiModelProperty(
		name = "acnoBal"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("acnoBal")
	@BxmOmm_Field(length=18, decimal=3, description="계좌잔액", align="right", fill="")
	private BigDecimal acnoBal= new BigDecimal("0");
	
	
	/**
	 * 쪼개기가능금액
	 */
	@ApiModelProperty(
		name = "splitAvlAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("splitAvlAm")
	@BxmOmm_Field(length=18, decimal=3, description="쪼개기가능금액", align="right", fill="")
	private BigDecimal splitAvlAm= new BigDecimal("0");
	
	
	/**
	 * 상품명
	 */
	@ApiModelProperty(
		name = "prdNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("prdNm")
	@BxmOmm_Field(length=100, decimal=0, description="상품명", align="left", fill="")
	private String prdNm= "";
	
	
	/**
	 * 거래상태코드
	 */
	@ApiModelProperty(
		name = "trnStcd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("trnStcd")
	@BxmOmm_Field(length=1, decimal=0, description="거래상태코드", align="left", fill="")
	private String trnStcd= "";
	
	
	/**
	 * 등록거래일자
	 */
	@ApiModelProperty(
		name = "rgsTrnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rgsTrnDt")
	@BxmOmm_Field(length=8, decimal=0, description="등록거래일자", align="left", fill="")
	private String rgsTrnDt= "";
	
	
	/**
	 * 해제거래일자
	 */
	@ApiModelProperty(
		name = "rvkTrnDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rvkTrnDt")
	@BxmOmm_Field(length=8, decimal=0, description="해제거래일자", align="left", fill="")
	private String rvkTrnDt= "";
	
	
	/**
	 * 해제거래사유
	 */
	@ApiModelProperty(
		name = "rvkRsnTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rvkRsnTxt")
	@BxmOmm_Field(length=10, decimal=0, description="해제거래사유", align="left", fill="")
	private String rvkRsnTxt= "";
	
	
	/**
	 * 은행앱PUSH동의여부
	 */
	@ApiModelProperty(
		name = "bkAppPushAgrYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("bkAppPushAgrYn")
	@BxmOmm_Field(length=1, decimal=0, description="은행앱PUSH동의여부", align="left", fill="")
	private String bkAppPushAgrYn= "";
	
	
	/**
	 * 서브공간목록
	 */
	@ApiModelProperty(
		name = "pBPPbokSpceBscMngSelectAllUsgspceinflist"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectUsgspceinf_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPPbokSpceBscMngSelectAllUsgspceinflist")
	@BxmOmm_Field(length=0, decimal=0, description="서브공간목록", align="left", fill="", arrayReference="1")
	private List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> pBPPbokSpceBscMngSelectAllUsgspceinflist= new ArrayList<>();
	
	/**
	 * 지급합계금액
	 */
	@ApiModelProperty(
		name = "paySumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("paySumAm")
	@BxmOmm_Field(length=18, decimal=3, description="지급합계금액", align="right", fill="")
	private BigDecimal paySumAm= new BigDecimal("0");
	
	
	/**
	 * 입금합계금액
	 */
	@ApiModelProperty(
		name = "rcvSumAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("rcvSumAm")
	@BxmOmm_Field(length=18, decimal=3, description="입금합계금액", align="right", fill="")
	private BigDecimal rcvSumAm= new BigDecimal("0");
	
	
	
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
	private boolean isSet_acnoBal= false;
	protected final boolean isSet_acnoBal(){
		return this.isSet_acnoBal;
	}
	private void setIsSet_acnoBal(boolean value){
		this.isSet_acnoBal= value;
	}
	/**
	 * 계좌잔액
	 * BigDecimal - Double value setter
	 *
	 * @Param acnoBal 계좌잔액
	 */
	public void setAcnoBal(double acnoBal) {
		setAcnoBal(BigDecimal.valueOf(acnoBal));
	}
	/**
	 * 계좌잔액
	 * BigDecimal - Long value setter
	 *
	 * @Param acnoBal 계좌잔액
	 */
	public void setAcnoBal(long acnoBal) {
		setAcnoBal(BigDecimal.valueOf(acnoBal));
	}
	/**
	 * 계좌잔액
	 * BigDecimal - String value setter
	 *
	 * @Param acnoBal 계좌잔액
	 */
	public void setAcnoBal(String acnoBal) {
		setAcnoBal(new BigDecimal(acnoBal));
	}
	/**
	 * 계좌잔액
	 */
	@XmlTransient
	public BigDecimal getAcnoBal(){
		return this.acnoBal;
	}
	
	/**
	 * 계좌잔액
	 * 
	 * @param acnoBal 계좌잔액
	 */
	@JsonSetter("acnoBal")
	public void setAcnoBal(BigDecimal acnoBal){
		this.acnoBal= acnoBal;
		this.setIsSet_acnoBal(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_splitAvlAm= false;
	protected final boolean isSet_splitAvlAm(){
		return this.isSet_splitAvlAm;
	}
	private void setIsSet_splitAvlAm(boolean value){
		this.isSet_splitAvlAm= value;
	}
	/**
	 * 쪼개기가능금액
	 * BigDecimal - Double value setter
	 *
	 * @Param splitAvlAm 쪼개기가능금액
	 */
	public void setSplitAvlAm(double splitAvlAm) {
		setSplitAvlAm(BigDecimal.valueOf(splitAvlAm));
	}
	/**
	 * 쪼개기가능금액
	 * BigDecimal - Long value setter
	 *
	 * @Param splitAvlAm 쪼개기가능금액
	 */
	public void setSplitAvlAm(long splitAvlAm) {
		setSplitAvlAm(BigDecimal.valueOf(splitAvlAm));
	}
	/**
	 * 쪼개기가능금액
	 * BigDecimal - String value setter
	 *
	 * @Param splitAvlAm 쪼개기가능금액
	 */
	public void setSplitAvlAm(String splitAvlAm) {
		setSplitAvlAm(new BigDecimal(splitAvlAm));
	}
	/**
	 * 쪼개기가능금액
	 */
	@XmlTransient
	public BigDecimal getSplitAvlAm(){
		return this.splitAvlAm;
	}
	
	/**
	 * 쪼개기가능금액
	 * 
	 * @param splitAvlAm 쪼개기가능금액
	 */
	@JsonSetter("splitAvlAm")
	public void setSplitAvlAm(BigDecimal splitAvlAm){
		this.splitAvlAm= splitAvlAm;
		this.setIsSet_splitAvlAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_prdNm= false;
	protected final boolean isSet_prdNm(){
		return this.isSet_prdNm;
	}
	private void setIsSet_prdNm(boolean value){
		this.isSet_prdNm= value;
	}
	/**
	 * 상품명
	 */
	@XmlTransient
	public String getPrdNm(){
		return this.prdNm;
	}
	
	/**
	 * 상품명
	 * 
	 * @param prdNm 상품명
	 */
	public void setPrdNm(String prdNm){
		this.prdNm= prdNm;
		this.setIsSet_prdNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_trnStcd= false;
	protected final boolean isSet_trnStcd(){
		return this.isSet_trnStcd;
	}
	private void setIsSet_trnStcd(boolean value){
		this.isSet_trnStcd= value;
	}
	/**
	 * 거래상태코드
	 */
	@XmlTransient
	public String getTrnStcd(){
		return this.trnStcd;
	}
	
	/**
	 * 거래상태코드
	 * 
	 * @param trnStcd 거래상태코드
	 */
	public void setTrnStcd(String trnStcd){
		this.trnStcd= trnStcd;
		this.setIsSet_trnStcd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rgsTrnDt= false;
	protected final boolean isSet_rgsTrnDt(){
		return this.isSet_rgsTrnDt;
	}
	private void setIsSet_rgsTrnDt(boolean value){
		this.isSet_rgsTrnDt= value;
	}
	/**
	 * 등록거래일자
	 */
	@XmlTransient
	public String getRgsTrnDt(){
		return this.rgsTrnDt;
	}
	
	/**
	 * 등록거래일자
	 * 
	 * @param rgsTrnDt 등록거래일자
	 */
	public void setRgsTrnDt(String rgsTrnDt){
		this.rgsTrnDt= rgsTrnDt;
		this.setIsSet_rgsTrnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rvkTrnDt= false;
	protected final boolean isSet_rvkTrnDt(){
		return this.isSet_rvkTrnDt;
	}
	private void setIsSet_rvkTrnDt(boolean value){
		this.isSet_rvkTrnDt= value;
	}
	/**
	 * 해제거래일자
	 */
	@XmlTransient
	public String getRvkTrnDt(){
		return this.rvkTrnDt;
	}
	
	/**
	 * 해제거래일자
	 * 
	 * @param rvkTrnDt 해제거래일자
	 */
	public void setRvkTrnDt(String rvkTrnDt){
		this.rvkTrnDt= rvkTrnDt;
		this.setIsSet_rvkTrnDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rvkRsnTxt= false;
	protected final boolean isSet_rvkRsnTxt(){
		return this.isSet_rvkRsnTxt;
	}
	private void setIsSet_rvkRsnTxt(boolean value){
		this.isSet_rvkRsnTxt= value;
	}
	/**
	 * 해제거래사유
	 */
	@XmlTransient
	public String getRvkRsnTxt(){
		return this.rvkRsnTxt;
	}
	
	/**
	 * 해제거래사유
	 * 
	 * @param rvkRsnTxt 해제거래사유
	 */
	public void setRvkRsnTxt(String rvkRsnTxt){
		this.rvkRsnTxt= rvkRsnTxt;
		this.setIsSet_rvkRsnTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_bkAppPushAgrYn= false;
	protected final boolean isSet_bkAppPushAgrYn(){
		return this.isSet_bkAppPushAgrYn;
	}
	private void setIsSet_bkAppPushAgrYn(boolean value){
		this.isSet_bkAppPushAgrYn= value;
	}
	/**
	 * 은행앱PUSH동의여부
	 */
	@XmlTransient
	public String getBkAppPushAgrYn(){
		return this.bkAppPushAgrYn;
	}
	
	/**
	 * 은행앱PUSH동의여부
	 * 
	 * @param bkAppPushAgrYn 은행앱PUSH동의여부
	 */
	public void setBkAppPushAgrYn(String bkAppPushAgrYn){
		this.bkAppPushAgrYn= bkAppPushAgrYn;
		this.setIsSet_bkAppPushAgrYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pBPPbokSpceBscMngSelectAllUsgspceinflist= false;
	protected final boolean isSet_pBPPbokSpceBscMngSelectAllUsgspceinflist(){
		return this.isSet_pBPPbokSpceBscMngSelectAllUsgspceinflist;
	}
	private void setIsSet_pBPPbokSpceBscMngSelectAllUsgspceinflist(boolean value){
		this.isSet_pBPPbokSpceBscMngSelectAllUsgspceinflist= value;
	}
	/**
	 * 서브공간목록
	 */
	@XmlTransient
	public List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> getpBPPbokSpceBscMngSelectAllUsgspceinflist(){
		return pBPPbokSpceBscMngSelectAllUsgspceinflist;
	}
	
	/**
	 * 서브공간목록
	 * 
	 * @param pBPPbokSpceBscMngSelectAllUsgspceinflist 서브공간목록
	 */
	@JsonSetter("pBPPbokSpceBscMngSelectAllUsgspceinflist")
	public void setpBPPbokSpceBscMngSelectAllUsgspceinflist(List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> pBPPbokSpceBscMngSelectAllUsgspceinflist){
		this.pBPPbokSpceBscMngSelectAllUsgspceinflist= pBPPbokSpceBscMngSelectAllUsgspceinflist;
		this.setIsSet_pBPPbokSpceBscMngSelectAllUsgspceinflist(true);
	}
	
	public void setpBPPbokSpceBscMngSelectAllUsgspceinflist(PBPPbokSpceBscMngSelectUsgspceinf_ODT... items){
		List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceBscMngSelectUsgspceinf_ODT item: items ){
				_items.add(item);
			}
		}
		this.setpBPPbokSpceBscMngSelectAllUsgspceinflist(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_paySumAm= false;
	protected final boolean isSet_paySumAm(){
		return this.isSet_paySumAm;
	}
	private void setIsSet_paySumAm(boolean value){
		this.isSet_paySumAm= value;
	}
	/**
	 * 지급합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(double paySumAm) {
		setPaySumAm(BigDecimal.valueOf(paySumAm));
	}
	/**
	 * 지급합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(long paySumAm) {
		setPaySumAm(BigDecimal.valueOf(paySumAm));
	}
	/**
	 * 지급합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param paySumAm 지급합계금액
	 */
	public void setPaySumAm(String paySumAm) {
		setPaySumAm(new BigDecimal(paySumAm));
	}
	/**
	 * 지급합계금액
	 */
	@XmlTransient
	public BigDecimal getPaySumAm(){
		return this.paySumAm;
	}
	
	/**
	 * 지급합계금액
	 * 
	 * @param paySumAm 지급합계금액
	 */
	@JsonSetter("paySumAm")
	public void setPaySumAm(BigDecimal paySumAm){
		this.paySumAm= paySumAm;
		this.setIsSet_paySumAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rcvSumAm= false;
	protected final boolean isSet_rcvSumAm(){
		return this.isSet_rcvSumAm;
	}
	private void setIsSet_rcvSumAm(boolean value){
		this.isSet_rcvSumAm= value;
	}
	/**
	 * 입금합계금액
	 * BigDecimal - Double value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(double rcvSumAm) {
		setRcvSumAm(BigDecimal.valueOf(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 * BigDecimal - Long value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(long rcvSumAm) {
		setRcvSumAm(BigDecimal.valueOf(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 * BigDecimal - String value setter
	 *
	 * @Param rcvSumAm 입금합계금액
	 */
	public void setRcvSumAm(String rcvSumAm) {
		setRcvSumAm(new BigDecimal(rcvSumAm));
	}
	/**
	 * 입금합계금액
	 */
	@XmlTransient
	public BigDecimal getRcvSumAm(){
		return this.rcvSumAm;
	}
	
	/**
	 * 입금합계금액
	 * 
	 * @param rcvSumAm 입금합계금액
	 */
	@JsonSetter("rcvSumAm")
	public void setRcvSumAm(BigDecimal rcvSumAm){
		this.rcvSumAm= rcvSumAm;
		this.setIsSet_rcvSumAm(true);
	}
				
	@Override
	public PBPPbokSpceBscMngSelectMainspceinf_ODT clone(){
		try{
			PBPPbokSpceBscMngSelectMainspceinf_ODT object= (PBPPbokSpceBscMngSelectMainspceinf_ODT)super.clone();
			if ( this.pBPPbokSpceBscMngSelectAllUsgspceinflist== null ) object.pBPPbokSpceBscMngSelectAllUsgspceinflist= null;
			else{
				List<PBPPbokSpceBscMngSelectUsgspceinf_ODT> clonedList= new ArrayList<>(this.pBPPbokSpceBscMngSelectAllUsgspceinflist.size());
				for( PBPPbokSpceBscMngSelectUsgspceinf_ODT item : pBPPbokSpceBscMngSelectAllUsgspceinflist ){
					clonedList.add((PBPPbokSpceBscMngSelectUsgspceinf_ODT)item.clone());
				}
				object.pBPPbokSpceBscMngSelectAllUsgspceinflist= clonedList;
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
		
		result= prime * result + ((this.acno==null)?0:this.acno.hashCode());
		result= prime * result + ((this.acnoBal==null)?0:this.acnoBal.hashCode());
		result= prime * result + ((this.splitAvlAm==null)?0:this.splitAvlAm.hashCode());
		result= prime * result + ((this.prdNm==null)?0:this.prdNm.hashCode());
		result= prime * result + ((this.trnStcd==null)?0:this.trnStcd.hashCode());
		result= prime * result + ((this.rgsTrnDt==null)?0:this.rgsTrnDt.hashCode());
		result= prime * result + ((this.rvkTrnDt==null)?0:this.rvkTrnDt.hashCode());
		result= prime * result + ((this.rvkRsnTxt==null)?0:this.rvkRsnTxt.hashCode());
		result= prime * result + ((this.bkAppPushAgrYn==null)?0:this.bkAppPushAgrYn.hashCode());
		result= prime * result + ((this.pBPPbokSpceBscMngSelectAllUsgspceinflist==null)?0:this.pBPPbokSpceBscMngSelectAllUsgspceinflist.hashCode());
		result= prime * result + ((this.paySumAm==null)?0:this.paySumAm.hashCode());
		result= prime * result + ((this.rcvSumAm==null)?0:this.rcvSumAm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngSelectMainspceinf_ODT other= (PBPPbokSpceBscMngSelectMainspceinf_ODT)obj;
		{
			Object _acno= getAcno();
			Object __acno= other.getAcno();
			if ( _acno== null ) { if ( __acno!= null ) return false; }
			else if ( !_acno.equals(__acno) ) return false;
		}
		{
			Object _acnoBal= getAcnoBal();
			Object __acnoBal= other.getAcnoBal();
			if ( _acnoBal== null ) { if ( __acnoBal!= null ) return false; }
			else if ( !_acnoBal.equals(__acnoBal) ) return false;
		}
		{
			Object _splitAvlAm= getSplitAvlAm();
			Object __splitAvlAm= other.getSplitAvlAm();
			if ( _splitAvlAm== null ) { if ( __splitAvlAm!= null ) return false; }
			else if ( !_splitAvlAm.equals(__splitAvlAm) ) return false;
		}
		{
			Object _prdNm= getPrdNm();
			Object __prdNm= other.getPrdNm();
			if ( _prdNm== null ) { if ( __prdNm!= null ) return false; }
			else if ( !_prdNm.equals(__prdNm) ) return false;
		}
		{
			Object _trnStcd= getTrnStcd();
			Object __trnStcd= other.getTrnStcd();
			if ( _trnStcd== null ) { if ( __trnStcd!= null ) return false; }
			else if ( !_trnStcd.equals(__trnStcd) ) return false;
		}
		{
			Object _rgsTrnDt= getRgsTrnDt();
			Object __rgsTrnDt= other.getRgsTrnDt();
			if ( _rgsTrnDt== null ) { if ( __rgsTrnDt!= null ) return false; }
			else if ( !_rgsTrnDt.equals(__rgsTrnDt) ) return false;
		}
		{
			Object _rvkTrnDt= getRvkTrnDt();
			Object __rvkTrnDt= other.getRvkTrnDt();
			if ( _rvkTrnDt== null ) { if ( __rvkTrnDt!= null ) return false; }
			else if ( !_rvkTrnDt.equals(__rvkTrnDt) ) return false;
		}
		{
			Object _rvkRsnTxt= getRvkRsnTxt();
			Object __rvkRsnTxt= other.getRvkRsnTxt();
			if ( _rvkRsnTxt== null ) { if ( __rvkRsnTxt!= null ) return false; }
			else if ( !_rvkRsnTxt.equals(__rvkRsnTxt) ) return false;
		}
		{
			Object _bkAppPushAgrYn= getBkAppPushAgrYn();
			Object __bkAppPushAgrYn= other.getBkAppPushAgrYn();
			if ( _bkAppPushAgrYn== null ) { if ( __bkAppPushAgrYn!= null ) return false; }
			else if ( !_bkAppPushAgrYn.equals(__bkAppPushAgrYn) ) return false;
		}
		{
			Object _pBPPbokSpceBscMngSelectAllUsgspceinflist= getpBPPbokSpceBscMngSelectAllUsgspceinflist();
			Object __pBPPbokSpceBscMngSelectAllUsgspceinflist= other.getpBPPbokSpceBscMngSelectAllUsgspceinflist();
			if ( _pBPPbokSpceBscMngSelectAllUsgspceinflist== null ) { if ( __pBPPbokSpceBscMngSelectAllUsgspceinflist!= null ) return false; }
			else if ( !_pBPPbokSpceBscMngSelectAllUsgspceinflist.equals(__pBPPbokSpceBscMngSelectAllUsgspceinflist) ) return false;
		}
		{
			Object _paySumAm= getPaySumAm();
			Object __paySumAm= other.getPaySumAm();
			if ( _paySumAm== null ) { if ( __paySumAm!= null ) return false; }
			else if ( !_paySumAm.equals(__paySumAm) ) return false;
		}
		{
			Object _rcvSumAm= getRcvSumAm();
			Object __rcvSumAm= other.getRcvSumAm();
			if ( _rcvSumAm== null ) { if ( __rcvSumAm!= null ) return false; }
			else if ( !_rcvSumAm.equals(__rcvSumAm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngSelectMainspceinf_ODT.class.getName()).append(":\n");
		sb.append("\tacno: ");
		sb.append(acno==null?"null":getAcno());
		sb.append("\n");
		sb.append("\tacnoBal: ");
		sb.append(acnoBal==null?"null":getAcnoBal());
		sb.append("\n");
		sb.append("\tsplitAvlAm: ");
		sb.append(splitAvlAm==null?"null":getSplitAvlAm());
		sb.append("\n");
		sb.append("\tprdNm: ");
		sb.append(prdNm==null?"null":getPrdNm());
		sb.append("\n");
		sb.append("\ttrnStcd: ");
		sb.append(trnStcd==null?"null":getTrnStcd());
		sb.append("\n");
		sb.append("\trgsTrnDt: ");
		sb.append(rgsTrnDt==null?"null":getRgsTrnDt());
		sb.append("\n");
		sb.append("\trvkTrnDt: ");
		sb.append(rvkTrnDt==null?"null":getRvkTrnDt());
		sb.append("\n");
		sb.append("\trvkRsnTxt: ");
		sb.append(rvkRsnTxt==null?"null":getRvkRsnTxt());
		sb.append("\n");
		sb.append("\tbkAppPushAgrYn: ");
		sb.append(bkAppPushAgrYn==null?"null":getBkAppPushAgrYn());
		sb.append("\n");
		sb.append("\tpBPPbokSpceBscMngSelectAllUsgspceinflist: ");
		if ( pBPPbokSpceBscMngSelectAllUsgspceinflist== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPPbokSpceBscMngSelectAllUsgspceinflist.size());
			sb.append("(items)\n");
	
			int max= (10<pBPPbokSpceBscMngSelectAllUsgspceinflist.size())?10:pBPPbokSpceBscMngSelectAllUsgspceinflist.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPPbokSpceBscMngSelectAllUsgspceinflist[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPPbokSpceBscMngSelectAllUsgspceinflist.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPPbokSpceBscMngSelectAllUsgspceinflist.size() ){
				sb.append("\tpBPPbokSpceBscMngSelectAllUsgspceinflist[.] : ").append("more ").append((pBPPbokSpceBscMngSelectAllUsgspceinflist.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tpaySumAm: ");
		sb.append(paySumAm==null?"null":getPaySumAm());
		sb.append("\n");
		sb.append("\trcvSumAm: ");
		sb.append(rcvSumAm==null?"null":getRcvSumAm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 20; /* acno */
		messageLen+= 18; /* acnoBal */
		messageLen+= 18; /* splitAvlAm */
		messageLen+= 100; /* prdNm */
		messageLen+= 1; /* trnStcd */
		messageLen+= 8; /* rgsTrnDt */
		messageLen+= 8; /* rvkTrnDt */
		messageLen+= 10; /* rvkRsnTxt */
		messageLen+= 1; /* bkAppPushAgrYn */
		{/*pBPPbokSpceBscMngSelectAllUsgspceinflist*/
			int size=1;
			int count= pBPPbokSpceBscMngSelectAllUsgspceinflist == null ? 0 : pBPPbokSpceBscMngSelectAllUsgspceinflist.size();
			int min= size > count?count:size;
			PBPPbokSpceBscMngSelectUsgspceinf_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceBscMngSelectUsgspceinf_ODT element= pBPPbokSpceBscMngSelectAllUsgspceinflist.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectUsgspceinf_ODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 18; /* paySumAm */
		messageLen+= 18; /* rcvSumAm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("acno");
		list.add("acnoBal");
		list.add("splitAvlAm");
		list.add("prdNm");
		list.add("trnStcd");
		list.add("rgsTrnDt");
		list.add("rvkTrnDt");
		list.add("rvkRsnTxt");
		list.add("bkAppPushAgrYn");
		list.add("pBPPbokSpceBscMngSelectAllUsgspceinflist");
		list.add("paySumAm");
		list.add("rcvSumAm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("acno", get("acno"));
		map.put("acnoBal", get("acnoBal"));
		map.put("splitAvlAm", get("splitAvlAm"));
		map.put("prdNm", get("prdNm"));
		map.put("trnStcd", get("trnStcd"));
		map.put("rgsTrnDt", get("rgsTrnDt"));
		map.put("rvkTrnDt", get("rvkTrnDt"));
		map.put("rvkRsnTxt", get("rvkRsnTxt"));
		map.put("bkAppPushAgrYn", get("bkAppPushAgrYn"));
		map.put("pBPPbokSpceBscMngSelectAllUsgspceinflist", get("pBPPbokSpceBscMngSelectAllUsgspceinflist"));
		map.put("paySumAm", get("paySumAm"));
		map.put("rcvSumAm", get("rcvSumAm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2988387:/* acno */
			return getAcno();
		case -1167209558:/* acnoBal */
			return getAcnoBal();
		case -367460759:/* splitAvlAm */
			return getSplitAvlAm();
		case 106929153:/* prdNm */
			return getPrdNm();
		case -1055857582:/* trnStcd */
			return getTrnStcd();
		case 1408913442:/* rgsTrnDt */
			return getRgsTrnDt();
		case 1607533561:/* rvkTrnDt */
			return getRvkTrnDt();
		case -1762386326:/* rvkRsnTxt */
			return getRvkRsnTxt();
		case 1743448079:/* bkAppPushAgrYn */
			return getBkAppPushAgrYn();
		case 1583871965:/* pBPPbokSpceBscMngSelectAllUsgspceinflist */
			return getpBPPbokSpceBscMngSelectAllUsgspceinflist();
		case 1359144975:/* paySumAm */
			return getPaySumAm();
		case -2056049038:/* rcvSumAm */
			return getRcvSumAm();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 2988387:/* acno */
			setAcno((String)value);
			break;
		case -1167209558:/* acnoBal */
			if ( value instanceof String ){
				setAcnoBal((String)value);
			}
			else if ( value instanceof Double ){
				setAcnoBal((Double)value);
			}
			else if ( value instanceof Long ){
				setAcnoBal((Long)value);
			}
			else{
				setAcnoBal((BigDecimal)value);
			}
			break;
		case -367460759:/* splitAvlAm */
			if ( value instanceof String ){
				setSplitAvlAm((String)value);
			}
			else if ( value instanceof Double ){
				setSplitAvlAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSplitAvlAm((Long)value);
			}
			else{
				setSplitAvlAm((BigDecimal)value);
			}
			break;
		case 106929153:/* prdNm */
			setPrdNm((String)value);
			break;
		case -1055857582:/* trnStcd */
			setTrnStcd((String)value);
			break;
		case 1408913442:/* rgsTrnDt */
			setRgsTrnDt((String)value);
			break;
		case 1607533561:/* rvkTrnDt */
			setRvkTrnDt((String)value);
			break;
		case -1762386326:/* rvkRsnTxt */
			setRvkRsnTxt((String)value);
			break;
		case 1743448079:/* bkAppPushAgrYn */
			setBkAppPushAgrYn((String)value);
			break;
		case 1583871965:/* pBPPbokSpceBscMngSelectAllUsgspceinflist */
			setpBPPbokSpceBscMngSelectAllUsgspceinflist((List<PBPPbokSpceBscMngSelectUsgspceinf_ODT>)value);
			break;
		case 1359144975:/* paySumAm */
			if ( value instanceof String ){
				setPaySumAm((String)value);
			}
			else if ( value instanceof Double ){
				setPaySumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setPaySumAm((Long)value);
			}
			else{
				setPaySumAm((BigDecimal)value);
			}
			break;
		case -2056049038:/* rcvSumAm */
			if ( value instanceof String ){
				setRcvSumAm((String)value);
			}
			else if ( value instanceof Double ){
				setRcvSumAm((Double)value);
			}
			else if ( value instanceof Long ){
				setRcvSumAm((Long)value);
			}
			else{
				setRcvSumAm((BigDecimal)value);
			}
			break;
		default:
			break;
		}
	}
	
}
