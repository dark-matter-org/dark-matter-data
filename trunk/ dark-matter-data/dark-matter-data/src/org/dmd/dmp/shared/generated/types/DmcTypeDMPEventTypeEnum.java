//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmp.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.shared.generated.enums.*;

/**
 * This is the generated DmcAttribute derivative for values of type DMPEventTypeEnum
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:226)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDMPEventTypeEnum extends DmcAttribute<DMPEventTypeEnum> implements Serializable {

    public DmcTypeDMPEventTypeEnum(){
    }

    public DmcTypeDMPEventTypeEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected DMPEventTypeEnum typeCheck(Object value) throws DmcValueException {
        DMPEventTypeEnum rc = null;

        if (value instanceof DMPEventTypeEnum){
            rc = (DMPEventTypeEnum)value;
        }
        else if (value instanceof String){
            rc = DMPEventTypeEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid DMPEventTypeEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = DMPEventTypeEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid DMPEventTypeEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DMPEventTypeEnum expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public DMPEventTypeEnum cloneValue(DMPEventTypeEnum val){
        return(val);
    }

    /**
     * Writes a DMPEventTypeEnum.
     */
    public void serializeValue(DmcOutputStreamIF dos, DMPEventTypeEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a DMPEventTypeEnum.
     */
    public DMPEventTypeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(DMPEventTypeEnum.get(dis.readShort()));
    }

}
