package org.dmd.mvw.client.gxt.dmw;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;

public abstract class GxtNamedObjectWrapper extends GxtWrapper implements DmcNamedObjectIF {

	protected GxtNamedObjectWrapper(DmcObject obj) {
		super(obj);
	}

}
