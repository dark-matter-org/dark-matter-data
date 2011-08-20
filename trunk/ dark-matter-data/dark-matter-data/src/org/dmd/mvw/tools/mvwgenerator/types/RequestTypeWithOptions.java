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
 * being used, so that everything is extensible. The GetRequest is still handled separately
 * because it has different options.
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
 * The CACHE and EVENT options are only allowable with GetRequests
 */
@SuppressWarnings("serial")
public class RequestTypeWithOptions implements DmcMappedAttributeIF, Serializable {
	
	transient String			requestImport;
	transient String			responseImport;
	
	// Indicates that this not a standard Dark Matter Protocol request i.e. not defined
	// in the DMP schema.
	transient boolean			isOther;

	String						requestType;
	String 						functionName;
	HashSet<RequestOptionEnum> 	options;
	
	public RequestTypeWithOptions(){
		requestType		= null;
		functionName 	= null;
		options 		= null;
	}
	
	public RequestTypeWithOptions(String rt, String fn, HashSet<RequestOptionEnum> o){
		requestType		= rt;
		functionName 	= fn;
		options 		= o;
	}
	
	public RequestTypeWithOptions(RequestTypeWithOptions rtwo){
		requestType		= rtwo.requestType;
		functionName 	= rtwo.functionName;
		options 		= rtwo.options;
	}
	
	public RequestTypeWithOptions(String v) throws DmcValueException {
		ArrayList<String>	tokens = CheapSplitter.split(v, ' ', false, true);
		
		if (tokens.size() < 2){
			throw(new DmcValueException("Too few tokens. Value should be of the form: <request type> <function name> [DMPERRORS RPCERRORS CENTRALDMPERRORS CENTRALRPCERRORS  CENTRALERRORS]"));
		}
		
		requestType = tokens.get(0);
		
		if (requestType.endsWith("Request")){
			int pos = requestType.indexOf("Request");
			requestType = requestType.substring(0, pos);
		}
		functionName = tokens.get(1);
		
		if (tokens.size() > 2){
			options = new HashSet<RequestOptionEnum>();
			for(int i=2; i<tokens.size(); i++){
				RequestOptionEnum val = RequestOptionEnum.get(tokens.get(i));
				if (val == null)
					throw(new DmcValueException(tokens.get(i) + " is not a valid option."));
				if ( (val == RequestOptionEnum.CACHE) || (val == RequestOptionEnum.EVENTS)){
					if (!requestType.equals("Get"))
						throw(new DmcValueException("The " + val + " option is only valid with GetRequests"));
				}
				options.add(val);
			}
		}
	}
	
	public void setRequestImport(String ri){
		if (!ri.contains(".dmp."))
			isOther = true;
		requestImport = ri;
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
