package org.dmd.dmv.shared.extended.rulesdmo;

import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.types.TypeDefinitionREF;
import org.dmd.dmv.shared.generated.dmo.AttributeTypeRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.AttributeTypeRuleBaseImpl;
import org.dmd.util.exceptions.DebugInfo;

public class AttributeTypeRule extends AttributeTypeRuleBaseImpl {

	public AttributeTypeRule(){
		super();
	}
	
	public AttributeTypeRule(AttributeTypeRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		DebugInfo.debug("HERE");
		if (ruleDMO.getAllowedValueType() != null){
			// Check the value type if it was specified
			if (ruleDMO.getAllowedValueType() != attribute.getAttributeInfo().valueType){
				DmcRuleExceptionSet ex = new DmcRuleExceptionSet();
				ex.add(new DmcRuleException(this.getRuleTitle() + "\n" + "Expected valueType: " + ruleDMO.getAllowedValueType() + " but " + attribute.getName() + " has valueType: " + ruleDMO.getAllowedValueType(), this));
				throw(ex);
			}
		}
		
		boolean typeOkay = false;
		Iterator<TypeDefinitionREF> types = ruleDMO.getAllowedType();
		while(types.hasNext()){
			TypeDefinitionREF type = types.next();
			if (type.getObjectName().getNameString().equals(attribute.getAttributeInfo().type)){
				typeOkay = true;
				break;
			}
		}
		
		if (!typeOkay){
			DmcRuleExceptionSet ex = new DmcRuleExceptionSet();
			ex.add(new DmcRuleException(this.getRuleTitle() + "\n" + attribute.getName() + " isn't one of the expected types, it's of type: " + attribute.getAttributeInfo().type, this));
			throw(ex);			
		}
	}

}
