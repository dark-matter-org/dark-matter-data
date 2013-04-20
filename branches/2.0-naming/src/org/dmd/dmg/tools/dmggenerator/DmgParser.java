//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmg.tools.dmggenerator;

import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dmg.generated.dmo.DmgDMSAG;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmoObjectFactory;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;

/**
 * The DmgConfigParser 
 */
public class DmgParser implements DmcUncheckedOIFHandlerIF {
	
	SchemaManager		schema;
	
	ConfigFinder		finder;
	
	DmoObjectFactory	factory;
	
	DmcUncheckedOIFParser	ucoParser;
	
	DmgConfigDMO		theConfig;

	public DmgParser(SchemaManager sm, ConfigFinder cf){
		schema 		= sm;
		ucoParser	= new DmcUncheckedOIFParser(this);
		finder 		= cf;
		factory 	= new DmoObjectFactory(sm);
		
		DmcOmni.instance().addCompactSchema(DmgDMSAG.instance());
	}
	
	public void parseConfig(ConfigLocation cl) throws ResultException, DmcValueException, DmcRuleExceptionSet {
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
		
		System.out.println("\nRead: " + infile);
//		System.out.println(theConfig.toOIF(15));
	}
}
