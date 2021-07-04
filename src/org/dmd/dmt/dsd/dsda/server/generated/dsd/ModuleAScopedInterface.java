package org.dmd.dmt.dsd.dsda.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:657)
import java.util.Iterator;                                        // To provide iterators over definitions - (DSDArtifactFormatter.java:652)
import org.dmd.dmc.DmcNameClashException;                         // May be thrown when finding definitions - (DSDArtifactFormatter.java:653)
import org.dmd.dmc.DmcValueException;                             // May be thrown when finding definitions - (DSDArtifactFormatter.java:654)
import org.dmd.dmc.types.DotName;                                 // To support the find method for definitions - (DSDefinitionModule.java:189)
import org.dmd.dmt.dsd.dsda.server.extended.ABConceptX;           // A definition from the ModuleA Module - (DSDefinitionModule.java:201)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;         // A definition from the ModuleA Module - (DSDefinitionModule.java:187)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;            // A definition from the ModuleA Module - (DSDefinitionModule.java:201)
import org.dmd.util.exceptions.ResultException;                   // To support definition deletions - (DSDefinitionModule.java:190)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:661)
/**
 * This interface is implemented by the generated wrapper class for the ModuleA module.
 */
public interface ModuleAScopedInterface {

    public int getAConceptBaseCount();
    public AConceptBase getAConceptBase(DotName name);
    public Iterator<AConceptBase> getAllAConceptBase();

    public void addABConceptX(ABConceptX def);
    public void deleteABConceptX(ABConceptX def);
    public int getABConceptXCount();
    public ABConceptX getABConceptX(DotName name);
    public Iterator<ABConceptX> getAllABConceptX();
    public ABConceptX getABConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<ABConceptX> getABConceptXDefinitionsByName(String name) throws DmcValueException;

    public int getABConceptXDefinitionCountByName(String name) throws DmcValueException;

    public void addAConceptX(AConceptX def);
    public void deleteAConceptX(AConceptX def);
    public int getAConceptXCount();
    public AConceptX getAConceptX(DotName name);
    public Iterator<AConceptX> getAllAConceptX();
    public AConceptX getAConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<AConceptX> getAConceptXDefinitionsByName(String name) throws DmcValueException;

    public int getAConceptXDefinitionCountByName(String name) throws DmcValueException;

}

