package org.dmd.dmu.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:447)
import java.util.Iterator;                                          // To provide iterators over definitions - (DmoCacheFormatter.java:442)
import org.dmd.dmc.DmcNameClashException;                           // May be thrown when finding definitions - (DmoCacheFormatter.java:443)
import org.dmd.dmc.DmcValueException;                               // May be thrown when finding definitions - (DmoCacheFormatter.java:444)
import org.dmd.dmc.types.DotName;                                   // To support the find method for definitions - (DSDefinitionModule.java:216)
import org.dmd.dmu.shared.generated.dmo.DmuDefinitionDMO;           // A definition from the DmuModule Module - (DSDefinitionModule.java:214)
import org.dmd.dmu.shared.generated.dmo.DmuModuleDMO;               // A definition from the DmuModule Module - (DSDefinitionModule.java:228)
import org.dmd.dmu.shared.generated.dmo.PayloadExampleDMO;          // A definition from the DmuModule Module - (DSDefinitionModule.java:228)
import org.dmd.dmu.shared.generated.dmo.PayloadSortInfoDMO;         // A definition from the DmuModule Module - (DSDefinitionModule.java:228)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:451)
/**
 * This interface is implemented by definition managers that store definitions from the DmuModule module.
 */
public interface DmuModuleGlobalInterface {

    public int getDmuDefinitionCount();
    public DmuDefinitionDMO getDmuDefinition(DotName name);
    public Iterator<DmuDefinitionDMO> getAllDmuDefinition();

    public void addDmuModule(DmuModuleDMO def);
    public int getDmuModuleCount();
    public DmuModuleDMO getDmuModule(DotName name);
    public Iterator<DmuModuleDMO> getAllDmuModule();
    public DmuModuleDMO getDmuModuleDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addPayloadExample(PayloadExampleDMO def);
    public int getPayloadExampleCount();
    public PayloadExampleDMO getPayloadExample(DotName name);
    public Iterator<PayloadExampleDMO> getAllPayloadExample();
    public PayloadExampleDMO getPayloadExampleDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addPayloadSortInfo(PayloadSortInfoDMO def);
    public int getPayloadSortInfoCount();
    public PayloadSortInfoDMO getPayloadSortInfo(DotName name);
    public Iterator<PayloadSortInfoDMO> getAllPayloadSortInfo();
    public PayloadSortInfoDMO getPayloadSortInfoDefinition(String name) throws DmcNameClashException, DmcValueException;

}

