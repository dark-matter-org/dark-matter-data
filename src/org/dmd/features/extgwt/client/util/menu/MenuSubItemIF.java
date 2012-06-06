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
package org.dmd.features.extgwt.client.util.menu;

import com.extjs.gxt.ui.client.widget.Component;

public interface MenuSubItemIF {

	/**
	 * @return The name of the MVC definition for this item.
	 */
	public String getName();
	
	/**
	 * @return The name of the menu to which this item should be added.
	 */
	public String getAddToMenu();
	
	/**
	 * @return The lexicographic order for this item.
	 */
	public String getMenuOrder();
	
	/**
	 * Implementing classes must overload this method to initialize their Component.
	 */
	public void initialize();
	
	/**
	 * @return The component that's appropriate for the type of menu where this item is placed.
	 */
	public Component getComponent();

	/**
	 * @return A flag that indicates if the item is dynamic or not.
	 */
	public boolean isDynamic();
}
