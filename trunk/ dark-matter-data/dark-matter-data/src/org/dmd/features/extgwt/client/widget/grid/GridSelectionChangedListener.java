package org.dmd.features.extgwt.client.widget.grid;

import org.dmd.dms.generated.dmo.DmwWrapperDMO;
import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;
import org.dmd.features.extgwt.client.extended.MenuController;

import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;

public class GridSelectionChangedListener extends SelectionChangedListener<DmoExtGWTWrapperBase<DmwWrapperDMO>> {

	MenuController 	mvcMenuController;
	DmdGrid			grid;

	public GridSelectionChangedListener(DmdGrid g){
		mvcMenuController 	= (MenuController) Registry.get("mvc.menuController");
		grid = g;
	}
	
	@Override
	public void selectionChanged(SelectionChangedEvent<DmoExtGWTWrapperBase<DmwWrapperDMO>> se) {
		mvcMenuController.setLastSelectionModel(grid.getSelectionModel());
	}

}
