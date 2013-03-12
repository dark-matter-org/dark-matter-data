package org.dmd.dmg.util;

import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;

/**
 * The DefinitionManager is a generic manager of a set of objects that comprise definitions
 * for some purpose.
 */
public class DefinitionManager<DEF extends DmcObject, FLATNAME extends DmcObjectName, FQN extends DmcHierarchicObjectName> {
	
	TreeMap<FLATNAME,ArrayList<DEF>>	flatMap;
	
	TreeMap<FQN,DEF>					fqnMap;
	
	public DefinitionManager(){
		flatMap	= new TreeMap<FLATNAME, ArrayList<DEF>>();
		fqnMap	= new TreeMap<FQN, DEF>();
	}
	
	public void addDefinition(){
		
	}

}
