package org.dmd.features.extgwt.client.widget.grid;

import org.dmd.dms.generated.dmo.DmwWrapperDMO;
import org.dmd.features.extgwt.client.DmoExtGWTWrapperBase;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridSelectionModel;

/**
 * The DmdGrid class provides supports for context sensitive menus for grids that
 * contain wrapped Dark Matter Objects.
 */
public class DmdGrid extends Grid<DmoExtGWTWrapperBase<DmwWrapperDMO>> {
	
	GridEventListener				eventListener;
	
	GridSelectionChangedListener	selectionListener;
	
	/**
	 * Constructs a new grid.
	 * @param dgs The backing store.
	 * @param cm  The column model.
	 */
	public DmdGrid(DmdGridStore dgs, ColumnModel cm){
		super(dgs,cm);
		
		eventListener = new GridEventListener(this);
		addListener(Events.OnMouseDown, eventListener);
		
		selectionListener = new GridSelectionChangedListener(this);
		setSelectionMode(SelectionMode.SINGLE);
	}
	
	/**
	 * Constructs a new grid.
	 * @param dgs The backing store.
	 * @param cm  The column model.
	 * @param backgroundMenuName The name of the background menu to be displayed.
	 */
	public DmdGrid(DmdGridStore dgs, ColumnModel cm, String backgroundMenuName){
		super(dgs,cm);
		
		eventListener = new GridEventListener(this, backgroundMenuName);
		addListener(Events.OnMouseDown, eventListener);
		
		selectionListener = new GridSelectionChangedListener(this);
		setSelectionMode(SelectionMode.SINGLE);
	}
	
	/**
	 * Sets the selection mode of the grid. 
	 * @param mode
	 */
	public void setSelectionMode(Style.SelectionMode mode){
		if (getSelectionModel() != null){
			getSelectionModel().removeSelectionListener(selectionListener);
		}
		
		GridSelectionModel<DmoExtGWTWrapperBase<DmwWrapperDMO>> sel;
		sel = new GridSelectionModel<DmoExtGWTWrapperBase<DmwWrapperDMO>>();
		sel.addSelectionChangedListener(selectionListener);
		sel.setSelectionMode(mode);
		setSelectionModel(sel);
	}
	
}
