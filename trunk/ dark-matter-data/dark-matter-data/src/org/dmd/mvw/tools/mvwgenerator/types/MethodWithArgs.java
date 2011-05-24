package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The MethodWithArgs class is used to store a local method call and possibly an argument vector
 * and fully qualified class names in the form:
 * functionName(type arg1, type arg2...) com.example.class java.util.Hashmap
 */
@SuppressWarnings("serial")
public class MethodWithArgs implements DmcMappedAttributeIF, Serializable {

	String methodName;
	String argVector;
	TreeSet<String> imports;
	
	public MethodWithArgs(){
		methodName = null;
		argVector = null;
		imports = null;
	}
	
	public MethodWithArgs(String en, String av, TreeSet<String> i){
		methodName 	= en;
		argVector 	= av;
		imports 	= i;
	}
	
	public MethodWithArgs(MethodWithArgs ewa){
		methodName 	= ewa.methodName;
		argVector 	= ewa.argVector;
		imports 	= ewa.imports;
	}
	
	public MethodWithArgs(String v) throws DmcValueException{
		String value = v.trim();
		int lbpos = value.indexOf("(");
		
		if (lbpos == -1)
			throw(new DmcValueException("You must specify the argument vector, even if it's empty i.e ()"));

		int rbpos = value.indexOf(")", lbpos+1);
		
		if (rbpos == -1)
			throw(new DmcValueException("Missing ) for the argument vector."));
			

		methodName = value.substring(0, lbpos);			
		argVector 	= value.substring(lbpos,rbpos+1);
		imports 	= new TreeSet<String>();
		
		if (value.length() > (rbpos+1)){
			// the remainder should be space separated fully qualified class names
			String remainder = value.substring(rbpos+1);
			
			String[] classes = remainder.split(" ");
			for(int i=0; i<classes.length; i++){
				if (classes[i].length() > 0){
					imports.add(classes[i]);
				}
			}
		}
					
	}
	
	public String getMethodName(){
		return(methodName);
	}
	
	public String getArgVector(){
		return(argVector);
	}
	
	public TreeSet<String> getImports(){
		return(imports);
	}
	
	@Override
	public String toString(){
		if (imports.size() == 0)
			return(methodName + argVector);
		else{
			StringBuffer sb = new StringBuffer();
			sb.append(methodName + argVector);
			Iterator<String> it = imports.iterator();
			while(it.hasNext()){
				sb.append(" " + it.next());
			}
			
			return(sb.toString());
		}
	}

	@Override
	public Object getKey() {
		return(methodName);
	}

	@Override
	public String getKeyAsString() {
		return(methodName);
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		boolean rc = false;
		
		if (obj instanceof MethodWithArgs){
			MethodWithArgs other = (MethodWithArgs)obj;
			if (methodName.equals(other.methodName)){
				if (argVector.equals(other.argVector)){
					if (imports.equals(other.imports)){
						rc = true;
					}
				}
			}
		}
		return(rc);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(methodName);
		dos.writeUTF(argVector);
		if (imports.size() == 0){
			dos.writeInt(0);
		}
		else{
			dos.writeInt(imports.size());
			Iterator<String> it = imports.iterator();
			while(it.hasNext()){
				dos.writeUTF(it.next());
			}
		}
	}
	
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		methodName = dis.readUTF();
		argVector = dis.readUTF();
		imports = new TreeSet<String>();
		int size = dis.readInt();
		
		if (size > 0){
			for(int i=0; i<size; i++){
				imports.add(dis.readUTF());
			}
		}
	}
}
