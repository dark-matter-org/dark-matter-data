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
 * This is the generated DmcAttribute derivative for values of type ResponseCategoryEnum
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:227)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeResponseCategoryEnum extends DmcAttribute<ResponseCategoryEnum> implements Serializable {

    public DmcTypeResponseCategoryEnum(){
    }

    public DmcTypeResponseCategoryEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected ResponseCategoryEnum typeCheck(Object value) throws DmcValueException {
        ResponseCategoryEnum rc = null;

        if (value instanceof ResponseCategoryEnum){
            rc = (ResponseCategoryEnum)value;
        }
        else if (value instanceof String){
            rc = ResponseCategoryEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid ResponseCategoryEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = ResponseCategoryEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid ResponseCategoryEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ResponseCategoryEnum expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public ResponseCategoryEnum cloneValue(ResponseCategoryEnum val){
        return(val);
    }

    /**
     * Writes a ResponseCategoryEnum.
     */
    public void serializeValue(DmcOutputStreamIF dos, ResponseCategoryEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a ResponseCategoryEnum.
     */
    public ResponseCategoryEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(ResponseCategoryEnum.get(dis.readShort()));
    }

}
