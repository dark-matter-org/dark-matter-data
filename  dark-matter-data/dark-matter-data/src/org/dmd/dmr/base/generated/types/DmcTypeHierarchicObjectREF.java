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
package org.dmd.dmr.base.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmr.base.generated.dmo.HierarchicObjectDMO;

/**
 * This is the generated DmcAttribute derivative for values of type HierarchicObject
 * <P>
 * Generated from the dmrbase schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:87)
 */
@SuppressWarnings("serial")
public class DmcTypeHierarchicObjectREF extends DmcAttribute<HierarchicObjectDMO> {

    public DmcTypeHierarchicObjectREF(){
    }

    protected HierarchicObjectDMO typeCheck(Object value) throws DmcValueException {
        HierarchicObjectDMO rc = null;

        if (value instanceof HierarchicObjectDMO){
            rc = (HierarchicObjectDMO)value;
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with HierarchicObjectDMO expected."));
        }
        return(rc);
    }

    public String getString(){
        if (sv == null){
            StringBuffer sb = new StringBuffer();
            for (HierarchicObjectDMO t : mv){
                sb.append(t + ", ");
            }
            return(sb.toString());
        }
        else
            return(sv.toString());

    }


}
