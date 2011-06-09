package org.dmd.dmp.server.servlet.base;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.servlet.base.interfaces.CacheIF;
import org.dmd.dmp.server.servlet.dmpservletri.DMPServiceImpl;
import org.dmd.dmp.server.servlet.extended.PluginConfig;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmpServletPlugin class is an abstract base from which all plugins
 * used in the DMP Servlet Reference Implementation must be derived.
 */
public class DmpServletPlugin {
	
	static int nextID;
	
	int ID;
	
	// The following dependencies are set when the plugin is first instantiated and
	// before it init() method is called.
	
	// The plugin configuration associated with this plugin
	protected	PluginConfig	pluginConfig;
	
	// The overall plugin manager.
	protected	PluginManager	pluginManager;
	
	// A handle to the servlet in which we're running. This is primarily required because it
	// provides us with access to the GWT Event Service mechanisms.
	protected	DMPServiceImpl	servlet;
	
	// Our cache of objects
	protected	CacheIF			cache;

	public DmpServletPlugin(){
		ID = nextID++;
	}
	
	public String getPluginName(){
		return(pluginConfig.getPluginName().getNameString());
	}
	
	/**
	 * Returns the plugin's unique ID.
	 * @return
	 */
	public int getID(){
		return(ID);
	}
	
	///////////////////////////////////////////////////////////////////////////
	// This method is called when the plugin is first instantiated
	
	protected void setManagerAndConfig(PluginManager pm, PluginConfig c){
		pluginConfig	= c;
		pluginManager	= pm;
		servlet			= pm.getServlet();
		cache			= pm.getCache();
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * Derived classes should perform any initialization logic required. If a
	 * plugin has indicated that it depends on another plugin, it is safe to 
	 * assume that the other plugin has been initialized.
	 */
	protected void init() throws ResultException, DmcValueException {
		
	}
	
	/**
	 * After all plugins are initialized, the start method is called on all plugins
	 * in the same implied order.
	 */
	protected void start(){
		
	}
	
	/**
	 * When the servlet is destroyed, the shutdown() method is called on all plugins.
	 */
	protected void shutdown(){
		
	}
}
