package org.dmd.util.debug;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.util.exceptions.DebugInfo;

/**
 * The DebugManager provides a simple mechanism to access different categories of
 * debug information. Although there are many mechanisms to add logging to
 * a system, those mechanisms tend to relate to an entire system i.e. if you
 * set a logging level to FINE or FINEST, you get all of the logs at that level
 * of granularity. When you're trying to focus on a particular subsystem, that
 * approach can often flood your logs with information that obscures the information
 * you're trying to use to solve a problem.
 * <p/>
 * In other cases, you want to be able to turn on debugging in a particular area 
 * while the system is running; this mechanism allows for that as well.
 * <p/>
 * You can also see all categories of logging that are available (for subsystems
 * that use these mechanisms), so it lends itself to being able to have a UI to 
 * turn logging on/off for various aspects.
 */
public class DebugManager {
	
	static DebugManager singleton;
	
	final static ArrayList<DebugCategoryIF> emptyList = new ArrayList<DebugCategoryIF>();
	
	TreeMap<String,DebugCategoryIF> categories = new TreeMap<String, DebugCategoryIF>();
	
	TreeMap<String, ArrayList<DebugCategoryIF>>	categoriesByTag = new TreeMap<String, ArrayList<DebugCategoryIF>>();
	
	/**
	 * Key: a channel tag that might exist in the future
	 * Value: a list of handlers that are interesting in that tag
	 */
	TreeMap<String, ArrayList<DebugHandlerIF>>	preregisters = new TreeMap<String, ArrayList<DebugHandlerIF>>();

	private DebugManager(){
		
	}
	
	public static DebugManager instance(){
		if (singleton == null)
			singleton = new DebugManager();
		return(singleton);
	}
	
	/**
	 * Lets a debug handler preregister interest in categories that have this tag. When the category
	 * is advertised, we'll subscribe any interested handlers.
	 * @param tag
	 */
	public void preregister(DebugHandlerIF handler, String tag){
		ArrayList<DebugHandlerIF> handlers = preregisters.get(tag);
		
		if (handlers == null){
			handlers = new ArrayList<DebugHandlerIF>();
			preregisters.put(tag, handlers);
		}
		
		handlers.add(handler);
	}
	
	public DebugChannelIF advertise(DebugCategoryIF dc){
		String from = DebugInfo.getWhereWeWereCalledFrom();
		String unique = "";
		int anglePos = from.indexOf('<');
		if (anglePos != -1){
			unique = from.substring(13, anglePos-1) + "-" + dc.getName() + "-" + categories.size();
		}
		else{
			unique = from.substring(13) + "-" + dc.getName() + "-" + categories.size();
		}
		
		categories.put(unique, dc);
		
		Iterator<String> tags = dc.getTags();
		while(tags.hasNext()){
			String tag = tags.next();
			ArrayList<DebugCategoryIF> channels = categoriesByTag.get(tag);
			if (channels == null)
				channels = new ArrayList<DebugCategoryIF>();
			channels.add(dc);
		}
		
		DebugChannelIF rc = dc.initializeChannel(unique);
		
		tags = dc.getTags();
		while(tags.hasNext()){
			String tag = tags.next();
			ArrayList<DebugHandlerIF> handlers = preregisters.get(tag);
			if (handlers != null){
				for(DebugHandlerIF h: handlers){
					dc.getChannel().subscribe(h);
				}
			}
		}
		
		return(rc);
	}
	
	public Iterator<DebugCategoryIF> getCategoriesByTag(String tag){
		ArrayList<DebugCategoryIF> cats = categoriesByTag.get(tag);
		
		if (cats == null)
			return(emptyList.iterator());
		return(cats.iterator());
	}
	
	public Iterator<DebugCategoryIF> getCategories(){
		return(categories.values().iterator());
	}
	
	
	 
}
