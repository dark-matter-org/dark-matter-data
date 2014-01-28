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
 * The DmcTypeTypeDefinitionREF class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcTypes(MetaGenerator.java:2743)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeTypeDefinitionREF extends DmcTypeNamedObjectREF<TypeDefinitionREF, DefinitionName> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeTypeDefinitionREF(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeTypeDefinitionREF(DmcAttributeInfo ai){
        super(ai);
    }

    /**
     * Checks that we have a TypeDefinitionREF or TypeDefinitionDMO.
     */
    public TypeDefinitionREF typeCheck(Object value) throws DmcValueException {
        TypeDefinitionREF rc = null;
        if (value instanceof TypeDefinitionREF)
            rc = (TypeDefinitionREF)value;
        else if (value instanceof TypeDefinitionDMO)
            rc = new TypeDefinitionREF((TypeDefinitionDMO)value);
        else if (value instanceof DmcObjectName){
            rc = new TypeDefinitionREF();
            rc.setName((DmcObjectName)value);
        }
        else if (value instanceof String){
            rc = new TypeDefinitionREF();
            rc.setName(new DefinitionName((String)value));
        }
        else
            throw(new DmcValueException("Object of class:" + value.getClass().getName() + " passed where a TypeDefinitionREF/DMO or DmcObjectName expected."));
        return(rc);
    }

    @Override
    protected TypeDefinitionREF getNewHelper(){
        return( new TypeDefinitionREF());
    }

    @Override
    protected DefinitionName getNewName(){
        return( new DefinitionName());
    }

    @Override
    protected String getDMOClassName(){
        return( TypeDefinitionDMO.class.getName());
    }

    @Override
    protected boolean isDMO(Object value){
        if (value instanceof TypeDefinitionDMO)
            return(true);
        return(false);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    @Override
    public TypeDefinitionREF cloneValue(TypeDefinitionREF val){
        TypeDefinitionREF rc = new TypeDefinitionREF(val);
        return(rc);
    }

    @Override
    public void serializeValue(DmcOutputStreamIF dos, TypeDefinitionREF value) throws Exception {
        value.serializeIt(dos);
    }

    @Override
    public TypeDefinitionREF deserializeValue(DmcInputStreamIF dis) throws Exception {
        TypeDefinitionREF rc = new TypeDefinitionREF();
        rc.deserializeIt(dis);
        return(rc);
    }

}
