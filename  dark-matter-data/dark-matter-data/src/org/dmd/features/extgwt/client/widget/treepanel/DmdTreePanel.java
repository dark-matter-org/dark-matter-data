package org.dmd.features.extgwt.client.widget.treepanel;

import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;
import org.dmd.features.extgwt.client.DmoExtGWTTreeNode;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanel;
import com.extjs.gxt.ui.client.widget.treepanel.TreePanelSelectionModel;

/**
 * The DmdTreePanel extends the TreePanel to tie into the MenuController which
 * provides context sensitive menus and standardized enable/disable of menu items.
 */
public class DmdTreePanel extends TreePanel<DmoExtGWTTreeNode<HierarchicObjectDMO>> {
	
	TreePanelEventListener	eventListener;
	TreePanelSelectionChangedListener	selectionListener;
	
	/**
	 * Constructs a new TreePanel that ties in with the MenuController for context sensitive
	 * popup menus. The default selection model is single.
	 * @param store
	 */
	public DmdTreePanel(DmdTreeStore store) {
		super(store);
		
		eventListener = new TreePanelEventListener(this);
		
		addListener(Events.OnMouseDown, eventListener);
		
		selectionListener = new TreePanelSelectionChangedListener(this);
		
		setSelectionMode(Style.SelectionMode.SINGLE);
	}
	
	public void setSelectionMode(Style.SelectionMode mode){
		if (getSelectionModel() != null){
			getSelectionModel().removeSelectionListener(selectionListener);
		}
		
		TreePanelSelectionModel<DmoExtGWTTreeNode<HierarchicObjectDMO>> sel;
		sel = new TreePanelSelectionModel<DmoExtGWTTreeNode<HierarchicObjectDMO>>();
		sel.addSelectionChangedListener(selectionListener);
		sel.setSelectionMode(mode);
		setSelectionModel(sel);
	}
}
