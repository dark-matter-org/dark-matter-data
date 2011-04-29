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
 * an associated key value that allows them to be stored in a Map. Basically, the
 * value has its key embedded in it and this key can be accessed for the purposes
 * of putting the value in a map or retrieving it.
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
	
	/**
	 * This method is used by the Modifier mechanism to determine whether or not a 
	 * change has occurred as a result of applying the modifier. Having this method forces
	 * you to implement a value comparison function, as opposed to relying on you to
	 * remember to overload the equals method on your values. When the value is put in the 
	 * map, we get back the existing value if the key already existed. The add() method
	 * will then call this function to determine if a change really took place; if this method
	 * returns false, we report the change (by passing back the new value), otherwise
	 * we return null from the add().
	 * @param obj Another mapped attribute.
	 * @return true if the value of this attribute matches the value of the object passed in
	 * and false otherwise.
	 */
	public boolean valuesAreEqual(DmcMappedAttributeIF obj);
}
