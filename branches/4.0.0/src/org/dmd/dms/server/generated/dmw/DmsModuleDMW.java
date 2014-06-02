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
import java.util.*;                                                         // To support access functions - (DmwFormatter.java:75)
import java.util.Iterator;                                                  // To allow access to our definitions - (MetaDSDHelper.java:970)
import org.dmd.core.*;                                                      // Basic dark-matter infrastructure - (DmwFormatter.java:77)
import org.dmd.core.feedback.*;                                             // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:83)
import org.dmd.core.interfaces.DmcNamedObjectIF;                            // Required when managing definitions - (DmwFormatter.java:94)
import org.dmd.dms.server.extended.*;                                       // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:79)
import org.dmd.dms.server.extended.ActionDefinition;                        // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.AttributeDefinition;                     // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.ClassDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.ComplexTypeDefinition;                   // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.DSDefinitionModule;                      // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.Dependency;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.DependencyImplementation;                // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.DmsDefinition;                           // A definition from the DmsModule Module - (MetaDSDHelper.java:968)
import org.dmd.dms.server.extended.EnumDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.ExtendedReferenceTypeDefinition;         // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.RuleCategory;                            // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.RuleDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.RunContext;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.SchemaDefinition;                        // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.SliceDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.extended.TypeDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:982)
import org.dmd.dms.server.generated.dsd.DmsModuleScopedInterface;           // Because this is a DS module - (MetaDSDHelper.java:955)
import org.dmd.dms.server.util.DmcDefinitionSetNew;                         // Our base to provide definition set storage - (MetaDSDHelper.java:956)
import org.dmd.dms.shared.generated.dmo.*;                                  // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:80)
import org.dmd.dms.shared.generated.enums.*;                                // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:81)
import org.dmd.dms.shared.generated.types.*;                                // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:82)
import org.dmd.dms.shared.types.*;                                          // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:76)
import org.dmd.dms.shared.types.DotName;                                    // To support the find method for definitions - (MetaDSDHelper.java:971)
import org.dmd.dmw.*;                                                       // Base wrapper capabilities - (DmwFormatter.java:78)

/**
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:113)
 */
@SuppressWarnings("unused")
public class DmsModuleDMW extends org.dmd.dms.server.extended.DmsDefinition implements DmcNamedObjectIF, DmsModuleScopedInterface  {

    // Generated from: org.dmd.util.artifact.java.MemberManager.getFormattedMembers(MemberManager.java:68)
    // Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperDefinitions(MetaDSDHelper.java:991)

    protected DmcDefinitionSetNew<DSDefinition>                        allDefinitions                         = new DmcDefinitionSetNew<DSDefinition>("DSDefinition");                                                                                         // All definitions associated with this module
    protected DmcDefinitionSetNew<DmsDefinition>                       DmsDefinitionDefs                      = new DmcDefinitionSetNew<DmsDefinition>("DmsDefinition", false, allDefinitions, allDefinitions);                                                // The base definition
    protected DmcDefinitionSetNew<ActionDefinition>                    ActionDefinitionDefs                   = new DmcDefinitionSetNew<ActionDefinition>("ActionDefinition",true, DmsDefinitionDefs, allDefinitions);                                         // All ActionDefinition definitions
    protected DmcDefinitionSetNew<AttributeDefinition>                 AttributeDefinitionDefs                = new DmcDefinitionSetNew<AttributeDefinition>("AttributeDefinition",true, DmsDefinitionDefs, allDefinitions);                                   // All AttributeDefinition definitions
    protected DmcDefinitionSetNew<ClassDefinition>                     ClassDefinitionDefs                    = new DmcDefinitionSetNew<ClassDefinition>("ClassDefinition",true, DmsDefinitionDefs, allDefinitions);                                           // All ClassDefinition definitions
    protected DmcDefinitionSetNew<ComplexTypeDefinition>               ComplexTypeDefinitionDefs              = new DmcDefinitionSetNew<ComplexTypeDefinition>("ComplexTypeDefinition",true, DmsDefinitionDefs, allDefinitions);                               // All ComplexTypeDefinition definitions
    protected DmcDefinitionSetNew<ExtendedReferenceTypeDefinition>     ExtendedReferenceTypeDefinitionDefs    = new DmcDefinitionSetNew<ExtendedReferenceTypeDefinition>("ExtendedReferenceTypeDefinition",true, ComplexTypeDefinitionDefs, allDefinitions);   // All ExtendedReferenceTypeDefinition definitions
    protected DmcDefinitionSetNew<DSDefinitionModule>                  DSDefinitionModuleDefs                 = new DmcDefinitionSetNew<DSDefinitionModule>("DSDefinitionModule",true, DmsDefinitionDefs, allDefinitions);                                     // All DSDefinitionModule definitions
    protected DmcDefinitionSetNew<Dependency>                          DependencyDefs                         = new DmcDefinitionSetNew<Dependency>("Dependency",true, DmsDefinitionDefs, allDefinitions);                                                     // All Dependency definitions
    protected DmcDefinitionSetNew<DependencyImplementation>            DependencyImplementationDefs           = new DmcDefinitionSetNew<DependencyImplementation>("DependencyImplementation",true, DmsDefinitionDefs, allDefinitions);                         // All DependencyImplementation definitions
    protected DmcDefinitionSetNew<DmsModule>                           DmsModuleDefs                          = new DmcDefinitionSetNew<DmsModule>("DmsModule",true, DmsDefinitionDefs, allDefinitions);                                                       // All DmsModule definitions
    protected DmcDefinitionSetNew<EnumDefinition>                      EnumDefinitionDefs                     = new DmcDefinitionSetNew<EnumDefinition>("EnumDefinition",true, DmsDefinitionDefs, allDefinitions);                                             // All EnumDefinition definitions
    protected DmcDefinitionSetNew<RuleCategory>                        RuleCategoryDefs                       = new DmcDefinitionSetNew<RuleCategory>("RuleCategory",true, DmsDefinitionDefs, allDefinitions);                                                 // All RuleCategory definitions
    protected DmcDefinitionSetNew<RuleDefinition>                      RuleDefinitionDefs                     = new DmcDefinitionSetNew<RuleDefinition>("RuleDefinition",true, DmsDefinitionDefs, allDefinitions);                                             // All RuleDefinition definitions
    protected DmcDefinitionSetNew<RunContext>                          RunContextDefs                         = new DmcDefinitionSetNew<RunContext>("RunContext",true, DmsDefinitionDefs, allDefinitions);                                                     // All RunContext definitions
    protected DmcDefinitionSetNew<SchemaDefinition>                    SchemaDefinitionDefs                   = new DmcDefinitionSetNew<SchemaDefinition>("SchemaDefinition",true, DmsDefinitionDefs, allDefinitions);                                         // All SchemaDefinition definitions
    protected DmcDefinitionSetNew<SliceDefinition>                     SliceDefinitionDefs                    = new DmcDefinitionSetNew<SliceDefinition>("SliceDefinition",true, DmsDefinitionDefs, allDefinitions);                                           // All SliceDefinition definitions
    protected DmcDefinitionSetNew<TypeDefinition>                      TypeDefinitionDefs                     = new DmcDefinitionSetNew<TypeDefinition>("TypeDefinition",true, DmsDefinitionDefs, allDefinitions);                                             // All TypeDefinition definitions

    private DmsModuleDMO mycore;

    protected DmsModuleDMW() {
        super(new DmsModuleDMO());
        mycore = (DmsModuleDMO) core;
        mycore.setContainer(this);
    }

    protected DmsModuleDMW(DmcObject obj) {
        super(obj);
        mycore = (DmsModuleDMO) core;
        mycore.setContainer(this);
    }

    protected DmsModuleDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DmsModuleDMO) core;
        mycore.setContainer(this);
    }

    public  DmsModuleDMO getDMO() {
        return(mycore);
    }

    protected DmsModuleDMW(ClassDefinition cd) {
        super(cd);
    }

    /**
     * How a name is composed will depend on the context in which it used. For
     * instance, the names of definitions specified as part of a dark-matter
     * schema will conform to conventions of naming classes and or attributes in
     * Java. <p/> The generated documentation for a set of Domain Specific
     * Language (DSL) concepts will indicate the rules that apply to a name in
     * that DSL. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setName(Object value) throws DMFeedbackSet {
        mycore.setName(value);
    }

    /**
     * Indicates the package that a schema will be part of when its code is
     * generated using DMO generator tool. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getSchemaPackage(){
        return(mycore.getSchemaPackage());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setSchemaPackage(Object value) throws DMFeedbackSet {
        mycore.setSchemaPackage(value);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value associated with the AttributeDefinitions defined by the schema. This
     * allows for easy rebasing of identifier values if required. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public Integer getSchemaBaseID(){
        return(mycore.getSchemaBaseID());
    }

    /**
     * Sets schemaBaseID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setSchemaBaseID(Object value) throws DMFeedbackSet {
        mycore.setSchemaBaseID(value);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide immediate feedback if you exceed the given ID range for your
     * schema. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public Integer getSchemaIDRange(){
        return(mycore.getSchemaIDRange());
    }

    /**
     * Sets schemaIDRange to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setSchemaIDRange(Object value) throws DMFeedbackSet {
        mycore.setSchemaIDRange(value);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:328)
    public StringIterableDMW getDescriptionIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:341)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:396)
    public void addDescription(Object value) throws DMFeedbackSet {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if description has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getDescriptionHasValue(){
        return(getDescriptionSize() > 0);
    }

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:328)
    public StringIterableDMW getDefFilesIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:396)
    public void addDefFiles(Object value) throws DMFeedbackSet {
        mycore.addDefFiles(value);
    }

    /**
     * Returns the number of defFiles values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getDefFilesSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if defFiles has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getDefFilesHasValue(){
        return(getDefFilesSize() > 0);
    }

    /**
     * The name of file that coresides with the schema.dms file that contains a
     * common header to be applied to all generated code. For instance, you might
     * want a common licensing comment at the top of your generated files. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getGeneratedFileHeader(){
        return(mycore.getGeneratedFileHeader());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setGeneratedFileHeader(Object value) throws DMFeedbackSet {
        mycore.setGeneratedFileHeader(value);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes 
     * were generated for this schema. This is used when we're generating derived
     * wrapper classes. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public String getDmwPackage(){
        return(mycore.getDmwPackage());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmwPackage(Object value) throws DMFeedbackSet {
        mycore.setDmwPackage(value);
    }

    /**
     * The dmwTypeToPackage attribute is used to indicate alternative generation
     * packages for the Dark Matter Wrapper (DMW) code generation mechanisms. For
     * instance, if we  want to generate GXT wrappers for use with Sencha's GXT
     * model classes, we could specify dmwTypeToPackage gxt com.example.client.
     * Each of schemas that's loaded for generation would have to have this same
     * attribute specified so that, if there were derived classes across schemas,
     * the appropriate wrapper derivations could be determined. See the
     * ClassDefintion.adjustClass() method to see how this is used. 
     * @return An Iterator of StringToString objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:328)
    public StringToStringIterableDMW getDmwTypeToPackageIterable(){
        DmcTypeStringToStringMV attr = (DmcTypeStringToStringMV) mycore.get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            return(StringToStringIterableDMW.emptyList);

        return(new StringToStringIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dmwTypeToPackage value.
     * @param value A value compatible with DmcTypeStringToStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:396)
    public void addDmwTypeToPackage(Object value) throws DMFeedbackSet {
        mycore.addDmwTypeToPackage(value);
    }

    /**
     * Returns the number of dmwTypeToPackage values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getDmwTypeToPackageSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if dmwTypeToPackage has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getDmwTypeToPackageHasValue(){
        return(getDmwTypeToPackageSize() > 0);
    }

    /**
     * The dark-matter schema modules on which a module depends. 
     * @return An Iterator of DmsModule objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:304)
    public DmsModuleIterableDMW getDependsOnDmsModule(){
        DmcTypeDmsModuleREFMV attr = (DmcTypeDmsModuleREFMV) mycore.get(MetaDMSAG.__dependsOnDmsModule);
        if (attr == null)
            return(DmsModuleIterableDMW.emptyList);

        return(new DmsModuleIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dependsOnDmsModule value.
     * @param value A value compatible with DmsModule
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addDependsOnDmsModule(DmsModule value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addDependsOnDmsModule(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of dependsOnDmsModule values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getDependsOnDmsModuleSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependsOnDmsModule);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if dependsOnDmsModule has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getDependsOnDmsModuleHasValue(){
        return(getDependsOnDmsModuleSize() > 0);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:524)
    // Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperFunctions(MetaDSDHelper.java:1019)
    /**
     * All definitions are added to the base definition collection.
     */
    void addDmsDefinition(DmsDefinition def) throws DMFeedbackSet {
        DmsDefinitionDefs.add(def);
    }

    public int getDmsDefinitionCount(){
        return(DmsDefinitionDefs.size());
    }

    public DmsDefinition getDmsDefinition(DotName name){
        return(DmsDefinitionDefs.getDefinition(name));
    }

    public Iterator<DmsDefinition> getAllDmsDefinition(){
        return(DmsDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addActionDefinition(ActionDefinition def) throws DMFeedbackSet {
        ActionDefinitionDefs.add(def);
    }

    public int getActionDefinitionCount(){
        return(ActionDefinitionDefs.size());
    }

    public ActionDefinition getActionDefinition(DotName name){
        return(ActionDefinitionDefs.getDefinition(name));
    }

    public Iterator<ActionDefinition> getAllActionDefinition(){
        return(ActionDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addAttributeDefinition(AttributeDefinition def) throws DMFeedbackSet {
        AttributeDefinitionDefs.add(def);
    }

    public int getAttributeDefinitionCount(){
        return(AttributeDefinitionDefs.size());
    }

    public AttributeDefinition getAttributeDefinition(DotName name){
        return(AttributeDefinitionDefs.getDefinition(name));
    }

    public Iterator<AttributeDefinition> getAllAttributeDefinition(){
        return(AttributeDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addClassDefinition(ClassDefinition def) throws DMFeedbackSet {
        ClassDefinitionDefs.add(def);
    }

    public int getClassDefinitionCount(){
        return(ClassDefinitionDefs.size());
    }

    public ClassDefinition getClassDefinition(DotName name){
        return(ClassDefinitionDefs.getDefinition(name));
    }

    public Iterator<ClassDefinition> getAllClassDefinition(){
        return(ClassDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addComplexTypeDefinition(ComplexTypeDefinition def) throws DMFeedbackSet {
        ComplexTypeDefinitionDefs.add(def);
    }

    public int getComplexTypeDefinitionCount(){
        return(ComplexTypeDefinitionDefs.size());
    }

    public ComplexTypeDefinition getComplexTypeDefinition(DotName name){
        return(ComplexTypeDefinitionDefs.getDefinition(name));
    }

    public Iterator<ComplexTypeDefinition> getAllComplexTypeDefinition(){
        return(ComplexTypeDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addExtendedReferenceTypeDefinition(ExtendedReferenceTypeDefinition def) throws DMFeedbackSet {
        ExtendedReferenceTypeDefinitionDefs.add(def);
    }

    public int getExtendedReferenceTypeDefinitionCount(){
        return(ExtendedReferenceTypeDefinitionDefs.size());
    }

    public ExtendedReferenceTypeDefinition getExtendedReferenceTypeDefinition(DotName name){
        return(ExtendedReferenceTypeDefinitionDefs.getDefinition(name));
    }

    public Iterator<ExtendedReferenceTypeDefinition> getAllExtendedReferenceTypeDefinition(){
        return(ExtendedReferenceTypeDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addDSDefinitionModule(DSDefinitionModule def) throws DMFeedbackSet {
        DSDefinitionModuleDefs.add(def);
    }

    public int getDSDefinitionModuleCount(){
        return(DSDefinitionModuleDefs.size());
    }

    public DSDefinitionModule getDSDefinitionModule(DotName name){
        return(DSDefinitionModuleDefs.getDefinition(name));
    }

    public Iterator<DSDefinitionModule> getAllDSDefinitionModule(){
        return(DSDefinitionModuleDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addDependency(Dependency def) throws DMFeedbackSet {
        DependencyDefs.add(def);
    }

    public int getDependencyCount(){
        return(DependencyDefs.size());
    }

    public Dependency getDependency(DotName name){
        return(DependencyDefs.getDefinition(name));
    }

    public Iterator<Dependency> getAllDependency(){
        return(DependencyDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addDependencyImplementation(DependencyImplementation def) throws DMFeedbackSet {
        DependencyImplementationDefs.add(def);
    }

    public int getDependencyImplementationCount(){
        return(DependencyImplementationDefs.size());
    }

    public DependencyImplementation getDependencyImplementation(DotName name){
        return(DependencyImplementationDefs.getDefinition(name));
    }

    public Iterator<DependencyImplementation> getAllDependencyImplementation(){
        return(DependencyImplementationDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addEnumDefinition(EnumDefinition def) throws DMFeedbackSet {
        EnumDefinitionDefs.add(def);
    }

    public int getEnumDefinitionCount(){
        return(EnumDefinitionDefs.size());
    }

    public EnumDefinition getEnumDefinition(DotName name){
        return(EnumDefinitionDefs.getDefinition(name));
    }

    public Iterator<EnumDefinition> getAllEnumDefinition(){
        return(EnumDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addRuleCategory(RuleCategory def) throws DMFeedbackSet {
        RuleCategoryDefs.add(def);
    }

    public int getRuleCategoryCount(){
        return(RuleCategoryDefs.size());
    }

    public RuleCategory getRuleCategory(DotName name){
        return(RuleCategoryDefs.getDefinition(name));
    }

    public Iterator<RuleCategory> getAllRuleCategory(){
        return(RuleCategoryDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addRuleDefinition(RuleDefinition def) throws DMFeedbackSet {
        RuleDefinitionDefs.add(def);
    }

    public int getRuleDefinitionCount(){
        return(RuleDefinitionDefs.size());
    }

    public RuleDefinition getRuleDefinition(DotName name){
        return(RuleDefinitionDefs.getDefinition(name));
    }

    public Iterator<RuleDefinition> getAllRuleDefinition(){
        return(RuleDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addRunContext(RunContext def) throws DMFeedbackSet {
        RunContextDefs.add(def);
    }

    public int getRunContextCount(){
        return(RunContextDefs.size());
    }

    public RunContext getRunContext(DotName name){
        return(RunContextDefs.getDefinition(name));
    }

    public Iterator<RunContext> getAllRunContext(){
        return(RunContextDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addSchemaDefinition(SchemaDefinition def) throws DMFeedbackSet {
        SchemaDefinitionDefs.add(def);
    }

    public int getSchemaDefinitionCount(){
        return(SchemaDefinitionDefs.size());
    }

    public SchemaDefinition getSchemaDefinition(DotName name){
        return(SchemaDefinitionDefs.getDefinition(name));
    }

    public Iterator<SchemaDefinition> getAllSchemaDefinition(){
        return(SchemaDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addSliceDefinition(SliceDefinition def) throws DMFeedbackSet {
        SliceDefinitionDefs.add(def);
    }

    public int getSliceDefinitionCount(){
        return(SliceDefinitionDefs.size());
    }

    public SliceDefinition getSliceDefinition(DotName name){
        return(SliceDefinitionDefs.getDefinition(name));
    }

    public Iterator<SliceDefinition> getAllSliceDefinition(){
        return(SliceDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:554)
    public void addTypeDefinition(TypeDefinition def) throws DMFeedbackSet {
        TypeDefinitionDefs.add(def);
    }

    public int getTypeDefinitionCount(){
        return(TypeDefinitionDefs.size());
    }

    public TypeDefinition getTypeDefinition(DotName name){
        return(TypeDefinitionDefs.getDefinition(name));
    }

    public Iterator<TypeDefinition> getAllTypeDefinition(){
        return(TypeDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperFunctions(MetaDSDHelper.java:1029)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        DmsModuleREF ref = ((DmsModuleDMO) core).getDefinedInDmsModule();
        return(ref.getName().getNameString());
    }

}
