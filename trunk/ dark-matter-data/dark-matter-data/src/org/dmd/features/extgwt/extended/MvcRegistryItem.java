package org.dmd.features.extgwt.extended;

import org.dmd.dmc.DmcObject;
import org.dmd.features.extgwt.generated.dmw.MvcRegistryItemDMW;
import org.dmd.util.formatting.CodeFormatter;

public class MvcRegistryItem extends MvcRegistryItemDMW {
	
	// The name of this registry item as a variable
	String variableName;
	
	// The type of the resource with collection and generic info in place.
	// e.g. List<String> or Map<String,Person>
	String itemType;
	
	StringBuffer accessFunction;

	public MvcRegistryItem(){
		super();
	}
	
	public MvcRegistryItem(DmcObject obj){
		super(obj);
	}
	
	/**
	 * @return An access function for this registry item
	 */
	public String getAccessFunction(){
		if (accessFunction == null){
			accessFunction = new StringBuffer();
			accessFunction.append("    /**\n");
			CodeFormatter.dumpCodeComment("@return " + getDescription(), accessFunction, "     * ");
			accessFunction.append("     */\n");
			
			accessFunction.append("    protected " + getItemType() + " get" + getCamelCaseName() + "(){\n");
			accessFunction.append("        if (" + getVariableName() + " == null)\n");
			accessFunction.append("            " + getVariableName() + " = (" + getItemType() + ") Registry.get(\"" + getName() + "\");\n");
			accessFunction.append("        return(" + getVariableName() + ");\n");
			accessFunction.append("    }\n\n");

		}
		return(accessFunction.toString());
	}
	
	/**
	 * Returns the item type with appropriate collection and generic arguments.
	 * @return
	 */
	public String getItemType(){
		if (itemType == null){
			if (getUserDataCollection() == null){
				// The simplest case, just the user data type
				itemType = CodeFormatter.getTheClass(getUserDataType());
			}
			else{
				String c = CodeFormatter.getTheClass(getUserDataCollection());
				if (getUserDataGenericSpec() == null){
					itemType = c + "<" + getUserDataType() + ">";
				}
				else{
					itemType = c + getUserDataGenericSpec();
				}
			}
		}
		
		return(itemType);
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
	
	
	
}
