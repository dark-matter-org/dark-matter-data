package org.dmd.features.extgwt.client.widget.treepanel;

import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;

import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;

/**
 * The DmdTreePanel extends the TreePanel to tie into the MenuController which
 * provides context sensitive menus and standardized enable/disable of menu items.
 */
public class DmdTreePanel extends TreePanel<DmoExtGWTTreeNode<LDAPHierarchicObjectDMO>> {
	
	public DmdTreePanel(DmdTreeStore store) {
		super(store);
	}
	
	
}
