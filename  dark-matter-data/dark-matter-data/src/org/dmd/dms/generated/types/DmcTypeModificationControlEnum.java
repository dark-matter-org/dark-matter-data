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
 * The DmcTypeModificationControlEnum class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDmcType(MetaGenerator.java:1921)
 */
abstract public class DmcTypeModificationControlEnum extends DmcAttribute<ModificationControlEnum> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeModificationControlEnum(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeModificationControlEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected ModificationControlEnum typeCheck(Object value) throws DmcValueException {
        ModificationControlEnum rc = null;

        if (value instanceof ModificationControlEnum){
            rc = (ModificationControlEnum)value;
        }
        else if (value instanceof String){
            rc = ModificationControlEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid ModificationControlEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = ModificationControlEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid ModificationControlEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ModificationControlEnum expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public ModificationControlEnum cloneValue(ModificationControlEnum val){
        ModificationControlEnum rc = val;
        return(rc);
    }

    /**
     * Writes a ModificationControlEnum.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, ModificationControlEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a ModificationControlEnum.
     */
    @Override
    public ModificationControlEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(ModificationControlEnum.get(dis.readShort()));
    }



}
