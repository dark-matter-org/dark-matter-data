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

import java.util.ArrayList;

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
	
	// The change listener manager
	protected DmcListenerManagerIF	listenerManager;
	
	/**
	 * This constructor is used to pass the properly constructed DmcObject from 
	 * derived wrapper classes. The last class in the derivation chain will instantiate
	 * the appropriate Dark Matter Object.
	 * @param c
	 */
	protected DmcContainer(DmcObject c){
		core = c;
		listenerManager = null;
	}

	public DmcContainer(){
		core = null;
		listenerManager = null;
	}

	/**
	 * Sets the listener manager on this object.
	 * @param manager
	 */
	public void setListenerManager(DmcListenerManagerIF manager){
		listenerManager = manager;
	}
	
	/**
	 * @return The listener manager ofr this object.
	 */
	public DmcListenerManagerIF getListenerManager(){
		return(listenerManager);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	@SuppressWarnings("unchecked")
	protected abstract ArrayList getAuxDataHolder();

	////////////////////////////////////////////////////////////////////////////////
	// DmcContainerIF implementation
	
	/**
	 * Sets the core object.
	 * @param obj The core object.
	 */
	public void setDmcObject(DmcObject obj){
		core = obj;
		core.container = this;
	}
	
	/**
	 * Gets the core object.
	 * @return T The core object.
	 */
	public DmcObject getDmcObject(){
		return (core);
	}
	
	/**
	 * Adds an attribute change listener.
	 * @param listener
	 */
	public void addAttributeChangeListener(DmcAttributeChangeListenerIF listener){
		if (listenerManager != null)
			listenerManager.addAttributeChangeListener(listener);
	}
	
	/**
	 * Removes an attribute change listener.
	 * @param listener
	 */
	public void removeAttributeChangeListener(DmcAttributeChangeListenerIF listener){
		if (listenerManager != null)
			listenerManager.removeAttributeChangeListener(listener);
	}

	/**
	 * This method is called by implementing classes once they have instantiated the appropriate
	 * value holder for an attribute value to be set on an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param an        The name of the attribute affected.
	 * @param existing  The existing value, or null if there wasn't one.
	 * @param newvalue  The new value for the single-valued attribute.
	 */
	public void updateObjectSet(String an, Object existing, Object newvalue){
		if (listenerManager != null)
			listenerManager.updateObjectSet(this, an, existing, newvalue);
	}
	
	/**
	 * This method is called by implementing classes once they have instantiated the appropriate
	 * value holder for an attribute value to be added an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param an        The name of the attribute affected.
	 * @param existing  The existing value, or null if there wasn't one.
	 * @param newvalue  The new value being added.
	 */
	public void updateObjectAdd(String an, Object existing, Object newvalue){
		if (listenerManager != null)
			listenerManager.updateObjectAdd(this, an, existing, newvalue);
	}
	
	/**
	 * This method is called by implementing classes once they have instantiated the appropriate
	 * value holder for an attribute value to be added an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param an        The name of the attribute affected.
	 * @param existing  The existing value, or null if there wasn't one.
	 * @param newvalue  The value being deleted from the multi-valued attribute.
	 */
	public void updateObjectDel(String an, Object existing, Object newvalue){
		if (listenerManager != null)
			listenerManager.updateObjectDel(this, an, existing, newvalue);
	}
	
	/**
	 * This method is called by implementing classes once they have instantiated the appropriate
	 * value holder for an attribute value to be added an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param an        The name of the attribute being removed from the object.
	 * @param existing  The existing value, or null if there wasn't one.
	 */
	public void updateObjectRem(String an, Object existing){
		if (listenerManager != null)
			listenerManager.updateObjectRem(this, an, existing);
	}

}
