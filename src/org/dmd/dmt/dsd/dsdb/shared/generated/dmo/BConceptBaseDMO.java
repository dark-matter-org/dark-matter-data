//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmt.dsd.dsdb.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                                    // Always required - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                                // Named object - (GenUtility.java:376)
import org.dmd.dmc.DmcNamedObjectIF;                                            // Named object - (GenUtility.java:375)
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution - (GenUtility.java:320)
import org.dmd.dmc.DmcValueException;                                           // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.DefinitionName;                                        // Naming attribute type - (GenUtility.java:370)
import org.dmd.dmc.types.DotName;                                               // Primitive type and !auxiliary class - (GenUtility.java:271)
import org.dmd.dms.generated.dmo.DSDefinitionDMO;                               // Base class - (GenUtility.java:355)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Attribute from meta schema - (GenUtility.java:194)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                     // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeDotNameSV;                            // Required type - (GenUtility.java:328)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.ModuleBDMO;                    // Type specific set/add - (GenUtility.java:307)
import org.dmd.dmt.dsd.dsdb.shared.generated.types.DmcTypeModuleBREFSV;         // Reference type - (GenUtility.java:300)
import org.dmd.dmt.dsd.dsdb.shared.generated.types.ModuleBREF;                  // Helper class - (GenUtility.java:335)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
 * The base definition for this DSD module.
 * <P>
 * Generated from the dsdB schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class BConceptBaseDMO  extends DSDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "BConceptBase";


    static {
    }

    public BConceptBaseDMO() {
        super("BConceptBase");
    }

    protected BConceptBaseDMO(String oc) {
        super(oc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:751)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:768)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:775)
    public boolean equals(Object obj){
        if (obj instanceof BConceptBaseDMO){
            return( getObjectName().equals( ((BConceptBaseDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:783)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setName(DefinitionName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
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
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setName(Object value) throws DmcValueException {
        DmcTypeDefinitionNameSV attr  = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setDotName(DotName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__dotName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setDotName(Object value) throws DmcValueException {
        DmcTypeDotNameSV attr  = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remDotName(){
         rem(MetaDMSAG.__dotName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:655)
    public ModuleBREF getDefinedInModuleB(){
        DmcTypeModuleBREFSV attr = (DmcTypeModuleBREFSV) get(DsdBDMSAG.__definedInModuleB);
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
     * Returns the reference to ModuleB without attempting lazy resolution (if turned on).
     */
    public ModuleBREF getDefinedInModuleBREF(){
        DmcTypeModuleBREFSV attr = (DmcTypeModuleBREFSV) get(DsdBDMSAG.__definedInModuleB);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedInModuleB to the specified value.
     * @param value ModuleBDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:709)
    public void setDefinedInModuleB(ModuleBDMO value) {
        DmcAttribute<?> attr = get(DsdBDMSAG.__definedInModuleB);
        if (attr == null)
            attr = new DmcTypeModuleBREFSV(DsdBDMSAG.__definedInModuleB);
        else
            ((DmcTypeModuleBREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DsdBDMSAG.__definedInModuleB,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets definedInModuleB to the specified value.
     * @param value A value compatible with DmcTypeModuleBREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setDefinedInModuleB(Object value) throws DmcValueException {
        DmcTypeModuleBREFSV attr  = (DmcTypeModuleBREFSV) get(DsdBDMSAG.__definedInModuleB);
        if (attr == null)
            attr = new DmcTypeModuleBREFSV(DsdBDMSAG.__definedInModuleB);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DsdBDMSAG.__definedInModuleB,attr);
    }

    /**
     * Removes the definedInModuleB attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remDefinedInModuleB(){
         rem(DsdBDMSAG.__definedInModuleB);
    }




}
