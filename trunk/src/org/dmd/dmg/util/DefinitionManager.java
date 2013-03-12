package org.dmd.dmg.util;

import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.types.DotName;
import org.dmd.dmc.types.StringName;

/**
 * The DefinitionManager is a generic manager of a set of objects that comprise definitions
 * for some purpose.
 */
public class DefinitionManager<DEF extends DmcObject> {
	
	TreeMap<StringName,ArrayList<DEF>>	flatMap;
	
	TreeMap<DotName,DEF>				fqnMap;
	
	DmcAttributeInfo					flatAttr;
	
	DmcAttributeInfo					hierAttr;
	
	public DefinitionManager(DmcAttributeInfo fa, DmcAttributeInfo ha){
		flatMap		= new TreeMap<StringName, ArrayList<DEF>>();
		fqnMap		= new TreeMap<DotName, DEF>();
		flatAttr	= fa;
		hierAttr	= ha;
		
		
	}
	
	public void addDefinition(DEF def){
		
	}

}
