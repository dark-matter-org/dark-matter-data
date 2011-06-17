package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Activity;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.util.FileUpdateManager;

public class ActivityFormatter {

	public static void formatActivity(String outdir, Activity activity) throws IOException {
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, activity.getActivityName() + "BaseImpl.java");

        out.write("package " + activity.getDefinedInModule().getGenPackage() + ".generated.mvw.activities;\n\n");
        
        out.write(activity.getImports());
        
        out.write("\n");
        
        out.write("abstract public class " + activity.getActivityName() + "BaseImpl" + activity.getBaseClassName() + activity.getInterfaces() + "{\n\n");

    	for(RunContextItem rci: activity.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariable());
    	}
    	out.write("\n");
    	
    	out.write(activity.getCommsContants());

    	out.write("    public " + activity.getActivityName() + "BaseImpl(MvwRunContextIF rc){\n");

    	for(RunContextItem rci: activity.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariableAssignment());
    	}

        out.write("    }\n\n");
        
        out.write(activity.getCommsMethods());
        
        out.write(activity.getAbstractMethods());

    	out.write("}\n\n");

        out.close();
	}
}
