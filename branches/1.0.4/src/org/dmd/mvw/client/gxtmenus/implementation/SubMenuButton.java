package org.dmd.mvw.client.gxtmenus.implementation;

import org.dmd.mvw.client.mvwmenus.base.MvwSubMenu;
import org.dmd.mvw.client.mvwmenus.interfaces.MenuSubItemIF;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Widget;

public class SubMenuButton extends MvwSubMenu {
	
	Button 	menuButton;
	Menu	menu;

	public SubMenuButton(String itemName, String menuOrder, String addToMenu, boolean dynamic, String label, ImageResource image) {
		super(itemName, menuOrder, addToMenu, dynamic);
		
		if (label == null)
			menuButton = new Button();
		else
			menuButton = new Button(label);
		
		menu	 = new Menu();
		
		menuButton.setMenu(menu);
	}

	@Override
	public void addToMenuContainer(MenuSubItemIF msi) {
		menu.add((Component) msi.getWidget());
	}

	@Override
	public Widget getMenu() {
		return(menuButton);
	}

	@Override
	public void removeFromMenuContainer(MenuSubItemIF msi) {
		menu.remove((Component) msi.getWidget());
	}

	@Override
	public Widget getWidget() {
		return(menuButton);
	}

	@Override
	public void initialize() {
		// Nothing to do here
	}

}
