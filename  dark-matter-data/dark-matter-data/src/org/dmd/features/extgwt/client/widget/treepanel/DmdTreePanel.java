package org.dmd.features.extgwt.client.widget.treepanel;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.store.TreeStore;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;

/**
 * The DmdTreePanel extends the TreePanel to tie into the MenuController which
 * provides context sensitive menus and standardized enable/disable of menu items.
 */
public class DmdTreePanel extends TreePanel<ModelData> {
	
	

	public DmdTreePanel(TreeStore<ModelData> store) {
		super(store);
	}
	
	

}
