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
package org.dmd.dmw;

import java.util.Iterator;

import org.dmd.dmc.DmcObject;

/**
 * The DmcObjectIterator provides common functionality for casting the values
 * returned from a collection of raw DMOs to the type of the wrapper class
 * that contains them. At the DMO level, multi-valued object collections
 * are DMOs. However, if a DMO is wrapped, it will have access to 
 * the object that wraps it via its getContainer() method. This class makes use
 * of that method to accessed the Dark Matter Wrapper instance that wraps the DMO
 * and passes it back, cast to the correct wrapper type.
 * <P>
 * As a note, this mechanism COULD NOT BE USED with objects in a GWT environment
 * since the java.util.Iterable interface is NOT SUPPORTED by the JRE emulation
 * mechanisms. That's why this class is here and not in org.dmd.dmc.
 * @param <CAST> The type of the container that wraps the DMOs in multi-valued attribute
 * @param <OBJ>  The type of the Dark Matter Object stored in the attribute.
 */
public class DmwObjectIterator<CAST,OBJ extends DmcObject> implements Iterable<CAST>, Iterator<CAST> {
	
	Iterator<OBJ> it;
	
	// Empty list constructor
	protected DmwObjectIterator(){
		it = null;
	}
	
	protected DmwObjectIterator(Iterator<OBJ> i){
		it = i;
	}
	
	public boolean hasNext(){
		if (it == null)
			return(false);
		
		return(it.hasNext());
	}

	@SuppressWarnings("unchecked")
	public CAST getNext(){
		if (it == null)
			throw(new IllegalStateException("Trying to getNext() on an empty DmwObjectIterator"));
		
		DmcObject obj = it.next();
		return((CAST) obj.getContainer());
	}

	@Override
	public Iterator<CAST> iterator() {
		return(this);
	}

	@Override
	public CAST next() {
		return(getNext());
	}

	@Override
	public void remove() {
		throw(new IllegalStateException("Cannot remove from a DmwObjectIterator."));
	}

}
