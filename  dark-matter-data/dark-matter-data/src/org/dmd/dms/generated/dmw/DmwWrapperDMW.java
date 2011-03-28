//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.dms.generated.dmw;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dmw.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * The DmwWrapper class is the basis for all server-side objects that wrapper
 * Dark Matter Obects and extend them with behaviour
 * @author Auto Generated
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:832)
 */
@SuppressWarnings("unused")
public abstract class DmwWrapperDMW extends DmwWrapperBase {

    private DmwWrapperDMO mycore;

    protected DmwWrapperDMW() {
        super(new DmwWrapperDMO());
        mycore = (DmwWrapperDMO) core;
        mycore.setContainer(this);
    }

    protected DmwWrapperDMW(DmcObject obj) {
        super(obj);
        mycore = (DmwWrapperDMO) core;
        mycore.setContainer(this);
    }

    protected DmwWrapperDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DmwWrapperDMO) core;
        mycore.setContainer(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<DmwWrapper>());
    }

    /**
     * Used to indicate the classes that an object instance supports.
     * @return An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1484)
    public ClassDefinitionIterableDMW getObjectClass(){
        DmcAttribute attr = (DmcTypeClassDefinitionREFMV) mycore.get(DmwWrapperDMO.__objectClass);
        if (attr == null)
            return(ClassDefinitionIterableDMW.emptyList);

        return(new ClassDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another objectClass value.
     * @param value A value compatible with ClassDefinition
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1531)
    public DmcAttribute addObjectClass(ClassDefinition value) throws DmcValueException {
        DmcAttribute attr = mycore.addObjectClass(value.getDmcObject());
        return(attr);
    }


}
