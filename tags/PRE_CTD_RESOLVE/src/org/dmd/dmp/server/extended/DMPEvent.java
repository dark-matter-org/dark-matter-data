package org.dmd.dmp.server.extended;

import java.util.Iterator;

import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcSliceInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.Modifier;
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
	
	public DMPEvent(DMPEventDMO obj){
		super(obj);
	}
	
	public DMPEvent(DMPEventTypeEnum et, DmwWrapperBase w){
		super();
		setEventTypeDMP(et);
		setSourceObjectClass(w.getConstructionClass().getName().getNameString());
		if (w instanceof DmcNamedObjectIF){
			DmcObjectName on = ((DmcNamedObjectIF)w).getObjectName();
			if (on != null)
				setSource(on);
		}
		
		if (et == DMPEventTypeEnum.CREATED){
			setSourceObject(w.getDmcObject());
		}
		else if (et == DMPEventTypeEnum.DELETED){
			if (w instanceof DmcNamedObjectIF){
				DmcObjectName on = ((DmcNamedObjectIF)w).getObjectName();
				if (on != null)
					setSource(on);
			}
		}
		else if (et == DMPEventTypeEnum.MODIFIED){
			if (w.getModifier() == null)
				throw(new IllegalStateException("Tried to create a MODIFIED event for an object with no modifications."));
			
			setModify(w.getModifier());
		}
	}
	
	/**
	 * A convenience constructor that creates a MODIFIED event based on the contents of
	 * the SetRequest passed as argument. The source will be the target of the request.
	 * @param request
	 */
	public DMPEvent(SetRequest request){
		setEventTypeDMP(DMPEventTypeEnum.MODIFIED);
		setSource(request.getTarget());
		
		if (request.getTargetObjectClass() != null)
			setSourceObjectClass(request.getTargetObjectClass());
		
		if (request.getModifyAttribute() == null)
			throw(new IllegalStateException("Tried to create a MODIFIED event from a SetRequest with no modifications."));

		setModify(request.getModifyAttribute());
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
	 */
	public void setModify(DmcTypeModifierMV mods){
		try {
			getDmcObject().add(DMPEventDMO.__modify,mods);
		} catch (DmcValueException e) {
			throw(new IllegalStateException("Setting the modify attribute directly with a DmcTypeModifierMV shouldn't thrown an exception.",e));
		}
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
	
	/**
	 * @return The DmcSliceInfo if the slice is defined on this event.
	 */
	public DmcSliceInfo getSliceInfo(){
		if (getSlice() == null)
			return(null);
		
		return(DmcOmni.instance().getSliceInfo(getSlice()));
	}

	/**
	 * This method will slice the event appropriately, depending on the type of event and
	 * the specified slice.
	 * <P>
	 * If this is a MODIFIED event, we will check to see if any of the attributes in the 
	 * modifier are associated with the specified slice. If so, a new DMPEvent is returned
	 * that has the modifier sliced to contain only changes associated with the slice. If not,
	 * null is returned.
	 * <P>
	 * If this is a CREATED event, we check to see if the newly created object contains any
	 * of the attributes associated with the slice. If so, we create a new DmpEvent is returned
	 * that has the new object
	 * @param dsi
	 * @return
	 */
	public DMPEvent getSlice(DmcSliceInfo dsi){
		DMPEvent rc = null;
		
		if (getEventTypeDMP() == DMPEventTypeEnum.MODIFIED){
			// Pull the modifier
			DmcTypeModifierMV source = getModifyAttribute();
			
			// Check if the modifier touches any of the attributes in the slice
			DmcTypeModifierMV sliced = getModifierSlice(dsi, source);
			
			// If we get a value back from getModifierSlice() it means that the sliced attributes were touched
			// Whether they were touched inappropriately remains to be seen!
			if (sliced != null){
				// We create a new DMPEvent which contains a shallow copy of the DMO - this is just a straight
				// populating of the attribute map with the original DMO's attributes
				rc = new DMPEvent((DMPEventDMO) this.getDMO().shallowCopy());
				
				rc.setSlice(dsi.getName());
				
				// We remove the original modify attribute - this doesn't harm the modify
				// in the original event
				rc.remModify();
				
				try {
					// And then we replace the modifier with our sliced modifier
					rc.getDMO().set(DMPEventDMO.__modify, sliced);
				} catch (DmcValueException e) {
					throw(new IllegalStateException("Dropping the sliced modifier in our shallow copy shouldn't throw an exception!"));
				}
			}
		}
		else if (getEventTypeDMP() == DMPEventTypeEnum.CREATED){
			DmcObject sliced = getSourceObject().getSlice(dsi);
			if (sliced.numberOfAttributes() > 1){
				// We have more than the objectClass attribute so create the new event
				rc = new DMPEvent((DMPEventDMO) this.getDMO().shallowCopy());
				
				rc.setSlice(dsi.getName());
				
				// Remove the original source object
				rc.remSourceObject();
				
				// Replace it with the sliced object
				rc.setSourceObject(sliced);
			}
		}
		else if (getEventTypeDMP() == DMPEventTypeEnum.DELETED){
			// Just return the current event - slicing doesn't make much sense when
			// we just have the name
			rc = this;
		}
		
		return(rc);
	}
	
	/**
	 * Determines if the specified source modifier contains any of the attributes in the specified slice.
	 * @param slice the slice of attributes.
	 * @param source the source modifier.
	 * @return The modifier with the sliced attributes or null if none of the attributes matched.
	 */
	DmcTypeModifierMV getModifierSlice(DmcSliceInfo slice, DmcTypeModifierMV source){
		DmcTypeModifierMV rc = new DmcTypeModifierMV();
		
		Iterator<Modifier> mods = source.getMV();
		while(mods.hasNext()){
			Modifier mod = mods.next();
			if (slice.contains(mod.getAttributeID())){
				try {
					rc.add(mod);
				} catch (DmcValueException e) {
					throw(new IllegalStateException("Should not throw an exception adding a Modifier to a DmcTypeModifier"));
				}
			}
		}
		
		if (rc.getMVSize() == 0)
			rc = null;
		
		return(rc);
	}
		

}