package org.dmd.dmp.server.servlet.base.cache;

import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcSliceInfo;
import org.dmd.dmp.server.servlet.base.interfaces.DmpEventHandlerIF;

/**
 * The CacheIndexListener allows for listening to a particular class
 * index within the cache; any changes to the index are reported to this
 * listener.
 */
public class CacheIndexListener extends CacheListener {
	
	// The class index to which we're listening
	private final DmcClassInfo	classInfo;

	public CacheIndexListener(CacheRegistration reg, DmpEventHandlerIF eh, DmcSliceInfo dsi, DmcClassInfo dci) {
		super(reg,eh,dsi);
		classInfo = dci;
	}
	
	public DmcClassInfo getClassInfo(){
		return(classInfo);
	}

	@Override
	public String getTraceInfo() {
		return("CacheIndexListener registrant ID: " + cacheRegistration.getID() + " listener ID: " + getListenerID() + " index: " + classInfo.name);
	}

//	@Override
//	public Collection<DmwNamedObjectWrapper> activateAndRetrieve() {
//		return(cacheRegistration.getCache().addListener(this));
//	}

}
