package org.dmd.dmp.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:277)
import org.dmd.dmp.server.generated.dmw.ActionCancelRequestDMW;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.dmp.shared.generated.dmo.ActionCancelRequestDMO;         // The wrapper we're extending - (DMWGenerator.java:270)
import org.dmd.dms.ClassDefinition;                                     // Used in derived constructors - (DMWGenerator.java:271)


public class ActionCancelRequest extends ActionCancelRequestDMW {

    public ActionCancelRequest(){
        super();
    }

    public ActionCancelRequest(ActionCancelRequestDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

	public ActionCancelResponse getResponse(){
		ActionCancelResponse response = new ActionCancelResponse();
		
		fillStandard(response);
		
		return(response);
	}

	@Override
	public Response getErrorResponse() {
		ActionResponse response = new ActionResponse();
		fillError(response);
		return(response);
	}

}

