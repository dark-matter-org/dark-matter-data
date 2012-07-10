package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmv.shared.generated.dmo.InitRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.InitRuleBaseImpl;

public class InitRule extends InitRuleBaseImpl {

	public InitRule(InitRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void initialize(DmcObject obj){
		for(DmcAttribute<?> attr : ruleDMO.getAdditionalAttributes().values()){
			// If the object doesn't already have the attribute, add it to the object
			if (obj.get(attr.getAttributeInfo()) == null){
				try {
					DmcAttribute<?> clone = attr.cloneIt();
					if (attr.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
						obj.set(attr.getAttributeInfo(), clone);
					}
					else{
						obj.add(attr.getAttributeInfo(), clone);
					}
				} catch (DmcValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
