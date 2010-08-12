package org.dmd.dmw;

import org.dmd.dmc.DmcContainer;
import org.dmd.dmc.DmcObject;

/**
 * The DmwBase class provides a common base for Dark Matter Wrapper classes
 * and provides basic functionality beyond what's defined for a DmcContainer.
 * this includes things like formatting of DMOs in Object Instance Format - like
 * the basic DmcObject format - but with nicer formatting.
 */
public class DmwWrapperBase extends DmcContainer {
	
    protected DmwWrapperBase(DmcObject obj) {
        super(obj);
    }

	////////////////////////////////////////////////////////////////////////////////
	// DmcContainerIF implementation
	
	@Override
	public DmcObject getDmcObject() {
		return core;
	}

	@Override
	public void setDmcObject(DmcObject obj) {
		core = obj;
	}

}
