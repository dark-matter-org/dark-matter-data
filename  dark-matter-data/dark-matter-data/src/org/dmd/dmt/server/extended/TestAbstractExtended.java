package org.dmd.dmt.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dmt.server.generated.dmw.TestAbstractExtendedDMW;
import org.dmd.dmt.shared.generated.dmo.TestAbstractExtendedDMO;

public class TestAbstractExtended extends TestAbstractExtendedDMW {

	protected TestAbstractExtended(TestAbstractExtendedDMO obj, ClassDefinition cd) {
		super(obj, cd);
	}

}
