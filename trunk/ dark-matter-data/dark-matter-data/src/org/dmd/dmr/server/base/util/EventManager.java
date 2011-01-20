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
