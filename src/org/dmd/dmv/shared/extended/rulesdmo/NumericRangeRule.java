package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.NumericRangeRuleBaseImpl;
import org.dmd.util.exceptions.DebugInfo;

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
		DebugInfo.debug("Entering >>>");
		
		DmcRuleExceptionSet rc = null;
		Double minimum = ruleDMO.getNrrMinimum();
		Double maximum = ruleDMO.getNrrMaximum();
		
		if (attribute.getAttributeInfo().valueType == ValueTypeEnum.SINGLE){
			Double value = ((Number) attribute.getSV()).doubleValue();
			if (minimum != null){
				if (value < minimum){
					rc = new DmcRuleExceptionSet();
					rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nThis value is less than the minimum: " + attribute.getSV(), this));
				}
			}
			if (maximum != null){
				if (value > maximum){
					rc = new DmcRuleExceptionSet();
					rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nThis value is more than the maximum: " + attribute.getSV(), this));
				}
			}
		}
		else{
			for(int i=0; i<attribute.getMVSize(); i++){
				Double value = ((Number) attribute.getMVnth(i)).doubleValue();
				
				if (minimum != null){
					if (value < minimum){
						if (rc == null)
							rc = new DmcRuleExceptionSet();
						rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nThis value is less than the minimum: " + attribute.getSV(), this));
					}
				}
				if (maximum != null){
					if (value > maximum){
						if (rc == null)
							rc = new DmcRuleExceptionSet();
						rc.add(new DmcRuleException(ruleDMO.getRuleTitle() + "\nThis value is more than the maximum: " + attribute.getSV(), this));
					}
				}
			}
		}
		
		if (rc != null)
			throw(rc);

		DebugInfo.debug("Leaving <<<");

	}

}
