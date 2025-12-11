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
import java.util.Arrays;
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
	"fileNm", "fileDir", "filePath", "fileSize", "fileData"
}, name="MPBMetPbokBscMngSelectMetPbokImgInf_ODT")
@XmlRootElement(name="MPBMetPbokBscMngSelectMetPbokImgInf_ODT")
@BxmCategory(logicalName="모임통장.이미지.정보.조회.출력.IO", description="") 
public class MPBMetPbokBscMngSelectMetPbokImgInf_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -852719758L;
	
	
	
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
	 * 파일디렉토리
	 */
	@ApiModelProperty(
		name = "fileDir"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("fileDir")
	@BxmOmm_Field(length=500, decimal=0, description="파일디렉토리", align="left", fill="")
	private String fileDir= "";
	
	
	/**
	 * 파일경로
	 */
	@ApiModelProperty(
		name = "filePath"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("filePath")
	@BxmOmm_Field(length=500, decimal=0, description="파일경로", align="left", fill="")
	private String filePath= "";
	
	
	/**
	 * 파일크기
	 */
	@ApiModelProperty(
		name = "fileSize"
		, dataType = "java.lang.Long"
		)
	@XmlElement
	@JsonProperty("fileSize")
	@BxmOmm_Field(length=100, decimal=0, description="파일크기", align="right", fill="")
	private Long fileSize= 0L;
	
	
	/**
	 * 파일데이터
	 */
	@ApiModelProperty(
		name = "fileData"
		, dataType = "BLOB"
		)
	@XmlElement
	@JsonProperty("fileData")
	@BxmOmm_Field(length=100000, decimal=0, description="파일데이터", align="left", fill="")
	private byte[] fileData= null;
	
	
	
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
	private boolean isSet_fileDir= false;
	protected final boolean isSet_fileDir(){
		return this.isSet_fileDir;
	}
	private void setIsSet_fileDir(boolean value){
		this.isSet_fileDir= value;
	}
	/**
	 * 파일디렉토리
	 */
	@XmlTransient
	public String getFileDir(){
		return this.fileDir;
	}
	
	/**
	 * 파일디렉토리
	 * 
	 * @param fileDir 파일디렉토리
	 */
	public void setFileDir(String fileDir){
		this.fileDir= fileDir;
		this.setIsSet_fileDir(true);
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
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fileSize= false;
	protected final boolean isSet_fileSize(){
		return this.isSet_fileSize;
	}
	private void setIsSet_fileSize(boolean value){
		this.isSet_fileSize= value;
	}
	/**
	 * 파일크기
	 */
	@XmlTransient
	public Long getFileSize(){
		return this.fileSize;
	}
	
	/**
	 * 파일크기
	 * 
	 * @param fileSize 파일크기
	 */
	public void setFileSize(Long fileSize){
		this.fileSize= fileSize;
		this.setIsSet_fileSize(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_fileData= false;
	protected final boolean isSet_fileData(){
		return this.isSet_fileData;
	}
	private void setIsSet_fileData(boolean value){
		this.isSet_fileData= value;
	}
	/**
	 * 파일데이터
	 */
	@XmlTransient
	public byte[] getFileData(){
		return this.fileData;
	}
	
	/**
	 * 파일데이터
	 * 
	 * @param fileData 파일데이터
	 */
	public void setFileData(byte[] fileData){
		this.fileData= fileData;
		this.setIsSet_fileData(true);
	}
				
	@Override
	public MPBMetPbokBscMngSelectMetPbokImgInf_ODT clone(){
		try{
			MPBMetPbokBscMngSelectMetPbokImgInf_ODT object= (MPBMetPbokBscMngSelectMetPbokImgInf_ODT)super.clone();
			if ( this.fileData== null ) object.fileData= null;
			else object.fileData= Arrays.copyOf(this.fileData, this.fileData.length);
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
		result= prime * result + ((this.fileDir==null)?0:this.fileDir.hashCode());
		result= prime * result + ((this.filePath==null)?0:this.filePath.hashCode());
		result= prime * result + ((this.fileSize==null)?0:this.fileSize.hashCode());
		result= prime * result + ((this.fileData==null)?0:this.fileData.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBMetPbokBscMngSelectMetPbokImgInf_ODT other= (MPBMetPbokBscMngSelectMetPbokImgInf_ODT)obj;
		{
			Object _fileNm= getFileNm();
			Object __fileNm= other.getFileNm();
			if ( _fileNm== null ) { if ( __fileNm!= null ) return false; }
			else if ( !_fileNm.equals(__fileNm) ) return false;
		}
		{
			Object _fileDir= getFileDir();
			Object __fileDir= other.getFileDir();
			if ( _fileDir== null ) { if ( __fileDir!= null ) return false; }
			else if ( !_fileDir.equals(__fileDir) ) return false;
		}
		{
			Object _filePath= getFilePath();
			Object __filePath= other.getFilePath();
			if ( _filePath== null ) { if ( __filePath!= null ) return false; }
			else if ( !_filePath.equals(__filePath) ) return false;
		}
		{
			Object _fileSize= getFileSize();
			Object __fileSize= other.getFileSize();
			if ( _fileSize== null ) { if ( __fileSize!= null ) return false; }
			else if ( !_fileSize.equals(__fileSize) ) return false;
		}
		{
			Object _fileData= getFileData();
			Object __fileData= other.getFileData();
			if ( _fileData== null ) { if ( __fileData!= null ) return false; }
			else if ( !_fileData.equals(__fileData) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBMetPbokBscMngSelectMetPbokImgInf_ODT.class.getName()).append(":\n");
		sb.append("\tfileNm: ");
		sb.append(fileNm==null?"null":getFileNm());
		sb.append("\n");
		sb.append("\tfileDir: ");
		sb.append(fileDir==null?"null":getFileDir());
		sb.append("\n");
		sb.append("\tfilePath: ");
		sb.append(filePath==null?"null":getFilePath());
		sb.append("\n");
		sb.append("\tfileSize: ");
		sb.append(fileSize==null?"null":getFileSize());
		sb.append("\n");
		sb.append("\tfileData: ");
		sb.append(fileData==null?"null":getFileData());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 100; /* fileNm */
		messageLen+= 500; /* fileDir */
		messageLen+= 500; /* filePath */
		messageLen+= 100; /* fileSize */
		messageLen+= 100000; /* fileData */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("fileNm");
		list.add("fileDir");
		list.add("filePath");
		list.add("fileSize");
		list.add("fileData");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("fileNm", get("fileNm"));
		map.put("fileDir", get("fileDir"));
		map.put("filePath", get("filePath"));
		map.put("fileSize", get("fileSize"));
		map.put("fileData", get("fileData"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1274507173:/* fileNm */
			return getFileNm();
		case -855026319:/* fileDir */
			return getFileDir();
		case -735662143:/* filePath */
			return getFilePath();
		case -735564899:/* fileSize */
			return getFileSize();
		case -736019642:/* fileData */
			return getFileData();
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
		case -855026319:/* fileDir */
			setFileDir((String)value);
			break;
		case -735662143:/* filePath */
			setFilePath((String)value);
			break;
		case -735564899:/* fileSize */
			setFileSize((Long)value);
			break;
		case -736019642:/* fileData */
			setFileData((byte[])value);
			break;
		default:
			break;
		}
	}
	
}
