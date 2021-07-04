package org.dmd.dmt.dsd.dsdb.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:302)
import org.dmd.dms.ClassDefinition;                                            // Used in derived constructors - (DMWGenerator.java:287)
import org.dmd.dmt.dsd.dsdb.server.generated.dmw.BConceptBaseDMW;              // The wrapper we're extending - (DMWGenerator.java:285)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBDefinitionsIF;         // Definitions access - (DMWGenerator.java:292)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptBaseDMO;              // The wrapper we're extending - (DMWGenerator.java:286)
import org.dmd.util.exceptions.ResultException;                                // To report errors from validation - (DMWGenerator.java:288)


// Generated from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:304)
abstract public class BConceptBase extends BConceptBaseDMW {

    private boolean initialized;

    public BConceptBase(){
        super();
    }

    public BConceptBase(BConceptBaseDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public void initialize(ModuleBDefinitionsIF definitions) throws ResultException {
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

