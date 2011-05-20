package org.dmd.mvw.tools.mvwgenerator.util;

import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.CamelCaseName;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.util.DmsSchemaParser;
import org.dmd.mvw.tools.mvwgenerator.extended.BroadcastEvent;
import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwEvent;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.extended.View;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ModuleDMO;
import org.dmd.mvw.tools.mvwgenerator.types.EventWithArgs;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The MvwDefinitionManager manages a set of MVW definitions read from one or more .mvw 
 * configuration files.
 */
public class MvwDefinitionManager implements DmcNameResolverIF {
	
	SchemaManager								schema;
	
	// The schemas that are read because of dependsOnSchema in modules
	SchemaManager								readSchemas;
	
	DmsSchemaParser								schemaParser;

	TreeMap<CamelCaseName, MvwDefinition>		allDefs;
	
	TreeMap<CamelCaseName, Module>				modules;
	
	TreeMap<CamelCaseName, MvwEvent>			events;
	
	TreeMap<CamelCaseName, View>				views;
	
	// These are the events that are associated with View definitions.
	TreeMap<CamelCaseName, MvwEvent>			viewEvents;
	
	TreeMap<String,RunContextItemCollection>	contexts;
	
	public MvwDefinitionManager(SchemaManager s, DmsSchemaParser sp) throws ResultException, DmcValueException{
		schema 			= s;
		schemaParser	= sp;
		init();
	}
	
	void init() throws ResultException, DmcValueException{
		allDefs 	= new TreeMap<CamelCaseName, MvwDefinition>();
		modules 	= new TreeMap<CamelCaseName, Module>();
		events 		= new TreeMap<CamelCaseName, MvwEvent>();
		views		= new TreeMap<CamelCaseName, View>();
		viewEvents	= new TreeMap<CamelCaseName, MvwEvent>();
		contexts	= new TreeMap<String, RunContextItemCollection>();
		readSchemas = new SchemaManager();
	}
	
	public void reset() throws ResultException, DmcValueException{
		init();
	}
	
	public Module getModule(String cn){
		return(modules.get(cn));
	}
	
	/**
	 * Adds the specified definition to our set of definitions.
	 * @param def
	 * @throws ResultException
	 * @throws DmcValueException 
	 */
	public void addDefinition(MvwDefinition def) throws ResultException, DmcValueException {
		checkAndAdd(def,allDefs);
		
		if (def instanceof Module){
			Module mod = (Module) def;
			ModuleDMO dmo = mod.getDMO();
			modules.put(def.getCamelCaseName(), mod);
			
			// Read any schemas the module depends on
			if (mod.getDependsOnSchemaHasValue()){
				Iterator<String> it = dmo.getDependsOnSchema();
				while(it.hasNext()){
					String ref = it.next();
					schemaParser.parseSchema(readSchemas, ref, true);
				}
			}
		}
		else if (def instanceof MvwEvent){
			events.put(def.getCamelCaseName(), (MvwEvent) def);
		}
		else if (def instanceof View){
			views.put(def.getCamelCaseName(), (View) def);
		}
		else if (def instanceof RunContextItem){
			RunContextItem rci = (RunContextItem) def;
			RunContextItemCollection rcic = contexts.get(rci.getContextImpl());
			
			if (rcic == null){
				rcic = new RunContextItemCollection(rci.getContextImpl());
				contexts.put(rci.getContextImpl(), rcic);
			}
			rcic.addItem(rci);
		}
	}
	
	public void resolveDefinitions() throws ResultException, DmcValueException {
		ResultException errors = null;
		
		for(MvwDefinition def : allDefs.values()){
			if (def instanceof View){
				DebugInfo.debug("HERE");
			}
			try {
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
		
		initCodeGenInfo();
	}
	
	void initCodeGenInfo() throws DmcValueException, ResultException {
		for(View view: views.values()){
			view.initCodeGenInfo(viewEvents);
			
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
		
		if (d == null){
			// Fall back and check the schema
			rc = schema.findNamedDMO(name);
			
			if (rc == null){
				// Try the schemas we read
				rc = readSchemas.findNamedDMO(name);
			}
		}
		else
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
			
			if (rc == null){
				rc = readSchemas.findNamedObject(name);
			}
		}
		else
			rc = (DmcNamedObjectIF) d.getDmcObject();
		
		return(rc);
	}
}
