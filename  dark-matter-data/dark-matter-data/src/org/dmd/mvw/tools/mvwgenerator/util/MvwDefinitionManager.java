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
import org.dmd.mvw.tools.mvwgenerator.extended.Activity;
import org.dmd.mvw.tools.mvwgenerator.extended.BroadcastEvent;
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;
import org.dmd.mvw.tools.mvwgenerator.extended.Event;
import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwEvent;
import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.extended.View;
import org.dmd.mvw.tools.mvwgenerator.extended.WebApplication;
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
	
	// This is the first module that we loaded, and thus the target of the
	// code generation activity this time round
	Module										codeGenModule;
	WebApplication								application;
	
	TreeMap<CamelCaseName, Module>				modules;
	
//	TreeMap<CamelCaseName, MvwEvent>			mvwEevents;
	
	TreeMap<CamelCaseName, Event>				events;
	
	TreeMap<CamelCaseName, Controller>			controllers;
	
	TreeMap<CamelCaseName, Presenter>			presenters;
	
	TreeMap<CamelCaseName, Activity>			activities;
	
	TreeMap<CamelCaseName, View>				views;
	
	// These are the events that are associated with View definitions.
//	TreeMap<CamelCaseName, MvwEvent>			viewEvents;
	
	TreeMap<String,RunContextItemCollection>	contexts;
	RunContextItemCollection					defaultContext;
	
	CamelCaseName								key;
	
	public MvwDefinitionManager(SchemaManager s, DmsSchemaParser sp) throws ResultException, DmcValueException{
		schema 			= s;
		schemaParser	= sp;
		key				= new CamelCaseName();
		init();
	}
	
	void init() throws ResultException, DmcValueException{
		allDefs 		= new TreeMap<CamelCaseName, MvwDefinition>();
		modules 		= new TreeMap<CamelCaseName, Module>();
//		mvwEevents 		= new TreeMap<CamelCaseName, MvwEvent>();
		views			= new TreeMap<CamelCaseName, View>();
//		viewEvents		= new TreeMap<CamelCaseName, MvwEvent>();
		
		events			= new TreeMap<CamelCaseName, Event>();
		controllers		= new TreeMap<CamelCaseName, Controller>();
		presenters		= new TreeMap<CamelCaseName, Presenter>();
		activities		= new TreeMap<CamelCaseName, Activity>();
		
		contexts		= new TreeMap<String, RunContextItemCollection>();
		defaultContext 	= new RunContextItemCollection("Default");
		contexts.put("Default", defaultContext);
		
		readSchemas 	= new SchemaManager();
		codeGenModule	= null;
		application		= null;
	}
	
	public void reset() throws ResultException, DmcValueException{
		init();
	}
	
	public Module getCodeGenModule(){
		return(codeGenModule);
	}
	
	public RunContextItemCollection getDefaultContext(){
		return(defaultContext);
	}
	
	/**
	 * If the codegen module contains an application, this is it.
	 * @return
	 */
	public WebApplication getApplication(){
		return(application);
	}
	
	public Module getModule(String cn) throws DmcValueException{
		key.setNameString(cn);
		return(modules.get(key));
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
			
			if (codeGenModule == null)
				codeGenModule = mod;
			
			// Read any schemas the module depends on
			if (mod.getDependsOnSchemaHasValue()){
				Iterator<String> it = dmo.getDependsOnSchema();
				while(it.hasNext()){
					String ref = it.next();
					schemaParser.parseSchema(readSchemas, ref, true);
				}
			}
		}
		else if (def instanceof WebApplication){
			WebApplication app = (WebApplication) def;
			if (app.getDefinedInModule() == codeGenModule)
				application = app;
		}
//		else if (def instanceof MvwEvent){
//			mvwEevents.put(def.getCamelCaseName(), (MvwEvent) def);
//		}
		else if (def instanceof Controller){
			Controller controller = (Controller) def;
			controller.getDMO().addUseRunContextItem("eventBus");
			controllers.put(def.getCamelCaseName(), controller);
		}
		else if (def instanceof Presenter){
			Presenter presenter = (Presenter) def;
			presenter.getDMO().addUseRunContextItem("eventBus");
			presenters.put(def.getCamelCaseName(), presenter);
		}
		else if (def instanceof Activity){
			Activity activity = (Activity) def;
			activity.getDMO().addUseRunContextItem("eventBus");
			activities.put(def.getCamelCaseName(), activity);
		}
		else if (def instanceof View){
			View v = (View) def;
			views.put(def.getCamelCaseName(), v);
			
			if (v.requiresEventBus()){
				v.getDMO().addUseRunContextItem("eventBus");
			}
		}
		else if (def instanceof Event){
			events.put(def.getCamelCaseName(), (Event) def);
		}
		else if (def instanceof RunContextItem){
			RunContextItem rci = (RunContextItem) def;
			RunContextItemCollection rcic = contexts.get(rci.getContextImpl());
			
			if (rcic == null){
				rcic = new RunContextItemCollection(rci.getContextImpl());
				contexts.put(rci.getContextImpl(), rcic);
			}
			rcic.addItem(rci);
			
			// Add the item to its module
			rci.getDefinedInModule().addRunContextItem(rci);
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
			view.initCodeGenInfo();
		}
		for(Controller controller: controllers.values()){
			controller.initCodeGenInfo();
		}
		for(Event event: events.values()){
			event.checkSanity();
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
