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
import org.dmd.dmc.DmcObjectNameIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.types.DmcTypeNamedObjectREF;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dmc.types.StringName;
/**
 * The DmcTypeDmsDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:1652)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDmsDefinitionREF extends DmcTypeNamedObjectREF<DmsDefinitionREF, StringName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeDmsDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeDmsDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a DmsDefinitionREF or DmsDefinitionDMO.
     */
    public DmsDefinitionREF typeCheck(Object value) throws DmcValueException {
        DmsDefinitionREF rc = null;
        if (value instanceof DmsDefinitionREF)
            rc = (DmsDefinitionREF)value;
        else if (value instanceof DmsDefinitionDMO)
            rc = new DmsDefinitionREF((DmsDefinitionDMO)value);
        else if (value instanceof DmcObjectNameIF){
            rc = new DmsDefinitionREF();
            rc.setName((DmcObjectNameIF)value);
        }
        else if (value instanceof String){
            rc = new DmsDefinitionREF();
            rc.setName(new StringName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a DmsDefinitionREF/DMO or DmcObjectNameIF expected."));
        return(rc);
    }

    @Override
    protected DmsDefinitionREF getNewHelper(){
        return( new DmsDefinitionREF());
    }

    @Override
    protected StringName getNewName(){
        return( new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( DmsDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof DmsDefinitionDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public DmsDefinitionREF cloneValue(DmsDefinitionREF val){
        DmsDefinitionREF rc = new DmsDefinitionREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, DmsDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public DmsDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        DmsDefinitionREF rc = new DmsDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
