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
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:526)
import java.util.Iterator;                                              // To provide iterators over definitions - (DSDArtifactFormatter.java:521)
import org.dmd.concinnity.server.extended.Concept;                      // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:191)
import org.dmd.concinnity.server.extended.ConcinnityDefinition;         // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:178)
import org.dmd.concinnity.server.extended.ConcinnityModule;             // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:191)
import org.dmd.dmc.DmcNameClashException;                               // May be thrown when finding definitions - (DSDArtifactFormatter.java:522)
import org.dmd.dmc.DmcValueException;                                   // May be thrown when finding definitions - (DSDArtifactFormatter.java:523)
import org.dmd.dmc.types.DotName;                                       // To support the find method for definitions - (DSDefinitionModule.java:180)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:530)
/**
 * This interface is implemented by definition managers that store definitions from the ConcinnityModule module.
 */
public interface ConcinnityModuleGlobalInterface {

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

    public void addConcinnityModule(ConcinnityModule def);
    public int getConcinnityModuleCount();
    public ConcinnityModule getConcinnityModule(DotName name);
    public Iterator<ConcinnityModule> getAllConcinnityModule();
    public ConcinnityModule getConcinnityModuleDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<ConcinnityModule> getConcinnityModuleDefinitionsByName(String name) throws DmcValueException;

    public int getConcinnityModuleDefinitionCountByName(String name) throws DmcValueException;

}

