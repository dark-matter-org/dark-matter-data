package org.dmd.mvw.client.gxt.widget.grid;

import org.dmd.mvw.client.gxt.dmw.GxtWrapper;
import org.dmd.mvw.client.gxt.store.GxtListStore;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridSelectionModel;

/**
 * The GxtGrid class provides some basic utility functionality when using
 * GXT Grid in conjunction with GxtWrapper objects.
 * @deprecated
 * Use the GxtWrapperGrid instead since it is parameterized.
 */
@Deprecated
public class GxtGrid extends Grid<GxtWrapper> {

	GridEventListener				eventListener;
	
	GridSelectionChangedListener	selectionListener;
	
	/**
	 * Constructs a new grid.
	 * @param dgs The backing store.
	 * @param cm  The column model.
	 */
	public GxtGrid(GxtListStore<GxtWrapper> dgs, ColumnModel cm){
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
	public GxtGrid(GxtListStore<GxtWrapper> dgs, ColumnModel cm, String backgroundMenuName){
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
		
		GridSelectionModel<GxtWrapper> sel;
		sel = new GridSelectionModel<GxtWrapper>();
		sel.addSelectionChangedListener(selectionListener);
		sel.setSelectionMode(mode);
		setSelectionModel(sel);
	}

}
