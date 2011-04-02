package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.DMPEventDMW;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.DmwWrapper;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmw.DmwOmni;
import org.dmd.dmw.DmwWrapperBase;

public class DMPEvent extends DMPEventDMW {

	public DMPEvent(){
		super();
	}
	
	@SuppressWarnings("unchecked")
	public DMPEvent(DMPEventTypeEnum et, DmwWrapperBase w){
		super();
		setEventTypeDMP(et);
		setObjClass(w.getConstructionClass().getName().getNameString());
		if (w.getConstructionClass().getIsNamedBy() != null){
			AttributeDefinition ad = w.getConstructionClass().getIsNamedBy();
			if (ad != null)
				setObjName(w.getDmcObject().get(ad.getDmdID()));
		}
		
		if (et == DMPEventTypeEnum.CREATED){
			setEventObject(w.getDmcObject());
		}
		else if (et == DMPEventTypeEnum.DELETED){
			AttributeDefinition ad = w.getConstructionClass().getIsNamedBy();
			if (ad != null)
				setObjName(w.getDmcObject().get(ad.getDmdID()));
		}
		else if (et == DMPEventTypeEnum.MODIFIED){
			try {
				setModify(w.getModifier());
			} catch (DmcValueException e) {
				throw(new IllegalStateException("Setting the modifier on an event with the modifier from an object shouldn't throw an exception.", e));
			}
		}
	}
	
	
	
	@Override
	public DmcTypeModifierMV getModifier(){
		throw(new IllegalStateException("It makes no sense to retrieve the modifier from an event - you probably meant getModify()."));
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
	public void setModify(DmcTypeModifierMV mods) throws DmcValueException{
		getDmcObject().add(DMPEventDMO.__modify,mods);
	}
	
	/**
	 * A convenience method to directly access the modify attribute which must be
	 * passed to the DmcObject.applyModifier() method.
	 * @return The modify attribute.
	 */
	public DmcTypeModifierMV getModifyAttribute(){
		return (DmcTypeModifierMV) (getDmcObject().get(DMPEventDMO.__modify));
	}
	
	/**
	 * If the event object has generated/extended DMW code, this method will return the 
	 * DMO wrapped in its associated DMW object.
	 * @return The wrapped DMO.
	 */
	public DmwWrapper getEventObjectWrapped(){
		if (getEventObject() == null)
			return(null);
		return(DmwOmni.instance().wrapIt(getEventObject()));
	}

}
