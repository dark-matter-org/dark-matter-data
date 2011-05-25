package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Controller;
import org.dmd.util.FileUpdateManager;

public class ControllerFormatter extends ComponentFormatter {

	static public void formatControllerBaseImpl(String outdir, Controller controller) throws IOException {
		
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, controller.getControllerName() + "BaseImpl.java");

        out.write("package " + controller.getDefinedInModule().getGenPackage() + ".generated.mvw.controllers;\n\n");
        
        out.write(controller.getImports());
        
        out.write("\n");
        
        out.write("public class " + controller.getControllerName() + "BaseImpl" + controller.getPresenterInterfaces() + " {");
        
        
        out.write("}\n\n");
        
        out.close();
	}
}
