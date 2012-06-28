package org.dmd.mvw.tools.mvwgenerator.extended;

import java.util.TreeMap;

//import org.dmd.dmp.client.ErrorOptionsEnum;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ComponentDMW;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.RequestOptionEnum;
import org.dmd.mvw.tools.mvwgenerator.types.RequestTypeWithOptions;
import org.dmd.util.BooleanVar;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class Component extends ComponentDMW implements CodeGenComponentIF {

	protected boolean 				initialized;
	
	protected ImportManager			imports;
	
	StringBuffer					loadAttributeSchemas;
	
	boolean							hasCommsMethods;
	
	boolean							handlesObjectEvents;
	
	boolean							usesCentralDMPErrorHandler;
	
	boolean							usesCentralRPCErrorHandler;
	
	protected BooleanVar			usesRunContext;
	
	int								methodID;
	
	StringBuffer					commsMethods;
	
	protected StringBuffer			abstractMethods;
	
	StringBuffer					fireMethods;
	
	StringBuffer					errorCases;
	
	StringBuffer					rpcErrorCases;
	
	StringBuffer					successCases;
	
	StringBuffer					commsConstants;
	
	StringBuffer					eventRegistration;
	
	StringBuffer					objEventHandlers;
	
	TreeMap<String,CommsHandler>	commsHandlers;
	
//	boolean							centralRpcErrorHandling;
//	
//	boolean							centralDmpErrorHandling;
	
	// Actions
	protected StringBuffer			actionVariables;
	protected StringBuffer			actionInstantiations;
	
	public Component(){
		
	}
	
	@Override
	public void resetCodeGenInfo() {
		imports 				= null;		
		loadAttributeSchemas 	= null;
		hasCommsMethods			= false;
		methodID 				= 0;
		commsMethods			= null;
		abstractMethods			= null;
		fireMethods				= null;
		errorCases				= null;
		objEventHandlers		= null;
		rpcErrorCases			= null;
		successCases			= null;
		commsConstants			= null;
		eventRegistration		= null;
		commsHandlers			= null;
		actionVariables			= null;
		actionInstantiations	= null;
	}

	public String getBaseClassName(){
		if (getUseBaseClass() == null)
			return("");
		int lastdot = getUseBaseClass().lastIndexOf(".");
		return(getUseBaseClass().substring(lastdot+1));
	}
	
	protected Component(ComponentDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	@Override
	public Component getModificationRecorder() {
		return null;
	}
	
	public boolean hasCommsMethods(){
		return(hasCommsMethods);
	}
	
	public boolean handlesObjectEvents(){
		return(handlesObjectEvents);
	}
	
	public boolean usesCentralDmpErrorHandling(){
		return usesCentralDMPErrorHandler;
	}
	
	public boolean usesCentralRpcErrorHandling(){
		return usesCentralRPCErrorHandler;
	}
	
	public boolean usesRunContext(){
		if (usesRunContext == null){
			usesRunContext = new BooleanVar();
			
			if (getHandlesEventHasValue())
				usesRunContext.set(true);
			else if (getFiresEventHasValue())
				usesRunContext.set(true);
			else if (getInstantiatesViewHasValue())
				usesRunContext.set(true);
			else if (getUsesRunContextItemHasValue())
				usesRunContext.set(true);
//			else if (getSendsGetRequestHasValue())
//				usesRunContext.set(true);
//			else if (getSendsSetRequestHasValue())
//				usesRunContext.set(true);
//			else if (getSendsCreateRequestHasValue())
//				usesRunContext.set(true);
//			else if (getSendsDeleteRequestHasValue())
//				usesRunContext.set(true);
//			else if (getSendsLoginRequestHasValue())
//				usesRunContext.set(true);
//			else if (getSendsLogoutRequestHasValue())
//				usesRunContext.set(true);
			else if (getSendsRequestHasValue())
				usesRunContext.set(true);
				
		}
		return(usesRunContext.booleanValue());
	}
	
	public String getImports(){
		return(imports.getFormattedImports());
	}
	
	public String getAttributeSchemaLoaders(){
		return(loadAttributeSchemas.toString());
	}
	
	public String getCommsMethods(){
		return(commsMethods.toString());
	}
	
	public String getAbstractMethods(){
		return(abstractMethods.toString());
	}
	
	public String getFireMethods(){
		return(fireMethods.toString());
	}
	
	public String getEventRegistration(){
		return(eventRegistration.toString());
	}
	
	public String getCommsConstants(){
		if (commsConstants.length() > 0)
			commsConstants.append("\n");
		return(commsConstants.toString());
	}
	
	public String getActionVariables(){
		return(actionVariables.toString());
	}
	
	public String getActionInstantiations(){
		return(actionInstantiations.toString());
	}
	
	protected void initCodeGenInfo(boolean rpc, boolean dmp) throws ResultException {
		
		imports 				= new ImportManager();		
		loadAttributeSchemas 	= new StringBuffer();
		hasCommsMethods			= false;
		methodID 				= 0;
		commsMethods			= new StringBuffer();
		abstractMethods			= new StringBuffer();
		fireMethods				= new StringBuffer();
		errorCases				= new StringBuffer();
		objEventHandlers		= new StringBuffer();
		rpcErrorCases			= new StringBuffer();
		successCases			= new StringBuffer();
		commsConstants			= new StringBuffer();
		eventRegistration		= new StringBuffer();
		commsHandlers			= new TreeMap<String, CommsHandler>();
		actionVariables			= new StringBuffer();
		actionInstantiations	= new StringBuffer();
		
		if (getHandlesEventHasValue()){
//			DebugInfo.debug(getObjectName().getNameString() + " handles " + getHandlesEventSize() + " events");
			for(Event event: getHandlesEventIterable()){
				event.addHandlesEventImports(imports);
				event.handledBy(this);
				eventRegistration.append(event.getRegisterForEvent());
				abstractMethods.append(event.getAbstractMethod());
			}
		}
		
		if (getFiresEventHasValue()){
			for(Event event: getFiresEventIterable()){
				event.addFiresEventImports(imports);
				event.firedBy(this);
				fireMethods.append(event.getFireMethod());
			}
		}
		
		// We do this before we gather the imports for run context items
		if (getInstantiatesViewHasValue()){
			for(View view: getInstantiatesViewIterable()){
				addUsesRunContextItem(view.getRunContextItem());
			}
		}
		
		if (getUsesRunContextItemHasValue()){
			for(RunContextItem rci: getUsesRunContextItemIterable()){
				rci.addUsageImplImports(imports);
			}
		}
		
		if (getUseSchemaHasValue()){
			imports.addImport("org.dmd.dmc.DmcOmni", "Support for schema loading");
			for(SchemaDefinition sd: getUseSchemaIterable()){
				String capped = GenUtility.dotNameToCamelCase(sd.getName().getNameString());
				loadAttributeSchemas.append("        DmcOmni.instance().addCompactSchema(" + capped + "DMSAG.instance());\n");
				imports.addImport(sd.getSchemaPackage() + ".generated.dmo." + capped + "DMSAG", "Attribute schema");
			}
		}
		
		if (getSendsRequestHasValue()){
			standardCommsInit();
			for(RequestTypeWithOptions request: getSendsRequestIterable()){
				
				imports.addImport(request.getRequestImport(), "Component sends " + request.getRequestType() + "Requests");
				imports.addImport(request.getResponseImport(), "Component receives " + request.getRequestType() + "Responses");
				if (request.isUsingClassInfo()){
					imports.addImport(request.getClassImport(), "Component uses " + request.getClassName() + " objects");
					if (request.getRequestType().equals("Set")){
						imports.addImport("org.dmd.dmc.DmcValueException", "Used when creating " + request.getRequestType() + "Requests");
						imports.addImport("org.dmd.dms.generated.dmo.MetaDMSAG", "Used when creating " + request.getRequestType() + "Requests");
					}
				}
				
				if (request.getRequestType().equals("Get")){
					if (request.getOptions().contains(RequestOptionEnum.EVENTS)){
						imports.addImport("org.dmd.dmp.client.EventHandlerIF", "Handles events resulting from GetRequests");
						imports.addImport("org.dmd.dmp.shared.generated.dmo.DMPEventDMO", "Events");
						handlesObjectEvents = true;
					}
				}

				if (request.getRequestType().equals("Action")){
					imports.addImport("org.dmd.dms.extended.ActionTriggerInfo", "Sends action requests");
				}
				
				addRequest(request);
			}
		}
		
		if (hasCommsMethods){
			for(CommsHandler ch: commsHandlers.values()){
				ch.addSendRequestFunction(commsMethods);
				ch.addHandlers(successCases, errorCases, rpcErrorCases, abstractMethods, objEventHandlers);
				commsConstants.append("    private final int " + ch.constant + " = " + ch.methodID +";\n");
			}
			
			commsMethods.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			commsMethods.append("    @Override\n");
			commsMethods.append("    final public void handleResponse(ResponseDMO response){\n");
			commsMethods.append("        if (response.getResponseType() == ResponseTypeEnum.ERROR){\n");
//			if (errorCases.length() == 0){
//				commsMethods.append("            throw(new IllegalStateException(\"Dark Matter Protocol errors are supposed to be centrally handled!\"));\n");
//			}
//			else{
				commsMethods.append("            switch(response.getHandlerID()){\n");
				commsMethods.append(errorCases.toString());
				commsMethods.append("            }\n");
//			}
			commsMethods.append("        }\n");
			commsMethods.append("        else{\n");
			commsMethods.append("            switch(response.getHandlerID()){\n");
			commsMethods.append(successCases.toString());
			commsMethods.append("            }\n");
			commsMethods.append("        }\n");
			
			commsMethods.append("    }\n\n");
			
			
			
			if (handlesObjectEvents){
				commsMethods.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				commsMethods.append("    @Override\n");
				commsMethods.append("    final public void handleEvent(DMPEventDMO event){\n");
				commsMethods.append("        switch(event.getHandlerID()){\n");
				commsMethods.append(objEventHandlers.toString());
				commsMethods.append("        }\n");
				commsMethods.append("    }\n\n");
			}
			
			
			commsMethods.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			commsMethods.append("    @Override\n");
			commsMethods.append("    final public void handleRPCFailure(Throwable caught, RequestDMO request){\n");
			if (rpcErrorCases.length() == 0){
				commsMethods.append("        throw(new IllegalStateException(\"RPC errors are supposed to be centrally handled!\"));\n");
			}
			else{
				commsMethods.append("        switch(request.getHandlerID()){\n");
				commsMethods.append(rpcErrorCases.toString());
				commsMethods.append("        }\n");
			}
			commsMethods.append("    }\n\n");
		}
		
		if (getUseBaseClass() != null)
			imports.addImport(getUseBaseClass(), "Specified base class");
		
		if (usesRunContext())
			imports.addImport("org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF", "Need the run context");

		
//		if (getImplementsActionHasValue()){
//			
//			for(Action action: getImplementsActionIterable()){
//				String capped = GenUtility.capTheName(action.getActionName().getNameString());
//				String cappedAction = GenUtility.capTheName(action.getActionName().getNameString()) + "Action";
//				
//				actionVariables.append("    protected final " + cappedAction + " " + action.getActionName() + ";\n");
//				
//				actionInstantiations.append("\n");
//				actionInstantiations.append("        " + action.getActionName() + " = new " + cappedAction + "(this);\n");
//				actionInstantiations.append("        MenuControllerRCI.addAction(" + action.getActionName() + ");\n");
//				
//				String i = getDefinedInModule().getGenPackage() + ".generated.mvw.actions." + cappedAction;
//				imports.addImport(i, "The " + action.getActionName() + " action");
//				imports.addImport("org.dmd.mvw.client.mvwmenus.interfaces.TriggerIF", "Required by actions");
//				
//				abstractMethods.append("\n");
//				abstractMethods.append("    abstract public void execute" + capped + "(TriggerIF trigger, Object widgetEvent);\n");
//			}
//		}
		
	}
	
	void addRequest(RequestTypeWithOptions rtwo) throws ResultException{
		CommsHandler ch = new CommsHandler(methodID++, rtwo);
		CommsHandler existing = commsHandlers.get(ch.key);
		
		if (existing != null){
			ResultException ex = new ResultException();
			ex.addError("Duplicate function names for sendRequest attributes in a component: " + rtwo.getFunctionName());
			ex.result.lastResult().moreMessages("Existing request: sends" + existing.requestType + "Request");
			ex.result.lastResult().moreMessages(" Another request: sends" + rtwo.getRequestType() + "Request");			
			ex.setLocationInfo(getFile(), getLineNumber());
			throw(ex);
		}
		
		commsHandlers.put(ch.key, ch);
		
		if ( (ch.dmp == ErrorOptionsEnum.CENTRAL) || (ch.dmp == ErrorOptionsEnum.CENTRALANDLOCAL) )
			usesCentralDMPErrorHandler = true;
		
		if ( (ch.rpc == ErrorOptionsEnum.CENTRAL) || (ch.rpc == ErrorOptionsEnum.CENTRALANDLOCAL) )
			usesCentralRPCErrorHandler = true;
	}
	
	void standardCommsInit(){
		hasCommsMethods = true;
		imports.addImport("org.dmd.dmp.client.ResponseHandlerIF", "DMP communications");
		imports.addImport("org.dmd.dmp.client.ErrorOptionsEnum", "DMP communications");
		imports.addImport("org.dmd.dmp.shared.generated.dmo.RequestDMO", "DMP communications");
		imports.addImport("org.dmd.dmp.shared.generated.dmo.ResponseDMO", "DMP communications");
		imports.addImport("org.dmd.dmp.shared.generated.enums.ResponseTypeEnum", "DMP communications");
	}
	
	public String genSubPackage(){
		throw(new IllegalStateException("Must overload genSubPackage()"));
	}
	
	class CommsHandler {
		int 					methodID;
		RequestTypeWithOptions	requestDef;
		
		String  				baseName;
		String					key;
		String					requestType;
		String 					constant;
		
		ErrorOptionsEnum 		rpc = ErrorOptionsEnum.CENTRAL;
		ErrorOptionsEnum		dmp = ErrorOptionsEnum.CENTRAL;

		CommsHandler(int id, RequestTypeWithOptions rtwo){
			methodID 	= id;
			requestDef	= rtwo;
			
			baseName 	= GenUtility.capTheName(rtwo.getFunctionName());
			requestType	= rtwo.getRequestType();
			key			= baseName;
			constant 	= baseName.toUpperCase() + requestType.toUpperCase() + "CALLBACK";
			initErrorHandlingFlags();
		}
		
		void initErrorHandlingFlags(){
			boolean 			centralRpc 	= false;
			boolean				localRpc	= false;
			boolean 			centralDmp 	= false;
			boolean				localDmp	= false;
			
			if (requestDef != null){
				if (requestDef.getOptions().contains(RequestOptionEnum.CENTRALRPCERRORS) ||
						requestDef.getOptions().contains(RequestOptionEnum.CENTRALERRORS))
					centralRpc = true;
				
				if (requestDef.getOptions().contains(RequestOptionEnum.CENTRALDMPERRORS) ||
						requestDef.getOptions().contains(RequestOptionEnum.CENTRALERRORS))
					centralDmp = true;
				
				if (requestDef.getOptions().contains(RequestOptionEnum.RPCERRORS))
					localRpc = true;
				
				if (requestDef.getOptions().contains(RequestOptionEnum.DMPERRORS))
					localDmp = true;
			}
			
			// If neither central or local DMP error handling has been specified, we fall
			// back to central handling
			if (!centralDmp && !localDmp){
				centralDmp = true;
			}
			
			// If neither central or local RPC error handling has been specified, we fall
			// back to central handling
			if (!centralRpc && !localRpc){
				centralRpc = true;
			}
			
			if (centralRpc && localRpc)
				rpc = ErrorOptionsEnum.CENTRALANDLOCAL;
			else if (centralRpc)
				rpc = ErrorOptionsEnum.CENTRAL;
			else if (localRpc)
				rpc = ErrorOptionsEnum.LOCAL;
			
			if (centralDmp && localDmp)
				dmp = ErrorOptionsEnum.CENTRALANDLOCAL;
			else if (centralDmp)
				dmp = ErrorOptionsEnum.CENTRAL;
			else if (localDmp)
				dmp = ErrorOptionsEnum.LOCAL;
			
//			DebugInfo.debug(requestDef.toString() + "\nDMP: " + dmp + "  RPC: " + rpc + "\n");
		}
		
		void addSendRequestFunction(StringBuffer sb){
			if (requestType.equals("Get") && requestDef.getOptions().contains(RequestOptionEnum.EVENTS)){
				sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    protected void send" + baseName + "Request(" + requestType + "RequestDMO request){\n");
				sb.append("        commsController.send" + requestType + "Request(request,this,this,ErrorOptionsEnum." + rpc + ",ErrorOptionsEnum." + dmp + ");\n");
				sb.append("    }\n\n");
			}
			else{
				sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    protected void send" + baseName + "Request(" + requestType + "RequestDMO request){\n");
				sb.append("        commsController.send" + requestType + "Request(request,this,ErrorOptionsEnum." + rpc + ",ErrorOptionsEnum." + dmp + ");\n");
				sb.append("    }\n\n");
			}
			
			if (requestDef.isUsingClassInfo()){
				if (requestDef.getRequestType().equals("Set")){
					sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    protected " + requestType + "RequestDMO get" + baseName + "Request(" + requestDef.getClassName()+ "DMO modrec){\n");
					sb.append("        if (modrec.getModifier() == null)\n");
					sb.append("            throw(new IllegalStateException(\"The DMO passed here should have a modifier.\"));\n");
					sb.append("    \n");
					sb.append("        " + requestType + "RequestDMO request = commsController.get" + requestType + "Request();\n");
					sb.append("        request.setHandlerID(" + constant + ");\n");
					sb.append("        request.setNotifyOriginator(true);\n");
					sb.append("    \n");
					sb.append("        request.setTarget(modrec.getObjectName());\n");
					sb.append("        try{\n");
					sb.append("            request.add(MetaDMSAG.__modify, modrec.getModifier());\n");
					sb.append("            request.setTargetObjectClass(modrec.getConstructionClass());\n");
					sb.append("        } catch (DmcValueException e) {\n");
					sb.append("            throw(new IllegalStateException(\"Setting the modifier on a SetRequest shouldn't thrown an exception.\",e));\n");
					sb.append("        }\n");
					sb.append("    \n");
					sb.append("        return(request);\n");
					sb.append("    }\n\n");
				}
				else if (requestDef.getRequestType().equals("Create")){
					sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    protected " + requestType + "RequestDMO get" + baseName + "Request(" + requestDef.getClassName()+ "DMO newobj){\n");
					sb.append("        " + requestType + "RequestDMO request = commsController.get" + requestType + "Request();\n");
					sb.append("        request.setHandlerID(" + constant + ");\n");
					sb.append("        request.setNotifyOriginator(true);\n");
					sb.append("        request.setNewObject(newobj);\n");
					sb.append("        return(request);\n");
					sb.append("    }\n\n");
				}
			}
			else{
				if (requestType.equals("Action")){
					sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    protected " + requestType + "RequestDMO get" + baseName + "Request(ActionTriggerInfo ati){\n");
					sb.append("        " + requestType + "RequestDMO request = commsController.get" + requestType + "Request(ati);\n");
					sb.append("        request.setHandlerID(" + constant + ");\n");
					sb.append("        request.setNotifyOriginator(true);\n");
					sb.append("        return(request);\n");
					sb.append("    }\n\n");
				}
				else{
					sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    protected " + requestType + "RequestDMO get" + baseName + "Request(){\n");
					sb.append("        " + requestType + "RequestDMO request = commsController.get" + requestType + "Request();\n");
					if (requestType.equals("Get")){
						if (requestDef.getOptions().contains(RequestOptionEnum.EVENTS))
							sb.append("        request.setRegisterForEvents(true);\n");
					}
					sb.append("        request.setHandlerID(" + constant + ");\n");
					sb.append("        request.setNotifyOriginator(true);\n");
					sb.append("        return(request);\n");
					sb.append("    }\n\n");
					
					// Provide the mechanism to deregister for events
					if ( (requestType.equals("Get")) && (requestDef.getOptions().contains(RequestOptionEnum.EVENTS))){
						sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
						sb.append("    protected void denotifyFor" + baseName + "Events(){\n");
	//					sb.append("        " + requestType + "RequestDMO request = commsController.get" + requestType + "Request();\n");
	//					sb.append("        request.setHandlerID(" + constant + ");\n");
						sb.append("        // TODO: fill in denotify request and send it\n");
						sb.append("    }\n\n");
						
						sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
						sb.append("    protected void handle" + baseName + "Event(){\n");
	//					sb.append("        " + requestType + "RequestDMO request = commsController.get" + requestType + "Request();\n");
	//					sb.append("        request.setHandlerID(" + constant + ");\n");
						sb.append("        // TODO: fill in denotify request and send it\n");
						sb.append("    }\n\n");
						
						
					}
				}
			}
		}
		
		void addHandlers(StringBuffer success, StringBuffer dmpError, StringBuffer rpcError, StringBuffer abstractFunctions, StringBuffer objEventHandlers){
			boolean dmp = false;
			boolean rpc = false;
			
			if (requestDef != null){
				dmp = requestDef.getOptions().contains(RequestOptionEnum.DMPERRORS);
				rpc = requestDef.getOptions().contains(RequestOptionEnum.RPCERRORS);
			}
						
			String responseCast = requestType + "ResponseDMO";
			String requestCast	= requestType + "RequestDMO";
			
			if (dmp){
				// If they've requested to handle DMP errors locally, add a function
				dmpError.append("            case " + constant + ":\n");
				dmpError.append("                handle" + baseName + "ResponseError((" + responseCast + ")response);\n");
				dmpError.append("                break;\n");
				
				abstractFunctions.append("    abstract protected void handle" + baseName + "ResponseError(" + responseCast + " response);\n\n");
			}
			else{
				dmpError.append("            case " + constant + ":\n");
				dmpError.append("                throw(new IllegalStateException(\"DMP errors for " + baseName + " are supposed to be centrally handled!\"));\n");
			}
			
			if (rpc){
				// If they've requested to handle RPC errors locally, add a function
				rpcError.append("        case " + constant + ":\n");
				rpcError.append("            handle" + baseName + "ResponseRPCError(caught,(" + requestCast + ")request);\n");
				rpcError.append("            break;\n");
				
				abstractFunctions.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				abstractFunctions.append("    abstract protected void handle" + baseName + "ResponseRPCError(Throwable caught, " + requestCast + " request);\n\n");
			}
			else{
				rpcError.append("        case " + constant + ":\n");
				rpcError.append("            throw(new IllegalStateException(\"RPC errors for " + baseName + " are supposed to be centrally handled!\"));\n");
			}
			
			success.append("            case " + constant + ":\n");
			success.append("                handle" + baseName + "Response((" + responseCast + ")response);\n");
			success.append("                break;\n");
			
			abstractFunctions.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			abstractFunctions.append("    abstract protected void handle" + baseName + "Response(" + responseCast + " response);\n\n");

			if (requestType.equals("Get") && requestDef.getOptions().contains(RequestOptionEnum.EVENTS) ){
				abstractFunctions.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
				abstractFunctions.append("    abstract protected void handleEventFrom" + baseName + "(DMPEventDMO event);\n\n");
				
				objEventHandlers.append("        case " + constant + ":\n");
				objEventHandlers.append("            handleEventFrom" + baseName + "(event);\n");
				objEventHandlers.append("            break;\n");
			}
			
		}
		
	}

}
