package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmw.ConcinnityDMW;

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
