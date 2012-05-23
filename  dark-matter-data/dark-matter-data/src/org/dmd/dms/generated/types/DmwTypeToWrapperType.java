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
import org.dmd.dmc.types.IntegerVar;
import org.dmd.dmc.DmcValueException;

import org.dmd.dms.generated.enums.WrapperTypeEnum;
@SuppressWarnings("serial")
/**
 * The DmwTypeToWrapperType class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:2242)
 */
public class DmwTypeToWrapperType implements Serializable {

    // The Dark Matter Wrapper type
    String dmwType;

    // The type of wrapper to be used in this context
    WrapperTypeEnum wrapperType;

    /**
     * Default constructor.
     */
    public DmwTypeToWrapperType(){
    }

    /**
     * Copy constructor.
     */
    public DmwTypeToWrapperType(DmwTypeToWrapperType original){
        dmwType = original.dmwType;
        wrapperType = original.wrapperType;
    }

    /**
     * All fields constructor.
     */
    public DmwTypeToWrapperType(String f1, WrapperTypeEnum f2) throws DmcValueException {
        dmwType = DmcTypeStringSTATIC.instance.typeCheck(f1);
        wrapperType = DmcTypeWrapperTypeEnumSTATIC.instance.typeCheck(f2);
    }

    /**
     * String based constructor.
     */
    public DmwTypeToWrapperType(String input) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        dmwType = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"dmwType",false));
        wrapperType = DmcTypeWrapperTypeEnumSTATIC.instance.typeCheck(getNextField(input,seppos,"wrapperType",true));
    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringSTATIC.instance.serializeValue(dos, dmwType);
        DmcTypeWrapperTypeEnumSTATIC.instance.serializeValue(dos, wrapperType);
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        dmwType = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        wrapperType = DmcTypeWrapperTypeEnumSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(dmwType.toString() + " " + wrapperType.toString());
    }

    public String getDmwType(){
        return(dmwType);
    }

    public WrapperTypeEnum getWrapperType(){
        return(wrapperType);
    }

    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: DmwTypeToWrapperType"));

    	   if (last){
    	       rc = input.substring(start+1);
    	   }
    	   else{
    	       int pos = -1;
    	       if (start > 0)
    		       pos = input.indexOf(" ", start+1);
    	       else
    		       pos = input.indexOf(" ");

    	       if (pos == -1)
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: DmwTypeToWrapperType"));

    		   while(pos < (input.length()-1)){
    		       if ( input.charAt(pos+1) == ' ')
    		           pos++;
    		       else
    		           break;
    		   }

    	       rc = input.substring(start+1, pos).trim();

    	       seppos.set(pos);
        }

        return(rc);
    }

}
