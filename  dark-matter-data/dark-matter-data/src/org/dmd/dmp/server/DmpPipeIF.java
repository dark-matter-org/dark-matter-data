package org.dmd.dmp.server;

import org.dmd.dmp.server.extended.DMPMessage;

/**
 * The DmpPipeIF defines an entity that can send a Dark Matter Protocol
 * message. This is often implemented by connection/session classes that
 * handle the routing of asynchronous responses/events back to something
 * that's interested e.g. a client of some type.
 */
public interface DmpPipeIF
{
    public void sendMessage(DMPMessage msg);
    
    /**
     * Implementors should overload this method to return a meaningful name
     * for the connection associated with this pipe.
     * @return A name tha tmay be useful in logging etc.
     */
    public String getName();
}
