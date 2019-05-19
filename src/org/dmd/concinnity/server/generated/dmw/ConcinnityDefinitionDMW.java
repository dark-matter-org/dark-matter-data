package org.dmd.concinnity.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.concinnity.server.extended.ConcinnityDefinition;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.concinnity.server.extended.ConcinnityModule;                     // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.concinnity.shared.generated.dmo.ConcinnityDefinitionDMO;         // Abstract class - (BaseDMWGenerator.java:1120)
import org.dmd.concinnity.shared.generated.types.ConcinnityModuleREF;           // Is reference type REF - (BaseDMWGenerator.java:1005)
import org.dmd.dmc.*;                                                           // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.definitions.DmcDefinitionIF;                                 // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                        // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dmc.types.DotName;                                               // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dms.ClassDefinition;                                             // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.Concinnity;                                                  // Derived class - (BaseDMWGenerator.java:1138)



/**
 * The ConcinnityDefinition provides a common base for all Concinnity related
 * definitions.
 * <P>
 * Generated from the dmconcinnity schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class ConcinnityDefinitionDMW extends Concinnity implements DmcDefinitionIF, DmcNamedObjectIF {

    protected ConcinnityDefinitionDMW() {
        super();
    }

    abstract public ConcinnityDefinition getModificationRecorder();

    public ConcinnityDefinitionDMO getDMO() {
        return((ConcinnityDefinitionDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected ConcinnityDefinitionDMW(ConcinnityDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public DefinitionName getObjectName(){
        return(((ConcinnityDefinitionDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ConcinnityDefinitionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ConcinnityDefinitionDMW){
            return( getObjectName().equals( ((ConcinnityDefinitionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A ConcinnityModule object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public ConcinnityModule getDefinedInConcinnityModule(){
        ConcinnityModuleREF ref = ((ConcinnityDefinitionDMO) core).getDefinedInConcinnityModule();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ConcinnityModule)ref.getObject().getContainer());
    }

    /**
     * Sets the definedInConcinnityModule to the specified value.
     * @param value A value compatible with ConcinnityModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setDefinedInConcinnityModule(ConcinnityModule value) {
        ((ConcinnityDefinitionDMO) core).setDefinedInConcinnityModule(value.getDMO());
    }

    /**
     * Sets the definedInConcinnityModule to the specified value.
     * @param value A value compatible with ConcinnityModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1418)
    public void setDefinedInConcinnityModule(Object value) throws DmcValueException {
        ((ConcinnityDefinitionDMO) core).setDefinedInConcinnityModule(value);
    }

    /**
     * Removes the definedInConcinnityModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remDefinedInConcinnityModule(){
        ((ConcinnityDefinitionDMO) core).remDefinedInConcinnityModule();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DotName getDotName(){
        return(((ConcinnityDefinitionDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setDotName(Object value) throws DmcValueException {
        ((ConcinnityDefinitionDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setDotName(DotName value){
        ((ConcinnityDefinitionDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remDotName(){
        ((ConcinnityDefinitionDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DefinitionName getName(){
        return(((ConcinnityDefinitionDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setName(Object value) throws DmcValueException {
        ((ConcinnityDefinitionDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setName(DefinitionName value){
        ((ConcinnityDefinitionDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remName(){
        ((ConcinnityDefinitionDMO) core).remName();
    }


}
