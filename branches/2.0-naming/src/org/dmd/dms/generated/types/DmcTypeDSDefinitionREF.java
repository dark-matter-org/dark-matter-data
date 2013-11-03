//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
import org.dmd.dmc.types.DefinitionName;
/**
 * The DmcTypeDSDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2660)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDSDefinitionREF extends DmcTypeNamedObjectREF<DSDefinitionREF, DefinitionName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeDSDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeDSDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a DSDefinitionREF or DSDefinitionDMO.
     */
    public DSDefinitionREF typeCheck(Object value) throws DmcValueException {
        DSDefinitionREF rc = null;
        if (value instanceof DSDefinitionREF)
            rc = (DSDefinitionREF)value;
        else if (value instanceof DSDefinitionDMO)
            rc = new DSDefinitionREF((DSDefinitionDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new DSDefinitionREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new DSDefinitionREF();
            rc.setName(new DefinitionName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a DSDefinitionREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected DSDefinitionREF getNewHelper(){
        return( new DSDefinitionREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return( new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( DSDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof DSDefinitionDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public DSDefinitionREF cloneValue(DSDefinitionREF val){
        DSDefinitionREF rc = new DSDefinitionREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, DSDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public DSDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        DSDefinitionREF rc = new DSDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}