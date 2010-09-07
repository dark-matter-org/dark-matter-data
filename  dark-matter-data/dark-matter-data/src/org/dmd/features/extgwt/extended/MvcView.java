package org.dmd.features.extgwt.extended;

import java.util.Iterator;

import org.dmd.dmc.DmcObject;
import org.dmd.features.extgwt.generated.dmw.MvcViewDMW;

public class MvcView extends MvcViewDMW {

	// By convention, our name starts with a capital e.g. AppView
	// but this is the same name with the first character in lowercase
	String variableName;
	
	public MvcView(){
		super();
	}
	
	public MvcView(DmcObject obj){
		super(obj);
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
