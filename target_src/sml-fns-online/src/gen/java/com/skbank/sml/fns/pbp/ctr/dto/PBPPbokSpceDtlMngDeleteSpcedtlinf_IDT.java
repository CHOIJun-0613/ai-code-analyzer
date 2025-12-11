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
	"itcsno", "rprsAcno", "spceSrnoList"
}, name="PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT")
@XmlRootElement(name="PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT")
@BxmCategory(logicalName="공간.상세.정보.삭제.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1096251774L;
	
	
	
	/**
	 * 통합고객번호
	 */
	@ApiModelProperty(
		name = "itcsno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("itcsno")
	@BxmOmm_Field(length=36, decimal=0, description="통합고객번호", align="left", fill="")
	private String itcsno= "";
	
	
	/**
	 * 대표계좌번호
	 */
	@ApiModelProperty(
		name = "rprsAcno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("rprsAcno")
	@BxmOmm_Field(length=13, decimal=0, description="대표계좌번호", align="left", fill="")
	private String rprsAcno= "";
	
	
	/**
	 * 공간일련번호목록
	 */
	@ApiModelProperty(
		name = "spceSrnoList"
		, dataType = "[Ljava.lang.String;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("spceSrnoList")
	@BxmOmm_Field(length=100, decimal=0, description="공간일련번호목록", align="left", fill="", arrayReference="1", comment="다중선택일 경우 ,포함")
	private List<String> spceSrnoList= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_itcsno= false;
	protected final boolean isSet_itcsno(){
		return this.isSet_itcsno;
	}
	private void setIsSet_itcsno(boolean value){
		this.isSet_itcsno= value;
	}
	/**
	 * 통합고객번호
	 */
	@XmlTransient
	public String getItcsno(){
		return this.itcsno;
	}
	
	/**
	 * 통합고객번호
	 * 
	 * @param itcsno 통합고객번호
	 */
	public void setItcsno(String itcsno){
		this.itcsno= itcsno;
		this.setIsSet_itcsno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_rprsAcno= false;
	protected final boolean isSet_rprsAcno(){
		return this.isSet_rprsAcno;
	}
	private void setIsSet_rprsAcno(boolean value){
		this.isSet_rprsAcno= value;
	}
	/**
	 * 대표계좌번호
	 */
	@XmlTransient
	public String getRprsAcno(){
		return this.rprsAcno;
	}
	
	/**
	 * 대표계좌번호
	 * 
	 * @param rprsAcno 대표계좌번호
	 */
	public void setRprsAcno(String rprsAcno){
		this.rprsAcno= rprsAcno;
		this.setIsSet_rprsAcno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_spceSrnoList= false;
	protected final boolean isSet_spceSrnoList(){
		return this.isSet_spceSrnoList;
	}
	private void setIsSet_spceSrnoList(boolean value){
		this.isSet_spceSrnoList= value;
	}
	/**
	 * 공간일련번호목록
	 */
	@XmlTransient
	public List<String> getSpceSrnoList(){
		return spceSrnoList;
	}
	
	/**
	 * 공간일련번호목록
	 * 
	 * @param spceSrnoList 공간일련번호목록
	 */
	@JsonSetter("spceSrnoList")
	public void setSpceSrnoList(List<String> spceSrnoList){
		this.spceSrnoList= spceSrnoList;
		this.setIsSet_spceSrnoList(true);
	}
	
	public void setSpceSrnoList(String... items){
		List<String> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( String item: items ){
				_items.add(item);
			}
		}
		this.setSpceSrnoList(_items);
	}
				
	@Override
	public PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT clone(){
		try{
			PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT object= (PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT)super.clone();
			if ( this.spceSrnoList== null ) object.spceSrnoList= null;
			else{
				List<String> clonedList= new ArrayList<>(this.spceSrnoList.size());
				for( String item : spceSrnoList ){
					clonedList.add(item);
				}
				object.spceSrnoList= clonedList;
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
		
		result= prime * result + ((this.itcsno==null)?0:this.itcsno.hashCode());
		result= prime * result + ((this.rprsAcno==null)?0:this.rprsAcno.hashCode());
		result= prime * result + ((this.spceSrnoList==null)?0:this.spceSrnoList.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT other= (PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _rprsAcno= getRprsAcno();
			Object __rprsAcno= other.getRprsAcno();
			if ( _rprsAcno== null ) { if ( __rprsAcno!= null ) return false; }
			else if ( !_rprsAcno.equals(__rprsAcno) ) return false;
		}
		{
			Object _spceSrnoList= getSpceSrnoList();
			Object __spceSrnoList= other.getSpceSrnoList();
			if ( _spceSrnoList== null ) { if ( __spceSrnoList!= null ) return false; }
			else if ( !_spceSrnoList.equals(__spceSrnoList) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlMngDeleteSpcedtlinf_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("\tspceSrnoList: ");
		if ( spceSrnoList== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(spceSrnoList.size());
			sb.append("(items)\n");
	
			int max= (10<spceSrnoList.size())?10:spceSrnoList.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tspceSrnoList[");
				sb.append(i);
				sb.append("] : ");
				sb.append(spceSrnoList.get(i));
				sb.append("\n");
			}
	
			if ( max < spceSrnoList.size() ){
				sb.append("\tspceSrnoList[.] : ").append("more ").append((spceSrnoList.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 13; /* rprsAcno */
		messageLen+= ( 100 * (1) ); /* spceSrnoList */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("itcsno");
		list.add("rprsAcno");
		list.add("spceSrnoList");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("rprsAcno", get("rprsAcno"));
		map.put("spceSrnoList", get("spceSrnoList"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 805042946:/* rprsAcno */
			return getRprsAcno();
		case -1900060227:/* spceSrnoList */
			return getSpceSrnoList();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			setItcsno((String)value);
			break;
		case 805042946:/* rprsAcno */
			setRprsAcno((String)value);
			break;
		case -1900060227:/* spceSrnoList */
			setSpceSrnoList((List<String>)value);
			break;
		default:
			break;
		}
	}
	
}
