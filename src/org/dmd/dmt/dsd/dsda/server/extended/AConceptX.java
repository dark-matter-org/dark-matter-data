package org.dmd.dmt.dsd.dsda.server.extended;

import org.dmd.dms.ClassDefinition;
import org.dmd.dmt.dsd.dsda.server.generated.dmw.AConceptXDMW;
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptXDMO;

public class AConceptX extends AConceptXDMW {

	public AConceptX(){
		super();
	}
	
	public AConceptX(AConceptXDMO dmo, ClassDefinition cd){
		super(dmo, cd);
	}
}
