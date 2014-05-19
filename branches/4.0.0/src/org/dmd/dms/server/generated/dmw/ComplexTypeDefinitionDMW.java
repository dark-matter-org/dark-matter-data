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
package org.dmd.dms.server.generated.dmw;


// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:105)
import java.util.*;                                     // To support access functions - (DmwFormatter.java:75)
import org.dmd.core.*;                                  // Basic dark-matter infrastructure - (DmwFormatter.java:77)
import org.dmd.core.feedback.*;                         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:83)
import org.dmd.core.interfaces.DmcDefinitionIF;         // Because this is a DS definition - (DmwFormatter.java:91)
import org.dmd.dms.server.extended.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:79)
import org.dmd.dms.shared.generated.dmo.*;              // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:80)
import org.dmd.dms.shared.generated.enums.*;            // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:81)
import org.dmd.dms.shared.generated.types.*;            // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:82)
import org.dmd.dms.shared.types.*;                      // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:76)
import org.dmd.dmw.*;                                   // Base wrapper capabilities - (DmwFormatter.java:78)

/**
 * The ComplexTypeDefinition provides a mechanism for defining the structure
 * of a complex type composed of other types. From this definition, a new
 * DmcType is generated that has all of the required methods automatically
 * defined. <p/> An example definition is the RuleParam: <pre>
 * ComplexTypeDefinition name			RuleParam fieldSeparator : field String
 * importStatement The import for the type of parameter field String
 * genericArgs     The generic arguments associated with this parameter field
 * String name            The name of the parameter field String description 
 *    A description of the parameter description The RuleParam type is used
 * to succintly describe a parameter  to be supplied to a rule when it is
 * executed. </pre> In this case, the type has four fields, all of String
 * type. An example of the String format of the field might be: <pre>
 * org.dmc.DmcObject::obj:The object to be validated</pre> In this case, the
 * generic args field isn't available and will be the empty string. When a
 * field seperator is specified, all fields are, more or less optional, but
 * the underlying type must be able to handle the empty string as a valid
 * value. This wouldn't work with Integer. <p/> If no field separator is
 * specified, the separator is assumed to be whitespace and additional
 * whitespace is consumed during the parsing. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:113)
 */
@SuppressWarnings("unused")
public class ComplexTypeDefinitionDMW extends org.dmd.dms.server.extended.DmsDefinition implements DmcDefinitionIF  {

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

    public  ComplexTypeDefinitionDMO getDMO() {
        return(mycore);
    }

    protected ComplexTypeDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected ComplexTypeDefinitionDMW(String mn) throws DMFeedbackSet {
        super(new ComplexTypeDefinitionDMO());
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * How a name is composed will depend on the context in which it used. For
     * instance, the names of definitions specified as part of a dark-matter
     * schema will conform to conventions of naming classes and or attributes in
     * Java. <p/> The generated documentation for a set of Domain Specific
     * Language (DSL) concepts will indicate the rules that apply to a name in
     * that DSL. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setName(Object value) throws DMFeedbackSet {
        mycore.setName(value);
    }

    /**
     * Indicates a required part of a complex type definition. 
     * @return An Iterator of Part objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public PartIterableDMW getRequiredPartIterable(){
        DmcTypePartMV attr = (DmcTypePartMV) mycore.get(MetaDMSAG.__requiredPart);
        if (attr == null)
            return(PartIterableDMW.emptyList);

        return(new PartIterableDMW(attr.getMV()));
    }

    /**
     * Adds another requiredPart value.
     * @param value A value compatible with DmcTypePartMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addRequiredPart(Object value) throws DMFeedbackSet {
        mycore.addRequiredPart(value);
    }

    /**
     * Returns the number of requiredPart values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getRequiredPartSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__requiredPart);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if requiredPart has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getRequiredPartHasValue(){
        return(getRequiredPartSize() > 0);
    }

    /**
     * Indicates an optional part of a complex type definition. 
     * @return An Iterator of Part objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public PartIterableDMW getOptionalPartIterable(){
        DmcTypePartMV attr = (DmcTypePartMV) mycore.get(MetaDMSAG.__optionalPart);
        if (attr == null)
            return(PartIterableDMW.emptyList);

        return(new PartIterableDMW(attr.getMV()));
    }

    /**
     * Adds another optionalPart value.
     * @param value A value compatible with DmcTypePartMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addOptionalPart(Object value) throws DMFeedbackSet {
        mycore.addOptionalPart(value);
    }

    /**
     * Returns the number of optionalPart values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getOptionalPartSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__optionalPart);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if optionalPart has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getOptionalPartHasValue(){
        return(getOptionalPartSize() > 0);
    }

    /**
     * The fieldSeparator is used to indicate the separation character used when
     * a ComplexType is represented as a String. If a fieldSeparator isn't
     * specified, it is assumed to be a space. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getFieldSeparator(){
        return(mycore.getFieldSeparator());
    }

    /**
     * Sets fieldSeparator to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setFieldSeparator(Object value) throws DMFeedbackSet {
        mycore.setFieldSeparator(value);
    }

    /**
     * The extendedClass indicates the fully qualified name of the class that is
     * derived from the generated ComplexType to provide additional behaviour. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getExtendedClass(){
        return(mycore.getExtendedClass());
    }

    /**
     * Sets extendedClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setExtendedClass(Object value) throws DMFeedbackSet {
        mycore.setExtendedClass(value);
    }

    /**
     * The detailed description of some concept definition. The description is
     * multi-valued and is used in the generation of documentation. By
     * convention, it should follow XHTML guidelines in terms of its content. 
     * <p/> Also by convention, the first element of the description should be a
     * short, simple indication of the concept that is suitable for inclusion as
     * a code comment; this is primarily used in dark-matter schema (DMS)
     * specifications since dark-matter object (DMO) and dark-matter wrapper
     * (DMW) Java code is generated from these specifications. <p/> When defining
     * your own Domain Specific Languages (DSLs), feel free to follow whatever
     * conventions make sense for your purposes. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public StringIterableDMW getDescriptionIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:357)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DMFeedbackSet e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addDescription(Object value) throws DMFeedbackSet {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if description has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getDescriptionHasValue(){
        return(getDescriptionSize() > 0);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:271)

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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperFunctions(MetaDSDHelper.java:927)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        DmsModuleREF ref = ((ComplexTypeDefinitionDMO) core).getDefinedInDmsModule();
        return(ref.getName().getNameString());
    }

}
