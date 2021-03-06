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
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.*;

@SuppressWarnings("serial")
/**
 * The DmcTypeOriginalTypeEnum class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcType(MetaGenerator.java:3028)
 */
abstract public class DmcTypeOriginalTypeEnum extends DmcAttribute<OriginalTypeEnum> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeOriginalTypeEnum(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeOriginalTypeEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected OriginalTypeEnum typeCheck(Object value) throws DmcValueException {
        OriginalTypeEnum rc = null;

        if (value instanceof OriginalTypeEnum){
            rc = (OriginalTypeEnum)value;
        }
        else if (value instanceof String){
            rc = OriginalTypeEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid OriginalTypeEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = OriginalTypeEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid OriginalTypeEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with OriginalTypeEnum expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public OriginalTypeEnum cloneValue(OriginalTypeEnum val){
        OriginalTypeEnum rc = val;
        return(rc);
    }

    /**
     * Writes a OriginalTypeEnum.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, OriginalTypeEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a OriginalTypeEnum.
     */
    @Override
    public OriginalTypeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(OriginalTypeEnum.get(dis.readShort()));
    }



}
