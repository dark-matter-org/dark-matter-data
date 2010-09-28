package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmo.DmsDefinitionDMO;
import org.dmd.dms.generated.dmw.DmwWrapperDMW;

public class DmwWrapper extends DmwWrapperDMW {

	/**
	 * Constructs a new DmsDefinition for use with the meta schema.
	 */
	protected DmwWrapper(DmcObject obj){
		super(obj);
	}
	
	protected DmwWrapper(ClassDefinition cd){
		super();
	}

}
