package org.dmd.dmv.shared.extended.rulesdmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmv.shared.generated.dmo.ValueLengthRuleDataDMO;
import org.dmd.dmv.shared.generated.rulesdmo.ValueLengthRuleBaseImpl;

public class ValueLengthRule extends ValueLengthRuleBaseImpl {
	
	public ValueLengthRule(){
		super();
	}
	
	public ValueLengthRule(ValueLengthRuleDataDMO dmo){
		super(dmo);
	}

	@Override
	public void execute(DmcObject obj, DmcAttribute<?> attribute) throws DmcRuleExceptionSet {

	}

}
