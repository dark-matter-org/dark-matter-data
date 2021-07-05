package org.dmd.concinnity.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:657)
import java.util.Iterator;                                              // To provide iterators over definitions - (DSDArtifactFormatter.java:652)
import org.dmd.concinnity.server.extended.Concept;                      // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:201)
import org.dmd.concinnity.server.extended.ConcinnityDefinition;         // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:187)
import org.dmd.dmc.DmcNameClashException;                               // May be thrown when finding definitions - (DSDArtifactFormatter.java:653)
import org.dmd.dmc.DmcValueException;                                   // May be thrown when finding definitions - (DSDArtifactFormatter.java:654)
import org.dmd.dmc.types.DotName;                                       // To support the find method for definitions - (DSDefinitionModule.java:189)
import org.dmd.util.exceptions.ResultException;                         // To support definition deletions - (DSDefinitionModule.java:190)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:661)
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

