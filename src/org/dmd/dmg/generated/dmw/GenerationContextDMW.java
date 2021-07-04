package org.dmd.dmg.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                          // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.CamelCaseName;                        // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dmg.extended.GenerationContext;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmg.generated.dmo.GenerationContextDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dms.ClassDefinition;                            // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                    // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmw.DmwNamedObjectWrapper;                      // Named object wrapper - (BaseDMWGenerator.java:1132)



/**
 * The GenerationContext acts as a gathering point for a set of\n code
 * generation components.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class GenerationContextDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public GenerationContextDMW() {
        super(new GenerationContextDMO(), org.dmd.dmg.generated.DmgSchemaAG._GenerationContext);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public GenerationContextDMW(DmcTypeModifierMV mods) {
        super(new GenerationContextDMO(mods), org.dmd.dmg.generated.DmgSchemaAG._GenerationContext);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public GenerationContext getModificationRecorder(){
        GenerationContext rc = new GenerationContext();
        rc.setGenContextName(getGenContextName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public GenerationContextDMW(GenerationContextDMO obj) {
        super(obj, org.dmd.dmg.generated.DmgSchemaAG._GenerationContext);
    }

    public GenerationContext cloneIt() {
        GenerationContext rc = new GenerationContext();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GenerationContextDMO getDMO() {
        return((GenerationContextDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected GenerationContextDMW(GenerationContextDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public CamelCaseName getObjectName(){
        return(((GenerationContextDMO) core).getGenContextName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GenerationContextDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GenerationContextDMW){
            return( getObjectName().equals( ((GenerationContextDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public CamelCaseName getGenContextName(){
        return(((GenerationContextDMO) core).getGenContextName());
    }

    /**
     * Sets genContextName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setGenContextName(Object value) throws DmcValueException {
        ((GenerationContextDMO) core).setGenContextName(value);
    }

    /**
     * Sets genContextName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setGenContextName(CamelCaseName value){
        ((GenerationContextDMO) core).setGenContextName(value);
    }

    /**
     * Removes the genContextName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remGenContextName(){
        ((GenerationContextDMO) core).remGenContextName();
    }


}
