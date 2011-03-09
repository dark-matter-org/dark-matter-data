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

import java.util.*;

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3.2 Boolean
import org.dmd.dmc.types.DmcTypeBoolean;
// import 3.2 Integer
import org.dmd.dmc.types.DmcTypeInteger;
// import 3.1 MvcAction
import org.dmd.features.extgwt.generated.types.DmcTypeMvcActionREF;
import org.dmd.features.extgwt.generated.types.MvcActionREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcActionREF;
// import 3.1 MvcController
import org.dmd.features.extgwt.generated.types.DmcTypeMvcControllerREF;
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
// import 3.1 MvcMenu
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMenuREF;
import org.dmd.features.extgwt.generated.types.MvcMenuREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcMenuREF;
// import 3.2 String
import org.dmd.dmc.types.DmcTypeString;
// import 2
import org.dmd.dmc.types.StringName;
// import 3.2 StringName
import org.dmd.dmc.types.DmcTypeStringName;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:654)
 */
public class MvcMenuItemDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

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
        super("MvcMenuItem",_ImAp,_SmAp);
    }

    protected MvcMenuItemDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public MvcMenuItemDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public MvcMenuItemDMO(MvcMenuItemDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcMenuItemDMO getOneOfMe() {
        MvcMenuItemDMO rc = new MvcMenuItemDMO(this.getConstructionClassName());
        return(rc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(__name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMenuItemDMO){
            return( getObjectName().equals( ((MvcMenuItemDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public String getDisplayLabel(){
        DmcTypeString attr = (DmcTypeString) get(__displayLabel);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDisplayLabel(Object value) throws DmcValueException {
        DmcAttribute attr = get(__displayLabel);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__displayLabel,attr);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    public void remDisplayLabel(){
         rem(__displayLabel);
    }

    public Boolean getCustomRender(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__customRender);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets customRender to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setCustomRender(Object value) throws DmcValueException {
        DmcAttribute attr = get(__customRender);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(__customRender,attr);
    }

    /**
     * Removes the customRender attribute value.
     */
    public void remCustomRender(){
         rem(__customRender);
    }

    public StringName getName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringName();
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
         rem(__name);
    }

    public MvcActionREF getTriggersAction(){
        DmcTypeMvcActionREF attr = (DmcTypeMvcActionREF) get(__triggersAction);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets triggersAction to the specified value.
     * @param value A value compatible with DmcTypeMvcActionREF
     */
    @SuppressWarnings("unchecked")
    public void setTriggersAction(Object value) throws DmcValueException {
        DmcAttribute attr = get(__triggersAction);
        if (attr == null)
            attr = new DmcTypeMvcActionREF();
        
        attr.set(value);
        set(__triggersAction,attr);
    }

    /**
     * Removes the triggersAction attribute value.
     */
    public void remTriggersAction(){
         rem(__triggersAction);
    }

    public MvcMenuREF getAddToMenu(){
        DmcTypeMvcMenuREF attr = (DmcTypeMvcMenuREF) get(__addToMenu);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value A value compatible with DmcTypeMvcMenuREF
     */
    @SuppressWarnings("unchecked")
    public void setAddToMenu(Object value) throws DmcValueException {
        DmcAttribute attr = get(__addToMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREF();
        
        attr.set(value);
        set(__addToMenu,attr);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    public void remAddToMenu(){
         rem(__addToMenu);
    }

    public MvcControllerREF getAssociatedController(){
        DmcTypeMvcControllerREF attr = (DmcTypeMvcControllerREF) get(__associatedController);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets associatedController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREF
     */
    @SuppressWarnings("unchecked")
    public void setAssociatedController(Object value) throws DmcValueException {
        DmcAttribute attr = get(__associatedController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREF();
        
        attr.set(value);
        set(__associatedController,attr);
    }

    /**
     * Removes the associatedController attribute value.
     */
    public void remAssociatedController(){
         rem(__associatedController);
    }

    public Integer getMenuOrder(){
        DmcTypeInteger attr = (DmcTypeInteger) get(__menuOrder);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    @SuppressWarnings("unchecked")
    public void setMenuOrder(Object value) throws DmcValueException {
        DmcAttribute attr = get(__menuOrder);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(__menuOrder,attr);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    public void remMenuOrder(){
         rem(__menuOrder);
    }




}
