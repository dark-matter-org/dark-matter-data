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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.mvw.client.mvwmenus.interfaces.MenuSubItemIF;

import com.google.gwt.user.client.ui.Widget;

/**
 * The MenuInstance class is used by the MenuController to assist with the 
 * instantiation of top level menus e.g. tool bars, menu bars and popup menus.
 */
abstract public class MvwMenu {
	
	// The name of this menu as defined in the MVW definition
	String _name;
	
	// The sub items of this menu
	// Key: menuOrder string from the MvcMenuItem or MvcSubmenu
	// Value: a sub item instance
	TreeMap<String,MenuSubItemIF>	items;
	
	/**
	 * Derived classes should instantiate and set the menuComponent.
	 */
	protected MvwMenu(String n){
		_name = n;
		items = new TreeMap<String, MenuSubItemIF>();
	}
	
	public String getName(){
		return(_name);
	}
	
	public void addSubItem(MenuSubItemIF msi){
		items.put(msi.getMenuOrder(), msi);
	}
	
	public void removeSubItem(MenuSubItemIF msi){
		items.remove(msi.getMenuOrder());
	}
	
	public void removeAllDynamicItems(){
		ArrayList<MenuSubItemIF> dynamic = new ArrayList<MenuSubItemIF>();
		for(MenuSubItemIF msi: items.values()){
			if (msi.isDynamic()){
				dynamic.add(msi);
				removeFromMenuContainer(msi);
			}
		}
		
		for(MenuSubItemIF msi: dynamic){
			items.remove(msi.getMenuOrder());
		}
		
//		items = null;
//		items = new TreeMap<String, MenuSubItemIF>();		
	}
	
	public void buildMenu(){
		if (items.size() == 0)
			return;
		
		Iterator<String> keys = items.keySet().iterator();
		while(keys.hasNext()){
			MenuSubItemIF msi = items.get(keys.next());
//			msi.initialize();
			addToMenuContainer(msi);
		}
	}
	
	/**
	 * Derived classes should return the component that represents whatever type
	 * of menu they implement.
	 * @return The menu component.
	 */
	abstract public Widget getMenu();
	
	/**
	 * Derived classes must overload this method to add sub menu instances to their
	 * chosen type of top level component. We can't handle the addition at this level
	 * because there is no standard menu container i.e. the tool bar container is
	 * different from the menu bar.
	 * @param msi The item to be added.
	 */
	abstract public void addToMenuContainer(MenuSubItemIF msi);
	
	/**
	 * Derived classes must overload this method to remove subitems from their
	 * menu component.
	 * @param msi The item to be removed.
	 */
	abstract public void removeFromMenuContainer(MenuSubItemIF msi);
}
