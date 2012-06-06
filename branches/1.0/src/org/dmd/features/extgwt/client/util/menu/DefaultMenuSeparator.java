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
import com.extjs.gxt.ui.client.widget.menu.SeparatorMenuItem;

public class DefaultMenuSeparator implements MenuSubItemIF {

	SeparatorMenuItem	component;
	String 				name;
	String 				menuOrder;
	String 				addToMenu;
	boolean				dynamic;

	/**
	 * Constructs a simple menu item.
	 * @param n     The MVC name of the item.
	 * @param o     The menu order of the item.
	 * @param atm   The add to menu name.
	 */
	public DefaultMenuSeparator(String n, String o, String atm) {
		component = new SeparatorMenuItem();
		name 		= n;
		menuOrder 	= o;
		addToMenu   = atm;
	}

	/**
	 * Constructs a simple menu item.
	 * @param n     The MVC name of the item.
	 * @param o     The menu order of the item.
	 * @param atm   The add to menu name.
	 * @param d     Dynamic flag
	 */
	public DefaultMenuSeparator(String n, String o, String atm, boolean d) {
		component = new SeparatorMenuItem();
		name 		= n;
		menuOrder 	= o;
		addToMenu   = atm;
		dynamic		= d;
	}

	////////////////////////////////////////////////////////////////////////////////
	// MenuSubItemIF implementation

	@Override
	public String getMenuOrder() {
		return(menuOrder);
	}

	@Override
	public String getName() {
		return(name);
	}
	
	@Override
	public String getAddToMenu(){
		return(addToMenu);
	}
	
	@Override
	public Component getComponent() {
		return(component);
	}

	@Override
	public void initialize() {

	}

	@Override
	public boolean isDynamic() {
		return(dynamic);
	}

}
