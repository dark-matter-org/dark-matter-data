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
package org.dmd.mvw.client.gxt.widget.grid;

import org.dmd.mvw.client.gxt.dmw.GxtWrapper;

import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;

/**
 * The GridSelectionChangedListener provides a typed listener for selection changes
 * on GxtGrids
 * @deprecated
 * You should switch to use the GxtWrapperGridSelectionChangedListener in conjunction
 * with the GxtWrapperGrid.
 */
@Deprecated
public class GridSelectionChangedListener extends SelectionChangedListener<GxtWrapper> {

//	MenuController 	mvcMenuController;
	GxtGrid			grid;

	public GridSelectionChangedListener(GxtGrid g){
//		mvcMenuController 	= (MenuController) Registry.get("mvc.menuController");
		grid = g;
	}
	
	@Override
	public void selectionChanged(SelectionChangedEvent<GxtWrapper> se) {
//		mvcMenuController.setLastSelectionModel(grid.getSelectionModel());
	}

}
