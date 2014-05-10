package org.dmd.dms.server.extended;

import org.dmd.dms.server.generated.dmw.ExtendedReferenceTypeDefinitionDMW;


public class ExtendedReferenceTypeDefinition extends ExtendedReferenceTypeDefinitionDMW {

	TypeDefinition	internalType;
	
	public void setInternalType(TypeDefinition internalType) {
		this.internalType = internalType;
	}
	
	public TypeDefinition getInternalType(){
		return(internalType);
	}
}
