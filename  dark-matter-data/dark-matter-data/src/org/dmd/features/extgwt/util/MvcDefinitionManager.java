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
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmg.util.GeneratorUtils;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.features.extgwt.extended.MvcAction;
import org.dmd.features.extgwt.extended.MvcApplication;
import org.dmd.features.extgwt.extended.MvcConfig;
import org.dmd.features.extgwt.extended.MvcController;
import org.dmd.features.extgwt.extended.MvcDefinition;
import org.dmd.features.extgwt.extended.MvcEvent;
import org.dmd.features.extgwt.extended.MvcMenu;
import org.dmd.features.extgwt.extended.MvcMenuItem;
import org.dmd.features.extgwt.extended.MvcMenuSeparator;
import org.dmd.features.extgwt.extended.MvcMultiView;
import org.dmd.features.extgwt.extended.MvcRegistryItem;
import org.dmd.features.extgwt.extended.MvcServerEvent;
import org.dmd.features.extgwt.extended.MvcView;
import org.dmd.util.exceptions.ResultException;

public class MvcDefinitionManager implements DmcNameResolverIF {
	
	TreeMap<String,MvcDefinition>	allDefs;
	
	TreeMap<String,MvcConfig>		configs;
	
	TreeMap<String,MvcController> 	controllers;
	
	TreeMap<String,MvcEvent>		events;
	
	TreeMap<String,MvcServerEvent>	serverEvents;
	
	TreeMap<String,MvcView>			views;
	
	TreeMap<String,MvcMultiView>	multiViews;
	
	TreeMap<String,MvcRegistryItem>	registry;
	
	TreeMap<String,MvcAction>		actions;
	
	TreeMap<String, MvcMenu>		menus;
	
	TreeMap<String, MvcMenuItem>	menuItems;
	
	TreeMap<String, MvcMenuSeparator>	menuSeparators;
	
	SchemaManager						schema;
	
	// The first config that was loaded
	MvcConfig						topLevelConfig;
	
	MvcApplication					theApplication;
	
	MvcRegistryItem					itemForApplication;

	public MvcDefinitionManager(SchemaManager sm){
		init();
		schema = sm;
		itemForApplication = new MvcRegistryItem();
		try {
			itemForApplication.setName("application");
			itemForApplication.setUserDataType("org.dmd.features.extgwt.client.ApplicationIF");
			itemForApplication.setDescription("This is the universal handle to the application.");
//			itemForApplication.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(itemForApplication.getName()));
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void init(){
		allDefs 		= new TreeMap<String, MvcDefinition>();
		configs			= new TreeMap<String, MvcConfig>();
		controllers		= new TreeMap<String, MvcController>();
		events			= new TreeMap<String, MvcEvent>();
		serverEvents	= new TreeMap<String, MvcServerEvent>();
		views			= new TreeMap<String, MvcView>();
		multiViews		= new TreeMap<String, MvcMultiView>();
		registry		= new TreeMap<String, MvcRegistryItem>();
		actions			= new TreeMap<String, MvcAction>();
		menus			= new TreeMap<String, MvcMenu>();
		menuItems		= new TreeMap<String, MvcMenuItem>();
		menuSeparators	= new TreeMap<String, MvcMenuSeparator>();
		topLevelConfig	= null;
		theApplication	= null;
	}
	
	public void reset(){
		init();
		
		// Add the default application registry item. This will be created
		// by the auto generated Application code and is used by all controllers
		// to access the overall application and map their event names to EventType
		// instances.
		registry.put(itemForApplication.getName().getNameString(), itemForApplication);
	}
	
	/**
	 * @return The top level MVC config i.e. the one that was first parsed.
	 */
	public MvcConfig getTopLevelConfig(){
		return(topLevelConfig);
	}
	
	/**
	 * Returns the config if we've already loaded it.
	 * @param n The config name.
	 * @return The config.
	 */
	public MvcConfig getConfig(String n){
		return(configs.get(n));
	}
	
	/**
	 * @return Returns the application to be generated from this set of definitions.
	 */
	public MvcApplication getTheApplication(){
		// Note, we only return an application is it's defined in the top level config,
		// otherwise, its MVC may just have been referred to by one of the modules
		// being used in the application
		if ( (theApplication != null) && (theApplication.getDefinedInMVCConfig() != topLevelConfig))
			theApplication = null;
		
		return(theApplication);
	}
	
	public TreeMap<String, MvcController> getControllers(){
		return(controllers);
	}
	
	public TreeMap<String, MvcView> getViews(){
		return(views);
	}
	
	public TreeMap<String, MvcMultiView> getMultiViews(){
		return(multiViews);
	}
	
	public Collection<MvcEvent> getEvents(){
		return(events.values());
	}
	
	public void resolveDefinitions() throws ResultException {
		ResultException errors = null;
		
		for(MvcDefinition def : allDefs.values()){
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
		
		// We populate the definesActions, definesMenu and definesMenuItem attributes
		// based on the associatedController attribute.
		
		for(MvcAction a : actions.values()){
			MvcController c = a.getAssociatedController();
			if (c != null){
				try {
					c.addDefinesAction(a);
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(MvcMenu m : menus.values()){
			MvcController c = m.getAssociatedController();
			if (c != null){
				try {
					c.addDefinesMenu(m);
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(MvcMenuItem mi : menuItems.values()){
			MvcController c = mi.getAssociatedController();
			if (c != null){
				try {
					c.addDefinesMenuItem(mi);
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(MvcMenuSeparator ms : menuSeparators.values()){
			MvcController c = ms.getAssociatedController();
			if (c != null){
				try {
					c.addDefinesMenuSeparator(ms);
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		// And some additional behind the scenes work to handle server events
		// and to tie in to the menu controller
		for(MvcController c : controllers.values()){
			if (c.usesServerEvents()){
				MvcEvent eventFramework = events.get("mvc.init.eventFramework");
				MvcRegistryItem eventController = registry.get("mvc.serverEventController");
				
				if (eventFramework == null){
					System.err.println("The " + c.getName() + " controller defines MvcServerEvents but you haven't included the dmmvc definitions.");
					System.err.println("Your application must depend on dmmvc and use the ServerEventController.");
					System.exit(1);
				}
				
				try {
					c.addHandlesEvent(eventFramework);
					c.addUsesRegistryItem(eventController);
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (c.definesMenusOrActions()){
				MvcEvent registerMenus = events.get("mvc.registerMenus");

				if (registerMenus == null){
					System.err.println("The " + c.getName() + " controller defines MvcActions, MvcMenus or MvcMenuItems but you haven't included the dmmvc definitions.");
					System.err.println("Your application must depend on dmmvc and use the MenuController.");
					System.exit(1);
				}
				
				try {
					c.addHandlesEvent(registerMenus);
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(MvcView v : views.values()){
			if (v.usesServerEvents()){
				MvcEvent eventFramework = events.get("mvc.init.eventFramework");
				MvcRegistryItem eventController = registry.get("mvc.serverEventController");
				
				if (eventFramework == null){
					System.err.println("The " + v.getName() + " view defines MvcServerEvents but you haven't included the dmmvc definitions.");
					System.err.println("Your application must depend on dmmvc and use the ServerEventController.");
					System.exit(1);
				}
				
				try {
					v.addHandlesEvent(eventFramework);
					v.addUsesRegistryItem(eventController);
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(MvcMultiView v : multiViews.values()){
			if (v.usesServerEvents()){
				MvcEvent eventFramework = events.get("mvc.init.eventFramework");
				MvcRegistryItem eventController = registry.get("mvc.serverEventController");
				
				if (eventFramework == null){
					System.err.println("The " + v.getName() + " view defines MvcServerEvents but you haven't included the dmmvc definitions.");
					System.err.println("Your application must depend on dmmvc and use the ServerEventController.");
					System.exit(1);
				}
				
				try {
					v.addHandlesEvent(eventFramework);
					v.addUsesRegistryItem(eventController);
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		if (errors != null)
			throw(errors);
		
		// Now that everything is resolved, we have some work to do
		
	}
	
	public void addDefinition(MvcDefinition def) throws ResultException, DmcValueException {
		checkAndAdd(def, allDefs);
		if (def instanceof MvcConfig){
			if (configs.size() == 0)
				topLevelConfig = (MvcConfig) def;
			
			checkAndAdd(def, configs);
		}
		else if (def instanceof MvcApplication){
			if (theApplication != null){
				ResultException ex = new ResultException();
				ex.addError("Only one application can be generated from an MvcConfig: ");
				ex.moreMessages(" First application: " + theApplication.getName());
				ex.moreMessages("Second application: " + ((MvcApplication) def).getName());
				throw(ex);
			}
			theApplication = (MvcApplication) def;
		}
		else if (def instanceof MvcController){
			checkAndAdd(def, controllers);
			((MvcController)def).addUsesRegistryItem(itemForApplication);
		}
		else if (def instanceof MvcEvent){
			MvcEvent event = (MvcEvent) def;
			checkAndAdd(def, events);
//			event.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(def.getName()));
			event.setUpperConstantName(GeneratorUtils.dotNameToUpperCaseConstant(def.getName().getNameString()));
		}
		else if (def instanceof MvcServerEvent){
//			MvcServerEvent event = (MvcServerEvent) def;
			checkAndAdd(def, serverEvents);
//			event.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(def.getName()));
		}
		else if (def instanceof MvcMultiView){
			checkAndAdd(def, multiViews);
		}
		else if (def instanceof MvcView){
			checkAndAdd(def, views);
		}
		else if (def instanceof MvcRegistryItem){
//			MvcRegistryItem regItem = (MvcRegistryItem) def;
			checkAndAdd(def, registry);
//			regItem.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(regItem.getName()));
		}
		else if (def instanceof MvcAction){
//			MvcAction action = (MvcAction) def;
			checkAndAdd(def, actions);
//			action.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(action.getName()));
		}
		else if (def instanceof MvcMenu){
//			MvcMenu menu = (MvcMenu) def;
			checkAndAdd(def, menus);
//			action.setCamelCaseName(GeneratorUtils.dotNameToCamelCase(action.getName()));
		}
		else if (def instanceof MvcMenuItem){
//			MvcMenuItem item = (MvcMenuItem) def;
			checkAndAdd(def, menuItems);
		}
		else if (def instanceof MvcMenuSeparator){
//			MvcMenuSeparator item = (MvcMenuSeparator) def;
			checkAndAdd(def, menuSeparators);
		}
	}
	
	@SuppressWarnings("unchecked")
	void checkAndAdd(MvcDefinition def, TreeMap map) throws ResultException {
		MvcDefinition existing = (MvcDefinition) map.get(def.getObjectName());
		
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

	public DmcNamedObjectIF findNamedObject(String name) {
		DmsDefinition def = (DmsDefinition) schema.findNamedObject(name);
		
		if (def != null){
			return (DmcNamedObjectIF) (def.getDmcObject());
		}
		
		return(allDefs.get(name));
	}

	@Override
	public DmcObject findNamedDMO(DmcObjectNameIF name) {
		DmsDefinition def = (DmsDefinition) schema.findNamedObject(name);
		
		if (def != null){
			return(def.getDmcObject());
		}
		
		MvcDefinition mvcdef = allDefs.get(name);
		
		if (mvcdef == null)
			return(null);
		
		return(mvcdef.getDmcObject());
	}

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectNameIF name) {
		DmsDefinition def = (DmsDefinition) schema.findNamedObject(name);
		
		if (def != null)
			return (DmcNamedObjectIF) (def.getDmcObject());
		
		return(allDefs.get(name.getNameString()));
	}

	
}