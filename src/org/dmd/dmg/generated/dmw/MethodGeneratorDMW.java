//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmg.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                            // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.DefinitionName;                         // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dmg.extended.GenerationContext;                   // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.dmg.extended.MethodGenerator;                     // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmg.generated.dmo.MethodGeneratorDMO;             // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dmg.generated.types.GenerationContextREF;         // Is reference type REF - (BaseDMWGenerator.java:1005)
import org.dmd.dms.ClassDefinition;                              // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                      // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.enums.BaseTypeEnum;                 // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmw.DmwNamedObjectWrapper;                        // Named object wrapper - (BaseDMWGenerator.java:1132)



/**
 * The MethodGenerator allows for the definition of a code generation\n
 * component that creates access methods for wrapper classes in different
 * usage\n environments.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class MethodGeneratorDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public MethodGeneratorDMW() {
        super(new MethodGeneratorDMO(), org.dmd.dmg.generated.DmgSchemaAG._MethodGenerator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public MethodGeneratorDMW(DmcTypeModifierMV mods) {
        super(new MethodGeneratorDMO(mods), org.dmd.dmg.generated.DmgSchemaAG._MethodGenerator);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public MethodGenerator getModificationRecorder(){
        MethodGenerator rc = new MethodGenerator();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
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

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected MethodGeneratorDMW(MethodGeneratorDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public DefinitionName getObjectName(){
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

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public BaseTypeEnum getBaseType(){
        return(((MethodGeneratorDMO) core).getBaseType());
    }

    /**
     * Sets baseType to the specified value.
     * @param value A value compatible with DmcTypeBaseTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setBaseType(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setBaseType(value);
    }

    /**
     * Sets baseType to the specified value.
     * @param value BaseTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setBaseType(BaseTypeEnum value){
        ((MethodGeneratorDMO) core).setBaseType(value);
    }

    /**
     * Removes the baseType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remBaseType(){
        ((MethodGeneratorDMO) core).remBaseType();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getGenClass(){
        return(((MethodGeneratorDMO) core).getGenClass());
    }

    /**
     * Sets genClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setGenClass(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setGenClass(value);
    }

    /**
     * Sets genClass to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setGenClass(String value){
        ((MethodGeneratorDMO) core).setGenClass(value);
    }

    /**
     * Removes the genClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remGenClass(){
        ((MethodGeneratorDMO) core).remGenClass();
    }

    /**
     * @return A GenerationContext object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
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
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setGenContext(GenerationContext value) {
        ((MethodGeneratorDMO) core).setGenContext(value.getDMO());
    }

    /**
     * Sets the genContext to the specified value.
     * @param value A value compatible with GenerationContextREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1418)
    public void setGenContext(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setGenContext(value);
    }

    /**
     * Removes the genContext attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remGenContext(){
        ((MethodGeneratorDMO) core).remGenContext();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DefinitionName getName(){
        return(((MethodGeneratorDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setName(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setName(DefinitionName value){
        ((MethodGeneratorDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remName(){
        ((MethodGeneratorDMO) core).remName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public ValueTypeEnum getValueType(){
        return(((MethodGeneratorDMO) core).getValueType());
    }

    /**
     * Sets valueType to the specified value.
     * @param value A value compatible with DmcTypeValueTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setValueType(Object value) throws DmcValueException {
        ((MethodGeneratorDMO) core).setValueType(value);
    }

    /**
     * Sets valueType to the specified value.
     * @param value ValueTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setValueType(ValueTypeEnum value){
        ((MethodGeneratorDMO) core).setValueType(value);
    }

    /**
     * Removes the valueType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remValueType(){
        ((MethodGeneratorDMO) core).remValueType();
    }


}
