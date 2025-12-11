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
import option.WooriOmmOption;

/**
 * 
 */
@WooriOmmOption(propOption=true)
@XmlType(propOrder={
	"pBPSpceSrvcJnngActInfList_ODT"
}, name="PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT")
@XmlRootElement(name="PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT")
@BxmCategory(logicalName="공간.서비스가입.계좌.정보.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 152485417L;
	
	
	
	/**
	 * 공간.서비스가입.계좌.정보.목록.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "pBPSpceSrvcJnngActInfList_ODT"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPSpceSrvcJnngActInfList_ODT")
	@BxmOmm_Field(length=0, decimal=0, description="공간.서비스가입.계좌.정보.목록.컨트롤러.출력.IO", align="left", fill="", arrayReference="1", etcProperties={"PROP_OPTION_DSCD=L999"})
	private List<PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT> pBPSpceSrvcJnngActInfList_ODT= new ArrayList<>();
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pBPSpceSrvcJnngActInfList_ODT= false;
	protected final boolean isSet_pBPSpceSrvcJnngActInfList_ODT(){
		return this.isSet_pBPSpceSrvcJnngActInfList_ODT;
	}
	private void setIsSet_pBPSpceSrvcJnngActInfList_ODT(boolean value){
		this.isSet_pBPSpceSrvcJnngActInfList_ODT= value;
	}
	/**
	 * 공간.서비스가입.계좌.정보.목록.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT> getpBPSpceSrvcJnngActInfList_ODT(){
		return pBPSpceSrvcJnngActInfList_ODT;
	}
	
	/**
	 * 공간.서비스가입.계좌.정보.목록.컨트롤러.출력.IO
	 * 
	 * @param pBPSpceSrvcJnngActInfList_ODT 공간.서비스가입.계좌.정보.목록.컨트롤러.출력.IO
	 */
	@JsonSetter("pBPSpceSrvcJnngActInfList_ODT")
	public void setpBPSpceSrvcJnngActInfList_ODT(List<PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT> pBPSpceSrvcJnngActInfList_ODT){
		this.pBPSpceSrvcJnngActInfList_ODT= pBPSpceSrvcJnngActInfList_ODT;
		this.setIsSet_pBPSpceSrvcJnngActInfList_ODT(true);
	}
	
	public void setpBPSpceSrvcJnngActInfList_ODT(PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT... items){
		List<PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT item: items ){
				_items.add(item);
			}
		}
		this.setpBPSpceSrvcJnngActInfList_ODT(_items);
	}
				
	@Override
	public PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT clone(){
		try{
			PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT object= (PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT)super.clone();
			if ( this.pBPSpceSrvcJnngActInfList_ODT== null ) object.pBPSpceSrvcJnngActInfList_ODT= null;
			else{
				List<PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT> clonedList= new ArrayList<>(this.pBPSpceSrvcJnngActInfList_ODT.size());
				for( PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT item : pBPSpceSrvcJnngActInfList_ODT ){
					clonedList.add((PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT)item.clone());
				}
				object.pBPSpceSrvcJnngActInfList_ODT= clonedList;
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
		
		result= prime * result + ((this.pBPSpceSrvcJnngActInfList_ODT==null)?0:this.pBPSpceSrvcJnngActInfList_ODT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT other= (PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT)obj;
		{
			Object _pBPSpceSrvcJnngActInfList_ODT= getpBPSpceSrvcJnngActInfList_ODT();
			Object __pBPSpceSrvcJnngActInfList_ODT= other.getpBPSpceSrvcJnngActInfList_ODT();
			if ( _pBPSpceSrvcJnngActInfList_ODT== null ) { if ( __pBPSpceSrvcJnngActInfList_ODT!= null ) return false; }
			else if ( !_pBPSpceSrvcJnngActInfList_ODT.equals(__pBPSpceSrvcJnngActInfList_ODT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngSelectSpcesrvcJnngactlist_ODT.class.getName()).append(":\n");
		sb.append("\tpBPSpceSrvcJnngActInfList_ODT: ");
		if ( pBPSpceSrvcJnngActInfList_ODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPSpceSrvcJnngActInfList_ODT.size());
			sb.append("(items)\n");
	
			int max= (10<pBPSpceSrvcJnngActInfList_ODT.size())?10:pBPSpceSrvcJnngActInfList_ODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPSpceSrvcJnngActInfList_ODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPSpceSrvcJnngActInfList_ODT.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPSpceSrvcJnngActInfList_ODT.size() ){
				sb.append("\tpBPSpceSrvcJnngActInfList_ODT[.] : ").append("more ").append((pBPSpceSrvcJnngActInfList_ODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*pBPSpceSrvcJnngActInfList_ODT*/
			int size=1;
			int count= pBPSpceSrvcJnngActInfList_ODT == null ? 0 : pBPSpceSrvcJnngActInfList_ODT.size();
			int min= size > count?count:size;
			PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT element= pBPSpceSrvcJnngActInfList_ODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT();
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
	
		list.add("pBPSpceSrvcJnngActInfList_ODT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pBPSpceSrvcJnngActInfList_ODT", get("pBPSpceSrvcJnngActInfList_ODT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 932980883:/* pBPSpceSrvcJnngActInfList_ODT */
			return getpBPSpceSrvcJnngActInfList_ODT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 932980883:/* pBPSpceSrvcJnngActInfList_ODT */
			setpBPSpceSrvcJnngActInfList_ODT((List<PBPPbokSpceBscMngSelectSpcesrvcJnngactinf_ODT>)value);
			break;
		default:
			break;
		}
	}
	
}
