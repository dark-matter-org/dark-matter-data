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
package org.dmd.dmt.dsd.dsdc.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                                    // Always required - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                                // Named object - (GenUtility.java:373)
import org.dmd.dmc.DmcNamedObjectIF;                                            // Named object - (GenUtility.java:372)
import org.dmd.dmc.DmcObject;                                                   // Structural class - (GenUtility.java:348)
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution - (GenUtility.java:317)
import org.dmd.dmc.DmcSliceInfo;                                                // Required for object slicing - (GenUtility.java:226)
import org.dmd.dmc.DmcValueException;                                           // Any attributes - (GenUtility.java:238)
import org.dmd.dmc.types.DefinitionName;                                        // Naming attribute type - (GenUtility.java:367)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Required for MODREC constructor - (GenUtility.java:225)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                     // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeStringSV;                             // Required type - (GenUtility.java:325)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;                     // Attribute from dsdA schema - (GenUtility.java:135)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ModuleADMO;                    // Type specific set/add - (GenUtility.java:304)
import org.dmd.dmt.dsd.dsda.shared.generated.types.DmcTypeModuleAREFSV;         // Reference type - (GenUtility.java:297)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;                  // Helper class - (GenUtility.java:332)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.ModuleCDMO;                    // Type specific set/add - (GenUtility.java:304)
import org.dmd.dmt.dsd.dsdc.shared.generated.types.DmcTypeModuleCREFSV;         // Reference type - (GenUtility.java:297)
import org.dmd.dmt.dsd.dsdc.shared.generated.types.ModuleCREF;                  // Helper class - (GenUtility.java:332)

/**
 * null
 * <P>
 * Generated from the dsdC schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ModuleCDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "ModuleC";


    static {
    }

    public ModuleCDMO() {
        super("ModuleC");
    }

    protected ModuleCDMO(String oc) {
        super(oc);
    }

    @Override
    public ModuleCDMO getNew(){
        ModuleCDMO rc = new ModuleCDMO();
        return(rc);
    }

    @Override
    public ModuleCDMO getSlice(DmcSliceInfo info){
        ModuleCDMO rc = new ModuleCDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ModuleCDMO(DmcTypeModifierMV mods) {
        super("ModuleC");
        modrec(true);
        setModifier(mods);
    }

    public ModuleCDMO getModificationRecorder(){
        ModuleCDMO rc = new ModuleCDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:750)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:767)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:774)
    public boolean equals(Object obj){
        if (obj instanceof ModuleCDMO){
            return( getObjectName().equals( ((ModuleCDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:782)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setDescription(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:652)
    public ModuleCREF getDependsOnModuleC(){
        DmcTypeModuleCREFSV attr = (DmcTypeModuleCREFSV) get(DsdCDMSAG.__dependsOnModuleC);
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
     * Returns the reference to ModuleC without attempting lazy resolution (if turned on).
     */
    public ModuleCREF getDependsOnModuleCREF(){
        DmcTypeModuleCREFSV attr = (DmcTypeModuleCREFSV) get(DsdCDMSAG.__dependsOnModuleC);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dependsOnModuleC to the specified value.
     * @param value ModuleCDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:706)
    public void setDependsOnModuleC(ModuleCDMO value) {
        DmcAttribute<?> attr = get(DsdCDMSAG.__dependsOnModuleC);
        if (attr == null)
            attr = new DmcTypeModuleCREFSV(DsdCDMSAG.__dependsOnModuleC);
        else
            ((DmcTypeModuleCREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DsdCDMSAG.__dependsOnModuleC,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets dependsOnModuleC to the specified value.
     * @param value A value compatible with DmcTypeModuleCREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setDependsOnModuleC(Object value) throws DmcValueException {
        DmcTypeModuleCREFSV attr  = (DmcTypeModuleCREFSV) get(DsdCDMSAG.__dependsOnModuleC);
        if (attr == null)
            attr = new DmcTypeModuleCREFSV(DsdCDMSAG.__dependsOnModuleC);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DsdCDMSAG.__dependsOnModuleC,attr);
    }

    /**
     * Removes the dependsOnModuleC attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remDependsOnModuleC(){
         rem(DsdCDMSAG.__dependsOnModuleC);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:652)
    public ModuleAREF getDependsOnModuleA(){
        DmcTypeModuleAREFSV attr = (DmcTypeModuleAREFSV) get(DsdADMSAG.__dependsOnModuleA);
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
    public ModuleAREF getDependsOnModuleAREF(){
        DmcTypeModuleAREFSV attr = (DmcTypeModuleAREFSV) get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dependsOnModuleA to the specified value.
     * @param value ModuleADMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:706)
    public void setDependsOnModuleA(ModuleADMO value) {
        DmcAttribute<?> attr = get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null)
            attr = new DmcTypeModuleAREFSV(DsdADMSAG.__dependsOnModuleA);
        else
            ((DmcTypeModuleAREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DsdADMSAG.__dependsOnModuleA,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets dependsOnModuleA to the specified value.
     * @param value A value compatible with DmcTypeModuleAREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setDependsOnModuleA(Object value) throws DmcValueException {
        DmcTypeModuleAREFSV attr  = (DmcTypeModuleAREFSV) get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null)
            attr = new DmcTypeModuleAREFSV(DsdADMSAG.__dependsOnModuleA);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DsdADMSAG.__dependsOnModuleA,attr);
    }

    /**
     * Removes the dependsOnModuleA attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remDependsOnModuleA(){
         rem(DsdADMSAG.__dependsOnModuleA);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}
