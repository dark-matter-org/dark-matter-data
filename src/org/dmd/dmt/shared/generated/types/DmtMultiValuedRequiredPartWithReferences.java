package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:152)
import java.io.Serializable;                                               // To prevent serialization warnings - (NewComplexTypeFormatter.java:117)
import java.util.ArrayList;                                                // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:124)
import java.util.Iterator;                                                 // To support multi-valued optional parts - (NewComplexTypeFormatter.java:129)
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
import org.dmd.dms.generated.types.DmcTypeTypeDefinitionREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:1217)
import org.dmd.dms.generated.types.TypeDefinitionREF;                      // Object reference - (NewComplexTypeFormatter.java:1192)



@SuppressWarnings("serial")
/**
 * The DmtMultiValuedRequiredPartWithReferences class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:159)
 */
public class DmtMultiValuedRequiredPartWithReferences implements Serializable {

    final static int requiredParts = 1;

    // A bunch of types
    ArrayList<TypeDefinitionREF> typeV;

    final static DmcAttributeInfo typeAI = new DmcAttributeInfo("type",0,"TypeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public DmtMultiValuedRequiredPartWithReferences(){
    }

    /**
     * Copy constructor.
     */
    @SuppressWarnings("unchecked")
    public DmtMultiValuedRequiredPartWithReferences(DmtMultiValuedRequiredPartWithReferences original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1154)
        typeV = (ArrayList<TypeDefinitionREF>) original.typeV.clone();
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:190)
     */
    public DmtMultiValuedRequiredPartWithReferences(ArrayList<TypeDefinitionREF> type_) throws DmcValueException {
        if (type_ != null){
            typeV = new ArrayList<TypeDefinitionREF>();
            for(TypeDefinitionREF v: type_){
                typeV.add(DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(v));
            }
        }
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:273)
     */
    public DmtMultiValuedRequiredPartWithReferences(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:281)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: DmtMultiValuedRequiredPartWithReferences\nValue: " + initialInput));


        if (nvp.size() >= requiredParts){
            for(int i=0; i<nvp.size(); i++){
                if (typeV == null)
                    typeV = new ArrayList<TypeDefinitionREF>();
                typeV.add(DmcTypeTypeDefinitionREFSTATIC.instance.typeCheck(nvp.get(i).getValue()));
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
            boolean first = true;
            for(TypeDefinitionREF v: typeV){
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
        if (obj instanceof DmtMultiValuedRequiredPartWithReferences) {
            return(this.toString().equals(((DmtMultiValuedRequiredPartWithReferences)obj).toString()));
        }
        return(false);
    }
    /**
     * JSON form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:520)
     */
    public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
            sb.append(indent + "  \"type\": [\n");
            Iterator<TypeDefinitionREF> it = typeV.iterator();
            while(it.hasNext()){
                TypeDefinitionREF v = it.next();
                sb.append(indent + "  \"" + JSONUtil.escape(v.toString()) + "\"");
                if (it.hasNext())
                    sb.append(",");
            }
            sb.append("\n" + indent + "]");
        sb.append("\n" + indent + "}");
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:669)
    public Iterator<TypeDefinitionREF> getType(){
        if (typeV == null)
            return(null);
        return(typeV.iterator());
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:676)
    public boolean hasType(){
        if (typeV == null)
            return(false);
        return(true);
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:683)
    public int getTypeSize(){
        if (typeV == null)
            return(0);
        return(typeV.size());
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:690)
    public TypeDefinitionREF getType(int index){
        if (typeV == null)
            return(null);
        return(typeV.get(index));
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:708)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
        DmcNamedObjectIF  obj = null;

        if (typeV != null){
            for(TypeDefinitionREF v: typeV){
                if (v.isResolved())
                    continue;
                obj = resolver.findNamedObject(v.getObjectName());
                if (typeAI.weakReference)
                    return;
                if (obj == null)
                    throw(new DmcValueException("Could not resolve reference to: " + v.getObjectName() + " (part: type - of type: TypeDefinition) via attribute: " + attrName));
        
                if (obj instanceof DmcContainerIF)
                    ((DmcNamedObjectREF)v).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
                else
                    ((DmcNamedObjectREF)v).setObject(obj);
            }
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:779)
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DmcValueException, DmcValueExceptionSet {
        DmcNamedObjectIF  obj = null;

        if (typeV != null){
            for(TypeDefinitionREF v: typeV){
                if (v.isResolved())
                    continue;
                obj = resolver.findNamedObjectMayClash(object, v.getObjectName(), ncr, typeAI);
                if (typeAI.weakReference)
                    return;
                if (obj == null)
                    throw(new DmcValueException("Could not resolve reference to: " + v.getObjectName() + " via attribute: " + ai.name));
        
                if (obj instanceof DmcContainerIF)
                    ((DmcNamedObjectREF)v).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
                else
                    ((DmcNamedObjectREF)v).setObject(obj);
        
                if (DmcOmni.instance().backRefTracking()){
                    Modifier backrefMod = new Modifier("type", object, v, ai.id);
                    if (obj instanceof DmcContainerIF)
                        ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);
                    else
                        ((DmcObject)obj).addBackref(backrefMod);
                    v.setBackrefModifier(backrefMod);
                }
            }
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:868)
    public void removeBackRefsFromValue(){
        // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:904)
        if (typeV != null){
            for(TypeDefinitionREF v: typeV){
                v.removeBackref();
            }
        }
        
    }

}
