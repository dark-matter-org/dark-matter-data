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
 * The ImplAndClass class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:87)
 */
public class ImplAndClass implements Serializable {

    // The name of this implementation.
    String implName;

    // The class used to implement the required behaviour.
    String scope;

    /**
     * Default constructor.
     */
    public ImplAndClass(){
    }

    /**
     * Copy constructor.
     */
    public ImplAndClass(ImplAndClass original){
        implName = original.implName;
        scope = original.scope;
    }

    /**
     * All fields constructor.
     */
    public ImplAndClass(String f1, String f2) throws DmcValueException {
        implName = DmcTypeStringSTATIC.instance.typeCheck(f1);
        scope = DmcTypeStringSTATIC.instance.typeCheck(f2);
    }

    /**
     * String based constructor.
     */
    public ImplAndClass(String input) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        implName = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"implName",false));
        scope = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"scope",true));
    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringSTATIC.instance.serializeValue(dos, implName);
        DmcTypeStringSTATIC.instance.serializeValue(dos, scope);
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        implName = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        scope = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(implName.toString() + " " + scope.toString());
    }

    public String getImplName(){
        return(implName);
    }

    public String getScope(){
        return(scope);
    }

    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: ImplAndClass"));

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
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: ImplAndClass"));

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
