package org.dmd.dmp.server.extended;

import org.dmd.dmp.server.generated.dmw.PreAuthResponseDMW;
import org.dmd.dmp.shared.generated.dmo.PreAuthResponseDMO;
import org.dmd.dms.ClassDefinition;

public class PreAuthResponse extends PreAuthResponseDMW {

	public PreAuthResponse(){
		
	}
	
	public PreAuthResponse(PreAuthResponseDMO obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	
}
