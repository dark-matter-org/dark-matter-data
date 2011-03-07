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

import org.dmd.features.extgwt.generated.dmw.MvcActionDMW;

public class MvcAction extends MvcActionDMW {
	
	String importClass;
	
	// By convention, our name starts with a capital e.g. ActionLogout
	// but this is the same name with the first character in lowercase
	String variableName;

	public MvcAction(){
		super();
	}
	
	public String getImportClass(MvcController c){
		if (importClass == null){
			if (c.getSubpackage() == null)
				importClass = getDefinedInMVCConfig().getGenPackage() + ".extended." + getCamelCaseName();
			else
				importClass = getDefinedInMVCConfig().getGenPackage() + ".extended." + c.getSubpackage() + "." + getCamelCaseName();
		}
		
		return(importClass);
	}
	
//	/**
//	 * @return The variable name used for this action in the controller.
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
