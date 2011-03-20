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
package org.dmd.dms.generated.types;

import java.util.ArrayList;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.*;

@SuppressWarnings("serial")
/**
 * The DmcTypeClassTypeEnum class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDmcType(MetaGenerator.java:2083)
 */
public class DmcTypeClassTypeEnum extends DmcAttribute<ClassTypeEnum>{

    /**
     * Default constructor.
     */
    public DmcTypeClassTypeEnum(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeClassTypeEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected ClassTypeEnum typeCheck(Object value) throws DmcValueException {
        ClassTypeEnum rc = null;

        if (value instanceof ClassTypeEnum){
            rc = (ClassTypeEnum)value;
        }
        else if (value instanceof String){
            rc = ClassTypeEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid ClassTypeEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = ClassTypeEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid ClassTypeEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with ClassTypeEnum expected."));
        }
        return(rc);
    }

    public String getString(){
        if (sv == null){
    	       StringBuffer sb = new StringBuffer();
    	       for (ClassTypeEnum t : mv){
    		       sb.append(t + ", ");
    	       }
    	       return(sb.toString());
        }
        else{
    	       return(sv.toString());
        }
    }
    /**
     * Returns an empty attribute of this same type. This is used in conjunction with the DmcTypeModifier.
     */
    public DmcTypeClassTypeEnum getOneOfMe(){
        DmcTypeClassTypeEnum rc = new DmcTypeClassTypeEnum();
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public ClassTypeEnum cloneValue(ClassTypeEnum val){
        ClassTypeEnum rc = val;
        return(rc);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // Serialization
    
    @Override
    public void serializeType(DmcOutputStreamIF dos) throws Exception {
    	   if (sv == null){
    		   for (ClassTypeEnum d : mv){
    			   dos.writeShort(d.intValue());
    		   }
    	   }
    	   else{
    		   dos.writeShort(sv.intValue());
    	   }
    }
    
    @Override
    public void deserializeSV(DmcInputStreamIF dis) throws Exception {
        sv = ClassTypeEnum.get(dis.readShort());
    }
    
    @Override
    public void deserializeMV(DmcInputStreamIF dis) throws Exception {
        if (mv == null)
            mv = new ArrayList<ClassTypeEnum>();
        
        mv.add(ClassTypeEnum.get(dis.readShort()));
    }


}
