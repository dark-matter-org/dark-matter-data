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
import java.io.Serializable;                                                          // Always required
import java.util.*;                                                                   // Always required
import org.dmd.dmc.DmcAttribute;                                                      // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                                  // Named object
import org.dmd.dmc.DmcOmni;                                                           // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                      // Required for object slicing
import org.dmd.dmc.DmcValueException;                                                 // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                               // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                            // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;                                   // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuDMO;                          // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuElementDefinitionDMO;         // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMenuREFSV;               // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuREF;                        // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Separator is used to define menu separators.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class SeparatorDMO  extends MenuElementDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Separator";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public SeparatorDMO() {
        super("Separator");
    }

    protected SeparatorDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public SeparatorDMO getNew(){
        SeparatorDMO rc = new SeparatorDMO();
        return(rc);
    }

    @Override
    public SeparatorDMO getSlice(DmcSliceInfo info){
        SeparatorDMO rc = new SeparatorDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public SeparatorDMO(DmcTypeModifierMV mods) {
        super("Separator");
        modrec(true);
        setModifier(mods);
    }

    public SeparatorDMO getModificationRecorder(){
        SeparatorDMO rc = new SeparatorDMO();
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
        if (obj instanceof SeparatorDMO){
            return( getObjectName().equals( ((SeparatorDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:606)
    public MenuREF getAddToMenu(){
        DmcTypeMenuREFSV attr = (DmcTypeMenuREFSV) get(MvwDMSAG.__addToMenu);
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
     * Returns the reference to Menu without attempting lazy resolution (if turned on).
     */
    public MenuREF getAddToMenuREF(){
        DmcTypeMenuREFSV attr = (DmcTypeMenuREFSV) get(MvwDMSAG.__addToMenu);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value MenuDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:659)
    public void setAddToMenu(MenuDMO value) {
        DmcTypeMenuREFSV attr  = (DmcTypeMenuREFSV) get(MvwDMSAG.__addToMenu);
        if (attr == null)
            attr = new DmcTypeMenuREFSV(MvwDMSAG.__addToMenu);
        else
            attr.removeBackReferences();
        
        try{
            attr.set(value);
            set(MvwDMSAG.__addToMenu,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value A value compatible with DmcTypeMenuREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
    public void setAddToMenu(Object value) throws DmcValueException {
        DmcTypeMenuREFSV attr  = (DmcTypeMenuREFSV) get(MvwDMSAG.__addToMenu);
        if (attr == null)
            attr = new DmcTypeMenuREFSV(MvwDMSAG.__addToMenu);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MvwDMSAG.__addToMenu,attr);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remAddToMenu(){
         rem(MvwDMSAG.__addToMenu);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public String getMenuOrder(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__menuOrder);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
    public void setMenuOrder(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__menuOrder);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__menuOrder);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__menuOrder,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
    public void setMenuOrder(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__menuOrder);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__menuOrder);
        
        attr.set(value);
        set(MvwDMSAG.__menuOrder,attr);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remMenuOrder(){
         rem(MvwDMSAG.__menuOrder);
    }




}
