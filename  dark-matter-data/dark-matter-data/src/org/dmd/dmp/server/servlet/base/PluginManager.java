package org.dmd.dmp.server.servlet.base;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;
import org.dmd.util.parsing.DmcUncheckedObject;

public class PluginManager implements DmcUncheckedOIFHandlerIF {

	SchemaManager			schema;
	
	DmwObjectFactory		factory;
	
	DmcUncheckedOIFParser	configParser;
	
	
	
	public PluginManager() throws ResultException, DmcValueException {
		schema = new SchemaManager();
		
		DmpSchemaAG 		dmp 	= new DmpSchemaAG();
		DmpServerSchemaAG 	dmps 	= new DmpServerSchemaAG();
		
		schema.manageSchema(dmp);
		schema.manageSchema(dmps);
		
		factory 		= new DmwObjectFactory(schema);
		configParser	= new DmcUncheckedOIFParser(this);
	}

	public void loadPlugins(){
		
	}


	@Override
	public void handleObject(DmcUncheckedObject obj, String infile, int lineNumber) throws ResultException, DmcValueException {
		
	}
}
