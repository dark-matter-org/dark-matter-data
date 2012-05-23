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
package org.dmd.mvw.tools.mvwgenerator.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.types.IntegerVar;
import org.dmd.dmc.DmcValueException;

import org.dmd.dms.generated.types.DmcTypeStringSTATIC;         // Standard type

@SuppressWarnings("serial")
/**
 * The MenuElementTypeAndComment class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:87)
 */
public class MenuElementTypeAndComment implements Serializable {

    // The name of this implementation.
    String type;

    // The class used to implement the required behaviour.
    String comment;

    /**
     * Default constructor.
     */
    public MenuElementTypeAndComment(){
    }

    /**
     * Copy constructor.
     */
    public MenuElementTypeAndComment(MenuElementTypeAndComment original){
        type = original.type;
        comment = original.comment;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:114)
     */
    public MenuElementTypeAndComment(String f1, String f2) throws DmcValueException {
        type = DmcTypeStringSTATIC.instance.typeCheck(f1);
        comment = DmcTypeStringSTATIC.instance.typeCheck(f2);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:147)
     */
    public MenuElementTypeAndComment(String input) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        type = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"type",false));
        comment = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"comment",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:172)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringSTATIC.instance.serializeValue(dos, type);
        DmcTypeStringSTATIC.instance.serializeValue(dos, comment);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:189)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        type = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        comment = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(type.toString() + ":" + comment.toString());
    }

    public String getType(){
        return(type);
    }

    public String getComment(){
        return(comment);
    }

    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: MenuElementTypeAndComment"));

    	   if (last){
    	       rc = input.substring(start+1);
    	   }
    	   else{
    	       int pos = -1;
    	       if (start > 0)
    		       pos = input.indexOf(":", start+1);
    	       else
    		       pos = input.indexOf(":");

    	       if (pos == -1)
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: MenuElementTypeAndComment"));

    		   while(pos < (input.length()-1)){
    		       if ( input.charAt(pos+1) == ':')
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
