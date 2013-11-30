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
 * The DmcTypeDSDefinitionModuleREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2736)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDSDefinitionModuleREF extends DmcTypeNamedObjectREF<DSDefinitionModuleREF, DefinitionName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeDSDefinitionModuleREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeDSDefinitionModuleREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a DSDefinitionModuleREF or DSDefinitionModuleDMO.
     */
    public DSDefinitionModuleREF typeCheck(Object value) throws DmcValueException {
        DSDefinitionModuleREF rc = null;
        if (value instanceof DSDefinitionModuleREF)
            rc = (DSDefinitionModuleREF)value;
        else if (value instanceof DSDefinitionModuleDMO)
            rc = new DSDefinitionModuleREF((DSDefinitionModuleDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new DSDefinitionModuleREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new DSDefinitionModuleREF();
            rc.setName(new DefinitionName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a DSDefinitionModuleREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected DSDefinitionModuleREF getNewHelper(){
        return( new DSDefinitionModuleREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return( new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( DSDefinitionModuleDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof DSDefinitionModuleDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public DSDefinitionModuleREF cloneValue(DSDefinitionModuleREF val){
        DSDefinitionModuleREF rc = new DSDefinitionModuleREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, DSDefinitionModuleREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public DSDefinitionModuleREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        DSDefinitionModuleREF rc = new DSDefinitionModuleREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
