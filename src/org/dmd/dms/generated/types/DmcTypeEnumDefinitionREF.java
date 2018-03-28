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
 * The DmcTypeEnumDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2767)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeEnumDefinitionREF extends DmcTypeNamedObjectREF<EnumDefinitionREF, DefinitionName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeEnumDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeEnumDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a EnumDefinitionREF or EnumDefinitionDMO.
     */
    public EnumDefinitionREF typeCheck(Object value) throws DmcValueException {
        EnumDefinitionREF rc = null;
        if (value instanceof EnumDefinitionREF)
            rc = (EnumDefinitionREF)value;
        else if (value instanceof EnumDefinitionDMO)
            rc = new EnumDefinitionREF((EnumDefinitionDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new EnumDefinitionREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new EnumDefinitionREF();
            rc.setName(new DefinitionName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a EnumDefinitionREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected EnumDefinitionREF getNewHelper(){
        return( new EnumDefinitionREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return( new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( EnumDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof EnumDefinitionDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public EnumDefinitionREF cloneValue(EnumDefinitionREF val){
        EnumDefinitionREF rc = new EnumDefinitionREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, EnumDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public EnumDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        EnumDefinitionREF rc = new EnumDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
