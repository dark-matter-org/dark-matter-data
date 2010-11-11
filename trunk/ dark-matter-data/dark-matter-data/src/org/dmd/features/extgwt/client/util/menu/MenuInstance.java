package org.dmd.features.extgwt.client.util.menu;

import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.features.extgwt.client.util.Action;

import com.extjs.gxt.ui.client.widget.Component;

/**
 * The MenuInstance class is used by the MenuController to assist with the 
 * instantiation of top level menus e.g. tool bars, menu bars and popup menus.
 */
abstract public class MenuInstance {
	
	// The name of this menu as defined in the MVC spec.
	String name;
	
	// The sub items of this menu
	// Key: menuOrder string from the MvcMenuItem or MvcSubmenu
	// Value: a sub item instance
	TreeMap<String,MenuSubItemIF>	items;
	
	/**
	 * Derived classes should instantiate and set the menuComponent.
	 */
	protected MenuInstance(String n){
		name = n;
		items = new TreeMap<String, MenuSubItemIF>();
	}
	
	public String getName(){
		return(name);
	}
	
	public void addSubItem(MenuSubItemIF msi){
		items.put(msi.getMenuOrder(), msi);
	}
	
	public void buildMenu(){
		if (items.size() == 0)
			return;
		
		Iterator<String> keys = items.keySet().iterator();
		while(keys.hasNext()){
			MenuSubItemIF msi = items.get(keys.next());
			msi.initialize();
			addToMenuContainer(msi);
		}
	}
	
	/**
	 * Derived classes should return the component that represents whatever type
	 * of menu they implement.
	 * @return The menu component.
	 */
	abstract public Component getMenu();
	
	/**
	 * Derived classes must overload this method to add sub menu instances to their
	 * chosen type of top level component. We can't handle the addition at this level
	 * because there is no 
	 * @param msi
	 */
	abstract public void addToMenuContainer(MenuSubItemIF msi);
}
