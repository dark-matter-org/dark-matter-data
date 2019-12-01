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
package org.dmd.dmt.dsd.dsda.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:447)
import java.util.Iterator;                                                // To provide iterators over definitions - (DmoCacheFormatter.java:442)
import org.dmd.dmc.DmcNameClashException;                                 // May be thrown when finding definitions - (DmoCacheFormatter.java:443)
import org.dmd.dmc.DmcValueException;                                     // May be thrown when finding definitions - (DmoCacheFormatter.java:444)
import org.dmd.dmc.types.DotName;                                         // To support the find method for definitions - (DSDefinitionModule.java:208)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ABConceptXDMO;           // A definition from the ModuleA Module - (DSDefinitionModule.java:220)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptBaseDMO;         // A definition from the ModuleA Module - (DSDefinitionModule.java:206)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptXDMO;            // A definition from the ModuleA Module - (DSDefinitionModule.java:220)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ModuleADMO;              // A definition from the ModuleA Module - (DSDefinitionModule.java:220)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:451)
/**
 * This interface is implemented by definition managers that store definitions from the ModuleA module.
 */
public interface ModuleAGlobalInterface {

    public int getAConceptBaseCount();
    public AConceptBaseDMO getAConceptBase(DotName name);
    public Iterator<AConceptBaseDMO> getAllAConceptBase();

    public void addABConceptX(ABConceptXDMO def);
    public int getABConceptXCount();
    public ABConceptXDMO getABConceptX(DotName name);
    public Iterator<ABConceptXDMO> getAllABConceptX();
    public ABConceptXDMO getABConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addAConceptX(AConceptXDMO def);
    public int getAConceptXCount();
    public AConceptXDMO getAConceptX(DotName name);
    public Iterator<AConceptXDMO> getAllAConceptX();
    public AConceptXDMO getAConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addModuleA(ModuleADMO def);
    public int getModuleACount();
    public ModuleADMO getModuleA(DotName name);
    public Iterator<ModuleADMO> getAllModuleA();
    public ModuleADMO getModuleADefinition(String name) throws DmcNameClashException, DmcValueException;

}

