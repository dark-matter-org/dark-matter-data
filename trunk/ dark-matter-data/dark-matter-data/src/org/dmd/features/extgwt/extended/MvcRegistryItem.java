package org.dmd.features.extgwt.extended;

import org.dmd.dmc.DmcObject;
import org.dmd.features.extgwt.generated.dmw.MvcRegistryItemDMW;

public class MvcRegistryItem extends MvcRegistryItemDMW {
	
	// The name of this registry item as a variable
	String variableName;
	
	// The class of the resource i.e. just the class name, not the full userDataType
	String itemClass;

	public MvcRegistryItem(){
		super();
	}
	
	public MvcRegistryItem(DmcObject obj){
		super(obj);
	}

	/**
	 * Returns the variable name used for this resource in a controller or view.
	 * @return
	 */
	public String getVariableName(){
		if (variableName == null){
			StringBuffer sb = new StringBuffer(getCamelCaseName());
			sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
			variableName = sb.toString();
		}
		return(variableName);
	}
	
	/**
	 * @return Just the class name of the resource.
	 */
	public String getItemClass(){
		if (itemClass == null){
			int lastDot = getUserDataType().lastIndexOf(".");
			itemClass = getUserDataType().substring(lastDot+1);
		}
		return(itemClass);
	}
}
