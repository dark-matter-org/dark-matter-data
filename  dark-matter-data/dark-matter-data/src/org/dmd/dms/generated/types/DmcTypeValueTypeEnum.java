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
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.*;

@SuppressWarnings("serial")
/**
 * The DmcTypeValueTypeEnum class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDmcType(MetaGenerator.java:2042)
 */
abstract public class DmcTypeValueTypeEnum extends DmcAttribute<ValueTypeEnum> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeValueTypeEnum(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeValueTypeEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected ValueTypeEnum typeCheck(Object value) throws DmcValueException {
        ValueTypeEnum rc = null;

        if (value instanceof ValueTypeEnum){
            rc = (ValueTypeEnum)value;
        }
        else if (value instanceof String){
            rc = ValueTypeEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid ValueTypeEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = ValueTypeEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid ValueTypeEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ValueTypeEnum expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public ValueTypeEnum cloneValue(ValueTypeEnum val){
        ValueTypeEnum rc = val;
        return(rc);
    }

    /**
     * Writes a ValueTypeEnum.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, ValueTypeEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a ValueTypeEnum.
     */
    @Override
    public ValueTypeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(ValueTypeEnum.get(dis.readShort()));
    }



}
