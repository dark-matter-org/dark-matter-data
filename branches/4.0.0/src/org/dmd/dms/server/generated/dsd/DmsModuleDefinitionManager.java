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
// Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:269)
import java.util.Iterator;                                                  // To allow access to our definitions - (MetaDSDHelper.java:257)
import org.dmd.core.DmcNameClashObjectSet;                                  // Used when resolving clashes - (MetaDSDHelper.java:266)
import org.dmd.core.DmcObject;                                              // To support object resolution - (MetaDSDHelper.java:262)
import org.dmd.core.DmcObjectName;                                          // To support object resolution - (MetaDSDHelper.java:263)
import org.dmd.core.feedback.DMFeedbackSet;                                 // Can be thrown when we try to resolve references - (MetaDSDHelper.java:264)
import org.dmd.core.feedback.DmcNameClashException;                         // Used when resolving clashes - (MetaDSDHelper.java:267)
import org.dmd.core.interfaces.DmcNameClashResolverIF;                      // To support object resolution - (MetaDSDHelper.java:259)
import org.dmd.core.interfaces.DmcNameResolverWithClashSupportIF;           // To support object resolution - (MetaDSDHelper.java:260)
import org.dmd.core.interfaces.DmcNamedObjectIF;                            // To support object resolution - (MetaDSDHelper.java:261)
import org.dmd.core.schema.DmcAttributeInfo;                                // Used when resolving clashes - (MetaDSDHelper.java:265)
import org.dmd.dms.server.extended.ActionDefinition;                        // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.AttributeDefinition;                     // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.ClassDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.ComplexTypeDefinition;                   // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.DSDefinition;                            // The base of all definitions - (MetaDSDHelper.java:255)
import org.dmd.dms.server.extended.DSDefinitionModule;                      // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.Dependency;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.DependencyImplementation;                // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.DmsDefinition;                           // The base definition of the DmsModule Module - (MetaDSDHelper.java:241)
import org.dmd.dms.server.extended.DmsModule;                               // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.EnumDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.ExtendedReferenceTypeDefinition;         // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.RuleCategory;                            // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.RuleDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.RunContext;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.SchemaDefinition;                        // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.SliceDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.extended.TypeDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:245)
import org.dmd.dms.server.util.DmcDefinitionSet;                            // Our base to provide definition set storage - (MetaDSDHelper.java:256)
import org.dmd.dms.shared.types.DotName;                                    // To support the find method for definitions - (MetaDSDHelper.java:258)


// Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:273)
public class DmsModuleDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpDefinitionManagerMembers(MetaDSDHelper.java:404)
    DmcDefinitionSet<DmsDefinition> DmsDefinitionDefs;
    DmcDefinitionSet<ActionDefinition> ActionDefinitionDefs;
    DmcDefinitionSet<AttributeDefinition> AttributeDefinitionDefs;
    DmcDefinitionSet<ClassDefinition> ClassDefinitionDefs;
    DmcDefinitionSet<ComplexTypeDefinition> ComplexTypeDefinitionDefs;
    DmcDefinitionSet<ExtendedReferenceTypeDefinition> ExtendedReferenceTypeDefinitionDefs;
    DmcDefinitionSet<DSDefinitionModule> DSDefinitionModuleDefs;
    DmcDefinitionSet<Dependency> DependencyDefs;
    DmcDefinitionSet<DependencyImplementation> DependencyImplementationDefs;
    DmcDefinitionSet<DmsModule> DmsModuleDefs;
    DmcDefinitionSet<EnumDefinition> EnumDefinitionDefs;
    DmcDefinitionSet<RuleCategory> RuleCategoryDefs;
    DmcDefinitionSet<RuleDefinition> RuleDefinitionDefs;
    DmcDefinitionSet<RunContext> RunContextDefs;
    DmcDefinitionSet<SchemaDefinition> SchemaDefinitionDefs;
    DmcDefinitionSet<SliceDefinition> SliceDefinitionDefs;
    DmcDefinitionSet<TypeDefinition> TypeDefinitionDefs;

    public DmsModuleDefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.initializeDefinitionManagerMembers(MetaDSDHelper.java:392)
        DmsDefinitionDefs = new DmcDefinitionSet<DmsDefinition>("DmsDefinition", allDefinitions);
        ActionDefinitionDefs = new DmcDefinitionSet<ActionDefinition>("ActionDefinition", allDefinitions);
        AttributeDefinitionDefs = new DmcDefinitionSet<AttributeDefinition>("AttributeDefinition", allDefinitions);
        ClassDefinitionDefs = new DmcDefinitionSet<ClassDefinition>("ClassDefinition", allDefinitions);
        ComplexTypeDefinitionDefs = new DmcDefinitionSet<ComplexTypeDefinition>("ComplexTypeDefinition", allDefinitions);
        ExtendedReferenceTypeDefinitionDefs = new DmcDefinitionSet<ExtendedReferenceTypeDefinition>("ExtendedReferenceTypeDefinition", allDefinitions);
        DSDefinitionModuleDefs = new DmcDefinitionSet<DSDefinitionModule>("DSDefinitionModule", allDefinitions);
        DependencyDefs = new DmcDefinitionSet<Dependency>("Dependency", allDefinitions);
        DependencyImplementationDefs = new DmcDefinitionSet<DependencyImplementation>("DependencyImplementation", allDefinitions);
        DmsModuleDefs = new DmcDefinitionSet<DmsModule>("DmsModule", allDefinitions);
        EnumDefinitionDefs = new DmcDefinitionSet<EnumDefinition>("EnumDefinition", allDefinitions);
        RuleCategoryDefs = new DmcDefinitionSet<RuleCategory>("RuleCategory", allDefinitions);
        RuleDefinitionDefs = new DmcDefinitionSet<RuleDefinition>("RuleDefinition", allDefinitions);
        RunContextDefs = new DmcDefinitionSet<RunContext>("RunContext", allDefinitions);
        SchemaDefinitionDefs = new DmcDefinitionSet<SchemaDefinition>("SchemaDefinition", allDefinitions);
        SliceDefinitionDefs = new DmcDefinitionSet<SliceDefinition>("SliceDefinition", allDefinitions);
        TypeDefinitionDefs = new DmcDefinitionSet<TypeDefinition>("TypeDefinition", allDefinitions);

    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:289)
    public void resolveReferences() throws DMFeedbackSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:297)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:314)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:320)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:340)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateDefinitionManager(MetaDSDHelper.java:363)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:425)
    // Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpDefinitionInterfaceMethods(MetaDSDHelper.java:388)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
    public void addDmsModule(DmsModule def){
        DmsModuleDefs.add(def);
        addDmsDefinition(def);
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.getInterfaceMethodsImplementations(MetaDSDHelper.java:455)
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

}

