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
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.*;

@SuppressWarnings("serial")
/**
 * The DmcTypeGPBFieldTypeEnum class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcType(MetaGenerator.java:3057)
 */
abstract public class DmcTypeGPBFieldTypeEnum extends DmcAttribute<GPBFieldTypeEnum> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeGPBFieldTypeEnum(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeGPBFieldTypeEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected GPBFieldTypeEnum typeCheck(Object value) throws DmcValueException {
        GPBFieldTypeEnum rc = null;

        if (value instanceof GPBFieldTypeEnum){
            rc = (GPBFieldTypeEnum)value;
        }
        else if (value instanceof String){
            rc = GPBFieldTypeEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid GPBFieldTypeEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = GPBFieldTypeEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid GPBFieldTypeEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with GPBFieldTypeEnum expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public GPBFieldTypeEnum cloneValue(GPBFieldTypeEnum val){
        GPBFieldTypeEnum rc = val;
        return(rc);
    }

    /**
     * Writes a GPBFieldTypeEnum.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, GPBFieldTypeEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a GPBFieldTypeEnum.
     */
    @Override
    public GPBFieldTypeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(GPBFieldTypeEnum.get(dis.readShort()));
    }



}
