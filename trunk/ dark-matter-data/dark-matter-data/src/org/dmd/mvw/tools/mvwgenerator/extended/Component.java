package org.dmd.mvw.tools.mvwgenerator.extended;

import java.util.TreeMap;

import org.dmd.dmp.client.ErrorOptionsEnum;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ComponentDMW;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.GetFunctionOptionEnum;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.RequestOptionEnum;
import org.dmd.mvw.tools.mvwgenerator.types.GetWithOptions;
import org.dmd.mvw.tools.mvwgenerator.types.RequestWithOptions;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

public class Component extends ComponentDMW {

	protected boolean 				initialized;
	
	protected ImportManager			imports;
	
	StringBuffer					loadAttributeSchemas;
	
	boolean							hasCommsMethods;
	
	int								methodID;
	
	StringBuffer					commsMethods;
	
	protected StringBuffer			abstractMethods;
	
	StringBuffer					fireMethods;
	
	StringBuffer					errorCases;
	
	StringBuffer					rpcErrorCases;
	
	StringBuffer					successCases;
	
	StringBuffer					commsConstants;
	
	StringBuffer					eventRegistration;
	
	TreeMap<String,CommsHandler>	commsHandlers;
	
	boolean							centralRpcErrorHandling;
	
	boolean							centralDmpErrorHandling;
	
	// Actions
	protected StringBuffer			actionVariables;
	protected StringBuffer			actionInstantiations;
	
	public Component(){
		
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
		rpcErrorCases			= new StringBuffer();
		successCases			= new StringBuffer();
		commsConstants			= new StringBuffer();
		eventRegistration		= new StringBuffer();
		commsHandlers			= new TreeMap<String, CommsHandler>();
		actionVariables			= new StringBuffer();
		actionInstantiations	= new StringBuffer();
		
		if (getHandlesEventHasValue()){
			DebugInfo.debug(getObjectName().getNameString() + " handles " + getHandlesEventSize() + " events");
			for(Event event: getHandlesEventIterable()){
				event.addEventHandlerImports(imports);
				event.handledBy(this);
				eventRegistration.append(event.getRegisterForEvent());
				abstractMethods.append(event.getAbstractMethod());
			}
		}
		
		if (getFiresEventHasValue()){
			for(Event event: getFiresEventIterable()){
				event.addEventHandlerImports(imports);
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
		
		if (getSendsActionRequestHasValue()){
			standardCommsInit();
			for(RequestWithOptions request: getSendsActionRequestIterable()){
				imports.addImport("org.dmd.dmp.shared.generated.dmo.ActionRequestDMO", "Component sends action requests");
				imports.addImport("org.dmd.dmp.shared.generated.dmo.ActionResponseDMO", "Component sends action requests");
				addRequest(request,"Action");
			}
		}
		
		if (getSendsCreateRequestHasValue()){
			standardCommsInit();
			for(RequestWithOptions request: getSendsCreateRequestIterable()){
				imports.addImport("org.dmd.dmp.shared.generated.dmo.CreateRequestDMO", "Component sends create requests");
				imports.addImport("org.dmd.dmp.shared.generated.dmo.CreateResponseDMO", "Component sends create requests");
				addRequest(request,"Create");
			}
		}
		
		if (getSendsDeleteRequestHasValue()){
			standardCommsInit();
			for(RequestWithOptions request: getSendsDeleteRequestIterable()){
				imports.addImport("org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO", "Component sends delete requests");
				imports.addImport("org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO", "Component sends delete requests");
				addRequest(request,"Delete");
			}
		}
		
		if (getSendsGetRequestHasValue()){
			standardCommsInit();
			for(GetWithOptions request: getSendsGetRequestIterable()){
				imports.addImport("org.dmd.dmp.shared.generated.dmo.GetRequestDMO", "Component sends get requests");
				imports.addImport("org.dmd.dmp.shared.generated.dmo.GetResponseDMO", "Component sends get requests");
				addRequest(request);
			}
		}
		
		if (getSendsSetRequestHasValue()){
			standardCommsInit();
			for(RequestWithOptions request: getSendsSetRequestIterable()){
				imports.addImport("org.dmd.dmp.shared.generated.dmo.SetRequestDMO", "Component sends set requests");
				imports.addImport("org.dmd.dmp.shared.generated.dmo.SetResponseDMO", "Component sends set requests");
				addRequest(request,"Set");
			}
		}
		
		if (getSendsLoginRequestHasValue()){
			standardCommsInit();
			for(RequestWithOptions request: getSendsLoginRequestIterable()){
				imports.addImport("org.dmd.dmp.shared.generated.dmo.LoginRequestDMO", "Component sends login requests");
				imports.addImport("org.dmd.dmp.shared.generated.dmo.LoginResponseDMO", "Component sends login requests");
				addRequest(request,"Login");
			}
		}
		
		if (getSendsLogoutRequestHasValue()){
			standardCommsInit();
			for(RequestWithOptions request: getSendsLogoutRequestIterable()){
				imports.addImport("org.dmd.dmp.shared.generated.dmo.LogoutRequestDMO", "Component sends logout requests");
				imports.addImport("org.dmd.dmp.shared.generated.dmo.LogoutResponseDMO", "Component sends logout requests");
				addRequest(request,"Logout");
			}
		}
		
		if (hasCommsMethods){
			for(CommsHandler ch: commsHandlers.values()){
				ch.addSendRequestFunction(commsMethods);
				ch.addHandlers(successCases, errorCases, rpcErrorCases, abstractMethods);
				commsConstants.append("    private final int " + ch.constant + " = " + ch.methodID +";\n");
			}
			
			commsMethods.append("    @Override\n");
			commsMethods.append("    public void handleResponse(ResponseDMO response){\n");
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
			
			
			commsMethods.append("    @Override\n");
			commsMethods.append("    public void handleRPCFailure(Throwable caught, RequestDMO request){\n");
			if (rpcErrorCases.length() == 0){
				commsMethods.append("        throw(new IllegalStateException(\"RPC errors are supposed to be centrally handled!\"));\n");
			}
			else{
				commsMethods.append("            switch(request.getHandlerID()){\n");
				commsMethods.append(rpcErrorCases.toString());
				commsMethods.append("            }\n");
			}
			commsMethods.append("    }\n\n");
		}
		
		if (getUseBaseClass() != null)
			imports.addImport(getUseBaseClass(), "Specified base class");
		
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
	
	void addRequest(RequestWithOptions rwo, String type) throws ResultException{
		CommsHandler ch = new CommsHandler(methodID++, rwo, type);
		CommsHandler existing = commsHandlers.get(ch.key);
		
		if (existing != null){
			ResultException ex = new ResultException();
			ex.addError("Duplicate function names for send request attributes in a component: " + rwo.getFunctionName());
			ex.result.lastResult().moreMessages("Existing request: sends" + existing.requestType + "Request");
			ex.result.lastResult().moreMessages(" Another request: sends" + type + "Request");			
			ex.setLocationInfo(getFile(), getLineNumber());
			throw(ex);
		}
		
		commsHandlers.put(ch.key, ch);
	}
	
	void addRequest(GetWithOptions gwo) throws ResultException{
		CommsHandler ch = new CommsHandler(methodID++, gwo);
		CommsHandler existing = commsHandlers.get(ch.key);
		
		if (existing != null){
			ResultException ex = new ResultException();
			ex.addError("Duplicate function names for send request attributes in a component: " + gwo.getFunctionName());
			ex.result.lastResult().moreMessages("Existing request: sends" + existing.requestType + "Request");
			ex.result.lastResult().moreMessages(" Another request: sendsGetRequest");			
			ex.setLocationInfo(getFile(), getLineNumber());
			throw(ex);
		}
		
		commsHandlers.put(ch.key, ch);
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
		int 				methodID;
		RequestWithOptions	request;
		GetWithOptions		getRequest;
		
		String  			baseName;
		String				key;
		String				requestType;
		String 				constant;
		
		ErrorOptionsEnum 	rpc = ErrorOptionsEnum.CENTRAL;
		ErrorOptionsEnum	dmp = ErrorOptionsEnum.CENTRAL;

		CommsHandler(int id, RequestWithOptions rwo, String type){
			methodID 	= id;
			request		= rwo;
			getRequest	= null;
			
			baseName 	= GenUtility.capTheName(rwo.getFunctionName());
			requestType	= type;
//			key			= requestType + baseName;
			key			= baseName;
			constant 	= baseName.toUpperCase() + requestType.toUpperCase() + "CALLBACK";
			initErrorHandlingFlags();
		}
		
		CommsHandler(int id, GetWithOptions rwo){
			methodID 	= id;
			request		= null;
			getRequest	= rwo;
			
			baseName 	= GenUtility.capTheName(rwo.getFunctionName());
			requestType	= "Get";
//			key			= requestType + baseName;
			key			= baseName;
			constant 	= baseName.toUpperCase() + requestType.toUpperCase() + "CALLBACK";
			initErrorHandlingFlags();
		}
		
		void initErrorHandlingFlags(){
			boolean 			centralRpc 	= false;
			boolean				localRpc	= false;
			boolean 			centralDmp 	= false;
			boolean				localDmp	= false;
			
			if (request == null){
				if (getRequest.getOptions().contains(GetFunctionOptionEnum.CENTRALRPCERRORS) ||
						getRequest.getOptions().contains(GetFunctionOptionEnum.CENTRALERRORS))
					centralRpc = true;
				
				if (getRequest.getOptions().contains(GetFunctionOptionEnum.CENTRALDMPERRORS) ||
						getRequest.getOptions().contains(GetFunctionOptionEnum.CENTRALERRORS))
					centralDmp = true;
				
				if (getRequest.getOptions().contains(GetFunctionOptionEnum.RPCERRORS))
					localRpc = true;
				
				if (getRequest.getOptions().contains(GetFunctionOptionEnum.DMPERRORS))
					localDmp = true;
				
			}
			else{
				if (request.getOptions().contains(RequestOptionEnum.CENTRALRPCERRORS) ||
						request.getOptions().contains(RequestOptionEnum.CENTRALERRORS))
					centralRpc = true;
				
				if (request.getOptions().contains(RequestOptionEnum.CENTRALDMPERRORS) ||
						request.getOptions().contains(RequestOptionEnum.CENTRALERRORS))
					centralDmp = true;
				
				if (request.getOptions().contains(RequestOptionEnum.RPCERRORS))
					localRpc = true;
				
				if (request.getOptions().contains(RequestOptionEnum.DMPERRORS))
					localDmp = true;
			}
			
			// Default handling depends on whether or not we have central rpc/dmp error handlers
			if (!centralDmp && !localDmp){
				if (centralDmpErrorHandling)
					centralDmp = true;
				else
					localDmp = true;
			}
			
			if (!centralRpc && !localRpc){
				if (centralRpcErrorHandling)
					centralRpc = true;
				else
					localRpc = true;
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
		}
		
		void addSendRequestFunction(StringBuffer sb){
			sb.append("    protected void send" + baseName + "Request(" + requestType + "RequestDMO request){\n");
			sb.append("        commsController.send" + requestType + "Request(request,this,ErrorOptionsEnum." + rpc + ",ErrorOptionsEnum." + dmp + ");\n");
			sb.append("    }\n\n");
			
			sb.append("    protected " + requestType + "RequestDMO get" + baseName + "Request(){\n");
			sb.append("        " + requestType + "RequestDMO request = commsController.get" + requestType + "Request();\n");
			if (getRequest != null){
				if (getRequest.getOptions().contains(GetFunctionOptionEnum.EVENTS))
					sb.append("        request.setRegisterForEvents(true);\n");
			}
			sb.append("        request.setHandlerID(" + constant + ");\n");
			sb.append("        return(request);\n");
			sb.append("    }\n\n");
		}
		
		void addHandlers(StringBuffer success, StringBuffer dmpError, StringBuffer rpcError, StringBuffer abstractFunctions){
			boolean dmp = false;
			boolean rpc = false;
			
			if (request == null){
				dmp = getRequest.getOptions().contains(GetFunctionOptionEnum.DMPERRORS);
				rpc = getRequest.getOptions().contains(GetFunctionOptionEnum.RPCERRORS);
			}
			else{
				dmp = request.getOptions().contains(RequestOptionEnum.DMPERRORS);
				rpc = request.getOptions().contains(RequestOptionEnum.RPCERRORS);
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
				
				abstractFunctions.append("    abstract protected void handle" + baseName + "ResponseRPCError(Throwable caught, " + requestCast + " request);\n\n");
			}
			else{
				rpcError.append("        case " + constant + ":\n");
				rpcError.append("            throw(new IllegalStateException(\"RPC errors for " + baseName + " are supposed to be centrally handled!\"));\n");
			}
			
			success.append("            case " + constant + ":\n");
			success.append("                handle" + baseName + "Response((" + responseCast + ")response);\n");
			success.append("                break;\n");
			
			abstractFunctions.append("    abstract protected void handle" + baseName + "Response(" + responseCast + " response);\n\n");

			
		}
		
	}

}
