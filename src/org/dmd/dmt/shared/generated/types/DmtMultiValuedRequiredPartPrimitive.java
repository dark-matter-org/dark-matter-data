package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:149)
import java.io.Serializable;                                     // To prevent serialization warnings - (NewComplexTypeFormatter.java:114)
import java.util.ArrayList;                                      // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:121)
import java.util.Iterator;                                       // To support multi-valued optional parts - (NewComplexTypeFormatter.java:126)
import org.dmd.dmc.DmcAttributeInfo;                             // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.DmcInputStreamIF;                             // Standard serialization techniques - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.DmcOutputStreamIF;                            // Standard serialization techniques - (NewComplexTypeFormatter.java:116)
import org.dmd.dmc.DmcValueException;                            // Standard value exception - (NewComplexTypeFormatter.java:144)
import org.dmd.dmc.util.ComplexTypeSplitter;                     // For parsing initial input - (NewComplexTypeFormatter.java:120)
import org.dmd.dmc.util.JSONUtil;                                // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:123)
import org.dmd.dmc.util.ParsedNameValuePair;                     // To store values parsed from initial input - (NewComplexTypeFormatter.java:122)
import org.dmd.dms.generated.enums.DataTypeEnum;                 // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:117)
import org.dmd.dms.generated.enums.ValueTypeEnum;                // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:118)
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;         // Standard type - (NewComplexTypeFormatter.java:1214)



@SuppressWarnings("serial")
/**
 * The DmtMultiValuedRequiredPartPrimitive class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:156)
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
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1151)
        valueV = (ArrayList<Integer>) original.valueV.clone();
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:187)
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:270)
     */
    public DmtMultiValuedRequiredPartPrimitive(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:278)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: DmtMultiValuedRequiredPartPrimitive\nValue: " + initialInput));


        if (nvp.size() >= requiredParts){
            for(int i=0; i<nvp.size(); i++){
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:404)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
            boolean first = true;
            for(Integer v: valueV){
                if (first)
                    first = false;
                else
                    sb.append(' ');
                sb.append(v.toString());
            }
        return(sb.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DmtMultiValuedRequiredPartPrimitive) {
            return(this.toString().equals(((DmtMultiValuedRequiredPartPrimitive)obj).toString()));
        }
        return(false);
    }
    /**
     * JSON form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:517)
     */
    public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
            sb.append(indent + "  \"value\": [\n");
            Iterator<Integer> it = valueV.iterator();
            while(it.hasNext()){
                Integer v = it.next();
                sb.append(indent + "  \"" + JSONUtil.escape(v.toString()) + "\"");
                if (it.hasNext())
                    sb.append(",");
            }
            sb.append("\n" + indent + "]");
        sb.append("\n" + indent + "}");
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:666)
    public Iterator<Integer> getValue(){
        if (valueV == null)
            return(null);
        return(valueV.iterator());
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:673)
    public boolean hasValue(){
        if (valueV == null)
            return(false);
        return(true);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:680)
    public int getValueSize(){
        if (valueV == null)
            return(0);
        return(valueV.size());
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:687)
    public Integer getValue(int index){
        if (valueV == null)
            return(null);
        return(valueV.get(index));
    }

}
