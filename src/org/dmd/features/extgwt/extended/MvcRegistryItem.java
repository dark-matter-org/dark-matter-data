//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
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
			
			accessFunction.append("    public " + getItemType() + " get" + getCamelCaseName() + "(){\n");
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
