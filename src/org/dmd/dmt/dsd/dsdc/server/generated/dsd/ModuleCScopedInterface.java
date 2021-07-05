package org.dmd.dmt.dsd.dsdc.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:657)
import java.util.Iterator;                                        // To provide iterators over definitions - (DSDArtifactFormatter.java:652)
import org.dmd.dmc.DmcNameClashException;                         // May be thrown when finding definitions - (DSDArtifactFormatter.java:653)
import org.dmd.dmc.DmcValueException;                             // May be thrown when finding definitions - (DSDArtifactFormatter.java:654)
import org.dmd.dmc.types.DotName;                                 // To support the find method for definitions - (DSDefinitionModule.java:189)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptBase;         // A definition from the ModuleC Module - (DSDefinitionModule.java:187)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptX;            // A definition from the ModuleC Module - (DSDefinitionModule.java:201)
import org.dmd.util.exceptions.ResultException;                   // To support definition deletions - (DSDefinitionModule.java:190)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:661)
/**
 * This interface is implemented by the generated wrapper class for the ModuleC module.
 */
public interface ModuleCScopedInterface {

    public int getCConceptBaseCount();
    public CConceptBase getCConceptBase(DotName name);
    public Iterator<CConceptBase> getAllCConceptBase();

    public void addCConceptX(CConceptX def);
    public void deleteCConceptX(CConceptX def);
    public int getCConceptXCount();
    public CConceptX getCConceptX(DotName name);
    public Iterator<CConceptX> getAllCConceptX();
    public CConceptX getCConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<CConceptX> getCConceptXDefinitionsByName(String name) throws DmcValueException;

    public int getCConceptXDefinitionCountByName(String name) throws DmcValueException;

}

