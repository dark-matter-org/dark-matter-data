package org.dmd.dmt.dsd.dsdb.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:618)
import java.util.Iterator;                                        // To provide iterators over definitions - (DSDArtifactFormatter.java:613)
import org.dmd.dmc.DmcNameClashException;                         // May be thrown when finding definitions - (DSDArtifactFormatter.java:614)
import org.dmd.dmc.DmcValueException;                             // May be thrown when finding definitions - (DSDArtifactFormatter.java:615)
import org.dmd.dmc.types.DotName;                                 // To support the find method for definitions - (DSDefinitionModule.java:189)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptBase;         // A definition from the ModuleB Module - (DSDefinitionModule.java:187)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptX;            // A definition from the ModuleB Module - (DSDefinitionModule.java:201)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;              // A definition from the ModuleB Module - (DSDefinitionModule.java:201)
import org.dmd.util.exceptions.ResultException;                   // To support definition deletions - (DSDefinitionModule.java:190)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:622)
/**
 * This interface is implemented by definition managers that store definitions from the ModuleB module.
 */
public interface ModuleBGlobalInterface {

    public int getBConceptBaseCount();
    public BConceptBase getBConceptBase(DotName name);
    public Iterator<BConceptBase> getAllBConceptBase();

    public void addBConceptX(BConceptX def);
    public void deleteBConceptX(BConceptX def);
    public int getBConceptXCount();
    public BConceptX getBConceptX(DotName name);
    public Iterator<BConceptX> getAllBConceptX();
    public BConceptX getBConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<BConceptX> getBConceptXDefinitionsByName(String name) throws DmcValueException;

    public int getBConceptXDefinitionCountByName(String name) throws DmcValueException;

    public void addModuleB(ModuleB def);
    public void deleteModuleB(ModuleB def);
    public int getModuleBCount();
    public ModuleB getModuleB(DotName name);
    public Iterator<ModuleB> getAllModuleB();
    public ModuleB getModuleBDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<ModuleB> getModuleBDefinitionsByName(String name) throws DmcValueException;

    public int getModuleBDefinitionCountByName(String name) throws DmcValueException;

}

