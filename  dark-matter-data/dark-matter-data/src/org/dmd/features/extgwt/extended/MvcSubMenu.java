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

import org.dmd.features.extgwt.generated.dmw.MvcSubMenuDMW;

public class MvcSubMenu extends MvcSubMenuDMW {

	@Override
	public String getDefaultImport(){
		MvcMenu menu = getAddToMenu();
		if (menu instanceof MvcToolBar)
			return("org.dmd.features.extgwt.client.util.menu.DefaultToolbarSubmenu");
		else
			return("org.dmd.features.extgwt.client.util.menu.DefaultMenubarSubmenu");
	}
	
	@Override
	public String getDefaultClass(){
		MvcMenu menu = getAddToMenu();
		if (menu instanceof MvcToolBar)
			return("DefaultToolbarSubmenu");
		else
			return("DefaultMenubarSubmenu");
	}

	@Override
	public String getInstantiation(){
		MvcMenu menu = getAddToMenu();
		StringBuffer sb = new StringBuffer();
		
		if (getCustomRender()){
			return(null);
		}
		else{
			if (menu instanceof MvcToolBar){
				sb.append("        " + getVariableName() + " = new " + getDefaultClass() + "(");
				sb.append("\"" + getName() + "\", ");
				sb.append("\"" + getMenuOrder() + "\", ");
				sb.append("\"" + getAddToMenu().getName() + "\", ");
				sb.append("\"" + getDisplayLabel() + "\"");
				sb.append(");\n");
			}
			else{
				return(null);
			}
		}
		
		return(sb.toString());
	}

}
