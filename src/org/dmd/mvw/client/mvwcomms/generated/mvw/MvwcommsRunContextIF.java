package org.dmd.mvw.client.mvwcomms.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:37)
import de.novanic.eventservice.client.event.RemoteEventService;         // Used by eventService - (RunContextItem.java:290)
import org.dmd.dmp.client.DMPServiceAsync;                              // Used by dmpConnection - (RunContextItem.java:290)
import org.dmd.mvw.client.mvwcomms.extended.CommsController;            // Used by commsController - (RunContextItem.java:290)


// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:40)
public interface MvwcommsRunContextIF {

    public DMPServiceAsync         getDmpConnection();
    public RemoteEventService      getEventService();
    public CommsController         getCommsController();
}

