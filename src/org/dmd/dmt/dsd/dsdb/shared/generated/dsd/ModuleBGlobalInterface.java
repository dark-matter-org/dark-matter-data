package org.dmd.dmt.dsd.dsdb.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:447)
import java.util.Iterator;                                                // To provide iterators over definitions - (DmoCacheFormatter.java:442)
import org.dmd.dmc.DmcNameClashException;                                 // May be thrown when finding definitions - (DmoCacheFormatter.java:443)
import org.dmd.dmc.DmcValueException;                                     // May be thrown when finding definitions - (DmoCacheFormatter.java:444)
import org.dmd.dmc.types.DotName;                                         // To support the find method for definitions - (DSDefinitionModule.java:208)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptBaseDMO;         // A definition from the ModuleB Module - (DSDefinitionModule.java:206)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptXDMO;            // A definition from the ModuleB Module - (DSDefinitionModule.java:220)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.ModuleBDMO;              // A definition from the ModuleB Module - (DSDefinitionModule.java:220)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:451)
/**
 * This interface is implemented by definition managers that store definitions from the ModuleB module.
 */
public interface ModuleBGlobalInterface {

    public int getBConceptBaseCount();
    public BConceptBaseDMO getBConceptBase(DotName name);
    public Iterator<BConceptBaseDMO> getAllBConceptBase();

    public void addBConceptX(BConceptXDMO def);
    public int getBConceptXCount();
    public BConceptXDMO getBConceptX(DotName name);
    public Iterator<BConceptXDMO> getAllBConceptX();
    public BConceptXDMO getBConceptXDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addModuleB(ModuleBDMO def);
    public int getModuleBCount();
    public ModuleBDMO getModuleB(DotName name);
    public Iterator<ModuleBDMO> getAllModuleB();
    public ModuleBDMO getModuleBDefinition(String name) throws DmcNameClashException, DmcValueException;

}

