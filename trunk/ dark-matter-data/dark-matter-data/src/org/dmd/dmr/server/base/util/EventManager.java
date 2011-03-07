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
package org.dmd.dmr.server.base.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dmd.dmp.server.extended.Event;

public class EventManager {

	List<EventListenerIF>	listeners;
	
	public EventManager(){
		listeners       = Collections.synchronizedList(new ArrayList<EventListenerIF>());
	}
	
	public void addListener(EventListenerIF listener){
		listeners.add(listener);
	}
	
	public void removeListener(EventListenerIF listener){
		listeners.remove(listener);
	}
	
	public void notifyListeners(Event event){
		for(EventListenerIF listener : listeners){
			switch(event.getEventType()){
			case CREATED:
				listener.objectCreated(event);
				break;
			case DELETED:
				listener.objectDeleted(event);
				break;
			case MODIFIED:
				listener.objectModified(event);
				break;
			}
		}
	}
}
