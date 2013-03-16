package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmw.ComplexTypeDefinitionDMW;

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
