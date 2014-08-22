package org.dmd.dmc.definitions;

import java.util.Iterator;

/**
 * The DmcDefinitionManagerIF interface defines an entity that manages a set
 * of definitions and allows those definitions to be accessed. By providing a
 * standard interface, sets of different definitions can be managed by a
 * manager of definition managers.
 */
public interface DmcDefinitionManagerIF {

	public Iterator<DmcModuleIF>	getModules();
	
	
}
