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

import org.dmd.dms.ClassDefinition;
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;
import org.dmd.features.extgwt.generated.dmw.MvcMenuDMW;

public class MvcMenu extends MvcMenuDMW {

	protected MvcMenu(MvcMenuDMO obj, ClassDefinition cd) {
		super(obj, cd);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Returns the import for the default implementation of the menu type.
	 * This should be overridden in derived classes.
	 * @return
	 */
	public String getDefaultImport(){
		return(null);
	}
	
	/**
	 * Returns the class for the default implementation of the menu type.
	 * This should be overridden in derived classes.
	 * @return
	 */
	public String getDefaultClass(){
		return(null);
	}
	
	/**
	 * Returns the code for the instantiation of a local variable for this menu.
	 * @return
	 */
	public String getInstantiation(){
		return(null);
	}
	
}
