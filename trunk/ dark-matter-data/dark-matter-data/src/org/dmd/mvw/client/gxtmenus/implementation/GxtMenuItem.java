package org.dmd.mvw.client.gxtmenus.implementation;

import org.dmd.mvw.client.mvwmenus.base.MvwMenuItem;
import org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF;

import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.widget.menu.Item;
import com.google.gwt.user.client.ui.Widget;

/**
 * The GxtMenuItem just provides 
 */
abstract public class GxtMenuItem extends MvwMenuItem implements TriggerIF {
	
	// This will be initialized in the derived class constructor
	Item	item;

	protected GxtMenuItem(String itemName, String menuOrder, String actionName, String addToMenu, boolean dynamic) {
		super(itemName, menuOrder, actionName, addToMenu, dynamic);
	}

	@Override
	public void initialize() {
		System.out.println("GxtMenuItem.initialize() - " + getName());
		item.addSelectionListener(new ItemSelectionListener<MenuEvent>(this, action));
	}

	@Override
	public Widget getWidget() {
		return(item);
	}

	@Override
	public void disable() {
		item.disable();
	}

	@Override
	public void enable() {
		item.enable();
	}

}
