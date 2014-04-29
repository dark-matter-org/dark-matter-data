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
package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcMappedAttributeIF;
import org.dmd.core.DmcObjectName;
import org.dmd.core.interfaces.DmcOutputStreamIF;


/**
 * The NameContainer is designed to hold a typed DmcObjectName value. This allows
 * for the transport of individually identified name values in things like the 
 * the Dark Matter Protocol GetRequest. 
 */
@SuppressWarnings("serial")
public class NameContainer implements DmcMappedAttributeIF, Serializable {

	DmcTypeDmcObjectName<?>	name;
	
	public NameContainer(){
		name = null;
	}
	
	public NameContainer(DmcTypeDmcObjectName<?> n){
		name = n;
	}
	
	public DmcObjectName getName(){
		if (name == null)
			return(null);
		
		return(name.getSV());
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		name.serializeIt(dos);
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		name =  (DmcTypeDmcObjectName<?>) dis.getAttributeInstance();
		name.deserializeIt(dis);
	}

	public NameContainer cloneIt() {
		NameContainer rc = new NameContainer();
		rc.name = name;
		return(rc);
	}

	public String toString(){
		return(name.getName() + " " + name.getSV().toString());
	}
	
	///////////////////////////////////////////////////////////////////////////////
	// The following functions are overridden to provide some further magic for
	// NameContainers. It allows for things like storing a heterogeneous collection
	// of object names, say in a HASHSET attribute and then being able to use a
	// straight DmcObjectName in a contains() call. 
	//
	// The overridden method use our underlying DmcObjectname to provide the kek,
	// hashcode etc.
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof NameContainer){
			NameContainer other = (NameContainer) obj;
			if ( (name != null) && (other.name != null))
				return(name.getSV().equals(other.name.getSV()));
		}
		else if (obj instanceof DmcObjectName){
			if (name != null){
				DmcObjectName other = (DmcObjectName) obj;
				return(name.getSV().equals(other));
			}
		}
			
		return false;
	}
	
	@Override
	public int hashCode(){
		return(name.getSV().hashCode());
	}

	@Override
	public Object getKey() {
		if (name == null)
			return(null);
		
		return(name.getSV().getKey());
	}

	@Override
	public String getKeyAsString() {
		if (name == null)
			return(null);
		
		return(name.getSV().getKeyAsString());
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		if (obj instanceof NameContainer){
			NameContainer other = (NameContainer) obj;
			if ( (name != null) && (other.name != null))
				return(name.getSV().equals(other.name.getSV()));
		}
			
		return false;
	}

}
