package org.dmd.dmu.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:158)
import java.util.Collection;                                              // To return values from indices - (DSDArtifactFormatter.java:153)
import java.util.Iterator;                                                // To allow access to our definitions - (DSDArtifactFormatter.java:132)
import java.util.TreeMap;                                                 // To organize access to our indices - (DSDArtifactFormatter.java:152)
import org.dmd.dmc.DmcAttributeInfo;                                      // Used when resolving clashes - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcClassInfo;                                          // The class info for our indices - (DSDArtifactFormatter.java:154)
import org.dmd.dmc.DmcNameClashException;                                 // Used when resolving clashes - (DSDArtifactFormatter.java:143)
import org.dmd.dmc.DmcNameClashObjectSet;                                 // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashResolverIF;                                // To support object resolution - (DSDArtifactFormatter.java:134)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                     // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcNamedObjectIF;                                      // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcObject;                                             // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcObjectName;                                         // To support object resolution - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.DmcValueException;                                     // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.DmcValueExceptionSet;                                  // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.definitions.DmcDefinitionSet;                          // Our base to provide definition set storage - (DSDArtifactFormatter.java:131)
import org.dmd.dmc.types.DotName;                                         // To support the find method for definitions - (DSDArtifactFormatter.java:133)
import org.dmd.dms.DSDefinition;                                          // The base of all definitions - (DSDArtifactFormatter.java:130)
import org.dmd.dmu.server.extended.DmuDefinition;                         // A definition from the DmuModule Module - (DSDArtifactFormatter.java:491)
import org.dmd.dmu.server.extended.DmuModule;                             // A definition from the DmuModule Module - (DSDArtifactFormatter.java:495)
import org.dmd.dmu.server.extended.json.PayloadExample;                   // A definition from the DmuModule Module - (DSDArtifactFormatter.java:495)
import org.dmd.dmu.server.extended.json.PayloadSortInfo;                  // A definition from the DmuModule Module - (DSDArtifactFormatter.java:495)
import org.dmd.dmu.server.generated.dsd.DmuModuleGlobalInterface;         // Interface for DmuModule definitions - (DSDArtifactFormatter.java:488)
import org.dmd.dmu.shared.generated.dmo.DmuDMSAG;                         // To allow use of DmcClassInfo from the dmu schema for index access - (DSDArtifactFormatter.java:150)
import org.dmd.dmw.DmwNamedObjectWrapper;                                 // What we return from getIndex() - (DSDArtifactFormatter.java:155)
import org.dmd.util.exceptions.ResultException;                           // When deletion problems occur - (DSDArtifactFormatter.java:144)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:162)
public class DmuModuleDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, DmuModuleGlobalInterface {

    private DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:514)
    private DmcDefinitionSet<DmuDefinition> DmuDefinitionDefs;
    private DmcDefinitionSet<DmuModule> DmuModuleDefs;
    private DmcDefinitionSet<PayloadExample> PayloadExampleDefs;
    private DmcDefinitionSet<PayloadSortInfo> PayloadSortInfoDefs;

    private TreeMap<DmcClassInfo,DmcDefinitionSet<?>>	indicesByClass;

    public DmuModuleDefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        indicesByClass = new TreeMap<>();

        // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.initializeDefinitionManagerMembers(DSDArtifactFormatter.java:541)
        DmuDefinitionDefs = new DmcDefinitionSet<DmuDefinition>("DmuDefinition", allDefinitions);
        indicesByClass.put(DmuDMSAG.__DmuDefinition, DmuDefinitionDefs);

        PayloadSortInfoDefs = new DmcDefinitionSet<PayloadSortInfo>("PayloadSortInfo", allDefinitions, DmuDefinitionDefs);
        indicesByClass.put(DmuDMSAG.__PayloadSortInfo, PayloadSortInfoDefs);

        PayloadExampleDefs = new DmcDefinitionSet<PayloadExample>("PayloadExample", allDefinitions, DmuDefinitionDefs);
        indicesByClass.put(DmuDMSAG.__PayloadExample, PayloadExampleDefs);

        DmuModuleDefs = new DmcDefinitionSet<DmuModule>("DmuModule", allDefinitions, DmuDefinitionDefs);
        indicesByClass.put(DmuDMSAG.__DmuModule, DmuModuleDefs);


    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:185)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:193)
    public Collection<DmwNamedObjectWrapper> getIndex(DmcClassInfo ci){
        DmcDefinitionSet<?>    dds = indicesByClass.get(ci);
        
        if (dds == null)
            throw(new IllegalStateException("No index available for class: " + ci.name));
        
        return(dds.getIndex());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:204)
    public DmcNamedObjectIF findNamedObject(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        return(def);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:220)
    public DSDefinition findDefinition(DotName name) {
    	   return(allDefinitions.getDefinition(name));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:226)
    /**
     * Attempts to delete the definition with the specified name. If you have
     * enabled back reference tracking via DmcOmni, it will also clean up any
     * existing references from this definition to other definitions.
     * @param name the fully qualified DotName of the definition to be deleted.
     * @throws ResultException if the definition can't, be found or if there are outstanding references to it.
     */
    public void deleteDefinition(DotName name) throws ResultException {
        DSDefinition def = allDefinitions.getDefinition(name);
        
        if (def == null)
            throw(new ResultException("Could not find object to delete: " + name.getNameString()));
        
        DmcDefinitionSet<?> dds = indicesByClass.get(def.getConstructionClassInfo());
        dds.delete(name);
        def.youAreDeleted();
        
        DmuDefinition base = (DmuDefinition)def;
        DmuModule module = base.getDefinedInDmuModule();
        
        if (def instanceof PayloadExample){
            module.deletePayloadExample((PayloadExample)def);
        }
        else if (def instanceof PayloadSortInfo){
            module.deletePayloadSortInfo((PayloadSortInfo)def);
        }
        else if (def instanceof DmuModule){
        }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:281)
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:286)
    public DmcObject findNamedDMO(DmcObjectName name) {
        DSDefinition def = null;
        try {
    	       def = allDefinitions.getDefinition(name.toString());
        } catch (DmcNameClashException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        } catch (DmcValueException e) {
    	       // TODO Auto-generated catch block
    	       e.printStackTrace();
        }

        if (def==null)
            return(null);

        return(def.getDMO());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:305)
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
                        DmuDefinition def = (DmuDefinition) it.next();
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:336)
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:305)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:535)
    /**
     * All definitions are added to the base definition collection.
     */
    void addDmuDefinition(DmuDefinition def){
        DmuDefinitionDefs.add(def);
    }

    void deleteDmuDefinition(DmuDefinition def){
        try {
            DmuDefinitionDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
    }

    public int getDmuDefinitionCount(){
        return(DmuDefinitionDefs.size());
    }

    public DmuDefinition getDmuDefinition(DotName name){
        return(DmuDefinitionDefs.getDefinition(name));
    }

    public Iterator<DmuDefinition> getAllDmuDefinition(){
        return(DmuDefinitionDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:343)
    public void addDmuModule(DmuModule def){
        DmuModuleDefs.add(def);
        addDmuDefinition(def);
    }

    public void deleteDmuModule(DmuModule def){
        try{
            DmuModuleDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteDmuDefinition(def);
    }

    public int getDmuModuleCount(){
        return(DmuModuleDefs.size());
    }

    public DmuModule getDmuModule(DotName name){
        return(DmuModuleDefs.getDefinition(name));
    }

    public Iterator<DmuModule> getAllDmuModule(){
        return(DmuModuleDefs.values().iterator());
    }

    public DmuModule getDmuModuleDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(DmuModuleDefs.getDefinition(name));
    }

    public Iterator<DmuModule> getDmuModuleDefinitionsByName(String name) throws DmcValueException{
        return(DmuModuleDefs.getDefinitionsByName(name));
    }

    public int getDmuModuleDefinitionCountByName(String name) throws DmcValueException{
        return(DmuModuleDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:343)
    public void addPayloadExample(PayloadExample def){
        PayloadExampleDefs.add(def);
        addDmuDefinition(def);
    }

    public void deletePayloadExample(PayloadExample def){
        try{
            PayloadExampleDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteDmuDefinition(def);
    }

    public int getPayloadExampleCount(){
        return(PayloadExampleDefs.size());
    }

    public PayloadExample getPayloadExample(DotName name){
        return(PayloadExampleDefs.getDefinition(name));
    }

    public Iterator<PayloadExample> getAllPayloadExample(){
        return(PayloadExampleDefs.values().iterator());
    }

    public PayloadExample getPayloadExampleDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(PayloadExampleDefs.getDefinition(name));
    }

    public Iterator<PayloadExample> getPayloadExampleDefinitionsByName(String name) throws DmcValueException{
        return(PayloadExampleDefs.getDefinitionsByName(name));
    }

    public int getPayloadExampleDefinitionCountByName(String name) throws DmcValueException{
        return(PayloadExampleDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:343)
    public void addPayloadSortInfo(PayloadSortInfo def){
        PayloadSortInfoDefs.add(def);
        addDmuDefinition(def);
    }

    public void deletePayloadSortInfo(PayloadSortInfo def){
        try{
            PayloadSortInfoDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteDmuDefinition(def);
    }

    public int getPayloadSortInfoCount(){
        return(PayloadSortInfoDefs.size());
    }

    public PayloadSortInfo getPayloadSortInfo(DotName name){
        return(PayloadSortInfoDefs.getDefinition(name));
    }

    public Iterator<PayloadSortInfo> getAllPayloadSortInfo(){
        return(PayloadSortInfoDefs.values().iterator());
    }

    public PayloadSortInfo getPayloadSortInfoDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(PayloadSortInfoDefs.getDefinition(name));
    }

    public Iterator<PayloadSortInfo> getPayloadSortInfoDefinitionsByName(String name) throws DmcValueException{
        return(PayloadSortInfoDefs.getDefinitionsByName(name));
    }

    public int getPayloadSortInfoDefinitionCountByName(String name) throws DmcValueException{
        return(PayloadSortInfoDefs.getDefinitionCountByName(name));
    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpAddMethod(DSDArtifactFormatter.java:378)
    public void addDefinition(DSDefinition definition){
            if (definition instanceof PayloadExample){
                addPayloadExample((PayloadExample)definition);
            }
            else if (definition instanceof PayloadSortInfo){
                addPayloadSortInfo((PayloadSortInfo)definition);
            }
            else if (definition instanceof DmuModule){
                addDmuModule((DmuModule)definition);
            }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpAddMethodAndUpdateModuleMethod(DSDArtifactFormatter.java:421)
    public void addDefinition(DSDefinition definition, DmuModule module){
            if (definition instanceof PayloadExample){
                addPayloadExample((PayloadExample)definition);
                module.addPayloadExample((PayloadExample)definition);
            }
            else if (definition instanceof PayloadSortInfo){
                addPayloadSortInfo((PayloadSortInfo)definition);
                module.addPayloadSortInfo((PayloadSortInfo)definition);
            }
            else if (definition instanceof DmuModule){
                addDmuModule((DmuModule)definition);
            }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpSummaryMethod(DSDArtifactFormatter.java:460)
    public String summary(){
        StringBuilder sb = new StringBuilder();
        sb.append(DmuDefinitionDefs.summary());
        sb.append(PayloadSortInfoDefs.summary());
        sb.append(PayloadExampleDefs.summary());
        sb.append(DmuModuleDefs.summary());
       return(sb.toString());
    }

}

