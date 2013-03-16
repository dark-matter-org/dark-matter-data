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
package org.dmd.mvw.client.gxt.widget.grid;

import org.dmd.mvw.client.gxt.dmw.GxtWrapper;

import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.GridEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.widget.menu.Menu;

/**
 * The GridEventListener provides a typed listener for events on the GxtGrid.
 * @deprecated
 * Use the GxtWrapperGridEventListener in conjunction with the GxtWrapperGrid instead.
 */
@Deprecated
public class GridEventListener implements Listener<ComponentEvent> {

//	MenuController 	mvcMenuController;
	GxtGrid			grid;
	Menu			backgroundMenu;
	
	public GridEventListener(GxtGrid g){
		// Get our handle to the menu controller so that we can support context
		// sensitive popup menus.
//		mvcMenuController 	= (MenuController) Registry.get("mvc.menuController");
		grid 				= g;
		backgroundMenu		= null;
	}
	
	public GridEventListener(GxtGrid g, String backgroundMenuName){
		// Get our handle to the menu controller so that we can support context
		// sensitive popup menus.
//		mvcMenuController 	= (MenuController) Registry.get("mvc.menuController");
		grid 				= g;
//		backgroundMenu		= mvcMenuController.getBackgroundMenu(backgroundMenuName);
	}
	
	@Override
	public void handleEvent(ComponentEvent ce) {
		@SuppressWarnings("rawtypes")
		GridEvent 	ge 		= (GridEvent) ce;
		EventType	type	= ce.getType();
		
//		System.out.println("org.dmd.features.extgwt.client.widget.grid.GridEventListener " + ce.getClass().getName() + "  " + ce.getEventTypeInt());
		if (type == Events.OnMouseDown){
			
			if (ge.getModel() == null){
//				System.out.println("On the background");
				grid.setContextMenu(backgroundMenu);
			}
			else{
				GxtWrapper obj = (GxtWrapper) ge.getModel();
 				System.out.println(obj.toOIF());
				
//				grid.setContextMenu(mvcMenuController.getPopupMenuForObject(obj.getDmcObject()));
			}
		}
		
	}

}
