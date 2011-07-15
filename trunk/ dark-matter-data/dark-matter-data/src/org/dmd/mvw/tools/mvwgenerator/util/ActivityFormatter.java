package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Activity;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;

public class ActivityFormatter {

	public static void formatActivity(String outdir, Activity activity) throws IOException {
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, activity.getActivityName() + "BaseImpl.java");

        out.write("package " + activity.getDefinedInModule().getGenPackage() + ".generated.mvw.activities;\n\n");
        
        out.write(activity.getImports());
        
        out.write("\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("abstract public class " + activity.getActivityName() + "BaseImpl" + activity.getBaseClassName() + activity.getInterfaces() + "{\n\n");

    	boolean onDemand = false;
    	for(RunContextItem rci: activity.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariable());
    		if (rci.isCreateOnDemand())
    			onDemand = true;
    	}
    	
    	if (onDemand){
        	out.write("\n");
        	out.write("    MvwRunContextIF runcontext;\n");
    	}

    	out.write("\n");
    	
    	out.write(activity.getCommsConstants());

//    	if (activity.getImplementsActionHasValue()){
//    		out.write(activity.getActionVariables() + "\n");
//    	}
    	
    	///////////////////////////////////////////////////////////////////////
    	// Constructor

    	out.write("    public " + activity.getActivityName() + "BaseImpl(MvwRunContextIF rc){\n");

    	for(RunContextItem rci: activity.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariableAssignment());
    	}

    	if (onDemand){
        	out.write("\n");
        	out.write("        runcontext = rc;\n");
    	}

//    	if (activity.getImplementsActionHasValue()){
//    		out.write(activity.getActionInstantiations() + "\n");
//    	}
    	
    	out.write("    }\n\n");
        
    	///////////////////////////////////////////////////////////////////////

        // On demand accessors
    	for(RunContextItem rci: activity.getUsesRunContextItemIterable()){
    		out.write(rci.getOnDemandMethod());
    	}
    	
    	// Fire event methods
    	out.write(activity.getFireMethods());
    	
    	// Communications methods
        out.write(activity.getCommsMethods());
        
        out.write(activity.getAbstractMethods());

    	out.write("}\n\n");

        out.close();
	}
}
