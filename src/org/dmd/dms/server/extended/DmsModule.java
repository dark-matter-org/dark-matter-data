package org.dmd.dms.server.extended;

import org.dmd.dms.server.generated.dmw.DmsModuleDMW;
import org.dmd.dms.shared.generated.dmo.DmsModuleDMO;

public class DmsModule extends DmsModuleDMW {

	public DmsModule(){
		super();
	}
	
	public DmsModule(DmsModuleDMO dmo, ClassDefinition cd){
		super(dmo,cd);
	}
	
}
