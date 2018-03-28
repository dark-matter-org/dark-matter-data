package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.definitions.DmcDefinitionIF;
import org.dmd.dmc.types.DotName;
import org.dmd.dms.generated.dmw.DSDefinitionDMW;

public class DSDefinition extends DSDefinitionDMW implements DmcDefinitionIF {
	
	private static DotName fullDotName;

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
	
	public DotName getFullDotName() {
		if (fullDotName == null) {
			try {
				fullDotName = new DotName(getNameOfModuleWhereThisCameFrom()+ "." + getName() + "." + getConstructionClassName());
			} catch (DmcValueException e) {
				throw(new IllegalStateException("Could not create full dot name: " + e.toString()));
			}
		}
		return(fullDotName);
	}
}
