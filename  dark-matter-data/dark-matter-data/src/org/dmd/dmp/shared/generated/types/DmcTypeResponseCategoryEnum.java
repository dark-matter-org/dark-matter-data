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

import java.util.ArrayList;
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
 * Generated from:  org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:229)
 */
@SuppressWarnings("serial")
public class DmcTypeResponseCategoryEnum extends DmcAttribute<ResponseCategoryEnum> {

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

    public String getString(){
        if (sv == null){
            StringBuffer sb = new StringBuffer();
            for (ResponseCategoryEnum t : mv){
                sb.append(t + ", ");
            }
            return(sb.toString());
        }
        else
            return(sv.toString());

    }


    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeResponseCategoryEnum getOneOfMe(){
        DmcTypeResponseCategoryEnum rc = new DmcTypeResponseCategoryEnum();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public ResponseCategoryEnum cloneValue(ResponseCategoryEnum val){
        ResponseCategoryEnum rc = val;
        return(rc);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    @Override
    public void serializeType(DmcOutputStreamIF dos) throws Exception {
    	   if (sv == null){
    		   for (ResponseCategoryEnum d : mv){
    			   dos.writeShort(d.intValue());
    		   }
    	   }
    	   else{
    		   dos.writeShort(sv.intValue());
    	   }
    }
    
    @Override
    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
        sv = ResponseCategoryEnum.get(dis.readShort());
    }
    
    @Override
    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
        if (mv == null)
            mv = new ArrayList<ResponseCategoryEnum>();
        
        mv.add(ResponseCategoryEnum.get(dis.readShort()));
    }
}
