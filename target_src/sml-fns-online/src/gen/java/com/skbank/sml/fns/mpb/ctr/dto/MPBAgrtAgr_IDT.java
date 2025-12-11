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
	"itcsno", "metNm", "metPbokDscd", "mPBAgrtAgrList_IDT"
}, name="MPBAgrtAgr_IDT")
@XmlRootElement(name="MPBAgrtAgr_IDT")
@BxmCategory(logicalName="약관동의.컨트롤러.입력.IO", description="") 
public class MPBAgrtAgr_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 128920986L;
	
	
	
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
	 * 모임통장구분코드
	 */
	@ApiModelProperty(
		name = "metPbokDscd"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("metPbokDscd")
	@BxmOmm_Field(length=1, decimal=0, description="모임통장구분코드", align="left", fill="")
	private String metPbokDscd= "";
	
	
	/**
	 * 약관동의.목록.컨트롤러.입력.IO
	 */
	@ApiModelProperty(
		name = "mPBAgrtAgrList_IDT"
		, dataType = "[Lcom.skbank.sml.fns.mpb.ctr.dto.MPBAgrtAgrList_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("mPBAgrtAgrList_IDT")
	@BxmOmm_Field(length=0, decimal=0, description="약관동의.목록.컨트롤러.입력.IO", align="left", fill="", arrayReference="1")
	private List<MPBAgrtAgrList_IDT> mPBAgrtAgrList_IDT= new ArrayList<>();
	
	
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
	private boolean isSet_metPbokDscd= false;
	protected final boolean isSet_metPbokDscd(){
		return this.isSet_metPbokDscd;
	}
	private void setIsSet_metPbokDscd(boolean value){
		this.isSet_metPbokDscd= value;
	}
	/**
	 * 모임통장구분코드
	 */
	@XmlTransient
	public String getMetPbokDscd(){
		return this.metPbokDscd;
	}
	
	/**
	 * 모임통장구분코드
	 * 
	 * @param metPbokDscd 모임통장구분코드
	 */
	public void setMetPbokDscd(String metPbokDscd){
		this.metPbokDscd= metPbokDscd;
		this.setIsSet_metPbokDscd(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mPBAgrtAgrList_IDT= false;
	protected final boolean isSet_mPBAgrtAgrList_IDT(){
		return this.isSet_mPBAgrtAgrList_IDT;
	}
	private void setIsSet_mPBAgrtAgrList_IDT(boolean value){
		this.isSet_mPBAgrtAgrList_IDT= value;
	}
	/**
	 * 약관동의.목록.컨트롤러.입력.IO
	 */
	@XmlTransient
	public List<MPBAgrtAgrList_IDT> getmPBAgrtAgrList_IDT(){
		return mPBAgrtAgrList_IDT;
	}
	
	/**
	 * 약관동의.목록.컨트롤러.입력.IO
	 * 
	 * @param mPBAgrtAgrList_IDT 약관동의.목록.컨트롤러.입력.IO
	 */
	@JsonSetter("mPBAgrtAgrList_IDT")
	public void setmPBAgrtAgrList_IDT(List<MPBAgrtAgrList_IDT> mPBAgrtAgrList_IDT){
		this.mPBAgrtAgrList_IDT= mPBAgrtAgrList_IDT;
		this.setIsSet_mPBAgrtAgrList_IDT(true);
	}
	
	public void setmPBAgrtAgrList_IDT(MPBAgrtAgrList_IDT... items){
		List<MPBAgrtAgrList_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBAgrtAgrList_IDT item: items ){
				_items.add(item);
			}
		}
		this.setmPBAgrtAgrList_IDT(_items);
	}
				
	@Override
	public MPBAgrtAgr_IDT clone(){
		try{
			MPBAgrtAgr_IDT object= (MPBAgrtAgr_IDT)super.clone();
			if ( this.mPBAgrtAgrList_IDT== null ) object.mPBAgrtAgrList_IDT= null;
			else{
				List<MPBAgrtAgrList_IDT> clonedList= new ArrayList<>(this.mPBAgrtAgrList_IDT.size());
				for( MPBAgrtAgrList_IDT item : mPBAgrtAgrList_IDT ){
					clonedList.add((MPBAgrtAgrList_IDT)item.clone());
				}
				object.mPBAgrtAgrList_IDT= clonedList;
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
		result= prime * result + ((this.metNm==null)?0:this.metNm.hashCode());
		result= prime * result + ((this.metPbokDscd==null)?0:this.metPbokDscd.hashCode());
		result= prime * result + ((this.mPBAgrtAgrList_IDT==null)?0:this.mPBAgrtAgrList_IDT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MPBAgrtAgr_IDT other= (MPBAgrtAgr_IDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _metNm= getMetNm();
			Object __metNm= other.getMetNm();
			if ( _metNm== null ) { if ( __metNm!= null ) return false; }
			else if ( !_metNm.equals(__metNm) ) return false;
		}
		{
			Object _metPbokDscd= getMetPbokDscd();
			Object __metPbokDscd= other.getMetPbokDscd();
			if ( _metPbokDscd== null ) { if ( __metPbokDscd!= null ) return false; }
			else if ( !_metPbokDscd.equals(__metPbokDscd) ) return false;
		}
		{
			Object _mPBAgrtAgrList_IDT= getmPBAgrtAgrList_IDT();
			Object __mPBAgrtAgrList_IDT= other.getmPBAgrtAgrList_IDT();
			if ( _mPBAgrtAgrList_IDT== null ) { if ( __mPBAgrtAgrList_IDT!= null ) return false; }
			else if ( !_mPBAgrtAgrList_IDT.equals(__mPBAgrtAgrList_IDT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MPBAgrtAgr_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tmetNm: ");
		sb.append(metNm==null?"null":getMetNm());
		sb.append("\n");
		sb.append("\tmetPbokDscd: ");
		sb.append(metPbokDscd==null?"null":getMetPbokDscd());
		sb.append("\n");
		sb.append("\tmPBAgrtAgrList_IDT: ");
		if ( mPBAgrtAgrList_IDT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(mPBAgrtAgrList_IDT.size());
			sb.append("(items)\n");
	
			int max= (10<mPBAgrtAgrList_IDT.size())?10:mPBAgrtAgrList_IDT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tmPBAgrtAgrList_IDT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(mPBAgrtAgrList_IDT.get(i));
				sb.append("\n");
			}
	
			if ( max < mPBAgrtAgrList_IDT.size() ){
				sb.append("\tmPBAgrtAgrList_IDT[.] : ").append("more ").append((mPBAgrtAgrList_IDT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		messageLen+= 100; /* metNm */
		messageLen+= 1; /* metPbokDscd */
		{/*mPBAgrtAgrList_IDT*/
			int size=1;
			int count= mPBAgrtAgrList_IDT == null ? 0 : mPBAgrtAgrList_IDT.size();
			int min= size > count?count:size;
			MPBAgrtAgrList_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBAgrtAgrList_IDT element= mPBAgrtAgrList_IDT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.ctr.dto.MPBAgrtAgrList_IDT();
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
	
		list.add("itcsno");
		list.add("metNm");
		list.add("metPbokDscd");
		list.add("mPBAgrtAgrList_IDT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("metNm", get("metNm"));
		map.put("metPbokDscd", get("metPbokDscd"));
		map.put("mPBAgrtAgrList_IDT", get("mPBAgrtAgrList_IDT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case 103786683:/* metNm */
			return getMetNm();
		case 1867195290:/* metPbokDscd */
			return getMetPbokDscd();
		case -456983171:/* mPBAgrtAgrList_IDT */
			return getmPBAgrtAgrList_IDT();
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
		case 103786683:/* metNm */
			setMetNm((String)value);
			break;
		case 1867195290:/* metPbokDscd */
			setMetPbokDscd((String)value);
			break;
		case -456983171:/* mPBAgrtAgrList_IDT */
			setmPBAgrtAgrList_IDT((List<MPBAgrtAgrList_IDT>)value);
			break;
		default:
			break;
		}
	}
	
}
