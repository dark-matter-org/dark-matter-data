package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmp.server.generated.dmw.DMPEventDMW;
import org.dmd.dmp.shared.generated.dmo.EventDMO;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dmw.DmwWrapperBase;

public class DMPEvent extends DMPEventDMW {

	public DMPEvent(){
		
	}
	
	@SuppressWarnings("unchecked")
	public DMPEvent(DMPEventTypeEnum et, DmwWrapperBase w){
		super();
		setEventTypeDMP(et);
		setObjClass(w.getConstructionClass().getName().getNameString());
		if (w.getConstructionClass().getIsNamedBy() != null){
			AttributeDefinition ad = w.getConstructionClass().getIsNamedBy();
			setObjName(w.getDmcObject().get(ad.getDmdID()));
		}
		if (et == DMPEventTypeEnum.CREATED){
			setEventObject(w.getDmcObject());
		}
		else if (et == DMPEventTypeEnum.MODIFIED){
			try {
				setModify(w.getModifier());
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
