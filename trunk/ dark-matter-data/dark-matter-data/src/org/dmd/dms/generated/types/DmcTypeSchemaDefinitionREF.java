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
package org.dmd.dms.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmc.types.StringName;
/**
 * The DmcTypeSchemaDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:1803)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeSchemaDefinitionREF extends DmcTypeNamedObjectREF<SchemaDefinitionREF, StringName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeSchemaDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeSchemaDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a SchemaDefinitionREF or SchemaDefinitionDMO.
     */
    public SchemaDefinitionREF typeCheck(Object value) throws DmcValueException {
        SchemaDefinitionREF rc = null;
        if (value instanceof SchemaDefinitionREF)
            rc = (SchemaDefinitionREF)value;
        else if (value instanceof SchemaDefinitionDMO)
            rc = new SchemaDefinitionREF((SchemaDefinitionDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new SchemaDefinitionREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new SchemaDefinitionREF();
            rc.setName(new StringName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a SchemaDefinitionREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected SchemaDefinitionREF getNewHelper(){
        return( new SchemaDefinitionREF());
    }

    @Override
    protected StringName getNewName(){
        return( new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( SchemaDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof SchemaDefinitionDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public SchemaDefinitionREF cloneValue(SchemaDefinitionREF val){
        SchemaDefinitionREF rc = new SchemaDefinitionREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, SchemaDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public SchemaDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        SchemaDefinitionREF rc = new SchemaDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
