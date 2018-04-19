//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2018 dark-matter-data committers
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
package org.dmd.dmc.cache;

import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcObject;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;

/**
 * The DmoCacheListenerManager will manage a set of DmoCacheIndexListenerIFs and
 * allow them to be notified when changes are made to a cache of objects.
 * <p/>
 * This class is currently designed for use in single threaded environments
 * such as GWT clients.
 */
public class DmoCacheListenerManager {

	TreeMap<DmcClassInfo,ArrayList<DmoCacheListenerRegistration>>	listeners;
	
	public DmoCacheListenerManager() {
		listeners = new TreeMap<>();
	}
	
	public DmoCacheListenerRegistration register(DmcClassInfo dci, DmoCacheIndexListenerIF listener) {
		DmoCacheListenerRegistration rc = new DmoCacheListenerRegistration(listener);
		
		ArrayList<DmoCacheListenerRegistration> existing = listeners.get(dci);
		if (existing == null) {
			existing = new ArrayList<>();
			listeners.put(dci, existing);
		}
		existing.add(rc);
		
		return(rc);
	}
	
	/**
	 * Notifies registered listeners of the specified index that an object has been added.
	 * @param index the associated index
	 * @param object the object that was added
	 * @param event the associated event
	 */
	public void objectAdded(DmcClassInfo index, DmcObject object, DMPEventDMO event) {
		ArrayList<DmoCacheListenerRegistration> existing = listeners.get(index);
		if (existing != null) {
			for(DmoCacheListenerRegistration dclr: existing) {
				dclr.listener().objectAdded(index, object, event);
			}
		}
	}

	/**
	 * Notifies registered listeners of the specified index that an object has been deleted.
	 * @param index the associated index
	 * @param object the object that was deleted
	 * @param event the associated event
	 */
	public void objectDeleted(DmcClassInfo index, DmcObject object, DMPEventDMO event) {
		ArrayList<DmoCacheListenerRegistration> existing = listeners.get(index);
		if (existing != null) {
			for(DmoCacheListenerRegistration dclr: existing) {
				dclr.listener().objectDeleted(index, object, event);
			}
		}
	}

	/**
	 * Notifies registered listeners of the specified index that an object has been modified.
	 * @param index the associated index
	 * @param object the object that was modified
	 * @param event the associated event
	 */
	public void objectModified(DmcClassInfo index, DmcObject object, DMPEventDMO event) {
		ArrayList<DmoCacheListenerRegistration> existing = listeners.get(index);
		if (existing != null) {
			for(DmoCacheListenerRegistration dclr: existing) {
				dclr.listener().objectModified(index, object, event);
			}
		}
	}

}
