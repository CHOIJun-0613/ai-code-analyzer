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
import com.skbank.sml.fns.mpb.dto.MPBMetPbokBscMngPushNtfcSndMbhList_DTO;
import io.swagger.annotations.ApiModelProperty;
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
	"umsTmplCd", "kkoTmplCd", "appMarkImgPathTxt", "msgDtlTxt", "metMngNo", "gridCnt", "grid"
}, name="MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT")
@XmlRootElement(name="MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT")
@BxmCategory(logicalName="모임통장.PUSH.알림.발송.등록.컨트롤러.IO", description="") 
public class MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -221045169L;
	
	
	
	/**
	 * UMS템플릿코드
	 */
	@ApiModelProperty(
		name = "umsTmplCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("umsTmplCd")
	@BxmOmm_Field(length=15, decimal=0, description="UMS템플릿코드", align="left", fill="")
	private String umsTmplCd= "";
	
	
	/**
	 * 카카오템플릿코드
	 */
	@ApiModelProperty(
		name = "kkoTmplCd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("kkoTmplCd")
	@BxmOmm_Field(length=15, decimal=0, description="카카오템플릿코드", align="left", fill="")
	private String kkoTmplCd= "";
	
	
	/**
	 * 앱표시이미지경로내용
	 */
	@ApiModelProperty(
		name = "appMarkImgPathTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("appMarkImgPathTxt")
	@BxmOmm_Field(length=500, decimal=0, description="앱표시이미지경로내용", align="left", fill="")
	private String appMarkImgPathTxt= "";
	
	
	/**
	 * 메세지상세내용
	 */
	@ApiModelProperty(
		name = "msgDtlTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("msgDtlTxt")
	@BxmOmm_Field(length=500, decimal=0, description="메세지상세내용", align="left", fill="")
	private String msgDtlTxt= "";
	
	
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
	 * 그리드건수
	 */
	@ApiModelProperty(
		name = "gridCnt"
		, dataType = "java.math.BigInteger"
		)
	@JsonProperty("gridCnt")
	@BxmOmm_Field(length=2, decimal=0, description="그리드건수", align="right", fill="")
	private Integer gridCnt= 0;
	
	
	/**
	 * 모임통장.PUSH.알림.발송.회원.리스트.DTO
	 */
	@ApiModelProperty(
		name = "grid"
		, dataType = "[Lcom.skbank.sml.fns.mpb.dto.MPBMetPbokBscMngPushNtfcSndMbhList_DTO;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("grid")
	@BxmOmm_Field(length=0, decimal=0, description="모임통장.PUSH.알림.발송.회원.리스트.DTO", align="left", fill="", arrayReference="gridCnt")
	private List<MPBMetPbokBscMngPushNtfcSndMbhList_DTO> grid= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_umsTmplCd= false;
	protected final boolean isSet_umsTmplCd(){
		return this.isSet_umsTmplCd;
	}
	private void setIsSet_umsTmplCd(boolean value){
		this.isSet_umsTmplCd= value;
	}
	/**
	 * UMS템플릿코드
	 */
	@XmlTransient
	public String getUmsTmplCd(){
		return this.umsTmplCd;
	}
	
	/**
	 * UMS템플릿코드
	 * 
	 * @param umsTmplCd UMS템플릿코드
	 */
	public void setUmsTmplCd(String umsTmplCd){
		this.umsTmplCd= umsTmplCd;
		this.setIsSet_umsTmplCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_kkoTmplCd= false;
	protected final boolean isSet_kkoTmplCd(){
		return this.isSet_kkoTmplCd;
	}
	private void setIsSet_kkoTmplCd(boolean value){
		this.isSet_kkoTmplCd= value;
	}
	/**
	 * 카카오템플릿코드
	 */
	@XmlTransient
	public String getKkoTmplCd(){
		return this.kkoTmplCd;
	}
	
	/**
	 * 카카오템플릿코드
	 * 
	 * @param kkoTmplCd 카카오템플릿코드
	 */
	public void setKkoTmplCd(String kkoTmplCd){
		this.kkoTmplCd= kkoTmplCd;
		this.setIsSet_kkoTmplCd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_appMarkImgPathTxt= false;
	protected final boolean isSet_appMarkImgPathTxt(){
		return this.isSet_appMarkImgPathTxt;
	}
	private void setIsSet_appMarkImgPathTxt(boolean value){
		this.isSet_appMarkImgPathTxt= value;
	}
	/**
	 * 앱표시이미지경로내용
	 */
	@XmlTransient
	public String getAppMarkImgPathTxt(){
		return this.appMarkImgPathTxt;
	}
	
	/**
	 * 앱표시이미지경로내용
	 * 
	 * @param appMarkImgPathTxt 앱표시이미지경로내용
	 */
	public void setAppMarkImgPathTxt(String appMarkImgPathTxt){
		this.appMarkImgPathTxt= appMarkImgPathTxt;
		this.setIsSet_appMarkImgPathTxt(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_msgDtlTxt= false;
	protected final boolean isSet_msgDtlTxt(){
		return this.isSet_msgDtlTxt;
	}
	private void setIsSet_msgDtlTxt(boolean value){
		this.isSet_msgDtlTxt= value;
	}
	/**
	 * 메세지상세내용
	 */
	@XmlTransient
	public String getMsgDtlTxt(){
		return this.msgDtlTxt;
	}
	
	/**
	 * 메세지상세내용
	 * 
	 * @param msgDtlTxt 메세지상세내용
	 */
	public void setMsgDtlTxt(String msgDtlTxt){
		this.msgDtlTxt= msgDtlTxt;
		this.setIsSet_msgDtlTxt(true);
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
	@XmlElement
	public Integer getGridCnt(){
		if ( isSet_gridCnt )	return gridCnt;
		else{
			if ( grid == null || grid.size() == 0 ) return 0;
			else return grid.size();
		}
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
	private boolean isSet_grid= false;
	protected final boolean isSet_grid(){
		return this.isSet_grid;
	}
	private void setIsSet_grid(boolean value){
		this.isSet_grid= value;
	}
	/**
	 * 모임통장.PUSH.알림.발송.회원.리스트.DTO
	 */
	@XmlTransient
	public List<MPBMetPbokBscMngPushNtfcSndMbhList_DTO> getGrid(){
		return grid;
	}
	
	/**
	 * 모임통장.PUSH.알림.발송.회원.리스트.DTO
	 * 
	 * @param grid 모임통장.PUSH.알림.발송.회원.리스트.DTO
	 */
	@JsonSetter("grid")
	public void setGrid(List<MPBMetPbokBscMngPushNtfcSndMbhList_DTO> grid){
		this.grid= grid;
		this.setIsSet_grid(true);
	}
	
	public void setGrid(MPBMetPbokBscMngPushNtfcSndMbhList_DTO... items){
		List<MPBMetPbokBscMngPushNtfcSndMbhList_DTO> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBMetPbokBscMngPushNtfcSndMbhList_DTO item: items ){
				_items.add(item);
			}
		}
		this.setGrid(_items);
	}
				
	@Override
	public MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT clone(){
		try{
			MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT object= (MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT)super.clone();
			if ( this.grid== null ) object.grid= null;
			else{
				List<MPBMetPbokBscMngPushNtfcSndMbhList_DTO> clonedList= new ArrayList<>(this.grid.size());
				for( MPBMetPbokBscMngPushNtfcSndMbhList_DTO item : grid ){
					clonedList.add((MPBMetPbokBscMngPushNtfcSndMbhList_DTO)item.clone());
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
		
		result= prime * result + ((this.umsTmplCd==null)?0:this.umsTmplCd.hashCode());
		result= prime * result + ((this.kkoTmplCd==null)?0:this.kkoTmplCd.hashCode());
		result= prime * result + ((this.appMarkImgPathTxt==null)?0:this.appMarkImgPathTxt.hashCode());
		result= prime * result + ((this.msgDtlTxt==null)?0:this.msgDtlTxt.hashCode());
		result= prime * result + ((this.metMngNo==null)?0:this.metMngNo.hashCode());
		result= prime * result + ((this.gridCnt==null)?0:this.gridCnt.hashCode());
		result= prime * result + ((this.grid==null)?0:this.grid.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT other= (MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT)obj;
		{
			Object _umsTmplCd= getUmsTmplCd();
			Object __umsTmplCd= other.getUmsTmplCd();
			if ( _umsTmplCd== null ) { if ( __umsTmplCd!= null ) return false; }
			else if ( !_umsTmplCd.equals(__umsTmplCd) ) return false;
		}
		{
			Object _kkoTmplCd= getKkoTmplCd();
			Object __kkoTmplCd= other.getKkoTmplCd();
			if ( _kkoTmplCd== null ) { if ( __kkoTmplCd!= null ) return false; }
			else if ( !_kkoTmplCd.equals(__kkoTmplCd) ) return false;
		}
		{
			Object _appMarkImgPathTxt= getAppMarkImgPathTxt();
			Object __appMarkImgPathTxt= other.getAppMarkImgPathTxt();
			if ( _appMarkImgPathTxt== null ) { if ( __appMarkImgPathTxt!= null ) return false; }
			else if ( !_appMarkImgPathTxt.equals(__appMarkImgPathTxt) ) return false;
		}
		{
			Object _msgDtlTxt= getMsgDtlTxt();
			Object __msgDtlTxt= other.getMsgDtlTxt();
			if ( _msgDtlTxt== null ) { if ( __msgDtlTxt!= null ) return false; }
			else if ( !_msgDtlTxt.equals(__msgDtlTxt) ) return false;
		}
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _gridCnt= getGridCnt();
			Object __gridCnt= other.getGridCnt();
			if ( _gridCnt== null ) { if ( __gridCnt!= null ) return false; }
			else if ( !_gridCnt.equals(__gridCnt) ) return false;
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
	
		sb.append("\n[").append(MPBMetPbokBscMngInsertMetPbokPushNtfcSnd_IDT.class.getName()).append(":\n");
		sb.append("\tumsTmplCd: ");
		sb.append(umsTmplCd==null?"null":getUmsTmplCd());
		sb.append("\n");
		sb.append("\tkkoTmplCd: ");
		sb.append(kkoTmplCd==null?"null":getKkoTmplCd());
		sb.append("\n");
		sb.append("\tappMarkImgPathTxt: ");
		sb.append(appMarkImgPathTxt==null?"null":getAppMarkImgPathTxt());
		sb.append("\n");
		sb.append("\tmsgDtlTxt: ");
		sb.append(msgDtlTxt==null?"null":getMsgDtlTxt());
		sb.append("\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tgridCnt: ");
		sb.append(gridCnt==null?"null":getGridCnt());
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
		
		messageLen+= 15; /* umsTmplCd */
		messageLen+= 15; /* kkoTmplCd */
		messageLen+= 500; /* appMarkImgPathTxt */
		messageLen+= 500; /* msgDtlTxt */
		messageLen+= 9; /* metMngNo */
		messageLen+= 2; /* gridCnt */
		{/*grid*/
			int size=getGridCnt();
			int count= grid == null ? 0 : grid.size();
			int min= size > count?count:size;
			MPBMetPbokBscMngPushNtfcSndMbhList_DTO emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBMetPbokBscMngPushNtfcSndMbhList_DTO element= grid.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.dto.MPBMetPbokBscMngPushNtfcSndMbhList_DTO();
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
	
		list.add("umsTmplCd");
		list.add("kkoTmplCd");
		list.add("appMarkImgPathTxt");
		list.add("msgDtlTxt");
		list.add("metMngNo");
		list.add("gridCnt");
		list.add("grid");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("umsTmplCd", get("umsTmplCd"));
		map.put("kkoTmplCd", get("kkoTmplCd"));
		map.put("appMarkImgPathTxt", get("appMarkImgPathTxt"));
		map.put("msgDtlTxt", get("msgDtlTxt"));
		map.put("metMngNo", get("metMngNo"));
		map.put("gridCnt", get("gridCnt"));
		map.put("grid", get("grid"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 1461654065:/* umsTmplCd */
			return getUmsTmplCd();
		case -384338587:/* kkoTmplCd */
			return getKkoTmplCd();
		case 1374914038:/* appMarkImgPathTxt */
			return getAppMarkImgPathTxt();
		case -1903503915:/* msgDtlTxt */
			return getMsgDtlTxt();
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 287338563:/* gridCnt */
			return getGridCnt();
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
		case 1461654065:/* umsTmplCd */
			setUmsTmplCd((String)value);
			break;
		case -384338587:/* kkoTmplCd */
			setKkoTmplCd((String)value);
			break;
		case 1374914038:/* appMarkImgPathTxt */
			setAppMarkImgPathTxt((String)value);
			break;
		case -1903503915:/* msgDtlTxt */
			setMsgDtlTxt((String)value);
			break;
		case -468172085:/* metMngNo */
			setMetMngNo((String)value);
			break;
		case 287338563:/* gridCnt */
			setGridCnt((Integer)value);
			break;
		case 3181382:/* grid */
			setGrid((List<MPBMetPbokBscMngPushNtfcSndMbhList_DTO>)value);
			break;
		default:
			break;
		}
	}
	
}
