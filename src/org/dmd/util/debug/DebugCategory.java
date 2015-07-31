package org.dmd.util.debug;

import java.util.ArrayList;
import java.util.Iterator;

public class DebugCategory implements DebugCategoryIF {
	
	// A unique name for this category of debug info
	String 				name;
	
	// Generally useful tags to identify a channel
	ArrayList<String>	tags;
	
	// A description of what's published on the channel
	String 				description;
	
	// The channel that's constructed by the category
	DebugChannel		channel;

	public DebugCategory(String n, String d, String... t){
		name 		= n;
		description = d;
		tags 		= new ArrayList<String>();
		for(String s: t)
			tags.add(s);
		
		DebugManager.instance().advertise(this);
	}
	
	public Iterator<String> getTags(){
		return(tags.iterator());
	}
	
	@Override
	public String getName() {
		return(name);
	}

	@Override
	public String getDescription() {
		return(description);
	}

	@Override
	public DebugChannelIF initializeChannel(String uniqueName) {
		if (channel == null){
			channel = new DebugChannel(this, uniqueName);
			return(channel);
		}
		throw(new IllegalStateException("initializeChannel() has been called multiple times for DebugCategory: " + name));
	}

	@Override
	public DebugChannelIF getChannel() {
		return(channel);
	}

}
