package org.dmd.mvw.tools.mvwgenerator.extended;

import java.util.TreeMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ViewDMW;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.SelectionTypeEnum;
import org.dmd.mvw.tools.mvwgenerator.generated.types.DisplayDataSpec;
import org.dmd.mvw.tools.mvwgenerator.types.MethodWithArgs;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.ResultException;

/**
 * The View class extends the basic View definition to provide a variety of consistency checking
 * and the creation of various information required to format the View interface.
 * <p/>
 * The generated code from this falls into 3 main areas: the ViewIF and its associated ViewPresenterIF and
 * the ViewBaseImpl.
 * <p/>
 * The ViewIF will contain the various viewMethods and will require the viewImports.
 * <p/>
 * The ViewPresenterIF will contain the various presenterMethods and presenterImports as well as any local
 * event dependencies.
 * <p/>
 * The ViewBaseImpl will have dependencies on the events that it fires and the usesRunContextItem indications.
 */
public class View extends ViewDMW implements CodeGenComponentIF {
	
	boolean 		initialized;
	
	TreeMap<String,DisplayDataSpec> displayData;
	
	// The imports required by the View interface definition
	ImportManager	viewImports;
	
	// The Presenter interface methods
	StringBuffer	presenterInterface;

	// The View interface methods
	StringBuffer	viewInterface;

	
	// The imports required by the PresenterBaseImpl
	ImportManager	presenterImplImports;
	
	// The imports required by the ViewBaseImpl
	ImportManager	viewImplImports;
	
	StringBuffer	viewImplMethods;
	
	// The run context item that's automatically created for us in the definition manager
	RunContextItem		runContextItem;

	public View(){
		initialized = false;
	}
	
	@Override
	public void resetCodeGenInfo() {
		initialized				= false;
		displayData				= null;
		viewImports				= null;
		presenterInterface		= null;
		viewInterface			= null;
		presenterImplImports	= null;
		viewImplImports			= null;
		viewImplMethods			= null;
		
		// Not initialized by code gen
//		runContextItem			= null;
	}
	
	protected View(ViewDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	public void setRunContextItem(RunContextItem i){
		runContextItem = i;
	}
	
	public RunContextItem getRunContextItem(){
		return(runContextItem);
	}
	
	/**
	 * A convenience method to check to see whether or not the View broadcasts any events, in which
	 * case it requires the eventBus RunContextItem. 
	 * @return true is there are any broadcast events and false otherwise.
	 */
	public boolean requiresEventBus(){
		if (getBroadcastHasValue())
			return(true);
		if (getBroadcastOnlyHasValue())
			return(true);
		return(false);
	}
	
	public String getPresenterImport(){
		return(getDefinedInModule().getGenPackage() + ".generated.mvw.views." + getViewName() + "IF." + getViewName() + "PresenterIF");
	}
	
	public String getViewImport(){
		return(getDefinedInModule().getGenPackage() + ".generated.mvw.views." + getViewName() + "IF");
	}
	
	public ImportManager getPresenterImplImports(){
		return(presenterImplImports);
	}
	
	public void initCodeGenInfo() throws ResultException, DmcValueException {
		if (!initialized){
			initialized 			= true;
			
			displayData 			= new TreeMap<String, DisplayDataSpec>();
			
			viewImports				= new ImportManager();
			presenterInterface 		= new StringBuffer();
			viewInterface 			= new StringBuffer();
			
			presenterImplImports	= new ImportManager();
			presenterImplImports.addImport(getPresenterImport(), "Presenter interface");
			presenterImplImports.addImport(getViewImport(), "View interface");
			
			viewImplImports			= new ImportManager();
			viewImplMethods			= new StringBuffer();
			
			if (getUsesRunContextItemHasValue()){
				viewImplImports.addImport("org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF", "Using run context items");
				for(RunContextItem rci: getUsesRunContextItemIterable()){
					rci.addUsageImplImports(viewImplImports);
				}
			}

			// Explicit event handling
			if (getLocalHasValue()){
				for(Event event: getLocalIterable()){
					event.firedLocally(this);
					
					viewImplMethods.append(event.getViewLocalMethod());
					
					presenterInterface.append("        public void on" + event.getEventName() + event.getArgVector() + ";\n\n");
					for(String imp: event.getImportThisIterable()){
						viewImports.addImport(imp, "Required by " + event.getEventName());
						viewImplImports.addImport(imp, "Required by " + event.getEventName());
					}
				}
			}
			
			if (isWidget()){
				viewImplImports.addImport("com.google.gwt.user.client.ui.IsWidget", "Implements IsWidget");
			}
			
			if (getBroadcastHasValue()){
				
				for(Event event: getBroadcastIterable()){
					event.firedBy(this);
					
					viewImplMethods.append(event.getViewBroadcastMethod());
					event.addImport(viewImplImports);

					presenterInterface.append("        public void on" + event.getEventName() + event.getArgVector() + ";\n\n");
					for(String imp: event.getImportThisIterable()){
						viewImports.addImport(imp, "Required by " + event.getEventName());
						event.addImport(viewImplImports);
					}
				}
			}
			
			if (getBroadcastOnlyHasValue()){
				
				for(Event event: getBroadcastOnlyIterable()){
					event.firedBy(this);
					
					viewImplMethods.append(event.getViewBroadcastOnlyMethod());
					event.addImport(viewImplImports);

//					for(String imp: event.getImportThisIterable()){
//						viewImports.addImport(imp, "Required by " + event.getEventName());
//					}
				}
			}
			
			if (getViewImportHasValue()){
				for(String imp: getViewImportIterable()){
					viewImports.addImport(imp, "View import");
//					viewImplImports.addImport(imp, "View import");
				}
			}
			
			if (getPresenterMethodHasValue()){
				for(MethodWithArgs method: getPresenterMethodIterable()){
					if (method.getComment().length() > 0){
						presenterInterface.append("        /** \n");
						presenterInterface.append("         * " + method.getComment() + "\n");
						presenterInterface.append("         */ \n");
					}
					presenterInterface.append("        " + method.getSignature() + ";\n\n");
				}
			}
						
			if (getPresenterImportHasValue()){
				for(String imp: getPresenterImportIterable()){
					viewImports.addImport(imp, "View import");
				}
			}
			
			if (getSharedImportHasValue()){
				for(String imp: getSharedImportIterable()){
					viewImports.addImport(imp, "Shared import");
					viewImplImports.addImport(imp, "Shared import");
				}
			}
			
//			if (getUsesRunContextItemHasValue()){
//				for(RunContextItem rci: getUsesRunContextItemIterable()){
//					
//				}
//			}
			
			if (getViewMethodHasValue()){
				for(MethodWithArgs method: getViewMethodIterable()){
					if (method.getComment().length() > 0){
						viewInterface.append("    /** \n");
						viewInterface.append("     * " + method.getComment() + "\n");
						viewInterface.append("     */ \n");
					}
					viewInterface.append("    public " + method.getSignature() + ";\n\n");
				}
			}
						

		}
	}
	
	DisplayDataSpec checkVarName(String varname, String attribute) throws ResultException{
		DisplayDataSpec spec = displayData.get(varname);
		if (spec == null){
			ResultException ex = new ResultException();
			ex.addError("Unknown varname for " + attribute + ": " + varname);
			ex.result.lastResult().lineNumber(getLineNumber());
			ex.result.lastResult().fileName(getFile());
			throw(ex);
		}
		return(spec);
	}
	
	void checkInitialized(){
		if (!initialized)
			throw(new IllegalStateException("Not initialized for code generation"));
	}
	
	public String getInterfaceImports(){
		checkInitialized();
		return(viewImports.getFormattedImports());
	}
	
	public String getViewImplImports(){
		checkInitialized();
		
		return(viewImplImports.getFormattedImports());
	}
	
	public String getViewImplMethods(){
		checkInitialized();
		
		return(viewImplMethods.toString());
	}
	
	public String getPresenterMethods(){
		checkInitialized();
		
		return(presenterInterface.toString());
	}
	
	public String getViewMethods(){
		checkInitialized();
		
		return(viewInterface.toString());
	}
	
	public String getDataMethods(){
		checkInitialized();
		
		StringBuffer sb = new StringBuffer();
		
		for(DisplayDataSpec spec: displayData.values()){
			String capped = GenUtility.capTheName(spec.getVarName());
			
			if (spec.getCardinality() == SelectionTypeEnum.SINGLE){
				sb.append("    public void set" + capped + "(" + spec.getDataClass().getObjectName() + "DMO " + spec.getVarName() + ");\n\n");
				sb.append("    public " + spec.getDataClass().getObjectName() + "DMO get" + capped + "();\n\n");
			}
			else{
				sb.append("    public void set" + capped + "(List<" + spec.getDataClass().getObjectName() + "DMO> " + spec.getVarName() + ");\n\n");
				sb.append("    public List<" + spec.getDataClass().getObjectName() + "DMO> get" + capped + "();\n\n");
			}
		}
		
		return(sb.toString());
	}

}
