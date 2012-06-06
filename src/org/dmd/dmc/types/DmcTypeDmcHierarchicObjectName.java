package org.dmd.dmc.types;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcHierarchicObjectName;

@SuppressWarnings("serial")
abstract public class DmcTypeDmcHierarchicObjectName<VALUE extends DmcHierarchicObjectName> extends DmcTypeDmcObjectName<VALUE> {

	public DmcTypeDmcHierarchicObjectName(){
		
	}
	
	public DmcTypeDmcHierarchicObjectName(DmcAttributeInfo ai) {
		super(ai);
	}

}
