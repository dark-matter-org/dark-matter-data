package org.dmd.util.debug;

import java.util.ArrayList;

public class DebugChannel implements DebugChannelIF {
	
	DebugCategoryIF category;
	String uniqueName;
	
	final ArrayList<DebugHandlerIF>	handlers;
	
	public DebugChannel(DebugCategoryIF cat, String un){
		category = cat;
		handlers = new ArrayList<DebugHandlerIF>(0);
		uniqueName = un;
	}

	public DebugCategoryIF getCategory() {
		return(category);
	}

	public void publish(String message) {
		synchronized (handlers) {
			if (handlers.size() > 0){
				for(DebugHandlerIF h: handlers){
					h.handleDebug(category, message);
				}
			}
		}
	}

	public void subscribe(DebugHandlerIF h) {
		synchronized (handlers) {
			handlers.add(h);
		}
	}

	public void unsubscribe(DebugHandlerIF h) {
		synchronized (handlers) {
			handlers.remove(h);
		}
	}

	@Override
	public String getUniqueName() {
		return(uniqueName);
	}
	
	

}
