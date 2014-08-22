package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1745)
import java.util.Iterator;                                                                  // Beacuse we're iterating - (GenUtility.java:1738)
import org.dmd.dmt.shared.generated.types.DmtMultiValuedRequiredPartWithReferences;         // This is the type we're iterating - (GenUtility.java:1742)
import org.dmd.dmw.DmwMVIterator;                                                           // The base multi-value iterator - (GenUtility.java:1739)


/**
 * The DmtMultiValuedRequiredPartWithReferencesIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1761)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:135)
 */
public class DmtMultiValuedRequiredPartWithReferencesIterableDMW extends DmwMVIterator<DmtMultiValuedRequiredPartWithReferences> {

    public final static DmtMultiValuedRequiredPartWithReferencesIterableDMW emptyList = new DmtMultiValuedRequiredPartWithReferencesIterableDMW();

    protected DmtMultiValuedRequiredPartWithReferencesIterableDMW(){
        super();
    }

    public DmtMultiValuedRequiredPartWithReferencesIterableDMW(Iterator<DmtMultiValuedRequiredPartWithReferences> it){
        super(it);
    }

}

