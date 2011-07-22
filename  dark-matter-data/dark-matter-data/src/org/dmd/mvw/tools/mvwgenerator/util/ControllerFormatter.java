package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Controller;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;

public class ControllerFormatter {

	static public void formatControllerBaseImpl(String outdir, Controller controller) throws IOException {
		
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, controller.getControllerName() + "BaseImpl.java");

        out.write("package " + controller.getDefinedInModule().getGenPackage() + ".generated.mvw.controllers;\n\n");
        
        out.write(controller.getImports());
        
        out.write("\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("abstract public class " + controller.getControllerName() + "BaseImpl " + controller.getControllerInterfaces() + "{\n\n");
        
    	boolean onDemand = false;
    	for(RunContextItem rci: controller.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariable());
    		if (rci.isCreateOnDemand())
    			onDemand = true;
    	}
    	
    	if (onDemand){
        	out.write("\n");
        	out.write("    MvwRunContextIF runcontext;\n");
    	}
    	
    	out.write("\n");
    	
    	out.write(controller.getCommsConstants());
    	
    	if (controller.getImplementsActionHasValue()){
    		out.write(controller.getActionVariables() + "\n");
    	}
    	
    	///////////////////////////////////////////////////////////////////////
    	// Constructor
    	
    	if (controller.usesRunContext())
    		out.write("    public " + controller.getControllerName() + "BaseImpl(MvwRunContextIF rc){\n");
    	else
    		out.write("    public " + controller.getControllerName() + "BaseImpl(){\n");
    	
    	for(RunContextItem rci: controller.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariableAssignment());
    	}
    	
    	if (controller.usesRunContext() && onDemand){
        	out.write("\n");
        	out.write("        runcontext = rc;\n");
    	}
    		
    	out.write("\n" + controller.getAttributeSchemaLoaders() + "\n");
    	
    	out.write(controller.getEventRegistration() + "\n");

    	if (controller.getImplementsActionHasValue()){
    		out.write(controller.getActionInstantiations() + "\n");
    	}
    	
        out.write("    }\n\n");
        
    	///////////////////////////////////////////////////////////////////////
        
        // On demand accessors
    	for(RunContextItem rci: controller.getUsesRunContextItemIterable()){
    		out.write(rci.getOnDemandMethod());
    	}
    	
    	// Fire event methods
    	out.write(controller.getFireMethods());
    	
    	// Communications methods
    	out.write(controller.getCommsMethods());
    	
        out.write(controller.getAbstractMethods());
        
        out.write("}\n\n");
        
        out.close();
	}
}
