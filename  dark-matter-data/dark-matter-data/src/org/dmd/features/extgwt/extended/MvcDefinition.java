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

import org.dmd.dmg.util.GeneratorUtils;
import org.dmd.dms.ClassDefinition;
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
import org.dmd.features.extgwt.generated.dmw.MvcDefinitionDMW;

abstract public class MvcDefinition extends MvcDefinitionDMW {
	
	String camelCaseName;
	String variableName;
	
	protected MvcDefinition(){
		super();
	}
	
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
			camelCaseName = GeneratorUtils.dotNameToCamelCase(getName().getNameString());
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
