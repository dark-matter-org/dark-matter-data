package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.extended.WebApplication;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;

public class RunContextFormatter {

	static public void formatModuleRunContextInterface(String outdir, Module module) throws IOException{
		if (module.contextItemCount() == 0)
			return;
		
		Iterator<RunContextItem> it = null;
		String interfaceName = GenUtility.capTheName(module.getModuleName().getNameString());
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, interfaceName + "RunContextIF.java");

        out.write("package " + module.getGenPackage() + ".generated.mvw;\n\n");
        
        ImportManager manager = new ImportManager();
        
        it = module.getItems();
        while(it.hasNext()){
        	RunContextItem rci = it.next();
        	rci.addInterfaceImports(manager);
        }
        out.write(manager.getFormattedImports());
        
        out.write("\n\n");
        out.write("public interface " + interfaceName + "RunContextIF {\n\n");
        
        it = module.getItems();
        while(it.hasNext()){
        	RunContextItem rci = it.next();
        	out.write(rci.getInterfaceMethod());
        }
        
        out.write("}\n\n");
        
        out.close();
	}
	
	static public void formatAppRunContextInterface(String outdir, WebApplication app, RunContextItemCollection rcic) throws IOException{
        ImportManager manager = new ImportManager();
		
        String rcName = app.getAppName() + "RunContextIF";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, rcName + ".java");

        out.write("package " + app.getDefinedInModule().getGenPackage() + ".generated.mvw;\n\n");

        for (RunContextItem rci :rcic.byOrder.values()){
        	// Note: we only need the imports required by the view implementation, not the full run context impl
        	rci.addUsageImplImports(manager);
        }
        out.write(manager.getFormattedImports() + "\n");
        
        out.write("public interface " + rcName + " extends " + rcic.getAllInterfaces() + " {\n\n");
                
        for (RunContextItem rci :rcic.byName.values()){
        	out.write(rci.getInterfaceMethod());
        }
        
        
        out.write("}\n\n");
        
        out.close();
        
	}
	
	static public void formatImplementation(String outdir, WebApplication app, RunContextItemCollection rcic) throws IOException{
        ImportManager manager = new ImportManager();
		
        String rcName = app.getAppName() + "RunContext";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, rcName + ".java");

        out.write("package " + app.getDefinedInModule().getGenPackage() + ".generated.mvw;\n\n");

        for (RunContextItem rci :rcic.byOrder.values()){
        	rci.addRunContextImplImports(manager);
        }
        out.write(manager.getFormattedImports() + "\n");
        
        out.write("public class " + rcName + " implements " + rcic.getAllInterfaces() + " {\n\n");
        
        
        for (RunContextItem rci :rcic.byOrder.values()){
        	out.write(rci.getDefinition());
        }
        
        out.write("\n");
        out.write("    public " + rcName + "(){\n\n");
        
        for (RunContextItem rci :rcic.byOrder.values()){
        	out.write(rci.getInstantiation());
        }
        
        out.write("    }\n\n");
        
        for (RunContextItem rci :rcic.byName.values()){
        	out.write(rci.getImplMethod());
        }
        
        
        out.write("}\n\n");
        
        out.close();
        
	}
	
}
