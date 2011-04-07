package org.dmd.dmt;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcLoggerIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectNameIF;

public class TestLogger implements DmcLoggerIF {

	@Override
	public void logDeadReference(DmcObject referrer, DmcAttribute<?> viaAttribute, DmcObjectNameIF referenceTo) {
		DmcNamedObjectIF from = (DmcNamedObjectIF) referrer;
		System.out.println("Couldn't resolve reference from " + from.getObjectName() + " via " + viaAttribute.getName() + " to " + referenceTo);
		
	}

}
