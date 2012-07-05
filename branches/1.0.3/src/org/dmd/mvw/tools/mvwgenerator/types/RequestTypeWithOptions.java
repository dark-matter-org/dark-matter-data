package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.CheapSplitter;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.RequestOptionEnum;

/**
 * The RequestTypeWithOptions class is used to specify a request type, a function name and a 
 * set of RequestOptionEnum options. Previous implementations defined a separate attribute
 * for each request type, but that meant that the Dark Matter Protocol could not be extended
 * without defining new attributes. This way, we just specify the class of Request that's
 * being used, so that everything is extensible.
 * <p/>
 * Important Note: it is expected that all requests and responses end with Request and Response!
 * This is because the code generation makes this assumption.
 * <p/>
 * The requestImport and responseImport information must be resolved and set by some resolution
 * mechanism (in most cases, the MvwDefinitionManager).
 * <p/>
 * Example usage:
 * <p/>
 * sendsRequest MyOwnRequest functionName DMPERRORS RPCERRORS CENTRALDMPERRORS CENTRALRPCERRORS CENTRALERRORS
 * <p/>
 * sendsRequest GetRequest functionName DMPERRORS RPCERRORS CENTRALDMPERRORS CENTRALRPCERRORS CENTRALERRORS CACHE EVENTS
 * <p/>
 * sendsRequest SetRequest functionName className DMPERRORS RPCERRORS CENTRALDMPERRORS CENTRALRPCERRORS CENTRALERRORS
 * <p/>
 * sendsRequest DeleteRequest functionName className DMPERRORS RPCERRORS CENTRALDMPERRORS CENTRALRPCERRORS CENTRALERRORS
 * <p/>
 * sendsRequest CreateRequest functionName className DMPERRORS RPCERRORS CENTRALDMPERRORS CENTRALRPCERRORS CENTRALERRORS
 * <p/>
 * The CACHE and EVENT options are only allowable with GetRequests
 * <p/>
 * One other aspect is that the error handling falls back to being centralized for RPC but local for DMP errors i.e.
 * if no error handling flags are set, we fall back to CENTRALRPCERRORS DMPERRORS. This is primarily because is anything
 * goes wrong with RPC, your application is probably cacked and you'll probably want to handle that situation
 * centrally. However, if something goes wrong and you get back a Dark Matter Protocol error, you'll likely want
 * to handle that local to the component that sent the message. This just comes back to having sensible defaults.
 */
@SuppressWarnings("serial")
public class RequestTypeWithOptions implements DmcMappedAttributeIF, Serializable {
	
	transient String			requestImport;
	transient String			responseImport;
	transient String			classImport;
	
	// Indicates that this not a standard Dark Matter Protocol request i.e. not defined
	// in the DMP schema.
	transient boolean			isOther;

	String						requestType;
	String 						functionName;
	// Class name is only specified with Set, Delete or Create requests
	String						className;
	HashSet<RequestOptionEnum> 	options;
	
	public RequestTypeWithOptions(){
		requestType		= null;
		functionName 	= null;
		className		= null;
		options 		= null;
	}
	
	public RequestTypeWithOptions(String rt, String fn, String cn, HashSet<RequestOptionEnum> o){
		requestType		= rt;
		functionName 	= fn;
		className		= cn;
		options 		= o;
	}
	
	public RequestTypeWithOptions(RequestTypeWithOptions rtwo){
		requestType		= rtwo.requestType;
		functionName 	= rtwo.functionName;
		className		= rtwo.className;
		options 		= rtwo.options;
	}
	
	public RequestTypeWithOptions(String v) throws DmcValueException {
		ArrayList<String>	tokens = CheapSplitter.split(v.replaceAll("\t", " ").trim(), ' ', false, true);
		
		if (tokens.size() < 2){
			throw(new DmcValueException("Too few tokens. Value should be of the form: <request type> <function name> [className] [DMPERRORS RPCERRORS CENTRALDMPERRORS CENTRALRPCERRORS  CENTRALERRORS]"));
		}
		
		requestType = tokens.get(0);
		
		if (requestType.endsWith("Request")){
			int pos = requestType.indexOf("Request");
			requestType = requestType.substring(0, pos);
		}
		functionName = tokens.get(1);
		
		int optionStart = 2;
		
		if (requestType.equals("Set") || requestType.equals("Create")){
			optionStart = 3;
			if (tokens.size() < 3)
				throw(new DmcValueException("Too few tokens for a " + requestType + "Request. Value should be of the form: <request type> <function name> <className> [DMPERRORS RPCERRORS CENTRALDMPERRORS CENTRALRPCERRORS  CENTRALERRORS]"));				
			className = tokens.get(2);
			
			if (RequestOptionEnum.get(className) != null)
				throw(new DmcValueException("Missing class name for " + requestType + "Request. Value should be of the form: <request type> <function name> <className> [DMPERRORS RPCERRORS CENTRALDMPERRORS CENTRALRPCERRORS  CENTRALERRORS]"));				
			
		}
		
		if (tokens.size() > optionStart){
			options = new HashSet<RequestOptionEnum>();
			for(int i=optionStart; i<tokens.size(); i++){
				RequestOptionEnum val = RequestOptionEnum.get(tokens.get(i));
				if (val == null)
					throw(new DmcValueException(tokens.get(i) + " is not a valid option."));
				if ( (val == RequestOptionEnum.CACHE) || (val == RequestOptionEnum.EVENTS)){
					if (!requestType.equals("Get"))
						throw(new DmcValueException("The " + val + " option is only valid with GetRequests"));
				}
				options.add(val);
			}
			
			if ((options.size()==1) && options.contains(RequestOptionEnum.DMPERRORS)){
				// Just DMPERRORS is specified, make RPC centralized
				options.add(RequestOptionEnum.CENTRALRPCERRORS);
			}
			else if ((options.size()==1) && options.contains(RequestOptionEnum.RPCERRORS)){
				// Just DMPERRORS is specified, make RPC centralized
				options.add(RequestOptionEnum.CENTRALDMPERRORS);
			}
		}
		else{
			options = new HashSet<RequestOptionEnum>();
			// We have no error handling flags, fall back to centralized
			options.add(RequestOptionEnum.DMPERRORS);
			options.add(RequestOptionEnum.CENTRALRPCERRORS);
		}
	}
	
	/**
	 * @return true if the request is not defined as part of the Dark Matter Schema.
	 */
	public boolean isOtherRequestType(){
		return(isOther);
	}
	
	/**
	 * @return true if this is a Set, Create or Delete request.
	 */
	public boolean isUsingClassInfo(){
		if (className == null)
			return(false);
		return(true);
	}
	
	public void setRequestImport(String ri){
		if (!ri.contains(".dmp."))
			isOther = true;
		requestImport = ri;
	}
	
	public void setClassImport(String ci){
		classImport = ci;
	}
	
	public String getClassImport(){
		return(classImport);
	}
	
	public String getRequestImport(){
		return(requestImport);
	}
	
	public void setResponseImport(String ri){
		responseImport = ri;
	}
	
	public String getResponseImport(){
		return(responseImport);
	}
	
	public String getRequestType(){
		return(requestType);
	}
	
	public String getFunctionName(){
		return(functionName);
	}
	
	public String getClassName(){
		return(className);
	}
	
	public HashSet<RequestOptionEnum> getOptions(){
		return(options);
	}
	
	@Override
	public String toString(){
		if (options.size() == 0){
			return(requestType + " " + functionName);
		}
		else{
			StringBuffer sb = new StringBuffer();
			sb.append(requestType + " " + functionName);
			Iterator<RequestOptionEnum> it = options.iterator();
			while(it.hasNext()){
				sb.append(" " + it.next());
			}
			
			return(sb.toString());
		}
	}

	@Override
	public Object getKey() {
		return(functionName);
	}

	@Override
	public String getKeyAsString() {
		return(functionName);
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		boolean rc = false;
		
		if (obj instanceof RequestTypeWithOptions){
			RequestTypeWithOptions other = (RequestTypeWithOptions)obj;
			if (requestType.equals(other.requestType)){
				if (functionName.equals(other.functionName)){
					if (options.equals(other.options)){
						rc = true;
					}
				}
			}
		}
		return(rc);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(requestType);
		dos.writeUTF(functionName);
		dos.writeUTF(className);
		if (options.size() == 0){
			dos.writeInt(0);
		}
		else{
			dos.writeInt(options.size());
			Iterator<RequestOptionEnum> it = options.iterator();
			while(it.hasNext()){
				dos.writeInt(it.next().intValue());
			}
		}
	}
	
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		requestType = dis.readUTF();
		functionName = dis.readUTF();
		className = dis.readUTF();
		options = new HashSet<RequestOptionEnum>();
		int size = dis.readInt();
		
		if (size > 0){
			for(int i=0; i<size; i++){
				int val = dis.readInt();
				options.add(RequestOptionEnum.get(val));
			}
		}
	}
}
