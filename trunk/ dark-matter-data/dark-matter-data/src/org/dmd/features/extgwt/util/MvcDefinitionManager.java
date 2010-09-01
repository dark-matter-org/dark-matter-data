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
