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
package org.dmd.templates.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:148)
import java.io.Serializable;                                                              // To prevent serialization warnings - (NewComplexTypeFormatter.java:113)
import java.util.ArrayList;                                                               // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:120)
import org.dmd.dmc.DmcAttributeInfo;                                                      // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcContainerIF;                                                        // To support object references - (NewComplexTypeFormatter.java:131)
import org.dmd.dmc.DmcInputStreamIF;                                                      // Standard serialization techniques - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcNameClashResolverIF;                                                // To support possible clashing object references - (NewComplexTypeFormatter.java:135)
import org.dmd.dmc.DmcNameResolverIF;                                                     // To support object references - (NewComplexTypeFormatter.java:128)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                                     // To support possible clashing object references - (NewComplexTypeFormatter.java:133)
import org.dmd.dmc.DmcNamedObjectIF;                                                      // To support object references - (NewComplexTypeFormatter.java:129)
import org.dmd.dmc.DmcNamedObjectREF;                                                     // To support object references - (NewComplexTypeFormatter.java:130)
import org.dmd.dmc.DmcObject;                                                             // To support possible clashing object references - (NewComplexTypeFormatter.java:136)
import org.dmd.dmc.DmcOmni;                                                               // To enable back reference tracking - (NewComplexTypeFormatter.java:138)
import org.dmd.dmc.DmcOutputStreamIF;                                                     // Standard serialization techniques - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.DmcValueException;                                                     // Standard value exception - (NewComplexTypeFormatter.java:143)
import org.dmd.dmc.DmcValueExceptionSet;                                                  // To support possible clashing object references - (NewComplexTypeFormatter.java:137)
import org.dmd.dmc.types.Modifier;                                                        // To enable back reference tracking - (NewComplexTypeFormatter.java:139)
import org.dmd.dmc.util.ComplexTypeSplitter;                                              // For parsing initial input - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.util.JSONUtil;                                                         // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:122)
import org.dmd.dmc.util.ParsedNameValuePair;                                              // To store values parsed from initial input - (NewComplexTypeFormatter.java:121)
import org.dmd.dms.generated.enums.DataTypeEnum;                                          // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:116)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                         // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:117)
import org.dmd.templates.shared.generated.enums.CardinalityEnum;                          // Primitive type - (NewComplexTypeFormatter.java:1187)
import org.dmd.templates.shared.generated.types.ContainedElementREF;                      // Object reference - (NewComplexTypeFormatter.java:1179)
import org.dmd.templates.shared.generated.types.DmcTypeCardinalityEnumSTATIC;             // Internally generated type - (NewComplexTypeFormatter.java:1204)
import org.dmd.templates.shared.generated.types.DmcTypeContainedElementREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:1204)



@SuppressWarnings("serial")
/**
 * The Contains class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:155)
 */
public class Contains implements Serializable {

    final static int requiredParts = 2;

    // The number of times a contained Section will occur.
    CardinalityEnum occurencesV;

    final static DmcAttributeInfo occurencesAI = new DmcAttributeInfo("occurences",0,"CardinalityEnum",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // The Section or ExtensionHook being referenced.
    ContainedElementREF elementV;

    final static DmcAttributeInfo elementAI = new DmcAttributeInfo("element",0,"ContainedElement",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public Contains(){
    }

    /**
     * Copy constructor.
     */
    public Contains(Contains original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1141)
        occurencesV =  original.occurencesV;
        elementV =  original.elementV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:186)
     */
    public Contains(CardinalityEnum occurences_, ContainedElementREF element_) throws DmcValueException {
        occurencesV = DmcTypeCardinalityEnumSTATIC.instance.typeCheck(occurences_);
        elementV = DmcTypeContainedElementREFSTATIC.instance.typeCheck(element_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:269)
     */
    public Contains(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:277)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: Contains\nValue: " + initialInput));

        occurencesV = DmcTypeCardinalityEnumSTATIC.instance.typeCheck(nvp.get(0).getValue());
        elementV = DmcTypeContainedElementREFSTATIC.instance.typeCheck(nvp.get(1).getValue());
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
        sb.append(occurencesV.toString());
        sb.append(' ');
        sb.append(elementV.toString());
        return(sb.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contains) {
            return(this.toString().equals(((Contains)obj).toString()));
        }
        return(false);
    }
    /**
     * JSON form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:516)
     */
    public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
        sb.append(indent + "  \"occurences\": \"" + JSONUtil.escape(occurencesV.toString()) + "\",\n");
        sb.append(indent + "  \"element\": \"" + JSONUtil.escape(elementV.toString()) + "\"");
        sb.append("\n" + indent + "}");
    }

    public CardinalityEnum getOccurences(){
        return(occurencesV);
    }

    public ContainedElementREF getElement(){
        return(elementV);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:704)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if ((elementV != null) && (!elementV.isResolved())){
            obj = resolver.findNamedObject(elementV.getObjectName());
            if (elementAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + elementV.getObjectName() + "(part: element - of type: ContainedElement) via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)elementV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)elementV).setObject(obj);
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:775)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if ((elementV != null) && (!elementV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, elementV.getObjectName(), ncr, elementAI);
            if (elementAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + elementV.getObjectName() + "(part: element - of type: ContainedElement) via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)elementV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)elementV).setObject(obj);
        
            if (DmcOmni.instance().backRefTracking()){
                Modifier backrefMod = new Modifier("element", object, elementV, ai.id, ai.name);
                if (obj instanceof DmcContainerIF)
                    ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);
                else
                    ((DmcObject)obj).addBackref(backrefMod);
                elementV.setBackrefModifier(backrefMod);
            }
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:864)
    public void removeBackRefsFromValue(){
        // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:871)
        if (elementV != null){
            elementV.removeBackref();
        }
        
    }

}
