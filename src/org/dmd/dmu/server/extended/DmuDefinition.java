package org.dmd.dmu.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:290)
import org.dmd.dms.ClassDefinition;                               // Used in derived constructors - (DMWGenerator.java:284)
import org.dmd.dmu.server.generated.dmw.DmuDefinitionDMW;         // The wrapper we're extending - (DMWGenerator.java:282)
import org.dmd.dmu.shared.generated.dmo.DmuDefinitionDMO;         // The wrapper we're extending - (DMWGenerator.java:283)


abstract public class DmuDefinition extends DmuDefinitionDMW {

    public DmuDefinition(){
        super();
    }

    public DmuDefinition(DmuDefinitionDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

}

