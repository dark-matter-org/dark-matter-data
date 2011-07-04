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
package org.dmd.features.extgwt.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:320)
import java.io.Serializable;                                                      // Always required
import java.util.*;                                                               // Always required
import org.dmd.dmc.DmcAttribute;                                                  // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                              // Named object
import org.dmd.dmc.DmcOmni;                                                       // Lazy resolution
import org.dmd.dmc.DmcValueException;                                             // Any attributes
import org.dmd.dmc.types.StringName;                                              // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                                       // Attribute from meta schema
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                              // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                           // Required type
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;                    // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;                    // Base class
import org.dmd.features.extgwt.generated.types.DmcTypeMvcControllerREFSV;         // Reference type
import org.dmd.features.extgwt.generated.types.MvcControllerREF;                  // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The MvcMenu
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class MvcMenuDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcMenu";

    public final static DmcClassInfo classInfo = ExtgwtDMSAG.__MvcMenu;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MvcMenuDMO() {
        super("MvcMenu");
    }

    protected MvcMenuDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:735)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuDMO){
            return( getObjectName().equals( ((MvcMenuDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:641)
    public Boolean isCustomRender(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(ExtgwtDMSAG.__customRender);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets customRender to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void setCustomRender(Boolean value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__customRender);
        if (attr == null)
            attr = new DmcTypeBooleanSV(ExtgwtDMSAG.__customRender);
        
        try{
            attr.set(value);
            set(ExtgwtDMSAG.__customRender,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets customRender to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:731)
    public void setCustomRender(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__customRender);
        if (attr == null)
            attr = new DmcTypeBooleanSV(ExtgwtDMSAG.__customRender);
        
        attr.set(value);
        set(ExtgwtDMSAG.__customRender,attr);
    }

    /**
     * Removes the customRender attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:746)
    public void remCustomRender(){
         rem(ExtgwtDMSAG.__customRender);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:641)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:731)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:746)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:571)
    public MvcControllerREF getAssociatedController(){
        DmcTypeMvcControllerREFSV attr = (DmcTypeMvcControllerREFSV) get(ExtgwtDMSAG.__associatedController);
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
     * Returns the reference to MvcController without attempting lazy resolution (if turned on).
     */
    public MvcControllerREF getAssociatedControllerREF(){
        DmcTypeMvcControllerREFSV attr = (DmcTypeMvcControllerREFSV) get(ExtgwtDMSAG.__associatedController);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets associatedController to the specified value.
     * @param value MvcControllerDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:624)
    public void setAssociatedController(MvcControllerDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__associatedController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREFSV(ExtgwtDMSAG.__associatedController);
        
        try{
            attr.set(value);
            set(ExtgwtDMSAG.__associatedController,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets associatedController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:731)
    public void setAssociatedController(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__associatedController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREFSV(ExtgwtDMSAG.__associatedController);
        
        attr.set(value);
        set(ExtgwtDMSAG.__associatedController,attr);
    }

    /**
     * Removes the associatedController attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:746)
    public void remAssociatedController(){
         rem(ExtgwtDMSAG.__associatedController);
    }




}
