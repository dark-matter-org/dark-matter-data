package org.dmd.mvw.tools.mvwgenerator.util;

import java.util.TreeMap;

import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.CamelCaseName;
import org.dmd.dms.SchemaManager;
import org.dmd.features.extgwt.extended.MvcConfig;
import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwEvent;
import org.dmd.util.exceptions.ResultException;

/**
 * The MvwDefinitionManager manages a set of MVW definitions read from one or more .mvw 
 * configuration files.
 */
public class MvwDefinitionManager implements DmcNameResolverIF {
	
	SchemaManager							schema;


	TreeMap<CamelCaseName, MvwDefinition>	allDefs;
	
	TreeMap<CamelCaseName, Module>			modules;
	
	TreeMap<CamelCaseName, MvwEvent>		events;
	
	public MvwDefinitionManager(SchemaManager s){
		schema = s;
		init();
	}
	
	void init(){
		allDefs = new TreeMap<CamelCaseName, MvwDefinition>();
		modules = new TreeMap<CamelCaseName, Module>();
		events 	= new TreeMap<CamelCaseName, MvwEvent>();
	}
	
	public void reset(){
		init();
	}
	
	public Module getModule(String cn){
		return(modules.get(cn));
	}
	
	/**
	 * Adds the specified definition to our set of definitions.
	 * @param def
	 * @throws ResultException
	 */
	public void addDefinition(MvwDefinition def) throws ResultException {
		checkAndAdd(def,allDefs);
		
		if (def instanceof MvwEvent){
			events.put(def.getCamelCaseName(), (MvwEvent) def);
		}
	}
	
	public void resolveDefinitions() throws ResultException, DmcValueException {
		ResultException errors = null;
		
		for(MvwDefinition def : allDefs.values()){
			try {
//				def.resolveReferences(schema, this);
				def.resolveReferences(this);
			} catch (DmcValueExceptionSet e) {
				if (errors == null)
					errors = new ResultException();
				
				errors.addError("Couldn't resolve references in object: " + " " + def.getCamelCaseName());
				errors.setLocationInfo(def.getFile(), def.getLineNumber());
				
				for(DmcValueException dve : e.getExceptions()){
					errors.moreMessages(dve.getMessage());
				}
				
			}
		}
	}
	
	/**
	 * Checks that we don't already have the definition and adds it to the specified map.
	 * @param def
	 * @param map
	 * @throws ResultException
	 */
	@SuppressWarnings("unchecked")
	void checkAndAdd(MvwDefinition def, TreeMap map) throws ResultException {
		MvwDefinition existing = (MvwDefinition) map.get(def.getCamelCaseName());
		
		if (existing == null){
			map.put(def.getCamelCaseName(),def);
		}
		else{
			ResultException ex = new ResultException();
			ex.addError("The definition with name: " + def.getCamelCaseName() + " clashes with an existing definition.");
			ex.result.lastResult().moreMessages("Existing definition from file: " + def.getDefinedInModule().getFile());
			ex.setLocationInfo(def.getFile(), def.getLineNumber());
			throw(ex);
		}
	}


	@Override
	public DmcObject findNamedDMO(DmcObjectName name) {
		DmcObject 		rc 	= null;
		MvwDefinition 	d 	= allDefs.get(name);
		
		if (d != null)
			rc = d.getDmcObject();
		
		return(rc);
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
		DmcNamedObjectIF 	rc 	= null;
		MvwDefinition		d 	= allDefs.get(name);
		
		if (d == null){
			// Fall back and check the schema
			rc = schema.findNamedObject(name);
		}
		else
			rc = (DmcNamedObjectIF) d.getDmcObject();
		
		return(rc);
	}
}
