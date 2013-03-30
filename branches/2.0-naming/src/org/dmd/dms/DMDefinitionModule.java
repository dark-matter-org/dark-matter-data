package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmw.DMDefinitionModuleDMW;

abstract public class DMDefinitionModule extends DMDefinitionModuleDMW {

	protected DMDefinitionModule(DmcObject obj){
		super(obj);
	}
	
	protected DMDefinitionModule(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
	}
}
