package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:106)
import java.io.Serializable;                                    // To prevent serialization warnings - (ComplexTypeFormatter.java:70)
import org.dmd.dmc.DmcAttributeInfo;                            // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:76)
import org.dmd.dmc.DmcInputStreamIF;                            // Standard serialization techniques - (ComplexTypeFormatter.java:71)
import org.dmd.dmc.DmcOutputStreamIF;                           // Standard serialization techniques - (ComplexTypeFormatter.java:72)
import org.dmd.dmc.DmcValueException;                           // Standard value exception - (ComplexTypeFormatter.java:99)
import org.dmd.dmc.types.IntegerVar;                            // To support getNextField() - (ComplexTypeFormatter.java:73)
import org.dmd.dms.generated.enums.DataTypeEnum;                // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:74)
import org.dmd.dms.generated.enums.ValueTypeEnum;               // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:75)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;         // Standard type - (ComplexTypeFormatter.java:494)


@SuppressWarnings("serial")
/**
 * The MenuElementTypeAndComment class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:113)
 */
public class MenuElementTypeAndComment implements Serializable {

    // The name of this implementation.
    String type;

    final static DmcAttributeInfo typeAI = new DmcAttributeInfo("type",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The class used to implement the required behaviour.
    String comment;

    final static DmcAttributeInfo commentAI = new DmcAttributeInfo("comment",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    /**
     * Default constructor.
     */
    public MenuElementTypeAndComment(){
    }

    /**
     * Copy constructor.
     */
    public MenuElementTypeAndComment(MenuElementTypeAndComment original){
        type = original.type;
        comment = original.comment;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:140)
     */
    public MenuElementTypeAndComment(String f1, String f2) throws DmcValueException {
        type = DmcTypeStringSTATIC.instance.typeCheck(f1);
        comment = DmcTypeStringSTATIC.instance.typeCheck(f2);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:180)
     */
    public MenuElementTypeAndComment(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        type = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"type",false));
        comment = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"comment",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:212)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeStringSTATIC.instance.serializeValue(dos, type);
        DmcTypeStringSTATIC.instance.serializeValue(dos, comment);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:229)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        type = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        comment = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:246)
     */
    public String toString(){
        return(type.toString() + ":" + comment.toString());
    }

    public String getType(){
        return(type);
    }

    public String getComment(){
        return(comment);
    }

    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:358)
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

}
