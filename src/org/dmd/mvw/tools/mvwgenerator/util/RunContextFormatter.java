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
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.formatting.PrintfFormat;

public class RunContextFormatter {

	static public void formatModuleRunContextInterface(String outdir, Module module, RunContextItemCollection rcic) throws IOException{
		if (module.contextItemCount() == 0)
			return;
		
		Iterator<RunContextItem> it = null;
		String interfaceName = GenUtility.capTheName(module.getModuleName().getNameString());
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, interfaceName + "RunContextIF.java");
        String 			typefmt 	= "%-" + rcic.getLongestTypeName() + "s";
        PrintfFormat	typeformat 	= new PrintfFormat(typefmt);

        out.write("package " + module.getGenPackage() + ".generated.mvw;\n\n");
        
        ImportManager manager = new ImportManager();
        
        it = module.getItems();
        while(it.hasNext()){
        	RunContextItem rci = it.next();
        	rci.addInterfaceImports(manager);
        }
        out.write(manager.getFormattedImports());
        
        out.write("\n\n");
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public interface " + interfaceName + "RunContextIF {\n\n");
        
        it = module.getItems();
        while(it.hasNext()){
        	RunContextItem rci = it.next();
        	out.write(rci.getInterfaceMethod(typeformat));
        }
        
        out.write("}\n\n");
        
        out.close();
	}
	
	static public void formatAppRunContextInterface(String outdir, WebApplication app, RunContextItemCollection rcic) throws IOException{
        ImportManager 	manager 	= new ImportManager();
        String 			typefmt 	= "%-" + rcic.getLongestTypeName() + "s";
        PrintfFormat	typeformat 	= new PrintfFormat(typefmt);
		
        String rcName = app.getAppName() + "RunContextIF";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, rcName + ".java");

        out.write("package " + app.getDefinedInModule().getGenPackage() + ".generated.mvw;\n\n");

        for (RunContextItem rci :rcic.byOrder.values()){
        	// Note: we only need the imports required by the view implementation, not the full run context impl
        	rci.addUsageImplImports(manager);
        }
        out.write(manager.getFormattedImports() + "\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public interface " + rcName + " extends " + rcic.getAllInterfaces() + " {\n\n");
                
        for (RunContextItem rci :rcic.byName.values()){
        	out.write(rci.getInterfaceMethod(typeformat));
        }
        
        
        out.write("}\n\n");
        
        out.close();
        
	}
	
	static public void formatImplementation(String outdir, WebApplication app, RunContextItemCollection rcic) throws IOException{
        ImportManager manager = new ImportManager();
        String 			typefmt 	= "%-" + rcic.getLongestTypeName() + "s";
        PrintfFormat	typeformat 	= new PrintfFormat(typefmt);
        String 			itemfmt 	= "%-" + rcic.getLongestItemName() + "s";
        PrintfFormat	itemformat 	= new PrintfFormat(itemfmt);
		
        String rcName = app.getAppName() + "RunContext";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, rcName + ".java");

        out.write("package " + app.getDefinedInModule().getGenPackage() + ".generated.mvw;\n\n");

        for (RunContextItem rci :rcic.byOrder.values()){
        	rci.addRunContextImplImports(manager);
        }
        out.write(manager.getFormattedImports() + "\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + rcName + " implements " + rcName + "IF {\n\n");
        
//        out.write("public class " + rcName + " implements " + rcic.getAllInterfaces() + " {\n\n");
        
        
        for (RunContextItem rci :rcic.byOrder.values()){
        	out.write(rci.getDefinition(typeformat));
        }
        
        out.write("\n");
        out.write("    public " + rcName + "(){\n\n");
        
        for (RunContextItem rci :rcic.byOrder.values()){
        	out.write(rci.getInstantiation(itemformat));
        }
        
        out.write("    }\n\n");
        
        for (RunContextItem rci :rcic.byName.values()){
        	out.write(rci.getImplMethod(app));
        }
        
        
        out.write("}\n\n");
        
        out.close();
        
	}
	
}
