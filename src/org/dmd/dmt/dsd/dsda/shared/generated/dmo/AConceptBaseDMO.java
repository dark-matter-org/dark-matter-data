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
package org.dmd.dmt.dsd.dsda.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                    // Always required - (GenUtility.java:227)
import org.dmd.dmc.DmcAttribute;                                                // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                            // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcValueException;                                           // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.DefinitionName;                                        // Naming attribute type - (GenUtility.java:382)
import org.dmd.dmc.types.DotName;                                               // Primitive type - (GenUtility.java:282)
import org.dmd.dms.generated.dmo.DSDefinitionDMO;                               // Base class - (GenUtility.java:367)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Attribute from meta schema - (GenUtility.java:197)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                     // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeDotNameSV;                            // Required type - (GenUtility.java:339)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ModuleADMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.dmt.dsd.dsda.shared.generated.types.DmcTypeModuleAREFSV;         // Reference type - (GenUtility.java:311)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;                  // Helper class - (GenUtility.java:346)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The base definition for this DSD module.
 * <P>
 * Generated from the dsdA schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
abstract public class AConceptBaseDMO  extends DSDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "AConceptBase";


    static {
    }

    public AConceptBaseDMO() {
        super("AConceptBase");
    }

    protected AConceptBaseDMO(String oc) {
        super(oc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof AConceptBaseDMO){
            return( getObjectName().equals( ((AConceptBaseDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:784)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remDotName(){
         rem(MetaDMSAG.__dotName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:660)
    public ModuleAREF getDefinedInModuleA(){
        DmcTypeModuleAREFSV attr = (DmcTypeModuleAREFSV) get(DsdADMSAG.__definedInModuleA);
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
     * Returns the reference to ModuleA without attempting lazy resolution (if turned on).
     */
    public ModuleAREF getDefinedInModuleAREF(){
        DmcTypeModuleAREFSV attr = (DmcTypeModuleAREFSV) get(DsdADMSAG.__definedInModuleA);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedInModuleA to the specified value.
     * @param value ModuleADMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:714)
    public void setDefinedInModuleA(ModuleADMO value) {
        DmcAttribute<?> attr = get(DsdADMSAG.__definedInModuleA);
        if (attr == null)
            attr = new DmcTypeModuleAREFSV(DsdADMSAG.__definedInModuleA);
        else
            ((DmcTypeModuleAREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DsdADMSAG.__definedInModuleA,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets definedInModuleA to the specified value.
     * @param value A value compatible with DmcTypeModuleAREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setDefinedInModuleA(Object value) throws DmcValueException {
        DmcTypeModuleAREFSV attr  = (DmcTypeModuleAREFSV) get(DsdADMSAG.__definedInModuleA);
        if (attr == null)
            attr = new DmcTypeModuleAREFSV(DsdADMSAG.__definedInModuleA);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DsdADMSAG.__definedInModuleA,attr);
    }

    /**
     * Removes the definedInModuleA attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remDefinedInModuleA(){
         rem(DsdADMSAG.__definedInModuleA);
    }




}
