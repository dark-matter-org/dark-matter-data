package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1757)
import java.util.Iterator;                                  // Beacuse we're iterating - (GenUtility.java:1750)
import org.dmd.dmt.shared.generated.types.DmtField;         // This is the type we're iterating - (GenUtility.java:1754)
import org.dmd.dmw.DmwMVIterator;                           // The base multi-value iterator - (GenUtility.java:1751)


/**
 * The DmtFieldIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpIterable(GenUtility.java:1773)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:135)
 */
public class DmtFieldIterableDMW extends DmwMVIterator<DmtField> {

    public final static DmtFieldIterableDMW emptyList = new DmtFieldIterableDMW();

    protected DmtFieldIterableDMW(){
        super();
    }

    public DmtFieldIterableDMW(Iterator<DmtField> it){
        super(it);
    }

}

