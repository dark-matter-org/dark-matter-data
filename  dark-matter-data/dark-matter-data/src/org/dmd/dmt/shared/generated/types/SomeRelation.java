package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:113)
import java.io.Serializable;                                        // Serialization support - (ExtendedReferenceTypeFormatter.java:88)
import org.dmd.dmc.DmcExtendedReferenceIF;                          // Marker interface for extended references - (ExtendedReferenceTypeFormatter.java:81)
import org.dmd.dmc.DmcInputStreamIF;                                // Serialization support - (ExtendedReferenceTypeFormatter.java:89)
import org.dmd.dmc.DmcOutputStreamIF;                               // Serialization support - (ExtendedReferenceTypeFormatter.java:90)
import org.dmd.dmc.DmcValueException;                               // Value exceptions - (ExtendedReferenceTypeFormatter.java:107)
import org.dmd.dmc.types.IntegerVar;                                // Parsing support - (ExtendedReferenceTypeFormatter.java:91)
import org.dmd.dmc.types.StringName;                                // Name type - (ExtendedReferenceTypeFormatter.java:75)
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;            // Standard type - (ExtendedReferenceTypeFormatter.java:609)
import org.dmd.dms.generated.types.DmcTypeStringNameSTATIC;         // Static type for name - (ExtendedReferenceTypeFormatter.java:77)
import org.dmd.dms.generated.types.DmcTypeStringNameSV;             // Name type - (ExtendedReferenceTypeFormatter.java:74)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;             // Object based constructor - (ExtendedReferenceTypeFormatter.java:79)


@SuppressWarnings("serial")
/**
 * The SomeRelation class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:120)
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
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:138)
     */
    public SomeRelation(SomeRelation original){
        myName = original.myName;
        object = original.object;
        _count = original._count;
        _order = original._order;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:158)
     */
    public SomeRelation(StringName name, Integer count, Integer order) {
        setName(name);
        _count = count;
        _order = order;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:199)
     */
    public SomeRelation(ObjWithRefsDMO obj, Integer count, Integer order) {
        super(obj);
        _count = count;
        _order = order;
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:240)
     */
    public SomeRelation(String input) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        StringName n = DmcTypeStringNameSTATIC.instance.typeCheck(getNextField(input,seppos,"object name",false));
        myName = new DmcTypeStringNameSV(__name);
        myName.set(n);

        _count = DmcTypeIntegerSTATIC.instance.typeCheck(getNextField(input,seppos,"count",false));
        _order = DmcTypeIntegerSTATIC.instance.typeCheck(getNextField(input,seppos,"order",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:276)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringNameSTATIC.instance.serializeValue(dos, myName.getSV());
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, _count);
        DmcTypeIntegerSTATIC.instance.serializeValue(dos, _order);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ExtendedReferenceTypeFormatter.dumpExtendedReferenceType(ExtendedReferenceTypeFormatter.java:294)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        StringName n = DmcTypeStringNameSTATIC.instance.deserializeValue(dis);
        myName = new DmcTypeStringNameSV(__name);
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

    public void setName(StringName name){
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

}
