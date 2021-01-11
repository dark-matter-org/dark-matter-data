package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:152)
import java.io.Serializable;                                               // To prevent serialization warnings - (NewComplexTypeFormatter.java:117)
import java.util.ArrayList;                                                // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:124)
import org.dmd.dmc.DmcAttributeInfo;                                       // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:122)
import org.dmd.dmc.DmcContainerIF;                                         // To support object references - (NewComplexTypeFormatter.java:135)
import org.dmd.dmc.DmcInputStreamIF;                                       // Standard serialization techniques - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcNameClashResolverIF;                                 // To support possible clashing object references - (NewComplexTypeFormatter.java:139)
import org.dmd.dmc.DmcNameResolverIF;                                      // To support object references - (NewComplexTypeFormatter.java:132)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                      // To support possible clashing object references - (NewComplexTypeFormatter.java:137)
import org.dmd.dmc.DmcNamedObjectIF;                                       // To support object references - (NewComplexTypeFormatter.java:133)
import org.dmd.dmc.DmcNamedObjectREF;                                      // To support object references - (NewComplexTypeFormatter.java:134)
import org.dmd.dmc.DmcObject;                                              // To support possible clashing object references - (NewComplexTypeFormatter.java:140)
import org.dmd.dmc.DmcOmni;                                                // To enable back reference tracking - (NewComplexTypeFormatter.java:142)
import org.dmd.dmc.DmcOutputStreamIF;                                      // Standard serialization techniques - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.DmcValueException;                                      // Standard value exception - (NewComplexTypeFormatter.java:147)
import org.dmd.dmc.DmcValueExceptionSet;                                   // To support possible clashing object references - (NewComplexTypeFormatter.java:141)
import org.dmd.dmc.types.Modifier;                                         // To enable back reference tracking - (NewComplexTypeFormatter.java:143)
import org.dmd.dmc.util.ComplexTypeSplitter;                               // For parsing initial input - (NewComplexTypeFormatter.java:123)
import org.dmd.dmc.util.JSONUtil;                                          // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:126)
import org.dmd.dmc.util.ParsedNameValuePair;                               // To store values parsed from initial input - (NewComplexTypeFormatter.java:125)
import org.dmd.dms.generated.enums.DataTypeEnum;                           // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:120)
import org.dmd.dms.generated.enums.ValueTypeEnum;                          // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:121)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                    // Standard type - (NewComplexTypeFormatter.java:1217)
import org.dmd.dms.generated.types.DmcTypeTypeDefinitionREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:1217)
import org.dmd.dms.generated.types.TypeDefinitionREF;                      // Object reference - (NewComplexTypeFormatter.java:1192)



@SuppressWarnings("serial")
/**
 * The DmtOptionalValueFieldWithSpaces class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:159)
 */
public class DmtOptionalValueFieldWithSpaces implements Serializable {

    final static int requiredParts = 2;

    // The type of the field
    TypeDefinitionREF typeV;

    final static DmcAttributeInfo typeAI = new DmcAttributeInfo("type",0,"TypeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // The name of the field
    String nameV;

    final static DmcAttributeInfo nameAI = new DmcAttributeInfo("name",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // The description of the field
    String descriptionV;

    final static DmcAttributeInfo descriptionAI = new DmcAttributeInfo("description",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // An optional object reference
    TypeDefinitionREF otherTypeV;

    final static DmcAttributeInfo otherTypeAI = new DmcAttributeInfo("otherType",0,"TypeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public DmtOptionalValueFieldWithSpaces(){
    }

    /**
     * Copy constructor.
     */
    public DmtOptionalValueFieldWithSpaces(DmtOptionalValueFieldWithSpaces original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1154)
        typeV =  original.typeV;
        nameV =  original.nameV;
        descriptionV =  original.descriptionV;
        otherTypeV =  original.otherTypeV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:190)
     */
    public DmtOptionalValueFieldWithSpaces(TypeDefinitionREF type_, String name_, String description_, TypeDefinitionREF otherType_) throws DmcValueException {
        typeV = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(type_);
        nameV = DmcTypeStringSTATIC.instance.typeCheck(name_);
        if (description_ != null)
            descriptionV = DmcTypeStringSTATIC.instance.typeCheck(description_);
        if (otherType_ != null)
            otherTypeV = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(otherType_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:273)
     */
    public DmtOptionalValueFieldWithSpaces(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:281)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: DmtOptionalValueFieldWithSpaces\nValue: " + initialInput));

        typeV = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(nvp.get(0).getValue());
        nameV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(1).getValue());

        if (nvp.size() > requiredParts){
            for(int i=2; i<nvp.size(); i++){
                if (nvp.get(i).getName() == null){
                    if (nvp.get(i).getValue() == null)
                        throw(new DmcValueException("Expecting a partname=\"some value\" in complex type: DmtOptionalValueFieldWithSpaces\nValue: " + initialInput));
                    else
                        throw(new DmcValueException("Expecting a partname=\"" + nvp.get(i).getValue() + "\" in complex type: DmtOptionalValueFieldWithSpaces\nValue: " + initialInput));
                }
                if (nvp.get(i).getName().equals("description"))
                    descriptionV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else if (nvp.get(i).getName().equals("otherType"))
                    otherTypeV = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else{
                    throw(new DmcValueException("Unknown field for complex type DmtOptionalValueFieldWithSpaces: "  + nvp.get(i).getName()));
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:407)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(typeV.toString());
        sb.append(' ');
        sb.append(nameV.toString());
        if (descriptionV != null){
            sb.append(' ');
            sb.append("description=" + "\"" + descriptionV.toString() + "\"");
        }

        if (otherTypeV != null){
            sb.append(' ');
            sb.append("otherType=" + otherTypeV.toString());
        }

        return(sb.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DmtOptionalValueFieldWithSpaces) {
            return(this.toString().equals(((DmtOptionalValueFieldWithSpaces)obj).toString()));
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
        sb.append(indent + "  \"name\": \"" + JSONUtil.escape(nameV.toString()) + "\"");
        if (descriptionV != null){
            sb.append(",\n");
            sb.append(indent + "  \"description\": \"" + JSONUtil.escape(descriptionV.toString()) + "\"");
        }

        if (otherTypeV != null){
            sb.append(",\n");
            sb.append(indent + "  \"otherType\": \"" + JSONUtil.escape(otherTypeV.toString()) + "\"");
        }

        sb.append("\n" + indent + "}");
    }

    public TypeDefinitionREF getType(){
        return(typeV);
    }

    public String getName(){
        return(nameV);
    }

    public String getDescription(){
        return(descriptionV);
    }

    public TypeDefinitionREF getOtherType(){
        return(otherTypeV);
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
                throw(new DmcValueException("Could not resolve reference to: " + typeV.getObjectName() + "(part: type - of type: TypeDefinition) via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)typeV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)typeV).setObject(obj);
        }
        
        if ((otherTypeV != null) && (!otherTypeV.isResolved())){
            obj = resolver.findNamedObject(otherTypeV.getObjectName());
            if (otherTypeAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + otherTypeV.getObjectName() + "(part: otherType - of type: TypeDefinition) via attribute: " + attrName));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)otherTypeV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)otherTypeV).setObject(obj);
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
                throw(new DmcValueException("Could not resolve reference to: " + typeV.getObjectName() + "(part: type - of type: TypeDefinition) via attribute: " + ai.name));
        
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
        
        if ((otherTypeV != null) && (!otherTypeV.isResolved())){
            obj = resolver.findNamedObjectMayClash(object, otherTypeV.getObjectName(), ncr, otherTypeAI);
            if (otherTypeAI.weakReference)
                return;
            if (obj == null)
                throw(new DmcValueException("Could not resolve reference to: " + otherTypeV.getObjectName() + "(part: otherType - of type: TypeDefinition) via attribute: " + ai.name));
        
            if (obj instanceof DmcContainerIF)
                ((DmcNamedObjectREF)otherTypeV).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
            else
                ((DmcNamedObjectREF)otherTypeV).setObject(obj);
        
            if (DmcOmni.instance().backRefTracking()){
                Modifier backrefMod = new Modifier("otherType", object, otherTypeV, ai.id, ai.name);
                if (obj instanceof DmcContainerIF)
                    ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);
                else
                    ((DmcObject)obj).addBackref(backrefMod);
                otherTypeV.setBackrefModifier(backrefMod);
            }
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:868)
    public void removeBackRefsFromValue(){
        // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:875)
        if (typeV != null){
            typeV.removeBackref();
        }
        
        // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:875)
        if (otherTypeV != null){
            otherTypeV.removeBackref();
        }
        
    }

}
