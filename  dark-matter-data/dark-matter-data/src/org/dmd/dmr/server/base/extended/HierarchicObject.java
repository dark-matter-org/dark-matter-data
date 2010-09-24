package org.dmd.dmr.server.base.extended;

import org.dmd.dmr.server.base.generated.dmw.HierarchicObjectDMW;
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;
import org.dmd.dms.ClassDefinition;

/**
 * The extended HierarchicObject class provides a variety of functionality
 * that makes using hierarchic objects convenient.
 * 
 */
public class HierarchicObject extends HierarchicObjectDMW {
	
//	// The parent of this object
//	HierarchicObject			parent;
//	
//	// The children of this object
//	ArrayList<HierarchicObject>	children;
	
	protected HierarchicObject(HierarchicObjectDMO obj, ClassDefinition cd) {
		super(obj,cd);
	}

}
