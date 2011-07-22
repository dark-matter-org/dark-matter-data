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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                                      // Always required
import java.util.*;                                                               // Always required
import org.dmd.dmc.DmcAttribute;                                                  // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                              // Named object
import org.dmd.dmc.DmcOmni;                                                       // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                  // Required for object slicing
import org.dmd.dmc.DmcValueException;                                             // Any attributes
import org.dmd.dmc.types.StringName;                                              // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                                       // Attribute from meta schema
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                              // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                              // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                             // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                           // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                               // Required type
import org.dmd.features.extgwt.generated.dmo.MvcActionDMO;                        // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;                    // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;                    // Base class
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;                          // Type specific set/add
import org.dmd.features.extgwt.generated.types.DmcTypeMvcActionREFSV;             // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcControllerREFSV;         // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMenuREFSV;               // Reference type
import org.dmd.features.extgwt.generated.types.MvcActionREF;                      // Helper class
import org.dmd.features.extgwt.generated.types.MvcControllerREF;                  // Helper class
import org.dmd.features.extgwt.generated.types.MvcMenuREF;                        // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class MvcMenuItemDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcMenuItem";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MvcMenuItemDMO() {
        super("MvcMenuItem");
    }

    protected MvcMenuItemDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public MvcMenuItemDMO getNew(){
        MvcMenuItemDMO rc = new MvcMenuItemDMO();
        return(rc);
    }

    @Override
    public MvcMenuItemDMO getSlice(DmcSliceInfo info){
        MvcMenuItemDMO rc = new MvcMenuItemDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MvcMenuItemDMO(DmcTypeModifierMV mods) {
        super("MvcMenuItem");
        modrec(true);
        setModifier(mods);
    }

    public MvcMenuItemDMO getModificationRecorder(){
        MvcMenuItemDMO rc = new MvcMenuItemDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
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
        if (obj instanceof MvcMenuItemDMO){
            return( getObjectName().equals( ((MvcMenuItemDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public String getDisplayLabel(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(ExtgwtDMSAG.__displayLabel);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setDisplayLabel(String value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__displayLabel);
        if (attr == null)
            attr = new DmcTypeStringSV(ExtgwtDMSAG.__displayLabel);
        
        try{
            attr.set(value);
            set(ExtgwtDMSAG.__displayLabel,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setDisplayLabel(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__displayLabel);
        if (attr == null)
            attr = new DmcTypeStringSV(ExtgwtDMSAG.__displayLabel);
        
        attr.set(value);
        set(ExtgwtDMSAG.__displayLabel,attr);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remDisplayLabel(){
         rem(ExtgwtDMSAG.__displayLabel);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remCustomRender(){
         rem(ExtgwtDMSAG.__customRender);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:572)
    public MvcActionREF getTriggersAction(){
        DmcTypeMvcActionREFSV attr = (DmcTypeMvcActionREFSV) get(ExtgwtDMSAG.__triggersAction);
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
     * Returns the reference to MvcAction without attempting lazy resolution (if turned on).
     */
    public MvcActionREF getTriggersActionREF(){
        DmcTypeMvcActionREFSV attr = (DmcTypeMvcActionREFSV) get(ExtgwtDMSAG.__triggersAction);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets triggersAction to the specified value.
     * @param value MvcActionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public void setTriggersAction(MvcActionDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__triggersAction);
        if (attr == null)
            attr = new DmcTypeMvcActionREFSV(ExtgwtDMSAG.__triggersAction);
        
        try{
            attr.set(value);
            set(ExtgwtDMSAG.__triggersAction,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets triggersAction to the specified value.
     * @param value A value compatible with DmcTypeMvcActionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setTriggersAction(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__triggersAction);
        if (attr == null)
            attr = new DmcTypeMvcActionREFSV(ExtgwtDMSAG.__triggersAction);
        
        attr.set(value);
        set(ExtgwtDMSAG.__triggersAction,attr);
    }

    /**
     * Removes the triggersAction attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remTriggersAction(){
         rem(ExtgwtDMSAG.__triggersAction);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:572)
    public MvcMenuREF getAddToMenu(){
        DmcTypeMvcMenuREFSV attr = (DmcTypeMvcMenuREFSV) get(ExtgwtDMSAG.__addToMenu);
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
     * Returns the reference to MvcMenu without attempting lazy resolution (if turned on).
     */
    public MvcMenuREF getAddToMenuREF(){
        DmcTypeMvcMenuREFSV attr = (DmcTypeMvcMenuREFSV) get(ExtgwtDMSAG.__addToMenu);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value MvcMenuDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public void setAddToMenu(MvcMenuDMO value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__addToMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREFSV(ExtgwtDMSAG.__addToMenu);
        
        try{
            attr.set(value);
            set(ExtgwtDMSAG.__addToMenu,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value A value compatible with DmcTypeMvcMenuREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setAddToMenu(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__addToMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREFSV(ExtgwtDMSAG.__addToMenu);
        
        attr.set(value);
        set(ExtgwtDMSAG.__addToMenu,attr);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remAddToMenu(){
         rem(ExtgwtDMSAG.__addToMenu);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:572)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remAssociatedController(){
         rem(ExtgwtDMSAG.__associatedController);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public Integer getMenuOrder(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(ExtgwtDMSAG.__menuOrder);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setMenuOrder(Integer value) {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__menuOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(ExtgwtDMSAG.__menuOrder);
        
        try{
            attr.set(value);
            set(ExtgwtDMSAG.__menuOrder,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setMenuOrder(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(ExtgwtDMSAG.__menuOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(ExtgwtDMSAG.__menuOrder);
        
        attr.set(value);
        set(ExtgwtDMSAG.__menuOrder,attr);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remMenuOrder(){
         rem(ExtgwtDMSAG.__menuOrder);
    }




}
