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
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcNamedObjectIF;
import org.dmd.dmc.DmcNamedObjectREF;
import org.dmd.dmc.DmcContainerIF;
import org.dmd.dmc.DmcValueException;

import org.dmd.dms.ClassDefinition;                                                           // Object reference
import org.dmd.dms.generated.types.ClassDefinitionREF;                                        // Object reference
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSTATIC;                           // Internally generated type
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                                       // Standard type
import org.dmd.mvw.tools.mvwgenerator.generated.enums.SelectionTypeEnum;                      // Primitive type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeSelectionTypeEnumSTATIC;         // Internally generated type

@SuppressWarnings("serial")
/**
 * The DisplayDataSpec class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:87)
 */
public class DisplayDataSpec implements Serializable {

    // The class of object to be displayed
    ClassDefinitionREF dataClass;

    // Indicates whether the data is single or multi-valued
    SelectionTypeEnum cardinality;

    // The variable name used to indicate this piece of data
    String varName;

    /**
     * Default constructor.
     */
    public DisplayDataSpec(){
    }

    /**
     * Copy constructor.
     */
    public DisplayDataSpec(DisplayDataSpec original){
        dataClass = original.dataClass;
        cardinality = original.cardinality;
        varName = original.varName;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:114)
     */
    public DisplayDataSpec(ClassDefinition f1, SelectionTypeEnum f2, String f3) throws DmcValueException {
        dataClass = DmcTypeClassDefinitionREFSTATIC.instance.typeCheck(f1);
        cardinality = DmcTypeSelectionTypeEnumSTATIC.instance.typeCheck(f2);
        varName = DmcTypeStringSTATIC.instance.typeCheck(f3);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:147)
     */
    public DisplayDataSpec(String input) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        dataClass = DmcTypeClassDefinitionREFSTATIC.instance.typeCheck(getNextField(input,seppos,"dataClass",false));
        cardinality = DmcTypeSelectionTypeEnumSTATIC.instance.typeCheck(getNextField(input,seppos,"cardinality",false));
        varName = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"varName",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:172)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeClassDefinitionREFSTATIC.instance.serializeValue(dos, dataClass);
        DmcTypeSelectionTypeEnumSTATIC.instance.serializeValue(dos, cardinality);
        DmcTypeStringSTATIC.instance.serializeValue(dos, varName);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:189)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        dataClass = DmcTypeClassDefinitionREFSTATIC.instance.deserializeValue(dis);
        cardinality = DmcTypeSelectionTypeEnumSTATIC.instance.deserializeValue(dis);
        varName = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(dataClass.toString() + " " + cardinality.toString() + " " + varName.toString());
    }

    public ClassDefinitionREF getDataClass(){
        return(dataClass);
    }

    public SelectionTypeEnum getCardinality(){
        return(cardinality);
    }

    public String getVarName(){
        return(varName);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObject(dataClass.getObjectName());
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + dataClass.getObjectName() + " via attribute: " + attrName));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)dataClass).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)dataClass).setObject(obj);
        
    }

    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: DisplayDataSpec"));

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
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: DisplayDataSpec"));

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
