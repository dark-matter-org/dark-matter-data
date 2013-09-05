package org.dmd.dms;

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmo.RuleDataDMO;
import org.dmd.dms.generated.dmw.RuleDataDMW;

public class RuleData extends RuleDataDMW {

	protected RuleData(RuleDataDMO obj){
		super(obj);
	}

	protected RuleData(DmcObject obj) {
		super(obj);
	}

	protected RuleData(DmcObject obj, ClassDefinition cd) {
		super(obj,cd);
	}
}
