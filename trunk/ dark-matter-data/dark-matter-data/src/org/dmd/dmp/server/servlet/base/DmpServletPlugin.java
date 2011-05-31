package org.dmd.dmp.server.servlet.base;

import org.dmd.util.exceptions.ResultException;

/**
 * The DmpServletPlugin class is an abstract base from which all plugins
 * used in the DMP Servlet Reference Implementation must be derived.
 */
public class DmpServletPlugin {
	
	static int nextID;
	
	int ID;

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
	
	/**
	 * Derived classes should perform any initialization logic required. If a
	 * plugin has indicated that it depends on another plugin, it is safe to 
	 * assume that the other plugin has been initialized.
	 */
	void init() throws ResultException {
		
	}
	
	/**
	 * After all plugins are initialized, the start method is called on all plugins
	 * in the same implied order.
	 */
	void start(){
		
	}
	
	/**
	 * When the servlet is shutdown, the destroy() method is called on all plugins.
	 */
	void destroy(){
		
	}
}
