//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.templates.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:99)
import java.util.Iterator;                                                      // To allow access to our definitions - (DmoCacheFormatter.java:80)
import java.util.TreeMap;                                                       // To allow access to indices by class - (DmoCacheFormatter.java:81)
import java.util.logging.Logger;                                                // To allow logging of exceptions - (DmoCacheFormatter.java:82)
import org.dmd.dmc.DmcAttributeInfo;                                            // Used when resolving clashes - (DmoCacheFormatter.java:92)
import org.dmd.dmc.DmcNameClashException;                                       // Used when resolving clashes - (DmoCacheFormatter.java:94)
import org.dmd.dmc.DmcNameClashObjectSet;                                       // Used when resolving clashes - (DmoCacheFormatter.java:93)
import org.dmd.dmc.DmcNameClashResolverIF;                                      // To support object resolution - (DmoCacheFormatter.java:84)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                           // To support object resolution - (DmoCacheFormatter.java:85)
import org.dmd.dmc.DmcNamedObjectIF;                                            // To support object resolution - (DmoCacheFormatter.java:86)
import org.dmd.dmc.DmcObject;                                                   // To support object resolution - (DmoCacheFormatter.java:87)
import org.dmd.dmc.DmcObjectName;                                               // To support object resolution - (DmoCacheFormatter.java:88)
import org.dmd.dmc.DmcValueException;                                           // Can be thrown when we try to resolve references - (DmoCacheFormatter.java:91)
import org.dmd.dmc.DmcValueExceptionSet;                                        // Can be thrown when we try to resolve references - (DmoCacheFormatter.java:90)
import org.dmd.dmc.definitions.DMODefinitionSet;                                // Our base to provide definition set storage - (DmoCacheFormatter.java:79)
import org.dmd.dmc.types.DotName;                                               // To support the find method for definitions - (DmoCacheFormatter.java:83)
import org.dmd.dms.generated.dmo.DSDefinitionDMO;                               // The base of all definitions - (DmoCacheFormatter.java:78)
import org.dmd.dmv.shared.DmvRuleManager;                                       // To allow access to the rule manager - (DmoCacheFormatter.java:95)
import org.dmd.templates.shared.generated.dmo.ContainedElementDMO;              // A definition from the TdlModule Module - (DmoCacheFormatter.java:305)
import org.dmd.templates.shared.generated.dmo.DmtdlDMSAG;                       // To allow loading of rules from the dmtdl schema - (DmoCacheFormatter.java:273)
import org.dmd.templates.shared.generated.dmo.ExtensionHookDMO;                 // A definition from the TdlModule Module - (DmoCacheFormatter.java:305)
import org.dmd.templates.shared.generated.dmo.SectionDMO;                       // A definition from the TdlModule Module - (DmoCacheFormatter.java:305)
import org.dmd.templates.shared.generated.dmo.TdlDefinitionDMO;                 // A definition from the TdlModule Module - (DmoCacheFormatter.java:301)
import org.dmd.templates.shared.generated.dmo.TdlModuleDMO;                     // A definition from the TdlModule Module - (DmoCacheFormatter.java:305)
import org.dmd.templates.shared.generated.dmo.TextualArtifactDMO;               // A definition from the TdlModule Module - (DmoCacheFormatter.java:305)
import org.dmd.templates.shared.generated.dsd.TdlModuleGlobalInterface;         // Interface for TdlModule definitions - (DmoCacheFormatter.java:298)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:103)
public class TdlModuleDefinitionDMOCache implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, TdlModuleGlobalInterface {

    private Logger                       logger;
    private DmvRuleManager               ruleManager;
    private DMODefinitionSet<DSDefinitionDMO>	allDefinitions;

    private TreeMap<String,DMODefinitionSet<?>>	indicesByClass;

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpDefinitionManagerMembers(DmoCacheFormatter.java:468)
    private DMODefinitionSet<TdlDefinitionDMO> TdlDefinitionDefs;
    private DMODefinitionSet<ContainedElementDMO> ContainedElementDefs;
    private DMODefinitionSet<ExtensionHookDMO> ExtensionHookDefs;
    private DMODefinitionSet<SectionDMO> SectionDefs;
    private DMODefinitionSet<TdlModuleDMO> TdlModuleDefs;
    private DMODefinitionSet<TextualArtifactDMO> TextualArtifactDefs;

    public TdlModuleDefinitionDMOCache(){

        logger = Logger.getLogger(getClass().getName());

        ruleManager = new DmvRuleManager();
        ruleManager.loadRules(DmtdlDMSAG.instance());

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DMODefinitionSet<DSDefinitionDMO>("allDefinitions");

        indicesByClass = new TreeMap<>();

        // Generated from: org.dmd.dms.util.DmoCacheFormatter.initializeDefinitionManagerMembers(DmoCacheFormatter.java:480)
        TdlDefinitionDefs = new DMODefinitionSet<TdlDefinitionDMO>("TdlDefinition", allDefinitions);
        indicesByClass.put(TdlDefinitionDefs.className(), TdlDefinitionDefs);

        ContainedElementDefs = new DMODefinitionSet<ContainedElementDMO>("ContainedElement", allDefinitions, TdlDefinitionDefs);
        indicesByClass.put(ContainedElementDefs.className(), ContainedElementDefs);

        SectionDefs = new DMODefinitionSet<SectionDMO>("Section", allDefinitions, ContainedElementDefs);
        indicesByClass.put(SectionDefs.className(), SectionDefs);

        ExtensionHookDefs = new DMODefinitionSet<ExtensionHookDMO>("ExtensionHook", allDefinitions, ContainedElementDefs);
        indicesByClass.put(ExtensionHookDefs.className(), ExtensionHookDefs);

        TextualArtifactDefs = new DMODefinitionSet<TextualArtifactDMO>("TextualArtifact", allDefinitions, TdlDefinitionDefs);
        indicesByClass.put(TextualArtifactDefs.className(), TextualArtifactDefs);

        TdlModuleDefs = new DMODefinitionSet<TdlModuleDMO>("TdlModule", allDefinitions, TdlDefinitionDefs);
        indicesByClass.put(TdlModuleDefs.className(), TdlModuleDefs);


    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:131)
    public DmvRuleManager ruleManager(){
        return(ruleManager);
    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:137)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinitionDMO def: allDefinitions.values()){
            def.resolveReferencesExceptClass(this,this);
        }
    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:145)
    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
        DSDefinitionDMO def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       logger.fine(e.toString());
        } catch (DmcValueException e) {
    	       logger.fine(e.toString());
        }

        return(def);

    }

    public DSDefinitionDMO findDefinition(DotName name) {
        return(allDefinitions.getDefinition(name));
    }

    public void deleteDefinition(DotName name) throws Exception {
        DSDefinitionDMO def = allDefinitions.getDefinition(name);
        
        if (def == null)
            throw(new Exception("Could not find object to delete: " + name.getNameString()));
        
        DMODefinitionSet<?> dds = indicesByClass.get(def.getConstructionClassName());
        dds.delete(name);
        def.youAreDeleted();
    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:179)
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:184)
    public DmcObject findNamedDMO(DmcObjectName name) {
        DSDefinitionDMO def = null;
        try {
            if (name instanceof DotName)
                def = allDefinitions.getDefinition((DotName)name);
            else
                def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       logger.fine(e.toString());
        } catch (DmcValueException e) {
    	       logger.fine(e.toString());
        }

        return(def);
    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:207)
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException {
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
                if (rc == null){
                    DmcValueException ex = new DmcValueException("The reference to : " + name.getNameString() + " is ambiguous. You must specify the module name as a prefix to the name. Here are your options:");
                    Iterator<DmcNamedObjectIF> it = e.getMatches();
                    while(it.hasNext()){
                        TdlDefinitionDMO def = (TdlDefinitionDMO) it.next();
                        ex.addMoreInfo(def.getDefinedInTdlModule().getName().getNameString() + "." + name.getNameString());
                    }
                    throw(ex);
                }
            }
        }
        else{
            rc = allDefinitions.getDefinition(dn);
        }
    
        return(rc);
    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:243)
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        DSDefinitionDMO resolving = (DSDefinitionDMO) obj.getContainer();
    
        Iterator<DmcNamedObjectIF> it = ncos.getMatches();
        while(it.hasNext()){
            DSDefinitionDMO def = (DSDefinitionDMO) it.next();
            if (resolving.getDmoFromModule().equals(def.getDmoFromModule())){
                rc = def;
                break;
            }
        }
        return(rc);
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:381)
    // Called from: org.dmd.dms.util.DmoCacheFormatter.dumpDefinitionInterfaceMethods(DmoCacheFormatter.java:524)
    /**
     * All definitions are added to the base definition collection.
     */
    void addTdlDefinition(TdlDefinitionDMO def){
        TdlDefinitionDefs.add(def);
    }

    public int getTdlDefinitionCount(){
        return(TdlDefinitionDefs.size());
    }

    public TdlDefinitionDMO getTdlDefinition(DotName name){
        return(TdlDefinitionDefs.getDefinition(name));
    }

    public Iterator<TdlDefinitionDMO> getAllTdlDefinition(){
        return(TdlDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:416)
    public void addContainedElement(ContainedElementDMO def){
        ContainedElementDefs.add(def);
        addTdlDefinition(def);
    }

    public int getContainedElementCount(){
        return(ContainedElementDefs.size());
    }

    public ContainedElementDMO getContainedElement(DotName name){
        return(ContainedElementDefs.getDefinition(name));
    }

    public Iterator<ContainedElementDMO> getAllContainedElement(){
        return(ContainedElementDefs.values().iterator());
    }

    public ContainedElementDMO getContainedElementDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ContainedElementDefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:416)
    public void addExtensionHook(ExtensionHookDMO def){
        ExtensionHookDefs.add(def);
        addContainedElement(def);
    }

    public int getExtensionHookCount(){
        return(ExtensionHookDefs.size());
    }

    public ExtensionHookDMO getExtensionHook(DotName name){
        return(ExtensionHookDefs.getDefinition(name));
    }

    public Iterator<ExtensionHookDMO> getAllExtensionHook(){
        return(ExtensionHookDefs.values().iterator());
    }

    public ExtensionHookDMO getExtensionHookDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ExtensionHookDefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:416)
    public void addSection(SectionDMO def){
        SectionDefs.add(def);
        addContainedElement(def);
    }

    public int getSectionCount(){
        return(SectionDefs.size());
    }

    public SectionDMO getSection(DotName name){
        return(SectionDefs.getDefinition(name));
    }

    public Iterator<SectionDMO> getAllSection(){
        return(SectionDefs.values().iterator());
    }

    public SectionDMO getSectionDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(SectionDefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:416)
    public void addTdlModule(TdlModuleDMO def){
        TdlModuleDefs.add(def);
        addTdlDefinition(def);
    }

    public int getTdlModuleCount(){
        return(TdlModuleDefs.size());
    }

    public TdlModuleDMO getTdlModule(DotName name){
        return(TdlModuleDefs.getDefinition(name));
    }

    public Iterator<TdlModuleDMO> getAllTdlModule(){
        return(TdlModuleDefs.values().iterator());
    }

    public TdlModuleDMO getTdlModuleDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(TdlModuleDefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:416)
    public void addTextualArtifact(TextualArtifactDMO def){
        TextualArtifactDefs.add(def);
        addTdlDefinition(def);
    }

    public int getTextualArtifactCount(){
        return(TextualArtifactDefs.size());
    }

    public TextualArtifactDMO getTextualArtifact(DotName name){
        return(TextualArtifactDefs.getDefinition(name));
    }

    public Iterator<TextualArtifactDMO> getAllTextualArtifact(){
        return(TextualArtifactDefs.values().iterator());
    }

    public TextualArtifactDMO getTextualArtifactDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(TextualArtifactDefs.getDefinition(name));
    }


    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpAddMethod(DmoCacheFormatter.java:333)
    public void addDefinition(DSDefinitionDMO definition){
            if (definition instanceof ExtensionHookDMO){
                addExtensionHook((ExtensionHookDMO)definition);
            }
            else if (definition instanceof SectionDMO){
                addSection((SectionDMO)definition);
            }
            else if (definition instanceof TextualArtifactDMO){
                addTextualArtifact((TextualArtifactDMO)definition);
            }
            else if (definition instanceof TdlModuleDMO){
                addTdlModule((TdlModuleDMO)definition);
            }

    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpSummaryMethod(DmoCacheFormatter.java:371)
    public String summary(){
        StringBuilder sb = new StringBuilder();
        sb.append(TdlDefinitionDefs.summary());
        sb.append(ContainedElementDefs.summary());
        sb.append(SectionDefs.summary());
        sb.append(ExtensionHookDefs.summary());
        sb.append(TextualArtifactDefs.summary());
        sb.append(TdlModuleDefs.summary());
       return(sb.toString());
    }

}

