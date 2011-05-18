package org.dmd.mvw.client.selectionmanager.generated.mvw.events;

// Generated from:  org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:34)
// Called from:  org.dmd.mvw.tools.mvwgenerator.util.GwtEventFormatter.dumpEvent(GwtEventFormatter.java:100)
import com.google.gwt.event.shared.GwtEvent;         // The base event type
import org.dmd.dmc.DmcObject;                        // Required type

public class SingleDMOSelectedEvent extends GwtEvent<SingleDMOSelectedEventHandler> {

    DmcObject   obj;

    public static Type<SingleDMOSelectedEventHandler> TYPE = new Type<SingleDMOSelectedEventHandler>();

    public SingleDMOSelectedEvent(DmcObject arg1) {
        obj = arg1;
    }

    public DmcObject getObj(){
        return(obj);
    }

    @Override
    public Type<SingleDMOSelectedEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(SingleDMOSelectedEventHandler handler) {
        handler.onSingleDMOSelectedEvent(this);
    }

}
