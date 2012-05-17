package org.dmd.mvw.tools.mvwgenerator.extended;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.types.CamelCaseName;
import org.dmd.dms.util.GenUtility;
import org.dmd.dmw.DmwWrapper;
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FieldEditorDefinition;
import org.dmd.mvw.tools.mvwgenerator.extended.forms.FormBindingDefinition;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDMSAG;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ModuleDMW;
import org.dmd.util.exceptions.DebugInfo;

public class Module extends ModuleDMW {

	ArrayList<RunContextItem> runContextItems;
	
	// Associated definitions
	TreeMap<CamelCaseName,WebApplication>			applications;
	TreeMap<CamelCaseName,Controller>				controllers;
	TreeMap<CamelCaseName,Presenter>				presenters;
	TreeMap<CamelCaseName,View>						views;
	TreeMap<CamelCaseName,Place>					places;
	TreeMap<CamelCaseName,Activity>					activities;
	TreeMap<CamelCaseName,RunContextItem>			contextItems;
	TreeMap<CamelCaseName,FormBindingDefinition>	bindings;
	TreeMap<CamelCaseName,FieldEditorDefinition>	editors;
	
	public Module(){
		runContextItems = new ArrayList<RunContextItem>();
	}
	
	public void addRunContextItem(RunContextItem rci){
		runContextItems.add(rci);
	}
	
	public String getContextName(){
		if (runContextItems.size() == 0)
			return("");
		else{
			String capped = GenUtility.capTheName(getModuleName().getNameString());
			return(capped + "RunContextIF");
		}	
	}
	
	public String getContextImport(){
		if (runContextItems.size() == 0)
			return("");
		else{
			String capped = GenUtility.capTheName(getModuleName().getNameString());
			return(getGenPackage() + ".generated.mvw." + capped + "RunContextIF");
		}	
	}
	
	public int contextItemCount(){
		return(runContextItems.size());
	}
	
	public Iterator<RunContextItem>	getItems(){
		return(runContextItems.iterator());
	}
		
	/**
	 * This method will examine all objects that reference this module via the definedInModule
	 * attribute and build sorted indices of the various definitions.
	 */
	public void initAssociatedDefintions(){
		applications 	= new TreeMap<CamelCaseName, WebApplication>();
		controllers		= new TreeMap<CamelCaseName, Controller>();
		presenters		= new TreeMap<CamelCaseName, Presenter>();
		views			= new TreeMap<CamelCaseName, View>();
		places			= new TreeMap<CamelCaseName, Place>();
		activities		= new TreeMap<CamelCaseName, Activity>();
		contextItems	= new TreeMap<CamelCaseName, RunContextItem>();
		bindings		= new TreeMap<CamelCaseName, FormBindingDefinition>();
		editors			= new TreeMap<CamelCaseName, FieldEditorDefinition>();
		
		
		DebugInfo.debug(this.getBackRefs());
		
		ArrayList<DmwWrapper> definedIn = getReferringObjectsViaAttribute(MvwDMSAG.__definedInModule);
		for(DmwWrapper wrapper: definedIn){
			MvwDefinition def = (MvwDefinition) wrapper;
			
			if (def instanceof WebApplication)
				applications.put(def.getCamelCaseName(), (WebApplication) def);
			else if (def instanceof Controller)
				controllers.put(def.getCamelCaseName(), (Controller) def);
			else if (def instanceof Presenter)
				presenters.put(def.getCamelCaseName(), (Presenter) def);
			else if (def instanceof View)
				views.put(def.getCamelCaseName(), (View) def);
			else if (def instanceof Place)
				places.put(def.getCamelCaseName(), (Place) def);
			else if (def instanceof Activity)
				activities.put(def.getCamelCaseName(), (Activity) def);
			else if (def instanceof RunContextItem)
				contextItems.put(def.getCamelCaseName(), (RunContextItem) def);
			else if (def instanceof FormBindingDefinition)
				bindings.put(def.getCamelCaseName(), (FormBindingDefinition) def);
			else if (def instanceof FieldEditorDefinition)
				editors.put(def.getCamelCaseName(), (FieldEditorDefinition) def);
		}
	}

	public ArrayList<RunContextItem> getRunContextItems() {
		return runContextItems;
	}

	public TreeMap<CamelCaseName, WebApplication> getApplications() {
		return applications;
	}

	public TreeMap<CamelCaseName, Controller> getControllers() {
		return controllers;
	}

	public TreeMap<CamelCaseName, Presenter> getPresenters() {
		return presenters;
	}

	public TreeMap<CamelCaseName, View> getViews() {
		return views;
	}

	public TreeMap<CamelCaseName, Place> getPlaces() {
		return places;
	}

	public TreeMap<CamelCaseName, Activity> getActivities() {
		return activities;
	}

	public TreeMap<CamelCaseName, RunContextItem> getContextItems() {
		return contextItems;
	}

	public TreeMap<CamelCaseName, FormBindingDefinition> getBindings() {
		return bindings;
	}

	public TreeMap<CamelCaseName, FieldEditorDefinition> getEditors() {
		return editors;
	}
}
