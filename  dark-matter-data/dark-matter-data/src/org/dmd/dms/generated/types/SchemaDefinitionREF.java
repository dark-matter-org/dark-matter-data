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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcNamedObjectNontransportableREF;
import org.dmd.dmc.types.DmcTypeStringName;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.ValueTypeEnum;
/**
 * The SchemaDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:1684)
 */
@SuppressWarnings("serial")
public class SchemaDefinitionREF extends DmcNamedObjectNontransportableREF<SchemaDefinitionDMO> {

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);

    DmcTypeStringName myName;

    /**
     * Default constructor.
     */
    public SchemaDefinitionREF(){
        myName = null;
    }

    /**
     * Copy constructor.
     */
    public SchemaDefinitionREF(SchemaDefinitionREF original){
        myName = original.myName;
        object = original.object;
    }

    /**
     * Sets our object.
     */
    @Override
    public void setObject(SchemaDefinitionDMO o){
        object = o;
    }

    /**
     * Clones this reference.
     */
    public SchemaDefinitionREF cloneMe(){
        SchemaDefinitionREF rc = new SchemaDefinitionREF();
        rc.myName = myName;
        rc.object = object;
        return(rc);
    }

    @Override
    public void setName(DmcObjectNameIF n) throws DmcValueException {
        if (myName == null);
            myName = new  DmcTypeStringName(__name);
        myName.set(n);
    }

    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
         return(myName);
    }

    @Override
    public DmcObjectNameIF getObjectName(){
         return(myName.getSV());
    }

}
