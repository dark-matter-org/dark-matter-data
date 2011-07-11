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
import org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF;

/**
 * The MenuItemInstance class provides a common base for menu items
 * that represent actual trigger points for functionality, as opposed
 * to submenus.
 */
abstract public class MenuItemBase implements MenuSubItemIF, TriggerIF {

	String 	_name;
	String 	_menuOrder;
	String 	_addToMenu;
	String 	_actionName;
	boolean	_dynamic;
	
	// The action we trigger
	Action	action;
	
	/**
	 * 
	 * @param n The menu item name.
	 * @param o The menu order.
	 * @param an The action name.
	 * @param atm The add to menu name.
	 */
	protected MenuItemBase(String itemName, String menuOrder, String actionName, String addToMenu){
		_name 		= itemName;
		_menuOrder 	= menuOrder;
		_actionName = actionName;
		_addToMenu  = addToMenu;
	}

	/**
	 * 
	 * @param n   The menu item name.
	 * @param o   The menu order.
	 * @param an  The action name.
	 * @param atm The add to menu name.
	 * @param d   Dynamic flag
	 */
	protected MenuItemBase(String itemName, String menuOrder, String actionName, String addToMenu, boolean dynamic) {
		_name 		= itemName;
		_menuOrder 	= menuOrder;
		_actionName = actionName;
		_addToMenu  = addToMenu;
		_dynamic	= dynamic;
	}

	////////////////////////////////////////////////////////////////////////////////
	// Partial MenuSubItemIF implementation

	@Override
	public String getMenuOrder() {
		return(_menuOrder);
	}

	@Override
	public String getName() {
		return(_name);
	}
	
	@Override
	public String getAddToMenu(){
		return(_addToMenu);
	}
	
	/**
	 * Derived classes must override this method to initialize their menu triggering
	 * handling, since it will be called after the setAction() method is called.
	 */
	abstract public void initialize();
	
	@Override
	public boolean isDynamic() {
		return(_dynamic);
	}
	////////////////////////////////////////////////////////////////////////////////
	// Partial TriggerIF implementation
	
	/**
	 * Called by the Action when it is in an enabled state.
	 */
	@Override
	public void enable(){
		getTrigger().enable();
	}
	
	/**
	 * Called by the Action when it can't be triggered.
	 */
	@Override
	public void disable(){
		getTrigger().disable();
	}
	
	/**
	 * Derived classes must overload this to return the component they use to represent
	 * the menu item.
	 */
	abstract public TriggerIF getTrigger();
	
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
	}
	
	public String toString(){
		return(_name + "  " + _menuOrder + "  " + _addToMenu + "  " + _actionName + "  " + _dynamic);
	}
	
}
