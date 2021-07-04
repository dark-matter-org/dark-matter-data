//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010-2021 dark-matter-data committers
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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                        // Always required - (GenUtility.java:227)
import org.dmd.dmc.DmcAttribute;                                    // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcObject;                                       // Structural class - (GenUtility.java:362)
import org.dmd.dmc.DmcSliceInfo;                                    // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                               // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.DefinitionName;                            // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringSV;                 // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ActifactGeneratorDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "ActifactGenerator";


    static {
    }

    public ActifactGeneratorDMO() {
        super("ActifactGenerator");
    }

    protected ActifactGeneratorDMO(String oc) {
        super(oc);
    }

    @Override
    public ActifactGeneratorDMO getNew(){
        ActifactGeneratorDMO rc = new ActifactGeneratorDMO();
        return(rc);
    }

    @Override
    public ActifactGeneratorDMO getSlice(DmcSliceInfo info){
        ActifactGeneratorDMO rc = new ActifactGeneratorDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ActifactGeneratorDMO(DmcTypeModifierMV mods) {
        super("ActifactGenerator");
        modrec(true);
        setModifier(mods);
    }

    public ActifactGeneratorDMO getModificationRecorder(){
        ActifactGeneratorDMO rc = new ActifactGeneratorDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
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
        if (obj instanceof ActifactGeneratorDMO){
            return( getObjectName().equals( ((ActifactGeneratorDMO) obj).getObjectName()) );
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
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
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
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
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remGenClass(){
         rem(DmgDMSAG.__genClass);
    }




}
