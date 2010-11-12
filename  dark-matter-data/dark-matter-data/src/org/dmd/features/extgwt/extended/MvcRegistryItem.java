package org.dmd.features.extgwt.extended;

import org.dmd.features.extgwt.generated.dmw.MvcRegistryItemDMW;
import org.dmd.util.formatting.CodeFormatter;

public class MvcRegistryItem extends MvcRegistryItemDMW {
	
	// The name of this registry item as a variable
	String variableName;
	
	// The type of the resource with collection and generic info in place.
	// e.g. List<String> or Map<String,Person>
	String itemType;
	
	// The local function that retrieves a registry item
	StringBuffer accessFunction;
	
	// The local that registers an item with the registry
	StringBuffer registerFunction;

	public MvcRegistryItem(){
		super();
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
	 * @return A register function for this registry item
	 */
	public String getRegisterFunction(){
		if (registerFunction == null){
			registerFunction = new StringBuffer();
			registerFunction.append("    /**\n");
			registerFunction.append("     * Adds the " + getCamelCaseName() + " item to the Registry.\n");
			CodeFormatter.dumpCodeComment(getDescription(), registerFunction, "     * ");
			registerFunction.append("     */\n");
			
			registerFunction.append("    protected void register" + getCamelCaseName() + "(" + getItemType() + " item){\n");
			registerFunction.append("            Registry.register(\"" + getName() + "\", item);\n");
			registerFunction.append("    }\n\n");

		}
		return(registerFunction.toString());
	}
	
	/**
	 * @return The item type with appropriate collection and generic arguments.
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

//	/**
//	 * @return The variable name used for this resource in a controller or view.
//	 */
//	public String getVariableName(){
//		if (variableName == null){
//			StringBuffer sb = new StringBuffer(getCamelCaseName());
//			sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
//			variableName = sb.toString();
//		}
//		return(variableName);
//	}
	
	
	
}
