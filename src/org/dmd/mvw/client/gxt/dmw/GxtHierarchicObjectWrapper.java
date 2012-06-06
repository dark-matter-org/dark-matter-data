package org.dmd.mvw.client.gxt.dmw;

import java.util.TreeMap;

import org.dmd.dmc.DmcHierarchicNamedObjectIF;
import org.dmd.dmc.DmcHierarchicObjectName;
import org.dmd.dmc.DmcObject;

public abstract class GxtHierarchicObjectWrapper extends GxtNamedObjectWrapper implements DmcHierarchicNamedObjectIF {

	GxtHierarchicObjectWrapper									parent;
	TreeMap<DmcHierarchicObjectName,GxtHierarchicObjectWrapper>	children;
	
	protected GxtHierarchicObjectWrapper(DmcObject obj){
		super(obj);
		if ( !(obj instanceof DmcHierarchicNamedObjectIF)){
			throw(new IllegalStateException("Objects wrapped by a GxtHierarchicObjectWrapper must implement DmcHierarchicNamedObjectIF"));
		}
	}
	
}
