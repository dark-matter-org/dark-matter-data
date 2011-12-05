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

import org.dmd.dmc.types.Modifier;


/**
 * The DmcNamedObjectREF is an abstract base class that defines helper class for implementing
 * the concept of references to named objects that can either be resolved or unresolved. The
 * derived classes of this class provide the concept of transportable versus nontransportable
 * object references.
 */
@SuppressWarnings("serial")
abstract public class DmcNamedObjectREF<DMO extends DmcNamedObjectIF> implements Serializable, DmcNamedObjectIF, DmcMappedAttributeIF  {
	
	protected transient Modifier backrefModifier;
	
	/**
	 * Constructs a new named object reference.
	 */
	public DmcNamedObjectREF(){

	}
	
	/**
	 * Sets the modifier that will remove this object reference if the object being
	 * referred to is deleted. This is used to efficiently remove the back reference
	 * when an object is no longer referenced. This mechanism is used by the Dark Matter 
	 * back reference tracking mechanisms; don't mess with it unless you know what 
	 * you're doing ;-)
	 * @param mod The back reference modifier.
	 */
	public void setBackrefModifier(Modifier mod){
		backrefModifier = mod;
	}
	
	/**
	 * If back reference tracking was turned on when this reference was resolved, this
	 * will return the handle to back reference modifier that was created on the
	 * object being referred to.
	 * @return The back reference modifier.
	 */
	public Modifier getBackrefModifier(){
		return(backrefModifier);
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
		
	/**
	 * Sets the name of the object being referred to. NOTE: USE WITH CAUTION!!!
	 * @param n The name of the object.
	 */
	abstract public void setName(DmcObjectName n) throws DmcValueException;
	
	/**
	 * Override toString() to provide the object name.
	 */
	@Override
	public String toString(){
		return(getObjectName().getNameString());
	}
	
	///////////////////////////////////////////////////////////////////////////
	// DmcNamedObjectIF partial implementation
	
	// getObjectName() and getObjectNameAttribute() are implemented in the
	// auto-generated REF types for all named objects.
	
	/**
	 * @return true if the object passed as argument is a DmcNamedObjectREF and
	 * has a DmcObjectName that equals our DmcObjectName.
	 */
	@Override
	public boolean equals(Object obj){
		if (obj instanceof DmcNamedObjectREF){
			DmcNamedObjectREF<?> ref = (DmcNamedObjectREF<?>) obj;
			if ( (getObjectName() != null) && (ref.getObjectName() != null))
				return(getObjectName().equals(ref.getObjectName()));
			
			return(false);
		}
		return(false);
	}
	
	///////////////////////////////////////////////////////////////////////////
	// DmcMappedAttributeIF implementation
	
	/**
	 * Returns the key associated with this attribute value.
	 * @return The key value.
	 */
	public Object getKey(){
		Object key = getObjectName();
		
		if (key == null)
			throw(new IllegalStateException("You've tried to use an object in a reference attribute, but the object's name attribute hasn't been set."));
		
		return(key);
	}
	
	/**
	 * Returns the key value represented as a string. we could just call the toString()
	 * method on the Object, but having this forces you implement an appropriate String
	 * conversion method for the key.
	 * @return A String.
	 */
	public String getKeyAsString(){
		return(getObjectName().getNameString());
	}

}
