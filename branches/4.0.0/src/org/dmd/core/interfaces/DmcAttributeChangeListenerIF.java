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
package org.dmd.core.interfaces;

/**
 * The DmcAttributeChangeListenerIF interface is provided as a convenience hook
 * in case you want to create wrappers that listen to changes to an object's
 * attribute and inform others of these changes. The Dark Matter Core doesn't
 * implement any particular change interface because they tend to be highly
 * context specific - and at base, Dark Matter tries to stay away from the
 * specifics!
 */
public interface DmcAttributeChangeListenerIF {

	/**
	 * This method is called by implementing classes once they have instantiated the appropriate
	 * value holder for an attribute value to be set on an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param container The container being modified.
	 * @param an        The name of the attribute affected.
	 * @param existing  The existing value, or null if there wasn't one.
	 * @param newvalue  The new value for the single-valued attribute.
	 */
	public void updateObjectSet(DmcContainerIF container, String an, Object existing, Object newvalue);
	
	/**
	 * This method is called by implementing classes once they have instantiated the appropriate
	 * value holder for an attribute value to be added an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param container The container being modified.
	 * @param an        The name of the attribute affected.
	 * @param existing  The existing value, or null if there wasn't one.
	 * @param newvalue  The new value being added.
	 */
	public void updateObjectAdd(DmcContainerIF container, String an, Object existing, Object newvalue);
	
	/**
	 * This method is called by implementing classes once they have instantiated the appropriate
	 * value holder for an attribute value to be added an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param container The container being modified.
	 * @param an        The name of the attribute affected.
	 * @param existing  The existing value, or null if there wasn't one.
	 * @param value  The value being deleted from the multi-valued attribute.
	 */
	public void updateObjectDel(DmcContainerIF container, String an, Object existing, Object value);
	
	/**
	 * This method is called by implementing classes once they have instantiated the appropriate
	 * value holder for an attribute value to be added an object. By funneling all set requests
	 * through this method, we can handle things like attribute change notifications through a common
	 * mechanism.
	 * @param container The container being modified.
	 * @param an        The name of the attribute being removed from the object.
	 * @param existing  The existing value, or null if there wasn't one.
	 */
	public void updateObjectRem(DmcContainerIF container, String an, Object existing);
	
	
}
