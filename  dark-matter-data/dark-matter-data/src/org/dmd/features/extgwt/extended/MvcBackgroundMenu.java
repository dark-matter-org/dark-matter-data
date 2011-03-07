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

import org.dmd.features.extgwt.generated.dmw.MvcBackgroundMenuDMW;

public class MvcBackgroundMenu extends MvcBackgroundMenuDMW {

	@Override
	public String getDefaultImport(){
		return("org.dmd.features.extgwt.client.util.menu.DefaultBackgroundMenu");
	}
	
	@Override
	public String getDefaultClass(){
		return("DefaultBackgroundMenu");
	}

	@Override
	public String getInstantiation(){
		if (getCustomRender()){
			return(null);
		}
		else{
			StringBuffer sb = new StringBuffer();
			sb.append("        " + getVariableName() + " = new " + getDefaultClass() + "(");
			sb.append("\"" + getName() + "\"");
			sb.append(");\n");
			return(sb.toString());
		}
	}

}
