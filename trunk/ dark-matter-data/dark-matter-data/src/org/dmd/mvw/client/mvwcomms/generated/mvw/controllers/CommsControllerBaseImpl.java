package org.dmd.mvw.client.mvwcomms.generated.mvw.controllers;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:122)
import com.google.gwt.event.shared.EventBus;                                                // Used by eventBus
import de.novanic.eventservice.client.event.RemoteEventService;                             // Used by eventService
import org.dmd.dmc.DmcOmni;                                                                 // Support for schema loading
import org.dmd.dmp.client.DMPServiceAsync;                                                  // Used by dmpConnection
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                                           // Attribute schema
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;                                // Mvw run context
import org.dmd.mvw.client.mvwcomms.generated.mvw.MvwcommsRunContextIF;                      // Mvwcomms run context
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEvent;                 // Required by LoginCompleteEvent
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LoginCompleteEventHandler;          // Required by LoginCompleteEvent
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutCompleteEvent;                // Required by LogoutCompleteEvent
import org.dmd.mvw.client.mvwcomms.generated.mvw.events.LogoutCompleteEventHandler;         // Required by LogoutCompleteEvent

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.ControllerFormatter.formatControllerBaseImpl(ControllerFormatter.java:24)
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

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:192)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:334)
    protected void fireLoginCompleteEvent(){
        eventBus.fireEvent(new LoginCompleteEvent());
    }

    // Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.initCodeGenInfo(Component.java:192)
    // org.dmd.mvw.tools.mvwgenerator.extended.Event.getFireMethod(Event.java:334)
    protected void fireLogoutCompleteEvent(){
        eventBus.fireEvent(new LogoutCompleteEvent());
    }

}

