//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.features.extgwt.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

import org.dmd.dmg.DarkMatterGeneratorIF;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.SchemaManager;
import org.dmd.features.extgwt.extended.MvcAction;
import org.dmd.features.extgwt.extended.MvcApplication;
import org.dmd.features.extgwt.extended.MvcConfig;
import org.dmd.features.extgwt.extended.MvcController;
import org.dmd.features.extgwt.extended.MvcEvent;
import org.dmd.features.extgwt.extended.MvcMenu;
import org.dmd.features.extgwt.extended.MvcMenuItem;
import org.dmd.features.extgwt.extended.MvcMultiView;
import org.dmd.features.extgwt.extended.MvcView;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;


public class MvcGenerator implements DarkMatterGeneratorIF {
	
	String gendir;
	String mvcdir;
	String fileHeader;

	MvcDefinitionManager	defManager;

	PrintStream	progress;

	public MvcGenerator(){
		initialize();
	}
	
	public MvcGenerator(PrintStream ps){
		progress = ps;
	}
	
	void initialize(){
		
	}
	
	public void setDefinitionManager(MvcDefinitionManager mdm){
		defManager = mdm;
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// DarkMatterGeneratorIF implementation

	@Override
	public void gatherUserInput(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		gendir = loc.getConfigParentDirectory() + File.separator + "generated";
		mvcdir = gendir + File.separator + "mvc";
		
		createGenDirs();
		
		if (defManager.getTheApplication() == null){
			// This config doesn't have an application - no problem, check to
			// see if there are any controllers and/or views to generate
			MvcConfig top = defManager.getTopLevelConfig();
			
			for(MvcController controller : defManager.getControllers().values()){
				if (controller.getDefinedInMVCConfig() == top){
					dumpController(controller, loc);
				}
			}
		}
		else{
			createMVCApplication(defManager.getTheApplication(), loc);
		}
	}

	@Override
	public void setProgressStream(PrintStream ps) {
		progress = ps;
	}
	
	@Override
	public void setFileHeader(String fh) {
		fileHeader = fh;
	}

	////////////////////////////////////////////////////////////////////////////////
	// Our functionality
	
//	import com.extjs.gxt.ui.client.Registry;
//	import com.extjs.gxt.ui.client.event.EventType;
//	import com.extjs.gxt.ui.client.mvc.AppEvent;
//	import com.extjs.gxt.ui.client.mvc.Controller;

	void createMVCApplication(MvcApplication application, ConfigLocation loc) throws ResultException, IOException {
		Iterator<MvcController> controllers = application.getControllers();
		if (controllers == null){
			ResultException ex = new ResultException();
			ex.addError("An application must refer to at least one MvcController");
			throw(ex);
		}
		
		dumpAppEvents();
		
		while(controllers.hasNext()){
			MvcController ref = controllers.next();
			if (ref.getDefinedInMVCConfig() == application.getDefinedInMVCConfig())
				dumpController(ref, loc);
		}
		
		dumpApplication(application,loc);
	}
	
	void dumpController(MvcController controller, ConfigLocation loc) throws IOException {
		String ofn = mvcdir + File.separator + controller.getName() + "MVC.java";
		
		controller.initCodeGenInfo();
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + defManager.topLevelConfig.getGenPackage() + ".generated.mvc;\n\n");
        
        out.write(controller.getImportDefs());
        out.write("\n");
        out.write(controller.getClassComments());
        
        out.write("abstract public class " + controller.getName() + "MVC extends Controller" + controller.getAdditionalInterfaces() + " {\n");
        out.write("\n");
        out.write(controller.getLocalVariables());
        out.write("\n");
        
        out.write("    protected " + controller.getName() + "MVC(){\n");
        
        out.write("        // Resolve our events\n");
        for (MvcEvent event : controller.getAllEvents().values()){
            out.write("        " + event.getCamelCaseName() + " = getApplication().getEvent(\"" + event.getName() + "\");\n");
        }

        out.write("\n");
        
        for (MvcEvent event : controller.getAllEvents().values()){
            out.write("        registerEventTypes(" + event.getCamelCaseName() + ");\n");
        }
        
        Iterator<MvcView>	views = controller.getControlsView();
        if (views != null){
            out.write("\n");
        	out.write("        // Instantiate our views\n");
        	while(views.hasNext()){
        		MvcView view = views.next();
        		out.write("        " + view.getVariableName() + " = new " + view.getName() + "(this);\n");
        	}
        }
        
        Iterator<MvcMultiView>	multiViews = controller.getControlsMultiView();
        if (multiViews != null){
            out.write("\n");
        	out.write("        // Instantiate our multiviews\n");
        	while(multiViews.hasNext()){
        		MvcMultiView view = multiViews.next();
        		out.write("        " + view.getVariableName() + "s = new TreeMap<String," + view.getName() + ">();\n");
        	}
        }
        
        Iterator<MvcAction> actions = controller.getDefinesAction();
        if (actions != null){
            out.write("\n");
        	out.write("        // Instantiate our actions\n");
        	while(actions.hasNext()){
        		MvcAction action = actions.next();
        		out.write("        " + action.getVariableName() + " = new " + action.getCamelCaseName() + "(this);\n");
        	}
        }
        
		Iterator<MvcMenu> menus = controller.getDefinesMenu();
		if (menus != null){
            out.write("\n");
        	out.write("        // Instantiate our menus\n");
			while(menus.hasNext()){
				MvcMenu menu = menus.next();
				out.write(menu.getInstantiation());
			}
		}

		Iterator<MvcMenuItem> menuItems = controller.getDefinesMenuItem();
		if (menuItems != null){
            out.write("\n");
        	out.write("        // Instantiate our menu items\n");
			while(menuItems.hasNext()){
				MvcMenuItem menuItem = menuItems.next();
				out.write(menuItem.getInstantiation());
			}
		}

        
        out.write("    }\n\n");
        
        out.write("    /**\n");
        out.write("     * Derived classes must override this method to perform their initialization behaviour.\n");
        out.write("     */\n");
        out.write("    abstract protected void initialize();\n\n");
        
        out.write(controller.getHandleEventFunction());
        
        out.write(controller.getControllerEventHandlers());
        
        out.write(controller.getResourceAccessFunctions());
        
        out.write(controller.getEventDispatchFunctions());
        
        out.write(controller.getMultiViewSupportFunctions());
        
        if (controller.usesServerEvents()){
        	out.write(controller.getHandleServerEventFunction());
        	
        	out.write(controller.getServerEventHandlers());
        }
                

        
        out.write("}\n");
        
        out.close();
        
        views = controller.getControlsView();
        if (views != null){
        	while(views.hasNext()){
        		MvcView view = views.next();
        		dumpView(controller, view, loc);
        	}
        }
        
        multiViews = controller.getControlsMultiView();
        if (multiViews != null){
        	while(multiViews.hasNext()){
        		MvcMultiView view = multiViews.next();
        		dumpMultiView(controller, view, loc);
        	}
        }        
        
        actions = controller.getDefinesAction();
        if (actions != null){
        	while(actions.hasNext()){
        		MvcAction action = actions.next();
        		dumpAction(controller, action, loc);
        	}
        }
        
	}
	
	void dumpView(MvcController controller, MvcView view, ConfigLocation loc) throws IOException {
		String ofn = mvcdir + File.separator + view.getName() + "MVC.java";
		
		view.initCodeGenInfo();
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + defManager.topLevelConfig.getGenPackage() + ".generated.mvc;\n\n");
        
        out.write(view.getImportDefs());
        out.write("import com.extjs.gxt.ui.client.mvc.View;\n");
        
        out.write("import " + controller.getExtendedImportDef() + ";\n");
        
//        out.write("import " + defManager.topLevelConfig.getGenPackage() + ".extended." + controller.getName() + ";\n");
                
        out.write("\n");
        out.write(view.getClassComments());
        out.write("abstract public class " + view.getName() + "MVC extends View" + view.getAdditionalInterfaces() + " {\n");
        out.write("\n");
        out.write("    protected " + controller.getName() + " myController;\n");
        out.write("\n");
        
        out.write(view.getLocalVariables());

        out.write("\n");
        out.write("    protected " + view.getName() + "MVC(Controller controller){\n");
        out.write("        super(controller);\n");
        out.write("        myController = (" + controller.getName() + ") controller;\n");
        out.write("    }\n\n");
        
        out.write("    /**\n");
        out.write("     * Derived classes must override this method to perform their initialization behaviour.\n");
        out.write("     */\n");
        out.write("    abstract protected void initialize();\n\n");
        
        out.write(view.getHandleEventFunction() + "\n");
        
        out.write(view.getEventHandlerFunctions());
        
        out.write(view.getResourceAccessFunctions());
        
        if (view.usesServerEvents()){
        	out.write(view.getHandleServerEventFunction());
        	
        	out.write(view.getServerEventHandlers());
        }
                
        out.write("}\n");
        
        out.close();
	}
	
	void dumpMultiView(MvcController controller, MvcMultiView view, ConfigLocation loc) throws IOException {
		String ofn = mvcdir + File.separator + view.getName() + "MVC.java";
		
		view.initCodeGenInfo();
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + defManager.topLevelConfig.getGenPackage() + ".generated.mvc;\n\n");
        
        out.write(view.getImportDefs());
        
        out.write("import org.dmd.features.extgwt.client.util.MultiView;\n");
        out.write("import " + controller.getExtendedImportDef() + ";\n");
        
//        out.write("import " + defManager.topLevelConfig.getGenPackage() + ".extended." + controller.getName() + ";\n");
                
        out.write("\n");
        out.write(view.getClassComments());
        out.write("abstract public class " + view.getName() + "MVC extends MultiView" + view.getAdditionalInterfaces() + " {\n");
        out.write("\n");
        out.write("    protected " + controller.getName() + " myController;\n");
        out.write("\n");
        
        out.write(view.getLocalVariables());

        out.write("\n");
        out.write("    protected " + view.getName() + "MVC(String instanceName, Controller controller){\n");
        out.write("        super(instanceName,controller);\n");
        out.write("        myController = (" + controller.getName() + ") controller;\n");
        out.write("    }\n\n");
        
        out.write("    /**\n");
        out.write("     * Derived classes must override this method to perform their initialization behaviour.\n");
        out.write("     */\n");
        out.write("    abstract protected void initialize();\n\n");
        
        out.write(view.getHandleEventFunction() + "\n");
        
        out.write(view.getEventHandlerFunctions());
        
        out.write(view.getResourceAccessFunctions());
        
        if (view.usesServerEvents()){
        	out.write(view.getHandleServerEventFunction());
        	
        	out.write(view.getServerEventHandlers());
        }
                
        out.write("}\n");
        
        out.close();
	}
	
	void dumpApplication(MvcApplication app, ConfigLocation loc) throws IOException {
		String ofn = mvcdir + File.separator + app.getName() + "MVC.java";
		
		app.initCodeGenInfo();
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
//        app.initCodeGenInfo(loc, defManager.topLevelConfig.getGenPackage());
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + defManager.topLevelConfig.getGenPackage() + ".generated.mvc;\n\n");
        
        out.write(app.getImportDefs());
                
        out.write("\n");
        out.write(app.getClassComments());
        out.write("public class " + app.getName() + "MVC implements ApplicationIF {\n");
        out.write("\n");
        
        out.write(app.getLocalVariables());

        out.write("\n");
        out.write("    public " + app.getName() + "MVC(){\n");
        out.write("        // Register ourselves as the global application\n");
        out.write("        Registry.register(\"application\",this);\n");
        out.write("        \n");
        out.write("        events = new TreeMap<String,EventType>();\n");
        out.write("        \n");
        out.write("        initEvents();\n");
        out.write("        initControllers();\n");
        out.write("        \n");
        out.write("    }\n\n");
        
        out.write("    public EventType getEvent(String name){\n");
        out.write("        return(events.get(name));\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("    private void initEvents(){\n");
        for(MvcEvent event : defManager.events.values()){
        	out.write("        events.put(\"" + event.getName() + "\", AppEventsMVC." + event.getCamelCaseName() + ");\n");
        }        
        out.write("    }\n");
        out.write("\n");
        
        out.write("    private void initControllers(){\n");
        Iterator<MvcController> controllers = app.getControllers();
        out.write("        Dispatcher dispatcher = Dispatcher.get();\n");
        while(controllers.hasNext()){
        	MvcController controller = controllers.next();
        	out.write("        dispatcher.addController(new " + controller.getName() + "());\n");
        }        
        out.write("    }\n");
        out.write("\n");
        
        out.write("}\n");
        
        out.close();
	}
	

	/**
	 * Dumps the AppEventsMVC file that defines all of the EventTypes for the application.
	 * @throws IOException
	 */
	void dumpAppEvents() throws IOException {
		String ofn = mvcdir + File.separator + "AppEventsMVC.java";
		
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + defManager.topLevelConfig.getGenPackage() + ".generated.mvc;\n\n");
        
        out.write("import com.extjs.gxt.ui.client.event.EventType;\n\n");
        
        out.write("public class AppEventsMVC {\n\n");
        
        for(MvcEvent event : defManager.events.values()){
        	out.write("    public static final EventType " + event.getCamelCaseName() + " = new EventType();\n\n");
        }
        
        out.write("}\n\n");
        
        out.close();
	}
	
	void dumpAction(MvcController controller, MvcAction action, ConfigLocation loc) throws IOException {
		String ofn = mvcdir + File.separator + action.getCamelCaseName() + "MVC.java";
		
//		view.initCodeGenInfo();
//		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + defManager.topLevelConfig.getGenPackage() + ".generated.mvc;\n\n");
        
//        out.write(view.getImportDefs());
        
        out.write("import " + controller.getExtendedImportDef() + ";\n");
        
//        out.write("import " + defManager.topLevelConfig.getGenPackage() + ".extended." + controller.getName() + ";\n");
        out.write("import org.dmd.features.extgwt.client.util.Action;\n\n");
//                
//        out.write("\n");
//        out.write(view.getClassComments());
        out.write("abstract public class " + action.getCamelCaseName() + "MVC extends Action {\n");
        

        out.write("\n");
        out.write("    protected " + controller.getName() + " myController;\n");
        out.write("\n");
//        
//        out.write(view.getLocalVariables());
//
        out.write("\n");
        out.write("    protected " + action.getCamelCaseName() + "MVC(" + controller.getName() + "MVC controller){\n");
        out.write("        super(\"" + action.getName() + "\");\n");
        out.write("        myController = (" + controller.getName() + ")controller;\n");
        out.write("    }\n\n");
        
//        out.write("    /**\n");
//        out.write("     * Derived classes must override this method to perform their initialization behaviour.\n");
//        out.write("     */\n");
//        out.write("    abstract protected void initialize();\n\n");
//        
//        out.write(view.getHandleEventFunction() + "\n");
//        
//        out.write(view.getEventHandlerFunctions());
//        
//        out.write(view.getResourceAccessFunctions());
//        
//        if (view.usesServerEvents()){
//        	out.write(view.getHandleServerEventFunction());
//        	
//        	out.write(view.getServerEventHandlers());
//        }
//                
        out.write("}\n");
        
        out.close();
	}
	


	/**
	 * Creates the output directory structure for our code.
	 */
	void createGenDirs(){
		File gdf = new File(gendir);
		if (!gdf.exists())
			gdf.mkdir();
		
		File ddf = new File(mvcdir);
		if (!ddf.exists())
			ddf.mkdir();
		
	}


	
}
