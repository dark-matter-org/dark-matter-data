package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmw.DSDefinitionDMW;

public class DSDefinition extends DSDefinitionDMW {

	protected DSDefinition(){
		
	}
	
	protected DSDefinition(DmcObject obj){
		super(obj);
	}
	
	protected DSDefinition(DmcObject obj, ClassDefinition cd) {
		super(obj,cd);
	}
	
}
