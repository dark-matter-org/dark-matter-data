package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.extended.Component;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.ActionBinding;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;


public class ActionBindingFormatter {

	static public void formatAction(String outdir, ActionBinding action, Component component) throws IOException {
		
		String name = GenUtility.capTheName(action.getActionBindingName().getNameString());
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, name + "Action.java");

        out.write("package " + component.getDefinedInModule().getGenPackage() + ".generated.mvw.actions;\n\n");
        
        out.write(action.getImports());
        
        out.write("\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + name + "Action extends Action {\n\n");
        
        out.write("    " + action.getImplementedBy().getComponentName() + "BaseImpl component;\n\n");
            	
    	///////////////////////////////////////////////////////////////////////
    	// Constructor
    	
    	out.write("    public " + name + "Action(" + action.getImplementedBy().getComponentName() + "BaseImpl ic){\n\n");
    	
        out.write("        super(\"" + action.getActionBindingName() + "\");\n\n");
        out.write("        component = ic;\n\n");
        
        out.write("    }\n\n");
        
        out.write("    @Override\n");
        out.write("    public void execute(TriggerIF ti, Object widgetEvent) {\n");
        out.write("        component.execute" + name + "(ti,widgetEvent);\n");
        out.write("    }\n\n");
        
        out.write("}\n\n");
        out.close();
	}
}
