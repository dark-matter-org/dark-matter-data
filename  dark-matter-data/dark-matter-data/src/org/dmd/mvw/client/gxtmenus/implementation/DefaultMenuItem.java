package org.dmd.mvw.client.gxtmenus.implementation;

import org.dmd.mvw.client.mvwmenus.base.MenuItemBaseImpl;
import org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF;

import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.widget.menu.MenuItem;
import com.google.gwt.user.client.ui.Widget;

public class DefaultMenuItem extends MenuItemBaseImpl implements TriggerIF {

	MenuItem	menuItem;

	public DefaultMenuItem(String itemName, String menuOrder, String actionName, String addToMenu, boolean dynamic, String label) {
		super(itemName, menuOrder, actionName, addToMenu, dynamic);
		menuItem = new MenuItem(label);
	}

	@Override
	public void initialize() {
		menuItem.addSelectionListener(new ItemSelectionListener<MenuEvent>(this, action));
	}

	@Override
	public Widget getWidget() {
		return(menuItem);
	}

	@Override
	public void disable() {
		menuItem.disable();
	}

	@Override
	public void enable() {
		menuItem.enable();
	}

}
