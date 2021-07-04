package org.dmd.dmu.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:618)
import java.util.Iterator;                                       // To provide iterators over definitions - (DSDArtifactFormatter.java:613)
import org.dmd.dmc.DmcNameClashException;                        // May be thrown when finding definitions - (DSDArtifactFormatter.java:614)
import org.dmd.dmc.DmcValueException;                            // May be thrown when finding definitions - (DSDArtifactFormatter.java:615)
import org.dmd.dmc.types.DotName;                                // To support the find method for definitions - (DSDefinitionModule.java:189)
import org.dmd.dmu.server.extended.DmuDefinition;                // A definition from the DmuModule Module - (DSDefinitionModule.java:187)
import org.dmd.dmu.server.extended.DmuModule;                    // A definition from the DmuModule Module - (DSDefinitionModule.java:201)
import org.dmd.dmu.server.extended.json.PayloadExample;          // A definition from the DmuModule Module - (DSDefinitionModule.java:201)
import org.dmd.dmu.server.extended.json.PayloadSortInfo;         // A definition from the DmuModule Module - (DSDefinitionModule.java:201)
import org.dmd.util.exceptions.ResultException;                  // To support definition deletions - (DSDefinitionModule.java:190)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateGlobalInterface(DSDArtifactFormatter.java:622)
/**
 * This interface is implemented by definition managers that store definitions from the DmuModule module.
 */
public interface DmuModuleGlobalInterface {

    public int getDmuDefinitionCount();
    public DmuDefinition getDmuDefinition(DotName name);
    public Iterator<DmuDefinition> getAllDmuDefinition();

    public void addDmuModule(DmuModule def);
    public void deleteDmuModule(DmuModule def);
    public int getDmuModuleCount();
    public DmuModule getDmuModule(DotName name);
    public Iterator<DmuModule> getAllDmuModule();
    public DmuModule getDmuModuleDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<DmuModule> getDmuModuleDefinitionsByName(String name) throws DmcValueException;

    public int getDmuModuleDefinitionCountByName(String name) throws DmcValueException;

    public void addPayloadExample(PayloadExample def);
    public void deletePayloadExample(PayloadExample def);
    public int getPayloadExampleCount();
    public PayloadExample getPayloadExample(DotName name);
    public Iterator<PayloadExample> getAllPayloadExample();
    public PayloadExample getPayloadExampleDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<PayloadExample> getPayloadExampleDefinitionsByName(String name) throws DmcValueException;

    public int getPayloadExampleDefinitionCountByName(String name) throws DmcValueException;

    public void addPayloadSortInfo(PayloadSortInfo def);
    public void deletePayloadSortInfo(PayloadSortInfo def);
    public int getPayloadSortInfoCount();
    public PayloadSortInfo getPayloadSortInfo(DotName name);
    public Iterator<PayloadSortInfo> getAllPayloadSortInfo();
    public PayloadSortInfo getPayloadSortInfoDefinition(String name) throws DmcNameClashException, DmcValueException;

    public Iterator<PayloadSortInfo> getPayloadSortInfoDefinitionsByName(String name) throws DmcValueException;

    public int getPayloadSortInfoDefinitionCountByName(String name) throws DmcValueException;

}

