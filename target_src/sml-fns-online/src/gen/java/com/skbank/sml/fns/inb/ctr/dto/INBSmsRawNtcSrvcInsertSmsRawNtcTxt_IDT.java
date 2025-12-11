/**
 * BX Cloud - IO Java Source Generator
 */

package com.skbank.sml.fns.inb.ctr.dto;

import bxm.common.annotaion.BxmCategory;
import bxm.omm.annotation.BxmOmm_Field;
import bxm.omm.exception.CloneFailedException;
import bxm.omm.predict.FieldInfo;
import bxm.omm.predict.Predictable;
import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.skbank.sml.fns.inb.dto.INBSmsRawNtcTxtGrid_DTO;
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
 * SMS입출금통지.내용.컨트롤러.입력.IO
 */
@XmlType(propOrder={
	"fstlAct", "pwnoUsgYn", "encyPwno", "tgtAcno", "balNtrsnYn", "smsTmsLimAm", "tmsStaTm", "tmsEndTm", "atsSndLimYn", "cusInfNlkgYn", "feeFeKd", "feeDfpmLevyYn", "feeWdrGdncNtcYn", "gridCnt", "iNBSmsRawNtcTxtGrid_DTO"
}, name="INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT")
@XmlRootElement(name="INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT")
@BxmCategory(logicalName="SMS입출금통지.내용.컨트롤러.입력.IO", description="SMS입출금통지.내용.컨트롤러.입력.IO") 
public class INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1817223921L;
	
	
	
	/**
	 * 수수료결제계좌
	 */
	@ApiModelProperty(
		name = "fstlAct"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fstlAct")
	@BxmOmm_Field(length=15, decimal=0, description="수수료결제계좌", align="left", fill="")
	private String fstlAct= "";
	
	
	/**
	 * 비밀번호사용여부
	 */
	@ApiModelProperty(
		name = "pwnoUsgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("pwnoUsgYn")
	@BxmOmm_Field(length=1, decimal=0, description="비밀번호사용여부", align="left", fill="")
	private String pwnoUsgYn= "";
	
	
	/**
	 * 암호화비밀번호
	 */
	@ApiModelProperty(
		name = "encyPwno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("encyPwno")
	@BxmOmm_Field(length=32, decimal=0, description="암호화비밀번호", align="left", fill="")
	private String encyPwno= "";
	
	
	/**
	 * 대상계좌번호
	 */
	@ApiModelProperty(
		name = "tgtAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tgtAcno")
	@BxmOmm_Field(length=20, decimal=0, description="대상계좌번호", align="left", fill="")
	private String tgtAcno= "";
	
	
	/**
	 * 잔액미전송여부
	 */
	@ApiModelProperty(
		name = "balNtrsnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("balNtrsnYn")
	@BxmOmm_Field(length=1, decimal=0, description="잔액미전송여부", align="left", fill="")
	private String balNtrsnYn= "";
	
	
	/**
	 * SMS전송제한금액
	 */
	@ApiModelProperty(
		name = "smsTmsLimAm"
		, dataType = "java.math.BigDecimal"
		)
	@XmlElement
	@JsonProperty("smsTmsLimAm")
	@BxmOmm_Field(length=19, decimal=3, description="SMS전송제한금액", align="right", fill="")
	private BigDecimal smsTmsLimAm= new BigDecimal("0");
	
	
	/**
	 * 전송시작시각
	 */
	@ApiModelProperty(
		name = "tmsStaTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmsStaTm")
	@BxmOmm_Field(length=6, decimal=0, description="전송시작시각", align="left", fill="")
	private String tmsStaTm= "";
	
	
	/**
	 * 전송종료시각
	 */
	@ApiModelProperty(
		name = "tmsEndTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("tmsEndTm")
	@BxmOmm_Field(length=6, decimal=0, description="전송종료시각", align="left", fill="")
	private String tmsEndTm= "";
	
	
	/**
	 * 자동이체발송제한여부
	 */
	@ApiModelProperty(
		name = "atsSndLimYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("atsSndLimYn")
	@BxmOmm_Field(length=1, decimal=0, description="자동이체발송제한여부", align="left", fill="")
	private String atsSndLimYn= "";
	
	
	/**
	 * 고객정보미연동여부
	 */
	@ApiModelProperty(
		name = "cusInfNlkgYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("cusInfNlkgYn")
	@BxmOmm_Field(length=1, decimal=0, description="고객정보미연동여부", align="left", fill="")
	private String cusInfNlkgYn= "";
	
	
	/**
	 * 수수료요금종류
	 */
	@ApiModelProperty(
		name = "feeFeKd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("feeFeKd")
	@BxmOmm_Field(length=1, decimal=0, description="수수료요금종류", align="left", fill="")
	private String feeFeKd= "";
	
	
	/**
	 * 수수료후불징수여부
	 */
	@ApiModelProperty(
		name = "feeDfpmLevyYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("feeDfpmLevyYn")
	@BxmOmm_Field(length=1, decimal=0, description="수수료후불징수여부", align="left", fill="")
	private String feeDfpmLevyYn= "";
	
	
	/**
	 * 수수료출금안내통지여부
	 */
	@ApiModelProperty(
		name = "feeWdrGdncNtcYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("feeWdrGdncNtcYn")
	@BxmOmm_Field(length=1, decimal=0, description="수수료출금안내통지여부", align="left", fill="")
	private String feeWdrGdncNtcYn= "";
	
	
	/**
	 * 그리드건수
	 */
	@ApiModelProperty(
		name = "gridCnt"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("gridCnt")
	@BxmOmm_Field(length=5, decimal=0, description="그리드건수", align="right", fill="")
	private Integer gridCnt= 0;
	
	
	/**
	 * SMS입출금통지 그리드
	 */
	@ApiModelProperty(
		name = "iNBSmsRawNtcTxtGrid_DTO"
		, dataType = "[Lcom.skbank.sml.fns.inb.dto.INBSmsRawNtcTxtGrid_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("iNBSmsRawNtcTxtGrid_DTO")
	@BxmOmm_Field(length=0, decimal=0, description="SMS입출금통지 그리드", align="left", fill="", arrayReference="1")
	private List<INBSmsRawNtcTxtGrid_DTO> iNBSmsRawNtcTxtGrid_DTO= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fstlAct= false;
	protected final boolean isSet_fstlAct(){
		return this.isSet_fstlAct;
	}
	private void setIsSet_fstlAct(boolean value){
		this.isSet_fstlAct= value;
	}
	/**
	 * 수수료결제계좌
	 */
	@XmlTransient
	public String getFstlAct(){
		return this.fstlAct;
	}
	
	/**
	 * 수수료결제계좌
	 * 
	 * @param fstlAct 수수료결제계좌
	 */
	public void setFstlAct(String fstlAct){
		this.fstlAct= fstlAct;
		this.setIsSet_fstlAct(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pwnoUsgYn= false;
	protected final boolean isSet_pwnoUsgYn(){
		return this.isSet_pwnoUsgYn;
	}
	private void setIsSet_pwnoUsgYn(boolean value){
		this.isSet_pwnoUsgYn= value;
	}
	/**
	 * 비밀번호사용여부
	 */
	@XmlTransient
	public String getPwnoUsgYn(){
		return this.pwnoUsgYn;
	}
	
	/**
	 * 비밀번호사용여부
	 * 
	 * @param pwnoUsgYn 비밀번호사용여부
	 */
	public void setPwnoUsgYn(String pwnoUsgYn){
		this.pwnoUsgYn= pwnoUsgYn;
		this.setIsSet_pwnoUsgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_encyPwno= false;
	protected final boolean isSet_encyPwno(){
		return this.isSet_encyPwno;
	}
	private void setIsSet_encyPwno(boolean value){
		this.isSet_encyPwno= value;
	}
	/**
	 * 암호화비밀번호
	 */
	@XmlTransient
	public String getEncyPwno(){
		return this.encyPwno;
	}
	
	/**
	 * 암호화비밀번호
	 * 
	 * @param encyPwno 암호화비밀번호
	 */
	public void setEncyPwno(String encyPwno){
		this.encyPwno= encyPwno;
		this.setIsSet_encyPwno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tgtAcno= false;
	protected final boolean isSet_tgtAcno(){
		return this.isSet_tgtAcno;
	}
	private void setIsSet_tgtAcno(boolean value){
		this.isSet_tgtAcno= value;
	}
	/**
	 * 대상계좌번호
	 */
	@XmlTransient
	public String getTgtAcno(){
		return this.tgtAcno;
	}
	
	/**
	 * 대상계좌번호
	 * 
	 * @param tgtAcno 대상계좌번호
	 */
	public void setTgtAcno(String tgtAcno){
		this.tgtAcno= tgtAcno;
		this.setIsSet_tgtAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_balNtrsnYn= false;
	protected final boolean isSet_balNtrsnYn(){
		return this.isSet_balNtrsnYn;
	}
	private void setIsSet_balNtrsnYn(boolean value){
		this.isSet_balNtrsnYn= value;
	}
	/**
	 * 잔액미전송여부
	 */
	@XmlTransient
	public String getBalNtrsnYn(){
		return this.balNtrsnYn;
	}
	
	/**
	 * 잔액미전송여부
	 * 
	 * @param balNtrsnYn 잔액미전송여부
	 */
	public void setBalNtrsnYn(String balNtrsnYn){
		this.balNtrsnYn= balNtrsnYn;
		this.setIsSet_balNtrsnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_smsTmsLimAm= false;
	protected final boolean isSet_smsTmsLimAm(){
		return this.isSet_smsTmsLimAm;
	}
	private void setIsSet_smsTmsLimAm(boolean value){
		this.isSet_smsTmsLimAm= value;
	}
	/**
	 * SMS전송제한금액
	 * BigDecimal - Double value setter
	 *
	 * @Param smsTmsLimAm SMS전송제한금액
	 */
	public void setSmsTmsLimAm(double smsTmsLimAm) {
		setSmsTmsLimAm(BigDecimal.valueOf(smsTmsLimAm));
	}
	/**
	 * SMS전송제한금액
	 * BigDecimal - Long value setter
	 *
	 * @Param smsTmsLimAm SMS전송제한금액
	 */
	public void setSmsTmsLimAm(long smsTmsLimAm) {
		setSmsTmsLimAm(BigDecimal.valueOf(smsTmsLimAm));
	}
	/**
	 * SMS전송제한금액
	 * BigDecimal - String value setter
	 *
	 * @Param smsTmsLimAm SMS전송제한금액
	 */
	public void setSmsTmsLimAm(String smsTmsLimAm) {
		setSmsTmsLimAm(new BigDecimal(smsTmsLimAm));
	}
	/**
	 * SMS전송제한금액
	 */
	@XmlTransient
	public BigDecimal getSmsTmsLimAm(){
		return this.smsTmsLimAm;
	}
	
	/**
	 * SMS전송제한금액
	 * 
	 * @param smsTmsLimAm SMS전송제한금액
	 */
	@JsonSetter("smsTmsLimAm")
	public void setSmsTmsLimAm(BigDecimal smsTmsLimAm){
		this.smsTmsLimAm= smsTmsLimAm;
		this.setIsSet_smsTmsLimAm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmsStaTm= false;
	protected final boolean isSet_tmsStaTm(){
		return this.isSet_tmsStaTm;
	}
	private void setIsSet_tmsStaTm(boolean value){
		this.isSet_tmsStaTm= value;
	}
	/**
	 * 전송시작시각
	 */
	@XmlTransient
	public String getTmsStaTm(){
		return this.tmsStaTm;
	}
	
	/**
	 * 전송시작시각
	 * 
	 * @param tmsStaTm 전송시작시각
	 */
	public void setTmsStaTm(String tmsStaTm){
		this.tmsStaTm= tmsStaTm;
		this.setIsSet_tmsStaTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_tmsEndTm= false;
	protected final boolean isSet_tmsEndTm(){
		return this.isSet_tmsEndTm;
	}
	private void setIsSet_tmsEndTm(boolean value){
		this.isSet_tmsEndTm= value;
	}
	/**
	 * 전송종료시각
	 */
	@XmlTransient
	public String getTmsEndTm(){
		return this.tmsEndTm;
	}
	
	/**
	 * 전송종료시각
	 * 
	 * @param tmsEndTm 전송종료시각
	 */
	public void setTmsEndTm(String tmsEndTm){
		this.tmsEndTm= tmsEndTm;
		this.setIsSet_tmsEndTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_atsSndLimYn= false;
	protected final boolean isSet_atsSndLimYn(){
		return this.isSet_atsSndLimYn;
	}
	private void setIsSet_atsSndLimYn(boolean value){
		this.isSet_atsSndLimYn= value;
	}
	/**
	 * 자동이체발송제한여부
	 */
	@XmlTransient
	public String getAtsSndLimYn(){
		return this.atsSndLimYn;
	}
	
	/**
	 * 자동이체발송제한여부
	 * 
	 * @param atsSndLimYn 자동이체발송제한여부
	 */
	public void setAtsSndLimYn(String atsSndLimYn){
		this.atsSndLimYn= atsSndLimYn;
		this.setIsSet_atsSndLimYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_cusInfNlkgYn= false;
	protected final boolean isSet_cusInfNlkgYn(){
		return this.isSet_cusInfNlkgYn;
	}
	private void setIsSet_cusInfNlkgYn(boolean value){
		this.isSet_cusInfNlkgYn= value;
	}
	/**
	 * 고객정보미연동여부
	 */
	@XmlTransient
	public String getCusInfNlkgYn(){
		return this.cusInfNlkgYn;
	}
	
	/**
	 * 고객정보미연동여부
	 * 
	 * @param cusInfNlkgYn 고객정보미연동여부
	 */
	public void setCusInfNlkgYn(String cusInfNlkgYn){
		this.cusInfNlkgYn= cusInfNlkgYn;
		this.setIsSet_cusInfNlkgYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feeFeKd= false;
	protected final boolean isSet_feeFeKd(){
		return this.isSet_feeFeKd;
	}
	private void setIsSet_feeFeKd(boolean value){
		this.isSet_feeFeKd= value;
	}
	/**
	 * 수수료요금종류
	 */
	@XmlTransient
	public String getFeeFeKd(){
		return this.feeFeKd;
	}
	
	/**
	 * 수수료요금종류
	 * 
	 * @param feeFeKd 수수료요금종류
	 */
	public void setFeeFeKd(String feeFeKd){
		this.feeFeKd= feeFeKd;
		this.setIsSet_feeFeKd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feeDfpmLevyYn= false;
	protected final boolean isSet_feeDfpmLevyYn(){
		return this.isSet_feeDfpmLevyYn;
	}
	private void setIsSet_feeDfpmLevyYn(boolean value){
		this.isSet_feeDfpmLevyYn= value;
	}
	/**
	 * 수수료후불징수여부
	 */
	@XmlTransient
	public String getFeeDfpmLevyYn(){
		return this.feeDfpmLevyYn;
	}
	
	/**
	 * 수수료후불징수여부
	 * 
	 * @param feeDfpmLevyYn 수수료후불징수여부
	 */
	public void setFeeDfpmLevyYn(String feeDfpmLevyYn){
		this.feeDfpmLevyYn= feeDfpmLevyYn;
		this.setIsSet_feeDfpmLevyYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_feeWdrGdncNtcYn= false;
	protected final boolean isSet_feeWdrGdncNtcYn(){
		return this.isSet_feeWdrGdncNtcYn;
	}
	private void setIsSet_feeWdrGdncNtcYn(boolean value){
		this.isSet_feeWdrGdncNtcYn= value;
	}
	/**
	 * 수수료출금안내통지여부
	 */
	@XmlTransient
	public String getFeeWdrGdncNtcYn(){
		return this.feeWdrGdncNtcYn;
	}
	
	/**
	 * 수수료출금안내통지여부
	 * 
	 * @param feeWdrGdncNtcYn 수수료출금안내통지여부
	 */
	public void setFeeWdrGdncNtcYn(String feeWdrGdncNtcYn){
		this.feeWdrGdncNtcYn= feeWdrGdncNtcYn;
		this.setIsSet_feeWdrGdncNtcYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_gridCnt= false;
	protected final boolean isSet_gridCnt(){
		return this.isSet_gridCnt;
	}
	private void setIsSet_gridCnt(boolean value){
		this.isSet_gridCnt= value;
	}
	/**
	 * 그리드건수
	 */
	@XmlTransient
	public Integer getGridCnt(){
		return this.gridCnt;
	}
	
	/**
	 * 그리드건수
	 * 
	 * @param gridCnt 그리드건수
	 */
	public void setGridCnt(Integer gridCnt){
		this.gridCnt= gridCnt;
		this.setIsSet_gridCnt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_iNBSmsRawNtcTxtGrid_DTO= false;
	protected final boolean isSet_iNBSmsRawNtcTxtGrid_DTO(){
		return this.isSet_iNBSmsRawNtcTxtGrid_DTO;
	}
	private void setIsSet_iNBSmsRawNtcTxtGrid_DTO(boolean value){
		this.isSet_iNBSmsRawNtcTxtGrid_DTO= value;
	}
	/**
	 * SMS입출금통지 그리드
	 */
	@XmlTransient
	public List<INBSmsRawNtcTxtGrid_DTO> getiNBSmsRawNtcTxtGrid_DTO(){
		return iNBSmsRawNtcTxtGrid_DTO;
	}
	
	/**
	 * SMS입출금통지 그리드
	 * 
	 * @param iNBSmsRawNtcTxtGrid_DTO SMS입출금통지 그리드
	 */
	@JsonSetter("iNBSmsRawNtcTxtGrid_DTO")
	public void setiNBSmsRawNtcTxtGrid_DTO(List<INBSmsRawNtcTxtGrid_DTO> iNBSmsRawNtcTxtGrid_DTO){
		this.iNBSmsRawNtcTxtGrid_DTO= iNBSmsRawNtcTxtGrid_DTO;
		this.setIsSet_iNBSmsRawNtcTxtGrid_DTO(true);
	}
	
	public void setiNBSmsRawNtcTxtGrid_DTO(INBSmsRawNtcTxtGrid_DTO... items){
		List<INBSmsRawNtcTxtGrid_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( INBSmsRawNtcTxtGrid_DTO item: items ){
				_items.add(item);
			}
		}
		this.setiNBSmsRawNtcTxtGrid_DTO(_items);
	}
				
	@Override
	public INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT clone(){
		try{
			INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT object= (INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT)super.clone();
			if ( this.iNBSmsRawNtcTxtGrid_DTO== null ) object.iNBSmsRawNtcTxtGrid_DTO= null;
			else{
				List<INBSmsRawNtcTxtGrid_DTO> clonedList= new ArrayList<>(this.iNBSmsRawNtcTxtGrid_DTO.size());
				for( INBSmsRawNtcTxtGrid_DTO item : iNBSmsRawNtcTxtGrid_DTO ){
					clonedList.add((INBSmsRawNtcTxtGrid_DTO)item.clone());
				}
				object.iNBSmsRawNtcTxtGrid_DTO= clonedList;
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
		
		result= prime * result + ((this.fstlAct==null)?0:this.fstlAct.hashCode());
		result= prime * result + ((this.pwnoUsgYn==null)?0:this.pwnoUsgYn.hashCode());
		result= prime * result + ((this.encyPwno==null)?0:this.encyPwno.hashCode());
		result= prime * result + ((this.tgtAcno==null)?0:this.tgtAcno.hashCode());
		result= prime * result + ((this.balNtrsnYn==null)?0:this.balNtrsnYn.hashCode());
		result= prime * result + ((this.smsTmsLimAm==null)?0:this.smsTmsLimAm.hashCode());
		result= prime * result + ((this.tmsStaTm==null)?0:this.tmsStaTm.hashCode());
		result= prime * result + ((this.tmsEndTm==null)?0:this.tmsEndTm.hashCode());
		result= prime * result + ((this.atsSndLimYn==null)?0:this.atsSndLimYn.hashCode());
		result= prime * result + ((this.cusInfNlkgYn==null)?0:this.cusInfNlkgYn.hashCode());
		result= prime * result + ((this.feeFeKd==null)?0:this.feeFeKd.hashCode());
		result= prime * result + ((this.feeDfpmLevyYn==null)?0:this.feeDfpmLevyYn.hashCode());
		result= prime * result + ((this.feeWdrGdncNtcYn==null)?0:this.feeWdrGdncNtcYn.hashCode());
		result= prime * result + ((this.gridCnt==null)?0:this.gridCnt.hashCode());
		result= prime * result + ((this.iNBSmsRawNtcTxtGrid_DTO==null)?0:this.iNBSmsRawNtcTxtGrid_DTO.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT other= (INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT)obj;
		{
			Object _fstlAct= getFstlAct();
			Object __fstlAct= other.getFstlAct();
			if ( _fstlAct== null ) { if ( __fstlAct!= null ) return false; }
			else if ( !_fstlAct.equals(__fstlAct) ) return false;
		}
		{
			Object _pwnoUsgYn= getPwnoUsgYn();
			Object __pwnoUsgYn= other.getPwnoUsgYn();
			if ( _pwnoUsgYn== null ) { if ( __pwnoUsgYn!= null ) return false; }
			else if ( !_pwnoUsgYn.equals(__pwnoUsgYn) ) return false;
		}
		{
			Object _encyPwno= getEncyPwno();
			Object __encyPwno= other.getEncyPwno();
			if ( _encyPwno== null ) { if ( __encyPwno!= null ) return false; }
			else if ( !_encyPwno.equals(__encyPwno) ) return false;
		}
		{
			Object _tgtAcno= getTgtAcno();
			Object __tgtAcno= other.getTgtAcno();
			if ( _tgtAcno== null ) { if ( __tgtAcno!= null ) return false; }
			else if ( !_tgtAcno.equals(__tgtAcno) ) return false;
		}
		{
			Object _balNtrsnYn= getBalNtrsnYn();
			Object __balNtrsnYn= other.getBalNtrsnYn();
			if ( _balNtrsnYn== null ) { if ( __balNtrsnYn!= null ) return false; }
			else if ( !_balNtrsnYn.equals(__balNtrsnYn) ) return false;
		}
		{
			Object _smsTmsLimAm= getSmsTmsLimAm();
			Object __smsTmsLimAm= other.getSmsTmsLimAm();
			if ( _smsTmsLimAm== null ) { if ( __smsTmsLimAm!= null ) return false; }
			else if ( !_smsTmsLimAm.equals(__smsTmsLimAm) ) return false;
		}
		{
			Object _tmsStaTm= getTmsStaTm();
			Object __tmsStaTm= other.getTmsStaTm();
			if ( _tmsStaTm== null ) { if ( __tmsStaTm!= null ) return false; }
			else if ( !_tmsStaTm.equals(__tmsStaTm) ) return false;
		}
		{
			Object _tmsEndTm= getTmsEndTm();
			Object __tmsEndTm= other.getTmsEndTm();
			if ( _tmsEndTm== null ) { if ( __tmsEndTm!= null ) return false; }
			else if ( !_tmsEndTm.equals(__tmsEndTm) ) return false;
		}
		{
			Object _atsSndLimYn= getAtsSndLimYn();
			Object __atsSndLimYn= other.getAtsSndLimYn();
			if ( _atsSndLimYn== null ) { if ( __atsSndLimYn!= null ) return false; }
			else if ( !_atsSndLimYn.equals(__atsSndLimYn) ) return false;
		}
		{
			Object _cusInfNlkgYn= getCusInfNlkgYn();
			Object __cusInfNlkgYn= other.getCusInfNlkgYn();
			if ( _cusInfNlkgYn== null ) { if ( __cusInfNlkgYn!= null ) return false; }
			else if ( !_cusInfNlkgYn.equals(__cusInfNlkgYn) ) return false;
		}
		{
			Object _feeFeKd= getFeeFeKd();
			Object __feeFeKd= other.getFeeFeKd();
			if ( _feeFeKd== null ) { if ( __feeFeKd!= null ) return false; }
			else if ( !_feeFeKd.equals(__feeFeKd) ) return false;
		}
		{
			Object _feeDfpmLevyYn= getFeeDfpmLevyYn();
			Object __feeDfpmLevyYn= other.getFeeDfpmLevyYn();
			if ( _feeDfpmLevyYn== null ) { if ( __feeDfpmLevyYn!= null ) return false; }
			else if ( !_feeDfpmLevyYn.equals(__feeDfpmLevyYn) ) return false;
		}
		{
			Object _feeWdrGdncNtcYn= getFeeWdrGdncNtcYn();
			Object __feeWdrGdncNtcYn= other.getFeeWdrGdncNtcYn();
			if ( _feeWdrGdncNtcYn== null ) { if ( __feeWdrGdncNtcYn!= null ) return false; }
			else if ( !_feeWdrGdncNtcYn.equals(__feeWdrGdncNtcYn) ) return false;
		}
		{
			Object _gridCnt= getGridCnt();
			Object __gridCnt= other.getGridCnt();
			if ( _gridCnt== null ) { if ( __gridCnt!= null ) return false; }
			else if ( !_gridCnt.equals(__gridCnt) ) return false;
		}
		{
			Object _iNBSmsRawNtcTxtGrid_DTO= getiNBSmsRawNtcTxtGrid_DTO();
			Object __iNBSmsRawNtcTxtGrid_DTO= other.getiNBSmsRawNtcTxtGrid_DTO();
			if ( _iNBSmsRawNtcTxtGrid_DTO== null ) { if ( __iNBSmsRawNtcTxtGrid_DTO!= null ) return false; }
			else if ( !_iNBSmsRawNtcTxtGrid_DTO.equals(__iNBSmsRawNtcTxtGrid_DTO) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(INBSmsRawNtcSrvcInsertSmsRawNtcTxt_IDT.class.getName()).append(":\n");
		sb.append("\tfstlAct: ");
		sb.append(fstlAct==null?"null":getFstlAct());
		sb.append("\n");
		sb.append("\tpwnoUsgYn: ");
		sb.append(pwnoUsgYn==null?"null":getPwnoUsgYn());
		sb.append("\n");
		sb.append("\tencyPwno: ");
		sb.append(encyPwno==null?"null":getEncyPwno());
		sb.append("\n");
		sb.append("\ttgtAcno: ");
		sb.append(tgtAcno==null?"null":getTgtAcno());
		sb.append("\n");
		sb.append("\tbalNtrsnYn: ");
		sb.append(balNtrsnYn==null?"null":getBalNtrsnYn());
		sb.append("\n");
		sb.append("\tsmsTmsLimAm: ");
		sb.append(smsTmsLimAm==null?"null":getSmsTmsLimAm());
		sb.append("\n");
		sb.append("\ttmsStaTm: ");
		sb.append(tmsStaTm==null?"null":getTmsStaTm());
		sb.append("\n");
		sb.append("\ttmsEndTm: ");
		sb.append(tmsEndTm==null?"null":getTmsEndTm());
		sb.append("\n");
		sb.append("\tatsSndLimYn: ");
		sb.append(atsSndLimYn==null?"null":getAtsSndLimYn());
		sb.append("\n");
		sb.append("\tcusInfNlkgYn: ");
		sb.append(cusInfNlkgYn==null?"null":getCusInfNlkgYn());
		sb.append("\n");
		sb.append("\tfeeFeKd: ");
		sb.append(feeFeKd==null?"null":getFeeFeKd());
		sb.append("\n");
		sb.append("\tfeeDfpmLevyYn: ");
		sb.append(feeDfpmLevyYn==null?"null":getFeeDfpmLevyYn());
		sb.append("\n");
		sb.append("\tfeeWdrGdncNtcYn: ");
		sb.append(feeWdrGdncNtcYn==null?"null":getFeeWdrGdncNtcYn());
		sb.append("\n");
		sb.append("\tgridCnt: ");
		sb.append(gridCnt==null?"null":getGridCnt());
		sb.append("\n");
		sb.append("\tiNBSmsRawNtcTxtGrid_DTO: ");
		if ( iNBSmsRawNtcTxtGrid_DTO== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(iNBSmsRawNtcTxtGrid_DTO.size());
			sb.append("(items)\n");
	
			int max= (10<iNBSmsRawNtcTxtGrid_DTO.size())?10:iNBSmsRawNtcTxtGrid_DTO.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tiNBSmsRawNtcTxtGrid_DTO[");
				sb.append(i);
				sb.append("] : ");
				sb.append(iNBSmsRawNtcTxtGrid_DTO.get(i));
				sb.append("\n");
			}
	
			if ( max < iNBSmsRawNtcTxtGrid_DTO.size() ){
				sb.append("\tiNBSmsRawNtcTxtGrid_DTO[.] : ").append("more ").append((iNBSmsRawNtcTxtGrid_DTO.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 15; /* fstlAct */
		messageLen+= 1; /* pwnoUsgYn */
		messageLen+= 32; /* encyPwno */
		messageLen+= 20; /* tgtAcno */
		messageLen+= 1; /* balNtrsnYn */
		messageLen+= 19; /* smsTmsLimAm */
		messageLen+= 6; /* tmsStaTm */
		messageLen+= 6; /* tmsEndTm */
		messageLen+= 1; /* atsSndLimYn */
		messageLen+= 1; /* cusInfNlkgYn */
		messageLen+= 1; /* feeFeKd */
		messageLen+= 1; /* feeDfpmLevyYn */
		messageLen+= 1; /* feeWdrGdncNtcYn */
		messageLen+= 5; /* gridCnt */
		{/*iNBSmsRawNtcTxtGrid_DTO*/
			int size=1;
			int count= iNBSmsRawNtcTxtGrid_DTO == null ? 0 : iNBSmsRawNtcTxtGrid_DTO.size();
			int min= size > count?count:size;
			INBSmsRawNtcTxtGrid_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					INBSmsRawNtcTxtGrid_DTO element= iNBSmsRawNtcTxtGrid_DTO.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.inb.dto.INBSmsRawNtcTxtGrid_DTO();
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
	
		list.add("fstlAct");
		list.add("pwnoUsgYn");
		list.add("encyPwno");
		list.add("tgtAcno");
		list.add("balNtrsnYn");
		list.add("smsTmsLimAm");
		list.add("tmsStaTm");
		list.add("tmsEndTm");
		list.add("atsSndLimYn");
		list.add("cusInfNlkgYn");
		list.add("feeFeKd");
		list.add("feeDfpmLevyYn");
		list.add("feeWdrGdncNtcYn");
		list.add("gridCnt");
		list.add("iNBSmsRawNtcTxtGrid_DTO");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("fstlAct", get("fstlAct"));
		map.put("pwnoUsgYn", get("pwnoUsgYn"));
		map.put("encyPwno", get("encyPwno"));
		map.put("tgtAcno", get("tgtAcno"));
		map.put("balNtrsnYn", get("balNtrsnYn"));
		map.put("smsTmsLimAm", get("smsTmsLimAm"));
		map.put("tmsStaTm", get("tmsStaTm"));
		map.put("tmsEndTm", get("tmsEndTm"));
		map.put("atsSndLimYn", get("atsSndLimYn"));
		map.put("cusInfNlkgYn", get("cusInfNlkgYn"));
		map.put("feeFeKd", get("feeFeKd"));
		map.put("feeDfpmLevyYn", get("feeDfpmLevyYn"));
		map.put("feeWdrGdncNtcYn", get("feeWdrGdncNtcYn"));
		map.put("gridCnt", get("gridCnt"));
		map.put("iNBSmsRawNtcTxtGrid_DTO", get("iNBSmsRawNtcTxtGrid_DTO"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -561141171:/* fstlAct */
			return getFstlAct();
		case -1529384618:/* pwnoUsgYn */
			return getPwnoUsgYn();
		case 1719874951:/* encyPwno */
			return getEncyPwno();
		case -1365789340:/* tgtAcno */
			return getTgtAcno();
		case 1872684911:/* balNtrsnYn */
			return getBalNtrsnYn();
		case -448336293:/* smsTmsLimAm */
			return getSmsTmsLimAm();
		case 1628745663:/* tmsStaTm */
			return getTmsStaTm();
		case 1615640506:/* tmsEndTm */
			return getTmsEndTm();
		case -828320612:/* atsSndLimYn */
			return getAtsSndLimYn();
		case 1282743887:/* cusInfNlkgYn */
			return getCusInfNlkgYn();
		case -976900322:/* feeFeKd */
			return getFeeFeKd();
		case 1179486518:/* feeDfpmLevyYn */
			return getFeeDfpmLevyYn();
		case -1370044415:/* feeWdrGdncNtcYn */
			return getFeeWdrGdncNtcYn();
		case 287338563:/* gridCnt */
			return getGridCnt();
		case 951233957:/* iNBSmsRawNtcTxtGrid_DTO */
			return getiNBSmsRawNtcTxtGrid_DTO();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -561141171:/* fstlAct */
			setFstlAct((String)value);
			break;
		case -1529384618:/* pwnoUsgYn */
			setPwnoUsgYn((String)value);
			break;
		case 1719874951:/* encyPwno */
			setEncyPwno((String)value);
			break;
		case -1365789340:/* tgtAcno */
			setTgtAcno((String)value);
			break;
		case 1872684911:/* balNtrsnYn */
			setBalNtrsnYn((String)value);
			break;
		case -448336293:/* smsTmsLimAm */
			if ( value instanceof String ){
				setSmsTmsLimAm((String)value);
			}
			else if ( value instanceof Double ){
				setSmsTmsLimAm((Double)value);
			}
			else if ( value instanceof Long ){
				setSmsTmsLimAm((Long)value);
			}
			else{
				setSmsTmsLimAm((BigDecimal)value);
			}
			break;
		case 1628745663:/* tmsStaTm */
			setTmsStaTm((String)value);
			break;
		case 1615640506:/* tmsEndTm */
			setTmsEndTm((String)value);
			break;
		case -828320612:/* atsSndLimYn */
			setAtsSndLimYn((String)value);
			break;
		case 1282743887:/* cusInfNlkgYn */
			setCusInfNlkgYn((String)value);
			break;
		case -976900322:/* feeFeKd */
			setFeeFeKd((String)value);
			break;
		case 1179486518:/* feeDfpmLevyYn */
			setFeeDfpmLevyYn((String)value);
			break;
		case -1370044415:/* feeWdrGdncNtcYn */
			setFeeWdrGdncNtcYn((String)value);
			break;
		case 287338563:/* gridCnt */
			setGridCnt((Integer)value);
			break;
		case 951233957:/* iNBSmsRawNtcTxtGrid_DTO */
			setiNBSmsRawNtcTxtGrid_DTO((List<INBSmsRawNtcTxtGrid_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
