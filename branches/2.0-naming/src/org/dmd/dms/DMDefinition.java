package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmw.DMDefinitionDMW;

abstract public class DMDefinition extends DMDefinitionDMW {

	protected DMDefinition(DmcObject obj){
		super(obj);
	}
	
	protected DMDefinition(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
	}
}
