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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:490)
import java.util.Iterator;                                        // To provide iterators over definitions - (DSDArtifactFormatter.java:485)
import org.dmd.dmc.DmcNameClashException;                         // May be thrown when finding definitions - (DSDArtifactFormatter.java:486)
import org.dmd.dmc.DmcValueException;                             // May be thrown when finding definitions - (DSDArtifactFormatter.java:487)
import org.dmd.dmc.types.DotName;                                 // To support the find method for definitions - (DSDefinitionModule.java:180)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptBase;         // A definition from the ModuleC Module - (DSDefinitionModule.java:178)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptX;            // A definition from the ModuleC Module - (DSDefinitionModule.java:191)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:494)
/**
 * This interface is implemented by the generated wrapper class for the ModuleC module.
 */
public interface ModuleCScopedInterface {

    public int getCConceptBaseCount();
    public CConceptBase getCConceptBase(DotName name);
    public Iterator<CConceptBase> getAllCConceptBase();

    public void addCConceptX(CConceptX def);
    public int getCConceptXCount();
    public CConceptX getCConceptX(DotName name);
    public Iterator<CConceptX> getAllCConceptX();
    public CConceptX getCConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

}

