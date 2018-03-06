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
package org.dmd.dmc.util;

import java.util.ArrayList;

//import org.dmd.util.exceptions.ResultException;

/**
 * Defines an interface to some data store that allows for storage and retrieval
 * of {@link DmcUncheckedObject} instances.
 */
public interface UcoDataStoreIF {

	/**
	 * Allows for the retrieval of a set of objects of a particular class, based on
	 * a particular attribute and a value for that attribute.
	 * <p/>
	 * Generally speaking, the data store would have to be maintaining an index
	 * @param className the class name
	 * @param attrName  the name of the attribute on which the class is indexed
	 * @param searchFor the value to search for  
	 * @return a list of objects that match the request; it may be empty.
	 * @throws ResultException if something wanky occurs
	 */
//	public ArrayList<DmcUncheckedObject> findObjects(String className, String attrName, String searchFor) throws ResultException;
	public ArrayList<DmcUncheckedObject> findObjects(String className, String attrName, String searchFor);
	
	/**
	 * Allows you to write an object to the data store.
	 * @param obj the object to be written
	 * @throws ResultException if something wanky occurs
	 */
//	public void writeObject(DmcUncheckedObject obj) throws ResultException;
	public void writeObject(DmcUncheckedObject obj);
	
	/**
	 * Allows you to modify an existing object, probably one that you had retrieved via findObjects().
	 * @param obj the object to be modified
	 * @param newvals the new values for one or more attributes
	 */
//	public void modifyObject(DmcUncheckedObject obj, ArrayList<NamedStringArray> newvals) throws ResultException;
	public void modifyObject(DmcUncheckedObject obj, ArrayList<NamedStringArray> newvals);
	
}
