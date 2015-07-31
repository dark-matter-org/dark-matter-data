package org.dmd.util.debug;

import java.util.Iterator;

public interface DebugCategoryIF {
	
	/**
	 * This method is called by the DebugManager to initialize the channel associated with 
	 * this category. Calling multiple times will throw an IlegalState Exception.
	 * @param uniqueName the unique name created by the DebugManager
	 * @return the debug channel
	 */
	public DebugChannelIF initializeChannel(String uniqueName);

	public DebugChannelIF getChannel();

	public String getName();
	
	public String getDescription();
	
	public Iterator<String> getTags();
	
}
