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
package org.dmd.dmv.server.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;


// import 8
import org.dmd.dmv.server.extended.ClassRule;
// import 9
import org.dmd.dmv.shared.generated.dmo.MayRuleDMO;

/**
 * The MustRule verifies that an object has its must attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:203)
 */
abstract public class MayRuleDMW extends ClassRule {

    public MayRuleDMW() {
        super(new MayRuleDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._MayRule);
    }

    public MayRuleDMW(MayRuleDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._MayRule);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        super.setDmcObject(obj);
    }

    protected MayRuleDMW(MayRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmv.server.extended.MayRule>());
    }


}
