package org.dmd.mvw.client.gxtmenus.implementation;

import org.dmd.mvw.client.mvwmenus.base.MenuItemBase;
import org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF;

import com.google.gwt.user.client.ui.Widget;

public class DefaultMenuItem extends MenuItemBase {


	protected DefaultMenuItem(String itemName, String menuOrder, String actionName, String addToMenu) {
		super(itemName, menuOrder, actionName, addToMenu);
	}

	protected DefaultMenuItem(String itemName, String menuOrder, String actionName, String addToMenu, boolean dynamic) {
		super(itemName, menuOrder, actionName, addToMenu, dynamic);
	}

	@Override
	public TriggerIF getTrigger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public Widget getWidget() {
		// TODO Auto-generated method stub
		return null;
	}

}
