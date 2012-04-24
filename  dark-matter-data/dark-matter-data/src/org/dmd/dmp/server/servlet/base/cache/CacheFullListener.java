package org.dmd.dmp.server.servlet.base.cache;

import org.dmd.dmp.server.servlet.base.interfaces.DmpEventHandlerIF;

/**
 * The CacheFullListener is a listener that is interested in ALL events 
 * associated with the cache and should be used with caution!
 */
public class CacheFullListener extends CacheListener {

	public CacheFullListener(CacheRegistration reg, DmpEventHandlerIF eh) {
		super(reg, eh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTraceInfo() {
		return("CacheFullListener registrant ID: " + cacheRegistration.getID() + " listener ID: " + getListenerID());
	}

}
