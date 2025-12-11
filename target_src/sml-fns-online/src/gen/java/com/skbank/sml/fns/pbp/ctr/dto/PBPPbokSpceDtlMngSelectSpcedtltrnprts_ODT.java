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
	"pBPSpceDtlTrnPrtsList_ODT", "nxtPageYn", "nxtPageTxt"
}, name="PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT")
@XmlRootElement(name="PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT")
@BxmCategory(logicalName="공간.상세.거래내역.컨트롤러.출력.IO", description="") 
public class PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -1926525847L;
	
	
	
	/**
	 * 공간.상세.거래내역.목록.컨트롤러.출력.IO
	 */
	@ApiModelProperty(
		name = "pBPSpceDtlTrnPrtsList_ODT"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPSpceDtlTrnPrtsList_ODT")
	@BxmOmm_Field(length=0, decimal=0, description="공간.상세.거래내역.목록.컨트롤러.출력.IO", align="left", fill="", arrayReference="1")
	private List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> pBPSpceDtlTrnPrtsList_ODT= new ArrayList<>();
	
	/**
	 * 다음페이지여부
	 */
	@ApiModelProperty(
		name = "nxtPageYn"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtPageYn")
	@BxmOmm_Field(length=1, decimal=0, description="다음페이지여부", align="left", fill="")
	private String nxtPageYn= "";
	
	
	/**
	 * 다음페이지내용
	 */
	@ApiModelProperty(
		name = "nxtPageTxt"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("nxtPageTxt")
	@BxmOmm_Field(length=100, decimal=0, description="다음페이지내용", align="left", fill="")
	private String nxtPageTxt= "";
	
	
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pBPSpceDtlTrnPrtsList_ODT= false;
	protected final boolean isSet_pBPSpceDtlTrnPrtsList_ODT(){
		return this.isSet_pBPSpceDtlTrnPrtsList_ODT;
	}
	private void setIsSet_pBPSpceDtlTrnPrtsList_ODT(boolean value){
		this.isSet_pBPSpceDtlTrnPrtsList_ODT= value;
	}
	/**
	 * 공간.상세.거래내역.목록.컨트롤러.출력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> getpBPSpceDtlTrnPrtsList_ODT(){
		return pBPSpceDtlTrnPrtsList_ODT;
	}
	
	/**
	 * 공간.상세.거래내역.목록.컨트롤러.출력.IO
	 * 
	 * @param pBPSpceDtlTrnPrtsList_ODT 공간.상세.거래내역.목록.컨트롤러.출력.IO
	 */
	@JsonSetter("pBPSpceDtlTrnPrtsList_ODT")
	public void setpBPSpceDtlTrnPrtsList_ODT(List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> pBPSpceDtlTrnPrtsList_ODT){
		this.pBPSpceDtlTrnPrtsList_ODT= pBPSpceDtlTrnPrtsList_ODT;
		this.setIsSet_pBPSpceDtlTrnPrtsList_ODT(true);
	}
	
	public void setpBPSpceDtlTrnPrtsList_ODT(PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT... items){
		List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT item: items ){
				_items.add(item);
			}
		}
		this.setpBPSpceDtlTrnPrtsList_ODT(_items);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtPageYn= false;
	protected final boolean isSet_nxtPageYn(){
		return this.isSet_nxtPageYn;
	}
	private void setIsSet_nxtPageYn(boolean value){
		this.isSet_nxtPageYn= value;
	}
	/**
	 * 다음페이지여부
	 */
	@XmlTransient
	public String getNxtPageYn(){
		return this.nxtPageYn;
	}
	
	/**
	 * 다음페이지여부
	 * 
	 * @param nxtPageYn 다음페이지여부
	 */
	public void setNxtPageYn(String nxtPageYn){
		this.nxtPageYn= nxtPageYn;
		this.setIsSet_nxtPageYn(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_nxtPageTxt= false;
	protected final boolean isSet_nxtPageTxt(){
		return this.isSet_nxtPageTxt;
	}
	private void setIsSet_nxtPageTxt(boolean value){
		this.isSet_nxtPageTxt= value;
	}
	/**
	 * 다음페이지내용
	 */
	@XmlTransient
	public String getNxtPageTxt(){
		return this.nxtPageTxt;
	}
	
	/**
	 * 다음페이지내용
	 * 
	 * @param nxtPageTxt 다음페이지내용
	 */
	public void setNxtPageTxt(String nxtPageTxt){
		this.nxtPageTxt= nxtPageTxt;
		this.setIsSet_nxtPageTxt(true);
	}
				
	@Override
	public PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT clone(){
		try{
			PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT object= (PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT)super.clone();
			if ( this.pBPSpceDtlTrnPrtsList_ODT== null ) object.pBPSpceDtlTrnPrtsList_ODT= null;
			else{
				List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT> clonedList= new ArrayList<>(this.pBPSpceDtlTrnPrtsList_ODT.size());
				for( PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT item : pBPSpceDtlTrnPrtsList_ODT ){
					clonedList.add((PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT)item.clone());
				}
				object.pBPSpceDtlTrnPrtsList_ODT= clonedList;
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
		
		result= prime * result + ((this.pBPSpceDtlTrnPrtsList_ODT==null)?0:this.pBPSpceDtlTrnPrtsList_ODT.hashCode());
		result= prime * result + ((this.nxtPageYn==null)?0:this.nxtPageYn.hashCode());
		result= prime * result + ((this.nxtPageTxt==null)?0:this.nxtPageTxt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT other= (PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT)obj;
		{
			Object _pBPSpceDtlTrnPrtsList_ODT= getpBPSpceDtlTrnPrtsList_ODT();
			Object __pBPSpceDtlTrnPrtsList_ODT= other.getpBPSpceDtlTrnPrtsList_ODT();
			if ( _pBPSpceDtlTrnPrtsList_ODT== null ) { if ( __pBPSpceDtlTrnPrtsList_ODT!= null ) return false; }
			else if ( !_pBPSpceDtlTrnPrtsList_ODT.equals(__pBPSpceDtlTrnPrtsList_ODT) ) return false;
		}
		{
			Object _nxtPageYn= getNxtPageYn();
			Object __nxtPageYn= other.getNxtPageYn();
			if ( _nxtPageYn== null ) { if ( __nxtPageYn!= null ) return false; }
			else if ( !_nxtPageYn.equals(__nxtPageYn) ) return false;
		}
		{
			Object _nxtPageTxt= getNxtPageTxt();
			Object __nxtPageTxt= other.getNxtPageTxt();
			if ( _nxtPageTxt== null ) { if ( __nxtPageTxt!= null ) return false; }
			else if ( !_nxtPageTxt.equals(__nxtPageTxt) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlMngSelectSpcedtltrnprts_ODT.class.getName()).append(":\n");
		sb.append("\tpBPSpceDtlTrnPrtsList_ODT: ");
		if ( pBPSpceDtlTrnPrtsList_ODT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPSpceDtlTrnPrtsList_ODT.size());
			sb.append("(items)\n");
	
			int max= (10<pBPSpceDtlTrnPrtsList_ODT.size())?10:pBPSpceDtlTrnPrtsList_ODT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPSpceDtlTrnPrtsList_ODT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPSpceDtlTrnPrtsList_ODT.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPSpceDtlTrnPrtsList_ODT.size() ){
				sb.append("\tpBPSpceDtlTrnPrtsList_ODT[.] : ").append("more ").append((pBPSpceDtlTrnPrtsList_ODT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("\tnxtPageYn: ");
		sb.append(nxtPageYn==null?"null":getNxtPageYn());
		sb.append("\n");
		sb.append("\tnxtPageTxt: ");
		sb.append(nxtPageTxt==null?"null":getNxtPageTxt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		{/*pBPSpceDtlTrnPrtsList_ODT*/
			int size=1;
			int count= pBPSpceDtlTrnPrtsList_ODT == null ? 0 : pBPSpceDtlTrnPrtsList_ODT.size();
			int min= size > count?count:size;
			PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT element= pBPSpceDtlTrnPrtsList_ODT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
		messageLen+= 1; /* nxtPageYn */
		messageLen+= 100; /* nxtPageTxt */
	
		return messageLen;
	}
	
	@Override
	@JsonIgnore
	public List<String> getFieldNames(){
		List<String> list= new ArrayList<>();
	
		list.add("pBPSpceDtlTrnPrtsList_ODT");
		list.add("nxtPageYn");
		list.add("nxtPageTxt");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("pBPSpceDtlTrnPrtsList_ODT", get("pBPSpceDtlTrnPrtsList_ODT"));
		map.put("nxtPageYn", get("nxtPageYn"));
		map.put("nxtPageTxt", get("nxtPageTxt"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1528570448:/* pBPSpceDtlTrnPrtsList_ODT */
			return getpBPSpceDtlTrnPrtsList_ODT();
		case -313358706:/* nxtPageYn */
			return getNxtPageYn();
		case -1124189673:/* nxtPageTxt */
			return getNxtPageTxt();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1528570448:/* pBPSpceDtlTrnPrtsList_ODT */
			setpBPSpceDtlTrnPrtsList_ODT((List<PBPPbokSpceDtlMngSelectSpcedtltrnprtslist_ODT>)value);
			break;
		case -313358706:/* nxtPageYn */
			setNxtPageYn((String)value);
			break;
		case -1124189673:/* nxtPageTxt */
			setNxtPageTxt((String)value);
			break;
		default:
			break;
		}
	}
	
}
