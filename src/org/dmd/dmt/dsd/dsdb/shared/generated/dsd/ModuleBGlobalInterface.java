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
package org.dmd.dmt.dsd.dsdb.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:368)
import java.util.Iterator;                                                // To provide iterators over definitions - (DmoCacheFormatter.java:363)
import org.dmd.dmc.DmcNameClashException;                                 // May be thrown when finding definitions - (DmoCacheFormatter.java:364)
import org.dmd.dmc.DmcValueException;                                     // May be thrown when finding definitions - (DmoCacheFormatter.java:365)
import org.dmd.dmc.types.DotName;                                         // To support the find method for definitions - (DSDefinitionModule.java:206)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptBaseDMO;         // A definition from the ModuleB Module - (DSDefinitionModule.java:204)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptXDMO;            // A definition from the ModuleB Module - (DSDefinitionModule.java:218)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.ModuleBDMO;              // A definition from the ModuleB Module - (DSDefinitionModule.java:218)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:372)
/**
 * This interface is implemented by definition managers that store definitions from the ModuleB module.
 */
public interface ModuleBGlobalInterface {

    public int getBConceptBaseCount();
    public BConceptBaseDMO getBConceptBase(DotName name);
    public Iterator<BConceptBaseDMO> getAllBConceptBase();

    public void addBConceptX(BConceptXDMO def);
    public int getBConceptXCount();
    public BConceptXDMO getBConceptX(DotName name);
    public Iterator<BConceptXDMO> getAllBConceptX();
    public BConceptXDMO getBConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addModuleB(ModuleBDMO def);
    public int getModuleBCount();
    public ModuleBDMO getModuleB(DotName name);
    public Iterator<ModuleBDMO> getAllModuleB();
    public ModuleBDMO getModuleBDefinition(String name) throws DmcNameClashException, DmcValueException;

}

