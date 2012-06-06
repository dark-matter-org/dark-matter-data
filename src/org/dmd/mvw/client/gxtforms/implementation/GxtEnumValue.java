package org.dmd.mvw.client.gxtforms.implementation;

import com.extjs.gxt.ui.client.data.BaseModel;

/**
 * The GxtEnumValue is a helper class that's used to represent values associated
 * with Dark Matter Schema EnumDefinition. This is required since ComboBoxes are
 * populated using a ListStore which takes a BaseModel derived class.
 * <p />
 * Instance of GxtEnumValues are generated from GxtEnumMapping declarations in
 * Model View Whatever (MVW).
 */
@SuppressWarnings("serial")
public class GxtEnumValue extends BaseModel {
	
	int numericValue;
	
	public GxtEnumValue(String enumValue, Integer nv, String sortOrder, String label){
		setEnumValue(enumValue);
		numericValue = nv;
		setSortOrder(sortOrder);
		setLabel(label);
	}

	public void setEnumValue(String enumValue){
		set("enumValue",enumValue);
	}
	
	public String getEnumValue(){
		return(get("enumValue"));
	}
	
	public int getNumericValue(){
		return(numericValue);
	}
	
	public void setSortOrder(String sortOrder){
		set("sortOrder",sortOrder);
	}
	
	public String getSortOrder(){
		return(get("sortOrder"));
	}
	
	public void setLabel(String label){
		set("label",label);
	}
	
	public String getLabel(){
		return(get("label"));
	}
	
	public String toString(){
		return(getEnumValue() + " - " + numericValue + " - " + getSortOrder() + " - " + getLabel());
	}
	
//	@SuppressWarnings("unchecked")
//	@Override
//	public <X> X get(String property) {
//		if (property.equals("enumValue"))
//			return (X) (getEnumValue());
//		if (property.equals("sortOrder"))
//			return (X) (getSortOrder());
//		if (property.equals("label"))
//			return (X) (getLabel());
//		return(null);
//	}

	
}
