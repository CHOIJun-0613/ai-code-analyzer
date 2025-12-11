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
	"metMngNo", "metMbhSrno", "imgKey", "imgKeyNm", "imgFileNm", "imgFilePathNm"
}, name="MetPbokMyInf_DIDT")
@XmlRootElement(name="MetPbokMyInf_DIDT")
@BxmCategory(logicalName="모임통장.나의정보.DBM.입력.IO", description="") 
public class MetPbokMyInf_DIDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1384634747L;
	
	
	
	/**
	 * 모임관리번호
	 */
	@ApiModelProperty(
		name = "metMngNo"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMngNo")
	@BxmOmm_Field(length=1, decimal=0, description="모임관리번호", align="left", fill="")
	private String metMngNo= "";
	
	
	/**
	 * 모임회원일련번호
	 */
	@ApiModelProperty(
		name = "metMbhSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metMbhSrno")
	@BxmOmm_Field(length=30, decimal=0, description="모임회원일련번호", align="left", fill="")
	private String metMbhSrno= "";
	
	
	/**
	 * 이미지키
	 */
	@ApiModelProperty(
		name = "imgKey"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("imgKey")
	@BxmOmm_Field(length=35, decimal=0, description="이미지키", align="left", fill="")
	private String imgKey= "";
	
	
	/**
	 * 이미지키명
	 */
	@ApiModelProperty(
		name = "imgKeyNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("imgKeyNm")
	@BxmOmm_Field(length=40, decimal=0, description="이미지키명", align="left", fill="")
	private String imgKeyNm= "";
	
	
	/**
	 * 이미지파일명
	 */
	@ApiModelProperty(
		name = "imgFileNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("imgFileNm")
	@BxmOmm_Field(length=200, decimal=0, description="이미지파일명", align="left", fill="")
	private String imgFileNm= "";
	
	
	/**
	 * 이미지파일경로명
	 */
	@ApiModelProperty(
		name = "imgFilePathNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("imgFilePathNm")
	@BxmOmm_Field(length=200, decimal=0, description="이미지파일경로명", align="left", fill="")
	private String imgFilePathNm= "";
	
	
	
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
	private boolean isSet_metMbhSrno= false;
	protected final boolean isSet_metMbhSrno(){
		return this.isSet_metMbhSrno;
	}
	private void setIsSet_metMbhSrno(boolean value){
		this.isSet_metMbhSrno= value;
	}
	/**
	 * 모임회원일련번호
	 */
	@XmlTransient
	public String getMetMbhSrno(){
		return this.metMbhSrno;
	}
	
	/**
	 * 모임회원일련번호
	 * 
	 * @param metMbhSrno 모임회원일련번호
	 */
	public void setMetMbhSrno(String metMbhSrno){
		this.metMbhSrno= metMbhSrno;
		this.setIsSet_metMbhSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_imgKey= false;
	protected final boolean isSet_imgKey(){
		return this.isSet_imgKey;
	}
	private void setIsSet_imgKey(boolean value){
		this.isSet_imgKey= value;
	}
	/**
	 * 이미지키
	 */
	@XmlTransient
	public String getImgKey(){
		return this.imgKey;
	}
	
	/**
	 * 이미지키
	 * 
	 * @param imgKey 이미지키
	 */
	public void setImgKey(String imgKey){
		this.imgKey= imgKey;
		this.setIsSet_imgKey(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_imgKeyNm= false;
	protected final boolean isSet_imgKeyNm(){
		return this.isSet_imgKeyNm;
	}
	private void setIsSet_imgKeyNm(boolean value){
		this.isSet_imgKeyNm= value;
	}
	/**
	 * 이미지키명
	 */
	@XmlTransient
	public String getImgKeyNm(){
		return this.imgKeyNm;
	}
	
	/**
	 * 이미지키명
	 * 
	 * @param imgKeyNm 이미지키명
	 */
	public void setImgKeyNm(String imgKeyNm){
		this.imgKeyNm= imgKeyNm;
		this.setIsSet_imgKeyNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_imgFileNm= false;
	protected final boolean isSet_imgFileNm(){
		return this.isSet_imgFileNm;
	}
	private void setIsSet_imgFileNm(boolean value){
		this.isSet_imgFileNm= value;
	}
	/**
	 * 이미지파일명
	 */
	@XmlTransient
	public String getImgFileNm(){
		return this.imgFileNm;
	}
	
	/**
	 * 이미지파일명
	 * 
	 * @param imgFileNm 이미지파일명
	 */
	public void setImgFileNm(String imgFileNm){
		this.imgFileNm= imgFileNm;
		this.setIsSet_imgFileNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_imgFilePathNm= false;
	protected final boolean isSet_imgFilePathNm(){
		return this.isSet_imgFilePathNm;
	}
	private void setIsSet_imgFilePathNm(boolean value){
		this.isSet_imgFilePathNm= value;
	}
	/**
	 * 이미지파일경로명
	 */
	@XmlTransient
	public String getImgFilePathNm(){
		return this.imgFilePathNm;
	}
	
	/**
	 * 이미지파일경로명
	 * 
	 * @param imgFilePathNm 이미지파일경로명
	 */
	public void setImgFilePathNm(String imgFilePathNm){
		this.imgFilePathNm= imgFilePathNm;
		this.setIsSet_imgFilePathNm(true);
	}
				
	@Override
	public MetPbokMyInf_DIDT clone(){
		try{
			MetPbokMyInf_DIDT object= (MetPbokMyInf_DIDT)super.clone();
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
		result= prime * result + ((this.metMbhSrno==null)?0:this.metMbhSrno.hashCode());
		result= prime * result + ((this.imgKey==null)?0:this.imgKey.hashCode());
		result= prime * result + ((this.imgKeyNm==null)?0:this.imgKeyNm.hashCode());
		result= prime * result + ((this.imgFileNm==null)?0:this.imgFileNm.hashCode());
		result= prime * result + ((this.imgFilePathNm==null)?0:this.imgFilePathNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokMyInf_DIDT other= (MetPbokMyInf_DIDT)obj;
		{
			Object _metMngNo= getMetMngNo();
			Object __metMngNo= other.getMetMngNo();
			if ( _metMngNo== null ) { if ( __metMngNo!= null ) return false; }
			else if ( !_metMngNo.equals(__metMngNo) ) return false;
		}
		{
			Object _metMbhSrno= getMetMbhSrno();
			Object __metMbhSrno= other.getMetMbhSrno();
			if ( _metMbhSrno== null ) { if ( __metMbhSrno!= null ) return false; }
			else if ( !_metMbhSrno.equals(__metMbhSrno) ) return false;
		}
		{
			Object _imgKey= getImgKey();
			Object __imgKey= other.getImgKey();
			if ( _imgKey== null ) { if ( __imgKey!= null ) return false; }
			else if ( !_imgKey.equals(__imgKey) ) return false;
		}
		{
			Object _imgKeyNm= getImgKeyNm();
			Object __imgKeyNm= other.getImgKeyNm();
			if ( _imgKeyNm== null ) { if ( __imgKeyNm!= null ) return false; }
			else if ( !_imgKeyNm.equals(__imgKeyNm) ) return false;
		}
		{
			Object _imgFileNm= getImgFileNm();
			Object __imgFileNm= other.getImgFileNm();
			if ( _imgFileNm== null ) { if ( __imgFileNm!= null ) return false; }
			else if ( !_imgFileNm.equals(__imgFileNm) ) return false;
		}
		{
			Object _imgFilePathNm= getImgFilePathNm();
			Object __imgFilePathNm= other.getImgFilePathNm();
			if ( _imgFilePathNm== null ) { if ( __imgFilePathNm!= null ) return false; }
			else if ( !_imgFilePathNm.equals(__imgFilePathNm) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokMyInf_DIDT.class.getName()).append(":\n");
		sb.append("\tmetMngNo: ");
		sb.append(metMngNo==null?"null":getMetMngNo());
		sb.append("\n");
		sb.append("\tmetMbhSrno: ");
		sb.append(metMbhSrno==null?"null":getMetMbhSrno());
		sb.append("\n");
		sb.append("\timgKey: ");
		sb.append(imgKey==null?"null":getImgKey());
		sb.append("\n");
		sb.append("\timgKeyNm: ");
		sb.append(imgKeyNm==null?"null":getImgKeyNm());
		sb.append("\n");
		sb.append("\timgFileNm: ");
		sb.append(imgFileNm==null?"null":getImgFileNm());
		sb.append("\n");
		sb.append("\timgFilePathNm: ");
		sb.append(imgFilePathNm==null?"null":getImgFilePathNm());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 1; /* metMngNo */
		messageLen+= 30; /* metMbhSrno */
		messageLen+= 35; /* imgKey */
		messageLen+= 40; /* imgKeyNm */
		messageLen+= 200; /* imgFileNm */
		messageLen+= 200; /* imgFilePathNm */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("metMngNo");
		list.add("metMbhSrno");
		list.add("imgKey");
		list.add("imgKeyNm");
		list.add("imgFileNm");
		list.add("imgFilePathNm");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("metMngNo", get("metMngNo"));
		map.put("metMbhSrno", get("metMbhSrno"));
		map.put("imgKey", get("imgKey"));
		map.put("imgKeyNm", get("imgKeyNm"));
		map.put("imgFileNm", get("imgFileNm"));
		map.put("imgFilePathNm", get("imgFilePathNm"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -468172085:/* metMngNo */
			return getMetMngNo();
		case 715721463:/* metMbhSrno */
			return getMetMbhSrno();
		case -1185098852:/* imgKey */
			return getImgKey();
		case -713660805:/* imgKeyNm */
			return getImgKeyNm();
		case -788466178:/* imgFileNm */
			return getImgFileNm();
		case -563041917:/* imgFilePathNm */
			return getImgFilePathNm();
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
		case 715721463:/* metMbhSrno */
			setMetMbhSrno((String)value);
			break;
		case -1185098852:/* imgKey */
			setImgKey((String)value);
			break;
		case -713660805:/* imgKeyNm */
			setImgKeyNm((String)value);
			break;
		case -788466178:/* imgFileNm */
			setImgFileNm((String)value);
			break;
		case -563041917:/* imgFilePathNm */
			setImgFilePathNm((String)value);
			break;
		default:
			break;
		}
	}
	
}
