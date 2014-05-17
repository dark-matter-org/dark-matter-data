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
import java.util.Iterator;                                                  // To allow access to our definitions - (MetaDSDHelper.java:860)
import org.dmd.core.*;                                                      // Basic dark-matter infrastructure - (DmwFormatter.java:77)
import org.dmd.core.feedback.*;                                             // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:83)
import org.dmd.core.interfaces.DmcDefinitionIF;                             // Because this is a DS definition - (DmwFormatter.java:95)
import org.dmd.core.interfaces.DmcNamedObjectIF;                            // Required when managing definitions - (DmwFormatter.java:94)
import org.dmd.dms.server.extended.*;                                       // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:79)
import org.dmd.dms.server.extended.ActionDefinition;                        // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.AttributeDefinition;                     // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.ClassDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.ComplexTypeDefinition;                   // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.DSDefinitionModule;                      // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.Dependency;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.DependencyImplementation;                // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.DmsDefinition;                           // A definition from the DmsModule Module - (MetaDSDHelper.java:858)
import org.dmd.dms.server.extended.EnumDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.ExtendedReferenceTypeDefinition;         // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.RuleCategory;                            // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.RuleDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.RunContext;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.SchemaDefinition;                        // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.SliceDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.extended.TypeDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:872)
import org.dmd.dms.server.generated.dsd.DmsModuleScopedInterface;           // Because this is a DS module - (MetaDSDHelper.java:845)
import org.dmd.dms.server.util.DmcDefinitionSet;                            // Our base to provide definition set storage - (MetaDSDHelper.java:846)
import org.dmd.dms.shared.generated.dmo.*;                                  // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:80)
import org.dmd.dms.shared.generated.enums.*;                                // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:81)
import org.dmd.dms.shared.generated.types.*;                                // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:82)
import org.dmd.dms.shared.types.*;                                          // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:76)
import org.dmd.dms.shared.types.DotName;                                    // To support the find method for definitions - (MetaDSDHelper.java:861)
import org.dmd.dmw.*;                                                       // Base wrapper capabilities - (DmwFormatter.java:78)

/**
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:113)
 */
@SuppressWarnings("unused")
public class DmsModuleDMW extends org.dmd.dms.server.extended.DmsDefinition implements DmcDefinitionIF, DmcNamedObjectIF, DmsModuleScopedInterface  {

    // Generated from: org.dmd.util.artifact.java.MemberManager.getFormattedMembers(MemberManager.java:64)
    // Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperDefinitions(MetaDSDHelper.java:881)
    DmcDefinitionSet<DmsDefinition>                       DmsDefinitionDefs                      = new DmcDefinitionSet<DmsDefinition>("DmsModule-allDefinitions");                                          // All definitions associated with this module
    DmcDefinitionSet<ActionDefinition>                    ActionDefinitionDefs                   = new DmcDefinitionSet<ActionDefinition>("DmsModule-ActionDefinitionDefs");                                 // All ActionDefinition definitions
    DmcDefinitionSet<AttributeDefinition>                 AttributeDefinitionDefs                = new DmcDefinitionSet<AttributeDefinition>("DmsModule-AttributeDefinitionDefs");                           // All AttributeDefinition definitions
    DmcDefinitionSet<ClassDefinition>                     ClassDefinitionDefs                    = new DmcDefinitionSet<ClassDefinition>("DmsModule-ClassDefinitionDefs");                                   // All ClassDefinition definitions
    DmcDefinitionSet<ComplexTypeDefinition>               ComplexTypeDefinitionDefs              = new DmcDefinitionSet<ComplexTypeDefinition>("DmsModule-ComplexTypeDefinitionDefs");                       // All ComplexTypeDefinition definitions
    DmcDefinitionSet<ExtendedReferenceTypeDefinition>     ExtendedReferenceTypeDefinitionDefs    = new DmcDefinitionSet<ExtendedReferenceTypeDefinition>("DmsModule-ExtendedReferenceTypeDefinitionDefs");   // All ExtendedReferenceTypeDefinition definitions
    DmcDefinitionSet<DSDefinitionModule>                  DSDefinitionModuleDefs                 = new DmcDefinitionSet<DSDefinitionModule>("DmsModule-DSDefinitionModuleDefs");                             // All DSDefinitionModule definitions
    DmcDefinitionSet<Dependency>                          DependencyDefs                         = new DmcDefinitionSet<Dependency>("DmsModule-DependencyDefs");                                             // All Dependency definitions
    DmcDefinitionSet<DependencyImplementation>            DependencyImplementationDefs           = new DmcDefinitionSet<DependencyImplementation>("DmsModule-DependencyImplementationDefs");                 // All DependencyImplementation definitions
    DmcDefinitionSet<DmsModule>                           DmsModuleDefs                          = new DmcDefinitionSet<DmsModule>("DmsModule-DmsModuleDefs");                                               // All DmsModule definitions
    DmcDefinitionSet<EnumDefinition>                      EnumDefinitionDefs                     = new DmcDefinitionSet<EnumDefinition>("DmsModule-EnumDefinitionDefs");                                     // All EnumDefinition definitions
    DmcDefinitionSet<RuleCategory>                        RuleCategoryDefs                       = new DmcDefinitionSet<RuleCategory>("DmsModule-RuleCategoryDefs");                                         // All RuleCategory definitions
    DmcDefinitionSet<RuleDefinition>                      RuleDefinitionDefs                     = new DmcDefinitionSet<RuleDefinition>("DmsModule-RuleDefinitionDefs");                                     // All RuleDefinition definitions
    DmcDefinitionSet<RunContext>                          RunContextDefs                         = new DmcDefinitionSet<RunContext>("DmsModule-RunContextDefs");                                             // All RunContext definitions
    DmcDefinitionSet<SchemaDefinition>                    SchemaDefinitionDefs                   = new DmcDefinitionSet<SchemaDefinition>("DmsModule-SchemaDefinitionDefs");                                 // All SchemaDefinition definitions
    DmcDefinitionSet<SliceDefinition>                     SliceDefinitionDefs                    = new DmcDefinitionSet<SliceDefinition>("DmsModule-SliceDefinitionDefs");                                   // All SliceDefinition definitions
    DmcDefinitionSet<TypeDefinition>                      TypeDefinitionDefs                     = new DmcDefinitionSet<TypeDefinition>("DmsModule-TypeDefinitionDefs");                                     // All TypeDefinition definitions

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

    protected DmsModuleDMW(String mn) throws DMFeedbackSet {
        super(new DmsModuleDMO());
        mycore = (DmsModuleDMO) core;
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
     * Indicates the package that a schema will be part of when its code is
     * generated using DMO generator tool. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getSchemaPackage(){
        return(mycore.getSchemaPackage());
    }

    /**
     * Sets schemaPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setSchemaPackage(Object value) throws DMFeedbackSet {
        mycore.setSchemaPackage(value);
    }

    /**
     * The base identifier value for a schema. This value is added to each dmdID
     * value associated with the AttributeDefinitions defined by the schema. This
     * allows for easy rebasing of identifier values if required. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Integer getSchemaBaseID(){
        return(mycore.getSchemaBaseID());
    }

    /**
     * Sets schemaBaseID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setSchemaBaseID(Object value) throws DMFeedbackSet {
        mycore.setSchemaBaseID(value);
    }

    /**
     * The maximum number of attribute definitions in a particular schema. This
     * will provide immediate feedback if you exceed the given ID range for your
     * schema. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public Integer getSchemaIDRange(){
        return(mycore.getSchemaIDRange());
    }

    /**
     * Sets schemaIDRange to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
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

    /**
     * A list of files that contain the class, attribute and type definitions
     * that comprise a schema. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addDefFiles(Object value) throws DMFeedbackSet {
        mycore.addDefFiles(value);
    }

    /**
     * Returns the number of defFiles values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getDefFilesSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if defFiles has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getDefFilesHasValue(){
        return(getDefFilesSize() > 0);
    }

    /**
     * Indicates the package where server related Dark Matter Wrapper classes 
     * were generated for this schema. This is used when we're generating derived
     * wrapper classes. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getDmwPackage(){
        return(mycore.getDmwPackage());
    }

    /**
     * Sets dmwPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:344)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:412)
    public void addDmwTypeToPackage(Object value) throws DMFeedbackSet {
        mycore.addDmwTypeToPackage(value);
    }

    /**
     * Returns the number of dmwTypeToPackage values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getDmwTypeToPackageSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dmwTypeToPackage);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if dmwTypeToPackage has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
    public boolean getDmwTypeToPackageHasValue(){
        return(getDmwTypeToPackageSize() > 0);
    }

    /**
     * The dark-matter schema modules on which a module depends. 
     * @return An Iterator of DmsModule objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:320)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:402)
    public DmcAttribute<?> addDependsOnDmsModule(DmsModule value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addDependsOnDmsModule(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of dependsOnDmsModule values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:421)
    public int getDependsOnDmsModuleSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependsOnDmsModule);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if dependsOnDmsModule has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:432)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:429)
    // Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperFunctions(MetaDSDHelper.java:897)
    /**
     * All definitions are added to the base definition collection.
     */
    void addDmsDefinition(DmsDefinition def){
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addActionDefinition(ActionDefinition def){
        ActionDefinitionDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addAttributeDefinition(AttributeDefinition def){
        AttributeDefinitionDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addClassDefinition(ClassDefinition def){
        ClassDefinitionDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addComplexTypeDefinition(ComplexTypeDefinition def){
        ComplexTypeDefinitionDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addExtendedReferenceTypeDefinition(ExtendedReferenceTypeDefinition def){
        ExtendedReferenceTypeDefinitionDefs.add(def);
        addComplexTypeDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addDSDefinitionModule(DSDefinitionModule def){
        DSDefinitionModuleDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addDependency(Dependency def){
        DependencyDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addDependencyImplementation(DependencyImplementation def){
        DependencyImplementationDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addEnumDefinition(EnumDefinition def){
        EnumDefinitionDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addRuleCategory(RuleCategory def){
        RuleCategoryDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addRuleDefinition(RuleDefinition def){
        RuleDefinitionDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addRunContext(RunContext def){
        RunContextDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addSchemaDefinition(SchemaDefinition def){
        SchemaDefinitionDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addSliceDefinition(SliceDefinition def){
        SliceDefinitionDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:459)
    public void addTypeDefinition(TypeDefinition def){
        TypeDefinitionDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperFunctions(MetaDSDHelper.java:907)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        DmsModuleREF ref = ((DmsModuleDMO) core).getDefinedInDmsModule();
        return(ref.getName().getNameString());
    }

}
