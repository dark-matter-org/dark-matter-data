package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import org.dmd.mvw.tools.mvwgenerator.extended.Event;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwEvent;
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

	PrintStream				progressStream;
	
	MvwDefinitionManager	defManager;

	public MvwGenerator(MvwDefinitionManager dm, PrintStream ps){
		defManager 		= dm;
		progressStream 	= ps;
	}
	
	public void generateCode(ConfigLocation loc) throws IOException, ResultException {
		gendir 		= loc.getConfigParentDirectory() + File.separator + "generated";
		mvwdir 		= gendir + File.separator + "mvw";
		eventsdir	= mvwdir + File.separator + "events";
		viewsdir	= mvwdir + File.separator + "views";
		createGenDirs();
		
		
		
//		for(MvwEvent event: defManager.mvwEevents.values()){
//			GwtEventFormatter.formatEvent(eventsdir, event);
//		}
//		
//		for(MvwEvent event: defManager.viewEvents.values()){
//			GwtEventFormatter.formatEvent(eventsdir, event);
//		}
		
		for(Event event: defManager.events.values()){
			GwtEventFormatter.formatEvent(eventsdir, event);
		}
		
		for(View view: defManager.views.values()){
			ViewFormatter.formatViewInterface(viewsdir, view);
			
			ViewFormatter.formatViewBaseImpl(viewsdir, view);
		}
		
		RunContextFormatter.formatInterface(mvwdir, defManager.getCodeGenModule());
		
		RunContextFormatter.formatImplementation(mvwdir, defManager.getApplication(), defManager.getDefaultContext());
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
		
		File events = new File(eventsdir);
		if (!events.exists())
			events.mkdir();
		
		File views = new File(viewsdir);
		if (!views.exists())
			views.mkdir();
		
	}


	
}
