package org.dmd.dmt.dsd.dsda.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dmt.dsd.dsda.server.generated.dmw.AConceptBaseDMW;
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptBaseDMO;

public abstract class AConceptBase extends AConceptBaseDMW {

	public AConceptBase(AConceptBaseDMO dmo, ClassDefinition cd) {
		super(dmo,cd);
	}

}
