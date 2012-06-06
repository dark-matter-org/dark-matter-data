package org.dmd.dms;

import org.dmd.dms.generated.dmw.ExtendedReferenceTypeDefinitionDMW;

public class ExtendedReferenceTypeDefinition extends ExtendedReferenceTypeDefinitionDMW {

	TypeDefinition	internalType;
	
	public void setInternalType(TypeDefinition internalType) {
		this.internalType = internalType;
	}
	
	public TypeDefinition getInternalType(){
		return(internalType);
	}
}
