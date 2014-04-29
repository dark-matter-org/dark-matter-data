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
package org.dmd.core;

import java.io.Serializable;

import org.dmd.core.interfaces.DmcMappedAttributeIF;
import org.dmd.core.interfaces.DmcNamedObjectIF;


/**
 * The DmcNamedObjectNontransportableREF is used when creating object reference attributes
 * whose payload is NOT expected to be sent across whatever RPC mechanism is being used.
 * The object may be resolved locally, but will never be sent to the remote side
 * of a connection.
 */
@SuppressWarnings("serial")
abstract public class DmcNamedObjectNontransportableREF<DMO extends DmcNamedObjectIF> extends DmcNamedObjectREF<DMO> implements Serializable, DmcNamedObjectIF, Comparable<DmcNamedObjectNontransportableREF<?>> {
		
	// If the reference is resolved, the object will be available. Otherwise,
	// this will be null. NOTE: Whatever object we refer to WILL NOT be serialized
	// for transport via whatever RPC mechanism is in use.
	protected transient DMO object;
	
	/**
	 * Constructs a new object reference attribute.
	 */
	public DmcNamedObjectNontransportableREF(){
		object = null;
	}
	
	abstract public void setObject(DMO o);

	public boolean equals(Object obj){
		return(getObjectName().equals( ((DmcNamedObjectIF)obj).getObjectName() ) );
	}
	
	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj){
		boolean rc = false;
		if (obj instanceof DmcNamedObjectNontransportableREF<?>){
			DmcNamedObjectNontransportableREF<?> other = (DmcNamedObjectNontransportableREF<?>) obj;
			rc = getObjectName().equals(other.getObjectName());
		}
		return(rc);
	}
	
	/**
	 * @return The object if this reference is resolved.
	 */
	public DMO getObject(){
		return(object);
	}
	
	/**
	 * @return True if the reference is resolved and false otherwise.
	 */
	public boolean isResolved(){
		if (object == null)
			return(false);
			
		return(true);
	}

	@Override
	public int compareTo(DmcNamedObjectNontransportableREF<?> o) {
		return(getObjectName().getNameString().compareTo(o.getObjectName().getNameString()));
	}
	
	
}
