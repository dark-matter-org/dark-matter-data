package org.dmd.dmt.dsd.dsdc.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:302)
import java.util.Iterator;                                                     // To iterate definitions - (DMWGenerator.java:295)
import org.dmd.dms.ClassDefinition;                                            // Used in derived constructors - (DMWGenerator.java:287)
import org.dmd.dmt.dsd.dsdc.server.generated.dmw.ModuleCDMW;                   // The wrapper we're extending - (DMWGenerator.java:285)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCDefinitionsIF;         // Definitions access - (DMWGenerator.java:292)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.ModuleCDMO;                   // The wrapper we're extending - (DMWGenerator.java:286)
import org.dmd.util.exceptions.ResultException;                                // To report errors from validation - (DMWGenerator.java:288)


// Generated from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:304)
public class ModuleC extends ModuleCDMW {

    private boolean initialized;

    public ModuleC(){
        super();
    }

    public ModuleC(ModuleCDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public void initialize(ModuleCDefinitionsIF definitions) throws ResultException {
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

    /**
     * @return the module in JSON format.
     */
    @Override
    public String toJSON() {
        StringBuffer sb = new StringBuffer();
        
        core.toJSON(sb, 0, "");
        
        if (getCConceptBaseCount() > 0) {
            // Remove the final }\n
            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            
            sb.append(",\n");
            sb.append("    \"definitions\": [\n");
            
            Iterator<CConceptBase> it = getAllCConceptBase();
            while(it.hasNext()) {
                CConceptBase def = it.next();                
                def.getDMO().toJSON(sb, 0, "      ");
                
                if (it.hasNext())
                    sb.append(",\n");
            }
            sb.append("\n    ]\n");
            
            sb.append("}");
        }
        
        return(sb.toString());
    }
}

