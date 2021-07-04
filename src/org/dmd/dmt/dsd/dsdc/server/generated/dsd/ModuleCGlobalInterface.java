package org.dmd.dmt.dsd.dsdc.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:618)
import java.util.Iterator;                                        // To provide iterators over definitions - (DSDArtifactFormatter.java:613)
import org.dmd.dmc.DmcNameClashException;                         // May be thrown when finding definitions - (DSDArtifactFormatter.java:614)
import org.dmd.dmc.DmcValueException;                             // May be thrown when finding definitions - (DSDArtifactFormatter.java:615)
import org.dmd.dmc.types.DotName;                                 // To support the find method for definitions - (DSDefinitionModule.java:189)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptBase;         // A definition from the ModuleC Module - (DSDefinitionModule.java:187)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptX;            // A definition from the ModuleC Module - (DSDefinitionModule.java:201)
import org.dmd.dmt.dsd.dsdc.server.extended.ModuleC;              // A definition from the ModuleC Module - (DSDefinitionModule.java:201)
import org.dmd.util.exceptions.ResultException;                   // To support definition deletions - (DSDefinitionModule.java:190)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:622)
/**
 * This interface is implemented by definition managers that store definitions from the ModuleC module.
 */
public interface ModuleCGlobalInterface {

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

    public void addModuleC(ModuleC def);
    public void deleteModuleC(ModuleC def);
    public int getModuleCCount();
    public ModuleC getModuleC(DotName name);
    public Iterator<ModuleC> getAllModuleC();
    public ModuleC getModuleCDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<ModuleC> getModuleCDefinitionsByName(String name) throws DmcValueException;

    public int getModuleCDefinitionCountByName(String name) throws DmcValueException;

}

