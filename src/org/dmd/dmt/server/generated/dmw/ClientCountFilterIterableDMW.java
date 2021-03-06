package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterDMO;  // dmo type import
import org.dmd.dmt.server.extended.ClientCountFilter;  // wrapper type import
/**
 * The ClientCountFilterIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:2001)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:102)
 */
public class ClientCountFilterIterableDMW extends DmwObjectIterator<ClientCountFilter, ClientCountFilterDMO> {

    public final static ClientCountFilterIterableDMW emptyList = new ClientCountFilterIterableDMW();

    protected ClientCountFilterIterableDMW(){
        super();
    }

    public ClientCountFilterIterableDMW(Iterator<ClientCountFilterDMO> it){
        super(it);
    }

}

