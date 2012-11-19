package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.NumericRangeRuleBaseImpl;

/**
 * The NumericRangeRule validates that a numeric value falls with in a certain range
 * of values. This rule works for both single-valued and multi-valued attributes.
 */
public class NumericRangeRule extends NumericRangeRuleBaseImpl {
	
	public NumericRangeRule(){
		
	}
	
	public NumericRangeRule(NumericRangeRuleDataDMO dmo){
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		if (attribute.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
			Double value = (Double) attribute.getSV();
			if ( (value < ruleDMO.getNrrMinimum()) || (value > ruleDMO.getNrrMaximum())){
				rc = new DmcRuleExceptionSet();
				rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nThis value falls outside the range: " + attribute.getSV(), this));
			}
		}
		else{
			for(int i=0; i<attribute.getMVSize(); i++){
				Double value = (Double) attribute.getMVnth(i);
				
				if ( (value < ruleDMO.getNrrMinimum()) || (value > ruleDMO.getNrrMaximum())){
					if (rc == null)
						rc = new DmcRuleExceptionSet();
					rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nThis value falls outside the range: " + attribute.getMVnth(i), this));
				}
			}
		}
		
		if (rc != null)
			throw(rc);

	}

}
