package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.SetRequestDMW;

public class SetRequest extends SetRequestDMW {

	public SetRequest(){
		super();
	}
	
	public SetResponse getResponse() throws DmcValueException {
		SetResponse response = new SetResponse();
		
		fillStandard(response);
		
		return(response);
	}
}
