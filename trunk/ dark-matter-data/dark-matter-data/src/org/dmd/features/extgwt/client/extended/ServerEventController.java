package org.dmd.features.extgwt.client.extended;

import java.util.ArrayList;
import java.util.HashMap;

import org.dmd.features.extgwt.client.ServerEventHandlerIF;
import org.dmd.features.extgwt.client.generated.mvc.ServerEventControllerMVC;

import com.extjs.gxt.ui.client.mvc.AppEvent;

/**
 * The DMMVCEventController provides registration with the GWT Event Services
 * for your application. When an MvcEvent is specified as having a serverEventClass
 * attribute, the MVC framework automatically generates code to register the 
 * component with the event controller. Events for objects of the specified class
 * are then forwarded to the component automatically.
 */
public class ServerEventController extends ServerEventControllerMVC {
	
	// Key: The class name in which a handler is interested
	// Value: The event handler
	HashMap<String, ArrayList<ServerEventHandlerIF>> handlers;
	
	@Override
	protected void initialize() {
		handlers = new HashMap<String, ArrayList<ServerEventHandlerIF>>();
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

	@Override
	protected void handleMvcInitEvent(AppEvent event) {
		registerMvcServerEventController(this);
		
		
		
		// Sending this event will cause all controllers and views that want server events
		// to add themselves as event handlers.
		dispatchMvcInitEventFramework();
	}
}
