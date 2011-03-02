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

// import 1
import org.dmd.dms.generated.dmw.AttributeDefinitionDMW;

// import 6
import org.dmd.dmv.shared.generated.dmo.AttributeRuleDMO;
// import 8
import org.dmd.dmv.server.extended.Rule;

abstract public class AttributeRuleDMW extends Rule {

    private AttributeRuleDMO mycore;

    protected AttributeRuleDMW(AttributeRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (AttributeRuleDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmv.server.extended.AttributeRule>());
    }

    /**
     * @return A AttributeDefinitionDMW object.
     */
    @SuppressWarnings("unchecked")
    public AttributeDefinitionDMW getApplyToAttribute(){
        DmcAttribute attr = mycore.get(AttributeRuleDMO._applyToAttribute);
        if (attr == null)
            return(null);
        
        AttributeDefinitionDMW ref = (AttributeDefinitionDMW) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setApplyToAttribute(AttributeDefinitionDMW value) throws DmcValueException {
        mycore.setApplyToAttribute(value.getDmcObject());
        DmcAttribute attr = mycore.get(AttributeRuleDMO._applyToAttribute);
        attr.setAuxData(value);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    public void remApplyToAttribute(){
        mycore.remApplyToAttribute();
    }


}
