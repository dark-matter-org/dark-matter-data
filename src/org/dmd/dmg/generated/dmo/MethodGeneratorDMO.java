//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmg.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                              // Always required - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                          // Named object - (GenUtility.java:373)
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object - (GenUtility.java:372)
import org.dmd.dmc.DmcObject;                                             // Structural class - (GenUtility.java:348)
import org.dmd.dmc.DmcOmni;                                               // Lazy resolution - (GenUtility.java:317)
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing - (GenUtility.java:226)
import org.dmd.dmc.DmcValueException;                                     // Any attributes - (GenUtility.java:238)
import org.dmd.dmc.types.StringName;                                      // Naming attribute type - (GenUtility.java:367)
import org.dmd.dmg.generated.dmo.GenerationContextDMO;                    // Type specific set/add - (GenUtility.java:304)
import org.dmd.dmg.generated.types.DmcTypeGenerationContextREFSV;         // Reference type - (GenUtility.java:297)
import org.dmd.dmg.generated.types.GenerationContextREF;                  // Helper class - (GenUtility.java:332)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (GenUtility.java:225)
import org.dmd.dms.generated.enums.BaseTypeEnum;                          // Primitive type and !auxiliary class - (GenUtility.java:268)
import org.dmd.dms.generated.enums.ValueTypeEnum;                         // Primitive type and !auxiliary class - (GenUtility.java:268)
import org.dmd.dms.generated.types.DmcTypeBaseTypeEnumSV;                 // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                   // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeStringSV;                       // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeValueTypeEnumSV;                // Required type - (GenUtility.java:325)

/**
 * The MethodGenerator allows for the definition of a code generation\n
 * component that creates access methods for wrapper classes in different
 * usage\n environments.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class MethodGeneratorDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MethodGenerator";


    static {
    }

    public MethodGeneratorDMO() {
        super("MethodGenerator");
    }

    protected MethodGeneratorDMO(String oc) {
        super(oc);
    }

    @Override
    public MethodGeneratorDMO getNew(){
        MethodGeneratorDMO rc = new MethodGeneratorDMO();
        return(rc);
    }

    @Override
    public MethodGeneratorDMO getSlice(DmcSliceInfo info){
        MethodGeneratorDMO rc = new MethodGeneratorDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MethodGeneratorDMO(DmcTypeModifierMV mods) {
        super("MethodGenerator");
        modrec(true);
        setModifier(mods);
    }

    public MethodGeneratorDMO getModificationRecorder(){
        MethodGeneratorDMO rc = new MethodGeneratorDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:761)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public boolean equals(Object obj){
        if (obj instanceof MethodGeneratorDMO){
            return( getObjectName().equals( ((MethodGeneratorDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public int hashCode(){
        StringName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setName(Object value) throws DmcValueException {
        DmcTypeStringNameSV attr  = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:652)
    public GenerationContextREF getGenContext(){
        DmcTypeGenerationContextREFSV attr = (DmcTypeGenerationContextREFSV) get(DmgDMSAG.__genContext);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to GenerationContext without attempting lazy resolution (if turned on).
     */
    public GenerationContextREF getGenContextREF(){
        DmcTypeGenerationContextREFSV attr = (DmcTypeGenerationContextREFSV) get(DmgDMSAG.__genContext);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genContext to the specified value.
     * @param value GenerationContextDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:706)
    public void setGenContext(GenerationContextDMO value) {
        DmcAttribute<?> attr = get(DmgDMSAG.__genContext);
        if (attr == null)
            attr = new DmcTypeGenerationContextREFSV(DmgDMSAG.__genContext);
        else
            ((DmcTypeGenerationContextREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmgDMSAG.__genContext,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets genContext to the specified value.
     * @param value A value compatible with DmcTypeGenerationContextREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setGenContext(Object value) throws DmcValueException {
        DmcTypeGenerationContextREFSV attr  = (DmcTypeGenerationContextREFSV) get(DmgDMSAG.__genContext);
        if (attr == null)
            attr = new DmcTypeGenerationContextREFSV(DmgDMSAG.__genContext);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmgDMSAG.__genContext,attr);
    }

    /**
     * Removes the genContext attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remGenContext(){
         rem(DmgDMSAG.__genContext);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public ValueTypeEnum getValueType(){
        DmcTypeValueTypeEnumSV attr = (DmcTypeValueTypeEnumSV) get(MetaDMSAG.__valueType);
        if (attr == null)
            return(ValueTypeEnum.SINGLE);

        return(attr.getSV());
    }

    /**
     * Sets valueType to the specified value.
     * @param value ValueTypeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setValueType(ValueTypeEnum value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__valueType);
        if (attr == null)
            attr = new DmcTypeValueTypeEnumSV(MetaDMSAG.__valueType);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__valueType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets valueType to the specified value.
     * @param value A value compatible with DmcTypeValueTypeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setValueType(Object value) throws DmcValueException {
        DmcTypeValueTypeEnumSV attr  = (DmcTypeValueTypeEnumSV) get(MetaDMSAG.__valueType);
        if (attr == null)
            attr = new DmcTypeValueTypeEnumSV(MetaDMSAG.__valueType);
        
        attr.set(value);
        set(MetaDMSAG.__valueType,attr);
    }

    /**
     * Removes the valueType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remValueType(){
         rem(MetaDMSAG.__valueType);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public BaseTypeEnum getBaseType(){
        DmcTypeBaseTypeEnumSV attr = (DmcTypeBaseTypeEnumSV) get(MetaDMSAG.__baseType);
        if (attr == null)
            return(BaseTypeEnum.PRIMITIVE);

        return(attr.getSV());
    }

    /**
     * Sets baseType to the specified value.
     * @param value BaseTypeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setBaseType(BaseTypeEnum value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__baseType);
        if (attr == null)
            attr = new DmcTypeBaseTypeEnumSV(MetaDMSAG.__baseType);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__baseType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets baseType to the specified value.
     * @param value A value compatible with DmcTypeBaseTypeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setBaseType(Object value) throws DmcValueException {
        DmcTypeBaseTypeEnumSV attr  = (DmcTypeBaseTypeEnumSV) get(MetaDMSAG.__baseType);
        if (attr == null)
            attr = new DmcTypeBaseTypeEnumSV(MetaDMSAG.__baseType);
        
        attr.set(value);
        set(MetaDMSAG.__baseType,attr);
    }

    /**
     * Removes the baseType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remBaseType(){
         rem(MetaDMSAG.__baseType);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public String getGenClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmgDMSAG.__genClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setGenClass(String value) {
        DmcAttribute<?> attr = get(DmgDMSAG.__genClass);
        if (attr == null)
            attr = new DmcTypeStringSV(DmgDMSAG.__genClass);
        
        try{
            attr.set(value);
            set(DmgDMSAG.__genClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets genClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setGenClass(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmgDMSAG.__genClass);
        if (attr == null)
            attr = new DmcTypeStringSV(DmgDMSAG.__genClass);
        
        attr.set(value);
        set(DmgDMSAG.__genClass,attr);
    }

    /**
     * Removes the genClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remGenClass(){
         rem(DmgDMSAG.__genClass);
    }




}
