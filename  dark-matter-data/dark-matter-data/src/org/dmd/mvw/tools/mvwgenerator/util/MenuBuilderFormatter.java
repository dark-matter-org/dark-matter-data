package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuBar;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuImplementationConfig;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuItem;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Separator;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.SubMenu;
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
        
        if (manager.getMenuBars().size() > 0)
        	imports.addImport("org.dmd.mvw.client.mvwmenus.base.MvwMenu", "Menus are defined");
        
//        if (manager.getSubMenus().size() > 0)
//        	imports.addImport("org.dmd.mvw.client.mvwmenus.base.MvwSubMenu", "SubMenus are defined");
        
        if (manager.getMenuItems().size() > 0)
        	imports.addImport("org.dmd.mvw.client.mvwmenus.base.MvwMenuItem", "Menu items are defined");
        
        if (manager.getSeparators().size() > 0)
        	imports.addImport("org.dmd.mvw.client.mvwmenus.base.MvwSeparators", "Separators are defined");

        
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
        out.write(menuFactoryRCI.getImplVariableAssignment() + "\n");
        
        if (manager.getMenuBars().size() > 0)
        	out.write("        MvwMenu      menu      = null;\n");
        
//        if (manager.getSubMenus().size() > 0)
//        	out.write("        MvwSubMenu   submenu   = null;\n");
        
        if (manager.getMenuItems().size() > 0)
        	out.write("        MvwMenuItem  menuitem  = null;\n");
        
        if (manager.getSeparators().size() > 0)
        	out.write("        MvwSeparator separator = null;\n");
        
        out.write("\n");
        
        for(MenuItem mi: manager.getMenuItems().values()){
        	out.write("        menuitem = menuFactory.createSubMenu(");
        	out.write("\"" + mi.getUseImpl() + "\",");
        	out.write("\"" + mi.getElementName() + "\",");
        	out.write("\"" + mi.getMenuOrder() + "\",");
        	out.write("\"" + mi.getAddToMenu().getElementName() + "\",");
        	out.write("false,");
        	out.write("\"" + mi.getTriggersAction().getActionName() + "\",");
        	out.write("\"" + mi.getDisplayLabel() + "\",");
        	out.write("null");
        	out.write(");\n");
        	out.write("        MenuControllerRCI.addMenuItem(menuitem);\n\n");
        }
        
        for(Separator sep: manager.getSeparators().values()){
        	out.write("        separator = menuFactory.createSeparator(");
        	out.write("\"" + sep.getUseImpl() + "\",");
        	out.write("\"" + sep.getElementName() + "\",");
        	out.write("\"" + sep.getMenuOrder() + "\",");
        	out.write("\"" + sep.getAddToMenu().getElementName() + "\",");
        	out.write("false");
        	out.write(");\n");
        	out.write("        MenuControllerRCI.addSeparator(separator);\n\n");
        }
        
        for(SubMenu sub: manager.getSubMenus().values()){
        	out.write("        menu = menuFactory.createSubMenu(");
        	out.write("\"" + sub.getUseImpl() + "\",");
        	out.write("\"" + sub.getElementName() + "\",");
        	out.write("\"" + sub.getMenuOrder() + "\",");
        	out.write("\"" + sub.getAddToMenu().getElementName() + "\",");
        	out.write("false,");
        	out.write("\"" + sub.getDisplayLabel() + "\",");
        	out.write("null");
        	out.write(");\n");
        	out.write("        MenuControllerRCI.addMenu(menu);\n\n");
        }
        
        for(MenuBar mb: manager.getMenuBars().values()){
        	out.write("        menu = menuFactory.createMenu(");
        	out.write("\"" + mb.getUseImpl() + "\",");
        	out.write("\"" + mb.getElementName() + "\"");
        	out.write(");\n");
        	out.write("        MenuControllerRCI.addMenu(menu);\n\n");
        }
        
        out.write("        MenuControllerRCI.initializeMenus();\n");
        out.write("    }\n\n");
                
        out.write("}\n\n");
        out.close();
	}

}
