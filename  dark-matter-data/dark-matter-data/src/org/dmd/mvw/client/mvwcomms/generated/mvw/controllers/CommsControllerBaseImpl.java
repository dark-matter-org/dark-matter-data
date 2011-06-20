package org.dmd.mvw.client.mvwcomms.generated.mvw.controllers;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:78)
import com.google.gwt.event.shared.EventBus;                                               // Used by eventBus
import de.novanic.eventservice.client.event.RemoteEventService;                            // Used by eventService
import org.dmd.dmc.DmcOmni;                                                                // Support for schema loading
import org.dmd.dmp.client.DMPServiceAsync;                                                 // Used by dmpConnection
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                                          // Attribute schema
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                               // Mvw run context
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                     // Mvwcomms run context
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEvent;                // Required by LoginCompleteEvent
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEventHandler;         // Required by LoginCompleteEvent

abstract public class CommsControllerBaseImpl {

    protected final DMPServiceAsync dmpConnection;
    protected final EventBus eventBus;
    protected final RemoteEventService eventService;

    public CommsControllerBaseImpl(MvwRunContextIF rc){
        dmpConnection = ((MvwcommsRunContextIF)rc).getDmpConnection();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
        eventService = ((MvwcommsRunContextIF)rc).getEventService();

        DmcOmni.instance().addCompactSchema(DmpDMSAG.instance());


    }

    protected void fireLoginCompleteEvent(){
        eventBus.fireEvent(new LoginCompleteEvent());
    }

}

