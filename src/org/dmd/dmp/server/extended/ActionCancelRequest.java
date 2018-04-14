package org.dmd.dmp.server.extended;

import javax.servlet.http.HttpServletRequest;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:277)
import org.dmd.dmp.server.generated.dmw.ActionCancelRequestDMW;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.dmp.shared.generated.dmo.ActionCancelRequestDMO;


public class ActionCancelRequest extends ActionCancelRequestDMW {

    public ActionCancelRequest(){
        super();
    }

    public ActionCancelRequest(ActionCancelRequestDMO obj, HttpServletRequest req) {
    		super(obj);
    		request = req;
    }

	public ActionCancelResponse getResponse(){
		ActionCancelResponse response = new ActionCancelResponse();
		
		fillStandard(response);
		
		return(response);
	}

	@Override
	public Response getErrorResponse() {
		ActionCancelResponse response = new ActionCancelResponse();
		fillError(response);
		return(response);
	}

}

