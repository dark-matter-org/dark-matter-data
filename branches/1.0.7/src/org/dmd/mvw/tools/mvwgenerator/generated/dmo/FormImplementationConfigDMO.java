//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:372)
import java.io.Serializable;                                                  // Always required - (GenUtility.java:201)
import java.util.*;                                                           // Always required if we have any MV attributes - (GenUtility.java:197)
import org.dmd.dmc.DmcAttribute;                                              // Any attributes - (GenUtility.java:217)
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object - (GenUtility.java:352)
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing - (GenUtility.java:206)
import org.dmd.dmc.DmcValueException;                                         // Any attributes - (GenUtility.java:218)
import org.dmd.dmc.types.CamelCaseName;                                       // Naming attribute type - (GenUtility.java:347)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (GenUtility.java:205)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                    // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (GenUtility.java:204)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class - (GenUtility.java:332)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class FormImplementationConfigDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "FormImplementationConfig";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public FormImplementationConfigDMO() {
        super("FormImplementationConfig");
    }

    protected FormImplementationConfigDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public FormImplementationConfigDMO getNew(){
        FormImplementationConfigDMO rc = new FormImplementationConfigDMO();
        return(rc);
    }

    @Override
    public FormImplementationConfigDMO getSlice(DmcSliceInfo info){
        FormImplementationConfigDMO rc = new FormImplementationConfigDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public FormImplementationConfigDMO(DmcTypeModifierMV mods) {
        super("FormImplementationConfig");
        modrec(true);
        setModifier(mods);
    }

    public FormImplementationConfigDMO getModificationRecorder(){
        FormImplementationConfigDMO rc = new FormImplementationConfigDMO();
        rc.setConfigName(getConfigName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__configName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__configName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof FormImplementationConfigDMO){
            return( getObjectName().equals( ((FormImplementationConfigDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
    public CamelCaseName getConfigName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__configName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets configName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void setConfigName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__configName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__configName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__configName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets configName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setConfigName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__configName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__configName);
        
        attr.set(value);
        set(MvwDMSAG.__configName,attr);
    }

    /**
     * Removes the configName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remConfigName(){
         rem(MvwDMSAG.__configName);
    }




}