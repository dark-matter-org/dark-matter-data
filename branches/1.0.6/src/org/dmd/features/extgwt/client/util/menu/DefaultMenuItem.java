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

import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.menu.MenuItem;

public class DefaultMenuItem extends MenuItemInstance {

	MenuItem	component;
	
	/**
	 * Constructs a simple menu item.
	 * @param n     The MVC name of the item.
	 * @param o     The menu order of the item.
	 * @param an    The name of the action to be triggered.
	 * @param atm   The add to menu name.
	 * @param label The label for the item
	 */
	public DefaultMenuItem(String n, String o, String an, String atm, String label) {
		super(n, o, an, atm);
		component = new MenuItem(label);
	}

	/**
	 * Constructs a simple menu item.
	 * @param n     The MVC name of the item.
	 * @param o     The menu order of the item.
	 * @param an    The name of the action to be triggered.
	 * @param atm   The add to menu name.
	 * @param label The label for the item
	 * @param d     Dynamic flag
	 */
	public DefaultMenuItem(String n, String o, String an, String atm, String label, boolean d) {
		super(n, o, an, atm,d);
		component 	= new MenuItem(label);
	}

	@Override
	public Component getComponent() {
		return(component);
	}

	@Override
	public void initialize() {
		System.out.println("DefaultMenuItem.initialize()");
		component.addSelectionListener(new ItemSelectionListener<MenuEvent>(this, action));
	}

}
