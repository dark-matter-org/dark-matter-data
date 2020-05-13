package org.dmd.dmu.server.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:646)
import java.util.Iterator;                                       // To provide iterators over definitions - (DSDArtifactFormatter.java:641)
import org.dmd.dmc.DmcNameClashException;                        // May be thrown when finding definitions - (DSDArtifactFormatter.java:642)
import org.dmd.dmc.DmcValueException;                            // May be thrown when finding definitions - (DSDArtifactFormatter.java:643)
import org.dmd.dmc.types.DotName;                                // To support the find method for definitions - (DSDefinitionModule.java:181)
import org.dmd.dmu.server.extended.DmuDefinition;                // A definition from the DmuModule Module - (DSDefinitionModule.java:179)
import org.dmd.dmu.server.extended.json.PayloadExample;          // A definition from the DmuModule Module - (DSDefinitionModule.java:193)
import org.dmd.dmu.server.extended.json.PayloadSortInfo;         // A definition from the DmuModule Module - (DSDefinitionModule.java:193)
import org.dmd.util.exceptions.ResultException;                  // To support definition deletions - (DSDefinitionModule.java:182)


// Generated from: org.dmd.dmg.generators.DSDArtifactFormatter.generateScopedInterface(DSDArtifactFormatter.java:650)
/**
 * This interface is implemented by the generated wrapper class for the DmuModule module.
 */
public interface DmuModuleScopedInterface {

    public int getDmuDefinitionCount();
    public DmuDefinition getDmuDefinition(DotName name);
    public Iterator<DmuDefinition> getAllDmuDefinition();

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

