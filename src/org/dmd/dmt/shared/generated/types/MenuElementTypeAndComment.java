package org.dmd.dmt.shared.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:149)
import java.io.Serializable;                                    // To prevent serialization warnings - (NewComplexTypeFormatter.java:114)
import java.util.ArrayList;                                     // To store ParsedNameValuePairs - (NewComplexTypeFormatter.java:121)
import org.dmd.dmc.DmcAttributeInfo;                            // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:119)
import org.dmd.dmc.DmcInputStreamIF;                            // Standard serialization techniques - (NewComplexTypeFormatter.java:115)
import org.dmd.dmc.DmcOutputStreamIF;                           // Standard serialization techniques - (NewComplexTypeFormatter.java:116)
import org.dmd.dmc.DmcValueException;                           // Standard value exception - (NewComplexTypeFormatter.java:144)
import org.dmd.dmc.util.ComplexTypeSplitter;                    // For parsing initial input - (NewComplexTypeFormatter.java:120)
import org.dmd.dmc.util.JSONUtil;                               // To perform escaping of things in JSON - (NewComplexTypeFormatter.java:123)
import org.dmd.dmc.util.ParsedNameValuePair;                    // To store values parsed from initial input - (NewComplexTypeFormatter.java:122)
import org.dmd.dms.generated.enums.DataTypeEnum;                // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:117)
import org.dmd.dms.generated.enums.ValueTypeEnum;               // For fake DmcAttributeInfo - (NewComplexTypeFormatter.java:118)
import org.dmd.dms.generated.types.DmcTypeStringSTATIC;         // Standard type - (NewComplexTypeFormatter.java:1214)



@SuppressWarnings("serial")
/**
 * The MenuElementTypeAndComment class.
 * This code was auto-generated and shouldn't be alterred manually.
 * 
 * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:156)
 */
public class MenuElementTypeAndComment implements Serializable {

    final static int requiredParts = 2;

    // The name of this implementation.
    String typeV;

    final static DmcAttributeInfo typeAI = new DmcAttributeInfo("type",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    // The class used to implement the required behaviour.
    String commentV;

    final static DmcAttributeInfo commentAI = new DmcAttributeInfo("comment",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN, 0, false);

    /**
     * Default constructor.
     */
    public MenuElementTypeAndComment(){
    }

    /**
     * Copy constructor.
     */
    public MenuElementTypeAndComment(MenuElementTypeAndComment original){
    // Generated from: org.dmd.dms.util.NewComplexTypeFormatter.getCopyConstructorAssignments(NewComplexTypeFormatter.java:1151)
        typeV =  original.typeV;
        commentV =  original.commentV;
    }

    /**
     * All fields constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:187)
     */
    public MenuElementTypeAndComment(String type_, String comment_) throws DmcValueException {
        typeV = DmcTypeStringSTATIC.instance.typeCheck(type_);
        commentV = DmcTypeStringSTATIC.instance.typeCheck(comment_);
    }

    /**
     * String based constructor.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:270)
     */
    public MenuElementTypeAndComment(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }
    /**
     * Initialize content based on string form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:278)
     */
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput,':');

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: MenuElementTypeAndComment\nValue: " + initialInput));

        typeV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(0).getValue());
        commentV = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(1).getValue());
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
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:404)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(typeV.toString());
        sb.append(':');
        sb.append(commentV.toString());
        return(sb.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MenuElementTypeAndComment) {
            return(this.toString().equals(((MenuElementTypeAndComment)obj).toString()));
        }
        return(false);
    }
    /**
     * JSON form.
     * Generated from: org.dmd.dms.util.NewComplexTypeFormatter.dumpComplexType(NewComplexTypeFormatter.java:517)
     */
    public void toJSON(StringBuffer sb, int padding, String indent){
        sb.append(indent + "{\n");
        sb.append(indent + "  \"type\": \"" + JSONUtil.escape(typeV.toString()) + "\",\n");
        sb.append(indent + "  \"comment\": \"" + JSONUtil.escape(commentV.toString()) + "\"");
        sb.append("\n" + indent + "}");
    }

    public String getType(){
        return(typeV);
    }

    public String getComment(){
        return(commentV);
    }

}
