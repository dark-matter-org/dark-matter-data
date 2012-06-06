package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.mvw.tools.mvwgenerator.generated.enums.RequestOptionEnum;

/**
 * The GetWithMods class is used to store a base function name fragment along with
 * a set of RequestOptionEnum values:
 * eventName (type arg1, type arg2...) com.example.class java.util.Hashmap
 */
@SuppressWarnings("serial")
public class GetWithOptions implements DmcMappedAttributeIF, Serializable {

	String 							functionName;
	HashSet<RequestOptionEnum> 	options;
	
	public GetWithOptions(){
		functionName 	= null;
		options 		= null;
	}
	
	public GetWithOptions(String fn, HashSet<RequestOptionEnum> o){
		functionName 	= fn;
		options 		= o;
	}
	
	public GetWithOptions(GetWithOptions gwm){
		functionName 	= gwm.functionName;
		options 		= gwm.options;
	}
	
	public GetWithOptions(String v) throws DmcValueException{
		String value = v.trim();
		int spacepos = value.indexOf(" ");
		
		if (spacepos == -1){
			functionName 	= value;
			options 		= new HashSet<RequestOptionEnum>();
			options.add(RequestOptionEnum.NONE);
		}
		else{
			functionName = value.substring(0, spacepos);
			options = new HashSet<RequestOptionEnum>();
			String remainder = value.substring(spacepos+1);
			String[] opts = remainder.split(" ");
			for(int i=0; i<opts.length; i++){
				if (opts[i].length() > 0){
					RequestOptionEnum val = RequestOptionEnum.get(opts[i]);
					if (val == null)
						throw(new DmcValueException(opts[i] + " is not a valid option."));
					options.add(val);
				}
			}
		}
		
			
	}
	
	public String getFunctionName(){
		return(functionName);
	}
	
	public HashSet<RequestOptionEnum> getOptions(){
		return(options);
	}
	
	@Override
	public String toString(){
		if (options.size() == 0)
			return(functionName);
		else{
			StringBuffer sb = new StringBuffer();
			sb.append(functionName);
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
		
		if (obj instanceof GetWithOptions){
			GetWithOptions other = (GetWithOptions)obj;
			if (functionName.equals(other.functionName)){
				if (options.equals(other.options)){
					rc = true;
				}
			}
		}
		return(rc);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
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
