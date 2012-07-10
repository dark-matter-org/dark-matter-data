package org.dmd.dms.extended.rules;

import java.util.Map;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.InitRuleDataDMO;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.rules.InitRuleBaseImpl;

public class InitRule extends InitRuleBaseImpl {

	public InitRule(InitRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void initialize(DmcObject obj) {
		Map<Integer,DmcAttribute<?>> attributes = ruleDMO.getAdditionalAttributes();
		for(DmcAttribute<?> attribute: attributes.values()){
			if (obj.get(attribute.getAttributeInfo()) == null){
				try {
					// We don't have this attribute
					if (attribute.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
						obj.set(attribute.getAttributeInfo(), attribute.cloneIt());
					}
					else{
						
					}
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
