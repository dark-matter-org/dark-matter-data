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

import org.dmd.features.extgwt.generated.dmw.MvcMenuSeparatorDMW;

public class MvcMenuSeparator extends MvcMenuSeparatorDMW {

	public String getDefaultImport(){
		MvcMenu menu = getAddToMenu();
		
		if (menu instanceof MvcToolBar){
			return("org.dmd.features.extgwt.client.util.menu.DefaultToolbarSeparator");
		}
		else{
			return("org.dmd.features.extgwt.client.util.menu.DefaultMenuSeparator");
		}
	}
	
	public String getDefaultClass(){
		MvcMenu menu = getAddToMenu();
		
		if (menu instanceof MvcToolBar){
			return("DefaultToolbarSeparator");
		}
		else{
			return("DefaultMenuSeparator");
		}
	}

	public String getInstantiation(){
		StringBuffer sb = new StringBuffer();
		sb.append("        " + getVariableName() + " = new " + getDefaultClass() + "(");
		sb.append("\"" + getName() + "\",");
		sb.append("\"" + getMenuOrder() + "\",");
		sb.append("\"" + getAddToMenu().getName() + "\"");
		sb.append(");");
		
		return(sb.toString());
	}

}
