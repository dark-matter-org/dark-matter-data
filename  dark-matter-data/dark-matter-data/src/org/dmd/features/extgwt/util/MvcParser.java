package org.dmd.features.extgwt.util;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmoObjectFactory;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;
import org.dmd.util.parsing.DmcUncheckedObject;

/**
 * The DmgConfigParser 
 */
public class MvcParser implements DmcUncheckedOIFHandlerIF {
	
	SchemaManager			schema;
	
	ConfigFinder			finder;
	
	DmoObjectFactory		factory;
	
	DmcUncheckedOIFParser	ucoParser;
	
	DmgConfigDMO			theConfig;

	public MvcParser(SchemaManager sm, ConfigFinder cf){
		schema 		= sm;
		ucoParser	= new DmcUncheckedOIFParser(this);
		finder 		= cf;
		factory 	= new DmoObjectFactory(sm);
	}
	
	public void parseConfig(ConfigLocation cl) throws ResultException, DmcValueException{
		ucoParser.parseFile(cl.getFileName());
	}
	
	public DmgConfigDMO getTheConfig(){
		return(theConfig);
	}

	@Override
	public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException {
		
		try {
			theConfig = (DmgConfigDMO) factory.createObject(uco);
		} catch (ClassNotFoundException e) {
			ResultException ex = new ResultException();
			ex.addError(e.getMessage());
			ex.result.lastResult().moreMessages(DebugInfo.extractTheStack(e));
			throw(ex);
		}
		
		System.out.println(theConfig.toOIF(15));
	}
}
