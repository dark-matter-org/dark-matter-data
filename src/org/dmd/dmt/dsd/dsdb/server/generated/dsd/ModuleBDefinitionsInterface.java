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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManagerInterface(DSDArtifactFormatter.java:259)
import java.util.Iterator;                                        // To provide iterators over definitions - (DSDArtifactFormatter.java:256)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptBase;         // A definition from the ModuleB Module - (DSDefinitionModule.java:68)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptX;            // A definition from the ModuleB Module - (DSDefinitionModule.java:71)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;              // A definition from the ModuleB Module - (DSDefinitionModule.java:71)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateDefinitionManagerInterface(DSDArtifactFormatter.java:263)
public interface ModuleBDefinitionsInterface {

    public int getBConceptBaseCount();
    public Iterator<BConceptBase> getAllBConceptBase();

    public void addBConceptX(BConceptX def);
    public int getBConceptXCount();
    public Iterator<BConceptX> getAllBConceptX();

    public void addModuleB(ModuleB def);
    public int getModuleBCount();
    public Iterator<ModuleB> getAllModuleB();

}

