package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:134)
import java.io.Serializable;                                               // To prevent serialization warnings - (NewComplexTypeFormatter.java:100)
import java.util.ArrayList;                                                // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:107)
import java.util.Iterator;                                                 // To support multi-valued optional parts - (NewComplexTypeFormatter.java:111)
import org.dmd.dmc.DmcAttributeInfo;                                       // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:105)
import org.dmd.dmc.DmcContainerIF;                                         // To support object references - (NewComplexTypeFormatter.java:117)
import org.dmd.dmc.DmcInputStreamIF;                                       // Standard serialization techniques - (NewComplexTypeFormatter.java:101)
import org.dmd.dmc.DmcNameClashResolverIF;                                 // To support possible clashing object references - (NewComplexTypeFormatter.java:121)
import org.dmd.dmc.DmcNameResolverIF;                                      // To support object references - (NewComplexTypeFormatter.java:114)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                      // To support possible clashing object references - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.DmcNamedObjectIF;                                       // To support object references - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.DmcNamedObjectREF;                                      // To support object references - (NewComplexTypeFormatter.java:116)
import org.dmd.dmc.DmcObject;                                              // To support possible clashing object references - (NewComplexTypeFormatter.java:122)
import org.dmd.dmc.DmcOmni;                                                // To enable back reference tracking - (NewComplexTypeFormatter.java:124)
import org.dmd.dmc.DmcOutputStreamIF;                                      // Standard serialization techniques - (NewComplexTypeFormatter.java:102)
import org.dmd.dmc.DmcValueException;                                      // Standard value exception - (NewComplexTypeFormatter.java:129)
import org.dmd.dmc.DmcValueExceptionSet;                                   // To support possible clashing object references - (NewComplexTypeFormatter.java:123)
import org.dmd.dmc.types.Modifier;                                         // To enable back reference tracking - (NewComplexTypeFormatter.java:125)
import org.dmd.dmc.util.ComplexTypeSplitter;                               // For parsing initial input - (NewComplexTypeFormatter.java:106)
import org.dmd.dmc.util.ParsedNameValuePair;                               // To store values parsed from initial input - (NewComplexTypeFormatter.java:108)
import org.dmd.dms.generated.enums.DataTypeEnum;                           // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:103)
import org.dmd.dms.generated.enums.ValueTypeEnum;                          // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:104)
import org.dmd.dms.generated.types.DmcTypeTypeDefinitionREFSTATIC;         // Internally generated type - (NewComplexTypeFormatter.java:900)
import org.dmd.dms.generated.types.TypeDefinitionREF;                      // Object reference - (NewComplexTypeFormatter.java:875)



@SuppressWarnings("serial")
/**
 * The DmtMultiValuedRequiredPartWithReferences class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:141)
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
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:838)
        typeV = (ArrayList<TypeDefinitionREF>) original.typeV.clone();
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:172)
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:255)
     */
    public DmtMultiValuedRequiredPartWithReferences(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:263)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: DmtMultiValuedRequiredPartWithReferences"));


        if (nvp.size() > requiredParts){
            for(int i=1; i<nvp.size(); i++){
                if (nvp.get(i).getName() == null){
                    if (nvp.get(i).getValue() == null)
                        throw(new DmcValueException("Expecting a partname=\"some value\" in complex type: DmtMultiValuedRequiredPartWithReferences"));
                    else
                        throw(new DmcValueException("Expecting a partname=\"" + nvp.get(i).getValue() + "\" in complex type: DmtMultiValuedRequiredPartWithReferences"));
                }
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:388)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(typeV.toString());
        return(sb.toString());
    }

    public Iterator<TypeDefinitionREF> getType(){
        if (typeV == null)
            return(null);
        return(typeV.iterator());
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:496)
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
                    throw(new DmcValueException("Could not resolve reference to: " + v.getObjectName() + " via attribute: " + attrName));
        
                if (obj instanceof DmcContainerIF)
                    ((DmcNamedObjectREF)v).setObject((DmcNamedObjectIF) ((DmcContainerIF)obj).getDmcObject());
                else
                    ((DmcNamedObjectREF)v).setObject(obj);
            }
        }
        
    }

    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:545)
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
                    Modifier backrefMod = new Modifier("type", object, v);
                    if (obj instanceof DmcContainerIF)
                        ((DmcContainerIF)obj).getDmcObject().addBackref(backrefMod);
                    else
                        ((DmcObject)obj).addBackref(backrefMod);
                    v.setBackrefModifier(backrefMod);
                }
            }
        }
        
    }

}
