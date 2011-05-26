package org.dmd.mvw.client.mvwcomms.generated.mvw.controllers;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:74)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:35)
import com.google.web.bindery.event.shared.EventBus;                           // Used by eventBus
import de.novanic.eventservice.client.event.RemoteEventService;                // Used by eventService
import org.dmd.dmc.DmcOmni;                                                    // Support for schema loading
import org.dmd.dmp.client.DMPServiceAsync;                                     // Used by dmpConnection
import org.dmd.dmp.shared.generated.dmo.DmpASAG;                               // Attribute schema
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                   // Mvw run context
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;         // Mvwcomms run context

public class CommsControllerBaseImpl {

    protected final DMPServiceAsync dmpConnection;
    protected final EventBus eventBus;
    protected final RemoteEventService eventService;

    public CommsControllerBaseImpl(MvwRunContextIF rc){
        dmpConnection = ((MvwcommsRunContextIF)rc).getDmpConnection();
        eventBus = ((MvwRunContextIF)rc).getEventBus();
        eventService = ((MvwcommsRunContextIF)rc).getEventService();

        DmcOmni.instance().addAttributeSchema(DmpASAG.instance());

    }

}

