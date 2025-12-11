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
	"rprsAcno", "spceSrno", "pBPPbokSpceDtlEstInsertSpceatpminflist_IDT"
}, name="PBPPbokSpceDtlEstInsertSpceatpminf_IDT")
@XmlRootElement(name="PBPPbokSpceDtlEstInsertSpceatpminf_IDT")
@BxmCategory(logicalName="공간.자동납부.등록.컨트롤러.입력.IO", description="") 
public class PBPPbokSpceDtlEstInsertSpceatpminf_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= 1328101914L;
	
	
	
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
	 * 공간일련번호
	 */
	@ApiModelProperty(
		name = "spceSrno"
		, dataType = "java.lang.String"
		)
	@XmlElement
	@JsonProperty("spceSrno")
	@BxmOmm_Field(length=10, decimal=0, description="공간일련번호", align="left", fill="")
	private String spceSrno= "";
	
	
	/**
	 * 공간.자동납부.목록.등록.컨트롤러.입력.IO
	 */
	@ApiModelProperty(
		name = "pBPPbokSpceDtlEstInsertSpceatpminflist_IDT"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpceatpminflist_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPPbokSpceDtlEstInsertSpceatpminflist_IDT")
	@BxmOmm_Field(length=0, decimal=0, description="공간.자동납부.목록.등록.컨트롤러.입력.IO", align="left", fill="", arrayReference="1")
	private List<PBPPbokSpceDtlEstInsertSpceatpminflist_IDT> pBPPbokSpceDtlEstInsertSpceatpminflist_IDT= new ArrayList<>();
	
	
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
	private boolean isSet_spceSrno= false;
	protected final boolean isSet_spceSrno(){
		return this.isSet_spceSrno;
	}
	private void setIsSet_spceSrno(boolean value){
		this.isSet_spceSrno= value;
	}
	/**
	 * 공간일련번호
	 */
	@XmlTransient
	public String getSpceSrno(){
		return this.spceSrno;
	}
	
	/**
	 * 공간일련번호
	 * 
	 * @param spceSrno 공간일련번호
	 */
	public void setSpceSrno(String spceSrno){
		this.spceSrno= spceSrno;
		this.setIsSet_spceSrno(true);
	}
	
	@XmlTransient
	@JsonIgnore
	private boolean isSet_pBPPbokSpceDtlEstInsertSpceatpminflist_IDT= false;
	protected final boolean isSet_pBPPbokSpceDtlEstInsertSpceatpminflist_IDT(){
		return this.isSet_pBPPbokSpceDtlEstInsertSpceatpminflist_IDT;
	}
	private void setIsSet_pBPPbokSpceDtlEstInsertSpceatpminflist_IDT(boolean value){
		this.isSet_pBPPbokSpceDtlEstInsertSpceatpminflist_IDT= value;
	}
	/**
	 * 공간.자동납부.목록.등록.컨트롤러.입력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceDtlEstInsertSpceatpminflist_IDT> getpBPPbokSpceDtlEstInsertSpceatpminflist_IDT(){
		return pBPPbokSpceDtlEstInsertSpceatpminflist_IDT;
	}
	
	/**
	 * 공간.자동납부.목록.등록.컨트롤러.입력.IO
	 * 
	 * @param pBPPbokSpceDtlEstInsertSpceatpminflist_IDT 공간.자동납부.목록.등록.컨트롤러.입력.IO
	 */
	@JsonSetter("pBPPbokSpceDtlEstInsertSpceatpminflist_IDT")
	public void setpBPPbokSpceDtlEstInsertSpceatpminflist_IDT(List<PBPPbokSpceDtlEstInsertSpceatpminflist_IDT> pBPPbokSpceDtlEstInsertSpceatpminflist_IDT){
		this.pBPPbokSpceDtlEstInsertSpceatpminflist_IDT= pBPPbokSpceDtlEstInsertSpceatpminflist_IDT;
		this.setIsSet_pBPPbokSpceDtlEstInsertSpceatpminflist_IDT(true);
	}
	
	public void setpBPPbokSpceDtlEstInsertSpceatpminflist_IDT(PBPPbokSpceDtlEstInsertSpceatpminflist_IDT... items){
		List<PBPPbokSpceDtlEstInsertSpceatpminflist_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceDtlEstInsertSpceatpminflist_IDT item: items ){
				_items.add(item);
			}
		}
		this.setpBPPbokSpceDtlEstInsertSpceatpminflist_IDT(_items);
	}
				
	@Override
	public PBPPbokSpceDtlEstInsertSpceatpminf_IDT clone(){
		try{
			PBPPbokSpceDtlEstInsertSpceatpminf_IDT object= (PBPPbokSpceDtlEstInsertSpceatpminf_IDT)super.clone();
			if ( this.pBPPbokSpceDtlEstInsertSpceatpminflist_IDT== null ) object.pBPPbokSpceDtlEstInsertSpceatpminflist_IDT= null;
			else{
				List<PBPPbokSpceDtlEstInsertSpceatpminflist_IDT> clonedList= new ArrayList<>(this.pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.size());
				for( PBPPbokSpceDtlEstInsertSpceatpminflist_IDT item : pBPPbokSpceDtlEstInsertSpceatpminflist_IDT ){
					clonedList.add((PBPPbokSpceDtlEstInsertSpceatpminflist_IDT)item.clone());
				}
				object.pBPPbokSpceDtlEstInsertSpceatpminflist_IDT= clonedList;
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
		
		result= prime * result + ((this.rprsAcno==null)?0:this.rprsAcno.hashCode());
		result= prime * result + ((this.spceSrno==null)?0:this.spceSrno.hashCode());
		result= prime * result + ((this.pBPPbokSpceDtlEstInsertSpceatpminflist_IDT==null)?0:this.pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstInsertSpceatpminf_IDT other= (PBPPbokSpceDtlEstInsertSpceatpminf_IDT)obj;
		{
			Object _rprsAcno= getRprsAcno();
			Object __rprsAcno= other.getRprsAcno();
			if ( _rprsAcno== null ) { if ( __rprsAcno!= null ) return false; }
			else if ( !_rprsAcno.equals(__rprsAcno) ) return false;
		}
		{
			Object _spceSrno= getSpceSrno();
			Object __spceSrno= other.getSpceSrno();
			if ( _spceSrno== null ) { if ( __spceSrno!= null ) return false; }
			else if ( !_spceSrno.equals(__spceSrno) ) return false;
		}
		{
			Object _pBPPbokSpceDtlEstInsertSpceatpminflist_IDT= getpBPPbokSpceDtlEstInsertSpceatpminflist_IDT();
			Object __pBPPbokSpceDtlEstInsertSpceatpminflist_IDT= other.getpBPPbokSpceDtlEstInsertSpceatpminflist_IDT();
			if ( _pBPPbokSpceDtlEstInsertSpceatpminflist_IDT== null ) { if ( __pBPPbokSpceDtlEstInsertSpceatpminflist_IDT!= null ) return false; }
			else if ( !_pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.equals(__pBPPbokSpceDtlEstInsertSpceatpminflist_IDT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstInsertSpceatpminf_IDT.class.getName()).append(":\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("\tspceSrno: ");
		sb.append(spceSrno==null?"null":getSpceSrno());
		sb.append("\n");
		sb.append("\tpBPPbokSpceDtlEstInsertSpceatpminflist_IDT: ");
		if ( pBPPbokSpceDtlEstInsertSpceatpminflist_IDT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.size());
			sb.append("(items)\n");
	
			int max= (10<pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.size())?10:pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPPbokSpceDtlEstInsertSpceatpminflist_IDT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.size() ){
				sb.append("\tpBPPbokSpceDtlEstInsertSpceatpminflist_IDT[.] : ").append("more ").append((pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}
	
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
		
		messageLen+= 13; /* rprsAcno */
		messageLen+= 10; /* spceSrno */
		{/*pBPPbokSpceDtlEstInsertSpceatpminflist_IDT*/
			int size=1;
			int count= pBPPbokSpceDtlEstInsertSpceatpminflist_IDT == null ? 0 : pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.size();
			int min= size > count?count:size;
			PBPPbokSpceDtlEstInsertSpceatpminflist_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceDtlEstInsertSpceatpminflist_IDT element= pBPPbokSpceDtlEstInsertSpceatpminflist_IDT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstInsertSpceatpminflist_IDT();
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
	
		list.add("rprsAcno");
		list.add("spceSrno");
		list.add("pBPPbokSpceDtlEstInsertSpceatpminflist_IDT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rprsAcno", get("rprsAcno"));
		map.put("spceSrno", get("spceSrno"));
		map.put("pBPPbokSpceDtlEstInsertSpceatpminflist_IDT", get("pBPPbokSpceDtlEstInsertSpceatpminflist_IDT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 805042946:/* rprsAcno */
			return getRprsAcno();
		case 2106037375:/* spceSrno */
			return getSpceSrno();
		case 1801473756:/* pBPPbokSpceDtlEstInsertSpceatpminflist_IDT */
			return getpBPPbokSpceDtlEstInsertSpceatpminflist_IDT();
		default:
			throw new IllegalArgumentException("Field name not found. : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 805042946:/* rprsAcno */
			setRprsAcno((String)value);
			break;
		case 2106037375:/* spceSrno */
			setSpceSrno((String)value);
			break;
		case 1801473756:/* pBPPbokSpceDtlEstInsertSpceatpminflist_IDT */
			setpBPPbokSpceDtlEstInsertSpceatpminflist_IDT((List<PBPPbokSpceDtlEstInsertSpceatpminflist_IDT>)value);
			break;
		default:
			break;
		}
	}
	
}
