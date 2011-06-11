package org.dmd.mvw.tools.mvwgenerator.extended;

import java.util.TreeMap;

import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ComponentDMW;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.GetFunctionOptionEnum;
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
	
	StringBuffer					abstractMethods;
	
	StringBuffer					errorCases;
	
	StringBuffer					rpcErrorCases;
	
	StringBuffer					successCases;
	
	StringBuffer					commsConstants;
	
	StringBuffer					eventRegistration;
	
	TreeMap<String,CommsHandler>	commsHandlers;
	
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
	
	public String getEventRegistration(){
		return(eventRegistration.toString());
	}
	
	public String getCommsContants(){
		if (commsConstants.length() > 0)
			commsConstants.append("\n");
		return(commsConstants.toString());
	}
	
	protected void initCodeGenInfo() throws ResultException {
		
		imports 				= new ImportManager();		
		loadAttributeSchemas 	= new StringBuffer();
		hasCommsMethods			= false;
		methodID 				= 0;
		commsMethods			= new StringBuffer();
		abstractMethods			= new StringBuffer();
		errorCases				= new StringBuffer();
		rpcErrorCases			= new StringBuffer();
		successCases			= new StringBuffer();
		commsConstants			= new StringBuffer();
		eventRegistration		= new StringBuffer();
		commsHandlers			= new TreeMap<String, CommsHandler>();
		
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
			}
		}
		
		if (getUseRunContextItemHasValue()){
			for(RunContextItem rci: getUseRunContextItemIterable()){
				rci.addUsageImplImports(imports);
			}
		}
		
		if (getUseSchemaHasValue()){
			imports.addImport("org.dmd.dmc.DmcOmni", "Support for schema loading");
			for(SchemaDefinition sd: getUseSchemaIterable()){
				String capped = GenUtility.capTheName(sd.getName().getNameString());
				loadAttributeSchemas.append("        DmcOmni.instance().addAttributeSchema(" + capped + "ASAG.instance());\n");
				imports.addImport(sd.getSchemaPackage() + ".generated.dmo." + capped + "ASAG", "Attribute schema");
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
			if (errorCases.length() == 0){
				commsMethods.append("            throw(new IllegalStateException(\"Dark Matter Protocol errors are supposed to be centrally handled!\"));\n");
			}
			else{
				commsMethods.append("            switch(response.getHandlerID()){\n");
				commsMethods.append(errorCases.toString());
				commsMethods.append("            }\n");
			}
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
		
	}
	
	void addRequest(RequestWithOptions rwo, String type) throws ResultException{
		CommsHandler ch = new CommsHandler(methodID++, rwo, type);
		CommsHandler existing = commsHandlers.get(ch.key);
		
		if (existing != null){
			ResultException ex = new ResultException();
			ex.addError("Duplicate function names for multiple sends" + type + "Request attributes in a component: " + rwo.getFunctionName());
			throw(ex);
		}
		
		commsHandlers.put(ch.key, ch);
	}
	
	void addRequest(GetWithOptions gwo) throws ResultException{
		CommsHandler ch = new CommsHandler(methodID++, gwo);
		CommsHandler existing = commsHandlers.get(ch.key);
		
		if (existing != null){
			ResultException ex = new ResultException();
			ex.addError("Duplicate function names for multiple sendsGetRequest attributes in a component: " + gwo.getFunctionName());
			throw(ex);
		}
		
		commsHandlers.put(ch.key, ch);
	}
	
	void standardCommsInit(){
		hasCommsMethods = true;
		imports.addImport("org.dmd.dmp.client.ResponseHandlerIF", "DMP communications");
		imports.addImport("org.dmd.dmp.shared.generated.dmo.RequestDMO", "DMP communications");
		imports.addImport("org.dmd.dmp.shared.generated.dmo.ResponseDMO", "DMP communications");
		imports.addImport("org.dmd.dmp.shared.generated.enums.ResponseTypeEnum", "DMP communications");
	}
	
	class CommsHandler {
		int 				methodID;
		RequestWithOptions	request;
		GetWithOptions		getRequest;
		
		String  			baseName;
		String				key;
		String				requestType;
		String 				constant;
		
		CommsHandler(int id, RequestWithOptions rwo, String type){
			methodID 	= id;
			request		= rwo;
			getRequest	= null;
			
			baseName 	= GenUtility.capTheName(rwo.getFunctionName());
			requestType	= type;
			key			= requestType + baseName;
			constant 	= baseName.toUpperCase() + requestType.toUpperCase() + "CALLBACK";
		}
		
		CommsHandler(int id, GetWithOptions rwo){
			methodID 	= id;
			request		= null;
			getRequest	= rwo;
			
			baseName 	= GenUtility.capTheName(rwo.getFunctionName());
			requestType	= "Get";
			key			= requestType + baseName;
			constant 	= baseName.toUpperCase() + requestType.toUpperCase() + "CALLBACK";
		}
		
		void addSendRequestFunction(StringBuffer sb){
			sb.append("    protected void send" + baseName + requestType + "Request(" + requestType + "RequestDMO request){\n");
			sb.append("        commsController.sendRequest(request,this);\n");
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
				dmp = request.getOptions().contains(GetFunctionOptionEnum.DMPERRORS);
				rpc = request.getOptions().contains(GetFunctionOptionEnum.RPCERRORS);				
			}
			
			String responseCast = requestType + "ResponseDMO";
			String requestCast	= requestType + "RequestDMO";
			
			if (dmp){
				// If they've requested to handle DMP errors locally, add a function
				dmpError.append("            case " + constant + ":\n");
				dmpError.append("                handle" + baseName + requestType + "ResponseError((" + responseCast + ")response);\n");
				dmpError.append("                break;\n");
				
				abstractFunctions.append("    abstract protected void handle" + baseName + requestType + "ResponseError(" + responseCast + " response);\n\n");
			}
			if (rpc){
				// If they've requested to handle RPC errors locally, add a function
				rpcError.append("            case " + constant + ":\n");
				rpcError.append("                handle" + baseName + requestType + "ResponseRPCError(caught,(" + requestCast + ")request);\n");
				rpcError.append("                break;\n");
				
				abstractFunctions.append("    abstract protected void handle" + baseName + requestType + "ResponseRPCError(Throwable caught, " + requestCast + " request);\n\n");
			}
			
			success.append("            case " + constant + ":\n");
			success.append("                handle" + baseName + requestType + "Response((" + responseCast + ")response);\n");
			success.append("                break;\n");
			
			abstractFunctions.append("    abstract protected void handle" + baseName + requestType + "Response(" + responseCast + " response);\n\n");

			
		}
		
	}

}