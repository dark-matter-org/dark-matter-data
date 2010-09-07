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

import java.util.Collection;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmg.util.GeneratorUtils;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.features.extgwt.generated.dmw.MvcApplicationDMW;
import org.dmd.features.extgwt.generated.dmw.MvcConfigDMW;
import org.dmd.features.extgwt.generated.dmw.MvcControllerDMW;
import org.dmd.features.extgwt.generated.dmw.MvcDefinitionDMW;
import org.dmd.features.extgwt.generated.dmw.MvcEventDMW;
import org.dmd.features.extgwt.generated.dmw.MvcRegistryItemDMW;
import org.dmd.features.extgwt.generated.dmw.MvcViewDMW;
import org.dmd.util.exceptions.ResultException;

public class MvcDefinitionManager implements DmcNameResolverIF {
	
	TreeMap<String,MvcDefinitionDMW>	allDefs;
	
	TreeMap<String,MvcConfigDMW>		configs;
	
	TreeMap<String,MvcControllerDMW> 	controllers;
	
	TreeMap<String,MvcEventDMW>			events;
	
	TreeMap<String,MvcViewDMW>			views;
	
	TreeMap<String,MvcRegistryItemDMW>	registry;
	
	SchemaManager						schema;
	
	// The first config that was loaded
	MvcConfigDMW						topLevelConfig;
	
	MvcApplicationDMW					theApplication;

	public MvcDefinitionManager(SchemaManager sm){
		init();
		schema = sm;
	}
	
	void init(){
		allDefs 		= new TreeMap<String, MvcDefinitionDMW>();
		configs			= new TreeMap<String, MvcConfigDMW>();
		controllers		= new TreeMap<String, MvcControllerDMW>();
		events			= new TreeMap<String, MvcEventDMW>();
		views			= new TreeMap<String, MvcViewDMW>();
		registry		= new TreeMap<String, MvcRegistryItemDMW>();
		topLevelConfig	= null;
		theApplication	= null;
	}
	
	public void reset(){
		init();
	}
	
	/**
	 * @return Returns the application to be generated from this set of definitions.
	 */
	public MvcApplicationDMW getTheApplication(){
		return(theApplication);
	}
	
	public Collection<MvcEventDMW> getEvents(){
		return(events.values());
	}
	
	public void resolveDefinitions() throws ResultException {
		ResultException errors = null;
		
		for(MvcDefinitionDMW def : allDefs.values()){
			try {
				def.resolveReferences(schema, this);
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
		
		// Now that everything is resolved, we have some work to do
		
	}
	
	public void addDefinition(MvcDefinitionDMW def) throws ResultException, DmcValueException {
		checkAndAdd(def, allDefs);
		if (def instanceof MvcConfigDMW){
			if (configs.size() == 0)
				topLevelConfig = (MvcConfigDMW) def;
			
			checkAndAdd(def, configs);
		}
		else if (def instanceof MvcApplicationDMW){
			if (theApplication != null){
				ResultException ex = new ResultException();
				ex.addError("Only one application can be generated from an MvcConfig: ");
				ex.moreMessages(" First application: " + theApplication.getName());
				ex.moreMessages("Second application: " + ((MvcApplicationDMW) def).getName());
				throw(ex);
			}
			theApplication = (MvcApplicationDMW) def;
		}
		else if (def instanceof MvcControllerDMW){
			checkAndAdd(def, controllers);
		}
		else if (def instanceof MvcEventDMW){
			MvcEventDMW event = (MvcEventDMW) def;
			checkAndAdd(def, events);
			event.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(def.getName()));
			event.setUpperConstantName(GeneratorUtils.dotNameToUpperCaseConstant(def.getName()));
		}
		else if (def instanceof MvcViewDMW){
			checkAndAdd(def, views);
		}
		else if (def instanceof MvcRegistryItemDMW){
			MvcRegistryItemDMW regItem = (MvcRegistryItemDMW) def;
			checkAndAdd(def, registry);
			regItem.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(regItem.getName()));
		}
	}
	
	@SuppressWarnings("unchecked")
	void checkAndAdd(MvcDefinitionDMW def, TreeMap map) throws ResultException{
		MvcDefinitionDMW existing = (MvcDefinitionDMW) map.get(def.getObjectName());
		
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
