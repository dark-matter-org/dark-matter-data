package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmv.shared.generated.dmo.NumericRangeRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.NumericRangeRuleBaseImpl;

public class NumericRangeRule extends NumericRangeRuleBaseImpl {
	
	public NumericRangeRule(){
		
	}
	
	public NumericRangeRule(NumericRangeRuleDataDMO dmo){
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		

	}

}
