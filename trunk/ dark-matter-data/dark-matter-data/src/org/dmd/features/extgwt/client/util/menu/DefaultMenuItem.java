package org.dmd.features.extgwt.client.util.menu;

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
	protected DefaultMenuItem(String n, String o, String an, String atm, String label) {
		super(n, o, an, atm);
		component = new MenuItem(label);
	}

	@Override
	public Component getComponent() {
		return(component);
	}

	@Override
	public void initialize() {
		
	}

}
