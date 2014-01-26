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
package org.dmd.dmt.dsd.dsdb.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:144)
import java.util.Iterator;                                                       // To allow access to our definitions - (DSDArtifactFormatter.java:131)
import org.dmd.dmc.DmcAttributeInfo;                                             // Used when resolving clashes - (DSDArtifactFormatter.java:140)
import org.dmd.dmc.DmcNameClashException;                                        // Used when resolving clashes - (DSDArtifactFormatter.java:142)
import org.dmd.dmc.DmcNameClashObjectSet;                                        // Used when resolving clashes - (DSDArtifactFormatter.java:141)
import org.dmd.dmc.DmcNameClashResolverIF;                                       // To support object resolution - (DSDArtifactFormatter.java:133)
import org.dmd.dmc.DmcNameResolverWithClashSupportIF;                            // To support object resolution - (DSDArtifactFormatter.java:134)
import org.dmd.dmc.DmcNamedObjectIF;                                             // To support object resolution - (DSDArtifactFormatter.java:135)
import org.dmd.dmc.DmcObject;                                                    // To support object resolution - (DSDArtifactFormatter.java:136)
import org.dmd.dmc.DmcObjectName;                                                // To support object resolution - (DSDArtifactFormatter.java:137)
import org.dmd.dmc.DmcValueException;                                            // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:139)
import org.dmd.dmc.DmcValueExceptionSet;                                         // Can be thrown when we try to resolve references - (DSDArtifactFormatter.java:138)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                 // Our base to provide definition set storage - (DSDArtifactFormatter.java:130)
import org.dmd.dmc.types.DotName;                                                // To support the find method for definitions - (DSDArtifactFormatter.java:132)
import org.dmd.dms.DSDefinition;                                                 // The base of all definitions - (DSDArtifactFormatter.java:129)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;                        // A definition from the ModuleA Module - (DSDArtifactFormatter.java:256)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;                           // A definition from the ModuleA Module - (DSDArtifactFormatter.java:260)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                             // A definition from the ModuleA Module - (DSDArtifactFormatter.java:260)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGlobalInterface;         // Interface for ModuleA definitions - (DSDArtifactFormatter.java:253)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptBase;                        // A definition from the ModuleB Module - (DSDArtifactFormatter.java:256)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptX;                           // A definition from the ModuleB Module - (DSDArtifactFormatter.java:260)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                             // A definition from the ModuleB Module - (DSDArtifactFormatter.java:260)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBGlobalInterface;         // Interface for ModuleB definitions - (DSDArtifactFormatter.java:253)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:148)
public class ModuleBDefinitionManager implements DmcNameClashResolverIF, DmcNameResolverWithClashSupportIF, ModuleAGlobalInterface, ModuleBGlobalInterface {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:279)
    DmcDefinitionSet<AConceptBase> AConceptBaseDefs;
    DmcDefinitionSet<AConceptX> AConceptXDefs;
    DmcDefinitionSet<ModuleA> ModuleADefs;
    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:279)
    DmcDefinitionSet<BConceptBase> BConceptBaseDefs;
    DmcDefinitionSet<BConceptX> BConceptXDefs;
    DmcDefinitionSet<ModuleB> ModuleBDefs;

    public ModuleBDefinitionManager(){

        allDefinitions = new DmcDefinitionSet<DSDefinition>("allDefinitions");

        AConceptBaseDefs = new DmcDefinitionSet<AConceptBase>("AConceptBaseDefs");
        AConceptXDefs = new DmcDefinitionSet<AConceptX>("AConceptXDefs");
        ModuleADefs = new DmcDefinitionSet<ModuleA>("ModuleADefs");
        BConceptBaseDefs = new DmcDefinitionSet<BConceptBase>("BConceptBaseDefs");
        BConceptXDefs = new DmcDefinitionSet<BConceptX>("BConceptXDefs");
        ModuleBDefs = new DmcDefinitionSet<ModuleB>("ModuleBDefs");

    }

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:163)
    public void resolveReferences() throws DmcValueExceptionSet {
        for(DSDefinition def: allDefinitions.values()){
            def.resolveReferences(this,this);
        }
    }

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

    @Override
    public DmcNamedObjectIF findNamedObject(DmcObjectName name, int attributeID) {
        throw(new IllegalStateException("This method is not supported on generated definition managers"));
    }

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

    @Override
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DmcValueException {
        DmcNamedObjectIF rc = null;
        try{
            rc = allDefinitions.getDefinition(name.getNameString());
        } catch (DmcNameClashException e) {
            rc = resolver.resolveClash(object, ai, e.getClashSet());
        }
    
        return(rc);
    }

    @Override
    public DmcNamedObjectIF resolveClash(DmcObject obj, DmcAttributeInfo ai, DmcNameClashObjectSet<?> ncos) throws DmcValueException {
        System.out.println("***********\n\n");
        Iterator<DmcNamedObjectIF> it = ncos.getMatches();
        while(it.hasNext()){
            DSDefinition def = (DSDefinition) it.next();
            System.out.println(def.toOIF() + "\n");
        }
        return null;
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:219)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:300)
    /**
     * All definitions are added to the base definition collection.
     */
    void addAConceptBase(AConceptBase def){
        AConceptBaseDefs.add(def);
        allDefinitions.add(def);
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
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:300)
    /**
     * All definitions are added to the base definition collection.
     */
    void addBConceptBase(BConceptBase def){
        BConceptBaseDefs.add(def);
        allDefinitions.add(def);
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


}

