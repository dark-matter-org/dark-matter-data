package org.dmd.dms.server.extended;

import org.dmd.core.DmcObject;
import org.dmd.dms.shared.generated.dmo.RuleDataDMO;
import org.dmd.dms.server.generated.dmw.RuleDataDMW;

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
