package org.dmd.features.extgwt.extended;

import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcObject;
import org.dmd.features.extgwt.generated.dmw.MvcViewDMW;

public class MvcView extends MvcViewDMW {

	// The import statements we need
	StringBuffer					importDefs;
	
	// The local variables we need - this is for views and resources
	StringBuffer					localVariables;
	
	// The abstract event handlers for all events we handle
	StringBuffer					eventHandlers;
	
	// The functions that grab resources from the registry
	StringBuffer					resourceAccessFunctions;
	
	// We may have many resources of the same type, this hash maintains the unique set of
	// imports we require (without duplicates).
	TreeMap<String,String>			uniqueResourceImports;
	

	// By convention, our name starts with a capital e.g. AppView
	// but this is the same name with the first character in lowercase
	String variableName;
	
	public MvcView(){
		super();
	}
	
	public MvcView(DmcObject obj){
		super(obj);
	}
	
	public void initCodeGenInfo(){
		if (importDefs == null){
			importDefs 				= new StringBuffer();
			localVariables 			= new StringBuffer();
			eventHandlers 			= new StringBuffer();
			resourceAccessFunctions = new StringBuffer();
			uniqueResourceImports 	= new TreeMap<String, String>();
			
			initEventHandlers();
			
			initResourceAccessFunctions();
			
			initImportDefs();
		}
	}
	
	public String getImportDefs(){
		return(importDefs.toString());
	}
	
	public String getLocalVariables(){
		return(localVariables.toString());
	}
	
	public String getEventHandlers(){
		return(eventHandlers.toString());
	}
	
	public String getResourceAccessFunctions(){
		return(resourceAccessFunctions.toString());
	}
	
	/**
	 * Initializes the event handle functions.
	 */
	void initEventHandlers(){
		// We gather all of the events that we handle and any events that our
		// views want to handle
		Iterator<MvcEvent> events = getHandlesEvent();
		if (events != null){
			while(events.hasNext()){
				MvcEvent event = events.next();
				eventHandlers.append("    abstract protected void handle" + event.getCamelCaseName() + "(AppEvent event);\n\n");
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
		importDefs.append("import com.extjs.gxt.ui.client.mvc.View;\n");
		
		if (eventHandlers.length() > 0){
			importDefs.append("import com.extjs.gxt.ui.client.mvc.AppEvent;\n");
		}
			
		if (resourceAccessFunctions.length() > 0)
			importDefs.append("import com.extjs.gxt.ui.client.Registry;\n");
		
		for(String s : uniqueResourceImports.values()){
			importDefs.append("import " + s + ";\n");
		}

	}
	

	/**
	 * Returns the variable name used for this view in the controller.
	 * @return
	 */
	public String getVariableName(){
		if (variableName == null){
			StringBuffer sb = new StringBuffer(getName());
			sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
			variableName = sb.toString();
		}
		return(variableName);
	}
	
	/**
	 * For each of the events we handle, we define an abstract event handler.
	 * @return
	 */
	public String getEventHandlerFunctions(){
		StringBuffer sb = new StringBuffer();
		
		Iterator<MvcEvent> events = getHandlesEvent();
		if (events != null){
			while(events.hasNext()){
				MvcEvent event = events.next();
				sb.append("    abstract void handle" + event.getCamelCaseName() + "(AppEvent event);\n\n");
			}
		}
		
		return(sb.toString());
	}
}
