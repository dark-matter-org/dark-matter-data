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
 * The DmcTypeObjectValidatorDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:1836)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeObjectValidatorDefinitionREF extends DmcTypeNamedObjectREF<ObjectValidatorDefinitionREF, StringName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeObjectValidatorDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeObjectValidatorDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a ObjectValidatorDefinitionREF or ObjectValidatorDefinitionDMO.
     */
    public ObjectValidatorDefinitionREF typeCheck(Object value) throws DmcValueException {
        ObjectValidatorDefinitionREF rc = null;
        if (value instanceof ObjectValidatorDefinitionREF)
            rc = (ObjectValidatorDefinitionREF)value;
        else if (value instanceof ObjectValidatorDefinitionDMO)
            rc = new ObjectValidatorDefinitionREF((ObjectValidatorDefinitionDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new ObjectValidatorDefinitionREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new ObjectValidatorDefinitionREF();
            rc.setName(new StringName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a ObjectValidatorDefinitionREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected ObjectValidatorDefinitionREF getNewHelper(){
        return( new ObjectValidatorDefinitionREF());
    }

    @Override
    protected StringName getNewName(){
        return( new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( ObjectValidatorDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ObjectValidatorDefinitionDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public ObjectValidatorDefinitionREF cloneValue(ObjectValidatorDefinitionREF val){
        ObjectValidatorDefinitionREF rc = new ObjectValidatorDefinitionREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ObjectValidatorDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ObjectValidatorDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ObjectValidatorDefinitionREF rc = new ObjectValidatorDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
