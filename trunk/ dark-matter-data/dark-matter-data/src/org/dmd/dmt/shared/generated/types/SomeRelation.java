package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:112)
import java.io.Serializable;                                        // Serialization support
import org.dmd.dmc.DmcInputStreamIF;                                // Serialization support
import org.dmd.dmc.DmcOutputStreamIF;                               // Serialization support
import org.dmd.dmc.DmcValueException;                               // Value exceptions
import org.dmd.dmc.types.IntegerVar;                                // Parsing support
import org.dmd.dmc.types.StringName;                                // Name type
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;            // Standard type
import org.dmd.dms.generated.types.DmcTypeStringNameSTATIC;         // Static type for name
import org.dmd.dms.generated.types.DmcTypeStringNameSV;             // Name type


@SuppressWarnings("serial")
/**
 * The SomeRelation class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:119)
 */
public class SomeRelation extends ObjWithRefsREF implements Serializable {

    // Some kind of counter.
    Integer count;

    // The order in which something is done.
    Integer order;

    /**
     * Default constructor.
     */
    public SomeRelation(){
    }

    /**
     * Copy constructor.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:134)
     */
    public SomeRelation(SomeRelation original){
        myName = original.myName;
        object = original.object;
        count = original.count;
        order = original.order;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:151)
     */
    public SomeRelation(StringName n, Integer f1, Integer f2) throws DmcValueException {
        super(n);
        count = DmcTypeIntegerSTATIC.instance.typeCheck(f1);
        order = DmcTypeIntegerSTATIC.instance.typeCheck(f2);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:185)
     */
    public SomeRelation(String input) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        StringName n = DmcTypeStringNameSTATIC.instance.typeCheck(getNextField(input,seppos,"object name",false));
        myName = new DmcTypeStringNameSV(__name);
        myName.set(n);

        count = DmcTypeIntegerSTATIC.instance.typeCheck(getNextField(input,seppos,"count",false));
        order = DmcTypeIntegerSTATIC.instance.typeCheck(getNextField(input,seppos,"order",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:219)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringNameSTATIC.instance.serializeValue(dos, myName.getSV());
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, count);
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, order);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:237)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        StringName n = DmcTypeStringNameSTATIC.instance.deserializeValue(dis);
        myName = new DmcTypeStringNameSV(__name);
        myName.set(n);

        count = DmcTypeIntegerSTATIC.instance.deserializeValue(dis);
        order = DmcTypeIntegerSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     */
    public String toString(){
        return(myName.getSV().getNameString() + ":" + count.toString() + ":" + order.toString());
    }

    public Integer getCount(){
        return(count);
    }

    public Integer getOrder(){
        return(order);
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

}
