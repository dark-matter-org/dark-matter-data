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

/**
 * The DmcMappedAttributeIF interface defines attribute values that have
 * an associated key value that allows them to be stored in a Map.
 */
public interface DmcMappedAttributeIF {

	/**
	 * Returns the key associated with this attribute value.
	 * @return The key value.
	 */
	public Object getKey();
	
	/**
	 * Returns the key value represented as a string. we could just call the toString()
	 * method on the Object, but having this forces you implement an appropriate String
	 * conversion method for the key.
	 * @return A String.
	 */
	public String getKeyAsString();
}
