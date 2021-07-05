//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013-2021 dark-matter-data committers
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
package org.dmd.dmt.dsd.dsdc.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:163)
import java.util.Collection;                                                     // To return values from indices - (DSDArtifactFormatter.java:159)
import java.util.Iterator;                                                       // To allow access to our definitions - (DSDArtifactFormatter.java:138)
import java.util.TreeMap;                                                        // To organize access to our indices - (DSDArtifactFormatter.java:158)
import org.dmd.dmc.DmcAttributeInfo;                                             // Used when resolving clashes - (DSDArtifactFormatter.java:147)
import org.dmd.dmc.DmcClassInfo;                                                 // The class info for our indices - (DSDArtifactFormatter.java:160)
import org.dmd.dmc.DmcNameClashException;                                        // Used when resolving clashes - (DSDArtifactFormatter.java:149)
import org.dmd.dmc.DmcNameClashObjectSet;                                        // Used when resolving clashes - (DSDArtifactFormatter.java:148)
import org.dmd.dmc.DmcNameClashResolverIF;                                       // To support object resolution - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                            // To support object resolution - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcNamedObjectIF;                                             // To support object resolution - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcObject;                                                    // To support object resolution - (DSDArtifactFormatter.java:143)
import org.dmd.dmc.DmcObjectName;                                                // To support object resolution - (DSDArtifactFormatter.java:144)
import org.dmd.dmc.DmcValueException;                                            // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:146)
import org.dmd.dmc.DmcValueExceptionSet;                                         // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:145)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                 // Our base to provide definition set storage - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.types.DotName;                                                // To support the find method for definitions - (DSDArtifactFormatter.java:139)
import org.dmd.dms.DSDefinition;                                                 // The base of all definitions - (DSDArtifactFormatter.java:136)
import org.dmd.dmt.dsd.dsda.server.extended.ABConceptX;                          // A definition from the ModuleA Module - (DSDArtifactFormatter.java:506)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;                        // A definition from the ModuleA Module - (DSDArtifactFormatter.java:502)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;                           // A definition from the ModuleA Module - (DSDArtifactFormatter.java:506)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                             // A definition from the ModuleA Module - (DSDArtifactFormatter.java:506)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGlobalInterface;         // Interface for ModuleA definitions - (DSDArtifactFormatter.java:497)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;                      // To allow use of DmcClassInfo from the dsdA schema for index access - (DSDArtifactFormatter.java:156)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptBase;                        // A definition from the ModuleB Module - (DSDArtifactFormatter.java:502)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptX;                           // A definition from the ModuleB Module - (DSDArtifactFormatter.java:506)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                             // A definition from the ModuleB Module - (DSDArtifactFormatter.java:506)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBGlobalInterface;         // Interface for ModuleB definitions - (DSDArtifactFormatter.java:497)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.DsdBDMSAG;                      // To allow use of DmcClassInfo from the dsdB schema for index access - (DSDArtifactFormatter.java:156)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptBase;                        // A definition from the ModuleC Module - (DSDArtifactFormatter.java:502)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptX;                           // A definition from the ModuleC Module - (DSDArtifactFormatter.java:506)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;                             // A definition from the ModuleC Module - (DSDArtifactFormatter.java:506)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCGlobalInterface;         // Interface for ModuleC definitions - (DSDArtifactFormatter.java:497)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.DsdCDMSAG;                      // To allow use of DmcClassInfo from the dsdC schema for index access - (DSDArtifactFormatter.java:156)
import org.dmd.dmw.DmwNamedObjectWrapper;                                        // What we return from getIndex() - (DSDArtifactFormatter.java:161)
import org.dmd.util.exceptions.ResultException;                                  // When deletion problems occur - (DSDArtifactFormatter.java:150)

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:165)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleADefinitionsIF;         // Interface for ModuleA definitions - (InitializationInterfaceManager.java:103)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBDefinitionsIF;         // Interface for ModuleB definitions - (InitializationInterfaceManager.java:103)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCDefinitionsIF;         // Interface for ModuleC definitions - (InitializationInterfaceManager.java:103)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:169)
public class ModuleCDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, ModuleAGlobalInterface, ModuleBGlobalInterface, ModuleCGlobalInterface , ModuleADefinitionsIF, ModuleBDefinitionsIF, ModuleCDefinitionsIF {

    private DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:525)
    private DmcDefinitionSet<AConceptBase> AConceptBaseDefs;
    private DmcDefinitionSet<ABConceptX> ABConceptXDefs;
    private DmcDefinitionSet<AConceptX> AConceptXDefs;
    private DmcDefinitionSet<ModuleA> ModuleADefs;
    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:525)
    private DmcDefinitionSet<BConceptBase> BConceptBaseDefs;
    private DmcDefinitionSet<BConceptX> BConceptXDefs;
    private DmcDefinitionSet<ModuleB> ModuleBDefs;
    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:525)
    private DmcDefinitionSet<CConceptBase> CConceptBaseDefs;
    private DmcDefinitionSet<CConceptX> CConceptXDefs;
    private DmcDefinitionSet<ModuleC> ModuleCDefs;

    private TreeMap<DmcClassInfo,DmcDefinitionSet<?>>	indicesByClass;

    public ModuleCDefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        indicesByClass = new TreeMap<>();

        // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.initializeDefinitionManagerMembers(DSDArtifactFormatter.java:552)
        AConceptBaseDefs = new DmcDefinitionSet<AConceptBase>("AConceptBase", allDefinitions);
        indicesByClass.put(DsdADMSAG.__AConceptBase, AConceptBaseDefs);

        AConceptXDefs = new DmcDefinitionSet<AConceptX>("AConceptX", allDefinitions, AConceptBaseDefs);
        indicesByClass.put(DsdADMSAG.__AConceptX, AConceptXDefs);

        ABConceptXDefs = new DmcDefinitionSet<ABConceptX>("ABConceptX", allDefinitions, AConceptXDefs);
        indicesByClass.put(DsdADMSAG.__ABConceptX, ABConceptXDefs);

        ModuleADefs = new DmcDefinitionSet<ModuleA>("ModuleA", allDefinitions, AConceptBaseDefs);
        indicesByClass.put(DsdADMSAG.__ModuleA, ModuleADefs);

        BConceptBaseDefs = new DmcDefinitionSet<BConceptBase>("BConceptBase", allDefinitions);
        indicesByClass.put(DsdBDMSAG.__BConceptBase, BConceptBaseDefs);

        BConceptXDefs = new DmcDefinitionSet<BConceptX>("BConceptX", allDefinitions, BConceptBaseDefs);
        indicesByClass.put(DsdBDMSAG.__BConceptX, BConceptXDefs);

        ModuleBDefs = new DmcDefinitionSet<ModuleB>("ModuleB", allDefinitions, BConceptBaseDefs);
        indicesByClass.put(DsdBDMSAG.__ModuleB, ModuleBDefs);

        CConceptBaseDefs = new DmcDefinitionSet<CConceptBase>("CConceptBase", allDefinitions);
        indicesByClass.put(DsdCDMSAG.__CConceptBase, CConceptBaseDefs);

        CConceptXDefs = new DmcDefinitionSet<CConceptX>("CConceptX", allDefinitions, CConceptBaseDefs);
        indicesByClass.put(DsdCDMSAG.__CConceptX, CConceptXDefs);

        ModuleCDefs = new DmcDefinitionSet<ModuleC>("ModuleC", allDefinitions, CConceptBaseDefs);
        indicesByClass.put(DsdCDMSAG.__ModuleC, ModuleCDefs);


    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:192)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:200)
    public Collection<DmwNamedObjectWrapper> getIndex(DmcClassInfo ci){
        DmcDefinitionSet<?>    dds = indicesByClass.get(ci);
        
        if (dds == null)
            throw(new IllegalStateException("No index available for class: " + ci.name));
        
        return(dds.getIndex());
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:211)
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:227)
    public DSDefinition findDefinition(DotName name) {
    	   return(allDefinitions.getDefinition(name));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:233)
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
        
        CConceptBase base = (CConceptBase)def;
        ModuleC module = base.getDefinedInModuleC();
        
        if (def instanceof CConceptX){
            module.deleteCConceptX((CConceptX)def);
        }
        else if (def instanceof ModuleC){
        }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:288)
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:293)
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:312)
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
                        CConceptBase def = (CConceptBase) it.next();
                        ex.addMoreInfo(def.getDefinedInModuleC().getName().getNameString() + "." + name.getNameString());
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:343)
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:313)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:546)
    /**
     * All definitions are added to the base definition collection.
     */
    void addAConceptBase(AConceptBase def){
        AConceptBaseDefs.add(def);
    }

    void deleteAConceptBase(AConceptBase def){
        try {
            AConceptBaseDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
    }

    public int getAConceptBaseCount(){
        return(AConceptBaseDefs.size());
    }

    public AConceptBase getAConceptBase(DotName name){
        return(AConceptBaseDefs.getDefinition(name));
    }

    public Iterator<AConceptBase> getAllAConceptBase(){
        return(AConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addABConceptX(ABConceptX def){
        ABConceptXDefs.add(def);
        addAConceptX(def);
    }

    public void deleteABConceptX(ABConceptX def){
        try{
            ABConceptXDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteAConceptX(def);
    }

    public int getABConceptXCount(){
        return(ABConceptXDefs.size());
    }

    public ABConceptX getABConceptX(DotName name){
        return(ABConceptXDefs.getDefinition(name));
    }

    public Iterator<ABConceptX> getAllABConceptX(){
        return(ABConceptXDefs.values().iterator());
    }

    public ABConceptX getABConceptXDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ABConceptXDefs.getDefinition(name));
    }

    public Iterator<ABConceptX> getABConceptXDefinitionsByName(String name) throws DmcValueException{
        return(ABConceptXDefs.getDefinitionsByName(name));
    }

    public int getABConceptXDefinitionCountByName(String name) throws DmcValueException{
        return(ABConceptXDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addAConceptX(AConceptX def){
        AConceptXDefs.add(def);
        addAConceptBase(def);
    }

    public void deleteAConceptX(AConceptX def){
        try{
            AConceptXDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteAConceptBase(def);
    }

    public int getAConceptXCount(){
        return(AConceptXDefs.size());
    }

    public AConceptX getAConceptX(DotName name){
        return(AConceptXDefs.getDefinition(name));
    }

    public Iterator<AConceptX> getAllAConceptX(){
        return(AConceptXDefs.values().iterator());
    }

    public AConceptX getAConceptXDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(AConceptXDefs.getDefinition(name));
    }

    public Iterator<AConceptX> getAConceptXDefinitionsByName(String name) throws DmcValueException{
        return(AConceptXDefs.getDefinitionsByName(name));
    }

    public int getAConceptXDefinitionCountByName(String name) throws DmcValueException{
        return(AConceptXDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addModuleA(ModuleA def){
        ModuleADefs.add(def);
        addAConceptBase(def);
    }

    public void deleteModuleA(ModuleA def){
        try{
            ModuleADefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteAConceptBase(def);
    }

    public int getModuleACount(){
        return(ModuleADefs.size());
    }

    public ModuleA getModuleA(DotName name){
        return(ModuleADefs.getDefinition(name));
    }

    public Iterator<ModuleA> getAllModuleA(){
        return(ModuleADefs.values().iterator());
    }

    public ModuleA getModuleADefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ModuleADefs.getDefinition(name));
    }

    public Iterator<ModuleA> getModuleADefinitionsByName(String name) throws DmcValueException{
        return(ModuleADefs.getDefinitionsByName(name));
    }

    public int getModuleADefinitionCountByName(String name) throws DmcValueException{
        return(ModuleADefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:313)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:546)
    /**
     * All definitions are added to the base definition collection.
     */
    void addBConceptBase(BConceptBase def){
        BConceptBaseDefs.add(def);
    }

    void deleteBConceptBase(BConceptBase def){
        try {
            BConceptBaseDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
    }

    public int getBConceptBaseCount(){
        return(BConceptBaseDefs.size());
    }

    public BConceptBase getBConceptBase(DotName name){
        return(BConceptBaseDefs.getDefinition(name));
    }

    public Iterator<BConceptBase> getAllBConceptBase(){
        return(BConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addBConceptX(BConceptX def){
        BConceptXDefs.add(def);
        addBConceptBase(def);
    }

    public void deleteBConceptX(BConceptX def){
        try{
            BConceptXDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteBConceptBase(def);
    }

    public int getBConceptXCount(){
        return(BConceptXDefs.size());
    }

    public BConceptX getBConceptX(DotName name){
        return(BConceptXDefs.getDefinition(name));
    }

    public Iterator<BConceptX> getAllBConceptX(){
        return(BConceptXDefs.values().iterator());
    }

    public BConceptX getBConceptXDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(BConceptXDefs.getDefinition(name));
    }

    public Iterator<BConceptX> getBConceptXDefinitionsByName(String name) throws DmcValueException{
        return(BConceptXDefs.getDefinitionsByName(name));
    }

    public int getBConceptXDefinitionCountByName(String name) throws DmcValueException{
        return(BConceptXDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addModuleB(ModuleB def){
        ModuleBDefs.add(def);
        addBConceptBase(def);
    }

    public void deleteModuleB(ModuleB def){
        try{
            ModuleBDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteBConceptBase(def);
    }

    public int getModuleBCount(){
        return(ModuleBDefs.size());
    }

    public ModuleB getModuleB(DotName name){
        return(ModuleBDefs.getDefinition(name));
    }

    public Iterator<ModuleB> getAllModuleB(){
        return(ModuleBDefs.values().iterator());
    }

    public ModuleB getModuleBDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ModuleBDefs.getDefinition(name));
    }

    public Iterator<ModuleB> getModuleBDefinitionsByName(String name) throws DmcValueException{
        return(ModuleBDefs.getDefinitionsByName(name));
    }

    public int getModuleBDefinitionCountByName(String name) throws DmcValueException{
        return(ModuleBDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:313)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:546)
    /**
     * All definitions are added to the base definition collection.
     */
    void addCConceptBase(CConceptBase def){
        CConceptBaseDefs.add(def);
    }

    void deleteCConceptBase(CConceptBase def){
        try {
            CConceptBaseDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
    }

    public int getCConceptBaseCount(){
        return(CConceptBaseDefs.size());
    }

    public CConceptBase getCConceptBase(DotName name){
        return(CConceptBaseDefs.getDefinition(name));
    }

    public Iterator<CConceptBase> getAllCConceptBase(){
        return(CConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addCConceptX(CConceptX def){
        CConceptXDefs.add(def);
        addCConceptBase(def);
    }

    public void deleteCConceptX(CConceptX def){
        try{
            CConceptXDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteCConceptBase(def);
    }

    public int getCConceptXCount(){
        return(CConceptXDefs.size());
    }

    public CConceptX getCConceptX(DotName name){
        return(CConceptXDefs.getDefinition(name));
    }

    public Iterator<CConceptX> getAllCConceptX(){
        return(CConceptXDefs.values().iterator());
    }

    public CConceptX getCConceptXDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(CConceptXDefs.getDefinition(name));
    }

    public Iterator<CConceptX> getCConceptXDefinitionsByName(String name) throws DmcValueException{
        return(CConceptXDefs.getDefinitionsByName(name));
    }

    public int getCConceptXDefinitionCountByName(String name) throws DmcValueException{
        return(CConceptXDefs.getDefinitionCountByName(name));
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:351)
    public void addModuleC(ModuleC def){
        ModuleCDefs.add(def);
        addCConceptBase(def);
    }

    public void deleteModuleC(ModuleC def){
        try{
            ModuleCDefs.delete(def);
        } catch (ResultException e) {
            throw(new IllegalStateException(e));
        }
        deleteCConceptBase(def);
    }

    public int getModuleCCount(){
        return(ModuleCDefs.size());
    }

    public ModuleC getModuleC(DotName name){
        return(ModuleCDefs.getDefinition(name));
    }

    public Iterator<ModuleC> getAllModuleC(){
        return(ModuleCDefs.values().iterator());
    }

    public ModuleC getModuleCDefinition(String name) throws DmcNameClashException, DmcValueException{
        return(ModuleCDefs.getDefinition(name));
    }

    public Iterator<ModuleC> getModuleCDefinitionsByName(String name) throws DmcValueException{
        return(ModuleCDefs.getDefinitionsByName(name));
    }

    public int getModuleCDefinitionCountByName(String name) throws DmcValueException{
        return(ModuleCDefs.getDefinitionCountByName(name));
    }


    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpAddMethod(DSDArtifactFormatter.java:385)
    public void addDefinition(DSDefinition definition){
            if (definition instanceof CConceptX){
                addCConceptX((CConceptX)definition);
            }
            else if (definition instanceof ModuleC){
                addModuleC((ModuleC)definition);
            }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpAddMethodAndUpdateModuleMethod(DSDArtifactFormatter.java:428)
    public void addDefinition(DSDefinition definition, ModuleC module){
            if (definition instanceof CConceptX){
                addCConceptX((CConceptX)definition);
                module.addCConceptX((CConceptX)definition);
            }
            else if (definition instanceof ModuleC){
                addModuleC((ModuleC)definition);
            }

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpSummaryMethod(DSDArtifactFormatter.java:467)
    public String summary(){
        StringBuilder sb = new StringBuilder();
        sb.append(CConceptBaseDefs.summary());
        sb.append(CConceptXDefs.summary());
        sb.append(ModuleCDefs.summary());
       return(sb.toString());
    }

}

