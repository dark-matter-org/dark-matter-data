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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                              // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                                          // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcObject;                                             // Structural class - (GenUtility.java:347)
import org.dmd.dmc.DmcOmni;                                               // Lazy resolution - (GenUtility.java:316)
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                     // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.StringName;                                      // Naming attribute type - (GenUtility.java:366)
import org.dmd.dmg.generated.dmo.GenerationContextDMO;                    // Type specific set/add - (GenUtility.java:303)
import org.dmd.dmg.generated.types.DmcTypeGenerationContextREFSV;         // Reference type - (GenUtility.java:296)
import org.dmd.dmg.generated.types.GenerationContextREF;                  // Helper class - (GenUtility.java:331)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.enums.ClassTypeEnum;                         // Primitive type and !auxiliary class - (GenUtility.java:267)
import org.dmd.dms.generated.types.DmcTypeClassTypeEnumSV;                // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                   // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeStringSV;                       // Required type - (GenUtility.java:324)

/**
 * The WrapperGenerator allows for the definition of a code generation
 * component that creates DMO wrappers for use in particular usage
 * environments.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class WrapperGeneratorDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "WrapperGenerator";


    static {
    }

    public WrapperGeneratorDMO() {
        super("WrapperGenerator");
    }

    protected WrapperGeneratorDMO(String oc) {
        super(oc);
    }

    @Override
    public WrapperGeneratorDMO getNew(){
        WrapperGeneratorDMO rc = new WrapperGeneratorDMO();
        return(rc);
    }

    @Override
    public WrapperGeneratorDMO getSlice(DmcSliceInfo info){
        WrapperGeneratorDMO rc = new WrapperGeneratorDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public WrapperGeneratorDMO(DmcTypeModifierMV mods) {
        super("WrapperGenerator");
        modrec(true);
        setModifier(mods);
    }

    public WrapperGeneratorDMO getModificationRecorder(){
        WrapperGeneratorDMO rc = new WrapperGeneratorDMO();
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
        if (obj instanceof WrapperGeneratorDMO){
            return( getObjectName().equals( ((WrapperGeneratorDMO) obj).getObjectName()) );
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:782)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:822)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:875)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:895)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:653)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:707)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:875)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:895)
    public void remGenContext(){
         rem(DmgDMSAG.__genContext);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:782)
    public ClassTypeEnum getClassType(){
        DmcTypeClassTypeEnumSV attr = (DmcTypeClassTypeEnumSV) get(MetaDMSAG.__classType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets classType to the specified value.
     * @param value ClassTypeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:822)
    public void setClassType(ClassTypeEnum value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__classType);
        if (attr == null)
            attr = new DmcTypeClassTypeEnumSV(MetaDMSAG.__classType);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__classType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets classType to the specified value.
     * @param value A value compatible with DmcTypeClassTypeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:875)
    public void setClassType(Object value) throws DmcValueException {
        DmcTypeClassTypeEnumSV attr  = (DmcTypeClassTypeEnumSV) get(MetaDMSAG.__classType);
        if (attr == null)
            attr = new DmcTypeClassTypeEnumSV(MetaDMSAG.__classType);
        
        attr.set(value);
        set(MetaDMSAG.__classType,attr);
    }

    /**
     * Removes the classType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:895)
    public void remClassType(){
         rem(MetaDMSAG.__classType);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:782)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:822)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:875)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:895)
    public void remGenClass(){
         rem(DmgDMSAG.__genClass);
    }




}
