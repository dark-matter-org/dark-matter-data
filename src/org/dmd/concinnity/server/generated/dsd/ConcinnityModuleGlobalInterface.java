package org.dmd.concinnity.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:618)
import java.util.Iterator;                                              // To provide iterators over definitions - (DSDArtifactFormatter.java:613)
import org.dmd.concinnity.server.extended.Concept;                      // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:201)
import org.dmd.concinnity.server.extended.ConcinnityDefinition;         // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:187)
import org.dmd.concinnity.server.extended.ConcinnityModule;             // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:201)
import org.dmd.dmc.DmcNameClashException;                               // May be thrown when finding definitions - (DSDArtifactFormatter.java:614)
import org.dmd.dmc.DmcValueException;                                   // May be thrown when finding definitions - (DSDArtifactFormatter.java:615)
import org.dmd.dmc.types.DotName;                                       // To support the find method for definitions - (DSDefinitionModule.java:189)
import org.dmd.util.exceptions.ResultException;                         // To support definition deletions - (DSDefinitionModule.java:190)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:622)
/**
 * This interface is implemented by definition managers that store definitions from the ConcinnityModule module.
 */
public interface ConcinnityModuleGlobalInterface {

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

    public void addConcinnityModule(ConcinnityModule def);
    public void deleteConcinnityModule(ConcinnityModule def);
    public int getConcinnityModuleCount();
    public ConcinnityModule getConcinnityModule(DotName name);
    public Iterator<ConcinnityModule> getAllConcinnityModule();
    public ConcinnityModule getConcinnityModuleDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<ConcinnityModule> getConcinnityModuleDefinitionsByName(String name) throws DmcValueException;

    public int getConcinnityModuleDefinitionCountByName(String name) throws DmcValueException;

}

