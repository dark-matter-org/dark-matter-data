package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcAttributeInfoRef;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.types.Modifier;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.AllowedAttributesRuleBaseImpl;

public class AllowedAttributesRule extends AllowedAttributesRuleBaseImpl {

	public AllowedAttributesRule(){
		
	}
	
	public AllowedAttributesRule(AllowedAttributesRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet exceptions = null;
		
		// Cycle through the attribute definitions associated with the object
		// and verify that any that are NOT optional, exist in the object.
		Map<Integer,DmcAttributeInfoRef> mai = obj.getConstructionClassInfo().getIdToAttr();
		if (mai != null){
			Iterator<DmcAttributeInfoRef> it = mai.values().iterator();
			while(it.hasNext()){
				DmcAttributeInfoRef air = it.next();
				if (air.mandatory){
					if (obj.get(air.info.id) == null){
						if (exceptions == null)
							exceptions = new DmcRuleExceptionSet();
						exceptions.add(new DmcRuleException("Mandatory attribute is missing: " + air.info.name, this));
					}
				}
			}
		}
		
		// And now, cycle through the attributes of the object and verify that
		// they are allowed - if the class isn't extensible
		if (obj.getConstructionClassInfo().classType != ClassTypeEnum.EXTENSIBLE){
			Iterator<DmcAttribute<?>> attrs = obj.getAttributes().values().iterator();
			while(attrs.hasNext()){
				DmcAttribute<?> attr = attrs.next();
				if (!obj.allowsAttribute(attr.getAttributeInfo())){
					if (exceptions == null)
						exceptions = new DmcRuleExceptionSet();
					exceptions.add(new DmcRuleException("Attribute: " + attr.getName() + " is not valid for an object of class: " + obj.getConstructionClassName(), this));
				}
			}
		}
		
		if (exceptions != null)
			throw(exceptions);
	}

	/**
	 * This is somewhat tricky. We're attempting to determine whether or not the object will
	 * meet the must/may rules once this sequence of modifications has been applied. In some
	 * cases, the check is easy, but in cases where REM, DEL and NTH operations are performed,
	 * we have to be sure that a mandatory attribute still exists once all is said and done.
	 * <p/>
	 * For single valued attributes, this is fairly straight forward; as long as any REM is
	 * followed by a SET of the same attribute, we're good.
	 * <p/>
	 * But, for multi-valued attributes, this is complex. We have to recognize when a sequence
	 * of DEL operations, for instance, would result in an empty attribute, or when a series
	 * of NTH operations (setting slots to null) would cause the attribute to have no values
	 * (thus causing its removal). This is handled by creating an empty object of the same type
	 * passed in and cloning the mandatory attributes it has. We then apply the modifer
	 * and then check for mandatory attribute compliance.
	 */
	@Override
	public void execute(DmcObject obj, DmcTypeModifierMV mods) throws DmcRuleExceptionSet {
		// If there are no modifications, scram!
		if (mods.getMVSize() == 0)
			return;
		
		DmcRuleExceptionSet 		exceptions 		= null;
		boolean						valueExceptions = false;
		
		// The required attributes
		ArrayList<DmcAttributeInfo>	required = new ArrayList<DmcAttributeInfo>();
		
		// The object that we'll subject to modification and then validate
		DmcObject 					checker = obj.getNew();
		
		// Cycle through the attributes and clone the mandatory ones into the check object
		Iterator<Modifier>	it = mods.getMV();
		while(it.hasNext()){
			Modifier mod = it.next();
			
			// First, perform basic checking to see if the attribute is okay for the object
			DmcClassInfo ci = obj.getConstructionClassInfo();
			DmcAttributeInfo ai = mod.getAttributeInfo();
			
			if (!ci.allowsAttribute(ai)){
				if (exceptions == null)
					exceptions = new DmcRuleExceptionSet();
				exceptions.add(new DmcRuleException("Object of class: " + obj.getFullClassName() + ": does not support attribute: " + mod.getAttributeName(), this));
				continue;
			}
			
			// At this level, we can't bother ourselves with optional attributes. If there's
			// another type of rule that implies that an optional attribute is required in
			// some context, that rule will fail the modifier validation, not us.
			if (ci.isOptional(ai))
				continue;
			
			DmcAttribute<?> current = obj.get(ai);
			
			// This is actually an error already, since all mandatory attributes should be
			// there, but we'll complain about this later.
			if (current == null)
				continue;
			
			// Add a clone of the attribute
			try {
				checker.add(ai, current.cloneIt());
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// At this stage, we have an object with the mandatory attributes - now we'll
		// apply the modifier.
		try {
			checker.applyModifier(mods);
		} catch (DmcValueExceptionSet e) {
			valueExceptions = true;
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DmcValueException e) {
			valueExceptions = true;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// If we don't have any value exceptions, proceed with checking that all mandatory attributes exist
		if (!valueExceptions){
			for(DmcAttributeInfo ai: required){
				
			}
		}
		
		if (exceptions != null)
			throw(exceptions);
	}
	
}
