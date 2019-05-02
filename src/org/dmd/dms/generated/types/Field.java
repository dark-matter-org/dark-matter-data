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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3220)
import java.io.Serializable;                                  // Marker interface for serialization - (MetaGenerator.java:3197)
import org.dmd.dmc.DmcAttributeInfo;                          // For fake DmcAttributeInfo - (MetaGenerator.java:3203)
import org.dmd.dmc.DmcContainerIF;                            // Reference resolution - (MetaGenerator.java:3211)
import org.dmd.dmc.DmcInputStreamIF;                          // To support serialization - (MetaGenerator.java:3198)
import org.dmd.dmc.DmcNameClashResolverIF;                    // Ambiguous reference resolution - (MetaGenerator.java:3207)
import org.dmd.dmc.DmcNameResolverIF;                         // Reference resolution - (MetaGenerator.java:3208)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;         // Ambiguous reference resolution - (MetaGenerator.java:3206)
import org.dmd.dmc.DmcNamedObjectIF;                          // Reference resolution - (MetaGenerator.java:3209)
import org.dmd.dmc.DmcNamedObjectREF;                         // Reference resolution - (MetaGenerator.java:3210)
import org.dmd.dmc.DmcObject;                                 // Ambiguous reference resolution - (MetaGenerator.java:3212)
import org.dmd.dmc.DmcOutputStreamIF;                         // To support serialization - (MetaGenerator.java:3199)
import org.dmd.dmc.DmcValueException;                         // For type checking - (MetaGenerator.java:3216)
import org.dmd.dmc.DmcValueExceptionSet;                      // Ambiguous reference resolution - (MetaGenerator.java:3213)
import org.dmd.dmc.types.IntegerVar;                          // For getNextField() - (MetaGenerator.java:3200)
import org.dmd.dms.generated.enums.DataTypeEnum;              // For fake DmcAttributeInfo - (MetaGenerator.java:3201)
import org.dmd.dms.generated.enums.ValueTypeEnum;             // For fake DmcAttributeInfo - (MetaGenerator.java:3202)



@SuppressWarnings("serial")
/**
 * The Field class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3227)
 */
public class Field implements Serializable {

    // The type of the field
    TypeDefinitionREF type;
    final static DmcAttributeInfo typeAI = new DmcAttributeInfo("type",0,"TypeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The name of the field
    String name;
    final static DmcAttributeInfo nameAI = new DmcAttributeInfo("name",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The description of the field
    String description;
    final static DmcAttributeInfo descriptionAI = new DmcAttributeInfo("description",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

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
    public Field(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        input = input.replaceAll("(\\s)+", " ");
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

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if (!type.isResolved()){
            obj = resolver.findNamedObjectMayClash(object, type.getObjectName(), ncr, typeAI);
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + type.getObjectName() + " via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)type).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)type).setObject(obj);
        }
        
    }

    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3402)
    public void removeBackRefsFromValue(){
        if (type != null){
            type.removeBackref();
        }
        
    }

    // org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3420)
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

    public void toJSON(StringBuffer sb, int padding, String indent) {
        throw(new IllegalStateException("This needs to be implemented"));
    }

}
