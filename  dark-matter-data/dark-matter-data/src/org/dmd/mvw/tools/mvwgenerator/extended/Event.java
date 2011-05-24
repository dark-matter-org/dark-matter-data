package org.dmd.mvw.tools.mvwgenerator.extended;

import java.util.ArrayList;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.EventDMW;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class Event extends EventDMW {
		
	int							longestType;
	ArrayList<String>			types;
	ArrayList<String>			members;

	ArrayList<View>				local;
	
	ArrayList<MvwDefinition>	firedBy;
	
	ArrayList<MvwDefinition>	handledBy;

	public Event(){
		
	}
	
	void initTypesAndMembers(){
		if (types == null){
			types = new ArrayList<String>();
			members = new ArrayList<String>();
			
			if (getArgVector().equals("()"))
				return;
			
			String t1 = getArgVector().substring(1,getArgVector().length()-1);
			
			String[] terms = t1.split(",");
			for(int i=0; i<terms.length; i++){
				if (terms[i].length() == 0)
					continue;
				int spacepos = terms[i].indexOf(" ");
				if (spacepos == -1)
					throw(new IllegalStateException("Invalid argument vector: " + getArgVector() + "\nWhile formatting event:\n\n" + this.toOIF()));
				String type = terms[i].substring(0, spacepos);
				String member = terms[i].substring(spacepos+1);
				
				DebugInfo.debug(type + " - " + member);
				types.add(type);
				members.add(member);
				
				if (type.length() > longestType)
					longestType = type.length();
			}
			
			StringBuffer av = new StringBuffer();
			for(int i=0; i<types.size(); i++){
				int argcount = i+1;
				if (i > 0)
					av.append(", ");
				av.append(types.get(i) + " arg" + argcount);
			}
		}
	}
	
	public ArrayList<String> getTypes(){
		initTypesAndMembers();
		return(types);
	}
	
	public ArrayList<String> getMembers(){
		initTypesAndMembers();
		return(members);
	}
	
	public int getLongestType(){
		initTypesAndMembers();
		return(longestType);
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
		im.addImport(getDefinedInModule().getGenPackage() + ".generated.mvw.events." + getEventName(), "Required by " + getEventName());
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
	
	public String getViewLocalMethod(){
		initTypesAndMembers();
		
		String 			capped 	= GenUtility.capTheName(getEventName().getNameString());
		StringBuffer 	sb 		= new StringBuffer();
		
		sb.append("    protected void fire" + capped + getArgVector() + "{\n");
		sb.append("        presenter.on" + capped + "(");
		boolean first = true;
		for(String arg: members){
			if (first)
				first = false;
			else
				sb.append(", ");
			sb.append(arg);
		}
		sb.append(");\n");
		
		sb.append("    }\n\n");
		return(sb.toString());
	}
	
	public String getViewBroadcastMethod(){
		initTypesAndMembers();
		
		String 			capped 	= GenUtility.capTheName(getEventName().getNameString());
		StringBuffer 	sb 		= new StringBuffer();
		
		StringBuffer	args = new StringBuffer();
		args.append("(");
		boolean first = true;
		for(String arg: members){
			if (first)
				first = false;
			else
				args.append(", ");
			args.append(arg);
		}
		args.append(")");

		sb.append("    protected void fire" + capped + getArgVector() + "{\n");
		sb.append("        presenter.on" + capped + args.toString() + ";\n");
		sb.append("        eventBus.fireEvent(new " + capped + args.toString() + ");\n");
		sb.append("    }\n\n");
		return(sb.toString());
	}
	
	public String getViewBroadcastOnlyMethod(){
		initTypesAndMembers();
		
		String 			capped 	= GenUtility.capTheName(getEventName().getNameString());
		StringBuffer 	sb 		= new StringBuffer();
		
		StringBuffer	args = new StringBuffer();
		args.append("(");
		boolean first = true;
		for(String arg: members){
			if (first)
				first = false;
			else
				args.append(", ");
			args.append(arg);
		}
		args.append(")");

		sb.append("    protected void fire" + capped + getArgVector() + "{\n");
		sb.append("        eventBus.fireEvent(new " + capped + args.toString() + ");\n");
		sb.append("    }\n\n");
		return(sb.toString());
	}
	
}