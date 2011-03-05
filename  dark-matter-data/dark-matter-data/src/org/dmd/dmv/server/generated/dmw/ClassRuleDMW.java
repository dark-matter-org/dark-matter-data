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
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;

// import 6
import org.dmd.dmv.shared.generated.dmo.ClassRuleDMO;
// import 8
import org.dmd.dmv.server.extended.Rule;

/**
 * The ClassRule is a rule that applies to an entire object and its
 * collection of attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:203)
 */
abstract public class ClassRuleDMW extends Rule {

    private ClassRuleDMO mycore;

    protected ClassRuleDMW(ClassRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ClassRuleDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmv.server.extended.ClassRule>());
    }

    /**
     * @return A ClassDefinitionDMW object.
     */
    @SuppressWarnings("unchecked")
    public ClassDefinitionDMW getApplyToClass(){
        DmcAttribute attr = mycore.get(ClassRuleDMO._applyToClass);
        if (attr == null)
            return(null);
        
        ClassDefinitionDMW ref = (ClassDefinitionDMW) attr.getAuxData();
        
        return(ref);
    }

    /**
     * Sets the applyToClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setApplyToClass(ClassDefinitionDMW value) throws DmcValueException {
        mycore.setApplyToClass(value.getDmcObject());
        DmcAttribute attr = mycore.get(ClassRuleDMO._applyToClass);
        attr.setAuxData(value);
    }

    /**
     * Removes the applyToClass attribute value.
     */
    public void remApplyToClass(){
        mycore.remApplyToClass();
    }


}
