package org.dmd.dmr.server.base.extended;

import java.util.ArrayList;

import org.dmd.dmc.DmcObject;
import org.dmd.dmr.server.base.generated.dmw.HierarchicObjectDMW;

/**
 * The extended HierarchicObject class provides a variety of functionality
 * that makes using hierarchic objects convenient.
 * 
 */
public class HierarchicObject extends HierarchicObjectDMW {
	
	// The parent of this object
	HierarchicObject			parent;
	
	// The children of this object
	ArrayList<HierarchicObject>	children;
	
	protected HierarchicObject(DmcObject obj) {
		super(obj);
	}

}
