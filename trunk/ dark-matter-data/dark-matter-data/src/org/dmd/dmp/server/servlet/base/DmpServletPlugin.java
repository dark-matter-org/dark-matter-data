package org.dmd.dmp.server.servlet.base;

import org.dmd.dmp.server.servlet.base.interfaces.CacheIF;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmpServletPlugin class is an abstract base from which all plugins
 * used in the DMP Servlet Reference Implementation must be derived.
 */
public class DmpServletPlugin {
	
	static int nextID;
	
	int ID;
	
	// Handles to the overall plugin manager and the cache. These are set before
	// the plugin's init() method is called. If the plugin requires access to 
	// other plugin's, it can access them from the PluginManager.
	PluginManager	pluginManager;
	CacheIF			cache;

	public DmpServletPlugin(){
		ID = nextID++;
	}
	
	/**
	 * Returns the plugin's unique ID.
	 * @return
	 */
	public int getID(){
		return(ID);
	}
	
	protected void setManagerAndCache(PluginManager pm, CacheIF c){
		pluginManager	= pm;
		cache			= c;
	}
	
	/**
	 * Derived classes should perform any initialization logic required. If a
	 * plugin has indicated that it depends on another plugin, it is safe to 
	 * assume that the other plugin has been initialized.
	 */
	protected void init() throws ResultException {
		
	}
	
	/**
	 * After all plugins are initialized, the start method is called on all plugins
	 * in the same implied order.
	 */
	protected void start(){
		
	}
	
	/**
	 * When the servlet is shutdown, the destroy() method is called on all plugins.
	 */
	protected void destroy(){
		
	}
}
