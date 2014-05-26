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
package org.dmd.dms.server.generated.dsd;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:282)
import java.util.Iterator;                                                  // To allow access to our definitions - (MetaDSDHelper.java:270)
import org.dmd.core.DmcNameClashObjectSet;                                  // Used when resolving clashes - (MetaDSDHelper.java:279)
import org.dmd.core.DmcObject;                                              // To support object resolution - (MetaDSDHelper.java:275)
import org.dmd.core.DmcObjectName;                                          // To support object resolution - (MetaDSDHelper.java:276)
import org.dmd.core.feedback.DMFeedbackSet;                                 // Can be thrown when we try to resolve references - (MetaDSDHelper.java:277)
import org.dmd.core.feedback.DmcNameClashException;                         // Used when resolving clashes - (MetaDSDHelper.java:280)
import org.dmd.core.interfaces.DmcNameClashResolverIF;                      // To support object resolution - (MetaDSDHelper.java:272)
import org.dmd.core.interfaces.DmcNameResolverWithClashSupportIF;           // To support object resolution - (MetaDSDHelper.java:273)
import org.dmd.core.interfaces.DmcNamedObjectIF;                            // To support object resolution - (MetaDSDHelper.java:274)
import org.dmd.core.schema.DmcAttributeInfo;                                // Used when resolving clashes - (MetaDSDHelper.java:278)
import org.dmd.dms.server.extended.ActionDefinition;                        // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.AttributeDefinition;                     // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.ClassDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.ComplexTypeDefinition;                   // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.DSDefinition;                            // The base of all definitions - (MetaDSDHelper.java:267)
import org.dmd.dms.server.extended.DSDefinitionModule;                      // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.Dependency;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.DependencyImplementation;                // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.DmsDefinition;                           // The base definition of the DmsModule Module - (MetaDSDHelper.java:250)
import org.dmd.dms.server.extended.DmsModule;                               // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.EnumDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.ExtendedReferenceTypeDefinition;         // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.RuleCategory;                            // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.RuleDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.RunContext;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.SchemaDefinition;                        // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.SliceDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.extended.TypeDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:254)
import org.dmd.dms.server.generated.dsd.DmsModuleGlobalInterface;           // Interface for DmsModuledefinitions - (MetaDSDHelper.java:257)
import org.dmd.dms.server.util.DmcDefinitionSet;                            // Our base to provide definition set storage - (MetaDSDHelper.java:268)
import org.dmd.dms.server.util.DmcDefinitionSetNew;                         // Our base to provide definition set storage - (MetaDSDHelper.java:269)
import org.dmd.dms.shared.types.DotName;                                    // To support the find method for definitions - (MetaDSDHelper.java:271)


// Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:286)
public class DmsModuleDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, DmsModuleGlobalInterface {

    // Generated from: org.dmd.util.artifact.java.MemberManager.getFormattedMembers(MemberManager.java:68)
    // Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpDefinitionManagerMembers(MetaDSDHelper.java:466)

    // This will be populated as a result of adding definitions to the definition sets for each definition type
    protected DmcDefinitionSetNew<DSDefinition>                       allDefinitions                         = new DmcDefinitionSetNew<DSDefinition>("DSDefinition");                                                                                         // Maintains all definitions
                                                                                                                                                                                                                                                              // 
    protected DmcDefinitionSetNew<DmsDefinition>                      DmsDefinitionDefs                      = new DmcDefinitionSetNew<DmsDefinition>("DmsDefinition", false, allDefinitions,allDefinitions);                                                 // The set of all DmsDefinition definitions
    protected DmcDefinitionSetNew<ActionDefinition>                   ActionDefinitionDefs                   = new DmcDefinitionSetNew<ActionDefinition>("ActionDefinition", true, DmsDefinitionDefs,allDefinitions);                                         // The set of all ActionDefinition definitions
    protected DmcDefinitionSetNew<AttributeDefinition>                AttributeDefinitionDefs                = new DmcDefinitionSetNew<AttributeDefinition>("AttributeDefinition", true, DmsDefinitionDefs,allDefinitions);                                   // The set of all AttributeDefinition definitions
    protected DmcDefinitionSetNew<ClassDefinition>                    ClassDefinitionDefs                    = new DmcDefinitionSetNew<ClassDefinition>("ClassDefinition", true, DmsDefinitionDefs,allDefinitions);                                           // The set of all ClassDefinition definitions
    protected DmcDefinitionSetNew<ComplexTypeDefinition>              ComplexTypeDefinitionDefs              = new DmcDefinitionSetNew<ComplexTypeDefinition>("ComplexTypeDefinition", true, DmsDefinitionDefs,allDefinitions);                               // The set of all ComplexTypeDefinition definitions
    protected DmcDefinitionSetNew<ExtendedReferenceTypeDefinition>    ExtendedReferenceTypeDefinitionDefs    = new DmcDefinitionSetNew<ExtendedReferenceTypeDefinition>("ExtendedReferenceTypeDefinition", true, ComplexTypeDefinitionDefs,allDefinitions);   // The set of all ExtendedReferenceTypeDefinition definitions
    protected DmcDefinitionSetNew<DSDefinitionModule>                 DSDefinitionModuleDefs                 = new DmcDefinitionSetNew<DSDefinitionModule>("DSDefinitionModule", true, DmsDefinitionDefs,allDefinitions);                                     // The set of all DSDefinitionModule definitions
    protected DmcDefinitionSetNew<Dependency>                         DependencyDefs                         = new DmcDefinitionSetNew<Dependency>("Dependency", true, DmsDefinitionDefs,allDefinitions);                                                     // The set of all Dependency definitions
    protected DmcDefinitionSetNew<DependencyImplementation>           DependencyImplementationDefs           = new DmcDefinitionSetNew<DependencyImplementation>("DependencyImplementation", true, DmsDefinitionDefs,allDefinitions);                         // The set of all DependencyImplementation definitions
    protected DmcDefinitionSetNew<DmsModule>                          DmsModuleDefs                          = new DmcDefinitionSetNew<DmsModule>("DmsModule", true, DmsDefinitionDefs,allDefinitions);                                                       // The set of all DmsModule definitions
    protected DmcDefinitionSetNew<EnumDefinition>                     EnumDefinitionDefs                     = new DmcDefinitionSetNew<EnumDefinition>("EnumDefinition", true, DmsDefinitionDefs,allDefinitions);                                             // The set of all EnumDefinition definitions
    protected DmcDefinitionSetNew<RuleCategory>                       RuleCategoryDefs                       = new DmcDefinitionSetNew<RuleCategory>("RuleCategory", true, DmsDefinitionDefs,allDefinitions);                                                 // The set of all RuleCategory definitions
    protected DmcDefinitionSetNew<RuleDefinition>                     RuleDefinitionDefs                     = new DmcDefinitionSetNew<RuleDefinition>("RuleDefinition", true, DmsDefinitionDefs,allDefinitions);                                             // The set of all RuleDefinition definitions
    protected DmcDefinitionSetNew<RunContext>                         RunContextDefs                         = new DmcDefinitionSetNew<RunContext>("RunContext", true, DmsDefinitionDefs,allDefinitions);                                                     // The set of all RunContext definitions
    protected DmcDefinitionSetNew<SchemaDefinition>                   SchemaDefinitionDefs                   = new DmcDefinitionSetNew<SchemaDefinition>("SchemaDefinition", true, DmsDefinitionDefs,allDefinitions);                                         // The set of all SchemaDefinition definitions
    protected DmcDefinitionSetNew<SliceDefinition>                    SliceDefinitionDefs                    = new DmcDefinitionSetNew<SliceDefinition>("SliceDefinition", true, DmsDefinitionDefs,allDefinitions);                                           // The set of all SliceDefinition definitions
    protected DmcDefinitionSetNew<TypeDefinition>                     TypeDefinitionDefs                     = new DmcDefinitionSetNew<TypeDefinition>("TypeDefinition", true, DmsDefinitionDefs,allDefinitions);                                             // The set of all TypeDefinition definitions

    public DmsModuleDefinitionManager(){

    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:299)
    public void resolveReferences() throws DMFeedbackSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:307)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DMFeedbackSet e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        return(def);
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:324)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:330)
    @Override
    public DmcObject findNamedDMO(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DMFeedbackSet e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        if (def==null)
            return(null);

        return(def.getDMO());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:350)
    @Override
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DMFeedbackSet {
        DmcNamedObjectIF rc = null;
        DotName dn = new DotName(name.getNameString() + "." + ai.type);
    
        // The name might contain module.defname, in which case we'll try to look it up
        // using a fully qualified DotName of the form module.defname.type. Otherwise,
        // we use the getDefinitionByNameAndType() form of the lookup.
        if (name.getNameString().indexOf(".") == -1){
            try{
                rc = allDefinitions.getDefinitionByNameAndType(dn);
            } catch (DmcNameClashException e) {
                rc = resolver.resolveClash(object, ai, e.getClashSet());
            }
        }
        else{
            rc = allDefinitions.getDefinition(dn);
        }
    
        return(rc);
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:373)
    @Override
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DMFeedbackSet {
        DmcNamedObjectIF rc = null;
        DSDefinition resolving = (DSDefinition) obj.getContainer();
    
        Iterator<DmcNamedObjectIF> it = ncos.getMatches();
        while(it.hasNext()){
            DSDefinition def = (DSDefinition) it.next();
            if (resolving.getNameOfModuleWhereThisCameFrom().equals(def.getNameOfModuleWhereThisCameFrom())){
                rc = def;
                break;
            }
        }
        return(rc);
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:480)
    // Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpDefinitionInterfaceMethods(MetaDSDHelper.java:398)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
    public void addDmsModule(DmsModule def) throws DMFeedbackSet {
        DmsModuleDefs.add(def);
    }

    public int getDmsModuleCount(){
        return(DmsModuleDefs.size());
    }

    public DmsModule getDmsModule(DotName name){
        return(DmsModuleDefs.getDefinition(name));
    }

    public Iterator<DmsModule> getAllDmsModule(){
        return(DmsModuleDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:510)
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

}

