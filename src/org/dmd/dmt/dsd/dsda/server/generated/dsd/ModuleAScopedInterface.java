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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:409)
import java.util.Iterator;                                        // To provide iterators over definitions - (DSDArtifactFormatter.java:404)
import org.dmd.dmc.DmcNameClashException;                         // May be thrown when finding definitions - (DSDArtifactFormatter.java:405)
import org.dmd.dmc.DmcValueException;                             // May be thrown when finding definitions - (DSDArtifactFormatter.java:406)
import org.dmd.dmc.types.DotName;                                 // To support the find method for definitions - (DSDefinitionModule.java:163)
import org.dmd.dmt.dsd.dsda.server.extended.ABConceptX;           // A definition from the ModuleA Module - (DSDefinitionModule.java:174)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;         // A definition from the ModuleA Module - (DSDefinitionModule.java:161)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;            // A definition from the ModuleA Module - (DSDefinitionModule.java:174)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:413)
/**
 * This interface is implemented by the generated wrapper class for the ModuleA module.
 */
public interface ModuleAScopedInterface {

    public int getAConceptBaseCount();
    public AConceptBase getAConceptBase(DotName name);
    public Iterator<AConceptBase> getAllAConceptBase();

    public void addABConceptX(ABConceptX def);
    public int getABConceptXCount();
    public ABConceptX getABConceptX(DotName name);
    public Iterator<ABConceptX> getAllABConceptX();
    public ABConceptX getABConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addAConceptX(AConceptX def);
    public int getAConceptXCount();
    public AConceptX getAConceptX(DotName name);
    public Iterator<AConceptX> getAllAConceptX();
    public AConceptX getAConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

}

