package org.dmd.dmp.server.extended;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.server.generated.dmw.NotifyRequestDMW;

public class NotifyRequest extends NotifyRequestDMW {

	public NotifyRequest(){
		super();
	}
	
	@Override
	public Response getErrorResponse() throws DmcValueException {
		return null;
	}

}
