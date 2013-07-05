package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmw.DMDefinitionModuleDMW;

public class DMDefinitionModule extends DMDefinitionModuleDMW {

	public DMDefinitionModule(){
		
	}
	
	protected DMDefinitionModule(DmcObject obj){
		super(obj);
	}
	
	protected DMDefinitionModule(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
	}
}
