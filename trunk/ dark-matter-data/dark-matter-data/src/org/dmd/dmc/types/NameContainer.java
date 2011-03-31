package org.dmd.dmc.types;

import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;


public class NameContainer {

	DmcTypeDmcObjectName<?>	name;
	
	public NameContainer(){
		name = null;
	}
	
	public void serializeIt(DmcOutputStreamIF dos) throws Exception {
		name.serializeIt(dos);
	}

	public void deserializeIt(DmcInputStreamIF dis) throws Exception {
		name =  (DmcTypeDmcObjectName<?>) dis.getAttributeInstance();
		name.deserializeIt(dis);
	}

	public NameContainer cloneIt() {
		NameContainer rc = new NameContainer();
		rc.name = name;
		return(rc);
	}


}
