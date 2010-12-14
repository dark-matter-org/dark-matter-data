package org.dmd.dmv.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dmv.server.generated.dmw.ClassRuleDMW;
import org.dmd.dmv.shared.generated.dmo.ClassRuleDMO;

public class ClassRule extends ClassRuleDMW {

	protected ClassRule(ClassRuleDMO obj, ClassDefinition cd) {
		super(obj, cd);
	}

}
