package org.dmd.features.extgwt.client.extended;

import java.util.TreeMap;

import org.dmd.features.extgwt.client.generated.mvc.MenuControllerMVC;
import org.dmd.features.extgwt.client.util.Action;
import org.dmd.features.extgwt.client.util.menu.MenuInstance;
import org.dmd.features.extgwt.client.util.menu.MenuItemInstance;
import org.dmd.features.extgwt.client.util.menu.SubmenuInstance;

import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.widget.Component;

public class MenuController extends MenuControllerMVC {
	
	// All registered actions
	// Key: MvcAction name
	TreeMap<String,Action>				actions;
	
	// All menu items
	// Key: MvcMenuItem name
	TreeMap<String,MenuItemInstance>	menuItems;
	
	// All menus, including submenus
	TreeMap<String,MenuInstance>		allMenus;
	
	// Just the submenus
	TreeMap<String,SubmenuInstance>		subMenus;
	
	// All top level menus - toolbars, menubars and popups
	TreeMap<String,MenuInstance>		topLevelMenus;
	
	public MenuController(){
		actions 		= new TreeMap<String, Action>();
		menuItems 		= new TreeMap<String, MenuItemInstance>();
		allMenus 		= new TreeMap<String, MenuInstance>();
		subMenus		= new TreeMap<String, SubmenuInstance>();	
		topLevelMenus	= new TreeMap<String, MenuInstance>();
	}
	
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
			Action action = actions.get(mii.getActionName());
			mii.setAction(action);
//			mii.initialize();
			
			MenuInstance menu = allMenus.get(mii.getAddToMenu());
			menu.addSubItem(mii);
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

	@Override
	protected void initialize() {
		
		registerMvcMenuController(this);

	}

	public void addAction(Action a){
		actions.put(a.getName(), a);
	}

	public void addMenuItem(MenuItemInstance mii){
		menuItems.put(mii.getName(), mii);
	}
	
	public void addMenu(MenuInstance mi){
		allMenus.put(mi.getName(),mi);
		
		if (mi instanceof SubmenuInstance){
			subMenus.put(mi.getName(), (SubmenuInstance) mi);
		}
		else{
			topLevelMenus.put(mi.getName(), mi);
		}
	}
	
}
