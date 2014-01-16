package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:106)
import java.io.Serializable;                                               // To prevent serialization warnings - (ComplexTypeFormatter.java:70)
import org.dmd.dmc.DmcAttributeInfo;                                       // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:76)
import org.dmd.dmc.DmcContainerIF;                                         // To support object references - (ComplexTypeFormatter.java:82)
import org.dmd.dmc.DmcInputStreamIF;                                       // Standard serialization techniques - (ComplexTypeFormatter.java:71)
import org.dmd.dmc.DmcNameClashResolverIF;                                 // To support possible clashing object references - (ComplexTypeFormatter.java:86)
import org.dmd.dmc.DmcNameResolverIF;                                      // To support object references - (ComplexTypeFormatter.java:79)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                      // To support possible clashing object references - (ComplexTypeFormatter.java:84)
import org.dmd.dmc.DmcNamedObjectIF;                                       // To support object references - (ComplexTypeFormatter.java:80)
import org.dmd.dmc.DmcNamedObjectREF;                                      // To support object references - (ComplexTypeFormatter.java:81)
import org.dmd.dmc.DmcObject;                                              // To support possible clashing object references - (ComplexTypeFormatter.java:87)
import org.dmd.dmc.DmcOutputStreamIF;                                      // Standard serialization techniques - (ComplexTypeFormatter.java:72)
import org.dmd.dmc.DmcValueException;                                      // Standard value exception - (ComplexTypeFormatter.java:99)
import org.dmd.dmc.DmcValueExceptionSet;                                   // To support possible clashing object references - (ComplexTypeFormatter.java:88)
import org.dmd.dmc.types.IntegerVar;                                       // To support getNextField() - (ComplexTypeFormatter.java:73)
import org.dmd.dms.generated.enums.DataTypeEnum;                           // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:74)
import org.dmd.dms.generated.enums.ValueTypeEnum;                          // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:75)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                    // Standard type - (ComplexTypeFormatter.java:616)
import org.dmd.dms.generated.types.DmcTypeTypeDefinitionREFSTATIC;         // Internally generated type - (ComplexTypeFormatter.java:616)
import org.dmd.dms.generated.types.TypeDefinitionREF;                      // Object reference - (ComplexTypeFormatter.java:579)



@SuppressWarnings("serial")
/**
 * The DmtOptionalValueFieldWithColons class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:113)
 */
public class DmtOptionalValueFieldWithColons implements Serializable {

    // Some fields are optional - this many are mandatory
    static int mandatoryFields = 2;

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
    public DmtOptionalValueFieldWithColons(){
    }

    /**
     * Copy constructor.
     */
    public DmtOptionalValueFieldWithColons(DmtOptionalValueFieldWithColons original){
        type = original.type;
        name = original.name;
        description = original.description;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:140)
     */
    public DmtOptionalValueFieldWithColons(TypeDefinitionREF f1, String f2, String f3) throws DmcValueException {
        type = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(f1);
        name = DmcTypeStringSTATIC.instance.typeCheck(f2);
        description = DmcTypeStringSTATIC.instance.typeCheck(f3);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:180)
     */
    public DmtOptionalValueFieldWithColons(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        Object rc = null;
        String input = initialInput.trim();
        if ((rc = getNextField(input,seppos,"type",1,false)) != null)
            type = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(rc);
        if ((rc = getNextField(input,seppos,"name",2,false)) != null)
            name = DmcTypeStringSTATIC.instance.typeCheck(rc);
        if ((rc = getNextField(input,seppos,"description",3,true)) != null)
            description = DmcTypeStringSTATIC.instance.typeCheck(rc);
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:225)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeTypeDefinitionREFSTATIC.instance.serializeValue(dos, type);
        DmcTypeStringSTATIC.instance.serializeValue(dos, name);
        DmcTypeStringSTATIC.instance.serializeValue(dos, description);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:242)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        type = DmcTypeTypeDefinitionREFSTATIC.instance.deserializeValue(dis);
        name = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        description = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:259)
     */
    public String toString(){
        return(type.toString() + ":" + name.toString() + ":" + description.toString());
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
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:291)
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObject(type.getObjectName());
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + type.getObjectName() + " via attribute: " + attrName));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)type).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)type).setObject(obj);
        
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:313)
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        obj = resolver.findNamedObjectMayClash(object, type.getObjectName(), ncr, typeAI);
        if (obj == null)
            throw(new DmcValueException("Could not resolve reference to: " + type.getObjectName() + " via attribute: " + ai.name));
        
        if (obj instanceof DmcContainerIF)
            ((DmcNamedObjectREF)type).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
        else
            ((DmcNamedObjectREF)type).setObject(obj);
        
    }

    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:419)
    String getNextField(String input, IntegerVar seppos, String fn, int fnum, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();
   	   
    	   if (last){
            if ( (start+1) >= input.length())
                rc = null;
            else
                rc = input.substring(start+1);
 	   }
	       else{
    	       if ( (start+1) >= input.length()){
                if (fnum > mandatoryFields)
                    return(null);
                throw (new DmcValueException("Missing value for field: " + fn + " in complex type: DmtOptionalValueFieldWithColons"));
            }
   		   
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
	       
    	       if (pos == -1){
                rc = input.substring(start+1);
                seppos.set(input.length());
                return(rc);
            }
		       
	           rc = input.substring(start, pos).trim();
	       
	           seppos.set(pos);
        }
    
        return(rc);
    }

}
