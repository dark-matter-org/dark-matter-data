package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.menu.Menu;

public class DefaultPopupMenu extends PopupMenuInstance {
	
	Menu menu;
	
	/**
	 * Constructs a new popup menu.
	 * @param n  the mvc menu name.
	 * @param fc The fully qualified DMO class name.
	 */
	public DefaultPopupMenu(String n, String fc) {
		super(n,fc);
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
