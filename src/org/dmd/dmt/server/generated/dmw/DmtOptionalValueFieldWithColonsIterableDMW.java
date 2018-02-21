package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1754)
import java.util.Iterator;                                                         // Beacuse we're iterating - (GenUtility.java:1747)
import org.dmd.dmt.shared.generated.types.DmtOptionalValueFieldWithColons;         // This is the type we're iterating - (GenUtility.java:1751)
import org.dmd.dmw.DmwMVIterator;                                                  // The base multi-value iterator - (GenUtility.java:1748)


/**
 * The DmtOptionalValueFieldWithColonsIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1770)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:135)
 */
public class DmtOptionalValueFieldWithColonsIterableDMW extends DmwMVIterator<DmtOptionalValueFieldWithColons> {

    public final static DmtOptionalValueFieldWithColonsIterableDMW emptyList = new DmtOptionalValueFieldWithColonsIterableDMW();

    protected DmtOptionalValueFieldWithColonsIterableDMW(){
        super();
    }

    public DmtOptionalValueFieldWithColonsIterableDMW(Iterator<DmtOptionalValueFieldWithColons> it){
        super(it);
    }

}

