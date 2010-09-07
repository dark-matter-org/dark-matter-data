package org.dmd.features.extgwt.extended;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcObject;
import org.dmd.features.extgwt.generated.dmw.MvcControllerDMW;

public class MvcController extends MvcControllerDMW {
	
	// All events that are handled or forwarded by this controller
	TreeMap<String,MvcEvent> allEvents;
	
	// All of our events with additional information about whether the
	// the controller or any of its views are handling them
	TreeMap<String,WhoIsUsingEvent>	eventHandlers;
	
	StringBuffer ourEventHandlers;
	
	public MvcController(){
		super();
	}
	
	public MvcController(DmcObject obj){
		super(obj);
	}
	
	public String getViewVariables(){
		StringBuffer sb = new StringBuffer();
		
		Iterator<MvcView> views = getControlsView();
		if (views != null){
			while(views.hasNext()){
				MvcView view = views.next();
				
				sb.append("    protected " + view.getName() + "MVC " + view.getVariableName() + ";\n");
			}
		}
		return(sb.toString());
	}
	
	/**
	 * Returns the complete set of events that this controller or any of the views
	 * it controls handles.
	 * @return
	 */
	public TreeMap<String,MvcEvent> getAllEvents(){
		if (allEvents == null){
			allEvents 			= new TreeMap<String, MvcEvent>();
			eventHandlers 		= new TreeMap<String, WhoIsUsingEvent>();
			ourEventHandlers	= new StringBuffer();
			
			// We gather all of the events that we handle and any events that our
			// views want to handle
			Iterator<MvcEvent> events = getHandlesEvent();
			if (events != null){
				while(events.hasNext()){
					MvcEvent event = events.next();
					allEvents.put(event.getName(), event);
					addUsingEvent(event);
				}
			}
			
			Iterator<MvcView> views = getControlsView();
			if (views != null){
				while(views.hasNext()){
					MvcView view = views.next();
					
					Iterator<MvcEvent> viewEvents = view.getHandlesEvent();
					if (viewEvents != null){
						while(viewEvents.hasNext()){
							MvcEvent event = viewEvents.next();
							allEvents.put(event.getName(), event);
							addUsingEvent(event, view);
						}
					}

				}
			}
		}
		
		return(allEvents);
	}
	
	/**
	 * Returns the contents of the handleEvent function body. The body determines the type
	 * of the event and then 1) if the controller handles it, adds a call to handle<event name>Event
	 * 2) if one or more views handle it, it calls their handle<event name>Event method.
	 */
	public String getHandleEventBody(){
		StringBuffer sb = new StringBuffer();
		
		boolean first = true;
		String prefix = "if";
		for(WhoIsUsingEvent who : eventHandlers.values()){
			sb.append("        " + prefix + " (type == AppEventsMVC." + who.event.getCamelCaseName() + ") {\n");
			if (who.controllerUsing){
				sb.append("            handle" + who.event.getCamelCaseName() + "(event);\n");
			}
			if (who.views != null){
				for(MvcView view : who.views){
					sb.append("            " + view.getVariableName() + ".handle" + who.event.getCamelCaseName() + "(event);\n");
				}
			}
			sb.append("        }\n");
		
			if (first){
				first = false;
				prefix = "else if";
			}
		}
		
		return(sb.toString());
	}
	
	void addUsingEvent(MvcEvent event){
		WhoIsUsingEvent who = eventHandlers.get(event.getName());
		if (who == null){
			who = new WhoIsUsingEvent(event, true);
			eventHandlers.put(event.getName(), who);
		}
			
	}
	
	void addUsingEvent(MvcEvent event, MvcView v){
		WhoIsUsingEvent who = eventHandlers.get(event.getName());
		if (who == null){
			who = new WhoIsUsingEvent(event, false);
			eventHandlers.put(event.getName(), who);
		}
		
		who.addView(v);
	}
	
	class WhoIsUsingEvent{
		MvcEvent	event;
		boolean controllerUsing;
		ArrayList<MvcView> views;
		
		WhoIsUsingEvent(MvcEvent e, boolean con){
			event = e;
			controllerUsing = con;
		}
		
		void addView(MvcView v){
			if (views == null)
				views = new ArrayList<MvcView>();
			views.add(v);
		}
	}
	
}

