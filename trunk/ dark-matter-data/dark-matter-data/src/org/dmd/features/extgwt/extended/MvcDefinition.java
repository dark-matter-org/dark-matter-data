package org.dmd.features.extgwt.extended;

import org.dmd.dmg.util.GeneratorUtils;
import org.dmd.dms.ClassDefinition;
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
import org.dmd.features.extgwt.generated.dmw.MvcDefinitionDMW;

public class MvcDefinition extends MvcDefinitionDMW {
	
	String camelCaseName;
	String variableName;
	
	public MvcDefinition(MvcDefinitionDMO obj, ClassDefinition cd){
		super(obj,cd);
	}

	/**
	 * Returns the name of the object translated to camel case. For example,
	 * if the name was this.is.a.name it would be ThisIsAName.
	 * @return The name of the object translated to camel case. 
	 */
	public String getCamelCaseName(){
		if (camelCaseName == null){
			camelCaseName = GeneratorUtils.dotNameToCamelCase(getName());
		}
		
		return(camelCaseName);
	}
	
	/**
	 * Returns the camel case name with the first letter in lower case.
	 * @return The variable name.
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
