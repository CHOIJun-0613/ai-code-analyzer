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
 * 통장쪼개기.자동납부.삭제 input
 */
@XmlType(propOrder={
	"rprsAcno", "spceSrno", "pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT"
}, name="PBPPbokSpceDtlEstDeleteSpceatpm_IDT")
@XmlRootElement(name="PBPPbokSpceDtlEstDeleteSpceatpm_IDT")
@BxmCategory(logicalName="통장쪼개기.자동납부.삭제.컨트롤러.입력.IO", description="통장쪼개기.자동납부.삭제 input") 
public class PBPPbokSpceDtlEstDeleteSpceatpm_IDT implements IOmmObject, Predictable, FieldInfo
{
	private static final long serialVersionUID= -526596787L;
	
	
	
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
	 * 공간.자동납부.목록.수정.컨트롤러.입력.IO
	 */
	@ApiModelProperty(
		name = "pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT"
		, dataType = "[Lcom.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT;"
		)
	@XmlElement(name="item")
	@XmlElementWrapper()
	@JsonProperty("pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT")
	@BxmOmm_Field(length=0, decimal=0, description="공간.자동납부.목록.수정.컨트롤러.입력.IO", align="left", fill="", arrayReference="1")
	private List<PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT> pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT= new ArrayList<>();
	
	
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
	private boolean isSet_pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT= false;
	protected final boolean isSet_pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT(){
		return this.isSet_pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT;
	}
	private void setIsSet_pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT(boolean value){
		this.isSet_pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT= value;
	}
	/**
	 * 공간.자동납부.목록.수정.컨트롤러.입력.IO
	 */
	@XmlTransient
	public List<PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT> getpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT(){
		return pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT;
	}
	
	/**
	 * 공간.자동납부.목록.수정.컨트롤러.입력.IO
	 * 
	 * @param pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT 공간.자동납부.목록.수정.컨트롤러.입력.IO
	 */
	@JsonSetter("pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT")
	public void setpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT(List<PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT> pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT){
		this.pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT= pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT;
		this.setIsSet_pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT(true);
	}
	
	public void setpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT(PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT... items){
		List<PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT> _items= new ArrayList<>();
		if ( items!= null && items.length> 0){
			for( PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT item: items ){
				_items.add(item);
			}
		}
		this.setpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT(_items);
	}
				
	@Override
	public PBPPbokSpceDtlEstDeleteSpceatpm_IDT clone(){
		try{
			PBPPbokSpceDtlEstDeleteSpceatpm_IDT object= (PBPPbokSpceDtlEstDeleteSpceatpm_IDT)super.clone();
			if ( this.pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT== null ) object.pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT= null;
			else{
				List<PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT> clonedList= new ArrayList<>(this.pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.size());
				for( PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT item : pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT ){
					clonedList.add((PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT)item.clone());
				}
				object.pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT= clonedList;
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
		result= prime * result + ((this.pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT==null)?0:this.pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this== obj ) return true;
		if ( obj== null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final PBPPbokSpceDtlEstDeleteSpceatpm_IDT other= (PBPPbokSpceDtlEstDeleteSpceatpm_IDT)obj;
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
			Object _pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT= getpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT();
			Object __pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT= other.getpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT();
			if ( _pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT== null ) { if ( __pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT!= null ) return false; }
			else if ( !_pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.equals(__pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT) ) return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\n[").append(PBPPbokSpceDtlEstDeleteSpceatpm_IDT.class.getName()).append(":\n");
		sb.append("\trprsAcno: ");
		sb.append(rprsAcno==null?"null":getRprsAcno());
		sb.append("\n");
		sb.append("\tspceSrno: ");
		sb.append(spceSrno==null?"null":getSpceSrno());
		sb.append("\n");
		sb.append("\tpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT: ");
		if ( pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT== null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.size());
			sb.append("(items)\n");
	
			int max= (10<pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.size())?10:pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.size();
	
			for ( int i= 0; i < max; ++i ){
				sb.append("\tpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT[");
				sb.append(i);
				sb.append("] : ");
				sb.append(pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.get(i));
				sb.append("\n");
			}
	
			if ( max < pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.size() ){
				sb.append("\tpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT[.] : ").append("more ").append((pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.size()-max)).append(" items").append("\n");
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
		{/*pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT*/
			int size=1;
			int count= pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT == null ? 0 : pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.size();
			int min= size > count?count:size;
			PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT element= pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Message length can not be predicted.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new com.skbank.sml.fns.pbp.ctr.dto.PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT();
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
		list.add("pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT");
	
		return list;
	}
	
	@Override
	@JsonIgnore
	public Map<String, Object> getFieldValues(){
		Map<String, Object> map= new LinkedHashMap<>();
	
		map.put("rprsAcno", get("rprsAcno"));
		map.put("spceSrno", get("spceSrno"));
		map.put("pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT", get("pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT"));
	
		return map;
	}
	
	
	@Override
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 805042946:/* rprsAcno */
			return getRprsAcno();
		case 2106037375:/* spceSrno */
			return getSpceSrno();
		case 258766023:/* pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT */
			return getpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT();
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
		case 258766023:/* pBPPbokSpceDtlEstDeleteSpceatpmlist_IDT */
			setpBPPbokSpceDtlEstDeleteSpceatpmlist_IDT((List<PBPPbokSpceDtlEstDeleteSpceatpmlist_IDT>)value);
			break;
		default:
			break;
		}
	}
	
}
