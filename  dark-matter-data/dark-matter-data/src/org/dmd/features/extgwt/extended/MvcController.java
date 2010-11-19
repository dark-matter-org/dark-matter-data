package org.dmd.features.extgwt.extended;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.features.extgwt.generated.dmw.MvcControllerDMW;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.CodeFormatter;

public class MvcController extends MvcControllerDMW {
	
	// The import statements we need
	StringBuffer					importDefs;
	
	// The class comment
	StringBuffer					classComments;
	
	// The local variables we need - this is for views and resources
	StringBuffer					localVariables;
	
	// All events that are handled or forwarded by this controller
	TreeMap<String,MvcEvent> 		allEvents;
	
	// All of our events with additional information about whether the
	// the controller or any of its views are handling them
	TreeMap<String,WhoIsUsingEvent>	eventHandlers;
	
	// The abstract event handler functions, one for each event that the controller itself handles
	StringBuffer 					controllerEventHandlers;
	
	// Prebuilt functions to dispatch events from the controller or any of its views
	StringBuffer					eventDispatchers;
	
	StringBuffer					handleEventFunction;
	
	// The functions that grab resources from the registry
	StringBuffer					resourceAccessFunctions;
	
	// We may have many resources of the same type, this hash maintains the unique set of
	// imports we require (without duplicates).
	TreeMap<String,String>			uniqueResourceImports;
	
	// The fully qualified class name of our extended class
	String							extendedImport;
	
	
	Boolean							haveServerEvents;
	
	// Key: class name
	TreeMap<String,MvcServerEvent>	serverEvents;
	
	// The abstract event handler functions for each server event
	StringBuffer					serverEventHandlers;
	
	StringBuffer					handleServerEventFunction;
	
	String							additionalInterfaces;
	

	
	public MvcController(){
		super();
	}
	
	/**
	 * This method will initialize the various information that is required by code generation
	 * utilities.
	 */
	public void initCodeGenInfo(){
		if (importDefs == null){
			importDefs 				= new StringBuffer();
			classComments			= new StringBuffer();
			localVariables 			= new StringBuffer();
			allEvents 				= new TreeMap<String, MvcEvent>();
			eventHandlers 			= new TreeMap<String, WhoIsUsingEvent>();
			
			serverEvents			= new TreeMap<String, MvcServerEvent>();
			serverEventHandlers		= new StringBuffer();
			handleServerEventFunction	= new StringBuffer();
			additionalInterfaces	= "";
			
			controllerEventHandlers = new StringBuffer();
			handleEventFunction		= new StringBuffer();
			eventDispatchers		= new StringBuffer();
			resourceAccessFunctions = new StringBuffer();
			uniqueResourceImports 	= new TreeMap<String, String>();
			
			classComments.append("/**\n");
			CodeFormatter.dumpCodeComment(getDescription(), classComments, " * ");
			classComments.append(" * <P>\n");
			classComments.append(" * This code was auto-generated by the mvcgenerator utility and shouldn't be altered manually!\n");
			classComments.append(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			classComments.append(" */\n");
			
			initAllEvents();
			
			initResourceAccessFunctions();
			
			initImportDefs();
			
			initLocalVariables();
			
			initHandleEventFunction();
			
			initServerEventInfo();
			
			initMenuSystemInfo();
		}
	}
	
	void initMenuSystemInfo(){
		if (definesMenusOrActions()){
//			importDefs.append("import org.dmd.features.extgwt.client.extended.MenuController;\n");
			
//			Iterator<MvcAction> actions = getDefinesAction();
//			if (actions != null){
//				while(actions.hasNext()){
//					MvcAction action = actions.next();
//					importDefs.append("import " + action.getDefinedInMVCConfig().getGenPackage() + ".extended." + action.getCamelCaseName() + ";\n");
//				}
//			}
		}
	}
	
	void initServerEventInfo(){
		Iterator<MvcServerEvent> events = getHandlesServerEvent();
		if (events != null){
			importDefs.append("import org.dmd.features.extgwt.client.ServerEventHandlerIF;\n");
			importDefs.append("import org.dmd.dmp.shared.generated.dmo.EventDMO;\n");
			importDefs.append("import org.dmd.dmp.shared.generated.enums.EventTypeEnum;\n");

			additionalInterfaces = " implements ServerEventHandlerIF";
			handleServerEventFunction.append("    public void handleServerEvent(EventDMO event) {\n");
			boolean first = true;

			while(events.hasNext()){
				MvcServerEvent event = events.next();
				
				if (first){
					handleServerEventFunction.append("        if (event.getObjClass().equals(\"" + event.getObjClass() + "\"))\n");
					handleServerEventFunction.append("            handle" + event.getCamelCaseName() + "(event.getEventType(),(" + event.getDMOClass() + ")event.getEventObject());\n");
					first = false;
				}
				else{
					handleServerEventFunction.append("        else if (event.getObjClass().equals(\"" + event.getObjClass() + "\"))\n");
					handleServerEventFunction.append("            handle" + event.getCamelCaseName() + "(event.getEventType(),(" + event.getDMOClass() + ")event.getEventObject());\n");
				}
				
				serverEventHandlers.append(event.getAbstractFunction());
				importDefs.append("import " + event.getEventDataType() + ";\n");

			}
			
			handleServerEventFunction.append("    }\n\n");
		}
	}
	
	public boolean usesServerEvents(){
		if (haveServerEvents == null){
			if (getHandlesServerEvent() == null)
				haveServerEvents = new Boolean(false);
			else
				haveServerEvents = new Boolean(true);
		}
		return(haveServerEvents);
	}
	
	public boolean definesMenusOrActions(){
		if (getDefinesAction() != null)
			return(true);
		if (getDefinesMenu() != null)
			return(true);
		if (getDefinesMenuItem() != null)
			return(true);
		
		return(false);
	}
	
	public String getAdditionalInterfaces(){
		return(additionalInterfaces);
	}
	
	public String getHandleServerEventFunction(){
		return(handleServerEventFunction.toString());
	}
	
	public String getServerEventHandlers(){
		return(serverEventHandlers.toString());
	}
	
	
	
	public String getExtendedImportDef(){
		if (extendedImport == null){
			extendedImport = getDefinedInMVCConfig().getGenPackage() + ".extended." + getName();
		}
		return(extendedImport);
	}
	
	/**
	 * Initializes the allEvents tree.
	 */
	void initAllEvents(){
		TreeMap<String,MvcEvent> uniqueDispatched = new TreeMap<String, MvcEvent>();
		
		// We gather all of the events that we handle or dispatch and any events that our
		// views want to handle or dispatch
		Iterator<MvcEvent> events = getHandlesEvent();
		if (events != null){
			while(events.hasNext()){
				MvcEvent event = events.next();
				allEvents.put(event.getName(), event);
				addUsingEvent(event);
				if (event.getUserDataType() != null)
					uniqueResourceImports.put(event.getUserDataType(), event.getUserDataType());
				if (event.getUserDataCollection() != null)
					uniqueResourceImports.put(event.getUserDataCollection(), event.getUserDataCollection());
			}
		}
		
		events = getDispatchesEvent();
		if (events != null){
			while(events.hasNext()){
				MvcEvent event = events.next();
				allEvents.put(event.getName(), event);
				// But we don't call addUsingEvent() because we're just dispatching it
				if (event.getUserDataType() != null)
					uniqueResourceImports.put(event.getUserDataType(), event.getUserDataType());
				if (event.getUserDataCollection() != null)
					uniqueResourceImports.put(event.getUserDataCollection(), event.getUserDataCollection());
				
				uniqueDispatched.put(event.getName(), event);
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

				viewEvents = view.getDispatchesEvent();
				if (viewEvents != null){
					while(viewEvents.hasNext()){
						MvcEvent event = viewEvents.next();
						allEvents.put(event.getName(), event);
						// But we don't call addUsingEvent() because we're just dispatching it
						uniqueDispatched.put(event.getName(), event);
					}
				}
			}
		}
		
		// For each unique event we dispatch, grab the dispatch function
		for(MvcEvent event : uniqueDispatched.values()){
			eventDispatchers.append(event.getDispatchFunction());
		}
	}
		
	/**
	 * Initializes the resourceAccessFunction and uniqueResourceImports
	 */
	void initResourceAccessFunctions(){
		Iterator<MvcRegistryItem> items = getUsesRegistryItem();
		if (items != null){
			while(items.hasNext()){
				MvcRegistryItem item = items.next();
				
				resourceAccessFunctions.append(item.getAccessFunction());
				
				uniqueResourceImports.put(item.getUserDataType(), item.getUserDataType());
				
				if (localVariables.length() == 0){
					localVariables.append("    // Resources\n");
				}
				
				localVariables.append("    protected " + item.getItemType() + " " + item.getVariableName() + ";\n");
			}
		}
		
		items = getCreatesRegistryItem();
		if (items != null){
			while(items.hasNext()){
				MvcRegistryItem item = items.next();
								
				resourceAccessFunctions.append(item.getAccessFunction());
				resourceAccessFunctions.append(item.getRegisterFunction());
				
				uniqueResourceImports.put(item.getUserDataType(), item.getUserDataType());
				
				if (localVariables.length() == 0)
					localVariables.append("    // Resources\n");
				localVariables.append("    protected " + item.getItemType() + " " + item.getVariableName() + ";\n");
			}
		}
		
		if (allEvents.size() > 0)
			localVariables.append("\n    // Events\n");
		
		for(MvcEvent event : allEvents.values()){
			localVariables.append("    public EventType " + event.getCamelCaseName() + ";\n");
		}

	}
	
	void initImportDefs(){
		importDefs.append("import com.extjs.gxt.ui.client.mvc.Controller;\n");
		
		if (eventDispatchers.length() > 0)
			importDefs.append("import com.extjs.gxt.ui.client.mvc.Dispatcher;\n");
		
		if (allEvents.size() > 0){
			importDefs.append("import com.extjs.gxt.ui.client.mvc.AppEvent;\n");
			importDefs.append("import com.extjs.gxt.ui.client.event.EventType;\n");
		}
			
		if (resourceAccessFunctions.length() > 0)
			importDefs.append("import com.extjs.gxt.ui.client.Registry;\n");
		
		if (definesMenusOrActions()){			
			Iterator<MvcAction> actions = getDefinesAction();
			if (actions != null){
				while(actions.hasNext()){
					MvcAction action = actions.next();
					uniqueResourceImports.put(action.getImportClass(), action.getImportClass());
				}
			}
			
			Iterator<MvcMenu> menus = getDefinesMenu();
			if (menus != null){
				while(menus.hasNext()){
					MvcMenu menu = menus.next();
					
					if (menu.getCustomRender()){
						
					}
					else{
						uniqueResourceImports.put(menu.getDefaultImport(), menu.getDefaultImport());
					}
				}
			}
			
			Iterator<MvcMenuItem> menuItems = getDefinesMenuItem();
			if (menuItems != null){
				while(menuItems.hasNext()){
					MvcMenuItem mi = menuItems.next();
					if (mi.getCustomRender()){
						
					}
					else{
						uniqueResourceImports.put(mi.getDefaultImport(),mi.getDefaultImport());
					}
				}
			}
			
			

		}
		
		for(String s : uniqueResourceImports.values()){
			importDefs.append("import " + s + ";\n");
		}

	}
	
	void initLocalVariables(){
		Iterator<MvcView> views = getControlsView();
		if (views != null){
			localVariables.append("\n    // View(s)\n");
			while(views.hasNext()){
				MvcView view = views.next();
					
				localVariables.append("    protected " + view.getName() + " " + view.getVariableName() + ";\n");
				
				importDefs.append("import " + view.getDefinedInMVCConfig().getGenPackage() + ".extended." + view.getName() + ";\n");
			}
		}
		
		if (definesMenusOrActions()){
			Iterator<MvcAction> actions = getDefinesAction();
			if (actions != null){
				localVariables.append("\n    // Action(s)\n");
				while(actions.hasNext()){
					MvcAction action = actions.next();
					localVariables.append("    protected " + action.getCamelCaseName() + " " + action.getVariableName() + ";\n");

				}
			}
			
			Iterator<MvcMenu> menus = getDefinesMenu();
			if (menus != null){
				localVariables.append("\n    // Menus\n");
				while(menus.hasNext()){
					MvcMenu menu = menus.next();
					
					if (menu.getCustomRender()){
						
					}
					else{
						localVariables.append("    protected " + menu.getDefaultClass() + " " + menu.getVariableName() + ";\n");
					}
				}
			}
			
			Iterator<MvcMenuItem> menuItems = getDefinesMenuItem();
			if (menuItems != null){
				localVariables.append("\n    // Menu items\n");
				while(menuItems.hasNext()){
					MvcMenuItem menuItem = menuItems.next();
					
					if (menuItem.getCustomRender()){
						
					}
					else{
						localVariables.append("    protected " + menuItem.getDefaultClass() + " " + menuItem.getVariableName() + ";\n");

//						localVariables.append(menuItem.getInstantiation());
					}
				}
			}

		}
	}
	
	void initHandleEventFunction(){
		boolean first = true;
		
        handleEventFunction.append("    public void handleEvent(AppEvent event) {\n");
        handleEventFunction.append("        EventType type = event.getType();\n");
        
		String prefix = "if";
		for(WhoIsUsingEvent who : eventHandlers.values()){
			handleEventFunction.append("        " + prefix + " (type == " + who.event.getCamelCaseName() + ") {\n");
			if (who.controllerUsing){
				handleEventFunction.append(who.event.getHandleLocalFunctionCall());
				
				if (who.event.getName().equals("mvc.init.eventFramework")){
					// If this is the init event for the server event framework, we actually insert
					// a real function here, not an abstract
					controllerEventHandlers.append("    /**\n");
					controllerEventHandlers.append("     * When we receive this event, we add ourselves to handle various server events.\n");
					controllerEventHandlers.append("     */\n");
					controllerEventHandlers.append("    protected void handleMvcInitEventFrameworkEvent(AppEvent event){\n");
					Iterator<MvcServerEvent> sevents = getHandlesServerEvent();
					while(sevents.hasNext()){
						MvcServerEvent se = sevents.next();
						controllerEventHandlers.append("        getMvcServerEventController().addEventHandler(this,\"" + se.getObjClass() + "\");\n");
					}
					controllerEventHandlers.append("    }\n\n");
				}
				else if (who.event.getName().equals("mvc.registerMenus")){
					// If this is the registerMenus event for the menu controller framework, we actually insert
					// a real function here, not an abstract
					controllerEventHandlers.append("    /**\n");
					controllerEventHandlers.append("     * When we receive this event, we add our menus, items and actions\n");
					controllerEventHandlers.append("     * to the menu controller.\n");
					controllerEventHandlers.append("     */\n");
					controllerEventHandlers.append("    protected void handleMvcRegisterMenusEvent(AppEvent event, MenuController mc){\n");
					Iterator<MvcAction> actions = getDefinesAction();
					if (actions != null){
						while(actions.hasNext()){
							MvcAction action = actions.next();
							controllerEventHandlers.append("        mc.addAction(" + action.getVariableName() + ");\n");
						}
					}
					
					Iterator<MvcMenu> menus = getDefinesMenu();
					if (menus != null){
						while(menus.hasNext()){
							MvcMenu menu = menus.next();
							controllerEventHandlers.append("        mc.addMenu(" + menu.getVariableName() + ");\n");
						}
					}
					
					Iterator<MvcMenuItem> menuItems = getDefinesMenuItem();
					if (menuItems != null){
						while(menuItems.hasNext()){
							MvcMenuItem menuItem = menuItems.next();
							controllerEventHandlers.append("        mc.addMenuItem(" + menuItem.getVariableName() + ");\n");
						}
					}
										
					controllerEventHandlers.append("    }\n\n");
				}

				else{
					// Add an abstract definition of the function that will handle the event
					controllerEventHandlers.append(who.event.getAbstractFunction() + "\n");
				}

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
	
	public String getClassComments(){
		return(classComments.toString());
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
	 * @return The complete set of events handled by this controller or any of the views
	 * it controls.
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
	
	/**
	 * @return Functions to dispatch our various events.
	 */
	public String getEventDispatchFunctions(){
		return(eventDispatchers.toString());
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

