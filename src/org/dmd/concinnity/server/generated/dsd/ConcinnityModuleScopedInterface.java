//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.concinnity.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:565)
import java.util.Iterator;                                              // To provide iterators over definitions - (DSDArtifactFormatter.java:560)
import org.dmd.concinnity.server.extended.Concept;                      // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:191)
import org.dmd.concinnity.server.extended.ConcinnityDefinition;         // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:178)
import org.dmd.dmc.DmcNameClashException;                               // May be thrown when finding definitions - (DSDArtifactFormatter.java:561)
import org.dmd.dmc.DmcValueException;                                   // May be thrown when finding definitions - (DSDArtifactFormatter.java:562)
import org.dmd.dmc.types.DotName;                                       // To support the find method for definitions - (DSDefinitionModule.java:180)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:569)
/**
 * This interface is implemented by the generated wrapper class for the ConcinnityModule module.
 */
public interface ConcinnityModuleScopedInterface {

    public int getConcinnityDefinitionCount();
    public ConcinnityDefinition getConcinnityDefinition(DotName name);
    public Iterator<ConcinnityDefinition> getAllConcinnityDefinition();

    public void addConcept(Concept def);
    public int getConceptCount();
    public Concept getConcept(DotName name);
    public Iterator<Concept> getAllConcept();
    public Concept getConceptDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<Concept> getConceptDefinitionsByName(String name) throws DmcValueException;

    public int getConceptDefinitionCountByName(String name) throws DmcValueException;

}

