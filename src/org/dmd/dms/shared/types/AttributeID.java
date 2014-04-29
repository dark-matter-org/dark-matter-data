package org.dmd.dms.shared.types;

import java.io.Serializable;

import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.interfaces.DmcInputStreamIF;
import org.dmd.core.interfaces.DmcOutputStreamIF;

@SuppressWarnings("serial")
public class AttributeID implements Serializable {

	Integer	id;
	
	public AttributeID(){
		
	}
	
	public AttributeID(AttributeID original){
		id = original.id;
	}
	
	public AttributeID(DmcAttributeInfo ai){
		id = ai.id;
	}
	
	public AttributeID(String val){
		id = Integer.parseInt(val);
	}
	
	public boolean equals(Object obj){
		if (obj instanceof AttributeID)
			return(id.equals(((AttributeID)obj).id));
		return(false);
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		id = dis.readInt();
	}

	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		dos.writeInt(id);
	}

	public int compareTo(AttributeID o) {
		if (o instanceof AttributeID){
			return(id.compareTo(((AttributeID)o).id));
		}
		return(-1);
	}

	@Override
	public int hashCode(){
		return(id.hashCode());
	}

}
