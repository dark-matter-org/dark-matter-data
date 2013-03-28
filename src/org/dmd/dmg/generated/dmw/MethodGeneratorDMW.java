package org.dmd.dmg.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import org.dmd.dmc.*;                                            // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dmc.types.StringName;                             // Is named by - (BaseDMWGeneratorNewest.java:935)
import org.dmd.dmg.extended.GenerationContext;                   // Is reference type - (BaseDMWGeneratorNewest.java:976)
import org.dmd.dmg.extended.MethodGenerator;                     // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:949)
import org.dmd.dmg.generated.dmo.MethodGeneratorDMO;             // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)
import org.dmd.dmg.generated.types.GenerationContextREF;         // Is reference type REF - (BaseDMWGeneratorNewest.java:984)
import org.dmd.dms.ClassDefinition;                              // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                      // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.enums.BaseTypeEnum;                 // Primitive type - (BaseDMWGeneratorNewest.java:1019)
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Primitive type - (BaseDMWGeneratorNewest.java:1019)
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)
import org.dmd.dmw.DmwNamedObjectWrapper;                        // Named object wrapper - (BaseDMWGeneratorNewest.java:1111)


/**
 * The MethodGenerator allows for the definition of a code generation\n
 * component that creates access methods for wrapper classes in different
 * usage\n environments.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
public class MethodGeneratorDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public MethodGeneratorDMW() {
        super(new MethodGeneratorDMO(), org.dmd.dmg.generated.DmgSchemaAG._MethodGenerator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public MethodGeneratorDMW(DmcTypeModifierMV mods) {
        super(new MethodGeneratorDMO(mods), org.dmd.dmg.generated.DmgSchemaAG._MethodGenerator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:495)
    public MethodGenerator getModificationRecorder(){
        MethodGenerator rc = new MethodGenerator();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected MethodGeneratorDMW(MethodGeneratorDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1166)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public BaseTypeEnum getBaseType(){
        return(((MethodGeneratorDMO) core).getBaseType());
    }

    /**
     * Sets baseType to the specified value.
     * @param value A value compatible with DmcTypeBaseTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setBaseType(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setBaseType(value);
    }

    /**
     * Sets baseType to the specified value.
     * @param value BaseTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setBaseType(BaseTypeEnum value){
        ((MethodGeneratorDMO) core).setBaseType(value);
    }

    /**
     * Removes the baseType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remBaseType(){
        ((MethodGeneratorDMO) core).remBaseType();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public String getGenClass(){
        return(((MethodGeneratorDMO) core).getGenClass());
    }

    /**
     * Sets genClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setGenClass(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setGenClass(value);
    }

    /**
     * Sets genClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setGenClass(String value){
        ((MethodGeneratorDMO) core).setGenClass(value);
    }

    /**
     * Removes the genClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remGenClass(){
        ((MethodGeneratorDMO) core).remGenClass();
    }

    /**
     * @return A GenerationContext object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1303)
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
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1388)
    public void setGenContext(GenerationContext value) {
        ((MethodGeneratorDMO) core).setGenContext(value.getDMO());
    }

    /**
     * Sets the genContext to the specified value.
     * @param value A value compatible with GenerationContextREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1397)
    public void setGenContext(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setGenContext(value);
    }

    /**
     * Removes the genContext attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remGenContext(){
        ((MethodGeneratorDMO) core).remGenContext();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public StringName getName(){
        return(((MethodGeneratorDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setName(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setName(StringName value){
        ((MethodGeneratorDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remName(){
        ((MethodGeneratorDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public ValueTypeEnum getValueType(){
        return(((MethodGeneratorDMO) core).getValueType());
    }

    /**
     * Sets valueType to the specified value.
     * @param value A value compatible with DmcTypeValueTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setValueType(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setValueType(value);
    }

    /**
     * Sets valueType to the specified value.
     * @param value ValueTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setValueType(ValueTypeEnum value){
        ((MethodGeneratorDMO) core).setValueType(value);
    }

    /**
     * Removes the valueType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remValueType(){
        ((MethodGeneratorDMO) core).remValueType();
    }


}
