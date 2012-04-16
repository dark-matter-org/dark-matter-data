package org.dmd.dmp.server.servlet.base;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.server.servlet.base.interfaces.CacheIF;
import org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF;
import org.dmd.dmp.server.servlet.base.interfaces.SecurityManagerIF;
import org.dmd.dmp.server.servlet.dmpservletri.DMPServiceImpl;
import org.dmd.dmp.server.servlet.extended.PluginConfig;
import org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;
import org.dmd.util.parsing.DmcUncheckedObject;

/**
 * The PluginManager reads a plugin configuration and loads and instantiates
 * the plugins specified. Certain plugin roles are required in order for the 
 * application to function properly. These roles include:
 * <ul>
 * <li>Cache - which provides centralized access to named objects and allows for 
 * CRUDE operations - Create, Read, Update, Delete and Events associated with 
 * the objects it manages. A cache implementation MUST be Runnable in order to
 * allow for proper sequencing of operations and events.
 * </li>
 * <li>SecurityManager - provides user authentication and session management.
 * </li>
 * <ul>
 */
public class PluginManager implements DmcUncheckedOIFHandlerIF {

	// Our overall schema, including the required schemas of the plugins
	// that have been loaded.
	SchemaManager							schema;
	
	// The factory used to instantiate the appropriate wrapped objects from
	// the plugin config file or other files that we're asked to load
	DmwObjectFactory						factory;
	
	// Our OIF parser.
	DmcUncheckedOIFParser					configParser;
	
	// The plugins that we've loaded
	TreeMap<DmcObjectName,PluginConfig>		pluginConfigs;
	
	TreeMap<Integer,DmpServletPlugin>		startOrder;
	
	// The servlet in which we're running
	DMPServiceImpl							servlet;
	
	// The handle to the plugin that allows for registration of handlers for
	// the various types of Dark Matter Protocol requests.
	RequestTrackerIF						requestTracker;
	DmpServletPlugin						requestTrackerPlugin;

	// The handle to the plugin that implements our security behaviour. If this
	// role is unfilled after the load sequence, we throw an exception.
	SecurityManagerIF						securityManager;
	DmpServletPlugin						securityPlugin;
	
	// The handle to the plugin that implements our cache. If this role is unfilled
	// after the load sequence, we throw an exception.
	CacheIF									cache;
	DmpServletPlugin						cachePlugin;
	
	
	public PluginManager(DMPServiceImpl s) throws ResultException, DmcValueException {
		schema 		= new SchemaManager();
		servlet		= s;
		
		DmpSchemaAG 		dmp 	= new DmpSchemaAG();
		DmpServerSchemaAG 	dmps 	= new DmpServerSchemaAG();
		
		schema.manageSchema(dmp);
		schema.manageSchema(dmps);
		
		factory 		= new DmwObjectFactory(schema);
		configParser	= new DmcUncheckedOIFParser(this);
		
		pluginConfigs	= new TreeMap<DmcObjectName, PluginConfig>();
		startOrder		= new TreeMap<Integer, DmpServletPlugin>();
		
		securityManager	= null;
	}
	
	public SchemaManager getSchema(){
		return(schema);
	}
	
	public SecurityManagerIF getSecurityManager(){
		return(securityManager);
	}
	
	public RequestTrackerIF getRequestTracker(){
		return(requestTracker);
	}

	public DMPServiceImpl getServlet(){
		return(servlet);
	}

	public CacheIF getCache(){
		return(cache);
	}

	/**
	 * Loads the plugins specified in the plugin configuation file. 
	 * @param fn the name of the plugin configuration file.
	 * @throws ResultException
	 * @throws DmcValueException
	 */
	public void loadPlugins(String fn) throws ResultException, DmcValueException {
		File pluginFile = new File(fn);
		
		if (!pluginFile.exists()){
			ResultException ex = new ResultException();
			ex.addError("Could not open DMP Servlet configuration file: " + fn);
			throw(ex);
		}
		configParser.parseFile(fn);
		
		for(PluginConfig sp: pluginConfigs.values()){
			DmpServletPlugin plugin = instantiatePlugin(sp);
			
			if (plugin instanceof RequestTrackerIF){
				if (requestTracker == null){
					requestTracker = (RequestTrackerIF) plugin;
					requestTrackerPlugin = plugin;
				}
				else{
					ResultException ex = new ResultException("Multiple request tracker plugins specified.");
					throw(ex);
				}
			}
			else if (plugin instanceof CacheIF){
				if (cache == null){
					cache = (CacheIF) plugin;
					cachePlugin = plugin;
				}
				else{
					ResultException ex = new ResultException("Multiple cache plugins specified.");
					throw(ex);
				}
			}
			else if (plugin instanceof SecurityManagerIF){
				if (securityManager == null){
					securityManager = (SecurityManagerIF) plugin;
					securityPlugin	= plugin;
				}
				else{
					ResultException ex = new ResultException("Multiple security manager plugins specified.");
					throw(ex);
				}
			}
			else{
				startOrder.put(sp.getStartOrder(), plugin);
			}
		}
		
		if (requestTracker == null){
			ResultException ex = new ResultException();
			ex.addError("No plugin has been specified that implements the org.dmd.dmp.server.servlet.base.interfaces.RequestTrackerIF interface");
			throw(ex);
		}
		
		if (cache == null){
			ResultException ex = new ResultException();
			ex.addError("No plugin has been specified that implements the org.dmd.dmp.server.servlet.base.interfaces.CacheIF interface");
			throw(ex);
		}
		
		if (securityManager == null){
			ResultException ex = new ResultException();
			ex.addError("No plugin has been specified that implements the org.dmd.dmp.server.servlet.base.interfaces.SecurityManagerIF interface");
			throw(ex);
		}
	}
	
	public void preInit() throws ResultException, DmcValueException{
		
		requestTrackerPlugin.preInit();
		
		cachePlugin.preInit();
		
		securityPlugin.preInit();
		
		for(DmpServletPlugin sp: startOrder.values()){
			sp.preInit();
		}
	}
	
	public void init() throws ResultException, DmcValueException{
		
		requestTrackerPlugin.init();
		
		cachePlugin.init();
		
		securityPlugin.init();
		
		for(DmpServletPlugin sp: startOrder.values()){
			sp.init();
		}
	}
	
	public void start() throws ResultException, DmcValueException{
		
		requestTrackerPlugin.start();
		
		cachePlugin.start();
		
		securityPlugin.start();
		
		for(DmpServletPlugin sp: startOrder.values()){
			sp.start();
		}
	}
	
	public void shutdown(){
		ArrayList<DmpServletPlugin> reverse = new ArrayList<DmpServletPlugin>();
		for(DmpServletPlugin sp: startOrder.values()){
			reverse.add(0, sp);
		}
		
		for(DmpServletPlugin sp: reverse){
			sp.shutdown();
		}
		
		securityPlugin.shutdown();
		
		cachePlugin.shutdown();
		
		requestTrackerPlugin.shutdown();
	}

	DmpServletPlugin instantiatePlugin(PluginConfig pc) throws ResultException{
		DmpServletPlugin rc = null;
		Class<?> pluginClass = null;
		
		try {
			pluginClass = Class.forName(pc.getPluginClass());
		} catch (ClassNotFoundException e) {
			ResultException ex = new ResultException();
			ex.addError("Plugin class not found: " + pc.getPluginClass());
			ex.setLocationInfo(pc.getFile(), pc.getLineNumber());
			throw(ex);
		}
		
		try {
			rc = (DmpServletPlugin) pluginClass.newInstance();
			rc.setManagerAndConfig(this,pc);
		} catch (InstantiationException e) {
			ResultException ex = new ResultException();
			ex.addError("InstantiationException for: " + pc.getPluginClass());
			ex.setLocationInfo(pc.getFile(), pc.getLineNumber());
			throw(ex);
		} catch (IllegalAccessException e) {
			ResultException ex = new ResultException();
			ex.addError("IllegalAccessException for: " + pc.getPluginClass());
			ex.setLocationInfo(pc.getFile(), pc.getLineNumber());
			throw(ex);
		}
		
		return(rc);
	}

	@Override
	public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException {
		PluginConfig config = null;
		
		try {
			config = (PluginConfig) factory.createWrapper(uco);
		} catch (ClassNotFoundException e) {
			ResultException ex = new ResultException("Unknown object class: " + uco.classes.get(0));
			ex.result.lastResult().moreMessages("The plugin configuration file should contain PluginConfig objects.");
			ex.result.lastResult().fileName(infile);
			ex.result.lastResult().lineNumber(lineNumber);
			throw(ex);
		} catch (ClassCastException e){
			ResultException ex = new ResultException("Invalid object in plugin config file: " + uco.classes.get(0));
			ex.result.lastResult().fileName(infile);
			ex.result.lastResult().lineNumber(lineNumber);
			throw(ex);
		}
		
		config.setLineNumber(lineNumber);
		config.setFile(infile);
		if (config.getPluginName() != null)
			config.setCamelCaseName(config.getPluginName());
		
		try {
			config.getDMO().validate();
		} catch (DmcValueExceptionSet e) {
			ResultException ex = new ResultException();
			for(DmcValueException dve: e.getExceptions()){
				ex.addError(dve.getLocalizedMessage());
			}
			ex.setLocationInfo(infile, lineNumber);
			ex.result.lastResult().moreMessages("Object class: " + config.getConstructionClassName());
			
			throw(ex);
		}
		
		if (pluginConfigs.get(config.getObjectName()) != null){
			ResultException ex = new ResultException("Duplicate plugin name: " + config.getObjectName());
			ex.result.lastResult().fileName(infile);
			ex.result.lastResult().lineNumber(lineNumber);
			throw(ex);
		}
		
		pluginConfigs.put(config.getObjectName(), config);
//		startOrder.put(plugin., value)
	}
}
