package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmp.server.generated.dmw.EventDMW;
import org.dmd.dmp.shared.generated.dmo.EventDMO;
import org.dmd.dmp.shared.generated.enums.EventTypeEnum;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dmw.DmwWrapperBase;

public class Event extends EventDMW {

	public Event(){
		super();
	}
	
	@SuppressWarnings("unchecked")
	public Event(EventTypeEnum et, DmwWrapperBase w){
		super();
		setEventType(et);
		setObjClass(w.getConstructionClass().getName().getNameString());
		if (w.getConstructionClass().getIsNamedBy() != null){
			AttributeDefinition ad = w.getConstructionClass().getIsNamedBy();
			setObjName(w.getDmcObject().get(ad.getDmdID()));
		}
		if (et == EventTypeEnum.CREATED){
			setEventObject(w.getDmcObject());
		}
	}
	
	public DmcObjectNameIF getEventObjectName(){
		DmcAttribute<?> n = getObjName();
		return((DmcObjectNameIF)n.getSV());
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
