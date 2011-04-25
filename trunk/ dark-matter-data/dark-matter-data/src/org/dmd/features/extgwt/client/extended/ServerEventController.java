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
package org.dmd.features.extgwt.client.extended;

import java.util.ArrayList;
import java.util.HashMap;

import org.dmd.dmp.shared.domains.DarkMatterEventsDomain;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.features.extgwt.client.ServerEventHandlerIF;
import org.dmd.features.extgwt.client.generated.mvc.ServerEventControllerMVC;

import com.extjs.gxt.ui.client.mvc.AppEvent;

import de.novanic.eventservice.client.event.Event;
import de.novanic.eventservice.client.event.RemoteEventService;
import de.novanic.eventservice.client.event.RemoteEventServiceFactory;
import de.novanic.eventservice.client.event.listener.RemoteEventListener;

/**
 * The ServerEventController provides registration with the GWT Event Services
 * for your application. When you indicate that your controller/view handles an 
 * MvcServerEvent, the MVC framework automatically generates code to register the 
 * component with the server event controller. Events for objects of the specified class
 * are then forwarded to the component automatically.
 */
public class ServerEventController extends ServerEventControllerMVC {
	
	// Our handle to the event service
	RemoteEventService eventService;

	
	// Key: The class name in which a handler is interested
	// Value: The event handler
	HashMap<String, ArrayList<ServerEventHandlerIF>> handlers;
	
	@Override
	protected void initialize() {
		handlers = new HashMap<String, ArrayList<ServerEventHandlerIF>>();
		
	    eventService = RemoteEventServiceFactory.getInstance().getRemoteEventService();
	}

	/**
	 * When the MVC framework is initialized, we attempt to add a listener to 
	 * the Dark Matter Event domain.
	 */
	@Override
	protected void handleMvcInitEvent(AppEvent event) {
		
	    eventService.addListener(DarkMatterEventsDomain.DOMAIN, new RemoteEventListener() {
	        public void apply(Event anEvent) {
	            if(anEvent instanceof DMPEventDMO) {
	            	DMPEventDMO event = (DMPEventDMO) anEvent;
	            	
	            	ArrayList<ServerEventHandlerIF> interested = handlers.get(event.getSourceObjectClass());
	            	if (interested != null){
	            		for(ServerEventHandlerIF h : interested){
	            			h.handleServerEvent(event);
	            		}
	            	}
	            }
	        }
	    });

		registerMvcServerEventController(this);
		
		// Sending this event will cause all controllers and views that want server events
		// to add themselves as event handlers.
		dispatchMvcInitEventFramework();
	}
	
	/**
	 * Adds a handler for events associated with the specified object class.
	 * @param handler  The event handler.
	 * @param objClass The name of the class.
	 */
	public void addEventHandler(ServerEventHandlerIF handler, String objClass){
		ArrayList<ServerEventHandlerIF> listeners = handlers.get(objClass);
		
		if (listeners == null){
			listeners = new ArrayList<ServerEventHandlerIF>();
			handlers.put(objClass, listeners);
		}
		
		listeners.add(handler);
	}
	
	void dispatchServerEvent(DMPEventDMO event){
		
	}


}
