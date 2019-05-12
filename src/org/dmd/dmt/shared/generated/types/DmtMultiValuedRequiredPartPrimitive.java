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
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:148)
import java.io.Serializable;                                     // To prevent serialization warnings - (NewComplexTypeFormatter.java:113)
import java.util.ArrayList;                                      // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:120)
import java.util.Iterator;                                       // To support multi-valued optional parts - (NewComplexTypeFormatter.java:125)
import org.dmd.dmc.DmcAttributeInfo;                             // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcInputStreamIF;                             // Standard serialization techniques - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcOutputStreamIF;                            // Standard serialization techniques - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.DmcValueException;                            // Standard value exception - (NewComplexTypeFormatter.java:143)
import org.dmd.dmc.util.ComplexTypeSplitter;                     // For parsing initial input - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.util.JSONUtil;                                // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:122)
import org.dmd.dmc.util.ParsedNameValuePair;                     // To store values parsed from initial input - (NewComplexTypeFormatter.java:121)
import org.dmd.dms.generated.enums.DataTypeEnum;                 // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:116)
import org.dmd.dms.generated.enums.ValueTypeEnum;                // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:117)
import org.dmd.dms.generated.types.DmcTypeIntegerSTATIC;         // Standard type - (NewComplexTypeFormatter.java:1204)



@SuppressWarnings("serial")
/**
 * The DmtMultiValuedRequiredPartPrimitive class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:155)
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
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1141)
        valueV = (ArrayList<Integer>) original.valueV.clone();
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:186)
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:269)
     */
    public DmtMultiValuedRequiredPartPrimitive(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:277)
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:403)
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:516)
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

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:665)
    public Iterator<Integer> getValue(){
        if (valueV == null)
            return(null);
        return(valueV.iterator());
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:672)
    public boolean hasValue(){
        if (valueV == null)
            return(false);
        return(true);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:679)
    public int getValueSize(){
        if (valueV == null)
            return(0);
        return(valueV.size());
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:686)
    public Integer getValue(int index){
        if (valueV == null)
            return(null);
        return(valueV.get(index));
    }

}
