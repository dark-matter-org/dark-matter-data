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
import java.io.Serializable;                                                           // To prevent serialization warnings - (NewComplexTypeFormatter.java:117)
import java.util.ArrayList;                                                            // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:124)
import org.dmd.dmc.DmcAttributeInfo;                                                   // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:122)
import org.dmd.dmc.DmcContainerIF;                                                     // To support object references - (NewComplexTypeFormatter.java:135)
import org.dmd.dmc.DmcInputStreamIF;                                                   // Standard serialization techniques - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcNameClashResolverIF;                                             // To support possible clashing object references - (NewComplexTypeFormatter.java:139)
import org.dmd.dmc.DmcNameResolverIF;                                                  // To support object references - (NewComplexTypeFormatter.java:132)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                                  // To support possible clashing object references - (NewComplexTypeFormatter.java:137)
import org.dmd.dmc.DmcNamedObjectIF;                                                   // To support object references - (NewComplexTypeFormatter.java:133)
import org.dmd.dmc.DmcNamedObjectREF;                                                  // To support object references - (NewComplexTypeFormatter.java:134)
import org.dmd.dmc.DmcObject;                                                          // To support possible clashing object references - (NewComplexTypeFormatter.java:140)
import org.dmd.dmc.DmcOmni;                                                            // To enable back reference tracking - (NewComplexTypeFormatter.java:142)
import org.dmd.dmc.DmcOutputStreamIF;                                                  // Standard serialization techniques - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.DmcValueException;                                                  // Standard value exception - (NewComplexTypeFormatter.java:147)
import org.dmd.dmc.DmcValueExceptionSet;                                               // To support possible clashing object references - (NewComplexTypeFormatter.java:141)
import org.dmd.dmc.types.Modifier;                                                     // To enable back reference tracking - (NewComplexTypeFormatter.java:143)
import org.dmd.dmc.util.ComplexTypeSplitter;                                           // For parsing initial input - (NewComplexTypeFormatter.java:123)
import org.dmd.dmc.util.JSONUtil;                                                      // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:126)
import org.dmd.dmc.util.ParsedNameValuePair;                                           // To store values parsed from initial input - (NewComplexTypeFormatter.java:125)
import org.dmd.dms.generated.enums.DataTypeEnum;                                       // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:120)
import org.dmd.dms.generated.enums.ValueTypeEnum;                                      // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:121)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                                // Standard type - (NewComplexTypeFormatter.java:1217)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ABConceptXREF;                      // Object reference - (NewComplexTypeFormatter.java:1192)
import org.dmd.dmt.dsd.dsda.shared.generated.types.DmcTypeABConceptXREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:1217)



@SuppressWarnings("serial")
/**
 * The TypeAndAttribute class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:159)
 */
public class TypeAndAttribute implements Serializable {

    final static int requiredParts = 2;

    // The type
    ABConceptXREF typeV;

    final static DmcAttributeInfo typeAI = new DmcAttributeInfo("type",0,"ABConceptX",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // An attribute name - for example purposes.
    String attrV;

    final static DmcAttributeInfo attrAI = new DmcAttributeInfo("attr",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public TypeAndAttribute(){
    }

    /**
     * Copy constructor.
     */
    public TypeAndAttribute(TypeAndAttribute original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1154)
        typeV =  original.typeV;
        attrV =  original.attrV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:190)
     */
    public TypeAndAttribute(ABConceptXREF type_, String attr_) throws DmcValueException {
        typeV = DmcTypeABConceptXREFSTATIC.instance.typeCheck(type_);
        attrV = DmcTypeStringSTATIC.instance.typeCheck(attr_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:273)
     */
    public TypeAndAttribute(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:281)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput,'.');

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: TypeAndAttribute\nValue: " + initialInput));

        typeV = DmcTypeABConceptXREFSTATIC.instance.typeCheck(nvp.get(0).getValue());
        attrV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(1).getValue());
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
        sb.append(typeV.toString());
        sb.append('.');
        sb.append(attrV.toString());
        return(sb.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TypeAndAttribute) {
            return(this.toString().equals(((TypeAndAttribute)obj).toString()));
        }
        return(false);
    }
    /**
     * JSON form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:520)
     */
    public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
        sb.append(indent + "  \"type\": \"" + JSONUtil.escape(typeV.toString()) + "\",\n");
        sb.append(indent + "  \"attr\": \"" + JSONUtil.escape(attrV.toString()) + "\"");
        sb.append("\n" + indent + "}");
    }

    public ABConceptXREF getType(){
        return(typeV);
    }

    public String getAttr(){
        return(attrV);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:708)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if ((typeV != null) && (!typeV.isResolved())){
            obj = resolver.findNamedObject(typeV.getObjectName());
            if (typeAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + typeV.getObjectName() + "(part: type - of type: ABConceptX) via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)typeV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)typeV).setObject(obj);
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:779)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if ((typeV != null) && (!typeV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, typeV.getObjectName(), ncr, typeAI);
            if (typeAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + typeV.getObjectName() + "(part: type - of type: ABConceptX) via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)typeV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)typeV).setObject(obj);
        
            if (DmcOmni.instance().backRefTracking()){
                Modifier backrefMod = new Modifier("type", object, typeV, ai.id, ai.name);
                if (obj instanceof DmcContainerIF)
                    ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);
                else
                    ((DmcObject)obj).addBackref(backrefMod);
                typeV.setBackrefModifier(backrefMod);
            }
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:868)
    public void removeBackRefsFromValue(){
        // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:875)
        if (typeV != null){
            typeV.removeBackref();
        }
        
    }

}
