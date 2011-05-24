package org.dmd.mvw.tools.mvwgenerator.extended;

import java.util.ArrayList;

import org.dmd.mvw.tools.mvwgenerator.generated.dmw.EventDMW;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.ResultException;

public class Event extends EventDMW {
	
	ArrayList<View>				local;
	
	ArrayList<MvwDefinition>	firedBy;
	
	ArrayList<MvwDefinition>	handledBy;

	public Event(){
		
	}
	
	public void firedLocally(View v){
		if (local == null)
			local = new ArrayList<View>();
		local.add(v);
	}
	
	public void firedBy(MvwDefinition d){
		if (firedBy == null)
			firedBy = new ArrayList<MvwDefinition>();
		firedBy.add(d);
	}
	
	public void handledHandled(MvwDefinition d){
		if (handledBy == null)
			handledBy = new ArrayList<MvwDefinition>();
		handledBy.add(d);
	}
	
	/**
	 * Adds the import statement for this event to the import manager
	 * @param im
	 */
	public void addImport(ImportManager im){
		im.addImport(getDefinedInModule().getGenPackage() + ".generated.events." + getEventName(), "Required by " + getEventName());
	}
	
	/**
	 * A GwtEvent is only required if the event is destined for the EventBus i.e. if
	 * anyone is firing or handling the event. If an event is only used locally, we
	 * don't bother generating the GwtEvent.
	 * @return true the event is fired or handled by any component.
	 * @throws ResultException if the event is handled but never fired.
	 */
	public boolean needGwtEvent() throws ResultException{
		if ( (handledBy != null) && (firedBy == null)){
			// Someone wants to handle this event, but it isn't fired by anyone
			StringBuffer sb = new StringBuffer();
			for(MvwDefinition def: handledBy){
				sb.append(def.getObjectName() + " ");
			}
			ResultException ex = new ResultException();
			ex.addError("The " + getEventName() + " is handled by: " + sb.toString() + " but is never fired.");
			throw(ex);
		}
		if ( (firedBy != null) || (handledBy != null))
			return(true);
		return(false);
	}
	
}