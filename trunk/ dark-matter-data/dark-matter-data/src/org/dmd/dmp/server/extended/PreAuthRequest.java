package org.dmd.dmp.server.extended;

import org.dmd.dmp.server.generated.dmw.PreAuthRequestDMW;
import org.dmd.dmp.shared.generated.dmo.PreAuthRequestDMO;
import org.dmd.dms.ClassDefinition;

public class PreAuthRequest extends PreAuthRequestDMW {

	public PreAuthRequest(){
		
	}
	
	public PreAuthRequest(PreAuthRequestDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	@Override
	public Response getErrorResponse() {
		// TODO Auto-generated method stub
		return null;
	}

}
