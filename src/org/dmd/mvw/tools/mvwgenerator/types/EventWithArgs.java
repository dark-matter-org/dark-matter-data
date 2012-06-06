package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The EventWithArgs class is used to store an event name and possibly an argument vector
 * and fully qualified class names in the form:
 * eventName (type arg1, type arg2...) com.example.class java.util.Hashmap
 */
@SuppressWarnings("serial")
public class EventWithArgs implements DmcMappedAttributeIF, Serializable {

	String eventName;
	String argVector;
	TreeSet<String> imports;
	
	public EventWithArgs(){
		eventName = null;
		argVector = null;
		imports = null;
	}
	
	public EventWithArgs(String en, String av, TreeSet<String> i){
		eventName 	= en;
		argVector 	= av;
		imports 	= i;
	}
	
	public EventWithArgs(EventWithArgs ewa){
		eventName 	= ewa.eventName;
		argVector 	= ewa.argVector;
		imports 	= ewa.imports;
	}
	
	public EventWithArgs(String v) throws DmcValueException{
		String value = v.trim();
		int spacepos = value.indexOf(" ");
		
		if (spacepos == -1){
			eventName 	= value;
			argVector 	= "()";
			imports 	= new TreeSet<String>();
		}
		else{
			eventName = value.substring(0, spacepos);
			int lbpos = value.indexOf("(", spacepos+1);
			int rbpos = value.indexOf(")", spacepos+1);
			
			if (lbpos == -1)
				throw(new DmcValueException("The argument vector must start with a ("));
			if (rbpos == -1)
				throw(new DmcValueException("The argument vector must end with a )"));
			
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
		
		if (!eventName.endsWith("Event"))
			throw(new DmcValueException("The event name must end with `Event`)"));
			
	}
	
	public String getEventName(){
		return(eventName);
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
			return(eventName + " " + argVector);
		else{
			StringBuffer sb = new StringBuffer();
			sb.append(eventName + " " + argVector);
			Iterator<String> it = imports.iterator();
			while(it.hasNext()){
				sb.append(" " + it.next());
			}
			
			return(sb.toString());
		}
	}

	@Override
	public Object getKey() {
		return(eventName);
	}

	@Override
	public String getKeyAsString() {
		return(eventName);
	}

	@Override
	public boolean valuesAreEqual(DmcMappedAttributeIF obj) {
		boolean rc = false;
		
		if (obj instanceof EventWithArgs){
			EventWithArgs other = (EventWithArgs)obj;
			if (eventName.equals(other.eventName)){
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
		dos.writeUTF(eventName);
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
		eventName = dis.readUTF();
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
