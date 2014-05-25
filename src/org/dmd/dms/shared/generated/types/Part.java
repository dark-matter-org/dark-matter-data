//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.shared.generated.types;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:104)
import java.io.Serializable;                                              // Marker interface for serialization - (ComplexTypeFormatter.java:79)
import java.util.ArrayList;                                               // To store ParsedNameValuePairs - (ComplexTypeFormatter.java:86)
import org.dmd.core.DmcNamedObjectREF;                                    // Reference resolution - (ComplexTypeFormatter.java:94)
import org.dmd.core.DmcObject;                                            // Ambiguous reference resolution - (ComplexTypeFormatter.java:96)
import org.dmd.core.feedback.DMFeedbackSet;                               // Ambiguous reference resolution - (ComplexTypeFormatter.java:97)
import org.dmd.core.interfaces.DmcContainerIF;                            // Reference resolution - (ComplexTypeFormatter.java:95)
import org.dmd.core.interfaces.DmcInputStreamIF;                          // To support serialization - (ComplexTypeFormatter.java:80)
import org.dmd.core.interfaces.DmcNameClashResolverIF;                    // Ambiguous reference resolution - (ComplexTypeFormatter.java:91)
import org.dmd.core.interfaces.DmcNameResolverIF;                         // Reference resolution - (ComplexTypeFormatter.java:92)
import org.dmd.core.interfaces.DmcNameResolverWithClashSupportIF;         // Ambiguous reference resolution - (ComplexTypeFormatter.java:90)
import org.dmd.core.interfaces.DmcNamedObjectIF;                          // Reference resolution - (ComplexTypeFormatter.java:93)
import org.dmd.core.interfaces.DmcOutputStreamIF;                         // To support serialization - (ComplexTypeFormatter.java:81)
import org.dmd.core.schema.DmcAttributeInfo;                              // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:84)
import org.dmd.core.util.ComplexTypeSplitter;                             // For parsing initial input - (ComplexTypeFormatter.java:85)
import org.dmd.core.util.ParsedNameValuePair;                             // To store values parsed from initial input - (ComplexTypeFormatter.java:87)
import org.dmd.dms.shared.generated.enums.DataTypeEnum;                   // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:82)
import org.dmd.dms.shared.generated.enums.ValueTypeEnum;                  // For fake DmcAttributeInfo - (ComplexTypeFormatter.java:83)



@SuppressWarnings("serial")
/**
 * The Part class.
 * This code was auto-generated by the MetaGen utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:111)
 */
public class Part implements Serializable {

    // The type of the Part
    TypeDefinitionREF type;
    final static DmcAttributeInfo typeAI = new DmcAttributeInfo("type",0,"TypeDefinitionREF",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The name of the Part
    String name;
    final static DmcAttributeInfo nameAI = new DmcAttributeInfo("name",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The description of the Part
    String description;
    final static DmcAttributeInfo descriptionAI = new DmcAttributeInfo("description",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Indicates if the Part allows for a quoted value or if it's intended to be a single token
    Boolean quoted;
    final static DmcAttributeInfo quotedAI = new DmcAttributeInfo("quoted",0,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Indicates if the Part is multivalued. This can be specified on any optionalPart but can only be used on a requiredPart if it's the only part in the ComplexTypeDefinition
    Boolean multivalued;
    final static DmcAttributeInfo multivaluedAI = new DmcAttributeInfo("multivalued",0,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // Indicates that a reference type is weak i.e. that no exception will be thrown if the reference can't be resolved - this is only applicable to optional Parts.
    Boolean weakref;
    final static DmcAttributeInfo weakrefAI = new DmcAttributeInfo("weakref",0,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // This flag can only be used on a Part composed of requiredParts and only on the last requiredPart. It is not compatible with other flags such as quoted, multivalued or weakref. It allows for a set of required parts followed by chunk of text that extends to the end of the attribute value.
    Boolean greedy;
    final static DmcAttributeInfo greedyAI = new DmcAttributeInfo("greedy",0,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    final static int requiredParts = 3;

    /**
     * Default constructor.
     */
    public Part(){
    }

    /**
     * Copy constructor.
     */
    public Part(Part original){
        type = original.type;
        name = original.name;
        description = original.description;
        quoted = original.quoted;
        multivalued = original.multivalued;
        weakref = original.weakref;
        greedy = original.greedy;
    }

    // Generated from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:136)
    /**
     * All fields constructor.
     */
    public Part(TypeDefinitionREF f1, String f2, String f3, Boolean f4, Boolean f5, Boolean f6, Boolean f7) throws DMFeedbackSet {
        type = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(f1);
        name = DmcTypeStringSTATIC.instance.typeCheck(f2);
        description = DmcTypeStringSTATIC.instance.typeCheck(f3);
        if (f4 != null)
            quoted = DmcTypeBooleanSTATIC.instance.typeCheck(f4);
        if (f5 != null)
            multivalued = DmcTypeBooleanSTATIC.instance.typeCheck(f5);
        if (f6 != null)
            weakref = DmcTypeBooleanSTATIC.instance.typeCheck(f6);
        if (f7 != null)
            greedy = DmcTypeBooleanSTATIC.instance.typeCheck(f7);
    }

    // Generated from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:163)
    /**
     * String based constructor.
     */
    public Part(String initialInput) throws DMFeedbackSet {
        initialize(initialInput);
    }

    // Generated from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:171)
    void initialize(String initialInput) throws DMFeedbackSet {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DMFeedbackSet("Missing required values for complex type: Part"));

        type = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(nvp.get(0).getValue());
        name = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(1).getValue());
        description = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(2).getValue());

        if (nvp.size() > requiredParts){
            for(int i=3; i<nvp.size(); i++){
                if (nvp.get(i).getName() == null){
                    if (nvp.get(i).getValue() == null)
                        throw(new DMFeedbackSet("Expecting a partname=\"some value\" in complex type: Part"));
                    else
                        throw(new DMFeedbackSet("Expecting a partname=\"" + nvp.get(i).getValue() + "\" in complex type: Part"));
                }
                if (nvp.get(i).getName().equals("quoted"))
                    quoted = DmcTypeBooleanSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else if (nvp.get(i).getName().equals("multivalued"))
                    multivalued = DmcTypeBooleanSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else if (nvp.get(i).getName().equals("weakref"))
                    weakref = DmcTypeBooleanSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else if (nvp.get(i).getName().equals("greedy"))
                    greedy = DmcTypeBooleanSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else{
                    throw(new DMFeedbackSet("Unknown field for complex type Part: "  + nvp.get(i).getName()));
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
     * Generated from: org.dmd.dms.tools.generation.meta.ComplexTypeFormatter.dumpComplexType(ComplexTypeFormatter.java:260)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(type.toString());
        sb.append(' ');
        sb.append(name.toString());
        sb.append(' ');
        sb.append("\"" + description.toString() + "\"");
        if (quoted != null){
            sb.append(' ');
            sb.append("quoted=" + quoted.toString());
        }

        if (multivalued != null){
            sb.append(' ');
            sb.append("multivalued=" + multivalued.toString());
        }

        if (weakref != null){
            sb.append(' ');
            sb.append("weakref=" + weakref.toString());
        }

        if (greedy != null){
            sb.append(' ');
            sb.append("greedy=" + greedy.toString());
        }

        return(sb.toString());
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

    public Boolean getQuoted(){
        return(quoted);
    }

    public Boolean getMultivalued(){
        return(multivalued);
    }

    public Boolean getWeakref(){
        return(weakref);
    }

    public Boolean getGreedy(){
        return(greedy);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DMFeedbackSet {
        DmcNamedObjectIF  obj = null;

        if ((type != null) && (!type.isResolved())){
            obj = resolver.findNamedObject(type.getObjectName());
            if (obj == null)
                throw(new DMFeedbackSet("Could not resolve reference to: " + type.getObjectName() + " via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)type).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)type).setObject(obj);
        }
        
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DMFeedbackSet {
        DmcNamedObjectIF  obj = null;

        if ((type != null) && (!type.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, type.getObjectName(), ncr, typeAI);
            if (obj == null)
                throw(new DMFeedbackSet("Could not resolve reference to: " + type.getObjectName() + " via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)type).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)type).setObject(obj);
        }
        
    }

}
