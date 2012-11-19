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
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.types.DmcTypeComplexTypeWithRefs;
import org.dmd.dmc.DmcNameResolverIF;
@SuppressWarnings("serial")
/**
 * The DmcTypeGPBField class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.util.GenUtility.dumpComplexTypeDmcType(GenUtility.java:3078)
 *    Called from: Called from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3279)
 */
abstract public class DmcTypeGPBField extends DmcTypeComplexTypeWithRefs<GPBField> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeGPBField(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeGPBField(DmcAttributeInfo ai){
        super(ai);
    }

    protected GPBField typeCheck(Object value) throws DmcValueException {
        GPBField rc = null;

        if (value instanceof GPBField){
            rc = (GPBField)value;
        }
        else if (value instanceof String){
            rc = new GPBField((String)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GPBField expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public GPBField cloneValue(GPBField val){
        return(new GPBField(val));
    }

    /**
     * Writes a GPBField.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, GPBField value) throws Exception {
        value.serializeIt(dos);
    }

    /**
     * Reads a GPBField.
     */
    @Override
    public GPBField deserializeValue(DmcInputStreamIF dis) throws Exception {
        GPBField rc = new GPBField();
        rc.deserializeIt(dis);
        return(rc);
    }

    /**
     * Resolves a GPBField.
     */
    @Override
    public void resolveValue(DmcNameResolverIF resolver, GPBField value, String attrName) throws DmcValueException {
        value.resolve(resolver,attrName);
    }



}
