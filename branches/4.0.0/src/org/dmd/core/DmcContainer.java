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

import org.dmd.core.interfaces.DmcContainerIF;
import org.dmd.dms.shared.generated.types.DmcTypeModifierMV;

/**
 * The DmcContainer class is a convenience base class that you can use as the
 * default implementation of the DmcContainerIF if you wish. The intent of this
 * strategy was to prevent lock in to a particular derivation hierarchy for those
 * objects that wanted to use DmcObjects, but wanted to use their own base
 * class for the wrapper. Feel free to create your own base class that implements
 * DmcContainerIF.
 */
abstract public class DmcContainer implements DmcContainerIF {
	
	// The core object
	protected DmcObject core;
	
	// A flag that can be used to indicate that an object has been deleted.
	boolean deleted;
	
	/**
	 * This constructor is used to pass the properly constructed DmcObject from 
	 * derived wrapper classes. The last class in the derivation chain will instantiate
	 * the appropriate Dark Matter Object.
	 * @param c
	 */
	protected DmcContainer(DmcObject c){
		core = c;
		core.setContainer(this);
//		listenerManager = null;
	}

	public DmcContainer(){
		core = null;
//		listenerManager = null;
	}
	
	/**
	 * Sets the object's deleted flag to true.
	 */
	public void setDeleted(){
		deleted = true;
	}
	
	/**
	 * @return The object's deleted flag.
 	 */
	public boolean getDeleted(){
		return(deleted);
	}
	
	/**
	 * Sets the modifier on our core object.
	 * @param mods The modification holder.
	 */
	public void setModifier(DmcTypeModifierMV mods){
		core.setModifier(mods);
	}
	
	/**
	 * @return The modifier if one has been set.
	 */
	public DmcTypeModifierMV getModifier(){
		return(core.getModifier());
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DmcContainerIF implementation
	
	/**
	 * Sets the core object.
	 * @param obj The core object.
	 */
	public void setDmcObject(DmcObject obj){
		core = obj;
		core.setContainer(this);
	}
	
	/**
	 * Gets the core object.
	 * @return T The core object.
	 */
	public DmcObject getDmcObject(){
		return (core);
	}
	
}
