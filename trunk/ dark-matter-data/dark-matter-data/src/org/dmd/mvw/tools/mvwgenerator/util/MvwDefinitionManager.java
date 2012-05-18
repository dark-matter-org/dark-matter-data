package org.dmd.mvw.tools.mvwgenerator.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.CamelCaseName;
import org.dmd.dmp.server.generated.DmpSchemaAG;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.types.EnumValue;
import org.dmd.dms.util.DmsSchemaParser;
import org.dmd.mvw.tools.mvwgenerator.extended.Activity;
import org.dmd.mvw.tools.mvwgenerator.extended.Component;
import org.dmd.mvw.tools.mvwgenerator.extended.Controller;
import org.dmd.mvw.tools.mvwgenerator.extended.Event;
import org.dmd.mvw.tools.mvwgenerator.extended.I18NConfig;
import org.dmd.mvw.tools.mvwgenerator.extended.Module;
import org.dmd.mvw.tools.mvwgenerator.extended.MvwDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.Place;
import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.extended.SubPlace;
import org.dmd.mvw.tools.mvwgenerator.extended.View;
import org.dmd.mvw.tools.mvwgenerator.extended.WebApplication;
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FieldEditorDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FormBindingDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.forms.GxtEnumMapping;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.ActionBinding;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuBar;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuImplementationConfig;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.MenuItem;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.Separator;
import org.dmd.mvw.tools.mvwgenerator.extended.menus.SubMenu;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ModuleDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuElementDefinitionDMW;
import org.dmd.mvw.tools.mvwgenerator.types.EditField;
import org.dmd.mvw.tools.mvwgenerator.types.RequestTypeWithOptions;
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
	
	// This is the current module that we're reading
	Module										currentModule;
	
	TreeMap<CamelCaseName, Module>				modules;
	
//	TreeMap<CamelCaseName, MvwEvent>			mvwEevents;
	
	TreeMap<CamelCaseName, Event>				events;
	
	TreeMap<CamelCaseName, Controller>			controllers;
	
	TreeMap<CamelCaseName, Presenter>			presenters;
	
	TreeMap<CamelCaseName, Activity>			activities;
	
	TreeMap<CamelCaseName, Component>			components;
	
	TreeMap<CamelCaseName, Place>				places;
	
	TreeMap<CamelCaseName, SubPlace>			subPlaces;
	
	TreeMap<CamelCaseName, View>				views;
	
	Controller									centralRpcErrorHandler;
	
	Controller									centralDmpErrorHandler;
	
	Controller									centralAsyncErrorHandler;
	RunContextItem								centralAsyncErrorHandlerRCI;
	
	TreeMap<String,RunContextItemCollection>	contexts;
	RunContextItemCollection					defaultContext;
		
	final String 								controllerSubpackage 	= "controllers";
	final String 								presenterSubpackage 	= "presenters";
	final String 								viewSubpackage 			= "views";
	final String 								activitySubpackage 		= "activities";
	
	// MENUS
	
	MenuImplementationConfig						menuImplementation;
	RunContextItem									menuFactoryRCI;
	
	TreeMap<CamelCaseName, MenuElementDefinitionDMW>	menuElements;
	
	TreeMap<CamelCaseName, MenuBar>					menuBars;
	
	TreeMap<CamelCaseName, SubMenu>					subMenus;
	
	TreeMap<CamelCaseName, MenuItem>				menuItems;
	
	TreeMap<CamelCaseName, Separator>				separators;
	
	TreeMap<CamelCaseName, ActionBinding>			actions;
	
	// FORMS
	
	TreeMap<CamelCaseName, FieldEditorDefinition>	fieldEditors;
	
	TreeMap<CamelCaseName, FormBindingDefinition>	formBindings;
	
	TreeMap<CamelCaseName, GxtEnumMapping>			enumMappings;
	
	
	// Gets set to true is any of our components send requests
	boolean										needMvwComms;
	
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
		components		= new TreeMap<CamelCaseName, Component>();
		
		places			= new TreeMap<CamelCaseName, Place>();
		subPlaces		= new TreeMap<CamelCaseName, SubPlace>();
		
		contexts		= new TreeMap<String, RunContextItemCollection>();
		defaultContext 	= new RunContextItemCollection("Default");
		contexts.put("Default", defaultContext);
		
		readSchemas 	= new SchemaManager();
		codeGenModule	= null;
		application		= null;
		needMvwComms	= false;
		
		centralDmpErrorHandler	= null;
		centralRpcErrorHandler	= null;
		
		menuImplementation		= null;
		menuFactoryRCI			= null;
		
		menuElements			= new TreeMap<CamelCaseName, MenuElementDefinitionDMW>();
		menuBars 				= new TreeMap<CamelCaseName, MenuBar>();
		subMenus 				= new TreeMap<CamelCaseName, SubMenu>();
		menuItems 				= new TreeMap<CamelCaseName, MenuItem>();
		separators				= new TreeMap<CamelCaseName, Separator>();
		actions					= new TreeMap<CamelCaseName, ActionBinding>();
		
		fieldEditors			= new TreeMap<CamelCaseName, FieldEditorDefinition>();
		formBindings			= new TreeMap<CamelCaseName, FormBindingDefinition>();
		enumMappings			= new TreeMap<CamelCaseName, GxtEnumMapping>();
	}
	
	/**
	 * We check to see if any component uses any form of central DMP error
	 * handling and if so, we ensure that we have a central DMP error handler defined.
	 * @return null if everything is ok or a set of components that need a central DMP handler otherwise.
	 */
	public ArrayList<Component> centralDmpErrorHandlingOK(){
		ArrayList<Component>	needCentral = new ArrayList<Component>();
		
		for(Component component: components.values()){
			if (component.usesCentralDmpErrorHandling()){
				needCentral.add(component);
			}
		}
		
		if (needCentral.size() == 0){
			// We have no requests with central handing - that's fine
			needCentral = null;
		}
		else{
			// We have a central DMP handler, so that's fine
			if (centralDmpErrorHandler != null)
				needCentral = null;
		}

		return(needCentral);
	}
	
	
	/**
	 * We check to see if any component uses any form of central RPC error
	 * handling and if so, we ensure that we have a central RPC error handler defined.
	 * @return null if everything is ok or a set of components that need a central RPC handler otherwise.
	 */
	public ArrayList<Component> centralRpcErrorHandlingOK(){
		ArrayList<Component>	needCentral = new ArrayList<Component>();
		
		for(Component component: components.values()){
//			DebugInfo.debug(component.getObjectName().getNameString());
			if (component.usesCentralRpcErrorHandling()){
//				DebugInfo.debug("    uses central RPC");
				needCentral.add(component);
			}
		}
		
		if (needCentral.size() == 0){
//			DebugInfo.debug("   NEED CENTRAL is empty");
			// We have no requests with central handing - that's fine
			needCentral = null;
		}
		else{
			// We have a central RPC handler, so that's fine
			if (centralRpcErrorHandler != null){
//				DebugInfo.debug("   HAVE CENTRAL HANDLER! " + centralRpcErrorHandler.getObjectName().getNameString());
				needCentral = null;
			}
		}
				
//		if (needCentral == null)
//			DebugInfo.debug("    DON'T NEED CENTRAL");
//		else
//			DebugInfo.debug("    NEED CENTRAL");

		return(needCentral);
	}
	
	public TreeMap<CamelCaseName,MenuBar> getMenuBars(){
		return(menuBars);
	}
	
	public TreeMap<CamelCaseName,SubMenu> getSubMenus(){
		return(subMenus);
	}
	
	public TreeMap<CamelCaseName,MenuItem> getMenuItems(){
		return(menuItems);
	}
	
	public TreeMap<CamelCaseName,Separator> getSeparators(){
		return(separators);
	}
	
	public TreeMap<CamelCaseName,FormBindingDefinition> getFormBindings(){
		return(formBindings);
	}
	
	public TreeMap<CamelCaseName,GxtEnumMapping> getEnumMappings(){
		return(enumMappings);
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
	
	public MenuImplementationConfig getMenuImplementation(){
		return(menuImplementation);
	}
	
	/**
	 * @return the application if the codegen module defines one.
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
		
		setSubpackage(def);
		
		if (def instanceof Module){
			Module mod = (Module) def;
			ModuleDMO dmo = mod.getDMO();
			modules.put(def.getCamelCaseName(), mod);
			
			if (codeGenModule == null)
				codeGenModule = mod;
			
			currentModule = mod;
			
			// Read any schemas the module depends on
			if (mod.getDependsOnSchemaHasValue()){
				Iterator<String> it = dmo.getDependsOnSchema();
				while(it.hasNext()){
					String ref = it.next();
					schemaParser.parseSchema(readSchemas, ref, false);
				}
			}
		}
		else if (def instanceof WebApplication){
			WebApplication app = (WebApplication) def;
			if (app.getDefinedInModule() == codeGenModule){
				application = app;
				
				// We create an internal run context item for the generated PlaceHistoryMapper
				RunContextItem rci = new RunContextItem();
				rci.setAutoCreated(true);
				RunContextItemCollection rcic = contexts.get(rci.getContextImpl());
				
				rci.setItemName("historyMapper");
				rci.setDescription("This is the auto generated run context item that provides a handle to the application specific PlaceHistoryMapper for a web application.");
				rci.setItemOrder(7);
				rci.setUseClass(codeGenModule.getGenPackage() + ".generated.mvw.places." + app.getAppName() + "PlaceHistoryMapper");
				rci.setConstruction("GWT.create(" + app.getAppName() + "PlaceHistoryMapper.class)");
				rci.addImportThis("com.google.gwt.core.client.GWT");
				rci.setDefinedInModule(app.getDefinedInModule());
				
				if (rcic == null){
					rcic = new RunContextItemCollection(rci.getContextImpl());
					contexts.put(rci.getContextImpl(), rcic);
				}
				rcic.addItem(rci);
				
				// Add the item to its module
				rci.getDefinedInModule().addRunContextItem(rci);

			}
		}
		else if (def instanceof Controller){
			Controller controller = (Controller) def;
//			controller.getDMO().addUsesRunContextItem("eventBus");
			controllers.put(def.getCamelCaseName(), controller);
			components.put(def.getCamelCaseName(), controller);
			
			RunContextItem controllerRCI = null;
			if (controller.isAddedToRunContext()){
				// All Controllers run for the life of the application and so, are added to the run context
				// so that they are created on start up
				controllerRCI = new RunContextItem();
				controllerRCI.setAutoCreated(true);
				RunContextItemCollection rcic = contexts.get(controllerRCI.getContextImpl());
				
				controllerRCI.setItemName(controller.getControllerName().getNameString() + "RCI");
				controllerRCI.setDescription("The auto generated run context item for the " + controller.getControllerName());
				
				if (controller.getSubpackage() == null)
					controllerRCI.setUseClass(currentModule.getGenPackage() + ".extended." + controller.getControllerName());
				else
					controllerRCI.setUseClass(currentModule.getGenPackage() + ".extended." + controller.getSubpackage() + "." + controller.getControllerName());
					
				if (controller.usesRunContext())
					controllerRCI.setConstruction("new " + controller.getControllerName() + "(this)");
				else
					controllerRCI.setConstruction("new " + controller.getControllerName() + "()");
				
				controllerRCI.setDefinedInModule(controller.getDefinedInModule());
				
				if (controller.getItemOrder() != null)
					controllerRCI.setItemOrder(controller.getItemOrder());
				
				if (rcic == null){
					rcic = new RunContextItemCollection(controllerRCI.getContextImpl());
					contexts.put(controllerRCI.getContextImpl(), rcic);
				}
				rcic.addItem(controllerRCI);
				
				// Add the item to its module
				controllerRCI.getDefinedInModule().addRunContextItem(controllerRCI);
				
//DebugInfo.debug("\n" + rci.toOIF());
				
				// Tell the controller its item
				controller.setRunContextItem(controllerRCI);
				
				// Add to all definitions so that references can be resolved
				controllerRCI.setCamelCaseName(controllerRCI.getObjectName());
				checkAndAdd(controllerRCI,allDefs);

			}
			
			if (controller.isCentralRPCErrorHandler()){
				if (centralRpcErrorHandler != null){
					ResultException ex = new ResultException();
					ex.addError("Multiple controllers are specified as the central RPC error handler.");
					ex.result.lastResult().moreMessages(centralRpcErrorHandler.getControllerName() + " in " + centralRpcErrorHandler.getDefinedInModule().getFile() + " at line " + centralRpcErrorHandler.getDefinedInModule().getLineNumber());
					ex.result.lastResult().moreMessages(controller.getControllerName() + " in " + controller.getDefinedInModule().getFile() + " at line " + controller.getDefinedInModule().getLineNumber());
					throw(ex);
				}
				centralRpcErrorHandler = controller;
			}
			if (controller.isCentralDMPErrorHandler()){
				if (centralDmpErrorHandler != null){
					ResultException ex = new ResultException();
					ex.addError("Multiple controllers are specified as the central DMP error handler.");
					ex.result.lastResult().moreMessages(centralDmpErrorHandler.getControllerName() + " in " + centralDmpErrorHandler.getDefinedInModule().getFile() + " at line " + centralDmpErrorHandler.getDefinedInModule().getLineNumber());
					ex.result.lastResult().moreMessages(controller.getControllerName() + " in " + controller.getDefinedInModule().getFile() + " at line " + controller.getDefinedInModule().getLineNumber());
					throw(ex);
				}
				centralDmpErrorHandler = controller;
			}
			if (controller.isCentralAsyncErrorHandler()){
				if (centralAsyncErrorHandler != null){
					ResultException ex = new ResultException();
					ex.addError("Multiple controllers are specified as the central asynchronous code loading error handler.");
					ex.result.lastResult().moreMessages(centralAsyncErrorHandler.getControllerName() + " in " + centralAsyncErrorHandler.getDefinedInModule().getFile() + " at line " + centralDmpErrorHandler.getDefinedInModule().getLineNumber());
					ex.result.lastResult().moreMessages(controller.getControllerName() + " in " + controller.getDefinedInModule().getFile() + " at line " + controller.getDefinedInModule().getLineNumber());
					throw(ex);
				}
				centralAsyncErrorHandler = controller;
				centralAsyncErrorHandlerRCI = controllerRCI;
//				
//				// We will fill in the details of the predefined place holder context item - defined in the mvw module
//				RunContextItemCollection rcic = contexts.get(controllerRCI.getContextImpl());
//				RunContextItem rci = rcic.getItem("centralAsyncErrorHandler");
//
//				// The construction is just the assignment of the controller to this item
//				rci.setConstruction(controllerRCI.getItemName());
//
//				int order = controllerRCI.getItemOrder() + 1;
//				rci.setItemOrder(order);
				
			}
		}
		else if (def instanceof Presenter){
			Presenter presenter = (Presenter) def;
//			presenter.getDMO().addUsesRunContextItem("eventBus");
			presenters.put(def.getCamelCaseName(), presenter);
			components.put(def.getCamelCaseName(), presenter);
			
			// All Presenters are available for access from the run context. They are created on demand.
			RunContextItem rci = new RunContextItem();
			rci.setAutoCreated(true);
			RunContextItemCollection rcic = contexts.get(rci.getContextImpl());
			
			rci.setItemName(presenter.getPresenterName().getNameString() + "RCI");
			rci.setDescription("The auto generated run context item for the " + presenter.getPresenterName());
			
			if (presenter.getSubpackage() == null)
				rci.setUseClass(currentModule.getGenPackage() + ".extended." + presenter.getPresenterName());
			else
				rci.setUseClass(currentModule.getGenPackage() + ".extended." + presenter.getSubpackage() + "." + presenter.getPresenterName());
				
			if (presenter.usesRunContext()){
				if (presenter.isCodeSplit())
					rci.setConstruction("new " + presenter.getPresenterName() + "(thisContext)");
				else
					rci.setConstruction("new " + presenter.getPresenterName() + "(this)");
			}
			else
				rci.setConstruction("new " + presenter.getPresenterName() + "()");
			
			rci.setDefinedInModule(presenter.getDefinedInModule());
			
			rci.setPresenter(presenter);
			
			if (rcic == null){
				rcic = new RunContextItemCollection(rci.getContextImpl());
				contexts.put(rci.getContextImpl(), rcic);
			}
			rcic.addItem(rci);
			
			// Add the item to its module
			rci.getDefinedInModule().addRunContextItem(rci);
			
			// We make it so that the presenter instance is created as required
			rci.setCreateOnDemand(true);
			rci.setSingleton(presenter.isSingleton());
			
			// Tell the presenter its item
			presenter.setRunContextItem(rci);
			
			// Also add to our full set of definitions
			allDefs.put(rci.getItemName(), rci);
			
		}
		else if (def instanceof Activity){
			Activity activity = (Activity) def;
//			if (activity.getHandlesEventHasValue())
//				activity.getDMO().addUsesRunContextItem("eventBus");
//			if (activity.getFiresEventHasValue())
//				activity.getDMO().addUsesRunContextItem("eventBus");
			activities.put(def.getCamelCaseName(), activity);
			components.put(def.getCamelCaseName(), activity);
		}
		else if (def instanceof View){
			View view = (View) def;
			views.put(def.getCamelCaseName(), view);
			
			if (view.requiresEventBus()){
				view.getDMO().addUsesRunContextItem("eventBus");
			}
			
			// All Views are available for access from the run context. They are created on demand.
			RunContextItem rci = new RunContextItem();
			rci.setAutoCreated(true);
			RunContextItemCollection rcic = contexts.get(rci.getContextImpl());
			
			rci.setItemName(view.getViewName().getNameString() + "RCI");
			rci.setDescription("The auto generated run context item for the " + view.getViewName());
			
			if (view.getSubpackage() == null)
				rci.setUseClass(currentModule.getGenPackage() + ".extended." + view.getViewName());
			else
				rci.setUseClass(currentModule.getGenPackage() + ".extended." + view.getSubpackage() + "." + view.getViewName());
				
			// BIG NOTE: we don't specify the arguments to the constructor, this will depend on figuring
			// out if the component needs run context items
			rci.setConstruction("new " + view.getViewName());
			// NOTE: in addition to setting the construction mechanism, we also set the view
			// on the context item so that it knows how create the on demand methed that takes
			// the View's presenter.
			rci.setView(view);
			rci.setDefinedInModule(view.getDefinedInModule());
			
			if (rcic == null){
				rcic = new RunContextItemCollection(rci.getContextImpl());
				contexts.put(rci.getContextImpl(), rcic);
			}
			rcic.addItem(rci);
			
			// Add the item to its module
			rci.getDefinedInModule().addRunContextItem(rci);
			
			// We make it so that the view instance is created as required
			rci.setCreateOnDemand(true);
//			rci.setTheOne(view.isTheOne());
			
			// Tell the presenter its item
			view.setRunContextItem(rci);

		}
		else if (def instanceof Event){
			events.put(def.getCamelCaseName(), (Event) def);
		}
		else if (def instanceof Place){
			places.put(def.getCamelCaseName(), (Place) def);
		}
		else if (def instanceof SubPlace){
			subPlaces.put(def.getCamelCaseName(), (SubPlace) def);
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
		else if (def instanceof I18NConfig){
			I18NConfig i18n = (I18NConfig) def;
			RunContextItemCollection rcic = contexts.get(i18n.getContextImpl());
			
			if (rcic == null){
				rcic = new RunContextItemCollection(i18n.getContextImpl());
				contexts.put(i18n.getContextImpl(), rcic);
			}
			rcic.addItem(i18n);
			
			// Add the item to its module
			i18n.getDefinedInModule().addRunContextItem(i18n);
		}
		else if (def instanceof MenuBar){
			MenuBar menu = (MenuBar) def;
			menuBars.put(menu.getCamelCaseName(), menu);
			menuElements.put(menu.getCamelCaseName(), menu);
		}
		else if (def instanceof SubMenu){
			SubMenu menu = (SubMenu) def;
			subMenus.put(menu.getCamelCaseName(), menu);
			menuElements.put(menu.getCamelCaseName(), menu);
		}
		else if (def instanceof MenuItem){
			MenuItem item = (MenuItem) def;
			menuItems.put(item.getCamelCaseName(), item);
			menuElements.put(item.getCamelCaseName(), item);
		}
		else if (def instanceof Separator){
			Separator sep = (Separator) def;
			separators.put(sep.getCamelCaseName(), sep);
			menuElements.put(sep.getCamelCaseName(), sep);
		}
		else if (def instanceof ActionBinding){
			ActionBinding action = (ActionBinding) def;
			actions.put(action.getCamelCaseName(), action);
		}
		else if (def instanceof MenuImplementationConfig){
			if (menuImplementation == null){
				menuImplementation = (MenuImplementationConfig) def;
				
				// The menu factory specified by the menu implementation is added 
				// as a run context item.
				RunContextItem rci = new RunContextItem();
				rci.setAutoCreated(true);
				RunContextItemCollection rcic = contexts.get(rci.getContextImpl());
				
				rci.setItemName("menuFactory");
				rci.setDescription("The auto generated run context item for the generic menuFactory; this was created because a MenuImplementationConfig was provided by the " + menuImplementation.getDefinedInModule().getModuleName() + " module");

				rci.setUseClass("org.dmd.mvw.client.mvwmenus.base.MvwMenuFactory");
				rci.setItemOrder(16);
					
				// We use the class specified in the menu implementation config to
				// create the construction call.
				rci.setConstruction("new " + menuImplementation.getUseClass() + "()");
				rci.setDefinedInModule(menuImplementation.getDefinedInModule());
				
				if (rcic == null){
					rcic = new RunContextItemCollection(rci.getContextImpl());
					contexts.put(rci.getContextImpl(), rcic);
				}
				rcic.addItem(rci);
				
				// Add the item to its module
				rci.getDefinedInModule().addRunContextItem(rci);
				
				menuFactoryRCI = rci;
			}
			else{
				MenuImplementationConfig config = (MenuImplementationConfig) def;
				ResultException ex = new ResultException();
				ex.addError("Multiple menu implementations are specified as part of your loaded modules; only one menu implementation can be used.");
				ex.result.lastResult().moreMessages("Menus from " + menuImplementation.getConfigName() + " defined in module " + menuImplementation.getDefinedInModule().getModuleName());
				ex.result.lastResult().moreMessages("Menus from " + config.getConfigName() + " defined in module " + config.getDefinedInModule().getModuleName());
				throw(ex);
			}
		}
		else if(def instanceof FieldEditorDefinition){
			FieldEditorDefinition fed = (FieldEditorDefinition) def;
			fieldEditors.put(fed.getEditorName(), fed);
		}
		else if (def instanceof FormBindingDefinition){
			FormBindingDefinition fbd = (FormBindingDefinition) def;
			formBindings.put(fbd.getBindingName(), fbd);
		}
		else if (def instanceof GxtEnumMapping){
			GxtEnumMapping gem = (GxtEnumMapping) def;
			enumMappings.put(gem.getMappingName(), gem);
		}
		
		if (def instanceof Component){
			Component component = (Component) def;
			
			if (component.getHandlesEventHasValue())
				component.getDMO().addUsesRunContextItem("eventBus");
			
			if (component.getFiresEventHasValue())
				component.getDMO().addUsesRunContextItem("eventBus");
			
			
			
//			if (component.getSendsGetRequestHasValue()){
//				component.getDMO().addUsesRunContextItem("commsController");
//				needMvwComms = true;
//			}
//			else 
			if (component.getSendsRequestHasValue()){
				component.getDMO().addUsesRunContextItem("commsController");
				needMvwComms = true;
			}
//			else if (component.getSendsActionRequestHasValue()){
//				component.getDMO().addUsesRunContextItem("commsController");
//				needMvwComms = true;
//			}
//			else if (component.getSendsCreateRequestHasValue()){
//				component.getDMO().addUsesRunContextItem("commsController");
//				needMvwComms = true;
//			}
//			else if (component.getSendsDeleteRequestHasValue()){
//				component.getDMO().addUsesRunContextItem("commsController");
//				needMvwComms = true;
//			}
//			else if (component.getSendsSetRequestHasValue()){
//				component.getDMO().addUsesRunContextItem("commsController");
//				needMvwComms = true;
//			}
//			else if (component.getSendsLoginRequestHasValue()){
//				component.getDMO().addUsesRunContextItem("commsController");
//				needMvwComms = true;
//			}
//			else if (component.getSendsLogoutRequestHasValue()){
//				component.getDMO().addUsesRunContextItem("commsController");
//				needMvwComms = true;
//			}
		}
	}
	
	void setSubpackage(MvwDefinition definition){
		Module mod = definition.getDefinedInModule();
		
		if (mod.isUsingStandardSubpackages()){
			if (definition instanceof Component){
				Component component = (Component) definition;
				
				if (component.getSubpackage() == null){
					if (component instanceof Controller)
						component.setSubpackage(controllerSubpackage);
					else if (component instanceof Presenter)
						component.setSubpackage(presenterSubpackage);
					else if (component instanceof Activity)
						component.setSubpackage(activitySubpackage);
				}
			}
			else if (definition instanceof View){
				if (((View)definition).getSubpackage() == null)
					((View)definition).setSubpackage(viewSubpackage);
			}
		}
	}
	
	public void resolveDefinitions() throws ResultException, DmcValueException {
		ResultException errors = null;
		
		if (needMvwComms){
			key.setNameString("mvwcomms");
			if (modules.get(key) == null){
				ResultException ex = new ResultException();
				ex.addError("One or more of your components specify that they send Dark Matter Protocol messages, but you haven't loaded the mvwcomms module.");
				throw(ex);
			}
		}
		
		for(MvwDefinition def : allDefs.values()){
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
		
//		for(Place place: places.values()){
//			Activity activity = place.getRunsActivity();
//			if (activity.getPlace() == null){
//				activity.setPlace(place);
//			}
//			else{
//				ResultException ex = new ResultException();
//				ex.addError("Multiple places are attempting to run the same Activity: " + activity.getActivityName());
//				Place p = activity.getPlace();
//				ex.result.lastResult().moreMessages(p.getPlaceName() + " defined in " + p.getDefinedInModule().getModuleName());
//				ex.result.lastResult().moreMessages(place.getPlaceName() + " defined in " + place.getDefinedInModule().getModuleName());
//				throw(ex);
//			}
//		}
		
		// Try to create the back association between Actions and their implementors
		for(Controller controller: controllers.values()){			
			if (controller.getImplementsActionHasValue()){
				for(ActionBinding action: controller.getImplementsActionIterable()){
					if (action.getImplementedBy() == null)
						action.setImplementedBy(controller);
					else{
						if (errors == null)
							errors = new ResultException();
						
						Component existing = action.getImplementedBy();
						errors.addError("Multiple components implement the " + action.getActionBindingName() + " action.");
						errors.result.lastResult().moreMessages(existing.getComponentName() + " in file " + existing.getFile() + ":" + existing.getLineNumber());
						errors.result.lastResult().moreMessages(controller.getComponentName() + " in file " + controller.getFile() + ":" + controller.getLineNumber());
					}
				}
				
				// We also verify that the module in which the component is defined depends on
				// the mvwmenus module, since we need the MenuController to be injected into
				// Component to allow for registration of the actions
				if (!controller.getDefinedInModule().dependsOnModuleContains("mvwmenus")){
					if (errors == null)
						errors = new ResultException();
					
					errors.addError("The " + controller.getDefinedInModule().getModuleName() + " module must depend on the mvwmenus module.");
					errors.result.lastResult().moreMessages(controller.getDefinedInModule().getFile());
				}
				else{
					// We have the mvwmenus module, so indicate that the component uses the menu controller 
					key.setNameString("MenuControllerRCI");
					RunContextItemCollection rcic = contexts.get("Default");
					RunContextItem rci = rcic.getItem("MenuControllerRCI");
					controller.addUsesRunContextItem(rci);
				}
			}
		}
		
		// And ensure that all actions are implemented
		for(ActionBinding action: actions.values()){
			if (action.getImplementedBy() == null){
				if (errors == null)
					errors = new ResultException();
				
				errors.addError("The " + action.getActionBindingName() + " action is not implemented by any Controller, Presenter or Activity.");
			}
		}
		
		if (application != null){
			if (centralAsyncErrorHandler != null){
				DebugInfo.debug("CHANGING THE PLACEHOLDER");
									// We will fill in the details of the predefined place holder context item - defined in the mvw module
				RunContextItemCollection rcic = contexts.get(centralAsyncErrorHandlerRCI.getContextImpl());
				RunContextItem rci = rcic.getItem("centralAsyncErrorHandler");
					
				// The construction is just the assignment of the controller to this item
				rci.setConstruction(centralAsyncErrorHandlerRCI.getItemName());

				int order = centralAsyncErrorHandlerRCI.getItemOrder() + 1;
				rci.setItemOrder(order);
			}
								
			// We're generating the application, so some additional checking is required
			if (menuBars.size() > 0){
				// We have menu related functionality, so the application must specify a
				// menu implementation
				if (application.getMenuImplementation() == null){
					if (errors == null)
						errors = new ResultException();
					
					errors.addError("The " + application.getAppName() + " uses menu functionality and you must set the menuImplementation.");
				}
				
				try{
					menuImplementation.validateImplementations(menuElements);
				}
				catch(ResultException ex){
					if (errors == null)
						errors = ex;
					else
						errors.result.addResults(ex.result);
				}
				
				// We create a run context item for the menu builder that we'll generate.
				// It will be instantiated after all other components are initialized.
				// All Presenters are available for access from the run context. They are created on demand.
				RunContextItem rci = new RunContextItem();
				rci.setAutoCreated(true);
				RunContextItemCollection rcic = contexts.get(rci.getContextImpl());
				
				rci.setItemName("menuBuilder");
				rci.setItemOrder(200);
				rci.setUseClass(application.getDefinedInModule().getGenPackage() + ".generated.mvw." + application.getAppName() + "MenuBuilder");
				rci.setConstruction("new " + application.getAppName() + "MenuBuilder" + "(this)");
				rci.setDefinedInModule(application.getDefinedInModule());
				
				if (rcic == null){
					rcic = new RunContextItemCollection(rci.getContextImpl());
					contexts.put(rci.getContextImpl(), rcic);
				}
				rcic.addItem(rci);
				
				// Add the item to its module
				rci.getDefinedInModule().addRunContextItem(rci);

				
				// Some additional checking to allow the use of display labels from I18N resources
				for(MenuElementDefinitionDMW def: menuElements.values()){
					try{
						if (def instanceof MenuItem){
							MenuItem item = (MenuItem) def;
								item.initLabelInfo(defaultContext);
						}
						else if (def instanceof SubMenu){
							SubMenu submenu = (SubMenu) def;
							submenu.initLabelInfo(defaultContext);
						}
					}
					catch(ResultException ex){
						if (errors == null)
							errors = ex;
						else
							errors.result.addResults(ex.result);
					}
				}
				
			}
		}
		
		if (formBindings.size() > 0){
			for(FormBindingDefinition fbd: formBindings.values()){
				// We only do this checking if we're generated code for the 
				// binding definition's module. Otherwise, in autogen mode
				// we will get multiple errors.
				if (fbd.getDefinedInModule() == codeGenModule){
					for(EditField field: fbd.getEditFieldIterable()){
						key.setNameString(field.getFieldEditor());
						FieldEditorDefinition fed = fieldEditors.get(key);
						
						if (fed == null){
							if (errors == null)
								errors = new ResultException();
							
							errors.addError("Unknown FieldEditorDefinition reference: " + field.getFieldEditor());
							errors.result.lastResult().fileName(fbd.getFile());
							errors.result.lastResult().lineNumber(fbd.getLineNumber());
						}
						else
							field.setEditorDef(fed);
						
						AttributeDefinition	def = readSchemas.adef(field.getAttribute());
						if (def == null){
							if (errors == null)
								errors = new ResultException();
							
							errors.addError("Unknown attribute reference: " + field.getAttribute());
							errors.result.lastResult().fileName(fbd.getFile());
							errors.result.lastResult().lineNumber(fbd.getLineNumber());
						}
						else{
							field.setAttrDef(def);
							
							if (fbd.isStrictlyChecked()){
								ClassDefinition cd = (ClassDefinition) fbd.getEditObject();
								if (cd.hasAttribute(def.getName().getNameString()) == null){
									if (errors == null)
										errors = new ResultException();
									
									errors.addError("Attribute: " + field.getAttribute() + " is not an attribute of editObject: " + cd.getName());
									errors.result.lastResult().fileName(fbd.getFile());
									errors.result.lastResult().lineNumber(fbd.getLineNumber());
								}
							}
						}
						
					}
				}
			}
		}
		
		if (enumMappings.size() > 0){
			for(GxtEnumMapping mapping: enumMappings.values()){
				if (mapping.getDefinedInModule() == codeGenModule){
					EnumDefinition ed = readSchemas.isEnum(mapping.getEnumName());
					if (ed == null){
						if (errors == null)
							errors = new ResultException();
						
						errors.addError(mapping.getEnumName() + " is not a known enum type.");
						errors.result.lastResult().fileName(mapping.getFile());
						errors.result.lastResult().lineNumber(mapping.getLineNumber());
					}
					else{
						mapping.setEnumDef(ed);
					
						EnumValue ev = ed.getEnumValue(mapping.getUnsetValue());
						if (ev == null){
							if (errors == null)
								errors = new ResultException();
							
							errors.addError(mapping.getUnsetValue() + " is not a valid member of enum: " + ed.getName());
							errors.result.lastResult().fileName(mapping.getFile());
							errors.result.lastResult().lineNumber(mapping.getLineNumber());
							
						}
					}
				}
			}
		}
		
		if (components.size() > 0){
			for(Component component: components.values()){
				if (component.getSendsRequestHasValue()){
					if (readSchemas.isSchema("dmp") == null){
						DmpSchemaAG dmp = new DmpSchemaAG();
						readSchemas.manageSchema(dmp);
					}
					
					component.getDMO().addUsesRunContextItem("commsController");
					needMvwComms = true;
					// Try to resolve reference to the request being sent and set the 
					// import information
					for(RequestTypeWithOptions rq: component.getSendsRequestIterable()){
						String request = rq.getRequestType() + "Request";
						String response = rq.getRequestType() + "Response";
						ClassDefinition cd = readSchemas.cdef(request);
						if (cd == null){
							ResultException ex = new ResultException();
							ex.addError("Unknown request type: " + request);
							ex.result.lastResult().lineNumber(component.getLineNumber());
							ex.result.lastResult().fileName(component.getFile());
							throw(ex);
						}
						rq.setRequestImport(cd.getDmoImport());
						
						cd = readSchemas.cdef(response);
						if (cd == null){
							ResultException ex = new ResultException();
							ex.addError("Unknown response type: " + response);
							ex.result.lastResult().lineNumber(component.getLineNumber());
							ex.result.lastResult().fileName(component.getFile());
							throw(ex);
						}
						rq.setResponseImport(cd.getDmoImport());
						
						if (rq.isUsingClassInfo()){
							cd = readSchemas.cdef(rq.getClassName());
							if (cd == null){
								ResultException ex = new ResultException();
								ex.addError("Unknown class: " + rq.getClassName() + " in " + rq.getRequestType() + "Request spec");
								ex.result.lastResult().lineNumber(component.getLineNumber());
								ex.result.lastResult().fileName(component.getFile());
								throw(ex);
							}
							rq.setClassImport(cd.getDmoImport());
							
							if (rq.getRequestType().equals("Set") || rq.getRequestType().equals("Delete")){
								if (cd.getIsNamedBy() == null){
									ResultException ex = new ResultException();
									ex.addError(rq.getRequestType() + "Requests are only applicable to named objects.");
									ex.result.lastResult().lineNumber(component.getLineNumber());
									ex.result.lastResult().fileName(component.getFile());
									throw(ex);
								}
							}
						}
					}
				}
			}
		}
		
		if (errors != null)
			throw(errors);
		
		initCodeGenInfo();
	}
	
	void initCodeGenInfo() throws DmcValueException, ResultException {
		boolean rpc 					= false;
		boolean dmp 					= false;
		boolean	needAsyncErrorHandler	= false;
		
		if (centralDmpErrorHandler != null)
			dmp = true;
		if (centralRpcErrorHandler != null)
			rpc = true;
		
		for(View view: views.values()){
			view.initCodeGenInfo();
		}
		for(Controller controller: controllers.values()){
			controller.initCodeGenInfo(rpc,dmp);
		}
		for(Presenter presenter: presenters.values()){
			presenter.initCodeGenInfo(rpc,dmp);
		}
		for(Activity activity: activities.values()){
			activity.initCodeGenInfo(rpc,dmp);
			if (activity.isCodeSplit())
				needAsyncErrorHandler = true;
		}
		for(Event event: events.values()){
			event.checkSanity();
		}
		for(Place place: places.values()){
			place.initCodeGenInfo();
		}
		for(ActionBinding action: actions.values()){
			action.initCodeGenInfo();
		}
		
		if ((application != null) && needAsyncErrorHandler && (centralAsyncErrorHandler == null)){
			ResultException ex = new ResultException();
			ex.addError("One or more elements make use of code splitting, but no Controller is defined as the centralAsyncErrorHandler.");
			throw(ex);
		}
	}
	
	void resetCodeGenInfo(){
		for(View view: views.values()){
			view.resetCodeGenInfo();
		}
		for(Controller controller: controllers.values()){
			controller.resetCodeGenInfo();
		}
		for(Presenter presenter: presenters.values()){
			presenter.resetCodeGenInfo();
		}
		for(Activity activity: activities.values()){
			activity.resetCodeGenInfo();
		}
		for(Event event: events.values()){
			event.resetCodeGenInfo();
		}
		for(Place place: places.values()){
			place.resetCodeGenInfo();
		}
		for(ActionBinding action: actions.values()){
			action.resetCodeGenInfo();
		}
	}
	
	/**
	 * Checks that we don't already have the definition and adds it to the specified map.
	 * @param def
	 * @param map
	 * @throws ResultException
	 */
	@SuppressWarnings("unchecked")
	void checkAndAdd(MvwDefinition def, @SuppressWarnings("rawtypes") TreeMap map) throws ResultException {
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

	@Override
	public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
		return(findNamedObject(name));
	}
	
	public SchemaManager getSchema() {
		return schema;
	}

	public SchemaManager getReadSchemas() {
		return readSchemas;
	}

	public TreeMap<CamelCaseName, MvwDefinition> getAllDefs() {
		return allDefs;
	}

	public TreeMap<CamelCaseName, Module> getModules() {
		return modules;
	}

	public TreeMap<CamelCaseName, Event> getEvents() {
		return events;
	}

	public TreeMap<CamelCaseName, Controller> getControllers() {
		return controllers;
	}

	public TreeMap<CamelCaseName, Presenter> getPresenters() {
		return presenters;
	}

	public TreeMap<CamelCaseName, Activity> getActivities() {
		return activities;
	}

	public TreeMap<CamelCaseName, Component> getComponents() {
		return components;
	}

	public TreeMap<CamelCaseName, Place> getPlaces() {
		return places;
	}

	public TreeMap<CamelCaseName, SubPlace> getSubPlaces() {
		return subPlaces;
	}

	public TreeMap<CamelCaseName, View> getViews() {
		return views;
	}

	public Controller getCentralRpcErrorHandler() {
		return centralRpcErrorHandler;
	}

	public Controller getCentralDmpErrorHandler() {
		return centralDmpErrorHandler;
	}

	public TreeMap<String, RunContextItemCollection> getContexts() {
		return contexts;
	}

	public String getControllerSubpackage() {
		return controllerSubpackage;
	}

	public String getPresenterSubpackage() {
		return presenterSubpackage;
	}

	public String getViewSubpackage() {
		return viewSubpackage;
	}

	public String getActivitySubpackage() {
		return activitySubpackage;
	}

	public RunContextItem getMenuFactoryRCI() {
		return menuFactoryRCI;
	}

	public TreeMap<CamelCaseName, MenuElementDefinitionDMW> getMenuElements() {
		return menuElements;
	}

	public TreeMap<CamelCaseName, ActionBinding> getActions() {
		return actions;
	}

	public TreeMap<CamelCaseName, FieldEditorDefinition> getFieldEditors() {
		return fieldEditors;
	}

	/**
	 * This method is used to build a superset of definitions read from many different
	 * .mvw files.
	 * @param mdm The 
	 */
	public void mergeDefinitions(MvwDefinitionManager mdm){
		Iterator<SchemaDefinition>	schemas = mdm.readSchemas.getSchemas();
		while(schemas.hasNext()){
			SchemaDefinition sd = schemas.next();
			try {
				if (readSchemas.isSchema(sd.getName().getNameString()) == null)
					readSchemas.manageSchemaInternal(sd, false);
			} catch (ResultException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (mdm.application != null){
			allDefs.put(mdm.application.getCamelCaseName(), mdm.application);
		}
		
		for(Module def: mdm.modules.values()){
			modules.put(def.getCamelCaseName(), def);
			allDefs.put(def.getCamelCaseName(), def);
		}
		
		for(Event def: mdm.events.values()){
			events.put(def.getCamelCaseName(), def);
			allDefs.put(def.getCamelCaseName(), def);
		}
		
		for(Controller def: mdm.controllers.values()){
			controllers.put(def.getCamelCaseName(), def);
			allDefs.put(def.getCamelCaseName(), def);
		}
		
		for(Presenter def: mdm.presenters.values()){
			presenters.put(def.getCamelCaseName(), def);
			allDefs.put(def.getCamelCaseName(), def);
		}
		
		for(Activity def: mdm.activities.values()){
			activities.put(def.getCamelCaseName(), def);
			allDefs.put(def.getCamelCaseName(), def);
		}
		
		for(Place def: mdm.places.values()){
			places.put(def.getCamelCaseName(), def);
			allDefs.put(def.getCamelCaseName(), def);
		}
		
		for(SubPlace def: mdm.subPlaces.values()){
			subPlaces.put(def.getCamelCaseName(), def);
			allDefs.put(def.getCamelCaseName(), def);
		}
		
		for(View def: mdm.views.values()){
			views.put(def.getCamelCaseName(), def);
			allDefs.put(def.getCamelCaseName(), def);
		}
		
		for(ActionBinding def: mdm.actions.values()){
			actions.put(def.getCamelCaseName(), def);
			allDefs.put(def.getCamelCaseName(), def);
		}
		
		for(RunContextItemCollection collection: mdm.contexts.values()){
			RunContextItemCollection ourCollection = contexts.get(collection.implName);
			
			if (ourCollection == null){
				System.out.println("UNKNOWN CONTEXT: " + collection.implName);
				System.exit(1);
			}
			
			for(RunContextItem rci : collection.getItemsByName().values()){
			
				if (ourCollection.getItem(rci.getItemName().getNameString()) == null){
					try {
						ourCollection.addItem(rci);
					} catch (ResultException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
//					if (!rci.isAutoCreated())
					try{
						allDefs.put(rci.getCamelCaseName(), rci);
					}
					catch(Exception ex){
						System.out.println(ex.toString());
						System.out.println(rci.toOIF());
						System.exit(1);
					}
				}
			}
		}
	}
	
	/**
	 * After adding a series of definitions via the mergeDefinitions() method,
	 * this method will wipe the existing reference information on all objects and
	 * perform object resolution again to ensure that all reference information
	 * (including backrefs) is up to date for the entire aggregated set of definitions.
	 */
	public void prepAggregatedInfo(){
		
		for(MvwDefinition def : allDefs.values()){
			System.out.println(def.getCamelCaseName());
		}

		for(MvwDefinition def: allDefs.values()){
			def.getDMO().clearReferenceInfo();
		}
		
		resetCodeGenInfo();
		
		DmcOmni.instance().backRefTracking(true);
		
		for(MvwDefinition def: allDefs.values()){
			try {
				def.getDMO().resolveReferences(this);
			} catch (DmcValueExceptionSet e) {
				e.printStackTrace();
				System.out.println("\nWhile resolving: \n" + def.getDMO().toOIF());
			}
		}
			
		try {
			initCodeGenInfo();
		} catch (DmcValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
