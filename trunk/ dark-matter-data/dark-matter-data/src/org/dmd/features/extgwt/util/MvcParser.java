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

import java.util.HashMap;
import java.util.Iterator;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.SchemaManager;
import org.dmd.dmw.DmwObjectFactory;
import org.dmd.features.extgwt.extended.MvcConfig;
import org.dmd.features.extgwt.extended.MvcDefinition;
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;
import org.dmd.features.extgwt.generated.types.MvcConfigREF;
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
public class MvcParser implements DmcUncheckedOIFHandlerIF {
	
	SchemaManager			schema;
	
	ConfigFinder			finder;
	
	MvcDefinitionManager	defManager;
	
//	DmoObjectFactory		factory;
	
	DmwObjectFactory		factory;
	
	DmcUncheckedOIFParser	configParser;
	
	DmcUncheckedOIFParser	defParser;
	
    // Stack of configs being loaded.
//    Stack<ConfigWithLocation>	configStack;
	MvcConfig				currentConfig;
    
    // The file that's currently being parsed.
    String              	currFile;

    // The files that have been loaded already.
    // Key: filename
    HashMap<String,MvcConfigDMO>		loadedFiles;
    	
	public MvcParser(SchemaManager sm, ConfigFinder cf, MvcDefinitionManager dm){
		schema 		= sm;
		configParser= new DmcUncheckedOIFParser(this);
		defParser	= new DmcUncheckedOIFParser(this);
//		configStack	= new Stack<ConfigWithLocation>();
		finder 		= cf;
//		factory 	= new DmoObjectFactory(sm);
		factory 	= new DmwObjectFactory(sm);
		defManager	= dm;
	}
	
	public void parseConfig(ConfigLocation cl) throws ResultException, DmcValueException {
		defManager.reset();
//		configStack.push(new ConfigWithLocation(cl));
//		configParser.parseFile(cl.getFileName());
		parseConfigInternal(cl);
		defManager.resolveDefinitions();
	}
	
	void parseConfigInternal(ConfigLocation cl) throws ResultException, DmcValueException{
		System.out.println("Reading: " + cl.getFileName());
		
		configParser.parseFile(cl.getFileName());
		
		// Okay, a bit of trickiness here. The dependsOnMVC attribute is a reference
		// to a collection MvcConfigs. However, at this stage of things, our objects
		// aren't resolved, so if we use the wrapper interface to access this attribute,
		// we won't get anything back. So, we have to drop down to the DMO level and
		// access the attribute as named references.
		MvcConfigDMO configDMO = (MvcConfigDMO) currentConfig.getDmcObject();
		
		Iterator<MvcConfigREF> refs = configDMO.getDependsOnMVC();
		if (refs != null){
			while(refs.hasNext()){
				MvcConfigREF ref = refs.next();
				ConfigVersion cv = finder.getConfig(ref.getObjectName().getNameString());
				if (cv == null){
					ResultException ex = new ResultException();
					ex.addError("MVC config not found: " + ref.getObjectName());
					ex.setLocationInfo(currentConfig.getFile(), currentConfig.getLineNumber());
					throw(ex);
				}
				
				// Check to see if we've read this config already, if not, go for it
				if (defManager.getConfig(cv.getLatestVersion().getConfigName()) == null)
					parseConfigInternal(cv.getLatestVersion());
			}
		}

	}
	
	@Override
	public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException {
		MvcDefinition definition = null;
		
		try {
			definition = (MvcDefinition) factory.createWrapper(uco);
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
		
		if (definition instanceof MvcConfig){
			MvcConfig config = (MvcConfig) definition;
			
			currentConfig = config;
			
			// Hold on to the config object
//			configStack.peek().config = config;
			
			// Okay, a bit of trickiness here. The dependsOnMVC attribute is a reference
			// to a collection MvcConfigs. However, at this stage of things, our objects
			// aren't resolved, so if we use the wrapper interface to access this attribute,
			// we won't get anything back. So, we have to drop down to the DMO level and
			// access the attribute as named references.
//			MvcConfigDMO configDMO = (MvcConfigDMO) config.getDmcObject();
//			
//			Iterator<MvcConfigREF> refs = configDMO.getDependsOnMVC();
//			if (refs != null){
//				while(refs.hasNext()){
//					MvcConfigREF ref = refs.next();
//					ConfigVersion cv = finder.getConfig(ref.getObjectName());
//					if (cv == null){
//						ResultException ex = new ResultException();
//						ex.addError("MVC config not found: " + ref.getObjectName());
//						ex.setLocationInfo(infile, lineNumber);
//						throw(ex);
//					}
//				}
//			}
			// If we depend on other configs, load them first
//			Iterator<String> depends = config.getDependsOn();
//			if (depends != null){
//				while(depends.hasNext()){
//					System.out.println("DEPENDS ON NOT YET IMPLEMENTED");
//				}
//			}
			
//			Iterator<String> it = config.getDefFiles();
//			if (it != null){
//				while(it.hasNext()){
//					String fn = configStack.peek().location.getDirectory() + File.separator + it.next();
//					defParser.parseFile(fn);
//				}
//				
//				// We've finished reading all of the defFiles associated with a config,
//				// so pop the config off the stack
//				configStack.pop();
//			}
		}
//		else if (definition instanceof MvcController){
//			((MvcController)definition).setDefinedInMVCConfig(currentConfig);
//			((MvcController)definition).setDefinedInMVCConfig(configStack.peek().config);
//		}
		
		definition.setDefinedInMVCConfig(currentConfig);
		
//		System.out.println(definition.toOIF(15));
	}
	
	class ConfigWithLocation {
		MvcConfig	    config;
		ConfigLocation	location;
		public ConfigWithLocation(ConfigLocation l) {
			location = l;
			config = null;
		}
	}
}
