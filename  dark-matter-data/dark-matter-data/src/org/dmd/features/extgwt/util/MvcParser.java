package org.dmd.features.extgwt.util;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmoObjectFactory;
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
import org.dmd.util.exceptions.DebugInfo;
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
    HashMap<String,MvcConfigDMO>	loadedFiles;


	
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
		configStack.push(new ConfigWithLocation(cl));
		configParser.parseFile(cl.getFileName());
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
