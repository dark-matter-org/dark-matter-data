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

import org.dmd.dms.generated.enums.GPBFieldTypeEnum;
@SuppressWarnings("serial")
/**
 * The GPBField class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3079)
 */
public class GPBField implements Serializable {

    // The type of GPB field
    GPBFieldTypeEnum fieldType;

    // The attribute to be stored in this field. The attribute type must specify the gpbFieldType .
    AttributeDefinitionREF attribute;

    // Unique field ID excluding values 19000 to 19999 which are reserved.
    Integer fieldTag;

    /**
     * Default constructor.
     */
    public GPBField(){
    }

    /**
     * Copy constructor.
     */
    public GPBField(GPBField original){
        fieldType = original.fieldType;
        attribute = original.attribute;
        fieldTag = original.fieldTag;
    }

    /**
     * All fields constructor.
     */
    public GPBField(GPBFieldTypeEnum f1, AttributeDefinitionREF f2, Integer f3) throws DmcValueException {
        fieldType = DmcTypeGPBFieldTypeEnumSTATIC.instance.typeCheck(f1);
        attribute = DmcTypeAttributeDefinitionREFSTATIC.instance.typeCheck(f2);
        fieldTag = DmcTypeIntegerSTATIC.instance.typeCheck(f3);
    }

    /**
     * String based constructor.
     */
    public GPBField(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        input = input.replaceAll("(\\s)+", " ");
        fieldType = DmcTypeGPBFieldTypeEnumSTATIC.instance.typeCheck(getNextField(input,seppos,"fieldType",false));
        attribute = DmcTypeAttributeDefinitionREFSTATIC.instance.typeCheck(getNextField(input,seppos,"attribute",false));
        fieldTag = DmcTypeIntegerSTATIC.instance.typeCheck(getNextField(input,seppos,"fieldTag",true));
    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeGPBFieldTypeEnumSTATIC.instance.serializeValue(dos, fieldType);
        DmcTypeAttributeDefinitionREFSTATIC.instance.serializeValue(dos, attribute);
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, fieldTag);
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        fieldType = DmcTypeGPBFieldTypeEnumSTATIC.instance.deserializeValue(dis);
        attribute = DmcTypeAttributeDefinitionREFSTATIC.instance.deserializeValue(dis);
        fieldTag = DmcTypeIntegerSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(fieldType.toString() + " " + attribute.toString() + " " + fieldTag.toString());
    }

    public GPBFieldTypeEnum getFieldType(){
        return(fieldType);
    }

    public AttributeDefinitionREF getAttribute(){
        return(attribute);
    }

    public Integer getFieldTag(){
        return(fieldTag);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if (!attribute.isResolved()){
            obj = resolver.findNamedObject(attribute.getObjectName());
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + attribute.getObjectName() + " via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)attribute).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)attribute).setObject(obj);
        }
        
    }

    // org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3229)
    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: GPBField"));

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
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: GPBField"));

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
