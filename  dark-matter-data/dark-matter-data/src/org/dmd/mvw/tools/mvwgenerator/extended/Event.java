package org.dmd.mvw.tools.mvwgenerator.extended;

import java.util.ArrayList;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.EventDMW;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.ResultException;

public class Event extends EventDMW {
		
	int							longestType;
	ArrayList<String>			types;
	ArrayList<String>			members;

	ArrayList<View>				local;
	
	ArrayList<MvwDefinition>	firedBy;
	
	ArrayList<MvwDefinition>	handledBy;
	
	StringBuffer				registerForEvent;
	
	StringBuffer				abstractMethod;
	
	ImportManager				imports;

	public Event(){
		
	}
	
	void initCodeGenInfo(){
		if (types == null){
			types 				= new ArrayList<String>();
			members 			= new ArrayList<String>();
			registerForEvent 	= new StringBuffer();
			abstractMethod		= new StringBuffer();
			imports				= new ImportManager();
			
	        if (getImportThisHasValue()){
	        	for(String imp: getImportThisIterable()){
	        		imports.addImport(imp, "Required type");
	        	}
	        }
	        
//	        DebugInfo.debug("");

			if (!getArgVector().equals("()")){
				String t1 = getArgVector().substring(1,getArgVector().length()-1);
				
				String[] terms = t1.split(",");
				for(int i=0; i<terms.length; i++){
					if (terms[i].length() == 0)
						continue;
					
					String currentTerm = terms[i].trim();
					
//					DebugInfo.debug("term   = " + currentTerm);
					
					int spacepos = currentTerm.indexOf(" ");
					if (spacepos == -1)
						throw(new IllegalStateException("Invalid argument vector: " + getArgVector() + "\nWhile formatting event:\n\n" + this.toOIF()));
					
//					DebugInfo.debug("space  = " + spacepos);
					String type   = currentTerm.substring(0, spacepos);
					String member = currentTerm.substring(spacepos+1);
					
//					DebugInfo.debug("type   = " + type);
//					DebugInfo.debug("member = " + member);
					
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
			
			String capped = GenUtility.capTheName(getEventName().getNameString());
			registerForEvent.append("        eventBus.addHandler(" + capped + ".TYPE,\n");
			registerForEvent.append("            new " + capped + "Handler() {\n");
			registerForEvent.append("                public void handle" + capped + "(" + capped + " event) {\n");
			registerForEvent.append("                    on" + capped + "(" + getValuesFromEvent() + ");\n");
			registerForEvent.append("                }\n");
			registerForEvent.append("            });\n\n");
			
			abstractMethod.append("    abstract protected void on" + capped + "(");
			if (types.size() > 0){
				boolean first = true;
				for(int i=0; i<types.size(); i++){
					if (first)
						first = false;
					else
						abstractMethod.append(", ");
					capped = GenUtility.capTheName(members.get(i));
					abstractMethod.append(types.get(i) + " " + capped);
				}
			}
			abstractMethod.append(");\n\n");
			
		}
	}
	
	/**
	 * Adds the import statement for this event to the import manager
	 * @param im
	 */
	public void addImport(ImportManager im){
		im.addImport(getDefinedInModule().getGenPackage() + ".generated.mvw.events." + getEventName(), "Required by " + getEventName());
		im.addImport(getDefinedInModule().getGenPackage() + ".generated.mvw.events." + getEventName() + "Handler", "Required by " + getEventName());
	}
	
	public void addEventHandlerImports(ImportManager im){
		initCodeGenInfo();
		im.addImportsFrom(imports);
		im.addImport(getDefinedInModule().getGenPackage() + ".generated.mvw.events." + getEventName(), "Required by " + getEventName());
		im.addImport(getDefinedInModule().getGenPackage() + ".generated.mvw.events." + getEventName() + "Handler", "Required by " + getEventName());
	}
	
	public String getAbstractMethod(){
		initCodeGenInfo();
		return(abstractMethod.toString());
	}
	
	public String getRegisterForEvent(){
		initCodeGenInfo();
		return(registerForEvent.toString());
	}
	
	String getValuesFromEvent(){
		StringBuffer sb = new StringBuffer();
		if (types.size() > 0){
			boolean first = true;
			for(String val: members){
				if (first)
					first = false;
				else
					sb.append(", ");
				String capped = GenUtility.capTheName(val);
				sb.append("event.get" + capped + "()");
			}
		}
		return(sb.toString());
	}
	
	public ArrayList<String> getTypes(){
		initCodeGenInfo();
		return(types);
	}
	
	public ArrayList<String> getMembers(){
		initCodeGenInfo();
		return(members);
	}
	
	public int getLongestType(){
		initCodeGenInfo();
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
	
	public void handledBy(MvwDefinition d){
		if (handledBy == null)
			handledBy = new ArrayList<MvwDefinition>();
		handledBy.add(d);
	}
	
	/**
	 * Based on local, firedBy and handledBy, we to see if everything is kosher.
	 * @throws ResultException  
	 */
	public void checkSanity() throws ResultException {
		if (handledBy != null){
			if (firedBy == null){
				ResultException ex = new ResultException();
				ex.addError("The " + getEventName() + " is handled by the following components, but is never fired or broadcast:");
				for(MvwDefinition def: handledBy){
					ex.result.lastResult().moreMessages(def.getConstructionClassName() + ":" + def.getObjectName() + " defined in: " + def.getFile());
				}
				if (local != null){
					ex.result.lastResult().moreMessages(" ");
					ex.result.lastResult().moreMessages("The event is fired locally by View:");
					for(View view: local){
						ex.result.lastResult().moreMessages(view.getViewName() + " defined in: " + view.getFile());
					}
				}
				throw(ex);
			}
		}
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
		initCodeGenInfo();
		
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
		initCodeGenInfo();
		
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
		initCodeGenInfo();
		
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
	
	
	public String getFireMethod(){
		initCodeGenInfo();
		
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