package org.dmd.templates.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:447)
import java.util.Iterator;                                                 // To provide iterators over definitions - (DmoCacheFormatter.java:442)
import org.dmd.dmc.DmcNameClashException;                                  // May be thrown when finding definitions - (DmoCacheFormatter.java:443)
import org.dmd.dmc.DmcValueException;                                      // May be thrown when finding definitions - (DmoCacheFormatter.java:444)
import org.dmd.dmc.types.DotName;                                          // To support the find method for definitions - (DSDefinitionModule.java:216)
import org.dmd.templates.shared.generated.dmo.ContainedElementDMO;         // A definition from the TdlModule Module - (DSDefinitionModule.java:228)
import org.dmd.templates.shared.generated.dmo.ExtensionHookDMO;            // A definition from the TdlModule Module - (DSDefinitionModule.java:228)
import org.dmd.templates.shared.generated.dmo.SectionDMO;                  // A definition from the TdlModule Module - (DSDefinitionModule.java:228)
import org.dmd.templates.shared.generated.dmo.TdlDefinitionDMO;            // A definition from the TdlModule Module - (DSDefinitionModule.java:214)
import org.dmd.templates.shared.generated.dmo.TdlModuleDMO;                // A definition from the TdlModule Module - (DSDefinitionModule.java:228)
import org.dmd.templates.shared.generated.dmo.TextualArtifactDMO;          // A definition from the TdlModule Module - (DSDefinitionModule.java:228)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:451)
/**
 * This interface is implemented by definition managers that store definitions from the TdlModule module.
 */
public interface TdlModuleGlobalInterface {

    public int getTdlDefinitionCount();
    public TdlDefinitionDMO getTdlDefinition(DotName name);
    public Iterator<TdlDefinitionDMO> getAllTdlDefinition();

    public void addContainedElement(ContainedElementDMO def);
    public int getContainedElementCount();
    public ContainedElementDMO getContainedElement(DotName name);
    public Iterator<ContainedElementDMO> getAllContainedElement();
    public ContainedElementDMO getContainedElementDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addExtensionHook(ExtensionHookDMO def);
    public int getExtensionHookCount();
    public ExtensionHookDMO getExtensionHook(DotName name);
    public Iterator<ExtensionHookDMO> getAllExtensionHook();
    public ExtensionHookDMO getExtensionHookDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addSection(SectionDMO def);
    public int getSectionCount();
    public SectionDMO getSection(DotName name);
    public Iterator<SectionDMO> getAllSection();
    public SectionDMO getSectionDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addTdlModule(TdlModuleDMO def);
    public int getTdlModuleCount();
    public TdlModuleDMO getTdlModule(DotName name);
    public Iterator<TdlModuleDMO> getAllTdlModule();
    public TdlModuleDMO getTdlModuleDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addTextualArtifact(TextualArtifactDMO def);
    public int getTextualArtifactCount();
    public TextualArtifactDMO getTextualArtifact(DotName name);
    public Iterator<TextualArtifactDMO> getAllTextualArtifact();
    public TextualArtifactDMO getTextualArtifactDefinition(String name) throws DmcNameClashException, DmcValueException;

}

