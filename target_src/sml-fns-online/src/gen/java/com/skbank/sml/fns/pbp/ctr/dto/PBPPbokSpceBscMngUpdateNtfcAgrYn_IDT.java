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
	"itcsno", "pBPSpceSrvcNtfcYnAcnoList_IDT"
}, name="PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT")
@XmlRootElement(name="PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT")
@BxmCategory(logicalName="공간.서비스.알림.여부.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1716401172L;
	
	
	
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
	 * 공간.서비스.알림.여부.계좌.목록.컨트롤러.입력.IO
	 */
	@ApiModelProperty(
		name = "pBPSpceSrvcNtfcYnAcnoList_IDT"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPSpceSrvcNtfcYnAcnoList_IDT")
	@BxmOmm_Field(length=0, decimal=0, description="공간.서비스.알림.여부.계좌.목록.컨트롤러.입력.IO", align="left", fill="", arrayReference="1", etcProperties={"PROP_OPTION_DSCD=L999"})
	private List<PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT> pBPSpceSrvcNtfcYnAcnoList_IDT= new ArrayList<>();
	
	
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
	private boolean isSet_pBPSpceSrvcNtfcYnAcnoList_IDT= false;
	protected final boolean isSet_pBPSpceSrvcNtfcYnAcnoList_IDT(){
		return this.isSet_pBPSpceSrvcNtfcYnAcnoList_IDT;
	}
	private void setIsSet_pBPSpceSrvcNtfcYnAcnoList_IDT(boolean value){
		this.isSet_pBPSpceSrvcNtfcYnAcnoList_IDT= value;
	}
	/**
	 * 공간.서비스.알림.여부.계좌.목록.컨트롤러.입력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT> getpBPSpceSrvcNtfcYnAcnoList_IDT(){
		return pBPSpceSrvcNtfcYnAcnoList_IDT;
	}
	
	/**
	 * 공간.서비스.알림.여부.계좌.목록.컨트롤러.입력.IO
	 * 
	 * @param pBPSpceSrvcNtfcYnAcnoList_IDT 공간.서비스.알림.여부.계좌.목록.컨트롤러.입력.IO
	 */
	@JsonSetter("pBPSpceSrvcNtfcYnAcnoList_IDT")
	public void setpBPSpceSrvcNtfcYnAcnoList_IDT(List<PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT> pBPSpceSrvcNtfcYnAcnoList_IDT){
		this.pBPSpceSrvcNtfcYnAcnoList_IDT= pBPSpceSrvcNtfcYnAcnoList_IDT;
		this.setIsSet_pBPSpceSrvcNtfcYnAcnoList_IDT(true);
	}
	
	public void setpBPSpceSrvcNtfcYnAcnoList_IDT(PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT... items){
		List<PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT item: items ){
				_items.add(item);
			}
		}
		this.setpBPSpceSrvcNtfcYnAcnoList_IDT(_items);
	}
				
	@Override
	public PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT clone(){
		try{
			PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT object= (PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT)super.clone();
			if ( this.pBPSpceSrvcNtfcYnAcnoList_IDT== null ) object.pBPSpceSrvcNtfcYnAcnoList_IDT= null;
			else{
				List<PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT> clonedList= new ArrayList<>(this.pBPSpceSrvcNtfcYnAcnoList_IDT.size());
				for( PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT item : pBPSpceSrvcNtfcYnAcnoList_IDT ){
					clonedList.add((PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT)item.clone());
				}
				object.pBPSpceSrvcNtfcYnAcnoList_IDT= clonedList;
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
		result= prime * result + ((this.pBPSpceSrvcNtfcYnAcnoList_IDT==null)?0:this.pBPSpceSrvcNtfcYnAcnoList_IDT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT other= (PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT)obj;
		{
			Object _itcsno= getItcsno();
			Object __itcsno= other.getItcsno();
			if ( _itcsno== null ) { if ( __itcsno!= null ) return false; }
			else if ( !_itcsno.equals(__itcsno) ) return false;
		}
		{
			Object _pBPSpceSrvcNtfcYnAcnoList_IDT= getpBPSpceSrvcNtfcYnAcnoList_IDT();
			Object __pBPSpceSrvcNtfcYnAcnoList_IDT= other.getpBPSpceSrvcNtfcYnAcnoList_IDT();
			if ( _pBPSpceSrvcNtfcYnAcnoList_IDT== null ) { if ( __pBPSpceSrvcNtfcYnAcnoList_IDT!= null ) return false; }
			else if ( !_pBPSpceSrvcNtfcYnAcnoList_IDT.equals(__pBPSpceSrvcNtfcYnAcnoList_IDT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceBscMngUpdateNtfcAgrYn_IDT.class.getName()).append(":\n");
		sb.append("\titcsno: ");
		sb.append(itcsno==null?"null":getItcsno());
		sb.append("\n");
		sb.append("\tpBPSpceSrvcNtfcYnAcnoList_IDT: ");
		if ( pBPSpceSrvcNtfcYnAcnoList_IDT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPSpceSrvcNtfcYnAcnoList_IDT.size());
			sb.append("(items)\n");
	
			int max= (10<pBPSpceSrvcNtfcYnAcnoList_IDT.size())?10:pBPSpceSrvcNtfcYnAcnoList_IDT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPSpceSrvcNtfcYnAcnoList_IDT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPSpceSrvcNtfcYnAcnoList_IDT.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPSpceSrvcNtfcYnAcnoList_IDT.size() ){
				sb.append("\tpBPSpceSrvcNtfcYnAcnoList_IDT[.] : ").append("more ").append((pBPSpceSrvcNtfcYnAcnoList_IDT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 36; /* itcsno */
		{/*pBPSpceSrvcNtfcYnAcnoList_IDT*/
			int size=1;
			int count= pBPSpceSrvcNtfcYnAcnoList_IDT == null ? 0 : pBPSpceSrvcNtfcYnAcnoList_IDT.size();
			int min= size > count?count:size;
			PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT element= pBPSpceSrvcNtfcYnAcnoList_IDT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT();
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
		list.add("pBPSpceSrvcNtfcYnAcnoList_IDT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("itcsno", get("itcsno"));
		map.put("pBPSpceSrvcNtfcYnAcnoList_IDT", get("pBPSpceSrvcNtfcYnAcnoList_IDT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1178714660:/* itcsno */
			return getItcsno();
		case -208895556:/* pBPSpceSrvcNtfcYnAcnoList_IDT */
			return getpBPSpceSrvcNtfcYnAcnoList_IDT();
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
		case -208895556:/* pBPSpceSrvcNtfcYnAcnoList_IDT */
			setpBPSpceSrvcNtfcYnAcnoList_IDT((List<PBPPbokSpceBscMngUpdateNtfcAgrYnlist_IDT>)value);
			break;
		default:
			break;
		}
	}
	
}
