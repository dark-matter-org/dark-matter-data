package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmp.server.generated.dmw.EventDMW;
import org.dmd.dmp.shared.generated.dmo.EventDMO;

public class Event extends EventDMW {

	public Event(){
		super();
	}
	
	/**
	 * A convenience function to set the modify attribute directly on the
	 * underlying EventDMO object.
	 * @param mods
	 * @throws DmcValueException
	 */
	public void setModify(DmcTypeModifier mods) throws DmcValueException{
		getDmcObject().add(EventDMO.__modify,mods);
	}
}
