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
	"metMngNo", "metNtarRgsDt", "metNtarSrno", "metNtarTxt", "metNtarHdnYn", "metNtarDelYn", "metNtarChgMbhSrno", "metNtarChgDt", "metNtarChgTm", "lstDbChgId", "lstDbChgDtm"
}, name="MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT")
@XmlRootElement(name="MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT")
@BxmCategory(logicalName="공지사항정보수정 입력", description="") 
public class MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 168947723L;
	
	
	
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
	 * 모임공지사항등록일자
	 */
	@ApiModelProperty(
		name = "metNtarRgsDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarRgsDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임공지사항등록일자", align="left", fill="")
	private String metNtarRgsDt= "";
	
	
	/**
	 * 모임공지사항일련번호
	 */
	@ApiModelProperty(
		name = "metNtarSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metNtarSrno")
	@BxmOmm_Field(length=5, decimal=0, description="모임공지사항일련번호", align="right", fill="")
	private Integer metNtarSrno= 0;
	
	
	/**
	 * 모임공지사항내용
	 */
	@ApiModelProperty(
		name = "metNtarTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarTxt")
	@BxmOmm_Field(length=500, decimal=0, description="모임공지사항내용", align="left", fill="")
	private String metNtarTxt= "";
	
	
	/**
	 * 모임공지사항숨김여부
	 */
	@ApiModelProperty(
		name = "metNtarHdnYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarHdnYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임공지사항숨김여부", align="left", fill="")
	private String metNtarHdnYn= "";
	
	
	/**
	 * 모임공지사항삭제여부
	 */
	@ApiModelProperty(
		name = "metNtarDelYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarDelYn")
	@BxmOmm_Field(length=1, decimal=0, description="모임공지사항삭제여부", align="left", fill="")
	private String metNtarDelYn= "";
	
	
	/**
	 * 모임공지사항변경회원일련번호
	 */
	@ApiModelProperty(
		name = "metNtarChgMbhSrno"
		, dataType = "java.math.BigInteger"
		)
	@XmlElement
	@JsonProperty("metNtarChgMbhSrno")
	@BxmOmm_Field(length=7, decimal=0, description="모임공지사항변경회원일련번호", align="right", fill="")
	private Integer metNtarChgMbhSrno= 0;
	
	
	/**
	 * 모임공지사항변경일자
	 */
	@ApiModelProperty(
		name = "metNtarChgDt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarChgDt")
	@BxmOmm_Field(length=8, decimal=0, description="모임공지사항변경일자", align="left", fill="")
	private String metNtarChgDt= "";
	
	
	/**
	 * 모임공지사항변경시각
	 */
	@ApiModelProperty(
		name = "metNtarChgTm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metNtarChgTm")
	@BxmOmm_Field(length=6, decimal=0, description="모임공지사항변경시각", align="left", fill="")
	private String metNtarChgTm= "";
	
	
	/**
	 * 최종DB변경ID
	 */
	@ApiModelProperty(
		name = "lstDbChgId"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstDbChgId")
	@BxmOmm_Field(length=8, decimal=0, description="최종DB변경ID", align="left", fill="")
	private String lstDbChgId= "";
	
	
	/**
	 * 최종DB변경일시
	 */
	@ApiModelProperty(
		name = "lstDbChgDtm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("lstDbChgDtm")
	@BxmOmm_Field(length=20, decimal=0, description="최종DB변경일시", align="left", fill="")
	private String lstDbChgDtm= "";
	
	
	
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
	private boolean isSet_metNtarRgsDt= false;
	protected final boolean isSet_metNtarRgsDt(){
		return this.isSet_metNtarRgsDt;
	}
	private void setIsSet_metNtarRgsDt(boolean value){
		this.isSet_metNtarRgsDt= value;
	}
	/**
	 * 모임공지사항등록일자
	 */
	@XmlTransient
	public String getMetNtarRgsDt(){
		return this.metNtarRgsDt;
	}
	
	/**
	 * 모임공지사항등록일자
	 * 
	 * @param metNtarRgsDt 모임공지사항등록일자
	 */
	public void setMetNtarRgsDt(String metNtarRgsDt){
		this.metNtarRgsDt= metNtarRgsDt;
		this.setIsSet_metNtarRgsDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarSrno= false;
	protected final boolean isSet_metNtarSrno(){
		return this.isSet_metNtarSrno;
	}
	private void setIsSet_metNtarSrno(boolean value){
		this.isSet_metNtarSrno= value;
	}
	/**
	 * 모임공지사항일련번호
	 */
	@XmlTransient
	public Integer getMetNtarSrno(){
		return this.metNtarSrno;
	}
	
	/**
	 * 모임공지사항일련번호
	 * 
	 * @param metNtarSrno 모임공지사항일련번호
	 */
	public void setMetNtarSrno(Integer metNtarSrno){
		this.metNtarSrno= metNtarSrno;
		this.setIsSet_metNtarSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarTxt= false;
	protected final boolean isSet_metNtarTxt(){
		return this.isSet_metNtarTxt;
	}
	private void setIsSet_metNtarTxt(boolean value){
		this.isSet_metNtarTxt= value;
	}
	/**
	 * 모임공지사항내용
	 */
	@XmlTransient
	public String getMetNtarTxt(){
		return this.metNtarTxt;
	}
	
	/**
	 * 모임공지사항내용
	 * 
	 * @param metNtarTxt 모임공지사항내용
	 */
	public void setMetNtarTxt(String metNtarTxt){
		this.metNtarTxt= metNtarTxt;
		this.setIsSet_metNtarTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarHdnYn= false;
	protected final boolean isSet_metNtarHdnYn(){
		return this.isSet_metNtarHdnYn;
	}
	private void setIsSet_metNtarHdnYn(boolean value){
		this.isSet_metNtarHdnYn= value;
	}
	/**
	 * 모임공지사항숨김여부
	 */
	@XmlTransient
	public String getMetNtarHdnYn(){
		return this.metNtarHdnYn;
	}
	
	/**
	 * 모임공지사항숨김여부
	 * 
	 * @param metNtarHdnYn 모임공지사항숨김여부
	 */
	public void setMetNtarHdnYn(String metNtarHdnYn){
		this.metNtarHdnYn= metNtarHdnYn;
		this.setIsSet_metNtarHdnYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarDelYn= false;
	protected final boolean isSet_metNtarDelYn(){
		return this.isSet_metNtarDelYn;
	}
	private void setIsSet_metNtarDelYn(boolean value){
		this.isSet_metNtarDelYn= value;
	}
	/**
	 * 모임공지사항삭제여부
	 */
	@XmlTransient
	public String getMetNtarDelYn(){
		return this.metNtarDelYn;
	}
	
	/**
	 * 모임공지사항삭제여부
	 * 
	 * @param metNtarDelYn 모임공지사항삭제여부
	 */
	public void setMetNtarDelYn(String metNtarDelYn){
		this.metNtarDelYn= metNtarDelYn;
		this.setIsSet_metNtarDelYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarChgMbhSrno= false;
	protected final boolean isSet_metNtarChgMbhSrno(){
		return this.isSet_metNtarChgMbhSrno;
	}
	private void setIsSet_metNtarChgMbhSrno(boolean value){
		this.isSet_metNtarChgMbhSrno= value;
	}
	/**
	 * 모임공지사항변경회원일련번호
	 */
	@XmlTransient
	public Integer getMetNtarChgMbhSrno(){
		return this.metNtarChgMbhSrno;
	}
	
	/**
	 * 모임공지사항변경회원일련번호
	 * 
	 * @param metNtarChgMbhSrno 모임공지사항변경회원일련번호
	 */
	public void setMetNtarChgMbhSrno(Integer metNtarChgMbhSrno){
		this.metNtarChgMbhSrno= metNtarChgMbhSrno;
		this.setIsSet_metNtarChgMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarChgDt= false;
	protected final boolean isSet_metNtarChgDt(){
		return this.isSet_metNtarChgDt;
	}
	private void setIsSet_metNtarChgDt(boolean value){
		this.isSet_metNtarChgDt= value;
	}
	/**
	 * 모임공지사항변경일자
	 */
	@XmlTransient
	public String getMetNtarChgDt(){
		return this.metNtarChgDt;
	}
	
	/**
	 * 모임공지사항변경일자
	 * 
	 * @param metNtarChgDt 모임공지사항변경일자
	 */
	public void setMetNtarChgDt(String metNtarChgDt){
		this.metNtarChgDt= metNtarChgDt;
		this.setIsSet_metNtarChgDt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_metNtarChgTm= false;
	protected final boolean isSet_metNtarChgTm(){
		return this.isSet_metNtarChgTm;
	}
	private void setIsSet_metNtarChgTm(boolean value){
		this.isSet_metNtarChgTm= value;
	}
	/**
	 * 모임공지사항변경시각
	 */
	@XmlTransient
	public String getMetNtarChgTm(){
		return this.metNtarChgTm;
	}
	
	/**
	 * 모임공지사항변경시각
	 * 
	 * @param metNtarChgTm 모임공지사항변경시각
	 */
	public void setMetNtarChgTm(String metNtarChgTm){
		this.metNtarChgTm= metNtarChgTm;
		this.setIsSet_metNtarChgTm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstDbChgId= false;
	protected final boolean isSet_lstDbChgId(){
		return this.isSet_lstDbChgId;
	}
	private void setIsSet_lstDbChgId(boolean value){
		this.isSet_lstDbChgId= value;
	}
	/**
	 * 최종DB변경ID
	 */
	@XmlTransient
	public String getLstDbChgId(){
		return this.lstDbChgId;
	}
	
	/**
	 * 최종DB변경ID
	 * 
	 * @param lstDbChgId 최종DB변경ID
	 */
	public void setLstDbChgId(String lstDbChgId){
		this.lstDbChgId= lstDbChgId;
		this.setIsSet_lstDbChgId(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_lstDbChgDtm= false;
	protected final boolean isSet_lstDbChgDtm(){
		return this.isSet_lstDbChgDtm;
	}
	private void setIsSet_lstDbChgDtm(boolean value){
		this.isSet_lstDbChgDtm= value;
	}
	/**
	 * 최종DB변경일시
	 */
	@XmlTransient
	public String getLstDbChgDtm(){
		return this.lstDbChgDtm;
	}
	
	/**
	 * 최종DB변경일시
	 * 
	 * @param lstDbChgDtm 최종DB변경일시
	 */
	public void setLstDbChgDtm(String lstDbChgDtm){
		this.lstDbChgDtm= lstDbChgDtm;
		this.setIsSet_lstDbChgDtm(true);
	}
				
	@Override
	public MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT clone(){
		try{
			MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT object= (MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT)super.clone();
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
		result= prime * result + ((this.metNtarRgsDt==null)?0:this.metNtarRgsDt.hashCode());
		result= prime * result + ((this.metNtarSrno==null)?0:this.metNtarSrno.hashCode());
		result= prime * result + ((this.metNtarTxt==null)?0:this.metNtarTxt.hashCode());
		result= prime * result + ((this.metNtarHdnYn==null)?0:this.metNtarHdnYn.hashCode());
		result= prime * result + ((this.metNtarDelYn==null)?0:this.metNtarDelYn.hashCode());
		result= prime * result + ((this.metNtarChgMbhSrno==null)?0:this.metNtarChgMbhSrno.hashCode());
		result= prime * result + ((this.metNtarChgDt==null)?0:this.metNtarChgDt.hashCode());
		result= prime * result + ((this.metNtarChgTm==null)?0:this.metNtarChgTm.hashCode());
		result= prime * result + ((this.lstDbChgId==null)?0:this.lstDbChgId.hashCode());
		result= prime * result + ((this.lstDbChgDtm==null)?0:this.lstDbChgDtm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT other= (MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metNtarRgsDt= getMetNtarRgsDt();
			Object __metNtarRgsDt= other.getMetNtarRgsDt();
			if ( _metNtarRgsDt== null ) { if ( __metNtarRgsDt!= null ) return false; }
			else if ( !_metNtarRgsDt.equals(__metNtarRgsDt) ) return false;
		}
		{
			Object _metNtarSrno= getMetNtarSrno();
			Object __metNtarSrno= other.getMetNtarSrno();
			if ( _metNtarSrno== null ) { if ( __metNtarSrno!= null ) return false; }
			else if ( !_metNtarSrno.equals(__metNtarSrno) ) return false;
		}
		{
			Object _metNtarTxt= getMetNtarTxt();
			Object __metNtarTxt= other.getMetNtarTxt();
			if ( _metNtarTxt== null ) { if ( __metNtarTxt!= null ) return false; }
			else if ( !_metNtarTxt.equals(__metNtarTxt) ) return false;
		}
		{
			Object _metNtarHdnYn= getMetNtarHdnYn();
			Object __metNtarHdnYn= other.getMetNtarHdnYn();
			if ( _metNtarHdnYn== null ) { if ( __metNtarHdnYn!= null ) return false; }
			else if ( !_metNtarHdnYn.equals(__metNtarHdnYn) ) return false;
		}
		{
			Object _metNtarDelYn= getMetNtarDelYn();
			Object __metNtarDelYn= other.getMetNtarDelYn();
			if ( _metNtarDelYn== null ) { if ( __metNtarDelYn!= null ) return false; }
			else if ( !_metNtarDelYn.equals(__metNtarDelYn) ) return false;
		}
		{
			Object _metNtarChgMbhSrno= getMetNtarChgMbhSrno();
			Object __metNtarChgMbhSrno= other.getMetNtarChgMbhSrno();
			if ( _metNtarChgMbhSrno== null ) { if ( __metNtarChgMbhSrno!= null ) return false; }
			else if ( !_metNtarChgMbhSrno.equals(__metNtarChgMbhSrno) ) return false;
		}
		{
			Object _metNtarChgDt= getMetNtarChgDt();
			Object __metNtarChgDt= other.getMetNtarChgDt();
			if ( _metNtarChgDt== null ) { if ( __metNtarChgDt!= null ) return false; }
			else if ( !_metNtarChgDt.equals(__metNtarChgDt) ) return false;
		}
		{
			Object _metNtarChgTm= getMetNtarChgTm();
			Object __metNtarChgTm= other.getMetNtarChgTm();
			if ( _metNtarChgTm== null ) { if ( __metNtarChgTm!= null ) return false; }
			else if ( !_metNtarChgTm.equals(__metNtarChgTm) ) return false;
		}
		{
			Object _lstDbChgId= getLstDbChgId();
			Object __lstDbChgId= other.getLstDbChgId();
			if ( _lstDbChgId== null ) { if ( __lstDbChgId!= null ) return false; }
			else if ( !_lstDbChgId.equals(__lstDbChgId) ) return false;
		}
		{
			Object _lstDbChgDtm= getLstDbChgDtm();
			Object __lstDbChgDtm= other.getLstDbChgDtm();
			if ( _lstDbChgDtm== null ) { if ( __lstDbChgDtm!= null ) return false; }
			else if ( !_lstDbChgDtm.equals(__lstDbChgDtm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetNtarRgsDt: ");
		sb.append(metNtarRgsDt==null?"null":getMetNtarRgsDt());
		sb.append("\n");
		sb.append("\tmetNtarSrno: ");
		sb.append(metNtarSrno==null?"null":getMetNtarSrno());
		sb.append("\n");
		sb.append("\tmetNtarTxt: ");
		sb.append(metNtarTxt==null?"null":getMetNtarTxt());
		sb.append("\n");
		sb.append("\tmetNtarHdnYn: ");
		sb.append(metNtarHdnYn==null?"null":getMetNtarHdnYn());
		sb.append("\n");
		sb.append("\tmetNtarDelYn: ");
		sb.append(metNtarDelYn==null?"null":getMetNtarDelYn());
		sb.append("\n");
		sb.append("\tmetNtarChgMbhSrno: ");
		sb.append(metNtarChgMbhSrno==null?"null":getMetNtarChgMbhSrno());
		sb.append("\n");
		sb.append("\tmetNtarChgDt: ");
		sb.append(metNtarChgDt==null?"null":getMetNtarChgDt());
		sb.append("\n");
		sb.append("\tmetNtarChgTm: ");
		sb.append(metNtarChgTm==null?"null":getMetNtarChgTm());
		sb.append("\n");
		sb.append("\tlstDbChgId: ");
		sb.append(lstDbChgId==null?"null":getLstDbChgId());
		sb.append("\n");
		sb.append("\tlstDbChgDtm: ");
		sb.append(lstDbChgDtm==null?"null":getLstDbChgDtm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 9; /* metMngNo */
		messageLen+= 8; /* metNtarRgsDt */
		messageLen+= 5; /* metNtarSrno */
		messageLen+= 500; /* metNtarTxt */
		messageLen+= 1; /* metNtarHdnYn */
		messageLen+= 1; /* metNtarDelYn */
		messageLen+= 7; /* metNtarChgMbhSrno */
		messageLen+= 8; /* metNtarChgDt */
		messageLen+= 6; /* metNtarChgTm */
		messageLen+= 8; /* lstDbChgId */
		messageLen+= 20; /* lstDbChgDtm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metNtarRgsDt");
		list.add("metNtarSrno");
		list.add("metNtarTxt");
		list.add("metNtarHdnYn");
		list.add("metNtarDelYn");
		list.add("metNtarChgMbhSrno");
		list.add("metNtarChgDt");
		list.add("metNtarChgTm");
		list.add("lstDbChgId");
		list.add("lstDbChgDtm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metNtarRgsDt", get("metNtarRgsDt"));
		map.put("metNtarSrno", get("metNtarSrno"));
		map.put("metNtarTxt", get("metNtarTxt"));
		map.put("metNtarHdnYn", get("metNtarHdnYn"));
		map.put("metNtarDelYn", get("metNtarDelYn"));
		map.put("metNtarChgMbhSrno", get("metNtarChgMbhSrno"));
		map.put("metNtarChgDt", get("metNtarChgDt"));
		map.put("metNtarChgTm", get("metNtarChgTm"));
		map.put("lstDbChgId", get("lstDbChgId"));
		map.put("lstDbChgDtm", get("lstDbChgDtm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case -947890853:/* metNtarRgsDt */
			return getMetNtarRgsDt();
		case 1077841779:/* metNtarSrno */
			return getMetNtarSrno();
		case 2112980221:/* metNtarTxt */
			return getMetNtarTxt();
		case -957219596:/* metNtarHdnYn */
			return getMetNtarHdnYn();
		case -960885811:/* metNtarDelYn */
			return getMetNtarDelYn();
		case -1201644988:/* metNtarChgMbhSrno */
			return getMetNtarChgMbhSrno();
		case -961725409:/* metNtarChgDt */
			return getMetNtarChgDt();
		case -961724920:/* metNtarChgTm */
			return getMetNtarChgTm();
		case 1946521330:/* lstDbChgId */
			return getLstDbChgId();
		case 212614886:/* lstDbChgDtm */
			return getLstDbChgDtm();
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
		case -947890853:/* metNtarRgsDt */
			setMetNtarRgsDt((String)value);
			break;
		case 1077841779:/* metNtarSrno */
			setMetNtarSrno((Integer)value);
			break;
		case 2112980221:/* metNtarTxt */
			setMetNtarTxt((String)value);
			break;
		case -957219596:/* metNtarHdnYn */
			setMetNtarHdnYn((String)value);
			break;
		case -960885811:/* metNtarDelYn */
			setMetNtarDelYn((String)value);
			break;
		case -1201644988:/* metNtarChgMbhSrno */
			setMetNtarChgMbhSrno((Integer)value);
			break;
		case -961725409:/* metNtarChgDt */
			setMetNtarChgDt((String)value);
			break;
		case -961724920:/* metNtarChgTm */
			setMetNtarChgTm((String)value);
			break;
		case 1946521330:/* lstDbChgId */
			setLstDbChgId((String)value);
			break;
		case 212614886:/* lstDbChgDtm */
			setLstDbChgDtm((String)value);
			break;
		default:
			break;
		}
	}
	
}
