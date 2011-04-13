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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:270)
import java.io.Serializable;                                                      // Always required
import java.util.*;                                                               // Always required
import org.dmd.dmc.DmcAttribute;                                                  // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                              // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                              // Named object
import org.dmd.dmc.DmcOmni;                                                       // Lazy resolution
import org.dmd.dmc.DmcValueException;                                             // Any attributes
import org.dmd.dmc.types.StringName;                                              // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                                 // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                              // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                             // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                           // Required type
import org.dmd.features.extgwt.generated.dmo.MvcControllerDMO;                    // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;                    // Base class
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;                          // Type specific set/add
import org.dmd.features.extgwt.generated.types.DmcTypeMvcControllerREFSV;         // Reference type
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMenuREFSV;               // Reference type
import org.dmd.features.extgwt.generated.types.MvcControllerREF;                  // Helper class
import org.dmd.features.extgwt.generated.types.MvcMenuREF;                        // Helper class

/**
 * The menu separator indicates where a separator should be  placed between
 * menu items.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:129)
 */
@SuppressWarnings("serial")
public class MvcMenuSeparatorDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcMenuSeparator";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __addToMenu = new DmcAttributeInfo("addToMenu",623,"MvcMenu",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __associatedController = new DmcAttributeInfo("associatedController",631,"MvcController",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __menuOrder = new DmcAttributeInfo("menuOrder",625,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__addToMenu.id,__addToMenu);
        _ImAp.put(__associatedController.id,__associatedController);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__menuOrder.id,__menuOrder);
        _ImAp.put(__name.id,__name);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__addToMenu.name,__addToMenu);
        _SmAp.put(__associatedController.name,__associatedController);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__menuOrder.name,__menuOrder);
        _SmAp.put(__name.name,__name);
    }

    public MvcMenuSeparatorDMO() {
        super("MvcMenuSeparator");
    }

    protected MvcMenuSeparatorDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public MvcMenuSeparatorDMO getNew(){
        MvcMenuSeparatorDMO rc = new MvcMenuSeparatorDMO();
        return(rc);
    }

    public MvcMenuSeparatorDMO(DmcTypeModifierMV mods) {
        super("MvcMenuSeparator");
        modrec(true);
        setModifier(mods);
    }

    public MvcMenuSeparatorDMO getModificationRecorder(){
        MvcMenuSeparatorDMO rc = new MvcMenuSeparatorDMO(new DmcTypeModifierMV());
        rc.setName(getName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:669)
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
        if (obj instanceof MvcMenuSeparatorDMO){
            return( getObjectName().equals( ((MvcMenuSeparatorDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remName(){
         rem(__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:502)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:541)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remAddToMenu(){
         rem(__addToMenu);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:502)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:541)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remAssociatedController(){
         rem(__associatedController);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remMenuOrder(){
         rem(__menuOrder);
    }




}
