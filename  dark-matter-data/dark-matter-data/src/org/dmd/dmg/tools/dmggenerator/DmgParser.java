package org.dmd.dmg.tools.dmggenerator;

import org.dmd.dms.SchemaManager;
import org.dmd.util.parsing.ConfigFinder;

/**
 * The DmgConfigParser 
 */
public class DmgParser {
	
	SchemaManager	schema;
	
	ConfigFinder	finder;

	public DmgParser(SchemaManager sm, ConfigFinder cf){
		schema = sm;
		finder = cf;
	}
}
