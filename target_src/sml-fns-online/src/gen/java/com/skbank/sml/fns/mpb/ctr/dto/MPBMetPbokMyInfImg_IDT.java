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
	"fileNm", "filePath"
}, name="MPBMetPbokMyInfImg_IDT")
@XmlRootElement(name="MPBMetPbokMyInfImg_IDT")
@BxmCategory(logicalName="모임통장.나의정보.이미지.컨트롤러.입력.IO", description="") 
public class MPBMetPbokMyInfImg_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1314570514L;
	
	
	
	/**
	 * 파일명
	 */
	@ApiModelProperty(
		name = "fileNm"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fileNm")
	@BxmOmm_Field(length=100, decimal=0, description="파일명", align="left", fill="")
	private String fileNm= "";
	
	
	/**
	 * 파일경로
	 */
	@ApiModelProperty(
		name = "filePath"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("filePath")
	@BxmOmm_Field(length=100, decimal=0, description="파일경로", align="left", fill="")
	private String filePath= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fileNm= false;
	protected final boolean isSet_fileNm(){
		return this.isSet_fileNm;
	}
	private void setIsSet_fileNm(boolean value){
		this.isSet_fileNm= value;
	}
	/**
	 * 파일명
	 */
	@XmlTransient
	public String getFileNm(){
		return this.fileNm;
	}
	
	/**
	 * 파일명
	 * 
	 * @param fileNm 파일명
	 */
	public void setFileNm(String fileNm){
		this.fileNm= fileNm;
		this.setIsSet_fileNm(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_filePath= false;
	protected final boolean isSet_filePath(){
		return this.isSet_filePath;
	}
	private void setIsSet_filePath(boolean value){
		this.isSet_filePath= value;
	}
	/**
	 * 파일경로
	 */
	@XmlTransient
	public String getFilePath(){
		return this.filePath;
	}
	
	/**
	 * 파일경로
	 * 
	 * @param filePath 파일경로
	 */
	public void setFilePath(String filePath){
		this.filePath= filePath;
		this.setIsSet_filePath(true);
	}
				
	@Override
	public MPBMetPbokMyInfImg_IDT clone(){
		try{
			MPBMetPbokMyInfImg_IDT object= (MPBMetPbokMyInfImg_IDT)super.clone();
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
		
		result= prime * result + ((this.fileNm==null)?0:this.fileNm.hashCode());
		result= prime * result + ((this.filePath==null)?0:this.filePath.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokMyInfImg_IDT other= (MPBMetPbokMyInfImg_IDT)obj;
		{
			Object _fileNm= getFileNm();
			Object __fileNm= other.getFileNm();
			if ( _fileNm== null ) { if ( __fileNm!= null ) return false; }
			else if ( !_fileNm.equals(__fileNm) ) return false;
		}
		{
			Object _filePath= getFilePath();
			Object __filePath= other.getFilePath();
			if ( _filePath== null ) { if ( __filePath!= null ) return false; }
			else if ( !_filePath.equals(__filePath) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokMyInfImg_IDT.class.getName()).append(":\n");
		sb.append("\tfileNm: ");
		sb.append(fileNm==null?"null":getFileNm());
		sb.append("\n");
		sb.append("\tfilePath: ");
		sb.append(filePath==null?"null":getFilePath());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 100; /* fileNm */
		messageLen+= 100; /* filePath */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("fileNm");
		list.add("filePath");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("fileNm", get("fileNm"));
		map.put("filePath", get("filePath"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1274507173:/* fileNm */
			return getFileNm();
		case -735662143:/* filePath */
			return getFilePath();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1274507173:/* fileNm */
			setFileNm((String)value);
			break;
		case -735662143:/* filePath */
			setFilePath((String)value);
			break;
		default:
			break;
		}
	}
	
}
