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
 * The DmcTypeRunContextREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2258)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeRunContextREF extends DmcTypeNamedObjectREF<RunContextREF, StringName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeRunContextREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeRunContextREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a RunContextREF or RunContextDMO.
     */
    public RunContextREF typeCheck(Object value) throws DmcValueException {
        RunContextREF rc = null;
        if (value instanceof RunContextREF)
            rc = (RunContextREF)value;
        else if (value instanceof RunContextDMO)
            rc = new RunContextREF((RunContextDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new RunContextREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new RunContextREF();
            rc.setName(new StringName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a RunContextREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected RunContextREF getNewHelper(){
        return( new RunContextREF());
    }

    @Override
    protected StringName getNewName(){
        return( new StringName());
    }

    @Override
    protected String getDMOClassName(){
        return( RunContextDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof RunContextDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public RunContextREF cloneValue(RunContextREF val){
        RunContextREF rc = new RunContextREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, RunContextREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public RunContextREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        RunContextREF rc = new RunContextREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
