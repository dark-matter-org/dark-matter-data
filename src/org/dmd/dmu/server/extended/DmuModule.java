package org.dmd.dmu.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:298)
import org.dmd.dms.ClassDefinition;                                     // Used in derived constructors - (DMWGenerator.java:287)
import org.dmd.dmu.server.generated.dmw.DmuModuleDMW;                   // The wrapper we're extending - (DMWGenerator.java:285)
import org.dmd.dmu.server.generated.dsd.DmuModuleDefinitionsIF;         // Definitions access - (DMWGenerator.java:292)
import org.dmd.dmu.shared.generated.dmo.DmuModuleDMO;                   // The wrapper we're extending - (DMWGenerator.java:286)
import org.dmd.util.exceptions.ResultException;                         // To report errors from validation - (DMWGenerator.java:288)


// Generated from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:300)
public class DmuModule extends DmuModuleDMW {

    private boolean initialized;

    public DmuModule(){
        super();
    }

    public DmuModule(DmuModuleDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public void initialize(DmuModuleDefinitionsIF definitions) throws ResultException {
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

