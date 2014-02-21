package org.dmd.dmt.dsd.dsda.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                     // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.definitions.DmcDefinitionIF;                           // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                  // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dmc.types.DotName;                                         // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.dms.ClassDefinition;                                       // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.DSDefinition;                                          // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                      // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptBaseDMO;         // Abstract class - (BaseDMWGenerator.java:1230)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;            // Is reference type REF - (BaseDMWGenerator.java:1115)



/**
 * The base definition for this DSD module.
 * <P>
 * Generated from the dsdA schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class AConceptBaseDMW extends DSDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    protected AConceptBaseDMW() {
        super();
    }

    abstract public AConceptBase getModificationRecorder();

    public AConceptBaseDMO getDMO() {
        return((AConceptBaseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected AConceptBaseDMW(AConceptBaseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((AConceptBaseDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((AConceptBaseDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof AConceptBaseDMW){
            return( getObjectName().equals( ((AConceptBaseDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A ModuleA object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1434)
    public ModuleA getDefinedInModuleA(){
        ModuleAREF ref = ((AConceptBaseDMO) core).getDefinedInModuleA();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ModuleA)ref.getObject().getContainer());
    }

    /**
     * Sets the definedInModuleA to the specified value.
     * @param value A value compatible with ModuleAREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1519)
    public void setDefinedInModuleA(ModuleA value) {
        ((AConceptBaseDMO) core).setDefinedInModuleA(value.getDMO());
    }

    /**
     * Sets the definedInModuleA to the specified value.
     * @param value A value compatible with ModuleAREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1528)
    public void setDefinedInModuleA(Object value) throws DmcValueException {
        ((AConceptBaseDMO) core).setDefinedInModuleA(value);
    }

    /**
     * Removes the definedInModuleA attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remDefinedInModuleA(){
        ((AConceptBaseDMO) core).remDefinedInModuleA();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DotName getDotName(){
        return(((AConceptBaseDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setDotName(Object value) throws DmcValueException {
        ((AConceptBaseDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setDotName(DotName value){
        ((AConceptBaseDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remDotName(){
        ((AConceptBaseDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((AConceptBaseDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((AConceptBaseDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((AConceptBaseDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((AConceptBaseDMO) core).remName();
    }


}