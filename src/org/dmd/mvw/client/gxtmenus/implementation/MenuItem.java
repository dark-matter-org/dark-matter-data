package org.dmd.mvw.client.gxtmenus.implementation;


public class MenuItem extends GxtMenuItem {

	public MenuItem(String itemName, String menuOrder, String actionName, String addToMenu, boolean dynamic, String label) {
		super(itemName, menuOrder, actionName, addToMenu, dynamic);
		item = new com.extjs.gxt.ui.client.widget.menu.MenuItem(label);
	}

}
