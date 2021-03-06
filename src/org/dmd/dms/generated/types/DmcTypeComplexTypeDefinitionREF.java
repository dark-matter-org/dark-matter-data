//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012-2021 dark-matter-data committers
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
 * The DmcTypeComplexTypeDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2738)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeComplexTypeDefinitionREF extends DmcTypeNamedObjectREF<ComplexTypeDefinitionREF, DefinitionName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeComplexTypeDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeComplexTypeDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a ComplexTypeDefinitionREF or ComplexTypeDefinitionDMO.
     */
    public ComplexTypeDefinitionREF typeCheck(Object value) throws DmcValueException {
        ComplexTypeDefinitionREF rc = null;
        if (value instanceof ComplexTypeDefinitionREF)
            rc = (ComplexTypeDefinitionREF)value;
        else if (value instanceof ComplexTypeDefinitionDMO)
            rc = new ComplexTypeDefinitionREF((ComplexTypeDefinitionDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new ComplexTypeDefinitionREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new ComplexTypeDefinitionREF();
            rc.setName(new DefinitionName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a ComplexTypeDefinitionREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected ComplexTypeDefinitionREF getNewHelper(){
        return( new ComplexTypeDefinitionREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return( new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( ComplexTypeDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof ComplexTypeDefinitionDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public ComplexTypeDefinitionREF cloneValue(ComplexTypeDefinitionREF val){
        ComplexTypeDefinitionREF rc = new ComplexTypeDefinitionREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, ComplexTypeDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public ComplexTypeDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        ComplexTypeDefinitionREF rc = new ComplexTypeDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
