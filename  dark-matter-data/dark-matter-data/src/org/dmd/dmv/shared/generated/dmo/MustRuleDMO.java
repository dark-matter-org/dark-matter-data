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
package org.dmd.dmv.shared.generated.dmo;

import java.util.*;


// import 6
import org.dmd.dmv.shared.generated.dmo.ClassRuleDMO;

@SuppressWarnings("serial")
/**
 * The MustRule verifies that an object has its must attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:617)
 */
public class MustRuleDMO  extends ClassRuleDMO  {


    public MustRuleDMO() {
        super("MustRule");
    }

    protected MustRuleDMO(String oc) {
        super(oc);
    }

    public MustRuleDMO(MustRuleDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MustRuleDMO getOneOfMe() {
        MustRuleDMO rc = new MustRuleDMO(this.getConstructionClassName());
        return(rc);
    }




}
