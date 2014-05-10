package org.dmd.dmw;

import org.dmd.core.interfaces.DmcNamedObjectIF;
import org.dmd.core.DmcObject;
import org.dmd.dms.server.extended.ClassDefinition;

/**
 * The DmwNamedObjectWrapper extends the basic wrapper to indicate that the
 * wrapped object is named.
 */
abstract public class DmwNamedObjectWrapper extends DmwWrapper implements DmcNamedObjectIF {

	protected DmwNamedObjectWrapper(){
		
	}
	
	protected DmwNamedObjectWrapper(DmcObject obj){
		super(obj);
	}
	
	protected DmwNamedObjectWrapper(DmcObject obj, ClassDefinition cd){
		super(obj,cd);
	}
	
}
