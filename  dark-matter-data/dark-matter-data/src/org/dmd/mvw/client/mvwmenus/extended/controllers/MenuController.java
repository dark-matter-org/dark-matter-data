package org.dmd.mvw.client.mvwmenus.extended.controllers;

import java.util.TreeMap;

import org.dmd.dmc.DmcObject;
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;
import org.dmd.mvw.client.mvwmenus.base.Action;
import org.dmd.mvw.client.mvwmenus.base.MvwBackgroundMenu;
import org.dmd.mvw.client.mvwmenus.base.MvwMenu;
import org.dmd.mvw.client.mvwmenus.base.MvwMenuItem;
import org.dmd.mvw.client.mvwmenus.base.MvwPopupMenu;
import org.dmd.mvw.client.mvwmenus.base.MvwSeparator;
import org.dmd.mvw.client.mvwmenus.base.MvwSubMenu;
import org.dmd.mvw.client.mvwmenus.generated.mvw.controllers.MenuControllerBaseImpl;

import com.google.gwt.user.client.ui.Widget;

public class MenuController extends MenuControllerBaseImpl {
	
	// All registered actions
	TreeMap<String,Action>				actions;

	// All menu items
	TreeMap<String,MvwMenuItem>			menuItems;
	
	// All separators
	TreeMap<String,MvwSeparator>		separators;
	
	// All menus including submenus
	TreeMap<String,MvwMenu>				allMenus;
	
	// Just the submenus
	TreeMap<String,MvwSubMenu>			subMenus;
	
	// All top level menus - toolbars, menubars and popups
	TreeMap<String,MvwMenu>				topLevelMenus;
	
	// Key: class name
	TreeMap<String,MvwPopupMenu>		popups;
	
	// Key: menu name
	TreeMap<String,MvwBackgroundMenu>	backgroundMenus;

	public MenuController(MvwRunContextIF rc) {
		super(rc);
		actions 		= new TreeMap<String, Action>();
		menuItems		= new TreeMap<String, MvwMenuItem>();
		separators		= new TreeMap<String, MvwSeparator>();
		allMenus		= new TreeMap<String, MvwMenu>();
		subMenus		= new TreeMap<String, MvwSubMenu>();
		topLevelMenus	= new TreeMap<String, MvwMenu>();
		popups			= new TreeMap<String, MvwPopupMenu>();
		backgroundMenus	= new TreeMap<String, MvwBackgroundMenu>();
	}
	
	/**
	 * Returns the menubar, toolbar, background or popup menu if it's found.
	 * @param n
	 * @return
	 */
	public MvwMenu getMenu(String name){
		return(topLevelMenus.get(name));
	}
	
	public MvwSubMenu getSubMenu(String name){
		return(subMenus.get(name));
	}
	
	/**
	 * Returns a popup menu if one was defined for this class of object.
	 * @param obj
	 * @return
	 */
	public MvwMenu getPopupMenuForObject(DmcObject obj){
		// TODO: have to handle class derivation aspects e.g. we have a popup for base class and this object is derived
		
		return(popups.get(obj.getConstructionClassName()));
	}
	
	/**
	 * Return the specified background menu.
	 * @param name The name of the menu
	 * @return Menu
	 */
	public MvwMenu getBackgroundMenu(String name){
		return(backgroundMenus.get(name));
	}
	
	/**
	 * This method will be called by the MenuBuilder for the application once all menu
	 * information has been added to the MenuController.
	 */
	public void initializeMenus() {
		// By now, everyone has registered their stuff, so start building the 
		// menu structure - first, assign actions to the menu items and, while
		// we're at it, add the items to their menus
		for(MvwMenuItem mii : menuItems.values()){
			Action action = actions.get(mii.getActionName());
			mii.setAction(action);
			
			MvwMenu menu = allMenus.get(mii.getAddToMenu());
			menu.addSubItem(mii);
		}
		
		// Add the separators
		for(MvwSeparator subitem: separators.values()){
			MvwMenu menu = allMenus.get(subitem.getAddToMenu());
			menu.addSubItem(subitem);
		}
		
		// Add the submenus to their menus
		for(MvwSubMenu sub : subMenus.values()){
			MvwMenu menu = allMenus.get(sub.getAddToMenu());
			menu.addSubItem(sub);
		}
		
		// Build the submenus
		for(MvwSubMenu sub : subMenus.values()){
			sub.buildMenu();
		}
		
		// Build the menus
		for(MvwMenu mi : topLevelMenus.values()){
			mi.buildMenu();
		}
		
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
	public void addMenuItem(MvwMenuItem mii){
System.out.println("MenuController.addMenuItem() " + mii.toString());
		menuItems.put(mii.getName(), mii);
	}
	
	public void addSeparator(MvwSeparator msi){
		separators.put(msi.getName(), msi);
	}
	
	public void removeSeparator(MvwSeparator msi){
		separators.remove(msi.getName());
	}
	
	public void addMenu(MvwMenu mi){
		allMenus.put(mi.getName(),mi);
		
		if (mi instanceof MvwSubMenu){
			subMenus.put(mi.getName(), (MvwSubMenu) mi);
		}
		else{
			topLevelMenus.put(mi.getName(), mi);
			
			if (mi instanceof MvwPopupMenu){
				MvwPopupMenu pmi = (MvwPopupMenu) mi;
				popups.put(pmi.getForClass().name, pmi);
			}
			if (mi instanceof MvwBackgroundMenu){
				MvwBackgroundMenu bmi = (MvwBackgroundMenu) mi;
				backgroundMenus.put(bmi.getName(), bmi);
			}
		}
	}
	

}