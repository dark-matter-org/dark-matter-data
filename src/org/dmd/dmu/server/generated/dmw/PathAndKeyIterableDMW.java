package org.dmd.dmu.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1931)
import java.util.Iterator;                          // Beacuse we're iterating - (GenUtility.java:1924)
import org.dmd.dmu.shared.types.PathAndKey;         // This is the type we're iterating - (GenUtility.java:1928)
import org.dmd.dmw.DmwMVIterator;                   // The base multi-value iterator - (GenUtility.java:1925)


/**
 * The PathAndKeyIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1947)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:116)
 */
public class PathAndKeyIterableDMW extends DmwMVIterator<PathAndKey> {

    public final static PathAndKeyIterableDMW emptyList = new PathAndKeyIterableDMW();

    protected PathAndKeyIterableDMW(){
        super();
    }

    public PathAndKeyIterableDMW(Iterator<PathAndKey> it){
        super(it);
    }

}

