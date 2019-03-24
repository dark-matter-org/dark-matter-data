package org.dmd.dmt.dsd.dsda.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                  // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                        // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                               // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dms.ClassDefinition;                                    // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;              // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptXDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;         // Required to access defined in module name - (DMWGenerator.java:181)



/**
 * <P>
 * Generated from the dsdA schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class AConceptXDMW extends AConceptBase implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public AConceptXDMW() {
        super(new AConceptXDMO(), org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG._AConceptX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public AConceptXDMW(DmcTypeModifierMV mods) {
        super(new AConceptXDMO(mods), org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG._AConceptX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public AConceptX getModificationRecorder(){
        AConceptX rc = new AConceptX();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public AConceptXDMW(AConceptXDMO obj) {
        super(obj, org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG._AConceptX);
    }

    public AConceptX cloneIt() {
        AConceptX rc = new AConceptX();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public AConceptXDMO getDMO() {
        return((AConceptXDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected AConceptXDMW(AConceptXDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((AConceptXDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((AConceptXDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof AConceptXDMW){
            return( getObjectName().equals( ((AConceptXDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((AConceptXDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((AConceptXDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((AConceptXDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((AConceptXDMO) core).remName();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:234)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        ModuleAREF ref = ((AConceptXDMO) core).getDefinedInModuleA();
        return(ref.getName().getNameString());
    }


}
