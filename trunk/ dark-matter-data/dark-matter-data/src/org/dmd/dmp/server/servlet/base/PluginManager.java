package org.dmd.dmp.server.servlet.base;

import java.util.TreeMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.server.servlet.base.interfaces.SecurityManagerIF;
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
	SchemaManager						schema;
	
	// The factory used to instantiate the appropriate wrapped objects from
	// the plugin config file or other files that we're asked to load
	DmwObjectFactory					factory;
	
	// Our OIF parser.
	DmcUncheckedOIFParser				configParser;
	
	// The plugins that we've loaded
	TreeMap<String,DmpServletPlugin>	plugins;
	
	
	
	// The handle to the plugin that implements our security behaviour. If this
	// role is unfilled after the load sequence, we throw an exception.
	SecurityManagerIF					securityManager;
	
	public PluginManager() throws ResultException, DmcValueException {
		schema = new SchemaManager();
		
		DmpSchemaAG 		dmp 	= new DmpSchemaAG();
		DmpServerSchemaAG 	dmps 	= new DmpServerSchemaAG();
		
		schema.manageSchema(dmp);
		schema.manageSchema(dmps);
		
		factory 		= new DmwObjectFactory(schema);
		configParser	= new DmcUncheckedOIFParser(this);
	}
	
	public SchemaManager getSchema(){
		return(schema);
	}

	public void loadPlugins(){
		
	}


	@Override
	public void handleObject(DmcUncheckedObject obj, String infile, int lineNumber) throws ResultException, DmcValueException {
		
	}
}
