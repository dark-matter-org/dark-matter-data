package org.dmd.features.extgwt.util;

import java.util.TreeMap;

import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.features.extgwt.generated.dmo.MvcApplicationDMO;
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
import org.dmd.features.extgwt.generated.dmo.MvcEventDMO;
import org.dmd.features.extgwt.generated.dmo.MvcViewDMO;
import org.dmd.util.exceptions.ResultException;

public class MvcDefinitionManager implements DmcNameResolverIF {
	
	TreeMap <String,MvcDefinitionDMO>	allDefs;
	
	TreeMap <String,MvcApplicationDMO>	applications;
	
	TreeMap<String, MvcConfigDMO>		configs;
	
	TreeMap<String, MvcControllerDMO> 	controllers;
	
	TreeMap<String,MvcEventDMO>			events;
	
	TreeMap<String,MvcViewDMO>			views;

	public MvcDefinitionManager(){
		allDefs 		= new TreeMap<String, MvcDefinitionDMO>();
		applications	= new TreeMap<String, MvcApplicationDMO>();
		configs			= new TreeMap<String, MvcConfigDMO>();
		controllers		= new TreeMap<String, MvcControllerDMO>();
		events			= new TreeMap<String, MvcEventDMO>();
		views			= new TreeMap<String, MvcViewDMO>();
	}
	
	public void addDefinition(MvcDefinitionDMO def) throws ResultException{
		checkAndAdd(def, allDefs);
		if (def instanceof MvcConfigDMO){
			checkAndAdd(def, configs);
		}
		else if (def instanceof MvcApplicationDMO){
			checkAndAdd(def, applications);
		}
		else if (def instanceof MvcControllerDMO){
			checkAndAdd(def, controllers);
		}
		else if (def instanceof MvcEventDMO){
			checkAndAdd(def, events);
		}
		else if (def instanceof MvcViewDMO){
			checkAndAdd(def, views);
		}
	}
	
	@SuppressWarnings("unchecked")
	void checkAndAdd(MvcDefinitionDMO def, TreeMap map) throws ResultException{
		MvcDefinitionDMO existing = (MvcDefinitionDMO) map.get(def.getObjectName());
		
		if (existing == null){
			map.put(def.getObjectName(),def);
		}
		else{
			ResultException ex = new ResultException();
			throw(ex);
		}
	}
	
	
	////////////////////////////////////////////////////////////////////////////////
	// DmcNameResolverIF implementation

	@Override
	public DmcNamedObjectIF findNamedObject(String name) {
		return(allDefs.get(name));
	}

	
}
