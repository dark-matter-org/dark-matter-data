package org.dmd.mvw.client.mvwmenus.base;

import org.dmd.mvw.client.mvwmenus.interfaces.MenuSubItemIF;

abstract public class MvwSubMenu extends MvwMenu implements MenuSubItemIF {

	String 	_menuOrder;
	String 	_addToMenu;
	boolean	_dynamic;

	protected MvwSubMenu(String itemName, String menuOrder, String addToMenu, boolean dynamic) {
		super(itemName);
		
		_menuOrder 	= menuOrder;
		_addToMenu 	= addToMenu;
		_dynamic	= dynamic;
	}

	@Override
	public String getMenuOrder() {
		return(_menuOrder);
	}

	@Override
	public String getAddToMenu(){
		return(_addToMenu);
	}
	
	@Override
	public boolean isDynamic() {
		return(_dynamic);
	}
	
}
