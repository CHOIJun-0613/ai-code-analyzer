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
	"imgKeyNm", "imgFileNm", "imgSrno", "imgTxt"
}, name="MPBMsgCadListInq_ODT")
@XmlRootElement(name="MPBMsgCadListInq_ODT")
@BxmCategory(logicalName="메시지.카드.목록.조회.컨트롤러.출력.IO", description="") 
public class MPBMsgCadListInq_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1243898821L;
	
	
	
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
	 * 이미지일련번호
	 */
	@ApiModelProperty(
		name = "imgSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("imgSrno")
	@BxmOmm_Field(length=13, decimal=0, description="이미지일련번호", align="left", fill="")
	private String imgSrno= "";
	
	
	/**
	 * 이미지내용
	 */
	@ApiModelProperty(
		name = "imgTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("imgTxt")
	@BxmOmm_Field(length=1000, decimal=0, description="이미지내용", align="left", fill="")
	private String imgTxt= "";
	
	
	
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
	private boolean isSet_imgSrno= false;
	protected final boolean isSet_imgSrno(){
		return this.isSet_imgSrno;
	}
	private void setIsSet_imgSrno(boolean value){
		this.isSet_imgSrno= value;
	}
	/**
	 * 이미지일련번호
	 */
	@XmlTransient
	public String getImgSrno(){
		return this.imgSrno;
	}
	
	/**
	 * 이미지일련번호
	 * 
	 * @param imgSrno 이미지일련번호
	 */
	public void setImgSrno(String imgSrno){
		this.imgSrno= imgSrno;
		this.setIsSet_imgSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_imgTxt= false;
	protected final boolean isSet_imgTxt(){
		return this.isSet_imgTxt;
	}
	private void setIsSet_imgTxt(boolean value){
		this.isSet_imgTxt= value;
	}
	/**
	 * 이미지내용
	 */
	@XmlTransient
	public String getImgTxt(){
		return this.imgTxt;
	}
	
	/**
	 * 이미지내용
	 * 
	 * @param imgTxt 이미지내용
	 */
	public void setImgTxt(String imgTxt){
		this.imgTxt= imgTxt;
		this.setIsSet_imgTxt(true);
	}
				
	@Override
	public MPBMsgCadListInq_ODT clone(){
		try{
			MPBMsgCadListInq_ODT object= (MPBMsgCadListInq_ODT)super.clone();
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
		
		result= prime * result + ((this.imgKeyNm==null)?0:this.imgKeyNm.hashCode());
		result= prime * result + ((this.imgFileNm==null)?0:this.imgFileNm.hashCode());
		result= prime * result + ((this.imgSrno==null)?0:this.imgSrno.hashCode());
		result= prime * result + ((this.imgTxt==null)?0:this.imgTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMsgCadListInq_ODT other= (MPBMsgCadListInq_ODT)obj;
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
			Object _imgSrno= getImgSrno();
			Object __imgSrno= other.getImgSrno();
			if ( _imgSrno== null ) { if ( __imgSrno!= null ) return false; }
			else if ( !_imgSrno.equals(__imgSrno) ) return false;
		}
		{
			Object _imgTxt= getImgTxt();
			Object __imgTxt= other.getImgTxt();
			if ( _imgTxt== null ) { if ( __imgTxt!= null ) return false; }
			else if ( !_imgTxt.equals(__imgTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMsgCadListInq_ODT.class.getName()).append(":\n");
		sb.append("\timgKeyNm: ");
		sb.append(imgKeyNm==null?"null":getImgKeyNm());
		sb.append("\n");
		sb.append("\timgFileNm: ");
		sb.append(imgFileNm==null?"null":getImgFileNm());
		sb.append("\n");
		sb.append("\timgSrno: ");
		sb.append(imgSrno==null?"null":getImgSrno());
		sb.append("\n");
		sb.append("\timgTxt: ");
		sb.append(imgTxt==null?"null":getImgTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 40; /* imgKeyNm */
		messageLen+= 200; /* imgFileNm */
		messageLen+= 13; /* imgSrno */
		messageLen+= 1000; /* imgTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("imgKeyNm");
		list.add("imgFileNm");
		list.add("imgSrno");
		list.add("imgTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("imgKeyNm", get("imgKeyNm"));
		map.put("imgFileNm", get("imgFileNm"));
		map.put("imgSrno", get("imgSrno"));
		map.put("imgTxt", get("imgTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -713660805:/* imgKeyNm */
			return getImgKeyNm();
		case -788466178:/* imgFileNm */
			return getImgFileNm();
		case 1916891843:/* imgSrno */
			return getImgSrno();
		case -1185089619:/* imgTxt */
			return getImgTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -713660805:/* imgKeyNm */
			setImgKeyNm((String)value);
			break;
		case -788466178:/* imgFileNm */
			setImgFileNm((String)value);
			break;
		case 1916891843:/* imgSrno */
			setImgSrno((String)value);
			break;
		case -1185089619:/* imgTxt */
			setImgTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
