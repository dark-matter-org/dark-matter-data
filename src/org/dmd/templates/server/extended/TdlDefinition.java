package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import org.dmd.dms.ClassDefinition;                                     // Used in derived constructors - (DMWGenerator.java:270)
import org.dmd.templates.server.generated.dmw.TdlDefinitionDMW;         // The wrapper we're extending - (DMWGenerator.java:268)
import org.dmd.templates.server.generated.dsd.TdlModuleDefinitionsIF;
import org.dmd.templates.shared.generated.dmo.TdlDefinitionDMO;         // The wrapper we're extending - (DMWGenerator.java:269)
import org.dmd.util.exceptions.ResultException;


abstract public class TdlDefinition extends TdlDefinitionDMW {
	
	private boolean initialized;

    public TdlDefinition(){
        super();
    }

    public TdlDefinition(TdlDefinitionDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public void initialize(TdlModuleDefinitionsIF definitions) throws ResultException {
    	if (!initialized) {
    		initialized = true;
    	}
    }
    
}

