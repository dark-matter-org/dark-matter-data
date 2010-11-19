package org.dmd.features.extgwt.client.widget.treepanel;

import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;
import org.dmd.features.extgwt.client.extended.MenuController;

import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;

/**
 * The DmdTreePanel extends the TreePanel to tie into the MenuController which
 * provides context sensitive menus and standardized enable/disable of menu items.
 */
public class DmdTreePanel extends TreePanel<DmoExtGWTTreeNode<LDAPHierarchicObjectDMO>> {
	
	MenuController mvcMenuController;
	
	public DmdTreePanel(DmdTreeStore store) {
		super(store);
		
		// Get our handle to the menu controller so that we can support context
		// sensitive popup menus.
		mvcMenuController = (MenuController) Registry.get("mvc.menuController");
		
		
	}
	
	
}
