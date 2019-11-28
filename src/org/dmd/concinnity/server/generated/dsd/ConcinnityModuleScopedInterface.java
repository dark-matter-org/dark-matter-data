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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:646)
import java.util.Iterator;                                              // To provide iterators over definitions - (DSDArtifactFormatter.java:641)
import org.dmd.concinnity.server.extended.Concept;                      // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:193)
import org.dmd.concinnity.server.extended.ConcinnityDefinition;         // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:179)
import org.dmd.dmc.DmcNameClashException;                               // May be thrown when finding definitions - (DSDArtifactFormatter.java:642)
import org.dmd.dmc.DmcValueException;                                   // May be thrown when finding definitions - (DSDArtifactFormatter.java:643)
import org.dmd.dmc.types.DotName;                                       // To support the find method for definitions - (DSDefinitionModule.java:181)
import org.dmd.util.exceptions.ResultException;                         // To support definition deletions - (DSDefinitionModule.java:182)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:650)
/**
 * This interface is implemented by the generated wrapper class for the ConcinnityModule module.
 */
public interface ConcinnityModuleScopedInterface {

    public int getConcinnityDefinitionCount();
    public ConcinnityDefinition getConcinnityDefinition(DotName name);
    public Iterator<ConcinnityDefinition> getAllConcinnityDefinition();

    public void addConcept(Concept def);
    public void deleteConcept(Concept def);
    public int getConceptCount();
    public Concept getConcept(DotName name);
    public Iterator<Concept> getAllConcept();
    public Concept getConceptDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<Concept> getConceptDefinitionsByName(String name) throws DmcValueException;

    public int getConceptDefinitionCountByName(String name) throws DmcValueException;

}

