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
package org.dmd.dmv.shared.generated.dmw;

import java.util.*;
import org.dmd.dms.*;


// import 6
import org.dmd.dmv.shared.generated.dmo.SharedAttributeRuleDMO;
// import 8
import org.dmd.dmv.shared.extended.SharedRule;

abstract public class SharedAttributeRuleDMW extends SharedRule {

    protected SharedAttributeRuleDMW(SharedAttributeRuleDMO obj) {
        super(obj);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmv.shared.extended.SharedAttributeRule>());
    }


}
