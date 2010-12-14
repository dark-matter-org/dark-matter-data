package org.dmd.dmv.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dmv.server.generated.dmw.AttributeRuleDMW;
import org.dmd.dmv.shared.generated.dmo.AttributeRuleDMO;

public class AttributeRule extends AttributeRuleDMW {

	protected AttributeRule(AttributeRuleDMO obj, ClassDefinition cd) {
		super(obj, cd);
	}

}
