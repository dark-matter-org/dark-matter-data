package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmw.DSDefinitionModuleDMW;

public class DSDefinitionModule extends DSDefinitionModuleDMW {
	
	public DSDefinitionModule(){
		
	}
	
	protected DSDefinitionModule(DmcObject obj){
		super(obj);
	}
	
	protected DSDefinitionModule (DmcObject obj, ClassDefinition cd){
		super(obj,cd);
	}

}
