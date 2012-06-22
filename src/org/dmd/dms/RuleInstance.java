package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmo.RuleInstanceDMO;
import org.dmd.dms.generated.dmw.RuleInstanceDMW;

public class RuleInstance extends RuleInstanceDMW {

	protected RuleInstance(RuleInstanceDMO obj){
		super(obj);
	}

	protected RuleInstance(DmcObject obj) {
		super(obj);
	}

	protected RuleInstance(DmcObject obj, ClassDefinition cd) {
		super(obj,cd);
	}
}
