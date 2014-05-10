package org.dmd.dms.server.extended;

import org.dmd.core.DmcObject;
import org.dmd.core.interfaces.DmcDefinitionIF;
import org.dmd.dms.server.generated.dmw.DSDefinitionDMW;


public class DSDefinition extends DSDefinitionDMW implements DmcDefinitionIF {

	protected DSDefinition(){
		
	}
	
	protected DSDefinition(DmcObject obj){
		super(obj);
	}
	
	protected DSDefinition(DmcObject obj, ClassDefinition cd) {
		super(obj,cd);
	}
	
	public String getNameOfModuleWhereThisCameFrom(){
		throw(new IllegalStateException("This method should have been overloaded during DMW wrapper generation"));
	}
}
