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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:363)
import java.io.Serializable;                                         // Always required - (GenUtility.java:197)
import java.util.*;                                                  // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                     // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcNamedObjectIF;                                 // Named object - (GenUtility.java:343)
import org.dmd.dmc.DmcSliceInfo;                                     // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                // Any attributes - (GenUtility.java:214)
import org.dmd.dmc.types.CamelCaseName;                              // Naming attribute type - (GenUtility.java:338)
import org.dmd.dms.generated.dmo.MetaDMSAG;                          // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;           // Required type - (GenUtility.java:296)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dms.generated.types.DmcTypeStringSV;                  // Required type - (GenUtility.java:296)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuDMO;         // Base class - (GenUtility.java:323)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The MenuImplementationConfig is used to define the various classes that
 * will
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class MenuBarDMO  extends MenuDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MenuBar";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MenuBarDMO() {
        super("MenuBar");
    }

    protected MenuBarDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public MenuBarDMO getNew(){
        MenuBarDMO rc = new MenuBarDMO();
        return(rc);
    }

    @Override
    public MenuBarDMO getSlice(DmcSliceInfo info){
        MenuBarDMO rc = new MenuBarDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MenuBarDMO(DmcTypeModifierMV mods) {
        super("MenuBar");
        modrec(true);
        setModifier(mods);
    }

    public MenuBarDMO getModificationRecorder(){
        MenuBarDMO rc = new MenuBarDMO();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__elementName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__elementName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MenuBarDMO){
            return( getObjectName().equals( ((MenuBarDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:692)
    public String getUseImpl(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__useImpl);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useImpl to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:730)
    public void setUseImpl(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useImpl);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useImpl);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__useImpl,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useImpl to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:783)
    public void setUseImpl(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__useImpl);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useImpl);
        
        attr.set(value);
        set(MvwDMSAG.__useImpl,attr);
    }

    /**
     * Removes the useImpl attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:803)
    public void remUseImpl(){
         rem(MvwDMSAG.__useImpl);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:692)
    public CamelCaseName getElementName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__elementName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:730)
    public void setElementName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__elementName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__elementName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__elementName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:783)
    public void setElementName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__elementName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__elementName);
        
        attr.set(value);
        set(MvwDMSAG.__elementName,attr);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:803)
    public void remElementName(){
         rem(MvwDMSAG.__elementName);
    }




}
