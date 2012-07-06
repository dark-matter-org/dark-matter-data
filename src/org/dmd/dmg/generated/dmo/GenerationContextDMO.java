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
import java.io.Serializable;                                       // Always required - (GenUtility.java:220)
import org.dmd.dmc.DmcAttribute;                                   // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcNamedObjectIF;                               // Named object - (GenUtility.java:371)
import org.dmd.dmc.DmcObject;                                      // Structural class - (GenUtility.java:347)
import org.dmd.dmc.DmcSliceInfo;                                   // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                              // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.CamelCaseName;                            // Naming attribute type - (GenUtility.java:366)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;         // Required type - (GenUtility.java:324)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (GenUtility.java:223)

/**
 * The GenerationContext acts as a gathering point for a set of code
 * generation components.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GenerationContextDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GenerationContext";


    static {
    }

    public GenerationContextDMO() {
        super("GenerationContext");
    }

    protected GenerationContextDMO(String oc) {
        super(oc);
    }

    @Override
    public GenerationContextDMO getNew(){
        GenerationContextDMO rc = new GenerationContextDMO();
        return(rc);
    }

    @Override
    public GenerationContextDMO getSlice(DmcSliceInfo info){
        GenerationContextDMO rc = new GenerationContextDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GenerationContextDMO(DmcTypeModifierMV mods) {
        super("GenerationContext");
        modrec(true);
        setModifier(mods);
    }

    public GenerationContextDMO getModificationRecorder(){
        GenerationContextDMO rc = new GenerationContextDMO();
        rc.setGenContextName(getGenContextName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(DmgDMSAG.__genContextName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(DmgDMSAG.__genContextName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof GenerationContextDMO){
            return( getObjectName().equals( ((GenerationContextDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:774)
    public CamelCaseName getGenContextName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(DmgDMSAG.__genContextName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genContextName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:814)
    public void setGenContextName(CamelCaseName value) {
        DmcAttribute<?> attr = get(DmgDMSAG.__genContextName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(DmgDMSAG.__genContextName);
        
        try{
            attr.set(value);
            set(DmgDMSAG.__genContextName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets genContextName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:867)
    public void setGenContextName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(DmgDMSAG.__genContextName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(DmgDMSAG.__genContextName);
        
        attr.set(value);
        set(DmgDMSAG.__genContextName,attr);
    }

    /**
     * Removes the genContextName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:887)
    public void remGenContextName(){
         rem(DmgDMSAG.__genContextName);
    }




}
