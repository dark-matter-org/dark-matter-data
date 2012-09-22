package org.dmd.mvw.client.mvwcomms.generated.mvw.events;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImportsStatic(ImportManager.java:37)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:108)
import com.google.gwt.event.shared.GwtEvent;         // The base event type

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:110)
public class LogoutCompleteEvent extends GwtEvent<LogoutCompleteEventHandler> {

    public static Type<LogoutCompleteEventHandler> TYPE = new Type<LogoutCompleteEventHandler>();

    public LogoutCompleteEvent() {
    }

    @Override
    public Type<LogoutCompleteEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(LogoutCompleteEventHandler handler) {
        handler.handleLogoutCompleteEvent(this);
    }

}
