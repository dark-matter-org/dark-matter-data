package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:148)
import java.io.Serializable;                                               // To prevent serialization warnings - (NewComplexTypeFormatter.java:113)
import java.util.ArrayList;                                                // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:120)
import org.dmd.dmc.DmcAttributeInfo;                                       // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:118)
import org.dmd.dmc.DmcContainerIF;                                         // To support object references - (NewComplexTypeFormatter.java:131)
import org.dmd.dmc.DmcInputStreamIF;                                       // Standard serialization techniques - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcNameClashResolverIF;                                 // To support possible clashing object references - (NewComplexTypeFormatter.java:135)
import org.dmd.dmc.DmcNameResolverIF;                                      // To support object references - (NewComplexTypeFormatter.java:128)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                      // To support possible clashing object references - (NewComplexTypeFormatter.java:133)
import org.dmd.dmc.DmcNamedObjectIF;                                       // To support object references - (NewComplexTypeFormatter.java:129)
import org.dmd.dmc.DmcNamedObjectREF;                                      // To support object references - (NewComplexTypeFormatter.java:130)
import org.dmd.dmc.DmcObject;                                              // To support possible clashing object references - (NewComplexTypeFormatter.java:136)
import org.dmd.dmc.DmcOmni;                                                // To enable back reference tracking - (NewComplexTypeFormatter.java:138)
import org.dmd.dmc.DmcOutputStreamIF;                                      // Standard serialization techniques - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.DmcValueException;                                      // Standard value exception - (NewComplexTypeFormatter.java:143)
import org.dmd.dmc.DmcValueExceptionSet;                                   // To support possible clashing object references - (NewComplexTypeFormatter.java:137)
import org.dmd.dmc.types.Modifier;                                         // To enable back reference tracking - (NewComplexTypeFormatter.java:139)
import org.dmd.dmc.util.ComplexTypeSplitter;                               // For parsing initial input - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.util.JSONUtil;                                          // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:122)
import org.dmd.dmc.util.ParsedNameValuePair;                               // To store values parsed from initial input - (NewComplexTypeFormatter.java:121)
import org.dmd.dms.generated.enums.DataTypeEnum;                           // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:116)
import org.dmd.dms.generated.enums.ValueTypeEnum;                          // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:117)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;                    // Standard type - (NewComplexTypeFormatter.java:1141)
import org.dmd.dms.generated.types.DmcTypeTypeDefinitionREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:1141)
import org.dmd.dms.generated.types.TypeDefinitionREF;                      // Object reference - (NewComplexTypeFormatter.java:1116)



@SuppressWarnings("serial")
/**
 * The DmtOptionalValueFieldWithColons class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:155)
 */
public class DmtOptionalValueFieldWithColons implements Serializable {

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

    /**
     * Default constructor.
     */
    public DmtOptionalValueFieldWithColons(){
    }

    /**
     * Copy constructor.
     */
    public DmtOptionalValueFieldWithColons(DmtOptionalValueFieldWithColons original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1078)
        typeV =  original.typeV;
        nameV =  original.nameV;
        descriptionV =  original.descriptionV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:186)
     */
    public DmtOptionalValueFieldWithColons(TypeDefinitionREF type_, String name_, String description_) throws DmcValueException {
        typeV = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(type_);
        nameV = DmcTypeStringSTATIC.instance.typeCheck(name_);
        if (description_ != null)
            descriptionV = DmcTypeStringSTATIC.instance.typeCheck(description_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:269)
     */
    public DmtOptionalValueFieldWithColons(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:277)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput,':');

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: DmtOptionalValueFieldWithColons\nValue: " + initialInput));

        typeV = DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(nvp.get(0).getValue());
        nameV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(1).getValue());

        if (nvp.size() > requiredParts){
            for(int i=2; i<nvp.size(); i++){
                if (nvp.get(i).getName() == null){
                    if (nvp.get(i).getValue() == null)
                        throw(new DmcValueException("Expecting a partname=\"some value\" in complex type: DmtOptionalValueFieldWithColons\nValue: " + initialInput));
                    else
                        throw(new DmcValueException("Expecting a partname=\"" + nvp.get(i).getValue() + "\" in complex type: DmtOptionalValueFieldWithColons\nValue: " + initialInput));
                }
                if (nvp.get(i).getName().equals("description"))
                    descriptionV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(i).getValue());
                else{
                    throw(new DmcValueException("Unknown field for complex type DmtOptionalValueFieldWithColons: "  + nvp.get(i).getName()));
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
        sb.append(typeV.toString());
        sb.append(':');
        sb.append(nameV.toString());
        if (descriptionV != null){
            sb.append(':');
            sb.append("description=" + "\"" + descriptionV.toString() + "\"");
        }

        return(sb.toString());
    }

    /**
     * JSON form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:504)
     */
    public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
        sb.append(indent + "  \"type\": \"" + JSONUtil.escape(typeV.toString()) + "\",\n");
        sb.append(indent + "  \"name\": \"" + JSONUtil.escape(nameV.toString()) + "\"");
        if (descriptionV != null){
            sb.append(",\n");
            sb.append(indent + "  \"description\": \"" + JSONUtil.escape(descriptionV.toString()) + "\"");
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

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:692)
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
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:763)
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
                Modifier backrefMod = new Modifier("type", object, typeV, ai.id);
                if (obj instanceof DmcContainerIF)
                    ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);
                else
                    ((DmcObject)obj).addBackref(backrefMod);
                typeV.setBackrefModifier(backrefMod);
            }
        }
        
    }

}
