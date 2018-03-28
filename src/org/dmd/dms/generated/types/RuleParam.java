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
// Called from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3221)
import java.io.Serializable;                              // Marker interface for serialization - (MetaGenerator.java:3198)
import org.dmd.dmc.DmcAttributeInfo;                      // For fake DmcAttributeInfo - (MetaGenerator.java:3204)
import org.dmd.dmc.DmcInputStreamIF;                      // To support serialization - (MetaGenerator.java:3199)
import org.dmd.dmc.DmcOutputStreamIF;                     // To support serialization - (MetaGenerator.java:3200)
import org.dmd.dmc.DmcValueException;                     // For type checking - (MetaGenerator.java:3217)
import org.dmd.dmc.types.IntegerVar;                      // For getNextField() - (MetaGenerator.java:3201)
import org.dmd.dms.generated.enums.DataTypeEnum;          // For fake DmcAttributeInfo - (MetaGenerator.java:3202)
import org.dmd.dms.generated.enums.ValueTypeEnum;         // For fake DmcAttributeInfo - (MetaGenerator.java:3203)



@SuppressWarnings("serial")
/**
 * The RuleParam class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpComplexType(MetaGenerator.java:3228)
 */
public class RuleParam implements Serializable {

    // The import for the type of parameter
    String importStatement;
    final static DmcAttributeInfo importStatementAI = new DmcAttributeInfo("importStatement",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The generic arguments associated with this parameter
    String genericArgs;
    final static DmcAttributeInfo genericArgsAI = new DmcAttributeInfo("genericArgs",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The name of the parameter
    String name;
    final static DmcAttributeInfo nameAI = new DmcAttributeInfo("name",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // A description of the parameter
    String description;
    final static DmcAttributeInfo descriptionAI = new DmcAttributeInfo("description",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public RuleParam(){
    }

    /**
     * Copy constructor.
     */
    public RuleParam(RuleParam original){
        importStatement = original.importStatement;
        genericArgs = original.genericArgs;
        name = original.name;
        description = original.description;
    }

    /**
     * All fields constructor.
     */
    public RuleParam(String f1, String f2, String f3, String f4) throws DmcValueException {
        importStatement = DmcTypeStringSTATIC.instance.typeCheck(f1);
        genericArgs = DmcTypeStringSTATIC.instance.typeCheck(f2);
        name = DmcTypeStringSTATIC.instance.typeCheck(f3);
        description = DmcTypeStringSTATIC.instance.typeCheck(f4);
    }

    /**
     * String based constructor.
     */
    public RuleParam(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        importStatement = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"importStatement",false));
        genericArgs = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"genericArgs",false));
        name = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"name",false));
        description = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"description",true));
    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringSTATIC.instance.serializeValue(dos, importStatement);
        DmcTypeStringSTATIC.instance.serializeValue(dos, genericArgs);
        DmcTypeStringSTATIC.instance.serializeValue(dos, name);
        DmcTypeStringSTATIC.instance.serializeValue(dos, description);
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        importStatement = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        genericArgs = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        name = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        description = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(importStatement.toString() + ":" + genericArgs.toString() + ":" + name.toString() + ":" + description.toString());
    }

    public String getImportStatement(){
        return(importStatement);
    }

    public String getGenericArgs(){
        return(genericArgs);
    }

    public String getName(){
        return(name);
    }

    public String getDescription(){
        return(description);
    }

    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();
   	   
    	   if (last){
            if ( (start+1) >= input.length())
                rc = "";
            else
                rc = input.substring(start+1);
        }
	       else{
    	       if ( (start+1) >= input.length())
        		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: RuleParam"));
   		   
        	   int pos = -1;
	           if (start > -1){
	        	   start = start + 1;
	    	       pos = input.indexOf(":", start);
	           }
	           else{
	        	   start = 0;
	    	       pos = input.indexOf(":");
	           }
	       
	           if (pos == start){
	        	   seppos.set(pos);
	        	   return("");
	           }
	       
	           if (pos == -1)
		           throw (new DmcValueException("Missing value for field: " + fn + " in complex type: RuleParam"));
		       
	           rc = input.substring(start, pos).trim();
	       
	           seppos.set(pos);
        }
    
        return(rc);
    }

    public void toJSON(StringBuffer sb, int padding, String indent) {
        throw(new IllegalStateException("This needs to be implemented"));
    }

}
