package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.SetRequestDMW;
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;
import org.dmd.dms.ClassDefinition;

public class SetRequest extends SetRequestDMW {

	public SetRequest(SetRequestDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	public SetResponse getResponse() throws DmcValueException {
		SetResponse response = new SetResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
