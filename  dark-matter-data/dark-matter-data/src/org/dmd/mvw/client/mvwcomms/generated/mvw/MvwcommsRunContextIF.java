package org.dmd.mvw.client.mvwcomms.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:74)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:33)
import de.novanic.eventservice.client.event.RemoteEventService;         // Used by eventService
import org.dmd.dmp.client.DMPServiceAsync;                              // Used by dmpConnection
import org.dmd.mvw.client.mvwcomms.extended.CommsController;            // Used by commsController


public interface MvwcommsRunContextIF {

    public DMPServiceAsync getDmpConnection();
    public RemoteEventService getEventService();
    public CommsController getCommsController();
}

