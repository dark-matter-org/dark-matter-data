package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1931)
import java.util.Iterator;                             // Beacuse we're iterating - (GenUtility.java:1924)
import org.dmd.dmt.shared.types.DmtStringName;         // This is the type we're iterating - (GenUtility.java:1928)
import org.dmd.dmw.DmwMVIterator;                      // The base multi-value iterator - (GenUtility.java:1925)


/**
 * The DmtStringNameIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1947)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:116)
 */
public class DmtStringNameIterableDMW extends DmwMVIterator<DmtStringName> {

    public final static DmtStringNameIterableDMW emptyList = new DmtStringNameIterableDMW();

    protected DmtStringNameIterableDMW(){
        super();
    }

    public DmtStringNameIterableDMW(Iterator<DmtStringName> it){
        super(it);
    }

}

