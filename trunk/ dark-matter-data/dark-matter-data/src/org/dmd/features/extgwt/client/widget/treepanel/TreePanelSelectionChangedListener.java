package org.dmd.features.extgwt.client.widget.treepanel;

import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;
import org.dmd.features.extgwt.client.extended.MenuController;

import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;

public class TreePanelSelectionChangedListener extends SelectionChangedListener<DmoExtGWTTreeNode<LDAPHierarchicObjectDMO>>{

	MenuController 	mvcMenuController;
	@SuppressWarnings("unchecked")
	TreePanel		treePanel;

	@SuppressWarnings("unchecked")
	public TreePanelSelectionChangedListener(TreePanel tp){
		mvcMenuController 	= (MenuController) Registry.get("mvc.menuController");
		treePanel = tp;
	}
	
	@Override
	public void selectionChanged(SelectionChangedEvent<DmoExtGWTTreeNode<LDAPHierarchicObjectDMO>> se) {
		mvcMenuController.setLastSelectionModel(treePanel.getSelectionModel());
	}

}
