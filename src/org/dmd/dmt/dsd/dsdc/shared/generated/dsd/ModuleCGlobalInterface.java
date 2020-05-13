package org.dmd.dmt.dsd.dsdc.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:447)
import java.util.Iterator;                                                // To provide iterators over definitions - (DmoCacheFormatter.java:442)
import org.dmd.dmc.DmcNameClashException;                                 // May be thrown when finding definitions - (DmoCacheFormatter.java:443)
import org.dmd.dmc.DmcValueException;                                     // May be thrown when finding definitions - (DmoCacheFormatter.java:444)
import org.dmd.dmc.types.DotName;                                         // To support the find method for definitions - (DSDefinitionModule.java:208)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.CConceptBaseDMO;         // A definition from the ModuleC Module - (DSDefinitionModule.java:206)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.CConceptXDMO;            // A definition from the ModuleC Module - (DSDefinitionModule.java:220)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.ModuleCDMO;              // A definition from the ModuleC Module - (DSDefinitionModule.java:220)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:451)
/**
 * This interface is implemented by definition managers that store definitions from the ModuleC module.
 */
public interface ModuleCGlobalInterface {

    public int getCConceptBaseCount();
    public CConceptBaseDMO getCConceptBase(DotName name);
    public Iterator<CConceptBaseDMO> getAllCConceptBase();

    public void addCConceptX(CConceptXDMO def);
    public int getCConceptXCount();
    public CConceptXDMO getCConceptX(DotName name);
    public Iterator<CConceptXDMO> getAllCConceptX();
    public CConceptXDMO getCConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addModuleC(ModuleCDMO def);
    public int getModuleCCount();
    public ModuleCDMO getModuleC(DotName name);
    public Iterator<ModuleCDMO> getAllModuleC();
    public ModuleCDMO getModuleCDefinition(String name) throws DmcNameClashException, DmcValueException;

}

