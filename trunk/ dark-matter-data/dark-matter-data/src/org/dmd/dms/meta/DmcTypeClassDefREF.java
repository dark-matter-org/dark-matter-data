package org.dmd.dms.meta;

import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.types.ClassDefinitionREF;

@SuppressWarnings("serial")
public class DmcTypeClassDefREF extends DmcTypeNamedObjectREF<ClassDefinitionREF> {

	@Override
	protected ClassDefinitionREF getNewHelper() {
		return (new ClassDefinitionREF());
	}

	@Override
	protected String getDMOClassName() {
		return(ClassDefinitionDMO.class.getName());
	}

	@Override
	protected boolean isDMO(Object value) {
		if (value instanceof ClassDefinitionDMO)
			return(true);
		
		return(false);
	}

	

}
