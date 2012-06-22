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
import org.dmd.dmc.types.IntegerVar;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcContainerIF;
import org.dmd.dmc.DmcValueException;

@SuppressWarnings("serial")
/**
 * The Field class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:2448)
 */
public class Field implements Serializable {

    // The type of the field
    TypeDefinitionREF type;

    // The name of the field
    String name;

    // The description of the field
    String description;

    /**
     * Default constructor.
     */
    public Field(){
    }

    /**
     * Copy constructor.
     */
    public Field(Field original){
        type = original.type;
        name = original.name;
        description = original.description;
    }

    /**
     * All fields constructor.
     */
    public Field(TypeDefinitionREF f1, String f2, String f3) throws DmcValueException {
        type = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(f1);
        name = DmcTypeStringSTATIC.instance.typeCheck(f2);
        description = DmcTypeStringSTATIC.instance.typeCheck(f3);
    }

    /**
     * String based constructor.
     */
    public Field(String input) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        type = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(getNextField(input,seppos,"type",false));
        name = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"name",false));
        description = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"description",true));
    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeTypeDefinitionREFSTATIC.instance.serializeValue(dos, type);
        DmcTypeStringSTATIC.instance.serializeValue(dos, name);
        DmcTypeStringSTATIC.instance.serializeValue(dos, description);
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        type = DmcTypeTypeDefinitionREFSTATIC.instance.deserializeValue(dis);
        name = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        description = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(type.toString() + " " + name.toString() + " " + description.toString());
    }

    public TypeDefinitionREF getType(){
        return(type);
    }

    public String getName(){
        return(name);
    }

    public String getDescription(){
        return(description);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if (!type.isResolved()){
            obj = resolver.findNamedObject(type.getObjectName());
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + type.getObjectName() + " via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)type).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)type).setObject(obj);
        }
        
    }

    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: Field"));

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
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: Field"));

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
