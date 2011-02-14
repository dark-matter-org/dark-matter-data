package org.dmd.features.extgwt.client.widget.grid;

import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;
import org.dmd.features.extgwt.client.extended.MenuController;

import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.GridEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.menu.Menu;

public class GridEventListener implements Listener<ComponentEvent> {

	MenuController 	mvcMenuController;
	DmdGrid			grid;
	Menu			backgroundMenu;
	
	public GridEventListener(DmdGrid g){
		// Get our handle to the menu controller so that we can support context
		// sensitive popup menus.
		mvcMenuController 	= (MenuController) Registry.get("mvc.menuController");
		grid 				= g;
		backgroundMenu		= null;
	}
	
	public GridEventListener(DmdGrid g, String backgroundMenuName){
		// Get our handle to the menu controller so that we can support context
		// sensitive popup menus.
		mvcMenuController 	= (MenuController) Registry.get("mvc.menuController");
		grid 				= g;
		backgroundMenu		= mvcMenuController.getBackgroundMenu(backgroundMenuName);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void handleEvent(ComponentEvent ce) {
		GridEvent 	ge 		= (GridEvent) ce;
		EventType	type	= ce.getType();
		
		System.out.println("org.dmd.features.extgwt.client.widget.grid.GridEventListener " + ce.getClass().getName() + "  " + ce.getEventTypeInt());
		if (type == Events.OnMouseDown){
			
			if (ge.getModel() == null){
				System.out.println("On the background");
				grid.setContextMenu(backgroundMenu);
			}
			else{
				DmoExtGWTWrapperBase obj = (DmoExtGWTWrapperBase) ge.getModel();
 				System.out.println(obj.toOIF(15));
				
				grid.setContextMenu(mvcMenuController.getPopupMenuForObject(obj.getDmcObject()));
			}
		}
		
	}

}
