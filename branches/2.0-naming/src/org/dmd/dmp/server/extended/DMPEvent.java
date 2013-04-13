//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmp.server.extended;

import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
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
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.enums.DataTypeEnum;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmw.DmwOmni;
import org.dmd.dmw.DmwWrapper;

public class DMPEvent extends DMPEventDMW {

	public DMPEvent(){
		super();
	}
	
	public DMPEvent(DMPEventDMO obj){
		super(obj);
	}
	
	public DMPEvent(DMPEventTypeEnum et, DmwWrapper w){
		super();
		setEventTypeDMP(et);
		setSourceObjectClass(w.getConstructionClass());
		if (w instanceof DmcNamedObjectIF){
			DmcObjectName on = ((DmcNamedObjectIF)w).getObjectName();
			if (on != null)
				setSource(on);
		}
		
		if (et == DMPEventTypeEnum.CREATED){
			setSourceObject(w.getDmcObject());
		}
		else if (et == DMPEventTypeEnum.LOADED){
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
			
			// Only add the modifier if there's something in it
			if (w.getModifier().getMVSize() > 0)
				setModify(w.getModifier());
		}
	}
	
	/**
	 * Returns a clone of this DMPEvent.
	 */
	public DMPEvent clone(){
		return(new DMPEvent((DMPEventDMO) this.getDMO().shallowCopy()));
	}
	
	/**
	 * Checks to see if the event contains information about persistent objects/attributes.
	 * A variety of checks are performed, depending on the type of the event.
	 * <p />
	 * If the source object class is not PERSISTENT, we return false.
	 * <p />
	 * If it's a CREATE event, we check to see if any of the attributes (beyond the objectClass)
	 * are PERSISTENT, if so, we return true.
	 * <p />
	 * If it's a DELETE event, we return true.
	 * <p />
	 * If it's a MODIFIED event, we check the modify attribute. If it refers to any PERSISTENT
	 * attribute, we return true.
	 * @return true if there's persistent data and false otherwise.
	 */
	public boolean hasPersistentData(){
		boolean rc = false;
		
		
		if (getSourceObjectClass() == null)
			throw(new IllegalStateException("Malformed DMPEvent. Missing source object class for a " + getEventTypeDMP() + " event."));
		
		if (getSourceObjectClass().getDataType() != DataTypeEnum.PERSISTENT)
			return(rc);

		if ( (getEventTypeDMP() == DMPEventTypeEnum.CREATED) || (getEventTypeDMP() == DMPEventTypeEnum.LOADED)){
			if (getSourceObject() == null)
				throw(new IllegalStateException("Malformed DMPEvent. Missing source object for a CREATE event."));
				
			for(DmcAttribute<?> attr: getSourceObject().getAttributes().values()){
				if (attr.getID() == DmcObject.__objectClass.id)
					continue;
				if (attr.getAttributeInfo().dataType == DataTypeEnum.PERSISTENT){
					rc = true;
					break;
				}
			}
		}
		else if (getEventTypeDMP() == DMPEventTypeEnum.DELETED){
			// The object is persistent and we only have the name, so go ahead
			rc = true;
		}
		else if (getEventTypeDMP() == DMPEventTypeEnum.MODIFIED){
			if (getModifyAttribute() == null)
				throw(new IllegalStateException("Malformed DMPEvent. Missing modify attribute for a MODIFIED event."));
			
			Iterator<Modifier>	modifiers = getModifyAttribute().getMV();
			if (modifiers != null){
				while(modifiers.hasNext()){
					Modifier mod = modifiers.next();
					if (mod.getAttribute() == null){
						if (mod.getModifyType() == ModifyTypeEnum.REM){
							AttributeDefinition ad = DmwOmni.instance().getSchema().adef(mod.getAttributeName());
							if (ad == null)
								throw(new IllegalStateException("Malformed DMPEvent. Could not get definition for attribute: " + mod.getAttributeName()));
							else
								if (ad.getDataType() == DataTypeEnum.PERSISTENT){
									rc = true;
									break;
								}
						}
						else if (mod.getModifyType() == ModifyTypeEnum.NTH){
							AttributeDefinition ad = DmwOmni.instance().getSchema().adef(mod.getAttributeName());
							if (ad == null)
								throw(new IllegalStateException("Malformed DMPEvent. Could not get definition for attribute: " + mod.getAttributeName()));
							else
								if (ad.getDataType() == DataTypeEnum.PERSISTENT){
									rc = true;
									break;
								}
						}
						else
							throw(new IllegalStateException("Malformed DMPEvent. Missing attribute for a Modifier: " + mod.toString()));
					}
					else if (mod.getAttribute().getAttributeInfo().dataType == DataTypeEnum.PERSISTENT){
						rc = true;
						break;
					}
				}
			}
			
		}
		
		return(rc);
	}
	
	/**
	 * This method will return either, the current event (if all information is PERSISTENT)
	 * or a trimmed down clone of the event with non-PERSISTENT information removed. 
	 * <p/>
	 * If none of the data is PERSISTENT, null is returned.
	 * <p />
	 * If the source object class is not PERSISTENT, we return null.
	 * <p />
	 * If it's a CREATED/LOADED event, we check to see if any of the attributes are non-PERSISTENT,
	 * if so, we strip those attributes from the source object and return a clone of the event 
	 * with the source object replaced with a new source object WITHOUT the non-PERSISTENT attributes.
	 * <p />
	 * If it's a DELETE event, we just return the event (since it only has the name of the object
	 * being deleted).
	 * <p />
	 * If it's a MODIFIED event, we check the modify attribute. If it refers to any PERSISTENT
	 * attribute, we return true.
	 * @return a clone of the DMPEvent with only the PERSISTENT information and null if there's no
	 * PERSISTENT data.
	 */
	public DMPEvent getPersistentForm(){
		DMPEvent rc = null;
		
		if (getSourceObjectClass() == null)
			throw(new IllegalStateException("Malformed DMPEvent. Missing source object class for a " + getEventTypeDMP() + " event."));
		
		if (getSourceObjectClass().getDataType() != DataTypeEnum.PERSISTENT)
			return(rc);

		try {
			if ( (getEventTypeDMP() == DMPEventTypeEnum.CREATED) || (getEventTypeDMP() == DMPEventTypeEnum.LOADED)){
				if (getSourceObject() == null)
					throw(new IllegalStateException("Malformed DMPEvent. Missing source object for a CREATE event."));
				
				DmcObject clonedSourceObj = getSourceObject().getNew();
					
				int nonPersistentCount = 0;
				for(DmcAttribute<?> attr: getSourceObject().getAttributes().values()){
					if (attr.getID() == DmcObject.__objectClass.id)
						continue;
					if (attr.getAttributeInfo().dataType == DataTypeEnum.PERSISTENT){
						clonedSourceObj.add(attr.getAttributeInfo(), attr.cloneIt());
					}
					else
						nonPersistentCount++;
				}
				
				if (nonPersistentCount > 0){
					// If we stripped any non persistent attributes, replace the source object
					// with the new one.
					rc = clone();
					rc.remSourceObject();
					rc.setSourceObject(clonedSourceObj);
				}
				else{
					// We didn't modify anything, so just return teh event as is
					rc = this;
				}

			}
			else if (getEventTypeDMP() == DMPEventTypeEnum.DELETED){
				rc = this;
			}
			else if (getEventTypeDMP() == DMPEventTypeEnum.MODIFIED){
				if (getModifyAttribute() == null)
					throw(new IllegalStateException("Malformed DMPEvent. Missing modify attribute for a MODIFIED event."));
				
				// Create a new modifier collection to which we'll add the persistent
				// attribute modifications.
				DmcTypeModifierMV newModifier = new DmcTypeModifierMV(MetaDMSAG.__modify);
				
				Iterator<Modifier>	modifiers = getModifyAttribute().getMV();
				if (modifiers != null){
					while(modifiers.hasNext()){
						Modifier mod = modifiers.next();
						DmcAttributeInfo ai = mod.getAttributeInfo();
						if (ai == null)
							throw(new IllegalStateException("Unknown attribute in modify: " + mod.getAttributeName()));
						if (ai.dataType == DataTypeEnum.PERSISTENT)
							newModifier.add(new Modifier(mod));
					}
					
					// If there are any PERSISTENT modifications, we'll returned an alterred clone
					if (newModifier.getMVSize() > 0){
						// There were non-persistent attributes in the modify, clone the event
						// and replace the modify with alterred modify
						rc = clone();
						rc.remModify();
						rc.getDMO().add(MetaDMSAG.__modify, newModifier);
					}
				}
			}
		}
		catch(DmcValueException ex){
			throw(new IllegalStateException("Shouldn't have value exceptions for attribute: " + ex.getAttributeName() + "\n" + ex.toString()));
		}
		
		return(rc);
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
			getDmcObject().add(MetaDMSAG.__modify,mods);
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
		return (DmcTypeModifierMV) (getDmcObject().get(MetaDMSAG.__modify));
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
	 * If this is a CREATED/LOADED event, we slice the object for the required attributes and return
	 * a new DMPEvent with that information. NOTE: we always return a new event, even if all
	 * we have is the name of the object.
	 * @param dsi
	 * @return a sliced event with the appropriate attributes.
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
					rc.getDMO().set(MetaDMSAG.__modify, sliced);
				} catch (DmcValueException e) {
					throw(new IllegalStateException("Dropping the sliced modifier in our shallow copy shouldn't throw an exception!"));
				}
			}
		}
		else if ( (getEventTypeDMP() == DMPEventTypeEnum.CREATED) || (getEventTypeDMP() == DMPEventTypeEnum.LOADED)){
			DmcObject sliced = getSourceObject().getSlice(dsi);
//			if (sliced.numberOfAttributes() > 1){
				// We have more than the objectClass attribute so create the new event
				rc = new DMPEvent((DMPEventDMO) this.getDMO().shallowCopy());
				
				rc.setSlice(dsi.getName());
				
				// Remove the original source object
				rc.remSourceObject();
				
				// Replace it with the sliced object
				rc.setSourceObject(sliced);
//			}
		}
		else if (getEventTypeDMP() == DMPEventTypeEnum.DELETED){
			// We clone the event because we have to tag it with a listenerID
			// when it's sent back
			rc = new DMPEvent((DMPEventDMO) this.getDMO().shallowCopy());
			rc.setSlice(dsi.getName());
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
		
	/**
	 * This convenience method can be used on MODIFIED events to determine whether
	 * or not the specified attribute is alterred by the modifier.
	 * @param ai
	 * @return
	 */
	public boolean thisAttributeModified(DmcAttributeInfo ai){
		if (getEventTypeDMP() == DMPEventTypeEnum.MODIFIED){
			DmcTypeModifierMV mods = getModifyAttribute();
			if (mods != null){
				for(int i=0; i<mods.getMVSize(); i++){
					Modifier mod = mods.getMVnth(i);
					DmcAttributeInfo modai = mod.getAttributeInfo();
					if (modai == null)
						throw(new IllegalStateException("Couldn't get attribute info for: " + mod.getAttributeName()));
					if (modai.id == ai.id)
						return(true);
				}
			}
		}
		return(false);
	}

}
