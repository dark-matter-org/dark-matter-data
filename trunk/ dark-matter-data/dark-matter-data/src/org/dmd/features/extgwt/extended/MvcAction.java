package org.dmd.features.extgwt.extended;

import org.dmd.features.extgwt.generated.dmw.MvcActionDMW;

public class MvcAction extends MvcActionDMW {
	
	String importClass;
	
	// By convention, our name starts with a capital e.g. ActionLogout
	// but this is the same name with the first character in lowercase
	String variableName;

	public MvcAction(){
		super();
	}
	
	public String getImportClass(){
		if (importClass == null)
			importClass = getDefinedInMVCConfig().getGenPackage() + ".extended." + getCamelCaseName();
		
		return(importClass);
	}
	
	/**
	 * @return The variable name used for this action in the controller.
	 */
	public String getVariableName(){
		if (variableName == null){
			StringBuffer sb = new StringBuffer(getCamelCaseName());
			sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
			variableName = sb.toString();
		}
		return(variableName);
	}
	
}
