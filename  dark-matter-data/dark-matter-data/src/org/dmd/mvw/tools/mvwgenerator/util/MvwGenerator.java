package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import org.dmd.mvw.tools.mvwgenerator.extended.Activity;
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;
import org.dmd.mvw.tools.mvwgenerator.extended.Event;
import org.dmd.mvw.tools.mvwgenerator.extended.Place;
import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;
import org.dmd.mvw.tools.mvwgenerator.extended.View;
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
		placesdir		= mvwdir + File.separator + "places";
		createGenDirs();
		
//		for(MvwEvent event: defManager.mvwEevents.values()){
//			GwtEventFormatter.formatEvent(eventsdir, event);
//		}
//		
//		for(MvwEvent event: defManager.viewEvents.values()){
//			GwtEventFormatter.formatEvent(eventsdir, event);
//		}
		
		for(Event event: defManager.events.values()){
			if (event.getDefinedInModule() == defManager.codeGenModule)
				GwtEventFormatter.formatEvent(eventsdir, event);
		}
		
		for(View view: defManager.views.values()){
			if (view.getDefinedInModule() == defManager.codeGenModule){
				ViewFormatter.formatViewInterface(viewsdir, view);
				ViewFormatter.formatViewBaseImpl(viewsdir, view);
			}
		}
		
		for(Controller controller: defManager.controllers.values()){
			if (controller.getDefinedInModule() == defManager.codeGenModule)
				ControllerFormatter.formatControllerBaseImpl(controllersdir, controller);
		}
		
		for(Presenter presenter: defManager.presenters.values()){
			if (presenter.getDefinedInModule() == defManager.codeGenModule)
				PresenterFormatter.formatPresenterBaseImpl(presentersdir, presenter);
		}
		
		for(Activity activity: defManager.activities.values()){
			if (activity.getDefinedInModule() == defManager.codeGenModule)
				ActivityFormatter.formatActivity(activitiesdir, activity);
		}
		
		for(Place place: defManager.places.values()){
			if (place.getDefinedInModule() == defManager.codeGenModule)
				PlaceFormatter.formatPlace(placesdir, place);
		}
				
		RunContextFormatter.formatModuleRunContextInterface(mvwdir, defManager.getCodeGenModule());		
		
		if (defManager.getApplication() != null){
			PlaceFormatter.formatPlaceHistoryMapper(placesdir, defManager.application, defManager.places);
			RunContextFormatter.formatAppRunContextInterface(mvwdir, defManager.getApplication(), defManager.getDefaultContext());
			RunContextFormatter.formatImplementation(mvwdir, defManager.getApplication(), defManager.getDefaultContext());
			WebApplicationFormatter.formatApplication(mvwdir, defManager.getApplication());
		}
	}
	
	/**
	 * Creates the output directory structure for our code.
	 */
	void createGenDirs(){
		File gdf = new File(gendir);
		if (!gdf.exists())
			gdf.mkdir();
		
		File mvw = new File(mvwdir);
		if (!mvw.exists())
			mvw.mkdir();
		
		if (defManager.events.size() > 0){
			File events = new File(eventsdir);
			if (!events.exists())
				events.mkdir();
		}
		
		if (defManager.views.size() > 0){
			File views = new File(viewsdir);
			if (!views.exists())
				views.mkdir();
		}
		
		if (defManager.controllers.size() > 0){
			File controllers = new File(controllersdir);
			if (!controllers.exists())
				controllers.mkdir();
		}
		
		if (defManager.presenters.size() > 0){
			File presenters = new File(presentersdir);
			if (!presenters.exists())
				presenters.mkdir();
		}
		
		if (defManager.activities.size() > 0){
			File activities = new File(activitiesdir);
			if (!activities.exists())
				activities.mkdir();
		}
		
		if (defManager.places.size() > 0){
			File places = new File(placesdir);
			if (!places.exists())
				places.mkdir();
		}
		
	}


	
}
