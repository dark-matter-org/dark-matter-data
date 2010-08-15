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
 * The DmcNamedObjectTransportableREF is used when creating object reference attributes
 * whose payload is expected to be sent across whatever RPC mechanism is being used. 
 */
@SuppressWarnings("serial")
public class DmcNamedObjectTransportableREF<DMO extends DmcNamedObjectIF> extends DmcNamedObjectREF<DMO> implements Serializable, DmcNamedObjectIF {
	
	// The name of the object being referred to - the form of this is
	// completely up to you. There is no standard nomenclature; this
	// will depend on your implementation domain. The only caveat is
	// is that the name should allow you to find the referenced object
	// by whatever means you come up with.
	String	name;
	
	// If the reference is resolved, the object will be available. Otherwise,
	// this will be null. NOTE: whatever object we refer to WILL be serialized
	// as part of the attribute in which this is used.
	DMO		object;
	
	/**
	 * Constructs a new object reference attribute.
	 */
	public DmcNamedObjectTransportableREF(){
		name = null;
		object = null;
	}
	
	/**
	 * Sets the object, thus making this reference "resolved".
	 * @param o the object.
	 */
	@Override
	public void setObject(DMO o){
		object = o;
	}
	
	/**
	 * @return The object if this reference is resolved.
	 */
	@Override
	public DMO getObject(){
		return(object);
	}
	
	/**
	 * @return True if the reference is resolved and false otherwise.
	 */
	@Override
	public boolean isResolved(){
		if (object == null)
			return(false);
			
		return(true);
	}
	
}
