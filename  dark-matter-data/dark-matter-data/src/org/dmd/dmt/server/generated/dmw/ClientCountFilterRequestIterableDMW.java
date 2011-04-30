package org.dmd.dmt.server.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwObjectIterator;
import org.dmd.dmt.shared.generated.dmo.ClientCountFilterRequestDMO;  // dmo type import
import org.dmd.dmt.server.extended.ClientCountFilterRequest;  // wrapper type import
/**
 * The ClientCountFilterRequestIterableDMW wraps an Iterator for a particular type and makes 
 * it Iterable.
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpObjectIterable(GenUtility.java:1389)
 *    Called from: org.dmd.dmg.generators.DMWGenerator.createTypeIterables(DMWGenerator.java:148)
 */
public class ClientCountFilterRequestIterableDMW extends DmwObjectIterator<ClientCountFilterRequest, ClientCountFilterRequestDMO> {

    public final static ClientCountFilterRequestIterableDMW emptyList = new ClientCountFilterRequestIterableDMW();

    protected ClientCountFilterRequestIterableDMW(){
        super();
    }

    public ClientCountFilterRequestIterableDMW(Iterator<ClientCountFilterRequestDMO> it){
        super(it);
    }

}

