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
package org.dmd.features.extgwt.generated.types;

import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.features.extgwt.generated.dmo.MvcSubMenuDMO;

/**
 * This is the generated DmcAttribute derivative for values of type MvcSubMenu
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:359)
 */
@SuppressWarnings("serial")
public class MvcSubMenuREF extends DmcNamedObjectNontransportableREF<MvcSubMenuDMO> {

    public MvcSubMenuREF(){
    }

    public MvcSubMenuREF(MvcSubMenuREF original){
        name   = original.name;
        object = original.object;
    }

    public void setObject(MvcSubMenuDMO o){
         object = o;
    }

    /**
     * Clones this reference.
     */
    public MvcSubMenuREF cloneMe(){
        MvcSubMenuREF rc = new MvcSubMenuREF();
        rc.name   = name;
        rc.object = object;
        return(rc);
    }



}
