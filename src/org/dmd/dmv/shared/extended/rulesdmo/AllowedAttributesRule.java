package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;
import java.util.Map;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfoRef;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dmv.shared.generated.dmo.AllowedAttributesRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.AllowedAttributesRuleBaseImpl;

/**
 * The AllowedAttributesRule class determines whether or not an object conforms
 * to the must have/may have attribute definitions. For EXTENSIBLE classes, it
 * only checks the must have attributes.
 */
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
	
}
