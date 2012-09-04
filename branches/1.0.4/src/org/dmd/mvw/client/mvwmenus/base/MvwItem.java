//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.mvw.client.mvwmenus.base;


import org.dmd.mvw.client.mvwmenus.interfaces.MenuSubItemIF;

/**
 * The MvwItem class provides a common base for items that are added to menus,
 * including actual menu items and separators.
 */
abstract public class MvwItem implements MenuSubItemIF {

	String 	_name;
	String 	_menuOrder;
	String 	_addToMenu;
	boolean	_dynamic;
	
	// The action we trigger
	protected Action	action;
	
	/**
	 * Constructs a new menu item.
	 * @param n   The menu item name.
	 * @param o   The menu order.
	 * @param an  The action name.
	 * @param atm The add to menu name.
	 * @param d   Dynamic flag
	 */
	protected MvwItem(String itemName, String menuOrder, String addToMenu, boolean dynamic) {
		_name 		= itemName;
		_menuOrder 	= menuOrder;
		_addToMenu  = addToMenu;
		_dynamic	= dynamic;
	}

	////////////////////////////////////////////////////////////////////////////////
	// Partial MenuSubItemIF implementation

	@Override
	public String getName() {
		return(_name);
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
	
	public String toString(){
		return(_name + "  " + _menuOrder + "  " + _addToMenu + "  " + _dynamic);
	}
	
}
