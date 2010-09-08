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
import org.dmd.features.extgwt.extended.MvcController;
import org.dmd.features.extgwt.extended.MvcEvent;
import org.dmd.features.extgwt.extended.MvcView;
import org.dmd.features.extgwt.generated.dmw.MvcApplicationDMW;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;


public class MvcGenerator implements DarkMatterGeneratorIF {
	
	String gendir;
	String mvcdir;

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
		
		createMVCApplication(defManager.getTheApplication(), loc);
	}

	@Override
	public void setProgressStream(PrintStream ps) {
		progress = ps;
	}

	////////////////////////////////////////////////////////////////////////////////
	// Our functionality
	
//	import com.extjs.gxt.ui.client.Registry;
//	import com.extjs.gxt.ui.client.event.EventType;
//	import com.extjs.gxt.ui.client.mvc.AppEvent;
//	import com.extjs.gxt.ui.client.mvc.Controller;

	void createMVCApplication(MvcApplicationDMW application, ConfigLocation loc) throws ResultException, IOException {
		Iterator<MvcController> controllers = application.getControllers();
		if (controllers == null){
			ResultException ex = new ResultException();
			ex.addError("An application must refer to at least one MvcController");
			throw(ex);
		}
		
		dumpAppEvents();
		
		while(controllers.hasNext()){
			MvcController ref = controllers.next();
			dumpController(ref, loc);
		}
		
		for (MvcView view : defManager.views.values()){
			dumpView(view, loc);
		}
		
	}
	
	void dumpController(MvcController controller, ConfigLocation loc) throws IOException {
		String ofn = mvcdir + File.separator + controller.getName() + "MVC.java";
		
		controller.initCodeGenInfo();
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
        out.write("package " + defManager.topLevelConfig.getGenPackage() + ".generated.mvc;\n\n");
        
        out.write(controller.getImportDefs());
        out.write("\n");
        out.write("abstract public class " + controller.getName() + "MVC extends Controller {\n");
        out.write("\n");
        out.write(controller.getLocalVariables());
        out.write("\n");
        
        out.write("    protected " + controller.getName() + "MVC(){\n");
        
        for (MvcEvent event : controller.getAllEvents().values()){
            out.write("        registerEventTypes(AppEventsMVC." + event.getCamelCaseName() + ");\n");
        }
        out.write("    }\n\n");
        
        out.write(controller.getHandleEventFunction());
        
        out.write(controller.getControllerEventHandlers());
        
        out.write(controller.getResourceAccessFunctions());
        
        out.write("}\n");
        
        out.close();
	}
	
	void dumpView(MvcView view, ConfigLocation loc) throws IOException {
		String ofn = mvcdir + File.separator + view.getName() + "MVC.java";
		
		view.initCodeGenInfo();
		
        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        
        if (progress != null)
        	progress.println("    Generating " + ofn);
        
        out.write("package " + defManager.topLevelConfig.getGenPackage() + ".generated.mvc;\n\n");
        
        out.write(view.getImportDefs());
                
        out.write("\n");
        out.write("abstract public class " + view.getName() + "MVC extends View {\n");
        out.write("\n");
        
        out.write(view.getLocalVariables());

        out.write("\n");
        out.write("    protected " + view.getName() + "MVC(Controller controller){\n");
        out.write("        super(controller);\n");
        out.write("    }\n\n");
        
        out.write("    abstract protected void initialize();\n\n");
        
        out.write(view.getEventHandlerFunctions());
        
        out.write(view.getResourceAccessFunctions());
                
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
        
        out.write("package " + defManager.topLevelConfig.getGenPackage() + ".generated.mvc;\n\n");
        
        out.write("import com.extjs.gxt.ui.client.event.EventType;\n\n");
        
        out.write("public class AppEventsMVC {\n\n");
        
        for(MvcEvent event : defManager.events.values()){
        	out.write("    public static final EventType " + event.getCamelCaseName() + " = new EventType();\n\n");
        }
        
        out.write("}\n\n");
        
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
