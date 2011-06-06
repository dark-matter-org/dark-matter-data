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
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;
import org.dmd.dmc.DmcNameResolverIF;
@SuppressWarnings("serial")
/**
 * The DmcTypeField class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from:  org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:2455)
 *    Called from: Called from:  org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:2369)
 */
abstract public class DmcTypeField extends DmcTypeComplexTypeWithRefs<Field> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeField(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeField(DmcAttributeInfo ai){
        super(ai);
    }

    protected Field typeCheck(Object value) throws DmcValueException {
        Field rc = null;

        if (value instanceof Field){
            rc = (Field)value;
        }
        else if (value instanceof String){
            rc = new Field((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with Field expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public Field cloneValue(Field val){
        return(new Field(val));
    }

    /**
     * Writes a Field.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, Field value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a Field.
     */
    @Override
    public Field deserializeValue(DmcInputStreamIF dis) throws Exception {
        Field rc = new Field();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a Field.
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, Field value, String attrName) throws DmcValueException {
        value.resolve(resolver,attrName);
    }



}
