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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The MvcPopupMenu class is meant to allow for the definition of menus that
 * can be popped up on a variety components, for instance tree nodes and
 * table rows. Although implemented as standard
 * com.extjs.gxt.ui.client.widget.menu.Menu instances, the display of popup
 * menus is controlled by the MenuController infrastructure.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:451)
 */
public class MvcPopupMenuDMO  extends MvcMenuDMO  implements DmcNamedObjectIF  {

    public final static String _name = "name";
    public final static String _useForModelClass = "useForModelClass";

    public MvcPopupMenuDMO() {
        super("MvcPopupMenu");
    }

    protected MvcPopupMenuDMO(String oc) {
        super(oc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcPopupMenuDMO){
            return( getObjectName().equals( ((MvcPopupMenuDMO) obj).getObjectName()) );
        }
        return(false);
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

    public String getUseForModelClass(){
        DmcTypeString attr = (DmcTypeString) get(_useForModelClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useForModelClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setUseForModelClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_useForModelClass);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_useForModelClass,attr);
    }

    /**
     * Removes the useForModelClass attribute value.
     */
    public void remUseForModelClass(){
         rem(_useForModelClass);
    }




}
