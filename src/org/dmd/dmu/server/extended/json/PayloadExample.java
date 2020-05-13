package org.dmd.dmu.server.extended.json;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:290)
import org.dmd.dms.ClassDefinition;                                // Used in derived constructors - (DMWGenerator.java:284)
import org.dmd.dmu.server.generated.dmw.PayloadExampleDMW;         // The wrapper we're extending - (DMWGenerator.java:282)
import org.dmd.dmu.shared.generated.dmo.PayloadExampleDMO;         // The wrapper we're extending - (DMWGenerator.java:283)
import org.json.JSONObject;


public class PayloadExample extends PayloadExampleDMW {

    public PayloadExample(){
        super();
    }

    public PayloadExample(PayloadExampleDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public JSONObject json() {
    	JSONObject rc = new JSONObject(getJsonPayload().replaceAll("\\\\n","\\\n"));
    	return(rc);
    }

}

