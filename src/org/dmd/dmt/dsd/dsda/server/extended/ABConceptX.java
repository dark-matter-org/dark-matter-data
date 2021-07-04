package org.dmd.dmt.dsd.dsda.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:302)
import org.dmd.dms.ClassDefinition;                                            // Used in derived constructors - (DMWGenerator.java:287)
import org.dmd.dmt.dsd.dsda.server.generated.dmw.ABConceptXDMW;                // The wrapper we're extending - (DMWGenerator.java:285)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleADefinitionsIF;         // Definitions access - (DMWGenerator.java:292)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ABConceptXDMO;                // The wrapper we're extending - (DMWGenerator.java:286)
import org.dmd.util.exceptions.ResultException;                                // To report errors from validation - (DMWGenerator.java:288)


// Generated from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:304)
public class ABConceptX extends ABConceptXDMW {

    private boolean initialized;

    public ABConceptX(){
        super();
    }

    public ABConceptX(ABConceptXDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public void initialize(ModuleADefinitionsIF definitions) throws ResultException {
        if (!initialized){
            // Add any required initialization or validation checks
            // If you fail validation, throw a ResultException that includes a clear
            // error description and location - uncomment the following example:
//            ResultException ex = new ResultException("Error description");
//            ex.moreMessages("Additional error information");
//            ex.setLocationInfo(getFile(), getLineNumber());
//            throw(ex);
            initialized = true;
        }
    }

}

