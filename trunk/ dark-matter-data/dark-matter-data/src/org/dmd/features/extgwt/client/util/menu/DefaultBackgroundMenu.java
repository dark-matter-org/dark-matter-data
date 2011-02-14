package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.menu.Menu;

public class DefaultBackgroundMenu extends BackgroundMenuInstance {
	
	Menu menu;
	
	/**
	 * Constructs a new background popup menu.
	 * @param n  the mvc menu name.
	 * @param fc The fully qualified DMO class name.
	 */
	public DefaultBackgroundMenu(String n) {
		super(n);
		menu = new Menu();
	}

	@Override
	public void addToMenuContainer(MenuSubItemIF msi) {
		menu.add(msi.getComponent());
	}

	@Override
	public Component getMenu() {
		return(menu);
	}

}
