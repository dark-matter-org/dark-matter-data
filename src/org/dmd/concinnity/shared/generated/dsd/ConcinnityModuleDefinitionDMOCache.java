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
package org.dmd.concinnity.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:99)
import java.util.Iterator;                                                              // To allow access to our definitions - (DmoCacheFormatter.java:80)
import java.util.TreeMap;                                                               // To allow access to indices by class - (DmoCacheFormatter.java:81)
import java.util.logging.Logger;                                                        // To allow logging of exceptions - (DmoCacheFormatter.java:82)
import org.dmd.concinnity.shared.generated.dmo.ConceptDMO;                              // A definition from the ConcinnityModule Module - (DmoCacheFormatter.java:305)
import org.dmd.concinnity.shared.generated.dmo.ConcinnityDefinitionDMO;                 // A definition from the ConcinnityModule Module - (DmoCacheFormatter.java:301)
import org.dmd.concinnity.shared.generated.dmo.ConcinnityModuleDMO;                     // A definition from the ConcinnityModule Module - (DmoCacheFormatter.java:305)
import org.dmd.concinnity.shared.generated.dmo.DmconcinnityDMSAG;                       // To allow loading of rules from the dmconcinnity schema - (DmoCacheFormatter.java:273)
import org.dmd.concinnity.shared.generated.dsd.ConcinnityModuleGlobalInterface;         // Interface for ConcinnityModule definitions - (DmoCacheFormatter.java:298)
import org.dmd.dmc.DmcAttributeInfo;                                                    // Used when resolving clashes - (DmoCacheFormatter.java:92)
import org.dmd.dmc.DmcNameClashException;                                               // Used when resolving clashes - (DmoCacheFormatter.java:94)
import org.dmd.dmc.DmcNameClashObjectSet;                                               // Used when resolving clashes - (DmoCacheFormatter.java:93)
import org.dmd.dmc.DmcNameClashResolverIF;                                              // To support object resolution - (DmoCacheFormatter.java:84)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                                   // To support object resolution - (DmoCacheFormatter.java:85)
import org.dmd.dmc.DmcNamedObjectIF;                                                    // To support object resolution - (DmoCacheFormatter.java:86)
import org.dmd.dmc.DmcObject;                                                           // To support object resolution - (DmoCacheFormatter.java:87)
import org.dmd.dmc.DmcObjectName;                                                       // To support object resolution - (DmoCacheFormatter.java:88)
import org.dmd.dmc.DmcValueException;                                                   // Can be thrown when we try to resolve references - (DmoCacheFormatter.java:91)
import org.dmd.dmc.DmcValueExceptionSet;                                                // Can be thrown when we try to resolve references - (DmoCacheFormatter.java:90)
import org.dmd.dmc.definitions.DMODefinitionSet;                                        // Our base to provide definition set storage - (DmoCacheFormatter.java:79)
import org.dmd.dmc.types.DotName;                                                       // To support the find method for definitions - (DmoCacheFormatter.java:83)
import org.dmd.dms.generated.dmo.DSDefinitionDMO;                                       // The base of all definitions - (DmoCacheFormatter.java:78)
import org.dmd.dmv.shared.DmvRuleManager;                                               // To allow access to the rule manager - (DmoCacheFormatter.java:95)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:103)
public class ConcinnityModuleDefinitionDMOCache implements ConcinnityModuleGlobalInterface, DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF {

    private Logger                       logger;
    private DmvRuleManager               ruleManager;
    private DMODefinitionSet<DSDefinitionDMO>	allDefinitions;

    private TreeMap<String,DMODefinitionSet<?>>	indicesByClass;

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpDefinitionManagerMembers(DmoCacheFormatter.java:468)
    private DMODefinitionSet<ConcinnityDefinitionDMO> ConcinnityDefinitionDefs;
    private DMODefinitionSet<ConceptDMO> ConceptDefs;
    private DMODefinitionSet<ConcinnityModuleDMO> ConcinnityModuleDefs;

    public ConcinnityModuleDefinitionDMOCache(){

        logger = Logger.getLogger(getClass().getName());

        ruleManager = new DmvRuleManager();
        ruleManager.loadRules(DmconcinnityDMSAG.instance());

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DMODefinitionSet<DSDefinitionDMO>("allDefinitions");

        indicesByClass = new TreeMap<>();

        // Generated from: org.dmd.dms.util.DmoCacheFormatter.initializeDefinitionManagerMembers(DmoCacheFormatter.java:480)
        ConcinnityDefinitionDefs = new DMODefinitionSet<ConcinnityDefinitionDMO>("ConcinnityDefinition", allDefinitions);
        indicesByClass.put(ConcinnityDefinitionDefs.className(), ConcinnityDefinitionDefs);

        ConceptDefs = new DMODefinitionSet<ConceptDMO>("Concept", allDefinitions, ConcinnityDefinitionDefs);
        indicesByClass.put(ConceptDefs.className(), ConceptDefs);

        ConcinnityModuleDefs = new DMODefinitionSet<ConcinnityModuleDMO>("ConcinnityModule", allDefinitions, ConcinnityDefinitionDefs);
        indicesByClass.put(ConcinnityModuleDefs.className(), ConcinnityModuleDefs);


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
                        ConcinnityDefinitionDMO def = (ConcinnityDefinitionDMO) it.next();
                        ex.addMoreInfo(def.getDefinedInConcinnityModule().getName().getNameString() + "." + name.getNameString());
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
    void addConcinnityDefinition(ConcinnityDefinitionDMO def){
        ConcinnityDefinitionDefs.add(def);
    }

    public int getConcinnityDefinitionCount(){
        return(ConcinnityDefinitionDefs.size());
    }

    public ConcinnityDefinitionDMO getConcinnityDefinition(DotName name){
        return(ConcinnityDefinitionDefs.getDefinition(name));
    }

    public Iterator<ConcinnityDefinitionDMO> getAllConcinnityDefinition(){
        return(ConcinnityDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:416)
    public void addConcept(ConceptDMO def){
        ConceptDefs.add(def);
        addConcinnityDefinition(def);
    }

    public int getConceptCount(){
        return(ConceptDefs.size());
    }

    public ConceptDMO getConcept(DotName name){
        return(ConceptDefs.getDefinition(name));
    }

    public Iterator<ConceptDMO> getAllConcept(){
        return(ConceptDefs.values().iterator());
    }

    public ConceptDMO getConceptDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ConceptDefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:416)
    public void addConcinnityModule(ConcinnityModuleDMO def){
        ConcinnityModuleDefs.add(def);
        addConcinnityDefinition(def);
    }

    public int getConcinnityModuleCount(){
        return(ConcinnityModuleDefs.size());
    }

    public ConcinnityModuleDMO getConcinnityModule(DotName name){
        return(ConcinnityModuleDefs.getDefinition(name));
    }

    public Iterator<ConcinnityModuleDMO> getAllConcinnityModule(){
        return(ConcinnityModuleDefs.values().iterator());
    }

    public ConcinnityModuleDMO getConcinnityModuleDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ConcinnityModuleDefs.getDefinition(name));
    }


    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpAddMethod(DmoCacheFormatter.java:333)
    public void addDefinition(DSDefinitionDMO definition){
            if (definition instanceof ConceptDMO){
                addConcept((ConceptDMO)definition);
            }
            else if (definition instanceof ConcinnityModuleDMO){
                addConcinnityModule((ConcinnityModuleDMO)definition);
            }

    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpSummaryMethod(DmoCacheFormatter.java:371)
    public String summary(){
        StringBuilder sb = new StringBuilder();
        sb.append(ConcinnityDefinitionDefs.summary());
        sb.append(ConceptDefs.summary());
        sb.append(ConcinnityModuleDefs.summary());
       return(sb.toString());
    }

}

