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

import org.dmd.dms.generated.types.DmcTypeStringSTATIC;

@SuppressWarnings("serial")
/**
 * The CompactEventUserData class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from:  org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:86)
 */
public class CompactEventUserData implements Serializable {

    // The name of the event.
    String name;

    // The data to be included with the event e.g. String, ArrayList<Integer>.
    String userData;

    // If the userData is not a Java primitive type, this will be the fully qualified class name of the data.
    String userDataImport;

    /**
     * Default constructor.
     */
    public CompactEventUserData(){
    }

    /**
     * Copy constructor.
     */
    public CompactEventUserData(CompactEventUserData original){
        name = original.name;
        userData = original.userData;
        userDataImport = original.userDataImport;
    }

    /**
     * All fields constructor.
     */
    public CompactEventUserData(String f1, String f2, String f3) throws DmcValueException {
        name = DmcTypeStringSTATIC.instance.typeCheck(f1);
        userData = DmcTypeStringSTATIC.instance.typeCheck(f2);
        userDataImport = DmcTypeStringSTATIC.instance.typeCheck(f3);
    }

    /**
     * String based constructor.
     */
    public CompactEventUserData(String input) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        name = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"name",false));
        userData = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"userData",false));
        userDataImport = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"userDataImport",true));
    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringSTATIC.instance.serializeValue(dos, name);
        DmcTypeStringSTATIC.instance.serializeValue(dos, userData);
        DmcTypeStringSTATIC.instance.serializeValue(dos, userDataImport);
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        name = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        userData = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        userDataImport = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(name.toString() + " " + userData.toString() + " " + userDataImport.toString());
    }

    public String getName(){
        return(name);
    }

    public String getUserData(){
        return(userData);
    }

    public String getUserDataImport(){
        return(userDataImport);
    }

    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: CompactEventUserData"));

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
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: CompactEventUserData"));

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
