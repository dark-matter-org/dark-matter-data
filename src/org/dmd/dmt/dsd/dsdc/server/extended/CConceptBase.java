package org.dmd.dmt.dsd.dsdc.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dmt.dsd.dsdc.server.generated.dmw.CConceptBaseDMW;
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.CConceptXDMO;

abstract public class CConceptBase extends CConceptBaseDMW {

	public CConceptBase(CConceptXDMO dmo, ClassDefinition cd) {
		super(dmo,cd);
	}


}
