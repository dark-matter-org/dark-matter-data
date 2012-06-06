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
package org.dmd.features.extgwt.client.util.menu;

import org.dmd.features.extgwt.client.interfaces.TriggerIF;
import org.dmd.features.extgwt.client.util.Action;

import com.extjs.gxt.ui.client.widget.Component;


/**
 * The MenuItemInstance class provides a common base for menu items
 * that represent actual trigger points for functionality, as opposed
 * to submenus.
 */
abstract public class MenuItemInstance implements MenuSubItemIF, TriggerIF {

	String 	name;
	String 	menuOrder;
	String 	addToMenu;
	String 	actionName;
	boolean	dynamic;
	
	// The action we trigger
	Action	action;
	
	/**
	 * 
	 * @param n The menu item name.
	 * @param o The menu order.
	 * @param an The action name.
	 * @param atm The add to menu name.
	 */
	protected MenuItemInstance(String n, String o, String an, String atm) {
		name 		= n;
		menuOrder 	= o;
		actionName 	= an;
		addToMenu   = atm;
	}

	/**
	 * 
	 * @param n   The menu item name.
	 * @param o   The menu order.
	 * @param an  The action name.
	 * @param atm The add to menu name.
	 * @param d   Dynamic flag
	 */
	protected MenuItemInstance(String n, String o, String an, String atm, boolean d) {
		name 		= n;
		menuOrder 	= o;
		actionName 	= an;
		addToMenu   = atm;
		dynamic		= d;
	}

	////////////////////////////////////////////////////////////////////////////////
	// Partial MenuSubItemIF implementation

	@Override
	public String getMenuOrder() {
		return(menuOrder);
	}

	@Override
	public String getName() {
		return(name);
	}
	
	@Override
	public String getAddToMenu(){
		return(addToMenu);
	}
	
	/**
	 * Derived classes must override this method to initialize their menu triggering
	 * handling, since it will be called after the setAction() method is called.
	 */
	abstract public void initialize();
	
	@Override
	public boolean isDynamic() {
		return(dynamic);
	}
	////////////////////////////////////////////////////////////////////////////////
	// Partial TriggerIF implementation
	
	/**
	 * Called by the Action when it is in an enabled state.
	 */
	@Override
	public void enable(){
		getComponent().enable();
	}
	
	/**
	 * Called by the Action when it can't be triggered.
	 */
	@Override
	public void disable(){
		getComponent().disable();
	}
	
	/**
	 * Derived classes must overload this to return the component they use to represent
	 * the menu item.
	 */
	abstract public Component getComponent();
	
	////////////////////////////////////////////////////////////////////////////////

	/**
	 * @return The name of the action triggered by this menu item.
	 */
	public String getActionName(){
		return(actionName);
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
		return(name + "  " + menuOrder + "  " + addToMenu + "  " + actionName + "  " + dynamic);
	}
	
}
