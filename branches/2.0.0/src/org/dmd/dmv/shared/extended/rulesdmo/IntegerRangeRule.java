package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmv.shared.generated.dmo.IntegerRangeRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.IntegerRangeRuleBaseImpl;

public class IntegerRangeRule extends IntegerRangeRuleBaseImpl {

	public IntegerRangeRule(){
		
	}
	
	public IntegerRangeRule(IntegerRangeRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		
		
	}


}