package org.dmd.dmu.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:290)
import org.dmd.dms.ClassDefinition;                           // Used in derived constructors - (DMWGenerator.java:284)
import org.dmd.dmu.server.generated.dmw.DmuModuleDMW;         // The wrapper we're extending - (DMWGenerator.java:282)
import org.dmd.dmu.shared.generated.dmo.DmuModuleDMO;         // The wrapper we're extending - (DMWGenerator.java:283)


public class DmuModule extends DmuModuleDMW {

    public DmuModule(){
        super();
    }

    public DmuModule(DmuModuleDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

}

