package org.dmd.mvw.tools.mvwgenerator.extended;

import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.CamelCaseName;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ViewDMW;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.EventScopeEnum;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.SelectionTypeEnum;
import org.dmd.mvw.tools.mvwgenerator.generated.types.DisplayDataSpec;
import org.dmd.mvw.tools.mvwgenerator.generated.types.EventSpec;
import org.dmd.mvw.tools.mvwgenerator.generated.types.OperationSpec;
import org.dmd.mvw.tools.mvwgenerator.types.EventWithArgs;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The View class extends the basic View definition to provide a variety of consistency checking
 * and the creation of various information required to format the View interface.
 */
public class View extends ViewDMW {
	
	boolean initialized;
	
	TreeMap<String,DisplayDataSpec> displayData;
	
	StringBuffer	presenterInterface;

	public View(){
		initialized = false;
	}
	
	protected View(ViewDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	public void initCodeGenInfo(TreeMap<CamelCaseName, MvwEvent> events) throws ResultException, DmcValueException {
		if (!initialized){
			initialized 		= true;
			
			displayData 		= new TreeMap<String, DisplayDataSpec>();
			presenterInterface 	= new StringBuffer();
			
			initBroadcastEvents(events);
			
			if (getDisplayDMOHasValue()){
				for(DisplayDataSpec spec: getDisplayDMOIterable()){
					if (displayData.get(spec.getVarName()) != null){
						ResultException ex = new ResultException();
						ex.addError("Clashing varnames for displayed data: " + spec.getVarName());
						ex.result.lastResult().lineNumber(getLineNumber());
						ex.result.lastResult().fileName(getFile());
						throw(ex);
					}
					displayData.put(spec.getVarName(), spec);
				}
			}
			
			if (getDeleteEventHasValue()){
				for(EventSpec event: getDeleteEventIterable()){
					DisplayDataSpec spec = checkVarName(event.getVarName(),"deleteEvent");
					String capped = GenUtility.capTheName(spec.getVarName());
					presenterInterface.append("        public void on" + capped + "Deleted(");
					if (event.getCardinality() == SelectionTypeEnum.SINGLE)
						presenterInterface.append(spec.getDataClass().getObjectName() + "DMO " + spec.getVarName() + ");\n\n");
					else
						presenterInterface.append("List<" + spec.getDataClass().getObjectName() + "DMO> " + spec.getVarName() + ");\n\n");	
					
					if ( (event.getScope() == EventScopeEnum.BROADCAST) || (event.getScope() == EventScopeEnum.BROADCASTONLY)){
						BroadcastEvent be = new BroadcastEvent();
						be.addUserDataImport(spec.getDataClass().getObject().getDmoImport());
						if (event.getCardinality() == SelectionTypeEnum.SINGLE){
							be.setArgVector("(" + spec.getDataClass().getObjectName() + "DMO " + spec.getVarName());
						}
						else{
							be.setArgVector("(List<" + spec.getDataClass().getObjectName() + "DMO> " + spec.getVarName() + ")");
							be.addUserDataImport("java.util.List");
						}

						completeBroadcastEvent(events, be, capped + "DeletedEvent");
					}

				}
			}
			
			if (getSelectEventHasValue()){
				for(EventSpec event: getSelectEventIterable()){
					DisplayDataSpec spec = checkVarName(event.getVarName(),"selectEvent");
					String capped = GenUtility.capTheName(spec.getVarName());
					presenterInterface.append("        public void on" + capped + "Selected(");
					if (event.getCardinality() == SelectionTypeEnum.SINGLE)
						presenterInterface.append(spec.getDataClass().getObjectName() + "DMO " + spec.getVarName() + ");\n\n");
					else
						presenterInterface.append("List<" +spec.getDataClass().getObjectName() + "DMO> " + spec.getVarName() + ");\n\n");
					
					if ( (event.getScope() == EventScopeEnum.BROADCAST) || (event.getScope() == EventScopeEnum.BROADCASTONLY)){
						BroadcastEvent be = new BroadcastEvent();
						be.addUserDataImport(spec.getDataClass().getObject().getDmoImport());
						if (event.getCardinality() == SelectionTypeEnum.SINGLE){
							be.setArgVector("(" + spec.getDataClass().getObjectName() + "DMO " + spec.getVarName());
						}
						else{
							be.setArgVector("(List<" + spec.getDataClass().getObjectName() + "DMO> " + spec.getVarName() + ")");
							be.addUserDataImport("java.util.List");
						}
						completeBroadcastEvent(events, be, capped + "SelectedEvent");
					}
					
				}
			}
			
			if (getClickEventHasValue()){
				for(OperationSpec event: getClickEventIterable()){
					DisplayDataSpec spec = checkVarName(event.getVarName(),"clickEvent");
				}
			}
		}
	}
	
	void completeBroadcastEvent(TreeMap<CamelCaseName, MvwEvent> events, BroadcastEvent event, String eventName) throws DmcValueException, ResultException{
		event.setCamelCaseName(eventName);
		event.setEventName(eventName);
		event.setDefinedInModule(getDefinedInModule());
		event.setLineNumber(getLineNumber());
		event.setFile(getFile());
		
		MvwEvent existing = events.get(event.getObjectName());
		if (existing != null)
			eventClash(existing,event,"Clashing event from View: " + getObjectName());
		
		events.put(event.getObjectName(), event);

	}
	
	/**
	 * We see if we have any broadcast or broadcastOnly indications and create BroadcastEvents accordingly.
	 * @param events
	 * @throws DmcValueException
	 * @throws ResultException 
	 */
	void initBroadcastEvents(TreeMap<CamelCaseName, MvwEvent> events) throws DmcValueException, ResultException{
		if (getBroadcastHasValue()){
			for(EventWithArgs event: getBroadcastIterable()){
				BroadcastEvent be = new BroadcastEvent();
				be.setCamelCaseName(event.getEventName());
				be.setEventName(event.getEventName());
				be.setDefinedInModule(getDefinedInModule());
				be.setLineNumber(getLineNumber());
				be.setFile(getFile());
				
				DebugInfo.debug(be.toOIF());
				
				if(event.getArgVector() != null)
					be.setArgVector(event.getArgVector());
				
				Iterator<String> it = event.getImports().iterator();
				while(it.hasNext()){
					be.addUserDataImport(it.next());
				}
				
				MvwEvent existing = events.get(be.getObjectName());
				if (existing != null)
					eventClash(existing,be,"Clashing event from View: " + getObjectName());
				
				events.put(be.getObjectName(), be);
			}
		}
		if (getBroadcastOnlyHasValue()){
			for(EventWithArgs event: getBroadcastOnlyIterable()){
				BroadcastEvent be = new BroadcastEvent();
				be.setCamelCaseName(event.getEventName());
				be.setEventName(event.getEventName());
				be.setDefinedInModule(getDefinedInModule());
				be.setLineNumber(getLineNumber());
				be.setFile(getFile());
				
				DebugInfo.debug(be.toOIF());
				
				if(event.getArgVector() != null)
					be.setArgVector(event.getArgVector());
				
				Iterator<String> it = event.getImports().iterator();
				while(it.hasNext()){
					be.addUserDataImport(it.next());
				}
				
				MvwEvent existing = events.get(be.getObjectName());
				if (existing != null)
					eventClash(existing,be,"Clashing event from View: " + getObjectName());

				events.put(be.getObjectName(), be);
			}
		}
		
	}
	
	void eventClash(MvwEvent existing, MvwEvent clash, String origin) throws ResultException{
		ResultException ex = new ResultException();
		ex.addError("Clashing event names: " + existing.getObjectName());
		ex.addError("Existing event");
		ex.result.lastResult().lineNumber(existing.getLineNumber());
		ex.result.lastResult().fileName(existing.getFile());
		
		ex.addError(origin);
		ex.result.lastResult().lineNumber(clash.getLineNumber());
		ex.result.lastResult().fileName(clash.getFile());
		throw(ex);
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
	
	public void getInterfaceImports(){
		checkInitialized();
		
		for(DisplayDataSpec spec: displayData.values()){
			ImportManager.addImport(spec.getDataClass().getObject().getDmoImport(), "Data class");
			if (spec.getCardinality() == SelectionTypeEnum.MULTI)
				ImportManager.addImport("java.util.List", "Multi-valued data");
		}
	}
	
	public String getPresenterMethods(){
		checkInitialized();
		
		return(presenterInterface.toString());
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
