package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                                        // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.templates.server.generated.dmw.ContainedElementDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.templates.shared.generated.dmo.ContainedElementDMO;         // The wrapper we're extending - (DMWGenerator.java:269)


abstract public class ContainedElement extends ContainedElementDMW {

    public ContainedElement(){
        super();
    }

    public ContainedElement(ContainedElementDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

}

