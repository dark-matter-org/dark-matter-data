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
package org.dmd.templates.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:607)
import java.util.Iterator;                                         // To provide iterators over definitions - (DSDArtifactFormatter.java:602)
import org.dmd.dmc.DmcNameClashException;                          // May be thrown when finding definitions - (DSDArtifactFormatter.java:603)
import org.dmd.dmc.DmcValueException;                              // May be thrown when finding definitions - (DSDArtifactFormatter.java:604)
import org.dmd.dmc.types.DotName;                                  // To support the find method for definitions - (DSDefinitionModule.java:181)
import org.dmd.templates.server.extended.ContainedElement;         // A definition from the TdlModule Module - (DSDefinitionModule.java:193)
import org.dmd.templates.server.extended.ExtensionHook;            // A definition from the TdlModule Module - (DSDefinitionModule.java:193)
import org.dmd.templates.server.extended.Section;                  // A definition from the TdlModule Module - (DSDefinitionModule.java:193)
import org.dmd.templates.server.extended.TdlDefinition;            // A definition from the TdlModule Module - (DSDefinitionModule.java:179)
import org.dmd.templates.server.extended.TdlModule;                // A definition from the TdlModule Module - (DSDefinitionModule.java:193)
import org.dmd.templates.server.extended.TextualArtifact;          // A definition from the TdlModule Module - (DSDefinitionModule.java:193)
import org.dmd.util.exceptions.ResultException;                    // To support definition deletions - (DSDefinitionModule.java:182)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:611)
/**
 * This interface is implemented by definition managers that store definitions from the TdlModule module.
 */
public interface TdlModuleGlobalInterface {

    public int getTdlDefinitionCount();
    public TdlDefinition getTdlDefinition(DotName name);
    public Iterator<TdlDefinition> getAllTdlDefinition();

    public void addContainedElement(ContainedElement def);
    public void deleteContainedElement(ContainedElement def);
    public int getContainedElementCount();
    public ContainedElement getContainedElement(DotName name);
    public Iterator<ContainedElement> getAllContainedElement();
    public ContainedElement getContainedElementDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<ContainedElement> getContainedElementDefinitionsByName(String name) throws DmcValueException;

    public int getContainedElementDefinitionCountByName(String name) throws DmcValueException;

    public void addExtensionHook(ExtensionHook def);
    public void deleteExtensionHook(ExtensionHook def);
    public int getExtensionHookCount();
    public ExtensionHook getExtensionHook(DotName name);
    public Iterator<ExtensionHook> getAllExtensionHook();
    public ExtensionHook getExtensionHookDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<ExtensionHook> getExtensionHookDefinitionsByName(String name) throws DmcValueException;

    public int getExtensionHookDefinitionCountByName(String name) throws DmcValueException;

    public void addSection(Section def);
    public void deleteSection(Section def);
    public int getSectionCount();
    public Section getSection(DotName name);
    public Iterator<Section> getAllSection();
    public Section getSectionDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<Section> getSectionDefinitionsByName(String name) throws DmcValueException;

    public int getSectionDefinitionCountByName(String name) throws DmcValueException;

    public void addTdlModule(TdlModule def);
    public void deleteTdlModule(TdlModule def);
    public int getTdlModuleCount();
    public TdlModule getTdlModule(DotName name);
    public Iterator<TdlModule> getAllTdlModule();
    public TdlModule getTdlModuleDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<TdlModule> getTdlModuleDefinitionsByName(String name) throws DmcValueException;

    public int getTdlModuleDefinitionCountByName(String name) throws DmcValueException;

    public void addTextualArtifact(TextualArtifact def);
    public void deleteTextualArtifact(TextualArtifact def);
    public int getTextualArtifactCount();
    public TextualArtifact getTextualArtifact(DotName name);
    public Iterator<TextualArtifact> getAllTextualArtifact();
    public TextualArtifact getTextualArtifactDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<TextualArtifact> getTextualArtifactDefinitionsByName(String name) throws DmcValueException;

    public int getTextualArtifactDefinitionCountByName(String name) throws DmcValueException;

}

