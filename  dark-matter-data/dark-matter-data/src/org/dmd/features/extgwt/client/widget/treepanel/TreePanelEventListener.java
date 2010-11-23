package org.dmd.features.extgwt.client.widget.treepanel;

import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;
import org.dmd.features.extgwt.client.extended.MenuController;

import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.TreePanelEvent;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;

public class TreePanelEventListener implements Listener<ComponentEvent>{

	MenuController 	mvcMenuController;
	@SuppressWarnings("unchecked")
	TreePanel		treePanel;

	@SuppressWarnings("unchecked")
	public TreePanelEventListener(TreePanel tp){
		// Get our handle to the menu controller so that we can support context
		// sensitive popup menus.
		mvcMenuController 	= (MenuController) Registry.get("mvc.menuController");
		treePanel			= tp;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void handleEvent(ComponentEvent ce) {
		TreePanelEvent 	ev 		= (TreePanelEvent) ce;
		EventType 		type 	= ce.getType();
		
		if (type == Events.OnMouseDown){
//			if (ce.isRightClick()){
//				System.out.println("Right click...");
//			}
//		
			if (ev.getNode() == null){
				treePanel.setContextMenu(null);
				return;
			}
		
			System.out.println("Mouse down " + ce.getClass().getName() + "  " + ce.getEventTypeInt());
		
			DmoExtGWTWrapperBase obj = (DmoExtGWTWrapperBase) ev.getNode().getModel();
			
			treePanel.setContextMenu(mvcMenuController.getPopupMenuForObject(obj.getDmcObject()));
		}

		
	}

}
