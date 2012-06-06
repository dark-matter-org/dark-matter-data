package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.dmd.mvw.tools.mvwgenerator.extended.Activity;
import org.dmd.mvw.tools.mvwgenerator.extended.Component;
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;
import org.dmd.mvw.tools.mvwgenerator.extended.Event;
import org.dmd.mvw.tools.mvwgenerator.extended.Place;
import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;
import org.dmd.mvw.tools.mvwgenerator.extended.View;
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FormBindingDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.forms.GxtEnumMapping;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.ActionBinding;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigLocation;

/**
 * The MvwGenerator coordinates the overall code generation associated with the MVW Generator tool.
 */
public class MvwGenerator {

	// Folder where we'll be generating stuff
	String 					gendir;
	
	// The generated/mvw
	String 					mvwdir;

	// The generated/mvw/events
	String 					eventsdir;

	// The generated/mvw/views
	String 					viewsdir;

	// The generated/mvw/controllers
	String 					controllersdir;

	// The generated/mvw/presenters
	String 					presentersdir;

	// The generated/mvw/places
	String 					placesdir;

	// The generated/mvw/presenters
	String 					activitiesdir;

	// The generated/mvw/actions
	String 					actionsdir;

	// The generated/mvw/forms
	String 					formsdir;

	PrintStream				progressStream;
	
	MvwDefinitionManager	defManager;

	public MvwGenerator(MvwDefinitionManager dm, PrintStream ps){
		defManager 		= dm;
		progressStream 	= ps;
	}
	
	public void generateCode(ConfigLocation loc) throws IOException, ResultException {
		gendir 			= loc.getConfigParentDirectory() + File.separator + "generated";
		mvwdir 			= gendir + File.separator + "mvw";
		eventsdir		= mvwdir + File.separator + "events";
		viewsdir		= mvwdir + File.separator + "views";
		controllersdir	= mvwdir + File.separator + "controllers";
		presentersdir	= mvwdir + File.separator + "presenters";
		activitiesdir	= mvwdir + File.separator + "activities";
		actionsdir		= mvwdir + File.separator + "actions";
		placesdir		= mvwdir + File.separator + "places";
		formsdir		= mvwdir + File.separator + "forms";
		
		createGenDir(gendir);
//		createGenDirs();
		
//		for(MvwEvent event: defManager.mvwEevents.values()){
//			GwtEventFormatter.formatEvent(eventsdir, event);
//		}
//		
//		for(MvwEvent event: defManager.viewEvents.values()){
//			GwtEventFormatter.formatEvent(eventsdir, event);
//		}
		
		if (defManager.getCodeGenModule() == null)
			return;
		
		if (!defManager.getCodeGenModule().getModuleName().equals(loc.getConfigName())){
//			DebugInfo.debug("Codegen module does not equal config name - config is empty.");
			System.out.println("\nThe " + loc.getConfigName() + ".mvw config file is empty - no code generated");
			return;
		}
		
		createGenDir(mvwdir);
		
		if (defManager.events.size() > 0){
			for(Event event: defManager.events.values()){
				if (event.getDefinedInModule() == defManager.codeGenModule){
					createGenDir(eventsdir);
					GwtEventFormatter.formatEvent(eventsdir, event);
				}
			}
		}
		
		if (defManager.views.size() > 0){
			for(View view: defManager.views.values()){
				if (view.getDefinedInModule() == defManager.codeGenModule){
					createGenDir(viewsdir);
					ViewFormatter.formatViewInterface(viewsdir, view);
					ViewFormatter.formatViewBaseImpl(viewsdir, view);
				}
			}
		}
		
		if (defManager.controllers.size() > 0){
			for(Controller controller: defManager.controllers.values()){
				if (controller.getDefinedInModule() == defManager.codeGenModule){
					createGenDir(controllersdir);
					ControllerFormatter.formatControllerBaseImpl(controllersdir, controller);
					
					// NOTE: Actions are always generated in the context of the component that 
					// implements them, regardless of which module they are defined in
					if (controller.getImplementsActionHasValue()){
						for(ActionBinding action: controller.getImplementsActionIterable()){
							createGenDir(actionsdir);
							ActionBindingFormatter.formatAction(actionsdir, action, controller);
						}
					}
				}
			}
		}
		
		if (defManager.presenters.size() > 0){
			for(Presenter presenter: defManager.presenters.values()){
				if (presenter.getDefinedInModule() == defManager.codeGenModule){
					createGenDir(presentersdir);
					PresenterFormatter.formatPresenterBaseImpl(presentersdir, presenter);
					
	//				// NOTE: Actions are always generated in the context of the component that 
	//				// implements them, regardless of which module they are defined in
	//				if (presenter.getImplementsActionHasValue()){
	//					for(Action action: presenter.getImplementsActionIterable()){
	//						ActionFormatter.formatAction(actionsdir, action, presenter);
	//					}
	//				}
				}
			}
		}
		
		if (defManager.activities.size() > 0){
			for(Activity activity: defManager.activities.values()){
				if (activity.getDefinedInModule() == defManager.codeGenModule){
					createGenDir(activitiesdir);
					ActivityFormatter.formatActivity(activitiesdir, activity);
					
					// NOTE: Actions are always generated in the context of the component that 
					// implements them, regardless of which module they are defined in
	//				if (activity.getImplementsActionHasValue()){
	//					for(Action action: activity.getImplementsActionIterable()){
	//						ActionFormatter.formatAction(actionsdir, action, activity);
	//					}
	//				}
				}
			}
		}
		
		if (defManager.getFormBindings().size() > 0){
			for(FormBindingDefinition fbd: defManager.getFormBindings().values()){
				if (fbd.getDefinedInModule() == defManager.codeGenModule){
					createGenDir(formsdir);
					FormBindingFormatter.formatFormBinding(formsdir, fbd);
				}
			}
		}
		
		if (defManager.getEnumMappings().size() > 0){
			for(GxtEnumMapping gem: defManager.getEnumMappings().values()){
				if (gem.getDefinedInModule() == defManager.codeGenModule){
					createGenDir(formsdir);
					GxtEnumMappingFormatter.formatEnumMapping(formsdir, gem);
				}
			}
		}
		
		if (defManager.places.size() > 0){
			for(Place place: defManager.places.values()){
				if (place.getDefinedInModule() == defManager.codeGenModule){
					createGenDir(placesdir);
					PlaceFormatter.formatPlace(placesdir, place);
				}
			}
		}
			
		if (defManager.getCodeGenModule() != null){
			DebugInfo.debug("Generating run context for: " + defManager.getCodeGenModule().getFile());
			RunContextFormatter.formatModuleRunContextInterface(mvwdir, defManager.getCodeGenModule(), defManager.getDefaultContext());		
		}
		
		if (defManager.getApplication() != null){
			ArrayList<Component> centralRC = defManager.centralDmpErrorHandlingOK();
			if (centralRC != null){
				System.err.println("The following components require a central DMP error handler to be defined:\n");
				
				for(Component component: centralRC){
					System.err.println(component.getObjectName().getNameString() + " in file: " + component.getFile());
				}
				
				System.err.println("\nAt least one controller must have its centralDMPErrorHandler flag set to true.\n\n");
				
				System.exit(1);
			}
			
			centralRC = defManager.centralRpcErrorHandlingOK();
			if (centralRC != null){
				System.err.println("The following components require a central RPC error handler to be defined:\n");
				
				for(Component component: centralRC){
					System.err.println(component.getObjectName().getNameString() + " in file: " + component.getFile());
				}
				
				System.err.println("\nAt least one controller must have its centralRPCErrorHandler flag set to true.\n\n");

				System.exit(1);
			}
			createGenDir(placesdir);
			PlaceFormatter.formatPlaceHistoryMapper(placesdir, defManager.application, defManager.places);
			RunContextFormatter.formatAppRunContextInterface(mvwdir, defManager.getApplication(), defManager.getDefaultContext());
			
DebugInfo.debug("GENERATING RUN CONTEXT");
			
			RunContextFormatter.formatImplementation(mvwdir, defManager.getApplication(), defManager.getDefaultContext());
			WebApplicationFormatter.formatApplication(mvwdir, defManager.getApplication());
			
			if (defManager.getMenuImplementation() != null)
				MenuBuilderFormatter.formatMenuBuilder(mvwdir, defManager);
		}
	}
	
//	/**
//	 * Creates the output directory structure for our code.
//	 */
//	void createGenDirs(){
//		File gdf = new File(gendir);
//		if (!gdf.exists())
//			gdf.mkdir();
//		
//		File mvw = new File(mvwdir);
//		if (!mvw.exists())
//			mvw.mkdir();
//		
//		if (defManager.events.size() > 0){
//			File events = new File(eventsdir);
//			if (!events.exists())
//				events.mkdir();
//		}
//		
//		if (defManager.views.size() > 0){
//			File views = new File(viewsdir);
//			if (!views.exists())
//				views.mkdir();
//		}
//		
//		if (defManager.controllers.size() > 0){
//			File controllers = new File(controllersdir);
//			if (!controllers.exists())
//				controllers.mkdir();
//		}
//		
//		if (defManager.presenters.size() > 0){
//			File presenters = new File(presentersdir);
//			if (!presenters.exists())
//				presenters.mkdir();
//		}
//		
//		if (defManager.activities.size() > 0){
//			File activities = new File(activitiesdir);
//			if (!activities.exists())
//				activities.mkdir();
//		}
//		
//		if (defManager.actions.size() > 0){
//			File actions = new File(actionsdir);
//			if (!actions.exists())
//				actions.mkdir();
//		}
//		
//		if (defManager.places.size() > 0){
//			File places = new File(placesdir);
//			if (!places.exists())
//				places.mkdir();
//		}
//		
//	}

	/**
	 * Creates the specified directory if required.
	 */
	void createGenDir(String dirname){
		File dir = new File(dirname);
		if (!dir.exists())
			dir.mkdir();
		
	}
	
}
