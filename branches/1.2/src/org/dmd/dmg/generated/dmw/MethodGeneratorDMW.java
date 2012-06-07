package org.dmd.dmg.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                            // If any attributes - (BaseDMWGeneratorNewest.java:903)
import org.dmd.dmc.types.StringName;                             // Is named by - (BaseDMWGeneratorNewest.java:884)
import org.dmd.dmg.extended.GenerationContext;                   // Is reference type - (BaseDMWGeneratorNewest.java:923)
import org.dmd.dmg.extended.MethodGenerator;                     // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:896)
import org.dmd.dmg.generated.dmo.MethodGeneratorDMO;             // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1068)
import org.dmd.dmg.generated.types.GenerationContextREF;         // Is reference type REF - (BaseDMWGeneratorNewest.java:931)
import org.dmd.dms.*;                                            // Always 2 - (BaseDMWGeneratorNewest.java:888)
import org.dmd.dms.generated.dmo.MetaDMSAG;                      // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:892)
import org.dmd.dms.generated.enums.BaseTypeEnum;                 // Primitive type - (BaseDMWGeneratorNewest.java:966)
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Primitive type - (BaseDMWGeneratorNewest.java:966)
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:891)
import org.dmd.dmw.DmwNamedObjectWrapper;                        // Named object wrapper - (BaseDMWGeneratorNewest.java:1058)


/**
 * The MethodGenerator allows for the definition of a code generation
 * component that creates access methods for wrapper classes in different
 * usage environments.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
public class MethodGeneratorDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public MethodGeneratorDMW() {
        super(new MethodGeneratorDMO(), org.dmd.dmg.generated.DmgSchemaAG._MethodGenerator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public MethodGeneratorDMW(DmcTypeModifierMV mods) {
        super(new MethodGeneratorDMO(mods), org.dmd.dmg.generated.DmgSchemaAG._MethodGenerator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:491)
    public MethodGenerator getModificationRecorder(){
        MethodGenerator rc = new MethodGenerator();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public MethodGeneratorDMW(MethodGeneratorDMO obj) {
        super(obj, org.dmd.dmg.generated.DmgSchemaAG._MethodGenerator);
    }

    public MethodGenerator cloneIt() {
        MethodGenerator rc = new MethodGenerator();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public MethodGeneratorDMO getDMO() {
        return((MethodGeneratorDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected MethodGeneratorDMW(MethodGeneratorDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1113)
    public StringName getObjectName(){
        return(((MethodGeneratorDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((MethodGeneratorDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MethodGeneratorDMW){
            return( getObjectName().equals( ((MethodGeneratorDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public BaseTypeEnum getBaseType(){
        return(((MethodGeneratorDMO) core).getBaseType());
    }

    /**
     * Sets baseType to the specified value.
     * @param value A value compatible with DmcTypeBaseTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setBaseType(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setBaseType(value);
    }

    /**
     * Sets baseType to the specified value.
     * @param value BaseTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setBaseType(BaseTypeEnum value){
        ((MethodGeneratorDMO) core).setBaseType(value);
    }

    /**
     * Removes the baseType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remBaseType(){
        ((MethodGeneratorDMO) core).remBaseType();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public String getGenClass(){
        return(((MethodGeneratorDMO) core).getGenClass());
    }

    /**
     * Sets genClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setGenClass(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setGenClass(value);
    }

    /**
     * Sets genClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setGenClass(String value){
        ((MethodGeneratorDMO) core).setGenClass(value);
    }

    /**
     * Removes the genClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remGenClass(){
        ((MethodGeneratorDMO) core).remGenClass();
    }

    /**
     * @return A GenerationContext object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1246)
    public GenerationContext getGenContext(){
        GenerationContextREF ref = ((MethodGeneratorDMO) core).getGenContext();
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1331)
    public void setGenContext(GenerationContext value) {
        ((MethodGeneratorDMO) core).setGenContext(value.getDMO());
    }

    /**
     * Sets the genContext to the specified value.
     * @param value A value compatible with GenerationContextREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1340)
    public void setGenContext(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setGenContext(value);
    }

    /**
     * Removes the genContext attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remGenContext(){
        ((MethodGeneratorDMO) core).remGenContext();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public StringName getName(){
        return(((MethodGeneratorDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setName(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setName(StringName value){
        ((MethodGeneratorDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remName(){
        ((MethodGeneratorDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1286)
    public ValueTypeEnum getValueType(){
        return(((MethodGeneratorDMO) core).getValueType());
    }

    /**
     * Sets valueType to the specified value.
     * @param value A value compatible with DmcTypeValueTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1396)
    public void setValueType(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setValueType(value);
    }

    /**
     * Sets valueType to the specified value.
     * @param value ValueTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1405)
    public void setValueType(ValueTypeEnum value){
        ((MethodGeneratorDMO) core).setValueType(value);
    }

    /**
     * Removes the valueType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1431)
    public void remValueType(){
        ((MethodGeneratorDMO) core).remValueType();
    }


}
