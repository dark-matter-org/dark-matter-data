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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:607)
import java.util.Iterator;                                        // To provide iterators over definitions - (DSDArtifactFormatter.java:602)
import org.dmd.dmc.DmcNameClashException;                         // May be thrown when finding definitions - (DSDArtifactFormatter.java:603)
import org.dmd.dmc.DmcValueException;                             // May be thrown when finding definitions - (DSDArtifactFormatter.java:604)
import org.dmd.dmc.types.DotName;                                 // To support the find method for definitions - (DSDefinitionModule.java:181)
import org.dmd.dmt.dsd.dsda.server.extended.ABConceptX;           // A definition from the ModuleA Module - (DSDefinitionModule.java:193)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;         // A definition from the ModuleA Module - (DSDefinitionModule.java:179)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;            // A definition from the ModuleA Module - (DSDefinitionModule.java:193)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;              // A definition from the ModuleA Module - (DSDefinitionModule.java:193)
import org.dmd.util.exceptions.ResultException;                   // To support definition deletions - (DSDefinitionModule.java:182)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:611)
/**
 * This interface is implemented by definition managers that store definitions from the ModuleA module.
 */
public interface ModuleAGlobalInterface {

    public int getAConceptBaseCount();
    public AConceptBase getAConceptBase(DotName name);
    public Iterator<AConceptBase> getAllAConceptBase();

    public void addABConceptX(ABConceptX def);
    public void deleteABConceptX(ABConceptX def);
    public int getABConceptXCount();
    public ABConceptX getABConceptX(DotName name);
    public Iterator<ABConceptX> getAllABConceptX();
    public ABConceptX getABConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<ABConceptX> getABConceptXDefinitionsByName(String name) throws DmcValueException;

    public int getABConceptXDefinitionCountByName(String name) throws DmcValueException;

    public void addAConceptX(AConceptX def);
    public void deleteAConceptX(AConceptX def);
    public int getAConceptXCount();
    public AConceptX getAConceptX(DotName name);
    public Iterator<AConceptX> getAllAConceptX();
    public AConceptX getAConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<AConceptX> getAConceptXDefinitionsByName(String name) throws DmcValueException;

    public int getAConceptXDefinitionCountByName(String name) throws DmcValueException;

    public void addModuleA(ModuleA def);
    public void deleteModuleA(ModuleA def);
    public int getModuleACount();
    public ModuleA getModuleA(DotName name);
    public Iterator<ModuleA> getAllModuleA();
    public ModuleA getModuleADefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<ModuleA> getModuleADefinitionsByName(String name) throws DmcValueException;

    public int getModuleADefinitionCountByName(String name) throws DmcValueException;

}

