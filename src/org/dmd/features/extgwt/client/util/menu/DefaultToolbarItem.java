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

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.button.ToggleButton;

public class DefaultToolbarItem extends MenuItemInstance {

	ToggleButton	component;
	
	/**
	 * Constructs a simple toolbar button.
	 * @param n     The MVC name of the item.
	 * @param o     The menu order of the item.
	 * @param an    The name of the action to be triggered.
	 * @param atm   The add to menu name.
	 * @param label The label for the item
	 */
	public DefaultToolbarItem(String n, String o, String an, String atm, String label) {
		super(n, o, an, atm);
		component = new ToggleButton(label);
	}

	@Override
	public Component getComponent() {
		return(component);
	}

	@Override
	public void initialize() {
		component.addSelectionListener(new ItemSelectionListener<ButtonEvent>(this, action));

	}

}
