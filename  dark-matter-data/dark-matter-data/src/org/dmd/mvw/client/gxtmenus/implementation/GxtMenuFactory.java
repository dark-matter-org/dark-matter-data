package org.dmd.mvw.client.gxtmenus.implementation;

import org.dmd.mvw.client.mvwmenus.base.MvwMenu;
import org.dmd.mvw.client.mvwmenus.base.MvwMenuFactory;
import org.dmd.mvw.client.mvwmenus.base.MvwMenuItem;
import org.dmd.mvw.client.mvwmenus.base.MvwSeparator;

import com.google.gwt.resources.client.ImageResource;

/**
 * The GxtMenuFactory provides a menu system implementation based on the GXT widget set.
 */
public class GxtMenuFactory extends MvwMenuFactory {
	
	// Menubars
	final static String MenuBar 		= "MenuBar";
	
	// Submenus
	final static String SubMenuButton 	= "SubMenuButton";
	
	// Menu items
	final static String MenuItem 		= "MenuItem";
	
	// Separators
	final static String Separator 		= "Separator";
	
	public GxtMenuFactory(){
		
	}

	@Override
	public MvwMenu createMenu(String menuType, String menuName) {
		if (menuType.equals(MenuBar))
			return(new MenuBar(menuName));
		else
			throw(new IllegalStateException("Invalid menu type identifier: " + menuType));
	}

	@Override
	public MvwMenu createSubMenu(String menuType, String itemName, String menuOrder, String addToMenu, boolean dynamic, String label, ImageResource image) {
		if (menuType.equals(SubMenuButton))
			return(new SubMenuButton(itemName, menuOrder, addToMenu, dynamic, label, image));
		else
			throw(new IllegalStateException("Invalid submenu type identifier: " + menuType));
	}
	
	@Override
	public MvwMenuItem createMenuItem(String itemType, String itemName, String menuOrder, String addToMenu, boolean dynamic, String actionName, String label, ImageResource image) {
		if (itemType.equals(MenuItem))
			return(new MenuItem(itemName, menuOrder, actionName, addToMenu, dynamic, label));
		else
			throw(new IllegalStateException("Invalid menu item type identifier: " + itemType));
	}

	@Override
	public MvwSeparator createSeparator(String separatorType, String itemName, String menuOrder, String addToMenu, boolean dynamic) {
		if (separatorType.equals(Separator))
			return(new Separator(itemName, menuOrder, addToMenu, dynamic));
		else
			throw(new IllegalStateException("Invalid separator type identifier: " + separatorType));
	}

	///////////////////////////////////////////////////////////////////////////
	// Convenience functions for creating dynamic menus and items
	
	public MvwMenu createMenuBar(String menuName){
		return(new MenuBar(menuName));
	}

	
}
