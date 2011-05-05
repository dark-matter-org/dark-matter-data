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
package org.dmd.mvw.tools.mvwgenerator.util;

import java.util.HashMap;
import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.features.extgwt.extended.MvcDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ModuleDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.types.ModuleREF;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.parsing.ConfigVersion;
import org.dmd.util.parsing.DmcUncheckedOIFHandlerIF;
import org.dmd.util.parsing.DmcUncheckedOIFParser;
import org.dmd.util.parsing.DmcUncheckedObject;

/**
 * The DmgConfigParser 
 */
public class MvwParser implements DmcUncheckedOIFHandlerIF {
	
	SchemaManager				schema;
	
	ConfigFinder				finder;
	
	MvwDefinitionManager		defManager;
	
	DmwObjectFactory			factory;
	
	DmcUncheckedOIFParser		configParser;
	
	DmcUncheckedOIFParser		defParser;
	
	Module						currentModule;
    
    // The file that's currently being parsed.
    String              		currFile;

    // The files that have been loaded already.
    // Key: filename
    HashMap<String,ModuleDMO>	loadedFiles;
    	
	public MvwParser(SchemaManager sm, ConfigFinder cf, MvwDefinitionManager dm){
		schema 			= sm;
		configParser	= new DmcUncheckedOIFParser(this);
		defParser		= new DmcUncheckedOIFParser(this);
		finder 			= cf;
		factory 		= new DmwObjectFactory(sm);
		defManager		= dm;
	}
	
	public void parseConfig(ConfigLocation cl) throws ResultException, DmcValueException {
		defManager.reset();
		parseConfigInternal(cl);
		defManager.resolveDefinitions();
	}
	
	void parseConfigInternal(ConfigLocation cl) throws ResultException, DmcValueException{
		if (cl.isFromJAR())
			System.out.println("Reading: " + cl.getFileName() + " - from " + cl.getJarFilename());
		else
			System.out.println("Reading: " + cl.getFileName());
		
		if (cl.isFromJAR())
			configParser.parseFile(cl.getFileName(),true);
		else
			configParser.parseFile(cl.getFileName());
		
		// Okay, a bit of trickiness here. The dependsOnModule attribute is a reference
		// to a collection Modules. However, at this stage of things, our objects
		// aren't resolved, so if we use the wrapper interface to access this attribute,
		// we won't get anything back. So, we have to drop down to the DMO level and
		// access the attribute as named references.
		ModuleDMO moduleDMO = (ModuleDMO) currentModule.getDmcObject();
		
		Iterator<ModuleREF> refs = moduleDMO.getDependsOnModule();
		if (refs != null){
			while(refs.hasNext()){
				ModuleREF ref = refs.next();
				ConfigVersion cv = finder.getConfig(ref.getObjectName().getNameString());
				if (cv == null){
					ResultException ex = new ResultException();
					ex.addError("MVC config not found: " + ref.getObjectName());
					ex.setLocationInfo(currentModule.getFile(), currentModule.getLineNumber());
					throw(ex);
				}
				
//				DebugInfo.debug("parseConfigInternal()\n\n" + cv.getLatestVersion().toString());
				
				// Check to see if we've read this config already, if not, go for it
				if (defManager.getModule(cv.getLatestVersion().getConfigName()) == null)
					parseConfigInternal(cv.getLatestVersion());
			}
		}

	}
	
	@Override
	public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException {
		MvwDefinition definition = null;
		
		try {
			definition = (MvwDefinition) factory.createWrapper(uco);
		} catch (ClassNotFoundException e) {
			ResultException ex = new ResultException("Unknown object class: " + uco.classes.get(0));
			ex.result.lastResult().fileName(infile);
			ex.result.lastResult().lineNumber(lineNumber);
			throw(ex);
		}
		catch (ResultException ex){
			ex.setLocationInfo(infile, lineNumber);
			throw(ex);
		}
		
		definition.setLineNumber(lineNumber);
		definition.setFile(infile);
		
		defManager.addDefinition(definition);
		
		if (definition instanceof Module){
			Module config = (Module) definition;
			
			currentModule = config;
		}
		
		definition.setDefinedInModule(currentModule);

		try {
			definition.getDMO().validate();
		} catch (DmcValueExceptionSet e) {
			ResultException ex = new ResultException();
			for(DmcValueException dve: e.getExceptions()){
				ex.addError(dve.getLocalizedMessage());
			}
			ex.setLocationInfo(infile, lineNumber);
			ex.result.lastResult().moreMessages("Object class: " + definition.getConstructionClassName());
			
			throw(ex);
		}

//		System.out.println(definition.toOIF(15));
	}
	
	class ConfigWithLocation {
		Module	    	config;
		ConfigLocation	location;
		public ConfigWithLocation(ConfigLocation l) {
			location = l;
			config = null;
		}
	}
}
