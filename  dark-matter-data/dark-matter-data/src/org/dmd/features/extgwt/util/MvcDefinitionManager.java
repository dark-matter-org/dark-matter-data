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
package org.dmd.features.extgwt.util;

import java.util.TreeMap;

import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.SchemaManager;
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
	
	SchemaManager						schema;

	public MvcDefinitionManager(SchemaManager sm){
		init();
		schema = sm;
	}
	
	void init(){
		allDefs 		= new TreeMap<String, MvcDefinitionDMO>();
		applications	= new TreeMap<String, MvcApplicationDMO>();
		configs			= new TreeMap<String, MvcConfigDMO>();
		controllers		= new TreeMap<String, MvcControllerDMO>();
		events			= new TreeMap<String, MvcEventDMO>();
		views			= new TreeMap<String, MvcViewDMO>();
	}
	
	public void reset(){
		init();
	}
	
	public void resolveDefinitions() throws ResultException {
		ResultException errors = null;
		
		for(MvcDefinitionDMO def : allDefs.values()){
			try {
				def.resolveReferences(this);
			} catch (DmcValueExceptionSet e) {
				if (errors == null)
					errors = new ResultException();
				
				errors.addError("Couldn't resolve references in object: " + " " + def.getName());
				errors.setLocationInfo(def.getFile(), def.getLineNumber());
				
				for(DmcValueException dve : e.getExceptions()){
					errors.moreMessages(dve.getAttributeName() + " - " + dve.getMessage());
				}
				
			}
		}
		
		if (errors != null)
			throw(errors);
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
			ex.addError("The definition with name: " + def.getName() + " clashes with an existing definition.");
			ex.setLocationInfo(def.getFile(), def.getLineNumber());
			throw(ex);
		}
	}
	
	
	////////////////////////////////////////////////////////////////////////////////
	// DmcNameResolverIF implementation

	@Override
	public DmcNamedObjectIF findNamedObject(String name) {
		DmsDefinition def = (DmsDefinition) schema.findNamedObject(name);
		
		if (def != null){
			return (DmcNamedObjectIF) (def.getDmcObject());
		}
		
		return(allDefs.get(name));
	}

	
}
