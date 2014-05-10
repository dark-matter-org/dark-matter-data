package org.dmd.dms.server.extended;

import org.dmd.core.DmcObject;
import org.dmd.dms.server.generated.dmw.ConcinnityDMW;

abstract public class Concinnity extends ConcinnityDMW {
	
	protected Concinnity(){
		super();
	}

	protected Concinnity(DmcObject obj){
		super(obj);
	}
	
	protected Concinnity(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
	}
	
}
