package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.extended.Event;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.PrintfFormat;

/**
 * The GwtEventFormatter takes MvwEvent objects and generates GWT compatible
 * GwtEvent classes and their associated EventHandler interface.
 */
public class GwtEventFormatter {
	
	static String 				args;
	static ArrayList<String>	types;
	static ArrayList<String>	members;
	static int					longestType;

	public GwtEventFormatter(){
		
	}
	
	static public void formatEvent(String outdir, Event event) throws IOException, ResultException {
        
		args 		= "()";
		types 		= new ArrayList<String>();
		members 	= new ArrayList<String>();
		longestType	= 0;
		
		// If this event doesn't require GwtEvent, just return.
		if (!event.needGwtEvent())
			return;
		
		if (event.getArgVector() != null)
			getMemberVariables(event.getArgVector(),event);
		
        dumpEvent(outdir,event);
        
        dumpHandler(outdir,event);

	}
	
	static void getMemberVariables(String argVector, Event event){
		if (argVector.equals("()"))
			return;
		
//		String t1 = argVector.substring(1,argVector.length()-1);
//		
//		String[] terms = t1.split(",");
//		for(int i=0; i<terms.length; i++){
//			if (terms[i].length() == 0)
//				continue;
//			int spacepos = terms[i].indexOf(" ");
//			if (spacepos == -1)
//				throw(new IllegalStateException("Invalid argument vector: " + argVector + "\nWhile formatting event:\n\n" + event.toOIF()));
//			String type = terms[i].substring(0, spacepos);
//			String member = terms[i].substring(spacepos+1);
//			
//			DebugInfo.debug(type + " - " + member);
//			types.add(type);
//			members.add(member);
//			
//			if (type.length() > longestType)
//				longestType = type.length();
//		}
		types 		= event.getTypes();
		members 	= event.getMembers();
		longestType = event.getLongestType();
		
		StringBuffer av = new StringBuffer();
		for(int i=0; i<types.size(); i++){
			int argcount = i+1;
			if (i > 0)
				av.append(", ");
			av.append(types.get(i) + " arg" + argcount);
		}
		
		args = "(" + av.toString() + ")";
	}
	
	private static void dumpEvent(String outdir, Event event)  throws IOException {
		String capped 		= GenUtility.capTheName(event.getEventName().getNameString());
		String eventName 	= capped;
		String handlerName 	= capped + "Handler";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, eventName + ".java");
        
		int 			padding = longestType+2;
		PrintfFormat 	format 	= new PrintfFormat("%-" + padding + "s");

		ImportManager.resetStatic();
        ImportManager.addImportStatic("com.google.gwt.event.shared.GwtEvent", "The base event type");
        
        if (event.getImportThisHasValue()){
        	for(String imp: event.getImportThisIterable()){
        		ImportManager.addImportStatic(imp, "Required type");
        	}
        }
        
        out.write("package " + event.getDefinedInModule().getGenPackage() + ".generated.mvw.events;\n\n");
		
        out.write(ImportManager.getFormattedImportsStatic() + "\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + eventName + " extends GwtEvent<" + handlerName + "> {\n\n");
        
        if (types.size() > 0){
        	for(int i=0; i<types.size(); i++){
        		out.write("    " + format.sprintf(types.get(i)) + " " + members.get(i) + ";\n");
        	}
        	out.write("\n");
        }
        
        out.write("    public static Type<" + handlerName + "> TYPE = new Type<" + handlerName + ">();\n\n");
        
        out.write("    public " + eventName + args + " {\n");
        if (members.size() > 0){
			for(int i=0; i<members.size(); i++){
				int argcount = i+1;
				out.write("        " + members.get(i) + " = arg" + argcount + ";\n");
			}
        }
        out.write("    }\n\n");  
        
        if (members.size() > 0){
			for(int i=0; i<members.size(); i++){
	        	String upper = GenUtility.capTheName(members.get(i));
				out.write("    public " + types.get(i) + " get" + upper + "(){\n");
				out.write("        return(" + members.get(i) + ");\n");
				out.write("    }\n");
				out.write("\n");
			}
        }
        
        out.write("    @Override\n");
        out.write("    public Type<" + handlerName + "> getAssociatedType() {\n");
        out.write("        return TYPE;\n");
        out.write("    }\n\n");
        
        out.write("    @Override\n");
        out.write("    protected void dispatch(" + handlerName + " handler) {\n");
        out.write("        handler.handle" + capped + "(this);\n");
        out.write("    }\n\n");
        
        out.write("}\n");
        
        out.close();
	}
	
	private static void dumpHandler(String outdir, Event event)  throws IOException {
		String capped = GenUtility.capTheName(event.getEventName().getNameString());
		String eventName 	= capped;
		String handlerName 	= capped + "Handler";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, handlerName + ".java");
        
        ImportManager.resetStatic();
        ImportManager.addImportStatic("com.google.gwt.event.shared.EventHandler", "The marker interface");
        
        out.write("package " + event.getDefinedInModule().getGenPackage() + ".generated.mvw.events;\n\n");
		
        out.write(ImportManager.getFormattedImportsStatic() + "\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public interface " + handlerName + " extends EventHandler {\n\n");
        
        out.write("    void handle" + capped + "(" + eventName + " event);\n\n");
		
        out.write("}\n");
        
        out.close();
		
	}
	
}
