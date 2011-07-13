package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuImplementationConfig;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;

public class MenuBuilderFormatter {

	static public void formatMenuBuilder(String outdir, MvwDefinitionManager manager) throws IOException {
		String genPackage = manager.getApplication().getDefinedInModule().getGenPackage();
		
		String name = GenUtility.capTheName(manager.getApplication().getAppName().getNameString()) + "MenuBuilder";
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, name + ".java");
        
        ImportManager	imports = new ImportManager();
        imports.addImport("org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF", "Base run context");
        imports.addImport("org.dmd.mvw.client.mvwmenus.generated.mvw.MvwmenusRunContextIF", "Mvwmenus run context");
        imports.addImport("org.dmd.mvw.client.mvwmenus.base.MvwMenuFactory", "Base menu factory");
        imports.addImport("org.dmd.mvw.client.mvwmenus.extended.controllers.MenuController", "Menu controller to be populated");
        
        RunContextItem	menuFactoryRCI = null;
        
        MenuImplementationConfig config = manager.getMenuImplementation();
        Iterator<RunContextItem> items = config.getDefinedInModule().getItems();
        while(items.hasNext()){
        	RunContextItem rci = items.next();
        	if (rci.getItemName().getNameString().equals("menuFactory")){
        		menuFactoryRCI = rci;
        		break;
        	}
        }
        
        menuFactoryRCI.addUsageImplImports(imports);
        
        out.write("package " + genPackage + ".generated.mvw;\n\n");
        
        out.write(imports.getFormattedImports());
        
        out.write("\n");
        
        out.write("public class " + name + " {\n\n");
        
        out.write("    final MenuController MenuControllerRCI;\n");
        out.write(menuFactoryRCI.getImplVariable() + "\n\n");
            	
    	///////////////////////////////////////////////////////////////////////
    	// Constructor
    	
    	out.write("    public " + name + "(MvwRunContextIF rc){\n\n");
    	
        out.write("        MenuControllerRCI = ((MvwmenusRunContextIF)rc).getMenuControllerRCI();\n\n");
        out.write(menuFactoryRCI.getImplVariableAssignment() + "\n\n");
        
        out.write("    }\n\n");
                
        out.write("}\n\n");
        out.close();
	}

}
