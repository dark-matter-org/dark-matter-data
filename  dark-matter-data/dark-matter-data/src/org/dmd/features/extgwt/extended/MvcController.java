package org.dmd.features.extgwt.extended;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcObject;
import org.dmd.features.extgwt.generated.dmw.MvcControllerDMW;

public class MvcController extends MvcControllerDMW {
	
	// The import statements we need
	StringBuffer					importDefs;
	
	// The local variables we need - this is for views and resources
	StringBuffer					localVariables;
	
	// All events that are handled or forwarded by this controller
	TreeMap<String,MvcEvent> 		allEvents;
	
	// All of our events with additional information about whether the
	// the controller or any of its views are handling them
	TreeMap<String,WhoIsUsingEvent>	eventHandlers;
	
	// The abstract event handler functions, one for each event that the controller itself handles
	StringBuffer 					controllerEventHandlers;
	
	StringBuffer					handleEventFunction;
	
	// The functions that grab resources from the registry
	StringBuffer					resourceAccessFunctions;
	
	// We may have many resources of the same type, this hash maintains the unique set of
	// imports we require (without duplicates).
	TreeMap<String,String>			uniqueResourceImports;
	
	public MvcController(){
		super();
	}
	
	public MvcController(DmcObject obj){
		super(obj);
	}
	
	/**
	 * This method will initialize the various information that is required by code generation
	 * utilities.
	 */
	public void initCodeGenInfo(){
		if (importDefs == null){
			importDefs 				= new StringBuffer();
			localVariables 			= new StringBuffer();
			allEvents 				= new TreeMap<String, MvcEvent>();
			eventHandlers 			= new TreeMap<String, WhoIsUsingEvent>();
			controllerEventHandlers = new StringBuffer();
			handleEventFunction		= new StringBuffer();
			resourceAccessFunctions = new StringBuffer();
			uniqueResourceImports 	= new TreeMap<String, String>();
			
			initAllEvents();
			
			initResourceAccessFunctions();
			
			initImportDefs();
			
			initLocalVariables();
			
			initHandleEventFunction();
		}
	}
	
	/**
	 * Initializes the allEvents tree.
	 */
	void initAllEvents(){
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
	
	/**
	 * Initializes the resourceAccessFunctionand uniqueResourceImports
	 */
	void initResourceAccessFunctions(){
		Iterator<MvcRegistryItem> items = getUsesRegistryItem();
		if (items != null){
			while(items.hasNext()){
				MvcRegistryItem item = items.next();
				// service = (MailServiceAsync) Registry.get(Mail.SERVICE);
//				resourceAccessFunctions.append("@SuppressWarnings(\"unused\")\n");
				resourceAccessFunctions.append("    protected " + item.getItemClass() + " get" + item.getCamelCaseName() + "(){\n");
				resourceAccessFunctions.append("        if (" + item.getVariableName() + " == null)\n");
				resourceAccessFunctions.append("            " + item.getVariableName() + " = (" + item.getItemClass() + ") Registry.get(\"" + item.getName() + "\");\n");
				resourceAccessFunctions.append("        return(" + item.getVariableName() + ");\n");
				resourceAccessFunctions.append("    }\n\n");
				
				uniqueResourceImports.put(item.getUserDataType(), item.getUserDataType());
				
				if (localVariables.length() == 0)
					localVariables.append("    // Resources\n");
				localVariables.append("    protected " + item.getItemClass() + " " + item.getVariableName() + ";\n");
			}
		}
		
		items = getCreatesRegistryItem();
		if (items != null){
			while(items.hasNext()){
				MvcRegistryItem item = items.next();
				resourceAccessFunctions.append("    protected " + item.getItemClass() + " get" + item.getCamelCaseName() + "(){\n");
				resourceAccessFunctions.append("        if (" + item.getVariableName() + " == null)\n");
				resourceAccessFunctions.append("            " + item.getVariableName() + " = (" + item.getItemClass() + ") Registry.get(\"" + item.getName() + "\");\n");
				resourceAccessFunctions.append("        return(" + item.getVariableName() + ");\n");
				resourceAccessFunctions.append("    }\n\n");
				
				resourceAccessFunctions.append("    abstract void add" + item.getCamelCaseName() + "ToRegistry(" + item.getItemClass() + " item);\n\n");
				
				uniqueResourceImports.put(item.getUserDataType(), item.getUserDataType());
				
				if (localVariables.length() == 0)
					localVariables.append("    // Resources\n");
				localVariables.append("    protected " + item.getItemClass() + " " + item.getVariableName() + ";\n");
			}
		}

	}
	
	void initImportDefs(){
		importDefs.append("import com.extjs.gxt.ui.client.mvc.Controller;\n");
		
		if (allEvents.size() > 0){
			importDefs.append("import com.extjs.gxt.ui.client.mvc.AppEvent;\n");
			importDefs.append("import com.extjs.gxt.ui.client.event.EventType;\n");
		}
			
		if (resourceAccessFunctions.length() > 0)
			importDefs.append("import com.extjs.gxt.ui.client.Registry;\n");
		
		for(String s : uniqueResourceImports.values()){
			importDefs.append("import " + s + ";\n");
		}

	}
	
	void initLocalVariables(){
		Iterator<MvcView> views = getControlsView();
		if (views != null){
			while(views.hasNext()){
				MvcView view = views.next();
				if (localVariables.length() == 0)
					localVariables.append("\n    // View(s)\n");
				localVariables.append("    protected " + view.getName() + "MVC " + view.getVariableName() + ";\n");
			}
		}
	}
	
	void initHandleEventFunction(){
		boolean first = true;
		
        handleEventFunction.append("    public void handleEvent(AppEvent event) {\n");
        handleEventFunction.append("        EventType type = event.getType();\n");
        
		String prefix = "if";
		for(WhoIsUsingEvent who : eventHandlers.values()){
			handleEventFunction.append("        " + prefix + " (type == AppEventsMVC." + who.event.getCamelCaseName() + ") {\n");
			if (who.controllerUsing){
				handleEventFunction.append("            handle" + who.event.getCamelCaseName() + "(event);\n");
				
				// Add an abstract definition of the function that will handle the event
				controllerEventHandlers.append("    abstract protected void handle" + who.event.getCamelCaseName() + "(AppEvent event);\n\n");
			}
			if (who.views != null){
				for(MvcView view : who.views){
					handleEventFunction.append("            forwardToView(" + view.getVariableName() + ",event);\n");
				}
			}
			handleEventFunction.append("        }\n");
		
			if (first){
				first = false;
				prefix = "else if";
			}
		}
		
		handleEventFunction.append("    }\n\n");
		
	}
	
	public String getImportDefs(){
		return(importDefs.toString());
	}
	
	/**
	 * @return The set of local functions that will return typed resources from the Registry.
	 */
	public String getResourceAccessFunctions(){
		return(resourceAccessFunctions.toString());
	}
	
	/**
	 * @return The variables that represent the views being controlled by this controller as well
	 * as the resources that we use.
	 */
	public String getLocalVariables(){
		return(localVariables.toString());
	}
	
	/**
	 * @return The definitions of the abstract event handler functions that must be filled in by the derived controller class.
	 */
	public String getControllerEventHandlers(){
		return(controllerEventHandlers.toString());
	}
	
	/**
	 * Returns the complete set of events that this controller or any of the views
	 * it controls handles.
	 * @return
	 */
	public TreeMap<String,MvcEvent> getAllEvents(){
		return(allEvents);
	}
	
	/**
	 * Returns the contents of the handleEvent function. The body determines the type
	 * of the event and then 1) if the controller handles it, adds a call to handle<event name>Event
	 * 2) if one or more views handle it, it calls their handle<event name>Event method.
	 */
	public String getHandleEventFunction(){
		return(handleEventFunction.toString());
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

