package org.dmd.dmt.dsd.dsda.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:618)
import java.util.Iterator;                                        // To provide iterators over definitions - (DSDArtifactFormatter.java:613)
import org.dmd.dmc.DmcNameClashException;                         // May be thrown when finding definitions - (DSDArtifactFormatter.java:614)
import org.dmd.dmc.DmcValueException;                             // May be thrown when finding definitions - (DSDArtifactFormatter.java:615)
import org.dmd.dmc.types.DotName;                                 // To support the find method for definitions - (DSDefinitionModule.java:189)
import org.dmd.dmt.dsd.dsda.server.extended.ABConceptX;           // A definition from the ModuleA Module - (DSDefinitionModule.java:201)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;         // A definition from the ModuleA Module - (DSDefinitionModule.java:187)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;            // A definition from the ModuleA Module - (DSDefinitionModule.java:201)
import org.dmd.dmt.dsd.dsda.server.extended.ModuleA;              // A definition from the ModuleA Module - (DSDefinitionModule.java:201)
import org.dmd.util.exceptions.ResultException;                   // To support definition deletions - (DSDefinitionModule.java:190)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:622)
/**
 * This interface is implemented by definition managers that store definitions from the ModuleA module.
 */
public interface ModuleAGlobalInterface {

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

    public void addModuleA(ModuleA def);
    public void deleteModuleA(ModuleA def);
    public int getModuleACount();
    public ModuleA getModuleA(DotName name);
    public Iterator<ModuleA> getAllModuleA();
    public ModuleA getModuleADefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<ModuleA> getModuleADefinitionsByName(String name) throws DmcValueException;

    public int getModuleADefinitionCountByName(String name) throws DmcValueException;

}

