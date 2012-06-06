package org.dmd.mvw.client.mvwcomms.generated.mvw.events;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImportsStatic(ImportManager.java:37)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:108)
import com.google.gwt.event.shared.GwtEvent;         // The base event type

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:110)
public class CommsSessionFailed extends GwtEvent<CommsSessionFailedHandler> {

    String   reason;

    public static Type<CommsSessionFailedHandler> TYPE = new Type<CommsSessionFailedHandler>();

    public CommsSessionFailed(String arg1) {
        reason = arg1;
    }

    public String getReason(){
        return(reason);
    }

    @Override
    public Type<CommsSessionFailedHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(CommsSessionFailedHandler handler) {
        handler.handleCommsSessionFailed(this);
    }

}
