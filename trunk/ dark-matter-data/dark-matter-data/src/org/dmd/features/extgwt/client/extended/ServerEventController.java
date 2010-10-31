package org.dmd.features.extgwt.client.extended;

import java.util.ArrayList;
import java.util.HashMap;

import org.dmd.dmp.shared.domains.DarkMatterEventsDomain;
import org.dmd.dmp.shared.generated.dmo.EventDMO;
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
	            if(anEvent instanceof EventDMO) {
	            	EventDMO event = (EventDMO) anEvent;
	            	
	            	ArrayList<ServerEventHandlerIF> interested = handlers.get(event.getObjClass());
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
	
	void dispatchServerEvent(EventDMO event){
		
	}


}
