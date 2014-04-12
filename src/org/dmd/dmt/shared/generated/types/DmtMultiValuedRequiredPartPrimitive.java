package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:134)
import java.io.Serializable;                                     // To prevent serialization warnings - (NewComplexTypeFormatter.java:100)
import java.util.ArrayList;                                      // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:107)
import java.util.Iterator;                                       // To support multi-valued optional parts - (NewComplexTypeFormatter.java:111)
import org.dmd.dmc.DmcAttributeInfo;                             // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:105)
import org.dmd.dmc.DmcInputStreamIF;                             // Standard serialization techniques - (NewComplexTypeFormatter.java:101)
import org.dmd.dmc.DmcOutputStreamIF;                            // Standard serialization techniques - (NewComplexTypeFormatter.java:102)
import org.dmd.dmc.DmcValueException;                            // Standard value exception - (NewComplexTypeFormatter.java:129)
import org.dmd.dmc.util.ComplexTypeSplitter;                     // For parsing initial input - (NewComplexTypeFormatter.java:106)
import org.dmd.dmc.util.ParsedNameValuePair;                     // To store values parsed from initial input - (NewComplexTypeFormatter.java:108)
import org.dmd.dms.generated.enums.DataTypeEnum;                 // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:103)
import org.dmd.dms.generated.enums.ValueTypeEnum;                // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:104)
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;         // Standard type - (NewComplexTypeFormatter.java:900)



@SuppressWarnings("serial")
/**
 * The DmtMultiValuedRequiredPartPrimitive class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:141)
 */
public class DmtMultiValuedRequiredPartPrimitive implements Serializable {

    final static int requiredParts = 1;

    // A bunch of integers
    ArrayList<Integer> valueV;

    final static DmcAttributeInfo valueAI = new DmcAttributeInfo("value",0,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public DmtMultiValuedRequiredPartPrimitive(){
    }

    /**
     * Copy constructor.
     */
    @SuppressWarnings("unchecked")
    public DmtMultiValuedRequiredPartPrimitive(DmtMultiValuedRequiredPartPrimitive original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:838)
        valueV = (ArrayList<Integer>) original.valueV.clone();
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:172)
     */
    public DmtMultiValuedRequiredPartPrimitive(ArrayList<Integer> value_) throws DmcValueException {
        if (value_ != null){
            valueV = new ArrayList<Integer>();
            for(Integer v: value_){
                valueV.add(DmcTypeIntegerSTATIC.instance.typeCheck(v));
            }
        }
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:255)
     */
    public DmtMultiValuedRequiredPartPrimitive(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:263)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: DmtMultiValuedRequiredPartPrimitive"));


        if (nvp.size() > requiredParts){
            for(int i=1; i<nvp.size(); i++){
                if (nvp.get(i).getName() == null){
                    if (nvp.get(i).getValue() == null)
                        throw(new DmcValueException("Expecting a partname=\"some value\" in complex type: DmtMultiValuedRequiredPartPrimitive"));
                    else
                        throw(new DmcValueException("Expecting a partname=\"" + nvp.get(i).getValue() + "\" in complex type: DmtMultiValuedRequiredPartPrimitive"));
                }
                if (valueV == null)
                    valueV = new ArrayList<Integer>();
                valueV.add(DmcTypeIntegerSTATIC.instance.typeCheck(nvp.get(i).getValue()));
            }
        }
    }

    /**
     * Serialization.
     */
    public void serializeIt(DmcOutputStreamIF dos) throws Exception {
        dos.writeUTF(toString());
    }

    /**
     * Deserialization.
     */
    public void deserializeIt(DmcInputStreamIF dis) throws Exception {
        initialize(dis.readUTF());
    }

    /**
     * String form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:388)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(valueV.toString());
        return(sb.toString());
    }

    public Iterator<Integer> getValue(){
        if (valueV == null)
            return(null);
        return(valueV.iterator());
    }

}
