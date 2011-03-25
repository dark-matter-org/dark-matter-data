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
 * This is the generated DmcAttribute derivative for values of type FileModeEnum
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:272)
 */
@SuppressWarnings("serial")
public class DmcTypeFileModeEnum extends DmcAttribute<FileModeEnum> {

    public DmcTypeFileModeEnum(){
    }

    public DmcTypeFileModeEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected FileModeEnum typeCheck(Object value) throws DmcValueException {
        FileModeEnum rc = null;

        if (value instanceof FileModeEnum){
            rc = (FileModeEnum)value;
        }
        else if (value instanceof String){
            rc = FileModeEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid FileModeEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = FileModeEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid FileModeEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with FileModeEnum expected."));
        }
        return(rc);
    }

    public String getString(){
        if (sv == null){
            StringBuffer sb = new StringBuffer();
            for (FileModeEnum t : mv){
                sb.append(t + ", ");
            }
            return(sb.toString());
        }
        else
            return(sv.toString());

    }


    /**
     * Returns a clone of a value associated with this type.
     */
    public FileModeEnum cloneValue(FileModeEnum val){
        FileModeEnum rc = val;
        return(rc);
    }

    /**
     * Writes a FileModeEnum.
     */
    public void serializeValue(DmcOutputStreamIF dos, FileModeEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a FileModeEnum.
     */
    public FileModeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(FileModeEnum.get(dis.readShort()));
    }

    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeFileModeEnum getOneOfMe(){
        DmcTypeFileModeEnum rc = new DmcTypeFileModeEnum();
        return(rc);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    @Override
    public void serializeType(DmcOutputStreamIF dos) throws Exception {
    	   if (sv == null){
    		   for (FileModeEnum d : mv){
    			   dos.writeShort(d.intValue());
    		   }
    	   }
    	   else{
    		   dos.writeShort(sv.intValue());
    	   }
    }
    
    @Override
    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
        sv = FileModeEnum.get(dis.readShort());
    }
    
    @Override
    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
        if (mv == null)
            mv = new ArrayList<FileModeEnum>();
        
        mv.add(FileModeEnum.get(dis.readShort()));
    }
}
