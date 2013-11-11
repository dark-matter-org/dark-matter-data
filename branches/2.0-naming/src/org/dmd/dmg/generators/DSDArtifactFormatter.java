package org.dmd.dmg.generators;

import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.SchemaManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

/**
 * The DSDArtifactFormatter will generate a variety of artifacts based on the specification of
 * a DSDefinitionModule. This includes a definition manager for the DSD and a DSD parser.
 */
public class DSDArtifactFormatter {

	public DSDArtifactFormatter(){
		
	}
	
	/**
	 * This method will determine if the schema for which we're generating artifacts
	 * includes any DSD module definitions and, if so, will generate the classes
	 * that provide base DSD functionality.
	 * @param config
	 * @param loc
	 * @param f
	 * @param sm
	 */
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm){
		DebugInfo.debug(loc.toString());
	}
	
}
