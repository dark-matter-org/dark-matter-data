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
package org.dmd.dms.generated.types;

import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dms.generated.dmo.*;
/**
 * The TypeDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:1935)
 */
@SuppressWarnings("serial")
public class TypeDefinitionREF extends DmcNamedObjectNontransportableREF<TypeDefinitionDMO> {

    /**
     * Default constructor.
     */
    public TypeDefinitionREF(){
    }

    /**
     * Copy constructor.
     */
    public TypeDefinitionREF(TypeDefinitionREF original){
        name = original.name;
        object = original.object;
    }

    /**
     * Sets our object.
     */
    @Override
    public void setObject(TypeDefinitionDMO o){
        object = o;
    }

    /**
     * Clones this reference.
     */
    public TypeDefinitionREF cloneMe(){
        TypeDefinitionREF rc = new TypeDefinitionREF();
        rc.name   = name;
        rc.object = object;
        return(rc);
    }

}