package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;

abstract public class BackgroundMenuInstance extends MenuInstance {
	
	/**
	 * Constructs a new popup menu for the background of a display widget.
	 * @param n  the mvc menu name.
	 */
	protected BackgroundMenuInstance(String n) {
		super(n);
	}
	
	abstract public void addToMenuContainer(MenuSubItemIF msi);

	abstract public Component getMenu();

}
