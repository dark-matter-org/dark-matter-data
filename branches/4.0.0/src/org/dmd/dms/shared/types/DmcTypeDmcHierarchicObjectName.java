package org.dmd.dms.shared.types;

import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.DmcHierarchicObjectName;

@SuppressWarnings("serial")
abstract public class DmcTypeDmcHierarchicObjectName<VALUE extends DmcHierarchicObjectName> extends DmcTypeDmcObjectName<VALUE> {

	public DmcTypeDmcHierarchicObjectName(){
		
	}
	
	public DmcTypeDmcHierarchicObjectName(DmcAttributeInfo ai) {
		super(ai);
	}

}
