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
package org.dmd.dms.generated.dmw;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1638)
import java.util.*;                                     // To support access functions - (MetaGenerator.java:1611)
import org.dmd.dmc.*;                                   // Basic dark-matter infrastructure - (MetaGenerator.java:1613)
import org.dmd.dmc.definitions.DmcDefinitionIF;         // Because this is a DS definition - (MetaGenerator.java:1626)
import org.dmd.dmc.types.*;                             // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1612)
import org.dmd.dms.*;                                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1619)
import org.dmd.dms.generated.dmo.*;                     // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1615)
import org.dmd.dms.generated.enums.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1616)
import org.dmd.dms.generated.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1617)
import org.dmd.dmw.*;                                   // Base wrapper capabilities - (MetaGenerator.java:1614)
import org.dmd.util.exceptions.*;                       // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1618)

/**
 * The ComplexTypeDefinition provides a mechanism for defining the structure
 * of\n a complex type composed of other types. From this definition, a new
 * DmcType is generated that\n has all of the required methods automatically
 * defined.\n <p/>\n An example definition is the RuleParam:\n <pre>\n
 * ComplexTypeDefinition\n name			RuleParam\n fieldSeparator :\n field String
 * importStatement The import for the type of parameter\n field String
 * genericArgs     The generic arguments associated with this parameter\n
 * field String name            The name of the parameter\n field String
 * description     A description of the parameter\n description The RuleParam
 * type is used to succintly describe a parameter\n  to be supplied to a rule
 * when it is executed.\n </pre>\n In this case, the type has four fields,
 * all of String type. An example of the String\n format of the field might
 * be: <pre> org.dmc.DmcObject::obj:The object to be validated</pre> In
 * this\n case, the generic args field isn't available and will be the empty
 * string. When a field\n seperator is specified, all fields are, more or
 * less optional, but the underlying type\n must be able to handle the empty
 * string as a valid value. This wouldn't work with Integer.\n <p/>\n If no
 * field separator is specified, the separator is assumed to be whitespace
 * and additional\n whitespace is consumed during the parsing. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1647)
 */
@SuppressWarnings("unused")
public class ComplexTypeDefinitionDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

    private ComplexTypeDefinitionDMO mycore;

    protected ComplexTypeDefinitionDMW() {
        super(new ComplexTypeDefinitionDMO());
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ComplexTypeDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ComplexTypeDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        core   = obj;
        mycore = (ComplexTypeDefinitionDMO) obj;
        obj.setContainer(this);
    }

    public  ComplexTypeDefinitionDMO getDMO() {
        return(mycore);
    }

    protected ComplexTypeDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected ComplexTypeDefinitionDMW(String mn) throws DmcValueException {
        super(new ComplexTypeDefinitionDMO());
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2400)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2473)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The field indicates a type and name for a field in a ComplexType. 
     * @return An Iterator of Field objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2609)
    public Iterator<Field> getField(){
        DmcTypeFieldMV attr = (DmcTypeFieldMV) mycore.get(MetaDMSAG.__field);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another field value.
     * @param value A value compatible with DmcTypeFieldMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2689)
    public void addField(Object value) throws DmcValueException {
        mycore.addField(value);
    }

    /**
     * Returns the number of field values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2702)
    public int getFieldSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__field);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates a required part of a complex type definition. 
     * @return An Iterator of Part objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2609)
    public Iterator<Part> getRequiredPart(){
        DmcTypePartMV attr = (DmcTypePartMV) mycore.get(MetaDMSAG.__requiredPart);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another requiredPart value.
     * @param value A value compatible with DmcTypePartMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2689)
    public void addRequiredPart(Object value) throws DmcValueException {
        mycore.addRequiredPart(value);
    }

    /**
     * Returns the number of requiredPart values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2702)
    public int getRequiredPartSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__requiredPart);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates an optional part of a complex type definition. 
     * @return An Iterator of Part objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2609)
    public Iterator<Part> getOptionalPart(){
        DmcTypePartMV attr = (DmcTypePartMV) mycore.get(MetaDMSAG.__optionalPart);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another optionalPart value.
     * @param value A value compatible with DmcTypePartMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2689)
    public void addOptionalPart(Object value) throws DmcValueException {
        mycore.addOptionalPart(value);
    }

    /**
     * Returns the number of optionalPart values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2702)
    public int getOptionalPartSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__optionalPart);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The fieldSeparator is used to indicate the separation character used\n
     * when a ComplexType is represented as a String. If a fieldSeparator isn't
     * specified, it is\n assumed to be a space. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2400)
    public String getFieldSeparator(){
        return(mycore.getFieldSeparator());
    }

    /**
     * Sets fieldSeparator to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2473)
    public void setFieldSeparator(Object value) throws DmcValueException {
        mycore.setFieldSeparator(value);
    }

    /**
     * The extendedClass indicates the fully qualified name of the class\n that
     * is derived from the generated ComplexType to provide additional behaviour. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2400)
    public String getExtendedClass(){
        return(mycore.getExtendedClass());
    }

    /**
     * Sets extendedClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2473)
    public void setExtendedClass(Object value) throws DmcValueException {
        mycore.setExtendedClass(value);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2609)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2623)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DmcValueException e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2689)
    public void addDescription(Object value) throws DmcValueException {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2702)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1814)

    /**
     * @return The name of this object from the name attribute.
     */
    public DefinitionName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}
