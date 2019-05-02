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
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:148)
import java.io.Serializable;                                                           // To prevent serialization warnings - (NewComplexTypeFormatter.java:113)
import java.util.ArrayList;                                                            // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:120)
import org.dmd.dmc.DmcAttributeInfo;                                                   // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcContainerIF;                                                     // To support object references - (NewComplexTypeFormatter.java:131)
import org.dmd.dmc.DmcInputStreamIF;                                                   // Standard serialization techniques - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcNameClashResolverIF;                                             // To support possible clashing object references - (NewComplexTypeFormatter.java:135)
import org.dmd.dmc.DmcNameResolverIF;                                                  // To support object references - (NewComplexTypeFormatter.java:128)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                                  // To support possible clashing object references - (NewComplexTypeFormatter.java:133)
import org.dmd.dmc.DmcNamedObjectIF;                                                   // To support object references - (NewComplexTypeFormatter.java:129)
import org.dmd.dmc.DmcNamedObjectREF;                                                  // To support object references - (NewComplexTypeFormatter.java:130)
import org.dmd.dmc.DmcObject;                                                          // To support possible clashing object references - (NewComplexTypeFormatter.java:136)
import org.dmd.dmc.DmcOmni;                                                            // To enable back reference tracking - (NewComplexTypeFormatter.java:138)
import org.dmd.dmc.DmcOutputStreamIF;                                                  // Standard serialization techniques - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.DmcValueException;                                                  // Standard value exception - (NewComplexTypeFormatter.java:143)
import org.dmd.dmc.DmcValueExceptionSet;                                               // To support possible clashing object references - (NewComplexTypeFormatter.java:137)
import org.dmd.dmc.types.Modifier;                                                     // To enable back reference tracking - (NewComplexTypeFormatter.java:139)
import org.dmd.dmc.util.ComplexTypeSplitter;                                           // For parsing initial input - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.util.JSONUtil;                                                      // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:122)
import org.dmd.dmc.util.ParsedNameValuePair;                                           // To store values parsed from initial input - (NewComplexTypeFormatter.java:121)
import org.dmd.dms.generated.enums.DataTypeEnum;                                       // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:116)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                      // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:117)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                                // Standard type - (NewComplexTypeFormatter.java:1204)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ABConceptXREF;                      // Object reference - (NewComplexTypeFormatter.java:1179)
import org.dmd.dmt.dsd.dsda.shared.generated.types.DmcTypeABConceptXREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:1204)



@SuppressWarnings("serial")
/**
 * The Reference class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:155)
 */
public class Reference implements Serializable {

    final static int requiredParts = 1;

    // The reference toanother ABConcept
    ABConceptXREF toConceptV;

    final static DmcAttributeInfo toConceptAI = new DmcAttributeInfo("toConcept",0,"ABConceptX",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // An optional description
    String descrV;

    final static DmcAttributeInfo descrAI = new DmcAttributeInfo("descr",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public Reference(){
    }

    /**
     * Copy constructor.
     */
    public Reference(Reference original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1141)
        toConceptV =  original.toConceptV;
        descrV =  original.descrV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:186)
     */
    public Reference(ABConceptXREF toConcept_, String descr_) throws DmcValueException {
        toConceptV = DmcTypeABConceptXREFSTATIC.instance.typeCheck(toConcept_);
        if (descr_ != null)
            descrV = DmcTypeStringSTATIC.instance.typeCheck(descr_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:269)
     */
    public Reference(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:277)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: Reference\nValue: " + initialInput));

        toConceptV = DmcTypeABConceptXREFSTATIC.instance.typeCheck(nvp.get(0).getValue());

        if (nvp.size() > requiredParts){
            for(int i=1; i<nvp.size(); i++){
                if (nvp.get(i).getName() == null){
                    if (nvp.get(i).getValue() == null)
                        throw(new DmcValueException("Expecting a partname=\"some value\" in complex type: Reference\nValue: " + initialInput));
                    else
                        throw(new DmcValueException("Expecting a partname=\"" + nvp.get(i).getValue() + "\" in complex type: Reference\nValue: " + initialInput));
                }
                if (nvp.get(i).getName().equals("descr"))
                    descrV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else{
                    throw(new DmcValueException("Unknown field for complex type Reference: "  + nvp.get(i).getName()));
                }
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
        sb.append(toConceptV.toString());
        if (descrV != null){
            sb.append(' ');
            sb.append("descr=" + "\"" + descrV.toString() + "\"");
        }

        return(sb.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Reference) {
            return(this.toString().equals(((Reference)obj).toString()));
        }
        return(false);
    }
    /**
     * JSON form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:516)
     */
    public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
        sb.append(indent + "  \"toConcept\": \"" + JSONUtil.escape(toConceptV.toString()) + "\"");
        if (descrV != null){
            sb.append(",\n");
            sb.append(indent + "  \"descr\": \"" + JSONUtil.escape(descrV.toString()) + "\"");
        }

        sb.append("\n" + indent + "}");
    }

    public ABConceptXREF getToConcept(){
        return(toConceptV);
    }

    public String getDescr(){
        return(descrV);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:704)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if ((toConceptV != null) && (!toConceptV.isResolved())){
            obj = resolver.findNamedObject(toConceptV.getObjectName());
            if (toConceptAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + toConceptV.getObjectName() + "(part: toConcept - of type: ABConceptX) via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)toConceptV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)toConceptV).setObject(obj);
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:775)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if ((toConceptV != null) && (!toConceptV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, toConceptV.getObjectName(), ncr, toConceptAI);
            if (toConceptAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + toConceptV.getObjectName() + "(part: toConcept - of type: ABConceptX) via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)toConceptV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)toConceptV).setObject(obj);
        
            if (DmcOmni.instance().backRefTracking()){
                Modifier backrefMod = new Modifier("toConcept", object, toConceptV, ai.id, ai.name);
                if (obj instanceof DmcContainerIF)
                    ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);
                else
                    ((DmcObject)obj).addBackref(backrefMod);
                toConceptV.setBackrefModifier(backrefMod);
            }
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:864)
    public void removeBackRefsFromValue(){
        // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:871)
        if (toConceptV != null){
            toConceptV.removeBackref();
        }
        
    }

}
