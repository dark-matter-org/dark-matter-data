package org.dmd.mvw.client.mvwcomms.generated.mvw.events;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImportsStatic(ImportManager.java:37)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:108)
import com.google.gwt.event.shared.GwtEvent;         // The base event type

// Generated from: org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:110)
public class ForceCommsReset extends GwtEvent<ForceCommsResetHandler> {

    public static Type<ForceCommsResetHandler> TYPE = new Type<ForceCommsResetHandler>();

    public ForceCommsReset() {
    }

    @Override
    public Type<ForceCommsResetHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ForceCommsResetHandler handler) {
        handler.handleForceCommsReset(this);
    }

}
