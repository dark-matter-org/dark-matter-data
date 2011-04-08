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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:267)
import java.io.Serializable;                                                      // Always required
import java.util.*;                                                               // Always required
import org.dmd.dmc.DmcAttribute;                                                  // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                              // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                              // Named object
import org.dmd.dmc.DmcOmni;                                                       // Lazy resolution
import org.dmd.dmc.DmcValueException;                                             // Any attributes
import org.dmd.dmc.types.StringName;                                              // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                                 // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                              // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                              // Required type
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

/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:126)
 */
@SuppressWarnings("serial")
public class MvcMenuItemDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcMenuItem";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __addToMenu = new DmcAttributeInfo("addToMenu",623,"MvcMenu",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __associatedController = new DmcAttributeInfo("associatedController",631,"MvcController",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __customRender = new DmcAttributeInfo("customRender",634,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __displayLabel = new DmcAttributeInfo("displayLabel",633,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __menuOrder = new DmcAttributeInfo("menuOrder",625,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __triggersAction = new DmcAttributeInfo("triggersAction",626,"MvcAction",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__addToMenu.id,__addToMenu);
        _ImAp.put(__associatedController.id,__associatedController);
        _ImAp.put(__customRender.id,__customRender);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__displayLabel.id,__displayLabel);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__menuOrder.id,__menuOrder);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__triggersAction.id,__triggersAction);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__addToMenu.name,__addToMenu);
        _SmAp.put(__associatedController.name,__associatedController);
        _SmAp.put(__customRender.name,__customRender);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__displayLabel.name,__displayLabel);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__menuOrder.name,__menuOrder);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__triggersAction.name,__triggersAction);
    }

    public MvcMenuItemDMO() {
        super("MvcMenuItem");
    }

    protected MvcMenuItemDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public MvcMenuItemDMO getNew(){
        MvcMenuItemDMO rc = new MvcMenuItemDMO();
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:676)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuItemDMO){
            return( getObjectName().equals( ((MvcMenuItemDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
    public String getDisplayLabel(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__displayLabel);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
    public void setDisplayLabel(String value) {
        DmcAttribute<?> attr = get(__displayLabel);
        if (attr == null)
            attr = new DmcTypeStringSV(__displayLabel);
        
        try{
            attr.set(value);
            set(__displayLabel,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setDisplayLabel(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__displayLabel);
        if (attr == null)
            attr = new DmcTypeStringSV(__displayLabel);
        
        attr.set(value);
        set(__displayLabel,attr);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remDisplayLabel(){
         rem(__displayLabel);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
    public Boolean isCustomRender(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__customRender);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets customRender to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
    public void setCustomRender(Boolean value) {
        DmcAttribute<?> attr = get(__customRender);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__customRender);
        
        try{
            attr.set(value);
            set(__customRender,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets customRender to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setCustomRender(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__customRender);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__customRender);
        
        attr.set(value);
        set(__customRender,attr);
    }

    /**
     * Removes the customRender attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remCustomRender(){
         rem(__customRender);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        try{
            attr.set(value);
            set(__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remName(){
         rem(__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:499)
    public MvcActionREF getTriggersAction(){
        DmcTypeMvcActionREFSV attr = (DmcTypeMvcActionREFSV) get(__triggersAction);
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
     * Sets triggersAction to the specified value.
     * @param value MvcActionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:538)
    public void setTriggersAction(MvcActionDMO value) {
        DmcAttribute<?> attr = get(__triggersAction);
        if (attr == null)
            attr = new DmcTypeMvcActionREFSV(__triggersAction);
        
        try{
            attr.set(value);
            set(__triggersAction,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets triggersAction to the specified value.
     * @param value A value compatible with DmcTypeMvcActionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setTriggersAction(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__triggersAction);
        if (attr == null)
            attr = new DmcTypeMvcActionREFSV(__triggersAction);
        
        attr.set(value);
        set(__triggersAction,attr);
    }

    /**
     * Removes the triggersAction attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remTriggersAction(){
         rem(__triggersAction);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:499)
    public MvcMenuREF getAddToMenu(){
        DmcTypeMvcMenuREFSV attr = (DmcTypeMvcMenuREFSV) get(__addToMenu);
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
     * Sets addToMenu to the specified value.
     * @param value MvcMenuDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:538)
    public void setAddToMenu(MvcMenuDMO value) {
        DmcAttribute<?> attr = get(__addToMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREFSV(__addToMenu);
        
        try{
            attr.set(value);
            set(__addToMenu,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value A value compatible with DmcTypeMvcMenuREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setAddToMenu(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__addToMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREFSV(__addToMenu);
        
        attr.set(value);
        set(__addToMenu,attr);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remAddToMenu(){
         rem(__addToMenu);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:499)
    public MvcControllerREF getAssociatedController(){
        DmcTypeMvcControllerREFSV attr = (DmcTypeMvcControllerREFSV) get(__associatedController);
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
     * Sets associatedController to the specified value.
     * @param value MvcControllerDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:538)
    public void setAssociatedController(MvcControllerDMO value) {
        DmcAttribute<?> attr = get(__associatedController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREFSV(__associatedController);
        
        try{
            attr.set(value);
            set(__associatedController,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets associatedController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setAssociatedController(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__associatedController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREFSV(__associatedController);
        
        attr.set(value);
        set(__associatedController,attr);
    }

    /**
     * Removes the associatedController attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remAssociatedController(){
         rem(__associatedController);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:555)
    public Integer getMenuOrder(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__menuOrder);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:592)
    public void setMenuOrder(Integer value) {
        DmcAttribute<?> attr = get(__menuOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__menuOrder);
        
        try{
            attr.set(value);
            set(__menuOrder,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public void setMenuOrder(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__menuOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__menuOrder);
        
        attr.set(value);
        set(__menuOrder,attr);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:634)
    public void remMenuOrder(){
         rem(__menuOrder);
    }




}
