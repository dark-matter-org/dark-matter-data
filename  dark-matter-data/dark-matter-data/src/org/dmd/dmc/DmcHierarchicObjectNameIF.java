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
package org.dmd.dmc;

public interface DmcHierarchicObjectNameIF extends DmcObjectNameIF {

	/**
	 * Returns the name of the parent implied by this hierarchic name.
	 * @return A hierarchic name or null if the name has no parent.
	 */
	public DmcHierarchicObjectNameIF getParentName();
	
	/**
	 * Checks if the specified name indicates the parent of this name. 
	 * @param n The name to be tested.
	 * @return true If the name indicates the parent.
	 */
	public boolean isParent(DmcHierarchicObjectNameIF n);
	
	/**
	 * Checks if the specified name indicates a child of this name. 
	 * @param n The name to be tested.
	 * @return true If the name indicates a child.
	 */
	public boolean isChild(DmcHierarchicObjectNameIF n);
	
	/**
	 * Checks if the specified name indicates an object with the same parent. 
	 * @param n The name to be tested.
	 * @return true If the name indicates a sibling.
	 */
	public boolean isSibling(DmcHierarchicObjectNameIF n);
}
