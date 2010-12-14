package org.dmd.dmv.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dmv.server.generated.dmw.RuleDMW;
import org.dmd.dmv.shared.generated.dmo.RuleDMO;

public class Rule extends RuleDMW {

	protected Rule(RuleDMO obj, ClassDefinition cd) {
		super(obj, cd);
	}

}
