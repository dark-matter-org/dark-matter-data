package org.dmd.concinnity.shared.generated.dsd;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:447)
import java.util.Iterator;                                                      // To provide iterators over definitions - (DmoCacheFormatter.java:442)
import org.dmd.concinnity.shared.generated.dmo.ConceptDMO;                      // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:228)
import org.dmd.concinnity.shared.generated.dmo.ConcinnityDefinitionDMO;         // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:214)
import org.dmd.concinnity.shared.generated.dmo.ConcinnityModuleDMO;             // A definition from the ConcinnityModule Module - (DSDefinitionModule.java:228)
import org.dmd.dmc.DmcNameClashException;                                       // May be thrown when finding definitions - (DmoCacheFormatter.java:443)
import org.dmd.dmc.DmcValueException;                                           // May be thrown when finding definitions - (DmoCacheFormatter.java:444)
import org.dmd.dmc.types.DotName;                                               // To support the find method for definitions - (DSDefinitionModule.java:216)


// Generated from: org.dmd.dms.util.DmoCacheFormatter.generateGlobalInterface(DmoCacheFormatter.java:451)
/**
 * This interface is implemented by definition managers that store definitions from the ConcinnityModule module.
 */
public interface ConcinnityModuleGlobalInterface {

    public int getConcinnityDefinitionCount();
    public ConcinnityDefinitionDMO getConcinnityDefinition(DotName name);
    public Iterator<ConcinnityDefinitionDMO> getAllConcinnityDefinition();

    public void addConcept(ConceptDMO def);
    public int getConceptCount();
    public ConceptDMO getConcept(DotName name);
    public Iterator<ConceptDMO> getAllConcept();
    public ConceptDMO getConceptDefinition(String name) throws DmcNameClashException, DmcValueException;

    public void addConcinnityModule(ConcinnityModuleDMO def);
    public int getConcinnityModuleCount();
    public ConcinnityModuleDMO getConcinnityModule(DotName name);
    public Iterator<ConcinnityModuleDMO> getAllConcinnityModule();
    public ConcinnityModuleDMO getConcinnityModuleDefinition(String name) throws DmcNameClashException, DmcValueException;

}

