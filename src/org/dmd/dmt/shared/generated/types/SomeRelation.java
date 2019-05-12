//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:114)
import java.io.Serializable;                                            // Serialization support - (ExtendedReferenceTypeFormatter.java:89)
import org.dmd.dmc.DmcExtendedReferenceIF;                              // Marker interface for extended references - (ExtendedReferenceTypeFormatter.java:82)
import org.dmd.dmc.DmcInputStreamIF;                                    // Serialization support - (ExtendedReferenceTypeFormatter.java:90)
import org.dmd.dmc.DmcOutputStreamIF;                                   // Serialization support - (ExtendedReferenceTypeFormatter.java:91)
import org.dmd.dmc.DmcValueException;                                   // Value exceptions - (ExtendedReferenceTypeFormatter.java:108)
import org.dmd.dmc.types.DefinitionName;                                // Name type - (ExtendedReferenceTypeFormatter.java:76)
import org.dmd.dmc.types.IntegerVar;                                    // Parsing support - (ExtendedReferenceTypeFormatter.java:92)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSTATIC;         // Static type for name - (ExtendedReferenceTypeFormatter.java:78)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;             // Name type - (ExtendedReferenceTypeFormatter.java:75)
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;                // Standard type - (ExtendedReferenceTypeFormatter.java:635)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                 // Object based constructor - (ExtendedReferenceTypeFormatter.java:80)



@SuppressWarnings("serial")
/**
 * The SomeRelation class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:121)
 */
public class SomeRelation extends ObjWithRefsREF implements Serializable, DmcExtendedReferenceIF {

    // Some kind of counter.
    Integer _count;

    // The order in which something is done.
    Integer _order;

    /**
     * Default constructor.
     */
    public SomeRelation(){
    }

    /**
     * Copy constructor.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:139)
     */
    public SomeRelation(SomeRelation original){
        myName = original.myName;
        object = original.object;
        _count = original._count;
        _order = original._order;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:159)
     */
    public SomeRelation(DefinitionName name, Integer count, Integer order) {
        setName(name);
        _count = count;
        _order = order;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:200)
     */
    public SomeRelation(ObjWithRefsDMO obj, Integer count, Integer order) {
        super(obj);
        _count = count;
        _order = order;
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:241)
     */
    public SomeRelation(String input) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        DefinitionName n = DmcTypeDefinitionNameSTATIC.instance.typeCheck(getNextField(input,seppos,"object name",false));
        myName = new DmcTypeDefinitionNameSV(__name);
        myName.set(n);

        _count = DmcTypeIntegerSTATIC.instance.typeCheck(getNextField(input,seppos,"count",false));
        _order = DmcTypeIntegerSTATIC.instance.typeCheck(getNextField(input,seppos,"order",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:277)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeDefinitionNameSTATIC.instance.serializeValue(dos, myName.getSV());
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, _count);
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, _order);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:295)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        DefinitionName n = DmcTypeDefinitionNameSTATIC.instance.deserializeValue(dis);
        myName = new DmcTypeDefinitionNameSV(__name);
        myName.set(n);

        _count = DmcTypeIntegerSTATIC.instance.deserializeValue(dis);
        _order = DmcTypeIntegerSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(myName.getSV().getNameString() + ":" + _count.toString() + ":" + _order.toString());
    }

    public void setName(DefinitionName name){
        try{
            super.setName(name);
            object = null;
        } catch (DmcValueException e) {
            throw new IllegalStateException("Setting name with a specific type shouldn't throw an exception.",e);
        }

    }

    public void setObject(ObjWithRefsDMO obj){
        super.setObject(obj);
    }

    public Integer getCount(){
        return(_count);
    }

    public void setCount(Integer count){
        _count = count;
    }

    public Integer getOrder(){
        return(_order);
    }

    public void setOrder(Integer order){
        _order = order;
    }

    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length())
    		   throw (new DmcValueException("Missing value for field: " + fn + " in complex type: SomeRelation"));

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
    		       throw (new DmcValueException("Missing value for field: " + fn + " in complex type: SomeRelation"));

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

    @Override
    public boolean equals(Object obj){
        boolean rc = false;

        if (obj instanceof SomeRelation){
            SomeRelation other = (SomeRelation)obj;
            rc = myName.equals(other.myName);

            if(rc)
                rc = _count.equals(other._count);
            if(rc)
                rc = _order.equals(other._order);
        }

        return(rc);
    }

}
