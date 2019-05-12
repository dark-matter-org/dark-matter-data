package org.dmd.concinnity.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.concinnity.server.generated.dmw.ConceptDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.concinnity.shared.generated.dmo.ConceptDMO;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.dms.ClassDefinition;                                // Used in derived constructors - (DMWGenerator.java:270)


public class Concept extends ConceptDMW {

    public Concept(){
        super();
    }

    public Concept(ConceptDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

}

