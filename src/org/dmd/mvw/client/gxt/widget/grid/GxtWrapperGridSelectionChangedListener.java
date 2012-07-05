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

import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedListener;

public class GxtWrapperGridSelectionChangedListener extends SelectionChangedListener<GxtWrapper> {

//	MenuController 	mvcMenuController;
	GxtWrapperGrid<?>			grid;

	public GxtWrapperGridSelectionChangedListener(GxtWrapperGrid<?> g){
//		mvcMenuController 	= (MenuController) Registry.get("mvc.menuController");
		grid = g;
	}
	
	@Override
	public void selectionChanged(SelectionChangedEvent<GxtWrapper> se) {
//		mvcMenuController.setLastSelectionModel(grid.getSelectionModel());
	}

}
