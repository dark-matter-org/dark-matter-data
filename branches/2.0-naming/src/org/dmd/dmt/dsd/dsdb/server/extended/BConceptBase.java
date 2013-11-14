package org.dmd.dmt.dsd.dsdb.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dmt.dsd.dsdb.server.generated.dmw.BConceptBaseDMW;
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptXDMO;

public abstract class BConceptBase extends BConceptBaseDMW {

	public BConceptBase(BConceptXDMO dmo, ClassDefinition cd) {
		super(dmo,cd);
	}

}
