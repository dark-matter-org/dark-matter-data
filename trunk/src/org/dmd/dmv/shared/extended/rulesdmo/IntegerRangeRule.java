package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.types.Modifier;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dmv.shared.generated.dmo.IntegerRangeRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.IntegerRangeRuleBaseImpl;

public class IntegerRangeRule extends IntegerRangeRuleBaseImpl {

	public IntegerRangeRule(IntegerRangeRuleDataDMO dmo) {
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute(DmcObject obj, DmcTypeModifierMV mods, Modifier mod) throws DmcRuleExceptionSet {
		// TODO Auto-generated method stub
		
	}


}
