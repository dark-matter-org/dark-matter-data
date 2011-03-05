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
// import 3 Integer
import org.dmd.dmc.types.DmcTypeInteger;
// import 3 MvcMenu
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMenuREF;
import org.dmd.features.extgwt.generated.types.MvcMenuREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcMenuREF;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:655)
 */
public class MvcSubMenuDMO  extends MvcMenuDMO  implements DmcNamedObjectIF  {

    public final static String _displayLabel = "displayLabel";
    public final static String _name = "name";
    public final static String _addToMenu = "addToMenu";
    public final static String _menuOrder = "menuOrder";

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
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"String",ValueTypeEnum.SINGLE,false);

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
    }

    public MvcSubMenuDMO() {
        super("MvcSubMenu",_ImAp,_SmAp);
    }

    protected MvcSubMenuDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public MvcSubMenuDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public MvcSubMenuDMO(MvcSubMenuDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcSubMenuDMO getOneOfMe() {
        MvcSubMenuDMO rc = new MvcSubMenuDMO(this.getConstructionClassName());
        return(rc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcSubMenuDMO){
            return( getObjectName().equals( ((MvcSubMenuDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public String getDisplayLabel(){
        DmcTypeString attr = (DmcTypeString) get(_displayLabel);
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
        DmcAttribute attr = get(_displayLabel);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_displayLabel,attr);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    public void remDisplayLabel(){
         rem(_displayLabel);
    }

    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
         rem(_name);
    }

    public MvcMenuREF getAddToMenu(){
        DmcTypeMvcMenuREF attr = (DmcTypeMvcMenuREF) get(_addToMenu);
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
        DmcAttribute attr = get(_addToMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREF();
        
        attr.set(value);
        set(_addToMenu,attr);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    public void remAddToMenu(){
         rem(_addToMenu);
    }

    public Integer getMenuOrder(){
        DmcTypeInteger attr = (DmcTypeInteger) get(_menuOrder);
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
        DmcAttribute attr = get(_menuOrder);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(_menuOrder,attr);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    public void remMenuOrder(){
         rem(_menuOrder);
    }




}
