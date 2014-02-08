//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:146)
import java.util.Iterator;                                                       // To allow access to our definitions - (DSDArtifactFormatter.java:133)
import org.dmd.dmc.DmcAttributeInfo;                                             // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashException;                                        // Used when resolving clashes - (DSDArtifactFormatter.java:144)
import org.dmd.dmc.DmcNameClashObjectSet;                                        // Used when resolving clashes - (DSDArtifactFormatter.java:143)
import org.dmd.dmc.DmcNameClashResolverIF;                                       // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                            // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcNamedObjectIF;                                             // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcObject;                                                    // To support object resolution - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.DmcObjectName;                                                // To support object resolution - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.DmcValueException;                                            // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcValueExceptionSet;                                         // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                 // Our base to provide definition set storage - (DSDArtifactFormatter.java:132)
import org.dmd.dmc.types.DotName;                                                // To support the find method for definitions - (DSDArtifactFormatter.java:134)
import org.dmd.dms.DSDefinition;                                                 // The base of all definitions - (DSDArtifactFormatter.java:131)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;                        // A definition from the ModuleA Module - (DSDArtifactFormatter.java:279)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;                           // A definition from the ModuleA Module - (DSDArtifactFormatter.java:283)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                             // A definition from the ModuleA Module - (DSDArtifactFormatter.java:283)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGlobalInterface;         // Interface for ModuleA definitions - (DSDArtifactFormatter.java:276)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptBase;                        // A definition from the ModuleB Module - (DSDArtifactFormatter.java:279)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptX;                           // A definition from the ModuleB Module - (DSDArtifactFormatter.java:283)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                             // A definition from the ModuleB Module - (DSDArtifactFormatter.java:283)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBGlobalInterface;         // Interface for ModuleB definitions - (DSDArtifactFormatter.java:276)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptBase;                        // A definition from the ModuleC Module - (DSDArtifactFormatter.java:279)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptX;                           // A definition from the ModuleC Module - (DSDArtifactFormatter.java:283)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;                             // A definition from the ModuleC Module - (DSDArtifactFormatter.java:283)
import org.dmd.dmt.dsd.dsdc.server.generated.dsd.ModuleCGlobalInterface;         // Interface for ModuleC definitions - (DSDArtifactFormatter.java:276)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:150)
public class ModuleCDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, ModuleAGlobalInterface, ModuleBGlobalInterface, ModuleCGlobalInterface {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:302)
    DmcDefinitionSet<AConceptBase> AConceptBaseDefs;
    DmcDefinitionSet<AConceptX> AConceptXDefs;
    DmcDefinitionSet<ModuleA> ModuleADefs;
    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:302)
    DmcDefinitionSet<BConceptBase> BConceptBaseDefs;
    DmcDefinitionSet<BConceptX> BConceptXDefs;
    DmcDefinitionSet<ModuleB> ModuleBDefs;
    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:302)
    DmcDefinitionSet<CConceptBase> CConceptBaseDefs;
    DmcDefinitionSet<CConceptX> CConceptXDefs;
    DmcDefinitionSet<ModuleC> ModuleCDefs;

    public ModuleCDefinitionManager(){

        // This will be populated as a result of adding definitions to the definition sets for each definition type
        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.initializeDefinitionManagerMembers(DSDArtifactFormatter.java:329)
        AConceptBaseDefs = new DmcDefinitionSet<AConceptBase>("AConceptBase", allDefinitions);
        AConceptXDefs = new DmcDefinitionSet<AConceptX>("AConceptX", allDefinitions);
        ModuleADefs = new DmcDefinitionSet<ModuleA>("ModuleA", allDefinitions);
        BConceptBaseDefs = new DmcDefinitionSet<BConceptBase>("BConceptBase", allDefinitions);
        BConceptXDefs = new DmcDefinitionSet<BConceptX>("BConceptX", allDefinitions);
        ModuleBDefs = new DmcDefinitionSet<ModuleB>("ModuleB", allDefinitions);
        CConceptBaseDefs = new DmcDefinitionSet<CConceptBase>("CConceptBase", allDefinitions);
        CConceptXDefs = new DmcDefinitionSet<CConceptX>("CConceptX", allDefinitions);
        ModuleCDefs = new DmcDefinitionSet<ModuleC>("ModuleC", allDefinitions);

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:166)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:174)
    @Override
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:191)
    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:197)
    @Override
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

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:217)
    @Override
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
            }
        }
        else{
            rc = allDefinitions.getDefinition(dn);
        }
    
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:240)
    @Override
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:219)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:323)
    /**
     * All definitions are added to the base definition collection.
     */
    void addAConceptBase(AConceptBase def){
        AConceptBaseDefs.add(def);
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addAConceptX(AConceptX def){
        AConceptXDefs.add(def);
        addAConceptBase(def);
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addModuleA(ModuleA def){
        ModuleADefs.add(def);
        addAConceptBase(def);
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:219)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:323)
    /**
     * All definitions are added to the base definition collection.
     */
    void addBConceptBase(BConceptBase def){
        BConceptBaseDefs.add(def);
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addBConceptX(BConceptX def){
        BConceptXDefs.add(def);
        addBConceptBase(def);
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addModuleB(ModuleB def){
        ModuleBDefs.add(def);
        addBConceptBase(def);
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:219)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:323)
    /**
     * All definitions are added to the base definition collection.
     */
    void addCConceptBase(CConceptBase def){
        CConceptBaseDefs.add(def);
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addCConceptX(CConceptX def){
        CConceptXDefs.add(def);
        addCConceptBase(def);
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:254)
    public void addModuleC(ModuleC def){
        ModuleCDefs.add(def);
        addCConceptBase(def);
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


}

