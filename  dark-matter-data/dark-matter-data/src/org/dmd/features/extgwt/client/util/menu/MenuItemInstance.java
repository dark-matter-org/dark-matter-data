package org.dmd.features.extgwt.client.util.menu;

import org.dmd.features.extgwt.client.interfaces.TriggerIF;
import org.dmd.features.extgwt.client.util.Action;


/**
 * The MenuItemInstance class provides a common base for menu items
 * that represent actual trigger points for functionality, as opposed
 * to submenus.
 */
abstract public class MenuItemInstance implements MenuSubItemIF, TriggerIF {

	String name;
	String menuOrder;
	String addToMenu;
	String actionName;
	
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
	
}
