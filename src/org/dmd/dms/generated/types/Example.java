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
package org.dmd.dms.generated.types;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaComplexTypeFormatter.dumpComplexType(MetaComplexTypeFormatter.java:101)
import java.io.Serializable;                              // Marker interface for serialization - (MetaComplexTypeFormatter.java:76)
import java.util.ArrayList;                               // To store ParsedNameValuePairs - (MetaComplexTypeFormatter.java:83)
import org.dmd.dmc.DmcAttributeInfo;                      // For fake DmcAttributeInfo - (MetaComplexTypeFormatter.java:81)
import org.dmd.dmc.DmcInputStreamIF;                      // To support serialization - (MetaComplexTypeFormatter.java:77)
import org.dmd.dmc.DmcOutputStreamIF;                     // To support serialization - (MetaComplexTypeFormatter.java:78)
import org.dmd.dmc.DmcValueException;                     // For type checking - (MetaComplexTypeFormatter.java:97)
import org.dmd.dmc.util.ComplexTypeSplitter;              // For parsing initial input - (MetaComplexTypeFormatter.java:82)
import org.dmd.dmc.util.ParsedNameValuePair;              // To store values parsed from initial input - (MetaComplexTypeFormatter.java:84)
import org.dmd.dms.generated.enums.DataTypeEnum;          // For fake DmcAttributeInfo - (MetaComplexTypeFormatter.java:79)
import org.dmd.dms.generated.enums.ValueTypeEnum;         // For fake DmcAttributeInfo - (MetaComplexTypeFormatter.java:80)



@SuppressWarnings("serial")
/**
 * The Example class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.meta.MetaComplexTypeFormatter.dumpComplexType(MetaComplexTypeFormatter.java:108)
 */
public class Example implements Serializable {

    // The type of the example - this is just a single token string that gives a hint to your example formatter of what to do with the content
    String type;
    final static DmcAttributeInfo typeAI = new DmcAttributeInfo("type",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // A title for the example - this doesn't have to be used by your example formatter
    String title;
    final static DmcAttributeInfo titleAI = new DmcAttributeInfo("title",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    // The textual content of the example - this can be anything you want
    String content;
    final static DmcAttributeInfo contentAI = new DmcAttributeInfo("content",0,"String",ValueTypeEnum.SINGLE,DataTypeEnum.UNKNOWN);

    final static int requiredParts = 3;

    /**
     * Default constructor.
     */
    public Example(){
    }

    /**
     * Copy constructor.
     */
    public Example(Example original){
        type = original.type;
        title = original.title;
        content = original.content;
    }

    // Generated from: org.dmd.dms.meta.MetaComplexTypeFormatter.dumpComplexType(MetaComplexTypeFormatter.java:133)
    /**
     * All fields constructor.
     */
    public Example(String f1, String f2, String f3) throws DmcValueException {
        type = DmcTypeStringSTATIC.instance.typeCheck(f1);
        title = DmcTypeStringSTATIC.instance.typeCheck(f2);
        content = DmcTypeStringSTATIC.instance.typeCheck(f3);
    }

    // Generated from: org.dmd.dms.meta.MetaComplexTypeFormatter.dumpComplexType(MetaComplexTypeFormatter.java:160)
    /**
     * String based constructor.
     */
    public Example(String initialInput) throws DmcValueException {
        initialize(initialInput);
    }

    // Generated from: org.dmd.dms.meta.MetaComplexTypeFormatter.dumpComplexType(MetaComplexTypeFormatter.java:168)
    void initialize(String initialInput) throws DmcValueException {
        ArrayList<ParsedNameValuePair> nvp = ComplexTypeSplitter.parse(initialInput,':', 2);

        if (nvp.size() < requiredParts)
            throw(new DmcValueException("Missing required values for complex type: Example"));

        type = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(0).getValue());
        title = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(1).getValue());
        content = DmcTypeStringSTATIC.instance.typeCheck(nvp.get(2).getValue());
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
     * Generated from: org.dmd.dms.meta.MetaComplexTypeFormatter.dumpComplexType(MetaComplexTypeFormatter.java:257)
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(type.toString());
        sb.append(':');
        sb.append(title.toString());
        sb.append(':');
        sb.append(content.toString());
        return(sb.toString());
    }

    public String getType(){
        return(type);
    }

    public String getTitle(){
        return(title);
    }

    public String getContent(){
        return(content);
    }

    public void toJSON(StringBuffer sb, int padding, String indent) {
        throw(new IllegalStateException("This needs to be implemented"));
    }

}
