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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:355)
import java.io.Serializable;                                                  // Always required
import java.util.*;                                                           // Always required
import org.dmd.dmc.DmcAttribute;                                              // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                                         // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                       // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The MenuElementDefinition is common base for all definitions associated
 * with the definition of menu elements.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class MenuElementDefinitionDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MenuElementDefinition";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MenuElementDefinitionDMO() {
        super("MenuElementDefinition");
    }

    protected MenuElementDefinitionDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public MenuElementDefinitionDMO getNew(){
        MenuElementDefinitionDMO rc = new MenuElementDefinitionDMO();
        return(rc);
    }

    @Override
    public MenuElementDefinitionDMO getSlice(DmcSliceInfo info){
        MenuElementDefinitionDMO rc = new MenuElementDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MenuElementDefinitionDMO(DmcTypeModifierMV mods) {
        super("MenuElementDefinition");
        modrec(true);
        setModifier(mods);
    }

    public MenuElementDefinitionDMO getModificationRecorder(){
        MenuElementDefinitionDMO rc = new MenuElementDefinitionDMO();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:742)
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
        if (obj instanceof MenuElementDefinitionDMO){
            return( getObjectName().equals( ((MenuElementDefinitionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        if (getObjectName() == null)
            return(0);
        
        return(getObjectName().hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remUseImpl(){
         rem(MvwDMSAG.__useImpl);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remElementName(){
         rem(MvwDMSAG.__elementName);
    }




}
