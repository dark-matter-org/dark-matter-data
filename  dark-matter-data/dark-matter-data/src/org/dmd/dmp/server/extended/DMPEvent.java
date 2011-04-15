package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.DMPEventDMW;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.dms.DmwWrapper;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmw.DmwOmni;
import org.dmd.dmw.DmwWrapperBase;

public class DMPEvent extends DMPEventDMW {

	public DMPEvent(){
		super();
	}
	
	public DMPEvent(DMPEventTypeEnum et, DmwWrapperBase w){
		super();
		setEventTypeDMP(et);
		setObjClass(w.getConstructionClass().getName().getNameString());
		if (w instanceof DmcNamedObjectIF){
			DmcObjectName on = ((DmcNamedObjectIF)w).getObjectName();
			if (on != null)
				try {
					setSource(on);
				} catch (DmcValueException e) {
					throw(new IllegalStateException("Should not throw exception setting objName with a DmcObjectName."));
				}
		}
		
		if (et == DMPEventTypeEnum.CREATED){
			setSourceObject(w.getDmcObject());
		}
		else if (et == DMPEventTypeEnum.DELETED){
			if (w instanceof DmcNamedObjectIF){
				DmcObjectName on = ((DmcNamedObjectIF)w).getObjectName();
				if (on != null)
					try {
						setSource(on);
					} catch (DmcValueException e) {
						throw(new IllegalStateException("Should not throw exception setting objName with a DmcObjectName."));
					}
			}
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
	
	public DmcObjectName getSourceName(){
		if (getSource() == null)
			return(null);
		
		return(getSource().getName());
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
	public DmwWrapper getSourceObjectWrapped(){
		if (getSourceObject() == null)
			return(null);
		return(DmwOmni.instance().wrapIt(getSourceObject()));
	}

}
