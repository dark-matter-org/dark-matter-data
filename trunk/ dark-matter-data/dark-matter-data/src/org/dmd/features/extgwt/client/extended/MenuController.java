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
package org.dmd.features.extgwt.client.extended;

import java.util.TreeMap;

import org.dmd.dmc.DmcObject;
import org.dmd.features.extgwt.client.generated.mvc.MenuControllerMVC;
import org.dmd.features.extgwt.client.util.Action;
import org.dmd.features.extgwt.client.util.menu.BackgroundMenuInstance;
import org.dmd.features.extgwt.client.util.menu.MenuInstance;
import org.dmd.features.extgwt.client.util.menu.MenuItemInstance;
import org.dmd.features.extgwt.client.util.menu.MenuSubItemIF;
import org.dmd.features.extgwt.client.util.menu.PopupMenuInstance;
import org.dmd.features.extgwt.client.util.menu.SubmenuInstance;

import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.extjs.gxt.ui.client.widget.selection.AbstractStoreSelectionModel;

/**
 * The MenuController acts as a central repository of all menu related functionality
 * of a GXT application. The various MvcMenu related definitions wind up being registered
 * with the MenuController as part of the MvcInit sequence.
 */
public class MenuController extends MenuControllerMVC {
	
	// All registered actions
	// Key: MvcAction name
	TreeMap<String,Action>					actions;
	
	// All menu items
	// Key: MvcMenuItem name
	TreeMap<String,MenuItemInstance>		menuItems;
	
	// All separators
	TreeMap<String, MenuSubItemIF>			separators;
	
	// All menus, including submenus
	TreeMap<String,MenuInstance>			allMenus;
	
	// Just the submenus
	TreeMap<String,SubmenuInstance>			subMenus;
	
	// All top level menus - toolbars, menubars and popups
	TreeMap<String,MenuInstance>			topLevelMenus;
	
	// Key: class name
	TreeMap<String,PopupMenuInstance>		popups;
	
	// Key: menu name
	TreeMap<String,BackgroundMenuInstance>	backgroundMenus;
	
	@SuppressWarnings("unchecked")
	AbstractStoreSelectionModel				lastSelectionModel;
	
	public MenuController(){
		actions 		= new TreeMap<String, Action>();
		menuItems 		= new TreeMap<String, MenuItemInstance>();
		separators		= new TreeMap<String, MenuSubItemIF>();
		allMenus 		= new TreeMap<String, MenuInstance>();
		subMenus		= new TreeMap<String, SubmenuInstance>();	
		topLevelMenus	= new TreeMap<String, MenuInstance>();
		popups 			= new TreeMap<String, PopupMenuInstance>();
		backgroundMenus = new TreeMap<String, BackgroundMenuInstance>();
	}
	
	/**
	 * @param n name of the menu component.
	 * @return the GXT component for the specified menu
	 */
	public Component getMenu(String n){
		MenuInstance mi = allMenus.get(n);
		if (mi == null)
			return(null);
		return(mi.getMenu());
	}

	@Override
	protected void handleMvcInitEvent(AppEvent event) {
		// Call on all controllers to register their actions, menus and menuitems
		dispatchMvcRegisterMenus(this);
		
		// By now, everyone has registered their stuff, so start building the 
		// menu structure - first, assign actions to the menu items and, while
		// we're at it, add the items to their menus
		for(MenuItemInstance mii : menuItems.values()){
System.out.println("MenuController.handleMvcInitEvent() - adding action: " + mii.getActionName());
			Action action = actions.get(mii.getActionName());
			mii.setAction(action);
//			mii.initialize();
			
			MenuInstance menu = allMenus.get(mii.getAddToMenu());
			menu.addSubItem(mii);
		}
		
		// Add the separators
		for(MenuSubItemIF subitem: separators.values()){
			MenuInstance menu = allMenus.get(subitem.getAddToMenu());
			menu.addSubItem(subitem);
		}
		
		// Add the submenus to their menus
		for(SubmenuInstance sub : subMenus.values()){
			MenuInstance menu = allMenus.get(sub.getAddToMenu());
			menu.addSubItem(sub);
		}
		
		// Build the submenus
		for(SubmenuInstance sub : subMenus.values()){
			sub.buildMenu();
		}
		
		// Build the menus
		for(MenuInstance mi : topLevelMenus.values()){
			mi.buildMenu();
		}
		
	}
	
	/**
	 * @param name menu name
	 * @return the named menu instance if it's available 
	 */
	public MenuInstance getMenuInstance(String name){
		return(topLevelMenus.get(name));
	}

	@Override
	protected void initialize() {
		
		registerMvcMenuController(this);

	}

	public void addAction(Action a){
System.out.println("MenuController.addAction() " + a.getName());
		actions.put(a.getName(), a);
	}

	/**
	 * Adds the specified menu item to our set of menu items. This method is used by 
	 * the autogenerated code that's part of MvcControllers. Dynamic menus are build directly
	 * by retrieving the base MenuInstance (getMenuInstance()) and manipulating the menu
	 * contents directly.
	 * @param mii
	 */
	public void addMenuItem(MenuItemInstance mii){
System.out.println("MenuController.addMenuItem() " + mii.toString());
		menuItems.put(mii.getName(), mii);
	}
	
	public void addSeparator(MenuSubItemIF msi){
		separators.put(msi.getName(), msi);
	}
	
	public void removeSeparator(MenuSubItemIF msi){
		separators.remove(msi.getName());
	}
	
	public void addMenu(MenuInstance mi){
		allMenus.put(mi.getName(),mi);
		
		if (mi instanceof SubmenuInstance){
			subMenus.put(mi.getName(), (SubmenuInstance) mi);
		}
		else{
			topLevelMenus.put(mi.getName(), mi);
			
			if (mi instanceof PopupMenuInstance){
				PopupMenuInstance pmi = (PopupMenuInstance) mi;
				popups.put(pmi.getForClass(), pmi);
			}
			if (mi instanceof BackgroundMenuInstance){
				BackgroundMenuInstance bmi = (BackgroundMenuInstance) mi;
				backgroundMenus.put(bmi.getName(), bmi);
			}
		}
	}
	
	/**
	 * @param obj the for which we want the menu.
	 * @return a popup menu if one was defined for this class of object
	 */
	public Menu getPopupMenuForObject(DmcObject obj){
		PopupMenuInstance pmi = popups.get(obj.getClass().getName());
		
		if (pmi == null)
			return(null);
		
		if (lastSelectionModel != null){
			// We're about to popup a menu, perform the enable check, but we
			// only do this is item selection has taken place
			for(Action action : actions.values()){
				action.enableCheck();
			}
		}

		return (Menu) (pmi.getMenu());
	}
	
	/**
	 * Return the specified background menu.
	 * @param name The name of the menu
	 * @return Menu
	 */
	public Menu getBackgroundMenu(String name){
		BackgroundMenuInstance bmi = backgroundMenus.get(name);
		
		if (bmi == null)
			return(null);
		
		return((Menu)bmi.getMenu());
	}
	
	@SuppressWarnings("unchecked")
	public void setLastSelectionModel(AbstractStoreSelectionModel m){
		lastSelectionModel = m;
		for(Action action : actions.values()){
			action.enableCheck();
		}
	}
	
	@SuppressWarnings("unchecked")
	public AbstractStoreSelectionModel getLastSelectionModel(){
		return(lastSelectionModel);
	}
}
