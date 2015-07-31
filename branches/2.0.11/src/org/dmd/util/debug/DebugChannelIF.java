package org.dmd.util.debug;

public interface DebugChannelIF {
	
	public DebugCategoryIF getCategory();
	
	public String getUniqueName();

	public void publish(String message);
	
	public void subscribe(DebugHandlerIF h);
	
	public void unsubscribe(DebugHandlerIF h);
	
}
