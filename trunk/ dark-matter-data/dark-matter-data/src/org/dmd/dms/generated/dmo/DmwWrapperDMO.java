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
package org.dmd.dms.generated.dmo;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

/**
 * The DmwWrapper class is the basis for all server-side objects that wrapper
 * Dark Matter Obects and extend them with behaviour
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1059)
 */
@SuppressWarnings({"unused", "serial"})
public class DmwWrapperDMO extends DmcObject {

     public DmwWrapperDMO(){
         super("DmwWrapper");
     }

     public DmwWrapperDMO(String oc){
         super(oc);
     }

    @Override
    public DmwWrapperDMO getOneOfMe(){
        DmwWrapperDMO rc = new DmwWrapperDMO();
        return(rc);
    }

     public final static String _objectClass = "objectClass";


    /**
     * Used to indicate the classes that an object instance supports.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getObjectClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) get(_objectClass);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another objectClass value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addObjectClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(_objectClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREF();
        
        attr.add(value);
        add(_objectClass,attr);
        return(attr);
    }


}
