package org.dmd.dms;

import java.util.Iterator;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmw.ComplexTypeDefinitionDMW;
import org.dmd.dms.generated.types.Part;

public class ComplexTypeDefinition extends ComplexTypeDefinitionDMW {
	
	public ComplexTypeDefinition(){
		
	}

	public ComplexTypeDefinition(DmcObject obj){
		super(obj);
	}

	public ComplexTypeDefinition(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	/**
	 * @return true if this complex type has parts that are reference types.
	 */
	public boolean hasReferenceTypeParts(){
		boolean rc = false;
		
		if (getRequiredPartSize() > 0){
			Iterator<Part> it = getRequiredPart();
			while(it.hasNext()){
				Part p = it.next();
				TypeDefinition td = (TypeDefinition) p.getType().getObject().getContainer();
				if (td.getIsRefType()){
					rc = true;
					break;
				}
			}
		}
		if (!rc && (getOptionalPartSize() > 0)){
			Iterator<Part> it = getOptionalPart();
			while(it.hasNext()){
				Part p = it.next();
				TypeDefinition td = (TypeDefinition) p.getType().getObject().getContainer();
				if (td.getIsRefType()){
					rc = true;
					break;
				}
			}
		}
		
		return(rc);
	}
}
