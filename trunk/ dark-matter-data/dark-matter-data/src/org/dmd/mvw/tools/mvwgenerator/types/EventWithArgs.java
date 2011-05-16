package org.dmd.mvw.tools.mvwgenerator.types;

import java.io.Serializable;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcMappedAttributeIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcValueException;

/**
 * The EventWithArgs class is used to store an event name and an argument vector
 * in the form: eventName (type arg1, type arg2...)
 */
@SuppressWarnings("serial")
public class EventWithArgs implements DmcMappedAttributeIF, Serializable {

	String eventName;
	String argVector;
	
	public EventWithArgs(){
		eventName = null;
		argVector = null;
	}
	
	public EventWithArgs(String en, String av){
		eventName = en;
		argVector = av;
	}
	
	public EventWithArgs(EventWithArgs ewa){
		eventName = ewa.eventName;
		argVector = ewa.argVector;
	}
	
	public EventWithArgs(String v) throws DmcValueException{
		String value = v.trim();
		int spacePos = value.indexOf(" ");
		
		if (spacePos == -1){
			eventName = value;
			argVector = "()";
		}
		else{
			eventName = value.substring(0, spacePos);
			argVector = value.substring(spacePos+1);
			
			if (! argVector.startsWith("(")){
				throw(new DmcValueException("The argument vector must start with a ("));
			}
			if (! argVector.endsWith(")")){
				throw(new DmcValueException("The argument vector must end with a )"));
			}
		}
	}
	
	@Override
	public String toString(){
		return(eventName + " " + argVector);
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
				if (argVector.equals(other.argVector))
					rc = true;
			}
		}
		return(rc);
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(eventName);
		dos.writeUTF(argVector);
	}
	
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		eventName = dis.readUTF();
		argVector = dis.readUTF();
	}
}
