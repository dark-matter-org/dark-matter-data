package org.dmd.mvw.client.mvwcomms.generated.mvw.events;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImportsStatic(ImportManager.java:37)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:108)
import com.google.gwt.event.shared.GwtEvent;         // The base event type

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:110)
public class LogoutEvent extends GwtEvent<LogoutEventHandler> {

    public static Type<LogoutEventHandler> TYPE = new Type<LogoutEventHandler>();

    public LogoutEvent() {
    }

    @Override
    public Type<LogoutEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(LogoutEventHandler handler) {
        handler.handleLogoutEvent(this);
    }

}
