//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmt.dsd.dsda.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:152)
import java.io.Serializable;                                                              // To prevent serialization warnings - (NewComplexTypeFormatter.java:117)
import java.util.ArrayList;                                                               // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:124)
import org.dmd.dmc.DmcAttributeInfo;                                                      // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:122)
import org.dmd.dmc.DmcContainerIF;                                                        // To support object references - (NewComplexTypeFormatter.java:135)
import org.dmd.dmc.DmcInputStreamIF;                                                      // Standard serialization techniques - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcNameClashResolverIF;                                                // To support possible clashing object references - (NewComplexTypeFormatter.java:139)
import org.dmd.dmc.DmcNameResolverIF;                                                     // To support object references - (NewComplexTypeFormatter.java:132)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                                     // To support possible clashing object references - (NewComplexTypeFormatter.java:137)
import org.dmd.dmc.DmcNamedObjectIF;                                                      // To support object references - (NewComplexTypeFormatter.java:133)
import org.dmd.dmc.DmcNamedObjectREF;                                                     // To support object references - (NewComplexTypeFormatter.java:134)
import org.dmd.dmc.DmcObject;                                                             // To support possible clashing object references - (NewComplexTypeFormatter.java:140)
import org.dmd.dmc.DmcOmni;                                                               // To enable back reference tracking - (NewComplexTypeFormatter.java:142)
import org.dmd.dmc.DmcOutputStreamIF;                                                     // Standard serialization techniques - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.DmcValueException;                                                     // Standard value exception - (NewComplexTypeFormatter.java:147)
import org.dmd.dmc.DmcValueExceptionSet;                                                  // To support possible clashing object references - (NewComplexTypeFormatter.java:141)
import org.dmd.dmc.types.Modifier;                                                        // To enable back reference tracking - (NewComplexTypeFormatter.java:143)
import org.dmd.dmc.util.ComplexTypeSplitter;                                              // For parsing initial input - (NewComplexTypeFormatter.java:123)
import org.dmd.dmc.util.JSONUtil;                                                         // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:126)
import org.dmd.dmc.util.ParsedNameValuePair;                                              // To store values parsed from initial input - (NewComplexTypeFormatter.java:125)
import org.dmd.dms.generated.enums.DataTypeEnum;                                          // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:120)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                         // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:121)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                                   // Standard type - (NewComplexTypeFormatter.java:1217)
import org.dmd.dmt.dsd.dsda.shared.generated.types.DmcTypeTypeAndAttributeSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:1217)
import org.dmd.dmt.dsd.dsda.shared.generated.types.TypeAndAttribute;                      // Primitive type - (NewComplexTypeFormatter.java:1200)



@SuppressWarnings("serial")
/**
 * The ComplexWithComplex class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:159)
 */
public class ComplexWithComplex implements Serializable {

    final static int requiredParts = 2;

    // Some variable
    String variableV;

    final static DmcAttributeInfo variableAI = new DmcAttributeInfo("variable",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // A complex type with a reference.
    TypeAndAttribute referenceV;

    final static DmcAttributeInfo referenceAI = new DmcAttributeInfo("reference",0,"TypeAndAttribute",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public ComplexWithComplex(){
    }

    /**
     * Copy constructor.
     */
    public ComplexWithComplex(ComplexWithComplex original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1154)
        variableV =  original.variableV;
        referenceV =  original.referenceV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:190)
     */
    public ComplexWithComplex(String variable_, TypeAndAttribute reference_) throws DmcValueException {
        variableV = DmcTypeStringSTATIC.instance.typeCheck(variable_);
        referenceV = DmcTypeTypeAndAttributeSTATIC.instance.typeCheck(reference_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:273)
     */
    public ComplexWithComplex(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:281)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput,'.');

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: ComplexWithComplex\nValue: " + initialInput));

        variableV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(0).getValue());
        referenceV = DmcTypeTypeAndAttributeSTATIC.instance.typeCheck(nvp.get(1).getValue());
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:407)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(variableV.toString());
        sb.append('.');
        sb.append(referenceV.toString());
        return(sb.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComplexWithComplex) {
            return(this.toString().equals(((ComplexWithComplex)obj).toString()));
        }
        return(false);
    }
    /**
     * JSON form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:520)
     */
    public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
        sb.append(indent + "  \"variable\": \"" + JSONUtil.escape(variableV.toString()) + "\",\n");
        sb.append(indent + "  \"reference\": ");
        referenceV.toJSON(sb, padding, indent);
        sb.append("");
        sb.append("\n" + indent + "}");
    }

    public String getVariable(){
        return(variableV);
    }

    public TypeAndAttribute getReference(){
        return(referenceV);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:708)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if (referenceV != null){
            referenceV.resolve(resolver, attrName);
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:779)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if (referenceV != null){
            referenceV.resolve(resolver, object, ncr, ai);
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:868)
    public void removeBackRefsFromValue(){
        // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:883)
        if (referenceV != null){
            referenceV.removeBackRefsFromValue();
        }
        
    }

}
