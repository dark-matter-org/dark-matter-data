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
package org.dmd.dmt.dsd.dsda.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:121)
import java.util.Iterator;                                                       // To allow access to our definitions - (DSDArtifactFormatter.java:119)
import org.dmd.dmc.definitions.DmcDefinitionSet;                                 // Our base to provide definition set storage - (DSDArtifactFormatter.java:118)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;                        // A definition from the ModuleA Module - (DSDArtifactFormatter.java:156)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;                           // A definition from the ModuleA Module - (DSDArtifactFormatter.java:159)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;                             // A definition from the ModuleA Module - (DSDArtifactFormatter.java:159)
import org.dmd.dmt.dsd.dsda.server.generated.dsd.ModuleAGlobalInterface;         // Interface for ModuleA definitions - (DSDArtifactFormatter.java:153)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManager(DSDArtifactFormatter.java:125)
public class ModuleADefinitionManager implements ModuleAGlobalInterface {

    // Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionManagerMembers(DSDArtifactFormatter.java:178)
    DmcDefinitionSet<AConceptBase> AConceptBaseDefs;
    DmcDefinitionSet<AConceptX> AConceptXDefs;
    DmcDefinitionSet<ModuleA> ModuleADefs;

    public ModuleADefinitionManager(){

        AConceptBaseDefs = new DmcDefinitionSet<AConceptBase>();
        AConceptXDefs = new DmcDefinitionSet<AConceptX>();
        ModuleADefs = new DmcDefinitionSet<ModuleA>();

    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:164)
    // Called from: org.dmd.dmg.generators.DSDArtifactFormatter.dumpDefinitionInterfaceMethods(DSDArtifactFormatter.java:196)
    /**
     * All definitions are added to the base definition collection.
     */
    void addAConceptBase(AConceptBase def){
        AConceptBaseDefs.add(def);
    }

    public int getAConceptBaseCount(){
        return(AConceptBaseDefs.size());
    }

    public Iterator<AConceptBase> getAllAConceptBase(){
        return(AConceptBaseDefs.values().iterator());
    }

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:189)
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

    // Generated from: org.dmd.dms.DSDefinitionModule.getInterfaceMethodsImplementations(DSDefinitionModule.java:189)
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


}

