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
	"pBPSpceDtlGoalAmList_ODT"
}, name="PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT")
@XmlRootElement(name="PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT")
@BxmCategory(logicalName="공간.상세.목표.상세.내역.조회.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 18895426L;
	
	
	
	/**
	 * 공간.상세.목표.금액.목록.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "pBPSpceDtlGoalAmList_ODT"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPSpceDtlGoalAmList_ODT")
	@BxmOmm_Field(length=0, decimal=0, description="공간.상세.목표.금액.목록.컨트롤러.출력.IO", align="left", fill="", arrayReference="1")
	private List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> pBPSpceDtlGoalAmList_ODT= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pBPSpceDtlGoalAmList_ODT= false;
	protected final boolean isSet_pBPSpceDtlGoalAmList_ODT(){
		return this.isSet_pBPSpceDtlGoalAmList_ODT;
	}
	private void setIsSet_pBPSpceDtlGoalAmList_ODT(boolean value){
		this.isSet_pBPSpceDtlGoalAmList_ODT= value;
	}
	/**
	 * 공간.상세.목표.금액.목록.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> getpBPSpceDtlGoalAmList_ODT(){
		return pBPSpceDtlGoalAmList_ODT;
	}
	
	/**
	 * 공간.상세.목표.금액.목록.컨트롤러.출력.IO
	 * 
	 * @param pBPSpceDtlGoalAmList_ODT 공간.상세.목표.금액.목록.컨트롤러.출력.IO
	 */
	@JsonSetter("pBPSpceDtlGoalAmList_ODT")
	public void setpBPSpceDtlGoalAmList_ODT(List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> pBPSpceDtlGoalAmList_ODT){
		this.pBPSpceDtlGoalAmList_ODT= pBPSpceDtlGoalAmList_ODT;
		this.setIsSet_pBPSpceDtlGoalAmList_ODT(true);
	}
	
	public void setpBPSpceDtlGoalAmList_ODT(PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT... items){
		List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT item: items ){
				_items.add(item);
			}
		}
		this.setpBPSpceDtlGoalAmList_ODT(_items);
	}
				
	@Override
	public PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT clone(){
		try{
			PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT object= (PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT)super.clone();
			if ( this.pBPSpceDtlGoalAmList_ODT== null ) object.pBPSpceDtlGoalAmList_ODT= null;
			else{
				List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT> clonedList= new ArrayList<>(this.pBPSpceDtlGoalAmList_ODT.size());
				for( PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT item : pBPSpceDtlGoalAmList_ODT ){
					clonedList.add((PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT)item.clone());
				}
				object.pBPSpceDtlGoalAmList_ODT= clonedList;
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
		
		result= prime * result + ((this.pBPSpceDtlGoalAmList_ODT==null)?0:this.pBPSpceDtlGoalAmList_ODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT other= (PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT)obj;
		{
			Object _pBPSpceDtlGoalAmList_ODT= getpBPSpceDtlGoalAmList_ODT();
			Object __pBPSpceDtlGoalAmList_ODT= other.getpBPSpceDtlGoalAmList_ODT();
			if ( _pBPSpceDtlGoalAmList_ODT== null ) { if ( __pBPSpceDtlGoalAmList_ODT!= null ) return false; }
			else if ( !_pBPSpceDtlGoalAmList_ODT.equals(__pBPSpceDtlGoalAmList_ODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprts_ODT.class.getName()).append(":\n");
		sb.append("\tpBPSpceDtlGoalAmList_ODT: ");
		if ( pBPSpceDtlGoalAmList_ODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPSpceDtlGoalAmList_ODT.size());
			sb.append("(items)\n");
	
			int max= (10<pBPSpceDtlGoalAmList_ODT.size())?10:pBPSpceDtlGoalAmList_ODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPSpceDtlGoalAmList_ODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPSpceDtlGoalAmList_ODT.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPSpceDtlGoalAmList_ODT.size() ){
				sb.append("\tpBPSpceDtlGoalAmList_ODT[.] : ").append("more ").append((pBPSpceDtlGoalAmList_ODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*pBPSpceDtlGoalAmList_ODT*/
			int size=1;
			int count= pBPSpceDtlGoalAmList_ODT == null ? 0 : pBPSpceDtlGoalAmList_ODT.size();
			int min= size > count?count:size;
			PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT element= pBPSpceDtlGoalAmList_ODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT();
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
	
		list.add("pBPSpceDtlGoalAmList_ODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pBPSpceDtlGoalAmList_ODT", get("pBPSpceDtlGoalAmList_ODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1076047140:/* pBPSpceDtlGoalAmList_ODT */
			return getpBPSpceDtlGoalAmList_ODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1076047140:/* pBPSpceDtlGoalAmList_ODT */
			setpBPSpceDtlGoalAmList_ODT((List<PBPPbokSpceDtlEstSelectSpcedtlgoaldtlprtslist_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
