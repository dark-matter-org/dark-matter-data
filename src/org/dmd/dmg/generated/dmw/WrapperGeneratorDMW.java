package org.dmd.dmg.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                            // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.types.DefinitionName;                         // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dmg.extended.GenerationContext;                   // Is reference type - (BaseDMWGenerator.java:1107)
import org.dmd.dmg.extended.WrapperGenerator;                    // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.dmg.generated.dmo.WrapperGeneratorDMO;            // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dmg.generated.types.GenerationContextREF;         // Is reference type REF - (BaseDMWGenerator.java:1115)
import org.dmd.dms.ClassDefinition;                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                      // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.enums.ClassTypeEnum;                // Primitive type - (BaseDMWGenerator.java:1150)
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmw.DmwNamedObjectWrapper;                        // Named object wrapper - (BaseDMWGenerator.java:1242)



/**
 * The WrapperGenerator allows for the definition of a code generation\n
 * component that creates DMO wrappers for use in particular usage
 * environments.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class WrapperGeneratorDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public WrapperGeneratorDMW() {
        super(new WrapperGeneratorDMO(), org.dmd.dmg.generated.DmgSchemaAG._WrapperGenerator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public WrapperGeneratorDMW(DmcTypeModifierMV mods) {
        super(new WrapperGeneratorDMO(mods), org.dmd.dmg.generated.DmgSchemaAG._WrapperGenerator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public WrapperGenerator getModificationRecorder(){
        WrapperGenerator rc = new WrapperGenerator();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public WrapperGeneratorDMW(WrapperGeneratorDMO obj) {
        super(obj, org.dmd.dmg.generated.DmgSchemaAG._WrapperGenerator);
    }

    public WrapperGenerator cloneIt() {
        WrapperGenerator rc = new WrapperGenerator();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public WrapperGeneratorDMO getDMO() {
        return((WrapperGeneratorDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected WrapperGeneratorDMW(WrapperGeneratorDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public DefinitionName getObjectName(){
        return(((WrapperGeneratorDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((WrapperGeneratorDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof WrapperGeneratorDMW){
            return( getObjectName().equals( ((WrapperGeneratorDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public ClassTypeEnum getClassType(){
        return(((WrapperGeneratorDMO) core).getClassType());
    }

    /**
     * Sets classType to the specified value.
     * @param value A value compatible with DmcTypeClassTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setClassType(Object value) throws DmcValueException {
        ((WrapperGeneratorDMO) core).setClassType(value);
    }

    /**
     * Sets classType to the specified value.
     * @param value ClassTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setClassType(ClassTypeEnum value){
        ((WrapperGeneratorDMO) core).setClassType(value);
    }

    /**
     * Removes the classType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remClassType(){
        ((WrapperGeneratorDMO) core).remClassType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public String getGenClass(){
        return(((WrapperGeneratorDMO) core).getGenClass());
    }

    /**
     * Sets genClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setGenClass(Object value) throws DmcValueException {
        ((WrapperGeneratorDMO) core).setGenClass(value);
    }

    /**
     * Sets genClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setGenClass(String value){
        ((WrapperGeneratorDMO) core).setGenClass(value);
    }

    /**
     * Removes the genClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remGenClass(){
        ((WrapperGeneratorDMO) core).remGenClass();
    }

    /**
     * @return A GenerationContext object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1434)
    public GenerationContext getGenContext(){
        GenerationContextREF ref = ((WrapperGeneratorDMO) core).getGenContext();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((GenerationContext)ref.getObject().getContainer());
    }

    /**
     * Sets the genContext to the specified value.
     * @param value A value compatible with GenerationContextREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1519)
    public void setGenContext(GenerationContext value) {
        ((WrapperGeneratorDMO) core).setGenContext(value.getDMO());
    }

    /**
     * Sets the genContext to the specified value.
     * @param value A value compatible with GenerationContextREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1528)
    public void setGenContext(Object value) throws DmcValueException {
        ((WrapperGeneratorDMO) core).setGenContext(value);
    }

    /**
     * Removes the genContext attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remGenContext(){
        ((WrapperGeneratorDMO) core).remGenContext();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public DefinitionName getName(){
        return(((WrapperGeneratorDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setName(Object value) throws DmcValueException {
        ((WrapperGeneratorDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setName(DefinitionName value){
        ((WrapperGeneratorDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remName(){
        ((WrapperGeneratorDMO) core).remName();
    }


}
