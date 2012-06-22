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
 * The DmcTypeFilterTypeEnum class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcType(MetaGenerator.java:2306)
 */
abstract public class DmcTypeFilterTypeEnum extends DmcAttribute<FilterTypeEnum> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeFilterTypeEnum(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeFilterTypeEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected FilterTypeEnum typeCheck(Object value) throws DmcValueException {
        FilterTypeEnum rc = null;

        if (value instanceof FilterTypeEnum){
            rc = (FilterTypeEnum)value;
        }
        else if (value instanceof String){
            rc = FilterTypeEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid FilterTypeEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = FilterTypeEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid FilterTypeEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with FilterTypeEnum expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public FilterTypeEnum cloneValue(FilterTypeEnum val){
        FilterTypeEnum rc = val;
        return(rc);
    }

    /**
     * Writes a FilterTypeEnum.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, FilterTypeEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a FilterTypeEnum.
     */
    @Override
    public FilterTypeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(FilterTypeEnum.get(dis.readShort()));
    }



}
