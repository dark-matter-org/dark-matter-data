//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;

abstract public class PopupMenuInstance extends MenuInstance {

	// The fully qualified name of the 
	String forClass;
	
	/**
	 * Constructs a new popup menu.
	 * @param n  the mvc menu name.
	 * @param fc The fully qualified DMO class name.
	 */
	protected PopupMenuInstance(String n, String fc) {
		super(n);
		forClass = fc;
	}
	
	public String getForClass(){
		return(forClass);
	}

	abstract public void addToMenuContainer(MenuSubItemIF msi);

	abstract public Component getMenu();

}
