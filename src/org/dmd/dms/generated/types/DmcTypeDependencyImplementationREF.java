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
import org.dmd.dmc.types.StringName;
/**
 * The DmcTypeDependencyImplementationREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2548)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDependencyImplementationREF extends DmcTypeNamedObjectREF<DependencyImplementationREF, StringName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeDependencyImplementationREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeDependencyImplementationREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a DependencyImplementationREF or DependencyImplementationDMO.
     */
    public DependencyImplementationREF typeCheck(Object value) throws DmcValueException {
        DependencyImplementationREF rc = null;
        if (value instanceof DependencyImplementationREF)
            rc = (DependencyImplementationREF)value;
        else if (value instanceof DependencyImplementationDMO)
            rc = new DependencyImplementationREF((DependencyImplementationDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new DependencyImplementationREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new DependencyImplementationREF();
            rc.setName(new StringName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a DependencyImplementationREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected DependencyImplementationREF getNewHelper(){
        return( new DependencyImplementationREF());
    }

    @Override
    protected StringName getNewName(){
        return( new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( DependencyImplementationDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof DependencyImplementationDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public DependencyImplementationREF cloneValue(DependencyImplementationREF val){
        DependencyImplementationREF rc = new DependencyImplementationREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, DependencyImplementationREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public DependencyImplementationREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        DependencyImplementationREF rc = new DependencyImplementationREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
