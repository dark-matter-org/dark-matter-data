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
import java.util.*;                                  // To support access functions - (DmwFormatter.java:75)
import org.dmd.core.*;                               // Basic dark-matter infrastructure - (DmwFormatter.java:77)
import org.dmd.core.feedback.*;                      // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:83)
import org.dmd.dms.server.extended.*;                // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:79)
import org.dmd.dms.shared.generated.dmo.*;           // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:80)
import org.dmd.dms.shared.generated.enums.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:81)
import org.dmd.dms.shared.generated.types.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:82)
import org.dmd.dms.shared.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:76)
import org.dmd.dmw.*;                                // Base wrapper capabilities - (DmwFormatter.java:78)

/**
 * The DSDefinitionModule is a definition that defines a collection of
 * definitions and provides a basis for the generation of various artifacts
 * that allow for parsing and management of that set of definitions. <p/> The
 * specific of a definition module will result in the generation of a
 * ClassDefinition for the specified module type and thus, the dmdID
 * associated with it must be unique across the set of classes that comprise
 * the definitions encompassed by the module. <p/> The ClassDefinition will
 * be named by name and will have the may and must attributes specified as
 * part of the DSDefinitionModule. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:113)
 */
@SuppressWarnings("unused")
public class DSDefinitionModuleDMW extends org.dmd.dms.server.extended.DmsDefinition  {

    private DSDefinitionModuleDMO mycore;

    protected DSDefinitionModuleDMW() {
        super(new DSDefinitionModuleDMO());
        mycore = (DSDefinitionModuleDMO) core;
        mycore.setContainer(this);
    }

    protected DSDefinitionModuleDMW(DmcObject obj) {
        super(obj);
        mycore = (DSDefinitionModuleDMO) core;
        mycore.setContainer(this);
    }

    protected DSDefinitionModuleDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DSDefinitionModuleDMO) core;
        mycore.setContainer(this);
    }

    public  DSDefinitionModuleDMO getDMO() {
        return(mycore);
    }

    protected DSDefinitionModuleDMW(ClassDefinition cd) {
        super(cd);
    }

    protected DSDefinitionModuleDMW(String mn) throws DMFeedbackSet {
        super(new DSDefinitionModuleDMO());
        mycore = (DSDefinitionModuleDMO) core;
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
     * Indicates the extension of files of a particular type. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getFileExtension(){
        return(mycore.getFileExtension());
    }

    /**
     * Sets fileExtension to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setFileExtension(Object value) throws DMFeedbackSet {
        mycore.setFileExtension(value);
    }

    /**
     * Dark-matter identifiers facilitate the compact serialization of
     * dark-matter objects (DMOs); see the serializeIt() and deserializeIt()
     * methods of the DmcObject. <p/> This mechanism also allows for compact
     * transport of dark-matter objects when used with Google Web Toolkit (GWT)
     * RPC mechanisms. When objects are passed back and forth via RPC, the
     * dark-matter identifiers are used instead of the string-based attribute
     * names, which are usually much more lengthy. This optimization is
     * transparently supported by the  DmcObject; you don't need to worry about
     * how it's achieved. <p/> However, if you're curious, have a look at the
     * Compact Schema documentation. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Integer getDmdID(){
        return(mycore.getDmdID());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setDmdID(Object value) throws DMFeedbackSet {
        mycore.setDmdID(value);
    }

    /**
     * The name of the class that will be generated as a result of a
     * DSDefinitionModule definition. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getModuleClassName(){
        return(mycore.getModuleClassName());
    }

    /**
     * Sets moduleClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setModuleClassName(Object value) throws DMFeedbackSet {
        mycore.setModuleClassName(value);
    }

    /**
     * The name of the attribute in a DSDefinitionModule that indicates a
     * dependence on another module of the same type. For example, in dark-matter
     * schemas, the SchemaDefinition uses the dependsOn attribute to refer to
     * oher schemas. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public AttributeDefinition getModuleDependenceAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) mycore.get(MetaDMSAG.__moduleDependenceAttribute);
        if (attr == null)
            return(null);
        AttributeDefinitionDMO obj = attr.getSV().getObject();
        return((AttributeDefinition)obj.getContainer());
    }

    /**
     * Sets moduleDependenceAttribute to the specified value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:193)
    public void setModuleDependenceAttribute(AttributeDefinition value) throws DMFeedbackSet {
        mycore.setModuleDependenceAttribute(value.getDmcObject());
    }

    /**
     * A reference to the DSDefinition derived class that is the base class for a
     *  set of definition classes. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public DSDefinition getBaseDefinition(){
        DmcTypeDSDefinitionREFSV attr = (DmcTypeDSDefinitionREFSV) mycore.get(MetaDMSAG.__baseDefinition);
        if (attr == null)
            return(null);
        DSDefinitionDMO obj = attr.getSV().getObject();
        return((DSDefinition)obj.getContainer());
    }

    /**
     * Sets baseDefinition to the specified value.
     * @param value A value compatible with DSDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:193)
    public void setBaseDefinition(DSDefinition value) throws DMFeedbackSet {
        mycore.setBaseDefinition(value.getDmcObject());
    }

    /**
     * A reference to another DSDefinitionModule from which the current module
     * makes use of definitions. For instance, the Model View Whatever DSD
     * includes references to schema related definitions. As a result of
     * specifying this, the module class that's generated for the
     * DSDefinitionModule will include the moduleDependenceAttribute of the
     * module from which definitions are used. Likewise, the generated parser
     * will be primed with the schema of the required definition module. 
     * @return An Iterator of DSDefinitionModule objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public DSDefinitionModuleIterableDMW getRefersToDefsFromDSD(){
        DmcTypeDSDefinitionModuleREFMV attr = (DmcTypeDSDefinitionModuleREFMV) mycore.get(MetaDMSAG.__refersToDefsFromDSD);
        if (attr == null)
            return(DSDefinitionModuleIterableDMW.emptyList);

        return(new DSDefinitionModuleIterableDMW(attr.getMV()));
    }

    /**
     * Adds another refersToDefsFromDSD value.
     * @param value A value compatible with DSDefinitionModule
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addRefersToDefsFromDSD(DSDefinitionModule value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addRefersToDefsFromDSD(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of refersToDefsFromDSD values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getRefersToDefsFromDSDSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__refersToDefsFromDSD);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if refersToDefsFromDSD has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getRefersToDefsFromDSDHasValue(){
        return(getRefersToDefsFromDSDSize() > 0);
    }

    /**
     * The name of the attribute that will be set on all definitions associated
     * with a DSD to indicate the module from which a definition was loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public AttributeDefinition getDefinedInModuleAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) mycore.get(MetaDMSAG.__definedInModuleAttribute);
        if (attr == null)
            return(null);
        AttributeDefinitionDMO obj = attr.getSV().getObject();
        return((AttributeDefinition)obj.getContainer());
    }

    /**
     * Sets definedInModuleAttribute to the specified value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:193)
    public void setDefinedInModuleAttribute(AttributeDefinition value) throws DMFeedbackSet {
        mycore.setDefinedInModuleAttribute(value.getDmcObject());
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY have. When
     * accessed in Java, this is a set of references to AttributeDefinition
     * objects. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public AttributeDefinitionIterableDMW getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another may value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addMay(AttributeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addMay(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of may values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getMaySize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if may has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getMayHasValue(){
        return(getMaySize() > 0);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
    public AttributeDefinitionIterableDMW getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another must value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addMust(AttributeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addMust(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of must values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getMustSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if must has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getMustHasValue(){
        return(getMustSize() > 0);
    }

    /**
     * If this flag is set to true, the loadSchemaClass attribute will be added
     * to the generated domain specific module definition class so that
     * additional schemas (usually containg auxiliary classes) can be loaded
     * dynamically. This allows the generated module parser to handle auxiliary
     * information on the domain specific definitions. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Boolean getSupportDynamicSchemaLoading(){
        return(mycore.getSupportDynamicSchemaLoading());
    }

    /**
     * Sets supportDynamicSchemaLoading to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setSupportDynamicSchemaLoading(Object value) throws DMFeedbackSet {
        mycore.setSupportDynamicSchemaLoading(value);
    }

    /**
     * A set of base module files that should be loaded before parsing of any
     * other modules associated with the DSD being defined. For example, the
     * dmdgpb (augmented Googoe Protocol Buffer specifications) DSD always
     * requires that the gpbbase.gpb file is loaded because it defines the base
     * types of the fields that comprise messages. By specifying gpbbase.gpb as a
     * requiredBaseModule, the generated parsing coordinator will ensure that
     * this module is loaded on start-up. <p/> You should specify just the name
     * of the module file to be loaded, not the file extension. The file
     * extension is assumed to be fileExtension associated with the DSD. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
    public StringIterableDMW getRequiredBaseModuleIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__requiredBaseModule);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    /**
     * Adds another requiredBaseModule value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addRequiredBaseModule(Object value) throws DMFeedbackSet {
        mycore.addRequiredBaseModule(value);
    }

    /**
     * Returns the number of requiredBaseModule values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getRequiredBaseModuleSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__requiredBaseModule);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if requiredBaseModule has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getRequiredBaseModuleHasValue(){
        return(getRequiredBaseModuleSize() > 0);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public SchemaDefinition getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) mycore.get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);
        SchemaDefinitionDMO obj = attr.getSV().getObject();
        return((SchemaDefinition)obj.getContainer());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with SchemaDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:193)
    public void setDefinedIn(SchemaDefinition value) throws DMFeedbackSet {
        mycore.setDefinedIn(value.getDmcObject());
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
        DmsModuleREF ref = ((DSDefinitionModuleDMO) core).getDefinedInDmsModule();
        return(ref.getName().getNameString());
    }

}
