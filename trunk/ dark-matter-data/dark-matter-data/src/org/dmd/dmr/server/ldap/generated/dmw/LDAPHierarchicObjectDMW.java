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
package org.dmd.dmr.server.ldap.generated.dmw;

import java.util.*;
import org.dmd.dms.ClassDefinition;


// import 6
import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;
// import 8
import org.dmd.dmr.server.base.extended.HierarchicObject;

public class LDAPHierarchicObjectDMW extends HierarchicObject {

    protected LDAPHierarchicObjectDMW(LDAPHierarchicObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmr.server.ldap.extended.LDAPHierarchicObject>());
    }


}
