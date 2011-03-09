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
package org.dmd.dmr.shared.ldap.generated.types;

import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;

/**
 * This is the generated DmcAttribute derivative for values of type LDAPHierarchicObject
 * <P>
 * Generated from the dmr.ldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpNamedREF(DmoTypeFormatter.java:359)
 */
@SuppressWarnings("serial")
public class LDAPHierarchicObjectREF extends DmcNamedObjectNontransportableREF<LDAPHierarchicObjectDMO> {

    public LDAPHierarchicObjectREF(){
    }

    public LDAPHierarchicObjectREF(LDAPHierarchicObjectREF original){
        name   = original.name;
        object = original.object;
    }

    public void setObject(LDAPHierarchicObjectDMO o){
         object = o;
    }

    /**
     * Clones this reference.
     */
    public LDAPHierarchicObjectREF cloneMe(){
        LDAPHierarchicObjectREF rc = new LDAPHierarchicObjectREF();
        rc.name   = name;
        rc.object = object;
        return(rc);
    }



}
