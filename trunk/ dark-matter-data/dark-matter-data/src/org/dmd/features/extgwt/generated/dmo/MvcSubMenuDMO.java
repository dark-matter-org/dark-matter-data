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

import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
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
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:535)
 */
public class MvcSubMenuDMO  extends MvcMenuDMO  implements DmcNamedObjectIF  {

    public final static String _displayLabel = "displayLabel";
    public final static String _name = "name";
    public final static String _addToMenu = "addToMenu";
    public final static String _menuOrder = "menuOrder";

    public MvcSubMenuDMO() {
        super("MvcSubMenu");
    }

    protected MvcSubMenuDMO(String oc) {
        super(oc);
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

    public String getMenuOrder(){
        DmcTypeString attr = (DmcTypeString) get(_menuOrder);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setMenuOrder(Object value) throws DmcValueException {
        DmcAttribute attr = get(_menuOrder);
        if (attr == null)
            attr = new DmcTypeString();
        
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
