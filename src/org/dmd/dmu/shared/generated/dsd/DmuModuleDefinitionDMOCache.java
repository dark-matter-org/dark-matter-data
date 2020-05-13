//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2020 dark-matter-data committers
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
package org.dmd.dmu.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:99)
import java.util.Iterator;                                                // To allow access to our definitions - (DmoCacheFormatter.java:80)
import java.util.TreeMap;                                                 // To allow access to indices by class - (DmoCacheFormatter.java:81)
import java.util.logging.Logger;                                          // To allow logging of exceptions - (DmoCacheFormatter.java:82)
import org.dmd.dmc.DmcAttributeInfo;                                      // Used when resolving clashes - (DmoCacheFormatter.java:92)
import org.dmd.dmc.DmcNameClashException;                                 // Used when resolving clashes - (DmoCacheFormatter.java:94)
import org.dmd.dmc.DmcNameClashObjectSet;                                 // Used when resolving clashes - (DmoCacheFormatter.java:93)
import org.dmd.dmc.DmcNameClashResolverIF;                                // To support object resolution - (DmoCacheFormatter.java:84)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                     // To support object resolution - (DmoCacheFormatter.java:85)
import org.dmd.dmc.DmcNamedObjectIF;                                      // To support object resolution - (DmoCacheFormatter.java:86)
import org.dmd.dmc.DmcObject;                                             // To support object resolution - (DmoCacheFormatter.java:87)
import org.dmd.dmc.DmcObjectName;                                         // To support object resolution - (DmoCacheFormatter.java:88)
import org.dmd.dmc.DmcValueException;                                     // Can be thrown when we try to resolve references - (DmoCacheFormatter.java:91)
import org.dmd.dmc.DmcValueExceptionSet;                                  // Can be thrown when we try to resolve references - (DmoCacheFormatter.java:90)
import org.dmd.dmc.definitions.DMODefinitionSet;                          // Our base to provide definition set storage - (DmoCacheFormatter.java:79)
import org.dmd.dmc.types.DotName;                                         // To support the find method for definitions - (DmoCacheFormatter.java:83)
import org.dmd.dms.generated.dmo.DSDefinitionDMO;                         // The base of all definitions - (DmoCacheFormatter.java:78)
import org.dmd.dmu.shared.generated.dmo.DmuDMSAG;                         // To allow loading of rules from the dmu schema - (DmoCacheFormatter.java:273)
import org.dmd.dmu.shared.generated.dmo.DmuDefinitionDMO;                 // A definition from the DmuModule Module - (DmoCacheFormatter.java:301)
import org.dmd.dmu.shared.generated.dmo.DmuModuleDMO;                     // A definition from the DmuModule Module - (DmoCacheFormatter.java:305)
import org.dmd.dmu.shared.generated.dmo.PayloadExampleDMO;                // A definition from the DmuModule Module - (DmoCacheFormatter.java:305)
import org.dmd.dmu.shared.generated.dmo.PayloadSortInfoDMO;               // A definition from the DmuModule Module - (DmoCacheFormatter.java:305)
import org.dmd.dmu.shared.generated.dsd.DmuModuleGlobalInterface;         // Interface for DmuModule definitions - (DmoCacheFormatter.java:298)
import org.dmd.dmv.shared.DmvRuleManager;                                 // To allow access to the rule manager - (DmoCacheFormatter.java:95)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateDefinitionManager(DmoCacheFormatter.java:103)
public class DmuModuleDefinitionDMOCache implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, DmuModuleGlobalInterface {

    private Logger                       logger;
    private DmvRuleManager               ruleManager;
    private DMODefinitionSet<DSDefinitionDMO>	allDefinitions;

    private TreeMap<String,DMODefinitionSet<?>>	indicesByClass;

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpDefinitionManagerMembers(DmoCacheFormatter.java:468)
    private DMODefinitionSet<DmuDefinitionDMO> DmuDefinitionDefs;
    private DMODefinitionSet<DmuModuleDMO> DmuModuleDefs;
    private DMODefinitionSet<PayloadExampleDMO> PayloadExampleDefs;
    private DMODefinitionSet<PayloadSortInfoDMO> PayloadSortInfoDefs;

    public DmuModuleDefinitionDMOCache(){

        logger = Logger.getLogger(getClass().getName());

        ruleManager = new DmvRuleManager();
        ruleManager.loadRules(DmuDMSAG.instance());

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DMODefinitionSet<DSDefinitionDMO>("allDefinitions");

        indicesByClass = new TreeMap<>();

        // Generated from: org.dmd.dms.util.DmoCacheFormatter.initializeDefinitionManagerMembers(DmoCacheFormatter.java:480)
        DmuDefinitionDefs = new DMODefinitionSet<DmuDefinitionDMO>("DmuDefinition", allDefinitions);
        indicesByClass.put(DmuDefinitionDefs.className(), DmuDefinitionDefs);

        PayloadSortInfoDefs = new DMODefinitionSet<PayloadSortInfoDMO>("PayloadSortInfo", allDefinitions, DmuDefinitionDefs);
        indicesByClass.put(PayloadSortInfoDefs.className(), PayloadSortInfoDefs);

        PayloadExampleDefs = new DMODefinitionSet<PayloadExampleDMO>("PayloadExample", allDefinitions, DmuDefinitionDefs);
        indicesByClass.put(PayloadExampleDefs.className(), PayloadExampleDefs);

        DmuModuleDefs = new DMODefinitionSet<DmuModuleDMO>("DmuModule", allDefinitions, DmuDefinitionDefs);
        indicesByClass.put(DmuModuleDefs.className(), DmuModuleDefs);


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
                        DmuDefinitionDMO def = (DmuDefinitionDMO) it.next();
                        ex.addMoreInfo(def.getDefinedInDmuModule().getName().getNameString() + "." + name.getNameString());
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:395)
    // Called from: org.dmd.dms.util.DmoCacheFormatter.dumpDefinitionInterfaceMethods(DmoCacheFormatter.java:524)
    /**
     * All definitions are added to the base definition collection.
     */
    void addDmuDefinition(DmuDefinitionDMO def){
        DmuDefinitionDefs.add(def);
    }

    public int getDmuDefinitionCount(){
        return(DmuDefinitionDefs.size());
    }

    public DmuDefinitionDMO getDmuDefinition(DotName name){
        return(DmuDefinitionDefs.getDefinition(name));
    }

    public Iterator<DmuDefinitionDMO> getAllDmuDefinition(){
        return(DmuDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:430)
    public void addDmuModule(DmuModuleDMO def){
        DmuModuleDefs.add(def);
        addDmuDefinition(def);
    }

    public int getDmuModuleCount(){
        return(DmuModuleDefs.size());
    }

    public DmuModuleDMO getDmuModule(DotName name){
        return(DmuModuleDefs.getDefinition(name));
    }

    public Iterator<DmuModuleDMO> getAllDmuModule(){
        return(DmuModuleDefs.values().iterator());
    }

    public DmuModuleDMO getDmuModuleDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(DmuModuleDefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:430)
    public void addPayloadExample(PayloadExampleDMO def){
        PayloadExampleDefs.add(def);
        addDmuDefinition(def);
    }

    public int getPayloadExampleCount(){
        return(PayloadExampleDefs.size());
    }

    public PayloadExampleDMO getPayloadExample(DotName name){
        return(PayloadExampleDefs.getDefinition(name));
    }

    public Iterator<PayloadExampleDMO> getAllPayloadExample(){
        return(PayloadExampleDefs.values().iterator());
    }

    public PayloadExampleDMO getPayloadExampleDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(PayloadExampleDefs.getDefinition(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getDMOInterfaceMethodsImplementations(DSDefinitionModule.java:430)
    public void addPayloadSortInfo(PayloadSortInfoDMO def){
        PayloadSortInfoDefs.add(def);
        addDmuDefinition(def);
    }

    public int getPayloadSortInfoCount(){
        return(PayloadSortInfoDefs.size());
    }

    public PayloadSortInfoDMO getPayloadSortInfo(DotName name){
        return(PayloadSortInfoDefs.getDefinition(name));
    }

    public Iterator<PayloadSortInfoDMO> getAllPayloadSortInfo(){
        return(PayloadSortInfoDefs.values().iterator());
    }

    public PayloadSortInfoDMO getPayloadSortInfoDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(PayloadSortInfoDefs.getDefinition(name));
    }


    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpAddMethod(DmoCacheFormatter.java:333)
    public void addDefinition(DSDefinitionDMO definition){
            if (definition instanceof PayloadExampleDMO){
                addPayloadExample((PayloadExampleDMO)definition);
            }
            else if (definition instanceof PayloadSortInfoDMO){
                addPayloadSortInfo((PayloadSortInfoDMO)definition);
            }
            else if (definition instanceof DmuModuleDMO){
                addDmuModule((DmuModuleDMO)definition);
            }

    }

    // Generated from: org.dmd.dms.util.DmoCacheFormatter.dumpSummaryMethod(DmoCacheFormatter.java:371)
    public String summary(){
        StringBuilder sb = new StringBuilder();
        sb.append(DmuDefinitionDefs.summary());
        sb.append(PayloadSortInfoDefs.summary());
        sb.append(PayloadExampleDefs.summary());
        sb.append(DmuModuleDefs.summary());
       return(sb.toString());
    }

}

