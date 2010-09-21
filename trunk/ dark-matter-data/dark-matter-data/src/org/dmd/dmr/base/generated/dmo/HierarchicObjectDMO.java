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
package org.dmd.dmr.base.generated.dmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 5
import org.dmd.dmc.DmcObject;

@SuppressWarnings("serial")
/**
 * A HierarchicObject is meant to represent any object that can be identified
 * with a Fully Qualified Name (FQN) and exists in a containment relationship
 * with other objects. The exact implementation of a HierarchicObject is
 * application specific.
 * <P>
 * Generated from the dmr.base schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:401)
 */
abstract public class HierarchicObjectDMO  extends DmcObject  {

    public final static String _parentFQN = "parentFQN";
    public final static String _FQN = "FQN";

    public HierarchicObjectDMO() {
        super("HierarchicObject");
    }

    protected HierarchicObjectDMO(String oc) {
        super(oc);
    }

    public String getParentFQN(){
        DmcTypeString attr = (DmcTypeString) get(_parentFQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setParentFQN(Object value) throws DmcValueException {
        DmcAttribute attr = get(_parentFQN);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_parentFQN,attr);
    }

    public String getFQN(){
        DmcTypeString attr = (DmcTypeString) get(_FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute attr = get(_FQN);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_FQN,attr);
    }




}
