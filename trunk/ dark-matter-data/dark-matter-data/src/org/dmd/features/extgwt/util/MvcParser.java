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

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmoObjectFactory;
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;
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
	
	DmoObjectFactory		factory;
	
	DmcUncheckedOIFParser	configParser;
	
	DmcUncheckedOIFParser	defParser;
	
    // Stack of configs being loaded.
    Stack<ConfigWithLocation>	configStack;

    // The file that's currently being parsed.
    String              	currFile;

    // The files that have been loaded already.
    // Key: filename
    HashMap<String,MvcConfigDMO>		loadedFiles;
    	
	public MvcParser(SchemaManager sm, ConfigFinder cf, MvcDefinitionManager dm){
		schema 		= sm;
		configParser= new DmcUncheckedOIFParser(this);
		defParser	= new DmcUncheckedOIFParser(this);
		configStack	= new Stack<ConfigWithLocation>();
		finder 		= cf;
		factory 	= new DmoObjectFactory(sm);
		defManager	= dm;
	}
	
	public void parseConfig(ConfigLocation cl) throws ResultException, DmcValueException {
		defManager.reset();
		configStack.push(new ConfigWithLocation(cl));
		configParser.parseFile(cl.getFileName());
		defManager.resolveDefinitions();
	}
	
	@Override
	public void handleObject(DmcUncheckedObject uco, String infile, int lineNumber) throws ResultException, DmcValueException {
		MvcDefinitionDMO definition = null;
		
		try {
			definition = (MvcDefinitionDMO) factory.createObject(uco);
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
		
		if (definition instanceof MvcConfigDMO){
			MvcConfigDMO config = (MvcConfigDMO) definition;
			
			// Hold on to the config object
			configStack.peek().config = config;
			
			// If we depend on other configs, load them first
			Iterator<String> depends = config.getDependsOn();
			if (depends != null){
				while(depends.hasNext()){
					System.out.println("DEPENDS ON NOT YET IMPLEMENTED");
				}
			}
			
			Iterator<String> it = config.getDefFiles();
			if (it != null){
				while(it.hasNext()){
					String fn = configStack.peek().location.getDirectory() + File.separator + it.next();
					defParser.parseFile(fn);
				}
				
				// We've finished reading all of the defFiles associated with a config,
				// so pop the config off the stack
				configStack.pop();
			}
		}
		
		System.out.println(definition.toOIF(15));
	}
	
	class ConfigWithLocation {
		MvcConfigDMO	config;
		ConfigLocation	location;
		public ConfigWithLocation(ConfigLocation l) {
			location = l;
			config = null;
		}
	}
}
