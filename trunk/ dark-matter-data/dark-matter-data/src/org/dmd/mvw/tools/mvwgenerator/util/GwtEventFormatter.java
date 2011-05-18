package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.MvwEvent;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.dms.util.GenUtility;

/**
 * The GwtEventFormatter takes MvwEvent objects and generates GWT compatible
 * GwtEvent classes and their associated EventHandler interface.
 */
public class GwtEventFormatter {

	public GwtEventFormatter(){
		
	}
	
	static public void formatEvent(String outdir, MvwEvent event) throws IOException{
        
        dumpEvent(outdir,event);
        
        dumpHandler(outdir,event);

	}
	
	static void dumpEvent(String outdir, MvwEvent event)  throws IOException {
		String capped 		= GenUtility.capTheName(event.getEventName().getNameString());
		String eventName 	= capped;
		String handlerName 	= capped + "Handler";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, eventName + ".java");
        
        ImportManager.reset();
        ImportManager.addImport("com.google.gwt.event.shared.GwtEvent", "The base event type");
        
        out.write("package " + event.getDefinedInModule().getGenPackage() + ".generated.mvw.events;\n\n");
		
        out.write(ImportManager.getFormattedImports() + "\n");
        
        out.write("public class " + eventName + " extends GwtEvent<" + handlerName + "> {\n\n");
        
        out.write("  public static Type<" + handlerName + "> TYPE = new Type<" + handlerName + ">();\n\n");
        
        out.write("  @Override\n");
        out.write("  public Type<" + handlerName + "> getAssociatedType() {\n");
        out.write("    return TYPE;\n");
        out.write("  }\n\n");
        
        out.write("  @Override\n");
        out.write("  protected void dispatch(" + handlerName + " handler) {\n");
        out.write("    handler.on" + capped + "(this);\n");
        out.write("  }\n\n");
        
        out.write("}\n");
        
        out.close();
	}
	
	static void dumpHandler(String outdir, MvwEvent event)  throws IOException {
		String capped = GenUtility.capTheName(event.getEventName().getNameString());
		String eventName 	= capped;
		String handlerName 	= capped + "Handler";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, handlerName + ".java");
        
        ImportManager.reset();
        ImportManager.addImport("com.google.gwt.event.shared.EventHandler", "The marker interface");
        
        out.write("package " + event.getDefinedInModule().getGenPackage() + ".generated.mvw.events;\n\n");
		
        out.write(ImportManager.getFormattedImports() + "\n");
        
        out.write("public interface " + handlerName + " extends EventHandler {\n\n");
        
        out.write("  void on" + capped + "( " + eventName + " event);\n\n");
		
        out.write("}\n");
        
        out.close();
		
	}
	
}
