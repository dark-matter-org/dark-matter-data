package org.dmd.mvw.client.gxtmenus.implementation;

import org.dmd.mvw.client.mvwmenus.base.MvwMenu;
import org.dmd.mvw.client.mvwmenus.interfaces.MenuSubItemIF;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.google.gwt.user.client.ui.Widget;

public class MenuBar extends MvwMenu {
	
	ToolBar	menu;

	public MenuBar(String n) {
		super(n);
		menu = new ToolBar();
	}

	@Override
	public void addToMenuContainer(MenuSubItemIF msi) {
		menu.add((Component) msi.getWidget());
	}

	@Override
	public Widget getMenu() {
		return(menu);
	}

	@Override
	public void removeFromMenuContainer(MenuSubItemIF msi) {
		menu.remove((Component) msi.getWidget());
	}

}
