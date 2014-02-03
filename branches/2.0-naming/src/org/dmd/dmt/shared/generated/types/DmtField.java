package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:100)
import java.io.Serializable;                                               // To prevent serialization warnings - (ComplexTypeFormatter.java:75)
import org.dmd.dmc.DmcAttributeInfo;                                       // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:81)
import org.dmd.dmc.DmcContainerIF;                                         // To support object references - (ComplexTypeFormatter.java:87)
import org.dmd.dmc.DmcInputStreamIF;                                       // Standard serialization techniques - (ComplexTypeFormatter.java:76)
import org.dmd.dmc.DmcNameClashResolverIF;                                 // To support possible clashing object references - (ComplexTypeFormatter.java:91)
import org.dmd.dmc.DmcNameResolverIF;                                      // To support object references - (ComplexTypeFormatter.java:84)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                      // To support possible clashing object references - (ComplexTypeFormatter.java:89)
import org.dmd.dmc.DmcNamedObjectIF;                                       // To support object references - (ComplexTypeFormatter.java:85)
import org.dmd.dmc.DmcNamedObjectREF;                                      // To support object references - (ComplexTypeFormatter.java:86)
import org.dmd.dmc.DmcObject;                                              // To support possible clashing object references - (ComplexTypeFormatter.java:92)
import org.dmd.dmc.DmcOutputStreamIF;                                      // Standard serialization techniques - (ComplexTypeFormatter.java:77)
import org.dmd.dmc.DmcValueException;                                      // Standard value exception - (ComplexTypeFormatter.java:96)
import org.dmd.dmc.DmcValueExceptionSet;                                   // To support possible clashing object references - (ComplexTypeFormatter.java:93)
import org.dmd.dmc.types.IntegerVar;                                       // To support getNextField() - (ComplexTypeFormatter.java:78)
import org.dmd.dms.generated.enums.DataTypeEnum;                           // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:79)
import org.dmd.dms.generated.enums.ValueTypeEnum;                          // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:80)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                    // Standard type - (ComplexTypeFormatter.java:581)
import org.dmd.dms.generated.types.DmcTypeTypeDefinitionREFSTATIC;         // Internally generated type - (ComplexTypeFormatter.java:581)
import org.dmd.dms.generated.types.TypeDefinitionREF;                      // Object reference - (ComplexTypeFormatter.java:556)



@SuppressWarnings("serial")
/**
 * The DmtField class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:107)
 */
public class DmtField implements Serializable {

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
    public DmtField(){
    }

    /**
     * Copy constructor.
     */
    public DmtField(DmtField original){
        type = original.type;
        name = original.name;
        description = original.description;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:134)
     */
    public DmtField(TypeDefinitionREF f1, String f2, String f3) throws DmcValueException {
        type = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(f1);
        name = DmcTypeStringSTATIC.instance.typeCheck(f2);
        description = DmcTypeStringSTATIC.instance.typeCheck(f3);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:175)
     */
    public DmtField(String initialInput) throws DmcValueException {
        IntegerVar seppos = new IntegerVar(-1);
        String input = initialInput.trim();
        input = input.replaceAll("(\\s)+", " ");
        type = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(getNextField(input,seppos,"type",false));
        name = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"name",false));
        description = DmcTypeStringSTATIC.instance.typeCheck(getNextField(input,seppos,"description",true));
    }

    /**
     * Serialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:219)
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        DmcTypeTypeDefinitionREFSTATIC.instance.serializeValue(dos, type);
        DmcTypeStringSTATIC.instance.serializeValue(dos, name);
        DmcTypeStringSTATIC.instance.serializeValue(dos, description);
    }

    /**
     * Deserialization.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:236)
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        type = DmcTypeTypeDefinitionREFSTATIC.instance.deserializeValue(dis);
        name = DmcTypeStringSTATIC.instance.deserializeValue(dis);
        description = DmcTypeStringSTATIC.instance.deserializeValue(dis);
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:253)
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
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:285)
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
    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:307)
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

    // org.dmd.dms.util.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:328)
    String getNextField(String input, IntegerVar seppos, String fn, boolean last) throws DmcValueException {
    	   String rc = null;
    	   int start = seppos.intValue();

    	   if ( (start+1) >= input.length()){
            throw (new DmcValueException("Missing value for field: " + fn + " in complex type: DmtField"));
        }

    	   if (last){
    	       rc = input.substring(start+1);
    	   }
    	   else{
    	       int pos = -1;
    	       if (start > 0)
    		       pos = input.indexOf(" ", start+1);
    	       else
    		       pos = input.indexOf(" ");

    	       if (pos == -1){
    		       rc = input.substring(start+1);
                seppos.set(input.length());
                return(rc);
            }

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
