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
import com.fasterxml.jackson.annotation.JsonSetter;
import com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokCadAutListInq_ODT;
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
	"mPBMetPbokCadAutListInq_ODT"
}, name="MetPbokCadAutInq_DODT")
@XmlRootElement(name="MetPbokCadAutInq_DODT")
@BxmCategory(logicalName="모임통장.카드권한.조회.DBM.출력.IO", description="") 
public class MetPbokCadAutInq_DODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1737782716L;
	
	
	
	/**
	 * 모임통장.카드권한.목록.조회.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "mPBMetPbokCadAutListInq_ODT"
		, dataType = "[Lcom.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokCadAutListInq_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("mPBMetPbokCadAutListInq_ODT")
	@BxmOmm_Field(length=0, decimal=0, description="모임통장.카드권한.목록.조회.컨트롤러.출력.IO", align="left", fill="", arrayReference="1")
	private List<MPBMetPbokCadAutListInq_ODT> mPBMetPbokCadAutListInq_ODT= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_mPBMetPbokCadAutListInq_ODT= false;
	protected final boolean isSet_mPBMetPbokCadAutListInq_ODT(){
		return this.isSet_mPBMetPbokCadAutListInq_ODT;
	}
	private void setIsSet_mPBMetPbokCadAutListInq_ODT(boolean value){
		this.isSet_mPBMetPbokCadAutListInq_ODT= value;
	}
	/**
	 * 모임통장.카드권한.목록.조회.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<MPBMetPbokCadAutListInq_ODT> getmPBMetPbokCadAutListInq_ODT(){
		return mPBMetPbokCadAutListInq_ODT;
	}
	
	/**
	 * 모임통장.카드권한.목록.조회.컨트롤러.출력.IO
	 * 
	 * @param mPBMetPbokCadAutListInq_ODT 모임통장.카드권한.목록.조회.컨트롤러.출력.IO
	 */
	@JsonSetter("mPBMetPbokCadAutListInq_ODT")
	public void setmPBMetPbokCadAutListInq_ODT(List<MPBMetPbokCadAutListInq_ODT> mPBMetPbokCadAutListInq_ODT){
		this.mPBMetPbokCadAutListInq_ODT= mPBMetPbokCadAutListInq_ODT;
		this.setIsSet_mPBMetPbokCadAutListInq_ODT(true);
	}
	
	public void setmPBMetPbokCadAutListInq_ODT(MPBMetPbokCadAutListInq_ODT... items){
		List<MPBMetPbokCadAutListInq_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( MPBMetPbokCadAutListInq_ODT item: items ){
				_items.add(item);
			}
		}
		this.setmPBMetPbokCadAutListInq_ODT(_items);
	}
				
	@Override
	public MetPbokCadAutInq_DODT clone(){
		try{
			MetPbokCadAutInq_DODT object= (MetPbokCadAutInq_DODT)super.clone();
			if ( this.mPBMetPbokCadAutListInq_ODT== null ) object.mPBMetPbokCadAutListInq_ODT= null;
			else{
				List<MPBMetPbokCadAutListInq_ODT> clonedList= new ArrayList<>(this.mPBMetPbokCadAutListInq_ODT.size());
				for( MPBMetPbokCadAutListInq_ODT item : mPBMetPbokCadAutListInq_ODT ){
					clonedList.add((MPBMetPbokCadAutListInq_ODT)item.clone());
				}
				object.mPBMetPbokCadAutListInq_ODT= clonedList;
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
		
		result= prime * result + ((this.mPBMetPbokCadAutListInq_ODT==null)?0:this.mPBMetPbokCadAutListInq_ODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final MetPbokCadAutInq_DODT other= (MetPbokCadAutInq_DODT)obj;
		{
			Object _mPBMetPbokCadAutListInq_ODT= getmPBMetPbokCadAutListInq_ODT();
			Object __mPBMetPbokCadAutListInq_ODT= other.getmPBMetPbokCadAutListInq_ODT();
			if ( _mPBMetPbokCadAutListInq_ODT== null ) { if ( __mPBMetPbokCadAutListInq_ODT!= null ) return false; }
			else if ( !_mPBMetPbokCadAutListInq_ODT.equals(__mPBMetPbokCadAutListInq_ODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(MetPbokCadAutInq_DODT.class.getName()).append(":\n");
		sb.append("\tmPBMetPbokCadAutListInq_ODT: ");
		if ( mPBMetPbokCadAutListInq_ODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(mPBMetPbokCadAutListInq_ODT.size());
			sb.append("(items)\n");
	
			int max= (10<mPBMetPbokCadAutListInq_ODT.size())?10:mPBMetPbokCadAutListInq_ODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tmPBMetPbokCadAutListInq_ODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(mPBMetPbokCadAutListInq_ODT.get(i));
				sb.append("\n");
			}
	
			if ( max < mPBMetPbokCadAutListInq_ODT.size() ){
				sb.append("\tmPBMetPbokCadAutListInq_ODT[.] : ").append("more ").append((mPBMetPbokCadAutListInq_ODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*mPBMetPbokCadAutListInq_ODT*/
			int size=1;
			int count= mPBMetPbokCadAutListInq_ODT == null ? 0 : mPBMetPbokCadAutListInq_ODT.size();
			int min= size > count?count:size;
			MPBMetPbokCadAutListInq_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					MPBMetPbokCadAutListInq_ODT element= mPBMetPbokCadAutListInq_ODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.mpb.ctr.dto.MPBMetPbokCadAutListInq_ODT();
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
	
		list.add("mPBMetPbokCadAutListInq_ODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("mPBMetPbokCadAutListInq_ODT", get("mPBMetPbokCadAutListInq_ODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 2026557033:/* mPBMetPbokCadAutListInq_ODT */
			return getmPBMetPbokCadAutListInq_ODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 2026557033:/* mPBMetPbokCadAutListInq_ODT */
			setmPBMetPbokCadAutListInq_ODT((List<MPBMetPbokCadAutListInq_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
