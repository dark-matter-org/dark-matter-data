//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.mvw.client.gxt.widget.grid;

import org.dmd.mvw.client.gxt.dmw.GxtWrapper;
import org.dmd.mvw.client.gxt.store.GxtListStore;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.grid.GridSelectionModel;

public class GxtWrapperGrid<E extends GxtWrapper> extends Grid<E> {

	GxtWrapperGridEventListener				eventListener;
	
	GxtWrapperGridSelectionChangedListener	selectionListener;
	
	/**
	 * Constructs a new grid.
	 * @param dgs The backing store.
	 * @param cm  The column model.
	 */
	public GxtWrapperGrid(GxtListStore<E> dgs, ColumnModel cm){
		super(dgs,cm);
		
		eventListener = new GxtWrapperGridEventListener(this);
		addListener(Events.OnMouseDown, eventListener);
		
		selectionListener = new GxtWrapperGridSelectionChangedListener(this);
		setSelectionMode(SelectionMode.SINGLE);
	}
	
	/**
	 * Sets the selection mode of the grid. 
	 * @param mode
	 */
	@SuppressWarnings("unchecked")
	public void setSelectionMode(Style.SelectionMode mode){
		if (getSelectionModel() != null){
			getSelectionModel().removeSelectionListener((SelectionChangedListener<E>) selectionListener);
		}
		
		GridSelectionModel<E> sel;
		sel = new GridSelectionModel<E>();
		sel.addSelectionChangedListener((SelectionChangedListener<E>) selectionListener);
		sel.setSelectionMode(mode);
		setSelectionModel(sel);
	}

}
