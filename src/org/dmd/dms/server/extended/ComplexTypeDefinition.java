package org.dmd.dms.server.extended;

import org.dmd.core.DmcObject;
import org.dmd.dms.server.generated.dmw.ComplexTypeDefinitionDMW;


public class ComplexTypeDefinition extends ComplexTypeDefinitionDMW {
	
	public ComplexTypeDefinition(){
		
	}

	public ComplexTypeDefinition(DmcObject obj){
		super(obj);
	}

	public ComplexTypeDefinition(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
	}
}
