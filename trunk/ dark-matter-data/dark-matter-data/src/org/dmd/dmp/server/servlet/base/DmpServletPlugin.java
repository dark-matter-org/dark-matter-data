//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dmp.server.servlet.base;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.servlet.base.cache.CacheIF;
import org.dmd.dmp.server.servlet.dmpservletri.DMPServiceImpl;
import org.dmd.dmp.server.servlet.extended.PluginConfig;
import org.dmd.util.exceptions.ResultException;

/**
 * The DmpServletPlugin class is an abstract base from which all plugins
 * used in the DMP Servlet Reference Implementation must be derived. Plugins
 * have a defined life cycle that includes:
 * <ul>
 * <li> pre-initialization: allows for addition of schemas associated with
 * your functionality and the addition of indices to the cache. 
 * </li>
 * <li> initialization: at this stage, the cache has been loaded with any 
 * existing persisted objects and plugins can perform additional object
 * creations and any other required initialization
 * </li>
 * <li> starting: plugins are called on to start before we actually begin servicing 
 * client requests
 * </li>
 * <li> stopping: called when the servlet is being shutdown.
 * </li>
 * </ul>
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
	 * @return the plugin's unique ID.
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
	
	protected void preInit() throws ResultException, DmcValueException {
		
	}
	
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
	protected void start() throws ResultException, DmcValueException {
		
	}
	
	/**
	 * When the servlet is destroyed, the shutdown() method is called on all plugins.
	 */
	protected void shutdown(){
		
	}
}
