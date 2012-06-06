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

import org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF;

/**
 * The MenuItemInstance class provides a common base for menu items
 * that represent actual trigger points for functionality.
 */
abstract public class MvwMenuItem extends MvwItem implements TriggerIF {

	String 	_actionName;
	
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
	protected MvwMenuItem(String itemName, String menuOrder, String actionName, String addToMenu, boolean dynamic) {
		super(itemName,menuOrder,addToMenu,dynamic);
		_actionName = actionName;
	}
	
	/**
	 * Derived classes must override this method to initialize their menu triggering
	 * handling, since it will be called after the setAction() method is called.
	 */
	abstract public void initialize();
		
	////////////////////////////////////////////////////////////////////////////////

	/**
	 * @return The name of the action triggered by this menu item.
	 */
	public String getActionName(){
		return(_actionName);
	}

	/**
	 * This method is called by the MenuController to set the action on this
	 * menu item
	 * @param a
	 */
	public void setAction(Action a){
		action = a;
		action.addTrigger(this);
		initialize();
	}
	
	public String toString(){
		return(_name + "  " + _menuOrder + "  " + _addToMenu + "  " + _actionName + "  " + _dynamic);
	}
	
}
