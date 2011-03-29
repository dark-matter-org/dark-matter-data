package org.dmd.dmc.types;

import java.io.Serializable;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;

@SuppressWarnings("serial")
public class FQNTuple implements Serializable {

	String className;
	String nameAttr;
	
	public FQNTuple(){
		className 	= null;
		nameAttr 	= null;
	}
	
	public FQNTuple(String c, String a){
		className 	= c;
		nameAttr 	= a;
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeUTF(className);
		dos.writeUTF(nameAttr);
	}
	
	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		className = dis.readUTF();
		nameAttr = dis.readUTF();
	}
	
	public String toString(){
		return(className + ":" + nameAttr);
	}
}
