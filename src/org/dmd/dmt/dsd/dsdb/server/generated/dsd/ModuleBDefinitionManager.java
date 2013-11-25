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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:125)
import java.util.Iterator;                                                       // To allow access to our definitions - (DSDArtifactFormatter.java:123)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                 // Our base to provide definition set storage - (DSDArtifactFormatter.java:122)
import org.dmd.dms.DSDefinition;                                                 // The base of all definitions - (DSDArtifactFormatter.java:121)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;                        // A definition from the ModuleA Module - (DSDArtifactFormatter.java:164)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;                           // A definition from the ModuleA Module - (DSDArtifactFormatter.java:167)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                             // A definition from the ModuleA Module - (DSDArtifactFormatter.java:167)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGlobalInterface;         // Interface for ModuleA definitions - (DSDArtifactFormatter.java:161)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptBase;                        // A definition from the ModuleB Module - (DSDArtifactFormatter.java:164)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptX;                           // A definition from the ModuleB Module - (DSDArtifactFormatter.java:167)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                             // A definition from the ModuleB Module - (DSDArtifactFormatter.java:167)
import org.dmd.dmt.dsd.dsdb.server.generated.dsd.ModuleBGlobalInterface;         // Interface for ModuleB definitions - (DSDArtifactFormatter.java:161)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:129)
public class ModuleBDefinitionManager implements ModuleAGlobalInterface, ModuleBGlobalInterface {

    DmcDefinitionSet<DSDefinition>	allDefinitions;

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:186)
    DmcDefinitionSet<AConceptBase> AConceptBaseDefs;
    DmcDefinitionSet<AConceptX> AConceptXDefs;
    DmcDefinitionSet<ModuleA> ModuleADefs;
    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:186)
    DmcDefinitionSet<BConceptBase> BConceptBaseDefs;
    DmcDefinitionSet<BConceptX> BConceptXDefs;
    DmcDefinitionSet<ModuleB> ModuleBDefs;

    public ModuleBDefinitionManager(){

        allDefinitions = new DmcDefinitionSet<DSDefinition>();

        AConceptBaseDefs = new DmcDefinitionSet<AConceptBase>();
        AConceptXDefs = new DmcDefinitionSet<AConceptX>();
        ModuleADefs = new DmcDefinitionSet<ModuleA>();
        BConceptBaseDefs = new DmcDefinitionSet<BConceptBase>();
        BConceptXDefs = new DmcDefinitionSet<BConceptX>();
        ModuleBDefs = new DmcDefinitionSet<ModuleB>();

    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:205)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:204)
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

    public Iterator<AConceptBase> getAllAConceptBase(){
        return(AConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:235)
    public void addAConceptX(AConceptX def){
        AConceptXDefs.add(def);
        addAConceptBase(def);
    }

    public int getAConceptXCount(){
        return(AConceptXDefs.size());
    }

    public Iterator<AConceptX> getAllAConceptX(){
        return(AConceptXDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:235)
    public void addModuleA(ModuleA def){
        ModuleADefs.add(def);
        addAConceptBase(def);
    }

    public int getModuleACount(){
        return(ModuleADefs.size());
    }

    public Iterator<ModuleA> getAllModuleA(){
        return(ModuleADefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:205)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:204)
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

    public Iterator<BConceptBase> getAllBConceptBase(){
        return(BConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:235)
    public void addBConceptX(BConceptX def){
        BConceptXDefs.add(def);
        addBConceptBase(def);
    }

    public int getBConceptXCount(){
        return(BConceptXDefs.size());
    }

    public Iterator<BConceptX> getAllBConceptX(){
        return(BConceptXDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:235)
    public void addModuleB(ModuleB def){
        ModuleBDefs.add(def);
        addBConceptBase(def);
    }

    public int getModuleBCount(){
        return(ModuleBDefs.size());
    }

    public Iterator<ModuleB> getAllModuleB(){
        return(ModuleBDefs.values().iterator());
    }


}

