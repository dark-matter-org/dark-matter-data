//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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

import java.io.Serializable;


/**
 * The DmcNamedObjectREF is a helper class for implementing the concept of 
 * references to named objects that can either be resolved or unresolved.
 */
@SuppressWarnings("serial")
abstract public class DmcNamedObjectBaseREF<DMO extends DmcNamedObjectIF> implements Serializable, DmcNamedObjectIF {
	
	// The name of the object being referred to - the form of this is
	// completely up to you. There is no standard nomenclature; this
	// will depend on your implementation domain. The only caveat is
	// is that the name should allow you to find the referenced object
	// by whatever means you come up with.
	DmcObjectName	name;
	
	/**
	 * Constructs a new object reference attribute.
	 */
	public DmcNamedObjectBaseREF(){
		name= null;
	}
	
	/**
	 * Sets the object, thus making this reference "resolved".
	 * @param o the object.
	 */
	abstract public void setObject(DMO o);
	
	/**
	 * @return The object if this reference is resolved.
	 */
	abstract public DMO getObject();
	
	/**
	 * @return True if the reference is resolved and false otherwise.
	 */
	abstract public boolean isResolved();
	
//	/**
//	 * Sets the name of the object being referred to. NOTE: USE WITH CAUTION!!!
//	 * @param n The name of the object.
//	 */
//	public void setName(DmcObjectNameIF n){
//		name = n;
//	}

	/**
	 * Returns the name of the object to which we are referring.
	 */
	@Override
	public DmcObjectName getObjectName() {
		return(name);
	}
}
