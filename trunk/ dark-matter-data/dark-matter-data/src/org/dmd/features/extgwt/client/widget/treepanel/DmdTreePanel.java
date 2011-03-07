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
